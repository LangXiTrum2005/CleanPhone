package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxq implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdxq(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdxq zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdxq(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdxp((String) this.zza.zzb(), (zzdxj) this.zzb.zzb());
    }
}
