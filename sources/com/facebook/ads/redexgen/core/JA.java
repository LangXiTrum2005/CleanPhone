package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class JA {
    public static String[] A0C = {"uuzqWXLhVU5h", "MCiAyNDofRMgV8twnC7AiCrYM6kNh0jg", "HJXujHHcElJRTDtcfeo3Sy7Hv18RGZgy", "Amjr7hMXQx0e32VF8yWASHBDx37PervK", "NgKcffCH0RNam7yPBBIvJezNpINfNkiL", "oMs9elp", "apSAFH841DSL3paVepKSIoWcAWyBkdVZ", "h51QMR"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public J1 A04;
    public JR A05;
    public boolean A06;
    public final InterfaceC1407Hd A08;
    public final JQ A09 = new JQ();
    public final C11074v A07 = new C11074v();
    public final C11074v A0B = new C11074v(1);
    public final C11074v A0A = new C11074v();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final int A04(int i2, int i3) {
        C11074v c11074v;
        int length;
        JP jpA07 = A07();
        if (jpA07 == null) {
            return 0;
        }
        if (jpA07.A00 != 0) {
            c11074v = this.A09.A0H;
            length = jpA07.A00;
        } else {
            byte[] bArr = (byte[]) C5C.A0f(jpA07.A04);
            this.A0A.A0j(bArr, bArr.length);
            c11074v = this.A0A;
            length = bArr.length;
        }
        boolean zA06 = this.A09.A06(this.A01);
        boolean z2 = zA06 || i3 != 0;
        this.A0B.A0l()[0] = (byte) ((z2 ? 128 : 0) | length);
        this.A0B.A0f(0);
        this.A08.AIs(this.A0B, 1, 1);
        this.A08.AIs(c11074v, length, 1);
        if (!z2) {
            return length + 1;
        }
        if (!zA06) {
            this.A07.A0d(8);
            byte[] bArrA0l = this.A07.A0l();
            bArrA0l[0] = 0;
            bArrA0l[1] = 1;
            bArrA0l[2] = (byte) ((i3 >> 8) & 255);
            bArrA0l[3] = (byte) (i3 & 255);
            bArrA0l[4] = (byte) ((i2 >> 24) & 255);
            bArrA0l[5] = (byte) ((i2 >> 16) & 255);
            bArrA0l[6] = (byte) ((i2 >> 8) & 255);
            bArrA0l[7] = (byte) (i2 & 255);
            this.A08.AIs(this.A07, 8, 1);
            return length + 1 + 8;
        }
        C11074v c11074v2 = this.A09.A0H;
        int iA0M = c11074v2.A0M();
        c11074v2.A0g(-2);
        int i4 = (iA0M * 6) + 2;
        if (i3 != 0) {
            this.A07.A0d(i4);
            byte[] bArrA0l2 = this.A07.A0l();
            c11074v2.A0k(bArrA0l2, 0, i4);
            int i5 = (((bArrA0l2[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrA0l2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i3;
            bArrA0l2[2] = (byte) ((i5 >> 8) & 255);
            bArrA0l2[3] = (byte) (i5 & 255);
            c11074v2 = this.A07;
        }
        this.A08.AIs(c11074v2, i4, 1);
        return length + 1 + i4;
    }

    public JA(InterfaceC1407Hd interfaceC1407Hd, JR jr, J1 j1) {
        this.A08 = interfaceC1407Hd;
        this.A05 = jr;
        this.A04 = j1;
        A0C(jr, j1);
    }

    public final int A02() {
        int i2;
        if (!this.A06) {
            i2 = this.A05.A04[this.A01];
        } else {
            boolean[] zArr = this.A09.A0G;
            int flags = this.A01;
            i2 = zArr[flags] ? 1 : 0;
        }
        if (A07() == null) {
            return i2;
        }
        String[] strArr = A0C;
        String str = strArr[3];
        String str2 = strArr[2];
        int iCharAt = str.charAt(20);
        int flags2 = str2.charAt(20);
        if (iCharAt != flags2) {
            throw new RuntimeException();
        }
        A0C[4] = "Hkeae3ogmEOju43arfP4ZrrsYFDfrpvf";
        return i2 | 1073741824;
    }

    public final int A03() {
        if (!this.A06) {
            return this.A05.A05[this.A01];
        }
        return this.A09.A0B[this.A01];
    }

    public final long A05() {
        if (!this.A06) {
            return this.A05.A06[this.A01];
        }
        return this.A09.A0E[this.A02];
    }

    public final long A06() {
        if (!this.A06) {
            return this.A05.A07[this.A01];
        }
        return this.A09.A00(this.A01);
    }

    public final JP A07() {
        JP jpA00;
        if (!this.A06) {
            return null;
        }
        int i2 = ((J1) C5C.A0f(this.A09.A06)).A02;
        if (this.A09.A07 != null) {
            jpA00 = this.A09.A07;
        } else {
            jpA00 = this.A05.A03.A00(i2);
        }
        if (jpA00 == null || !jpA00.A03) {
            return null;
        }
        JP encryptionBox = jpA00;
        return encryptionBox;
    }

    public final void A08() {
        this.A09.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = false;
    }

    public final void A09() {
        JP jpA07 = A07();
        if (jpA07 == null) {
            return;
        }
        C11074v c11074v = this.A09.A0H;
        if (jpA07.A00 != 0) {
            c11074v.A0g(jpA07.A00);
        }
        if (this.A09.A06(this.A01)) {
            c11074v.A0g(c11074v.A0M() * 6);
        }
    }

    public final void A0A(long j) {
        for (int i2 = this.A01; i2 < searchIndex && this.A09.A00(i2) <= j; i2++) {
            if (this.A09.A0G[i2]) {
                this.A03 = i2;
            }
        }
    }

    public final void A0B(DrmInitData drmInitData) {
        JP encryptionBox = this.A05.A03.A00(((J1) C5C.A0f(this.A09.A06)).A02);
        this.A08.A6e(this.A05.A03.A07.A07().A0u(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)).A14());
    }

    public final void A0C(JR jr, J1 j1) {
        this.A05 = jr;
        this.A04 = j1;
        this.A08.A6e(jr.A03.A07);
        A08();
    }

    public final boolean A0D() {
        this.A01++;
        if (!this.A06) {
            return false;
        }
        this.A00++;
        if (this.A00 != this.A09.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
