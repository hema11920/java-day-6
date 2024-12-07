import java.util.*;
public class arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //initilization of array
        int arr[]={22,44,56,78,678};
        System.out.println(Arrays.toString(arr));
        //accessing of array elements
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //modification of arry
        arr[2]=456;
        arr[3]=345;
        System.out.println(Arrays.toString(arr));
    }
}