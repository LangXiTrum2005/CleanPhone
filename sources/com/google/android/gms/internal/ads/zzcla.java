package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcla implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcla(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcla zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcla(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzckz((zzckq) this.zza.zzb(), (zzdxe) this.zzb.zzb());
    }
}
