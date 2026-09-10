package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzezj implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzezj(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar3;
    }

    public static zzezj zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzezj(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzezh zzb() {
        return new zzezh((zzcbw) this.zza.zzb(), zzflk.zzc(), ((zzclp) this.zzb).zza());
    }
}
