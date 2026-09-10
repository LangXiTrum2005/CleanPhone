package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhid {
    private final zzhxc zza;
    private final Class zzb;

    public /* synthetic */ zzhid(zzhxc zzhxcVar, Class cls, byte[] bArr) {
        this.zza = zzhxcVar;
        this.zzb = cls;
    }

    public static zzhid zzd(zzhic zzhicVar, zzhxc zzhxcVar, Class cls) {
        return new zzhib(zzhxcVar, cls, zzhicVar);
    }

    public abstract zzgzx zza(zzhke zzhkeVar, @Nullable zzhar zzharVar) throws GeneralSecurityException;

    public final zzhxc zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
