package com.thinkup.core.api;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.thinkup.core.common.mo.n;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oom;
import com.thinkup.core.common.n0.o0o;
import com.thinkup.core.common.n0.on;
import com.thinkup.core.common.om.m;
import com.thinkup.core.common.ooo.nn;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TUSDK {
    private static boolean HAS_INIT = false;
    public static final int NONPERSONALIZED = 1;
    public static final int PERSONALIZED = 0;
    public static final int UNKNOWN = 2;

    private TUSDK() {
    }

    public static void addCustomAdapterConfig(String str, TUCustomAdapterConfig tUCustomAdapterConfig) {
        o0n.m().o(str, tUCustomAdapterConfig);
    }

    public static void checkIsEuTraffic(Context context, NetTrafficeCallback netTrafficeCallback) {
        oom.o(context).o(netTrafficeCallback);
    }

    public static void deniedUploadDeviceInfo(String... strArr) {
        o0n.m().o(strArr);
    }

    public static void getArea(final TUAreaCallback tUAreaCallback) {
        if (tUAreaCallback == null) {
            return;
        }
        new on().o(0, new o0o() { // from class: com.thinkup.core.api.TUSDK.1
            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadCanceled(int i2) {
                tUAreaCallback.onErrorCallback("Request cancel");
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadError(int i2, String str, AdError adError) {
                tUAreaCallback.onErrorCallback(adError.printStackTrace());
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadFinish(int i2, Object obj) {
                try {
                    if (!(obj instanceof JSONObject)) {
                        tUAreaCallback.onErrorCallback("There is no result.");
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.has("area")) {
                        tUAreaCallback.onErrorCallback("There is no result.");
                    } else {
                        tUAreaCallback.onResultCallback(jSONObject.optString("area"));
                    }
                } catch (Throwable unused) {
                    tUAreaCallback.onErrorCallback(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR);
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadStart(int i2) {
            }
        });
    }

    public static int getGDPRDataLevel(Context context) {
        return oom.o(context).o();
    }

    public static int getPersionalizedAdStatus() {
        return o0n.m().oo();
    }

    public static String getSDKVersionName() {
        return nn.o();
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, null);
    }

    public static void initCustomMap(Map<String, Object> map) {
        o0n.m().o(map);
    }

    public static void initPlacementCustomMap(String str, Map<String, Object> map) {
        o0n.m().o(str, map);
    }

    public static void integrationChecking(Context context) {
        o0n.m().m(context);
    }

    public static boolean isCnSDK() {
        o0n.m();
        return false;
    }

    public static boolean isEUTraffic(Context context) {
        return oom.o(context).o0();
    }

    public static boolean isNetworkLogDebug() {
        return o0n.m().m0o();
    }

    public static void putFilter(String str, TUAdFilter tUAdFilter) {
        o0n.m().o(str, tUAdFilter);
    }

    public static void registerDeviceRiskListener(ITUDeviceRiskListener iTUDeviceRiskListener) {
        o0n.m().o(iTUDeviceRiskListener);
    }

    public static void removeFilterWithPlacementId(String str) {
        o0n.m().oo0(str);
    }

    public static void removeFilters() {
        o0n.m().non();
    }

    public static void setAdLogoVisible(boolean z2) {
        o0n.m().n(z2);
    }

    public static void setAllowedShowNetworkFirmIdList(String str, List<String> list) {
        o0n.m().n(str, list);
    }

    public static void setBundleName(String str) {
        o0n.m().o0n(str);
    }

    public static void setChannel(String str) {
        if (nn.o(str)) {
            o0n.m().oo(str);
        }
    }

    public static void setChannelSource(int i2) {
        o0n.m().n(i2);
    }

    public static void setDebuggerConfig(Context context, String str, TUDebuggerConfig tUDebuggerConfig) {
        o0n.m().o(context, str, tUDebuggerConfig);
    }

    public static void setExcludePackageList(List<String> list) {
        o0n.m().o(list);
    }

    public static void setFilterAdSourceIdList(String str, List<String> list) {
        o0n.m().o(str, list);
    }

    public static void setFilterNetworkFirmIdList(String str, List<String> list) {
        o0n.m().m(str, list);
    }

    public static void setForbidNetworkFirmIdList(List<String> list) {
        o0n.m().m(list);
    }

    public static void setForbidShowNetworkFirmIdList(String str, List<String> list) {
        o0n.m().o0(str, list);
    }

    public static void setGDPRUploadDataLevel(Context context, int i2) {
        if (context == null) {
            Log.e(mo.oo0, "setGDPRUploadDataLevel: context should not be null");
        } else if (i2 == 0 || i2 == 1) {
            oom.o(context).o(i2);
        } else {
            Log.e(mo.oo0, "GDPR level setting error!!! Level must be PERSONALIZED or NONPERSONALIZED.");
        }
    }

    public static void setInitType(int i2) {
        o0n.m().m(i2);
    }

    public static void setLocalStrategyAssetPath(Context context, String str) {
        o0n.m();
        o0n.o(context, str);
    }

    public static void setLocation(Location location) {
        o0n.m().o(location);
    }

    public static void setNetworkLogDebug(boolean z2) {
        o0n.m().m(z2);
    }

    public static void setPersonalizedAdStatus(int i2) {
        o0n.m().o(i2);
    }

    public static void setRiskFilterNetworkFirmIdList(int i2, List<String> list) {
        o0n.m().o(i2, list);
    }

    public static void setSharedPlacementConfig(TUSharedPlacementConfig tUSharedPlacementConfig) {
        o0n.m();
        o0n.o(tUSharedPlacementConfig);
    }

    public static void setSubChannel(String str) {
        if (nn.m(str)) {
            o0n.m().om(str);
        }
    }

    public static void setSupportDomainCountry(String... strArr) {
        m.o = strArr;
    }

    public static void setSystemDevFragmentType(String str) {
        o0n.m().o0m(str);
    }

    public static void setTUAdFilter(String[] strArr, ITUAdFilter iTUAdFilter) {
        o0n.m().o(strArr, iTUAdFilter);
    }

    public static void setTUUserDeviceInfo(TUUserDeviceInfo tUUserDeviceInfo) {
        o0n.m().o(tUUserDeviceInfo);
    }

    public static void setUseHTTP(boolean z2) {
        o0n.m().o0(z2);
    }

    public static void setWXAppId(String str) {
        o0n.m().o(str);
    }

    public static void setWXStatus(boolean z2) {
        o0n.m().o(z2);
    }

    public static void showGDPRConsentDialog(Activity activity, TUGDPRConsentDismissListener tUGDPRConsentDismissListener) {
        n.o().o(activity, tUGDPRConsentDismissListener);
    }

    @Deprecated
    public static void showGdprAuth(Context context) {
        oom.o(context).o(context, (TUGDPRAuthCallback) null);
    }

    public static void start() {
        o0n.m().om0();
    }

    public static void testModeDeviceInfo(Context context, DeviceInfoCallback deviceInfoCallback) {
        o0n.m().o(context, deviceInfoCallback);
    }

    public static void init(Context context, String str, String str2, TUNetworkConfig tUNetworkConfig) {
        init(context, str, str2, tUNetworkConfig, null);
    }

    @Deprecated
    public static void showGdprAuth(Context context, TUGDPRAuthCallback tUGDPRAuthCallback) {
        oom.o(context).o(context, tUGDPRAuthCallback);
    }

    @Deprecated
    public static void init(Context context, String str, String str2, TUNetworkConfig tUNetworkConfig, TUSDKInitListener tUSDKInitListener) {
        try {
            if (context == null) {
                if (tUSDKInitListener != null) {
                    tUSDKInitListener.onFail("init: Context is null!");
                }
                Log.e(mo.oo0, "init: Context is null!");
            } else {
                o0n.m().o(context, str, str2, tUNetworkConfig);
                if (tUSDKInitListener != null) {
                    tUSDKInitListener.onSuccess();
                }
            }
        } catch (Error | Exception unused) {
        }
    }
}
