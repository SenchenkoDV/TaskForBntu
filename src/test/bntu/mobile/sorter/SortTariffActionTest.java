package test.bntu.mobile.sorter;

import by.bntu.mobile.entity.Tariff;
import by.bntu.mobile.entity.TariffWithFreeSmsAndMinutes;
import by.bntu.mobile.sorter.SortTariffAction;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class SortTariffActionTest {
    Tariff expectedTariff1;
    Tariff expectedTariff2;
    Tariff expectedTariff3;
    List<Tariff> tariffList;
    SortTariffAction sortTariffAction;

    @BeforeMethod
    public void setUp() throws Exception {
        expectedTariff1 = new TariffWithFreeSmsAndMinutes("C", 2, 2, 2);
        expectedTariff2 = new TariffWithFreeSmsAndMinutes("A", 3, 3, 3);
        expectedTariff3 = new TariffWithFreeSmsAndMinutes("B", 1, 1, 1);
        tariffList = new ArrayList<>();
        tariffList.add(expectedTariff1);
        tariffList.add(expectedTariff2);
        tariffList.add(expectedTariff3);
        sortTariffAction = new SortTariffAction();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        expectedTariff1 = null;
        expectedTariff2 = null;
        expectedTariff3 = null;
        tariffList = null;
        sortTariffAction = null;
    }

    @Test
    public void testSortByPrice() throws Exception {
        Tariff expected = expectedTariff3;
        Tariff actual = sortTariffAction.sortByPrice(tariffList).get(0);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSortByName() throws Exception {
        Tariff expected = expectedTariff2;
        Tariff actual = sortTariffAction.sortByName(tariffList).get(0);
        Assert.assertEquals(actual, expected);
    }
}