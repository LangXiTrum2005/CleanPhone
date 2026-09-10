package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class B implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ts f24183Y;
    public final /* synthetic */ ns Z;

    public /* synthetic */ B(ns nsVar, ts tsVar) {
        this.X = 2;
        this.Z = nsVar;
        this.f24183Y = tsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                bt.b(this.f24183Y, this.Z);
                break;
            case 1:
                ct.a(this.f24183Y, this.Z);
                break;
            default:
                ct.a.a(this.Z, this.f24183Y);
                break;
        }
    }

    public /* synthetic */ B(ts tsVar, ns nsVar, int i2) {
        this.X = i2;
        this.f24183Y = tsVar;
        this.Z = nsVar;
    }
}
