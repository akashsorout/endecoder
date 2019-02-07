package in.co.bytehub.endecoder;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import sun.misc.BASE64Encoder;

public class Encoder {

    public static void main(String[] args) {
        System.out.println("Enter String to be enocode : ");
        Console console = System.console();
        String text="";
        if(null !=console) {
        char[] readPassword = console.readPassword();
        text= new String(readPassword);
        }
        else        	
        {
        	Scanner sc = new Scanner(System.in);
        	text= sc.next();
        	sc.close();
        }
         
		encode(text);
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
