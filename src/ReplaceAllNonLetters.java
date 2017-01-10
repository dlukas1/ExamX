
/**
 * Koostada Java meetod, mis asendab suvalises parameetrina etteantud sõnes s
 * kõik mittetähed märgiga '*'. Write a Java method to replace all non-letters
 * in a given string s by symbol '*'.
 *
 * @author Ago Kytt
 *
 */
public class ReplaceAllNonLetters {

    public static void main(String[] args) {
        String s = "Tere, TUDENG, 1234!";
        String t = asenda(s); // "Tere**TUDENG*******"
        System.out.println(s + " > " + t);
    }

    public static String asenda(String s) {

        String t = s.replaceAll("[\\W\\d]", "*");

        return t; // TODO!!! Your code here
    }

}