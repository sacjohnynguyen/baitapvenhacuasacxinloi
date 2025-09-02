
package lec7_String;
import java.util.*;
public class ex5_Phan_tich_du_lieu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap link: ");
        String l1=scanner.nextLine();
        String protocol = l1.substring(0,l1.indexOf("://"));
        System.out.println("Protocol: "+protocol);
        int n1 = l1.indexOf("//")+2;
        String domain = l1.substring(n1,l1.indexOf("/",n1));
        System.out.println("Domain: "+domain);
        String pat = l1.substring(l1.indexOf("/",n1),l1.length());
        System.out.println("Path: "+pat);
    }
}
