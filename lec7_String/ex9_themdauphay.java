
package lec7_String;
import java.util.*;
public class ex9_themdauphay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for(int i=s.length()-3;i>0;i-=3){
            sb.insert(i, ",");
        }
        System.out.println("Chuoi sau khi fix: "+sb.toString());
    }
}
