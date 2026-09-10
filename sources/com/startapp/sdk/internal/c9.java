package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
public final class c9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40864c;
    public final /* synthetic */ d9 d;

    public c9(d9 d9Var, int i2, String str, String str2) {
        this.d = d9Var;
        this.f40862a = i2;
        this.f40863b = str;
        this.f40864c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f40864c;
        Bitmap bitmapB = str != null ? l2.b(str) : null;
        ((m8) this.d.f40902b.a()).f41243a.post(new b9(this, bitmapB));
    }
}
