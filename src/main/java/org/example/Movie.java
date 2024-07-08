package org.example;

import lombok.*;
import lombok.experimental.Accessors;

import java.net.URL;

@Data
public class Movie {

    @Accessors(fluent = true)
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
    @NonNull
    private final int minutes = 120;

}
