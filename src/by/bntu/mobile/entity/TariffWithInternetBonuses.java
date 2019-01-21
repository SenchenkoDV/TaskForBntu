package by.bntu.mobile.entity;

public class TariffWithInternetBonuses extends Tariff implements TariffWithFreeInternet {

    public TariffWithInternetBonuses(String name, double price, int minutes, int traffic) {
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
}
