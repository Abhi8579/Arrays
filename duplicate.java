import java.util.*;
public class duplicate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean dup=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    dup=true;
                    break;
                }
            }
            if(!dup){
                System.out.println("no duplicate");
            }
        
        }
    }
}
