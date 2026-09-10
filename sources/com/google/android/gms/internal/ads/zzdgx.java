package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdgx implements zzijg {
    private final zzdgk zza;

    private zzdgx(zzdgk zzdgkVar) {
        this.zza = zzdgkVar;
    }

    public static zzdgx zza(zzdgk zzdgkVar) {
        return new zzdgx(zzdgkVar);
    }

    public static Set zzc(zzdgk zzdgkVar) {
        return zzdgkVar.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return this.zza.zzm();
    }
}
