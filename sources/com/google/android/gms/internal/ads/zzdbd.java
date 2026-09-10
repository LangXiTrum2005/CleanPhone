package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdbd implements zzijg {
    private final zzijp zza;

    private zzdbd(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdbd zza(zzijp zzijpVar) {
        return new zzdbd(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdbc(((zzijs) this.zza).zzb());
    }
}
