package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzecm implements zzijg {
    private final zzijp zza;

    private zzecm(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzecm zzc(zzijp zzijpVar) {
        return new zzecm(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzclp) this.zza).zza().getPackageName();
        zzijo.zzb(packageName);
        return packageName;
    }
}
