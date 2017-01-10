public class absVSumma {

    ///*Koostage Java-meetod, mis leiab etteantud massiivi m elementide absoluutv22rtuste summa.
    public static void main(String[] args) {

        //создаем массив
        int myArray[] = {3, 5, 7, -12};
        System.out.println("AbsVaartSumma = " + absvSumma(myArray));
    }

    //метод принимает массив
    public static int absvSumma (int[] m) {

        int sum = 0;
        int absint;

        //for - берет по очереди каждое число массива, абс и складывает в сум
        for(int i = 0; i < m.length; i++)
        {
            absint = Math.abs(m[i]);
            sum = sum + absint;
        }
        return sum;
    }


}
