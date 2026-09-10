package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ai implements com.ironsource.sdk.controller.l.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28236b;

    public /* synthetic */ ai(Object obj, int i10) {
        this.f28235a = i10;
        this.f28236b = obj;
    }

    @Override // com.ironsource.sdk.controller.l.b
    public final void a(Nb nb2) {
        int i10 = this.f28235a;
        Object obj = this.f28236b;
        switch (i10) {
            case 0:
                Tb.a((Tb) obj, nb2);
                break;
            default:
                ((com.ironsource.sdk.controller.e) obj).a(nb2);
                break;
        }
    }
}
