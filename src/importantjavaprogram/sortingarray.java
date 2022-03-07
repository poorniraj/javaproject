package importantjavaprogram;

public class sortingarray {
    public static void main(String[] args) {
        int arr[] = {5, 9, 1, 6, 8, 3};
        int temp;
        System.out.println("unsorted value");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("sorted value");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]+"");
        }
    }
}
