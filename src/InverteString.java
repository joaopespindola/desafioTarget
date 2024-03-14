public class InverteString {
    public static String inverterString(String string) {
        StringBuilder str = new StringBuilder(string.length());

        for (int i = string.length() - 1; i >= 0; i--) {
            str.append(string.charAt(i));
        }

        return str.toString();
    }
}
