package com.smartdigimkt.v0;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38988a = "ResourceUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38989b = "layout";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f38990c = "id";
    public static final String d = "drawable";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f38991e = "color";
    public static final String f = "style";
    public static final String g = "anim";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f38992h = "string";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f38993i = -1;

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return null;
    }

    public static int a(Context context, String str, String str2) {
        if (context == null) {
            return -1;
        }
        try {
            String strC = com.smartdigimkt.u.a.f().c();
            int identifier = !TextUtils.isEmpty(strC) ? context.getResources().getIdentifier(str, str2, strC) : -1;
            if (identifier > 0) {
                return identifier;
            }
            String packageName = "";
            try {
                packageName = com.smartdigimkt.u.a.f().g();
            } catch (Exception unused) {
            }
            if (y.a(packageName)) {
                packageName = context.getPackageName();
            }
            if (y.a(packageName)) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, packageName);
        } catch (Exception unused2) {
            return -1;
        }
    }
}
