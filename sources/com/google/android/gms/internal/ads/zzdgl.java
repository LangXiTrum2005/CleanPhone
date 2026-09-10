package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdgl implements zzijg {
    private final zzdgk zza;
    private final zzijp zzb;

    private zzdgl(zzdgk zzdgkVar, zzijp zzijpVar) {
        this.zza = zzdgkVar;
        this.zzb = zzijpVar;
    }

    public static zzdgl zza(zzdgk zzdgkVar, zzijp zzijpVar) {
        return new zzdgl(zzdgkVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdam zzdamVarZzp = this.zza.zzp(((zzijs) this.zzb).zzb());
        zzijo.zzb(zzdamVarZzp);
        return zzdamVarZzp;
    }
}
