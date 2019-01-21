package by.bntu.mobile.util;

import by.bntu.mobile.entity.Tariff;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.LinkedList;
import java.util.List;

public class TariffAction {
    private static final Logger LOGGER = LogManager.getLogger();

    public List<Tariff> findInRangeByPrice(List<Tariff> tariffs, double from, double to){
        List<Tariff> sortedInRangeTariffs = new LinkedList<>();
        for (Tariff tariff : tariffs){
            if (tariff.getPrice() >= from && tariff.getPrice() <= to){
                sortedInRangeTariffs.add(tariff);
            }
        }
        return sortedInRangeTariffs;
    }

    public List<Tariff> findInRangeByMinutes(List<Tariff> tariffs, int from, int to){
        List<Tariff> sortedInRangeTariffs = new LinkedList<>();
        for (Tariff tariff : tariffs){
            if (tariff.getTraffic() >= from && tariff.getTraffic() <= to){
                sortedInRangeTariffs.add(tariff);
            }
        }
        return sortedInRangeTariffs;
    }

    public List<Tariff> findInRangeByTraffic(List<Tariff> tariffs, int from, int to){
        List<Tariff> sortedInRangeTariffs = new LinkedList<>();
        for (Tariff tariff : tariffs){
            if (tariff.getTraffic() >= from && tariff.getTraffic() <= to){
                sortedInRangeTariffs.add(tariff);
            }
        }
        return sortedInRangeTariffs;
    }

    public Tariff findCheapestTariff(List<Tariff> tariffs){
        Tariff cheapestTariff = null;
        for (Tariff tariff : tariffs){
            if (cheapestTariff == null){
                cheapestTariff = tariff;
            }else if (tariff.getPrice() < cheapestTariff.getPrice()){
                cheapestTariff = tariff;
            }
        }
        LOGGER.log(Level.INFO, "Cheapest tariff: " + cheapestTariff);
        return cheapestTariff;
    }

    public Tariff findDearestTariff(List<Tariff> tariffs){
        Tariff dearestTariff = null;
        for (Tariff tariff : tariffs){
            if (dearestTariff == null){
                dearestTariff = tariff;
            }else if (tariff.getPrice() > dearestTariff.getPrice()){
                dearestTariff = tariff;
            }
        }
        LOGGER.log(Level.INFO, "Dearest tariff: " + dearestTariff);
        return dearestTariff;
    }
}
