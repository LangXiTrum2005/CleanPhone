package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class lf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf f41217a;

    public lf(sf sfVar) {
        this.f41217a = sfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f41217a.c();
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
