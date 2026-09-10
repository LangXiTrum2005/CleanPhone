package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class O0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ x5 f24213Y;

    public /* synthetic */ O0(x5 x5Var, int i2) {
        this.X = i2;
        this.f24213Y = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                x5.a(this.f24213Y);
                break;
            case 1:
                x5.e(this.f24213Y);
                break;
            case 2:
                x5.c(this.f24213Y);
                break;
            case 3:
                x5.b(this.f24213Y);
                break;
            default:
                x5.d(this.f24213Y);
                break;
        }
    }
}
