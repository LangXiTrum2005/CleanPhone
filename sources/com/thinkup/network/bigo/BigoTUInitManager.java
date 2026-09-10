package com.thinkup.network.bigo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ConsentOptions;
import sg.bigo.ads.api.AdConfig;

/* JADX INFO: loaded from: classes6.dex */
public class BigoTUInitManager extends TUInitMediation {
    public static String TAG = "BigoTUInitManager";
    private static volatile BigoTUInitManager o;
    private String m;
    private List<MediationInitCallback> om;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42531n = -1;
    private int o0 = -1;
    private long oo = -1;
    private final Object on = new Object();
    private boolean m0 = false;
    private Handler mo = new Handler(Looper.getMainLooper());

    private BigoTUInitManager() {
    }

    public static BigoTUInitManager getInstance() {
        if (o == null) {
            synchronized (BigoTUInitManager.class) {
                try {
                    if (o == null) {
                        o = new BigoTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    private void o(boolean z2, String str) {
        synchronized (this.on) {
            try {
                List<MediationInitCallback> list = this.om;
                if (list != null) {
                    for (MediationInitCallback mediationInitCallback : list) {
                        if (z2) {
                            if (mediationInitCallback != null) {
                                mediationInitCallback.onSuccess();
                            }
                        } else if (mediationInitCallback != null) {
                            mediationInitCallback.onFail(str);
                        }
                    }
                }
                this.m0 = false;
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
        return "BigoAds";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "sg.bigo.ads.BigoAdSdk";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return BigoAdSdk.getSDKVersionName();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        try {
            BigoAdSdk.setUserConsent(context, ConsentOptions.CCPA, !TUInitMediation.getBooleanFromMap(map, "app_ccpa_switch"));
        } catch (Throwable unused) {
        }
        try {
            BigoAdSdk.setUserConsent(context, ConsentOptions.COPPA, !TUInitMediation.getBooleanFromMap(map, "app_coppa_switch"));
        } catch (Throwable unused2) {
        }
        synchronized (this.on) {
            try {
                if (BigoAdSdk.isInitialized()) {
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                    return;
                }
                if (this.om == null) {
                    this.om = new ArrayList(3);
                }
                if (mediationInitCallback != null) {
                    this.om.add(mediationInitCallback);
                }
                if (this.m0) {
                    return;
                }
                this.m0 = true;
                AdConfig.Builder appId = new AdConfig.Builder().setAppId(TUInitMediation.getStringFromMap(map, "app_id"));
                if (!TextUtils.isEmpty(this.m)) {
                    appId.setChannel(this.m);
                }
                if (TUSDK.isNetworkLogDebug()) {
                    appId.setDebug(true);
                }
                int i2 = this.f42531n;
                if (i2 >= 0) {
                    appId.setAge(i2);
                }
                int i3 = this.o0;
                if (i3 >= 0) {
                    appId.setGender(i3);
                }
                long j = this.oo;
                if (j >= 0) {
                    appId.setActivatedTime(j);
                }
                String stringFromMap = TUInitMediation.getStringFromMap(map, "network_ext");
                if (!TextUtils.isEmpty(stringFromMap)) {
                    try {
                        JSONObject jSONObject = new JSONObject(stringFromMap);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            appId.addExtra(next, jSONObject.getString(next));
                        }
                    } catch (JSONException e2) {
                        Log.e(TAG, "parse networkExt failed: " + e2.getMessage());
                    }
                }
                BigoAdSdk.initialize(context, appId.build(), new BigoAdSdk.InitListener() { // from class: com.thinkup.network.bigo.BigoTUInitManager.1
                    @Override // sg.bigo.ads.BigoAdSdk.InitListener
                    public final void onInitialized() {
                        BigoTUInitManager.o(BigoTUInitManager.this);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setActivatedTime(long j) {
        this.oo = j;
    }

    public void setAge(int i2) {
        this.f42531n = i2;
    }

    public void setChannel(String str) {
        this.m = str;
    }

    public void setGender(int i2) {
        this.o0 = i2;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        if (!z3) {
            return true;
        }
        BigoAdSdk.setUserConsent(context, ConsentOptions.GDPR, z2);
        return true;
    }

    public final void o(final Context context, final Map<String, Object> map, final boolean z2, final TUBidRequestInfoListener tUBidRequestInfoListener) {
        getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.bigo.BigoTUInitManager.2
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                if (tUBidRequestInfoListener2 != null) {
                    tUBidRequestInfoListener2.onFailed(str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                BigoBidRequestInfo bigoBidRequestInfo = new BigoBidRequestInfo(map);
                if (z2) {
                    bigoBidRequestInfo.fillBannerData(map);
                }
                if (bigoBidRequestInfo.isValid()) {
                    TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                    if (tUBidRequestInfoListener2 != null) {
                        tUBidRequestInfoListener2.onSuccess(bigoBidRequestInfo);
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

    public static /* synthetic */ void o(BigoTUInitManager bigoTUInitManager) {
        synchronized (bigoTUInitManager.on) {
            try {
                List<MediationInitCallback> list = bigoTUInitManager.om;
                if (list != null) {
                    for (MediationInitCallback mediationInitCallback : list) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                    }
                }
                bigoTUInitManager.m0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
