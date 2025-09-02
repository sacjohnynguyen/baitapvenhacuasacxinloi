
package lec7_String;
import java.util.*;
public class ex1daostring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        String[] mang= s.split(" ");
        for(int i=mang.length-1;i>=0;i--){
            System.out.print(mang[i]+" ");
        }
    }
}
