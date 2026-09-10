package com.thinkup.interstitial.o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.model.a;
import com.smartdigimkt.v0.k;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdMultipleLoadedListener;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.common.n.o0m;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.ono;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.o0o;
import com.thinkup.interstitial.api.TUInterstitialListener;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static final String o = "m";
    private static Map<String, m> on = new ConcurrentHashMap(3);
    private View m;
    private o m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AtomicBoolean f42475n = new AtomicBoolean(false);
    private Context o0;
    private final com.thinkup.core.common.om om;
    private String oo;

    /* JADX INFO: renamed from: com.thinkup.interstitial.o.m$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnTouchListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.thinkup.interstitial.o.m$2, reason: invalid class name */
    public class AnonymousClass2 implements com.thinkup.core.common.res.m.o {
        final /* synthetic */ String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f42476n;
        final /* synthetic */ WeakReference o;

        public AnonymousClass2(WeakReference weakReference, String str, int i2) {
            this.o = weakReference;
            this.m = str;
            this.f42476n = i2;
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onFail(String str, String str2) {
            Log.e(m.o, "load: image load fail:".concat(String.valueOf(str2)));
            ImageView imageView = (ImageView) this.o.get();
            if (!TextUtils.equals(this.m, str) || imageView == null) {
                return;
            }
            imageView.setImageResource(this.f42476n);
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onSuccess(String str, Bitmap bitmap) {
            ImageView imageView = (ImageView) this.o.get();
            if (!TextUtils.equals(this.m, str) || imageView == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.interstitial.o.m$4, reason: invalid class name */
    public class AnonymousClass4 extends com.thinkup.core.common.mn.oo.o {
        final /* synthetic */ om o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(com.thinkup.core.common.on.o oVar, om omVar) {
            super(oVar);
            this.o = omVar;
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdClicked(View view) {
            super.onAdClicked(view);
            om omVar = this.o;
            if (omVar != null) {
                omVar.onInterstitialAdClicked();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdImpressed() {
            om omVar = this.o;
            if (omVar != null) {
                omVar.onInterstitialAdShow();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdVideoEnd() {
            om omVar = this.o;
            if (omVar != null) {
                omVar.onInterstitialAdVideoEnd();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onAdVideoStart() {
            om omVar = this.o;
            if (omVar != null) {
                omVar.onInterstitialAdVideoStart();
            }
        }

        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
        public final void onClose() {
            om omVar = this.o;
            if (omVar != null) {
                omVar.onInterstitialAdClose();
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
        public final void onVideoError(String str, String str2) {
            om omVar = this.o;
            if (omVar != null) {
                omVar.onInterstitialAdVideoError(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.interstitial.o.m$5, reason: invalid class name */
    public class AnonymousClass5 implements com.thinkup.core.common.mn.oo.o.o.InterfaceC0666o {
        final /* synthetic */ CustomInterstitialAdapter o;

        public AnonymousClass5(CustomInterstitialAdapter customInterstitialAdapter) {
            this.o = customInterstitialAdapter;
        }

        @Override // com.thinkup.core.common.mn.oo.o.o.InterfaceC0666o
        public final void o(Activity activity) {
            if (m.this.m0 != null) {
                m.this.m0.o(this.o, activity);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.interstitial.o.m$6, reason: invalid class name */
    public class AnonymousClass6 implements com.thinkup.core.common.mn.om.o.o.InterfaceC0665o {
        final /* synthetic */ om m;
        final /* synthetic */ CustomInterstitialAdapter o;

        public AnonymousClass6(CustomInterstitialAdapter customInterstitialAdapter, om omVar) {
            this.o = customInterstitialAdapter;
            this.m = omVar;
        }

        @Override // com.thinkup.core.common.mn.om.o.o.InterfaceC0665o
        public final void o(final Activity activity, ViewGroup viewGroup) {
            if (m.this.m0 != null) {
                m.this.m0.o(this.o, activity);
            }
            this.o.internalShow(activity, viewGroup, new n(this.m) { // from class: com.thinkup.interstitial.o.m.6.1
                @Override // com.thinkup.interstitial.o.n, com.thinkup.core.api.TUCommonImpressionListener
                public final void onAdDismiss() {
                    o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.m.6.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (activity.isFinishing()) {
                                return;
                            }
                            activity.finish();
                            activity.overridePendingTransition(0, 0);
                        }
                    });
                    super.onAdDismiss();
                }
            });
        }
    }

    private m(Context context, String str) {
        this.o0 = context.getApplicationContext();
        this.oo = str;
        this.om = com.thinkup.core.common.om.o(context, str, "3");
    }

    private static void m() {
    }

    private static void n() {
    }

    private static void o0() {
    }

    public static m o(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        m mVar = on.get(str);
        if (mVar != null) {
            return mVar;
        }
        synchronized (m.class) {
            if (mVar == null) {
                try {
                    mVar = new m(context, str);
                    on.put(str, mVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mVar;
    }

    private void o(Activity activity) {
        if (activity == null) {
            return;
        }
        com.thinkup.core.oo.m mVarH = a.h(com.thinkup.core.oo.o0.o(this.o0));
        String strO0n = mVarH.o0n();
        String strO0m = mVarH.o0m();
        if (this.m == null) {
            this.m = LayoutInflater.from(activity.getApplicationContext()).inflate(o00.o(activity, "interstitial_loading_layout", "layout"), (ViewGroup) null);
        }
        this.m.setOnTouchListener(new AnonymousClass1());
        ImageView imageView = (ImageView) this.m.findViewById(o00.o(activity, "interstitial_iv_loading", "id"));
        TextView textView = (TextView) this.m.findViewById(o00.o(activity, "interstitial_tv_loading", "id"));
        int iO = o00.o((Context) activity, 30.0f);
        imageView.setMinimumWidth(iO);
        imageView.setMinimumHeight(iO);
        int iO2 = o00.o((Context) activity, 90.0f);
        imageView.setMaxWidth(iO2);
        imageView.setMaxHeight(iO2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int iO3 = o00.o(activity, "interstitial_loading_default", k.d);
        if (TextUtils.isEmpty(strO0n)) {
            imageView.setImageResource(iO3);
        } else {
            com.thinkup.core.common.res.m.o(activity.getApplicationContext()).o(new com.thinkup.core.common.res.oo(3, strO0n), new AnonymousClass2(new WeakReference(imageView), strO0n, iO3));
        }
        if (!TextUtils.isEmpty(strO0m)) {
            textView.setText(strO0m);
        } else {
            textView.setText(o00.o(activity, "interstitial_text_loading_default", k.f38992h));
        }
        View view = this.m;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.m.getParent()).removeView(this.m);
        }
        ((ViewGroup) activity.getWindow().getDecorView()).addView(this.m, new FrameLayout.LayoutParams(-1, -1));
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
        this.om.m(this.o0, "3", this.oo, mmmVar, oVar);
    }

    public final List<TUAdInfo> o(Context context) {
        return this.om.o(context);
    }

    public final TUAdStatusInfo o(Context context, Map<String, Object> map) {
        return this.om.o(context, map);
    }

    private com.thinkup.core.common.on.o o(Context context, ono onoVar) {
        return this.om.m(context, false, true, onoVar);
    }

    public final com.thinkup.core.common.on.o o(Map<String, Object> map) {
        ono onoVarO = o((TUShowConfig) null, map);
        com.thinkup.core.common.om omVar = this.om;
        if (omVar != null) {
            return omVar.m(this.o0, false, false, onoVarO);
        }
        return null;
    }

    public final synchronized void o(Activity activity, TUShowConfig tUShowConfig, TUInterstitialListener tUInterstitialListener, TUEventInterface tUEventInterface, Map<String, Object> map, TUNativeAdCustomRender tUNativeAdCustomRender) {
        try {
            if (this.f42475n.get()) {
                return;
            }
            o oVar = this.m0;
            if (oVar != null) {
                oVar.o();
                this.m0 = null;
            }
            this.m0 = new o(activity, tUShowConfig, tUInterstitialListener, tUEventInterface, map, tUNativeAdCustomRender, this.oo, this);
            o(activity, this.om.m((Context) activity, false, true, o(tUShowConfig, map)), tUShowConfig, tUInterstitialListener, tUEventInterface, map, tUNativeAdCustomRender);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final com.thinkup.core.common.om o() {
        return this.om;
    }

    public final void o(final Activity activity, final com.thinkup.core.common.on.o oVar, final TUShowConfig tUShowConfig, final TUInterstitialListener tUInterstitialListener, final TUEventInterface tUEventInterface, final Map<String, Object> map, final TUNativeAdCustomRender tUNativeAdCustomRender) {
        if (oVar != null && (oVar.oo() instanceof CustomInterstitialAdapter)) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.om.o(oVar);
            oVar.o(oVar.n() + 1);
            final int iO0mn = oVar.oo().getUnitGroupInfo().o0mn();
            if (iO0mn > 0) {
                this.f42475n.set(true);
            }
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.interstitial.o.m.3
                @Override // java.lang.Runnable
                public final void run() {
                    final String scenarioId;
                    String showCustomExt;
                    final CustomInterstitialAdapter customInterstitialAdapter = (CustomInterstitialAdapter) oVar.oo();
                    Activity activity2 = activity;
                    if (activity2 != null) {
                        customInterstitialAdapter.refreshActivityContext(activity2);
                    }
                    final n0 trackingInfo = oVar.oo().getTrackingInfo();
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
                        trackingInfo.omo = m.this.om.m0();
                        trackingInfo.m0o = scenarioId;
                        trackingInfo.omm(showCustomExt);
                        trackingInfo.nm(nn.o(trackingInfo.oon0(), trackingInfo.mon(), jCurrentTimeMillis));
                        m0m.o(m.this.o0, trackingInfo);
                        m0m.o((Map<String, Object>) map, trackingInfo);
                        m0m.o(m.this.oo, trackingInfo);
                    }
                    com.thinkup.core.common.o.o().o(m.this.o0, oVar);
                    com.thinkup.core.common.oo0.n.o(m.this.o0).o(13, trackingInfo, oVar.oo().getUnitGroupInfo(), jCurrentTimeMillis);
                    com.thinkup.core.common.ooo.o0.o().o(trackingInfo, oVar.oo().getUnitGroupInfo(), com.thinkup.core.common.ooo.o0.m);
                    if (iO0mn > 0) {
                        o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.m.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                m.o(m.this, activity);
                            }
                        });
                    }
                    o0n.m().o(new Runnable() { // from class: com.thinkup.interstitial.o.m.3.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            customInterstitialAdapter.setScenario(scenarioId);
                            o0m o0mVarN = o0n.m().n();
                            if (o0mVarN != null) {
                                CustomInterstitialAdapter customInterstitialAdapter2 = customInterstitialAdapter;
                                customInterstitialAdapter2.setAdDownloadListener(o0mVarN.createDataFetchListener(customInterstitialAdapter2, null, tUEventInterface));
                            }
                            CustomInterstitialAdapter customInterstitialAdapter3 = customInterstitialAdapter;
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            om omVar = new om(customInterstitialAdapter3, tUInterstitialListener, m.this.m0);
                            if (customInterstitialAdapter.isMixNative()) {
                                AnonymousClass3 anonymousClass4 = AnonymousClass3.this;
                                m.o(m.this, customInterstitialAdapter, activity, omVar, oVar, trackingInfo, scenarioId, tUNativeAdCustomRender);
                            } else if (customInterstitialAdapter.isMixSplash()) {
                                AnonymousClass3 anonymousClass5 = AnonymousClass3.this;
                                m.o(m.this, activity, customInterstitialAdapter, omVar);
                            } else {
                                customInterstitialAdapter.internalShow(activity, null, new n(omVar));
                            }
                            n0 trackingInfo2 = customInterstitialAdapter.getTrackingInfo();
                            com.thinkup.core.common.oo0.oo.o("4", trackingInfo2, trackingInfo2.oon0(), trackingInfo2.oomn(), trackingInfo2.mon(), trackingInfo2.n0n(), 4, SystemClock.elapsedRealtime() - jElapsedRealtime);
                            AnonymousClass3 anonymousClass6 = AnonymousClass3.this;
                            if (iO0mn <= 0 || !m.this.f42475n.get()) {
                                return;
                            }
                            if (m.this.m != null) {
                                ((ViewGroup) m.this.m.getParent()).removeView(m.this.m);
                            }
                            m.this.f42475n.set(false);
                        }
                    }, iO0mn);
                }
            });
            return;
        }
        if (this.om.o((TUAdStatusInfo) null, 7)) {
            o(o0n.m().mm0(), 7, (com.thinkup.core.common.n.o) null, (com.thinkup.core.common.n.n) null, (TUAdMultipleLoadedListener) null, map, (TUAdRequest) null);
        }
    }

    private ono o(TUShowConfig tUShowConfig, Map<String, Object> map) {
        ono onoVar = new ono();
        onoVar.o(map);
        com.thinkup.core.common.om omVar = this.om;
        if (omVar != null) {
            onoVar.o(omVar.mo());
        }
        if (tUShowConfig != null) {
            onoVar.o(tUShowConfig.getTUAdInfo());
        }
        return onoVar;
    }

    private void o(CustomInterstitialAdapter customInterstitialAdapter, Activity activity, om omVar, com.thinkup.core.common.on.o oVar, n0 n0Var, String str, TUNativeAdCustomRender tUNativeAdCustomRender) {
        String strO;
        BaseAd baseAdOm = oVar.om();
        if (baseAdOm == null) {
            if (omVar != null) {
                omVar.onInterstitialAdVideoError("", "showThirdPartyNativeInterstitial fail, no ad cache.");
                return;
            }
            return;
        }
        com.thinkup.core.common.mn.n.o.o oVarO = com.thinkup.core.common.inner.mixad.m.m.o(customInterstitialAdapter, new com.thinkup.core.common.mn.o0.o.C0664o().o(activity).o(baseAdOm).o(n0Var).o(tUNativeAdCustomRender).o(new AnonymousClass4(oVar, omVar)).o());
        if (!(oVarO instanceof com.thinkup.core.common.mn.n.o.n)) {
            if (omVar != null) {
                omVar.onInterstitialAdVideoError("", "create interstitial bridge with unknow error.");
                return;
            }
            return;
        }
        com.thinkup.core.basead.m.o oVar2 = new com.thinkup.core.basead.m.o();
        if (n0Var == null || this.om == null) {
            strO = "";
        } else {
            strO = com.thinkup.core.common.om.o(n0Var.oomn(), n0Var.mon(), String.valueOf(n0Var.n0n()));
        }
        if (TextUtils.isEmpty(strO)) {
            if (omVar != null) {
                omVar.onInterstitialAdVideoError("", "create interstitial bridge with error: eventId is empty.");
            }
        } else {
            oVar2.o0 = strO;
            oVar2.oo = com.thinkup.core.common.ooo.n0.om(activity);
            oVar2.m = str;
            oVar2.o = Integer.parseInt("3");
            ((com.thinkup.core.common.mn.n.o.n) oVarO).o(activity, oVar2, new AnonymousClass5(customInterstitialAdapter));
        }
    }

    private void o(Activity activity, CustomInterstitialAdapter customInterstitialAdapter, om omVar) {
        com.thinkup.core.basead.m.o oVar = new com.thinkup.core.basead.m.o();
        o0mm unitGroupInfo = customInterstitialAdapter.getUnitGroupInfo();
        if (unitGroupInfo == null) {
            return;
        }
        com.thinkup.core.common.mn.n.o.o oVarO = com.thinkup.core.common.inner.mixad.m.m.o(customInterstitialAdapter, null);
        if (oVarO instanceof com.thinkup.core.common.mn.n.o.n) {
            oVar.o0 = com.thinkup.core.common.om.o(this.oo, unitGroupInfo.m0o(), String.valueOf(unitGroupInfo.nm()));
            ((com.thinkup.core.common.mn.n.o.n) oVarO).o(activity, oVar, new AnonymousClass6(customInterstitialAdapter, omVar));
        } else if (omVar != null) {
            omVar.onInterstitialAdVideoError("", "create interstitial bridge with unknow error.");
        }
    }

    public static /* synthetic */ void o(m mVar, Activity activity) {
        if (activity != null) {
            com.thinkup.core.oo.m mVarH = a.h(com.thinkup.core.oo.o0.o(mVar.o0));
            String strO0n = mVarH.o0n();
            String strO0m = mVarH.o0m();
            if (mVar.m == null) {
                mVar.m = LayoutInflater.from(activity.getApplicationContext()).inflate(o00.o(activity, "interstitial_loading_layout", "layout"), (ViewGroup) null);
            }
            mVar.m.setOnTouchListener(mVar.new AnonymousClass1());
            ImageView imageView = (ImageView) mVar.m.findViewById(o00.o(activity, "interstitial_iv_loading", "id"));
            TextView textView = (TextView) mVar.m.findViewById(o00.o(activity, "interstitial_tv_loading", "id"));
            int iO = o00.o((Context) activity, 30.0f);
            imageView.setMinimumWidth(iO);
            imageView.setMinimumHeight(iO);
            int iO2 = o00.o((Context) activity, 90.0f);
            imageView.setMaxWidth(iO2);
            imageView.setMaxHeight(iO2);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iO3 = o00.o(activity, "interstitial_loading_default", k.d);
            if (TextUtils.isEmpty(strO0n)) {
                imageView.setImageResource(iO3);
            } else {
                com.thinkup.core.common.res.m.o(activity.getApplicationContext()).o(new com.thinkup.core.common.res.oo(3, strO0n), mVar.new AnonymousClass2(new WeakReference(imageView), strO0n, iO3));
            }
            if (!TextUtils.isEmpty(strO0m)) {
                textView.setText(strO0m);
            } else {
                textView.setText(o00.o(activity, "interstitial_text_loading_default", k.f38992h));
            }
            View view = mVar.m;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) mVar.m.getParent()).removeView(mVar.m);
            }
            ((ViewGroup) activity.getWindow().getDecorView()).addView(mVar.m, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public static /* synthetic */ void o(m mVar, CustomInterstitialAdapter customInterstitialAdapter, Activity activity, om omVar, com.thinkup.core.common.on.o oVar, n0 n0Var, String str, TUNativeAdCustomRender tUNativeAdCustomRender) {
        String strO;
        BaseAd baseAdOm = oVar.om();
        if (baseAdOm == null) {
            omVar.onInterstitialAdVideoError("", "showThirdPartyNativeInterstitial fail, no ad cache.");
            return;
        }
        com.thinkup.core.common.mn.n.o.o oVarO = com.thinkup.core.common.inner.mixad.m.m.o(customInterstitialAdapter, new com.thinkup.core.common.mn.o0.o.C0664o().o(activity).o(baseAdOm).o(n0Var).o(tUNativeAdCustomRender).o(mVar.new AnonymousClass4(oVar, omVar)).o());
        if (!(oVarO instanceof com.thinkup.core.common.mn.n.o.n)) {
            omVar.onInterstitialAdVideoError("", "create interstitial bridge with unknow error.");
            return;
        }
        com.thinkup.core.basead.m.o oVar2 = new com.thinkup.core.basead.m.o();
        if (n0Var == null || mVar.om == null) {
            strO = "";
        } else {
            strO = com.thinkup.core.common.om.o(n0Var.oomn(), n0Var.mon(), String.valueOf(n0Var.n0n()));
        }
        if (TextUtils.isEmpty(strO)) {
            omVar.onInterstitialAdVideoError("", "create interstitial bridge with error: eventId is empty.");
            return;
        }
        oVar2.o0 = strO;
        oVar2.oo = com.thinkup.core.common.ooo.n0.om(activity);
        oVar2.m = str;
        oVar2.o = Integer.parseInt("3");
        ((com.thinkup.core.common.mn.n.o.n) oVarO).o(activity, oVar2, mVar.new AnonymousClass5(customInterstitialAdapter));
    }

    public static /* synthetic */ void o(m mVar, Activity activity, CustomInterstitialAdapter customInterstitialAdapter, om omVar) {
        com.thinkup.core.basead.m.o oVar = new com.thinkup.core.basead.m.o();
        o0mm unitGroupInfo = customInterstitialAdapter.getUnitGroupInfo();
        if (unitGroupInfo != null) {
            com.thinkup.core.common.mn.n.o.o oVarO = com.thinkup.core.common.inner.mixad.m.m.o(customInterstitialAdapter, null);
            if (!(oVarO instanceof com.thinkup.core.common.mn.n.o.n)) {
                omVar.onInterstitialAdVideoError("", "create interstitial bridge with unknow error.");
            } else {
                oVar.o0 = com.thinkup.core.common.om.o(mVar.oo, unitGroupInfo.m0o(), String.valueOf(unitGroupInfo.nm()));
                ((com.thinkup.core.common.mn.n.o.n) oVarO).o(activity, oVar, mVar.new AnonymousClass6(customInterstitialAdapter, omVar));
            }
        }
    }
}
