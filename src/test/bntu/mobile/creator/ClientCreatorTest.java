package test.bntu.mobile.creator;

import by.bntu.mobile.creator.ClientCreator;
import by.bntu.mobile.entity.Client;
import by.bntu.mobile.entity.Tariff;
import by.bntu.mobile.entity.TariffWithFreeSmsAndMinutes;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class ClientCreatorTest {
    List<List<String>> data;
    List<String> list;
    String firstName;
    String surname;
    String tariffName;
    ClientCreator clientCreator;
    Tariff expectedTariff;
    Client expectedClient;

    @BeforeMethod
    public void setUp() throws Exception {
        data = new ArrayList<>();
        list = new ArrayList<>();
        firstName = "Pavel";
        surname = "Smith";
        tariffName = "TariffWithFreeSmsAndMinutes";
        list.add(firstName);
        list.add(surname);
        list.add(tariffName);
        data.add(list);
        clientCreator = new ClientCreator();
        expectedTariff = new TariffWithFreeSmsAndMinutes("TariffWithFreeSmsAndMinutes", 16, 20, 58);
        expectedClient = new Client(1, "Pavel", "Smith", expectedTariff);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        data = null;
        list = null;
        firstName = null;
        surname = null;
        tariffName = null;
        clientCreator= null;
    }

    @Test
    public void testCreateClients() throws Exception {
        Client expected = expectedClient;
        Client actual = clientCreator.createClients(data).get(0);
        Assert.assertEquals(actual, expected);
    }
}