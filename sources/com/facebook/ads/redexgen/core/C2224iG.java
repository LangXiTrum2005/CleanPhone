package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2224iG extends OU implements InterstitialAdExtendedListener {
    public static byte[] A01;
    public final C2245id A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-62, -57, -51, -40, -66, -53, -53, -56, -53, -40, -68, -56, -67, -66, -40, -60, -66, -46, 117, 120, 119, 112, -120, 114, 119, 127, 106, 117, 114, 109, 106, 125, 114, 120, 119, -120, 125, 114, 118, 110, -120, 116, 110, -126, -66, -65, -67, -54, -80, -67, -67, -70, -67, -54, -72, -80, -66, -66, -84, -78, -80, -54, -74, -80, -60};
    }

    public C2224iG(String str, OW ow, C2245id c2245id) {
        super(str, ow);
        this.A00 = c2245id;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        super.A00.AEs(1024, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(18, 26, 14), this.A00.A0D());
        super.A00.AEs(1020, this.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(44, 21, 80), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 94), adError.getErrorCode());
        super.A00.AEs(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, this.A01, bundle);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        super.A00.AEs(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        super.A00.AEs(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
        super.A00.AEs(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
        super.A00.AEs(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
        super.A00.AEs(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
        super.A00.AEs(3002, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
        super.A00.AEs(3001, this.A01, null);
    }
}
