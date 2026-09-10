package com.applovin.impl.mediation.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl f8567b;

    public /* synthetic */ g(MaxFullscreenAdImpl maxFullscreenAdImpl, int i10) {
        this.f8566a = i10;
        this.f8567b = maxFullscreenAdImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8566a;
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8567b;
        switch (i10) {
            case 0:
                maxFullscreenAdImpl.c();
                break;
            default:
                maxFullscreenAdImpl.d();
                break;
        }
    }
}
