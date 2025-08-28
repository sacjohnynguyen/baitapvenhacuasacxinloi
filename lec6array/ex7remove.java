
package lec6array;
import java.util.*;
import java.util.Arrays;
public class ex7remove {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong gia tri: ");
        int n = scanner.nextInt();
        ArrayList<Integer> s = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu ["+(i+1)+"]");
            int b=scanner.nextInt();
            s.add(b);
        }
        System.out.println(Arrays.toString(s.toArray()));
        for(int i=0;i<s.size();i++){
            int a2=s.get(i);
            for(int k=i+1;k<s.size();k++){
                int a3=s.get(k);
                if(a2==a3){
                    s.remove(k);
                }
            }
        }
        System.out.println(Arrays.toString(s.toArray()));
    }
}
