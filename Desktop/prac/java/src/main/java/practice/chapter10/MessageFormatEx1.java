package practice.chapter10;

import java.text.MessageFormat;

public class MessageFormatEx1 {

    public static void main(String[] args) {
        String msg = "Name: {0} \n Tel: {1} \n Age: {2} \n Birthday: {3}";

        Object[] argu = {
                "수진","01041431111","28","1995-07-07"
        };

        System.out.println("MessageFormat.format(argu) = " + MessageFormat.format(msg, argu));
    }
}
