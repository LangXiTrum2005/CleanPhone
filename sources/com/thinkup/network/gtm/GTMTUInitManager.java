package com.thinkup.network.gtm;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.out.ChannelManager;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class GTMTUInitManager extends TUInitMediation {
    public static final String TAG = "GTMTUInitManager";
    private static volatile GTMTUInitManager oo;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42565n;
    private String o;
    private String o0;
    private Map<String, Object> om = new ConcurrentHashMap();

    private GTMTUInitManager() {
    }

    public static GTMTUInitManager getInstance() {
        if (oo == null) {
            synchronized (GTMTUInitManager.class) {
                try {
                    if (oo == null) {
                        oo = new GTMTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oo;
    }

    public static String getStringByMap(Map<String, Object> map, String str) {
        if (map != null && !TextUtils.isEmpty(str)) {
            try {
                Object obj = map.get(str);
                if (obj instanceof String) {
                    return (String) obj;
                }
                if (obj != null) {
                    return obj.toString();
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static void printLog(String str) {
        if (TUSDK.isNetworkLogDebug()) {
            Log.d("gtmTUInitManager", str);
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.36";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return "GTM";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.mbridge.msdk.MBridgeSDK";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return GTMTUConst.getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public Map<String, Boolean> getPluginClassStatus() {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        map.put("mbridge_newinterstitial.aar", bool);
        map.put("mbridge_mbbanner.aar", bool);
        map.put("mbridge_mbbid.aar", bool);
        map.put("mbridge_mbjscommon.aar", bool);
        map.put("mbridge_mbnative.aar", bool);
        map.put("mbridge_nativeex.aar", bool);
        map.put("mbridge_playercommon.aar", bool);
        map.put("mbridge_reward.aar", bool);
        map.put("mbridge_videocommon.aar", bool);
        map.put("mbridge_videojs.aar", bool);
        map.put("mbridge_mbnativeadvanced.aar", bool);
        map.put("mbridge_mbsplash.aar", bool);
        map.put("recyclerview-*.aar", bool);
        try {
            map.put("mbridge_newinterstitial.aar", Boolean.TRUE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            map.put("mbridge_mbbanner.aar", Boolean.TRUE);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            map.put("mbridge_mbbid.aar", Boolean.TRUE);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            map.put("mbridge_mbjscommon.aar", Boolean.TRUE);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        try {
            map.put("mbridge_mbnative.aar", Boolean.TRUE);
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        try {
            map.put("mbridge_nativeex.aar", Boolean.TRUE);
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        try {
            map.put("mbridge_playercommon.aar", Boolean.TRUE);
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        try {
            map.put("mbridge_reward.aar", Boolean.TRUE);
        } catch (Throwable th8) {
            th8.printStackTrace();
        }
        try {
            map.put("mbridge_videocommon.aar", Boolean.TRUE);
        } catch (Throwable th9) {
            th9.printStackTrace();
        }
        try {
            map.put("mbridge_videojs.aar", Boolean.TRUE);
        } catch (Throwable th10) {
            th10.printStackTrace();
        }
        try {
            map.put("mbridge_mbnativeadvanced.aar", Boolean.TRUE);
        } catch (Throwable th11) {
            th11.printStackTrace();
        }
        try {
            map.put("mbridge_mbsplash.aar", Boolean.TRUE);
        } catch (Throwable th12) {
            th12.printStackTrace();
        }
        try {
            map.put("recyclerview-*.aar", Boolean.TRUE);
        } catch (Throwable th13) {
            th13.printStackTrace();
        }
        return map;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public List getResourceStatus() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("mbridge_reward_activity_video_templete");
        return arrayList;
    }

    public synchronized void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    public void setCustomInfo(int i2, Map<String, Object> map) {
        try {
            String stringByMap = getStringByMap(map, "tp_info");
            String stringByMap2 = getStringByMap(map, "unitid");
            printLog("setCustomInfo() >>> customData = " + stringByMap + " unitId = " + stringByMap2);
            if (TextUtils.isEmpty(stringByMap)) {
                return;
            }
            CustomInfoManager.getInstance().setCustomInfo(stringByMap2, i2, stringByMap);
        } catch (Exception unused) {
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public void setDevBundleName(String str) {
        super.setDevBundleName(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE = str;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (Throwable unused) {
        }
        MBridgeSDKFactory.getMBridgeSDK().setUserPrivateInfoType(context, MBridgeConstans.AUTHORITY_ALL_INFO, z2 ? 1 : 0);
        return true;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public synchronized void initSDK(Context context, final Map<String, Object> map, final MediationInitCallback mediationInitCallback) {
        ChannelManager.setChannel("Y+H6DFttYrPQYcIeicKwJQKQYrN=");
        final Context applicationContext = context.getApplicationContext();
        runOnMainThread(new Runnable() { // from class: com.thinkup.network.gtm.GTMTUInitManager.1
            @Override // java.lang.Runnable
            public final void run() {
                String str = (String) map.get("appid");
                String str2 = (String) map.get("appkey");
                Object obj = map.get(TUAdConst.KEY.WECHAT_APPID);
                String string = obj != null ? obj.toString() : "";
                if (map.containsKey(TUInitMediation.KEY_LOCAL)) {
                    GTMTUInitManager.this.f42565n = str;
                    GTMTUInitManager.this.o0 = str2;
                } else if (GTMTUInitManager.this.f42565n != null && GTMTUInitManager.this.o0 != null && (!TextUtils.equals(GTMTUInitManager.this.f42565n, str) || !TextUtils.equals(GTMTUInitManager.this.o0, str2))) {
                    GTMTUInitManager gTMTUInitManager = GTMTUInitManager.this;
                    gTMTUInitManager.checkToSaveInitData(gTMTUInitManager.getNetworkName(), map, GTMTUInitManager.this.f42565n, GTMTUInitManager.this.o0);
                    GTMTUInitManager.this.f42565n = null;
                    GTMTUInitManager.this.o0 = null;
                }
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    if (!TextUtils.isEmpty(GTMTUInitManager.this.o) && !TextUtils.isEmpty(GTMTUInitManager.this.m) && TextUtils.equals(GTMTUInitManager.this.o, str) && TextUtils.equals(GTMTUInitManager.this.m, str2)) {
                        MediationInitCallback mediationInitCallback2 = mediationInitCallback;
                        if (mediationInitCallback2 != null) {
                            mediationInitCallback2.onSuccess();
                            return;
                        }
                        return;
                    }
                    MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
                    mBridgeSDK.init(!TextUtils.isEmpty(string) ? mBridgeSDK.getMBConfigurationMap(str, str2, string) : mBridgeSDK.getMBConfigurationMap(str, str2), applicationContext);
                    if (map.containsKey("app_coppa_switch")) {
                        mBridgeSDK.setCoppaStatus(applicationContext, TUInitMediation.getBooleanFromMap(map, "app_coppa_switch"));
                    }
                    GTMTUInitManager.this.o = str;
                    GTMTUInitManager.this.m = str2;
                    GTMTUInitManager.this.o = str;
                    GTMTUInitManager.this.m = str2;
                    MediationInitCallback mediationInitCallback3 = mediationInitCallback;
                    if (mediationInitCallback3 != null) {
                        mediationInitCallback3.onSuccess();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    MediationInitCallback mediationInitCallback4 = mediationInitCallback;
                    if (mediationInitCallback4 != null) {
                        mediationInitCallback4.onFail(th.getMessage());
                    }
                }
            }
        });
    }

    public final void o(String str, Object obj) {
        this.om.put(str, obj);
    }

    public final void o(String str) {
        this.om.remove(str);
    }

    public final void o(final Context context, final Map<String, Object> map, final Map<String, Object> map2, final int i2, final TUBidRequestInfoListener tUBidRequestInfoListener) {
        getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.gtm.GTMTUInitManager.2
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                if (tUBidRequestInfoListener2 != null) {
                    tUBidRequestInfoListener2.onFailed(str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                GTMTUInitManager.this.runOnThreadPool(new Runnable() { // from class: com.thinkup.network.gtm.GTMTUInitManager.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        GTMBidRequestInfo gTMBidRequestInfo = new GTMBidRequestInfo(context, map, GTMTUInitManager.this.getNetworkVersion());
                        AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                        if (i2 == 2) {
                            gTMBidRequestInfo.fillBannerData(map);
                        }
                        AnonymousClass2 anonymousClass4 = AnonymousClass2.this;
                        if (i2 == 0) {
                            gTMBidRequestInfo.fillNativeExpressData(map, map2);
                        }
                        if (gTMBidRequestInfo.isValid()) {
                            TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                            if (tUBidRequestInfoListener2 != null) {
                                tUBidRequestInfoListener2.onSuccess(gTMBidRequestInfo);
                                return;
                            }
                            return;
                        }
                        TUBidRequestInfoListener tUBidRequestInfoListener3 = tUBidRequestInfoListener;
                        if (tUBidRequestInfoListener3 != null) {
                            tUBidRequestInfoListener3.onFailed(TUBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE);
                        }
                    }
                });
            }
        });
    }
}
