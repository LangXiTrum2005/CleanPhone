package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdhr implements zzijg {
    private final zzijp zza;

    private zzdhr(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdhr zzc(zzijp zzijpVar) {
        return new zzdhr(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdhq zzb() {
        return new zzdhq(((zzijs) this.zza).zzb());
    }
}
