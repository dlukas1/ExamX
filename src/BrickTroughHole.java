import java.util.Arrays;

/**
 * On antud risttahukakujuline telliskivi mõõtmetega a, b, c ning
 * ristkülikukujuline ava mõõtmetega x, y (kõik suurused on positiivsed
 * reaalarvud). Koostage programm, mis teeb kindlaks, kas kivi mahub läbi ava
 * nii, et kivi tahk libiseb mööda ava serva (s.t. kivi ei tohi olla "viltu").
 */

public class BrickTroughHole {
    public static void main(String[] args) {
        //obozna4im vhodnie dannie
        double a, b, c, x, y;
        a = 2;
        b = 3;
        c = 4;
        x = 2.0;
        y = 4.2;

        if(kasmahub(a,b,c,x,y) == true) {
            System.out.println("Mahub!");
        }
        else {
            System.out.println("Ei mahu!");
        }
    }
    //metod kasmahub - sozdaem dva massiva, sortiruem po vozrastaniju i sravnivaem 1 i 2 elementy
    public static boolean kasmahub (double a,double b,double c,double x,double y){
        double []brick  = new double[]{a,b,c};
        double[] auk = new double[] {x,y};

        Arrays.sort (auk);
        Arrays.sort(brick);

        if( brick[0]<auk[0] && brick [1]<auk[1] )
            return true;
        else
            return false;
    }}
