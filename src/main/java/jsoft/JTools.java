package jsoft;

public class JTools {
    public static int sum(int n) {
        var s = 0;
        for (var i = 1; i <= n; i++)
            s += i;
        return s;
    }
}
