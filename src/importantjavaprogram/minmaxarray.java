package importantjavaprogram;

public class minmaxarray {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] array={100,20,89,60,55,10,45,600};
        int min=array[0];
        int max=array[0];

        //min value
        for(int i=1;i<array.length;i++)
        {
            if (array[i]< min)
            {
                min=array[i];
            }
        }
        //max value
        for(int j=1;j<array.length;j++)
        {
            if (array[j]>max)
            {
                max=array[j];
            }
        }
        System.out.println("the minimum value is:"+min);
        System.out.println("the minimum value is:"+max);
    }
}
