package by.bntu.mobile.creator;

import by.bntu.mobile.manager.TariffManager;
import by.bntu.mobile.entity.Tariff;
import by.bntu.mobile.entity.TariffWithFreeSmsAndMinutes;

public enum TariffFactory {
    INSTANCE;

    public Tariff create(String typeOfTariff){
        String name =  TariffManager.getProperty(typeOfTariff + ".name").trim();
        String price = TariffManager.getProperty(typeOfTariff + ".price").trim();
        String minutes = TariffManager.getProperty(typeOfTariff + ".minutes").trim();
        String traffic = TariffManager.getProperty(typeOfTariff + ".traffic").trim();

        switch (typeOfTariff){
            case "TariffWithFreeSmsAndMinutes" :
                return new TariffWithFreeSmsAndMinutes(name, Double.valueOf(price),
                        Integer.valueOf(minutes), Integer.valueOf(traffic));
            case "TariffWithAllBonuses" :
                return new TariffWithFreeSmsAndMinutes(name, Double.valueOf(price),
                        Integer.valueOf(minutes), Integer.valueOf(traffic));
            case "TariffWithInternetBonuses" :
                return new TariffWithFreeSmsAndMinutes(name, Double.valueOf(price),
                        Integer.valueOf(minutes), Integer.valueOf(traffic));
            default:return null;
        }
    }
}
