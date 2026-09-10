package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
public final class C1124Wc {
    public static String[] A08 = {"", "ScWYoCiezRC2Q5nQtGWhRfrUrbvBKSgN", "YQufiXUHiLD8Kt", "Bu5Ho3pt2Beqkv5a9nzzcoHTxmzs1Zgs", "6judr2YU8rsiJ0SdSKhnt0", "BRfv1tYZDd171UI5Y06sJe75UDD3JxlH", "E76Kc7sCavnqAB", "o4zmgHsgOWVhxMGFU3H54O9BPM4Ax5ne"};
    public final int A00;
    public final int A01;
    public final long A02;
    public final WZ A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public C1124Wc(WZ wz, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        AbstractC1517es.A07(iArr.length == jArr2.length);
        AbstractC1517es.A07(jArr.length == jArr2.length);
        AbstractC1517es.A07(iArr2.length == jArr2.length);
        this.A03 = wz;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int A00(long j) {
        for (int i = AbstractC1600gE.A0L(this.A07, j, true, false); i >= 0; i--) {
            int startIndex = this.A04[i];
            if ((startIndex & 1) != 0) {
                return i;
            }
        }
        return -1;
    }

    public final int A01(long j) {
        int iA0K = AbstractC1600gE.A0K(this.A07, j, true, false);
        while (true) {
            long[] jArr = this.A07;
            String[] strArr = A08;
            String str = strArr[4];
            String str2 = strArr[6];
            int i = str.length();
            int startIndex = str2.length();
            if (i == startIndex) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "YzuIBxcPkfOvqp9YMSnYrD";
            strArr2[6] = "3oBfAjz8zE6f0n";
            int startIndex2 = jArr.length;
            if (iA0K >= startIndex2) {
                if (A08[5].charAt(14) != 'I') {
                    String[] strArr3 = A08;
                    strArr3[4] = "UoFNTWRExsCWZAlSLq9d15";
                    strArr3[6] = "7k0SppCQcpKXvw";
                    return -1;
                }
                A08[5] = "vlfjPCDT9qQ0c8IPismj1tFW3xMzfPwl";
                return -1;
            }
            int startIndex3 = this.A04[iA0K];
            if ((startIndex3 & 1) != 0) {
                return iA0K;
            }
            iA0K++;
        }
    }
}
