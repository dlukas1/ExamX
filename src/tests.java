import java.util.Arrays;
import java.util.stream.IntStream;

public class tests {

    ///*Koostage Java-meetod, mis leiab etteantud massiivi m elementide absoluutv22rtuste summa.
    public static void main(String[] args) {

        int myArray[] = {3, 5, 7, -12};
        System.out.println("AbsVaartSumma = " + absvSumma(myArray));
    }

    public static int absvSumma (int[] m) {

        int sum = 0;
        int absint = 0;

        for(int i = 0; i < m.length; i++)
        {
            absint = Math.abs(m[i]);
            sum = sum + absint;
        }
        return sum;
}
    }

    /* InStreams - поток, здесь считаем сумму массива
    public static int absvSumma(int[] myArray) {

        int total = IntStream.of(myArray).sum();

        return total;
    }
     */



