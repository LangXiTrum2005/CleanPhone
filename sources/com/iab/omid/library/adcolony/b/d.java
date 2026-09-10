package com.iab.omid.library.adcolony.b;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f21468a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f21469b;

    private d() {
    }

    public static d a() {
        return f21468a;
    }

    public Context b() {
        return this.f21469b;
    }

    public void a(Context context) {
        this.f21469b = context != null ? context.getApplicationContext() : null;
    }
}
