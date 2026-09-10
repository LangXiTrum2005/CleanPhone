package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0936Oj implements Comparable<C0936Oj> {
    public static String[] A04 = {"mVATs4mg0NNQFzxuMlo", "WtZmdB0nWrFtQhg3y", "VGkbfyqcu1RhAbF6pu4I8IGmp", "Hr4NzNcUmn", "bCMf0jPpCp", "Y9828wrLR5fDU8", "FTEqajryx", "wr1R2liT4z3qWFN9B"};
    public int A00;
    public long A01;
    public Object A02;
    public final QT A03;

    public C0936Oj(QT qt) {
        this.A03 = qt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0936Oj c0936Oj) {
        boolean z = this.A02 == null;
        Object obj = c0936Oj.A02;
        if (A04[0].length() != 19) {
            throw new RuntimeException();
        }
        A04[0] = "Jgby1driYffcph6Gu5s";
        if (z != (obj == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i = this.A00 - c0936Oj.A00;
        if (i != 0) {
            return i;
        }
        int comparePeriodIndex = AbstractC1600gE.A08(this.A01, c0936Oj.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
