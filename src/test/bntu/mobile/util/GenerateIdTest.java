package test.bntu.mobile.util;

import by.bntu.mobile.util.GenerateId;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GenerateIdTest {
    int id1;
    int id2;

    @BeforeMethod
    public void setUp() throws Exception {
        id1 = GenerateId.generateIdForClient();
        id2 = GenerateId.generateIdForClient();
    }

    @Test
    public void testGenerateIdForClient() throws Exception {
        int expected = 2;
        int actual = id2;
        Assert.assertEquals(actual, expected);
    }
}