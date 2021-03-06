package hotelReserva.Config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "hotelReserva")
public class MvcConfiguration implements WebMvcConfigurer, ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setApplicationContext(applicationContext);
		resolver.setPrefix("/main/");
		resolver.setSuffix(".html");

		return resolver;
	}

	@Bean
	public ObjectMapper objectMapper() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//		dateFormat.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT-3"));
		ObjectMapper dateFormatMapper = new ObjectMapper();
		dateFormatMapper.setDateFormat(dateFormat);
		return dateFormatMapper;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/main/**").addResourceLocations("/main/");
		registry.addResourceHandler("/js/**").addResourceLocations("/main/js/");
		registry.addResourceHandler("/style/**").addResourceLocations("/main/style/");

	}

}
