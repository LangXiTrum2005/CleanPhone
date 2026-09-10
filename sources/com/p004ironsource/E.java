package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class E implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ps f24189Y;

    public /* synthetic */ E(ps psVar, int i2) {
        this.X = i2;
        this.f24189Y = psVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                bt.c(this.f24189Y);
                break;
            default:
                bt.b.b(this.f24189Y);
                break;
        }
    }
}
