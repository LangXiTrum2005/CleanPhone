package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11647a extends AbstractC2435j0 {
    public static byte[] A00;
    public static String[] A01 = {"vV6RQP0QGAizSnvHrhrEiTJKYqnkk7vR", "gVueu7WJkm8gI", "", "raAPQvYZN3qaAVuN8G4E0NVfm2Y0LRUe", "w5hc", "", "RHGb3VvP2c2qxldOqnFEpaAIYmVmOJg8", "ZdfM9COnhESAyQW1NqvAdN1Ku5n51qre"};

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-43, -45, -32, -110, -31, -32, -34, -21, -110, -27, -41, -26, -110, -31, -32, -110, -28, -41, -23, -45, -28, -42, -41, -42, -110, -24, -37, -42, -41, -31, -110, -45, -42, -27, -80, -79, 98, -93, -90, -93, -78, -74, -89, -76, 98, -76, -89, -93, -90, -69, 98, -74, -79, 98, -75, -89, -74, 98, -76, -89, -71, -93, -76, -90, 98, -79, -80};
    }

    static {
        A02();
    }

    public C11647a(C2300gi c2300gi, O7 o7) {
        super(c2300gi, o7);
    }

    private C2424ip A00(Runnable runnable) {
        return new C2424ip(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435j0
    public final void A0P() {
        AbstractC2469jh abstractC2469jh = (AbstractC2469jh) this.A01;
        abstractC2469jh.A00(this.A08.A00);
        abstractC2469jh.A01(this.A08.A01);
        abstractC2469jh.A0J();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435j0
    public final void A0R(N1 n1, C1731Tw c1731Tw, C1729Tu c1729Tu, O8 o8) {
        C11867w c11867w = (C11867w) n1;
        C2428it c2428it = new C2428it(this, o8, c11867w);
        if (C1750Up.A2f(this.A0B)) {
            Handler handlerA0H = A0H();
            C1732Tx c1732TxA05 = c1731Tw.A05();
            String[] strArr = A01;
            if (strArr[3].charAt(31) != strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "";
            strArr2[2] = "";
            handlerA0H.postDelayed(c2428it, c1732TxA05.A05());
        }
        c11867w.A0K(this.A0B, A00(c2428it), o8, this.A08.A06, this.A08.A04, this.A08.A05);
    }

    public final void A0a(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A8k() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC2469jh rewardedVideoAdapter = (AbstractC2469jh) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 82));
        }
        throw new IllegalStateException(A01(34, 33, 34));
    }
}
