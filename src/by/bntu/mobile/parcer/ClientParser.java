package by.bntu.mobile.parcer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientParser {
    private static final String SPLITTER = "\\s";
    private static List<List<String>> dateForObjects = new ArrayList<>();

    public List<List<String>> parseClientDateForEntity(List<String> inputData){
        for (String element    :  inputData) {
                dateForObjects.add(new ArrayList<>(Arrays.asList(element.split(SPLITTER))));
        }
        return dateForObjects;
    }
}
