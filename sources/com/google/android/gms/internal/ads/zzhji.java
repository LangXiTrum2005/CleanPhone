package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhji {
    private final zzhxc zza;
    private final Class zzb;

    public /* synthetic */ zzhji(zzhxc zzhxcVar, Class cls, byte[] bArr) {
        this.zza = zzhxcVar;
        this.zzb = cls;
    }

    public static zzhji zzd(zzhjh zzhjhVar, zzhxc zzhxcVar, Class cls) {
        return new zzhjg(zzhxcVar, cls, zzhjhVar);
    }

    public abstract zzhan zza(zzhke zzhkeVar) throws GeneralSecurityException;

    public final zzhxc zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
