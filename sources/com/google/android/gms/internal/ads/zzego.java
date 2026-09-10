package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzego implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzego(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzego zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzego(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegn zzb() {
        return new zzegn(((zzegk) this.zza).zzb(), (zzgyw) this.zzb.zzb());
    }
}
