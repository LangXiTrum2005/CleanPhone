package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgnd implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzgnd(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzgnd zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzgnd(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgnc((zzfzm) this.zza.zzb(), (zzgcf) this.zzb.zzb());
    }
}
