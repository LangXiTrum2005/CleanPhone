package com.facebook.ads.redexgen.core;

import com.p004ironsource.dc;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class V1 {
    public static String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", dc.q, "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public EnumC1759Uy A01 = EnumC1759Uy.A03;
    public EnumC1760Uz A02 = EnumC1760Uz.A06;
    public V0 A03 = V0.A02;
    public EnumC1758Ux A00 = EnumC1758Ux.A02;

    public final void A00() {
        this.A00 = EnumC1758Ux.A03;
    }

    public final void A01() {
        this.A02 = EnumC1760Uz.A04;
    }

    public final void A02() {
        this.A02 = EnumC1760Uz.A05;
    }

    public final void A03() {
        this.A03 = V0.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC1760Uz.A06) {
            EnumC1760Uz enumC1760Uz = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (enumC1760Uz != EnumC1760Uz.A02 && this.A02 != EnumC1760Uz.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC1760Uz.A06 || this.A02 == EnumC1760Uz.A02;
    }

    public final boolean A06() {
        return this.A03 == V0.A03;
    }

    public final boolean A07() {
        return this.A00 == EnumC1758Ux.A03;
    }
}
