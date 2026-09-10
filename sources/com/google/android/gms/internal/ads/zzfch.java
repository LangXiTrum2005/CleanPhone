package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfch implements zzijg {
    private final zzfcc zza;

    private zzfch(zzfcc zzfccVar) {
        this.zza = zzfccVar;
    }

    public static zzfch zzc(zzfcc zzfccVar) {
        return new zzfch(zzfccVar);
    }

    public static String zzd(zzfcc zzfccVar) {
        String strZze = zzfccVar.zze();
        zzijo.zzb(strZze);
        return strZze;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
