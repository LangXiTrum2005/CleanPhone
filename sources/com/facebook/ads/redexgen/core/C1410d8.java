package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1410d8 {
    public final int A00;
    public final C0992Qs A01;
    public final int[] A02;
    public final int[] A03;
    public final C0992Qs[] A04;
    public final String[] A05;
    public final int[][][] A06;

    public C1410d8(String[] strArr, int[] iArr, C0992Qs[] c0992QsArr, int[] iArr2, int[][][] iArr3, C0992Qs c0992Qs) {
        this.A05 = strArr;
        this.A03 = iArr;
        this.A04 = c0992QsArr;
        this.A06 = iArr3;
        this.A02 = iArr2;
        this.A01 = c0992Qs;
        this.A00 = iArr.length;
    }

    private final int A00(int i, int i2, int i3) {
        return this.A06[i][i2][i3];
    }

    private final int A01(int i, int i2, int[] iArr) {
        int i3 = 0;
        int iMin = 16;
        boolean z = false;
        String str = null;
        int i4 = 0;
        while (i4 < handledTrackCount) {
            int adaptiveSupport = iArr[i4];
            String firstSampleMimeType = this.A04[i].A05(i2).A08(adaptiveSupport).A0W;
            int adaptiveSupport2 = i3 + 1;
            if (i3 == 0) {
                str = firstSampleMimeType;
            } else {
                z = (!AbstractC1600gE.A1E(str, firstSampleMimeType)) | z;
            }
            iMin = Math.min(iMin, AbstractC0976Qb.A01(this.A06[i][i2][i4]));
            i4++;
            i3 = adaptiveSupport2;
        }
        if (z) {
            int handledTrackCount = this.A02[i];
            return Math.min(iMin, handledTrackCount);
        }
        return iMin;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03(int i) {
        return this.A03[i];
    }

    public final int A04(int i, int i2, int i3) {
        return AbstractC0976Qb.A03(A00(i, i2, i3));
    }

    public final int A05(int i, int i2, boolean z) {
        int i3 = this.A04[i].A05(i2).A01;
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int trackIndexCount = 0; trackIndexCount < i3; trackIndexCount++) {
            int iA04 = A04(i, i2, trackIndexCount);
            if (iA04 == 4 || (z && iA04 == 3)) {
                int trackCount = i4 + 1;
                iArr[i4] = trackIndexCount;
                i4 = trackCount;
            }
        }
        int trackCount2 = A01(i, i2, Arrays.copyOf(iArr, i4));
        return trackCount2;
    }

    public final C0992Qs A06() {
        return this.A01;
    }

    public final C0992Qs A07(int i) {
        return this.A04[i];
    }
}
