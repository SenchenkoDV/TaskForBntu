package by.bntu.mobile.entity;

interface TariffWithFreeMinutes {
    int bonusMinutes = 0;

    boolean setFreeMinutes(int bonusMinutes);
    boolean takeOffFreeMinutes(int bonusMinutes);
}
