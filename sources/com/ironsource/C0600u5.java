package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.u5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0600u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0600u5 f30795a = new C0600u5();

    private C0600u5() {
    }

    public static /* synthetic */ IronSourceError a(C0600u5 c0600u5, EnumC0245a8 enumC0245a8, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            ironSourceError = null;
        }
        return c0600u5.a(enumC0245a8, ironSourceError);
    }

    public final IronSourceError b() {
        return a(this, EnumC0245a8.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    public final IronSourceError c() {
        return a(this, EnumC0245a8.ISErrorInitInvalidResponse, null, 2, null);
    }

    public final IronSourceError d() {
        return a(this, EnumC0245a8.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    public final IronSourceError e() {
        return a(this, EnumC0245a8.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    public final IronSourceError f() {
        return a(this, EnumC0245a8.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    public final IronSourceError g() {
        return a(this, EnumC0245a8.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError h() {
        return a(this, EnumC0245a8.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    public final IronSourceError i() {
        return a(this, EnumC0245a8.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    public final IronSourceError j() {
        return a(this, EnumC0245a8.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError k() {
        return a(this, EnumC0245a8.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    public final IronSourceError l() {
        return a(this, EnumC0245a8.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    public final IronSourceError m() {
        return a(this, EnumC0245a8.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    public final IronSourceError n() {
        return a(this, EnumC0245a8.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    public final IronSourceError o() {
        return a(this, EnumC0245a8.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    public final IronSourceError p() {
        return a(this, EnumC0245a8.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    public final IronSourceError q() {
        return a(this, EnumC0245a8.ISErrorLoadNullADM, null, 2, null);
    }

    public final IronSourceError r() {
        return a(this, EnumC0245a8.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    public final IronSourceError s() {
        return a(this, EnumC0245a8.ISErrorLoadTimedOut, null, 2, null);
    }

    public final IronSourceError t() {
        return a(this, EnumC0245a8.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private final IronSourceError a(EnumC0245a8 enumC0245a8, IronSourceError ironSourceError) {
        String strC;
        if (ironSourceError != null) {
            strC = enumC0245a8.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ":" + ironSourceError.getErrorMessage() + "'";
        } else {
            strC = enumC0245a8.c();
        }
        return new IronSourceError(enumC0245a8.b(), strC);
    }

    public final IronSourceError b(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        return a(EnumC0245a8.ISErrorLoadNetworkFailed, error);
    }

    public final IronSourceError c(String description) {
        kotlin.jvm.internal.n.f(description, "description");
        return a(EnumC0245a8.ISErrorLoadNetworkFailed, description);
    }

    public final IronSourceError d(String str) {
        return a(EnumC0245a8.ISErrorRewardedLoadNoConfig, str);
    }

    public static /* synthetic */ IronSourceError b(C0600u5 c0600u5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c0600u5.b(str);
    }

    public final IronSourceError c(IronSourceError networkError) {
        kotlin.jvm.internal.n.f(networkError, "networkError");
        return a(EnumC0245a8.ISErrorShowNetworkFailed, networkError);
    }

    public static /* synthetic */ IronSourceError c(C0600u5 c0600u5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c0600u5.d(str);
    }

    public final IronSourceError b(String str) {
        return a(EnumC0245a8.ISErrorInterstitialLoadNoConfig, str);
    }

    private final IronSourceError a(EnumC0245a8 enumC0245a8, String str) {
        if (str == null || str.length() == 0) {
            str = enumC0245a8.c();
        }
        return new IronSourceError(enumC0245a8.b(), str);
    }

    public final IronSourceError a(IronSourceError networkError) {
        kotlin.jvm.internal.n.f(networkError, "networkError");
        return a(EnumC0245a8.ISErrorInitNetworkFailed, networkError);
    }

    public final IronSourceError a() {
        return a(this, EnumC0245a8.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C0600u5 c0600u5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c0600u5.a(str);
    }

    public final IronSourceError a(String str) {
        return a(EnumC0245a8.ISErrorBannerLoadNoConfig, str);
    }
}
