import java.util.*;
public class search {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==s){
                System.out.println("found " + arr[i]);
                break;
            }else{
                System.out.println("not found");
            }
        }
    }

    
}
