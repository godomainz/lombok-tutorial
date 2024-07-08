package org.example;

import lombok.*;

import java.net.URL;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
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
