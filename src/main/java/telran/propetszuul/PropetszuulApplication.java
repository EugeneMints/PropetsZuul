package telran.propetszuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import telran.propetszuul.filters.SimpleFilter;

@SpringBootApplication
@EnableZuulProxy
public class PropetszuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropetszuulApplication.class, args);
	}
	
	  @Bean
	  public SimpleFilter simpleFilter() {
	    return new SimpleFilter();
	  }

}
