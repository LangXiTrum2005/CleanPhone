package com.google.android.gms.internal.auth;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzdt {
    public static int zza(byte[] bArr, int i2, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i2, zzdsVar);
        int i3 = zzdsVar.zza;
        if (i3 < 0) {
            throw zzfa.zzc();
        }
        if (i3 > bArr.length - iZzj) {
            throw zzfa.zzf();
        }
        if (i3 == 0) {
            zzdsVar.zzc = zzee.zzb;
            return iZzj;
        }
        zzdsVar.zzc = zzee.zzk(bArr, iZzj, i3);
        return iZzj + i3;
    }

    public static int zzb(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public static int zzc(zzgh zzghVar, byte[] bArr, int i2, int i3, int i4, zzds zzdsVar) throws IOException {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object objZzd = zzfzVar.zzd();
        int iZzb = zzfzVar.zzb(objZzd, bArr, i2, i3, i4, zzdsVar);
        zzfzVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return iZzb;
    }

    public static int zzd(zzgh zzghVar, byte[] bArr, int i2, int i3, zzds zzdsVar) throws IOException {
        int iZzk = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZzk = zzk(i4, bArr, iZzk, zzdsVar);
            i4 = zzdsVar.zza;
        }
        int i5 = iZzk;
        if (i4 < 0 || i4 > i3 - i5) {
            throw zzfa.zzf();
        }
        Object objZzd = zzghVar.zzd();
        int i6 = i5 + i4;
        zzghVar.zzg(objZzd, bArr, i5, i6, zzdsVar);
        zzghVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return i6;
    }

    public static int zze(zzgh zzghVar, int i2, byte[] bArr, int i3, int i4, zzey zzeyVar, zzds zzdsVar) throws IOException {
        int iZzd = zzd(zzghVar, bArr, i3, i4, zzdsVar);
        zzeyVar.add(zzdsVar.zzc);
        while (iZzd < i4) {
            int iZzj = zzj(bArr, iZzd, zzdsVar);
            if (i2 != zzdsVar.zza) {
                break;
            }
            iZzd = zzd(zzghVar, bArr, iZzj, i4, zzdsVar);
            zzeyVar.add(zzdsVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i2, zzey zzeyVar, zzds zzdsVar) throws IOException {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i2, zzdsVar);
        int i3 = zzdsVar.zza + iZzj;
        while (iZzj < i3) {
            iZzj = zzj(bArr, iZzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (iZzj == i3) {
            return iZzj;
        }
        throw zzfa.zzf();
    }

    public static int zzg(byte[] bArr, int i2, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i2, zzdsVar);
        int i3 = zzdsVar.zza;
        if (i3 < 0) {
            throw zzfa.zzc();
        }
        if (i3 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = new String(bArr, iZzj, i3, zzez.zzb);
        return iZzj + i3;
    }

    public static int zzh(byte[] bArr, int i2, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i2, zzdsVar);
        int i3 = zzdsVar.zza;
        if (i3 < 0) {
            throw zzfa.zzc();
        }
        if (i3 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = zzhm.zzb(bArr, iZzj, i3);
        return iZzj + i3;
    }

    public static int zzi(int i2, byte[] bArr, int i3, int i4, zzgz zzgzVar, zzds zzdsVar) throws zzfa {
        if ((i2 >>> 3) == 0) {
            throw zzfa.zza();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iZzm = zzm(bArr, i3, zzdsVar);
            zzgzVar.zzf(i2, Long.valueOf(zzdsVar.zzb));
            return iZzm;
        }
        if (i5 == 1) {
            zzgzVar.zzf(i2, Long.valueOf(zzn(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iZzj = zzj(bArr, i3, zzdsVar);
            int i6 = zzdsVar.zza;
            if (i6 < 0) {
                throw zzfa.zzc();
            }
            if (i6 > bArr.length - iZzj) {
                throw zzfa.zzf();
            }
            if (i6 == 0) {
                zzgzVar.zzf(i2, zzee.zzb);
            } else {
                zzgzVar.zzf(i2, zzee.zzk(bArr, iZzj, i6));
            }
            return iZzj + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzfa.zza();
            }
            zzgzVar.zzf(i2, Integer.valueOf(zzb(bArr, i3)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        zzgz zzgzVarZzc = zzgz.zzc();
        int i8 = 0;
        while (i3 < i4) {
            int iZzj2 = zzj(bArr, i3, zzdsVar);
            i8 = zzdsVar.zza;
            if (i8 == i7) {
                i3 = iZzj2;
                break;
            }
            i3 = zzi(i8, bArr, iZzj2, i4, zzgzVarZzc, zzdsVar);
        }
        if (i3 > i4 || i8 != i7) {
            throw zzfa.zzd();
        }
        zzgzVar.zzf(i2, zzgzVarZzc);
        return i3;
    }

    public static int zzj(byte[] bArr, int i2, zzds zzdsVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzk(b2, bArr, i3, zzdsVar);
        }
        zzdsVar.zza = b2;
        return i3;
    }

    public static int zzk(int i2, byte[] bArr, int i3, zzds zzdsVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzdsVar.zza = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & AbstractJsonLexerKt.TC_INVALID) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            zzdsVar.zza = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & AbstractJsonLexerKt.TC_INVALID) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzdsVar.zza = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & AbstractJsonLexerKt.TC_INVALID) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzdsVar.zza = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & AbstractJsonLexerKt.TC_INVALID) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzdsVar.zza = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int zzl(int i2, byte[] bArr, int i3, int i4, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i3, zzdsVar);
        zzevVar.zze(zzdsVar.zza);
        while (iZzj < i4) {
            int iZzj2 = zzj(bArr, iZzj, zzdsVar);
            if (i2 != zzdsVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i2, zzds zzdsVar) {
        int i3 = i2 + 1;
        long j = bArr[i2];
        if (j >= 0) {
            zzdsVar.zzb = j;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j2 = (j & 127) | (((long) (b2 & AbstractJsonLexerKt.TC_INVALID)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j2 |= ((long) (b3 & AbstractJsonLexerKt.TC_INVALID)) << i5;
            b2 = b3;
            i4 = i6;
        }
        zzdsVar.zzb = j2;
        return i4;
    }

    public static long zzn(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }
}
