package com.adjust.sdk;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface IActivityHandler {
    void addGlobalCallbackParameter(String str, String str2);

    void addGlobalPartnerParameter(String str, String str2);

    void endFirstSessionDelay();

    void finishedTrackingActivity(ResponseData responseData);

    void gdprForgetMe();

    ActivityState getActivityState();

    void getAdid(OnAdidReadListener onAdidReadListener);

    void getAdidWithTimeout(long j10, OnAdidReadListener onAdidReadListener);

    AdjustConfig getAdjustConfig();

    void getAttribution(OnAttributionReadListener onAttributionReadListener);

    void getAttributionWithTimeout(long j10, OnAttributionReadListener onAttributionReadListener);

    Context getContext();

    DeviceInfo getDeviceInfo();

    q0 getFirstSessionDelayManager();

    GlobalParameters getGlobalParameters();

    ActivityHandler.InternalState getInternalState();

    void getThirdPartySharingSettingsWithTimeout(long j10, OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener);

    void gotOptOutResponse();

    void init(AdjustConfig adjustConfig);

    void isEnabled(OnIsEnabledListener onIsEnabledListener);

    boolean isEnabled();

    void launchAttributionResponseTasks(AttributionResponseData attributionResponseData);

    void launchEventResponseTasks(EventResponseData eventResponseData);

    void launchPurchaseVerificationResponseTasks(PurchaseVerificationResponseData purchaseVerificationResponseData);

    void launchSdkClickResponseTasks(SdkClickResponseData sdkClickResponseData);

    void launchSessionResponseTasks(SessionResponseData sessionResponseData);

    void onPause();

    void onResume();

    void processAndResolveDeeplink(AdjustDeeplink adjustDeeplink, long j10, OnDeeplinkResolvedListener onDeeplinkResolvedListener);

    void processDeeplink(AdjustDeeplink adjustDeeplink, long j10);

    void processRemoteTriggers(ResponseData responseData);

    void removeGlobalCallbackParameter(String str);

    void removeGlobalCallbackParameters();

    void removeGlobalPartnerParameter(String str);

    void removeGlobalPartnerParameters();

    void sendInstallReferrer(ReferrerDetails referrerDetails, String str);

    void sendLicenseVerificationData(LicenseData licenseData);

    void sendPreinstallReferrer();

    void sendReftagReferrer();

    void setAskingAttribution(boolean z10);

    void setCoppaComplianceInDelay(boolean z10);

    void setEnabled(boolean z10);

    void setExternalDeviceIdInDelay(String str);

    void setOfflineMode(boolean z10);

    void setPlayStoreKidsComplianceInDelay(boolean z10);

    void setPushToken(String str, boolean z10);

    void teardown();

    void trackAdRevenue(AdjustAdRevenue adjustAdRevenue);

    void trackEvent(AdjustEvent adjustEvent);

    void trackMeasurementConsent(boolean z10);

    void trackPlayStoreSubscription(AdjustPlayStoreSubscription adjustPlayStoreSubscription);

    void trackThirdPartySharing(AdjustThirdPartySharing adjustThirdPartySharing);

    boolean updateAttributionI(AdjustAttribution adjustAttribution);

    void verifyAndTrackPlayStorePurchase(AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener);

    void verifyPlayStorePurchase(AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener);
}
