package importantjavaprogram;
import java.util.Arrays;
import java.util.Collections;
public class kthhighestarray {
        // Function to return k'th highest
        // element in a given array
        public static int kthhighest(Integer[] arr,
                                      int k)
        {
            // Sort the given array
            Arrays.sort(arr);
            int len=arr.length;
            int l=len-k;

            // Return k'th element in
            // the sorted array
            return arr[l];
        }

        // driver program
        public static void main(String[] args)
        {
            Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
            int k = 2;
            System.out.print("K'th highest element is " + kthhighest(arr, k));
        }
    }

