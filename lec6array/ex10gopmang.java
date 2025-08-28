
package lec6array;
import java.util.*;
public class ex10gopmang {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu thu nhat: ");
        int n1=scanner.nextInt();
        int[] mang=new int[n1];
        for(int i=0;i<n1;i++){
            System.out.print("Phan tu thu ["+i+"]");
            mang[i] = scanner.nextInt();
        }
        System.out.println("Hien thi danh sach mang thu nhat: ");
        for(int i=0;i<n1;i++){
            System.out.print(" "+mang[i]);
        }
        System.out.println();
        System.out.print("Nhap so luong phan tu thu hai: ");
        int n2=scanner.nextInt();
        int[] mang2=new int[n2];
        for(int i=0;i<n2;i++){
            System.out.print("Phan tu thu ["+i+"]");
            mang2[i] = scanner.nextInt();
        }
        System.out.print("Hien thi danh sach mang thu hai: ");
        for(int i=0;i<n2;i++){
            System.out.print(" "+mang2[i]);
        }
        System.out.println();
        int n3=n1+n2;
        int[] mang3=new int[n3];
        for(int i=0;i<n1;i++){
            mang3[i]=mang[i];
        }
        for(int i=0;i<n2;i++){
            mang3[n1+i]=mang2[i];
        }
        System.out.println("Hien thi danh sach: ");
        for(int i=0;i<n3;i++){
            System.out.print(" "+ mang3[i]);
        }
    }
}
