
package lec7_String;
import java.util.*;
public class ex7viet_tat {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap chuoi: ");
    String s = scanner.nextLine();
    String[] a = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<a.length;i++){
        sb.append(Character.toUpperCase(a[i].charAt(0)));
    }
    System.out.println("Viet tat: "+sb.toString());
    }
}
