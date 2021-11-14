package utils;

import java.util.UUID;

public class ProductUtils {

    public static String generateId() {

        //Todo: Generate new UUID if this UUID is already in the database
        return UUID.randomUUID().toString();
    }
}
