import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // Syntax
        String str = "Pavan Varma";
        System.out.println(str);
        System.out.println(str.charAt(3)); // a

        // SubString -> Continuous Part of String
        System.out.println(str.substring(1, 5));

        // Length of the String
        System.out.println(str.length());

        // String to Char array
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Char array to string
        String str2 = "".valueOf(arr);
        System.out.println(str2);
    }
}
