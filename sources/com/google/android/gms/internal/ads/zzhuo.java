package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhuo implements zzhaq {
    private final zzhaq zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhuo(zzhaq zzhaqVar, byte[] bArr, byte[] bArr2) {
        this.zza = zzhaqVar;
        this.zzb = bArr;
        this.zzc = bArr2;
    }

    public static zzhaq zzb(zzhim zzhimVar) throws GeneralSecurityException {
        zzhjz zzhjzVarZzc = zzhimVar.zzc(zzgzv.zza());
        return new zzhuo((zzhaq) zzhia.zza().zzc(zzhjzVarZzc.zzg(), zzhaq.class).zza(zzhjzVarZzc.zzb()), zzc(zzhjzVarZzc), zzd(zzhjzVarZzc));
    }

    public static byte[] zzc(zzhjz zzhjzVar) throws GeneralSecurityException {
        int iOrdinal = zzhjzVar.zzd().ordinal();
        if (iOrdinal == 1) {
            return zzhjf.zzb(zzhjzVar.zze().intValue()).zzc();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhjf.zza.zzc();
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return zzhjf.zza(zzhjzVar.zze().intValue()).zzc();
    }

    public static byte[] zzd(zzhjz zzhjzVar) {
        return zzhjzVar.zzd().equals(zzhpw.LEGACY) ? new byte[]{0} : new byte[0];
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            this.zza.zza(bArr, bArr2);
            return;
        }
        if (!zzhkl.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr4 = this.zzc;
        if (bArr4.length != 0) {
            bArr2 = zzhvp.zza(bArr2, bArr4);
        }
        this.zza.zza(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
    }
}
