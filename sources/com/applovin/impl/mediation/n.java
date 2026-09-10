package com.applovin.impl.mediation;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.mediation.ads.a.InterfaceC0010a f8768d;

    public /* synthetic */ n(com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a, int i10, String str, int i11) {
        this.f8765a = i11;
        this.f8768d = interfaceC0010a;
        this.f8766b = i10;
        this.f8767c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8765a) {
            case 0:
                ((d.b) this.f8768d).a(this.f8766b, this.f8767c);
                break;
            default:
                ((e.b) this.f8768d).a(this.f8766b, this.f8767c);
                break;
        }
    }
}
