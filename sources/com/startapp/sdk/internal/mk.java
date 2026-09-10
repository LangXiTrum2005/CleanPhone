package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class mk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ok f41259a;

    public mk(ok okVar, long j) {
        this.f41259a = okVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f41259a.f41330b.compareAndSet(false, true)) {
            ok okVar = this.f41259a;
            okVar.g.a(okVar.f41331c);
            ok okVar2 = this.f41259a;
            ti tiVar = okVar2.d;
            okVar2.f41332e.get();
            tiVar.a();
        }
    }
}
