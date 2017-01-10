
public class VäikseimYsiskordne {

    public static void main(String[] args)
    {
        System.out.println(lcm(35, 205)); // 30
    }

    public static int lcm(int m, int n)
    {
        int yhine = 0;
        System.out.println(0 % m); // testimiseks
        System.out.println(0 % n); // testimiseks

        for (int i = 1; i <= (m * n); i++) {
            if (i % m == 0 && i % n == 0) {
                yhine = i;
                break;
            }
        }
        return yhine;
    }
}