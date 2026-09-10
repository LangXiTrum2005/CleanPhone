package com.applovin.impl.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f9720b;

    public /* synthetic */ z(int i10, l lVar) {
        this.f9719a = i10;
        this.f9720b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9719a;
        l lVar = this.f9720b;
        switch (i10) {
            case 0:
                lVar.M0();
                break;
            case 1:
                lVar.N0();
                break;
            case 2:
                lVar.K0();
                break;
            default:
                lVar.L0();
                break;
        }
    }
}
