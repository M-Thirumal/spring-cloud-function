package in.thirumal;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class SpringCloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionApplication.class, args);
	}
	
	@Bean
	public Function<Flux<String>, Flux<String>> function() {
		return input -> input.map(String::toUpperCase); 
	}
	
	
	@Bean
	public Consumer<String> consume() {
		return input -> System.out.println("In consume: " + input);
	}
	@Bean
	public Supplier<Mono<String>> supply() {
		return () -> Mono.just("hi from supply");
	}

}
