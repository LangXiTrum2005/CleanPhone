package com.iab.omid.library.chartboost.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f21856b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21857a;

    private g() {
    }

    public static g b() {
        return f21856b;
    }

    public Context a() {
        return this.f21857a;
    }

    public void a(Context context) {
        this.f21857a = context != null ? context.getApplicationContext() : null;
    }
}
