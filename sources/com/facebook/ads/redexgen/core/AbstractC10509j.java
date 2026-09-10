package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC10509j implements InterfaceC2503nE {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C2691qI[] A04;
    public final int A05;
    public final C2654pg A06;
    public final int[] A07;

    public AbstractC10509j(C2654pg c2654pg, int[] iArr, int i) {
        AbstractC09153y.A08(iArr.length > 0);
        this.A02 = i;
        this.A06 = (C2654pg) AbstractC09153y.A01(c2654pg);
        this.A05 = iArr.length;
        this.A04 = new C2691qI[this.A05];
        for (int i2 = 0; i2 < i; i2++) {
            C2691qI[] c2691qIArr = this.A04;
            int i3 = iArr[i2];
            c2691qIArr[i2] = c2654pg.A08(i3);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC10509j.A07((C2691qI) obj, (C2691qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr2 = this.A07;
            int i5 = c2654pg.A07(this.A04[i4]);
            iArr2[i4] = i5;
        }
        int i6 = this.A05;
        this.A03 = new long[i6];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C2691qI c2691qI, C2691qI c2691qI2) {
        return c2691qI2.A05 - c2691qI.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2503nE
    public void A5x() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2503nE
    public void A6K() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1174Eq
    public final C2691qI A8B(int i) {
        return this.A04[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1174Eq
    public final int A8H(int i) {
        return this.A07[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2503nE
    public final C2691qI A92() {
        return this.A04[A93()];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1174Eq
    public final C2654pg A9L() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1174Eq
    public final int AA6(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.A07[i2];
            if (i3 == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2503nE
    public void AFJ(float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC10509j abstractC10509j = (AbstractC10509j) obj;
        return this.A06 == abstractC10509j.A06 && Arrays.equals(this.A07, abstractC10509j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1174Eq
    public final int length() {
        return this.A07.length;
    }
}
