package com.facebook.ads.redexgen.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1944lx extends AnonymousClass24 {
    public static byte[] A01;
    public final /* synthetic */ C1942lv A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, 24, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C1944lx(C1942lv c1942lv) {
        this.A00 = c1942lv;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A06() {
        this.A00.A08.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A07() {
        this.A00.A08.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A08() {
        if (this.A00.A03 == null) {
            this.A00.A08.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A09() {
        if (this.A00.A03 == null) {
            this.A00.A08.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A0A() {
        if (this.A00.A03 != null) {
            C7F c7f = (C7F) this.A00.A03.buildShowAdConfig();
            c7f.A02(System.currentTimeMillis() - this.A00.A02);
            this.A00.A03.show(c7f.build());
            return;
        }
        this.A00.A08.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A0C() {
        this.A00.A07.A0F().A3A();
        this.A00.A08.onAdClicked(this.A00.A09.A6a());
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A0D() {
        this.A00.A08.onLoggingImpression(this.A00.A09.A6a());
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A0F(AnonymousClass23 anonymousClass23) {
        if (this.A00.A05 == null) {
            this.A00.A07.A08().AAu(A00(0, 3, 67), AbstractC05418a.A0N, new C05428b(A00(3, 18, 108)));
            return;
        }
        AbstractC1988mh abstractC1988mh = (AbstractC1988mh) anonymousClass23;
        if (this.A00.A09.A03 != null) {
            abstractC1988mh.A02(this.A00.A09.A03);
        }
        this.A00.A09.A00 = abstractC1988mh.A0H();
        this.A00.A06 = true;
        this.A00.A04 = this.A00.A05.A0I();
        if (this.A00.A04 != null) {
            int iA1Z = 0;
            if (!this.A00.A04.A1B()) {
                iA1Z = ((AbstractC1984md) this.A00.A04).A1Z();
            }
            if (iA1Z > 0) {
                C6 c6 = new C6();
                if (c6.A09(this.A00.A07, this.A00.A09.A06, iA1Z)) {
                    c6.A08(this.A00.A07, true);
                    this.A00.A03 = c6.A07(this.A00.A07, this.A00.A09.A0D, this.A00.A09.A06);
                } else {
                    c6.A08(this.A00.A07, false);
                }
            }
        }
        if (this.A00.A03 != null) {
            ((AbstractC1984md) this.A00.A04).A1l(true);
            RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = this.A00.A03.buildLoadAdConfig().withFailOnCacheFailureEnabled(true).withRewardData(this.A00.A04.A0c()).withAdExperience(this.A00.A09.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.3I
                @Override // com.facebook.ads.AdListener
                public final void onAdClicked(Ad ad) {
                }

                @Override // com.facebook.ads.AdListener
                public final void onAdLoaded(Ad ad) {
                    this.A00.A00.A08.onAdLoaded(this.A00.A00.A09.A6a());
                }

                @Override // com.facebook.ads.AdListener
                public final void onError(Ad ad, AdError adError) {
                    this.A00.A00.A03 = null;
                    ((AbstractC1984md) this.A00.A00.A04).A1l(false);
                    this.A00.A00.A08.onAdLoaded(this.A00.A00.A09.A6a());
                }

                @Override // com.facebook.ads.AdListener
                public final void onLoggingImpression(Ad ad) {
                }

                @Override // com.facebook.ads.RewardedVideoAdListener
                public final void onRewardedVideoClosed() {
                    this.A00.A00.A08.onRewardedVideoClosed();
                }

                @Override // com.facebook.ads.RewardedVideoAdListener
                public final void onRewardedVideoCompleted() {
                    this.A00.A00.A08.onRewardedVideoCompleted();
                }
            }).build();
            this.A00.A03.loadAd(loadAdConfig);
            return;
        }
        this.A00.A08.onAdLoaded(this.A00.A09.A6a());
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A0G(C0597Ag c0597Ag) {
        this.A00.A0D(true);
        this.A00.A09.A0B.A0F().A3D(C0646Cu.A01(this.A00.A01), c0597Ag.A03().getErrorCode(), c0597Ag.A04());
        this.A00.A08.onError(this.A00.A09.A6a(), C8.A00(c0597Ag));
    }
}
