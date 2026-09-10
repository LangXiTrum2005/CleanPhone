package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfci implements zzijg {
    private final zzfcc zza;

    private zzfci(zzfcc zzfccVar) {
        this.zza = zzfccVar;
    }

    public static zzfci zzc(zzfcc zzfccVar) {
        return new zzfci(zzfccVar);
    }

    public static int zzd(zzfcc zzfccVar) {
        return zzfccVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzi());
    }
}
