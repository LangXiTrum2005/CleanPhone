package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zh implements com.ironsource.sdk.controller.l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31364b;

    public /* synthetic */ zh(Object obj, int i10) {
        this.f31363a = i10;
        this.f31364b = obj;
    }

    @Override // com.ironsource.sdk.controller.l.a
    public final void a(com.ironsource.sdk.controller.f.a aVar) {
        int i10 = this.f31363a;
        Object obj = this.f31364b;
        switch (i10) {
            case 0:
                Tb.b((Tb) obj, aVar);
                break;
            case 1:
                Tb.a((Tb) obj, aVar);
                break;
            default:
                ((com.ironsource.sdk.controller.e) obj).a(aVar);
                break;
        }
    }
}
