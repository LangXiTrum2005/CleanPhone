package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1611gQ {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public final boolean[] A07 = new boolean[15];

    public static int A00(long j) {
        return (int) (j % 15);
    }

    public final long A01() {
        if (this.A05 == 0) {
            return 0L;
        }
        return this.A06 / this.A05;
    }

    public final long A02() {
        return this.A06;
    }

    public final void A03() {
        this.A03 = 0L;
        this.A05 = 0L;
        this.A06 = 0L;
        this.A00 = 0;
        Arrays.fill(this.A07, false);
    }

    public final void A04(long j) {
        if (this.A03 == 0) {
            this.A02 = j;
        } else if (this.A03 == 1) {
            this.A01 = j - this.A02;
            this.A06 = this.A01;
            this.A05 = 1L;
        } else {
            long j2 = j - this.A04;
            int iA00 = A00(this.A03);
            if (Math.abs(j2 - this.A01) <= 1000000) {
                this.A05++;
                this.A06 += j2;
                if (this.A07[iA00]) {
                    this.A07[iA00] = false;
                    this.A00--;
                }
            } else if (!this.A07[iA00]) {
                this.A07[iA00] = true;
                this.A00++;
            }
        }
        this.A03++;
        this.A04 = j;
    }

    public final boolean A05() {
        if (this.A03 == 0) {
            return false;
        }
        return this.A07[A00(this.A03 - 1)];
    }

    public final boolean A06() {
        return this.A03 > 15 && this.A00 == 0;
    }
}
