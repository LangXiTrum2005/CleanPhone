package com.smartdigimkt.v0;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f39056a = "UriUtil";

    public static String a(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? "" : new URL(str).getHost();
        } catch (Exception e2) {
            e2.getMessage();
            return "";
        }
    }

    public static String b(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : new URL(str).getPath();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int c(String str) {
        try {
            if (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) {
                return 0;
            }
            return Uri.parse(str).getQueryParameterNames().size();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static String d(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !str.contains("n_logo=0")) {
                HashMap map = new HashMap();
                map.put("n_logo", "0");
                return l.a(str, map);
            }
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String a(String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : Uri.parse(str).getQueryParameter(str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
