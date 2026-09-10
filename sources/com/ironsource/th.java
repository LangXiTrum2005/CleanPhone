package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class th implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ga f30737b;

    public /* synthetic */ th(Ga ga2, int i10) {
        this.f30736a = i10;
        this.f30737b = ga2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30736a;
        Ga ga2 = this.f30737b;
        switch (i10) {
            case 0:
                Ga.d(ga2);
                break;
            default:
                Ga.c(ga2);
                break;
        }
    }
}
