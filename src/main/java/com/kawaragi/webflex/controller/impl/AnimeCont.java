package com.kawaragi.webflex.controller.impl;

import com.kawaragi.webflex.controller.Controller;
import com.kawaragi.webflex.useCase.GetAnimeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AnimeCont implements Controller {
    private final GetAnimeUseCase useCase;

    @Override
    public Mono<ServerResponse> handle(ServerRequest req) {
        return useCase.get()
                .flatMap(list -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(list));
    }
}
