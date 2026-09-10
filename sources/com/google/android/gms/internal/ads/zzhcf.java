package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhcf implements zzhhz {
    static final /* synthetic */ zzhcf zza = new zzhcf();

    private /* synthetic */ zzhcf() {
    }

    @Override // com.google.android.gms.internal.ads.zzhhz
    public final /* synthetic */ zzgzx zza(zzhan zzhanVar, Integer num) throws GeneralSecurityException {
        zzhck zzhckVar = (zzhck) zzhanVar;
        int i2 = zzhch.zza;
        if (zzhckVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzhcc zzhccVar = new zzhcc(null);
        zzhccVar.zza(zzhckVar);
        zzhccVar.zzc(num);
        zzhccVar.zzb(zzhxe.zzb(zzhckVar.zzc()));
        return zzhccVar.zzd();
    }
}
