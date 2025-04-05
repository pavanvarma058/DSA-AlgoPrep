import java.util.*;
public class ToggleCharacters {
    public static void main(String[] args) {
        // Given a char[] which contains only small and capital letters, toggle them
        char[] ch = {'A', 'l', 'g', 'o', 'P', 'R', 'e', 'P'};
        toggle(ch);
        System.out.println(ch);
    }
    public static void toggle(char[] ch){
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= 65 && ch[i] <= 90){
                ch[i] = (char) (ch[i] + 32);
            }else {
                // LowerCase to UpperCase
                ch[i] = (char) (ch[i] - 32);
            }
        }
    }
}
