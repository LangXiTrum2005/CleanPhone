package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public final class i2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k2 f41081a;

    public i2(k2 k2Var) {
        this.f41081a = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmapB;
        k2 k2Var = this.f41081a;
        if (k2Var.f41171b) {
            bitmapB = l2.a(k2Var.f41170a, k2Var.f41172c);
        } else {
            bitmapB = l2.b(k2Var.f41172c);
        }
        new Handler(Looper.getMainLooper()).post(new h2(this, bitmapB));
    }
}
