package importantjavaprogram;

public class duplicatearray {

    public static void main(String[] args) {
        int val[] = {1, 5, 8, 9, 1, 3, 5, 8, 4, 6};
        for (int i = 0; i < val.length; i++) {
            for (int j = i + 1; j < val.length; j++) {
                if (val[i] == val[j]) {
                    System.out.println(j);
                }
            }
        }
    }
}