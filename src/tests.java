import java.util.Arrays;

public class tests{

    public static void main(String[] args) {
        int[][] grades = new int[][] { { 1, 3, 5 }, { 3, 3, 5, 5 },{ 7, 3, 5 }, { 3, 5, 0 } };
        int[] res = sortByAvg(grades); // {1,0}
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    } // main

    public static int[] sortByAvg(int[][] g) {
        // ridade keskmiste arvutamine ja uude massiivi lisamine
        double[] unsortedAverage = new double[g.length];

        for (int i = 0; i < g.length; i++) {
            double rowAverage = 0;
            int rowSum = 0;
            for (int j = 0; j < g[i].length; j++) {
                rowSum += g[i][j];
            }
            rowAverage = (double) rowSum / g[i].length;
            unsortedAverage[i] = rowAverage;
        }

        // loon uue massiivi kloonides unsortedAverage massiivi
        double[] sortedAverage = (double[]) unsortedAverage.clone();

        // sordin loodud massiivi sortedAverage
        Arrays.sort(sortedAverage);

        // kakkan võrdlema sortimata ja sorditud massiive
        // massiiv sorditud indeksite hoidmiseksmis on kasvavas järjekorras
        int[] increasingIndexes = new int[sortedAverage.length];
        // int j = 0;
        for (int i = 0; i < sortedAverage.length; i++) {
            // kerin sortimata keskmised läbi tagant ettepoole
            for (int j = unsortedAverage.length - 1; j > 0; j--) {
                // kerin
                if (sortedAverage[i] == unsortedAverage[j]) {
                    increasingIndexes[i] = j;
                    unsortedAverage[j] = -999;  // kui leian võrdsed mõlemas massiivis, siis muudan väärtuse ära, et ta järgmises läbikerimises ei segaks
                    // kui on esimene võrdsed leitud, siis katkestab sortimata massiivi läbi kerimist
                    break;
                }
            }
        }
        // keeran indeksimassiivi teistpidi
        int[] decreasingIndexes = new int[increasingIndexes.length];
        for (int i = 0; i < increasingIndexes.length; i++) {
            decreasingIndexes[increasingIndexes.length - 1 - i] = increasingIndexes[i];
        }
        return decreasingIndexes;
    } // sortByAvg


}
