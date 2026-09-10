package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class X implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ od f24224Y;

    public /* synthetic */ X(od odVar, int i2) {
        this.X = i2;
        this.f24224Y = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                od.b(this.f24224Y);
                break;
            case 1:
                od.c(this.f24224Y);
                break;
            default:
                od.a(this.f24224Y);
                break;
        }
    }
}
