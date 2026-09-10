package com.thinkup.network.applovin;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.api.TUSDKGlobalSetting;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ApplovinTUInitManager extends TUInitMediation {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42527n = "ApplovinTUInitManager";
    private static final int n0 = 7;
    private static final int no = 1;
    private static volatile ApplovinTUInitManager o0;
    HandlerThread m;
    private Method mn;
    private Handler nn;
    private List<MediationInitCallback> o00;
    private AppLovinSdk om;
    private String oo;
    private Object on = new Object();
    private Boolean m0 = null;
    private AtomicBoolean mo = new AtomicBoolean(false);
    private Map<String, Object> mm = new ConcurrentHashMap();
    AtomicBoolean o = new AtomicBoolean();
    private int nm = 0;

    private ApplovinTUInitManager() {
    }

    public static ApplovinTUInitManager getInstance() {
        if (o0 == null) {
            synchronized (ApplovinTUInitManager.class) {
                try {
                    if (o0 == null) {
                        o0 = new ApplovinTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0;
    }

    public static /* synthetic */ int m(ApplovinTUInitManager applovinTUInitManager) {
        int i2 = applovinTUInitManager.nm;
        applovinTUInitManager.nm = i2 + 1;
        return i2;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.36";
    }

    public AppLovinSdk getAppLovinSDK() {
        return this.om;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return "Applovin";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.applovin.sdk.AppLovinSdk";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return ApplovinTUConst.getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public synchronized void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        try {
            boolean booleanFromMap = TUInitMediation.getBooleanFromMap(map, "app_coppa_switch");
            if (AppLovinSdk.VERSION_CODE < 13000000) {
                try {
                    if (this.mn == null) {
                        this.mn = AppLovinPrivacySettings.class.getDeclaredMethod("setIsAgeRestrictedUser", Boolean.TYPE, Context.class);
                    }
                    this.mn.setAccessible(true);
                    this.mn.invoke(null, Boolean.valueOf(booleanFromMap), context);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else if (booleanFromMap) {
                if (mediationInitCallback != null) {
                    mediationInitCallback.onFail("AppLovin SDK 13.0.0 or higher does not support child users.");
                }
                return;
            }
        } catch (Throwable unused) {
        }
        try {
            String stringFromMap = TUInitMediation.getStringFromMap(map, "sdkkey");
            if (TextUtils.isEmpty(this.oo) || !TextUtils.equals(this.oo, stringFromMap)) {
                this.oo = stringFromMap;
            }
            try {
                if (TUInitMediation.getBooleanFromMap(map, "app_ccpa_switch")) {
                    AppLovinPrivacySettings.setDoNotSell(true);
                } else {
                    AppLovinPrivacySettings.setDoNotSell(false);
                }
            } catch (Throwable unused2) {
            }
            AppLovinSdk appLovinSdk = this.om;
            if (appLovinSdk != null) {
                AppLovinSdkSettings settings = appLovinSdk.getSettings();
                if (settings != null) {
                    o(settings);
                    o(settings, map);
                }
                if (mediationInitCallback != null) {
                    mediationInitCallback.onSuccess();
                }
                return;
            }
            final AppLovinSdk appLovinSdk2 = AppLovinSdk.getInstance(context);
            AppLovinSdkSettings settings2 = appLovinSdk2.getSettings();
            if (settings2 != null) {
                o(settings2);
                o(settings2, map);
                settings2.setVerboseLogging(TUSDK.isNetworkLogDebug());
                Boolean bool = TUSDKGlobalSetting.isGlobalMute;
                if (bool != null) {
                    settings2.setMuted(bool.booleanValue());
                } else {
                    Boolean bool2 = this.m0;
                    if (bool2 != null) {
                        settings2.setMuted(bool2.booleanValue());
                    }
                }
            }
            if (appLovinSdk2.isInitialized()) {
                this.om = appLovinSdk2;
                if (mediationInitCallback != null) {
                    mediationInitCallback.onSuccess();
                }
                m("");
                return;
            }
            synchronized (this.on) {
                try {
                    if (this.o00 == null) {
                        this.o00 = new ArrayList();
                    }
                    if (mediationInitCallback != null) {
                        this.o00.add(mediationInitCallback);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.mo.get()) {
                return;
            }
            this.mo.set(true);
            AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfigurationBuild = AppLovinSdkInitializationConfiguration.builder(stringFromMap).setMediationProvider("max").build();
            this.nm = 0;
            HandlerThread handlerThread = new HandlerThread("alex_max_init");
            this.m = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(this.m.getLooper()) { // from class: com.thinkup.network.applovin.ApplovinTUInitManager.1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    if (message.what == 1) {
                        if (ApplovinTUInitManager.this.o.get()) {
                            String unused3 = ApplovinTUInitManager.f42527n;
                            return;
                        }
                        if (appLovinSdk2.isInitialized()) {
                            String unused4 = ApplovinTUInitManager.f42527n;
                            if (ApplovinTUInitManager.this.o.compareAndSet(false, true)) {
                                ApplovinTUInitManager.this.om = appLovinSdk2;
                                ApplovinTUInitManager.this.mo.set(false);
                                ApplovinTUInitManager.this.m("");
                                return;
                            }
                            return;
                        }
                        String unused5 = ApplovinTUInitManager.f42527n;
                        ApplovinTUInitManager.m(ApplovinTUInitManager.this);
                        if (ApplovinTUInitManager.this.nm < 7) {
                            sendEmptyMessageDelayed(1, 1000L);
                        } else if (ApplovinTUInitManager.this.o.compareAndSet(false, true)) {
                            Log.i(ApplovinTUInitManager.f42527n, "onFinish: callback timeout");
                            ApplovinTUInitManager.this.mo.set(false);
                            ApplovinTUInitManager.this.m("init timeout");
                        }
                    }
                }
            };
            this.nn = handler;
            handler.sendEmptyMessageDelayed(1, 1000L);
            appLovinSdk2.initialize(appLovinSdkInitializationConfigurationBuild, new AppLovinSdk.SdkInitializationListener() { // from class: com.thinkup.network.applovin.ApplovinTUInitManager.2
                @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
                public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                    if (ApplovinTUInitManager.this.o.compareAndSet(false, true)) {
                        ApplovinTUInitManager.this.om = appLovinSdk2;
                        ApplovinTUInitManager.this.mo.set(false);
                        ApplovinTUInitManager.this.m("");
                    }
                }
            });
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public void setMute(boolean z2) {
        try {
            this.m0 = Boolean.valueOf(z2);
            AppLovinSdk appLovinSdk = this.om;
            if (appLovinSdk != null) {
                appLovinSdk.getSettings().setMuted(z2);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        try {
            AppLovinPrivacySettings.setHasUserConsent(z2);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str) {
        try {
            Handler handler = this.nn;
            if (handler != null) {
                handler.removeMessages(1);
            }
            HandlerThread handlerThread = this.m;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
        } catch (Throwable unused) {
        }
        synchronized (this.on) {
            try {
                List<MediationInitCallback> list = this.o00;
                if (list == null) {
                    return;
                }
                if (list.size() <= 0) {
                    return;
                }
                ArrayList<MediationInitCallback> arrayList = new ArrayList(this.o00);
                this.o00.clear();
                for (MediationInitCallback mediationInitCallback : arrayList) {
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            if (mediationInitCallback != null) {
                                mediationInitCallback.onFail(str);
                                return;
                            }
                            return;
                        } else if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                    } catch (Throwable th) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onFail(th.getMessage());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o(AppLovinSdkSettings appLovinSdkSettings) {
        try {
            String userId = getUserId();
            if (TextUtils.isEmpty(userId)) {
                return;
            }
            appLovinSdkSettings.setUserIdentifier(userId);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void o(AppLovinSdkSettings appLovinSdkSettings, Map<String, Object> map) {
        String strF;
        JSONObject jSONObject = null;
        try {
            Object unitInfoObj = ApplovinTUConst.getUnitInfoObj(map);
            if (unitInfoObj != null) {
                jSONObject = (JSONObject) unitInfoObj;
            }
        } catch (Throwable unused) {
        }
        if (jSONObject == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("0");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("1");
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("3");
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("4");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            strF = "";
        } else {
            strF = "";
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                StringBuilder sbW = a.w(strF);
                sbW.append(jSONArrayOptJSONArray.optString(i2));
                sbW.append(",");
                strF = sbW.toString();
            }
        }
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                StringBuilder sbW2 = a.w(strF);
                sbW2.append(jSONArrayOptJSONArray2.optString(i3));
                sbW2.append(",");
                strF = sbW2.toString();
            }
        }
        if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                StringBuilder sbW3 = a.w(strF);
                sbW3.append(jSONArrayOptJSONArray3.optString(i4));
                sbW3.append(",");
                strF = sbW3.toString();
            }
        }
        if (jSONArrayOptJSONArray4 != null && jSONArrayOptJSONArray4.length() > 0) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray4.length(); i5++) {
                StringBuilder sbW4 = a.w(strF);
                sbW4.append(jSONArrayOptJSONArray4.optString(i5));
                sbW4.append(",");
                strF = sbW4.toString();
            }
        }
        if (strF.endsWith(",")) {
            strF = a.f(1, 0, strF);
        }
        appLovinSdkSettings.setExtraParameter("disable_b2b_ad_unit_ids", strF);
        String strF2 = jSONObject.has("0") ? "" + MaxAdFormat.NATIVE.getLabel() + "," : "";
        if (jSONObject.has("1")) {
            StringBuilder sbW5 = a.w(strF2);
            sbW5.append(MaxAdFormat.REWARDED.getLabel());
            sbW5.append(",");
            strF2 = sbW5.toString();
        }
        if (jSONObject.has("2")) {
            StringBuilder sbW6 = a.w(strF2);
            sbW6.append(MaxAdFormat.BANNER.getLabel());
            sbW6.append(",");
            StringBuilder sbW7 = a.w(sbW6.toString());
            sbW7.append(MaxAdFormat.MREC.getLabel());
            sbW7.append(",");
            strF2 = sbW7.toString();
        }
        if (jSONObject.has("3")) {
            StringBuilder sbW8 = a.w(strF2);
            sbW8.append(MaxAdFormat.INTERSTITIAL.getLabel());
            sbW8.append(",");
            strF2 = sbW8.toString();
        }
        if (jSONObject.has("4")) {
            StringBuilder sbW9 = a.w(strF2);
            sbW9.append(MaxAdFormat.APP_OPEN.getLabel());
            sbW9.append(",");
            strF2 = sbW9.toString();
        }
        if (strF2.endsWith(",")) {
            strF2 = a.f(1, 0, strF2);
        }
        appLovinSdkSettings.setExtraParameter("disable_auto_retry_ad_formats", strF2);
    }

    public final void o(String str, Object obj) {
        this.mm.put(str, obj);
    }

    public final void o(String str) {
        this.mm.remove(str);
    }
}
