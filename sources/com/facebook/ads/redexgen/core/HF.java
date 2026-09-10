package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class HF {
    public static String[] A00 = {"o6dy0jxWVFoVpdfIHLQ5kJFOMlq1Sn1Q", "79oj", "9g10QGOLUMPWkkbPiEKlPZ6GdmncXBXa", "6fmIgIVXmOYY3cUB7ZYAXnWSgE20TitB", "v6a7Yb3DANDL70kkwlzLnkI1heNzynkm", "eDdjZQkAYxVEYJ3d9Q78IvgSo191T7ve", "sHmXnPOOobIrXpWrquJBTDw1maWJKk3u", "k0vF7vRBeJQaOBXZ"};

    public static int A00(C11074v c11074v, int i2) {
        switch (i2) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return c11074v.A0I() + 1;
            case 7:
                int iA0M = c11074v.A0M();
                String[] strArr = A00;
                if (strArr[6].charAt(23) != strArr[4].charAt(23)) {
                    throw new RuntimeException();
                }
                A00[7] = "hcXiJWofr5Txci555yuma5X";
                return iA0M + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static long A01(InterfaceC2651ms interfaceC2651ms, HJ hj) throws IOException {
        interfaceC2651ms.AIl();
        boolean z2 = true;
        interfaceC2651ms.A47(1);
        byte[] bArr = new byte[1];
        interfaceC2651ms.AGt(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z2 = false;
        }
        interfaceC2651ms.A47(2);
        int i2 = z2 ? 7 : 6;
        C11074v c11074v = new C11074v(i2);
        c11074v.A0e(HB.A00(interfaceC2651ms, c11074v.A0l(), 0, i2));
        interfaceC2651ms.AIl();
        HE he = new HE();
        boolean isBlockSizeVariable = A08(c11074v, hj, z2, he);
        if (isBlockSizeVariable) {
            return he.A00;
        }
        throw C3K.A01(null, null);
    }

    public static boolean A02(int i2, HJ hj) {
        if (i2 == 0) {
            return true;
        }
        int i3 = hj.A01;
        if (A00[7].length() == 8) {
            throw new RuntimeException();
        }
        A00[0] = "dnyA5Em4Vekc9hKZNMMqKWCBR5ivXppC";
        return i2 == i3;
    }

    public static boolean A03(int i2, HJ hj) {
        if (i2 <= 7) {
            return i2 == hj.A02 - 1;
        }
        if (A00[3].charAt(10) != 'Y') {
            throw new RuntimeException();
        }
        A00[3] = "e0AkGTV6jhYRPjlSs9AVJSXBXenCNngQ";
        return i2 <= 10 && hj.A02 == 2;
    }

    public static boolean A04(C11074v c11074v, int i2) {
        int iA0I = c11074v.A0I();
        int crc = c11074v.A09();
        return iA0I == C5C.A0J(c11074v.A0l(), i2, crc + (-1), 0);
    }

    public static boolean A05(C11074v c11074v, HJ hj, int i2) {
        int iA00 = A00(c11074v, i2);
        if (iA00 != -1) {
            int blockSizeSamples = hj.A03;
            if (iA00 <= blockSizeSamples) {
                return true;
            }
        }
        return false;
    }

    public static boolean A06(C11074v c11074v, HJ hj, int i2) {
        int sampleRate = hj.A07;
        if (i2 == 0) {
            return true;
        }
        if (i2 <= 11) {
            return i2 == hj.A08;
        }
        if (i2 == 12) {
            return c11074v.A0I() * 1000 == sampleRate;
        }
        if (i2 > 14) {
            return false;
        }
        int expectedSampleRate = c11074v.A0M();
        if (i2 == 14) {
            expectedSampleRate *= 10;
        }
        return expectedSampleRate == sampleRate;
    }

    public static boolean A07(C11074v c11074v, HJ hj, int i2, HE he) {
        int iA09 = c11074v.A09();
        long jA0Q = c11074v.A0Q();
        long frameHeaderBytes = jA0Q >>> 16;
        if (frameHeaderBytes != i2) {
            return false;
        }
        int blockSizeKey = (int) ((jA0Q >> 8) & 15);
        long frameHeaderBytes2 = jA0Q >> 1;
        int frameStartPosition = (int) (frameHeaderBytes2 & 7);
        return A03((int) ((jA0Q >> 4) & 15), hj) && A02(frameStartPosition, hj) && !(((jA0Q & 1) > 1L ? 1 : ((jA0Q & 1) == 1L ? 0 : -1)) == 0) && A08(c11074v, hj, (((jA0Q >>> 16) & 1) > 1L ? 1 : (((jA0Q >>> 16) & 1) == 1L ? 0 : -1)) == 0, he) && A05(c11074v, hj, (int) ((jA0Q >> 12) & 15)) && A06(c11074v, hj, blockSizeKey) && A04(c11074v, iA09);
    }

    public static boolean A08(C11074v c11074v, HJ hj, boolean z2, HE he) {
        long utf8Value;
        try {
            long jA0S = c11074v.A0S();
            if (z2) {
                utf8Value = jA0S;
            } else {
                long utf8Value2 = hj.A03;
                utf8Value = utf8Value2 * jA0S;
            }
            he.A00 = utf8Value;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean A09(InterfaceC2651ms interfaceC2651ms, HJ hj, int i2, HE he) throws IOException {
        long jA8i = interfaceC2651ms.A8i();
        byte[] bArr = new byte[2];
        interfaceC2651ms.AGt(bArr, 0, 2);
        if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != i2) {
            interfaceC2651ms.AIl();
            interfaceC2651ms.A47((int) (jA8i - interfaceC2651ms.A8n()));
            return false;
        }
        C11074v c11074v = new C11074v(16);
        System.arraycopy(bArr, 0, c11074v.A0l(), 0, 2);
        byte[] frameStartBytes = c11074v.A0l();
        c11074v.A0e(HB.A00(interfaceC2651ms, frameStartBytes, 2, 14));
        interfaceC2651ms.AIl();
        interfaceC2651ms.A47((int) (jA8i - interfaceC2651ms.A8n()));
        return A07(c11074v, hj, i2, he);
    }
}
