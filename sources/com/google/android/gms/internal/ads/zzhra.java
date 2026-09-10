package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhra {
    public static final zzhra zza = new zzhra("NIST_P256", zzhhq.zza);
    public static final zzhra zzb = new zzhra("NIST_P384", zzhhq.zzb);
    public static final zzhra zzc = new zzhra("NIST_P521", zzhhq.zzc);
    private final String zzd;
    private final ECParameterSpec zze;

    private zzhra(String str, ECParameterSpec eCParameterSpec) {
        this.zzd = str;
        this.zze = eCParameterSpec;
    }

    public final String toString() {
        return this.zzd;
    }

    public final ECParameterSpec zza() {
        return this.zze;
    }
}
