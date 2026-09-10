package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfcd implements zzijg {
    private final zzfcc zza;

    private zzfcd(zzfcc zzfccVar) {
        this.zza = zzfccVar;
    }

    public static zzfcd zzc(zzfcc zzfccVar) {
        return new zzfcd(zzfccVar);
    }

    public static String zzd(zzfcc zzfccVar) {
        String strZza = zzfccVar.zza();
        zzijo.zzb(strZza);
        return strZza;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
