package lec6array;

import java.util.*;

public class ex1nhietdo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days' temperatues? ");
        int d = scanner.nextInt();
        int[] t0 = new int[d];
        double sum = 0;
        int dem = 0;
        for (int i = 0; i < d; i++) {
            System.out.print("Day " + (i + 1) + "s high tem: ");
            t0[i] = scanner.nextInt();
            sum += t0[i];
        }
        double tb = sum / d;

        for (int i = 0; i < d; i++) {
            if (t0[i] > tb) {
                dem++;
            }
        }
        System.out.printf("Average tem = %.1f ", tb);
        System.out.println();
        System.out.println(dem + " day were above average.");

    }
}
