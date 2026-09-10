package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.adview.g f8920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f8921c;

    public /* synthetic */ oa(com.applovin.impl.adview.g gVar, Runnable runnable, int i10) {
        this.f8919a = i10;
        this.f8920b = gVar;
        this.f8921c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8919a) {
            case 0:
                y1.b(this.f8920b, this.f8921c);
                break;
            case 1:
                y1.a(this.f8920b, this.f8921c);
                break;
            default:
                y1.c(this.f8920b, this.f8921c);
                break;
        }
    }
}
