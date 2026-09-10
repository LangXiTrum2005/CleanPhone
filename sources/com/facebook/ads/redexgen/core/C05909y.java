package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05909y {
    public static String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", "n", "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public EnumC05879v A01 = EnumC05879v.A03;
    public EnumC05889w A02 = EnumC05889w.A06;
    public EnumC05899x A03 = EnumC05899x.A02;
    public EnumC05869u A00 = EnumC05869u.A02;

    public final void A00() {
        this.A00 = EnumC05869u.A03;
    }

    public final void A01() {
        this.A02 = EnumC05889w.A04;
    }

    public final void A02() {
        this.A02 = EnumC05889w.A05;
    }

    public final void A03() {
        this.A03 = EnumC05899x.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC05889w.A06) {
            EnumC05889w enumC05889w = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (enumC05889w != EnumC05889w.A02 && this.A02 != EnumC05889w.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC05889w.A06 || this.A02 == EnumC05889w.A02;
    }

    public final boolean A06() {
        return this.A03 == EnumC05899x.A03;
    }

    public final boolean A07() {
        return this.A00 == EnumC05869u.A03;
    }
}
