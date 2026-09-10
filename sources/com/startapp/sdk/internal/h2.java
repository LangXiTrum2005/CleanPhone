package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f41029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f41030b;

    public h2(i2 i2Var, Bitmap bitmap) {
        this.f41030b = i2Var;
        this.f41029a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k2 k2Var = this.f41030b.f41081a;
        k2Var.d.a(this.f41029a, k2Var.f41173e);
    }
}
