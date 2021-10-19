package com.microservice.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig
{
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder)
    {
        return routeLocatorBuilder.routes()
                .route("filter", rt -> rt.path("/filter/**")
                        .uri("http://localhost:9001/"))
                .route("sort", rt -> rt.path("/sort/**")
                        .uri("http://localhost:9002/"))
                .build();

    }
}
