package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzegw implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzegw(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzegw zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzegw(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegv zzb() {
        return new zzegv(((zzego) this.zza).zzb(), ((zzclj) this.zzb).zzb());
    }
}
