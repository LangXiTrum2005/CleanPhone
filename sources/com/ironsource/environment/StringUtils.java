package com.ironsource.environment;

import com.ironsource.C0474n4;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class StringUtils {
    public static String decodeURI(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C0474n4.d().a(e10);
            return "";
        }
    }

    public static String encodeURI(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e10) {
            C0474n4.d().a(e10);
            return "";
        }
    }

    public static String toLowerCase(String str) {
        return str == null ? "" : str.toLowerCase(Locale.ENGLISH);
    }

    public static String toUpperCase(String str) {
        return str == null ? "" : str.toUpperCase(Locale.ENGLISH);
    }
}
