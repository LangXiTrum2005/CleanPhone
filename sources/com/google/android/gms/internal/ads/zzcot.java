package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcot implements zzijg {
    private final zzijp zza;

    private zzcot(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzcot zza(zzijp zzijpVar) {
        return new zzcot(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.util.zzbl(((zzclp) this.zza).zza());
    }
}
