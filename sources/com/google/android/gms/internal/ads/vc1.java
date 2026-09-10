package com.google.android.gms.internal.ads;

import android.os.Build;
import com.ironsource.Xa;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vc1 {
    public static iw0 a(String str) throws GeneralSecurityException {
        String str2;
        try {
            try {
                byte[] bArrB = new ze1(new ByteArrayInputStream(str.getBytes(ze1.f22592b))).a().b();
                try {
                    ks1 ks1Var = ks1.f16518a;
                    int i10 = tr1.f20473a;
                    bn1 bn1VarD = bn1.D(bArrB, ks1.f16519b);
                    for (an1 an1Var : bn1VarD.A()) {
                        if (an1Var.A().B() == 1 || an1Var.A().B() == 2 || an1Var.A().B() == 3) {
                            switch (an1Var.A().B()) {
                                case 1:
                                    str2 = "UNKNOWN_KEYMATERIAL";
                                    break;
                                case 2:
                                    str2 = "SYMMETRIC";
                                    break;
                                case 3:
                                    str2 = "ASYMMETRIC_PRIVATE";
                                    break;
                                case 4:
                                    str2 = "ASYMMETRIC_PUBLIC";
                                    break;
                                case 5:
                                    str2 = "REMOTE";
                                    break;
                                case 6:
                                    str2 = "UNRECOGNIZED";
                                    break;
                                default:
                                    throw null;
                            }
                            throw new GeneralSecurityException("keyset contains key material of type " + str2 + " for type url " + an1Var.A().z());
                        }
                    }
                    return iw0.d(bn1VarD);
                } catch (et1 unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (et1 unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    public static BigDecimal b(String str) {
        h(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < Xa.f27908s) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static void c() {
        try {
            if (uh1.a()) {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static boolean e(int i10) {
        if (i10 == 8 || i10 == 7) {
            return true;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || !(i10 == 26 || i10 == 27)) {
            return i11 >= 33 && i10 == 30;
        }
        return true;
    }

    public static ECParameterSpec f(mq1 mq1Var) throws NoSuchAlgorithmException {
        int iOrdinal = mq1Var.ordinal();
        if (iOrdinal == 0) {
            return zh1.f22621a;
        }
        if (iOrdinal == 1) {
            return zh1.f22622b;
        }
        if (iOrdinal == 2) {
            return zh1.f22623c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(mq1Var.toString()));
    }

    public static void h(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        throw new NumberFormatException(q4.a.j(new StringBuilder(String.valueOf(strSubstring).length() + 28), "Number string too large: ", strSubstring, "..."));
    }

    public static byte[] j(byte[] bArr) {
        int length;
        int i10 = 0;
        while (true) {
            length = bArr.length;
            if (i10 >= length || bArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == length) {
            i10 = length - 1;
        }
        int i11 = (bArr[i10] & 128) == 128 ? 1 : 0;
        int i12 = length - i10;
        byte[] bArr2 = new byte[i12 + i11];
        System.arraycopy(bArr, i10, bArr2, i11, i12);
        return bArr2;
    }

    public static boolean m(byte b10) {
        return b10 > -65;
    }

    public abstract void d(cd1 cd1Var, Thread thread);

    public abstract void g(cd1 cd1Var, cd1 cd1Var2);

    public abstract boolean i(dd1 dd1Var, cd1 cd1Var, cd1 cd1Var2);

    public abstract boolean k(uc1 uc1Var, rc1 rc1Var, rc1 rc1Var2);

    public abstract cd1 l(uc1 uc1Var);

    public abstract rc1 n(uc1 uc1Var);

    public abstract boolean o(dd1 dd1Var, Object obj, Object obj2);
}
