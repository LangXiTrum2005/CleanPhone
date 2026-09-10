package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdkx implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdkx(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdkx zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdkx(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkw((zzdcv) this.zza.zzb(), (zzdid) this.zzb.zzb());
    }
}
