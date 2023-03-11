import javax.xml.crypto.Data;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        String a = "ABCABC";
        String b = "ABC";
        System.out.println(isCheck(a,b));
    }

    private static  String isCheck(String a , String b){
        if (a.length() == b.length()){
            if (a.equals(b)){
                return a;
            }else {
                return "";
            }
        }

        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        if (!a.startsWith(b)) return "";

        return isCheck(a.substring(b.length()), b);
    }
}


