package com.thinkup.network.pangle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.p004ironsource.d9;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class PangleTUInitManager extends TUInitMediation {
    public static final String TAG = "PangleTUInitManager";
    private static volatile PangleTUInitManager m;
    private List<MediationInitCallback> m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42614n;
    private String o0;
    private boolean om;
    private final Object mo = new Object();
    private Map<String, WeakReference> mm = new ConcurrentHashMap();
    private int mn = -1;
    private Boolean n0 = null;
    private Boolean no = null;
    private int nm = 1;
    PAGConfig.Builder o = new PAGConfig.Builder();
    private Handler oo = new Handler(Looper.getMainLooper());
    private AtomicBoolean on = new AtomicBoolean(false);

    private PangleTUInitManager() {
    }

    public static PangleTUInitManager getInstance() {
        if (m == null) {
            synchronized (PangleTUInitManager.class) {
                try {
                    if (m == null) {
                        m = new PangleTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public static void setPangleUserData(Map<String, Object> map) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "pangle_request_id");
        StringBuilder sbY = a.y(d9.i.d, !TextUtils.isEmpty(stringFromMap) ? a.n("{\"name\":\"hybrid_id\",\"value\":\"", stringFromMap, "\"},") : "", "{\"name\":\"mediation\",\"value\":\"TopOn\"},{\"name\":\"adapter_version\",\"value\":\"");
        sbY.append(TUSDK.getSDKVersionName());
        sbY.append("_");
        sbY.append(getInstance().getNetworkVersion());
        sbY.append("\"}]");
        String string = sbY.toString();
        PAGConfig.setUserData(string);
        if (TUSDK.isNetworkLogDebug()) {
            Log.d(TAG, "extraData = ".concat(String.valueOf(string)));
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.36";
    }

    public PAGBannerSize getBannerSize(Context context, Map<String, Object> map, Map<String, Object> map2) {
        byte b2 = 2;
        String stringFromMap = TUInitMediation.getStringFromMap(map, "size");
        int intFromMap = TUInitMediation.getIntFromMap(map, "unit_type", 1);
        int iO = o(context, context.getResources().getDisplayMetrics().widthPixels);
        if (map2 != null) {
            try {
                if (map2.containsKey("key_width")) {
                    iO = o(context, Integer.parseInt(map2.get("key_width").toString()));
                }
            } catch (Throwable unused) {
            }
        }
        PAGBannerSize pAGBannerSizeO = null;
        if (intFromMap == 1) {
            if (!TextUtils.isEmpty(stringFromMap)) {
                stringFromMap.getClass();
                switch (stringFromMap.hashCode()) {
                    case -559799608:
                        b2 = !stringFromMap.equals("300x250") ? (byte) -1 : (byte) 0;
                        break;
                    case 1507809730:
                        b2 = !stringFromMap.equals("320x50") ? (byte) -1 : (byte) 1;
                        break;
                    case 1622564786:
                        if (!stringFromMap.equals("728x90")) {
                            b2 = -1;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        pAGBannerSizeO = PAGBannerSize.BANNER_W_300_H_250;
                        break;
                    case 1:
                        pAGBannerSizeO = PAGBannerSize.BANNER_W_320_H_50;
                        break;
                    case 2:
                        pAGBannerSizeO = PAGBannerSize.BANNER_W_728_H_90;
                        break;
                }
            }
        } else if (intFromMap == 2) {
            pAGBannerSizeO = o(context, iO, "getCurrentOrientationAnchoredAdaptiveBannerAdSize");
        } else if (intFromMap == 3) {
            pAGBannerSizeO = o(context, iO, "getCurrentOrientationInlineAdaptiveBannerAdSize");
        }
        return pAGBannerSizeO == null ? PAGBannerSize.BANNER_W_320_H_50 : pAGBannerSizeO;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return "Pangle";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.bytedance.sdk.openadsdk.api.init.PAGSdk";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return PangleTUConst.getNetworkVersion();
    }

    public synchronized void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    @Deprecated
    public void setAppIconId(int i2) {
        this.mn = i2;
    }

    public void setPAConsent(int i2) {
        this.nm = i2;
    }

    public void setSupportMultiProcessConfig(boolean z2) {
        this.n0 = Boolean.valueOf(z2);
    }

    public void setUseTextureView(boolean z2) {
        this.no = Boolean.valueOf(z2);
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        if (this.o == null) {
            this.o = new PAGConfig.Builder();
        }
        this.o.setGDPRConsent(z2 ? 1 : 0);
        return true;
    }

    public static /* synthetic */ boolean o(PangleTUInitManager pangleTUInitManager) {
        pangleTUInitManager.om = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(boolean z2, String str, String str2) {
        synchronized (this.mo) {
            try {
                int size = this.m0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MediationInitCallback mediationInitCallback = this.m0.get(i2);
                    if (mediationInitCallback != null) {
                        if (z2) {
                            mediationInitCallback.onSuccess();
                        } else {
                            mediationInitCallback.onFail(str + " | " + str2);
                        }
                    }
                }
                this.m0.clear();
                this.on.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public synchronized void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        initSDK(context, map, new HashMap(1), mediationInitCallback);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0179 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #8 {all -> 0x017e, blocks: (B:80:0x016c, B:81:0x0175, B:83:0x0179), top: B:114:0x016c }] */
    public synchronized void initSDK(Context context, Map<String, Object> map, Map<String, Object> map2, MediationInitCallback mediationInitCallback) {
        int i2;
        try {
            try {
                if (TUInitMediation.getBooleanFromMap(map, "app_coppa_switch")) {
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onFail("Pangle SDK does not support child users.");
                    }
                    return;
                }
                String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
                if (map.containsKey(TUInitMediation.KEY_LOCAL)) {
                    this.o0 = stringFromMap;
                } else {
                    String str = this.o0;
                    if (str != null && !TextUtils.equals(str, stringFromMap)) {
                        checkToSaveInitData(getNetworkName(), map, this.o0);
                        this.o0 = null;
                    }
                }
                if (!PAGSdk.isInitSuccess() && !this.om) {
                    synchronized (this.mo) {
                        try {
                            if (this.on.get()) {
                                if (mediationInitCallback != null) {
                                    this.m0.add(mediationInitCallback);
                                }
                                return;
                            }
                            if (this.m0 == null) {
                                this.m0 = new ArrayList();
                            }
                            boolean z2 = true;
                            this.on.set(true);
                            if (mediationInitCallback != null) {
                                this.m0.add(mediationInitCallback);
                            }
                            try {
                                final Context applicationContext = context.getApplicationContext();
                                this.o.appId(stringFromMap).useTextureView(false).supportMultiProcess(false).setUserData("[{\"name\":\"mediation\",\"value\":\"TopOn\"},{\"name\":\"adapter_version\",\"value\":\"" + TUSDK.getSDKVersionName() + "_3.9.0.5\"}]");
                                try {
                                    Object objInvoke = this.o.getClass().getMethod("setAdxId", String.class).invoke(this.o, "193");
                                    String str2 = TAG;
                                    StringBuilder sb = new StringBuilder("setAdxIdMethod: ");
                                    sb.append(this.o == objInvoke);
                                    Log.d(str2, sb.toString());
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                                try {
                                    Object objInvoke2 = this.o.getClass().getMethod("setPAConsent", Integer.TYPE).invoke(this.o, Integer.valueOf(this.nm));
                                    String str3 = TAG;
                                    StringBuilder sb2 = new StringBuilder("setPAConsentMethod: ");
                                    if (this.o != objInvoke2) {
                                        z2 = false;
                                    }
                                    sb2.append(z2);
                                    Log.d(str3, sb2.toString());
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                }
                                Boolean bool = this.n0;
                                if (bool != null) {
                                    this.o.supportMultiProcess(bool.booleanValue());
                                }
                                Boolean bool2 = this.no;
                                if (bool2 != null) {
                                    this.o.useTextureView(bool2.booleanValue());
                                }
                                try {
                                    String bundleName = this.devBundleName;
                                    if (TextUtils.isEmpty(bundleName)) {
                                        try {
                                            bundleName = getInstance().getBundleName();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    if (TextUtils.isEmpty(bundleName)) {
                                        bundleName = applicationContext.getPackageName();
                                    }
                                    this.o.setPackageName(bundleName);
                                } catch (Throwable unused2) {
                                }
                                if (map2 != null) {
                                    try {
                                        this.mn = TUInitMediation.getIntFromMap(map2, TUAdConst.KEY.APP_LOGO_ID, -1);
                                        i2 = this.mn;
                                        if (i2 > 0) {
                                            this.o.appIcon(i2);
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                } else {
                                    i2 = this.mn;
                                    if (i2 > 0) {
                                        this.o.appIcon(i2);
                                    }
                                }
                                runOnMainThread(new Runnable() { // from class: com.thinkup.network.pangle.PangleTUInitManager.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        try {
                                            PAGSdk.init(applicationContext, PangleTUInitManager.this.o.build(), new PAGSdk.PAGInitCallback() { // from class: com.thinkup.network.pangle.PangleTUInitManager.1.1
                                                @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
                                                public final void fail(int i3, String str4) {
                                                    PangleTUInitManager.this.o(false, String.valueOf(i3), str4);
                                                }

                                                @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
                                                public final void success() {
                                                    PangleTUInitManager.o(PangleTUInitManager.this);
                                                    PangleTUInitManager.this.o(true, (String) null, (String) null);
                                                }
                                            });
                                        } catch (Throwable th3) {
                                            PangleTUInitManager.this.o(false, "", th3.getMessage());
                                        }
                                    }
                                });
                                return;
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                                o(false, "", th3.getMessage());
                                return;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                if (mediationInitCallback != null) {
                    mediationInitCallback.onSuccess();
                }
                return;
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
        } catch (Throwable th6) {
            throw th6;
        }
        throw th6;
    }

    public final void o(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        o(context, map, map2, tUBidRequestInfoListener, false);
    }

    public final void o(final Context context, final Map<String, Object> map, final Map<String, Object> map2, final TUBidRequestInfoListener tUBidRequestInfoListener, final boolean z2) {
        getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.pangle.PangleTUInitManager.2
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                if (tUBidRequestInfoListener2 != null) {
                    tUBidRequestInfoListener2.onFailed(str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                try {
                    try {
                        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
                        pAGBiddingRequest.setAdxId("193");
                        pAGBiddingRequest.setSlotId(TUInitMediation.getStringFromMap(map, "slot_id"));
                        if (z2) {
                            pAGBiddingRequest.setBannerSize(PangleTUInitManager.getInstance().getBannerSize(context, map, map2));
                        }
                        PAGSdk.getBiddingToken(context, pAGBiddingRequest, new BiddingTokenCallback() { // from class: com.thinkup.network.pangle.PangleTUInitManager.2.1
                            @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
                            public final void onBiddingTokenCollected(String str) {
                                Looper.getMainLooper();
                                Looper.myLooper();
                                o(str);
                            }
                        });
                    } catch (Throwable unused) {
                        o(PAGSdk.getBiddingToken());
                    }
                } catch (Throwable unused2) {
                    PAGSdk.getBiddingToken(new BiddingTokenCallback() { // from class: com.thinkup.network.pangle.PangleTUInitManager.2.2
                        @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
                        public final void onBiddingTokenCollected(String str) {
                            Looper.getMainLooper();
                            Looper.myLooper();
                            o(str);
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void o(String str) {
                PangleBidRequestInfo pangleBidRequestInfo = new PangleBidRequestInfo(context, map, map2, str, z2);
                if (pangleBidRequestInfo.isValid()) {
                    TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                    if (tUBidRequestInfoListener2 != null) {
                        tUBidRequestInfoListener2.onSuccess(pangleBidRequestInfo);
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

    public final void o(String str, WeakReference weakReference) {
        try {
            this.mm.put(str, weakReference);
        } catch (Throwable unused) {
        }
    }

    private static PAGBannerSize o(Context context, int i2, String str) {
        try {
            Method method = PAGBannerSize.class.getMethod(str, Context.class, Integer.TYPE);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, context, Integer.valueOf(i2));
            if (objInvoke instanceof PAGBannerSize) {
                return (PAGBannerSize) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static int o(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }
}
