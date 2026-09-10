package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhgh implements zzgzq {
    private final zzgzq zza;
    private final byte[] zzb;

    private zzhgh(zzgzq zzgzqVar, byte[] bArr) {
        this.zza = zzgzqVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgzq zzb(zzhim zzhimVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzhjz zzhjzVarZzc = zzhimVar.zzc(zzgzv.zza());
        zzgzq zzgzqVar = (zzgzq) zzhia.zza().zzc(zzhjzVarZzc.zzg(), zzgzq.class).zza(zzhjzVarZzc.zzb());
        zzhpw zzhpwVarZzd = zzhjzVarZzc.zzd();
        int iOrdinal = zzhpwVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzhjf.zzb(zzhimVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzhjf.zza(zzhimVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzhpwVarZzd)));
            }
            bArrZzc = zzhjf.zza(zzhimVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzhjf.zza.zzc();
        }
        return new zzhgh(zzgzqVar, bArrZzc);
    }

    public static zzgzq zzc(zzgzq zzgzqVar, zzhxc zzhxcVar) {
        return new zzhgh(zzgzqVar, zzhxcVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgzq
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzhkl.zze(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
