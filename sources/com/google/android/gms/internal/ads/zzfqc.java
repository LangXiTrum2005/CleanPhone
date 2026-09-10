package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfqc implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzfqc(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzfqc zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzfqc(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfqb((zzfqh) this.zza.zzb(), (zzfpu) this.zzb.zzb());
    }
}
