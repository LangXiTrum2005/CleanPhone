package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcou implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcou(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcou zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcou(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.util.client.zzu(((zzclp) this.zza).zza(), (String) this.zzb.zzb());
    }
}
