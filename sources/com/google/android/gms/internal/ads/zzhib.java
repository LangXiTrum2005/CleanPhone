package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzhib extends zzhid {
    final /* synthetic */ zzhic zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhib(zzhxc zzhxcVar, Class cls, zzhic zzhicVar) {
        super(zzhxcVar, cls, null);
        this.zza = zzhicVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhid
    public final zzgzx zza(zzhke zzhkeVar, @Nullable zzhar zzharVar) throws GeneralSecurityException {
        return this.zza.zza(zzhkeVar, zzharVar);
    }
}
