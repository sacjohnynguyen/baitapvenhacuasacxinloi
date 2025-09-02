package lec7_String;
import java.util.*;
public class ex4_kiem_tra_tu_dong_am {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi thu nhat: ");
        String c1 = scanner.nextLine();
        System.out.print("Nhap chuoi thu hai: ");
        String c2 = scanner.nextLine();
        if(c1.length()!= c2.length()){
            System.out.println("Hai chuoi khong phai Anagrams");
            return;
        }
        c1=c1.toLowerCase();
        c2=c2.toLowerCase();
        char[] mang1=c1.toCharArray();
        char[] mang2 = c2.toCharArray();
        Arrays.sort(mang1);
        Arrays.sort(mang2);
        if(Arrays.equals(mang1, mang2)){
            System.out.println("Hai chuoi la Anagrams.");
        }
        else{
            System.out.println("Hai chuoi khong phai Anagrams.");
        }
    }
}
