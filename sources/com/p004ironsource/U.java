package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class U implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ml f24221Y;

    public /* synthetic */ U(ml mlVar, int i2) {
        this.X = i2;
        this.f24221Y = mlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ml.d(this.f24221Y);
                break;
            case 1:
                ml.a(this.f24221Y);
                break;
            case 2:
                ml.c(this.f24221Y);
                break;
            case 3:
                ml.e(this.f24221Y);
                break;
            default:
                ml.b(this.f24221Y);
                break;
        }
    }
}
