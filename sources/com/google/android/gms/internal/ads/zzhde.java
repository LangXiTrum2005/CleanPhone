package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhde implements zzhjr {
    static final /* synthetic */ zzhde zza = new zzhde();

    private /* synthetic */ zzhde() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjr
    public final /* synthetic */ Object zza(zzgzx zzgzxVar) throws GeneralSecurityException {
        zzhdp zzhdpVar = (zzhdp) zzgzxVar;
        int i2 = zzhdg.zza;
        String strZzb = zzhdpVar.zze().zzb();
        zzhbf zzhbfVarZzd = zzhdpVar.zze().zzd();
        zzgzq zzgzqVarZzb = zzhal.zza(strZzb).zzb();
        int i3 = zzhdd.zza;
        try {
            return zzhgh.zzc(new zzhdd(zzhpd.zzd(zzhat.zza(zzhbfVarZzd), zziab.zza()), zzgzqVarZzb), zzhdpVar.zzc());
        } catch (zzibg e2) {
            throw new GeneralSecurityException(e2);
        }
    }
}
