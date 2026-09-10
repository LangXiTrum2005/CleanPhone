package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdcb implements zzijg {
    private final zzijp zza;

    private zzdcb(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdcb zzc(zzijp zzijpVar) {
        return new zzdcb(zzijpVar);
    }

    public static zzdca zzd(Set set) {
        return new zzdca(set);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdca zzb() {
        return new zzdca(((zzijs) this.zza).zzb());
    }
}
