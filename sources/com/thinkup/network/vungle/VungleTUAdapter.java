package com.thinkup.network.vungle;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import com.vungle.ads.AdConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class VungleTUAdapter extends CustomNativeAdapter {
    AdConfig m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42631n = "";
    String o;

    /* JADX INFO: renamed from: com.thinkup.network.vungle.VungleTUAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements VungleTUNativeAd.LoadCallbackListener {
        public AnonymousClass2() {
        }

        @Override // com.thinkup.network.vungle.VungleTUNativeAd.LoadCallbackListener
        public final void onFail(String str, String str2) {
            if (((TUBaseAdInternalAdapter) VungleTUAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) VungleTUAdapter.this).mLoadListener.onAdLoadError(str, str2);
            }
        }

        @Override // com.thinkup.network.vungle.VungleTUNativeAd.LoadCallbackListener
        public final void onSuccess(CustomNativeAd customNativeAd) {
            if (((TUBaseAdInternalAdapter) VungleTUAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) VungleTUAdapter.this).mLoadListener.onAdCacheLoaded(customNativeAd);
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        try {
            this.o = (String) map.get("placement_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        VungleTUInitManager.getInstance().o(context, map, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return VungleTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return VungleTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String str = (String) map.get("app_id");
        this.o = (String) map.get("placement_id");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.o)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", " appid & placementId is empty.");
                return;
            }
            return;
        }
        if (map.containsKey("payload")) {
            this.f42631n = map.get("payload").toString();
        }
        this.m = new AdConfig();
        VungleTUInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.thinkup.network.vungle.VungleTUAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str2) {
                if (((TUBaseAdInternalAdapter) VungleTUAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) VungleTUAdapter.this).mLoadListener.onAdLoadError("", str2);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() throws Throwable {
                VungleTUAdapter.o(VungleTUAdapter.this, context, map, map2);
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return VungleTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    private void o(Context context, Map<String, Object> map, Map<String, Object> map2) throws Throwable {
        new VungleTUNativeAd(context, this.o, this.m, new AnonymousClass2()).startLoadAd(context, map, map2, this.f42631n);
    }

    public static /* synthetic */ void o(VungleTUAdapter vungleTUAdapter, Context context, Map map, Map map2) throws Throwable {
        new VungleTUNativeAd(context, vungleTUAdapter.o, vungleTUAdapter.m, vungleTUAdapter.new AnonymousClass2()).startLoadAd(context, map, map2, vungleTUAdapter.f42631n);
    }
}
