package com.thinkup.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeBannerAd;
import com.thinkup.core.api.MediationBidManager;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookTUAdapter extends CustomNativeAdapter {
    String o;
    String m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42548n = "0";
    String o0 = "";
    boolean oo = false;

    /* JADX INFO: renamed from: com.thinkup.network.facebook.FacebookTUAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements FacebookTUBaseNativeAd.o {
        final /* synthetic */ FacebookTUBaseNativeAd o;

        public AnonymousClass1(FacebookTUBaseNativeAd facebookTUBaseNativeAd) {
            this.o = facebookTUBaseNativeAd;
        }

        @Override // com.thinkup.network.facebook.FacebookTUBaseNativeAd.o
        public final void onLoadFail(String str, String str2) {
            if (((TUBaseAdInternalAdapter) FacebookTUAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) FacebookTUAdapter.this).mLoadListener.onAdLoadError(str, str2);
            }
        }

        @Override // com.thinkup.network.facebook.FacebookTUBaseNativeAd.o
        public final void onLoadSuccess() {
            if (((TUBaseAdInternalAdapter) FacebookTUAdapter.this).mLoadListener == null || ((TUBaseAdInternalAdapter) FacebookTUAdapter.this).mLoadListener == null) {
                return;
            }
            ((TUBaseAdInternalAdapter) FacebookTUAdapter.this).mLoadListener.onAdCacheLoaded(this.o);
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public MediationBidManager getBidManager() {
        return FacebookBidkitManager.getInstance();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        try {
            this.m = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookTUInitManager.getInstance().o(context, map, false, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return FacebookTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return FacebookTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.m;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return FacebookTUInitManager.getInstance().getNetworkVersion();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        byte b2;
        FacebookTUBaseNativeAd facebookTUNativeBannerExpressAd;
        try {
            if (map.containsKey("unit_id")) {
                this.m = map.get("unit_id").toString();
            }
            if (map.containsKey("unit_type")) {
                this.f42548n = map.get("unit_type").toString();
            }
            if (map.containsKey("height")) {
                this.o0 = map.get("height").toString();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (TextUtils.isEmpty(this.m)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "facebook unitId is empty.");
                return;
            }
            return;
        }
        if (map != null) {
            try {
                this.oo = Boolean.parseBoolean(map.get(CustomNativeAd.IS_AUTO_PLAY_KEY).toString());
            } catch (Exception unused) {
            }
        }
        Context applicationContext = context.getApplicationContext();
        FacebookTUInitManager.getInstance().initSDK(applicationContext, map);
        if (map.containsKey("payload")) {
            this.o = map.get("payload").toString();
        }
        switch (this.f42548n) {
            case "0":
                b2 = 3;
                break;
            case "1":
                b2 = 0;
                break;
            case "2":
                b2 = 1;
                break;
            case "3":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            facebookTUNativeBannerExpressAd = new FacebookTUNativeBannerExpressAd(applicationContext, new NativeBannerAd(applicationContext, this.m), this.o0);
        } else if (b2 != 1) {
            facebookTUNativeBannerExpressAd = b2 != 2 ? new FacebookTUNativeAd(applicationContext, new NativeAd(applicationContext, this.m)) : new FacebookTUNativeBannerAd(applicationContext, new NativeBannerAd(applicationContext, this.m));
        } else {
            facebookTUNativeBannerExpressAd = new FacebookTUNativeExpressAd(applicationContext, new NativeAd(applicationContext, this.m));
        }
        facebookTUNativeBannerExpressAd.loadAd(this.o, new AnonymousClass1(facebookTUNativeBannerExpressAd));
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    private void o(Context context, Map<String, Object> map) {
        byte b2;
        FacebookTUBaseNativeAd facebookTUNativeBannerExpressAd;
        if (map.containsKey("payload")) {
            this.o = map.get("payload").toString();
        }
        switch (this.f42548n) {
            case "0":
                b2 = 3;
                break;
            case "1":
                b2 = 0;
                break;
            case "2":
                b2 = 1;
                break;
            case "3":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            facebookTUNativeBannerExpressAd = new FacebookTUNativeBannerExpressAd(context, new NativeBannerAd(context, this.m), this.o0);
        } else if (b2 != 1) {
            facebookTUNativeBannerExpressAd = b2 != 2 ? new FacebookTUNativeAd(context, new NativeAd(context, this.m)) : new FacebookTUNativeBannerAd(context, new NativeBannerAd(context, this.m));
        } else {
            facebookTUNativeBannerExpressAd = new FacebookTUNativeExpressAd(context, new NativeAd(context, this.m));
        }
        facebookTUNativeBannerExpressAd.loadAd(this.o, new AnonymousClass1(facebookTUNativeBannerExpressAd));
    }
}
