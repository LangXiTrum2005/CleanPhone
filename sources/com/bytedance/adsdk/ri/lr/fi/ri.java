package com.bytedance.adsdk.ri.lr.fi;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static boolean ik(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean ka(char c) {
        return '+' == c || '-' == c || '*' == c || '/' == c || '%' == c || '=' == c || '>' == c || '<' == c || '!' == c || '&' == c || '|' == c || '?' == c || ':' == c;
    }

    public static boolean lr(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean ri(char c) {
        return c == ' ';
    }
}
