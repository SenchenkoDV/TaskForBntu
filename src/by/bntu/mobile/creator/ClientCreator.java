package by.bntu.mobile.creator;

import by.bntu.mobile.entity.Client;
import by.bntu.mobile.util.GenerateId;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class ClientCreator {
    private static final Logger LOGGER = LogManager.getLogger();
    private List<Client> listOfClients = new ArrayList<>();

    public List<Client> createClients(List<List<String>> data) {

        for (List<String> client: data) {
            listOfClients.add(
                    new Client(GenerateId.generateIdForClient(),
                            client.get(0),
                            client.get(1),
                            TariffFactory.INSTANCE.create(client.get(2)))
            );
        }
        LOGGER.log(Level.INFO, "Has been created clients list: " + listOfClients);
        return listOfClients;
    }
}
