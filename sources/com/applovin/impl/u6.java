package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class u6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f9845g;

    public u6(com.applovin.impl.sdk.l lVar, String str, Runnable runnable) {
        this(lVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9845g.run();
    }

    public u6(com.applovin.impl.sdk.l lVar, boolean z10, String str, Runnable runnable) {
        super(defpackage.e.n("TaskRunnable:", str), lVar, z10);
        this.f9845g = runnable;
    }
}
