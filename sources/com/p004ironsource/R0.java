package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class R0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AbstractC3389z f24218Y;

    public /* synthetic */ R0(AbstractC3389z abstractC3389z, int i2) {
        this.X = i2;
        this.f24218Y = abstractC3389z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AbstractC3389z.b(this.f24218Y);
                break;
            case 1:
                AbstractC3389z.c(this.f24218Y);
                break;
            case 2:
                AbstractC3389z.d(this.f24218Y);
                break;
            default:
                AbstractC3389z.e(this.f24218Y);
                break;
        }
    }
}
