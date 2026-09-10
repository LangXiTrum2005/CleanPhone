package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfqe implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzfqe(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzfqe zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzfqe(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfqd zzb() {
        return new zzfqd((zzdxe) this.zza.zzb(), ((zzclp) this.zzb).zza());
    }
}
