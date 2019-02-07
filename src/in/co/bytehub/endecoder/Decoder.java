package in.co.bytehub.endecoder;

import java.io.IOException;

import sun.misc.BASE64Decoder;

public class Decoder {

    public static String decode(String encoded) throws IOException {

        int length = encoded.length() / 2;

        encoded = encoded.substring(0, length + 1);

        String base24 = encoded.substring(0, encoded.length() - 1);
        String substring = encoded.substring(encoded.length() - 1, encoded.length());
        int numberOfTimes = Integer.parseInt(substring);

        BASE64Decoder decoder = new BASE64Decoder();

        byte[] decodeBuffer = base24.getBytes();
        for (int x = 0; x < numberOfTimes; x++) {
            decodeBuffer = decoder.decodeBuffer(new String(decodeBuffer));
        }
        return new String(decodeBuffer);
    }
}
