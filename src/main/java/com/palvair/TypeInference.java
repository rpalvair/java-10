package com.palvair;

import java.util.ArrayList;
import java.util.function.Function;

public class TypeInference {


    public static void main(String[] args) {
        final var list = new ArrayList<>();
        // type must be specified for lambda and method reference
        //final var function = (String a) -> a.toUpperCase();
        final Function<String, String> function = String::toUpperCase;

    }
}
