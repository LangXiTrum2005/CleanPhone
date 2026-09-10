package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdvu implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdvu(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdvu zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdvu(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdvt((zzbfj) this.zza.zzb(), (zzffn) this.zzb.zzb());
    }
}
