package com.thinkup.network.inmobi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUInitMediation;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class InmobiTUBannerAdapter extends CustomBannerAdapter {
    private static final String m = "InmobiTUBannerAdapter";
    private boolean m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Long f42583n;
    String o;
    private View o0;
    private InMobiBanner om;
    private FrameLayout on;
    private int oo;

    /* JADX INFO: renamed from: com.thinkup.network.inmobi.InmobiTUBannerAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements MediationInitCallback {
        final /* synthetic */ Map m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Map f42584n;
        final /* synthetic */ Context o;

        public AnonymousClass1(Context context, Map map, Map map2) {
            this.o = context;
            this.m = map;
            this.f42584n = map2;
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            InmobiTUBannerAdapter.this.notifyATLoadFail("", str);
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            try {
                InmobiTUBannerAdapter.o(InmobiTUBannerAdapter.this, this.o, this.m, this.f42584n);
            } catch (Throwable th) {
                InmobiTUBannerAdapter.this.notifyATLoadFail("", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.inmobi.InmobiTUBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends BannerAdEventListener {
        public AnonymousClass2() {
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final /* bridge */ /* synthetic */ void onAdClicked(InMobiBanner inMobiBanner, Map map) {
            onAdClicked2(inMobiBanner, (Map<Object, Object>) map);
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public final void onAdDismissed(InMobiBanner inMobiBanner) {
        }

        /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
        public final void onAdClicked2(InMobiBanner inMobiBanner, Map<Object, Object> map) {
            CustomBannerEventListener customBannerEventListener = InmobiTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClicked();
            }
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final void onAdImpression(InMobiBanner inMobiBanner) {
            super.onAdImpression(inMobiBanner);
            CustomBannerEventListener customBannerEventListener = InmobiTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InmobiTUInitManager.getInstance().removeInmobiAd(inMobiBanner);
            if (inMobiAdRequestStatus != null) {
                InmobiTUBannerAdapter.this.notifyATLoadFail(inMobiAdRequestStatus.getStatusCode().name(), inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
            } else {
                InmobiTUBannerAdapter.this.notifyATLoadFail("", "Inmobi banner load failed.");
            }
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
            InmobiTUBannerAdapter.this.o0 = inMobiBanner;
            InmobiTUInitManager.getInstance().onAdFetchSuccessful(InmobiTUBannerAdapter.this.m0, adMetaInfo, ((TUBaseAdInternalAdapter) InmobiTUBannerAdapter.this).mLoadListener, InmobiTUBannerAdapter.this.mBiddingListener);
            InmobiTUInitManager.getInstance().removeInmobiAd(inMobiBanner);
        }
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.on = null;
        this.o0 = null;
        InMobiBanner inMobiBanner = this.om;
        if (inMobiBanner != null) {
            inMobiBanner.destroy();
            this.om = null;
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.on;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) throws Throwable {
        try {
            this.f42583n = Long.valueOf(Long.parseLong(TUInitMediation.getStringFromMap(map, "unit_id")));
        } catch (NumberFormatException unused) {
        }
        InmobiTUInitManager.getInstance().getBidRequestInfo(context, map, true, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return InmobiTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        try {
            return String.valueOf(this.f42583n);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return InmobiTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) throws Throwable {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        String stringFromMap2 = TUInitMediation.getStringFromMap(map, "unit_id");
        if (map.containsKey("payload")) {
            this.o = map.get("payload").toString();
        }
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(stringFromMap2)) {
            notifyATLoadFail("", "inmobi account_id or unit_id is empty!");
            return;
        }
        try {
            this.f42583n = Long.valueOf(Long.parseLong(stringFromMap2));
        } catch (NumberFormatException unused) {
        }
        this.oo = 0;
        try {
            if (map.containsKey("nw_rft")) {
                this.oo = (int) (TUInitMediation.getIntFromMap(map, "nw_rft") / 1000.0f);
            }
        } catch (Throwable unused2) {
        }
        Context applicationContext = context.getApplicationContext();
        InmobiTUInitManager.getInstance().initSDK(applicationContext, map, new AnonymousClass1(applicationContext, map2, map));
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return InmobiTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) throws Throwable {
        this.m0 = true;
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    private void m(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i2;
        double d;
        double d2;
        this.on = new FrameLayout(context);
        String stringFromMap = TUInitMediation.getStringFromMap(map2, "size");
        int iDip2px = dip2px(context, 320.0f);
        int iDip2px2 = dip2px(context, 50.0f);
        if (map != null) {
            Object obj = map.containsKey("key_width") ? map.get("key_width") : null;
            if (obj != null) {
                try {
                    i2 = (int) Double.parseDouble(obj.toString());
                } catch (Throwable unused) {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                int iHashCode = stringFromMap.hashCode();
                if (iHashCode == -559799608) {
                    if (stringFromMap.equals("300x250")) {
                        iDip2px = Math.max(i2, dip2px(context, 300.0f));
                        d = ((double) iDip2px) / 300.0d;
                        d2 = 250.0d;
                    }
                    iDip2px2 = (int) (d * d2);
                } else if (iHashCode == 1507809730) {
                    stringFromMap.equals("320x50");
                }
                iDip2px = Math.max(i2, dip2px(context, 320.0f));
                d = ((double) iDip2px) / 320.0d;
                d2 = 50.0d;
                iDip2px2 = (int) (d * d2);
            } else {
                int iHashCode2 = stringFromMap.hashCode();
                if (iHashCode2 != -559799608) {
                    if (iHashCode2 == 1507809730) {
                        stringFromMap.equals("320x50");
                    }
                } else if (stringFromMap.equals("300x250")) {
                    iDip2px = dip2px(context, 300.0f);
                    iDip2px2 = dip2px(context, 250.0f);
                }
            }
        }
        this.on.setLayoutParams(new FrameLayout.LayoutParams(iDip2px, iDip2px2));
        InMobiBanner inMobiBanner = new InMobiBanner(context, this.f42583n.longValue());
        this.om = inMobiBanner;
        inMobiBanner.setAnimationType(InMobiBanner.AnimationType.ANIMATION_OFF);
        this.om.setExtras(InmobiTUInitManager.getInstance().getTopOnInfoExtraMap());
        if (this.oo > 0) {
            this.om.setEnableAutoRefresh(true);
            this.om.setRefreshInterval(this.oo);
        } else {
            this.om.setEnableAutoRefresh(false);
            this.om.setRefreshInterval(0);
        }
        this.om.setLayoutParams(new FrameLayout.LayoutParams(iDip2px, iDip2px2));
        this.om.setListener(new AnonymousClass2());
        this.on.addView(this.om);
        InmobiTUInitManager.getInstance().addInmobiAd(this.om);
        if (TextUtils.isEmpty(this.o)) {
            this.om.load();
        } else {
            this.om.load(this.o.getBytes());
        }
    }

    private void o(Context context, Map<String, Object> map, Map<String, Object> map2) throws Throwable {
        Context applicationContext = context.getApplicationContext();
        InmobiTUInitManager.getInstance().initSDK(applicationContext, map, new AnonymousClass1(applicationContext, map2, map));
    }

    private BannerAdEventListener o() {
        return new AnonymousClass2();
    }

    public static /* synthetic */ void o(InmobiTUBannerAdapter inmobiTUBannerAdapter, Context context, Map map, Map map2) {
        int i2;
        double d;
        double d2;
        inmobiTUBannerAdapter.on = new FrameLayout(context);
        String stringFromMap = TUInitMediation.getStringFromMap(map2, "size");
        int iDip2px = dip2px(context, 320.0f);
        int iDip2px2 = dip2px(context, 50.0f);
        if (map != null) {
            Object obj = map.containsKey("key_width") ? map.get("key_width") : null;
            if (obj != null) {
                try {
                    i2 = (int) Double.parseDouble(obj.toString());
                } catch (Throwable unused) {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                int iHashCode = stringFromMap.hashCode();
                if (iHashCode == -559799608) {
                    if (stringFromMap.equals("300x250")) {
                        iDip2px = Math.max(i2, dip2px(context, 300.0f));
                        d = ((double) iDip2px) / 300.0d;
                        d2 = 250.0d;
                    }
                    iDip2px2 = (int) (d * d2);
                } else if (iHashCode == 1507809730) {
                    stringFromMap.equals("320x50");
                }
                iDip2px = Math.max(i2, dip2px(context, 320.0f));
                d = ((double) iDip2px) / 320.0d;
                d2 = 50.0d;
                iDip2px2 = (int) (d * d2);
            } else {
                int iHashCode2 = stringFromMap.hashCode();
                if (iHashCode2 != -559799608) {
                    if (iHashCode2 == 1507809730) {
                        stringFromMap.equals("320x50");
                    }
                } else if (stringFromMap.equals("300x250")) {
                    iDip2px = dip2px(context, 300.0f);
                    iDip2px2 = dip2px(context, 250.0f);
                }
            }
        }
        inmobiTUBannerAdapter.on.setLayoutParams(new FrameLayout.LayoutParams(iDip2px, iDip2px2));
        InMobiBanner inMobiBanner = new InMobiBanner(context, inmobiTUBannerAdapter.f42583n.longValue());
        inmobiTUBannerAdapter.om = inMobiBanner;
        inMobiBanner.setAnimationType(InMobiBanner.AnimationType.ANIMATION_OFF);
        inmobiTUBannerAdapter.om.setExtras(InmobiTUInitManager.getInstance().getTopOnInfoExtraMap());
        if (inmobiTUBannerAdapter.oo > 0) {
            inmobiTUBannerAdapter.om.setEnableAutoRefresh(true);
            inmobiTUBannerAdapter.om.setRefreshInterval(inmobiTUBannerAdapter.oo);
        } else {
            inmobiTUBannerAdapter.om.setEnableAutoRefresh(false);
            inmobiTUBannerAdapter.om.setRefreshInterval(0);
        }
        inmobiTUBannerAdapter.om.setLayoutParams(new FrameLayout.LayoutParams(iDip2px, iDip2px2));
        inmobiTUBannerAdapter.om.setListener(inmobiTUBannerAdapter.new AnonymousClass2());
        inmobiTUBannerAdapter.on.addView(inmobiTUBannerAdapter.om);
        InmobiTUInitManager.getInstance().addInmobiAd(inmobiTUBannerAdapter.om);
        if (TextUtils.isEmpty(inmobiTUBannerAdapter.o)) {
            inmobiTUBannerAdapter.om.load();
        } else {
            inmobiTUBannerAdapter.om.load(inmobiTUBannerAdapter.o.getBytes());
        }
    }
}
