package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8373c;

    public /* synthetic */ l9(int i10, int i11, Object obj) {
        this.f8371a = i11;
        this.f8373c = obj;
        this.f8372b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8371a) {
            case 0:
                ((k2.b) this.f8373c).a(this.f8372b);
                break;
            default:
                ((p2) this.f8373c).a(this.f8372b);
                break;
        }
    }
}
