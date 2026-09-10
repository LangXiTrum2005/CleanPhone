package com.facebook.ads.redexgen.core;

import com.facebook.ads.AudienceNetworkAds;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1813jm extends BY {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ AudienceNetworkAds.InitResult A01;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{86, 6, 83, 0, 85, 0, 85, 83, cw.n, 7, 8, 99, 42, 45, 42, 55, 42, 34, 47, 42, 57, 34, 55, 42, 44, 45, 99, 32, 44, 46, 51, 47, 38, 55, 38, 17, 22, cw.k, 48, 2, 5, 6};
    }

    public C1813jm(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        this.A00 = initListener;
        this.A01 = initResult;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        AbstractC0606Au.A05(A01(35, 7, 46), A01(8, 27, 14), A01(0, 8, 40));
        this.A00.onInitialized(this.A01);
    }
}
