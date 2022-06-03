package com.kawaragi.webflex.converter;

public interface BaseConverter<E, M> {
    M entityToModel(E entity);
    E modelToEntity(M model);
}
