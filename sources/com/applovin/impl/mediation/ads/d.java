package com.applovin.impl.mediation.ads;

import com.applovin.impl.d3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewImpl f8558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d3 f8559c;

    public /* synthetic */ d(MaxAdViewImpl maxAdViewImpl, d3 d3Var, int i10) {
        this.f8557a = i10;
        this.f8558b = maxAdViewImpl;
        this.f8559c = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8557a) {
            case 0:
                this.f8558b.b(this.f8559c);
                break;
            default:
                this.f8558b.a(this.f8559c);
                break;
        }
    }
}
