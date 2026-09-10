package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class I0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ u2 f24198Y;
    public final /* synthetic */ long Z;

    public /* synthetic */ I0(u2 u2Var, long j, int i2) {
        this.X = i2;
        this.f24198Y = u2Var;
        this.Z = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                w6.a.a(this.f24198Y, this.Z);
                break;
            case 1:
                w6.a.b(this.f24198Y, this.Z);
                break;
            case 2:
                w6.a.c(this.f24198Y, this.Z);
                break;
            default:
                w6.a.d(this.f24198Y, this.Z);
                break;
        }
    }
}
