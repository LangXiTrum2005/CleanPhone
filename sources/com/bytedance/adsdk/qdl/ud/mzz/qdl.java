package com.bytedance.adsdk.qdl.ud.mzz;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    public static boolean lnr(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean mml(char c2) {
        return '+' == c2 || '-' == c2 || '*' == c2 || '/' == c2 || '%' == c2 || '=' == c2 || '>' == c2 || '<' == c2 || '!' == c2 || '&' == c2 || '|' == c2 || '?' == c2 || ':' == c2;
    }

    public static boolean qdl(char c2) {
        return c2 == ' ';
    }

    public static boolean ud(char c2) {
        if (c2 < 'A' || c2 > 'Z') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }
}
