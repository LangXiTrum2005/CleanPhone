package com.applovin.impl.mediation.ads;

import com.applovin.impl.e3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl f8564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f8565c;

    public /* synthetic */ f(MaxFullscreenAdImpl maxFullscreenAdImpl, e3 e3Var, int i10) {
        this.f8563a = i10;
        this.f8564b = maxFullscreenAdImpl;
        this.f8565c = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8563a) {
            case 0:
                this.f8564b.a(this.f8565c);
                break;
            default:
                this.f8564b.b(this.f8565c);
                break;
        }
    }
}
