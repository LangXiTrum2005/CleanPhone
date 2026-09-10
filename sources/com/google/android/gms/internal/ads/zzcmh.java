package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcmh implements zzijg {
    private final zzcli zza;

    private zzcmh(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    public static zzcmh zza(zzcli zzcliVar) {
        return new zzcmh(zzcliVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Long.valueOf(this.zza.zzi());
    }
}
