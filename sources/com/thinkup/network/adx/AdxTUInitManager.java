package com.thinkup.network.adx;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.smartdigimkt.sdk.api.ISDMAdManager;
import com.smartdigimkt.sdk.api.IntegrationCheckListener;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMInitConfig;
import com.smartdigimkt.sdk.api.SDMSDK;
import com.smartdigimkt.sdk.api.SDMSetting;
import com.smartdigimkt.sdk.api.SDMUserDeviceInfo;
import com.smartdigimkt.sdk.api.format.SDMAdHandler;
import com.smartdigimkt.sdk.api.format.SDMLossInfo;
import com.smartdigimkt.sdk.api.format.SDMWinInfo;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.core.api.TUUserDeviceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AdxTUInitManager extends TUInitMediation {
    private static volatile AdxTUInitManager m = null;
    private static String o = "AdxTUInitManager";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42517n;
    private AtomicBoolean o0 = new AtomicBoolean(false);
    private final Object om = new Object();
    private List<MediationInitCallback> oo;

    public static AdxTUInitManager getInstance() {
        if (m == null) {
            synchronized (AdxTUInitManager.class) {
                try {
                    if (m == null) {
                        m = new AdxTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private static String[] m(Map<String, Object> map) {
        if (map != null && map.containsKey(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_DENNY_DEVICE_INFO)) {
            Object obj = map.get(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_DENNY_DEVICE_INFO);
            if (obj instanceof String[]) {
                return (String[]) obj;
            }
        }
        return null;
    }

    private static void n(Map<String, Object> map) {
        SDMSetting setting = SDMSDK.getInstance().getSetting();
        Boolean boolIsShakeEnabled = TUSDKGlobalSetting.isShakeEnabled(66);
        if (boolIsShakeEnabled != null) {
            if (boolIsShakeEnabled.booleanValue()) {
                setting.undeniedUploadDeviceInfo("sensor_deny");
            } else {
                setting.deniedUploadDeviceInfo("sensor_deny");
            }
        }
        setting.setPersonalizedAdStatus(TUSDK.getPersionalizedAdStatus());
        Object obj = map.get(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_EXCLUDE_PKG_LIST);
        if (obj == null || !(obj instanceof List)) {
            return;
        }
        try {
            setting.setExcludePkgList((List) obj);
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.36.5";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return "Adx";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.smartdigimkt.sdk.api.SDMSDK";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return SDMSDK.getInstance().getSDKVersion();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public List getResourceStatus() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sdm_myoffer_full_screen");
        arrayList.add("sdm_myoffer_splash_ad_layout_asseblem_vertical_port");
        return arrayList;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public void initSDK(Context context, Map<String, Object> map, final MediationInitCallback mediationInitCallback) {
        if (TUInitMediation.getIntFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PRECHECK_MODE, 0) == 1) {
            o(context, map);
            SDMSDK.getInstance().integrationChecking(context, map, new IntegrationCheckListener() { // from class: com.thinkup.network.adx.AdxTUInitManager.1
                @Override // com.smartdigimkt.sdk.api.IntegrationCheckListener
                public final void onValidationFail(String str) {
                    MediationInitCallback mediationInitCallback2 = mediationInitCallback;
                    if (mediationInitCallback2 != null) {
                        mediationInitCallback2.onFail(str);
                    }
                }

                @Override // com.smartdigimkt.sdk.api.IntegrationCheckListener
                public final void onValidationSucceed() {
                    MediationInitCallback mediationInitCallback2 = mediationInitCallback;
                    if (mediationInitCallback2 != null) {
                        mediationInitCallback2.onSuccess();
                    }
                }
            });
            return;
        }
        SDMSetting setting = SDMSDK.getInstance().getSetting();
        Boolean boolIsShakeEnabled = TUSDKGlobalSetting.isShakeEnabled(66);
        if (boolIsShakeEnabled != null) {
            if (boolIsShakeEnabled.booleanValue()) {
                setting.undeniedUploadDeviceInfo("sensor_deny");
            } else {
                setting.deniedUploadDeviceInfo("sensor_deny");
            }
        }
        setting.setPersonalizedAdStatus(TUSDK.getPersionalizedAdStatus());
        Object obj = map.get(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_EXCLUDE_PKG_LIST);
        if (obj != null && (obj instanceof List)) {
            try {
                setting.setExcludePkgList((List) obj);
            } catch (Throwable unused) {
            }
        }
        if (this.f42517n) {
            if (mediationInitCallback != null) {
                mediationInitCallback.onSuccess();
                return;
            }
            return;
        }
        synchronized (this.om) {
            try {
                if (this.oo == null) {
                    this.oo = new ArrayList();
                }
                if (mediationInitCallback != null) {
                    this.oo.add(mediationInitCallback);
                }
                if (this.o0.get()) {
                    return;
                }
                this.o0.set(true);
                o(context, map);
                SDMInitConfig.Builder builder = new SDMInitConfig.Builder(TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_APP_ID, ""), TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_APP_KEY, ""));
                String bundleName = getBundleName();
                if (!TextUtils.isEmpty(bundleName)) {
                    builder.setBundleName(bundleName);
                }
                String stringFromMap = TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_SYSTEM_DEV_FRAMEWORK_TYPE);
                if (!TextUtils.isEmpty(stringFromMap)) {
                    builder.setSystemDevFrameworkType(stringFromMap);
                }
                builder.setExtraMap(map);
                SDMSDK.getInstance().init(context, builder.build());
                SDMSDK.getInstance().start(new SDMSDK.InitCallBack() { // from class: com.thinkup.network.adx.AdxTUInitManager.2
                    @Override // com.smartdigimkt.sdk.api.SDMSDK.InitCallBack
                    public final void fail(String str) {
                        String unused2 = AdxTUInitManager.o;
                        AdxTUInitManager.o(AdxTUInitManager.this, false, str);
                    }

                    @Override // com.smartdigimkt.sdk.api.SDMSDK.InitCallBack
                    public final void success() {
                        AdxTUInitManager.o(AdxTUInitManager.this);
                        AdxTUInitManager.o(AdxTUInitManager.this, true, "");
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyWLInfo(int i2, Map<String, Object> map, SDMAdHandler sDMAdHandler) {
        if (map == null || map.isEmpty() || sDMAdHandler == null) {
            return;
        }
        if (i2 == 1) {
            sDMAdHandler.notifyWin(new SDMWinInfo(0.0d, SDMAdConst.CURRENCY.USD, map));
        } else if (i2 == 2) {
            sDMAdHandler.notifyLoss(new SDMLossInfo(SDMLossInfo.LOSS_REASON.LOSS_TO_NORMAL, 0.0d, SDMAdConst.CURRENCY.USD, map));
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        SDMSetting setting;
        if (!z3 || (setting = SDMSDK.getInstance().getSetting()) == null || TUSDK.getGDPRDataLevel(context) == 2) {
            return true;
        }
        setting.setGDPRUploadDataLevel(context, TUSDK.getGDPRDataLevel(context));
        return true;
    }

    public static /* synthetic */ boolean o(AdxTUInitManager adxTUInitManager) {
        adxTUInitManager.f42517n = true;
        return true;
    }

    private void o(boolean z2, String str) {
        synchronized (this.om) {
            try {
                int size = this.oo.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MediationInitCallback mediationInitCallback = this.oo.get(i2);
                    if (mediationInitCallback != null) {
                        if (z2) {
                            mediationInitCallback.onSuccess();
                        } else {
                            mediationInitCallback.onFail(str);
                        }
                    }
                }
                this.oo.clear();
                this.o0.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(Context context, final Map<String, Object> map, final Map<String, Object> map2, final TUBidRequestInfoListener tUBidRequestInfoListener) {
        getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.adx.AdxTUInitManager.3

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f42518n = false;

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                if (tUBidRequestInfoListener2 != null) {
                    tUBidRequestInfoListener2.onFailed(str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                SDMSDK.getInstance().getSDMAdManager().getBidTokenJSONObject(map, new ISDMAdManager.BidTokenCallBack() { // from class: com.thinkup.network.adx.AdxTUInitManager.3.1
                    @Override // com.smartdigimkt.sdk.api.ISDMAdManager.BidTokenCallBack
                    public final void onComplete(JSONObject jSONObject) {
                        if (jSONObject == null) {
                            tUBidRequestInfoListener.onFailed("Adx getBidTokenJSONObject fail");
                            return;
                        }
                        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(jSONObject);
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        adxBidRequestInfo.fillLocalExtra(map2, anonymousClass3.f42518n);
                        tUBidRequestInfoListener.onSuccess(adxBidRequestInfo);
                    }
                });
            }
        });
    }

    private static void o(Context context, Map<String, Object> map) {
        SDMSetting setting = SDMSDK.getInstance().getSetting();
        setting.setDebug(TUSDK.isNetworkLogDebug());
        setting.setUserDeviceInfo(o(map));
        setting.deniedUploadDeviceInfo(m(map));
        if (map.containsKey(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_LOCATION)) {
            Object obj = map.get(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_LOCATION);
            if (obj instanceof Location) {
                setting.setLocation((Location) obj);
            }
        }
        setting.setWxInstallStatus(TUInitMediation.getBooleanFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_WX_INSTALL_STATUS));
        setting.setEnableGetRunningAppProcesses(TUInitMediation.getBooleanFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_ENABLE_GET_RUNNING_APP_PROCESSES));
        setting.setEnableGetDeviceInfoInBg(TUInitMediation.getBooleanFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_ENABLE_GET_DEVICE_INFO_IN_BG));
        setting.setInspectInterval(TUInitMediation.getLongFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_INSPECT_INTERVAL));
        setting.setDelayInspectTime(TUInitMediation.getLongFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_DELAY_INSPECT_TIME));
        if (TUSDK.getGDPRDataLevel(context) != 2) {
            setting.setGDPRUploadDataLevel(context, TUSDK.getGDPRDataLevel(context));
        }
        setting.setPersonalizedAdStatus(TUSDK.getPersionalizedAdStatus());
        setting.setWxAppId(TUInitMediation.getStringFromMap(map, TUAdConst.KEY.WECHAT_APPID));
        try {
            if (TUInitMediation.getBooleanFromMap(map, "app_coppa_switch")) {
                setting.setTagForChildDirectedTreatment(true);
            }
        } catch (Throwable unused) {
        }
    }

    private static SDMUserDeviceInfo o(Map<String, Object> map) {
        Object obj = map.get(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_USER_DEVICE_INFO);
        if (!(obj instanceof TUUserDeviceInfo)) {
            return null;
        }
        TUUserDeviceInfo tUUserDeviceInfo = (TUUserDeviceInfo) obj;
        SDMUserDeviceInfo sDMUserDeviceInfo = new SDMUserDeviceInfo();
        sDMUserDeviceInfo.setDevGaid(tUUserDeviceInfo.getDevGaid());
        sDMUserDeviceInfo.setDevImei(tUUserDeviceInfo.getDevImei());
        sDMUserDeviceInfo.setDevOaid(tUUserDeviceInfo.getDevOaid());
        sDMUserDeviceInfo.setDevUID2Token(tUUserDeviceInfo.getDevUID2Token());
        return sDMUserDeviceInfo;
    }

    public static /* synthetic */ void o(AdxTUInitManager adxTUInitManager, boolean z2, String str) {
        synchronized (adxTUInitManager.om) {
            try {
                int size = adxTUInitManager.oo.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MediationInitCallback mediationInitCallback = adxTUInitManager.oo.get(i2);
                    if (mediationInitCallback != null) {
                        if (z2) {
                            mediationInitCallback.onSuccess();
                        } else {
                            mediationInitCallback.onFail(str);
                        }
                    }
                }
                adxTUInitManager.oo.clear();
                adxTUInitManager.o0.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
