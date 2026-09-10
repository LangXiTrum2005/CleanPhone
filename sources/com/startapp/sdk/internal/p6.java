package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class p6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f41348b;

    public p6(Context context, j jVar) {
        this.f41347a = context;
        this.f41348b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new com.startapp.sdk.adsbase.cache.a(this, g7.d(this.f41347a, "startapp_ads".concat(File.separator).concat("keys"))));
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
