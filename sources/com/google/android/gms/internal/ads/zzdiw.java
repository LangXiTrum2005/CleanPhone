package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdiw implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdiw(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdiw zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdiw(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdiv(((zzcwb) this.zza).zza(), (zzfpi) this.zzb.zzb());
    }
}
