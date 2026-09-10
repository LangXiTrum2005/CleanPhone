package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2505nG extends AbstractC1165Eh<C2505nG> implements Comparable<C2505nG> {
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
    public static int A01(List<C2505nG> list, List<C2505nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2505nG(int i, C2654pg c2654pg, int i2, C10499i c10499i, int i3, String str) {
        List<String> listA03;
        super(i, c2654pg, i2);
        int i4 = 0;
        this.A08 = C10489h.A0S(i3, false);
        int i5 = super.A02.A0H & (~((C2650pc) c10499i).A00);
        this.A06 = (i5 & 1) != 0;
        this.A07 = (i5 & 2) != 0;
        int i6 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c10499i.A0K.isEmpty()) {
            listA03 = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            listA03 = c10499i.A0K;
        }
        for (int bestLanguageIndex = 0; bestLanguageIndex < listA03.size(); bestLanguageIndex++) {
            int iA02 = C10489h.A02(super.A02, listA03.get(bestLanguageIndex), c10499i.A0P);
            if (iA02 > 0) {
                i6 = bestLanguageIndex;
                bestLanguageScore = iA02;
                break;
            }
        }
        this.A00 = i6;
        this.A01 = bestLanguageScore;
        this.A02 = C10489h.A00(super.A02.A0E, ((C2650pc) c10499i).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C10489h.A02(super.A02, str, C10489h.A0K(str) == null);
        boolean z = this.A01 > 0 || (c10499i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C10489h.A0S(i3, c10499i.A0B) && z) {
            i4 = 1;
        }
        this.A04 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2505nG c2505nG) {
        AbstractC2543ns abstractC2543nsA06 = AbstractC2543ns.A01().A09(this.A08, c2505nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c2505nG.A00), AbstractC2693qK.A03().A06()).A06(this.A01, c2505nG.A01).A06(this.A02, c2505nG.A02).A09(this.A06, c2505nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c2505nG.A07), this.A01 == 0 ? AbstractC2693qK.A03() : AbstractC2693qK.A03().A06()).A06(this.A03, c2505nG.A03);
        if (this.A02 == 0) {
            abstractC2543nsA06 = abstractC2543nsA06.A0A(this.A05, c2505nG.A05);
        }
        return abstractC2543nsA06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C2505nG> A02(int i, C2654pg c2654pg, C10499i c10499i, int[] iArr, String str) {
        C2K c2kA01 = BP.A01();
        for (int i2 = 0; i2 < c2654pg.A01; i2++) {
            c2kA01.A04(new C2505nG(i, c2654pg, i2, c10499i, iArr[i2], str));
        }
        return c2kA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1165Eh
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2505nG c2505nG) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1165Eh
    public final int A08() {
        return this.A04;
    }
}
