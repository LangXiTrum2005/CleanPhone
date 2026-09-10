package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1341Eo {
    public final int A00;
    public final C2690nW A01;
    public final int[] A02;
    public final int[] A03;
    public final C2690nW[] A04;
    public final String[] A05;
    public final int[][][] A06;

    public C1341Eo(String[] strArr, int[] iArr, C2690nW[] c2690nWArr, int[] iArr2, int[][][] iArr3, C2690nW c2690nW) {
        this.A05 = strArr;
        this.A03 = iArr;
        this.A04 = c2690nWArr;
        this.A06 = iArr3;
        this.A02 = iArr2;
        this.A01 = c2690nW;
        this.A00 = iArr.length;
    }

    private final int A00(int i2, int i3, int i4) {
        return this.A06[i2][i3][i4];
    }

    private final int A01(int i2, int i3, int[] iArr) {
        int i4 = 0;
        int iMin = 16;
        boolean z2 = false;
        String str = null;
        int i5 = 0;
        while (i5 < handledTrackCount) {
            int adaptiveSupport = iArr[i5];
            String firstSampleMimeType = this.A04[i2].A05(i3).A08(adaptiveSupport).A0W;
            int adaptiveSupport2 = i4 + 1;
            if (i4 == 0) {
                str = firstSampleMimeType;
            } else {
                z2 = (!C5C.A1E(str, firstSampleMimeType)) | z2;
            }
            iMin = Math.min(iMin, AbstractC11727i.A01(this.A06[i2][i3][i5]));
            i5++;
            i4 = adaptiveSupport2;
        }
        if (z2) {
            int handledTrackCount = this.A02[i2];
            return Math.min(iMin, handledTrackCount);
        }
        return iMin;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03(int i2) {
        return this.A03[i2];
    }

    public final int A04(int i2, int i3, int i4) {
        return AbstractC11727i.A03(A00(i2, i3, i4));
    }

    public final int A05(int i2, int i3, boolean z2) {
        int i4 = this.A04[i2].A05(i3).A01;
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int trackIndexCount = 0; trackIndexCount < i4; trackIndexCount++) {
            int iA04 = A04(i2, i3, trackIndexCount);
            if (iA04 == 4 || (z2 && iA04 == 3)) {
                int trackCount = i5 + 1;
                iArr[i5] = trackIndexCount;
                i5 = trackCount;
            }
        }
        int trackCount2 = A01(i2, i3, Arrays.copyOf(iArr, i5));
        return trackCount2;
    }

    public final C2690nW A06() {
        return this.A01;
    }

    public final C2690nW A07(int i2) {
        return this.A04[i2];
    }
}
