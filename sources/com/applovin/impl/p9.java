package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.l f8986b;

    public /* synthetic */ p9(int i10, com.applovin.impl.sdk.l lVar) {
        this.f8985a = i10;
        this.f8986b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8985a;
        com.applovin.impl.sdk.l lVar = this.f8986b;
        switch (i10) {
            case 0:
                m2.a(lVar);
                break;
            default:
                o8.d(lVar);
                break;
        }
    }
}
