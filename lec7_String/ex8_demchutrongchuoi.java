
package lec7_String;
import java.util.*;
public class ex8_demchutrongchuoi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        s=s.trim();
        String[] a = s.split("\\s+");
        int dem=1;
        for(int i=1;i<a.length;i++){
            if(a[i]!=""){
                dem++;
            }
        }
        System.out.println("The number of words in the string is: "+dem);
    }
}
