package importantjavaprogram;

public class occuranceofarray {
    public static void main(String[] args)
    {
        int arr[]={1,1,1,4,3,4,3,3,2,2};
        int arrlen=arr.length;
        int occ=0;
        int val=2;
        for(int i=0;i<arrlen;i++)
        {
            if(arr[i]==val)
            {
                occ+=1;
            }
        }
        System.out.println("the value of"+val+"occure"+occ);
    }
}
