package com.thinkup.network.unityads;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.ne;
import com.p004ironsource.nw;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class UnityAdsTUInitManager extends TUInitMediation {
    private static volatile UnityAdsTUInitManager m;
    private String o;

    public interface InitListener {
        void onError(String str, String str2);

        void onSuccess();
    }

    private UnityAdsTUInitManager() {
    }

    public static UnityAdsTUInitManager getInstance() {
        if (m == null) {
            synchronized (UnityAdsTUInitManager.class) {
                try {
                    if (m == null) {
                        m = new UnityAdsTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.36";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return ne.F1;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return nw.f26320a;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return UnityAdsTUConst.getNetworkVersion();
    }

    public synchronized void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        MetaData metaData = new MetaData(context.getApplicationContext());
        metaData.set("gdpr.consent", Boolean.valueOf(z2));
        metaData.commit();
        return true;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public synchronized void initSDK(Context context, Map<String, Object> map, final MediationInitCallback mediationInitCallback) {
        final String stringFromMap = TUInitMediation.getStringFromMap(map, "game_id");
        if (!TextUtils.isEmpty(stringFromMap)) {
            try {
                boolean z2 = TUSDK.getPersionalizedAdStatus() == 2;
                MetaData metaData = new MetaData(context.getApplicationContext());
                metaData.set("user.nonbehavioral", Boolean.valueOf(z2));
                metaData.commit();
            } catch (Throwable unused) {
            }
            try {
                if (UnityAds.isInitialized() && !TextUtils.isEmpty(this.o) && TextUtils.equals(this.o, stringFromMap)) {
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                    return;
                }
                try {
                    boolean booleanFromMap = TUInitMediation.getBooleanFromMap(map, "app_ccpa_switch");
                    MetaData metaData2 = new MetaData(context.getApplicationContext());
                    metaData2.set("privacy.consent", Boolean.valueOf(!booleanFromMap));
                    metaData2.commit();
                } catch (Throwable unused2) {
                }
                try {
                    boolean booleanFromMap2 = TUInitMediation.getBooleanFromMap(map, "app_coppa_switch");
                    MetaData metaData3 = new MetaData(context.getApplicationContext());
                    metaData3.set("privacy.useroveragelimit", Boolean.valueOf(!booleanFromMap2));
                    metaData3.commit();
                } catch (Throwable unused3) {
                }
                UnityAds.initialize(context, stringFromMap, false, new IUnityAdsInitializationListener() { // from class: com.thinkup.network.unityads.UnityAdsTUInitManager.1
                    @Override // com.unity3d.ads.IUnityAdsInitializationListener
                    public final void onInitializationComplete() {
                        UnityAdsTUInitManager.this.o = stringFromMap;
                        MediationInitCallback mediationInitCallback2 = mediationInitCallback;
                        if (mediationInitCallback2 != null) {
                            mediationInitCallback2.onSuccess();
                        }
                    }

                    @Override // com.unity3d.ads.IUnityAdsInitializationListener
                    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
                        MediationInitCallback mediationInitCallback2 = mediationInitCallback;
                        if (mediationInitCallback2 != null) {
                            mediationInitCallback2.onFail(unityAdsInitializationError.name() + " : " + str);
                        }
                    }
                });
            } catch (Throwable th) {
                if (mediationInitCallback != null) {
                    mediationInitCallback.onFail("Unity init fail with exception:" + th.getMessage());
                }
            }
        }
    }
}
