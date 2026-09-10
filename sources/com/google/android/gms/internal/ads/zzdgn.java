package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdgn implements zzijg {
    private final zzdgk zza;

    private zzdgn(zzdgk zzdgkVar) {
        this.zza = zzdgkVar;
    }

    public static zzdgn zza(zzdgk zzdgkVar) {
        return new zzdgn(zzdgkVar);
    }

    public static Set zzc(zzdgk zzdgkVar) {
        Set set = Collections.EMPTY_SET;
        zzijo.zzb(set);
        return set;
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
