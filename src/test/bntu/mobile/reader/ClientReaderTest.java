package test.bntu.mobile.reader;

import by.bntu.mobile.reader.ClientReader;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.ArrayList;
import java.util.List;

public class ClientReaderTest {
    String transmittedPath;
    String pavel;
    String denis;
    List<String> expectedList;
    ClientReader clientReader;

    @BeforeClass
    public void setUp() throws Exception {
        transmittedPath = "input/testData.txt";
        expectedList = new ArrayList<>();
        pavel = "Pavel Smith TariffWithFreeSmsAndMinutes";
        denis = "Denis Smith TariffWithFreeSmsAndMinutes";
        expectedList.add(pavel);
        expectedList.add(denis);
        clientReader = new ClientReader();
    }

    @AfterClass
    public void tearDown() throws Exception {
        transmittedPath = null;
        pavel = null;
        denis = null;
        expectedList = null;
        clientReader = null;
    }

    @Test
    public void testReadDataForClients() throws Exception {
        List<String> expected = expectedList;
        List<String> actual = clientReader.readDataForClients(transmittedPath);
        Assert.assertEquals(actual, expected);
    }
}