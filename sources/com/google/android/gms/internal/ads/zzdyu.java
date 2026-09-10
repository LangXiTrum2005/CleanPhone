package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdyu implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdyu(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdyu zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdyu(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdyt((zzdyw) this.zza.zzb(), ((zzdys) this.zzb).zzb());
    }
}
