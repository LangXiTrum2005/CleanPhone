package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s51 implements d81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u51 f19857b;

    public /* synthetic */ s51(u51 u51Var, int i10) {
        this.f19856a = i10;
        this.f19857b = u51Var;
    }

    @Override // com.google.android.gms.internal.ads.d81
    public final Object apply(Object obj) {
        int i10 = this.f19856a;
        byte[] bArr = (byte[]) obj;
        u51 u51Var = this.f19857b;
        u51Var.getClass();
        switch (i10) {
            case 0:
                u51Var.f(new bc.i(1), bArr, false);
                break;
            default:
                u51Var.f(new bc.i(1), bArr, true);
                break;
        }
        return null;
    }
}
