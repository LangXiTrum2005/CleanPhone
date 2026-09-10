package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1483eK {
    public static String[] A07 = {"Y7TYPOYmr1DaLggC61u0AWsw8UU", "8E9a5Zo5EHFD", "iVAs1UBWiLkTRufCFmTh0VjI7SGFV9BP", "igPGnTQU3C4zsfvvaPuDNhRaHhU8zgSN", "vZXsYA3P1GVhSSGeJfLSyhvwv4Q2ZkUN", "ICq2NkQkBoZ7Wl3GxPgedNAM8nhfhTiP", "Jx4heSIt1kvuhAPUNrubhYPKNykrJXxV", "uJOMJfddake6"};
    public static final Comparator<C1482eJ> A08 = new Comparator() { // from class: com.facebook.ads.redexgen.X.eG
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1483eK.A00((C1482eJ) obj, (C1482eJ) obj2);
        }
    };
    public static final Comparator<C1482eJ> A09 = new Comparator() { // from class: com.facebook.ads.redexgen.X.eH
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((C1482eJ) obj).A00, ((C1482eJ) obj2).A00);
        }
    };
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C1482eJ[] A06 = new C1482eJ[5];
    public final ArrayList<C1482eJ> A05 = new ArrayList<>();
    public int A00 = -1;

    public C1483eK(int i) {
        this.A04 = i;
    }

    public static /* synthetic */ int A00(C1482eJ c1482eJ, C1482eJ c1482eJ2) {
        return c1482eJ.A01 - c1482eJ2.A01;
    }

    private void A02() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A03() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    private final void A04(int i, float f) {
        C1482eJ newSample;
        A02();
        if (this.A02 > 0) {
            C1482eJ[] c1482eJArr = this.A06;
            int i2 = this.A02 - 1;
            this.A02 = i2;
            String[] strArr = A07;
            if (strArr[4].charAt(31) != strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[2] = "yaPdXC8dVHotIsjL12yNG27Y2xE7mUfP";
            strArr2[5] = "yZ2zjjDBfhF2mhhyHoK97zI6gGNOUceP";
            newSample = c1482eJArr[i2];
        } else {
            newSample = new C1482eJ();
        }
        int i3 = this.A01;
        this.A01 = i3 + 1;
        newSample.A01 = i3;
        newSample.A02 = i;
        newSample.A00 = f;
        this.A05.add(newSample);
        this.A03 += i;
        while (this.A03 > this.A04) {
            int excessWeight = this.A03 - this.A04;
            C1482eJ c1482eJ = this.A05.get(0);
            if (c1482eJ.A02 <= excessWeight) {
                this.A03 -= c1482eJ.A02;
                this.A05.remove(0);
                int i4 = this.A02;
                if (A07[6].charAt(20) != 104) {
                    throw new RuntimeException();
                }
                A07[1] = "uEmR";
                if (i4 < 5) {
                    C1482eJ[] c1482eJArr2 = this.A06;
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    c1482eJArr2[excessWeight2] = c1482eJ;
                }
            } else {
                c1482eJ.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }

    public final float A05(float f) {
        A03();
        float f2 = this.A03 * f;
        int i = 0;
        for (int i2 = 0; i2 < this.A05.size(); i2++) {
            C1482eJ c1482eJ = this.A05.get(i2);
            i += c1482eJ.A02;
            float desiredWeight = i;
            if (desiredWeight >= f2) {
                float desiredWeight2 = c1482eJ.A00;
                return desiredWeight2;
            }
        }
        if (this.A05.isEmpty()) {
            return Float.NaN;
        }
        float desiredWeight3 = this.A05.get(this.A05.size() - 1).A00;
        return desiredWeight3;
    }

    public final void A06() {
        this.A05.clear();
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = 0;
    }

    @MetaExoPlayerCustomization("D20155618 Samples OutOfBounds Error Check Fix")
    public final void A07(int i, float f) {
        C1482eJ oldestSample;
        if (MetaExoPlayerUpgradeConfig.A03(EnumC0893Mn.A18)) {
            A04(i, f);
            return;
        }
        A02();
        if (this.A02 > 0) {
            C1482eJ[] c1482eJArr = this.A06;
            int i2 = this.A02 - 1;
            this.A02 = i2;
            oldestSample = c1482eJArr[i2];
        } else {
            oldestSample = new C1482eJ();
        }
        int i3 = this.A01;
        this.A01 = i3 + 1;
        oldestSample.A01 = i3;
        oldestSample.A02 = i;
        oldestSample.A00 = f;
        this.A05.add(oldestSample);
        this.A03 += i;
        while (this.A03 > this.A04 && !this.A05.isEmpty()) {
            int excessWeight = this.A03 - this.A04;
            C1482eJ c1482eJ = this.A05.get(0);
            if (c1482eJ.A02 <= excessWeight) {
                this.A03 -= c1482eJ.A02;
                this.A05.remove(0);
                if (this.A02 < 5) {
                    C1482eJ[] c1482eJArr2 = this.A06;
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    c1482eJArr2[excessWeight2] = c1482eJ;
                }
            } else {
                c1482eJ.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }
}
