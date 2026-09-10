package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcpp implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcpp(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcpp zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcpp(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcpo zzb() {
        return new zzcpo(((zzijk) this.zza).zzb(), ((zzijk) this.zzb).zzb());
    }
}
