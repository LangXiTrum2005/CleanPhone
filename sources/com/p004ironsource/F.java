package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class F implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ bw f24191Y;

    public /* synthetic */ F(bw bwVar, int i2) {
        this.X = i2;
        this.f24191Y = bwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                bw.b(this.f24191Y);
                break;
            default:
                bw.a(this.f24191Y);
                break;
        }
    }
}
