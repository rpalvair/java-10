package com.palvair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalImprovement {

    private static final Logger LOGGER = LoggerFactory.getLogger(OptionalImprovement.class);

    public static void main(String[] args) {
        try {
            Optional.ofNullable(null)
                    .orElseThrow();
        } catch (final NoSuchElementException exception) {
            LOGGER.error(exception.getMessage());
        }
    }
}
