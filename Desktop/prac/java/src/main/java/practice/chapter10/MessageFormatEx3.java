package practice.chapter10;

import java.text.MessageFormat;
import java.text.ParseException;

public class MessageFormatEx3 {
    public static void main(String[] args) throws ParseException {
        String[] data = {
                "insert into cust_info values ('수진','010-4143-1234','28','0703');",
                "insert into cust_info values ('깅강','010-1234-1234','8','9191);"
        };

        String pattern = "insert into cust_info values ({0},{1},{2},{3});";
        MessageFormat mt = new MessageFormat(pattern);

        for(int i=0; i<data.length;i++){
            Object[] obj = mt.parse(data[i]);
            for(int j=0;j< obj.length;j++){
                System.out.println(obj[j]+",");
            }
        }
    }
}
