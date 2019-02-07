package in.co.bytehub.endecoder;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;

import sun.misc.BASE64Encoder;

public class Encoder {

    public static void main(String[] args) {
        System.out.println("Enter String to be enocode : ");
        Console console = System.console();
        char[] readPassword = console.readPassword();
        encode(new String(readPassword));
    }

    public static void encode(String text) {

        Date d = new Date();
        SimpleDateFormat datFormat = new SimpleDateFormat("hh");
        String hh = datFormat.format(d);
        int numberOfTimes = Integer.parseInt(hh);

        BASE64Encoder encoder = new BASE64Encoder();

        for (int x = 0; x < numberOfTimes; x++) {
            text = encoder.encode(text.getBytes());
        }

        System.out.println(text + numberOfTimes + text);
    }
}
