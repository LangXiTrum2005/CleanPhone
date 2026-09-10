package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0245a8 {
    ISErrorInitNetworkFailed(7001, "Initialization failed due to network failure."),
    ISErrorInitDecryptionFailure(7002, "Initialization failed due to decryption failure."),
    ISErrorInitHttpRequestFailed(7003, "Initialization failed due to HTTP request failure."),
    ISErrorInitInvalidResponse(7004, "Initialization failed due to invalid response."),
    ISErrorLoadNetworkFailed(7101, "Loading failed due to network failure."),
    ISErrorLoadADMDecryptionFailure(7102, "Loading failed due to ADM decryption failure."),
    ISErrorLoadADMEmptyServerData(7103, "Loading failed due to empty server data."),
    ISErrorLoadADMEmptyWaterfall(7104, "Loading failed due to empty waterfall."),
    ISErrorLoadADMInvalidJSON(7105, "Loading failed due to invalid ADM JSON."),
    ISErrorLoadADMNoAuctionID(7106, "Loading failed due to missing auction ID."),
    ISErrorLoadADMNoConfigurationForRequestedNetwork(7107, "Loading failed due to no configuration for requested network."),
    ISErrorLoadADMInvalidConfigurationForRequestedNetwork(7108, "Loading failed due to invalid configuration for requested network."),
    ISErrorLoadBiddingInNonBidding(7109, "Loading failed due to non-bidding in bidding context."),
    ISErrorLoadNullADM(7110, "Loading failed due to null ADM."),
    ISErrorLoadInstanceNotInInitResponse(7111, "Loading failed due to instance not being in init response."),
    ISErrorLoadNoAdFormatConfigurations(7112, "Loading failed due to no ad format configurations."),
    ISErrorLoadTimedOut(7113, "Loading failed due to timeout."),
    ISErrorLoadSDKNotInitialized(7115, "Loading failed due to SDK not being initialized."),
    ISErrorLoadBannerNetworkViewIsNull(7116, "Loading failed due to null network banner view."),
    ISErrorLoadBannerSizeIsNull(7117, "Loading failed because the banner size is null."),
    ISErrorLoadBannerNotSupportedSize(7118, "Loading failed due to banner size not supported."),
    ISErrorShowNetworkFailed(7201, "Showing ad failed due to network failure."),
    ISErrorShowNotReadyToShowAd(7202, "Showing ad failed because the ad is not ready to show."),
    ISErrorInterstitialLoadNoConfig(10000, "Load failed due to no config"),
    ISErrorBannerLoadNoConfig(10001, "Load failed due to no config"),
    ISErrorRewardedLoadNoConfig(10002, "Load failed due to no config");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28204b;

    EnumC0245a8(int i10, String str) {
        this.f28203a = i10;
        this.f28204b = str;
    }

    public final int b() {
        return this.f28203a;
    }

    public final String c() {
        return this.f28204b;
    }
}
