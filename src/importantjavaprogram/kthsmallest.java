package importantjavaprogram;
import java.util.Arrays;
import java.util.Collections;
public class kthsmallest {
    public int small(int arr[],int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args)
    {
        int arr[]={9,6,1,7,4,3,8};
        int k=2;
        System.out.println("the kth smallest value"+small(arr,k));

    }
}
