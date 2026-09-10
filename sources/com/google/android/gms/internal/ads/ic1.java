package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ic1 {
    public static nh1 a(iw0 iw0Var, ij1 ij1Var) throws GeneralSecurityException {
        zq1 zq1VarJ;
        List arrayList;
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < ((List) iw0Var.f15864b).size(); i10++) {
            cf1 cf1VarU = iw0Var.u(i10);
            if (cf1VarU.f13154b.equals(af1.f12010c)) {
                jc1 jc1Var = cf1VarU.f13153a;
                if (jc1Var instanceof lf1) {
                    zq1VarJ = ((lf1) jc1Var).j();
                } else {
                    if (!(jc1Var instanceof ni1)) {
                        String name = jc1Var.getClass().getName();
                        String strValueOf = String.valueOf(jc1Var.b());
                        throw new GeneralSecurityException(d5.u.h(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zq1VarJ = ((ni1) jc1Var).j();
                }
                mh1 mh1Var = new mh1((xe1) ij1Var.f(cf1VarU), cf1VarU.f13155c);
                byte[] bArr = zq1VarJ.f22697a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(zq1VarJ)) {
                    arrayList = (List) map.get(zq1VarJ);
                } else {
                    arrayList = new ArrayList();
                    map.put(zq1VarJ, arrayList);
                }
                arrayList.add(mh1Var);
            }
        }
        if (((Map) iw0Var.f15865c).get(pi1.class) != null) {
            throw new ClassCastException();
        }
        iw0Var.r();
        return new nh1(new dj1(map));
    }

    public static Object b(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void c(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
    }

    public static byte[] d(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            byte b10 = bArr[i10];
            byte b11 = (byte) ((b10 + b10) & 254);
            bArr2[i10] = b11;
            if (i10 < 15) {
                bArr2[i10] = (byte) (((bArr[i11] >> 7) & 1) | b11);
            }
            i10 = i11;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & TsExtractor.TS_STREAM_TYPE_E_AC3)) ^ bArr2[15]);
        return bArr2;
    }

    public static long[] e(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i10 = (int) length;
        ps1.R(length, length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int");
        long[] jArr3 = new long[i10];
        int i11 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i11, length2);
            i11 += length2;
        }
        return jArr3;
    }

    public static void f(sq1 sq1Var) throws GeneralSecurityException {
        int iOrdinal = sq1Var.ordinal();
        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(sq1Var.name())));
        }
    }

    public static final void g(cs1 cs1Var, ArrayDeque arrayDeque) {
        if (!cs1Var.B()) {
            if (!(cs1Var instanceof au1)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(cs1Var.getClass())));
            }
            au1 au1Var = (au1) cs1Var;
            g(au1Var.f12523d, arrayDeque);
            g(au1Var.f12524e, arrayDeque);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(au1.f12521h, cs1Var.q());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iG = au1.G(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((cs1) arrayDeque.peek()).q() >= iG) {
            arrayDeque.push(cs1Var);
            return;
        }
        int iG2 = au1.G(iBinarySearch);
        cs1 au1Var2 = (cs1) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((cs1) arrayDeque.peek()).q() < iG2) {
            au1Var2 = new au1((cs1) arrayDeque.pop(), au1Var2);
        }
        au1 au1Var3 = new au1(au1Var2, cs1Var);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(au1.f12521h, au1Var3.f12522c);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((cs1) arrayDeque.peek()).q() >= au1.G(iBinarySearch2 + 1)) {
                break;
            } else {
                au1Var3 = new au1((cs1) arrayDeque.pop(), au1Var3);
            }
        }
        arrayDeque.push(au1Var3);
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void i(int i10) throws GeneralSecurityException {
        if (i10 < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i10)));
        }
        if (uh1.a() && i10 != 2048 && i10 != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i10)));
        }
    }

    public static void j(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void k(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(BigInteger.valueOf(65536L)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }
}
