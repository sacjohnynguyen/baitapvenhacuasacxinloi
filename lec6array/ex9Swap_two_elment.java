
package lec6array;
import java.util.*;
public class ex9Swap_two_elment {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong mang: ");
        int n =scanner.nextInt();
        int[] mang=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu ["+i+"] ");
            mang[i]=scanner.nextInt();
        }
        System.out.print("Hien thi danh sach mang: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+mang[i]);
        }
        System.out.println();
        System.out.print("Nhap vi tri thay doi thu nhat: ");
        int v1=scanner.nextInt();
        System.out.print("Nhap vi tri thay doi thu hai: ");
        int v2 =scanner.nextInt();
        int b=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(i==v1){
                b=mang[i];
            }
            else if(i==v2){
                c=mang[i];
            }
        }
        mang[v1]=c;
        mang[v2]=b;
        System.out.println("Sau khi thay doi: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+mang[i]);
        }
    }
}
