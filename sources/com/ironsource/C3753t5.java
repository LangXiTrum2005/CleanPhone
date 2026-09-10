package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3753t5 {
    public static final C3753t5 a = new C3753t5();

    private C3753t5() {
    }

    public static /* synthetic */ IronSourceError a(C3753t5 c3753t5, Y7 y7, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return c3753t5.a(y7, ironSourceError);
    }

    public final IronSourceError b() {
        return a(this, Y7.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    public final IronSourceError c() {
        return a(this, Y7.ISErrorInitInvalidResponse, null, 2, null);
    }

    public final IronSourceError d() {
        return a(this, Y7.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    public final IronSourceError e() {
        return a(this, Y7.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    public final IronSourceError f() {
        return a(this, Y7.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    public final IronSourceError g() {
        return a(this, Y7.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError h() {
        return a(this, Y7.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    public final IronSourceError i() {
        return a(this, Y7.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    public final IronSourceError j() {
        return a(this, Y7.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError k() {
        return a(this, Y7.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    public final IronSourceError l() {
        return a(this, Y7.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    public final IronSourceError m() {
        return a(this, Y7.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    public final IronSourceError n() {
        return a(this, Y7.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    public final IronSourceError o() {
        return a(this, Y7.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    public final IronSourceError p() {
        return a(this, Y7.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    public final IronSourceError q() {
        return a(this, Y7.ISErrorLoadNullADM, null, 2, null);
    }

    public final IronSourceError r() {
        return a(this, Y7.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    public final IronSourceError s() {
        return a(this, Y7.ISErrorLoadTimedOut, null, 2, null);
    }

    public final IronSourceError t() {
        return a(this, Y7.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private final IronSourceError a(Y7 y7, IronSourceError ironSourceError) {
        String strC;
        if (ironSourceError != null) {
            strC = y7.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ":" + ironSourceError.getErrorMessage() + "'";
        } else {
            strC = y7.c();
        }
        return new IronSourceError(y7.b(), strC);
    }

    public final IronSourceError b(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return a(Y7.ISErrorLoadNetworkFailed, error);
    }

    public final IronSourceError c(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return a(Y7.ISErrorLoadNetworkFailed, description);
    }

    public final IronSourceError d(String str) {
        return a(Y7.ISErrorRewardedLoadNoConfig, str);
    }

    public static /* synthetic */ IronSourceError b(C3753t5 c3753t5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c3753t5.b(str);
    }

    public final IronSourceError c(IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(Y7.ISErrorShowNetworkFailed, networkError);
    }

    public static /* synthetic */ IronSourceError c(C3753t5 c3753t5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c3753t5.d(str);
    }

    public final IronSourceError b(String str) {
        return a(Y7.ISErrorInterstitialLoadNoConfig, str);
    }

    private final IronSourceError a(Y7 y7, String str) {
        if (str == null || str.length() == 0) {
            str = y7.c();
        }
        return new IronSourceError(y7.b(), str);
    }

    public final IronSourceError a(IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(Y7.ISErrorInitNetworkFailed, networkError);
    }

    public final IronSourceError a() {
        return a(this, Y7.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C3753t5 c3753t5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c3753t5.a(str);
    }

    public final IronSourceError a(String str) {
        return a(Y7.ISErrorBannerLoadNoConfig, str);
    }
}
