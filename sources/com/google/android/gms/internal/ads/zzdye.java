package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdye implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdye(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdye zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdye(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdyd((zzdxr) this.zza.zzb(), (zzclg) this.zzb.zzb());
    }
}
