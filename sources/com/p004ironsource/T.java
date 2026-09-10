package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class T implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ kw f24220Y;

    public /* synthetic */ T(kw kwVar, int i2) {
        this.X = i2;
        this.f24220Y = kwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                kw.a(this.f24220Y);
                break;
            default:
                kw.b(this.f24220Y);
                break;
        }
    }
}
