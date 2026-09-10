package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04895z implements QD {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final ZM[] A04;
    public final int A05;
    public final C1175Yc A06;
    public final int[] A07;

    public AbstractC04895z(C1175Yc c1175Yc, int[] iArr, int i) {
        AbstractC1517es.A08(iArr.length > 0);
        this.A02 = i;
        this.A06 = (C1175Yc) AbstractC1517es.A01(c1175Yc);
        this.A05 = iArr.length;
        this.A04 = new ZM[this.A05];
        for (int i2 = 0; i2 < i; i2++) {
            ZM[] zmArr = this.A04;
            int i3 = iArr[i2];
            zmArr[i2] = c1175Yc.A08(i3);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.cp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC04895z.A07((ZM) obj, (ZM) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr2 = this.A07;
            int i5 = c1175Yc.A07(this.A04[i4]);
            iArr2[i4] = i5;
        }
        int i6 = this.A05;
        this.A03 = new long[i6];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(ZM zm, ZM zm2) {
        return zm2.A05 - zm.A05;
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public void A5n() {
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public void A6A() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1412dA
    public final ZM A81(int i) {
        return this.A04[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1412dA
    public final int A87(int i) {
        return this.A07[i];
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final ZM A8s() {
        return this.A04[A8t()];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1412dA
    public final C1175Yc A9B() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1412dA
    public final int A9w(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.A07[i2];
            if (i3 == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public void AEW(float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC04895z abstractC04895z = (AbstractC04895z) obj;
        return this.A06 == abstractC04895z.A06 && Arrays.equals(this.A07, abstractC04895z.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1412dA
    public final int length() {
        return this.A07.length;
    }
}
