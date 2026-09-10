package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Aa f29074b;

    public /* synthetic */ kh(Aa aa2, int i10) {
        this.f29073a = i10;
        this.f29074b = aa2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29073a;
        Aa aa2 = this.f29074b;
        switch (i10) {
            case 0:
                Aa.b(aa2);
                break;
            case 1:
                Aa.a(aa2);
                break;
            default:
                Aa.c(aa2);
                break;
        }
    }
}
