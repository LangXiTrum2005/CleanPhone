package com.google.android.gms.internal.measurement;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzkx {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i2, zzkw zzkwVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzb(b2, bArr, i3, zzkwVar);
        }
        zzkwVar.zza = b2;
        return i3;
    }

    public static int zzb(int i2, byte[] bArr, int i3, zzkw zzkwVar) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b2 >= 0) {
            zzkwVar.zza = i5 | (b2 << 7);
            return i4;
        }
        int i6 = i5 | ((b2 & AbstractJsonLexerKt.TC_INVALID) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            zzkwVar.zza = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & AbstractJsonLexerKt.TC_INVALID) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzkwVar.zza = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & AbstractJsonLexerKt.TC_INVALID) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzkwVar.zza = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & AbstractJsonLexerKt.TC_INVALID) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzkwVar.zza = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int zzc(byte[] bArr, int i2, zzkw zzkwVar) {
        long j = bArr[i2];
        int i3 = i2 + 1;
        if (j >= 0) {
            zzkwVar.zzb = j;
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
        zzkwVar.zzb = j2;
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

    public static int zzf(byte[] bArr, int i2, zzkw zzkwVar) throws zzmr {
        int i3;
        int iZza = zza(bArr, i2, zzkwVar);
        int i4 = zzkwVar.zza;
        if (i4 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 == 0) {
            zzkwVar.zzc = "";
            return iZza;
        }
        int i5 = zzos.zza;
        int length = bArr.length;
        if ((((length - iZza) - i4) | iZza | i4) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZza), Integer.valueOf(i4)));
        }
        int i6 = iZza + i4;
        char[] cArr = new char[i4];
        int i7 = 0;
        while (iZza < i6) {
            byte b2 = bArr[iZza];
            if (!zzoq.zza(b2)) {
                break;
            }
            iZza++;
            cArr[i7] = (char) b2;
            i7++;
        }
        int i8 = i7;
        while (iZza < i6) {
            int i9 = iZza + 1;
            byte b3 = bArr[iZza];
            if (zzoq.zza(b3)) {
                cArr[i8] = (char) b3;
                i8++;
                iZza = i9;
                while (iZza < i6) {
                    byte b4 = bArr[iZza];
                    if (!zzoq.zza(b4)) {
                        break;
                    }
                    iZza++;
                    cArr[i8] = (char) b4;
                    i8++;
                }
            } else {
                if (b3 < -32) {
                    if (i9 >= i6) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    i3 = i8 + 1;
                    iZza += 2;
                    zzoq.zzb(b3, bArr[i9], cArr, i8);
                } else if (b3 < -16) {
                    if (i9 >= i6 - 1) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    i3 = i8 + 1;
                    int i10 = iZza + 2;
                    iZza += 3;
                    zzoq.zzc(b3, bArr[i9], bArr[i10], cArr, i8);
                } else {
                    if (i9 >= i6 - 2) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    byte b5 = bArr[i9];
                    int i11 = iZza + 3;
                    byte b6 = bArr[iZza + 2];
                    iZza += 4;
                    zzoq.zzd(b3, b5, b6, bArr[i11], cArr, i8);
                    i8 += 2;
                }
                i8 = i3;
            }
        }
        zzkwVar.zzc = new String(cArr, 0, i8);
        return i6;
    }

    public static int zzg(byte[] bArr, int i2, zzkw zzkwVar) throws zzmr {
        int iZza = zza(bArr, i2, zzkwVar);
        int i3 = zzkwVar.zza;
        if (i3 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iZza) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            zzkwVar.zzc = zzlh.zzb;
            return iZza;
        }
        zzkwVar.zzc = zzlh.zzh(bArr, iZza, i3);
        return iZza + i3;
    }

    public static int zzh(zznx zznxVar, byte[] bArr, int i2, int i3, zzkw zzkwVar) throws IOException {
        Object objZza = zznxVar.zza();
        int iZzj = zzj(objZza, zznxVar, bArr, i2, i3, zzkwVar);
        zznxVar.zzj(objZza);
        zzkwVar.zzc = objZza;
        return iZzj;
    }

    public static int zzi(zznx zznxVar, byte[] bArr, int i2, int i3, int i4, zzkw zzkwVar) throws IOException {
        Object objZza = zznxVar.zza();
        int iZzk = zzk(objZza, zznxVar, bArr, i2, i3, i4, zzkwVar);
        zznxVar.zzj(objZza);
        zzkwVar.zzc = objZza;
        return iZzk;
    }

    public static int zzj(Object obj, zznx zznxVar, byte[] bArr, int i2, int i3, zzkw zzkwVar) throws IOException {
        int iZzb = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZzb = zzb(i4, bArr, iZzb, zzkwVar);
            i4 = zzkwVar.zza;
        }
        int i5 = iZzb;
        if (i4 < 0 || i4 > i3 - i5) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzkwVar.zze + 1;
        zzkwVar.zze = i6;
        zzq(i6);
        int i7 = i5 + i4;
        zznxVar.zzi(obj, bArr, i5, i7, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return i7;
    }

    public static int zzk(Object obj, zznx zznxVar, byte[] bArr, int i2, int i3, int i4, zzkw zzkwVar) throws IOException {
        int i5 = zzkwVar.zze + 1;
        zzkwVar.zze = i5;
        zzq(i5);
        int iZzh = ((zznp) zznxVar).zzh(obj, bArr, i2, i3, i4, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return iZzh;
    }

    public static int zzl(int i2, byte[] bArr, int i3, int i4, zzmo zzmoVar, zzkw zzkwVar) {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int iZza = zza(bArr, i3, zzkwVar);
        zzmgVar.zzh(zzkwVar.zza);
        while (iZza < i4) {
            int iZza2 = zza(bArr, iZza, zzkwVar);
            if (i2 != zzkwVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        return iZza;
    }

    public static int zzm(byte[] bArr, int i2, zzmo zzmoVar, zzkw zzkwVar) throws IOException {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int iZza = zza(bArr, i2, zzkwVar);
        int i3 = zzkwVar.zza + iZza;
        while (iZza < i3) {
            iZza = zza(bArr, iZza, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        if (iZza == i3) {
            return iZza;
        }
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zznx zznxVar, int i2, byte[] bArr, int i3, int i4, zzmo zzmoVar, zzkw zzkwVar) throws IOException {
        int iZzh = zzh(zznxVar, bArr, i3, i4, zzkwVar);
        zzmoVar.add(zzkwVar.zzc);
        while (iZzh < i4) {
            int iZza = zza(bArr, iZzh, zzkwVar);
            if (i2 != zzkwVar.zza) {
                break;
            }
            iZzh = zzh(zznxVar, bArr, iZza, i4, zzkwVar);
            zzmoVar.add(zzkwVar.zzc);
        }
        return iZzh;
    }

    public static int zzo(int i2, byte[] bArr, int i3, int i4, zzoj zzojVar, zzkw zzkwVar) throws zzmr {
        if ((i2 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iZzc = zzc(bArr, i3, zzkwVar);
            zzojVar.zzk(i2, Long.valueOf(zzkwVar.zzb));
            return iZzc;
        }
        if (i5 == 1) {
            zzojVar.zzk(i2, Long.valueOf(zze(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iZza = zza(bArr, i3, zzkwVar);
            int i6 = zzkwVar.zza;
            if (i6 < 0) {
                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 > bArr.length - iZza) {
                throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i6 == 0) {
                zzojVar.zzk(i2, zzlh.zzb);
            } else {
                zzojVar.zzk(i2, zzlh.zzh(bArr, iZza, i6));
            }
            return iZza + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new zzmr("Protocol message contained an invalid tag (zero).");
            }
            zzojVar.zzk(i2, Integer.valueOf(zzd(bArr, i3)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        zzoj zzojVarZzb = zzoj.zzb();
        int i8 = zzkwVar.zze + 1;
        zzkwVar.zze = i8;
        zzq(i8);
        int i9 = 0;
        while (i3 < i4) {
            int iZza2 = zza(bArr, i3, zzkwVar);
            int i10 = zzkwVar.zza;
            if (i10 == i7) {
                i9 = i10;
                i3 = iZza2;
                break;
            }
            i3 = zzo(i10, bArr, iZza2, i4, zzojVarZzb, zzkwVar);
            i9 = i10;
        }
        zzkwVar.zze--;
        if (i3 > i4 || i9 != i7) {
            throw new zzmr("Failed to parse the message.");
        }
        zzojVar.zzk(i2, zzojVarZzb);
        return i3;
    }

    public static int zzp(int i2, byte[] bArr, int i3, int i4, zzkw zzkwVar) throws zzmr {
        if ((i2 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return zzc(bArr, i3, zzkwVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return zza(bArr, i3, zzkwVar) + zzkwVar.zza;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = zza(bArr, i3, zzkwVar);
            i7 = zzkwVar.zza;
            if (i7 == i6) {
                break;
            }
            i3 = zzp(i7, bArr, i3, i4, zzkwVar);
        }
        if (i3 > i4 || i7 != i6) {
            throw new zzmr("Failed to parse the message.");
        }
        return i3;
    }

    private static void zzq(int i2) throws zzmr {
        if (i2 >= zzb) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
