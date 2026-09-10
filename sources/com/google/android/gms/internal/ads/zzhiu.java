package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhiu implements zzhhz {
    static final /* synthetic */ zzhiu zza = new zzhiu();

    private /* synthetic */ zzhiu() {
    }

    @Override // com.google.android.gms.internal.ads.zzhhz
    public final /* synthetic */ zzgzx zza(zzhan zzhanVar, Integer num) throws GeneralSecurityException {
        int i2 = zzhiv.zza;
        zzhpd zzhpdVarZzc = ((zzhin) zzhanVar).zzb().zzc();
        zzgzy zzgzyVarZzd = zzhia.zza().zzd(zzhpdVarZzc.zza());
        if (!zzhia.zza().zze(zzhpdVarZzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhpa zzhpaVarZzd = zzgzyVarZzd.zzd(zzhpdVarZzc.zzb());
        return new zzhim(zzhjz.zza(zzhpaVarZzd.zza(), zzhpaVarZzd.zzb(), zzhpaVarZzd.zzc(), zzhpdVarZzc.zzc(), num), zzgzv.zza());
    }
}
