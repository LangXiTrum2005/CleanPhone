package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class fc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f40967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gc f40968b;

    public fc(gc gcVar, Runnable runnable) {
        this.f40968b = gcVar;
        this.f40967a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40968b.a(this.f40967a);
        synchronized (this.f40968b) {
            this.f40968b.f41008c = null;
        }
    }
}
