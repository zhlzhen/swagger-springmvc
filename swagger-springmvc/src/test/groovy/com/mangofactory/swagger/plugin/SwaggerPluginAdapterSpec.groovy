package com.mangofactory.swagger.plugin

import com.mangofactory.swagger.configuration.SpringSwaggerConfig
import com.mangofactory.swagger.dto.mappers.ServiceModelToSwaggerMapper
import org.springframework.context.ApplicationContext
import org.springframework.context.event.ContextRefreshedEvent
import spock.lang.Specification

class SwaggerPluginAdapterSpec extends Specification {

  def "default plugin creation"() {
    given:
      SpringSwaggerConfig springSwaggerConfig = Stub()
      springSwaggerConfig.defaultResourceGroupingStrategy() >> {
        throw new IllegalArgumentException("I was called")
      }

      ApplicationContext applicationContext = Mock()
      applicationContext.getBeansOfType(SwaggerSpringMvcPlugin.class) >> [:]

      ContextRefreshedEvent contextRefreshedEvent = new ContextRefreshedEvent(applicationContext)

      SwaggerPluginAdapter swaggerPluginAdapter = new SwaggerPluginAdapter(springSwaggerConfig)

    when:
      swaggerPluginAdapter.onApplicationEvent(contextRefreshedEvent)

    then:
      def e = thrown IllegalArgumentException
      e.message == "I was called"

  }

  def "Custom plugins are sensitive to being enabled or disabled"() {
    given:
      ServiceModelToSwaggerMapper dtoMapper = Mock()
      SpringSwaggerConfig springSwaggerConfig = Mock()
      ApplicationContext applicationContext = Mock()

      springSwaggerConfig.getDtoMapper() >> dtoMapper

      SwaggerSpringMvcPlugin enabledPlugin = Mock(SwaggerSpringMvcPlugin)
      enabledPlugin.isEnabled() >> true
      SwaggerSpringMvcPlugin disabledPlugin = Mock(SwaggerSpringMvcPlugin)
      disabledPlugin.isEnabled() >> false
      applicationContext.getBeansOfType(SwaggerSpringMvcPlugin.class) >> ['enabled': enabledPlugin,
                                                                          'disabled': disabledPlugin]

      ContextRefreshedEvent contextRefreshedEvent = new ContextRefreshedEvent(applicationContext)
      SwaggerPluginAdapter swaggerPluginAdapter = new SwaggerPluginAdapter(springSwaggerConfig)

    when:
      swaggerPluginAdapter.onApplicationEvent(contextRefreshedEvent)

    then:
      1 * enabledPlugin.dtoMapper(dtoMapper) >> enabledPlugin
      1 * enabledPlugin.build() >> enabledPlugin
      1 * enabledPlugin.initialize()
      0 * disabledPlugin.build()
  }

  def "Custom plugins are configured"() {
    given:
      ServiceModelToSwaggerMapper dtoMapper = Mock()
      SpringSwaggerConfig springSwaggerConfig = Mock()
      ApplicationContext applicationContext = Mock()

      SwaggerSpringMvcPlugin swaggerSpringMvcPlugin = Mock(SwaggerSpringMvcPlugin)
      swaggerSpringMvcPlugin.isEnabled() >> true
      springSwaggerConfig.getDtoMapper() >> dtoMapper
      applicationContext.getBeansOfType(SwaggerSpringMvcPlugin.class) >> ['plugin': swaggerSpringMvcPlugin]

      ContextRefreshedEvent contextRefreshedEvent = new ContextRefreshedEvent(applicationContext)
      SwaggerPluginAdapter swaggerPluginAdapter = new SwaggerPluginAdapter(springSwaggerConfig)

    when:
      swaggerPluginAdapter.onApplicationEvent(contextRefreshedEvent)

    then:
      1 * swaggerSpringMvcPlugin.dtoMapper(dtoMapper) >> swaggerSpringMvcPlugin
      1 * swaggerSpringMvcPlugin.build() >> swaggerSpringMvcPlugin
      1 * swaggerSpringMvcPlugin.initialize()
  }
}
