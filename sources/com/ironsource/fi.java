package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ya f28729b;

    public /* synthetic */ fi(Ya ya2, int i10) {
        this.f28728a = i10;
        this.f28729b = ya2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f28728a;
        Ya ya2 = this.f28729b;
        switch (i10) {
            case 0:
                Ya.d(ya2);
                break;
            case 1:
                Ya.b(ya2);
                break;
            case 2:
                Ya.c(ya2);
                break;
            case 3:
                Ya.f(ya2);
                break;
            default:
                Ya.e(ya2);
                break;
        }
    }
}
