import java.util.*;
public class twoarr {
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
       // for(int i=0;i<n;i++){
            System.out.println("smallest"+arr[0]);
            System.out.println("largest"+arr[n-1]);
        //}
    }
}