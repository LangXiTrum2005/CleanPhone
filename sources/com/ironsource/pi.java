package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0624vb f30034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f30035c;

    public /* synthetic */ pi(C0624vb c0624vb, Runnable runnable, int i10) {
        this.f30033a = i10;
        this.f30034b = c0624vb;
        this.f30035c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30033a) {
            case 0:
                C0624vb.a(this.f30034b, this.f30035c);
                break;
            default:
                C0624vb.b(this.f30034b, this.f30035c);
                break;
        }
    }
}
