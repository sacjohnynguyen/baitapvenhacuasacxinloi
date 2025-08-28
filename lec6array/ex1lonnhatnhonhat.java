
package lec6array;
import java.util.*;
public class ex1lonnhatnhonhat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = scanner.nextInt();
        int[] s=new int[n];
        
        for(int i=0;i<n;i++){
            
            System.out.print("Nhap "+i+": ");
            s[i]=scanner.nextInt();
           
        }
        int min = s[0];
        int max = s[0];
        for(int i=0;i<n;i++){
            if(s[i]>max){
                max=s[i];
                
            }
            if(s[i]<min){
                min=s[i];
                
            }
        }
        System.out.println("The max value is: "+max);
        System.out.println("The min value is: "+min);
        scanner.close();
    }
}
