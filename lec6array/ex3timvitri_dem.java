
package lec6array;
import java.util.*;
public class ex3timvitri_dem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = scanner.nextInt();
        int[] s=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Nhap mang thu ["+i+"]: ");
            s[i]=scanner.nextInt();        
        }
        System.out.print("Nhap X: ");
        int x=scanner.nextInt();
        int dem=0;
        System.out.println("number to find X= "+x);
        for(int i=0;i<n;i++){
            if(s[i]==x){
                dem++;
            }
        }
        System.out.println("The number "+x+" appears "+dem+" times");
    }
    
}
