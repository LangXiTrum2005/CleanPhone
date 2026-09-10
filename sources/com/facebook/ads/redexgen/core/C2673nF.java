package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2673nF extends AbstractC1334Eh<C2673nF> {
    public static String[] A0H = {"VuHjt8oOpq8N7C214wGoSA1AvoAEOrJ7", "uFvhlxS5lUy9ksGg6O4Xt3y9x", "z2gekC5V6p56SAeTbAO0jRL35", "AJl44cd0wjf7yp80NhOEfrZac9uQkeAm", "fvb2kSFN69PWkoJ4Ln26XpHSuOzso8Xv", "xYIwGH1EqCgaa9qjZOqbWgZcWwFFG4Ev", "iW7gA0b6LPVcA0KpSRoleRmfzjbkINez", "mxsnKoNumrVzSuMZZmY48wO5LDc3OokM"};
    public final int A00;
    public final int A01;
    public final int A02;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A03;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C12189i A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public C2673nF(int i2, C2823pg c2823pg, int i3, C12189i c12189i, int i4, String str, int i5, boolean z2) {
        int requiredAdaptiveSupport;
        super(i2, c2823pg, i3);
        this.A09 = c12189i;
        if (c12189i.A07) {
            requiredAdaptiveSupport = 24;
        } else {
            requiredAdaptiveSupport = 16;
        }
        this.A0A = c12189i.A06 && (i5 & requiredAdaptiveSupport) != 0;
        this.A0C = z2 && (super.A02.A0L == -1 || super.A02.A0L <= ((C2819pc) c12189i).A06) && ((super.A02.A0A == -1 || super.A02.A0A <= ((C2819pc) c12189i).A05) && ((super.A02.A01 == -1.0f || super.A02.A01 <= ((float) ((C2819pc) c12189i).A04)) && (super.A02.A05 == -1 || super.A02.A05 <= ((C2819pc) c12189i).A03)));
        this.A0D = z2 && (super.A02.A0L == -1 || super.A02.A0L >= ((C2819pc) c12189i).A0A) && ((super.A02.A0A == -1 || super.A02.A0A >= ((C2819pc) c12189i).A09) && ((super.A02.A01 == -1.0f || super.A02.A01 >= ((float) ((C2819pc) c12189i).A08)) && (super.A02.A05 == -1 || super.A02.A05 >= ((C2819pc) c12189i).A07)));
        this.A0E = C12179h.A0S(i4, false);
        int bestLanguageIndex = 0;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < c12189i.A0L.size(); i7++) {
            int iA02 = C12179h.A02(super.A02, c12189i.A0L.get(i7), false);
            if (iA02 > 0) {
                i6 = i7;
                bestLanguageIndex = iA02;
                break;
            }
        }
        this.A03 = i6;
        this.A04 = bestLanguageIndex;
        this.A00 = super.A02.A05;
        this.A02 = super.A02.A06();
        this.A06 = C12179h.A00(super.A02.A0E, ((C2819pc) c12189i).A0D);
        this.A0B = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A07 = C12179h.A02(super.A02, str, C12179h.A0K(str) == null);
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < c12189i.A0M.size(); i9++) {
            if (super.A02.A0W != null && super.A02.A0W.equals(c12189i.A0M.get(i9))) {
                i8 = i9;
                break;
            }
        }
        this.A05 = i8;
        this.A0G = AbstractC11727i.A02(i4) == 128;
        this.A0F = AbstractC11727i.A04(i4) == 64;
        this.A01 = C12179h.A07(super.A02.A0W);
        this.A08 = A00(i4, requiredAdaptiveSupport);
    }

    private int A00(int i2, int i3) {
        if ((super.A02.A0E & 16384) != 0 || !C12179h.A0S(i2, this.A09.A0B)) {
            return 0;
        }
        if (!this.A0C && !this.A09.A0C) {
            return 0;
        }
        if (C12179h.A0S(i2, false) && this.A0D && this.A0C && super.A02.A05 != -1 && !this.A09.A0N && !this.A09.A0O && (i2 & i3) != 0) {
            return 2;
        }
        return 1;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public static int A01(C2673nF c2673nF, C2673nF c2673nF2) {
        AbstractC2712ns abstractC2712nsA09 = AbstractC2712ns.A01().A09(c2673nF.A0E, c2673nF2.A0E).A08(Integer.valueOf(c2673nF.A03), Integer.valueOf(c2673nF2.A03), AbstractC2862qK.A03().A06()).A06(c2673nF.A04, c2673nF2.A04).A06(c2673nF.A06, c2673nF2.A06).A09(c2673nF.A0B, c2673nF2.A0B).A06(c2673nF.A07, c2673nF2.A07).A09(c2673nF.A0C, c2673nF2.A0C).A09(c2673nF.A0D, c2673nF2.A0D).A08(Integer.valueOf(c2673nF.A05), Integer.valueOf(c2673nF2.A05), AbstractC2862qK.A03().A06()).A09(c2673nF.A0G, c2673nF2.A0G).A09(c2673nF.A0F, c2673nF2.A0F);
        if (c2673nF.A0G && c2673nF.A0F) {
            int i2 = c2673nF.A01;
            int i3 = c2673nF2.A01;
            if (A0H[4].charAt(7) == 'c') {
                throw new RuntimeException();
            }
            A0H[4] = "L7q4oO3o2NLjefqLZehpujqtxzeKbA5O";
            abstractC2712nsA09 = abstractC2712nsA09.A06(i2, i3);
        }
        int iA05 = abstractC2712nsA09.A05();
        if (A0H[7].charAt(14) != 'M') {
            return iA05;
        }
        A0H[0] = "TVm4CsN40i91TfwfawYUT3UYECpWhhhJ";
        return iA05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    public static int A02(C2673nF c2673nF, C2673nF c2673nF2) {
        AbstractC2862qK abstractC2862qKA06;
        AbstractC2862qK abstractC2862qKA07 = (c2673nF.A0C && c2673nF.A0E) ? C12179h.A09 : C12179h.A09.A06();
        AbstractC2712ns abstractC2712nsA01 = AbstractC2712ns.A01();
        Integer numValueOf = Integer.valueOf(c2673nF.A00);
        Integer numValueOf2 = Integer.valueOf(c2673nF2.A00);
        boolean z2 = c2673nF.A09.A0O;
        String[] strArr = A0H;
        if (strArr[6].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        A0H[4] = "07GlML0JAKsk4TXVd5GQtUxHkz6E2kCF";
        if (z2) {
            abstractC2862qKA06 = C12179h.A09.A06();
        } else {
            abstractC2862qKA06 = C12179h.A0A;
        }
        return abstractC2712nsA01.A08(numValueOf, numValueOf2, abstractC2862qKA06).A08(Integer.valueOf(c2673nF.A02), Integer.valueOf(c2673nF2.A02), abstractC2862qKA07).A08(Integer.valueOf(c2673nF.A00), Integer.valueOf(c2673nF2.A00), abstractC2862qKA07).A05();
    }

    public static int A05(List<C2673nF> list, List<C2673nF> list2) {
        return AbstractC2712ns.A01().A08((C2673nF) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2673nF.A01((C2673nF) obj, (C2673nF) obj2);
            }
        }), (C2673nF) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2673nF.A01((C2673nF) obj, (C2673nF) obj2);
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2673nF.A01((C2673nF) obj, (C2673nF) obj2);
            }
        }).A06(list.size(), list2.size()).A08((C2673nF) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2673nF.A02((C2673nF) obj, (C2673nF) obj2);
            }
        }), (C2673nF) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2673nF.A02((C2673nF) obj, (C2673nF) obj2);
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2673nF.A02((C2673nF) obj, (C2673nF) obj2);
            }
        }).A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo> */
    public static BP<C2673nF> A06(int pixelCount, C2823pg c2823pg, C12189i c12189i, int[] iArr, String str, int i2) {
        int iA03 = C12179h.A03(c2823pg, ((C2819pc) c12189i).A0F, ((C2819pc) c12189i).A0E, c12189i.A0Q);
        C2K c2kA01 = BP.A01();
        int i3 = 0;
        while (true) {
            int i4 = c2823pg.A01;
            String[] strArr = A0H;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[6] = "2BgCu4KRvJ20zb7ljNDccj45OL5WeAVY";
            strArr2[5] = "2mW0v3SSZTDHEKi4uYotr9FneqRXRzcE";
            if (i3 < i4) {
                int iA06 = c2823pg.A08(i3).A06();
                c2kA01.A04(new C2673nF(pixelCount, c2823pg, i3, c12189i, iArr[i3], str, i2, iA03 == Integer.MAX_VALUE || (iA06 != -1 && iA06 <= iA03)));
                i3++;
            } else {
                return c2kA01.A05();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1334Eh
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2673nF c2673nF) {
        if (this.A0A || C5C.A1E(super.A02.A0W, ((AbstractC1334Eh) c2673nF).A02.A0W)) {
            if (!this.A09.A05) {
                if (this.A0G == c2673nF.A0G) {
                    boolean z2 = this.A0F;
                    if (A0H[7].charAt(14) != 'M') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0H;
                    strArr[1] = "O482IHGDjbokfcz29RQKjL9l7";
                    strArr[2] = "cI8rqKrS6U71hTMAagWNF9taj";
                    if (z2 == c2673nF.A0F) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1334Eh
    public final int A08() {
        return this.A08;
    }
}
