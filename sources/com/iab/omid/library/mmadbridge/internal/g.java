package com.iab.omid.library.mmadbridge.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f25385b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25386a;

    private g() {
    }

    public static g b() {
        return f25385b;
    }

    public Context a() {
        return this.f25386a;
    }

    public void a(Context context) {
        this.f25386a = context != null ? context.getApplicationContext() : null;
    }
}
