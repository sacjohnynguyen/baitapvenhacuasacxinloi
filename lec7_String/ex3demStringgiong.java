
package lec7_String;
import java.util.*;
public class ex3demStringgiong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s=scanner.nextLine();
        int dem = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                dem++;
            }
            else{
                sb.append(s.charAt(i-1)).append(dem);
                dem=1;
            }
        }
        sb.append(s.charAt(s.length() - 1)).append(dem);
        System.out.println("Chuoi da nen "+sb.toString());
    }
}
