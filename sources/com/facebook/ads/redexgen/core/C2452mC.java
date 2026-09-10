package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2452mC implements InterfaceC1283Ix {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C09384v A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{65, 77, 30, 25, 30, 23, 77, 30, 12, 0, 29, 1, 8, 77, 30, 4, 23, 8, 87, 77, 70, 115, 104, 106, 87, 102, 117, 116, 98, 117, 116, 9, 61, 44, 33, 39, 104, 59, 41, 37, 56, 36, 45, 104, 59, 33, 50, 45, 104, 37, 33, 59, 37, 41, 60, 43, RemoteControlWriter.BLOCK_CMDOK, 102, 104, 59, 60, 59, 44, 104, 59, 41, 37, 56, 36, 45, 104, 59, 33, 50, 45, 114, 104, 25, 13, 28, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 23, 87, 10, 25, 15};
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public C2452mC(C2453mD c2453mD, C2691qI c2691qI) {
        this.A02 = c2453mD.A00;
        this.A02.A0f(12);
        int iA0L = this.A02.A0L();
        if (A00(77, 9, 20).equals(c2691qI.A0W)) {
            int i = c2691qI.A0C;
            int fixedSampleSize = c2691qI.A06;
            int iA06 = C5C.A06(i, fixedSampleSize);
            if (iA0L != 0) {
                int fixedSampleSize2 = iA0L % iA06;
                if (fixedSampleSize2 != 0) {
                    AbstractC09234g.A07(A00(20, 11, 107), A00(31, 46, 36) + iA06 + A00(0, 20, 1) + iA0L);
                    iA0L = iA06;
                }
            } else {
                AbstractC09234g.A07(A00(20, 11, 107), A00(31, 46, 36) + iA06 + A00(0, 20, 1) + iA0L);
                iA0L = iA06;
            }
        }
        this.A00 = iA0L == 0 ? -1 : iA0L;
        int fixedSampleSize3 = this.A02.A0L();
        this.A01 = fixedSampleSize3;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1283Ix
    public final int A8A() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1283Ix
    public final int A8v() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1283Ix
    public final int AHS() {
        return this.A00 == -1 ? this.A02.A0L() : this.A00;
    }
}
