package com.kawaragi.webflex.controller;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface Controller {
    Mono<ServerResponse> handle(ServerRequest req);
}
