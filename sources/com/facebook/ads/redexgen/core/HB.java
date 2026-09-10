package com.facebook.ads.redexgen.core;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class HB {
    public static String[] A00 = {"", "JBqvX3ouZOOCqox6TCkHsUUnq79xKaTL", "x", "BIUpfUNI3eVa3mY8ect95XlwPu2Ofuw", "eTPSYv4hujFcnfJKGeeHsnhQxUvQ5rkD", "uOymuGwhHDkcqDuJ17", "MFseKYUy643KM5DvrPXxmzbMJL0nMbh3", "ti0zz4"};

    public static int A00(InterfaceC2651ms interfaceC2651ms, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i4 < i3) {
            int totalBytesPeeked = i3 - i4;
            int iAGs = interfaceC2651ms.AGs(bArr, i2 + i4, totalBytesPeeked);
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[4];
            int iCharAt = str.charAt(19);
            int totalBytesPeeked2 = str2.charAt(19);
            if (iCharAt != totalBytesPeeked2) {
                throw new RuntimeException();
            }
            A00[6] = "xnIrdLQGczxEK23FHKuSo6llrjoojLCP";
            if (iAGs == -1) {
                break;
            }
            i4 += iAGs;
        }
        return i4;
    }

    @Pure
    public static void A01(boolean z2, String str) throws C3K {
        if (z2) {
        } else {
            throw C3K.A01(str, null);
        }
    }

    public static boolean A02(InterfaceC2651ms interfaceC2651ms, int i2) throws IOException {
        try {
            interfaceC2651ms.AK3(i2);
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[3] = "SfDhdqvr0QmEID8ZIpBFjoMfbavps9";
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean A03(InterfaceC2651ms interfaceC2651ms, byte[] bArr, int i2, int i3) throws IOException {
        try {
            interfaceC2651ms.readFully(bArr, i2, i3);
            return true;
        } catch (EOFException unused) {
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[6] = "fFP2kzBTuIshDEJva9vOOxjFjEDNGXev";
            return false;
        }
    }

    public static boolean A04(InterfaceC2651ms interfaceC2651ms, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        try {
            return interfaceC2651ms.AGu(bArr, i2, i3, z2);
        } catch (EOFException e2) {
            if (!z2) {
                throw e2;
            }
            if (A00[3].length() == 20) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "24rmiB";
            strArr[5] = "kHyj46IkHv9Sbvkaop";
            return false;
        }
    }
}
