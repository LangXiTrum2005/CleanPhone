package com.iab.omid.library.bigosg.b;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f21661a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f21662b;

    private d() {
    }

    public static d a() {
        return f21661a;
    }

    public Context b() {
        return this.f21662b;
    }

    public void a(Context context) {
        this.f21662b = context != null ? context.getApplicationContext() : null;
    }
}
