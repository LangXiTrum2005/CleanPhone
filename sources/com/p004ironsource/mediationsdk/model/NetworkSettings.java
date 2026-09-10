package com.p004ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.q9;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class NetworkSettings {
    private static final String r = "customNetwork";
    private static final String s = "customNetworkPackage";
    private static final String t = "customNetworkAdapterName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f25971c;
    private JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f25972e;
    private JSONObject f;
    private JSONObject g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f25973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f25974i;
    private boolean j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25975l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f25976n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f25977p;
    private String q;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f25969a = networkSettings.getProviderName();
        this.k = networkSettings.getProviderName();
        this.f25970b = networkSettings.getProviderTypeForReflection();
        this.d = networkSettings.getRewardedVideoSettings();
        this.f25972e = networkSettings.getInterstitialSettings();
        this.f = networkSettings.getBannerSettings();
        this.g = networkSettings.getNativeAdSettings();
        this.f25971c = networkSettings.getApplicationSettings();
        this.f25975l = networkSettings.getRewardedVideoPriority();
        this.m = networkSettings.getInterstitialPriority();
        this.f25976n = networkSettings.getBannerPriority();
        this.o = networkSettings.getNativeAdPriority();
        this.f25977p = networkSettings.getProviderDefaultInstance();
        this.q = networkSettings.getProviderNetworkKey();
    }

    public String getAdSourceNameForEvents() {
        return this.f25974i;
    }

    public JSONObject getApplicationSettings() {
        return this.f25971c;
    }

    public int getBannerPriority() {
        return this.f25976n;
    }

    public JSONObject getBannerSettings() {
        return this.f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f25971c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f25971c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.d) != null) || ((ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f25972e) != null) || (ad_unit.equals(IronSource.AD_UNIT.BANNER) && (jSONObject2 = this.f) != null)))) {
            return jSONObject2.optString(t);
        }
        if (!ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD) || (jSONObject = this.g) == null) {
            return null;
        }
        return jSONObject.optString(t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f25971c;
        return jSONObject != null ? jSONObject.optString(s, "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
                return 1;
            }
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f25972e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
                return 99;
            }
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("maxAdsPerSession", 99);
    }

    public int getNativeAdPriority() {
        return this.o;
    }

    public JSONObject getNativeAdSettings() {
        return this.g;
    }

    public String getProviderDefaultInstance() {
        return this.f25977p;
    }

    public String getProviderInstanceName() {
        return this.k;
    }

    public String getProviderName() {
        return this.f25969a;
    }

    public String getProviderNetworkKey() {
        return this.q;
    }

    public String getProviderTypeForReflection() {
        return this.f25970b;
    }

    public int getRewardedVideoPriority() {
        return this.f25975l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.d;
    }

    public String getSubProviderId() {
        return this.f25973h;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f25974i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f25971c = jSONObject;
    }

    public void setBannerPriority(int i2) {
        this.f25976n = i2;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f.put(str, obj);
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void setInterstitialPriority(int i2) {
        this.m = i2;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f25972e.put(str, obj);
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void setIsMultipleInstances(boolean z2) {
        this.j = z2;
    }

    public void setNativeAdPriority(int i2) {
        this.o = i2;
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.g.put(str, obj);
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void setProviderNetworkKey(String str) {
        this.q = str;
    }

    public void setRewardedVideoPriority(int i2) {
        this.f25975l = i2;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.d.put(str, obj);
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void setSubProviderId(String str) {
        this.f25973h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f25971c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }

    public NetworkSettings(String str) {
        this.f25969a = str;
        this.k = str;
        this.f25970b = str;
        this.f25977p = str;
        this.q = str;
        this.d = new JSONObject();
        this.f25972e = new JSONObject();
        this.f = new JSONObject();
        this.g = new JSONObject();
        this.f25971c = new JSONObject();
        this.f25975l = -1;
        this.m = -1;
        this.f25976n = -1;
        this.o = -1;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f = jSONObject;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f25972e = jSONObject;
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.g = jSONObject;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f25969a = str;
        this.k = str;
        this.f25970b = str2;
        this.f25977p = str3;
        this.q = str4;
        this.d = jSONObject2;
        this.f25972e = jSONObject3;
        this.f = jSONObject4;
        this.g = jSONObject5;
        this.f25971c = jSONObject;
        this.f25975l = -1;
        this.m = -1;
        this.f25976n = -1;
        this.o = -1;
    }
}
