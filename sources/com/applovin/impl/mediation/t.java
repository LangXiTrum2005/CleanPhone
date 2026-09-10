package com.applovin.impl.mediation;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.b f8786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f8787c;

    public /* synthetic */ t(h.b bVar, Bundle bundle, int i10) {
        this.f8785a = i10;
        this.f8786b = bVar;
        this.f8787c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8785a) {
            case 0:
                this.f8786b.j(this.f8787c);
                break;
            case 1:
                this.f8786b.e(this.f8787c);
                break;
            case 2:
                this.f8786b.i(this.f8787c);
                break;
            case 3:
                this.f8786b.a(this.f8787c);
                break;
            case 4:
                this.f8786b.f(this.f8787c);
                break;
            case 5:
                this.f8786b.g(this.f8787c);
                break;
            case 6:
                this.f8786b.h(this.f8787c);
                break;
            case 7:
                this.f8786b.d(this.f8787c);
                break;
            case 8:
                this.f8786b.c(this.f8787c);
                break;
            default:
                this.f8786b.b(this.f8787c);
                break;
        }
    }
}
