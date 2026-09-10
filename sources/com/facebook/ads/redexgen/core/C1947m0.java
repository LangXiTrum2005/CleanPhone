package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1947m0 extends AnonymousClass24 {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C1945ly A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, 63, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public C1947m0(C1945ly c1945ly) {
        this.A00 = c1945ly;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A02() {
        if (this.A00.A01 == null) {
            this.A00.A04 = false;
            this.A00.A07.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A04() {
        if (this.A00.A01 != null) {
            this.A00.A01.show();
            return;
        }
        this.A00.A04 = false;
        if (this.A00.A03 != null && C05789m.A24(this.A00.A06)) {
            this.A00.A03.A0S(new m1(this));
            this.A00.A03.A0N();
            this.A00.A03.A0K();
            this.A00.A03 = null;
        }
        this.A00.A07.onInterstitialDismissed(this.A00.A08.A6a());
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A05() {
        this.A00.A07.onInterstitialDisplayed(this.A00.A08.A6a());
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A06() {
        this.A00.A07.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A07() {
        this.A00.A07.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A08() {
        this.A00.A07.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A0C() {
        this.A00.A06.A0F().A3A();
        this.A00.A07.onAdClicked(this.A00.A08.A6a());
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A0D() {
        this.A00.A07.onLoggingImpression(this.A00.A08.A6a());
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A0E(View view) {
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A0F(AnonymousClass23 anonymousClass23) {
        if (this.A00.A03 != null) {
            this.A00.A05 = true;
            this.A00.A02 = this.A00.A03.A0I();
            if (!(this.A00.A02 instanceof AbstractC1984md)) {
                InterstitialAdExtendedListener interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    interstitialAdExtendedListener.onAdLoaded(this.A00.A08.A6a());
                    return;
                }
            } else {
                final AbstractC1984md abstractC1984md = (AbstractC1984md) this.A00.A02;
                if (abstractC1984md.A1Z() > 0) {
                    C6 c6 = new C6();
                    if (c6.A09(this.A00.A06, this.A00.A08.A08(), abstractC1984md.A1Z())) {
                        c6.A08(this.A00.A06, true);
                        this.A00.A01 = c6.A06(this.A00.A06, this.A00.A08.A0A(), this.A00.A08.A08());
                    } else {
                        C1945ly c1945ly = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            c6.A08(c1945ly.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            c6.A08(c1945ly.A06, false);
                        }
                    }
                }
                C1945ly c1945ly2 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    if (c1945ly2.A01 != null) {
                        abstractC1984md.A1l(true);
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = this.A00.A01.buildLoadAdConfig().withAdListener(new InterstitialAdListener() { // from class: com.facebook.ads.redexgen.X.3H
                            @Override // com.facebook.ads.AdListener
                            public final void onAdClicked(Ad ad) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onAdLoaded(Ad ad) {
                                this.A01.A00.A07.onAdLoaded(this.A01.A00.A08.A6a());
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onError(Ad ad, AdError adError) {
                                this.A01.A00.A01 = null;
                                abstractC1984md.A1l(false);
                                this.A01.A00.A07.onAdLoaded(this.A01.A00.A08.A6a());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDismissed(Ad ad) {
                                this.A01.A00.A04 = false;
                                if (this.A01.A00.A03 != null) {
                                    this.A01.A00.A03.A0S(new C1948m2(this));
                                    this.A01.A00.A03.A0N();
                                    this.A01.A00.A03.A0K();
                                    this.A01.A00.A03 = null;
                                }
                                this.A01.A00.A07.onInterstitialDismissed(this.A01.A00.A08.A6a());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDisplayed(Ad ad) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onLoggingImpression(Ad ad) {
                            }
                        }).withCacheFlags(this.A00.A08.A0B()).withRewardData(this.A00.A08.A03()).build();
                        this.A00.A01.loadAd(loadAdConfig);
                        return;
                    }
                    C1945ly c1945ly3 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        c1945ly3.A07.onAdLoaded(this.A00.A08.A6a());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        c1945ly3.A07.onAdLoaded(this.A00.A08.A6a());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().AAu(A00(0, 3, 98), AbstractC05418a.A0N, new C05428b(A00(3, 18, 46)));
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass24
    public final void A0G(C0597Ag c0597Ag) {
        this.A00.A06.A0F().A3D(C0646Cu.A01(this.A00.A00), c0597Ag.A03().getErrorCode(), c0597Ag.A04());
        this.A00.A07.onError(this.A00.A08.A6a(), C8.A00(c0597Ag));
    }
}
