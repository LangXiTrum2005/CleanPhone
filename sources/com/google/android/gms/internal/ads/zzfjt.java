package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfjt implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzfjt(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzfjt zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzfjt(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfjs(((zzclp) this.zza).zza(), ((zzcmj) this.zzb).zzb());
    }
}
