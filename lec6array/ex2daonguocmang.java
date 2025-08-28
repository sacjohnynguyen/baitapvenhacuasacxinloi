package lec6array;

import java.util.*;

public class ex2daonguocmang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Mang thu [" + i + "]: ");
            s[i] = scanner.nextInt();
        }
        System.out.println("Sau khi dao nguoc ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }
    }
}
