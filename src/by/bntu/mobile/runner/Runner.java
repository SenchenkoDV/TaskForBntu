package by.bntu.mobile.runner;

import by.bntu.mobile.creator.ClientCreator;
import by.bntu.mobile.creator.TariffFactory;
import by.bntu.mobile.entity.Client;
import by.bntu.mobile.entity.Tariff;
import by.bntu.mobile.entity.TariffNameList;
import by.bntu.mobile.exceprion.MobileException;
import by.bntu.mobile.parcer.ClientParser;
import by.bntu.mobile.reader.ClientReader;
import by.bntu.mobile.util.ClientAction;
import by.bntu.mobile.util.TariffAction;
import by.bntu.mobile.sorter.SortTariffAction;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

public class Runner {
    private static final String PATH = "input/inputData.txt";
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args){
        ArrayList<Tariff> tariffs = new ArrayList<>();
        ClientReader reader = new ClientReader();
        ClientParser parser = new ClientParser();
        ClientCreator clientCreator = new ClientCreator();
        List<List<String>> data = null;
        try {
            data = parser.parseClientDateForEntity(reader.readDataForClients(PATH));
        } catch (MobileException e) {
            LOGGER.log(Level.ERROR, "Error reading file: " + e);
        }
        List<Client> clients = clientCreator.createClients(data);
        SortTariffAction sortTariffAction = new SortTariffAction();
        ClientAction clientAction = new ClientAction();
        TariffAction tariffAction = new TariffAction();
        for (TariffNameList name : TariffNameList.values()) {
            tariffs.add(TariffFactory.INSTANCE.create(name.getValue()));
        }
        out.println("Tariffs sorted by name:");
        List<Tariff> sortedByNameTariffs = sortTariffAction.sortByName(tariffs);
        for (Tariff tariff : sortedByNameTariffs){
            out.println(tariff);
        }
        out.println("Tariffs sorted by price:");
        List<Tariff> sortByPrice = sortTariffAction.sortByPrice(tariffs);
        for (Tariff tariff : sortByPrice){
            out.println(tariff);
        }
        out.println("Clients count:");
        out.println(clientAction.calculateClientsCount(clients));
        out.println("Tariffs with traffic from 50 to 300");
        out.println(tariffAction.findInRangeByTraffic(tariffs,50, 300));
        out.println("Tariffs with minutes from 30 to 50");
        out.println(tariffAction.findInRangeByMinutes(tariffs, 30, 50));
        out.println("Tariffs with price from 10 to 30");
        out.println(tariffAction.findInRangeByPrice(tariffs, 10, 30));
        out.println("Cheapest tariff:");
        out.println(tariffAction.findCheapestTariff(tariffs));
        out.println("Dearest tariff:");
        out.println(tariffAction.findDearestTariff(tariffs));
    }
}