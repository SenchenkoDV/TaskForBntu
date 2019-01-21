package test.bntu.mobile.util;

import by.bntu.mobile.entity.Tariff;
import by.bntu.mobile.entity.TariffWithFreeSmsAndMinutes;
import by.bntu.mobile.util.TariffAction;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class TariffActionTest {
    Tariff expectedTariff1;
    Tariff expectedTariff2;
    Tariff expectedTariff3;
    List<Tariff> tariffList;
    TariffAction tariffAction;

    @BeforeMethod
    public void setUp() throws Exception {
        expectedTariff1 = new TariffWithFreeSmsAndMinutes("C", 2, 2, 2);
        expectedTariff2 = new TariffWithFreeSmsAndMinutes("A", 3, 3, 3);
        expectedTariff3 = new TariffWithFreeSmsAndMinutes("B", 1, 1, 1);
        tariffList = new ArrayList<>();
        tariffList.add(expectedTariff1);
        tariffList.add(expectedTariff2);
        tariffList.add(expectedTariff3);
        tariffAction = new TariffAction();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        expectedTariff1 = null;
        expectedTariff2 = null;
        expectedTariff3 = null;
        tariffList = null;
        tariffAction = null;
    }

    @Test
    public void testFindInRangeByPrice() throws Exception {
        int expected = 2;
        int actual = tariffAction.findInRangeByPrice(tariffList, 2, 3).size();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindInRangeByMinutes() throws Exception {
        int expected = 2;
        int actual = tariffAction.findInRangeByMinutes(tariffList, 1, 2).size();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindInRangeByTraffic() throws Exception {
        int expected = 2;
        int actual = tariffAction.findInRangeByTraffic(tariffList, 1, 2).size();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindCheapestTariff() throws Exception {
        Tariff expected = expectedTariff3;
        Tariff actual = tariffAction.findCheapestTariff(tariffList);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindDearestTariff() throws Exception {
        Tariff expected = expectedTariff2;
        Tariff actal = tariffAction.findDearestTariff(tariffList);
        Assert.assertEquals(actal, expected);
    }
}