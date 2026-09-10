package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s42 implements o42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o42 f19837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19838b;

    public s42(o42 o42Var, long j10) {
        this.f19837a = o42Var;
        this.f19838b = j10;
    }

    @Override // com.google.android.gms.internal.ads.o42
    public final int a(long j10) {
        return this.f19837a.a(j10 - this.f19838b);
    }

    @Override // com.google.android.gms.internal.ads.o42
    public final int b(f81 f81Var, tx1 tx1Var, int i10) {
        int iB = this.f19837a.b(f81Var, tx1Var, i10);
        if (iB != -4) {
            return iB;
        }
        tx1Var.f20524f += this.f19838b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.o42
    public final boolean zza() {
        return this.f19837a.zza();
    }

    @Override // com.google.android.gms.internal.ads.o42
    public final void zzb() {
        this.f19837a.zzb();
    }
}
