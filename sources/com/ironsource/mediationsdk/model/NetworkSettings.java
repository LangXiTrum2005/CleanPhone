package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.C0474n4;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class NetworkSettings {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f29617r = "customNetwork";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f29618s = "customNetworkPackage";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f29619t = "customNetworkAdapterName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f29622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f29623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f29624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f29625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f29626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f29627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f29628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f29629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f29630k;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f29631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f29632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f29633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f29634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f29635q;

    public NetworkSettings(String str) {
        this.f29620a = str;
        this.f29630k = str;
        this.f29621b = str;
        this.f29634p = str;
        this.f29635q = str;
        this.f29623d = new JSONObject();
        this.f29624e = new JSONObject();
        this.f29625f = new JSONObject();
        this.f29626g = new JSONObject();
        this.f29622c = new JSONObject();
        this.l = -1;
        this.f29631m = -1;
        this.f29632n = -1;
        this.f29633o = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f29628i;
    }

    public JSONObject getApplicationSettings() {
        return this.f29622c;
    }

    public int getBannerPriority() {
        return this.f29632n;
    }

    public JSONObject getBannerSettings() {
        return this.f29625f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f29622c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if (aVar == null && (jSONObject5 = this.f29622c) != null) {
            return jSONObject5.optString(f29619t);
        }
        if (aVar.equals(IronSource.a.REWARDED_VIDEO) && (jSONObject4 = this.f29623d) != null) {
            return jSONObject4.optString(f29619t);
        }
        if (aVar.equals(IronSource.a.INTERSTITIAL) && (jSONObject3 = this.f29624e) != null) {
            return jSONObject3.optString(f29619t);
        }
        if (aVar.equals(IronSource.a.BANNER) && (jSONObject2 = this.f29625f) != null) {
            return jSONObject2.optString(f29619t);
        }
        if (!aVar.equals(IronSource.a.NATIVE_AD) || (jSONObject = this.f29626g) == null) {
            return null;
        }
        return jSONObject.optString(f29619t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f29622c;
        return jSONObject != null ? jSONObject.optString(f29618s, "") : "";
    }

    public int getInstanceType(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("instanceType");
        }
        return 1;
    }

    public int getInterstitialPriority() {
        return this.f29631m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f29624e;
    }

    public int getMaxAdsPerSession(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("maxAdsPerSession", 99);
        }
        return 99;
    }

    public int getNativeAdPriority() {
        return this.f29633o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f29626g;
    }

    public String getProviderDefaultInstance() {
        return this.f29634p;
    }

    public String getProviderInstanceName() {
        return this.f29630k;
    }

    public String getProviderName() {
        return this.f29620a;
    }

    public String getProviderNetworkKey() {
        return this.f29635q;
    }

    public String getProviderTypeForReflection() {
        return this.f29621b;
    }

    public int getRewardedVideoPriority() {
        return this.l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f29623d;
    }

    public String getSubProviderId() {
        return this.f29627h;
    }

    public boolean isBidder(IronSource.a aVar) {
        return !isCustomNetwork() && getInstanceType(aVar) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.f29629j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f29628i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f29622c = jSONObject;
    }

    public void setBannerPriority(int i10) {
        this.f29632n = i10;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f29625f = jSONObject;
    }

    public void setInterstitialPriority(int i10) {
        this.f29631m = i10;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f29624e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z10) {
        this.f29629j = z10;
    }

    public void setNativeAdPriority(int i10) {
        this.f29633o = i10;
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f29626g = jSONObject;
    }

    public void setProviderNetworkKey(String str) {
        this.f29635q = str;
    }

    public void setRewardedVideoPriority(int i10) {
        this.l = i10;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f29623d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f29627h = str;
    }

    public boolean shouldEarlyInit(boolean z10) {
        JSONObject jSONObject = this.f29622c;
        return (jSONObject == null || !jSONObject.has(IronSourceConstants.EARLY_INIT_FIELD)) ? z10 : this.f29622c.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f29625f.put(str, obj);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f29624e.put(str, obj);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.f29626g.put(str, obj);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f29623d.put(str, obj);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f29620a = str;
        this.f29630k = str;
        this.f29621b = str2;
        this.f29634p = str3;
        this.f29635q = str4;
        this.f29623d = jSONObject2;
        this.f29624e = jSONObject3;
        this.f29625f = jSONObject4;
        this.f29626g = jSONObject5;
        this.f29622c = jSONObject;
        this.l = -1;
        this.f29631m = -1;
        this.f29632n = -1;
        this.f29633o = -1;
    }

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f29620a = networkSettings.getProviderName();
        this.f29630k = networkSettings.getProviderName();
        this.f29621b = networkSettings.getProviderTypeForReflection();
        this.f29623d = networkSettings.getRewardedVideoSettings();
        this.f29624e = networkSettings.getInterstitialSettings();
        this.f29625f = networkSettings.getBannerSettings();
        this.f29626g = networkSettings.getNativeAdSettings();
        this.f29622c = networkSettings.getApplicationSettings();
        this.l = networkSettings.getRewardedVideoPriority();
        this.f29631m = networkSettings.getInterstitialPriority();
        this.f29632n = networkSettings.getBannerPriority();
        this.f29633o = networkSettings.getNativeAdPriority();
        this.f29634p = networkSettings.getProviderDefaultInstance();
        this.f29635q = networkSettings.getProviderNetworkKey();
    }
}
