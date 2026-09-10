package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczu implements zzijg {
    private final zzczt zza;
    private final zzijp zzb;

    private zzczu(zzczt zzcztVar, zzijp zzijpVar) {
        this.zza = zzcztVar;
        this.zzb = zzijpVar;
    }

    public static zzczu zza(zzczt zzcztVar, zzijp zzijpVar) {
        return new zzczu(zzcztVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return this.zza.zzg((String) this.zzb.zzb());
    }
}
