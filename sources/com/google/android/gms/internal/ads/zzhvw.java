package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvw {
    public static byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i2;
        int length = bArr.length;
        if ((length & 1) != 0 || length == 0 || length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        int i3 = length >> 1;
        byte[] bArrZzc = zzc(Arrays.copyOf(bArr, i3));
        byte[] bArrZzc2 = zzc(Arrays.copyOfRange(bArr, i3, length));
        int length2 = bArrZzc.length;
        int length3 = bArrZzc2.length;
        int i4 = length2 + 4 + length3;
        if (i4 >= 128) {
            bArr2 = new byte[i4 + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) i4;
            i2 = 3;
        } else {
            bArr2 = new byte[i4 + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) i4;
            i2 = 2;
        }
        int i5 = i2 + 1;
        bArr2[i2] = 2;
        int i6 = i2 + 2;
        bArr2[i5] = (byte) length2;
        System.arraycopy(bArrZzc, 0, bArr2, i6, length2);
        int i7 = i6 + length2;
        bArr2[i7] = 2;
        bArr2[i7 + 1] = (byte) length3;
        System.arraycopy(bArrZzc2, 0, bArr2, i7 + 2, length3);
        return bArr2;
    }

    public static ECParameterSpec zzb(zzhvu zzhvuVar) throws NoSuchAlgorithmException {
        int iOrdinal = zzhvuVar.ordinal();
        if (iOrdinal == 0) {
            return zzhhq.zza;
        }
        if (iOrdinal == 1) {
            return zzhhq.zzb;
        }
        if (iOrdinal == 2) {
            return zzhhq.zzc;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(zzhvuVar.toString()));
    }

    private static byte[] zzc(byte[] bArr) {
        int length;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i2 >= length || bArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == length) {
            i2 = length - 1;
        }
        int i3 = (bArr[i2] & 128) == 128 ? 1 : 0;
        int i4 = length - i2;
        byte[] bArr2 = new byte[i4 + i3];
        System.arraycopy(bArr, i2, bArr2, i3, i4);
        return bArr2;
    }
}
