package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public class zzhij implements zzgzy {
    final String zza;
    final Class zzb;
    final zzhoz zzc;

    public zzhij(String str, Class cls, zzhoz zzhozVar, zzick zzickVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzhozVar;
    }

    public static zzgzy zze(String str, Class cls, zzhoz zzhozVar, zzick zzickVar) {
        return new zzhij(str, cls, zzhozVar, zzickVar);
    }

    public static zzhao zzf(String str, Class cls, zzick zzickVar) {
        return new zzhii(str, cls, zzickVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final Object zza(zzhzl zzhzlVar) throws GeneralSecurityException {
        return zzhjb.zza().zzd(zzhje.zza().zzg(zzhjz.zza(this.zza, zzhzlVar, this.zzc, zzhpw.RAW, null), zzgzv.zza()), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final zzhpa zzd(zzhzl zzhzlVar) throws GeneralSecurityException {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza(this.zza);
        zzhpcVarZze.zzb(zzhzlVar);
        zzhpcVarZze.zzc(zzhpw.RAW);
        zzhjz zzhjzVar = (zzhjz) zzhje.zza().zzh(zzhiv.zza().zzc(zzhje.zza().zzj(zzhka.zzb((zzhpd) zzhpcVarZze.zzbu())), null), zzhjz.class, zzgzv.zza());
        zzhoy zzhoyVarZzd = zzhpa.zzd();
        zzhoyVarZzd.zza(zzhjzVar.zzg());
        zzhoyVarZzd.zzb(zzhjzVar.zzb());
        zzhoyVarZzd.zzc(zzhjzVar.zzc());
        return (zzhpa) zzhoyVarZzd.zzbu();
    }
}
