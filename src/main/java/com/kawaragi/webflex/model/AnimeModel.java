package com.kawaragi.webflex.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Builder
@Data
@AllArgsConstructor
public class AnimeModel {
    private String fullName;
    private String id;
    private Date dor;
}
