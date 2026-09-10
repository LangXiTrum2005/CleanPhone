package com.google.crypto.tink.subtle;

import affiche.cutely;
import com.inmobi.media.core.config.models.AdConfig;
import hobby.competently;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class EllipticCurves {

    public enum CurveType {
        NIST_P256,
        NIST_P384,
        NIST_P521
    }

    public enum EcdsaEncoding {
        IEEE_P1363,
        DER
    }

    public static boolean apical(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        if (bArr.length < 8 || bArr[0] != 48) {
            return false;
        }
        int i5 = bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i5 == 129) {
            i5 = bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i5 < 128) {
                return false;
            }
            i = 2;
        } else {
            if (i5 == 128 || i5 > 129) {
                return false;
            }
            i = 1;
        }
        if (i5 != (bArr.length - 1) - i || bArr[i + 1] != 2 || (i4 = (i3 = i + 3 + (i2 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + 1) >= bArr.length || i2 == 0) {
            return false;
        }
        int i6 = i + 3;
        byte b = bArr[i6];
        if ((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >= 128) {
            return false;
        }
        if ((i2 > 1 && b == 0 && (bArr[i + 4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 128) || bArr[i6 + i2] != 2) {
            return false;
        }
        int i7 = bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i3 + 2 + i7 != bArr.length || i7 == 0) {
            return false;
        }
        byte b2 = bArr[i + 5 + i2];
        if ((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >= 128) {
            return false;
        }
        return i7 <= 1 || b2 != 0 || (bArr[(i + 6) + i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >= 128;
    }

    public static byte[] attabal(byte[] bArr, int i) throws GeneralSecurityException {
        if (!apical(bArr)) {
            throw new GeneralSecurityException("Invalid DER encoding");
        }
        byte[] bArr2 = new byte[i];
        int i2 = (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >= 128 ? 3 : 2;
        int i3 = i2 + 1;
        int i4 = i2 + 2;
        int i5 = bArr[i3];
        int i6 = bArr[i4] == 0 ? 1 : 0;
        System.arraycopy(bArr, i4 + i6, bArr2, ((i / 2) - i5) + i6, i5 - i6);
        int i7 = i4 + i5 + 1;
        int i8 = i7 + 1;
        int i9 = bArr[i7];
        int i10 = bArr[i8] != 0 ? 0 : 1;
        System.arraycopy(bArr, i8 + i10, bArr2, (i - i9) + i10, i9 - i10);
        return bArr2;
    }

    public static ECParameterSpec beachfront(CurveType curveType) throws NoSuchAlgorithmException {
        int iOrdinal = curveType.ordinal();
        if (iOrdinal == 0) {
            return impromptu();
        }
        if (iOrdinal == 1) {
            return taiyuan();
        }
        if (iOrdinal == 2) {
            return cutely();
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + curveType);
    }

    public static BigInteger competently(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return competently.wireman(ellipticCurve);
    }

    public static ECParameterSpec cutely() {
        return competently.f27753dern;
    }

    public static int dern(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return competently(ellipticCurve).subtract(BigInteger.ONE).bitLength();
    }

    public static byte[] formularize(byte[] bArr) {
        int length = 0;
        while (length < bArr.length && bArr[length] == 0) {
            length++;
        }
        if (length == bArr.length) {
            length = bArr.length - 1;
        }
        int i = (bArr[length] & 128) == 128 ? 1 : 0;
        byte[] bArr2 = new byte[(bArr.length - length) + i];
        System.arraycopy(bArr, length, bArr2, i, bArr.length - length);
        return bArr2;
    }

    public static ECParameterSpec impromptu() {
        return competently.f27750attabal;
    }

    public static KeyPair marial(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorAttabal = cutely.f3857competently.attabal("EC");
        keyPairGeneratorAttabal.initialize(eCParameterSpec);
        return keyPairGeneratorAttabal.generateKeyPair();
    }

    public static byte[] saneness(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i;
        if (bArr.length % 2 != 0 || bArr.length == 0 || bArr.length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        byte[] bArrFormularize = formularize(Arrays.copyOf(bArr, bArr.length / 2));
        byte[] bArrFormularize2 = formularize(Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
        int length = bArrFormularize.length + 4 + bArrFormularize2.length;
        if (length >= 128) {
            bArr2 = new byte[length + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) length;
            i = 3;
        } else {
            bArr2 = new byte[length + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) length;
            i = 2;
        }
        int i2 = i + 1;
        bArr2[i] = 2;
        int i3 = i + 2;
        bArr2[i2] = (byte) bArrFormularize.length;
        System.arraycopy(bArrFormularize, 0, bArr2, i3, bArrFormularize.length);
        int length2 = i3 + bArrFormularize.length;
        bArr2[length2] = 2;
        bArr2[length2 + 1] = (byte) bArrFormularize2.length;
        System.arraycopy(bArrFormularize2, 0, bArr2, length2 + 2, bArrFormularize2.length);
        return bArr2;
    }

    public static ECParameterSpec taiyuan() {
        return competently.f27755saneness;
    }

    public static int wireman(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (dern(ellipticCurve) + 7) / 8;
    }
}
