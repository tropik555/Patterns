package com.company.Builders.withEnums;

public final class Hero {

    private final String name;
    private final HairColor hairColor;
    private final Armor armor;
    private final Weapon weapon;

    private Hero(Builder builder) {
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }



    public String getName() {
        return name;
    }


    public HairColor getHairColor() {
        return hairColor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                ", name='" + name + '\'' +
                ", hairColor=" + hairColor +
                ", armor=" + armor +
                ", weapon=" + weapon +
                '}';
    }

    /**
     * The builder class.
     */
    public static class Builder {

        private final String name;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;

        /**
         * Constructor.
         */
        public Builder( String name) {
            if (name == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.name = name;
        }



        public Builder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}