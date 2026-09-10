package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1304Js {
    public static byte[] A00;
    public static String[] A01 = {"igoOoy3NY4UMRHdpx9h3UlwGdvMc0fc9", "i1My3cIv2txc6hnpPF2N9ufK5yKqcDwp", "ZPKM82HH2UhiHuE6c", "N8bcPF6", "fP1uMJr9juYIT", "Q74KZy4WGIwm3", "kYmec6ZLKDIoPLbK3wnMb68OSlbBsX7E", "P2I33wOyCa7MBOFZieFJQqH5gMHCVrks"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-17, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 13, 1, RemoteControlWriter.BLOCK_CMDOK, 21, 24, -41, -17, -19, -12, -12, -19, -14, -21, -92, -10, -23, -15, -27, -19, -14, -24, -23, -10, -92, -13, -22, -92, -15, -27, -16, -22, -13, -10, -15, -23, -24, -92, -41, -55, -51, -92, -46, -59, -48, -92, -7, -14, -19, -8, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A04(long j, C09384v c09384v, InterfaceC1238Hd[] interfaceC1238HdArr) {
        int iA0I = c09384v.A0I();
        if ((iA0I & 64) != 0) {
            c09384v.A0g(1);
            int i = (iA0I & 31) * 3;
            int iA09 = c09384v.A09();
            for (InterfaceC1238Hd interfaceC1238Hd : interfaceC1238HdArr) {
                c09384v.A0f(iA09);
                interfaceC1238Hd.AIr(c09384v, i);
                interfaceC1238Hd.AIu(j, 1, i, 0, null);
            }
        }
    }

    static {
        A02();
    }

    public static int A00(C09384v c09384v) {
        int i = 0;
        while (value != 0) {
            int iA0I = c09384v.A0I();
            i += iA0I;
            int b = A01[3].length();
            if (b == 4) {
                throw new RuntimeException();
            }
            A01[2] = "hfDUXVNQknc2urmlb";
            if (iA0I != 255) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static void A03(long j, C09384v c09384v, InterfaceC1238Hd[] interfaceC1238HdArr) {
        while (true) {
            if (c09384v.A07() > 1) {
                int iA00 = A00(c09384v);
                int iA01 = A00(c09384v);
                int iA09 = c09384v.A09() + iA01;
                if (iA01 != -1) {
                    int payloadType = c09384v.A07();
                    if (iA01 > payloadType) {
                        AbstractC09234g.A07(A01(0, 7, 109), A01(7, 45, 69));
                        iA09 = c09384v.A0A();
                    } else if (iA00 == 4 && iA01 >= 8) {
                        int userIdentifier = c09384v.A0I();
                        int providerCode = c09384v.A0M();
                        int countryCode = 0;
                        if (providerCode == 49) {
                            countryCode = c09384v.A0C();
                        }
                        int iA0I = c09384v.A0I();
                        if (providerCode == 47) {
                            c09384v.A0g(1);
                        }
                        int i = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && iA0I == 3) ? 1 : 0;
                        if (providerCode == 49) {
                            int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                            i &= userDataTypeCode;
                        }
                        if (i != 0) {
                            A04(j, c09384v, interfaceC1238HdArr);
                        }
                    }
                } else {
                    AbstractC09234g.A07(A01(0, 7, 109), A01(7, 45, 69));
                    iA09 = c09384v.A0A();
                }
                c09384v.A0f(iA09);
            } else {
                return;
            }
        }
    }
}
