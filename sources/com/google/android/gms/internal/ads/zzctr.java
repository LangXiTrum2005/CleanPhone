package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctr implements zzijg {
    private final zzijp zza;

    private zzctr(zzctj zzctjVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzctr zza(zzctj zzctjVar, zzijp zzijpVar) {
        return new zzctr(zzctjVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgtn zzgtnVarZzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznW)).booleanValue() ? zzgtn.zzi(new zzdij(((zzcuv) this.zza).zzb(), zzcdo.zza)) : zzgtn.zzh();
        zzijo.zzb(zzgtnVarZzi);
        return zzgtnVarZzi;
    }
}
