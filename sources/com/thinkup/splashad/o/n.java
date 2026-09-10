package com.thinkup.splashad.o;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.ITUBaseAdAdapter;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdMultipleLoadedListener;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0m;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.ono;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.o0o;
import com.thinkup.splashad.api.TUSplashSkipAdListener;
import com.thinkup.splashad.api.TUSplashSkipInfo;
import com.thinkup.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    private static Map<String, n> o0 = new ConcurrentHashMap(3);
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.thinkup.core.common.om f42653n;
    private Context o;

    /* JADX INFO: renamed from: com.thinkup.splashad.o.n$2, reason: invalid class name */
    public class AnonymousClass2 extends com.thinkup.core.common.mn.oo.o {
        final /* synthetic */ boolean[] m;
        final /* synthetic */ om o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.thinkup.core.common.on.o oVar, om omVar, boolean[] zArr) {
            super(oVar);
            this.o = omVar;
            this.m = zArr;
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdClicked(View view) {
            super.onAdClicked(view);
            om omVar = this.o;
            if (omVar != null) {
                omVar.onSplashAdClicked();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdImpressed() {
            boolean[] zArr = this.m;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            om omVar = this.o;
            if (omVar != null) {
                omVar.onSplashAdShow();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdVideoEnd() {
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdVideoStart() {
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onClose() {
            om omVar = this.o;
            if (omVar != null) {
                omVar.onSplashAdDismiss();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onDeeplinkCallback(boolean z2) {
            om omVar = this.o;
            if (omVar != null) {
                omVar.onDeeplinkCallback(z2);
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onDownloadConfirmCallback(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
            om omVar = this.o;
            if (omVar != null) {
                omVar.onDownloadConfirm(context, tUNetworkConfirmInfo);
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onVideoError(String str, String str2) {
            om omVar = this.o;
            if (omVar != null) {
                omVar.o(99);
                this.o.onSplashAdShowFail(ErrorCode.getErrorCode("", str, str2));
                this.o.onSplashAdDismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.splashad.o.n$3, reason: invalid class name */
    public class AnonymousClass3 implements com.thinkup.core.common.mn.m.o.m {
        final /* synthetic */ oo o;

        public AnonymousClass3(oo ooVar) {
            this.o = ooVar;
        }

        @Override // com.thinkup.core.common.mn.m.o.m
        public final void o(int i2) {
            this.o.o(i2);
            this.o.onAdDismiss();
        }
    }

    /* JADX INFO: renamed from: com.thinkup.splashad.o.n$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        final /* synthetic */ oo o;

        public AnonymousClass4(oo ooVar) {
            this.o = ooVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.o.onAdImpression();
        }
    }

    private n(Context context, String str) {
        this.o = context.getApplicationContext();
        this.m = str;
        com.thinkup.core.common.om omVarO = com.thinkup.core.common.om.o(context, str, "4");
        this.f42653n = omVarO;
        omVarO.o(new o0());
    }

    public static n o(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        n nVar = o0.get(str);
        if (nVar != null) {
            return nVar;
        }
        synchronized (n.class) {
            if (nVar == null) {
                try {
                    nVar = new n(context, str);
                    o0.put(str, nVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nVar;
    }

    public final void o(Context context, m mVar, TUAdMultipleLoadedListener tUAdMultipleLoadedListener, int i2, boolean z2, int i3, com.thinkup.core.common.n.n nVar, Map<String, Object> map, TUAdRequest tUAdRequest, long j, long j2) {
        mmm mmmVar = new mmm();
        mmmVar.o(context);
        mmmVar.o(tUAdRequest);
        mmmVar.nm = j;
        mmmVar.nn = j2;
        mmmVar.m0 = i2;
        mmmVar.mm = z2;
        mmmVar.f42198n = i3;
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
        com.thinkup.core.common.om omVar = this.f42653n;
        if (omVar != null) {
            omVar.m(this.o, "4", this.m, mmmVar, mVar);
        }
    }

    public final void o() {
        com.thinkup.core.common.om omVar = this.f42653n;
        if (omVar != null) {
            omVar.mm();
        }
    }

    public final com.thinkup.core.common.on.o o(Map<String, Object> map) {
        ono onoVarO = o((TUShowConfig) null, map);
        com.thinkup.core.common.om omVar = this.f42653n;
        if (omVar != null) {
            return omVar.m(this.o, false, false, onoVarO);
        }
        return null;
    }

    public final synchronized void o(final Activity activity, final ViewGroup viewGroup, final o oVar, final TUEventInterface tUEventInterface, final TUSplashSkipInfo tUSplashSkipInfo, final TUShowConfig tUShowConfig, final Map<String, Object> map, final TUNativeAdCustomRender tUNativeAdCustomRender) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final com.thinkup.core.common.on.o oVarM = this.f42653n.m((Context) activity, false, true, o(tUShowConfig, map));
        if (oVarM == null) {
            Log.e(mo.oo0, "Splash No Cache.");
            return;
        }
        if (oVarM.oo() instanceof CustomSplashAdapter) {
            this.f42653n.o(oVarM);
            oVarM.o(oVarM.n() + 1);
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.splashad.o.n.1
                @Override // java.lang.Runnable
                public final void run() {
                    String scenarioId;
                    String showCustomExt;
                    final CustomSplashAdapter customSplashAdapter = (CustomSplashAdapter) oVarM.oo();
                    Activity activity2 = activity;
                    if (activity2 != null) {
                        customSplashAdapter.refreshActivityContext(activity2);
                    }
                    final n0 trackingInfo = oVarM.oo().getTrackingInfo();
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
                        trackingInfo.omo = n.this.f42653n.m0();
                        trackingInfo.m0o = scenarioId;
                        trackingInfo.omm(showCustomExt);
                        trackingInfo.nm(nn.o(trackingInfo.oon0(), trackingInfo.mon(), jCurrentTimeMillis));
                        m0m.o(n.this.o, trackingInfo);
                        m0m.o((Map<String, Object>) map, trackingInfo);
                        m0m.o(n.this.m, trackingInfo);
                    }
                    com.thinkup.core.common.o.o().o(n.this.o, oVarM);
                    com.thinkup.core.common.oo0.n.o(n.this.o).o(13, trackingInfo, customSplashAdapter.getUnitGroupInfo(), jCurrentTimeMillis);
                    com.thinkup.core.common.ooo.o0.o().o(trackingInfo, customSplashAdapter.getUnitGroupInfo(), com.thinkup.core.common.ooo.o0.m);
                    o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.o.n.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            o0m o0mVarN = o0n.m().n();
                            if (o0mVarN != null) {
                                CustomSplashAdapter customSplashAdapter2 = customSplashAdapter;
                                customSplashAdapter2.setAdDownloadListener(o0mVarN.createDataFetchListener(customSplashAdapter2, null, tUEventInterface));
                            }
                            TUSplashSkipInfo tUSplashSkipInfo2 = tUSplashSkipInfo;
                            boolean z2 = tUSplashSkipInfo2 != null && tUSplashSkipInfo2.canUseCustomSkipView();
                            boolean zIsSupportCustomSkipView = customSplashAdapter.isSupportCustomSkipView();
                            if (z2 && zIsSupportCustomSkipView) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                tUSplashSkipInfo.setContainer(viewGroup);
                                customSplashAdapter.setSplashSkipInfo(tUSplashSkipInfo);
                            }
                            final om omVar = new om(customSplashAdapter, oVar);
                            if (customSplashAdapter.isMixNative()) {
                                AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                n.o(n.this, customSplashAdapter, activity, viewGroup, omVar, z2, oVarM, trackingInfo, tUNativeAdCustomRender);
                            } else if (customSplashAdapter.isMixBanner()) {
                                AnonymousClass1 anonymousClass3 = AnonymousClass1.this;
                                n.o(n.this, customSplashAdapter, activity, viewGroup, omVar, z2, trackingInfo);
                            } else {
                                CustomSplashAdapter customSplashAdapter3 = customSplashAdapter;
                                AnonymousClass1 anonymousClass4 = AnonymousClass1.this;
                                customSplashAdapter3.internalShow(activity, viewGroup, new oo(omVar));
                            }
                            n0 trackingInfo2 = customSplashAdapter.getTrackingInfo();
                            com.thinkup.core.common.oo0.oo.o("4", trackingInfo2, trackingInfo2.oon0(), trackingInfo2.oomn(), trackingInfo2.mon(), trackingInfo2.n0n(), 4, SystemClock.elapsedRealtime() - jElapsedRealtime);
                            if (!z2) {
                                if (tUSplashSkipInfo != null) {
                                    Log.e(mo.oo0, "This AdSource does't support 'Custom SkipView' or 'SkipView' is null.");
                                }
                            } else {
                                TUSplashSkipAdListener tUSplashSkipAdListener = tUSplashSkipInfo.getTUSplashSkipAdListener();
                                if (tUSplashSkipAdListener != null) {
                                    tUSplashSkipAdListener.isSupportCustomSkipView(zIsSupportCustomSkipView);
                                }
                                if (zIsSupportCustomSkipView) {
                                    tUSplashSkipInfo.getSkipView().setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.splashad.o.n.1.1.1
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            om omVar2 = omVar;
                                            if (omVar2 != null) {
                                                omVar2.o(2);
                                                omVar.onSplashAdDismiss();
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            });
        }
    }

    private ono o(TUShowConfig tUShowConfig, Map<String, Object> map) {
        ono onoVar = new ono();
        onoVar.o(map);
        if (tUShowConfig != null) {
            onoVar.o(tUShowConfig.getTUAdInfo());
        }
        com.thinkup.core.common.om omVar = this.f42653n;
        if (omVar != null) {
            onoVar.o(omVar.mo());
        }
        return onoVar;
    }

    public final List<TUAdInfo> o(Context context) {
        return this.f42653n.o(context);
    }

    public final TUAdStatusInfo o(Context context, Map<String, Object> map) {
        return this.f42653n.o(context, map);
    }

    private boolean o(TUAdStatusInfo tUAdStatusInfo, int i2) {
        return this.f42653n.o(tUAdStatusInfo, i2);
    }

    public final on o(String str) {
        return this.f42653n.m(str);
    }

    public final com.thinkup.core.common.on.o o(Context context, ono onoVar) {
        return this.f42653n.m(context, false, false, onoVar);
    }

    private void o(CustomSplashAdapter customSplashAdapter, Activity activity, ViewGroup viewGroup, om omVar, boolean z2, com.thinkup.core.common.on.o oVar, n0 n0Var, TUNativeAdCustomRender tUNativeAdCustomRender) {
        ViewGroup viewGroup2;
        BaseAd baseAdOm = oVar.om();
        if (baseAdOm == null) {
            if (omVar != null) {
                omVar.o(99);
                omVar.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, "", "showThirdPartyNativeSplash fail, no ad cache."));
                omVar.onSplashAdDismiss();
                return;
            }
            return;
        }
        try {
            com.thinkup.core.common.mn.n.o.o oVarO = com.thinkup.core.common.inner.mixad.m.m.o(customSplashAdapter, new com.thinkup.core.common.mn.o0.o.C0664o().o(activity).o(n0Var).o(baseAdOm).o(z2).o(tUNativeAdCustomRender).o(new AnonymousClass2(oVar, omVar, new boolean[]{false})).o());
            if (!(oVarO instanceof com.thinkup.core.common.mn.n.o.om)) {
                o(omVar, null, "", "Failed to show mixed native splash ad：create splash bridge with an unknown error.");
                return;
            }
            Object objO = ((com.thinkup.core.common.mn.n.o.om) oVarO).o();
            if (!(objO instanceof View)) {
                o(omVar, null, "", "Failed to show mixed native splash ad: failed to create splash view.");
                return;
            }
            View view = (View) objO;
            moo.o(view);
            ViewGroup customAdContainer = baseAdOm.getCustomAdContainer();
            if (customAdContainer != null) {
                viewGroup2 = view;
                moo.o((View) customAdContainer);
                customAdContainer.addView(view);
                viewGroup2 = customAdContainer;
            }
            viewGroup2 = view;
            viewGroup.addView(viewGroup2);
            if (objO instanceof com.thinkup.core.common.mn.oo.o.om) {
                ((com.thinkup.core.common.mn.oo.o.om) objO).registerNativeAdContainer(viewGroup);
                ((com.thinkup.core.common.mn.oo.o.om) objO).handleFullScreenClick(customAdContainer);
            }
        } catch (Throwable th) {
            o(omVar, null, "", "Failed to show mixed native splash ad： ".concat(String.valueOf(th)));
        }
    }

    private void o(CustomSplashAdapter customSplashAdapter, Activity activity, ViewGroup viewGroup, om omVar, boolean z2, n0 n0Var) {
        oo ooVar = new oo(omVar);
        try {
            customSplashAdapter.internalShow(activity, viewGroup, ooVar);
            com.thinkup.core.common.mn.o0.o oVarO = new com.thinkup.core.common.mn.o0.o.C0664o().o(activity.getApplicationContext()).o(n0Var).o(z2).o(new AnonymousClass3(ooVar)).o();
            com.thinkup.core.common.mn.n.o.o oVarO2 = com.thinkup.core.common.inner.mixad.m.m.o(customSplashAdapter, oVarO);
            if (!(oVarO2 instanceof com.thinkup.core.common.mn.n.o.om)) {
                o(null, ooVar, "", "Failed to show mixed banner splash ad: create splash bridge with unknow error.");
                return;
            }
            Object objM = ((com.thinkup.core.common.mn.n.o.om) oVarO2).m();
            if (!(objM instanceof View)) {
                o(null, ooVar, "", "Failed to show mixed banner splash ad: failed to get banner view.");
                return;
            }
            View view = (View) objM;
            moo.o(view);
            viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
            ITUBaseAdAdapter iTUBaseAdAdapterOm = oVarO.om();
            if (iTUBaseAdAdapterOm == null || iTUBaseAdAdapterOm.supportImpressionCallback()) {
                return;
            }
            view.post(new AnonymousClass4(ooVar));
        } catch (Throwable th) {
            o(null, ooVar, "", "Failed to show mixed banner splash ad: ".concat(String.valueOf(th)));
        }
    }

    private static void o(om omVar, oo ooVar, String str, String str2) {
        if (omVar != null) {
            omVar.o(99);
            omVar.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2));
            omVar.onSplashAdDismiss();
        }
        if (ooVar != null) {
            ooVar.o(99);
            ooVar.onAdShowFail(str, str2);
            ooVar.onAdDismiss();
        }
    }

    public static /* synthetic */ void o(n nVar, CustomSplashAdapter customSplashAdapter, Activity activity, ViewGroup viewGroup, om omVar, boolean z2, com.thinkup.core.common.on.o oVar, n0 n0Var, TUNativeAdCustomRender tUNativeAdCustomRender) {
        ViewGroup viewGroup2;
        BaseAd baseAdOm = oVar.om();
        if (baseAdOm == null) {
            omVar.o(99);
            omVar.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, "", "showThirdPartyNativeSplash fail, no ad cache."));
            omVar.onSplashAdDismiss();
            return;
        }
        try {
            com.thinkup.core.common.mn.n.o.o oVarO = com.thinkup.core.common.inner.mixad.m.m.o(customSplashAdapter, new com.thinkup.core.common.mn.o0.o.C0664o().o(activity).o(n0Var).o(baseAdOm).o(z2).o(tUNativeAdCustomRender).o(nVar.new AnonymousClass2(oVar, omVar, new boolean[]{false})).o());
            if (!(oVarO instanceof com.thinkup.core.common.mn.n.o.om)) {
                o(omVar, null, "", "Failed to show mixed native splash ad：create splash bridge with an unknown error.");
                return;
            }
            Object objO = ((com.thinkup.core.common.mn.n.o.om) oVarO).o();
            if (!(objO instanceof View)) {
                o(omVar, null, "", "Failed to show mixed native splash ad: failed to create splash view.");
                return;
            }
            View view = (View) objO;
            moo.o(view);
            ViewGroup customAdContainer = baseAdOm.getCustomAdContainer();
            if (customAdContainer != null) {
                viewGroup2 = view;
                moo.o((View) customAdContainer);
                customAdContainer.addView(view);
                viewGroup2 = customAdContainer;
            }
            viewGroup2 = view;
            viewGroup.addView(viewGroup2);
            if (objO instanceof com.thinkup.core.common.mn.oo.o.om) {
                ((com.thinkup.core.common.mn.oo.o.om) objO).registerNativeAdContainer(viewGroup);
                ((com.thinkup.core.common.mn.oo.o.om) objO).handleFullScreenClick(customAdContainer);
            }
        } catch (Throwable th) {
            o(omVar, null, "", "Failed to show mixed native splash ad： ".concat(String.valueOf(th)));
        }
    }

    public static /* synthetic */ void o(n nVar, CustomSplashAdapter customSplashAdapter, Activity activity, ViewGroup viewGroup, om omVar, boolean z2, n0 n0Var) {
        oo ooVar = new oo(omVar);
        try {
            customSplashAdapter.internalShow(activity, viewGroup, ooVar);
            com.thinkup.core.common.mn.o0.o oVarO = new com.thinkup.core.common.mn.o0.o.C0664o().o(activity.getApplicationContext()).o(n0Var).o(z2).o(nVar.new AnonymousClass3(ooVar)).o();
            com.thinkup.core.common.mn.n.o.o oVarO2 = com.thinkup.core.common.inner.mixad.m.m.o(customSplashAdapter, oVarO);
            if (!(oVarO2 instanceof com.thinkup.core.common.mn.n.o.om)) {
                o(null, ooVar, "", "Failed to show mixed banner splash ad: create splash bridge with unknow error.");
                return;
            }
            Object objM = ((com.thinkup.core.common.mn.n.o.om) oVarO2).m();
            if (!(objM instanceof View)) {
                o(null, ooVar, "", "Failed to show mixed banner splash ad: failed to get banner view.");
                return;
            }
            View view = (View) objM;
            moo.o(view);
            viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
            ITUBaseAdAdapter iTUBaseAdAdapterOm = oVarO.om();
            if (iTUBaseAdAdapterOm == null || iTUBaseAdAdapterOm.supportImpressionCallback()) {
                return;
            }
            view.post(nVar.new AnonymousClass4(ooVar));
        } catch (Throwable th) {
            o(null, ooVar, "", "Failed to show mixed banner splash ad: ".concat(String.valueOf(th)));
        }
    }
}
