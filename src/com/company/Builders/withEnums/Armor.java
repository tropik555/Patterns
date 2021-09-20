package com.company.Builders.withEnums;

public enum Armor {
    CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain_mail");

    private final String title;


    Armor(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
