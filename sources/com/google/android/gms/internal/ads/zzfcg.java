package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfcg implements zzijg {
    private final zzfcc zza;

    private zzfcg(zzfcc zzfccVar) {
        this.zza = zzfccVar;
    }

    public static zzfcg zzc(zzfcc zzfccVar) {
        return new zzfcg(zzfccVar);
    }

    public static boolean zzd(zzfcc zzfccVar) {
        return zzfccVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzg());
    }
}
