package com.palvair.java10;

import java.util.Optional;

public class OptionalImprovement {

    public String callOrElseThrow(final String value) {
        return Optional.ofNullable(value)
                .orElseThrow();
    }

}
