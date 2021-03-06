package Pr11_12_13.util;

import java.util.Arrays;
import java.util.TimeZone;

public class five {
    public static void main(String[] args) {
        five test = new five();
        TimeZone tz = TimeZone.getDefault();
        int rawOffset = tz.getRawOffset();
        System.out.println("Current TimeZone" + tz.getDisplayName() + tz.getID() + "\n\n");
        // Display all available TimeZones
        System.out.println("All Available TimeZones \n");
        String[] idArr = tz.getAvailableIDs();
        for(int cnt=0;cnt < idArr.length;cnt++){
            tz = TimeZone.getTimeZone(idArr[cnt]);
            System.out.println(test.padr(tz.getDisplayName() +
                    tz.getID(),64) + " raw offset=" + tz.getRawOffset() +
                    ";hour offset=(" + tz.getRawOffset()/ (1000 * 60 * 60 ) + ")");
        }
        // Display all available TimeZones same as for Moscow
        System.out.println("\n\n TimeZones same as for Moscow \n");
        idArr = tz.getAvailableIDs(rawOffset);
        for(int cnt=0;cnt < idArr.length;cnt++){
            tz = TimeZone.getTimeZone(idArr[cnt]);
            System.out.println(test.padr(tz.getDisplayName()+
                    tz.getID(),64) + " raw offset=" + tz.getRawOffset() +
                    ";hour offset=(" + tz.getRawOffset()/ (1000 * 60 * 60 ) + ")");
        }
    }
    String padr(String str,int len){
        if(len - str.length() > 0){
            char[] buf = new char[len - str.length()];
            Arrays.fill(buf,' ');
            return str + new String(buf);
        }else{
            return str.substring(0,len);
        }
    }
}
