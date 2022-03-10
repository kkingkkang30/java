package practice.chapter10;

import java.text.MessageFormat;

public class MessageFormatEx2 {

    public static void main(String[] args) {
        String tableName ="CUST_INFO";
        String msg  ="insert into " + tableName + " values (''{0}'',''{1}'',''{2}'',''{3}'');";

        Object [] [] argu = {
                { "수진", "010-4143-0000","28","0709"}
                ,{"깅강","010-1234-1234","8","0101"}
        };

        for(int i=0;i<argu.length;i++){
            String result = MessageFormat.format(msg,argu[i]);
            System.out.println(result);
        }


    }
}
