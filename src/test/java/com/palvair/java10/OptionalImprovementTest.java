package com.palvair.java10;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class OptionalImprovementTest {

    @Test
    public void should_throw_exception_when_optional_is_empty() {
        final OptionalImprovement optionalImprovement = new OptionalImprovement();

        assertThatThrownBy(() -> optionalImprovement.callOrElseThrow(null)).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void should_return_value_when_present_in_optional() {
        final OptionalImprovement optionalImprovement = new OptionalImprovement();

        final String value = optionalImprovement.callOrElseThrow("Hello World");

        assertThat(value).isNotNull().isEqualTo("Hello World");
    }


}
