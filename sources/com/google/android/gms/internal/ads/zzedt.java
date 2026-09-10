package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedt implements zzijg {
    private final zzijp zza;

    private zzedt(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzedt zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzedt(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeds zzb() {
        return new zzeds(((zzclp) this.zza).zza(), zzflk.zzc());
    }
}
