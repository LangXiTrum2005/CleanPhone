package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgpy implements Serializable {
    public static zzgpy zzc() {
        return zzgph.zza;
    }

    public static zzgpy zzd(Object obj) {
        return obj == null ? zzgph.zza : new zzgqf(obj);
    }

    public abstract Object zza(Object obj);

    public abstract zzgpy zzb(zzgpr zzgprVar);
}
