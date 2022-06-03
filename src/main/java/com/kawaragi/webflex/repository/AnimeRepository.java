package com.kawaragi.webflex.repository;

import com.kawaragi.webflex.service.dto.Anime;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface AnimeRepository extends R2dbcRepository<Anime, Long> {
    Mono<Anime> getAnimeByFullName(String name);
}
