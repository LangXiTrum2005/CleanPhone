package com.startapp.sdk.internal;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class bi implements bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f40839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f40840b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f40841c = Executors.newScheduledThreadPool(1, new v5("scheduler"));

    public bi(Context context) {
        this.f40839a = new WeakReference(context);
    }

    @Override // com.startapp.sdk.internal.bg
    public final boolean a(ge geVar, long j) {
        Context context = (Context) this.f40839a.get();
        if (context == null) {
            return false;
        }
        return new zh(this, geVar, j).a(context, geVar.f41011a, new ai(), null);
    }

    @Override // com.startapp.sdk.internal.bg
    public final synchronized boolean a(int i2) {
        Future future = (Future) this.f40840b.get(Integer.valueOf(i2));
        if (future == null) {
            return false;
        }
        this.f40840b.remove(Integer.valueOf(i2));
        return future.cancel(true);
    }
}
