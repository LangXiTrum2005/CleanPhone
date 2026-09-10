package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgly implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzgly(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzgly zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzgly(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzglx((zzgmo) this.zza.zzb(), ((zzijs) this.zzb).zzb());
    }
}
