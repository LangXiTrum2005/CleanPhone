package com.applovin.impl.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f9341b;

    public /* synthetic */ a0(m mVar, int i10) {
        this.f9340a = i10;
        this.f9341b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9340a;
        m mVar = this.f9341b;
        switch (i10) {
            case 0:
                mVar.U();
                break;
            case 1:
                mVar.W();
                break;
            default:
                mVar.V();
                break;
        }
    }
}
