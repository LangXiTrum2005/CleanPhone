package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class ng implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f41276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ og f41277b;

    public ng(og ogVar, Runnable runnable) {
        this.f41277b = ogVar;
        this.f41276a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f41276a.run();
        } finally {
            this.f41277b.a();
        }
    }
}
