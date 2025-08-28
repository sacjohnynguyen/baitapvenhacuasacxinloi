package lec6array;

import java.util.*;

public class ex5sochan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap mang thu [" + i + "] ");
            mang[i] = scanner.nextInt();
        }
        System.out.print("ArrayList containing: ");
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                System.out.print(mang[i] + " ");
            }
        }
    }
}
