package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhbm implements zzhhz {
    static final /* synthetic */ zzhbm zza = new zzhbm();

    private /* synthetic */ zzhbm() {
    }

    @Override // com.google.android.gms.internal.ads.zzhhz
    public final /* synthetic */ zzgzx zza(zzhan zzhanVar, Integer num) throws GeneralSecurityException {
        zzhbt zzhbtVar = (zzhbt) zzhanVar;
        int i2 = zzhbp.zza;
        if (zzhbtVar.zzc() != 16 && zzhbtVar.zzc() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        zzhbk zzhbkVar = new zzhbk(null);
        zzhbkVar.zza(zzhbtVar);
        zzhbkVar.zzd(num);
        zzhbkVar.zzb(zzhxe.zzb(zzhbtVar.zzc()));
        zzhbkVar.zzc(zzhxe.zzb(zzhbtVar.zzd()));
        return zzhbkVar.zze();
    }
}
