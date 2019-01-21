package test.bntu.mobile.creator;

import by.bntu.mobile.creator.TariffFactory;
import by.bntu.mobile.entity.Tariff;
import by.bntu.mobile.entity.TariffWithFreeSmsAndMinutes;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TariffFactoryTest {
    String tariffName;
    Tariff expectedTariff;

    @BeforeMethod
    public void setUp() throws Exception {
        tariffName = "TariffWithFreeSmsAndMinutes";
        expectedTariff = new TariffWithFreeSmsAndMinutes("TariffWithFreeSmsAndMinutes", 16, 20, 58);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        tariffName = null;
        expectedTariff = null;
    }

    @Test
    public void testCreate() throws Exception {
        Tariff expected = expectedTariff;
        Tariff actual = TariffFactory.INSTANCE.create(tariffName);
        Assert.assertEquals(actual, expected);
    }
}