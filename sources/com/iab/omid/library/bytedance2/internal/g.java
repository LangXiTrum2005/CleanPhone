package com.iab.omid.library.bytedance2.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f21756b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21757a;

    private g() {
    }

    public static g b() {
        return f21756b;
    }

    public Context a() {
        return this.f21757a;
    }

    public void a(Context context) {
        this.f21757a = context != null ? context.getApplicationContext() : null;
    }
}
