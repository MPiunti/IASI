package UnicreditIASI.SpringMVC_JPA_REST.config;

import static org.springframework.context.annotation.ComponentScan.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import UnicreditIASI.SpringMVC_JPA_REST.Application;


@Configuration
@PropertySource("classpath:persistence.properties")
@ComponentScan(basePackageClasses = {Application.class}, excludeFilters = @Filter({Controller.class, RestController.class, Configuration.class}))
class ApplicationConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}