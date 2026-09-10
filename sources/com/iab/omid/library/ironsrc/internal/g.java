package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f25251b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25252a;

    private g() {
    }

    public static g b() {
        return f25251b;
    }

    public Context a() {
        return this.f25252a;
    }

    public void a(Context context) {
        this.f25252a = context != null ? context.getApplicationContext() : null;
    }
}
