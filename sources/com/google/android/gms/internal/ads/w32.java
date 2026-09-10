package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w32 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f21400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ni f21401b;

    public w32(p pVar, ni niVar) {
        this.f21400a = pVar;
        this.f21401b = niVar;
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w32) {
            return this.f21400a.equals(((w32) obj).f21400a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (a(obj) && (obj instanceof w32)) {
            return this.f21401b.equals(((w32) obj).f21401b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.p
    public final int g(int i10) {
        return this.f21400a.g(i10);
    }

    public final int hashCode() {
        return this.f21401b.hashCode() + (this.f21400a.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.p
    public final ni zza() {
        return this.f21401b;
    }

    @Override // com.google.android.gms.internal.ads.p
    public final g22 zzb(int i10) {
        return this.f21401b.f17832d[this.f21400a.zzf(i10)];
    }

    @Override // com.google.android.gms.internal.ads.p
    public final g22 zzc() {
        return this.f21401b.f17832d[this.f21400a.zzh()];
    }

    @Override // com.google.android.gms.internal.ads.p
    public final int zze() {
        return this.f21400a.zze();
    }

    @Override // com.google.android.gms.internal.ads.p
    public final int zzf(int i10) {
        return this.f21400a.zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.p
    public final int zzh() {
        return this.f21400a.zzh();
    }
}
