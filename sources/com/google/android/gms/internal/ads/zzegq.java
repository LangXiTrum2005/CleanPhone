package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzegq implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzegq(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzegq zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzegq(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzegp(((zzehb) this.zza).zzb(), ((zzclj) this.zzb).zzb());
    }
}
