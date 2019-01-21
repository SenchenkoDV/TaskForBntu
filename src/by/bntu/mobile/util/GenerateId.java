package by.bntu.mobile.util;

public class GenerateId {
    private static int id = 1;
    public static int generateIdForClient(){
        return id++;
    }
}
