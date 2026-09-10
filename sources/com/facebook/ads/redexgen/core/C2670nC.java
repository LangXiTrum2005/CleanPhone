package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2670nC implements F0 {
    public int A00;
    public int A01;
    public int A02;
    public C1351Ey[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public C2670nC(boolean z2, int i2) {
        this(z2, i2, 0);
    }

    public C2670nC(boolean z2, int i2, int i3) {
        AbstractC10843y.A07(i2 > 0);
        AbstractC10843y.A07(i3 >= 0);
        this.A05 = z2;
        this.A04 = i2;
        this.A01 = i3;
        this.A03 = new C1351Ey[i3 + 100];
        if (i3 > 0) {
            this.A06 = new byte[i3 * i2];
            for (int i4 = 0; i4 < i3; i4++) {
                this.A03[i4] = new C1351Ey(this.A06, i4 * i2);
            }
            return;
        }
        this.A06 = null;
    }

    public final synchronized int A00() {
        return this.A00 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i2) {
        boolean targetBufferSizeReduced = i2 < this.A02;
        this.A02 = i2;
        if (targetBufferSizeReduced) {
            AKT();
        }
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized C1351Ey A49() {
        C1351Ey c1351Ey;
        this.A00++;
        if (this.A01 > 0) {
            C1351Ey[] c1351EyArr = this.A03;
            int i2 = this.A01 - 1;
            this.A01 = i2;
            c1351Ey = (C1351Ey) AbstractC10843y.A01(c1351EyArr[i2]);
            this.A03[this.A01] = null;
        } else {
            c1351Ey = new C1351Ey(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (C1351Ey[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return c1351Ey;
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final int A8I() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized void AHd(C1351Ey c1351Ey) {
        C1351Ey[] c1351EyArr = this.A03;
        int i2 = this.A01;
        this.A01 = i2 + 1;
        c1351EyArr[i2] = c1351Ey;
        this.A00--;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized void AHe(InterfaceC1352Ez interfaceC1352Ez) {
        while (interfaceC1352Ez != null) {
            C1351Ey[] c1351EyArr = this.A03;
            int i2 = this.A01;
            this.A01 = i2 + 1;
            c1351EyArr[i2] = interfaceC1352Ez.A6u();
            this.A00--;
            interfaceC1352Ez = interfaceC1352Ez.ACc();
        }
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized void AKT() {
        int iA05 = C5C.A05(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int iMax = Math.max(0, iA05 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (iMax >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C1351Ey highAllocation = (C1351Ey) AbstractC10843y.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C1351Ey lowAllocation = (C1351Ey) AbstractC10843y.A01(this.A03[highIndex]);
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            iMax = Math.max(iMax, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (iMax >= targetAllocationCount5) {
                return;
            }
        }
        C1351Ey[] c1351EyArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c1351EyArr, iMax, targetAvailableCount, (Object) null);
        this.A01 = iMax;
    }
}
