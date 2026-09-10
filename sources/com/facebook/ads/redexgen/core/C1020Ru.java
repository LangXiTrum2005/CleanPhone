package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Pair;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1020Ru implements UK {
    public static byte[] A07;
    public static String[] A08 = {"VYkmqLW81LEq0HSyJ3gmjcCX7C9BrGfv", "fNGwC9K408bTGAECuYJ6RYQT1LVxtX5N", "TKI8EI91ZLOyrmzmGg22KL4IAY4A9sZR", "GWBYwXAnT4teIWEv8e19SZ", "C", "lvk8XIs", "9IrDryiE7Lz3Fwlu0JUY02J1KXFF8qbn", "f4x73n"};
    public static final UO A09;
    public UL A04;
    public InterfaceC1086Uo A05;
    public YX A06;
    public int A01 = 0;
    public long A03 = -1;
    public int A00 = -1;
    public long A02 = -1;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-66, -78, -26, 3, 22, 3, -62, 7, 26, 5, 7, 7, 6, 21, -62, 11, cw.n, 18, 23, 22, -62, cw.l, 7, cw.n, 9, 22, 10, -36, -62, -27, -2, 3, 5, 0, 0, -1, 2, 4, -11, -12, -80, -25, -47, -26, -80, -10, -1, 2, -3, -15, 4, -80, 4, 9, 0, -11, -54, -80, 37, 62, 67, 69, 64, 64, 63, 66, 68, 53, 52, -16, 63, 66, -16, 69, 62, 66, 53, 51, 63, 55, 62, 57, 74, 53, 52, -16, 71, 49, 70, -16, 54, 57, 60, 53, -16, 68, 73, 64, 53, -2, -33, -23, -2, -51, 0, -4, -6, -23, -21, -4, -9, -6, 32, 52, 35, 40, 46, -18, 38, -10, -16, -16, -20, 32, 43, 32, 54, -69, -49, -66, -61, -55, -119, -63, -111, -117, -117, -121, -57, -58, -69, -47, -17, 3, -14, -9, -3, -67, 0, -17, 5};
    }

    static {
        A03();
        A09 = new UO() { // from class: com.facebook.ads.redexgen.X.S4
            @Override // com.facebook.ads.redexgen.core.UO
            public final UK[] A5D() {
                return C1020Ru.A08();
            }

            @Override // com.facebook.ads.redexgen.core.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
    }

    private int A00(WJ wj) throws IOException {
        AbstractC1517es.A08(this.A02 != -1);
        return ((YX) AbstractC1517es.A01(this.A06)).AHz(wj, this.A02 - wj.A8d()) ? -1 : 0;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void A02() {
        AbstractC1517es.A02(this.A05);
    }

    private void A04(WJ wj) throws IOException {
        AbstractC1517es.A08(wj.A8d() == 0);
        if (this.A00 != -1) {
            int i = this.A00;
            String[] strArr = A08;
            if (strArr[7].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A08[0] = "0WtatMV43KHkdzA4JBsi8MAw7aUiq3uU";
            wj.AJ9(i);
            this.A01 = 4;
            return;
        }
        if (AbstractC1174Yb.A06(wj)) {
            long jA8Y = wj.A8Y();
            String[] strArr2 = A08;
            if (strArr2[4].length() == strArr2[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A08;
            strArr3[7] = "VQR2k9";
            strArr3[5] = "QBJeAPV";
            wj.AJ9((int) (jA8Y - wj.A8d()));
            this.A01 = 1;
            return;
        }
        throw Q6.A01(A01(58, 42, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE), null);
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void A05(WJ wj) throws IOException {
        YZ wavFormat = AbstractC1174Yb.A02(wj);
        if (wavFormat.A03 == 17) {
            this.A06 = new S1(this.A04, this.A05, wavFormat);
        } else if (wavFormat.A03 == 6) {
            this.A06 = new C1022Rw(this.A04, this.A05, wavFormat, A01(112, 15, 110), -1);
        } else if (wavFormat.A03 == 7) {
            this.A06 = new C1022Rw(this.A04, this.A05, wavFormat, A01(EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 15, 9), -1);
        } else {
            int iA00 = AbstractC1094Uw.A00(wavFormat.A03, wavFormat.A01);
            if (iA00 != 0) {
                this.A06 = new C1022Rw(this.A04, this.A05, wavFormat, A01(Input.Keys.F12, 9, 61), iA00);
            } else {
                throw Q6.A00(A01(29, 29, 63) + wavFormat.A03);
            }
        }
        this.A01 = 3;
        String[] strArr = A08;
        if (strArr[1].charAt(17) == strArr[6].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[4] = "a";
        strArr2[3] = "ynrKq8Bdq6ylmc6mBixf2O";
    }

    private void A06(WJ wj) throws IOException {
        this.A03 = AbstractC1174Yb.A00(wj);
        this.A01 = 2;
    }

    private void A07(WJ wj) throws IOException {
        Pair<Long, Long> pairA01 = AbstractC1174Yb.A01(wj);
        this.A00 = ((Long) pairA01.first).intValue();
        long jLongValue = ((Long) pairA01.second).longValue();
        long dataSize = this.A03;
        if (dataSize != -1 && jLongValue == 4294967295L) {
            jLongValue = this.A03;
        }
        this.A02 = ((long) this.A00) + jLongValue;
        long inputLength = wj.A8E();
        if (inputLength != -1) {
            long j = this.A02;
            String[] strArr = A08;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[0] = "UYrKrrQ5Fkq0nwipJX9JD35vXpMTaesF";
            if (j > inputLength) {
                AbstractC1561fb.A07(A01(100, 12, 55), A01(2, 27, 81) + this.A02 + A01(0, 2, 65) + inputLength);
                this.A02 = inputLength;
            }
        }
        ((YX) AbstractC1517es.A01(this.A06)).A9y(this.A00, this.A02);
        this.A01 = 4;
    }

    public static /* synthetic */ UK[] A08() {
        return new UK[]{new C1020Ru()};
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AA0(UL ul) {
        this.A04 = ul;
        this.A05 = ul.AJX(0, 1);
        ul.A6E();
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final int AGT(WJ wj, C1081Ug c1081Ug) throws IOException {
        A02();
        switch (this.A01) {
            case 0:
                A04(wj);
                return 0;
            case 1:
                A06(wj);
                return 0;
            case 2:
                A05(wj);
                return 0;
            case 3:
                A07(wj);
                if (A08[0].charAt(16) != 'J') {
                    throw new RuntimeException();
                }
                A08[2] = "5QuD2bY4sOSZDakEOJ8IbG4PZv5TKhpf";
                return 0;
            case 4:
                return A00(wj);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AIC(long j, long j2) {
        this.A01 = j == 0 ? 0 : 4;
        if (this.A06 != null) {
            YX yx = this.A06;
            if (A08[0].charAt(16) != 'J') {
                throw new RuntimeException();
            }
            A08[0] = "KJNoJs75uqibkrgqJ7lTdQ1PN2u4ZRsW";
            yx.AHq(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final boolean AJB(WJ wj) throws IOException {
        return AbstractC1174Yb.A06(wj);
    }
}
