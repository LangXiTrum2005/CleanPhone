package com.thinkup.network.inmobi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUBiddingResult;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.api.TUSDKGlobalSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class InmobiTUInitManager extends TUInitMediation {
    private static volatile InmobiTUInitManager on = null;
    private static final String oo = "InmobiTUInitManager";
    volatile boolean o0;
    private String om;
    ConcurrentHashMap<String, Object> m = new ConcurrentHashMap<>();
    private final o mo = new o(this, 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    JSONObject f42585n = new JSONObject();
    private Handler m0 = new Handler(Looper.getMainLooper());
    ConcurrentHashMap<String, Object> o = new ConcurrentHashMap<>();

    public interface OnInitCallback {
        void onError(String str);

        void onSuccess();
    }

    private InmobiTUInitManager() {
    }

    public static InmobiTUInitManager getInstance() {
        if (on == null) {
            synchronized (InmobiTUInitManager.class) {
                try {
                    if (on == null) {
                        on = new InmobiTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return on;
    }

    public void addInmobiAd(Object obj) {
        if (obj != null) {
            this.o.put(String.valueOf(obj.hashCode()), obj);
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public List getActivityStatus() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.inmobi.ads.rendering.InMobiAdActivity");
        return arrayList;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.36";
    }

    public void getBidRequestInfo(Context context, final Map<String, Object> map, final boolean z2, final TUBidRequestInfoListener tUBidRequestInfoListener) throws Throwable {
        getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.inmobi.InmobiTUInitManager.2
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                if (tUBidRequestInfoListener2 != null) {
                    tUBidRequestInfoListener2.onFailed(str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                InmobiTUInitManager.this.runOnThreadPool(new Runnable() { // from class: com.thinkup.network.inmobi.InmobiTUInitManager.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            String token = InMobiSdk.getToken(InmobiTUInitManager.this.getTopOnInfoExtraMap(), null);
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            if (tUBidRequestInfoListener != null) {
                                InmobiRequestInfo inmobiRequestInfo = new InmobiRequestInfo(token, map);
                                AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                                if (z2) {
                                    inmobiRequestInfo.fillBannerData(map);
                                }
                                tUBidRequestInfoListener.onSuccess(inmobiRequestInfo);
                            }
                        } catch (Throwable th) {
                            TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                            if (tUBidRequestInfoListener2 != null) {
                                tUBidRequestInfoListener2.onFailed("getToken fail with exception:" + th.getMessage());
                            }
                        }
                    }
                });
            }
        });
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return "Inmobi";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.inmobi.sdk.InMobiSdk";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return InmobiTUConst.getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public Map<String, Boolean> getPluginClassStatus() {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        map.put("okhttp-*.jar", bool);
        map.put("okio-*.jar", bool);
        map.put("picasso-*.aar", bool);
        map.put("play-services-ads-identifier-*.aar", bool);
        map.put("play-services-basement-*.aar", bool);
        map.put("recyclerview-*.aar", bool);
        map.put("support-customtabs-*.aar or androidx.browser.*.aar", bool);
        map.put("inmobi-omsdk.arr", bool);
        try {
            map.put("okhttp-*.jar", Boolean.TRUE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            map.put("okio-*.jar", Boolean.TRUE);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            map.put("picasso-*.aar", Boolean.TRUE);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            map.put("play-services-ads-identifier-*.aar", Boolean.TRUE);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        try {
            map.put("play-services-basement-*.aar", Boolean.TRUE);
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        try {
            map.put("recyclerview-*.aar", Boolean.TRUE);
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        try {
            map.put("support-customtabs-*.aar or androidx.browser.*.aar", Boolean.TRUE);
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        try {
            map.put("inmobi-omsdk.arr", Boolean.TRUE);
        } catch (Throwable th8) {
            th8.printStackTrace();
        }
        return map;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public List getProviderStatus() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.squareup.picasso.PicassoProvider");
        return arrayList;
    }

    public Map<String, String> getTopOnInfoExtraMap() {
        HashMap mapS = a.s("tp", "c_topon");
        mapS.put("tp-ver", TUSDK.getSDKVersionName());
        return mapS;
    }

    public synchronized void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    public void onAdFetchSuccessful(boolean z2, AdMetaInfo adMetaInfo, TUCustomLoadListener tUCustomLoadListener, TUBiddingListener tUBiddingListener) {
        onAdFetchSuccessful(z2, adMetaInfo, tUCustomLoadListener, tUBiddingListener, null);
    }

    public void post(Runnable runnable) {
        this.m0.post(runnable);
    }

    public void postDelay(Runnable runnable, long j) {
        this.m0.postDelayed(runnable, j);
    }

    public void removeInmobiAd(Object obj) {
        if (obj != null) {
            this.o.remove(String.valueOf(obj.hashCode()));
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        String str = z3 ? "1" : "0";
        try {
            this.f42585n.put(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE, z2);
            this.f42585n.put("gdpr", str);
            InMobiSdk.updateGDPRConsent(this.f42585n);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public class o implements SdkInitializationListener {
        private List<MediationInitCallback> o;

        private o() {
            this.o = new ArrayList(5);
        }

        public void addListener(MediationInitCallback mediationInitCallback) {
            synchronized (InmobiTUInitManager.this) {
                try {
                    List<MediationInitCallback> list = this.o;
                    if (list != null) {
                        list.add(mediationInitCallback);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.inmobi.sdk.SdkInitializationListener
        public void onInitializationComplete(Error error) {
            try {
                synchronized (InmobiTUInitManager.this) {
                    try {
                        List<MediationInitCallback> list = this.o;
                        if (list != null) {
                            if (error == null) {
                                int size = list.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    MediationInitCallback mediationInitCallback = this.o.get(i2);
                                    if (mediationInitCallback != null) {
                                        mediationInitCallback.onSuccess();
                                    }
                                }
                            } else {
                                int size2 = list.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    MediationInitCallback mediationInitCallback2 = this.o.get(i3);
                                    if (mediationInitCallback2 != null) {
                                        mediationInitCallback2.onFail(error.getMessage());
                                    }
                                }
                            }
                            this.o.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    th2.printStackTrace();
                } finally {
                    InmobiTUInitManager.this.o0 = false;
                }
            }
        }

        public /* synthetic */ o(InmobiTUInitManager inmobiTUInitManager, byte b2) {
            this();
        }
    }

    public void onAdFetchSuccessful(boolean z2, AdMetaInfo adMetaInfo, TUCustomLoadListener tUCustomLoadListener, TUBiddingListener tUBiddingListener, BaseAd baseAd) {
        if (!z2) {
            if (tUCustomLoadListener != null) {
                if (baseAd == null) {
                    tUCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    return;
                } else {
                    tUCustomLoadListener.onAdCacheLoaded(baseAd);
                    return;
                }
            }
            return;
        }
        String str = adMetaInfo.getCreativeID() + System.currentTimeMillis();
        double bid = adMetaInfo.getBid();
        if (tUBiddingListener != null) {
            tUBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.success(bid, str, null), baseAd);
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public synchronized void initSDK(Context context, final Map<String, Object> map, final MediationInitCallback mediationInitCallback) throws Throwable {
        Throwable th;
        try {
            try {
                final String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
                if (!TextUtils.isEmpty(stringFromMap)) {
                    final Context applicationContext = context.getApplicationContext();
                    post(new Runnable() { // from class: com.thinkup.network.inmobi.InmobiTUInitManager.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            synchronized (InmobiTUInitManager.this) {
                                try {
                                    if (stringFromMap.equals(InmobiTUInitManager.this.om)) {
                                        MediationInitCallback mediationInitCallback2 = mediationInitCallback;
                                        if (mediationInitCallback2 != null) {
                                            mediationInitCallback2.onSuccess();
                                        }
                                        return;
                                    }
                                    InmobiTUInitManager.this.mo.addListener(mediationInitCallback);
                                    if (InmobiTUInitManager.this.o0) {
                                        return;
                                    }
                                    InmobiTUInitManager.this.o0 = true;
                                    Boolean bool = TUSDKGlobalSetting.isGlobalMute;
                                    if (bool != null) {
                                        InMobiSdk.setApplicationMuted(bool.booleanValue());
                                    }
                                    InMobiSdk.setIsAgeRestricted(TUInitMediation.getBooleanFromMap(map, "app_coppa_switch"));
                                    InMobiSdk.init(applicationContext, stringFromMap, InmobiTUInitManager.this.f42585n, new o() { // from class: com.thinkup.network.inmobi.InmobiTUInitManager.1.1
                                        {
                                            InmobiTUInitManager inmobiTUInitManager = InmobiTUInitManager.this;
                                        }

                                        @Override // com.thinkup.network.inmobi.InmobiTUInitManager.o, com.inmobi.sdk.SdkInitializationListener
                                        public final void onInitializationComplete(Error error) {
                                            if (error == null) {
                                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                                InmobiTUInitManager.this.om = stringFromMap;
                                            }
                                            InmobiTUInitManager.this.mo.onInitializationComplete(error);
                                        }
                                    });
                                } catch (Throwable th2) {
                                    MediationInitCallback mediationInitCallback3 = mediationInitCallback;
                                    if (mediationInitCallback3 != null) {
                                        mediationInitCallback3.onFail(th2.getMessage());
                                    }
                                }
                            }
                        }
                    });
                    return;
                } else {
                    if (mediationInitCallback != null) {
                        try {
                            mediationInitCallback.onFail("Inmobi: Account Id is empty.");
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    return;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }
}
