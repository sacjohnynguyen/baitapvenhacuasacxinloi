
package lec7_String;
import java.util.*;

public class ex2viethoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        s=s.trim();
        String[] mang=s.split(" ");
        for(int i=0;i<mang.length;i++){
            
            if(mang.length>0){
                mang[i]=mang[i].substring(0,1).toUpperCase()+mang[i].substring(1).toLowerCase();
                System.out.print(" "+mang[i]);
            }
        }
        
    }
}
