package com.company.Builders.withEnums;

import java.util.Locale;

public enum HairColor {

    WHITE, BLOND, RED, BROWN, BLACK;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
