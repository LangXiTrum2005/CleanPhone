package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class q5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f9097g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(v.a aVar);
    }

    public q5(com.applovin.impl.sdk.l lVar, a aVar) {
        super("TaskCollectAdvertisingId", lVar, true);
        this.f9097g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9097g.a(this.f8297a.B().f());
    }
}
