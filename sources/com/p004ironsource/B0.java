package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class B0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ p6 f24184Y;

    public /* synthetic */ B0(p6 p6Var, int i2) {
        this.X = i2;
        this.f24184Y = p6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                p6.c(this.f24184Y);
                break;
            case 1:
                p6.a(this.f24184Y);
                break;
            default:
                p6.b(this.f24184Y);
                break;
        }
    }
}
