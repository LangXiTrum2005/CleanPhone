package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class F0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ uk f24192Y;

    public /* synthetic */ F0(uk ukVar, int i2) {
        this.X = i2;
        this.f24192Y = ukVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                t3.c(this.f24192Y);
                break;
            default:
                t3.d(this.f24192Y);
                break;
        }
    }
}
