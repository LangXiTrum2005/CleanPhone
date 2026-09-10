package com.thinkup.network.inmobi;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class InmobiTUInterstitialAdapter extends CustomInterstitialAdapter {
    private static final String m = "InmobiTUInterstitialAdapter";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InmobiTUInitManager f42588n = InmobiTUInitManager.getInstance();
    String o;
    private InMobiInterstitial o0;
    private boolean om;
    private Long oo;

    /* JADX INFO: renamed from: com.thinkup.network.inmobi.InmobiTUInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements MediationInitCallback {
        final /* synthetic */ Context o;

        public AnonymousClass1(Context context) {
            this.o = context;
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            InmobiTUInterstitialAdapter.this.notifyATLoadFail("", str);
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            try {
                InmobiTUInterstitialAdapter.o(InmobiTUInterstitialAdapter.this, this.o);
            } catch (Throwable th) {
                InmobiTUInterstitialAdapter.this.notifyATLoadFail("", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.inmobi.InmobiTUInterstitialAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends InterstitialAdEventListener {
        public AnonymousClass2() {
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final /* bridge */ /* synthetic */ void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
            onAdClicked2(inMobiInterstitial, (Map<Object, Object>) map);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public final void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
            InmobiTUInterstitialAdapter.this.f42588n.removeInmobiAd(InmobiTUInterstitialAdapter.this.o0);
            if (((CustomInterstitialAdapter) InmobiTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) InmobiTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
            }
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public final void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
            InmobiTUInterstitialAdapter.on(InmobiTUInterstitialAdapter.this);
            InmobiTUInterstitialAdapter.this.f42588n.removeInmobiAd(InmobiTUInterstitialAdapter.this.o0);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public final void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
        }

        /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
        public final void onAdClicked2(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            if (((CustomInterstitialAdapter) InmobiTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) InmobiTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
            }
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            if (((TUBaseAdInternalAdapter) InmobiTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) InmobiTUInterstitialAdapter.this).mLoadListener.onAdDataLoaded();
            }
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final void onAdImpression(InMobiInterstitial inMobiInterstitial) {
            super.onAdImpression(inMobiInterstitial);
            if (((CustomInterstitialAdapter) InmobiTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) InmobiTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
            }
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InmobiTUInterstitialAdapter.this.f42588n.removeInmobiAd(InmobiTUInterstitialAdapter.this.o0);
            InmobiTUInterstitialAdapter inmobiTUInterstitialAdapter = InmobiTUInterstitialAdapter.this;
            StringBuilder sb = new StringBuilder();
            sb.append(inMobiAdRequestStatus.getStatusCode());
            inmobiTUInterstitialAdapter.notifyATLoadFail(sb.toString(), inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InmobiTUInterstitialAdapter.this.f42588n.onAdFetchSuccessful(InmobiTUInterstitialAdapter.this.om, adMetaInfo, ((TUBaseAdInternalAdapter) InmobiTUInterstitialAdapter.this).mLoadListener, InmobiTUInterstitialAdapter.this.mBiddingListener);
        }
    }

    public static /* synthetic */ int on(InmobiTUInterstitialAdapter inmobiTUInterstitialAdapter) {
        inmobiTUInterstitialAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.o0 = null;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) throws Throwable {
        try {
            this.oo = Long.valueOf(Long.parseLong(TUInitMediation.getStringFromMap(map, "unit_id")));
        } catch (NumberFormatException unused) {
        }
        InmobiTUInitManager.getInstance().getBidRequestInfo(context, map, false, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return this.f42588n.getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        try {
            return String.valueOf(this.oo);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return this.f42588n.getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        InMobiInterstitial inMobiInterstitial = this.o0;
        if (inMobiInterstitial != null) {
            return inMobiInterstitial.isReady();
        }
        return false;
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
        } else {
            try {
                this.oo = Long.valueOf(Long.parseLong(stringFromMap2));
            } catch (NumberFormatException unused) {
            }
            this.f42588n.initSDK(context.getApplicationContext(), map, new AnonymousClass1(context));
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return this.f42588n.setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (this.o0 == null || !isAdReady()) {
            return;
        }
        this.o0.show();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) throws Throwable {
        this.om = true;
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    private void o(Context context, Map<String, Object> map) throws Throwable {
        this.f42588n.initSDK(context.getApplicationContext(), map, new AnonymousClass1(context));
    }

    private void o(Context context) {
        this.o0 = new InMobiInterstitial(context.getApplicationContext(), this.oo.longValue(), new AnonymousClass2());
        InmobiTUInitManager.getInstance().addInmobiAd(this.o0);
        this.o0.setExtras(this.f42588n.getTopOnInfoExtraMap());
        if (TextUtils.isEmpty(this.o)) {
            this.o0.load();
        } else {
            this.o0.load(this.o.getBytes());
        }
    }

    private InterstitialAdEventListener o() {
        return new AnonymousClass2();
    }

    public static /* synthetic */ void o(InmobiTUInterstitialAdapter inmobiTUInterstitialAdapter, Context context) {
        inmobiTUInterstitialAdapter.o0 = new InMobiInterstitial(context.getApplicationContext(), inmobiTUInterstitialAdapter.oo.longValue(), inmobiTUInterstitialAdapter.new AnonymousClass2());
        InmobiTUInitManager.getInstance().addInmobiAd(inmobiTUInterstitialAdapter.o0);
        inmobiTUInterstitialAdapter.o0.setExtras(inmobiTUInterstitialAdapter.f42588n.getTopOnInfoExtraMap());
        if (TextUtils.isEmpty(inmobiTUInterstitialAdapter.o)) {
            inmobiTUInterstitialAdapter.o0.load();
        } else {
            inmobiTUInterstitialAdapter.o0.load(inmobiTUInterstitialAdapter.o.getBytes());
        }
    }
}
