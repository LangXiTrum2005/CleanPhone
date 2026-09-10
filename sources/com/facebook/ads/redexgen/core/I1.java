package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class I1 implements InterfaceC1938aq {
    public static byte[] A01;
    public static String[] A02 = {"BeK4HZWWIRhrC207wWuIOn", "ZxUaKMHZMCvHIxTDkc1UvZSYXikI2iYM", "xy0Ab8m7NOX4ZRxTfyGPwRY1TRrgVPC4", "ij8auLNb9rfA8yI55JUjNirWgnYpCp0M", "e9T4yeifuMgQg3dKDn6E2LsVBs4fgiHR", "ibrxpSG6qut0wBAmR6wSiB8exNotCqiu", "LMYPYXdb4SaVI93FsN1uYFih9", "8N3vGs6nddgUWUG"};
    public final /* synthetic */ C5F A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A02[2] = "F3dYTVgRpzEGoEWMN2T8FFCtbrhRHRBi";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 99);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{21, 19, 5, 18, 63, 14, 1, 22, 9, 7, 1, 20, 9, 15, 14, 63, 9, 1, 2};
    }

    static {
        A01();
    }

    public I1(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AF7(String str) {
        this.A00.A0Q = false;
        this.A00.A0F.setProgress(100);
        YB.A0O(this.A00.A0F, 8);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AF9(String str) {
        this.A00.A0Q = true;
        YB.A0O(this.A00.A0F, 0);
        this.A00.A0E.setUrl(str);
        if (!this.A00.A0P) {
            C5F c5f = this.A00;
            if (A02[5].charAt(30) != 'i') {
                throw new RuntimeException();
            }
            A02[7] = "LFtEVX0D7i5Pos5vlgnVVb1H7Q5y";
            if (c5f.A02 > 1) {
                this.A00.A0P = true;
                this.A00.A0i(A00(0, 19, 3));
            }
        }
        C5F.A05(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AFY(int i2) {
        if (this.A00.A0Q) {
            this.A00.A0F.setProgress(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AFb(String str) {
        this.A00.A0E.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AFe() {
        ((AbstractC1439Ij) this.A00).A0B.ADJ(14);
    }
}
