package com.chartboost.heliumsdk;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Ilrd f13358Y;
    public final /* synthetic */ HeliumIlrdObserver Z;

    public /* synthetic */ a(Ilrd ilrd, HeliumIlrdObserver heliumIlrdObserver, int i2) {
        this.X = i2;
        this.f13358Y = ilrd;
        this.Z = heliumIlrdObserver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                Ilrd.subscribe$lambda$0(this.f13358Y, this.Z);
                break;
            default:
                Ilrd.unsubscribe$lambda$1(this.f13358Y, this.Z);
                break;
        }
    }
}
