package com.applovin.impl.mediation.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewImpl f8556b;

    public /* synthetic */ c(MaxAdViewImpl maxAdViewImpl, int i10) {
        this.f8555a = i10;
        this.f8556b = maxAdViewImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8555a;
        MaxAdViewImpl maxAdViewImpl = this.f8556b;
        switch (i10) {
            case 0:
                maxAdViewImpl.g();
                break;
            default:
                maxAdViewImpl.c();
                break;
        }
    }
}
