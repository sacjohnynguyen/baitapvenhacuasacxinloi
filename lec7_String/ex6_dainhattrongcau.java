
package lec7_String;
import java.util.*;
public class ex6_dainhattrongcau {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 cau ");
        String s = scanner.nextLine();
        String[] a = s.split(" ");
        String c = "";
         int max=0;
        for(int i =1 ;i < a.length;i++){
            if(max<a[i].length()){
                c = a[i];
                max=a[i].length();
            }
        }
        System.out.println("Tu dai nhat la: "+c);
    }
}
