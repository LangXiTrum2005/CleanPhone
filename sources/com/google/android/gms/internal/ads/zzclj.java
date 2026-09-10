package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzclj implements zzijg {
    private final zzijp zza;

    private zzclj(zzcli zzcliVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzclj zzc(zzcli zzcliVar, zzijp zzijpVar) {
        return new zzclj(zzcliVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.zzg zzb() {
        return ((zzcda) this.zza.zzb()).zzo();
    }
}
