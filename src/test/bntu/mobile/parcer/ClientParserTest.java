package test.bntu.mobile.parcer;

import by.bntu.mobile.parcer.ClientParser;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.ArrayList;
import java.util.List;

public class ClientParserTest {
    String testLine;
    List<String> testList;
    ClientParser clientParser;

    @BeforeClass
    public void setUp() throws Exception {
        testLine = "Pavel Smith TariffWithFreeSmsAndMinutes";
        testList = new ArrayList<>();
        testList.add(testLine);
        clientParser = new ClientParser();
    }

    @AfterClass
    public void tearDown() throws Exception {
        testLine = null;
        testList = null;
        clientParser = null;
    }

    @Test
    public void testParseClientDateForEntity() throws Exception {
        int expected = 3;
        int actual = clientParser.parseClientDateForEntity(testList).get(0).size();
        Assert.assertEquals(actual, expected);
    }
}