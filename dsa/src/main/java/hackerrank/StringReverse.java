package hackerrank;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello";
        reverseWithStringBuffer(str);
        reverseManually(str);
    }

    private static void reverseManually(String str) {
        // Using stringBuffer as string are immutable and not recommended for mutations.
        StringBuffer sb = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }

    private static void reverseWithStringBuffer(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
    }
}
