package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class M implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ hm f24204Y;

    public /* synthetic */ M(hm hmVar, int i2) {
        this.X = i2;
        this.f24204Y = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                hm.c(this.f24204Y);
                break;
            case 1:
                hm.e(this.f24204Y);
                break;
            case 2:
                hm.b(this.f24204Y);
                break;
            case 3:
                hm.f(this.f24204Y);
                break;
            default:
                hm.d(this.f24204Y);
                break;
        }
    }
}
