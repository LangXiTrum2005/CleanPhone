package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0952Pb {
    public static String[] A05 = {"MZeEInBqVnL7fDVjVynLpgycsVhVc2FP", "Xk9uAN0Fn4x0v5dWVwOwrJ7JGZToNY3l", "CDAWvvyMGgXNd5qsTP", "Re2PFJ16QG15nXWYAqvsFprPu8QnxxAj", "vzRJ6390trjMsrCmJ0zXqHjqNcYul7Wr", "t6D48Sv2e", "mUckvOsWmBWtRPKk3qpVMVrL2", "7vFwPN9HUlN"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public AbstractC0952Pb(AbstractC0952Pb abstractC0952Pb) {
        this.A04 = abstractC0952Pb.A04;
        this.A00 = abstractC0952Pb.A00;
        this.A01 = abstractC0952Pb.A01;
        this.A03 = abstractC0952Pb.A03;
        this.A02 = abstractC0952Pb.A02;
    }

    public AbstractC0952Pb(Object obj) {
        this(obj, -1L);
    }

    public AbstractC0952Pb(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public AbstractC0952Pb(Object obj, int i, int i2, long j, int i3) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = i3;
    }

    public AbstractC0952Pb(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean A00() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0952Pb)) {
            return false;
        }
        String[] strArr = A05;
        if (strArr[7].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A05[1] = "H5xeOUJH1DaxHk40WhwsThIB5vzqff3X";
        AbstractC0952Pb abstractC0952Pb = (AbstractC0952Pb) obj;
        return this.A04.equals(abstractC0952Pb.A04) && this.A00 == abstractC0952Pb.A00 && this.A01 == abstractC0952Pb.A01 && this.A03 == abstractC0952Pb.A03 && this.A02 == abstractC0952Pb.A02;
    }

    public final int hashCode() {
        int result = this.A04.hashCode();
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        int result4 = (((result2 + result3) * 31) + ((int) this.A03)) * 31;
        int result5 = this.A02;
        return result4 + result5;
    }
}
