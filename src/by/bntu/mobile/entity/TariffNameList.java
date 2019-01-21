package by.bntu.mobile.entity;

public enum TariffNameList {
    INTERNET("TariffWithInternetBonuses"),
    SMS_AND_MINUTES("TariffWithFreeSmsAndMinutes"),
    FULL_BONUSES("TariffWithAllBonuses");

    TariffNameList(String name) {
        this.name = name;
    }

    private String name;

    public String getValue() {
        return name;
    }
}
