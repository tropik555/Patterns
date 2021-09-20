package com.company.Builders.withEnums;

import java.util.HashSet;
import java.util.Set;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class Main {
    public static void main(String[] args) {
        Hero mage = new Hero.Builder("Riobard")
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.DAGGER)
                .build();
        LOGGER.info(mage.toString());

        Hero warrior = new Hero.Builder("Amberjill")
                .withHairColor(HairColor.BLOND)
                .withArmor(Armor.CHAIN_MAIL)
                .withWeapon(Weapon.SWORD)
                .build();
        LOGGER.info(warrior.toString());

        Hero thief = new Hero.Builder("Desmond")
                .withWeapon(Weapon.BOW)
                .build();
        LOGGER.info(thief.toString());

        Set<Hero> setHeros = new HashSet<>();
        setHeros.add(mage);
        setHeros.add(warrior);
        setHeros.add(thief);

        for (Hero hero : setHeros) {
            System.out.println(hero.toString());
        }

    }
}
