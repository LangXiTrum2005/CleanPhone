package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B2 f29945b;

    public /* synthetic */ oh(B2 b10, int i10) {
        this.f29944a = i10;
        this.f29945b = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29944a;
        B2 b10 = this.f29945b;
        switch (i10) {
            case 0:
                B2.b(b10);
                break;
            case 1:
                B2.d(b10);
                break;
            case 2:
                B2.a(b10);
                break;
            case 3:
                B2.e(b10);
                break;
            default:
                B2.c(b10);
                break;
        }
    }
}
