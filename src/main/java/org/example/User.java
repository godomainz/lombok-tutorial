package org.example;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {
    String name;
    int age;
}
