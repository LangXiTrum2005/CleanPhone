package com.umeng.commonsdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    private static b b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2646a;
    private c c;

    private b(Context context) {
        this.f2646a = context;
        this.c = new c(context);
    }

    public static synchronized b a(Context context) {
        try {
            if (b == null) {
                b = new b(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public c a() {
        return this.c;
    }
}
