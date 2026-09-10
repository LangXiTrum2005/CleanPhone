package com.iab.omid.library.startio.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f22257b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22258a;

    private g() {
    }

    public static g b() {
        return f22257b;
    }

    public Context a() {
        return this.f22258a;
    }

    public void a(Context context) {
        this.f22258a = context != null ? context.getApplicationContext() : null;
    }
}
