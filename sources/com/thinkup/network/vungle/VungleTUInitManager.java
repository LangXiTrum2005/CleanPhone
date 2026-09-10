package com.thinkup.network.vungle;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.common.n.mo;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;
import com.vungle.ads.VungleWrapperFramework;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes6.dex */
public class VungleTUInitManager extends TUInitMediation {
    private static volatile VungleTUInitManager m = null;
    private static final String o = "VungleTUInitManager";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42635n;
    private List<MediationInitCallback> o0;
    private String on;
    private final Object oo = new Object();
    private Map<String, WeakReference> om = new ConcurrentHashMap();

    private VungleTUInitManager() {
    }

    public static VungleTUInitManager getInstance() {
        if (m == null) {
            synchronized (VungleTUInitManager.class) {
                try {
                    if (m == null) {
                        m = new VungleTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private void o(boolean z2, VungleError vungleError) {
        synchronized (this.oo) {
            try {
                this.f42635n = false;
                int size = this.o0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MediationInitCallback mediationInitCallback = this.o0.get(i2);
                    if (mediationInitCallback != null) {
                        if (z2) {
                            mediationInitCallback.onSuccess();
                        } else {
                            mediationInitCallback.onFail(vungleError.getCode() + ", " + vungleError.getLocalizedMessage());
                        }
                    }
                }
                this.o0.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return mo.m;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return com.vungle.ads.BuildConfig.OMSDK_PARTNER_NAME;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.vungle.ads.VungleAds";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return VungleTUConst.getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public Map<String, Boolean> getPluginClassStatus() {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        map.put("play-services-ads-identifier-*.aar", bool);
        map.put("play-services-basement-*.aar", bool);
        map.put("okhttp-*.jar", bool);
        map.put("okio-*.jar", bool);
        map.put("kotlinx-serialization-core-jvm-*.jar", bool);
        map.put("kotlinx-serialization-json-jvm-*.jar", bool);
        map.put("protobuf-*.jar", bool);
        try {
            map.put("play-services-ads-identifier-*.aar", Boolean.TRUE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            map.put("play-services-basement-*.aar", Boolean.TRUE);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            map.put("okhttp-*.jar", Boolean.TRUE);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            map.put("okio-*.jar", Boolean.TRUE);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        try {
            map.put("protobuf-*.jar", Boolean.TRUE);
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        try {
            map.put("kotlinx-serialization-core-jvm-*.jar", Boolean.TRUE);
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        try {
            Json.Companion companion = Json.INSTANCE;
            map.put("kotlinx-serialization-json-jvm-*.jar", Boolean.TRUE);
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        return map;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public synchronized void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        synchronized (this.oo) {
            try {
                String string = map.get("app_id").toString();
                if (map.containsKey(TUInitMediation.KEY_LOCAL)) {
                    this.on = string;
                } else {
                    String str = this.on;
                    if (str != null && !TextUtils.equals(str, string)) {
                        checkToSaveInitData(getNetworkName(), map, this.on);
                        this.on = null;
                    }
                }
                if (this.o0 == null) {
                    this.o0 = new ArrayList();
                }
                try {
                    if (((Boolean) map.get("app_ccpa_switch")).booleanValue()) {
                        VunglePrivacySettings.setCCPAStatus(true);
                    }
                } catch (Throwable unused) {
                }
                try {
                    VunglePrivacySettings.setCOPPAStatus(((Boolean) map.get("app_coppa_switch")).booleanValue());
                } catch (Throwable unused2) {
                }
                if (!VungleAds.isInitialized()) {
                    if (mediationInitCallback != null) {
                        this.o0.add(mediationInitCallback);
                    }
                    if (this.f42635n) {
                        return;
                    }
                    this.f42635n = true;
                    try {
                        VungleAds.setIntegrationName(VungleWrapperFramework.vunglehbs, "7.0.0");
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    VungleAds.init(context.getApplicationContext(), string, new InitializationListener() { // from class: com.thinkup.network.vungle.VungleTUInitManager.1
                        @Override // com.vungle.ads.InitializationListener
                        public final void onError(VungleError vungleError) {
                            VungleTUInitManager.o(VungleTUInitManager.this, false, vungleError);
                        }

                        @Override // com.vungle.ads.InitializationListener
                        public final void onSuccess() {
                            VungleTUInitManager.o(VungleTUInitManager.this, true, (VungleError) null);
                        }
                    });
                } else if (mediationInitCallback != null) {
                    mediationInitCallback.onSuccess();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        VunglePrivacySettings.setGDPRStatus(z2, "1.0.0");
        return true;
    }

    private void o(String str, WeakReference weakReference) {
        try {
            this.om.put(str, weakReference);
        } catch (Throwable unused) {
        }
    }

    private WeakReference o(String str) {
        return this.om.remove(str);
    }

    public final void o(final Context context, final Map<String, Object> map, final TUBidRequestInfoListener tUBidRequestInfoListener) {
        getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.vungle.VungleTUInitManager.2
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                if (tUBidRequestInfoListener2 != null) {
                    tUBidRequestInfoListener2.onFailed(str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                VungleAds.getBiddingToken(context, new BidTokenCallback() { // from class: com.thinkup.network.vungle.VungleTUInitManager.2.1
                    @Override // com.vungle.ads.BidTokenCallback
                    public final void onBidTokenCollected(String str) {
                        if (TextUtils.isEmpty(str)) {
                            TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                            if (tUBidRequestInfoListener2 != null) {
                                tUBidRequestInfoListener2.onFailed(TUBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE);
                                return;
                            }
                            return;
                        }
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        VungleBidRequestInfo vungleBidRequestInfo = new VungleBidRequestInfo(context, map, str);
                        TUBidRequestInfoListener tUBidRequestInfoListener3 = tUBidRequestInfoListener;
                        if (tUBidRequestInfoListener3 != null) {
                            tUBidRequestInfoListener3.onSuccess(vungleBidRequestInfo);
                        }
                    }

                    @Override // com.vungle.ads.BidTokenCallback
                    public final void onBidTokenError(String str) {
                        TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                        if (tUBidRequestInfoListener2 != null) {
                            tUBidRequestInfoListener2.onFailed(str);
                        }
                    }
                });
            }
        });
    }

    public static /* synthetic */ void o(VungleTUInitManager vungleTUInitManager, boolean z2, VungleError vungleError) {
        synchronized (vungleTUInitManager.oo) {
            try {
                vungleTUInitManager.f42635n = false;
                int size = vungleTUInitManager.o0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MediationInitCallback mediationInitCallback = vungleTUInitManager.o0.get(i2);
                    if (mediationInitCallback != null) {
                        if (z2) {
                            mediationInitCallback.onSuccess();
                        } else {
                            mediationInitCallback.onFail(vungleError.getCode() + ", " + vungleError.getLocalizedMessage());
                        }
                    }
                }
                vungleTUInitManager.o0.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }
}
