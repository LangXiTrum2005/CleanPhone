package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public abstract class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f41698b;
    public final Runnable d = new C(this, 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f41699c = new Handler(Looper.getMainLooper());

    public y1(Context context, zd zdVar) {
        this.f41697a = context;
        this.f41698b = new x1(this, zdVar);
    }

    public abstract void a();
}
