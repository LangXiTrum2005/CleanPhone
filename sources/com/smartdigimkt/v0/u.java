package com.smartdigimkt.v0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class u extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f39034b = "SDKUtil";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f39035c = false;
    public static char[] d = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static LinearLayout f39036e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f39037a = "com.android.vending";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f39038b = "market";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f39039c = "play.google.com";
        public static final String d = "market.android.com";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f39040e = "google.com";
        public static final String f = "market://";
        public static final String g = "details?id=";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f39041h = "market://details?id=com.package.name";

        public static List<ResolveInfo> a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(b(context), 0);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public static Intent b(Context context) {
            return new Intent("android.intent.action.VIEW", Uri.parse(f39041h));
        }

        public static boolean c(Context context) {
            List<ResolveInfo> listA = a(context);
            return listA != null && listA.size() > 0;
        }

        public static boolean d(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th) {
                Log.getStackTraceString(th);
                return false;
            }
        }

        public static boolean b(String str) {
            return d(str) || c(str);
        }

        public static String a(String str) {
            if (d(str)) {
                return str;
            }
            if (c(str)) {
                return android.support.v4.media.a.C("market://", str.substring(str.indexOf(g)));
            }
            return null;
        }

        public static boolean c(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Uri uri = Uri.parse(str);
                    return uri.getHost().equals("play.google.com") || uri.getHost().equals("market.android.com");
                }
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
            return false;
        }
    }

    public static void a(com.smartdigimkt.f1.k kVar, ViewGroup viewGroup) {
    }

    public static void b(com.smartdigimkt.f1.k kVar, ViewGroup viewGroup) {
    }

    public static void a(com.smartdigimkt.f1.k kVar, ViewGroup viewGroup, int i2, int i3) {
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.lastIndexOf("/") == -1) {
            return str.hashCode() + "";
        }
        return (str.substring(str.lastIndexOf("/") + 1).hashCode() + str.hashCode()) + "";
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new File(com.smartdigimkt.e0.d.a(com.smartdigimkt.e0.a.ANYTHINK_700_IMG), b(str)).getAbsolutePath();
    }

    public static String a() {
        return com.smartdigimkt.e0.d.b(com.smartdigimkt.e0.a.AD_ANYTHINK_700);
    }
}
