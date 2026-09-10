package com.p004ironsource.adapters.supersonicads;

import android.text.TextUtils;
import com.p004ironsource.ac;
import com.p004ironsource.ds;
import com.p004ironsource.er;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.q9;
import com.p004ironsource.zb;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class SupersonicConfig {
    private static SupersonicConfig mInstance;
    private final String CUSTOM_PARAM_PREFIX = "custom_";
    private final String CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
    private final String DYNAMIC_CONTROLLER_URL = "controllerUrl";
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
    NetworkSettings mProviderSettings = new NetworkSettings(er.c().b("Mediation"));

    private SupersonicConfig() {
    }

    private Map<String, String> convertCustomParams(Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            try {
                Set<String> setKeySet = map.keySet();
                if (setKeySet != null) {
                    for (String str : setKeySet) {
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = map.get(str);
                            if (TextUtils.isEmpty(str2)) {
                                continue;
                            } else {
                                map2.put("custom_" + str, str2);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, ":convertCustomParams()", e2);
            }
        }
        return map2;
    }

    public static SupersonicConfig getConfigObj() {
        if (mInstance == null) {
            mInstance = new SupersonicConfig();
        }
        return mInstance;
    }

    public boolean getClientSideCallbacks() {
        NetworkSettings networkSettings = this.mProviderSettings;
        if (networkSettings == null || networkSettings.getRewardedVideoSettings() == null || !this.mProviderSettings.getRewardedVideoSettings().has("useClientSideCallbacks")) {
            return false;
        }
        return this.mProviderSettings.getRewardedVideoSettings().optBoolean("useClientSideCallbacks", false);
    }

    @Deprecated
    public void setClientSideCallbacks(boolean z2) {
        zb zbVar = new zb(ac.SET_CLIENT_SIDE_CALLBACKS, IronSourceUtils.getMediationAdditionalData(false));
        zbVar.a(IronSourceConstants.EVENTS_EXT1, Boolean.valueOf(z2));
        ds.i().a(zbVar);
        this.mProviderSettings.setRewardedVideoSettings("useClientSideCallbacks", String.valueOf(z2));
    }

    public void setCustomControllerUrl(String str) {
        this.mProviderSettings.setRewardedVideoSettings("controllerUrl", str);
        this.mProviderSettings.setInterstitialSettings("controllerUrl", str);
        this.mProviderSettings.setBannerSettings("controllerUrl", str);
        this.mProviderSettings.setNativeAdSettings("controllerUrl", str);
    }

    public void setDebugMode(int i2) {
        this.mProviderSettings.setRewardedVideoSettings("debugMode", Integer.valueOf(i2));
        this.mProviderSettings.setInterstitialSettings("debugMode", Integer.valueOf(i2));
        this.mProviderSettings.setBannerSettings("debugMode", Integer.valueOf(i2));
        this.mProviderSettings.setNativeAdSettings("debugMode", Integer.valueOf(i2));
    }
}
