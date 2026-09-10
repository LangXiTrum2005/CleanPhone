package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i21 implements kx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15532b;

    public /* synthetic */ i21(Object obj, int i10) {
        this.f15531a = i10;
        this.f15532b = obj;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* synthetic */ Object zzb() {
        int i10 = this.f15531a;
        Object obj = this.f15532b;
        switch (i10) {
            case 0:
                return new at0((ac0) ((ac0) obj).f11977a, 6);
            case 1:
                return new x11((ac0) ((ac0) obj).f11977a, 29);
            case 2:
                return new wv0((ac0) ((ac0) obj).f11977a, 3);
            default:
                hz hzVar = (hz) obj;
                ac0 ac0Var = (ac0) hzVar.f15433b;
                hz hzVar2 = (hz) hzVar.f15436e;
                com.google.android.gms.internal.consent_sdk.d dVar = new com.google.android.gms.internal.consent_sdk.d();
                dVar.f22981a = ac0Var;
                dVar.f22982b = hzVar2;
                return dVar;
        }
    }
}
