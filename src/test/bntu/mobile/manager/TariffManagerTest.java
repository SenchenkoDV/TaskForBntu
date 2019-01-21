package test.bntu.mobile.manager;

import by.bntu.mobile.manager.TariffManager;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TariffManagerTest {
    String tariffsKey;

    @BeforeMethod
    public void setUp() throws Exception {
        tariffsKey = "TariffWithFreeSmsAndMinutes.name";
    }

    @AfterMethod
    public void tearDown() throws Exception {
        tariffsKey = null;
    }

    @Test
    public void testGetProperty() throws Exception {
        String expected = "TariffWithFreeSmsAndMinutes";
        String actual = TariffManager.getProperty(tariffsKey);
        Assert.assertEquals(actual, expected);
    }
}