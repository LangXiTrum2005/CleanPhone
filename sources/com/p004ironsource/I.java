package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class I implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ cw f24197Y;

    public /* synthetic */ I(cw cwVar, int i2) {
        this.X = i2;
        this.f24197Y = cwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                cw.b(this.f24197Y);
                break;
            default:
                cw.a(this.f24197Y);
                break;
        }
    }
}
