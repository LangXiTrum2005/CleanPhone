package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdlr implements zzijg {
    private final zzdlq zza;

    private zzdlr(zzdlq zzdlqVar) {
        this.zza = zzdlqVar;
    }

    public static zzdlr zzc(zzdlq zzdlqVar) {
        return new zzdlr(zzdlqVar);
    }

    public final com.google.android.gms.ads.internal.client.zzbk zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
