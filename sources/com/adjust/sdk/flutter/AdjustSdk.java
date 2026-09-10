package com.adjust.sdk.flutter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAdRevenue;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustDeeplink;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.AdjustPlayStorePurchase;
import com.adjust.sdk.AdjustPlayStoreSubscription;
import com.adjust.sdk.AdjustRemoteTrigger;
import com.adjust.sdk.AdjustStoreInfo;
import com.adjust.sdk.AdjustTestOptions;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.adjust.sdk.AdjustThirdPartySharingResult;
import com.adjust.sdk.Constants;
import com.adjust.sdk.LogLevel;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import fc.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import m0.s1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ti.b;
import u5.c;
import u5.d;
import ui.a;
import xi.m;
import xi.n;
import xi.o;
import xi.p;
import xi.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustSdk implements b, n, a, s {
    private static String DIRECT_DEEPLINK_CALLBACK_NAME = "adj-direct-deeplink";
    private static String TAG = "AdjustBridge";
    private static boolean isDeferredDeeplinkOpeningEnabled = true;
    private ui.b activityPluginBinding;
    private Context applicationContext;
    private p channel;
    private boolean isSdkInitialized = false;
    private final ArrayList<HashMap<String, String>> cachedDirectDeeplinks = new ArrayList<>();

    private void addGlobalCallbackParameter(m mVar, o oVar) {
        String str;
        String str2;
        if (mVar.b(X3.i.W) && mVar.b(X3.i.X)) {
            str = (String) mVar.a(X3.i.W);
            str2 = (String) mVar.a(X3.i.X);
        } else {
            str = null;
            str2 = null;
        }
        Adjust.addGlobalCallbackParameter(str, str2);
        oVar.a(null);
    }

    private void addGlobalPartnerParameter(m mVar, o oVar) {
        String str;
        String str2;
        if (mVar.b(X3.i.W) && mVar.b(X3.i.X)) {
            str = (String) mVar.a(X3.i.W);
            str2 = (String) mVar.a(X3.i.X);
        } else {
            str = null;
            str2 = null;
        }
        Adjust.addGlobalPartnerParameter(str, str2);
        oVar.a(null);
    }

    private void detachFromActivity() {
        ui.b bVar = this.activityPluginBinding;
        if (bVar != null) {
            ((HashSet) ((f) bVar).f40784f).remove(this);
            this.activityPluginBinding = null;
        }
    }

    private void disable(o oVar) {
        Adjust.disable();
        oVar.a(null);
    }

    private void disableCoppaComplianceInDelay(m mVar, o oVar) {
        Adjust.disableCoppaComplianceInDelay();
    }

    private void disablePlayStoreKidsComplianceInDelay(m mVar, o oVar) {
        Adjust.disablePlayStoreKidsComplianceInDelay();
    }

    private void dispatchOrCacheDirectDeeplink(Uri uri, Uri uri2) {
        p pVar;
        if (uri == null) {
            return;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put(Constants.DEEPLINK, uri.toString());
        if (uri2 != null) {
            map.put(Constants.REFERRER, uri2.toString());
        }
        if (!this.isSdkInitialized || (pVar = this.channel) == null) {
            this.cachedDirectDeeplinks.add(map);
        } else {
            pVar.a(DIRECT_DEEPLINK_CALLBACK_NAME, map, null);
        }
    }

    private void enable(o oVar) {
        Adjust.enable();
        oVar.a(null);
    }

    private void enableCoppaComplianceInDelay(m mVar, o oVar) {
        Adjust.enableCoppaComplianceInDelay();
    }

    private void enablePlayStoreKidsComplianceInDelay(m mVar, o oVar) {
        Adjust.enablePlayStoreKidsComplianceInDelay();
    }

    private void endFirstSessionDelay(m mVar, o oVar) {
        Adjust.endFirstSessionDelay();
    }

    private void flushCachedDirectDeeplinks() {
        if (!this.isSdkInitialized || this.channel == null || this.cachedDirectDeeplinks.isEmpty()) {
            return;
        }
        Iterator<HashMap<String, String>> it = this.cachedDirectDeeplinks.iterator();
        while (it.hasNext()) {
            this.channel.a(DIRECT_DEEPLINK_CALLBACK_NAME, it.next(), null);
        }
        this.cachedDirectDeeplinks.clear();
    }

    private void gdprForgetMe(o oVar) {
        Adjust.gdprForgetMe(this.applicationContext);
        oVar.a(null);
    }

    private void getAdid(o oVar) {
        Adjust.getAdid(new u5.a(0, oVar));
    }

    private void getAdidWithTimeout(m mVar, o oVar) {
        Map map = (Map) mVar.f53823b;
        if (map == null || map.get("timeoutInMilliseconds") == null) {
            oVar.b("INVALID_ARGUMENT", "timeoutInMilliseconds is required", null);
            return;
        }
        try {
            Adjust.getAdidWithTimeout(this.applicationContext, Long.parseLong(map.get("timeoutInMilliseconds").toString()), new u5.a(1, oVar));
        } catch (NumberFormatException unused) {
            oVar.b("INVALID_ARGUMENT", "timeoutInMilliseconds must be a valid number", null);
        }
    }

    private void getAmazonAdId(o oVar) {
        Adjust.getAmazonAdId(this.applicationContext, new com.dexterous.flutterlocalnotifications.b(oVar));
    }

    private void getAppTrackingAuthorizationStatus(m mVar, o oVar) {
        oVar.a(-1);
    }

    private void getAttribution(o oVar) {
        Adjust.getAttribution(new u5.b(0, oVar));
    }

    private void getAttributionWithTimeout(m mVar, o oVar) {
        Map map = (Map) mVar.f53823b;
        if (map == null || map.get("timeoutInMilliseconds") == null) {
            oVar.b("INVALID_ARGUMENT", "timeoutInMilliseconds is required", null);
            return;
        }
        try {
            Adjust.getAttributionWithTimeout(this.applicationContext, Long.parseLong(map.get("timeoutInMilliseconds").toString()), new u5.b(1, oVar));
        } catch (NumberFormatException unused) {
            oVar.b("INVALID_ARGUMENT", "timeoutInMilliseconds must be a valid number", null);
        }
    }

    private void getGoogleAdId(o oVar) {
        Adjust.getGoogleAdId(this.applicationContext, new com.dexterous.flutterlocalnotifications.a(oVar));
    }

    private void getIdfa(o oVar) {
        oVar.a("Error. No getIdfa on Android platform!");
    }

    private void getIdfv(o oVar) {
        oVar.a("Error. No getIdfv on Android platform!");
    }

    private void getLastDeeplink(o oVar) {
        Adjust.getLastDeeplink(this.applicationContext, new com.dexterous.flutterlocalnotifications.a(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getRemoteTriggerMap(AdjustRemoteTrigger adjustRemoteTrigger) {
        HashMap<String, String> map = new HashMap<>();
        String string = JsonUtils.EMPTY_JSON;
        if (adjustRemoteTrigger == null) {
            map.put("label", "");
            map.put("payloadJson", JsonUtils.EMPTY_JSON);
            return map;
        }
        map.put("label", adjustRemoteTrigger.getLabel() != null ? adjustRemoteTrigger.getLabel() : "");
        if (adjustRemoteTrigger.getPayload() != null) {
            string = adjustRemoteTrigger.getPayload().toString();
        }
        map.put("payloadJson", string);
        return map;
    }

    private void getSdkVersion(o oVar) {
        Adjust.getSdkVersion(new com.dexterous.flutterlocalnotifications.b(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getThirdPartySharingResultMap(AdjustThirdPartySharingResult adjustThirdPartySharingResult) {
        HashMap<String, String> map = new HashMap<>();
        if (adjustThirdPartySharingResult == null || adjustThirdPartySharingResult.getThirdPartySharingSettingsJson() == null) {
            map.put("thirdPartySharingSettingsJson", JsonUtils.EMPTY_JSON);
            return map;
        }
        map.put("thirdPartySharingSettingsJson", adjustThirdPartySharingResult.getThirdPartySharingSettingsJson());
        return map;
    }

    private void getThirdPartySharingSettingsWithTimeout(m mVar, o oVar) {
        Map map = (Map) mVar.f53823b;
        if (map == null || map.get("timeoutInMilliseconds") == null) {
            oVar.b("INVALID_ARGUMENT", "timeoutInMilliseconds is required", null);
            return;
        }
        try {
            Adjust.getThirdPartySharingSettingsWithTimeout(this.applicationContext, Long.parseLong(map.get("timeoutInMilliseconds").toString()), new s1(this, oVar));
        } catch (NumberFormatException unused) {
            oVar.b("INVALID_ARGUMENT", "timeoutInMilliseconds must be a valid number", null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    private void initSdk(m mVar, o oVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Map map = (Map) mVar.f53823b;
        if (map == null) {
            return;
        }
        AdjustConfig adjustConfig = new AdjustConfig(this.applicationContext, map.containsKey("appToken") ? (String) map.get("appToken") : null, map.containsKey("environment") ? (String) map.get("environment") : null, map.containsKey("logLevel") && (str10 = (String) map.get("logLevel")) != null && str10.equals("suppress"));
        if (map.containsKey("sdkPrefix")) {
            adjustConfig.setSdkPrefix((String) map.get("sdkPrefix"));
        }
        if (map.containsKey("logLevel") && (str9 = (String) map.get("logLevel")) != null) {
            switch (str9.hashCode()) {
                case -1663129931:
                    if (str9.equals("suppress")) {
                        adjustConfig.setLogLevel(LogLevel.SUPPRESS);
                    } else {
                        adjustConfig.setLogLevel(LogLevel.INFO);
                    }
                    break;
                case -1408208058:
                    if (str9.equals("assert")) {
                        adjustConfig.setLogLevel(LogLevel.ASSERT);
                    } else {
                        adjustConfig.setLogLevel(LogLevel.INFO);
                    }
                    break;
                case 3237038:
                    str9.equals(Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH);
                    adjustConfig.setLogLevel(LogLevel.INFO);
                    break;
                case 3641990:
                    if (str9.equals("warn")) {
                        adjustConfig.setLogLevel(LogLevel.WARN);
                    } else {
                        adjustConfig.setLogLevel(LogLevel.INFO);
                    }
                    break;
                case 95458899:
                    if (str9.equals("debug")) {
                        adjustConfig.setLogLevel(LogLevel.DEBUG);
                    } else {
                        adjustConfig.setLogLevel(LogLevel.INFO);
                    }
                    break;
                case 96784904:
                    if (str9.equals("error")) {
                        adjustConfig.setLogLevel(LogLevel.ERROR);
                    } else {
                        adjustConfig.setLogLevel(LogLevel.INFO);
                    }
                    break;
                case 351107458:
                    if (str9.equals("verbose")) {
                        adjustConfig.setLogLevel(LogLevel.VERBOSE);
                    } else {
                        adjustConfig.setLogLevel(LogLevel.INFO);
                    }
                    break;
                default:
                    adjustConfig.setLogLevel(LogLevel.INFO);
                    break;
            }
        }
        if (map.containsKey("isFirstSessionDelayEnabled") && Boolean.parseBoolean((String) map.get("isFirstSessionDelayEnabled"))) {
            adjustConfig.enableFirstSessionDelay();
        }
        if (map.containsKey("isCoppaComplianceEnabled") && Boolean.parseBoolean((String) map.get("isCoppaComplianceEnabled"))) {
            adjustConfig.enableCoppaCompliance();
        }
        if (map.containsKey("isPlayStoreKidsComplianceEnabled") && Boolean.parseBoolean((String) map.get("isPlayStoreKidsComplianceEnabled"))) {
            adjustConfig.enablePlayStoreKidsCompliance();
        }
        if (map.containsKey("isDeviceIdsReadingOnceEnabled") && Boolean.parseBoolean((String) map.get("isDeviceIdsReadingOnceEnabled"))) {
            adjustConfig.enableDeviceIdsReadingOnce();
        }
        if (map.containsKey("isGoogleAdIdReadingEnabled") && !Boolean.parseBoolean((String) map.get("isGoogleAdIdReadingEnabled"))) {
            adjustConfig.disableGoogleAdIdReading();
        }
        if (map.containsKey("isAndroidIdReadingEnabled") && !Boolean.parseBoolean((String) map.get("isAndroidIdReadingEnabled"))) {
            adjustConfig.disableAndroidIdReading();
        }
        if (map.containsKey("isAppSetIdReadingEnabled") && !Boolean.parseBoolean((String) map.get("isAppSetIdReadingEnabled"))) {
            adjustConfig.disableAppSetIdReading();
        }
        if (map.containsKey("isFbIdReadingEnabled") && !Boolean.parseBoolean((String) map.get("isFbIdReadingEnabled"))) {
            adjustConfig.disableFbIdReading();
        }
        if (map.containsKey("isFireAdIdReadingEnabled") && !Boolean.parseBoolean((String) map.get("isFireAdIdReadingEnabled"))) {
            adjustConfig.disableFireAdIdReading();
        }
        if (map.containsKey("isDeviceIdsFromPluginsReadingEnabled") && !Boolean.parseBoolean((String) map.get("isDeviceIdsFromPluginsReadingEnabled"))) {
            adjustConfig.disableDeviceIdsFromPluginsReading();
        }
        if (map.containsKey("isDeviceIdsReadingEnabled") && !Boolean.parseBoolean((String) map.get("isDeviceIdsReadingEnabled"))) {
            adjustConfig.disableDeviceIdsReading();
        }
        if (map.containsKey("eventDeduplicationIdsMaxSize")) {
            try {
                Integer numValueOf = Integer.valueOf((String) map.get("eventDeduplicationIdsMaxSize"));
                numValueOf.getClass();
                adjustConfig.setEventDeduplicationIdsMaxSize(numValueOf);
            } catch (Exception unused) {
            }
        }
        if (map.containsKey("storeInfo")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("storeInfo"));
                if (jSONObject.has("storeName") && !jSONObject.isNull("storeName")) {
                    AdjustStoreInfo adjustStoreInfo = new AdjustStoreInfo(jSONObject.getString("storeName"));
                    if (jSONObject.has("storeAppId") && !jSONObject.isNull("storeAppId")) {
                        adjustStoreInfo.setStoreAppId(jSONObject.getString("storeAppId"));
                    }
                    adjustConfig.setStoreInfo(adjustStoreInfo);
                }
            } catch (JSONException unused2) {
            }
        }
        if (map.containsKey("urlStrategyDomains") && map.containsKey("useSubdomains") && map.containsKey("isDataResidency")) {
            try {
                JSONArray jSONArray = new JSONArray((String) map.get("urlStrategyDomains"));
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add((String) jSONArray.get(i10));
                }
                adjustConfig.setUrlStrategy(arrayList, Boolean.parseBoolean((String) map.get("useSubdomains")), Boolean.parseBoolean((String) map.get("isDataResidency")));
            } catch (JSONException unused3) {
            }
        }
        if (map.containsKey("processName")) {
            adjustConfig.setProcessName((String) map.get("processName"));
        }
        if (map.containsKey("defaultTracker")) {
            adjustConfig.setDefaultTracker((String) map.get("defaultTracker"));
        }
        if (map.containsKey("externalDeviceId")) {
            adjustConfig.setExternalDeviceId((String) map.get("externalDeviceId"));
        }
        if (map.containsKey("preinstallFilePath")) {
            adjustConfig.setPreinstallFilePath((String) map.get("preinstallFilePath"));
        }
        if (map.containsKey("fbAppId")) {
            adjustConfig.setFbAppId((String) map.get("fbAppId"));
        }
        if (map.containsKey("isSendingInBackgroundEnabled") && Boolean.parseBoolean((String) map.get("isSendingInBackgroundEnabled"))) {
            adjustConfig.enableSendingInBackground();
        }
        if (map.containsKey("isCostDataInAttributionEnabled") && Boolean.parseBoolean((String) map.get("isCostDataInAttributionEnabled"))) {
            adjustConfig.enableCostDataInAttribution();
        }
        if (map.containsKey("isPreinstallTrackingEnabled") && Boolean.parseBoolean((String) map.get("isPreinstallTrackingEnabled"))) {
            adjustConfig.enablePreinstallTracking();
        }
        if (map.containsKey("isDeferredDeeplinkOpeningEnabled")) {
            isDeferredDeeplinkOpeningEnabled = ((String) map.get("isDeferredDeeplinkOpeningEnabled")).equals(com.ironsource.mediationsdk.metadata.a.f29610g);
        }
        if (map.containsKey("attributionCallback") && (str8 = (String) map.get("attributionCallback")) != null) {
            adjustConfig.setOnAttributionChangedListener(new c(this, str8));
        }
        if (map.containsKey("sessionSuccessCallback") && (str7 = (String) map.get("sessionSuccessCallback")) != null) {
            adjustConfig.setOnSessionTrackingSucceededListener(new d(this, str7));
        }
        if (map.containsKey("sessionFailureCallback") && (str6 = (String) map.get("sessionFailureCallback")) != null) {
            adjustConfig.setOnSessionTrackingFailedListener(new c(this, str6));
        }
        if (map.containsKey("eventSuccessCallback") && (str5 = (String) map.get("eventSuccessCallback")) != null) {
            adjustConfig.setOnEventTrackingSucceededListener(new d(this, str5));
        }
        if (map.containsKey("eventFailureCallback") && (str4 = (String) map.get("eventFailureCallback")) != null) {
            adjustConfig.setOnEventTrackingFailedListener(new c(this, str4));
        }
        if (map.containsKey("deferredDeeplinkCallback") && (str3 = (String) map.get("deferredDeeplinkCallback")) != null) {
            adjustConfig.setOnDeferredDeeplinkResponseListener(new d(this, str3));
        }
        if (map.containsKey("remoteTriggerCallback") && (str2 = (String) map.get("remoteTriggerCallback")) != null) {
            adjustConfig.setOnRemoteTriggerListener(new c(this, str2));
        }
        if (map.containsKey("thirdPartySharingSettingsChangedCallback") && (str = (String) map.get("thirdPartySharingSettingsChangedCallback")) != null) {
            adjustConfig.setOnThirdPartySharingSettingsChangedListener(new d(this, str));
        }
        Adjust.initSdk(adjustConfig);
        this.isSdkInitialized = true;
        flushCachedDirectDeeplinks();
        oVar.a(null);
    }

    private void isEnabled(o oVar) {
        Adjust.isEnabled(this.applicationContext, new com.dexterous.flutterlocalnotifications.d(oVar));
    }

    private void onPause(o oVar) {
        Adjust.onPause();
        oVar.a(null);
    }

    private void onResume(o oVar) {
        Adjust.onResume();
        oVar.a(null);
    }

    private void processAndResolveDeeplink(m mVar, o oVar) {
        AdjustDeeplink adjustDeeplink;
        Map map = (Map) mVar.f53823b;
        if (map == null) {
            return;
        }
        if (map.containsKey(Constants.DEEPLINK)) {
            adjustDeeplink = new AdjustDeeplink(Uri.parse((String) map.get(Constants.DEEPLINK)));
            if (map.containsKey(Constants.REFERRER)) {
                adjustDeeplink.setReferrer(Uri.parse((String) map.get(Constants.REFERRER)));
            }
        } else {
            adjustDeeplink = null;
        }
        Adjust.processAndResolveDeeplink(adjustDeeplink, this.applicationContext, new com.dexterous.flutterlocalnotifications.c(oVar));
    }

    private void processDeeplink(m mVar, o oVar) {
        AdjustDeeplink adjustDeeplink;
        Map map = (Map) mVar.f53823b;
        if (map == null) {
            return;
        }
        if (map.containsKey(Constants.DEEPLINK)) {
            adjustDeeplink = new AdjustDeeplink(Uri.parse((String) map.get(Constants.DEEPLINK)));
            if (map.containsKey(Constants.REFERRER)) {
                adjustDeeplink.setReferrer(Uri.parse((String) map.get(Constants.REFERRER)));
            }
        } else {
            adjustDeeplink = null;
        }
        Adjust.processDeeplink(adjustDeeplink, this.applicationContext);
        oVar.a(null);
    }

    private void processDeeplinkFromIntent(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        dispatchOrCacheDirectDeeplink(data, null);
    }

    private void removeGlobalCallbackParameter(m mVar, o oVar) {
        Adjust.removeGlobalCallbackParameter(mVar.b(X3.i.W) ? (String) mVar.a(X3.i.W) : null);
        oVar.a(null);
    }

    private void removeGlobalCallbackParameters(o oVar) {
        Adjust.removeGlobalCallbackParameters();
        oVar.a(null);
    }

    private void removeGlobalPartnerParameter(m mVar, o oVar) {
        Adjust.removeGlobalPartnerParameter(mVar.b(X3.i.W) ? (String) mVar.a(X3.i.W) : null);
        oVar.a(null);
    }

    private void removeGlobalPartnerParameters(o oVar) {
        Adjust.removeGlobalPartnerParameters();
        oVar.a(null);
    }

    private void requestAppTrackingAuthorization(o oVar) {
        oVar.a(-1);
    }

    private void setExternalDeviceIdInDelay(m mVar, o oVar) {
        Map map = (Map) mVar.f53823b;
        Adjust.setExternalDeviceIdInDelay(map.containsKey("externalDeviceId") ? map.get("externalDeviceId").toString() : null);
        oVar.a(null);
    }

    private void setPushToken(m mVar, o oVar) {
        Map map = (Map) mVar.f53823b;
        Adjust.setPushToken(map.containsKey("pushToken") ? map.get("pushToken").toString() : null, this.applicationContext);
        oVar.a(null);
    }

    private void setReferrer(m mVar, o oVar) {
        Adjust.setReferrer(mVar.b(Constants.REFERRER) ? (String) mVar.a(Constants.REFERRER) : null, this.applicationContext);
        oVar.a(null);
    }

    private void setTestOptions(m mVar, o oVar) {
        AdjustTestOptions adjustTestOptions = new AdjustTestOptions();
        Map map = (Map) mVar.f53823b;
        if (map.containsKey("baseUrl")) {
            adjustTestOptions.baseUrl = (String) map.get("baseUrl");
        }
        if (map.containsKey("gdprUrl")) {
            adjustTestOptions.gdprUrl = (String) map.get("gdprUrl");
        }
        if (map.containsKey("subscriptionUrl")) {
            adjustTestOptions.subscriptionUrl = (String) map.get("subscriptionUrl");
        }
        if (map.containsKey("purchaseVerificationUrl")) {
            adjustTestOptions.purchaseVerificationUrl = (String) map.get("purchaseVerificationUrl");
        }
        if (map.containsKey("basePath")) {
            adjustTestOptions.basePath = (String) map.get("basePath");
        }
        if (map.containsKey("gdprPath")) {
            adjustTestOptions.gdprPath = (String) map.get("gdprPath");
        }
        if (map.containsKey("subscriptionPath")) {
            adjustTestOptions.subscriptionPath = (String) map.get("subscriptionPath");
        }
        if (map.containsKey("purchaseVerificationPath")) {
            adjustTestOptions.purchaseVerificationPath = (String) map.get("purchaseVerificationPath");
        }
        if (map.containsKey("noBackoffWait")) {
            adjustTestOptions.noBackoffWait = Boolean.valueOf(map.get("noBackoffWait").toString().equals(com.ironsource.mediationsdk.metadata.a.f29610g));
        }
        if (map.containsKey("teardown")) {
            adjustTestOptions.teardown = Boolean.valueOf(map.get("teardown").toString().equals(com.ironsource.mediationsdk.metadata.a.f29610g));
        }
        if (map.containsKey("tryInstallReferrer")) {
            adjustTestOptions.tryInstallReferrer = Boolean.valueOf(map.get("tryInstallReferrer").toString().equals(com.ironsource.mediationsdk.metadata.a.f29610g));
        }
        if (map.containsKey("timerIntervalInMilliseconds")) {
            adjustTestOptions.timerIntervalInMilliseconds = Long.valueOf(Long.parseLong(map.get("timerIntervalInMilliseconds").toString()));
        }
        if (map.containsKey("timerStartInMilliseconds")) {
            adjustTestOptions.timerStartInMilliseconds = Long.valueOf(Long.parseLong(map.get("timerStartInMilliseconds").toString()));
        }
        if (map.containsKey("sessionIntervalInMilliseconds")) {
            adjustTestOptions.sessionIntervalInMilliseconds = Long.valueOf(Long.parseLong(map.get("sessionIntervalInMilliseconds").toString()));
        }
        if (map.containsKey("subsessionIntervalInMilliseconds")) {
            adjustTestOptions.subsessionIntervalInMilliseconds = Long.valueOf(Long.parseLong(map.get("subsessionIntervalInMilliseconds").toString()));
        }
        if (map.containsKey("deleteState")) {
            adjustTestOptions.context = this.applicationContext;
        }
        if (map.containsKey("ignoreSystemLifecycleBootstrap")) {
            adjustTestOptions.ignoreSystemLifecycleBootstrap = Boolean.valueOf(map.get("ignoreSystemLifecycleBootstrap").toString().equals(com.ironsource.mediationsdk.metadata.a.f29610g));
        }
        Adjust.setTestOptions(adjustTestOptions);
    }

    private void switchBackToOnlineMode(o oVar) {
        Adjust.switchBackToOnlineMode();
        oVar.a(null);
    }

    private void switchToOfflineMode(o oVar) {
        Adjust.switchToOfflineMode();
        oVar.a(null);
    }

    private void trackAdRevenue(m mVar, o oVar) {
        Map map = (Map) mVar.f53823b;
        if (map == null) {
            return;
        }
        AdjustAdRevenue adjustAdRevenue = new AdjustAdRevenue(map.containsKey("source") ? (String) map.get("source") : null);
        if (map.containsKey("revenue") || map.containsKey("currency")) {
            try {
                adjustAdRevenue.setRevenue(Double.valueOf(Double.parseDouble((String) map.get("revenue"))), (String) map.get("currency"));
            } catch (NumberFormatException unused) {
            }
        }
        if (map.containsKey("adImpressionsCount")) {
            adjustAdRevenue.setAdImpressionsCount(Integer.valueOf(Integer.parseInt((String) map.get("adImpressionsCount"))));
        }
        if (map.containsKey("adRevenueNetwork")) {
            adjustAdRevenue.setAdRevenueNetwork((String) map.get("adRevenueNetwork"));
        }
        if (map.containsKey("adRevenueUnit")) {
            adjustAdRevenue.setAdRevenueUnit((String) map.get("adRevenueUnit"));
        }
        if (map.containsKey("adRevenuePlacement")) {
            adjustAdRevenue.setAdRevenuePlacement((String) map.get("adRevenuePlacement"));
        }
        if (map.containsKey("callbackParameters")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("callbackParameters"));
                JSONArray jSONArrayNames = jSONObject.names();
                for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
                    String string = jSONArrayNames.getString(i10);
                    adjustAdRevenue.addCallbackParameter(string, jSONObject.getString(string));
                }
            } catch (JSONException e10) {
                Log.e(TAG, "Failed to parse ad revenue callback parameter! Details: " + e10);
            }
        }
        if (map.containsKey("partnerParameters")) {
            try {
                JSONObject jSONObject2 = new JSONObject((String) map.get("partnerParameters"));
                JSONArray jSONArrayNames2 = jSONObject2.names();
                for (int i11 = 0; i11 < jSONArrayNames2.length(); i11++) {
                    String string2 = jSONArrayNames2.getString(i11);
                    adjustAdRevenue.addPartnerParameter(string2, jSONObject2.getString(string2));
                }
            } catch (JSONException e11) {
                Log.e(TAG, "Failed to parse ad revenue partner parameter! Details: " + e11);
            }
        }
        Adjust.trackAdRevenue(adjustAdRevenue);
        oVar.a(null);
    }

    private void trackAppStoreSubscription(o oVar) {
        oVar.a("Error. No trackAppStoreSubscription on Android platform!");
    }

    private void trackEvent(m mVar, o oVar) {
        double d10;
        Map map = (Map) mVar.f53823b;
        if (map == null) {
            return;
        }
        AdjustEvent adjustEvent = new AdjustEvent(map.containsKey("eventToken") ? (String) map.get("eventToken") : null);
        if (map.containsKey("revenue") || map.containsKey("currency")) {
            try {
                d10 = Double.parseDouble((String) map.get("revenue"));
            } catch (NumberFormatException unused) {
                d10 = -1.0d;
            }
            adjustEvent.setRevenue(d10, (String) map.get("currency"));
        }
        if (map.containsKey("deduplicationId")) {
            adjustEvent.setDeduplicationId((String) map.get("deduplicationId"));
        }
        if (map.containsKey("productId")) {
            adjustEvent.setProductId((String) map.get("productId"));
        }
        if (map.containsKey(com.facebook.appevents.internal.Constants.GP_IAP_PURCHASE_TOKEN)) {
            adjustEvent.setPurchaseToken((String) map.get(com.facebook.appevents.internal.Constants.GP_IAP_PURCHASE_TOKEN));
        }
        if (map.containsKey("callbackId")) {
            adjustEvent.setCallbackId((String) map.get("callbackId"));
        }
        if (map.containsKey("callbackParameters")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("callbackParameters"));
                JSONArray jSONArrayNames = jSONObject.names();
                for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
                    String string = jSONArrayNames.getString(i10);
                    adjustEvent.addCallbackParameter(string, jSONObject.getString(string));
                }
            } catch (JSONException e10) {
                Log.e(TAG, "Failed to parse event callback parameter! Details: " + e10);
            }
        }
        if (map.containsKey("partnerParameters")) {
            try {
                JSONObject jSONObject2 = new JSONObject((String) map.get("partnerParameters"));
                JSONArray jSONArrayNames2 = jSONObject2.names();
                for (int i11 = 0; i11 < jSONArrayNames2.length(); i11++) {
                    String string2 = jSONArrayNames2.getString(i11);
                    adjustEvent.addPartnerParameter(string2, jSONObject2.getString(string2));
                }
            } catch (JSONException e11) {
                Log.e(TAG, "Failed to parse event partner parameter! Details: " + e11);
            }
        }
        Adjust.trackEvent(adjustEvent);
        oVar.a(null);
    }

    private void trackMeasurementConsent(m mVar, o oVar) {
        Map map = (Map) mVar.f53823b;
        if (!map.containsKey("measurementConsent")) {
            oVar.b("0", "Arguments null or wrong (missing argument of 'trackMeasurementConsent' method.", null);
        } else {
            Adjust.trackMeasurementConsent(((Boolean) map.get("measurementConsent")).booleanValue());
            oVar.a(null);
        }
    }

    private void trackPlayStoreSubscription(m mVar, o oVar) {
        long j10;
        Map map = (Map) mVar.f53823b;
        if (map == null) {
            return;
        }
        if (map.containsKey("price")) {
            try {
                j10 = Long.parseLong(map.get("price").toString());
            } catch (NumberFormatException unused) {
                j10 = -1;
            }
        } else {
            j10 = -1;
        }
        AdjustPlayStoreSubscription adjustPlayStoreSubscription = new AdjustPlayStoreSubscription(j10, map.containsKey("currency") ? (String) map.get("currency") : null, map.containsKey(AppLovinEventParameters.PRODUCT_IDENTIFIER) ? (String) map.get(AppLovinEventParameters.PRODUCT_IDENTIFIER) : null, map.containsKey("orderId") ? (String) map.get("orderId") : null, map.containsKey(InAppPurchaseMetaData.KEY_SIGNATURE) ? (String) map.get(InAppPurchaseMetaData.KEY_SIGNATURE) : null, map.containsKey(com.facebook.appevents.internal.Constants.GP_IAP_PURCHASE_TOKEN) ? (String) map.get(com.facebook.appevents.internal.Constants.GP_IAP_PURCHASE_TOKEN) : null);
        if (map.containsKey(com.facebook.appevents.internal.Constants.GP_IAP_PURCHASE_TIME)) {
            try {
                adjustPlayStoreSubscription.setPurchaseTime(Long.parseLong(map.get(com.facebook.appevents.internal.Constants.GP_IAP_PURCHASE_TIME).toString()));
            } catch (NumberFormatException unused2) {
            }
        }
        if (map.containsKey("callbackParameters")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("callbackParameters"));
                JSONArray jSONArrayNames = jSONObject.names();
                for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
                    String string = jSONArrayNames.getString(i10);
                    adjustPlayStoreSubscription.addCallbackParameter(string, jSONObject.getString(string));
                }
            } catch (JSONException e10) {
                Log.e(TAG, "Failed to parse subscription callback parameter! Details: " + e10);
            }
        }
        if (map.containsKey("partnerParameters")) {
            try {
                JSONObject jSONObject2 = new JSONObject((String) map.get("partnerParameters"));
                JSONArray jSONArrayNames2 = jSONObject2.names();
                for (int i11 = 0; i11 < jSONArrayNames2.length(); i11++) {
                    String string2 = jSONArrayNames2.getString(i11);
                    adjustPlayStoreSubscription.addPartnerParameter(string2, jSONObject2.getString(string2));
                }
            } catch (JSONException e11) {
                Log.e(TAG, "Failed to parse subscription partner parameter! Details: " + e11);
            }
        }
        Adjust.trackPlayStoreSubscription(adjustPlayStoreSubscription);
        oVar.a(null);
    }

    private void trackThirdPartySharing(m mVar, o oVar) {
        Map map = (Map) mVar.f53823b;
        if (map == null) {
            return;
        }
        AdjustThirdPartySharing adjustThirdPartySharing = new AdjustThirdPartySharing(map.containsKey("isEnabled") ? (Boolean) map.get("isEnabled") : null);
        if (map.containsKey("granularOptions")) {
            String[] strArrSplit = ((String) map.get("granularOptions")).split("__ADJ__", -1);
            for (int i10 = 0; i10 < strArrSplit.length; i10 += 3) {
                adjustThirdPartySharing.addGranularOption(strArrSplit[i10], strArrSplit[i10 + 1], strArrSplit[i10 + 2]);
            }
        }
        if (map.containsKey("partnerSharingSettings")) {
            String[] strArrSplit2 = ((String) map.get("partnerSharingSettings")).split("__ADJ__", -1);
            for (int i11 = 0; i11 < strArrSplit2.length; i11 += 3) {
                adjustThirdPartySharing.addPartnerSharingSetting(strArrSplit2[i11], strArrSplit2[i11 + 1], Boolean.parseBoolean(strArrSplit2[i11 + 2]));
            }
        }
        Adjust.trackThirdPartySharing(adjustThirdPartySharing);
        oVar.a(null);
    }

    private void updateSkanConversionValue(o oVar) {
        oVar.a("Error. No updateSkanConversionValue on Android platform!");
    }

    private void verifyAndTrackAppStorePurchase(m mVar, o oVar) {
        oVar.a("Error. No verifyAndTrackAppStorePurchase on Android platform!");
    }

    private void verifyAndTrackPlayStorePurchase(m mVar, o oVar) {
        double d10;
        Map map = (Map) mVar.f53823b;
        if (map == null) {
            return;
        }
        AdjustEvent adjustEvent = new AdjustEvent(map.containsKey("eventToken") ? (String) map.get("eventToken") : null);
        if (map.containsKey("revenue") || map.containsKey("currency")) {
            try {
                d10 = Double.parseDouble((String) map.get("revenue"));
            } catch (NumberFormatException unused) {
                d10 = -1.0d;
            }
            adjustEvent.setRevenue(d10, (String) map.get("currency"));
        }
        if (map.containsKey("deduplicationId")) {
            adjustEvent.setDeduplicationId((String) map.get("deduplicationId"));
        }
        if (map.containsKey("productId")) {
            adjustEvent.setProductId((String) map.get("productId"));
        }
        if (map.containsKey(com.facebook.appevents.internal.Constants.GP_IAP_PURCHASE_TOKEN)) {
            adjustEvent.setPurchaseToken((String) map.get(com.facebook.appevents.internal.Constants.GP_IAP_PURCHASE_TOKEN));
        }
        if (map.containsKey("callbackId")) {
            adjustEvent.setCallbackId((String) map.get("callbackId"));
        }
        if (map.containsKey("callbackParameters")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("callbackParameters"));
                JSONArray jSONArrayNames = jSONObject.names();
                for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
                    String string = jSONArrayNames.getString(i10);
                    adjustEvent.addCallbackParameter(string, jSONObject.getString(string));
                }
            } catch (JSONException e10) {
                Log.e(TAG, "Failed to parse event callback parameter! Details: " + e10);
            }
        }
        if (map.containsKey("partnerParameters")) {
            try {
                JSONObject jSONObject2 = new JSONObject((String) map.get("partnerParameters"));
                JSONArray jSONArrayNames2 = jSONObject2.names();
                for (int i11 = 0; i11 < jSONArrayNames2.length(); i11++) {
                    String string2 = jSONArrayNames2.getString(i11);
                    adjustEvent.addPartnerParameter(string2, jSONObject2.getString(string2));
                }
            } catch (JSONException e11) {
                Log.e(TAG, "Failed to parse event partner parameter! Details: " + e11);
            }
        }
        Adjust.verifyAndTrackPlayStorePurchase(adjustEvent, new com.dexterous.flutterlocalnotifications.d(oVar));
    }

    private void verifyAppStorePurchase(m mVar, o oVar) {
        oVar.a("Error. No verifyAppStorePurchase on Android platform!");
    }

    private void verifyPlayStorePurchase(m mVar, o oVar) {
        Map map = (Map) mVar.f53823b;
        if (map == null) {
            return;
        }
        Adjust.verifyPlayStorePurchase(new AdjustPlayStorePurchase(map.containsKey("productId") ? (String) map.get("productId") : null, map.containsKey(com.facebook.appevents.internal.Constants.GP_IAP_PURCHASE_TOKEN) ? (String) map.get(com.facebook.appevents.internal.Constants.GP_IAP_PURCHASE_TOKEN) : null), new com.dexterous.flutterlocalnotifications.c(oVar));
    }

    @Override // ui.a
    public void onAttachedToActivity(ui.b bVar) {
        this.activityPluginBinding = bVar;
        ((f) bVar).d(this);
        processDeeplinkFromIntent(((Activity) ((f) this.activityPluginBinding).f40780b).getIntent());
    }

    @Override // ti.b
    public void onAttachedToEngine(ti.a aVar) {
        this.applicationContext = aVar.f50787a;
        p pVar = new p(aVar.f50789c, "com.adjust.sdk/api");
        this.channel = pVar;
        pVar.b(this);
    }

    @Override // ui.a
    public void onDetachedFromActivity() {
        detachFromActivity();
    }

    @Override // ui.a
    public void onDetachedFromActivityForConfigChanges() {
        detachFromActivity();
    }

    @Override // ti.b
    public void onDetachedFromEngine(ti.a aVar) {
        detachFromActivity();
        this.isSdkInitialized = false;
        this.cachedDirectDeeplinks.clear();
        this.applicationContext = null;
        p pVar = this.channel;
        if (pVar != null) {
            pVar.b(null);
        }
        this.channel = null;
    }

    @Override // xi.n
    public void onMethodCall(m mVar, o oVar) {
        String str = mVar.f53822a;
        str.getClass();
        switch (str) {
            case "processDeeplink":
                processDeeplink(mVar, oVar);
                break;
            case "endFirstSessionDelay":
                endFirstSessionDelay(mVar, oVar);
                break;
            case "removeGlobalCallbackParameters":
                removeGlobalCallbackParameters(oVar);
                break;
            case "getGoogleAdId":
                getGoogleAdId(oVar);
                break;
            case "getAttributionWithTimeout":
                getAttributionWithTimeout(mVar, oVar);
                break;
            case "enablePlayStoreKidsComplianceInDelay":
                enablePlayStoreKidsComplianceInDelay(mVar, oVar);
                break;
            case "removeGlobalPartnerParameter":
                removeGlobalPartnerParameter(mVar, oVar);
                break;
            case "onPause":
                onPause(oVar);
                break;
            case "enable":
                enable(oVar);
                break;
            case "addGlobalCallbackParameter":
                addGlobalCallbackParameter(mVar, oVar);
                break;
            case "removeGlobalPartnerParameters":
                removeGlobalPartnerParameters(oVar);
                break;
            case "trackPlayStoreSubscription":
                trackPlayStoreSubscription(mVar, oVar);
                break;
            case "addGlobalPartnerParameter":
                addGlobalPartnerParameter(mVar, oVar);
                break;
            case "getAttribution":
                getAttribution(oVar);
                break;
            case "processAndResolveDeeplink":
                processAndResolveDeeplink(mVar, oVar);
                break;
            case "switchToOfflineMode":
                switchToOfflineMode(oVar);
                break;
            case "setExternalDeviceIdInDelay":
                setExternalDeviceIdInDelay(mVar, oVar);
                break;
            case "removeGlobalCallbackParameter":
                removeGlobalCallbackParameter(mVar, oVar);
                break;
            case "updateSkanConversionValue":
                updateSkanConversionValue(oVar);
                break;
            case "getAmazonAdId":
                getAmazonAdId(oVar);
                break;
            case "getAppTrackingAuthorizationStatus":
                getAppTrackingAuthorizationStatus(mVar, oVar);
                break;
            case "switchBackToOnlineMode":
                switchBackToOnlineMode(oVar);
                break;
            case "getAdid":
                getAdid(oVar);
                break;
            case "getIdfa":
                getIdfa(oVar);
                break;
            case "getIdfv":
                getIdfv(oVar);
                break;
            case "verifyPlayStorePurchase":
                verifyPlayStorePurchase(mVar, oVar);
                break;
            case "getThirdPartySharingSettingsWithTimeout":
                getThirdPartySharingSettingsWithTimeout(mVar, oVar);
                break;
            case "trackAdRevenue":
                trackAdRevenue(mVar, oVar);
                break;
            case "setTestOptions":
                setTestOptions(mVar, oVar);
                break;
            case "verifyAndTrackPlayStorePurchase":
                verifyAndTrackPlayStorePurchase(mVar, oVar);
                break;
            case "disablePlayStoreKidsComplianceInDelay":
                disablePlayStoreKidsComplianceInDelay(mVar, oVar);
                break;
            case "getLastDeeplink":
                getLastDeeplink(oVar);
                break;
            case "setPushToken":
                setPushToken(mVar, oVar);
                break;
            case "trackMeasurementConsent":
                trackMeasurementConsent(mVar, oVar);
                break;
            case "getAdidWithTimeout":
                getAdidWithTimeout(mVar, oVar);
                break;
            case "trackEvent":
                trackEvent(mVar, oVar);
                break;
            case "gdprForgetMe":
                gdprForgetMe(oVar);
                break;
            case "enableCoppaComplianceInDelay":
                enableCoppaComplianceInDelay(mVar, oVar);
                break;
            case "requestAppTrackingAuthorization":
                requestAppTrackingAuthorization(oVar);
                break;
            case "disableCoppaComplianceInDelay":
                disableCoppaComplianceInDelay(mVar, oVar);
                break;
            case "onResume":
                onResume(oVar);
                break;
            case "disable":
                disable(oVar);
                break;
            case "verifyAppStorePurchase":
                verifyAppStorePurchase(mVar, oVar);
                break;
            case "verifyAndTrackAppStorePurchase":
                verifyAndTrackAppStorePurchase(mVar, oVar);
                break;
            case "trackAppStoreSubscription":
                trackAppStoreSubscription(oVar);
                break;
            case "initSdk":
                initSdk(mVar, oVar);
                break;
            case "getSdkVersion":
                getSdkVersion(oVar);
                break;
            case "isEnabled":
                isEnabled(oVar);
                break;
            case "trackThirdPartySharing":
                trackThirdPartySharing(mVar, oVar);
                break;
            default:
                Log.e(TAG, "Not implemented method: " + mVar.f53822a);
                oVar.c();
                break;
        }
    }

    @Override // xi.s
    public boolean onNewIntent(Intent intent) {
        processDeeplinkFromIntent(intent);
        return false;
    }

    @Override // ui.a
    public void onReattachedToActivityForConfigChanges(ui.b bVar) {
        onAttachedToActivity(bVar);
    }
}
