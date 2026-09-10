package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhjl {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhjl(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhjl zzd(zzhjk zzhjkVar, Class cls, Class cls2) {
        return new zzhjj(cls, cls2, zzhjkVar);
    }

    public abstract zzhke zza(zzhan zzhanVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
