package jsoft;

public class JTools {
    public static int sum(int n) {
        var s = 0;
        for (var i = 0; i <= n; i++)
            s += i;
        return s;
    }
    public static int countWhitespaces(String str) {
        var c = 0;
        for (var i = 0; i < str.length(); i++)
            if (Character.isWhitespace(str.charAt(i)))
                c++;
        return c;
    }
}
