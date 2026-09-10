package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1663hG implements EJ {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ EH A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, cw.k, cw.m, 76, 4, 3, 1, 7, 0, cw.k, cw.k, 9, 76, 3, 6, 17, 76, 3, 6, cw.n, 7, 18, cw.k, cw.n, 22, 11, 12, 5, 76, 36, 43, 44, 43, 49, 42, 61, 35, 38, 61, 48, 39, 50, 45, 48, 54, 43, 44, 37, 61, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public C1663hG(EH eh) {
        this.A00 = eh;
    }

    @Override // com.facebook.ads.redexgen.core.EJ
    public final void A4t() {
        if (this.A00.A07 != null) {
            this.A00.A07.A4Z(A00(0, 53, 115));
        }
    }

    @Override // com.facebook.ads.redexgen.core.EJ
    public final void A4u() {
        this.A00.A0M();
        if (this.A00.A08 != null) {
            this.A00.A08.AEs(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.EJ
    public final void A9S() {
        if (this.A00.A03 == null) {
            A4u();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        EH.A01(this.A00);
        if (this.A00.A03.A02() == null) {
            this.A00.A0C();
        } else {
            this.A00.A0E(this.A00.A03.A02());
        }
        if (C05789m.A2Q(this.A00.A05)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.EJ
    public final void AAe() {
        if (!TextUtils.isEmpty(this.A00.A04.A0I())) {
            C2.A0M(new C2(), this.A00.A05, C5.A00(this.A00.A04.A0I()), this.A00.A09);
        }
        this.A00.A02.A04();
    }

    @Override // com.facebook.ads.redexgen.core.EJ
    public final void AAf() {
        this.A00.A0M();
        if (this.A00.A08 != null) {
            this.A00.A08.AEs(true);
        }
        if (!TextUtils.isEmpty(this.A00.A04.A0C())) {
            C2.A0M(new C2(), this.A00.A05, C5.A00(this.A00.A04.A0C()), this.A00.A09);
        }
        this.A00.A02.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.EJ
    public final void AE6(EnumC04233i enumC04233i) {
        C04253k c04253kA0B;
        EH.A00(this.A00);
        this.A00.A01 = enumC04233i;
        if (this.A00.A01 == EnumC04233i.A04) {
            c04253kA0B = this.A00.A04.A0A();
        } else {
            EH eh = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c04253kA0B = eh.A04.A0B();
            } else {
                c04253kA0B = eh.A04.A0B();
            }
        }
        EH eh2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        eh2.A0E(c04253kA0B);
    }

    @Override // com.facebook.ads.redexgen.core.EJ
    public final void AEJ(C04253k c04253k) {
        EH.A00(this.A00);
        this.A00.A02.A07(c04253k.A01());
        if (c04253k.A05().isEmpty()) {
            this.A00.A0D(c04253k);
            return;
        }
        EH eh = this.A00;
        String[] strArr = A02;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
        strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
        eh.A0E(c04253k);
    }
}
