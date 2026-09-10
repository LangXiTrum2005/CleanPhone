package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2674nG extends AbstractC1334Eh<C2674nG> implements Comparable<C2674nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C2674nG> list, List<C2674nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2674nG(int i2, C2823pg c2823pg, int i3, C12189i c12189i, int i4, String str) {
        List<String> listA03;
        super(i2, c2823pg, i3);
        int i5 = 0;
        this.A08 = C12179h.A0S(i4, false);
        int i6 = super.A02.A0H & (~((C2819pc) c12189i).A00);
        this.A06 = (i6 & 1) != 0;
        this.A07 = (i6 & 2) != 0;
        int i7 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c12189i.A0K.isEmpty()) {
            listA03 = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            listA03 = c12189i.A0K;
        }
        for (int bestLanguageIndex = 0; bestLanguageIndex < listA03.size(); bestLanguageIndex++) {
            int iA02 = C12179h.A02(super.A02, listA03.get(bestLanguageIndex), c12189i.A0P);
            if (iA02 > 0) {
                i7 = bestLanguageIndex;
                bestLanguageScore = iA02;
                break;
            }
        }
        this.A00 = i7;
        this.A01 = bestLanguageScore;
        this.A02 = C12179h.A00(super.A02.A0E, ((C2819pc) c12189i).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C12179h.A02(super.A02, str, C12179h.A0K(str) == null);
        boolean z2 = this.A01 > 0 || (c12189i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C12179h.A0S(i4, c12189i.A0B) && z2) {
            i5 = 1;
        }
        this.A04 = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2674nG c2674nG) {
        AbstractC2712ns abstractC2712nsA06 = AbstractC2712ns.A01().A09(this.A08, c2674nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c2674nG.A00), AbstractC2862qK.A03().A06()).A06(this.A01, c2674nG.A01).A06(this.A02, c2674nG.A02).A09(this.A06, c2674nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c2674nG.A07), this.A01 == 0 ? AbstractC2862qK.A03() : AbstractC2862qK.A03().A06()).A06(this.A03, c2674nG.A03);
        if (this.A02 == 0) {
            abstractC2712nsA06 = abstractC2712nsA06.A0A(this.A05, c2674nG.A05);
        }
        return abstractC2712nsA06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C2674nG> A02(int i2, C2823pg c2823pg, C12189i c12189i, int[] iArr, String str) {
        C2K c2kA01 = BP.A01();
        for (int i3 = 0; i3 < c2823pg.A01; i3++) {
            c2kA01.A04(new C2674nG(i2, c2823pg, i3, c12189i, iArr[i3], str));
        }
        return c2kA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1334Eh
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2674nG c2674nG) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1334Eh
    public final int A08() {
        return this.A04;
    }
}
