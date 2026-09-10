package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class K5 {
    public static String[] A09 = {"UUlEJ3Jo50NOk35TUHs6UNRK6svNK9bY", "Rfapb4gOuHxAcdI53hJjgoF3fgUzCf8l", "549CgiYhO6ZoxkZsxucd", "d0g0H9nuc7MFYEKhz8GgPJKXV4KY3uwa", "SvGPJzr3mUIjg4zk3UE0lmEsGQStmHiR", "UIGV6MTRsZPNdj8JuGQraJXbpN7YiCpC", "sPKUkdPP6cbZl7mqg699SGb1Qg8cwcjc", "pSvb9vtzFVNohJw9Yc2pgYHm"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C11074v A07 = new C11074v();
    public final int[] A08 = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(C11074v c11074v, int i2) {
        int totalLength;
        if (i2 < 4) {
            return;
        }
        c11074v.A0g(3);
        int i3 = i2 - 4;
        if ((c11074v.A0I() & 128) != 0) {
            if (i3 < 7 || (totalLength = c11074v.A0K()) < 4) {
                return;
            }
            this.A01 = c11074v.A0M();
            this.A00 = c11074v.A0M();
            this.A07.A0d(totalLength - 4);
            i3 -= 7;
        }
        int limit = this.A07.A09();
        int position = this.A07.A0A();
        if (limit < position && i3 > 0) {
            int iMin = Math.min(i3, position - limit);
            c11074v.A0k(this.A07.A0l(), limit, iMin);
            this.A07.A0f(limit + iMin);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01(C11074v c11074v, int i2) {
        if (i2 < 19) {
            return;
        }
        this.A05 = c11074v.A0M();
        this.A04 = c11074v.A0M();
        c11074v.A0g(11);
        this.A02 = c11074v.A0M();
        this.A03 = c11074v.A0M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(C11074v c11074v, int i2) {
        if (i2 % 5 != 2) {
            return;
        }
        c11074v.A0g(2);
        Arrays.fill(this.A08, 0);
        int i3 = i2 / 5;
        for (int index = 0; index < i3; index++) {
            int iA0I = c11074v.A0I();
            int a2 = c11074v.A0I();
            int iA0I2 = c11074v.A0I();
            int iA0I3 = c11074v.A0I();
            int entryCount = iA0I2 - 128;
            int i4 = (int) (((double) a2) + (((double) entryCount) * 1.402d));
            int g = (int) ((((double) a2) - (((double) (iA0I3 - 128)) * 0.34414d)) - (((double) (iA0I2 - 128)) * 0.71414d));
            int entryCount2 = c11074v.A0I() << 24;
            this.A08[iA0I] = entryCount2 | (C5C.A07(i4, 0, 255) << 16) | (C5C.A07(g, 0, 255) << 8) | C5C.A07((int) (((double) a2) + (((double) (iA0I3 - 128)) * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    public final C2810pT A06() {
        int iA0I;
        if (this.A05 == 0 || this.A04 == 0 || this.A01 == 0 || this.A00 == 0 || this.A07.A0A() == 0 || this.A07.A09() != this.A07.A0A() || !this.A06) {
            return null;
        }
        this.A07.A0f(0);
        int[] iArr = new int[this.A01 * this.A00];
        int runLength = 0;
        while (runLength < iArr.length) {
            int argbBitmapDataIndex = this.A07.A0I();
            if (argbBitmapDataIndex != 0) {
                int[] argbBitmapData = this.A08;
                iArr[runLength] = argbBitmapData[argbBitmapDataIndex];
                runLength++;
            } else {
                int color = this.A07.A0I();
                if (color != 0) {
                    int i2 = color & 64;
                    String[] strArr = A09;
                    if (strArr[6].charAt(29) == strArr[4].charAt(29)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A09;
                    strArr2[0] = "GtJojiNEMobCnjKA96lXJCCL45Dtio0z";
                    strArr2[1] = "Lfhzohsg2V0yWJPoWAL0pRvwojJGYPpJ";
                    if (i2 == 0) {
                        iA0I = color & 63;
                    } else {
                        iA0I = ((color & 63) << 8) | this.A07.A0I();
                    }
                    Arrays.fill(iArr, runLength, runLength + iA0I, (color & 128) == 0 ? 0 : this.A08[this.A07.A0I()]);
                    runLength += iA0I;
                } else {
                    continue;
                }
            }
        }
        return new C10743o().A0D(Bitmap.createBitmap(iArr, this.A01, this.A00, Bitmap.Config.ARGB_8888)).A04(this.A02 / this.A05).A0A(0).A07(this.A03 / this.A04, 0).A09(0).A06(this.A01 / this.A05).A03(this.A00 / this.A04).A0H();
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0d(0);
        this.A06 = false;
    }
}
