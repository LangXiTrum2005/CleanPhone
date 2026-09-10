package com.ironsource.sdk.controller;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v.s f30288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30289c;

    public /* synthetic */ a0(v.s sVar, String str, int i10) {
        this.f30287a = i10;
        this.f30288b = sVar;
        this.f30289c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30287a) {
            case 0:
                this.f30288b.m(this.f30289c);
                break;
            case 1:
                this.f30288b.j(this.f30289c);
                break;
            case 2:
                this.f30288b.s(this.f30289c);
                break;
            case 3:
                this.f30288b.q(this.f30289c);
                break;
            case 4:
                this.f30288b.k(this.f30289c);
                break;
            case 5:
                this.f30288b.o(this.f30289c);
                break;
            case 6:
                this.f30288b.n(this.f30289c);
                break;
            case 7:
                this.f30288b.r(this.f30289c);
                break;
            case 8:
                this.f30288b.l(this.f30289c);
                break;
            default:
                this.f30288b.p(this.f30289c);
                break;
        }
    }
}
