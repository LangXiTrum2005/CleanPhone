package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcrz implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcrz(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcrz zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzcrz(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbch zzbchVar = (zzbch) this.zza.zzb();
        return new zzcrs(zzbchVar.zzd(), (zzbso) this.zzb.zzb(), zzfli.zzc());
    }
}
