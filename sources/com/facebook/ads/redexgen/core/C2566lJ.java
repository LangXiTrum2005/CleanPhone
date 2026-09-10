package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2566lJ implements InterfaceC1502Kv {
    public static byte[] A0E;
    public static String[] A0F = {"InS58bT42EZESXm9qvWYUvire34TyqEd", "0QsKXE5Mty2kdKkFlxzakLoeZj9v1JPl", "NRhrqdNeBR4CDjsc7Q9NAC", "KBnn09jRwf0uKhIPK3OJ0VUHuR4AgDGD", "Nq6SUzmzwDzIZ8w7Fc8GQLnhk8OKIhKk", "EhougHeDeIMt7rS1ZxwR1ONoVKreOkGZ", "d5GlJf2nLv2o9PLs5SG9FlMqVuWi5Y0h", "iroqlmoe0TAfPMqOpys1zY2UwesgA9Cl"};
    public long A01;
    public InterfaceC1407Hd A02;
    public L3 A03;
    public String A04;
    public boolean A05;
    public final L9 A0C;
    public final boolean[] A0D = new boolean[3];
    public final L4 A0B = new L4(32, 128);
    public final L4 A09 = new L4(33, 128);
    public final L4 A07 = new L4(34, 128);
    public final L4 A08 = new L4(39, 128);
    public final L4 A0A = new L4(40, 128);
    public long A00 = -9223372036854775807L;
    public final C11074v A06 = new C11074v();

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0E = new byte[]{7, 125, 121, 122, 29, 42, 46, 43, 42, 61, 93, 102, 109, 112, 120, 109, 107, 124, 109, 108, 40, 105, 123, 120, 109, 107, 124, 87, 122, 105, 124, 97, 103, 87, 97, 108, 107, 40, 126, 105, 100, 125, 109, 50, 40, 63, 32, 45, 44, 38, 102, 33, 44, 63, 42};
    }

    static {
        A03();
    }

    public C2566lJ(L9 l9) {
        this.A0C = l9;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x018b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0191  */
    public static C2860qI A00(String str, L4 l4, L4 l5, L4 l6) {
        byte[] bArr = new byte[l4.A00 + l5.A00 + l6.A00];
        System.arraycopy(l4.A01, 0, bArr, 0, l4.A00);
        System.arraycopy(l5.A01, 0, bArr, l4.A00, l5.A00);
        System.arraycopy(l6.A01, 0, bArr, l4.A00 + l5.A00, l6.A00);
        HU hu = new HU(l5.A01, 0, l5.A00);
        hu.A07(44);
        int maxSubLayersMinus1 = hu.A05(3);
        hu.A06();
        int iA05 = hu.A05(2);
        boolean zA0A = hu.A0A();
        int generalProfileCompatibilityFlags = hu.A05(5);
        int generalLevelIdc = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                String[] strArr = A0F;
                if (strArr[3].charAt(26) == strArr[0].charAt(26)) {
                    A0F[7] = "KUK36SaeRyaSjOylRKRM5Zy9KuAImCCo";
                    int[] iArr = new int[6];
                    for (int i3 = 0; i3 < iArr.length; i3++) {
                        iArr[i3] = hu.A05(8);
                    }
                    int toSkip = hu.A05(8);
                    int i4 = 0;
                    for (int i5 = 0; i5 < maxSubLayersMinus1; i5++) {
                        if (hu.A0A()) {
                            i4 += 89;
                        }
                        if (hu.A0A()) {
                            i4 += 8;
                        }
                    }
                    hu.A07(i4);
                    if (maxSubLayersMinus1 > 0) {
                        hu.A07((8 - maxSubLayersMinus1) * 2);
                    }
                    hu.A04();
                    int iA04 = hu.A04();
                    if (iA04 == 3) {
                        hu.A06();
                    }
                    int iA06 = hu.A04();
                    int chromaFormatIdc = hu.A04();
                    if (hu.A0A()) {
                        int generalProfileSpace = hu.A04();
                        int iA07 = hu.A04();
                        int toSkip2 = hu.A04();
                        int iA08 = hu.A04();
                        int subHeightC = (iA04 == 1 || iA04 == 2) ? 2 : 1;
                        iA06 -= (generalProfileSpace + iA07) * subHeightC;
                        chromaFormatIdc -= (toSkip2 + iA08) * (iA04 == 1 ? 2 : 1);
                    }
                    hu.A04();
                    hu.A04();
                    int iA09 = hu.A04();
                    int picHeightInLumaSamples = hu.A0A() ? 0 : maxSubLayersMinus1;
                    while (picHeightInLumaSamples <= maxSubLayersMinus1) {
                        hu.A04();
                        hu.A04();
                        String[] strArr2 = A0F;
                        if (strArr2[4].charAt(1) != strArr2[6].charAt(1)) {
                            String[] strArr3 = A0F;
                            strArr3[4] = "fwNj3DlAlR0ZRIXGIjbE9kdq2ymmau9c";
                            strArr3[6] = "Cn1Ujy3ajzEe008QMYirASp4B4RzqpC3";
                            hu.A04();
                            picHeightInLumaSamples++;
                        } else {
                            hu.A04();
                            picHeightInLumaSamples++;
                        }
                    }
                    hu.A04();
                    hu.A04();
                    hu.A04();
                    hu.A04();
                    hu.A04();
                    if (A0F[7].charAt(7) != 'e') {
                        A0F[2] = "36O4TNRZJCi";
                        hu.A04();
                        if (hu.A0A()) {
                            if (hu.A0A()) {
                                A06(hu);
                            }
                        }
                    } else {
                        String[] strArr4 = A0F;
                        strArr4[1] = "kgp7PzaRA7bebGNLV6O0LLC564MCujGY";
                        strArr4[5] = "FSYBvyZkCpJq4xL9y4GBHyTimpUH7OJt";
                        hu.A04();
                        if (hu.A0A()) {
                            if (hu.A0A()) {
                                A06(hu);
                            }
                        }
                    }
                    hu.A07(2);
                    if (hu.A0A()) {
                        hu.A07(8);
                        hu.A04();
                        hu.A04();
                        hu.A06();
                    }
                    A07(hu);
                    if (hu.A0A()) {
                        for (int i6 = 0; i6 < hu.A04(); i6++) {
                            hu.A07(iA09 + 4 + 1);
                        }
                    }
                    hu.A07(2);
                    float f = 1.0f;
                    boolean zA0A2 = hu.A0A();
                    String[] strArr5 = A0F;
                    if (strArr5[3].charAt(26) != strArr5[0].charAt(26)) {
                        break;
                    }
                    String[] strArr6 = A0F;
                    strArr6[1] = "Qhh03oXiZoC3MQNHpV44xa4z9JOwBySi";
                    strArr6[5] = "nsJWuxtHUvrlBy67rSbmxe3xvaeZTSox";
                    if (zA0A2) {
                        if (hu.A0A()) {
                            int picWidthInLumaSamples = hu.A05(8);
                            if (picWidthInLumaSamples == 255) {
                                int iA010 = hu.A05(16);
                                int iA011 = hu.A05(16);
                                if (iA010 != 0 && iA011 != 0) {
                                    f = iA010 / iA011;
                                }
                            } else if (picWidthInLumaSamples < HS.A04.length) {
                                f = HS.A04[picWidthInLumaSamples];
                            } else {
                                AbstractC10924g.A07(A01(0, 10, 60), A01(10, 35, 123) + picWidthInLumaSamples);
                            }
                        }
                        if (hu.A0A()) {
                            hu.A06();
                        }
                        if (hu.A0A()) {
                            hu.A07(4);
                            if (hu.A0A()) {
                                hu.A07(24);
                            }
                        }
                        if (hu.A0A()) {
                            hu.A04();
                            hu.A04();
                        }
                        hu.A06();
                        if (hu.A0A()) {
                            chromaFormatIdc *= 2;
                        }
                    }
                    return new C10512p().A0y(str).A11(A01(45, 10, 58)).A0w(AnonymousClass46.A03(iA05, zA0A, generalProfileCompatibilityFlags, generalLevelIdc, iArr, toSkip)).A0r(iA06).A0f(chromaFormatIdc).A0Y(f).A12(Collections.singletonList(bArr)).A14();
                }
                throw new RuntimeException();
            }
            boolean zA0A3 = hu.A0A();
            String[] strArr7 = A0F;
            if (strArr7[1].charAt(22) == strArr7[5].charAt(22)) {
                break;
            }
            String[] strArr8 = A0F;
            strArr8[4] = "ikltzL6qI9vduPGnQ2PfcHBicoSlJtZK";
            strArr8[6] = "dtFG8mkM92kb76Motxy98XM75Kybvtjp";
            if (zA0A3) {
                generalLevelIdc |= 1 << i2;
            }
            i2++;
        }
        throw new RuntimeException();
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void A02() {
        AbstractC10843y.A02(this.A02);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void A04(long j, int i2, int i3, long j2) {
        this.A03.A05(j, i2, this.A05);
        if (!this.A05) {
            this.A0B.A04(i3);
            this.A09.A04(i3);
            this.A07.A04(i3);
            if (this.A0B.A03() && this.A09.A03() && this.A07.A03()) {
                this.A02.A6e(A00(this.A04, this.A0B, this.A09, this.A07));
                this.A05 = true;
            }
        }
        L4 l4 = this.A08;
        if (A0F[2].length() == 29) {
            throw new RuntimeException();
        }
        A0F[7] = "vr6kqTkennNRVlA9BYLGssdVYhiLrcAb";
        if (l4.A04(i3)) {
            this.A06.A0j(this.A08.A01, HS.A02(this.A08.A01, this.A08.A00));
            this.A06.A0g(5);
            this.A0C.A02(j2, this.A06);
        }
        if (this.A0A.A04(i3)) {
            this.A06.A0j(this.A0A.A01, HS.A02(this.A0A.A01, this.A0A.A00));
            this.A06.A0g(5);
            this.A0C.A02(j2, this.A06);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A05(long j, int i2, int i3, long j2) {
        this.A03.A04(j, i2, i3, j2, this.A05);
        if (!this.A05) {
            this.A0B.A01(i3);
            this.A09.A01(i3);
            this.A07.A01(i3);
        }
        this.A08.A01(i3);
        String[] strArr = A0F;
        if (strArr[4].charAt(1) == strArr[6].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[3] = "1KFxNiiYNj5YwxcZPXf7qOLOZg48Utfw";
        strArr2[0] = "AJhXWbHH6DfoOyxWmdhumfQDrV4Rkjlm";
        this.A0A.A01(i3);
    }

    public static void A06(HU hu) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (!hu.A0A()) {
                    hu.A04();
                } else {
                    int sizeId = i2 << 1;
                    int iMin = Math.min(64, 1 << (sizeId + 4));
                    if (i2 > 1) {
                        hu.A03();
                    }
                    for (int coefNum = 0; coefNum < iMin; coefNum++) {
                        hu.A03();
                        String[] strArr = A0F;
                        String str = strArr[1];
                        String str2 = strArr[5];
                        int iCharAt = str.charAt(22);
                        int sizeId2 = str2.charAt(22);
                        if (iCharAt == sizeId2) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0F;
                        strArr2[1] = "RIQaKQF3d2DPjAKRmkcEP1Qw2m8MXhOp";
                        strArr2[5] = "Zvlj8YgWRgjcS6ffkQSgKy13bXSJEEo8";
                    }
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    public static void A07(HU hu) {
        int iA04 = hu.A04();
        boolean zA0A = false;
        int numNegativePics = 0;
        for (int stRpsIdx = 0; stRpsIdx < iA04; stRpsIdx++) {
            if (stRpsIdx != 0) {
                zA0A = hu.A0A();
            }
            if (zA0A) {
                hu.A06();
                hu.A04();
                for (int i2 = 0; i2 <= numNegativePics; i2++) {
                    if (hu.A0A()) {
                        hu.A06();
                    }
                }
            } else {
                int previousNumDeltaPocs = hu.A04();
                int iA05 = hu.A04();
                numNegativePics = previousNumDeltaPocs + iA05;
                for (int numShortTermRefPicSets = 0; numShortTermRefPicSets < previousNumDeltaPocs; numShortTermRefPicSets++) {
                    hu.A04();
                    hu.A06();
                }
                for (int numShortTermRefPicSets2 = 0; numShortTermRefPicSets2 < iA05; numShortTermRefPicSets2++) {
                    hu.A04();
                    hu.A06();
                }
            }
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A08(byte[] bArr, int i2, int i3) {
        this.A03.A06(bArr, i2, i3);
        if (!this.A05) {
            this.A0B.A02(bArr, i2, i3);
            this.A09.A02(bArr, i2, i3);
            this.A07.A02(bArr, i2, i3);
        }
        this.A08.A02(bArr, i2, i3);
        this.A0A.A02(bArr, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void A5A(C11074v c11074v) {
        A02();
        while (c11074v.A07() > 0) {
            int limit = c11074v.A09();
            int iA0A = c11074v.A0A();
            byte[] bArrA0l = c11074v.A0l();
            long j = this.A01;
            int offset = c11074v.A07();
            this.A01 = j + ((long) offset);
            InterfaceC1407Hd interfaceC1407Hd = this.A02;
            int offset2 = c11074v.A07();
            interfaceC1407Hd.AIr(c11074v, offset2);
            while (limit < iA0A) {
                int iA04 = HS.A04(bArrA0l, limit, iA0A, this.A0D);
                if (iA04 == iA0A) {
                    A08(bArrA0l, limit, iA0A);
                    return;
                }
                int bytesWrittenPastPosition = HS.A00(bArrA0l, iA04);
                int i2 = iA04 - limit;
                if (A0F[7].charAt(7) != 'e') {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[1] = "NnhvxMiSCkNhwXkURhMspTAR6cceqM1j";
                strArr[5] = "7ARxjazDMsknrtTfPy5OOEp3py29nWBE";
                if (i2 > 0) {
                    A08(bArrA0l, limit, iA04);
                }
                int lengthToNalUnit = iA0A - iA04;
                long j2 = this.A01 - ((long) lengthToNalUnit);
                int offset3 = i2 < 0 ? -i2 : 0;
                A04(j2, lengthToNalUnit, offset3, this.A00);
                long absolutePosition = this.A00;
                A05(j2, lengthToNalUnit, bytesWrittenPastPosition, absolutePosition);
                limit = iA04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void A5c(HA ha, LG lg) {
        lg.A05();
        this.A04 = lg.A04();
        this.A02 = ha.AKS(lg.A03(), 2);
        this.A03 = new L3(this.A02);
        this.A0C.A03(ha, lg);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void AGq(long j, int i2) {
        if (j != -9223372036854775807L) {
            this.A00 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1502Kv
    public final void AJ5() {
        this.A01 = 0L;
        this.A00 = -9223372036854775807L;
        HS.A0H(this.A0D);
        this.A0B.A00();
        this.A09.A00();
        this.A07.A00();
        this.A08.A00();
        this.A0A.A00();
        if (this.A03 != null) {
            this.A03.A03();
        }
    }
}
