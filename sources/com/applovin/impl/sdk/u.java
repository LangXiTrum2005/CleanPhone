package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ d f11885Y;

    public /* synthetic */ u(d dVar, int i2) {
        this.X = i2;
        this.f11885Y = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                this.f11885Y.c();
                break;
            default:
                this.f11885Y.d();
                break;
        }
    }
}
