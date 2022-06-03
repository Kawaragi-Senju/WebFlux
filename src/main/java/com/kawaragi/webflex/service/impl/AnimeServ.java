package com.kawaragi.webflex.service.impl;

import com.kawaragi.webflex.service.dto.Anime;
import com.kawaragi.webflex.repository.AnimeRepository;
import com.kawaragi.webflex.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AnimeServ implements BaseService<Anime> {
    private final AnimeRepository repository;

    @Override
    public Flux<Anime> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Anime> findByParameter(String animeFullName) {
        return repository.getAnimeByFullName(animeFullName);
    }
}
