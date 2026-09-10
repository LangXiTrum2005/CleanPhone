package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzetg implements zzijg {
    private final zzijp zza;

    private zzetg(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzetg zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzetg(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzete zzb() {
        return new zzete(zzflk.zzc(), (zzcda) this.zza.zzb());
    }
}
