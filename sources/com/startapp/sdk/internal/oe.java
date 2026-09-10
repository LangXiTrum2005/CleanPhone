package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class oe implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ re f41321b;

    public oe(re reVar, int i2) {
        this.f41321b = reVar;
        this.f41320a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yj yjVar = this.f41321b.f41446b;
        if (yjVar != null) {
            yjVar.a(this.f41320a);
        }
    }
}
