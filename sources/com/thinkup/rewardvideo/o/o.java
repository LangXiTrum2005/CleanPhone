package com.thinkup.rewardvideo.o;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdMultipleLoadedListener;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUCommonImpressionListener;
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.common.n.mn;
import com.thinkup.core.common.n.o0m;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.ono;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.o0o;
import com.thinkup.rewardvideo.api.TURewardVideoListener;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    public static final String o = "o";
    private static Map<String, o> oo = new ConcurrentHashMap(3);
    private Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42647n;
    private final com.thinkup.core.common.om o0;

    /* JADX INFO: renamed from: com.thinkup.rewardvideo.o.o$2, reason: invalid class name */
    public class AnonymousClass2 implements com.thinkup.core.common.mn.om.o.o.InterfaceC0665o {
        final /* synthetic */ TURewardVideoListener m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Activity f42650n;
        final /* synthetic */ CustomRewardVideoAdapter o;

        public AnonymousClass2(CustomRewardVideoAdapter customRewardVideoAdapter, TURewardVideoListener tURewardVideoListener, Activity activity) {
            this.o = customRewardVideoAdapter;
            this.m = tURewardVideoListener;
            this.f42650n = activity;
        }

        @Override // com.thinkup.core.common.mn.om.o.o.InterfaceC0665o
        public final void o(final Activity activity, ViewGroup viewGroup) {
            CustomRewardVideoAdapter customRewardVideoAdapter = this.o;
            o0n.m();
            oo ooVar = new oo(new om(customRewardVideoAdapter, o0n.m0m(), this.m), this.o.isMixFormatAd(), this.o.getAdRewardCallbackType()) { // from class: com.thinkup.rewardvideo.o.o.2.1
                @Override // com.thinkup.rewardvideo.o.o0, com.thinkup.core.api.TUCommonImpressionListener
                public final void onAdDismiss() {
                    o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.o.2.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (AnonymousClass2.this.f42650n.isFinishing()) {
                                return;
                            }
                            activity.finish();
                        }
                    });
                    super.onAdDismiss();
                }
            };
            ooVar.o(4);
            this.o.internalShow(activity, viewGroup, ooVar);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.rewardvideo.o.o$3, reason: invalid class name */
    public class AnonymousClass3 extends com.thinkup.core.common.mn.oo.o {
        final /* synthetic */ TUCommonImpressionListener o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(com.thinkup.core.common.on.o oVar, TUCommonImpressionListener tUCommonImpressionListener) {
            super(oVar);
            this.o = tUCommonImpressionListener;
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdClicked(View view) {
            super.onAdClicked(view);
            TUCommonImpressionListener tUCommonImpressionListener = this.o;
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdClick();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdImpressed() {
            TUCommonImpressionListener tUCommonImpressionListener = this.o;
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdImpression();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdVideoEnd() {
            TUCommonImpressionListener tUCommonImpressionListener = this.o;
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdVideoPlayEnd();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdVideoStart() {
            TUCommonImpressionListener tUCommonImpressionListener = this.o;
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdVideoPlayStart();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onClose() {
            TUCommonImpressionListener tUCommonImpressionListener = this.o;
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdDismiss();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onDeeplinkCallback(boolean z2) {
            TUCommonImpressionListener tUCommonImpressionListener = this.o;
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onDeeplinkCallback(z2);
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onVideoError(String str, String str2) {
            TUCommonImpressionListener tUCommonImpressionListener = this.o;
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdShowFail(ErrorCode.adShowError, a.o("onVideoError, errorCode: ", str, ", errorMsg: ", str2));
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.rewardvideo.o.o$4, reason: invalid class name */
    public class AnonymousClass4 implements com.thinkup.core.common.mn.oo.o.o.InterfaceC0666o {
        public AnonymousClass4() {
        }

        @Override // com.thinkup.core.common.mn.oo.o.o.InterfaceC0666o
        public final void o(Activity activity) {
        }
    }

    private o(Context context, String str) {
        this.m = context.getApplicationContext();
        this.f42647n = str;
        this.o0 = com.thinkup.core.common.om.o(context, str, "1");
    }

    private static oo m(CustomRewardVideoAdapter customRewardVideoAdapter, TURewardVideoListener tURewardVideoListener) {
        o0n.m();
        oo ooVar = new oo(new om(customRewardVideoAdapter, o0n.m0m(), tURewardVideoListener), customRewardVideoAdapter.isMixFormatAd(), customRewardVideoAdapter.getAdRewardCallbackType());
        if (customRewardVideoAdapter.isMixInterstitial()) {
            ooVar.o(3);
            return ooVar;
        }
        if (customRewardVideoAdapter.isMixNative()) {
            ooVar.o(0);
        }
        return ooVar;
    }

    public static o o(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        o oVar = oo.get(str);
        if (oVar != null) {
            return oVar;
        }
        synchronized (o.class) {
            if (oVar == null) {
                try {
                    oVar = new o(context, str);
                    oo.put(str, oVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oVar;
    }

    public final synchronized void o(final Activity activity, final TUShowConfig tUShowConfig, final TURewardVideoListener tURewardVideoListener, final TUEventInterface tUEventInterface, final Map<String, Object> map, final TUNativeAdCustomRender tUNativeAdCustomRender) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final com.thinkup.core.common.on.o oVarM = this.o0.m((Context) activity, false, true, o(tUShowConfig, map));
        if (oVarM != null && (oVarM.oo() instanceof CustomRewardVideoAdapter)) {
            this.o0.o(oVarM);
            oVarM.o(oVarM.n() + 1);
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.rewardvideo.o.o.1
                @Override // java.lang.Runnable
                public final void run() {
                    final String scenarioId;
                    String showCustomExt;
                    n0 trackingInfo = oVarM.oo().getTrackingInfo();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    TUShowConfig tUShowConfig2 = tUShowConfig;
                    if (tUShowConfig2 != null) {
                        scenarioId = tUShowConfig2.getScenarioId();
                        showCustomExt = tUShowConfig.getShowCustomExt();
                        o0o.o(tUShowConfig.getTUCustomContentResult(), trackingInfo);
                    } else {
                        scenarioId = "";
                        showCustomExt = "";
                    }
                    if (trackingInfo != null) {
                        trackingInfo.omo = o.this.o0.m0();
                        trackingInfo.m0o = scenarioId;
                        trackingInfo.omm(showCustomExt);
                        trackingInfo.nm(nn.o(trackingInfo.oon0(), trackingInfo.mon(), jCurrentTimeMillis));
                        m0m.o(o.this.m, trackingInfo);
                        m0m.o((Map<String, Object>) map, trackingInfo);
                        m0m.o(o.this.f42647n, trackingInfo);
                    }
                    com.thinkup.core.common.o.o().o(o.this.m, oVarM);
                    com.thinkup.core.common.oo0.n.o(o.this.m).o(13, trackingInfo, oVarM.oo().getUnitGroupInfo(), jCurrentTimeMillis);
                    com.thinkup.core.common.ooo.o0.o().o(trackingInfo, oVarM.oo().getUnitGroupInfo(), com.thinkup.core.common.ooo.o0.m);
                    final CustomRewardVideoAdapter customRewardVideoAdapter = (CustomRewardVideoAdapter) oVarM.oo();
                    Activity activity2 = activity;
                    if (activity2 != null) {
                        customRewardVideoAdapter.refreshActivityContext(activity2);
                    }
                    o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.o.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            customRewardVideoAdapter.setScenario(scenarioId);
                            o0m o0mVarN = o0n.m().n();
                            if (o0mVarN != null) {
                                CustomRewardVideoAdapter customRewardVideoAdapter2 = customRewardVideoAdapter;
                                customRewardVideoAdapter2.setAdDownloadListener(o0mVarN.createDataFetchListener(customRewardVideoAdapter2, null, tUEventInterface));
                            }
                            if (customRewardVideoAdapter.isMixSplash()) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                o.o(o.this, activity, customRewardVideoAdapter, tURewardVideoListener);
                            } else if (customRewardVideoAdapter.isMixNative()) {
                                AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                o oVar = o.this;
                                Activity activity3 = activity;
                                com.thinkup.core.common.on.o oVar2 = oVarM;
                                TUShowConfig tUShowConfig3 = tUShowConfig;
                                CustomRewardVideoAdapter customRewardVideoAdapter3 = customRewardVideoAdapter;
                                o.o(oVar, activity3, oVar2, tUShowConfig3, customRewardVideoAdapter3, o.o(customRewardVideoAdapter3, tURewardVideoListener), tUNativeAdCustomRender);
                            } else {
                                CustomRewardVideoAdapter customRewardVideoAdapter4 = customRewardVideoAdapter;
                                AnonymousClass1 anonymousClass3 = AnonymousClass1.this;
                                customRewardVideoAdapter4.internalShow(activity, null, o.o(customRewardVideoAdapter4, tURewardVideoListener));
                            }
                            n0 trackingInfo2 = customRewardVideoAdapter.getTrackingInfo();
                            com.thinkup.core.common.oo0.oo.o("4", trackingInfo2, trackingInfo2.oon0(), trackingInfo2.oomn(), trackingInfo2.mon(), trackingInfo2.n0n(), 4, SystemClock.elapsedRealtime() - jElapsedRealtime);
                        }
                    });
                }
            });
        } else {
            if (this.o0.o((TUAdStatusInfo) null, 7)) {
                o(o0n.m().mm0(), 7, (com.thinkup.core.common.n.o) null, (com.thinkup.core.common.n.n) null, (TUAdMultipleLoadedListener) null, map, (TUAdRequest) null);
            }
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noADError, "", "No Cache.");
            if (tURewardVideoListener != null) {
                tURewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, mn.o((TUBaseAdAdapter) null));
            }
        }
    }

    private ono o(TUShowConfig tUShowConfig, Map<String, Object> map) {
        ono onoVar = new ono();
        onoVar.o(map);
        if (tUShowConfig != null) {
            onoVar.o(tUShowConfig.getTUAdInfo());
        }
        com.thinkup.core.common.om omVar = this.o0;
        if (omVar != null) {
            onoVar.o(omVar.mo());
        }
        return onoVar;
    }

    public final void o(Context context, int i2, com.thinkup.core.common.n.o oVar, com.thinkup.core.common.n.n nVar, TUAdMultipleLoadedListener tUAdMultipleLoadedListener, Map<String, Object> map, TUAdRequest tUAdRequest) {
        mmm mmmVar = new mmm();
        mmmVar.o(context);
        mmmVar.o(tUAdRequest);
        mmmVar.f42198n = i2;
        mmmVar.o0 = nVar;
        mmmVar.om = tUAdMultipleLoadedListener;
        if (map != null) {
            try {
                mmmVar.on = new HashMap(map);
            } catch (Throwable unused) {
            }
        }
        if (tUAdRequest != null) {
            mmmVar.n0 = tUAdRequest.getTUAdxBidFloorInfo();
        }
        this.o0.m(this.m, "1", this.f42647n, mmmVar, oVar);
    }

    public final com.thinkup.core.common.on.o o(Map<String, Object> map) {
        ono onoVarO = o((TUShowConfig) null, map);
        com.thinkup.core.common.om omVar = this.o0;
        if (omVar != null) {
            return omVar.m(this.m, false, false, onoVarO);
        }
        return null;
    }

    public final List<TUAdInfo> o(Context context) {
        com.thinkup.core.common.om omVar = this.o0;
        if (omVar != null) {
            return omVar.o(context);
        }
        return null;
    }

    public final TUAdStatusInfo o(Context context, Map<String, Object> map) {
        com.thinkup.core.common.om omVar = this.o0;
        if (omVar != null) {
            return omVar.o(context, map);
        }
        return null;
    }

    private void o(Activity activity, CustomRewardVideoAdapter customRewardVideoAdapter, TURewardVideoListener tURewardVideoListener) {
        com.thinkup.core.basead.m.o oVar = new com.thinkup.core.basead.m.o();
        o0mm unitGroupInfo = customRewardVideoAdapter.getUnitGroupInfo();
        if (unitGroupInfo == null) {
            return;
        }
        com.thinkup.core.common.mn.n.o.o oVarO = com.thinkup.core.common.inner.mixad.m.m.o(customRewardVideoAdapter, null);
        if (!(oVarO instanceof com.thinkup.core.common.mn.n.o.oo)) {
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, "", "create reward video bridge with unknow error.");
            if (tURewardVideoListener != null) {
                tURewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, mn.o((TUBaseAdAdapter) null));
                return;
            }
            return;
        }
        oVar.o0 = com.thinkup.core.common.om.o(this.f42647n, unitGroupInfo.m0o(), String.valueOf(unitGroupInfo.nm()));
        ((com.thinkup.core.common.mn.n.o.oo) oVarO).o(activity, oVar, new AnonymousClass2(customRewardVideoAdapter, tURewardVideoListener, activity));
    }

    private void o(Activity activity, com.thinkup.core.common.on.o oVar, TUShowConfig tUShowConfig, CustomRewardVideoAdapter customRewardVideoAdapter, TUCommonImpressionListener tUCommonImpressionListener, TUNativeAdCustomRender tUNativeAdCustomRender) {
        String strO;
        BaseAd baseAdOm = oVar.om();
        if (baseAdOm == null) {
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdShowFail(ErrorCode.adShowError, "showThirdPartyNativeReward fail, no ad cache.");
                return;
            }
            return;
        }
        n0 n0VarMo = oVar.mo();
        com.thinkup.core.common.mn.n.o.o oVarO = com.thinkup.core.common.inner.mixad.m.m.o(customRewardVideoAdapter, new com.thinkup.core.common.mn.o0.o.C0664o().o(activity).o(baseAdOm).o(n0VarMo).o(tUNativeAdCustomRender).o(new AnonymousClass3(oVar, tUCommonImpressionListener)).o());
        if (!(oVarO instanceof com.thinkup.core.common.mn.n.o.oo)) {
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdShowFail(ErrorCode.adShowError, "create reward video bridge failed. adapterFormatBridge: ".concat(String.valueOf(oVarO)));
                return;
            }
            return;
        }
        com.thinkup.core.basead.m.o oVar2 = new com.thinkup.core.basead.m.o();
        String scenarioId = "";
        if (n0VarMo == null || this.o0 == null) {
            strO = "";
        } else {
            strO = com.thinkup.core.common.om.o(n0VarMo.oomn(), n0VarMo.mon(), String.valueOf(n0VarMo.n0n()));
        }
        if (TextUtils.isEmpty(strO)) {
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdShowFail(ErrorCode.adShowError, "create reward video bridge with error: eventId is empty.");
                return;
            }
            return;
        }
        oVar2.o0 = strO;
        oVar2.oo = com.thinkup.core.common.ooo.n0.om(activity);
        if (tUShowConfig != null) {
            scenarioId = tUShowConfig.getScenarioId();
        }
        oVar2.m = scenarioId;
        oVar2.o = Integer.parseInt("1");
        ((com.thinkup.core.common.mn.n.o.oo) oVarO).o(activity, oVar2, new AnonymousClass4());
    }

    public static /* synthetic */ void o(o oVar, Activity activity, CustomRewardVideoAdapter customRewardVideoAdapter, TURewardVideoListener tURewardVideoListener) {
        com.thinkup.core.basead.m.o oVar2 = new com.thinkup.core.basead.m.o();
        o0mm unitGroupInfo = customRewardVideoAdapter.getUnitGroupInfo();
        if (unitGroupInfo != null) {
            com.thinkup.core.common.mn.n.o.o oVarO = com.thinkup.core.common.inner.mixad.m.m.o(customRewardVideoAdapter, null);
            if (!(oVarO instanceof com.thinkup.core.common.mn.n.o.oo)) {
                AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, "", "create reward video bridge with unknow error.");
                if (tURewardVideoListener != null) {
                    tURewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, mn.o((TUBaseAdAdapter) null));
                    return;
                }
                return;
            }
            oVar2.o0 = com.thinkup.core.common.om.o(oVar.f42647n, unitGroupInfo.m0o(), String.valueOf(unitGroupInfo.nm()));
            ((com.thinkup.core.common.mn.n.o.oo) oVarO).o(activity, oVar2, oVar.new AnonymousClass2(customRewardVideoAdapter, tURewardVideoListener, activity));
        }
    }

    public static /* synthetic */ oo o(CustomRewardVideoAdapter customRewardVideoAdapter, TURewardVideoListener tURewardVideoListener) {
        o0n.m();
        oo ooVar = new oo(new om(customRewardVideoAdapter, o0n.m0m(), tURewardVideoListener), customRewardVideoAdapter.isMixFormatAd(), customRewardVideoAdapter.getAdRewardCallbackType());
        if (customRewardVideoAdapter.isMixInterstitial()) {
            ooVar.o(3);
            return ooVar;
        }
        if (customRewardVideoAdapter.isMixNative()) {
            ooVar.o(0);
        }
        return ooVar;
    }

    public static /* synthetic */ void o(o oVar, Activity activity, com.thinkup.core.common.on.o oVar2, TUShowConfig tUShowConfig, CustomRewardVideoAdapter customRewardVideoAdapter, TUCommonImpressionListener tUCommonImpressionListener, TUNativeAdCustomRender tUNativeAdCustomRender) {
        String strO;
        BaseAd baseAdOm = oVar2.om();
        if (baseAdOm == null) {
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdShowFail(ErrorCode.adShowError, "showThirdPartyNativeReward fail, no ad cache.");
                return;
            }
            return;
        }
        n0 n0VarMo = oVar2.mo();
        com.thinkup.core.common.mn.n.o.o oVarO = com.thinkup.core.common.inner.mixad.m.m.o(customRewardVideoAdapter, new com.thinkup.core.common.mn.o0.o.C0664o().o(activity).o(baseAdOm).o(n0VarMo).o(tUNativeAdCustomRender).o(oVar.new AnonymousClass3(oVar2, tUCommonImpressionListener)).o());
        if (!(oVarO instanceof com.thinkup.core.common.mn.n.o.oo)) {
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdShowFail(ErrorCode.adShowError, "create reward video bridge failed. adapterFormatBridge: ".concat(String.valueOf(oVarO)));
                return;
            }
            return;
        }
        com.thinkup.core.basead.m.o oVar3 = new com.thinkup.core.basead.m.o();
        String scenarioId = "";
        if (n0VarMo == null || oVar.o0 == null) {
            strO = "";
        } else {
            strO = com.thinkup.core.common.om.o(n0VarMo.oomn(), n0VarMo.mon(), String.valueOf(n0VarMo.n0n()));
        }
        if (TextUtils.isEmpty(strO)) {
            if (tUCommonImpressionListener != null) {
                tUCommonImpressionListener.onAdShowFail(ErrorCode.adShowError, "create reward video bridge with error: eventId is empty.");
                return;
            }
            return;
        }
        oVar3.o0 = strO;
        oVar3.oo = com.thinkup.core.common.ooo.n0.om(activity);
        if (tUShowConfig != null) {
            scenarioId = tUShowConfig.getScenarioId();
        }
        oVar3.m = scenarioId;
        oVar3.o = Integer.parseInt("1");
        ((com.thinkup.core.common.mn.n.o.oo) oVarO).o(activity, oVar3, oVar.new AnonymousClass4());
    }
}
