package edu.yu.cs.com.project.util;
import java.util.Random;


public class Util {
    private final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private final int ID_LENGTH = 8;
    public static String generateReservationId() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < ID_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }


}
