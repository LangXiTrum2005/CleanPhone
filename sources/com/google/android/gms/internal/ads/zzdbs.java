package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdbs implements zzijg {
    private final zzijp zza;

    private zzdbs(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdbs zza(zzijp zzijpVar) {
        return new zzdbs(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdbr(((zzijs) this.zza).zzb());
    }
}
