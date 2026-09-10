package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class Q implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ jj f24216Y;

    public /* synthetic */ Q(jj jjVar, int i2) {
        this.X = i2;
        this.f24216Y = jjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                jj.d(this.f24216Y);
                break;
            case 1:
                jj.a(this.f24216Y);
                break;
            case 2:
                jj.b(this.f24216Y);
                break;
            default:
                jj.c(this.f24216Y);
                break;
        }
    }
}
