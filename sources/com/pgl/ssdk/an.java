package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f33426a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f33427b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f33428c = "api16-access-ttp.tiktokpangle.us";
    public static final String[] d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f33429e = Integer.MIN_VALUE;
    public static String f = "";

    public static String a() {
        return f33426a == 1 ? "VA" : "SG";
    }

    public static String b() {
        return f;
    }

    public static void a(int i2) {
        f33426a = i2;
    }

    public static void b(String str) {
        f = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f33427b = str;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f33427b)) {
            au.a("updateIndex");
            int i2 = f33429e;
            if (i2 < Integer.MAX_VALUE) {
                int i3 = i2 + 1;
                f33429e = i3;
                ax.b(context, "domain_index", i3);
                return;
            }
            f33429e = 0;
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f33427b)) {
            return f33427b;
        }
        try {
            if (f33429e == Integer.MIN_VALUE) {
                f33429e = ax.a(context, "domain_index", 0);
            }
            String[] strArr = d;
            return strArr[f33429e % strArr.length];
        } catch (Throwable unused) {
            return f33428c;
        }
    }
}
