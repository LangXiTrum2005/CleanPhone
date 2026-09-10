package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0885Ma extends AbstractC1964mI {
    public static byte[] A00;
    public static String[] A01 = {"vV6RQP0QGAizSnvHrhrEiTJKYqnkk7vR", "gVueu7WJkm8gI", "", "raAPQvYZN3qaAVuN8G4E0NVfm2Y0LRUe", "w5hc", "", "RHGb3VvP2c2qxldOqnFEpaAIYmVmOJg8", "ZdfM9COnhESAyQW1NqvAdN1Ku5n51qre"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-43, -45, -32, -110, -31, -32, -34, -21, -110, -27, -41, -26, -110, -31, -32, -110, -28, -41, -23, -45, -28, -42, -41, -42, -110, -24, -37, -42, -41, -31, -110, -45, -42, -27, -80, -79, 98, -93, -90, -93, -78, -74, -89, -76, 98, -76, -89, -93, -90, -69, 98, -74, -79, 98, -75, -89, -74, 98, -76, -89, -71, -93, -76, -90, 98, -79, -80};
    }

    static {
        A02();
    }

    public C0885Ma(C1828k1 c1828k1, AnonymousClass37 anonymousClass37) {
        super(c1828k1, anonymousClass37);
    }

    private C1955m9 A00(Runnable runnable) {
        return new C1955m9(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1964mI
    public final void A0P() {
        AbstractC1988mh abstractC1988mh = (AbstractC1988mh) this.A01;
        abstractC1988mh.A00(this.A08.A00);
        abstractC1988mh.A01(this.A08.A01);
        abstractC1988mh.A0J();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1964mI
    public final void A0R(AnonymousClass23 anonymousClass23, C05608t c05608t, C05588r c05588r, AnonymousClass38 anonymousClass38) {
        N0 n0 = (N0) anonymousClass23;
        C1956mA c1956mA = new C1956mA(this, anonymousClass38, n0);
        if (C05789m.A2V(this.A0B)) {
            Handler handlerA0H = A0H();
            C05618u c05618uA05 = c05608t.A05();
            String[] strArr = A01;
            if (strArr[3].charAt(31) != strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "";
            strArr2[2] = "";
            handlerA0H.postDelayed(c1956mA, c05618uA05.A05());
        }
        n0.A0K(this.A0B, A00(c1956mA), anonymousClass38, this.A08.A06, this.A08.A04, this.A08.A05);
    }

    public final void A0a(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A8a() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC1988mh rewardedVideoAdapter = (AbstractC1988mh) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 82));
        }
        throw new IllegalStateException(A01(34, 33, 34));
    }
}
