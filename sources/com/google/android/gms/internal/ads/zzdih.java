package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdih implements zzijg {
    private final zzijp zza;

    private zzdih(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdih zza(zzijp zzijpVar) {
        return new zzdih(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdig(((zzijs) this.zza).zzb());
    }
}
