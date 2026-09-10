package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzday implements zzijg {
    private final zzijp zza;

    private zzday(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzday zzc(zzijp zzijpVar) {
        return new zzday(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdat zzb() {
        return new zzdat(((zzijs) this.zza).zzb());
    }
}
