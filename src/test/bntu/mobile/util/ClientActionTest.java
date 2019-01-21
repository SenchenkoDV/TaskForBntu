package test.bntu.mobile.util;

import by.bntu.mobile.entity.Client;
import by.bntu.mobile.entity.Tariff;
import by.bntu.mobile.entity.TariffWithFreeSmsAndMinutes;
import by.bntu.mobile.util.ClientAction;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class ClientActionTest {
    Tariff tariff;
    Client client1;
    Client client2;
    ArrayList<Client> clients;
    ClientAction clientAction;

    @BeforeMethod
    public void setUp() throws Exception {
        tariff = new TariffWithFreeSmsAndMinutes("TariffWithFreeSmsAndMinutes", 16, 20, 58);
        client1 = new Client(1, "Pavel", "Smith", tariff);
        client2 = new Client(2, "Denis", "Smith", tariff);
        clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clientAction = new ClientAction();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        tariff = null;
        client1 = null;
        client2 = null;
        clients = null;
        clientAction = null;
    }

    @Test
    public void testCalculateClientsCount() throws Exception {
        int expected = 2;
        int actual = clientAction.calculateClientsCount(clients);
        Assert.assertEquals(actual, expected);
    }
}