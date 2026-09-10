package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfcj implements zzijg {
    private final zzfcc zza;

    private zzfcj(zzfcc zzfccVar) {
        this.zza = zzfccVar;
    }

    public static zzfcj zzc(zzfcc zzfccVar) {
        return new zzfcj(zzfccVar);
    }

    public static int zzd(zzfcc zzfccVar) {
        return zzfccVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzj());
    }
}
