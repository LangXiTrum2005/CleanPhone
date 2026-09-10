package com.applovin.impl.mediation;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ h.b f11309Y;
    public final /* synthetic */ Bundle Z;

    public /* synthetic */ r(h.b bVar, Bundle bundle, int i2) {
        this.X = i2;
        this.f11309Y = bVar;
        this.Z = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                this.f11309Y.j(this.Z);
                break;
            case 1:
                this.f11309Y.e(this.Z);
                break;
            case 2:
                this.f11309Y.i(this.Z);
                break;
            case 3:
                this.f11309Y.a(this.Z);
                break;
            case 4:
                this.f11309Y.f(this.Z);
                break;
            case 5:
                this.f11309Y.g(this.Z);
                break;
            case 6:
                this.f11309Y.h(this.Z);
                break;
            case 7:
                this.f11309Y.d(this.Z);
                break;
            case 8:
                this.f11309Y.c(this.Z);
                break;
            default:
                this.f11309Y.b(this.Z);
                break;
        }
    }
}
