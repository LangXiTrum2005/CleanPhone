package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzepe implements zzijg {
    private final zzijp zza;

    private zzepe(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzepe zzc(zzijp zzijpVar) {
        return new zzepe(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzepd zzb() {
        return new zzepd((zzdkz) this.zza.zzb());
    }
}
