package com.example.simbirgocarscharing.util;

public final class InputDataFormatUtil {
    private InputDataFormatUtil() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static final String IDENTIFIER_RUS = "[A-CEHKMOTXАВЕКМНОРСТУХ]{1}\\d{3}[A-CEHKMOTXАВЕКМНОРСТУХ]{2}-\\d{2}";
}
