package it.bnl.mon.a6.busin.diapason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.context.WebApplicationContext;

import it.bnl.fwk.jrfcore.core.JRFCoreApplicationRunner;
import it.bnl.fwk.jrfcore.core.annotation.JRFCoreApplication;
import it.bnl.fwk.jrfcore.core.config.io.RootPrefixBeanDefinitionReader;
import it.bnl.fwk.jrfcore.core.config.io.RootPrefixPropertySourceFactory;

@JRFCoreApplication()
@ImportResource(value="root:/config/spring-context/**/*.xml", reader=RootPrefixBeanDefinitionReader.class)
@PropertySource(value="root:/config/spring-context/**/*.properties", factory=RootPrefixPropertySourceFactory.class, ignoreResourceNotFound=true)
public class StartApplication extends SpringBootServletInitializer{
	private static Class<StartApplication> applicationClass = StartApplication.class;	

	public static void main(String[] args) {
		JRFCoreApplicationRunner.run(StartApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
	@Override
	protected WebApplicationContext run(SpringApplication application) {
		return (WebApplicationContext) JRFCoreApplicationRunner.run(application);
	}
}