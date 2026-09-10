package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeao implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzeao(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzeao zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzeao(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeav(((zzclp) this.zza).zza(), ((zzcmg) this.zzb).zza());
    }
}
