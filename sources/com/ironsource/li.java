package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class li implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0481nb f29188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29189c;

    public /* synthetic */ li(C0481nb c0481nb, boolean z10, int i10) {
        this.f29187a = i10;
        this.f29188b = c0481nb;
        this.f29189c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29187a) {
            case 0:
                C0481nb.a(this.f29188b, this.f29189c);
                break;
            default:
                C0481nb.b(this.f29188b, this.f29189c);
                break;
        }
    }
}
