package com.bytedance.adsdk.Lxb.LD.JXs;

/* JADX INFO: loaded from: classes.dex */
public class Lxb {
    public static boolean LD(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean Lxb(char c) {
        return c == ' ';
    }

    public static boolean ZU(char c) {
        return '+' == c || '-' == c || '*' == c || '/' == c || '%' == c || '=' == c || '>' == c || '<' == c || '!' == c || '&' == c || '|' == c || '?' == c || ':' == c;
    }

    public static boolean lk(char c) {
        return c >= '0' && c <= '9';
    }
}
