public class ReverseString {
    public static void main(String[] args) {
        // Given a String str, reverse the string
        String str = "Pavan";
        System.out.println(reverse(str));

        // T.C: O(n)
        // S.C: O(1)
    }
    public static String reverse(String str){
        char[] ch = str.toCharArray();

        int sp = 0;
        int ep = ch.length - 1;

        while (sp<ep){
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] = temp;
            sp++;
            ep--;
        }
        return "".valueOf(ch);
    }
}
