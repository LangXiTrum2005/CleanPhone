package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdkn implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdkn(zzdjw zzdjwVar, zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdkn zzc(zzdjw zzdjwVar, zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdkn(zzdjwVar, zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcbt zzb() {
        return new zzcbt(((zzclp) this.zza).zza(), ((zzdab) this.zzb).zza().zzg);
    }
}
