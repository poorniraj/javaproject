package importantjavaprogram;

public class occuraceofchar {
    public static void main(String[] args)
    {
        char arr[]={'a','r','e','o','p','g','a','o','p','a'};
        int arrlen=arr.length;
        int occ=0;
        char val='a';
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
