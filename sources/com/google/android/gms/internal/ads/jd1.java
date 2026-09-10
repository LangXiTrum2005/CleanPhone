package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jd1 {
    public static /* synthetic */ String a(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static Date b(long j10) {
        return new Date((j10 - 2082844800) * 1000);
    }

    public static byte[] d(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 + i10;
            int iDigit = Character.digit(str.charAt(i11), 16);
            int iDigit2 = Character.digit(str.charAt(i11 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i10] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static byte[] e(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static int g(boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            i12 i12Var = new i12();
            i12Var.e("video/avc");
            g22 g22Var = new g22(i12Var);
            if (g22Var.f14678o != null) {
                ya1 ya1VarB = z22.b(b02.f12591h, g22Var, z10, false);
                for (int i10 = 0; i10 < ya1VarB.f22210d; i10++) {
                    if (((p22) ya1VarB.get(i10)).f18455d != null && (videoCapabilities = ((p22) ya1VarB.get(i10)).f18455d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
                            if (supportedPerformancePoints.get(i11).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (v22 unused) {
        }
        return 0;
    }

    public static ff1 h(byte[] bArr) throws GeneralSecurityException {
        try {
            ks1 ks1Var = ks1.f16518a;
            int i10 = tr1.f20473a;
            wm1 wm1VarC = wm1.C(bArr, ks1.f16519b);
            vi1 vi1Var = vi1.f21181b;
            zq1 zq1VarB = rj1.b(wm1VarC.z());
            lj1 lj1Var = new lj1(0, wm1VarC, zq1VarB);
            qj1 qj1Var = (qj1) vi1Var.f21182a.get();
            qj1Var.getClass();
            return !qj1Var.f19113d.containsKey(new oj1(lj1.class, zq1VarB)) ? new oi1(lj1Var) : vi1Var.g(lj1Var);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] i(BigInteger bigInteger, int i10) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i10) {
            return byteArray;
        }
        int i11 = i10 + 1;
        if (length > i11) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i11) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(byteArray, 0, bArr, i10 - length, length);
        return bArr;
    }

    public abstract void c(id1 id1Var, Set set);

    public abstract int f(id1 id1Var);
}
