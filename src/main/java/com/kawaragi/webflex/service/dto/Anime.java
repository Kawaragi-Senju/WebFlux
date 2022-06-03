package com.kawaragi.webflex.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import java.sql.Date;

@Data
@AllArgsConstructor
@Builder
public class Anime {
    private long AnimeID;
    private String fullName;
    private String id;
    @Column("date_of_release")
    private Date dor;
}
