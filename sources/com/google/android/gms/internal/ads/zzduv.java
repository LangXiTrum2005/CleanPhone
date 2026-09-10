package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzduv implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzduv(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzduv zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzduv(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzduu(((zzcoz) this.zza).zzb(), (zzdur) this.zzb.zzb());
    }
}
