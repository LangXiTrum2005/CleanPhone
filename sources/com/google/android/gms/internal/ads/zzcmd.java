package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcmd implements zzijg {
    private final zzijp zza;

    private zzcmd(zzcli zzcliVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzcmd zzc(zzcli zzcliVar, zzijp zzijpVar) {
        return new zzcmd(zzcliVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcpn zzb() {
        zzclg zzclgVar = (zzclg) this.zza.zzb();
        zzijo.zzb(zzclgVar);
        return zzclgVar;
    }
}
