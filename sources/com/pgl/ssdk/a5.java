package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.sdk.basead.ui.BaseATView;

/* JADX INFO: loaded from: classes5.dex */
public class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f33388a = 504;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f33389b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f33390c = "";
    static boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f33391e;
    private static Context f;

    public static void a(Context context, String str) {
        if (f == null) {
            f = context;
        }
        int i2 = f33388a;
        if (i2 == 102 || i2 == 202 || i2 == 200) {
            return;
        }
        f33391e = System.currentTimeMillis();
        d = false;
        f33389b = str;
        f33388a = 102;
        ar.b(new ao(context, 301, null));
    }

    public static void b() {
        Context context = f;
        if (context != null) {
            ar.b(new ao(context, 301, null));
            f33388a = 102;
            com.pgl.ssdk.ces.b bVarE = com.pgl.ssdk.ces.b.e();
            if (bVarE != null) {
                bVarE.a("");
            }
        }
    }

    public static synchronized String a() {
        try {
            if (TextUtils.isEmpty(f33390c)) {
                f33390c = (String) com.pgl.ssdk.ces.a.meta(BaseATView.g.f38290N, f, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f33390c;
    }

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, f, bArr);
    }
}
