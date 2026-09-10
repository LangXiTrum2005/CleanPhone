package com.smartdigimkt.f0;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class e {
    public static String a(String str) {
        if (f(str)) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLetter(cCharAt) || Character.isUpperCase(cCharAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static String b(String str) {
        if (f(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c2 = charArray[i2];
            if (c2 == 12288) {
                charArray[i2] = ' ';
            } else if (c2 < 65281 || c2 > 65374) {
                charArray[i2] = c2;
            } else {
                charArray[i2] = (char) (c2 - 65248);
            }
        }
        return new String(charArray);
    }

    public static String c(String str) {
        if (f(str)) {
            return "";
        }
        Matcher matcher = Pattern.compile(".*<[\\s]*a[\\s]*.*>(.+?)<[\\s]*/a[\\s]*>.*", 2).matcher(str);
        return matcher.matches() ? matcher.group(1) : str;
    }

    public static String d(String str) {
        if (f(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c2 = charArray[i2];
            if (c2 == ' ') {
                charArray[i2] = 12288;
            } else if (c2 < '!' || c2 > '~') {
                charArray[i2] = c2;
            } else {
                charArray[i2] = (char) (c2 + 65248);
            }
        }
        return new String(charArray);
    }

    public static boolean e(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean f(String str) {
        return str == null || str.length() == 0;
    }

    public static String g(String str) {
        return str == null ? "" : str;
    }

    public static String h(String str) {
        if (f(str) || str.getBytes().length == str.length()) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UnsupportedEncodingException occurred. ", e2);
        }
    }

    public static String a(String str, String str2) {
        if (f(str) || str.getBytes().length == str.length()) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str2;
        }
    }

    public static String a(long j) {
        if (j <= 0) {
            return "0M";
        }
        return String.format("%.1f", Float.valueOf((j / 1024.0f) / 1024.0f)).concat("M");
    }
}
