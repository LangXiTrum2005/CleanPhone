package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzhm {
    private static final zzhk zza;

    static {
        if (zzhi.zzu() && zzhi.zzv()) {
            int i2 = zzdr.zza;
        }
        zza = new zzhl();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i4 == 1) {
            byte b3 = bArr[i2];
            if (b2 > -12 || b3 > -65) {
                return -1;
            }
            return (b3 << 8) ^ b2;
        }
        if (i4 != 2) {
            throw new AssertionError();
        }
        byte b4 = bArr[i2];
        byte b5 = bArr[i2 + 1];
        if (b2 > -12 || b4 > -65 || b5 > -65) {
            return -1;
        }
        return (b5 << 16) ^ ((b4 << 8) ^ b2);
    }

    public static String zzb(byte[] bArr, int i2, int i3) throws zzfa {
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b2 = bArr[i2];
            if (!zzhj.zzd(b2)) {
                break;
            }
            i2++;
            cArr[i5] = (char) b2;
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte b3 = bArr[i2];
            if (zzhj.zzd(b3)) {
                cArr[i6] = (char) b3;
                i6++;
                i2 = i7;
                while (i2 < i4) {
                    byte b4 = bArr[i2];
                    if (!zzhj.zzd(b4)) {
                        break;
                    }
                    i2++;
                    cArr[i6] = (char) b4;
                    i6++;
                }
            } else if (b3 < -32) {
                if (i7 >= i4) {
                    throw zzfa.zzb();
                }
                i2 += 2;
                zzhj.zzc(b3, bArr[i7], cArr, i6);
                i6++;
            } else if (b3 < -16) {
                if (i7 >= i4 - 1) {
                    throw zzfa.zzb();
                }
                int i8 = i2 + 2;
                i2 += 3;
                zzhj.zzb(b3, bArr[i7], bArr[i8], cArr, i6);
                i6++;
            } else {
                if (i7 >= i4 - 2) {
                    throw zzfa.zzb();
                }
                int i9 = i2 + 2;
                int i10 = i2 + 3;
                i2 += 4;
                zzhj.zza(b3, bArr[i7], bArr[i9], bArr[i10], cArr, i6);
                i6 += 2;
            }
        }
        return new String(cArr, 0, i6);
    }

    public static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzd(byte[] bArr, int i2, int i3) {
        return zza.zzb(bArr, i2, i3);
    }
}
