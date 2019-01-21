package by.bntu.mobile.entity;

public class TariffWithAllBonuses extends Tariff
        implements TariffWithFreeInternet, TariffWithFreeMinutes, TariffWithFreeSms {

    public TariffWithAllBonuses(String name, double price, int minutes, int traffic) {
        super(name, price, minutes, traffic);
    }

    @Override
    public boolean setFreeTraffic(int bonusTraffic) {
        return false;
    }

    @Override
    public boolean takeOffFreeTraffic(int bonusTraffic) {
        return false;
    }

    @Override
    public boolean setFreeMinutes(int bonusMinutes) {
        return false;
    }

    @Override
    public boolean takeOffFreeMinutes(int bonusMinutes) {
        return false;
    }

    @Override
    public boolean setFreeSms(int bonusSms) {
        return false;
    }

    @Override
    public boolean takeOffFreeSms(int bonusSms) {
        return false;
    }
}
