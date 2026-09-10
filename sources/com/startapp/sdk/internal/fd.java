package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class fd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ od f40969a;

    public fd(od odVar) {
        this.f40969a = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f40969a.f41312c.a()).execute(this.f40969a.t);
    }
}
