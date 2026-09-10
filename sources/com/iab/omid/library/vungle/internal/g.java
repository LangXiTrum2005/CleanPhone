package com.iab.omid.library.vungle.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f22552b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22553a;

    private g() {
    }

    public static g b() {
        return f22552b;
    }

    public Context a() {
        return this.f22553a;
    }

    public void a(Context context) {
        this.f22553a = context != null ? context.getApplicationContext() : null;
    }
}
