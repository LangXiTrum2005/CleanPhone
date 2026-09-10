package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public final class qi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent[] f41411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f41412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41413c;

    public qi(Intent[] intentArr, Context context, String str) {
        this.f41411a = intentArr;
        this.f41412b = context;
        this.f41413c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41411a[0] = vi.a(this.f41412b, this.f41413c);
        synchronized (this.f41411a) {
            this.f41411a.notifyAll();
        }
    }
}
