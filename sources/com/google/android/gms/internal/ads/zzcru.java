package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcru implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcru(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcru zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcru(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcrt(((zzclp) this.zza).zza(), (zzbch) this.zzb.zzb());
    }
}
