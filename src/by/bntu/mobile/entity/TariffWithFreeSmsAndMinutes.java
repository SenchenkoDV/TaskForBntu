package by.bntu.mobile.entity;

public class TariffWithFreeSmsAndMinutes extends Tariff implements TariffWithFreeSms, TariffWithFreeMinutes {

    public TariffWithFreeSmsAndMinutes(String name, double price, int minutes, int traffic) {
        super(name, price, minutes, traffic);
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
