package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzees implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzees(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar2;
        this.zzb = zzijpVar3;
    }

    public static zzees zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzees(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeer zzb() {
        return new zzeer(zzflk.zzc(), ((zzedx) this.zza).zzb(), zzijf.zzc(this.zzb));
    }
}
