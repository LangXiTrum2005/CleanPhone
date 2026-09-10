package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0591te f30120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0484ne f30121c;

    public /* synthetic */ qh(C0484ne c0484ne, InterfaceC0591te interfaceC0591te) {
        this.f30119a = 2;
        this.f30121c = c0484ne;
        this.f30120b = interfaceC0591te;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30119a) {
            case 0:
                Be.b(this.f30120b, this.f30121c);
                break;
            case 1:
                Ce.a(this.f30120b, this.f30121c);
                break;
            default:
                Ce.a.a(this.f30121c, this.f30120b);
                break;
        }
    }

    public /* synthetic */ qh(InterfaceC0591te interfaceC0591te, C0484ne c0484ne, int i10) {
        this.f30119a = i10;
        this.f30120b = interfaceC0591te;
        this.f30121c = c0484ne;
    }
}
