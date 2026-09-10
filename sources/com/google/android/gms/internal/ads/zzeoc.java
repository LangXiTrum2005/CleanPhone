package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeoc implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzeoc(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzeoc zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzeoc(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeob zzb() {
        return new zzeob((zzepf) this.zza.zzb(), (zzduu) this.zzb.zzb());
    }
}
