package com.thinkup.network.facebook;

import android.content.Context;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookTUInitManager extends TUInitMediation {
    private static final String m = "FacebookTUInitManager";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile FacebookTUInitManager f42551n;
    List<MediationInitCallback> o;
    private boolean o0 = false;
    private Object oo = new Object();

    public interface InitListener {
        void onError(String str);

        void onSuccess();
    }

    private FacebookTUInitManager() {
    }

    public static FacebookTUInitManager getInstance() {
        if (f42551n == null) {
            synchronized (FacebookTUInitManager.class) {
                try {
                    if (f42551n == null) {
                        f42551n = new FacebookTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42551n;
    }

    private void o(AudienceNetworkAds.InitResult initResult) {
        synchronized (this.oo) {
            try {
                List<MediationInitCallback> list = this.o;
                if (list != null) {
                    for (MediationInitCallback mediationInitCallback : list) {
                        if (initResult.isSuccess()) {
                            if (mediationInitCallback != null) {
                                mediationInitCallback.onSuccess();
                            }
                        } else if (mediationInitCallback != null) {
                            mediationInitCallback.onFail(initResult.getMessage());
                        }
                    }
                }
                this.o0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.36";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return "Facebook";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.facebook.ads.AudienceNetworkAds";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return FacebookTUConst.getNetworkVersion();
    }

    public void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public synchronized void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        try {
            if (((Boolean) map.get("app_ccpa_switch")).booleanValue()) {
                AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 1, 1000);
            }
        } catch (Throwable unused) {
        }
        try {
            if (((Boolean) map.get("app_coppa_switch")).booleanValue()) {
                AdSettings.setMixedAudience(true);
            }
        } catch (Throwable unused2) {
        }
        try {
            synchronized (this.oo) {
                try {
                    if (AudienceNetworkAds.isInitialized(context)) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                        return;
                    }
                    if (this.o == null) {
                        this.o = new ArrayList();
                    }
                    if (mediationInitCallback != null) {
                        this.o.add(mediationInitCallback);
                    }
                    if (this.o0) {
                        return;
                    }
                    this.o0 = true;
                    AudienceNetworkAds.buildInitSettings(context.getApplicationContext()).withInitListener(new AudienceNetworkAds.InitListener() { // from class: com.thinkup.network.facebook.FacebookTUInitManager.1
                        @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                        public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                            FacebookTUInitManager.o(FacebookTUInitManager.this, initResult);
                        }
                    }).initialize();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused3) {
        }
    }

    public static String o(String str) {
        try {
            return new JSONObject(str).optString(AdSDKNotificationListener.ENCRYPTED_CPM_KEY);
        } catch (Throwable unused) {
            return "";
        }
    }

    public final void o(final Context context, final Map<String, Object> map, final boolean z2, final TUBidRequestInfoListener tUBidRequestInfoListener) {
        runOnThreadPool(new Runnable() { // from class: com.thinkup.network.facebook.FacebookTUInitManager.2
            @Override // java.lang.Runnable
            public final void run() {
                FacebookBidRequestInfo facebookBidRequestInfo = new FacebookBidRequestInfo(context, map);
                if (z2) {
                    facebookBidRequestInfo.fillBannerData(map);
                }
                if (facebookBidRequestInfo.isValid()) {
                    TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                    if (tUBidRequestInfoListener2 != null) {
                        tUBidRequestInfoListener2.onSuccess(facebookBidRequestInfo);
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

    public static /* synthetic */ void o(FacebookTUInitManager facebookTUInitManager, AudienceNetworkAds.InitResult initResult) {
        synchronized (facebookTUInitManager.oo) {
            try {
                List<MediationInitCallback> list = facebookTUInitManager.o;
                if (list != null) {
                    for (MediationInitCallback mediationInitCallback : list) {
                        if (initResult.isSuccess()) {
                            if (mediationInitCallback != null) {
                                mediationInitCallback.onSuccess();
                            }
                        } else if (mediationInitCallback != null) {
                            mediationInitCallback.onFail(initResult.getMessage());
                        }
                    }
                }
                facebookTUInitManager.o0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
