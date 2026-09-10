package com.iab.omid.library.toponad.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f22353b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22354a;

    private g() {
    }

    public static g b() {
        return f22353b;
    }

    public Context a() {
        return this.f22354a;
    }

    public void a(Context context) {
        this.f22354a = context != null ? context.getApplicationContext() : null;
    }
}
