package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class A implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ a7 f24181Y;

    public /* synthetic */ A(a7 a7Var, int i2) {
        this.X = i2;
        this.f24181Y = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                a7.a.a(this.f24181Y);
                break;
            default:
                a7.b.a(this.f24181Y);
                break;
        }
    }
}
