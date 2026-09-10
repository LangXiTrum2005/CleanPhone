package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcos implements zzijg {
    private final zzijp zza;

    private zzcos(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzcos zza(zzijp zzijpVar) {
        return new zzcos(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfup(((zzclp) this.zza).zza(), com.google.android.gms.ads.internal.zzt.zzs().zza());
    }
}
