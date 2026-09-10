package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhjs {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhjs(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhjs zzd(zzhjr zzhjrVar, Class cls, Class cls2) {
        return new zzhjq(cls, cls2, zzhjrVar);
    }

    public abstract Object zza(zzgzx zzgzxVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
