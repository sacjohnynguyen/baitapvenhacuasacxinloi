package lec6array;

import java.util.*;

public class ex6_Unlimited_Data_Entry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> s = new ArrayList<>();
        int num;
        int sum = 0;
        System.out.print("Nhap so nguyen: ");
        while (true) {
            num = scanner.nextInt();
            if (num != -1) {
                sum += num;
                s.add(num);
            } else {
                break;
            }
        }
        System.out.println("Danh sach nhap: " + num);
        System.out.println("Tong: " + sum);
    }
}
