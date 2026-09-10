package com.startapp.sdk.ads.banner.bannerstandard;

import A.RunnableC0914v;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.BannerSize;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject$Size;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MraidMetadata;
import com.startapp.sdk.internal.ad;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.ca;
import com.startapp.sdk.internal.da;
import com.startapp.sdk.internal.dd;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.ea;
import com.startapp.sdk.internal.ed;
import com.startapp.sdk.internal.fb;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.i1;
import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.k0;
import com.startapp.sdk.internal.k1;
import com.startapp.sdk.internal.kk;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.internal.lk;
import com.startapp.sdk.internal.p1;
import com.startapp.sdk.internal.q1;
import com.startapp.sdk.internal.r1;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.s7;
import com.startapp.sdk.internal.sc;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.sg;
import com.startapp.sdk.internal.tc;
import com.startapp.sdk.internal.tk;
import com.startapp.sdk.internal.v1;
import com.startapp.sdk.internal.vd;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.w1;
import com.startapp.sdk.internal.w6;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.yc;
import com.startapp.sdk.internal.z6;
import com.startapp.sdk.internal.zc;
import com.startapp.sdk.internal.zf;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BannerStandard extends BannerBase implements AdEventListener, BannerInterface {
    private static final String LOG_TAG = "BannerStandard";
    protected r1 adHtml;
    private RelativeLayout adInformationContatiner;
    private com.startapp.sdk.adsbase.adinformation.a adInformationLayout;
    private vd adSession;
    private final Object adSessionLock;
    private boolean callLoadHtmlOnAttached;
    private boolean callbackSent;
    private CloseableLayout closeableAdContainer;
    private boolean defaultLoad;
    private final lb externalAds;
    private final zf impressionListener;
    protected boolean jsTag;
    protected BannerListener listener;
    private a mraidController;
    private BannerOptions options;
    private ViewGroup rootView;
    private ag scheduledImpression;
    private boolean sessionStarted;
    private BannerSize size;
    private WebView twoPartWebView;
    private double viewHeightDp;
    private double viewWidthDp;
    private boolean visible;
    private WebView webView;
    private RelativeLayout webViewContainer;
    protected boolean webViewTouched;

    public class a extends w1 implements sc {
        private MraidState mraidState;
        private boolean mraidVisibility;
        private final zc nativeFeatureManager;
        private final ad orientationProperties;
        private dd resizeProperties;
        private a twoPart;
        private kk viewabilityTracker;
        lk visibilityResult;
        private final WebView webView;

        public a(WebView webView, v1 v1Var) {
            super(v1Var);
            this.webView = webView;
            this.nativeFeatureManager = new zc(BannerStandard.this.getContext());
            this.orientationProperties = new ad();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVisibilityTracker() {
            if (this.viewabilityTracker == null) {
                this.viewabilityTracker = new kk(this.webView, BannerStandard.this.getAdLoadingSize(), BannerMetaData.c().a(), new e(this));
            }
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.addVisibilityTracker();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fireExposureChangeEvent(lk lkVar) {
            String string;
            if (lkVar.equals(this.visibilityResult)) {
                return;
            }
            this.visibilityResult = lkVar;
            Rect rect = lkVar.f41231b;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TtmlNode.LEFT, rect.left);
                jSONObject.put("top", rect.top);
                jSONObject.put("width", rect.width());
                jSONObject.put("height", rect.height());
                Rect[] rectArr = lkVar.f41232c;
                int length = rectArr == null ? 0 : rectArr.length;
                if (length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(TtmlNode.LEFT, rectArr[i2].left);
                        jSONObject2.put("top", rectArr[i2].top);
                        jSONObject2.put("width", rectArr[i2].width());
                        jSONObject2.put("height", rectArr[i2].height());
                        jSONArray.put(jSONObject2);
                    }
                    string = jSONArray.toString();
                } else {
                    string = null;
                }
                vi.a(this.webView, false, "mraid.fireExposureChangeEvent", Float.valueOf(lkVar.f41230a), jSONObject.toString(), string);
            } catch (JSONException unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fireViewableChangeEvent(boolean z2) {
            if (this.mraidVisibility == z2) {
                return;
            }
            this.mraidVisibility = z2;
            vi.a(this.webView, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(z2));
        }

        private void updateDisplayMetrics(WebView webView) {
            Context context = BannerStandard.this.getContext();
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                BannerStandard.this.getLocationOnScreen(iArr);
                int i4 = iArr[0];
                int i5 = iArr[1];
                float f = i3;
                vi.a(webView, true, "mraid.setScreenSize", Integer.valueOf(li.b(context, i2)), Integer.valueOf(Math.round(f / context.getResources().getDisplayMetrics().density)));
                tc.b(context, i4, i5, BannerStandard.this.size.getWidth(), BannerStandard.this.size.getHeight(), webView);
                vi.a(webView, true, "mraid.setMaxSize", Integer.valueOf(li.b(context, i2)), Integer.valueOf(Math.round(f / context.getResources().getDisplayMetrics().density)));
                tc.a(context, i4, i5, BannerStandard.this.size.getWidth(), BannerStandard.this.size.getHeight(), webView);
            } catch (Throwable th) {
                g9.a(th);
            }
        }

        public void cancelViewabilityTracking() {
            kk kkVar = this.viewabilityTracker;
            if (kkVar != null) {
                kkVar.f41191a.removeCallbacksAndMessages(null);
                this.viewabilityTracker = null;
            }
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.cancelViewabilityTracking();
            }
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void close() {
            BannerStandard.this.handleCollapse();
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void expand(String str) {
            BannerStandard.this.cancelReloadTask();
            boolean zIsEmpty = TextUtils.isEmpty(str);
            boolean z2 = !zIsEmpty;
            if (!zIsEmpty) {
                BannerStandard.this.setupTwoPartMraidController(str);
            }
            if (getState() == MraidState.DEFAULT) {
                BannerStandard.this.onMraidExpandDefault(new FrameLayout.LayoutParams(-1, -1), z2);
            } else if (getState() == MraidState.RESIZED && !zIsEmpty) {
                BannerStandard.this.onMraidExpandResized(new FrameLayout.LayoutParams(-1, -1));
            }
            BannerStandard.this.setCloseableAdContainerLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setState(MraidState.EXPANDED);
        }

        public dd getResizeProperties() {
            return this.resizeProperties;
        }

        public MraidState getState() {
            return this.mraidState;
        }

        public void init() {
            this.webView.setWebViewClient(new ed(this, this));
        }

        public void initTwoPart(WebView webView) {
            if (this.twoPart == null) {
                a aVar = BannerStandard.this.new a(webView, this.openListener);
                this.twoPart = aVar;
                aVar.init();
                this.twoPart.onMraidDetected();
            }
        }

        @Override // com.startapp.sdk.internal.w1
        public boolean isFeatureSupported(String str) {
            return this.nativeFeatureManager.f41780b.contains(str);
        }

        @Override // com.startapp.sdk.internal.sc
        public void onMraidDetected() {
            if (this.mraidState != null) {
                return;
            }
            this.mraidState = MraidState.LOADING;
            addVisibilityTracker();
        }

        @Override // com.startapp.sdk.internal.sc
        public void onPageFinished(String str) {
            BannerStandard.this.getContext();
            WeakHashMap weakHashMap = vi.f41589a;
            Log.println(2, "StartAppSDK", "Banner received callback onPageFinished()");
            ((z6) ((y6) ((BannerBase) BannerStandard.this).eventTracer.a())).c(BannerStandard.this, ii.f41101F);
            BannerStandard.this.makeImpression(this.mraidState != null);
            WebView webView = this.webView;
            if (this.mraidState == MraidState.LOADING) {
                vi.a(webView, true, "mraid.setPlacementType", "inline");
                yc.a(BannerStandard.this.getContext(), webView, this.nativeFeatureManager);
                vi.a(this.webView, true, "gClientInterface.onPageFinished", Boolean.valueOf(this.mraidState != null));
                updateDisplayMetrics(webView);
                MraidState mraidState = MraidState.DEFAULT;
                this.mraidState = mraidState;
                vi.a(webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
                vi.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
            }
            BannerStandard.this.onWebviewPageFinished(webView);
        }

        public void release() {
            cancelViewabilityTracking();
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.release();
                this.twoPart = null;
            }
        }

        public boolean releaseTwoPart() {
            a aVar = this.twoPart;
            if (aVar == null) {
                return false;
            }
            aVar.release();
            this.twoPart = null;
            return true;
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void resize() {
            BannerStandard.this.handleResize();
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void setExpandProperties(Map<String, String> map) {
            String str = map.get("useCustomClose");
            if (str != null) {
                BannerStandard.this.handleCustomClose(Boolean.parseBoolean(str));
            }
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void setOrientationProperties(Map<String, String> map) {
            boolean z2 = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            ad adVar = this.orientationProperties;
            if (adVar.f40802a == z2) {
                int i2 = adVar.f40803b;
                int iIndexOf = ad.f40801c.indexOf(str);
                if (iIndexOf == -1) {
                    iIndexOf = 2;
                }
                if (i2 == iIndexOf) {
                    return;
                }
            }
            ad adVar2 = this.orientationProperties;
            adVar2.f40802a = z2;
            int iIndexOf2 = ad.f40801c.indexOf(str);
            adVar2.f40803b = iIndexOf2 != -1 ? iIndexOf2 : 2;
            applyOrientationProperties((Activity) BannerStandard.this.getContext(), this.orientationProperties);
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void setResizeProperties(Map<String, String> map) {
            try {
                int i2 = Integer.parseInt(map.get("width"));
                int i3 = Integer.parseInt(map.get("height"));
                int i4 = Integer.parseInt(map.get("offsetX"));
                int i5 = Integer.parseInt(map.get("offsetY"));
                String str = map.get("allowOffscreen");
                this.resizeProperties = new dd(i2, i3, i4, i5, map.get("customClosePosition"), str == null || Boolean.parseBoolean(str));
            } catch (Exception unused) {
                tc.a(this.webView, "wrong format", "setResizeProperties");
            }
        }

        public void setState(MraidState mraidState) {
            this.mraidState = mraidState;
            if (mraidState != null) {
                vi.a(this.webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
            }
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void useCustomClose(String str) {
            BannerStandard.this.handleCustomClose(Boolean.parseBoolean(str));
        }
    }

    public BannerStandard(Context context) {
        this(context, true, (AdPreferences) null);
    }

    private void addAdInformationLayout() {
        if (this.adInformationLayout == null && this.adInformationContatiner == null) {
            this.adInformationContatiner = new RelativeLayout(getContext());
            com.startapp.sdk.adsbase.adinformation.a aVar = new com.startapp.sdk.adsbase.adinformation.a(getContext(), AdInformationObject$Size.SMALL, AdPreferences.Placement.INAPP_BANNER, this.adHtml.getAdInfoOverride(), this.adHtml.getConsentData(), this.adHtml.getRequestUrl(), this.adHtml.getDParam(), this.adHtml.getErid(), this.adHtml.getEridUrl());
            this.adInformationLayout = aVar;
            aVar.a(this.adInformationContatiner);
        }
        try {
            ViewGroup viewGroup = (ViewGroup) this.adInformationContatiner.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.adInformationContatiner);
            }
        } catch (Exception unused) {
        }
        this.webView.addView(this.adInformationContatiner, androidx.media3.extractor.text.ttml.a.f(-2, -2, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void attachAdViewToContainer(View view, int i2, int i3) {
        this.webViewContainer.removeAllViews();
        this.webViewContainer.addView(view, androidx.media3.extractor.text.ttml.a.f(li.a(getContext(), i2), li.a(getContext(), i3), 13));
    }

    private void cancelViewabilityTracking() {
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.cancelViewabilityTracking();
        }
    }

    private void detachTwoPartMraidController() {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.removeView(this.twoPartWebView);
        }
        this.twoPartWebView.stopLoading();
        this.twoPartWebView = null;
    }

    private ViewGroup getAndMemoizeRootView() {
        if (this.rootView == null) {
            this.rootView = getTopmostView();
        }
        return this.rootView;
    }

    private long getImpressionDelayMillis() {
        Long l2 = this.adHtml.j;
        return l2 != null ? TimeUnit.SECONDS.toMillis(l2.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
    }

    private ViewGroup getTopmostView() {
        View rootView;
        ViewGroup viewGroup = this.rootView;
        if (viewGroup != null) {
            return viewGroup;
        }
        Context context = getContext();
        RelativeLayout relativeLayout = this.webViewContainer;
        View viewFindViewById = null;
        View viewFindViewById2 = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (relativeLayout != null && (rootView = relativeLayout.getRootView()) != null && (viewFindViewById = rootView.findViewById(R.id.content)) == null) {
            viewFindViewById = rootView;
        }
        if (viewFindViewById2 == null) {
            viewFindViewById2 = viewFindViewById;
        }
        return viewFindViewById2 instanceof ViewGroup ? (ViewGroup) viewFindViewById2 : this.webViewContainer;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ed A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:39:0x00e6, B:42:0x00ed, B:44:0x00f6, B:46:0x00ff, B:51:0x0115), top: B:85:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6 A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:39:0x00e6, B:42:0x00ed, B:44:0x00f6, B:46:0x00ff, B:51:0x0115), top: B:85:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    private boolean handleClick(String str) {
        boolean z2;
        String[] strArr;
        boolean z3;
        k1.a(getContext(), this.listener, (View) this, h0.a(str, (String) null));
        cancelScheduledImpression(null);
        cancelViewabilityTracking();
        Context context = getContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
        boolean zA = h0.a(context);
        r1 r1Var = this.adHtml;
        String[] strArr2 = r1Var.g;
        String[] strArr3 = r1Var.f41297a;
        boolean z4 = true;
        if (!this.jsTag && str.contains("index=")) {
            try {
                String[] strArrSplit = str.split(d9.i.f24749c);
                int i2 = Integer.parseInt(strArrSplit[strArrSplit.length - 1].split(d9.i.f24747b)[1]);
                if (i2 < 0) {
                    g9 g9Var = new g9(h9.f41040e);
                    g9Var.d = "Wrong index extracted from URL";
                    g9Var.f41002e = "adId: " + vi.a(this.adHtml.a(), "@adId@", "@adId@");
                    g9Var.a();
                    return false;
                }
                r1 r1Var2 = this.adHtml;
                try {
                    if (i2 >= 0) {
                        boolean[] zArr = r1Var2.f41301h;
                        if (i2 < zArr.length) {
                            z2 = zArr[i2];
                        }
                        if (z2 || zA) {
                            Context context2 = getContext();
                            if (i2 < strArr2.length) {
                                strArr = new String[]{strArr2[i2]};
                            } else {
                                strArr = null;
                            }
                            TrackingParams trackingParams = new TrackingParams(getAdTag());
                            if (this.adHtml.a(i2) || zA) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            h0.a(context2, str, strArr, trackingParams, z3, false);
                        } else {
                            Context context3 = getContext();
                            String[] strArr4 = i2 < strArr2.length ? new String[]{strArr2[i2]} : null;
                            String str2 = i2 < strArr3.length ? strArr3[i2] : null;
                            TrackingParams trackingParams2 = new TrackingParams(getAdTag());
                            long jY = AdsCommonMetaData.k().y();
                            long jX = AdsCommonMetaData.k().x();
                            boolean zA2 = this.adHtml.a(i2);
                            Boolean[] boolArr = this.adHtml.o;
                            h0.a(context3, str, strArr4, str2, trackingParams2, jY, jX, zA2, (boolArr == null || i2 < 0 || i2 >= boolArr.length) ? null : boolArr[i2], false, null);
                        }
                    } else {
                        r1Var2.getClass();
                    }
                    if (z2) {
                        Context context4 = getContext();
                        if (i2 < strArr2.length) {
                            strArr = new String[]{strArr2[i2]};
                        } else {
                            strArr = null;
                        }
                        TrackingParams trackingParams3 = new TrackingParams(getAdTag());
                        if (this.adHtml.a(i2)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        h0.a(context4, str, strArr, trackingParams3, z3, false);
                    } else {
                        Context context5 = getContext();
                        if (i2 < strArr2.length) {
                            strArr = new String[]{strArr2[i2]};
                        } else {
                            strArr = null;
                        }
                        TrackingParams trackingParams4 = new TrackingParams(getAdTag());
                        if (this.adHtml.a(i2)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        h0.a(context5, str, strArr, trackingParams4, z3, false);
                    }
                } catch (Throwable th) {
                    th = th;
                    g9.a(th);
                    return z4;
                }
                z2 = false;
            } catch (Throwable th2) {
                th = th2;
                z4 = false;
            }
        } else {
            if (strArr2.length < 1) {
                g9 g9Var2 = new g9(h9.f41040e);
                g9Var2.d = "No tracking URLs";
                g9Var2.f41002e = "adId: " + vi.a(this.adHtml.a(), "@adId@", "@adId@");
                g9Var2.a();
                return false;
            }
            boolean[] zArr2 = this.adHtml.f41301h;
            if (!(zArr2.length <= 0 ? false : zArr2[0]) || zA) {
                h0.a(getContext(), str, new String[]{strArr2[0]}, new TrackingParams(getAdTag()), this.adHtml.a(0) && !zA, false);
            } else {
                if (strArr3.length < 1) {
                    g9 g9Var3 = new g9(h9.f41040e);
                    g9Var3.d = "No package names";
                    g9Var3.f41002e = "adId: " + vi.a(this.adHtml.a(), "@adId@", "@adId@");
                    g9Var3.a();
                    return false;
                }
                Context context6 = getContext();
                String[] strArr5 = {strArr2[0]};
                String str3 = strArr3[0];
                TrackingParams trackingParams5 = new TrackingParams(getAdTag());
                long jY2 = AdsCommonMetaData.k().y();
                long jX2 = AdsCommonMetaData.k().x();
                boolean zA3 = this.adHtml.a(0);
                Boolean[] boolArr2 = this.adHtml.o;
                h0.a(context6, str, strArr5, str3, trackingParams5, jY2, jX2, zA3, (boolArr2 == null || boolArr2.length <= 0) ? null : boolArr2[0], false, null);
            }
        }
        this.webView.stopLoading();
        setClicked(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCollapse() {
        a aVar = this.mraidController;
        if (aVar == null || aVar.getState() == MraidState.LOADING) {
            return;
        }
        MraidState state = this.mraidController.getState();
        MraidState mraidState = MraidState.HIDDEN;
        if (state == mraidState) {
            return;
        }
        if (this.mraidController.getState() == MraidState.RESIZED || this.mraidController.getState() == MraidState.EXPANDED) {
            if (this.mraidController.releaseTwoPart()) {
                detachTwoPartMraidController();
            } else {
                CloseableLayout closeableLayout = this.closeableAdContainer;
                if (closeableLayout != null) {
                    closeableLayout.removeView(this.webView);
                }
                WebView webView = this.webView;
                if (webView != null) {
                    attachAdViewToContainer(webView, this.size.getWidth(), this.size.getHeight());
                }
                updateBannerView();
            }
            CloseableLayout closeableLayout2 = this.closeableAdContainer;
            if (closeableLayout2 != null && closeableLayout2.getParent() != null && (closeableLayout2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) closeableLayout2.getParent()).removeView(closeableLayout2);
            }
            this.mraidController.setState(MraidState.DEFAULT);
        } else if (this.mraidController.getState() == MraidState.DEFAULT) {
            updateBannerView();
            this.mraidController.setState(mraidState);
        }
        scheduleReloadTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCustomClose(boolean z2) {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout == null || z2 == (!closeableLayout.a())) {
            return;
        }
        this.closeableAdContainer.setCloseVisible(!z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResize() {
        a aVar = this.mraidController;
        if (aVar == null) {
            return;
        }
        dd resizeProperties = aVar.getResizeProperties();
        if (resizeProperties == null) {
            tc.a(this.webView, "requires: setResizeProperties first", "resize");
            return;
        }
        cancelReloadTask();
        if (this.mraidController.getState() == MraidState.LOADING || this.mraidController.getState() == MraidState.HIDDEN) {
            return;
        }
        if (this.mraidController.getState() == MraidState.EXPANDED) {
            tc.a(this.webView, "Not allowed to resize from an already expanded ad", "resize");
            return;
        }
        int i2 = resizeProperties.f40908a;
        int i3 = resizeProperties.f40909b;
        int i4 = resizeProperties.f40910c;
        int i5 = resizeProperties.d;
        int[] iArr = new int[2];
        this.webView.getLocationOnScreen(iArr);
        Context context = getContext();
        int iB = li.b(context, iArr[0]) + i4;
        int iRound = Math.round(iArr[1] / context.getResources().getDisplayMetrics().density) + i5;
        Rect rect = new Rect(iB, iRound, i2 + iB, i3 + iRound);
        ViewGroup topmostView = getTopmostView();
        int iRound2 = Math.round(topmostView.getWidth() / context.getResources().getDisplayMetrics().density);
        int iRound3 = Math.round(topmostView.getHeight() / context.getResources().getDisplayMetrics().density);
        int[] iArr2 = new int[2];
        topmostView.getLocationOnScreen(iArr2);
        int iRound4 = Math.round(iArr2[0] / context.getResources().getDisplayMetrics().density);
        int iRound5 = Math.round(iArr2[1] / context.getResources().getDisplayMetrics().density);
        if (!resizeProperties.f) {
            if (rect.width() > iRound2 || rect.height() > iRound3) {
                tc.a(this.webView, "Not enough room for the ad", "resize");
                return;
            }
            rect.offsetTo(clampInt(iRound4, rect.left, (iRound4 + iRound2) - rect.width()), clampInt(iRound5, rect.top, (iRound5 + iRound3) - rect.height()));
        }
        Rect rect2 = new Rect();
        try {
            CloseableLayout.ClosePosition closePositionA = CloseableLayout.ClosePosition.a(resizeProperties.f40911e);
            CloseableLayout closeableLayout = this.closeableAdContainer;
            if (closeableLayout != null) {
                closeableLayout.a(closePositionA, rect, rect2);
            }
            if (!new Rect(iRound4, iRound5, iRound2 + iRound4, iRound3 + iRound5).contains(rect2)) {
                tc.a(this.webView, "The close region to appear within the max allowed size", "resize");
                return;
            }
            if (!rect.contains(rect2)) {
                tc.a(this.webView, "The close region to appear within the max allowed size", "resize");
                return;
            }
            this.closeableAdContainer.setCloseVisible(false);
            this.closeableAdContainer.setClosePosition(closePositionA);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            layoutParams.leftMargin = rect.left - iRound4;
            layoutParams.topMargin = rect.top - iRound5;
            if (this.mraidController.getState() == MraidState.DEFAULT) {
                RelativeLayout relativeLayout = this.webViewContainer;
                if (relativeLayout != null) {
                    relativeLayout.removeView(this.webView);
                    this.webViewContainer.setVisibility(4);
                }
                this.closeableAdContainer.addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
                getAndMemoizeRootView().addView(this.closeableAdContainer, layoutParams);
            } else if (this.mraidController.getState() == MraidState.RESIZED) {
                setCloseableAdContainerLayoutParams(layoutParams);
            }
            this.closeableAdContainer.setClosePosition(closePositionA);
            this.mraidController.setState(MraidState.RESIZED);
        } catch (Exception e2) {
            tc.a(this.webView, e2.getMessage() != null ? e2.getMessage() : "", "resize");
        }
    }

    private boolean isEnoughSize() {
        return this.viewWidthDp >= ((double) this.size.getWidth()) && this.viewHeightDp >= ((double) this.size.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$loadExternalInline$0(i7 i7Var, AdUnitConfig adUnitConfig, int i2, MetaData metaData, ea eaVar) {
        Unit unit = Unit.f43263a;
        if (eaVar == null) {
            this.listener.onFailedToReceiveAd(this);
            i7Var.a(Boolean.FALSE);
            return unit;
        }
        Point adLoadingSize = getAdLoadingSize();
        s7 s7Var = (s7) eaVar;
        s7Var.f41472c = adLoadingSize.x;
        s7Var.d = adLoadingSize.y;
        s7Var.f41473e = new b(this, adLoadingSize, i7Var, adUnitConfig, i2, metaData);
        s7Var.a();
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadExternalInline$1(i7 i7Var, int i2) {
        i7 i7Var2;
        Throwable th;
        AdUnitConfig adUnitConfig;
        try {
            MetaData metaDataE = MetaData.E();
            ExternalAdConfig externalAdConfigV = metaDataE.v();
            if (externalAdConfigV != null) {
                try {
                    adUnitConfig = externalAdConfigV.getMapping().get(getAdTag());
                } catch (Throwable th2) {
                    th = th2;
                    i7Var2 = i7Var;
                }
            } else {
                adUnitConfig = null;
            }
            AdUnitConfig adUnitConfig2 = adUnitConfig;
            if (adUnitConfig2 == null) {
                i7Var.a(Boolean.FALSE);
                return;
            }
            i7Var2 = i7Var;
            try {
                ((k0) this.externalAds.a()).a(adUnitConfig2, new h(this, i7Var2, adUnitConfig2, i2, metaDataE, 0));
                return;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            i7Var2 = i7Var;
        }
        th = th;
        i7Var2.a(Boolean.FALSE);
        g9.a(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$onFailedToReceiveBanner$3(String str, Boolean bool) {
        if (!Boolean.FALSE.equals(bool)) {
            return null;
        }
        sendLoadError(str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$reload$2(String str, Boolean bool) {
        ExternalConfig externalConfigU;
        if (!Boolean.FALSE.equals(bool) || (externalConfigU = MetaData.E().u()) == null || !externalConfigU.getLoadInnerAdIfNoExternal()) {
            return null;
        }
        reloadInnerAd(str);
        return null;
    }

    private void loadExternalInline(int i2, i7 i7Var) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f41098A);
        h0.a(new RunnableC0914v(this, i7Var, i2, 8));
    }

    private void loadHtml() {
        String strA;
        r1 r1Var = this.adHtml;
        if (r1Var == null || this.webView == null || (strA = r1Var.a()) == null) {
            return;
        }
        if (!TextUtils.isEmpty(getAdTag())) {
            strA = strA.replaceAll("startapp_adtag_placeholder", getAdTag());
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.release();
            this.mraidController = null;
        }
        a aVar2 = new a(this.webView, new j(this));
        this.mraidController = aVar2;
        aVar2.init();
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f41100E);
        attachAdViewToContainer(this.webView, this.size.getWidth(), this.size.getHeight());
        getContext();
        vi.a(this.webView, strA);
        onAdLoadedToView();
    }

    private void onFailedToReceiveBanner(String str) {
        if (e7.a(true, getAdTag(), true, false)) {
            loadExternalInline(2, new i(this, str, 1));
        } else {
            sendLoadError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onImpressionSent(String str) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.G);
        Context context = getContext();
        BannerListener bannerListener = this.listener;
        w6.a("onImpression", bannerListener != null, str, null);
        h0.a(bannerListener != null ? new i1(context, bannerListener, this) : null);
        scheduleReloadTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMraidExpandDefault(FrameLayout.LayoutParams layoutParams, boolean z2) {
        if (z2) {
            CloseableLayout closeableLayout = this.closeableAdContainer;
            if (closeableLayout != null) {
                closeableLayout.addView(this.twoPartWebView, layoutParams);
            }
        } else {
            RelativeLayout relativeLayout = this.webViewContainer;
            if (relativeLayout != null) {
                relativeLayout.removeView(this.webView);
                this.webViewContainer.setVisibility(4);
            }
            CloseableLayout closeableLayout2 = this.closeableAdContainer;
            if (closeableLayout2 != null) {
                closeableLayout2.addView(this.webView, layoutParams);
            }
        }
        getAndMemoizeRootView().addView(this.closeableAdContainer, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMraidExpandResized(FrameLayout.LayoutParams layoutParams) {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.removeView(this.webView);
        }
        RelativeLayout relativeLayout = this.webViewContainer;
        if (relativeLayout != null) {
            relativeLayout.addView(this.webView, layoutParams);
            this.webViewContainer.setVisibility(4);
        }
        this.closeableAdContainer.addView(this.twoPartWebView, layoutParams);
    }

    private void onPause() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
        WebView webView2 = this.twoPartWebView;
        if (webView2 != null) {
            webView2.onPause();
        }
    }

    private void onResume() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
        WebView webView2 = this.twoPartWebView;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    private void prepareWebView(WebView webView) {
        webView.setBackgroundColor(0);
        webView.setHorizontalScrollBarEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setOnTouchListener(new c(this));
        webView.setOnLongClickListener(new p1(this));
        webView.setLongClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proceedWithImpression() {
        ag agVar = this.scheduledImpression;
        if (agVar != null) {
            agVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadImpl(String str) {
        if (this.adHtml != null) {
            Point adLoadingSize = getAdLoadingSize();
            this.adHtml.s = isFixedSize();
            r1 r1Var = this.adHtml;
            int i2 = adLoadingSize.x;
            int i3 = adLoadingSize.y;
            r1Var.f41299c = i2;
            r1Var.d = i3;
            r1Var.setState(Ad.AdState.UN_INITIALIZED);
            this.adHtml.t = getBannerType();
            ((z6) ((y6) this.eventTracer.a())).a(this, this.adHtml);
            ((z6) ((y6) this.eventTracer.a())).c(this, ii.f41099B);
            this.adHtml.load(prepareAdPreferences(), this, str);
        }
    }

    private void reloadInnerAd(String str) {
        if (!waitForFinishAdSession()) {
            reloadImpl(str);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new d(this, str), MetaData.E().N());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInfoAdRequest(boolean z2, String uuid, String originalTS, AdPreferences adPreferences, Point size, AdUnitConfig config, int i2) {
        Context context = getContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
        lb lbVar = this.httpClient;
        lb lbVar2 = this.networkApiExecutor;
        lb lbVar3 = this.eventTracer;
        lb lbVar4 = this.motionProcessor;
        ca caVar = new ca(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4);
        caVar.f40866b = z2;
        Intrinsics.f(uuid, "uuid");
        caVar.f40867c = uuid;
        Intrinsics.f(originalTS, "originalTS");
        caVar.f40868e = originalTS;
        Intrinsics.f(config, "config");
        caVar.d = config;
        Intrinsics.f(size, "size");
        caVar.f = size;
        caVar.g = Integer.valueOf(getBannerType());
        caVar.f40869h = Integer.valueOf(i2);
        caVar.f40870i = config.getSioPrice();
        new da(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4, caVar).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLoadError(String str) {
        setErrorMessage(str);
        if (this.listener == null || this.callbackSent) {
            return;
        }
        this.callbackSent = true;
        k1.a(getContext(), this.listener, (BannerBase) this, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseableAdContainerLayoutParams(FrameLayout.LayoutParams layoutParams) {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.setLayoutParams(layoutParams);
        }
    }

    private boolean setSize(int i2, int i3) {
        if (this.webView == null) {
            return false;
        }
        this.size = new BannerSize(i2, i3);
        int iA = li.a(getContext(), this.size.getWidth());
        int iA2 = li.a(getContext(), this.size.getHeight());
        this.webViewContainer.setMinimumWidth(iA);
        this.webViewContainer.setMinimumHeight(iA2);
        ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iA, iA2);
        } else {
            layoutParams.width = iA;
            layoutParams.height = iA2;
        }
        this.webView.setLayoutParams(layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupTwoPartMraidController(String str) {
        this.webViewTouched = false;
        if (this.twoPartWebView == null) {
            this.twoPartWebView = ((tk) this.webViewFactory.a()).c();
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.initTwoPart(this.twoPartWebView);
        }
        prepareWebView(this.twoPartWebView);
        this.twoPartWebView.loadUrl(str);
    }

    private void startAdSession(WebView webView) {
        try {
            startAdSessionUnsafe(webView);
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    private void startAdSessionUnsafe(WebView webView) {
        vd vdVar;
        synchronized (this.adSessionLock) {
            try {
                vdVar = this.adSession;
                if (vdVar == null) {
                    vdVar = new vd(webView);
                    this.adSession = vdVar;
                    this.sessionStarted = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AdSession adSession = vdVar.f41579a;
        if (adSession != null) {
            adSession.start();
            try {
                RelativeLayout relativeLayout = this.adInformationContatiner;
                if (relativeLayout != null) {
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                    AdSession adSession2 = vdVar.f41579a;
                    if (adSession2 != null) {
                        adSession2.addFriendlyObstruction(relativeLayout, friendlyObstructionPurpose, null);
                    }
                }
                CloseableLayout closeableLayout = this.closeableAdContainer;
                if (closeableLayout != null) {
                    FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.CLOSE_AD;
                    AdSession adSession3 = vdVar.f41579a;
                    if (adSession3 != null) {
                        adSession3.addFriendlyObstruction(closeableLayout, friendlyObstructionPurpose2, null);
                    }
                }
            } catch (RuntimeException unused) {
            }
            AdSession adSession4 = vdVar.f41579a;
            if (adSession4 != null) {
                adSession4.registerAdView(webView);
            }
            if (vdVar.f41580b != null && vdVar.f41582e.compareAndSet(false, true)) {
                vdVar.f41580b.loaded();
            }
            vdVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBannerView() {
        if (this.visible && isAdLoadedToView() && isEnoughSize()) {
            final int i2 = 0;
            h0.a(new Runnable(this) { // from class: com.startapp.sdk.ads.banner.bannerstandard.g

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public final /* synthetic */ BannerStandard f40464Y;

                {
                    this.f40464Y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f40464Y.showBannerViewImpl();
                            break;
                        default:
                            this.f40464Y.hideBannerViewImpl();
                            break;
                    }
                }
            });
        } else {
            final int i3 = 1;
            h0.a(new Runnable(this) { // from class: com.startapp.sdk.ads.banner.bannerstandard.g

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public final /* synthetic */ BannerStandard f40464Y;

                {
                    this.f40464Y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            this.f40464Y.showBannerViewImpl();
                            break;
                        default:
                            this.f40464Y.hideBannerViewImpl();
                            break;
                    }
                }
            });
        }
    }

    private boolean waitForFinishAdSession() {
        vd vdVar;
        synchronized (this.adSessionLock) {
            vdVar = this.adSession;
            this.adSession = null;
        }
        if (vdVar == null) {
            return false;
        }
        try {
            AdSession adSession = vdVar.f41579a;
            if (adSession == null) {
                return true;
            }
            adSession.finish();
            return true;
        } catch (Throwable th) {
            g9.a(th);
            return false;
        }
    }

    public void cancelScheduledImpression(String str) {
        ag agVar = this.scheduledImpression;
        if (agVar != null) {
            agVar.a(str, null);
        }
    }

    public int clampInt(int i2, int i3, int i4) {
        return Math.max(i2, Math.min(i3, i4));
    }

    public void finalize() throws Throwable {
        try {
            cancelScheduledImpression("AD_CLOSED_TOO_QUICKLY");
            waitForFinishAdSession();
        } finally {
            super.finalize();
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public Point getAdLoadingSize() {
        Point point = this.desirableSizeForManualLoading;
        return point != null ? point : super.getAdLoadingSize();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public String getBannerName() {
        return "StartApp Banner";
    }

    public int getBannerType() {
        return 0;
    }

    public String getBidToken() {
        r1 r1Var = this.adHtml;
        if (r1Var != null) {
            return vi.a(r1Var.a(), "@bidToken@", "@bidToken@");
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getHeightInDp() {
        return 50;
    }

    public int getOffset() {
        r1 r1Var = this.adHtml;
        if (r1Var == null) {
            return 0;
        }
        return r1Var.r;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public long getRefreshDelayMillis() {
        long jN;
        synchronized (this.adSessionLock) {
            try {
                jN = this.adSession != null ? MetaData.E().N() : 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jN;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getRefreshRate() {
        return this.options.i();
    }

    public WebView getTwoPartWebView() {
        return this.twoPartWebView;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public View getViewableBanner() {
        RelativeLayout relativeLayout = this.webViewContainer;
        return relativeLayout != null ? relativeLayout : super.getViewableBanner();
    }

    public WebView getWebView() {
        return this.webView;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getWidthInDp() {
        return Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, com.startapp.sdk.ads.banner.BannerInterface
    public void hideBanner() {
        this.visible = false;
        updateBannerView();
    }

    public void hideBannerViewImpl() {
        RelativeLayout relativeLayout = this.webViewContainer;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public void initRuntime() {
        try {
            Context context = getContext();
            CloseableLayout closeableLayout = new CloseableLayout(context);
            this.closeableAdContainer = closeableLayout;
            closeableLayout.setOnCloseListener(new j(this));
            this.webView = ((tk) this.webViewFactory.a()).c();
            this.options = new BannerOptions();
            if (this.adHtml == null) {
                this.adHtml = new r1(context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, getOffset());
            }
            prepareWebView(this.webView);
            this.options = BannerMetaData.c().b();
            setMinimumWidth(li.a(getContext(), this.size.getWidth()));
            setMinimumHeight(li.a(getContext(), this.size.getHeight()));
            WebView webView = this.webView;
            Context context2 = getContext();
            q1 q1Var = new q1(this);
            TrackingParams trackingParams = new TrackingParams(getAdTag());
            boolean zA = this.adHtml.a(0);
            fb fbVar = new fb(context2, q1Var, trackingParams);
            fbVar.f40964b = zA;
            webView.addJavascriptInterface(fbVar, "startappwall");
            this.webViewContainer = new RelativeLayout(getContext());
            updateBannerView();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            addView(this.webViewContainer, layoutParams);
        } catch (Throwable th) {
            g9.a(th);
            hideBanner();
            onFailedToReceiveBanner("BannerStandard.init - webview failed");
        }
    }

    public boolean isFixedSize() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public boolean isTiedToAdm() {
        r1 r1Var = this.adHtml;
        return r1Var != null && r1Var.isTiedToAdm();
    }

    public void makeImpression(boolean z2) {
        long jMax = Math.max(0L, getImpressionDelayMillis() - getTimePassedSinceAdLoadedToViewMillis());
        getContext();
        WeakHashMap weakHashMap = vi.f41589a;
        Log.println(2, "StartAppSDK", "Banner will send impression in " + jMax + " millis");
        TrackingParams trackingParams = new TrackingParams(getAdTag());
        trackingParams.a(z2);
        MraidMetadata mraidMetadataK = MetaData.E().K();
        ag agVar = new ag(getContext(), AdPreferences.Placement.INAPP_BANNER, this.adHtml.f41302i, trackingParams, jMax, z2 && mraidMetadataK != null && vi.a(mraidMetadataK.a()), this.impressionListener);
        this.scheduledImpression = agVar;
        startVisibilityRunnable(agVar);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ((z6) ((y6) this.eventTracer.a())).a((Object) this, ii.f41107e);
        super.onAttachedToWindow();
        if (this.callLoadHtmlOnAttached) {
            this.callLoadHtmlOnAttached = false;
            loadHtml();
        }
        onResume();
        if (this.defaultLoad && !isAdLoadedToView()) {
            loadBanner(null);
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.addVisibilityTracker();
        }
        if (this.webView != null) {
            synchronized (this.adSessionLock) {
                try {
                    if (this.sessionStarted) {
                        startAdSession(this.webView);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        waitForFinishAdSession();
        onPause();
        cancelViewabilityTracking();
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.H);
        ((z6) ((y6) this.eventTracer.a())).b(this, ii.f41107e);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onFailedToReceiveAd(Ad ad) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.g);
        ((z6) ((y6) this.eventTracer.a())).b(this, ii.f41106c);
        onFailedToReceiveBanner(ad != null ? ad.getErrorMessage() : null);
    }

    public boolean onMraidClickEvent(String str) {
        if (!this.webViewTouched) {
            g9 g9Var = new g9(h9.f41040e);
            g9Var.d = "fake_click";
            g9Var.g = h0.a(str, (String) null);
            g9Var.f41002e = "jsTag=" + this.jsTag;
            g9Var.a();
        }
        if ((!this.jsTag || this.webViewTouched) && str != null) {
            return handleClick(str);
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onReceiveAd(Ad ad) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f);
        ((z6) ((y6) this.eventTracer.a())).b(this, ii.f41106c);
        this.webViewTouched = false;
        removeView(this.adInformationContatiner);
        r1 r1Var = this.adHtml;
        if (r1Var == null || r1Var.a() == null || this.adHtml.a().compareTo("") == 0) {
            onFailedToReceiveBanner("No Banner received");
            return;
        }
        this.jsTag = com.p004ironsource.mediationsdk.metadata.a.g.equals(vi.a(this.adHtml.a(), "@jsTag@", "@jsTag@"));
        String strA = vi.a(this.adHtml.a(), "@width@", "@width@");
        String strA2 = vi.a(this.adHtml.a(), "@height@", "@height@");
        if (strA != null && strA2 != null) {
            try {
                if (!setSize(Integer.parseInt(strA), Integer.parseInt(strA2))) {
                    onFailedToReceiveBanner("Banner cannot be displayed (not enough room)");
                    return;
                }
            } catch (NumberFormatException unused) {
                onFailedToReceiveBanner(android.support.v4.media.a.o("Error parsing width and height from HTML: ", strA, " x ", strA2));
                return;
            } catch (Throwable th) {
                g9.a(th);
                onFailedToReceiveBanner(th.getMessage());
                return;
            }
        }
        if (isAttachedToWindow()) {
            loadHtml();
        } else {
            this.callLoadHtmlOnAttached = true;
        }
        addAdInformationLayout();
        addDisplayEventOnLoad();
        updateBannerView();
        if (this.listener == null || this.callbackSent) {
            return;
        }
        this.callbackSent = true;
        Context context = getContext();
        BannerListener bannerListener = this.listener;
        String[] strArr = this.adHtml.f41302i;
        k1.b(context, bannerListener, this, h0.a(strArr.length <= 0 ? null : strArr[0], (String) null));
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.viewWidthDp = Math.ceil(i2 / displayMetrics.density);
        this.viewHeightDp = Math.ceil(i3 / displayMetrics.density);
        updateBannerView();
    }

    public void onWebviewPageFinished(WebView webView) {
        if (MetaData.E().j0()) {
            startAdSession(webView);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            onResume();
        } else {
            onPause();
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public void reload(String str) {
        ((z6) ((y6) this.eventTracer.a())).a((Object) this, ii.f41106c);
        if (e7.a(false, getAdTag(), true, false)) {
            loadExternalInline(1, new i(this, str, 0));
        } else {
            reloadInnerAd(str);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public void scheduleReloadTask() {
        ag agVar = this.scheduledImpression;
        if (agVar == null || agVar.j.get() == 0) {
            return;
        }
        super.scheduleReloadTask();
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void setBannerListener(BannerListener bannerListener) {
        this.listener = bannerListener;
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void showBanner() {
        try {
            ((sf) this.runtimeClassDetector.a()).a(com.p004ironsource.mediationsdk.metadata.a.f25965n);
        } catch (Throwable unused) {
        }
        this.visible = true;
        updateBannerView();
    }

    public void showBannerViewImpl() {
        if (isEnoughSize()) {
            RelativeLayout relativeLayout = this.webViewContainer;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (this.adHtml != null) {
                sg sgVar = (sg) this.showIntentionsKeeper.a();
                AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                int bannerType = getBannerType();
                String strA = vi.a(this.adHtml.a(), "@adId@", "@adId@");
                if (strA != null) {
                    sgVar.f41489a.put(new rg(placement, bannerType), strA);
                }
            }
        }
    }

    public BannerStandard(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    public BannerStandard(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    public BannerStandard(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public BannerStandard(Context context, boolean z2) {
        this(context, z2, (AdPreferences) null);
    }

    public BannerStandard(Context context, boolean z2, AdPreferences adPreferences) {
        this(context, z2, adPreferences, null);
    }

    public BannerStandard(Context context, boolean z2, AdPreferences adPreferences, r1 r1Var) {
        this(context, null, 0, z2, adPreferences, r1Var);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i2, boolean z2, AdPreferences adPreferences, r1 r1Var) {
        this(context, attributeSet, i2, z2, adPreferences, r1Var, com.startapp.sdk.components.a.a(context).K, com.startapp.sdk.components.a.a(context).j, com.startapp.sdk.components.a.a(context).M, com.startapp.sdk.components.a.a(context).f40730N, com.startapp.sdk.components.a.a(context).f40735b, com.startapp.sdk.components.a.a(context).f40741n, com.startapp.sdk.components.a.a(context).f40724A, com.startapp.sdk.components.a.a(context).f40744w, com.startapp.sdk.components.a.a(context).f40736c, com.startapp.sdk.components.a.a(context).f40743u, com.startapp.sdk.components.a.a(context).f40740l, com.startapp.sdk.components.a.a(context).f40734a);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i2, boolean z2, AdPreferences adPreferences, r1 r1Var, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, lb lbVar10, lb lbVar11, lb lbVar12) {
        super(context, attributeSet, i2, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9, lbVar10, lbVar11);
        this.webViewTouched = true;
        this.jsTag = false;
        this.defaultLoad = true;
        this.visible = true;
        this.size = new BannerSize(getWidthInDp(), getHeightInDp());
        this.callbackSent = false;
        this.adInformationLayout = null;
        this.adInformationContatiner = null;
        this.adSessionLock = new Object();
        this.impressionListener = new com.startapp.sdk.ads.banner.bannerstandard.a(this);
        this.externalAds = lbVar12;
        try {
            this.defaultLoad = z2;
            this.adHtml = r1Var;
            setAdPreferences(adPreferences);
            init();
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    public BannerStandard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, true, null, null);
    }
}
