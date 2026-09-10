package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u32 implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iw0 f20612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j32 f20613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o32 f20614d;

    public /* synthetic */ u32(iw0 iw0Var, j32 j32Var, o32 o32Var, int i10) {
        this.f20611a = i10;
        this.f20612b = iw0Var;
        this.f20613c = j32Var;
        this.f20614d = o32Var;
    }

    @Override // com.google.android.gms.internal.ads.ag0, com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza */
    public final /* synthetic */ void mo161zza(Object obj) {
        switch (this.f20611a) {
            case 0:
                ((v32) obj).a(0, (r32) this.f20612b.f15864b, this.f20613c, this.f20614d);
                break;
            default:
                ((v32) obj).b(0, (r32) this.f20612b.f15864b, this.f20613c, this.f20614d);
                break;
        }
    }
}
