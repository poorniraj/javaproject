package importantjavaprogram;

public class missingnumberarray {
    public static void main(String[] args) {


        int s[] = {1, 2, 3, 4, 6};
        int s1[] = {1, 2, 3, 4};
        int sum = 0;
        int sum1 = 0;
        int val = 0;
        for (int i = 0; i <= 4; i++) {
            sum += s[i];

        }
        System.out.println(sum);
        for (int i = 0; i <= 3; i++) {
            sum1 += s1[i];

        }
        System.out.println(sum1);
        val = sum - sum1;
        System.out.println(val);
    }
}