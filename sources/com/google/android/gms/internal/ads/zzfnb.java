package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfnb implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzfnb(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzfnb zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzfnb(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfna(((zzclp) this.zza).zza(), (zzfno) this.zzb.zzb());
    }
}
