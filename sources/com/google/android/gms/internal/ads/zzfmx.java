package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfmx implements zzijg {
    private final zzijp zza;

    private zzfmx(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzfmx zzc(zzijp zzijpVar) {
        return new zzfmx(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfmt zzb() {
        return new zzfmt(((zzijs) this.zza).zzb());
    }
}
