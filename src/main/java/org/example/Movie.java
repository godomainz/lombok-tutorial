package org.example;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.List;

@Data
@Builder
@CustomLog
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
    @Builder.Default
    private final int minutes = 120;

    @Singular("cast")
    private List<String> cast;

    public int getMinutesPlusX(@NonNull int x){
        log.info("Adding " + x);
        return this.minutes + x;
    }

}
