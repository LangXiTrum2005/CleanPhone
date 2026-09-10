package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcmf implements zzijg {
    private final zzcli zza;

    private zzcmf(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    public static zzcmf zza(zzcli zzcliVar) {
        return new zzcmf(zzcliVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        String strZze = this.zza.zze();
        zzijo.zzb(strZze);
        return strZze;
    }
}
