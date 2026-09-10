package com.mbridge.msdk.config.component.info.provider.subprovider;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ e f28821Y;

    public /* synthetic */ g(e eVar, int i2) {
        this.X = i2;
        this.f28821Y = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                this.f28821Y.d();
                break;
            default:
                this.f28821Y.a();
                break;
        }
    }
}
