package com.facebook.ads.redexgen.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1044Ss implements Y7 {
    public static byte[] A0E;
    public static String[] A0F = {"A7Ro0y03nGBLMXhLzpqB7ezLM0Eq9ZJa", "DBJZvzxQZdTGwrM2nnttFpCciKTmS3Wr", "XIJG2TEBJBeSxMATaHaAer2kHwHpgtWT", "fOE4wvmz7EQC520WAcs", "73WCylrr5Tq55CEyW6vUl8qm40NbK7", "njPjYPFAENEnULst", "mARM0Pb7XaKFsrpMoTV7zI5FW9", "uG7SXHb7yCkg98"};
    public long A01;
    public InterfaceC1086Uo A02;
    public YF A03;
    public String A04;
    public boolean A05;
    public final YL A0B;
    public final boolean[] A0D = new boolean[3];
    public final YG A0A = new YG(32, 128);
    public final YG A08 = new YG(33, 128);
    public final YG A06 = new YG(34, 128);
    public final YG A07 = new YG(39, 128);
    public final YG A09 = new YG(40, 128);
    public long A00 = C.TIME_UNSET;
    public final C1576fq A0C = new C1576fq();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0E = new byte[]{124, 6, 2, 1, 102, 81, 85, 80, 81, 70, 117, 78, 69, 88, 80, 69, 67, 84, 69, 68, 0, 65, 83, 80, 69, 67, 84, 127, 82, 65, 84, 73, 79, 127, 73, 68, 67, 0, 86, 65, 76, 85, 69, 26, 0, 37, 58, 55, 54, 60, 124, 59, 54, 37, 48};
    }

    static {
        A03();
    }

    public C1044Ss(YL yl) {
        this.A0B = yl;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:109:0x02be  */
    /* JADX WARN: Code duplicated, block: B:111:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:11:0x008a  */
    /* JADX WARN: Code duplicated, block: B:77:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e6  */
    public static ZM A00(String str, YG yg, YG yg2, YG yg3) {
        int iA05;
        int chromaFormatIdc;
        float[] fArr;
        int iA06;
        int iA07;
        byte[] bArr = new byte[yg.A00 + yg2.A00 + yg3.A00];
        System.arraycopy(yg.A01, 0, bArr, 0, yg.A00);
        System.arraycopy(yg2.A01, 0, bArr, yg.A00, yg2.A00);
        System.arraycopy(yg3.A01, 0, bArr, yg.A00 + yg2.A00, yg3.A00);
        C1080Uf c1080Uf = new C1080Uf(yg2.A01, 0, yg2.A00);
        c1080Uf.A07(44);
        int i = c1080Uf.A05(3);
        c1080Uf.A06();
        int iA08 = c1080Uf.A05(2);
        boolean zA0A = c1080Uf.A0A();
        int generalProfileCompatibilityFlags = c1080Uf.A05(5);
        int generalLevelIdc = 0;
        int i2 = 0;
        while (true) {
            if (A0F[4].length() == 0) {
                break;
            }
            A0F[2] = "nlYgPGB4J95zDGsDC83xAcUzQwR1a0Fo";
            if (i2 < 32) {
                boolean zA0A2 = c1080Uf.A0A();
                if (A0F[4].length() != 0) {
                    String[] strArr = A0F;
                    strArr[5] = "X4OQWTUdjA1PjT2l";
                    strArr[7] = "car4ib4BTauHRH";
                    if (zA0A2) {
                        generalLevelIdc |= 1 << i2;
                    }
                } else {
                    A0F[3] = "";
                    if (zA0A2) {
                        generalLevelIdc |= 1 << i2;
                    }
                }
                i2++;
            } else {
                int[] iArr = new int[6];
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    iArr[i3] = c1080Uf.A05(8);
                }
                int toSkip = c1080Uf.A05(8);
                if (A0F[2].charAt(25) != 'w') {
                    throw new RuntimeException();
                }
                A0F[2] = "cmXz0Xxp4I7VMXO7aiDn9mJ2DwDPsing";
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    if (c1080Uf.A0A()) {
                        i4 += 89;
                    }
                    if (c1080Uf.A0A()) {
                        i4 += 8;
                    }
                }
                c1080Uf.A07(i4);
                if (i > 0) {
                    int i6 = (8 - i) * 2;
                    String[] strArr2 = A0F;
                    if (strArr2[5].length() != strArr2[7].length()) {
                        A0F[1] = "9o34HO3qkb71Cphb4GUyHDbZa9KphVV8";
                        c1080Uf.A07(i6);
                    } else {
                        c1080Uf.A07(i6);
                    }
                }
                c1080Uf.A04();
                int iA04 = c1080Uf.A04();
                if (iA04 == 3) {
                    c1080Uf.A06();
                }
                int maxSubLayersMinus1 = c1080Uf.A04();
                int picHeightInLumaSamples = c1080Uf.A04();
                if (c1080Uf.A0A()) {
                    int generalProfileSpace = c1080Uf.A04();
                    int iA09 = c1080Uf.A04();
                    int toSkip2 = c1080Uf.A04();
                    int iA010 = c1080Uf.A04();
                    int subHeightC = (iA04 == 1 || iA04 == 2) ? 2 : 1;
                    maxSubLayersMinus1 -= (generalProfileSpace + iA09) * subHeightC;
                    picHeightInLumaSamples -= (toSkip2 + iA010) * (iA04 == 1 ? 2 : 1);
                }
                c1080Uf.A04();
                c1080Uf.A04();
                int iA011 = c1080Uf.A04();
                for (int picHeightInLumaSamples2 = c1080Uf.A0A() ? 0 : i; picHeightInLumaSamples2 <= i; picHeightInLumaSamples2++) {
                    c1080Uf.A04();
                    c1080Uf.A04();
                    c1080Uf.A04();
                }
                c1080Uf.A04();
                c1080Uf.A04();
                c1080Uf.A04();
                c1080Uf.A04();
                c1080Uf.A04();
                c1080Uf.A04();
                if (c1080Uf.A0A() && c1080Uf.A0A()) {
                    A06(c1080Uf);
                }
                c1080Uf.A07(2);
                if (c1080Uf.A0A()) {
                    c1080Uf.A07(8);
                    c1080Uf.A04();
                    c1080Uf.A04();
                    c1080Uf.A06();
                }
                A07(c1080Uf);
                if (c1080Uf.A0A()) {
                    for (int i7 = 0; i7 < c1080Uf.A04(); i7++) {
                        c1080Uf.A07(iA011 + 4 + 1);
                    }
                }
                c1080Uf.A07(2);
                float f = 1.0f;
                if (c1080Uf.A0A()) {
                    boolean scalingListEnabled = c1080Uf.A0A();
                    if (A0F[3].length() != 29) {
                        A0F[3] = "UJgyKAePiw74fLmD91DQwV7HHIAPMrd";
                        if (scalingListEnabled) {
                            iA05 = c1080Uf.A05(8);
                            if (iA05 == 255) {
                                iA06 = c1080Uf.A05(16);
                                iA07 = c1080Uf.A05(16);
                                if (iA06 != 0 && iA07 != 0) {
                                    f = iA06 / iA07;
                                }
                            } else {
                                chromaFormatIdc = AbstractC1078Ud.A04.length;
                                if (iA05 < chromaFormatIdc) {
                                    fArr = AbstractC1078Ud.A04;
                                    if (A0F[2].charAt(25) != 'w') {
                                        throw new RuntimeException();
                                    }
                                    A0F[2] = "ftcObRVgoMByQgSurH31jXndJwRpyPAk";
                                    f = fArr[iA05];
                                } else {
                                    AbstractC1561fb.A07(A01(0, 10, 92), A01(10, 35, 72) + iA05);
                                }
                            }
                        }
                    } else if (scalingListEnabled) {
                        iA05 = c1080Uf.A05(8);
                        if (iA05 == 255) {
                            iA06 = c1080Uf.A05(16);
                            iA07 = c1080Uf.A05(16);
                            if (iA06 != 0) {
                                f = iA06 / iA07;
                            }
                        } else {
                            chromaFormatIdc = AbstractC1078Ud.A04.length;
                            if (iA05 < chromaFormatIdc) {
                                fArr = AbstractC1078Ud.A04;
                                if (A0F[2].charAt(25) != 'w') {
                                    throw new RuntimeException();
                                }
                                A0F[2] = "ftcObRVgoMByQgSurH31jXndJwRpyPAk";
                                f = fArr[iA05];
                            } else {
                                AbstractC1561fb.A07(A01(0, 10, 92), A01(10, 35, 72) + iA05);
                            }
                        }
                    }
                    boolean scalingListEnabled2 = c1080Uf.A0A();
                    if (A0F[3].length() == 29) {
                        throw new RuntimeException();
                    }
                    A0F[2] = "cvXIvmttlzmlJlIuRPYxwpIIqw0qYSVB";
                    if (scalingListEnabled2) {
                        c1080Uf.A06();
                    }
                    if (c1080Uf.A0A()) {
                        c1080Uf.A07(4);
                        if (c1080Uf.A0A()) {
                            c1080Uf.A07(24);
                        }
                    }
                    if (c1080Uf.A0A()) {
                        c1080Uf.A04();
                        c1080Uf.A04();
                    }
                    c1080Uf.A06();
                    if (A0F[4].length() == 0) {
                        break;
                    }
                    A0F[4] = RequestConfiguration.MAX_AD_CONTENT_RATING_G;
                    if (c1080Uf.A0A()) {
                        picHeightInLumaSamples *= 2;
                        String[] strArr3 = A0F;
                        if (strArr3[5].length() != strArr3[7].length()) {
                            A0F[4] = "eaCnidCzsFZGUT6hF5Y8";
                        }
                    }
                }
                return new P5().A0y(str).A11(A01(45, 10, 59)).A0w(AbstractC1525f0.A03(iA08, zA0A, generalProfileCompatibilityFlags, generalLevelIdc, iArr, toSkip)).A0r(maxSubLayersMinus1).A0f(picHeightInLumaSamples).A0Y(f).A12(Collections.singletonList(bArr)).A14();
            }
        }
        throw new RuntimeException();
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void A02() {
        AbstractC1517es.A02(this.A02);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void A04(long j, int i, int i2, long j2) {
        this.A03.A05(j, i, this.A05);
        if (!this.A05) {
            this.A0A.A04(i2);
            this.A08.A04(i2);
            this.A06.A04(i2);
            if (this.A0A.A03() && this.A08.A03() && this.A06.A03()) {
                this.A02.A6U(A00(this.A04, this.A0A, this.A08, this.A06));
                this.A05 = true;
            }
        }
        if (this.A07.A04(i2)) {
            this.A0C.A0j(this.A07.A01, AbstractC1078Ud.A02(this.A07.A01, this.A07.A00));
            this.A0C.A0g(5);
            this.A0B.A02(j2, this.A0C);
        }
        if (this.A09.A04(i2)) {
            this.A0C.A0j(this.A09.A01, AbstractC1078Ud.A02(this.A09.A01, this.A09.A00));
            this.A0C.A0g(5);
            this.A0B.A02(j2, this.A0C);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A05(long j, int i, int i2, long j2) {
        this.A03.A04(j, i, i2, j2, this.A05);
        if (!this.A05) {
            this.A0A.A01(i2);
            this.A08.A01(i2);
            this.A06.A01(i2);
        }
        this.A07.A01(i2);
        this.A09.A01(i2);
    }

    public static void A06(C1080Uf c1080Uf) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int matrixId = 1;
                if (!c1080Uf.A0A()) {
                    c1080Uf.A04();
                } else {
                    int sizeId = i << 1;
                    int iMin = Math.min(64, 1 << (sizeId + 4));
                    if (i > 1) {
                        c1080Uf.A03();
                    }
                    for (int sizeId2 = 0; sizeId2 < iMin; sizeId2++) {
                        c1080Uf.A03();
                    }
                }
                if (i == 3) {
                    matrixId = 3;
                }
                i2 += matrixId;
            }
        }
    }

    public static void A07(C1080Uf c1080Uf) {
        int iA04 = c1080Uf.A04();
        boolean zA0A = false;
        int numPositivePics = 0;
        for (int numNegativePics = 0; numNegativePics < iA04; numNegativePics++) {
            if (numNegativePics != 0) {
                zA0A = c1080Uf.A0A();
            }
            if (zA0A) {
                c1080Uf.A06();
                if (A0F[4].length() != 0) {
                    String[] strArr = A0F;
                    strArr[5] = "XpXsSkqOGYdsCrDt";
                    strArr[7] = "t3oTu9GqZJzzAD";
                    c1080Uf.A04();
                    for (int stRpsIdx = 0; stRpsIdx <= numPositivePics; stRpsIdx++) {
                        boolean zA0A2 = c1080Uf.A0A();
                        String[] strArr2 = A0F;
                        String str = strArr2[5];
                        String str2 = strArr2[7];
                        int length = str.length();
                        int numShortTermRefPicSets = str2.length();
                        if (length != numShortTermRefPicSets) {
                            A0F[0] = "zXRrzrgs2yTfUpMYLKq5pl9q4OtfzcQs";
                            if (zA0A2) {
                                c1080Uf.A06();
                            }
                        }
                    }
                }
                throw new RuntimeException();
            }
            int previousNumDeltaPocs = c1080Uf.A04();
            int iA05 = c1080Uf.A04();
            numPositivePics = previousNumDeltaPocs + iA05;
            for (int numShortTermRefPicSets2 = 0; numShortTermRefPicSets2 < previousNumDeltaPocs; numShortTermRefPicSets2++) {
                c1080Uf.A04();
                c1080Uf.A06();
            }
            for (int numShortTermRefPicSets3 = 0; numShortTermRefPicSets3 < iA05; numShortTermRefPicSets3++) {
                c1080Uf.A04();
                c1080Uf.A06();
            }
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A08(byte[] bArr, int i, int i2) {
        this.A03.A06(bArr, i, i2);
        if (!this.A05) {
            this.A0A.A02(bArr, i, i2);
            this.A08.A02(bArr, i, i2);
            this.A06.A02(bArr, i, i2);
        }
        this.A07.A02(bArr, i, i2);
        this.A09.A02(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A50(C1576fq c1576fq) {
        A02();
        while (c1576fq.A07() > 0) {
            int iA09 = c1576fq.A09();
            int iA0A = c1576fq.A0A();
            byte[] bArrA0l = c1576fq.A0l();
            long j = this.A01;
            int offset = c1576fq.A07();
            this.A01 = j + ((long) offset);
            InterfaceC1086Uo interfaceC1086Uo = this.A02;
            int offset2 = c1576fq.A07();
            interfaceC1086Uo.AHx(c1576fq, offset2);
            while (iA09 < iA0A) {
                int iA04 = AbstractC1078Ud.A04(bArrA0l, iA09, iA0A, this.A0D);
                if (iA04 == iA0A) {
                    A08(bArrA0l, iA09, iA0A);
                    return;
                }
                int bytesWrittenPastPosition = AbstractC1078Ud.A00(bArrA0l, iA04);
                int i = iA04 - iA09;
                if (i > 0) {
                    A08(bArrA0l, iA09, iA04);
                }
                int lengthToNalUnit = iA0A - iA04;
                long j2 = this.A01 - ((long) lengthToNalUnit);
                int offset3 = i < 0 ? -i : 0;
                A04(j2, lengthToNalUnit, offset3, this.A00);
                long absolutePosition = this.A00;
                A05(j2, lengthToNalUnit, bytesWrittenPastPosition, absolutePosition);
                iA09 = iA04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A04 = ys.A04();
        this.A02 = ul.AJX(ys.A03(), 2);
        this.A03 = new YF(this.A02);
        this.A0B.A03(ul, ys);
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFx() {
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFy(long j, int i) {
        if (j != C.TIME_UNSET) {
            this.A00 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AIB() {
        this.A01 = 0L;
        this.A00 = C.TIME_UNSET;
        AbstractC1078Ud.A0H(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        if (this.A03 != null) {
            this.A03.A03();
        }
    }
}
