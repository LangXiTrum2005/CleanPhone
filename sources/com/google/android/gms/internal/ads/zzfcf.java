package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfcf implements zzijg {
    private final zzfcc zza;

    private zzfcf(zzfcc zzfccVar) {
        this.zza = zzfccVar;
    }

    public static zzfcf zzc(zzfcc zzfccVar) {
        return new zzfcf(zzfccVar);
    }

    public static boolean zzd(zzfcc zzfccVar) {
        return zzfccVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzh());
    }
}
