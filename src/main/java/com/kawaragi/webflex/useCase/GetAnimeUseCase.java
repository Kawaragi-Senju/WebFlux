package com.kawaragi.webflex.useCase;

import com.kawaragi.webflex.converter.impl.AnimeConvert;
import com.kawaragi.webflex.model.AnimeModel;
import com.kawaragi.webflex.service.impl.AnimeServ;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAnimeUseCase {
    private final AnimeServ service;
    private final AnimeConvert converter;

    public Mono<List<AnimeModel>> get() {
        return service.findAll()
                .map(converter::entityToModel)
                .collectList();
    }
}
