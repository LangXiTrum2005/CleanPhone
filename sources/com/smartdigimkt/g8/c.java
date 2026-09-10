package com.smartdigimkt.g8;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35542b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35543c = 1;
    private static volatile c d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f35544a = new ConcurrentHashMap();

    private c() {
    }

    public static c a() {
        if (d == null) {
            synchronized (c.class) {
                try {
                    if (d == null) {
                        d = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public a b(Context context, String str, int i2, int i3) {
        if (context == null || TextUtils.isEmpty(str)) {
            return new com.smartdigimkt.j8.a();
        }
        if (context instanceof Activity) {
            context = context.getApplicationContext();
        }
        a aVar = this.f35544a.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a(context, str, i2, i3);
        this.f35544a.put(str, aVarA);
        return aVarA;
    }

    public a a(Context context, String str) {
        return a(context, str, 1);
    }

    public a a(Context context, String str, int i2) {
        return b(context, str, i2, 1);
    }

    public boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith("PL_SY_COLD_START") || str.endsWith("PL_SY");
    }

    private a a(Context context, String str, int i2, int i3) {
        return com.smartdigimkt.j8.c.b(new d.b().a(context).a(str).b(i2).a(i3).a());
    }

    public boolean a(String str) {
        return !b(str);
    }
}
