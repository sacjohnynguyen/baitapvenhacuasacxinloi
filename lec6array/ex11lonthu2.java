
package lec6array;
import java.util.*;
public class ex11lonthu2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        int max=mang[0];
        int secondmax=-99999999;
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu ["+i+"] ");
            mang[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            if(mang[i]>max){
                secondmax=max;
                max=mang[i];
            }else if(mang[i]>secondmax && mang[i]!=max){
                secondmax=mang[i];
            }
            
        }
        System.out.println("GT lon thu 2: "+secondmax);
    }
}
