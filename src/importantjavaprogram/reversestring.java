package importantjavaprogram;

public class reversestring {
    public static void main(String[] args) {
        String name = "poornima";
        char c[] = name.toCharArray();
        String reverse = "";
        for (int i = c.length-1; i >= 0; i--) {
            reverse+=c[i];
        }
        System.out.println("reverse of the string is\t" + name +" "+ "is" +" "+ reverse);
        }
    }
