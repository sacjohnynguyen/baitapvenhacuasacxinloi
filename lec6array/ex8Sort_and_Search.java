
package lec6array;
import java.util.*;
public class ex8Sort_and_Search {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] s = new int[5];
        
        for(int i =0; i<5;i++){
            System.out.print("Nhap phan tu thu ["+i+"] ");
            s[i]=scanner.nextInt();
        }
        System.out.print("Danh sach");
        for(int i=0;i<5;i++){
            System.out.print(" "+s[i]);
        }
        Arrays.sort(s);
        System.out.println();
        System.out.println("Sau khi sap xep: ");
        for(int i=0;i<5;i++){
            System.out.print(" "+ s[i]);
        }
        int x= scanner.nextInt();
        for(int i=0;i<5;i++){
            if(s[i]==x){
                System.out.println("Nam o vi tri thu "+i);
            }
        }
    }
}
