package by.bntu.mobile.entity;

public interface TariffWithFreeSms {
    int bonusSms = 0;

    boolean setFreeSms(int bonusSms);
    boolean takeOffFreeSms(int bonusSms);
}
