package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AR extends Timeline {
    public static String[] A04 = {"nDkuZZEFG4iGMwbsGEvKBo4ueCI7wxif", "OM6NJOBBZMKrUazjZz4CdR8Ljfz9nzwy", "h9AdYD37MAF4FmuzDOyGIvEw", "VkmtOVI9Gbc78hEhNGIz4LiMtzYnUrU2", "bkWqGplua99PBwc9ED6yZtwvDtuw6KwN", "305DBImSoaz5MlD7g6qLfpiwFg5d3Fl", "QtOjLPNYFNek9UnmHWOFtbeX9w", "y2avdvKeY0dhYPEmFhuJXZmeyR2ks2D4"};
    public final BP<C2827pl> A00;
    public final BP<C2825pj> A01;
    public final int[] A02;
    public final int[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public AR(BP<C2825pj> bp, BP<C2827pl> bp2, int[] iArr) {
        AbstractC10843y.A07(bp.size() == iArr.length);
        this.A01 = bp;
        this.A00 = bp2;
        this.A02 = iArr;
        this.A03 = new int[iArr.length];
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr2 = this.A03;
            int i3 = iArr[i2];
            iArr2[i3] = i2;
        }
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A01.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A08(int i2, int i3, boolean z2) {
        if (i3 == 1) {
            return i2;
        }
        if (i2 == A0C(z2)) {
            if (i3 == 2) {
                return A0B(z2);
            }
            return -1;
        }
        if (z2) {
            return this.A02[this.A03[i2] + 1];
        }
        return i2 + 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z2) {
        if (A0N()) {
            return -1;
        }
        if (!z2) {
            return 0;
        }
        int[] iArr = this.A02;
        if (A04[1].charAt(22) == 'H') {
            throw new RuntimeException();
        }
        A04[7] = "6ncpOYdEr0xsUZdZBYFnYejLEosAstPL";
        return iArr[0];
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z2) {
        if (A0N()) {
            return -1;
        }
        if (z2) {
            return this.A02[A07() - 1];
        }
        return A07() - 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2827pl A0I(int i2, C2827pl p2, boolean z2) {
        C2827pl p3 = this.A00.get(i2);
        p2.A0G(p3.A03, p3.A04, p3.A00, p3.A01, p3.A02, p3.A06, p3.A05);
        return p2;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2825pj A0L(int i2, C2825pj c2825pj, long j) {
        C2825pj c2825pj2 = this.A01.get(i2);
        c2825pj.A07(c2825pj2.A0C, c2825pj2.A09, c2825pj2.A0A, c2825pj2.A06, c2825pj2.A07, c2825pj2.A04, c2825pj2.A0G, c2825pj2.A0D, c2825pj2.A08, c2825pj2.A02, c2825pj2.A03, c2825pj2.A00, c2825pj2.A01, c2825pj2.A05);
        c2825pj.A0F = c2825pj2.A0F;
        return c2825pj;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final Object A0M(int i2) {
        throw new UnsupportedOperationException();
    }
}
