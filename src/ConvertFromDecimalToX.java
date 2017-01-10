import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
On antud positiivne täisarv m ning arvusüsteemi alus n (vahemikust 2 kuni
        * 36). Kirjutada Java meetod arvu m esitamiseks n-süsteemis (tulemuseks on
        * string, mis koosneb numbrimärkidest ja vajadusel ladina väiketähtedest).
        *
        * public static String toSysString (int m, int n)
        * Example: toSysString (14, 4) == "32"*/
public class ConvertFromDecimalToX {
    public static void main(String[] args)
    {
        int m =10;
        int n = 2;
        System.out.println(toSysString(m,n));
    }

    public static String toSysString (int m,int n )
    {
        String x = Integer.toString(m,n);
        return x;
    }
    
/* С диалогом: 

    public static void main(String[] args) throws Exception {
        System.out.print("Введите число для конвертирования: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sNum = br.readLine();
        int i = Integer.parseInt(sNum);
        System.out.print("Выберите основание новой системы счисления: ");
        String sNu = br.readLine();
        int q = Integer.parseInt(sNu);
        System.out.println("В выбранной системе счисления " + i + " будет равно " + Integer.toString(i, q));
    }*/
}








