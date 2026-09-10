package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcoz implements zzijg {
    private final zzijp zza;

    private zzcoz(zzcoq zzcoqVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzcoz zzc(zzcoq zzcoqVar, zzijp zzijpVar) {
        return new zzcoz(zzcoqVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfjg zzb() {
        zzfjg zzfjgVarZza = zzfjg.zza(((zzclp) this.zza).zza());
        zzijo.zzb(zzfjgVarZza);
        return zzfjgVarZza;
    }
}
