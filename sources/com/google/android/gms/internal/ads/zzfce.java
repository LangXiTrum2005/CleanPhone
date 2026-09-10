package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfce implements zzijg {
    private final zzfcc zza;

    private zzfce(zzfcc zzfccVar) {
        this.zza = zzfccVar;
    }

    public static zzfce zzc(zzfcc zzfccVar) {
        return new zzfce(zzfccVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzf());
    }
}
