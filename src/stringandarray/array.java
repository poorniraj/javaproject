package stringandarray;

public class array {
    public static void main(String args[])
    {
        int i[]=new int[4];
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;
        System.out.println(i[2]);
        System.out.println(i[3]);
        //System.out.println(i[4]);(will get arrayindex out of bound exception)
        //size length of array
        System.out.println(i.length);
        //to print all the value of array
        for(int j=0;j<=i.length;j++)
        {
            System.out.println(i[j]);

        }
        //double array
        double d[]=new double[3];
        d[0]=33.66;
        d[1]=89.7;
        d[2]=12.45;
        System.out.println(d[2]);

        //char array
        char c[]=new char[2];
        c[0]='i';
        c[1]='j';
        System.out.println(c[1]);

        //string array
        String s[]=new String[3];
        s[0]="hello";
        s[1]="hi";
        s[2]="how are you";
        System.out.println(s[2]);
        System.out.println(d.length);

        //object array(object is a class--it's used to store different data types values)
        Object ob[]=new Object[6];
        ob[0]="tom";
        ob[1]=25;
        ob[2]=12.33;
        ob[3]="1/1/2017";
        ob[4]='a';
        ob[5]="london";

        System.out.println(ob.length);
        System.out.println(ob[3]);
    }
}
