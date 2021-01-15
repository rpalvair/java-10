package com.palvair.java10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.copyOf;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CollectionApiImprovementsTest {


    @Test
    public void should_throw_exception_when_modifying_copy_of_list() {
        final List<String> copy = copyOf(Arrays.asList("Hello", "World"));

        assertThatThrownBy(() -> copy.add("")).isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    public void should_throw_exception_when_modifying_unmodifiable_list() {
        final List<String> copy = Stream.of("Hello", "World")
                .collect(Collectors.toUnmodifiableList());

        assertThatThrownBy(() -> copy.add("")).isInstanceOf(UnsupportedOperationException.class);
    }
}
