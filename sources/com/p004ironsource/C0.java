package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ pr f24186Y;

    public /* synthetic */ C0(pr prVar, int i2) {
        this.X = i2;
        this.f24186Y = prVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                pr.b(this.f24186Y);
                break;
            case 1:
                pr.c(this.f24186Y);
                break;
            case 2:
                pr.d(this.f24186Y);
                break;
            case 3:
                pr.e(this.f24186Y);
                break;
            default:
                pr.a(this.f24186Y);
                break;
        }
    }
}
