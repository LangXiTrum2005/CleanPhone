package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhmk implements zzham {
    private zzhmk(zzham zzhamVar, zzhpw zzhpwVar, byte[] bArr) {
    }

    public static zzham zza(zzhim zzhimVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzhjz zzhjzVarZzc = zzhimVar.zzc(zzgzv.zza());
        zzham zzhamVar = (zzham) zzhia.zza().zzc(zzhjzVarZzc.zzg(), zzham.class).zza(zzhjzVarZzc.zzb());
        zzhpw zzhpwVarZzd = zzhjzVarZzc.zzd();
        int iOrdinal = zzhpwVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzhjf.zzb(zzhimVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzhjf.zza(zzhimVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = zzhjf.zza(zzhimVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzhjf.zza.zzc();
        }
        return new zzhmk(zzhamVar, zzhpwVarZzd, bArrZzc);
    }
}
