package com.thinkup.network.vungle;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.vungle.ads.AdConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class VungleTUBannerAdapter extends CustomBannerAdapter {
    AdConfig m;
    String o;
    View om;
    VungleTUBanner on;
    String oo;
    private final String m0 = "VungleTUBannerAdapter";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42633n = "";
    String o0 = "";

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.om = null;
        VungleTUBanner vungleTUBanner = this.on;
        if (vungleTUBanner != null) {
            vungleTUBanner.destroy();
            this.on = null;
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        VungleTUBanner vungleTUBanner;
        if (this.om == null && (vungleTUBanner = this.on) != null) {
            this.om = vungleTUBanner.getBannerView();
        }
        return this.om;
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

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return VungleTUInitManager.getInstance();
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

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        VungleTUBanner vungleTUBanner = this.on;
        if (vungleTUBanner != null) {
            return vungleTUBanner.isAdReady();
        }
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, Map<String, Object> map, final Map<String, Object> map2) {
        String str = (String) map.get("app_id");
        this.o = (String) map.get("placement_id");
        if (map.containsKey("unit_type")) {
            this.f42633n = (String) map.get("unit_type");
        }
        if (map.containsKey("size_type")) {
            this.o0 = (String) map.get("size_type");
        }
        try {
            if (map.containsKey("payload")) {
                this.oo = map.get("payload").toString();
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.o)) {
            this.m = new AdConfig();
            VungleTUInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.thinkup.network.vungle.VungleTUBannerAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str2) {
                    if (((TUBaseAdInternalAdapter) VungleTUBannerAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) VungleTUBannerAdapter.this).mLoadListener.onAdLoadError("", str2);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    try {
                        VungleTUBannerAdapter.o(VungleTUBannerAdapter.this, context, map2);
                    } catch (Throwable th) {
                        if (((TUBaseAdInternalAdapter) VungleTUBannerAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) VungleTUBannerAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                        }
                    }
                }
            });
        } else {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "vungle appid & placementId is empty.");
            }
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return VungleTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    private void o(Context context, Map<String, Object> map) {
        try {
            if (TextUtils.isEmpty(this.f42633n) || !this.f42633n.equals("2")) {
                this.on = new VungleBannerAd(this.f42633n, this.o0, this.oo);
            } else {
                this.on = new VungleBannerViewAd(context, map, this.o0, this.oo);
            }
            this.on.loadAd(context, this.o, this.mLoadListener, this);
        } catch (Exception e2) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", e2.getMessage());
            }
        }
    }

    public static /* synthetic */ void o(VungleTUBannerAdapter vungleTUBannerAdapter, Context context, Map map) {
        try {
            if (!TextUtils.isEmpty(vungleTUBannerAdapter.f42633n) && vungleTUBannerAdapter.f42633n.equals("2")) {
                vungleTUBannerAdapter.on = new VungleBannerViewAd(context, map, vungleTUBannerAdapter.o0, vungleTUBannerAdapter.oo);
            } else {
                vungleTUBannerAdapter.on = new VungleBannerAd(vungleTUBannerAdapter.f42633n, vungleTUBannerAdapter.o0, vungleTUBannerAdapter.oo);
            }
            vungleTUBannerAdapter.on.loadAd(context, vungleTUBannerAdapter.o, vungleTUBannerAdapter.mLoadListener, vungleTUBannerAdapter);
        } catch (Exception e2) {
            TUCustomLoadListener tUCustomLoadListener = vungleTUBannerAdapter.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", e2.getMessage());
            }
        }
    }
}
