package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class S implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ kw f24219Y;
    public final /* synthetic */ iq Z;

    public /* synthetic */ S(kw kwVar, iq iqVar, int i2) {
        this.X = i2;
        this.f24219Y = kwVar;
        this.Z = iqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                kw.b(this.f24219Y, this.Z);
                break;
            default:
                kw.a(this.f24219Y, this.Z);
                break;
        }
    }
}
