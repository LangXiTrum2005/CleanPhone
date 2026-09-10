package com.facebook.ads.redexgen.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1123Wb {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public WC A06;
    public C1122Wa A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public long[] A0E = new long[0];
    public int[] A0C = new int[0];
    public int[] A0B = new int[0];
    public long[] A0D = new long[0];
    public boolean[] A0G = new boolean[0];
    public boolean[] A0F = new boolean[0];
    public final C1576fq A0H = new C1576fq();

    public final long A00(int i) {
        return this.A0D[i];
    }

    public final void A01() {
        this.A01 = 0;
        this.A05 = 0L;
        this.A09 = false;
        this.A08 = false;
        this.A0A = false;
        this.A07 = null;
    }

    public final void A02(int i) {
        this.A0H.A0d(i);
        this.A08 = true;
        this.A0A = true;
    }

    public final void A03(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (this.A0C.length < i) {
            this.A0E = new long[i];
            this.A0C = new int[i];
        }
        if (this.A0B.length < i2) {
            int i3 = (i2 * EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE) / 100;
            this.A0B = new int[i3];
            this.A0D = new long[i3];
            this.A0G = new boolean[i3];
            this.A0F = new boolean[i3];
        }
    }

    public final void A04(WJ wj) throws IOException {
        wj.readFully(this.A0H.A0l(), 0, this.A0H.A0A());
        this.A0H.A0f(0);
        this.A0A = false;
    }

    public final void A05(C1576fq c1576fq) {
        c1576fq.A0k(this.A0H.A0l(), 0, this.A0H.A0A());
        this.A0H.A0f(0);
        this.A0A = false;
    }

    public final boolean A06(int i) {
        return this.A08 && this.A0F[i];
    }
}
