package by.bntu.mobile.entity;

interface TariffWithFreeInternet {
    int bonusTraffic = 0;

    boolean setFreeTraffic(int bonusTraffic);
    boolean takeOffFreeTraffic(int bonusTraffic);
}
