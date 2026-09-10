package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ci implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wd f28406b;

    public /* synthetic */ ci(Wd wd2, int i10) {
        this.f28405a = i10;
        this.f28406b = wd2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f28405a;
        Wd wd2 = this.f28406b;
        switch (i10) {
            case 0:
                Wd.d(wd2);
                break;
            case 1:
                Wd.b(wd2);
                break;
            case 2:
                Wd.e(wd2);
                break;
            case 3:
                Wd.c(wd2);
                break;
            default:
                Wd.a(wd2);
                break;
        }
    }
}
