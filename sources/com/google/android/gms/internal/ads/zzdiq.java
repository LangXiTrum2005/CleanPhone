package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdiq implements zzijg {
    private final zzijp zza;

    private zzdiq(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdiq zza(zzijp zzijpVar) {
        return new zzdiq(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdip(((zzijs) this.zza).zzb());
    }
}
