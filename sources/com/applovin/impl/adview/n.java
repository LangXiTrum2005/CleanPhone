package com.applovin.impl.adview;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f7519b;

    public /* synthetic */ n(a aVar, int i10) {
        this.f7518a = i10;
        this.f7519b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7518a;
        a aVar = this.f7519b;
        switch (i10) {
            case 0:
                aVar.s();
                break;
            case 1:
                aVar.p();
                break;
            case 2:
                aVar.r();
                break;
            case 3:
                aVar.q();
                break;
            case 4:
                aVar.t();
                break;
            default:
                aVar.o();
                break;
        }
    }
}
