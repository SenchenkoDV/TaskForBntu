package by.bntu.mobile.sorter;

import by.bntu.mobile.entity.Tariff;
import java.util.Comparator;

public class TariffComparator {
    public static Comparator<Tariff> sortByName(){
        return Comparator.comparing(tariff -> tariff.getName());
    }

    public static Comparator<Tariff> sortByPrice(){
        return Comparator.comparingDouble(tariff -> tariff.getPrice());
    }
}
