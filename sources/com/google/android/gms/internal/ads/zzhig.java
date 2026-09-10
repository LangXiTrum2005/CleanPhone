package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhig {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhig(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhig zzd(zzhif zzhifVar, Class cls, Class cls2) {
        return new zzhie(cls, cls2, zzhifVar);
    }

    public abstract zzhke zza(zzgzx zzgzxVar, @Nullable zzhar zzharVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
