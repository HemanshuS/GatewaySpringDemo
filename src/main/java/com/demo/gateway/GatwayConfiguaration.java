/**
 * 
 */
package com.demo.gateway;

/*import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;*/

/**
 * @author Himanshu
 *
 */
//@Configuration
//@EnableHystrix
public class GatwayConfiguaration {/*

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
	    return builder.routes()
	        .route(p -> p
	            .path("/getAppliances")
	            .filters(f -> f.addRequestHeader("Hello", "World"))
	            .uri("http://localhost:8081"))
	        .route(p -> p
		            .path("/addAppliance")
		            .filters(f -> f.addRequestHeader("Hello", "World"))
		            .uri("http://localhost:8081"))
	        .route(p -> p
		            .path("/hello")
		            .filters(f -> f.addRequestHeader("Hello33", "World33"))
		            .uri("http://localhost:8083"))
	        .route(p -> p
		            .path("/authenticate")
		            .filters(f -> f.addRequestHeader("Hello33", "World33"))
		            .uri("http://localhost:8083"))
	        .route(p -> p
	            .host("*.hystrix.com")
	            .filters(f -> f.hystrix(config -> config
	                .setName("mycmd")
	                .setFallbackUri("forward:/fallback")))
	            .uri("http://httpbin.org:80"))
	        .build();
	}
	
*/}
