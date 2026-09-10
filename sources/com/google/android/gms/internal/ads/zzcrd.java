package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcrd implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcrd(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcrd zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcrd(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcrc(((zzcwb) this.zza).zza(), ((zzcmj) this.zzb).zzb());
    }
}
