package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class hd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ od f41052a;

    public hd(od odVar) {
        this.f41052a = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f41052a.f41312c.a()).execute(this.f41052a.v);
    }
}
