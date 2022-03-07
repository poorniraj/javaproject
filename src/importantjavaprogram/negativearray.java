package importantjavaprogram;

public class negativearray {
    public static void main(String[] args)
    {
        int arr[]={6,9,1,5,-7,1,-4,-8};
        int temp=0;
        int j=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                if (i!=j)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
       for (int k=0;k<arr.length;k++)
       {
           System.out.println(arr[k]);
       }
    }
}
