package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeca implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzeca(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar3;
        this.zzb = zzijpVar4;
    }

    public static zzeca zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzeca(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzebz zzb() {
        return new zzebz(zzflq.zzc(), zzflk.zzc(), ((zzecn) this.zza).zzb(), zzijf.zzc(this.zzb));
    }
}
