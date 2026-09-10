package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class zzclo implements zzijg {
    private final zzijp zza;

    private zzclo(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzclo zza(zzijp zzijpVar) {
        return new zzclo(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzclp) this.zza).zza().getApplicationInfo();
        zzijo.zzb(applicationInfo);
        return applicationInfo;
    }
}
