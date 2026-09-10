package com.thinkup.network.admob;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdmobTUAdapter extends CustomNativeAdapter {
    private String m;
    private String o;

    /* JADX INFO: renamed from: com.thinkup.network.admob.AdmobTUAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f42492n;
        final /* synthetic */ Context o;
        final /* synthetic */ Map o0;
        final /* synthetic */ boolean om;
        final /* synthetic */ Map oo;

        public AnonymousClass2(Context context, String str, String str2, Map map, Map map2, boolean z2) {
            this.o = context;
            this.m = str;
            this.f42492n = str2;
            this.o0 = map;
            this.oo = map2;
            this.om = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AdmobTUNativeAd admobTUNativeAd = new AdmobTUNativeAd(this.o, this.m, this.f42492n, AdmobTUAdapter.this.m, new AdmobTUNativeAd.LoadCallbackListener() { // from class: com.thinkup.network.admob.AdmobTUAdapter.2.1
                    @Override // com.thinkup.network.admob.AdmobTUNativeAd.LoadCallbackListener
                    public final void onFail(String str, String str2) {
                        if (((TUBaseAdInternalAdapter) AdmobTUAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) AdmobTUAdapter.this).mLoadListener.onAdLoadError(str, str2);
                        }
                    }

                    @Override // com.thinkup.network.admob.AdmobTUNativeAd.LoadCallbackListener
                    public final void onSuccess(CustomNativeAd customNativeAd) {
                        if (((TUBaseAdInternalAdapter) AdmobTUAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) AdmobTUAdapter.this).mLoadListener.onAdCacheLoaded(customNativeAd);
                        }
                    }
                }, this.o0, this.oo);
                admobTUNativeAd.setIsAutoPlay(this.om);
                admobTUNativeAd.loadAd(this.o, this.o0, this.oo);
            } catch (Throwable th) {
                if (((TUBaseAdInternalAdapter) AdmobTUAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) AdmobTUAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.NATIVE, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return AdMobTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        final String stringFromMap = TUInitMediation.getStringFromMap(map, "unit_id");
        final String stringFromMap2 = TUInitMediation.getStringFromMap(map, "media_ratio");
        this.m = TUInitMediation.getStringFromMap(map, "payload");
        if (TextUtils.isEmpty(stringFromMap)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "unitId is empty.");
                return;
            }
            return;
        }
        this.o = stringFromMap;
        final boolean booleanFromMap = TUInitMediation.getBooleanFromMap(map, CustomNativeAd.IS_AUTO_PLAY_KEY, false);
        final Context applicationContext = context.getApplicationContext();
        AdMobTUInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.thinkup.network.admob.AdmobTUAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                if (((TUBaseAdInternalAdapter) AdmobTUAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) AdmobTUAdapter.this).mLoadListener.onAdLoadError("", str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                AdmobTUAdapter.o(AdmobTUAdapter.this, applicationContext, map, map2, stringFromMap, stringFromMap2, booleanFromMap);
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return AdMobTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    private void o(Context context, Map<String, Object> map, Map<String, Object> map2, String str, String str2, boolean z2) {
        runOnNetworkRequestThread(new AnonymousClass2(context, str2, str, map, map2, z2));
    }

    public static /* synthetic */ void o(AdmobTUAdapter admobTUAdapter, Context context, Map map, Map map2, String str, String str2, boolean z2) {
        admobTUAdapter.runOnNetworkRequestThread(admobTUAdapter.new AnonymousClass2(context, str2, str, map, map2, z2));
    }
}
