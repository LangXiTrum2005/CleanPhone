package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class qf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf f41407a;

    public qf(sf sfVar) {
        this.f41407a = sfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f41407a.b();
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
