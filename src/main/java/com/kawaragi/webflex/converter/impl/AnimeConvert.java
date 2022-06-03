package com.kawaragi.webflex.converter.impl;

import com.kawaragi.webflex.converter.BaseConverter;
import com.kawaragi.webflex.service.dto.Anime;
import com.kawaragi.webflex.model.AnimeModel;
import org.springframework.stereotype.Component;

@Component
public class AnimeConvert implements BaseConverter<Anime, AnimeModel> {

    @Override
    public AnimeModel entityToModel(Anime entity) {
        return AnimeModel.builder()
                .fullName(entity.getFullName())
                .id(entity.getId())
                .dor(entity.getDor())
                .build();
    }

    @Override
    public Anime modelToEntity(AnimeModel model) {
        return Anime.builder()
                .fullName(model.getFullName())
                .id(model.getId())
                .dor(model.getDor())
                .build();
    }
}
