package com.thinkup.network.inmobi;

import android.content.Context;
import android.text.TextUtils;
import com.inmobi.ads.AdMetaInfo;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class InmobiTUAdapter extends CustomNativeAdapter {
    private InmobiTUNativeAd m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42581n;
    String o;
    private boolean o0;

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) throws Throwable {
        this.f42581n = TUInitMediation.getStringFromMap(map, "unit_id");
        InmobiTUInitManager.getInstance().getBidRequestInfo(context, map, false, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return InmobiTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f42581n;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return InmobiTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, Map<String, Object> map, final Map<String, Object> map2) throws Throwable {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.f42581n = TUInitMediation.getStringFromMap(map, "unit_id");
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(this.f42581n)) {
            notifyATLoadFail("", "inmobi accountId or unitid is empty");
            return;
        }
        if (map.containsKey("payload")) {
            this.o = map.get("payload").toString();
        }
        final boolean booleanFromMap = TUInitMediation.getBooleanFromMap(map, CustomNativeAd.IS_AUTO_PLAY_KEY, false);
        final InmobiTUNativeAd.o oVar = new InmobiTUNativeAd.o() { // from class: com.thinkup.network.inmobi.InmobiTUAdapter.1
            @Override // com.thinkup.network.inmobi.InmobiTUNativeAd.o
            public final void onFail(String str, String str2) {
                InmobiTUInitManager.getInstance().removeInmobiAd(InmobiTUAdapter.this.m);
                InmobiTUAdapter.this.notifyATLoadFail(str, str2);
            }

            @Override // com.thinkup.network.inmobi.InmobiTUNativeAd.o
            public final void onSuccess(CustomNativeAd customNativeAd, AdMetaInfo adMetaInfo) {
                InmobiTUInitManager.getInstance().onAdFetchSuccessful(InmobiTUAdapter.this.o0, adMetaInfo, ((TUBaseAdInternalAdapter) InmobiTUAdapter.this).mLoadListener, InmobiTUAdapter.this.mBiddingListener, customNativeAd);
                InmobiTUInitManager.getInstance().removeInmobiAd(InmobiTUAdapter.this.m);
            }
        };
        InmobiTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.inmobi.InmobiTUAdapter.2
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                InmobiTUAdapter.this.notifyATLoadFail("", str);
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                try {
                    InmobiTUAdapter inmobiTUAdapter = InmobiTUAdapter.this;
                    inmobiTUAdapter.m = new InmobiTUNativeAd(context, oVar, inmobiTUAdapter.f42581n, map2);
                    InmobiTUInitManager.getInstance().addInmobiAd(InmobiTUAdapter.this.m);
                    InmobiTUAdapter.this.m.setIsAutoPlay(booleanFromMap);
                    InmobiTUAdapter.this.m.loadAd(InmobiTUAdapter.this.o);
                } catch (Throwable th) {
                    InmobiTUAdapter.this.notifyATLoadFail("", th.getMessage());
                }
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return InmobiTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) throws Throwable {
        this.o0 = true;
        loadCustomNetworkAd(context, map, map2);
        return true;
    }
}
