package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0404j6 f28831b;

    public /* synthetic */ hi(C0404j6 c0404j6, int i10) {
        this.f28830a = i10;
        this.f28831b = c0404j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f28830a;
        C0404j6 c0404j6 = this.f28831b;
        switch (i10) {
            case 0:
                C0404j6.a(c0404j6);
                break;
            case 1:
                C0404j6.c(c0404j6);
                break;
            case 2:
                C0404j6.b(c0404j6);
                break;
            case 3:
                C0404j6.d(c0404j6);
                break;
            case 4:
                C0404j6.f(c0404j6);
                break;
            default:
                C0404j6.e(c0404j6);
                break;
        }
    }
}
