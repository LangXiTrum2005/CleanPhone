package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebu implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzebu(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzebu zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzebu(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzebt(((zzclp) this.zza).zza(), (zzdxe) this.zzb.zzb());
    }
}
