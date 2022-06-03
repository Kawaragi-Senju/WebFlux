package com.kawaragi.webflex.configs;

import com.kawaragi.webflex.controller.impl.AnimeCont;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
@RequiredArgsConstructor
public class WebConfig {
    private final AnimeCont controller;

    @Bean
    RouterFunction<ServerResponse> route() {
        return RouterFunctions.route(
                RequestPredicates.GET("/anime"),
                controller::handle
        );
    }
}
