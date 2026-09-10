package com.iab.omid.library.inmobi.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f21957b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21958a;

    private g() {
    }

    public static g b() {
        return f21957b;
    }

    public Context a() {
        return this.f21958a;
    }

    public void a(Context context) {
        this.f21958a = context != null ? context.getApplicationContext() : null;
    }
}
