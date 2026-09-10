package com.thinkup.network.startapp;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class StartAppTUInitManager extends TUInitMediation {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile StartAppTUInitManager f42621n = null;
    private static final String o = "StartAppTUInitManager";
    private String m;
    private List<StartAppAd> o0 = new ArrayList();

    private StartAppTUInitManager() {
    }

    public static StartAppTUInitManager getInstance() {
        if (f42621n == null) {
            synchronized (StartAppTUInitManager.class) {
                try {
                    if (f42621n == null) {
                        f42621n = new StartAppTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42621n;
    }

    public static void o(AdPreferences adPreferences, Map<String, Object> map) {
        try {
            String stringFromMap = TUInitMediation.getStringFromMap(map, mo.oon.mm);
            if (TextUtils.isEmpty(stringFromMap)) {
                return;
            }
            adPreferences.setPlacementId(stringFromMap);
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.36";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return "StartApp";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.startapp.sdk.adsbase.StartAppSDK";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return StartAppTUConst.getNetworkVersion();
    }

    public synchronized void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    public void putAdReference(StartAppAd startAppAd) {
        this.o0.add(startAppAd);
    }

    public void removeAdReference(StartAppAd startAppAd) {
        if (startAppAd != null) {
            this.o0.remove(startAppAd);
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        StartAppSDK.setUserConsent(context, "pas", System.currentTimeMillis(), z2);
        return true;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public synchronized void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        StartAppSDK.addWrapper(context, "topon", TUSDK.getSDKVersionName());
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        try {
            if (map.containsKey("app_ccpa_switch") && TUInitMediation.getBooleanFromMap(map, "app_ccpa_switch")) {
                StartAppSDK.getExtras(context).edit().putString("IABUSPrivacy_String", "1YYN").apply();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(stringFromMap)) {
            if (TextUtils.isEmpty(this.m) || !TextUtils.equals(this.m, stringFromMap)) {
                try {
                    boolean zEquals = TextUtils.equals(TUInitMediation.getStringFromMap(map, "is_test"), "1");
                    Log.d(o, "initSDK() >>> isDebug: ".concat(String.valueOf(zEquals)));
                    StartAppSDK.setTestAdsEnabled(zEquals);
                } catch (Throwable unused2) {
                }
                StartAppSDK.init(context.getApplicationContext(), stringFromMap);
                StartAppAd.disableAutoInterstitial();
                StartAppAd.disableSplash();
                this.m = stringFromMap;
            }
            if (mediationInitCallback != null) {
                mediationInitCallback.onSuccess();
            }
        } else if (mediationInitCallback != null) {
            mediationInitCallback.onFail("app_id is empty");
        }
    }

    public final void o(final Context context, final Map<String, Object> map, final Map<String, Object> map2, final TUBidRequestInfoListener tUBidRequestInfoListener, final int i2) {
        getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.startapp.StartAppTUInitManager.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                if (tUBidRequestInfoListener2 != null) {
                    tUBidRequestInfoListener2.onFailed(str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                String bidToken = StartAppSDK.getBidToken();
                if (TextUtils.isEmpty(bidToken)) {
                    onFail(TUBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE);
                    return;
                }
                StartAppBidRequestInfo startAppBidRequestInfo = new StartAppBidRequestInfo(context, map, map2, bidToken, i2);
                TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                if (tUBidRequestInfoListener2 != null) {
                    tUBidRequestInfoListener2.onSuccess(startAppBidRequestInfo);
                }
            }
        });
    }
}
