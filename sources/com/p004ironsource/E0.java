package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class E0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ qm f24190Y;

    public /* synthetic */ E0(qm qmVar, int i2) {
        this.X = i2;
        this.f24190Y = qmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                qm.a(this.f24190Y);
                break;
            default:
                qm.b(this.f24190Y);
                break;
        }
    }
}
