package com.thinkup.network.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GTMTUBannerAdapter extends CustomBannerAdapter {
    String m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42560n = "";
    MBBannerView o;
    String o0;
    int om;
    String oo;

    /* JADX INFO: renamed from: com.thinkup.network.gtm.GTMTUBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements BannerAdListener {
        public AnonymousClass2() {
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public final void closeFullScreen(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public final void onClick(MBridgeIds mBridgeIds) {
            CustomBannerEventListener customBannerEventListener = GTMTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClicked();
            }
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public final void onCloseBanner(MBridgeIds mBridgeIds) {
            CustomBannerEventListener customBannerEventListener = GTMTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClose();
            }
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public final void onLeaveApp(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public final void onLoadFailed(MBridgeIds mBridgeIds, String str) {
            if (((TUBaseAdInternalAdapter) GTMTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUBannerAdapter.this).mLoadListener.onAdLoadError("", str);
            }
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
            if (((TUBaseAdInternalAdapter) GTMTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public final void onLogImpression(MBridgeIds mBridgeIds) {
            try {
                GTMTUInitManager.getInstance().o(GTMTUBannerAdapter.this.getTrackingInfo().omm(), new WeakReference(GTMTUBannerAdapter.this.o));
            } catch (Throwable unused) {
            }
            CustomBannerEventListener customBannerEventListener = GTMTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public final void showFullScreen(MBridgeIds mBridgeIds) {
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        MBBannerView mBBannerView = this.o;
        if (mBBannerView != null) {
            mBBannerView.setBannerAdListener(null);
            this.o.release();
            this.o = null;
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.o;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.m = GTMTUInitManager.getStringByMap(map, "unitid");
        GTMTUInitManager.getInstance().o(context, map, map2, 2, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(0, GTMTUAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return GTMTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return GTMTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.m;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return GTMTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringByMap = GTMTUInitManager.getStringByMap(map, "appid");
        String stringByMap2 = GTMTUInitManager.getStringByMap(map, "appkey");
        this.m = GTMTUInitManager.getStringByMap(map, "unitid");
        this.o0 = GTMTUInitManager.getStringByMap(map, "size");
        this.oo = GTMTUInitManager.getStringByMap(map, "payload");
        this.f42560n = GTMTUInitManager.getStringByMap(map, "placement_id");
        if (TextUtils.isEmpty(stringByMap) || TextUtils.isEmpty(stringByMap2) || TextUtils.isEmpty(this.m)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "appid、appkey or unitid is empty.");
                return;
            }
            return;
        }
        this.om = 0;
        try {
            if (map.containsKey("nw_rft")) {
                this.om = (int) (Integer.valueOf((String) map.get("nw_rft")).intValue() / 1000.0f);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        final Context applicationContext = context.getApplicationContext();
        GTMTUInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.thinkup.network.gtm.GTMTUBannerAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                if (((TUBaseAdInternalAdapter) GTMTUBannerAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) GTMTUBannerAdapter.this).mLoadListener.onAdLoadError("", str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                GTMTUBannerAdapter.o(GTMTUBannerAdapter.this, applicationContext, map, map2);
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return GTMTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    private static int m(Context context, float f) {
        return (int) (f / context.getResources().getDisplayMetrics().density);
    }

    private void o(Context context, Map<String, Object> map, Map<String, Object> map2) {
        byte b2;
        BannerSize bannerSize;
        int iO;
        this.o = new MBBannerView(context);
        new BannerSize(4, 0, 0);
        int i2 = -1;
        switch (this.o0) {
            case "300x250":
                b2 = 1;
                break;
            case "smart":
                b2 = 2;
                break;
            case "320x50":
                b2 = 3;
                break;
            case "320x90":
                b2 = 0;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            bannerSize = new BannerSize(1, 0, 0);
            iO = o(context, 90.0f);
        } else if (b2 == 1) {
            bannerSize = new BannerSize(2, 0, 0);
            iO = o(context, 250.0f);
        } else if (b2 != 2) {
            bannerSize = new BannerSize(4, 0, 0);
            iO = o(context, 50.0f);
        } else {
            bannerSize = new BannerSize(3, 0, 0);
            iO = -1;
        }
        if (map2 != null) {
            int intFromMap = TUInitMediation.getIntFromMap(map2, "key_width", -1);
            int intFromMap2 = TUInitMediation.getIntFromMap(map2, "key_height", -1);
            if (intFromMap > 0 && intFromMap2 > 0) {
                bannerSize = new BannerSize(5, m(context, intFromMap), m(context, intFromMap2));
                iO = intFromMap2;
                i2 = intFromMap;
            }
        }
        this.o.init(bannerSize, this.f42560n, this.m);
        this.o.setLayoutParams(new ViewGroup.LayoutParams(i2, iO));
        this.o.setBannerAdListener(new AnonymousClass2());
        int i3 = this.om;
        if (i3 > 0) {
            this.o.setRefreshTime(i3);
        } else {
            this.o.setRefreshTime(0);
        }
        if (TextUtils.isEmpty(this.oo)) {
            GTMTUInitManager.getInstance().setCustomInfo(8, map);
            this.o.load();
        } else {
            GTMTUInitManager.getInstance().setCustomInfo(7, map);
            this.o.loadFromBid(this.oo);
        }
    }

    private static int o(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ void o(GTMTUBannerAdapter gTMTUBannerAdapter, Context context, Map map, Map map2) {
        byte b2;
        BannerSize bannerSize;
        int iO;
        gTMTUBannerAdapter.o = new MBBannerView(context);
        new BannerSize(4, 0, 0);
        int i2 = -1;
        switch (gTMTUBannerAdapter.o0) {
            case "300x250":
                b2 = 1;
                break;
            case "smart":
                b2 = 2;
                break;
            case "320x50":
                b2 = 3;
                break;
            case "320x90":
                b2 = 0;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            bannerSize = new BannerSize(1, 0, 0);
            iO = o(context, 90.0f);
        } else if (b2 == 1) {
            bannerSize = new BannerSize(2, 0, 0);
            iO = o(context, 250.0f);
        } else if (b2 != 2) {
            bannerSize = new BannerSize(4, 0, 0);
            iO = o(context, 50.0f);
        } else {
            bannerSize = new BannerSize(3, 0, 0);
            iO = -1;
        }
        if (map2 != null) {
            int intFromMap = TUInitMediation.getIntFromMap(map2, "key_width", -1);
            int intFromMap2 = TUInitMediation.getIntFromMap(map2, "key_height", -1);
            if (intFromMap > 0 && intFromMap2 > 0) {
                bannerSize = new BannerSize(5, m(context, intFromMap), m(context, intFromMap2));
                iO = intFromMap2;
                i2 = intFromMap;
            }
        }
        gTMTUBannerAdapter.o.init(bannerSize, gTMTUBannerAdapter.f42560n, gTMTUBannerAdapter.m);
        gTMTUBannerAdapter.o.setLayoutParams(new ViewGroup.LayoutParams(i2, iO));
        gTMTUBannerAdapter.o.setBannerAdListener(gTMTUBannerAdapter.new AnonymousClass2());
        int i3 = gTMTUBannerAdapter.om;
        if (i3 > 0) {
            gTMTUBannerAdapter.o.setRefreshTime(i3);
        } else {
            gTMTUBannerAdapter.o.setRefreshTime(0);
        }
        if (!TextUtils.isEmpty(gTMTUBannerAdapter.oo)) {
            GTMTUInitManager.getInstance().setCustomInfo(7, map);
            gTMTUBannerAdapter.o.loadFromBid(gTMTUBannerAdapter.oo);
        } else {
            GTMTUInitManager.getInstance().setCustomInfo(8, map);
            gTMTUBannerAdapter.o.load();
        }
    }
}
