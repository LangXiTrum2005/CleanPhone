package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC12199j implements InterfaceC2672nE {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C2860qI[] A04;
    public final int A05;
    public final C2823pg A06;
    public final int[] A07;

    public AbstractC12199j(C2823pg c2823pg, int[] iArr, int i2) {
        AbstractC10843y.A08(iArr.length > 0);
        this.A02 = i2;
        this.A06 = (C2823pg) AbstractC10843y.A01(c2823pg);
        this.A05 = iArr.length;
        this.A04 = new C2860qI[this.A05];
        for (int i3 = 0; i3 < i; i3++) {
            C2860qI[] c2860qIArr = this.A04;
            int i4 = iArr[i3];
            c2860qIArr[i3] = c2823pg.A08(i4);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC12199j.A07((C2860qI) obj, (C2860qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i5 = 0; i5 < i; i5++) {
            int[] iArr2 = this.A07;
            int i6 = c2823pg.A07(this.A04[i5]);
            iArr2[i5] = i6;
        }
        int i7 = this.A05;
        this.A03 = new long[i7];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C2860qI c2860qI, C2860qI c2860qI2) {
        return c2860qI2.A05 - c2860qI.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2672nE
    public void A5x() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2672nE
    public void A6K() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1343Eq
    public final C2860qI A8B(int i2) {
        return this.A04[i2];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1343Eq
    public final int A8H(int i2) {
        return this.A07[i2];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2672nE
    public final C2860qI A92() {
        return this.A04[A93()];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1343Eq
    public final C2823pg A9L() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1343Eq
    public final int AA6(int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.A07[i3];
            if (i4 == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2672nE
    public void AFJ(float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC12199j abstractC12199j = (AbstractC12199j) obj;
        return this.A06 == abstractC12199j.A06 && Arrays.equals(this.A07, abstractC12199j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1343Eq
    public final int length() {
        return this.A07.length;
    }
}
