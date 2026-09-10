package com.applovin.impl.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f9714b;

    public /* synthetic */ w(e eVar, int i10) {
        this.f9713a = i10;
        this.f9714b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9713a;
        e eVar = this.f9714b;
        switch (i10) {
            case 0:
                eVar.d();
                break;
            default:
                eVar.c();
                break;
        }
    }
}
