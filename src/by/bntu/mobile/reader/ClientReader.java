package by.bntu.mobile.reader;

import by.bntu.mobile.exceprion.MobileException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientReader {
    private static final Logger LOGGER = LogManager.getLogger();
    private final static String DEFAULT_PATH = "input/inputData.txt";
    private static String path = DEFAULT_PATH;
    private static List<String> dataList;

    public List<String> readDataForClients(String transferredPath) throws RuntimeException, MobileException {
        if (new File(transferredPath).exists()){
            path = transferredPath;
        }
        try (Stream<String> stream = Files.lines(Paths.get(path))){
            dataList = stream.collect(Collectors.toList());
        } catch (IOException e) {
            LOGGER.log(Level.INFO, "I/O exception: " + e);
            throw new MobileException(e);
        }
        LOGGER.log(Level.INFO, "Has been read data: " + dataList);
        return dataList;
    }
}
