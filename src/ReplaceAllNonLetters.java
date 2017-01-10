
/**
 Write a Java method to replace all non-letters
 * in a given string s by symbol '*'.
 *
 *
 */
public class ReplaceAllNonLetters {

    public static void main(String[]args){

        String s  = "Tere tudeng 12345!";
        String t = asenda(s);
        System.out.println(s + " > " + t);
    }
    public static String asenda (String s){
        String t = s.replaceAll("[\\W\\d]", "*");
        return t;
    }
}