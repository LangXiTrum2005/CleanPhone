package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class P0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ xm f24215Y;
    public final /* synthetic */ Runnable Z;

    public /* synthetic */ P0(xm xmVar, Runnable runnable, int i2) {
        this.X = i2;
        this.f24215Y = xmVar;
        this.Z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                xm.a(this.f24215Y, this.Z);
                break;
            default:
                xm.b(this.f24215Y, this.Z);
                break;
        }
    }
}
