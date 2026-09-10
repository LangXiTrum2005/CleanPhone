package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class o6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f41295b;

    public o6(Context context, k kVar) {
        this.f41294a = context;
        this.f41295b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f41294a;
            g7.a(new File(g7.b(context, "startapp_ads")));
            g7.a(new File(g7.a(context, "startapp_ads")));
            new Handler(Looper.getMainLooper()).post(new n6(this));
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
