
package lec6array;
import java.util.*;
public class ex13sapxepgop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mang thu nhat: ");
        int n1=scanner.nextInt();
        int[] s=new int[n1];
        for(int i=0;i<n1;i++){
            System.out.print("Nhap phan tu thu ["+i+"]");
            s[i]=scanner.nextInt();
        }
        System.out.print("Danh sach mang thu 1");
        for(int i=0;i<n1;i++){
            System.out.print(" "+s[i]);
        }
        System.out.println();
        System.out.print("Nhap mang thu hai: ");
        int n2=scanner.nextInt();
        int[] s2=new int[n2];
        for(int i=0;i<n2;i++){
            System.out.print("Nhap phan tu thu ["+i+"]");
            s2[i]=scanner.nextInt();
        }
        
        System.out.print("Danh sach mang thu 2");
        for(int i=0;i<n1;i++){
            System.out.print(" "+s2[i]);
        }
        int n3=n1+n2;
        int[] s3=new int[n3];
        for(int i=0;i<n1;i++){
            s3[i]=s[i];
        }
        for(int i=0;i<n2;i++){
            s3[n1+i]=s2[i];
        }
        System.out.println();
        System.out.print("Sau khi gop mang");
        for(int i=0;i<n3;i++){
            System.out.print(" "+s3[i]);
        }
        Arrays.sort(s3);
        System.out.println();
        System.out.print("Hien thi Danh sach: ");
        for(int i=0;i<n3;i++){
            System.out.print(" "+s3[i]);
        }
    }
    }
