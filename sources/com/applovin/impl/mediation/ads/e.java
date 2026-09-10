package com.applovin.impl.mediation.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl f8561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8562c;

    public /* synthetic */ e(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, int i10) {
        this.f8560a = i10;
        this.f8561b = maxFullscreenAdImpl;
        this.f8562c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8560a) {
            case 0:
                this.f8561b.c(this.f8562c);
                break;
            case 1:
                this.f8561b.a(this.f8562c);
                break;
            default:
                this.f8561b.b(this.f8562c);
                break;
        }
    }
}
