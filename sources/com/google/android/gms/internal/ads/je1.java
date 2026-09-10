package com.google.android.gms.internal.ads;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class je1 extends tc1 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f16074h;

    public je1(Runnable runnable) {
        runnable.getClass();
        this.f16074h = runnable;
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final String f() {
        String string = this.f16074h.toString();
        return q4.a.j(new StringBuilder(string.length() + 7), "task=[", string, X3.j.f27836e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f16074h.run();
        } catch (Throwable th2) {
            d(th2);
            throw th2;
        }
    }
}
