package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczy implements zzijg {
    private final zzijp zza;

    private zzczy(zzczt zzcztVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzczy zzc(zzczt zzcztVar, zzijp zzijpVar) {
        return new zzczy(zzcztVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String strZzp = ((zzcxa) this.zza.zzb()).zzp();
        zzijo.zzb(strZzp);
        return strZzp;
    }
}
