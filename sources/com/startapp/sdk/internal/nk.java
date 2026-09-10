package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class nk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ok f41282b;

    public nk(ok okVar, String str) {
        this.f41282b = okVar;
        this.f41281a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f41282b.f41330b.compareAndSet(false, true)) {
            ok okVar = this.f41282b;
            okVar.g.a(okVar.f41331c);
            this.f41282b.d.a(String.valueOf(this.f41281a));
        }
    }
}
