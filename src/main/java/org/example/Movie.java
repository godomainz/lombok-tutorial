package org.example;

import lombok.*;

import java.net.URL;

@Data
public class Movie {

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private Long id;
    private String title;
    private String description;
    private String country;
    private int rating;

    @Getter(AccessLevel.PROTECTED)
    private URL officialSite;
    private String language;

    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)
    private final int minutes = 120;

}
