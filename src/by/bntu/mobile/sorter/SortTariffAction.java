package by.bntu.mobile.sorter;

import by.bntu.mobile.entity.Tariff;
import java.util.ArrayList;
import java.util.List;

public class SortTariffAction {
    public List<Tariff> sortByPrice(List<Tariff> tariffs){
        List<Tariff> sortedTariffsByPriceLexemes = new ArrayList<>(tariffs);
        sortedTariffsByPriceLexemes.sort(TariffComparator.sortByPrice());
        return sortedTariffsByPriceLexemes;
    }

    public List<Tariff> sortByName(List<Tariff> tariffs){
        List<Tariff> sortedTariffsByPriceName = new ArrayList<>(tariffs);
        sortedTariffsByPriceName.sort(TariffComparator.sortByName());
        return sortedTariffsByPriceName;
    }
}
