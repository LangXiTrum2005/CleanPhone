package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeam implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzeam(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzeam zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzeam(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeaf((zzdzp) this.zza.zzb(), (zzdur) this.zzb.zzb());
    }
}
