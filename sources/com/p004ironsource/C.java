package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ts f24185Y;
    public final /* synthetic */ ps Z;

    public /* synthetic */ C(ts tsVar, ps psVar, int i2) {
        this.X = i2;
        this.f24185Y = tsVar;
        this.Z = psVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                bt.b(this.f24185Y, this.Z);
                break;
            default:
                ct.a.a(this.f24185Y, this.Z);
                break;
        }
    }
}
