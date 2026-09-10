package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzhza {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i2, zzhyz zzhyzVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzb(b2, bArr, i3, zzhyzVar);
        }
        zzhyzVar.zza = b2;
        return i3;
    }

    public static int zzb(int i2, byte[] bArr, int i3, zzhyz zzhyzVar) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b2 >= 0) {
            zzhyzVar.zza = i5 | (b2 << 7);
            return i4;
        }
        int i6 = i5 | ((b2 & AbstractJsonLexerKt.TC_INVALID) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            zzhyzVar.zza = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & AbstractJsonLexerKt.TC_INVALID) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzhyzVar.zza = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & AbstractJsonLexerKt.TC_INVALID) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzhyzVar.zza = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & AbstractJsonLexerKt.TC_INVALID) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzhyzVar.zza = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int zzc(byte[] bArr, int i2, zzhyz zzhyzVar) {
        long j = bArr[i2];
        int i3 = i2 + 1;
        if (j >= 0) {
            zzhyzVar.zzb = j;
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
        zzhyzVar.zzb = j2;
        return i4;
    }

    public static int zzd(byte[] bArr, int i2) {
        int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public static long zze(byte[] bArr, int i2) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i2, zzhyz zzhyzVar) throws zzibg {
        int iZza = zza(bArr, i2, zzhyzVar);
        int i3 = zzhyzVar.zza;
        if (i3 < 0) {
            throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            zzhyzVar.zzc = "";
            return iZza;
        }
        zzhyzVar.zzc = zzidr.zzf(bArr, iZza, i3);
        return iZza + i3;
    }

    public static int zzg(byte[] bArr, int i2, zzhyz zzhyzVar) throws zzibg {
        int iZza = zza(bArr, i2, zzhyzVar);
        int i3 = zzhyzVar.zza;
        if (i3 < 0) {
            throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iZza) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            zzhyzVar.zzc = zzhzl.zzb;
            return iZza;
        }
        zzhyzVar.zzc = zzhzl.zzs(bArr, iZza, i3);
        return iZza + i3;
    }

    public static int zzh(zzicu zzicuVar, byte[] bArr, int i2, int i3, zzhyz zzhyzVar) throws IOException {
        Object objZza = zzicuVar.zza();
        int iZzj = zzj(objZza, zzicuVar, bArr, i2, i3, zzhyzVar);
        zzicuVar.zzk(objZza);
        zzhyzVar.zzc = objZza;
        return iZzj;
    }

    public static int zzi(zzicu zzicuVar, byte[] bArr, int i2, int i3, int i4, zzhyz zzhyzVar) throws IOException {
        Object objZza = zzicuVar.zza();
        int iZzk = zzk(objZza, zzicuVar, bArr, i2, i3, i4, zzhyzVar);
        zzicuVar.zzk(objZza);
        zzhyzVar.zzc = objZza;
        return iZzk;
    }

    public static int zzj(Object obj, zzicu zzicuVar, byte[] bArr, int i2, int i3, zzhyz zzhyzVar) throws IOException {
        int iZzb = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZzb = zzb(i4, bArr, iZzb, zzhyzVar);
            i4 = zzhyzVar.zza;
        }
        int i5 = iZzb;
        if (i4 < 0 || i4 > i3 - i5) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzhyzVar.zze + 1;
        zzhyzVar.zze = i6;
        zzq(i6);
        int i7 = i5 + i4;
        zzicuVar.zzj(obj, bArr, i5, i7, zzhyzVar);
        zzhyzVar.zze--;
        zzhyzVar.zzc = obj;
        return i7;
    }

    public static int zzk(Object obj, zzicu zzicuVar, byte[] bArr, int i2, int i3, int i4, zzhyz zzhyzVar) throws IOException {
        int i5 = zzhyzVar.zze + 1;
        zzhyzVar.zze = i5;
        zzq(i5);
        int iZzi = ((zzicf) zzicuVar).zzi(obj, bArr, i2, i3, i4, zzhyzVar);
        zzhyzVar.zze--;
        zzhyzVar.zzc = obj;
        return iZzi;
    }

    public static int zzl(int i2, byte[] bArr, int i3, int i4, zzibd zzibdVar, zzhyz zzhyzVar) {
        zzias zziasVar = (zzias) zzibdVar;
        int iZza = zza(bArr, i3, zzhyzVar);
        zziasVar.zzi(zzhyzVar.zza);
        while (iZza < i4) {
            int iZza2 = zza(bArr, iZza, zzhyzVar);
            if (i2 != zzhyzVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzhyzVar);
            zziasVar.zzi(zzhyzVar.zza);
        }
        return iZza;
    }

    public static int zzm(byte[] bArr, int i2, zzibd zzibdVar, zzhyz zzhyzVar) throws IOException {
        zzias zziasVar = (zzias) zzibdVar;
        int iZza = zza(bArr, i2, zzhyzVar);
        int i3 = zzhyzVar.zza + iZza;
        while (iZza < i3) {
            iZza = zza(bArr, iZza, zzhyzVar);
            zziasVar.zzi(zzhyzVar.zza);
        }
        if (iZza == i3) {
            return iZza;
        }
        throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zzicu zzicuVar, int i2, byte[] bArr, int i3, int i4, zzibd zzibdVar, zzhyz zzhyzVar) throws IOException {
        int iZzh = zzh(zzicuVar, bArr, i3, i4, zzhyzVar);
        zzibdVar.add(zzhyzVar.zzc);
        while (iZzh < i4) {
            int iZza = zza(bArr, iZzh, zzhyzVar);
            if (i2 != zzhyzVar.zza) {
                break;
            }
            iZzh = zzh(zzicuVar, bArr, iZza, i4, zzhyzVar);
            zzibdVar.add(zzhyzVar.zzc);
        }
        return iZzh;
    }

    public static int zzo(int i2, byte[] bArr, int i3, int i4, zzidg zzidgVar, zzhyz zzhyzVar) throws zzibg {
        if ((i2 >>> 3) == 0) {
            throw new zzibg("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iZzc = zzc(bArr, i3, zzhyzVar);
            zzidgVar.zzk(i2, Long.valueOf(zzhyzVar.zzb));
            return iZzc;
        }
        if (i5 == 1) {
            zzidgVar.zzk(i2, Long.valueOf(zze(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iZza = zza(bArr, i3, zzhyzVar);
            int i6 = zzhyzVar.zza;
            if (i6 < 0) {
                throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 > bArr.length - iZza) {
                throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i6 == 0) {
                zzidgVar.zzk(i2, zzhzl.zzb);
            } else {
                zzidgVar.zzk(i2, zzhzl.zzs(bArr, iZza, i6));
            }
            return iZza + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new zzibg("Protocol message contained an invalid tag (zero).");
            }
            zzidgVar.zzk(i2, Integer.valueOf(zzd(bArr, i3)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        zzidg zzidgVarZzb = zzidg.zzb();
        int i8 = zzhyzVar.zze + 1;
        zzhyzVar.zze = i8;
        zzq(i8);
        int i9 = 0;
        while (i3 < i4) {
            int iZza2 = zza(bArr, i3, zzhyzVar);
            int i10 = zzhyzVar.zza;
            if (i10 == i7) {
                i9 = i10;
                i3 = iZza2;
                break;
            }
            i3 = zzo(i10, bArr, iZza2, i4, zzidgVarZzb, zzhyzVar);
            i9 = i10;
        }
        zzhyzVar.zze--;
        if (i3 > i4 || i9 != i7) {
            throw new zzibg("Failed to parse the message.");
        }
        zzidgVar.zzk(i2, zzidgVarZzb);
        return i3;
    }

    public static int zzp(int i2, byte[] bArr, int i3, int i4, zzhyz zzhyzVar) throws zzibg {
        if ((i2 >>> 3) == 0) {
            throw new zzibg("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return zzc(bArr, i3, zzhyzVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return zza(bArr, i3, zzhyzVar) + zzhyzVar.zza;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw new zzibg("Protocol message contained an invalid tag (zero).");
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = zza(bArr, i3, zzhyzVar);
            i7 = zzhyzVar.zza;
            if (i7 == i6) {
                break;
            }
            i3 = zzp(i7, bArr, i3, i4, zzhyzVar);
        }
        if (i3 > i4 || i7 != i6) {
            throw new zzibg("Failed to parse the message.");
        }
        return i3;
    }

    private static void zzq(int i2) throws zzibg {
        if (i2 >= zzb) {
            throw new zzibg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
