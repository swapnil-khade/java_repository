package db.ciit_guide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableSwagger2
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	SpringApplication.run(App.class, args);
    }
    
    @Bean
    public Docket apis() {
    	return new Docket(DocumentationType.SWAGGER_2)
    			.select()
    			.apis(RequestHandlerSelectors.any())
    			.paths(PathSelectors.any())
    			.build();
    
    }
}
