package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.media3.common.PlaybackException;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3031ki;
import com.inmobi.media.GestureDetectorOnGestureListenerC2829ci;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.media.videoPlayer.model.HtmlOmidTracker;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import formularization.attabal;
import formularization.beachfront;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import p002kotlin.text.Regex;
import p002kotlin.text.arytenoidectomy;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class GestureDetectorOnGestureListenerC2829ci extends AbstractC3364y2 implements C, F2, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, Gf, InterfaceC3105nh {
    public static final Mh e1 = new Mh();
    public static final Lh f1 = new Lh();
    public static final String g1 = GestureDetectorOnGestureListenerC2829ci.class.getSimpleName();
    public static final I1 h1 = new I1(Boolean.FALSE, new Function0() { // from class: adsuki.talweg
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(GestureDetectorOnGestureListenerC2829ci.y());
        }
    }, false, true);
    public C3324wc A;
    public final C3307vk A0;
    public boolean B;
    public boolean B0;
    public JSONObject C;
    public boolean C0;
    public JSONObject D;
    public U5 D0;
    public boolean E;
    public S5 E0;
    public boolean F;
    public String F0;
    public boolean G;
    public Ff G0;
    public boolean H;
    public L0 H0;
    public Hn I;
    public final AtomicBoolean I0;
    public boolean J;
    public boolean J0;
    public boolean K;
    public U K0;
    public String L;
    public String L0;
    public final AtomicBoolean M;
    public boolean M0;
    public final Object N;
    public xo N0;
    public final Object O;
    public boolean O0;
    public boolean P;
    public Map P0;
    public final boolean Q;
    public final Qh Q0;
    public View R;
    public final C2803bi R0;
    public WebChromeClient.CustomViewCallback S;
    public String S0;
    public int T;
    public final Th T0;
    public boolean U;
    public final Rh U0;
    public boolean V;
    public final Oh V0;
    public long W;
    public boolean W0;
    public D4 X0;
    public C3295v8 Y0;
    public boolean Z0;
    public String a0;
    public C2777ai a1;
    public final byte b;
    public final AtomicBoolean b0;
    public final Vh b1;
    public final Set c;
    public ViewTreeObserver.OnGlobalLayoutListener c0;
    public final Kh c1;
    public String d;
    public C3081mi d0;
    public vo d1;
    public final boolean e;
    public final taiyuan e0;
    public String f;
    public C2878eg f0;
    public long g;
    public final taiyuan g0;
    public final C2932gi h;
    public String h0;
    public final InterfaceC3072m9 i;
    public Map i0;
    public final Di j;
    public E2 j0;
    public final ko k;
    public C k0;
    public final C3113o0 l;
    public boolean l0;
    public final AdConfig m;
    public InterfaceC3312w0 m0;
    public volatile boolean n;
    public Fn n0;
    public volatile boolean o;
    public final boolean o0;
    public volatile boolean p;
    public int p0;
    public InterfaceC2801bg q;
    public String q0;
    public byte r;
    public int[] r0;
    public final C2933gj s;
    public long s0;
    public final taiyuan t;
    public int t0;
    public WeakReference u;
    public final Ph u0;
    public WeakReference v;
    public final Sh v0;
    public WeakReference w;
    public int w0;
    public AbstractC2880ei x;
    public int x0;
    public final attabal y;
    public C3125oc y0;
    public String z;
    public final GestureDetector z0;

    public /* synthetic */ GestureDetectorOnGestureListenerC2829ci(Context context, byte b, LinkedHashSet linkedHashSet, String str, String str2, long j, C2932gi c2932gi, InterfaceC3072m9 interfaceC3072m9, Di di, ko koVar, C3113o0 c3113o0, AdConfig adConfig, int i) {
        this(context, b, (i & 4) != 0 ? null : linkedHashSet, (i & 8) != 0 ? null : str, (i & 16) == 0, (i & 32) != 0 ? "DEFAULT" : str2, (i & 64) != 0 ? -1L : j, (i & 128) != 0 ? null : c2932gi, interfaceC3072m9, di, koVar, c3113o0, adConfig);
    }

    public static final TelemetryConfig.LandingPageConfig A() {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        return ((TelemetryConfig) Y3.a.a(TelemetryConfig.class)).getLpConfig();
    }

    public static final Ti c(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        return new Ti(gestureDetectorOnGestureListenerC2829ci.k, gestureDetectorOnGestureListenerC2829ci.i);
    }

    public static final Unit f() {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = InMobiAdActivity.l;
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.D();
        }
        return Unit.f29295attabal;
    }

    private final TelemetryConfig.LandingPageConfig getLandingPageConfig() {
        return (TelemetryConfig.LandingPageConfig) this.g0.getValue();
    }

    private final AdConfig.MraidConfig getMraidConfig() {
        return getAdConfig().getMraid();
    }

    private final C3058lk getScrollThrottler() {
        return (C3058lk) this.e0.getValue();
    }

    public static final short l(String str) {
        Intrinsics.beachfront(str);
        return Short.parseShort(str);
    }

    private final void setAdSize(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "setAdSize " + this);
        }
        L5 l5 = J5.a;
        this.p0 = (int) (J5.b() * Integer.parseInt(((String[]) new Regex("x").split(str, 0).toArray(new String[0]))[0]));
        this.s0 = ((int) (J5.b() * Integer.parseInt(((String[]) new Regex("x").split(str, 0).toArray(new String[0]))[1]))) * this.p0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    private final void setOmidViewableAd(C3332wk trackerAttr) {
        Fn fn;
        boolean z;
        Fn c3302vf;
        if (this.Z0) {
            C3295v8 c3295v8 = this.Y0;
            if (c3295v8 != null) {
                Fn viewableAd = this.n0;
                Intrinsics.beachfront(viewableAd);
                String str = this.q0;
                Intrinsics.checkNotNullParameter(this, "adContainer");
                Intrinsics.checkNotNullParameter(viewableAd, "viewableAd");
                Intrinsics.checkNotNullParameter(trackerAttr, "trackerAttr");
                Context context = (Context) c3295v8.h.get();
                if (context != null) {
                    c3295v8.i = getAdConfig().getViewability().getOmidConfig().getOmidEnabled();
                    saran saranVar = c3295v8.d;
                    Context context2 = context;
                    Ae ae = new Ae(c3295v8.d, c3295v8.c);
                    HashMap map = trackerAttr.b;
                    Object obj = map.get("customReferenceData");
                    String str2 = obj instanceof String ? (String) obj : null;
                    Object obj2 = map.get("isolateVerificationScripts");
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    Object obj3 = map.get("macros");
                    Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                    List<HtmlOmidTracker> omidTrackers = c3295v8.a.getOmidTrackers();
                    ArrayList arrayList = new ArrayList(dovishness.gintrap(omidTrackers, 10));
                    for (HtmlOmidTracker htmlOmidTracker : omidTrackers) {
                        arrayList.add(new C3402zf(htmlOmidTracker.getVendor(), htmlOmidTracker.getVerificationParams(), htmlOmidTracker.getUrl()));
                        map2 = map2;
                        context2 = context2;
                    }
                    Map map3 = map2;
                    Context context3 = context2;
                    Map mapTaiyuan = map3 == null ? seminary.taiyuan() : map3;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C3377yf c3377yf = new C3377yf(context3, this, viewableAd, saranVar, ae, new C3195r8(arrayList, mapTaiyuan, str2, str, Intrinsics.wireman(bool, Boolean.TRUE)), c3295v8.c);
                    c3295v8.p = c3377yf;
                    c3302vf = c3377yf;
                }
            }
            fn = null;
            c3302vf = fn;
        } else {
            fn = null;
            Object obj4 = trackerAttr.b.get("omidAdSession");
            InterfaceC2889f1 interfaceC2889f1 = obj4 instanceof InterfaceC2889f1 ? (InterfaceC2889f1) obj4 : null;
            if (trackerAttr.b.containsKey("deferred")) {
                Object obj5 = trackerAttr.b.get("deferred");
                Intrinsics.competently(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj5).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            Object obj6 = trackerAttr.b.get("customReferenceData");
            String str3 = obj6 instanceof String ? (String) obj6 : null;
            if (z && interfaceC2889f1 != null) {
                String str4 = this.q0;
                Cf cf = Bf.a;
                cf.getClass();
                Intrinsics.checkNotNullParameter(this, "webView");
                AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(cf.b, this, str4, str3);
                Intrinsics.checkNotNullExpressionValue(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
                C3003jf c3003jf = (C3003jf) interfaceC2889f1;
                if (adSessionContextCreateHtmlAdSessionContext != null) {
                    c3003jf.c = adSessionContextCreateHtmlAdSessionContext;
                }
            }
            if (interfaceC2889f1 != null) {
                Fn fn2 = this.n0;
                Intrinsics.beachfront(fn2);
                c3302vf = new C3302vf(this, fn2, interfaceC2889f1, this.i);
            } else {
                c3302vf = fn;
            }
        }
        if (c3302vf != null) {
            this.n0 = c3302vf;
            return;
        }
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).b(TAG, this.Z0 ? "Failed to create OMID tracked hybrid video ad." : "Did not find a OMID ad session; the IAB decorator will not be applied.");
        }
    }

    public static final boolean y() {
        ConcurrentHashMap concurrentHashMap = Ea.b;
        Context context = Ji.a;
        Intrinsics.beachfront(context);
        Ea eaA = Da.a(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter("enableImraidLogs", com.ironsource.X3.i.W);
        return eaA.a.getBoolean("enableImraidLogs", false);
    }

    public final void B() {
        Activity activity;
        if (getPlacementType() == 0) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            toString();
            if (((Activity) this.v.get()) == null) {
                int upperBoundForActivityContext = getAdConfig().getRendering().getUpperBoundForActivityContext();
                Intrinsics.checkNotNullParameter(this, "<this>");
                int i = 0;
                View view = this;
                loop0: while (true) {
                    activity = null;
                    if (view == null || i >= upperBoundForActivityContext) {
                        break;
                    }
                    Context context = view.getContext();
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break loop0;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    Object parent = view.getParent();
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                    i++;
                }
                if (activity != null) {
                    this.v = new WeakReference(activity);
                    Unit unit = Unit.f29295attabal;
                }
            }
        }
    }

    public void C() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "onImpressionFired " + this);
        }
        F();
        C3295v8 c3295v8 = this.Y0;
        if (c3295v8 != null) {
            HtmlVideoPlayerConfig htmlVideoPlayerConfig = c3295v8.j;
            C3377yf c3377yf = c3295v8.p;
            if (c3377yf != null) {
                boolean skippable = htmlVideoPlayerConfig.getSkippable();
                float skipOffset = htmlVideoPlayerConfig.getSkipOffset();
                boolean autoplay = htmlVideoPlayerConfig.getAutoplay();
                if (skippable) {
                    Ae ae = c3377yf.e;
                    if (ae != null) {
                        ae.a(skipOffset, autoplay);
                    }
                } else {
                    Ae ae2 = c3377yf.e;
                    if (ae2 != null) {
                        ae2.a(autoplay);
                    }
                }
                Ae ae3 = c3377yf.e;
                if (ae3 != null) {
                    if (ae3.e == null) {
                        InterfaceC3072m9 interfaceC3072m10 = ae3.b;
                        if (interfaceC3072m10 != null) {
                            ((C3097n9) interfaceC3072m10).a(AbstractC2863e1.f, "Failed to registerImpression: AdEvent is null");
                        }
                    } else {
                        InterfaceC3072m9 interfaceC3072m11 = ae3.b;
                        if (interfaceC3072m11 != null) {
                            ((C3097n9) interfaceC3072m11).a(AbstractC2863e1.f, "registerImpression");
                        }
                        P4.a(ae3.a, new Z0(ae3, null));
                    }
                }
            }
        }
        getListener().a(getTelemetryOnAdImpression());
    }

    public final void D() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "onUserLandingCompleted " + this);
        }
        g("window.imraid.broadcastEvent('onUserLandingCompleted');");
    }

    public final void E() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "processUnload " + this);
        }
        if (this.M.get()) {
            InterfaceC3072m9 interfaceC3072m10 = this.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).b(TAG2, "unload called on destroyed view");
                return;
            }
            return;
        }
        if (!z()) {
            InterfaceC3072m9 interfaceC3072m11 = this.i;
            if (interfaceC3072m11 != null) {
                String TAG3 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3097n9) interfaceC3072m11).b(TAG3, "mraid 3.0 is not enabled");
                return;
            }
            return;
        }
        if (this.C0) {
            InterfaceC3072m9 interfaceC3072m12 = this.i;
            if (interfaceC3072m12 != null) {
                String TAG4 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C3097n9) interfaceC3072m12).b(TAG4, "unload called on failed view");
                return;
            }
            return;
        }
        if (this.O0) {
            return;
        }
        this.O0 = true;
        Wb wb = (Wb) AbstractC3119o6.e.getValue();
        Runnable runnable = new Runnable() { // from class: adsuki.kinesic
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC2829ci.a(this.f3501kowloon);
            }
        };
        wb.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb.a.post(runnable);
    }

    public final void F() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "recordContextualData " + this);
        }
        D4 d4 = this.X0;
        if (d4 != null) {
            d4.a();
        }
    }

    public final void G() {
        String str;
        C3287v0 c3287v0;
        String str2;
        String str3;
        String str4;
        C3287v0 c3287v1;
        String str5;
        C3164q1 c3164q1;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "sendTelemetryEventForNetworkLoad " + this);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            linkedHashMap.put("creativeId", creativeId);
        }
        String impressionId = getImpressionId();
        if (impressionId != null) {
            linkedHashMap.put("impressionId", impressionId);
        }
        linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(this.B0 ? (short) 2212 : (short) 2211));
        C2932gi c2932gi = this.h;
        if (c2932gi != null && (c3164q1 = c2932gi.j) != null) {
            linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - c3164q1.a.c));
        }
        C2932gi c2932gi2 = this.h;
        if (c2932gi2 != null && (c3287v1 = c2932gi2.a) != null && (str5 = c3287v1.f) != null) {
            linkedHashMap.put("plType", str5);
        }
        C2932gi c2932gi3 = this.h;
        if (c2932gi3 != null && (str4 = c2932gi3.f) != null) {
            linkedHashMap.put("creativeType", str4);
        }
        C2932gi c2932gi4 = this.h;
        if (c2932gi4 != null && (str3 = c2932gi4.b) != null) {
            linkedHashMap.put("markupType", str3);
        }
        C2932gi c2932gi5 = this.h;
        if (c2932gi5 != null && (c3287v0 = c2932gi5.a) != null && (str2 = c3287v0.e) != null) {
            linkedHashMap.put("adType", str2);
        }
        C2932gi c2932gi6 = this.h;
        if (c2932gi6 != null && (str = c2932gi6.d) != null) {
            linkedHashMap.put("metadataBlob", str);
        }
        C2932gi c2932gi7 = this.h;
        if (c2932gi7 != null) {
            linkedHashMap.put("isRewarded", Boolean.valueOf(c2932gi7.h));
        }
        a("NetworkLoadLimitExceeded", (HashMap) linkedHashMap);
    }

    public final void H() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "setCurrentPosition " + this);
        }
        this.D = new JSONObject();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        try {
            JSONObject jSONObject = this.D;
            if (jSONObject != null) {
                jSONObject.put("x", F3.b(iArr[0] / J5.b()));
            }
            JSONObject jSONObject2 = this.D;
            if (jSONObject2 != null) {
                jSONObject2.put("y", F3.b(iArr[1] / J5.b()));
            }
            int iB = F3.b(getWidth() / J5.b());
            int iB2 = F3.b(getHeight() / J5.b());
            JSONObject jSONObject3 = this.D;
            if (jSONObject3 != null) {
                jSONObject3.put("width", iB);
            }
            JSONObject jSONObject4 = this.D;
            if (jSONObject4 != null) {
                jSONObject4.put("height", iB2);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.O) {
            this.F = false;
            this.O.notifyAll();
            Unit unit = Unit.f29295attabal;
        }
    }

    public final void I() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "setDefaultPosition " + this);
        }
        int[] iArr = new int[2];
        this.C = new JSONObject();
        if (this.w == null) {
            ViewParent parent = getParent();
            this.w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        WeakReference weakReference = this.w;
        if ((weakReference != null ? (ViewGroup) weakReference.get() : null) != null) {
            WeakReference weakReference2 = this.w;
            if (weakReference2 != null && (viewGroup3 = (ViewGroup) weakReference2.get()) != null) {
                viewGroup3.getLocationOnScreen(iArr);
            }
            try {
                JSONObject jSONObject = this.C;
                if (jSONObject != null) {
                    jSONObject.put("x", F3.b(iArr[0] / J5.b()));
                }
                JSONObject jSONObject2 = this.C;
                if (jSONObject2 != null) {
                    jSONObject2.put("y", F3.b(iArr[1] / J5.b()));
                }
                WeakReference weakReference3 = this.w;
                int iB = F3.b(((weakReference3 == null || (viewGroup2 = (ViewGroup) weakReference3.get()) == null) ? 0 : viewGroup2.getWidth()) / J5.b());
                WeakReference weakReference4 = this.w;
                int iB2 = F3.b(((weakReference4 == null || (viewGroup = (ViewGroup) weakReference4.get()) == null) ? 0 : viewGroup.getHeight()) / J5.b());
                JSONObject jSONObject3 = this.C;
                if (jSONObject3 != null) {
                    jSONObject3.put("width", iB);
                }
                JSONObject jSONObject4 = this.C;
                if (jSONObject4 != null) {
                    jSONObject4.put("height", iB2);
                }
            } catch (JSONException unused) {
                Unit unit = Unit.f29295attabal;
            }
        } else {
            try {
                JSONObject jSONObject5 = this.C;
                if (jSONObject5 != null) {
                    jSONObject5.put("x", 0);
                }
                JSONObject jSONObject6 = this.C;
                if (jSONObject6 != null) {
                    jSONObject6.put("y", 0);
                }
                JSONObject jSONObject7 = this.C;
                if (jSONObject7 != null) {
                    jSONObject7.put("width", 0);
                }
                JSONObject jSONObject8 = this.C;
                if (jSONObject8 != null) {
                    jSONObject8.put("height", 0);
                }
            } catch (JSONException unused2) {
                Unit unit2 = Unit.f29295attabal;
            }
        }
        synchronized (this.N) {
            this.E = false;
            this.N.notifyAll();
            Unit unit3 = Unit.f29295attabal;
        }
    }

    public final void J() {
        int webImpressionMinPercentageViewed;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "setFallbackImpressionMinPercentageViewed " + this);
        }
        if (Intrinsics.wireman("video", this.F0)) {
            webImpressionMinPercentageViewed = getAdConfig().getViewability().getVideoImpressionMinPercentageViewed();
        } else {
            webImpressionMinPercentageViewed = (Intrinsics.wireman("audio", this.F0) && Intrinsics.wireman("audio", getAdType())) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
        }
        this.x0 = webImpressionMinPercentageViewed;
    }

    public final void K() {
        int webImpressionMinTimeViewed;
        if (Intrinsics.wireman("video", this.F0)) {
            webImpressionMinTimeViewed = getAdConfig().getViewability().getVideoImpressionMinTimeViewed();
        } else {
            webImpressionMinTimeViewed = (Intrinsics.wireman("audio", this.F0) && Intrinsics.wireman("audio", getAdType())) ? getAdConfig().getViewability().getAudioImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed();
        }
        this.w0 = webImpressionMinTimeViewed;
    }

    public final void L() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "setFallbackImpressionParams " + this);
        }
        K();
        J();
        M();
    }

    public final void M() {
        byte audioImpressionType;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "setFallbackImpressionType " + this);
        }
        String adType = getAdType();
        if (Intrinsics.wireman(adType, "banner")) {
            audioImpressionType = getAdConfig().getViewability().getBannerImpressionType();
        } else {
            audioImpressionType = Intrinsics.wireman(adType, "audio") ? getAdConfig().getViewability().getAudioImpressionType() : getAdConfig().getViewability().getInterstitialImpressionType();
        }
        this.r = audioImpressionType;
    }

    public final void N() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "setImpressionParams " + this);
        }
        if (this.c == null) {
            L();
            return;
        }
        try {
            L();
            for (C3332wk c3332wk : this.c) {
                if (c3332wk.a == 2) {
                    if (c3332wk.b.containsKey("type")) {
                        Object obj = c3332wk.b.get("type");
                        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Int");
                        this.r = (byte) ((Integer) obj).intValue();
                    } else {
                        M();
                    }
                    if (c3332wk.b.containsKey("time")) {
                        Object obj2 = c3332wk.b.get("time");
                        Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.Int");
                        this.w0 = ((Integer) obj2).intValue();
                    } else {
                        K();
                    }
                    if (c3332wk.b.containsKey(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
                        Object obj3 = c3332wk.b.get(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                        Intrinsics.competently(obj3, "null cannot be cast to non-null type kotlin.Int");
                        this.x0 = ((Integer) obj3).intValue();
                    } else {
                        J();
                    }
                    if (this.r == 2) {
                        if (c3332wk.b.containsKey("pixel")) {
                            Object obj4 = c3332wk.b.get("pixel");
                            Intrinsics.competently(obj4, "null cannot be cast to non-null type kotlin.Int");
                            this.t0 = ((Integer) obj4).intValue();
                        } else {
                            M();
                        }
                        if (c3332wk.b.containsKey("frame")) {
                            Object obj5 = c3332wk.b.get("frame");
                            this.r0 = obj5 instanceof int[] ? (int[]) obj5 : null;
                        } else {
                            M();
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            InterfaceC3072m9 interfaceC3072m10 = this.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).b(TAG2, "Exception in parsing the impressionType and pixel frame");
            }
            L();
        } catch (Exception unused2) {
            InterfaceC3072m9 interfaceC3072m11 = this.i;
            if (interfaceC3072m11 != null) {
                String TAG3 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3097n9) interfaceC3072m11).b(TAG3, "SDK encountered an unexpected error in parsing impression parameters");
            }
            L();
        }
    }

    public final void O() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "setIsViewHardwareAccelerated " + this);
        }
        this.B = isHardwareAccelerated();
    }

    public final void P() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "skipFromInterActive " + this);
        }
        D4 d4 = this.X0;
        if (d4 != null) {
            d4.h();
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "skipFromInterActive");
        }
    }

    public final void Q() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "startTrackingAudioVolume " + this);
        }
        if (!z() || this.e) {
            return;
        }
        C3162q c3162q = C3162q.a;
        Ph listener = this.u0;
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        Intrinsics.checkNotNullParameter(listener, "listener");
        cutely.wireman(C3162q.g, null, null, new C3037l(interfaceC3072m10, listener, null), 3, null);
    }

    public final void R() {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci;
        Set linkedHashSet;
        Set<View> setKeySet;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "startTrackingExposure " + this);
        }
        if (!z() || this.e) {
            gestureDetectorOnGestureListenerC2829ci = this;
            InterfaceC3072m9 interfaceC3072m10 = gestureDetectorOnGestureListenerC2829ci.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).b(TAG2, "exposureTracker is already initialized");
            }
        } else {
            Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
            if (friendlyViews == null || (setKeySet = friendlyViews.keySet()) == null || (linkedHashSet = CollectionsKt.tectonization(setKeySet)) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            gestureDetectorOnGestureListenerC2829ci = this;
            gestureDetectorOnGestureListenerC2829ci.K0 = new U(gestureDetectorOnGestureListenerC2829ci, linkedHashSet, getAdConfig().getMraid3().getExposureChangeInterval(), this.v0, this.i);
        }
        U u = gestureDetectorOnGestureListenerC2829ci.K0;
        if (u != null) {
            u.a();
        }
    }

    public final void S() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "stopTrackingAudioVolume " + this);
        }
        C3162q c3162q = C3162q.a;
        Ph listener = this.u0;
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        Intrinsics.checkNotNullParameter(listener, "listener");
        cutely.wireman(C3162q.g, null, null, new C3087n(interfaceC3072m10, listener, null), 3, null);
    }

    public final void T() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "stopTrackingExposure " + this);
        }
        U u = this.K0;
        if (u != null) {
            u.b();
        }
    }

    public final void U() {
        new C3365y3(this, !this.G, !this.J, this.i).a(this.d1);
    }

    public final long V() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "timeSincePodShow " + this);
        }
        InterfaceC3312w0 interfaceC3312w0 = this.m0;
        if (interfaceC3312w0 != null) {
            return ((AbstractC3039l1) interfaceC3312w0).T();
        }
        return 0L;
    }

    public final void W() {
        getListener().e(this);
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "ad dismissed");
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).a();
        }
        L0 l0 = this.H0;
        if (l0 == null) {
            Intrinsics.preprohormone("adQualityManager");
            l0 = null;
        }
        if (l0.d.get()) {
            l0.a("session end is already triggered");
            return;
        }
        if (!l0.a.getEnabled()) {
            l0.a("config kill switch - false. ad quality will skip");
        } else if (l0.g == null) {
            l0.a("setup not done. ignore trigger");
        } else {
            l0.d.set(true);
            l0.a(false);
        }
    }

    public final void X() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "unregisterBackButtonPressedEventListener " + this);
        }
        this.L = null;
    }

    public final void Y() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "updateActivitiesOrientationProperties " + this);
        }
        Activity activity = (Activity) this.u.get();
        if (activity == null || !(activity instanceof InMobiAdActivity)) {
            return;
        }
        Ff orientationProperties = this.G0;
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        O8 o8 = ((InMobiAdActivity) activity).a;
        if (o8 == null) {
            Intrinsics.preprohormone("orientationHandler");
            o8 = null;
        }
        o8.a(orientationProperties);
    }

    public final void a(C3125oc movementGestureDetector) {
        Intrinsics.checkNotNullParameter(movementGestureDetector, "movementGestureDetector");
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(2)) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "Pan gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            JSONArray jSONArray = movementGestureDetector.j;
            Integer numValueOf = jSONArray != null ? Integer.valueOf(jSONArray.length()) : null;
            ((C3097n9) interfaceC3072m10).a(TAG2, arytenoidectomy.cutely("onPanDetected\n " + numValueOf + " \n " + movementGestureDetector.j));
        }
        g("window.imraidview.onGestureDetected('2', '" + movementGestureDetector.j + "');");
    }

    public final void b(C3125oc rotationDetector, MotionEvent initialEvent, MotionEvent endEvent) {
        Intrinsics.checkNotNullParameter(rotationDetector, "rotationDetector");
        Intrinsics.checkNotNullParameter(initialEvent, "initialEvent");
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(3)) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "Rotation gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, arytenoidectomy.cutely(" Rotation detected " + rotationDetector.i + " \n " + initialEvent + " \n " + endEvent));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONArray((Collection) adultoid.kowloon(Integer.valueOf(F3.c(initialEvent.getX())), Integer.valueOf(F3.c(initialEvent.getY())))));
        jSONArray.put(new JSONArray((Collection) adultoid.kowloon(Integer.valueOf(F3.c(initialEvent.getX(1))), Integer.valueOf(F3.c(initialEvent.getY(1))))));
        jSONArray.put(new JSONArray((Collection) adultoid.kowloon(Integer.valueOf(F3.c(endEvent.getX())), Integer.valueOf(F3.c(endEvent.getY())))));
        jSONArray.put(new JSONArray((Collection) adultoid.kowloon(Integer.valueOf(F3.c(endEvent.getX(1))), Integer.valueOf(F3.c(endEvent.getY(1))))));
        g("window.imraidview.onGestureDetected('3', '" + jSONArray + "');");
    }

    public final void d(boolean z) {
        Hn hn = z ? Hn.VISIBLE : Hn.HIDDEN;
        if (this.I != hn) {
            if (!this.P) {
                this.I = hn;
                if (z) {
                    getListener().j(this);
                }
                c(z);
                L0 l0 = this.H0;
                if (l0 != null) {
                    Hn adViewableStatus = this.I;
                    Intrinsics.checkNotNullParameter(adViewableStatus, "adViewableStatus");
                    l0.h = adViewableStatus;
                }
                o();
            }
            C3295v8 c3295v8 = this.Y0;
            if (c3295v8 == null || c3295v8.g.get() || !C3295v8.a(c3295v8, new EnumC3220s8[]{EnumC3220s8.LOADED, EnumC3220s8.PLAYING, EnumC3220s8.PAUSED}, null, null, null, 14) || c3295v8.l == z) {
                return;
            }
            c3295v8.l = z;
            if (!z) {
                if (!c3295v8.g.get() && c3295v8.k.p.isPlaying()) {
                    c3295v8.k.f();
                    N7 n7 = c3295v8.k;
                    EnumC3228sg state = EnumC3228sg.STATE_PAUSED;
                    n7.getClass();
                    Intrinsics.checkNotNullParameter(state, "state");
                    n7.t = state;
                    return;
                }
                return;
            }
            if (c3295v8.g.get()) {
                return;
            }
            N7 n8 = c3295v8.k;
            if (n8.t == EnumC3228sg.STATE_PAUSED) {
                n8.e();
                N7 n9 = c3295v8.k;
                EnumC3228sg state2 = EnumC3228sg.STATE_PLAYING;
                n9.getClass();
                Intrinsics.checkNotNullParameter(state2, "state");
                n9.t = state2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.J0) {
                InterfaceC3072m9 interfaceC3072m9 = this.i;
                if (interfaceC3072m9 != null) {
                    String TAG = g1;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C3097n9) interfaceC3072m9).b(TAG, "dispatchTouchEvent Invalid Coordinates " + event);
                }
                this.J0 = true;
            }
            return super.dispatchTouchEvent(event);
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "dispatchTouchEvent " + this);
        }
        this.A0.a(event);
        if (getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.dispatchTouchEvent(event);
    }

    public final void e() {
        int audioNetworkLoadsLimit;
        WebViewClient webViewClient;
        if (this.e) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "view is in-app browser. Using EmbeddedBrowserViewClient.");
            }
            U5 u5 = new U5("IN_CUSTOM_BROWSER", new Function0() { // from class: adsuki.hydrofracturing
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GestureDetectorOnGestureListenerC2829ci.f();
                }
            }, new Function1() { // from class: adsuki.lamplit
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC2829ci.a((JSONObject) obj);
                }
            }, new Function2() { // from class: adsuki.inswinger
                @Override // p002kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GestureDetectorOnGestureListenerC2829ci.a((String) obj, (Map) obj2);
                }
            }, this.i);
            this.D0 = u5;
            webViewClient = u5;
        } else {
            InterfaceC3072m9 interfaceC3072m10 = this.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).c(TAG2, "view is ad. Using RenderViewClient");
            }
            C2855di c2855di = new C2855di(this.d0, this.i, new Function1() { // from class: adsuki.euhemerize
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC2829ci.a(this.f3429kowloon, ((Boolean) obj).booleanValue());
                }
            });
            String adType = getAdType();
            if (Intrinsics.wireman(adType, "banner")) {
                audioNetworkLoadsLimit = getAdConfig().getRendering().getBannerNetworkLoadsLimit();
            } else {
                audioNetworkLoadsLimit = Intrinsics.wireman(adType, "audio") ? getAdConfig().getRendering().getAudioNetworkLoadsLimit() : getAdConfig().getRendering().getOtherNetworkLoadsLimit();
            }
            c2855di.b = audioNetworkLoadsLimit;
            webViewClient = c2855di;
        }
        setWebViewClient(webViewClient);
    }

    public final void g(final String value) {
        Intrinsics.checkNotNullParameter(value, "js");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "injectJavaScript " + this + " - " + value);
        }
        Intrinsics.checkNotNullParameter(value, "value");
        Wb wb = (Wb) AbstractC3119o6.e.getValue();
        Runnable runnable = new Runnable() { // from class: adsuki.arugula
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC2829ci.d(this.f3316kowloon, value);
            }
        };
        wb.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb.a.postAtFrontOfQueue(runnable);
    }

    public AdConfig getAdConfig() {
        return this.m;
    }

    public final C3113o0 getAdMetaData() {
        return this.l;
    }

    public final InterfaceC3312w0 getAdPodHandler() {
        return this.m0;
    }

    public final L0 getAdQualityManager() {
        L0 l0 = this.H0;
        if (l0 != null) {
            return l0;
        }
        Intrinsics.preprohormone("adQualityManager");
        return null;
    }

    public String getAdType() {
        return this.h0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.l0;
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    public final WeakReference<Activity> getBannerHolderActivity() {
        return this.v;
    }

    public final String getBeaconUrl() {
        return this.L0;
    }

    public final vo getCloseAssetArea() {
        return this.d1;
    }

    public final long getConfiguredArea() {
        return this.s0;
    }

    public Context getContainerContext() {
        Activity activity = (Activity) this.u.get();
        if (activity != null) {
            return activity;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public final String getContentURL() {
        return this.q0;
    }

    public final D4 getContextualDataHandler() {
        return this.X0;
    }

    public final String getCreativeID() {
        String creativeId = getCreativeId();
        return creativeId == null ? "" : creativeId;
    }

    public String getCreativeId() {
        return this.a0;
    }

    public final String getCurrentPosition() {
        String string;
        JSONObject jSONObject = this.D;
        return (jSONObject == null || (string = jSONObject.toString()) == null) ? "" : string;
    }

    public final Object getCurrentPositionMonitor() {
        return this.O;
    }

    public final int getCurrentRenderingPodAdIndex() {
        InterfaceC3312w0 interfaceC3312w0 = this.m0;
        if (interfaceC3312w0 != null) {
            return ((AbstractC3039l1) interfaceC3312w0).n(this);
        }
        return 0;
    }

    public Object getDataModel() {
        return null;
    }

    public final String getDefaultPosition() {
        String string;
        JSONObject jSONObject = this.C;
        return (jSONObject == null || (string = jSONObject.toString()) == null) ? "" : string;
    }

    public final Object getDefaultPositionMonitor() {
        return this.N;
    }

    public final S5 getEmbeddedBrowserJsCallbacks() {
        return this.E0;
    }

    public final U getExposureTracker() {
        return this.K0;
    }

    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        return this.i0;
    }

    public final Activity getFullScreenActivity() {
        return (Activity) this.u.get();
    }

    public B getFullScreenEventsListener() {
        return this.b1;
    }

    public String getImpressionId() {
        return this.d;
    }

    public final byte getImpressionType() {
        return this.r;
    }

    public final String getLandingScheme() {
        return this.f;
    }

    public final AbstractC2880ei getListener() {
        AbstractC2880ei abstractC2880ei = this.x;
        if (abstractC2880ei != null) {
            return abstractC2880ei;
        }
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "listener getter " + this);
        }
        Lh lh = f1;
        this.x = lh;
        return lh;
    }

    public final String getMCreativeType() {
        return this.F0;
    }

    public final int getMImpressionMinPercentageViewed() {
        return this.x0;
    }

    public final int getMImpressionMinTimeViewed() {
        return this.w0;
    }

    public final Fn getMViewableAd() {
        return this.n0;
    }

    public String getMarkupType() {
        return this.S0;
    }

    public final String getMarkupTypeAdUnit() {
        return this.S0;
    }

    public final C3324wc getMediaProcessor() {
        return this.A;
    }

    public final int getMinimumPixelsPainted() {
        return this.t0;
    }

    public final String getMraidJsString() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "mraidJsString getter " + this);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Ea.b;
        Ea eaA = Da.a(context, "mraid_js_store");
        Intrinsics.checkNotNullParameter("mraid_js_string", com.ironsource.X3.i.W);
        Intrinsics.checkNotNullParameter("mraid_js_string", com.ironsource.X3.i.W);
        String string = eaA.a.getString("mraid_js_string", null);
        if (string == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).a(TAG2, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){if(\"undefined\"===typeof a)throw Error(\"EventListeners constructor requires an event name\");this.event=a;this.count=0;var b=[];this.shouldRemember=-1!==[\"exposureChange\"].indexOf(a);this.lastArgs=null;this.add=function(a){b.push(a);++this.count;if(this.shouldRemember&&this.lastArgs)try{a.apply({},this.lastArgs)}catch(d){}};this.remove=function(a){var d=!1,f=this;b=b.filter(function(b){if(b=b===a)--f.count,\nd=!0;return!b});return d};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){this.shouldRemember&&(this.lastArgs=a);b.forEach(function(d){try{d.apply({},a)}catch(b){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(d){c.push(\"|\",String(d),\"|\")});return c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners(a));c[a].add(b);\"micIntensityChange\"==\na&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&window.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(d){this.log(d)}};\nthis.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==\na&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};this.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{var d=this.listeners;d[c]||(d[c]=new EventListeners(c));d[c].broadcast(b)}catch(f){}}};\nthis.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var d=arguments[c],d=JSON.parse(d);b[c]=d}else b[c]=arguments[c];d=b[1];\"success\"!=d&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);window.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;\nwindow.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){d={};d.command=a;d.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)f=arguments[c+1],null!=f&&(b[arguments[c]]=\"\"+f);d.params=b}else for(var d=this.urlScheme+\"://\"+a,f,b=!0,c=1;c<arguments.length;c+=2)f=arguments[c+1],null!=f&&(b?(d+=\"?\",b=!1):d+=\"&\",d+=arguments[c]+\"=\"+escape(f));__im__iosNativeCall.executeNativeCall(d);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(d){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(d);return!1};a.popupBlocked=function(d){a.firePopupBlockedBeacon(d)};a.zeroPad=function(d){var a=\"\";10>d&&(a+=\"0\");return a+d};a.supports=function(d){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof d)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",d)};a.useCustomClose=function(d){try{sdkController.useCustomClose(\"window.mraidview\",d)}catch(a){imraidview.showAlert(\"use CustomClose: \"+a)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(d){imraidview.showAlert(\"close: \"+d)}};a.stackCommands=function(d,a){c?b.push(d):(eval(d),a&&(c=!0))};a.setOrientationProperties=function(d){try{d?(\"undefined\"!=typeof d.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=\nd.allowOrientationChange),\"undefined\"!=typeof d.forceOrientation&&(a.orientationProperties.forceOrientation=d.forceOrientation)):d=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(b){imraidview.showAlert(\"setOrientationProperties: \"+b+\", props = \"+d)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;\na.open=function(d){\"undefined\"==typeof d&&(d=null);try{sdkController.open(\"window.mraidview\",d)}catch(a){imraidview.showAlert(\"open: \"+a)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getScreenSize: \"+d)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getMaxSize: \"+d)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\n\")\")}catch(d){imraidview.showAlert(\"getCurrentPosition: \"+d)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getDefaultPosition: \"+d)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(d){imraidview.showAlert(\"getState: \"+d)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(d){imraidview.showAlert(\"isViewable: \"+\nd)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(d){imraidview.showAlert(\"close: \"+d)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(d){return 0==this.indexOf(d)});a.playVideo=function(d){var a=\"\";null!=d&&(a=d);try{sdkController.playVideo(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"playVideo: \"+b)}};a.stringify=function(d){if(\"undefined\"===\ntypeof JSON){var b=\"\",c;if(\"undefined\"==typeof d.length)return a.stringifyArg(d);for(c=0;c<d.length;c++)0<c&&(b+=\",\"),b+=a.stringifyArg(d[c]);return b+\"]\"}return JSON.stringify(d)};a.stringifyArg=function(a){var b,c,e;c=typeof a;b=\"\";if(\"number\"===c||\"boolean\"===c)b+=args;else if(a instanceof Array)b=b+\"[\"+a+\"]\";else if(a instanceof Object){c=!0;b+=\"{\";for(e in a)null!==a[e]&&(c||(b+=\",\"),b=b+'\"'+e+'\":',c=typeof a[e],b=\"number\"===c||\"boolean\"===c?b+a[e]:\"function\"===typeof a[e]?b+'\"\"':a[e]instanceof\nObject?b+this.stringify(args[i][e]):b+'\"'+a[e]+'\"',c=!1);b+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),b=b+'\"'+a+'\"';imraidview.showAlert(\"json:\"+b);return b};getPID=function(a){var b=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(b=a.id);return b};a.storePicture=function(d){console.log(\"bridge: storePicture\");if(\"string\"!=typeof d)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+d+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",d);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+d+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,b){};a.fireMediaErrorEvent=function(a,b){};a.fireMediaTimeUpdateEvent=function(a,b,c){};a.fireMediaCloseEvent=function(a,b,c){};a.fireMediaVolumeChangeEvent=function(a,b,c){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)};a.unload=function(){try{sdkController.unload(\"window.mraidview\")}catch(a){}};a.getCurrentAppOrientation=function(){var d;switch(a.orientation){case 0:case 180:d=\"portrait\";break;case 90:case 270:d=\"landscape\";break;default:d=\"none\"}return{orientation:d,locked:!1}};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(d){try{d?this.props=d:d=null;if(\"undefined\"!=typeof d.lockOrientation&&null!=d.lockOrientation&&\"undefined\"!=typeof d.orientation&&null!=d.orientation){var b={};b.allowOrientationChange=!d.lockOrientation;b.forceOrientation=d.orientation;a.setOrientationProperties(b)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(d))}catch(c){imraidview.showAlert(\"executeNativesetExpandProperties: \"+c+\", props = \"+d)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.resizeProps=null;a.setResizeProperties=function(d){var b,c;try{b=parseInt(d.width);c=parseInt(d.height);if(isNaN(b)||isNaN(c)||1>b||1>c)throw\"Invalid\";d.width=b;d.height=c;a.resizeProps=d;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(d))}catch(e){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+\nsdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(d){imraidview.showAlert(\"resize called in bridge\")}}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var f={};f.trigger=a;f.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,f)}};b.getSdkVersionInt=function(){for(var a=imraid.getSdkVersion().split(\".\"),\nb=a.length,c=\"\",e=0;e<b;e++)c+=a[e];return parseInt(c)};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var b={};b.trigger=a;inmobi.recordEvent(136,b)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\n\"Method not supported\",\"getExpandProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getExpandProperties is deprecated\",\"getExpandProperties\");return b.getExpandProperties()};a.setExpandProperties=function(d){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setExpandProperties\"):(\"undefined\"!=typeof d&&(\"useCustomClose\"in d&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(d.useCustomClose),window.mraid.broadcastEvent(\"error\",\n\"MRAID setExpandProperties is deprecated\",\"setExpandProperties\"),b.setExpandProperties(d))};a.getResizeProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getResizeProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getResizeProperties is deprecated\",\"getResizeProperties\");return b.getResizeProperties()};a.setResizeProperties=function(a){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\n\"setResizeProperties\"):(window.mraid.broadcastEvent(\"error\",\"MRAID setResizeProperties is deprecated\",\"setResizeProperties\"),b.setResizeProperties(a))};a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=function(a){try{1083<=b.getSdkVersionInt()?\"string\"===typeof a&&\"\"!==a.trim()?b.open(a):window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"expand\"):(window.mraid.broadcastEvent(\"error\",\"MRAID expand is deprecated\",\"expand\"),\nb.expand(a))}catch(f){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(d){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof d?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(d))};a.resize=function(){try{1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"MRAID resize not supported\",\n\"resize\"):(window.mraid.broadcastEvent(\"error\",\"MRAID resize is deprecated\",\"resize\"),b.expand())}catch(a){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getVersion=function(){return\"3.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(d){\"string\"!=typeof d?a.broadcastEvent(\"error\",\n\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(d)};a.unload=function(){b.unload()};a.getCurrentAppOrientation=b.getCurrentAppOrientation;a.getLocation=function(){return null};a.getAudioVolume=b.getAudioVolume})();\n(function(){var a=window.imraidview={},b=!1,c={RESUME:\"resume\",PAUSE:\"pause\",MUTE:\"mute\",UNMUTE:\"unmute\",SHOW:\"show\",HIDE:\"hide\",SKIP:\"skip\"};a.setOrientationProperties=function(d){try{d?(\"undefined\"!=typeof d.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=d.allowOrientationChange),\"undefined\"!=typeof d.forceOrientation&&(mraidview.orientationProperties.forceOrientation=d.forceOrientation),\"undefined\"!=typeof d.direction&&(mraidview.orientationProperties.direction=\nd.direction)):d=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(b){a.showAlert(\"setOrientationProperties: \"+b+\", props = \"+d)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var c={};c.name=a;var e=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(e=e+\"_\"+b);window.imraid.broadcastEvent(e,\nc)};a.fireMediaErrorEvent=function(a,b){var c={name:\"error\"};c.code=b;var e=\"inmobi_media_\"+c.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(e=e+\"_\"+a);window.imraid.broadcastEvent(e,c)};a.fireMediaTimeUpdateEvent=function(a,b,c){var e={name:\"timeupdate\",target:{}};e.target.currentTime=b;e.target.duration=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,e)};a.saveContent=function(a,b,c){window.imraid.addEventListener(\"saveContent_\"+a,c);\nsdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",a)};a.fireGalleryImageSelectedEvent=function(a,b,c){var e=new Image;e.src=\"data:image/jpeg;base64,\"+a;e.width=b;e.height=c;window.imraid.broadcastEvent(\"galleryImageSelected\",e)};a.fireCameraPictureCatpturedEvent=function(a,b,c){var e=new Image;e.src=\"data:image/jpeg;base64,\"+\na;e.width=b;e.height=c;window.imraid.broadcastEvent(\"cameraPictureCaptured\",e)};a.fireMediaCloseEvent=function(a,b,c){var e={name:\"close\"};e.viaUserInteraction=b;e.target={};e.target.currentTime=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,e)};a.fireMediaVolumeChangeEvent=function(a,b,c){var e={name:\"volumechange\",target:{}};e.target.volume=b;e.target.muted=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+\na);window.imraid.broadcastEvent(b,e)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=function(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(d,b){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",d,b):sdkController.openExternal(\"window.imraidview\",\nd)}catch(c){a.showAlert(\"openExternal: \"+c)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",b)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};\na.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};a.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=\nfunction(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,g=\"\",e=0;e<c;e++)g+=b[e];return parseInt(g)};a.getSdkVersionInt=getSdkVersionInt;a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");if(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,g,e){window.imraid.broadcastEvent(\"error\",\n\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",JSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=\nfunction(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+c+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};\na.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,arguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):\nsdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};a.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,\nb,c){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,c)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=\ngetSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&sdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=\nfunction(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=function(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};\na.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};a.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=\nfunction(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpandInNative=function(a,b,c){try{void 0==\na||\"string\"!=typeof a?console.log(\"url called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"boolean\"!=typeof c?console.log(\"hideCloseButton called with invalid params\"):sdkController.customExpandInNative(\"window.imraidview\",a,b,c)}catch(e){}};a.customExpand=function(b,c,g,e,h){try{void 0==g||\"number\"!=typeof g?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):\nvoid 0==e||\"boolean\"!=typeof e?console.log(\"topNavBarVisible called with invalid params\"):void 0==h||\"boolean\"!=typeof h?console.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,g,e,h)}catch(k){a.showAlert(\"executeNativeCustomExpand: \"+k+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+g+\", bottomNavBarVisible = \"+h+\", topNavBarVisible = \"+e)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};\na.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=function(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=function(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",\na)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",a)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,void 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,c=void 0!=a.payload?a.payload:null;a=null;null!=\nc&&(a=mraidview.stringify(c));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(e){}};a.onUserAudioMuteInteraction=function(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=function(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=\nmraidview.getCurrentPosition(),c=b.height;return 40<=b.width&&40<=c?!0:!1}catch(g){a.showAlert(\"checkFallbackViewable: \"+g)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}};a.loadWebView=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"loadWebView: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"loadWebView: html parameter should be a string\"):sdkController.loadWebView(\"window.imraidview\",\nb,c)}catch(g){a.showAlert(\"loadWebView: \"+g)}};a.showWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"showWebView: id parameter should be a string\"):sdkController.showWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"showWebView: \"+c)}};a.sendMessage=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"sendMessage: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"sendMessage: message parameter should be a string\"):sdkController.sendMessage(\"window.imraidview\",b,c)}catch(g){a.showAlert(\"sendMessage: \"+\ng)}};a.destroyWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"destroyWebView: id parameter should be a string\"):sdkController.destroyWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"destroyWebView: \"+c)}};a.pingV2=function(b){if(\"object\"===typeof b&&null!==b)try{sdkController.pingV2(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"pingV2: \"+c)}else a.showAlert(\"pingV2: pingJson is not a valid JSON object\")};a.enableNativeGestures=function(b){try{\"boolean\"!==typeof b?a.log(\"enableNativeGestures: 'enabled' must be a boolean.\"):\nsdkController.enableNativeGestures(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableNativeGestures: \"+c)}};a.enableTouchBeginCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchBeginCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchBeginCallback: \"+c)}};a.enableTouchEndCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchEndCallback(\"window.imraidview\",\nb)}catch(c){a.showAlert(\"enableTouchEndCallback: \"+c)}};a.createVideoPlayer=function(b){try{sdkController.createVideoPlayer(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"createVideoPlayer: \"+c)}};a.updateVideoPosition=function(b){try{sdkController.updateVideoPosition(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"updateVideoPosition: \"+c)}};a.executeVideoPlayerActions=function(b,f){try{if(!Object.values(c).includes(b))throw Error(\"Invalid videoCommand\");sdkController.executeVideoPlayerActions(\"window.imraidview\",\nb,JSON.stringify(f))}catch(g){a.showAlert(\"executeVideoPlayerActions: \"+g)}};a.getPlaybackState=function(){try{return sdkController.getPlaybackState(\"window.imraidview\")}catch(b){return a.showAlert(\"getPlaybackState: \"+b),null}};a.destroyVideoPlayer=function(){try{sdkController.destroyVideoPlayer(\"window.imraidview\")}catch(b){a.showAlert(\"destroyVideoPlayer: \"+b)}}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,f,g){var e=arguments.length,h,k=null;if(3>e){if(\"function\"===typeof arguments[e-1])h=arguments[e-1];else return;k={reason:1}}else a.saveContentIDMap[c]&&(h=arguments[2],k={reason:11,url:arguments[1]});\"function\"!==!h&&(k?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,h),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(k))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,f,g)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,c){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,c)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,c,g,e){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,c,g,e)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.pingV2=b.pingV2;a.enableHitTest=b.enableHitTest;a.enableNativeGestures=b.enableNativeGestures;a.enableTouchBeginCallback=b.enableTouchBeginCallback;a.enableTouchEndCallback=b.enableTouchEndCallback;\na.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};\na.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=b.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;\na.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;a.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.customExpandInNative=b.customExpandInNative;a.impressionFired=b.impressionFired;a.getImraidVersion=\nb.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;a.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=b.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea;a.onReceviedSKANCallback=b.onReceviedSKANCallback;a.getOpenMode=b.getOpenMode;a.loadWebView=b.loadWebView;a.showWebView=b.showWebView;a.sendMessage=b.sendMessage;\na.destroyWebView=b.destroyWebView;a.createVideoPlayer=function(a){b.createVideoPlayer(a)};a.updateVideoPosition=function(a){b.updateVideoPosition(a)};a.executeVideoPlayerActions=function(a,c){b.executeVideoPlayerActions(a,c)};a.getPlaybackState=function(){return b.getPlaybackState()};a.destroyVideoPlayer=function(){b.destroyVideoPlayer()};try{a.addEventListener(\"onUserLandingCompleted\",function(){1080>b.getSdkVersionInt()&&a.broadcastEvent(\"onUserLandingInitialized\")})}catch(c){}})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(d){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var f=-1;try{f=a.indexOf(b)}catch(g){}return f};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,d,f){if(!imIsObjValid(d)||!imIsObjValid(f))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+d+\",\"+f):a+(\"&u-tap-o=\"+d+\",\"+f));return a};b.performAdClick=function(a,d){d=d||event;if(imIsObjValid(a)){var f=a.clickConfig,g=a.landingConfig;if(!imIsObjValid(f)&&!imIsObjValid(g))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var e=null,h=null,k=null,m=null,n=null,l=null,q=null,p=null;if(imIsObjValid(d))try{m=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(r){n=\nm=0}imIsObjValid(g)?imIsObjValid(f)?(l=g.url,q=g.fallbackUrl,p=g.urlType,e=f.url,h=f.pingWV,k=f.fr):(l=g.url,p=g.urlType):(l=f.url,p=f.urlType);f=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"number\"!=typeof p||null==p)p=0;e=b.appendTapParams(e,m,n);imIsObjValid(e)?!0==h?b.pingInWebView(e,k):b.ping(e,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(l))switch(imIsObjValid(e)||\n(l=b.appendTapParams(l,m,n)),p){case 1:b.openEmbedded(l);break;case 2:\"ios\"==f?b.ios.openItunesProductView(l):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+f);break;default:b.openExternal(l,q)}else b.log(\"Landing url provided is null.\")}catch(s){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,d){d=d||event;if(imIsObjValid(a)){var f=a.clickConfig,g=a.landingConfig;\nif(!imIsObjValid(f)&&!imIsObjValid(g))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var e=null,h=null,k=null,m=null,n=null;if(imIsObjValid(d))try{m=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(l){n=m=0}imIsObjValid(f)&&(e=f.url,h=f.pingWV,k=f.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=\n!0;if(0>h||1<h)h=!0;e=b.appendTapParams(e,m,n);imIsObjValid(e)?!0==h?b.pingInWebView(e,k):b.ping(e,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(g)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,d){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,d)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        }
        InterfaceC3072m9 interfaceC3072m11 = this.i;
        if (interfaceC3072m11 != null) {
            String TAG3 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C3097n9) interfaceC3072m11).a(TAG3, "Returning fetched Mraid Js string.");
        }
        return string;
    }

    public final Ff getOrientationProperties() {
        return this.G0;
    }

    public final long getPlacementId() {
        return this.W;
    }

    public byte getPlacementType() {
        return this.b;
    }

    public final HtmlVideoPlaybackState getPlaybackState() {
        C3295v8 c3295v8 = this.Y0;
        if (c3295v8 == null) {
            return null;
        }
        if (c3295v8.g.get()) {
            return new HtmlVideoPlaybackState();
        }
        if (c3295v8.q.get() == EnumC3220s8.INIT) {
            EnumC2767a8[] enumC2767a8Arr = EnumC2767a8.a;
            c3295v8.a("getVideoPlayerState", "Playback state requested before load", (String) null);
        }
        return c3295v8.k.a();
    }

    public C getReferenceContainer() {
        return this.k0;
    }

    public final C3081mi getRenderViewTelemetry() {
        return this.d0;
    }

    public final JSONArray getRenderableAdIndexes() {
        InterfaceC3312w0 interfaceC3312w0 = this.m0;
        return interfaceC3312w0 != null ? ((AbstractC3039l1) interfaceC3312w0).v() : new JSONArray();
    }

    public final AdConfig.RenderingConfig getRenderingConfig() {
        return getAdConfig().getRendering();
    }

    public final Di getRoute() {
        return this.j;
    }

    public final JSONObject getSafeArea() {
        xo xoVar = this.N0;
        if (xoVar != null) {
            Integer numF = J5.f();
            wo woVar = (numF == null && (numF = J5.g) == null) ? null : (wo) xoVar.d.get(numF);
            if (woVar != null) {
                return woVar.a();
            }
        }
        return null;
    }

    public final boolean getShouldFireLandingPageBeacons() {
        return this.M0;
    }

    public final long getShowTimeStamp() {
        InterfaceC3312w0 interfaceC3312w0 = this.m0;
        if (interfaceC3312w0 != null) {
            return ((AbstractC3039l1) interfaceC3312w0).w();
        }
        return 0L;
    }

    public final Ti getSiblingWebviewManager() {
        return (Ti) this.t.getValue();
    }

    public Map<String, C3188r1> getTelemetryManagerMap() {
        return this.P0;
    }

    public C2934gk getTelemetryOnAdImpression() {
        Map<String, C3188r1> telemetryManagerMap = getTelemetryManagerMap();
        return new C2934gk(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, this.F0, getCreativeId(), getImpressionId(), getMarkupType());
    }

    public final boolean getUnloaded() {
        return this.O0;
    }

    public final Ln getVISIBILITY_CHANGE_LISTENER() {
        return this.V0;
    }

    public View getVideoContainerView() {
        return null;
    }

    public final String getViewState() {
        return this.z;
    }

    @Override // com.inmobi.media.InterfaceC3105nh
    public long getViewTouchTimestamp() {
        return this.g;
    }

    @Override // com.inmobi.media.C
    public Fn getViewableAd() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "viewableAd getter " + this);
        }
        if (this.n0 == null) {
            this.n0 = new C9(this, new Gn(this), new C3170q7(this.r, this.F0, this.w0, this.x0, getVisibilityTrackingMinPercentage(), this.i), this.i);
            Set<C3332wk> set = this.c;
            if (set != null) {
                for (C3332wk c3332wk : set) {
                    try {
                        if (c3332wk.a == 3) {
                            setOmidViewableAd(c3332wk);
                        }
                        Unit unit = Unit.f29295attabal;
                    } catch (Exception e) {
                        InterfaceC3072m9 interfaceC3072m10 = this.i;
                        if (interfaceC3072m10 != null) {
                            String TAG2 = g1;
                            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                            ((C3097n9) interfaceC3072m10).b(TAG2, "Exception occurred while creating the HTML viewable ad : " + e.getMessage());
                            Unit unit2 = Unit.f29295attabal;
                        }
                    }
                }
            }
        }
        Fn fn = this.n0;
        Intrinsics.beachfront(fn);
        return fn;
    }

    public final int[] getViewableFrameArray() {
        return this.r0;
    }

    public final int getVisibilityTrackingMinPercentage() {
        return Intrinsics.wireman("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    public final ko getWebViewFactory() {
        return this.k;
    }

    public final uo getWindowInsetListener() {
        return this.R0;
    }

    public final C2933gj getWvStateMachine() {
        return this.s;
    }

    public final void h(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        C3081mi c3081mi = this.d0;
        if (c3081mi != null) {
            c3081mi.b();
        }
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "loadDataInWebView " + this);
        }
        this.P = false;
        if (this.M.get()) {
            return;
        }
        loadDataWithBaseURL("", content, "text/html", com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME, null);
    }

    public final void i() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "deferredDestroy " + this);
        }
        super.destroy();
    }

    public final void j() throws JSONException {
        if (this.M.get()) {
            return;
        }
        if (!this.H) {
            this.H = true;
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.c0;
        if (onGlobalLayoutListener != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.c0 = null;
        }
        this.M.set(true);
        this.k.a(this.j.b);
        xo xoVar = this.N0;
        if (xoVar != null) {
            xoVar.a();
        }
        D4 d4 = this.X0;
        if (d4 != null) {
            d4.b();
        }
        this.P = true;
        this.T = -1;
        C3295v8 c3295v8 = this.Y0;
        if (c3295v8 != null) {
            InterfaceC3072m9 interfaceC3072m9 = c3295v8.c;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("HybridVideoPlayerHandler", "destroy");
            }
            c3295v8.a();
            C3377yf c3377yf = c3295v8.p;
            if (c3377yf != null) {
                InterfaceC3072m9 interfaceC3072m10 = c3377yf.g;
                if (interfaceC3072m10 != null) {
                    Intrinsics.checkNotNullExpressionValue("yf", "TAG");
                    ((C3097n9) interfaceC3072m10).c("yf", "stopOmidSession");
                }
                Ae ae = c3377yf.e;
                if (ae != null) {
                    if (ae.c == null) {
                        InterfaceC3072m9 interfaceC3072m11 = ae.b;
                        if (interfaceC3072m11 != null) {
                            ((C3097n9) interfaceC3072m11).a(AbstractC2863e1.f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC3072m9 interfaceC3072m12 = ae.b;
                        if (interfaceC3072m12 != null) {
                            ((C3097n9) interfaceC3072m12).a(AbstractC2863e1.f, "stopAdSession");
                        }
                        AdSession adSession = ae.c;
                        if (adSession != null) {
                            adSession.finish();
                        }
                        ae.c = null;
                    }
                }
            }
            c3295v8.p = null;
            F3.a(c3295v8.d);
        }
        this.Y0 = null;
        removeJavascriptInterface("sdkController");
        C3324wc c3324wc = this.A;
        if (c3324wc != null) {
            C2771ac c2771ac = c3324wc.d;
            if (c2771ac != null) {
                c2771ac.a();
            }
            c3324wc.d = null;
            C2771ac c2771ac2 = c3324wc.e;
            if (c2771ac2 != null) {
                c2771ac2.a();
            }
            c3324wc.e = null;
            C2771ac c2771ac3 = c3324wc.f;
            if (c2771ac3 != null) {
                c2771ac3.a();
            }
            c3324wc.f = null;
        }
        this.u.clear();
        this.v.clear();
        WeakReference weakReference = this.w;
        if (weakReference != null) {
            weakReference.clear();
        }
        Fn fn = this.n0;
        if (fn != null) {
            fn.d();
        }
        Fn fn2 = this.n0;
        if (fn2 != null) {
            fn2.a();
        }
        C2878eg c2878eg = this.f0;
        if (c2878eg != null) {
            F8 f8 = Uf.b;
            if (f8 != null) {
                String id = c2878eg.c;
                Intrinsics.checkNotNullParameter(id, "id");
                f8.b.remove(id);
                Iterator it = f8.b.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                        it.remove();
                    }
                }
            }
            C3143p5 c3143p5 = Uf.c;
            if (c3143p5 != null) {
                String id2 = c2878eg.c;
                Intrinsics.checkNotNullParameter(id2, "id");
                c3143p5.b.remove(id2);
                Iterator it2 = c3143p5.b.entrySet().iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                    if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                        it2.remove();
                    }
                }
            }
            c2878eg.d.set(true);
        }
        this.f0 = null;
        T();
        S();
        Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.clear();
        }
        setFriendlyViews(null);
        this.E0 = null;
        this.x = null;
        this.k0 = null;
        this.m0 = null;
        this.B0 = false;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public final void k(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "registerBackButtonPressedEventListener " + this);
        }
        this.L = str;
    }

    public void m() {
        InterfaceC3312w0 interfaceC3312w0;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "dismissCurrentViewContainer " + this);
        }
        C3324wc c3324wc = this.A;
        if (c3324wc != null) {
            C2951hc c2951hc = c3324wc.c;
            if (c2951hc != null) {
                c2951hc.b();
            }
            c3324wc.c = null;
        }
        if (Intrinsics.wireman("Default", this.z)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            boolean z = parent instanceof ViewGroup;
            if (z) {
                this.k.b(new Function1() { // from class: adsuki.ramallah
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC2829ci.c((C3031ki) obj);
                    }
                });
            }
            if (1 == this.b) {
                n();
            } else if (z) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        if (this.I != Hn.VISIBLE || (interfaceC3312w0 = this.m0) == null) {
            return;
        }
        interfaceC3312w0.a(this, getFullScreenActivity());
    }

    public final void n() {
        Activity fullScreenActivity;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "finishFullScreenActivity " + this);
        }
        SparseArray sparseArray = InMobiAdActivity.k;
        Intrinsics.checkNotNullParameter(this, "container");
        InMobiAdActivity.k.remove(hashCode());
        if (getFullScreenActivity() == null) {
            if (Intrinsics.wireman("Default", this.z)) {
                setAndUpdateViewState("Hidden");
            }
            W();
            return;
        }
        InterfaceC3312w0 interfaceC3312w0 = this.m0;
        if (interfaceC3312w0 == null || !interfaceC3312w0.a(this)) {
            Activity fullScreenActivity2 = getFullScreenActivity();
            Intrinsics.competently(fullScreenActivity2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            ((InMobiAdActivity) fullScreenActivity2).e = true;
            Activity fullScreenActivity3 = getFullScreenActivity();
            if (fullScreenActivity3 != null) {
                fullScreenActivity3.finish();
            }
            if (this.T == -1 || (fullScreenActivity = getFullScreenActivity()) == null) {
                return;
            }
            fullScreenActivity.overridePendingTransition(0, this.T);
        }
    }

    public final void o() {
        L0 l0;
        AdQualityControl adQualityControl;
        Activity activity;
        L0 l1;
        AdQualityControl adQualityControl2;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireAQSession - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
        }
        if (!Intrinsics.wireman(getAdType(), "int") || Build.VERSION.SDK_INT < 29 || (activity = (Activity) this.u.get()) == null) {
            L0 l2 = this.H0;
            if (l2 == null) {
                Intrinsics.preprohormone("adQualityManager");
                l0 = null;
            } else {
                l0 = l2;
            }
            l0.getClass();
            Intrinsics.checkNotNullParameter(this, "adView");
            if (!l0.a()) {
                l0.a("session state invalid");
                return;
            }
            l0.a("session start trigger...");
            l0.c.set(true);
            AdQualityControl adQualityControl3 = l0.g;
            if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl = l0.g) == null) {
                return;
            }
            l0.a(this, (long) (adQualityControl.getScreenshotDelayInSeconds() * 1000), false, (Qh) null);
            return;
        }
        L0 l3 = this.H0;
        if (l3 == null) {
            Intrinsics.preprohormone("adQualityManager");
            l1 = null;
        } else {
            l1 = l3;
        }
        l1.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!l1.a()) {
            l1.a("session state invalid");
            return;
        }
        l1.a("session start trigger...");
        l1.c.set(true);
        AdQualityControl adQualityControl4 = l1.g;
        if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl2 = l1.g) == null) {
            return;
        }
        l1.a(activity, (long) (adQualityControl2.getScreenshotDelayInSeconds() * 1000), false, (Qh) null);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Gh gh;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "onAttachedToWindow " + this);
        }
        super.onAttachedToWindow();
        if (!this.e) {
            if (Intrinsics.wireman(this.j.b, BuildConfig.FLAVOR)) {
                getListener().d(this);
            }
            if (getAdConfig().getRendering().getEnableActivityContextOnBannerAttach()) {
                B();
            }
        }
        C3324wc c3324wc = this.A;
        if (c3324wc != null) {
            C2771ac c2771ac = c3324wc.d;
            if (c2771ac != null) {
                c2771ac.b();
            }
            C2771ac c2771ac2 = c3324wc.e;
            if (c2771ac2 != null) {
                c2771ac2.b();
            }
            C2771ac c2771ac3 = c3324wc.f;
            if (c2771ac3 != null) {
                c2771ac3.b();
            }
        }
        O();
        if (this.w == null) {
            ViewParent parent = getParent();
            this.w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        U();
        R();
        Q();
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        InterfaceC3072m9 interfaceC3072m11 = this.i;
        if (interfaceC3072m11 == null || (gh = ((C3097n9) interfaceC3072m11).a) == null) {
            return;
        }
        gh.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "onDetachedFromWindow " + this);
        }
        U5 u5 = this.D0;
        if (u5 != null) {
            U5.a(u5, 8, true, null, 12);
        }
        C3324wc c3324wc = this.A;
        if (c3324wc != null) {
            C2771ac c2771ac = c3324wc.d;
            if (c2771ac != null) {
                c2771ac.a();
            }
            C2771ac c2771ac2 = c3324wc.e;
            if (c2771ac2 != null) {
                c2771ac2.a();
            }
            C2771ac c2771ac3 = c3324wc.f;
            if (c2771ac3 != null) {
                c2771ac3.a();
            }
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "Detached from window");
        }
        L0 l0 = this.H0;
        if (l0 == null) {
            Intrinsics.preprohormone("adQualityManager");
            l0 = null;
        }
        if (l0.d.get()) {
            l0.a("session end is already triggered");
        } else if (!l0.a.getEnabled()) {
            l0.a("config kill switch - false. ad quality will skip");
        } else if (l0.g == null) {
            l0.a("setup not done. ignore trigger");
        } else {
            l0.d.set(true);
            l0.a(false);
        }
        if (this.I0.get()) {
            cutely.wireman(A9.c, null, null, new Wh(this, null), 3, null);
        }
        U();
        T();
        S();
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e) {
            InterfaceC3072m9 interfaceC3072m11 = this.i;
            if (interfaceC3072m11 != null) {
                String TAG3 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3097n9) interfaceC3072m11).b(TAG3, "Detaching WebView from window encountered an error ( " + e.getMessage() + " )");
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "DoubleTap gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(1)) {
            InterfaceC3072m9 interfaceC3072m10 = this.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).c(TAG2, "Double tap gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3072m9 interfaceC3072m11 = this.i;
        if (interfaceC3072m11 != null) {
            String TAG3 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C3097n9) interfaceC3072m11).a(TAG3, "onDoubleTapEvent detected \n " + e);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (e.getAction() == 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(F3.c(e.getX()));
                jSONArray.put(F3.c(e.getY()));
            } catch (JSONException e2) {
                InterfaceC3072m9 interfaceC3072m12 = this.i;
                if (interfaceC3072m12 != null) {
                    String TAG4 = g1;
                    Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                    ((C3097n9) interfaceC3072m12).a(TAG4, "Exception in onDoubleTap", e2);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            g("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (!this.n) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "Fling gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(6)) {
            InterfaceC3072m9 interfaceC3072m10 = this.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).c(TAG2, "fling gesture is disabled from config");
            }
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) adultoid.kowloon(Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY())))));
            jSONArray.put(new JSONArray((Collection) adultoid.kowloon(Integer.valueOf(F3.c(e2.getX())), Integer.valueOf(F3.c(e2.getY())))));
            jSONArray.put(new JSONArray((Collection) adultoid.kowloon(Float.valueOf(f), Float.valueOf(f2))));
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m11 = this.i;
            if (interfaceC3072m11 != null) {
                String TAG3 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3097n9) interfaceC3072m11).a(TAG3, "Exception in onFling", e);
            }
        }
        g("window.imraidview.onGestureDetected('6', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "Long Press gesture is disabled via enableNativeGestures API");
                return;
            }
            return;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(5)) {
            InterfaceC3072m9 interfaceC3072m10 = this.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).c(TAG2, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m11 = this.i;
        if (interfaceC3072m11 != null) {
            String TAG3 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C3097n9) interfaceC3072m11).a(TAG3, "onLongPress detected \n " + e);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(e.getX()));
            jSONArray.put(F3.c(e.getY()));
        } catch (JSONException e2) {
            InterfaceC3072m9 interfaceC3072m12 = this.i;
            if (interfaceC3072m12 != null) {
                String TAG4 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C3097n9) interfaceC3072m12).a(TAG4, "Exception in onLongPress", e2);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (this.e && !this.V) {
            this.V = true;
            SparseArray sparseArray = InMobiAdActivity.k;
            e1.getClass();
            JSONObject jsonObject = Mh.a("IN_CUSTOM_BROWSER", "onScroll");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = InMobiAdActivity.l;
            if (gestureDetectorOnGestureListenerC2829ci != null) {
                gestureDetectorOnGestureListenerC2829ci.c(jsonObject);
            }
            return false;
        }
        if (!this.n) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "Scroll gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "onScroll detected \n " + motionEvent + " \n " + e2);
        }
        if (!this.e) {
            C3058lk scrollThrottler = getScrollThrottler();
            scrollThrottler.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - scrollThrottler.b < scrollThrottler.a) {
                scrollThrottler.b = jElapsedRealtime;
            } else {
                scrollThrottler.b = jElapsedRealtime;
                if (getRenderingConfig().getSupportedGestures().contains(8)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) adultoid.kowloon(Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY())))));
                        jSONArray.put(new JSONArray((Collection) adultoid.kowloon(Integer.valueOf(F3.c(e2.getX())), Integer.valueOf(F3.c(e2.getY())))));
                    } catch (Exception e) {
                        InterfaceC3072m9 interfaceC3072m11 = this.i;
                        if (interfaceC3072m11 != null) {
                            String TAG3 = g1;
                            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                            ((C3097n9) interfaceC3072m11).a(TAG3, "Exception in onScroll", e);
                        }
                    }
                    g("window.imraidview.onGestureDetected('8', '" + jSONArray + "');");
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "SingleTapConfirmed gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(0)) {
            InterfaceC3072m9 interfaceC3072m10 = this.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).c(TAG2, "Click gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3072m9 interfaceC3072m11 = this.i;
        if (interfaceC3072m11 != null) {
            String TAG3 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C3097n9) interfaceC3072m11).a(TAG3, "onSingleTapConfirmed detected \n " + e);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(e.getX()));
            jSONArray.put(F3.c(e.getY()));
        } catch (JSONException e2) {
            InterfaceC3072m9 interfaceC3072m12 = this.i;
            if (interfaceC3072m12 != null) {
                String TAG4 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C3097n9) interfaceC3072m12).a(TAG4, "Exception in onSingleTapConfirmed", e2);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "onSingleTapUp detected \n " + e);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "onSizeChanged " + this);
        }
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "onSizeChanged (" + i + ", " + i2 + ")");
        }
        if (i == 0 || i2 == 0) {
            return;
        }
        a(F3.b(i / J5.b()), F3.b(i2 / J5.b()));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.J0) {
                InterfaceC3072m9 interfaceC3072m9 = this.i;
                if (interfaceC3072m9 != null) {
                    String TAG = g1;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C3097n9) interfaceC3072m9).b(TAG, "onTouchEvent Invalid Coordinates " + event);
                }
                this.J0 = true;
            }
            return super.onTouchEvent(event);
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "onTouchEvent " + this);
        }
        if (!getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.onTouchEvent(event);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "onWindowFocusChanged " + this + " - " + z);
        }
        super.onWindowFocusChanged(z);
        if (z) {
            if (isShown()) {
                C3095n7 c3095n7 = C3170q7.k;
                if (c3095n7.b(this, this, this.x0) && c3095n7.a(this, this, this.x0)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity == null || !fullScreenActivity.isInMultiWindowMode()) {
            d(z);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "onWindowVisibilityChanged " + this + " " + i);
        }
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        boolean z2 = i == 0;
        if (z2) {
            int visibilityTrackingMinPercentage = getVisibilityTrackingMinPercentage();
            if (isShown()) {
                C3095n7 c3095n7 = C3170q7.k;
                if (c3095n7.b(this, this, visibilityTrackingMinPercentage) && c3095n7.a(this, this, visibilityTrackingMinPercentage)) {
                    z = true;
                }
            }
        } else {
            z = z2;
        }
        d(z);
    }

    public final void p() {
        if (this.O0) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).a(TAG, "fireAdFailed " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        this.C0 = true;
        C3081mi c3081mi = this.d0;
        if (c3081mi != null) {
            Map mapA = c3081mi.a();
            long j = c3081mi.c;
            saran saranVar = AbstractC2984il.a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String strA = c3081mi.a("FireAdFailed");
            Wj wj = Wj.a;
            Wj.b(strA, mapA, EnumC2779ak.SDK);
        }
        getListener().h(this);
    }

    public final void q() {
        if (this.M.get()) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).b(TAG, "fireAdReady called on destroyed view");
                return;
            }
            return;
        }
        if (this.O0) {
            InterfaceC3072m9 interfaceC3072m10 = this.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).a(TAG2, "fireAdReady " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        C3081mi c3081mi = this.d0;
        if (c3081mi != null) {
            Map mapA = c3081mi.a();
            long j = c3081mi.c;
            saran saranVar = AbstractC2984il.a;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            mapA.put("latency", Long.valueOf(jElapsedRealtime));
            c3081mi.h = jElapsedRealtime;
            String strA = c3081mi.a("FireAdReady");
            Wj wj = Wj.a;
            Wj.b(strA, mapA, EnumC2779ak.SDK);
        }
        InterfaceC3072m9 interfaceC3072m11 = this.i;
        if (interfaceC3072m11 != null) {
            String TAG3 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C3097n9) interfaceC3072m11).a(TAG3, "fireAdReady " + this);
        }
        this.B0 = true;
        if (this.r == 0) {
            u();
        }
        cutely.wireman(A9.c, null, null, new Zh(this, null), 3, null);
        getListener().i(this);
    }

    public final void r() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireBackButtonPressedEvent " + this);
        }
        String str = this.L;
        if (str != null) {
            a(str, "broadcastEvent('backButtonPressed')");
        }
    }

    public final void s() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireClickTrackers " + this);
        }
        D4 d4 = this.X0;
        if (d4 != null) {
            d4.f();
        }
        v();
        getListener().b(this);
    }

    public final void setAdPodHandler(InterfaceC3312w0 interfaceC3312w0) {
        this.m0 = interfaceC3312w0;
    }

    public void setAdType(String str) {
        this.h0 = str;
    }

    public final void setAllowAutoRedirection(boolean z) {
        this.l0 = z;
    }

    public final void setAndUpdateViewState(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "setAndUpdateViewState " + this);
        }
        this.z = state;
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "set state:" + this.z);
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = state.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        e(lowerCase);
    }

    public final void setBackButtonDisabled(boolean z) {
        this.K = z;
    }

    public final void setBannerHolderActivity(WeakReference<Activity> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.v = weakReference;
    }

    public final void setBeaconUrl(String str) {
        this.L0 = str;
    }

    public final void setBlobProvider(E2 e2) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "setBlobProvider " + this);
        }
        this.j0 = e2;
    }

    public final void setCloseAssetArea(vo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.W0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!F3.a(context)) {
                return;
            }
        }
        this.d1 = new vo(0, value.b, value.c, 0);
    }

    public final void setConfiguredArea(long j) {
        this.s0 = ((long) getWidth()) * ((long) getHeight());
    }

    public final void setContentURL(String str) {
        this.q0 = str;
    }

    public final void setContextualDataHandler(D4 d4) {
        this.X0 = d4;
    }

    public void setCreativeId(String str) {
        this.a0 = str;
    }

    public final void setDisableBackButton(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "setDisableBackButton " + this);
        }
        this.K = z;
    }

    public final void setEmbeddedBrowserJsCallbacks(S5 s5) {
        this.E0 = s5;
    }

    public final void setEnableNativeGestures(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "enableNativeGestures " + this + " " + z);
        }
        boolean z2 = this.n;
        this.n = z;
        if (z && !z2) {
            if (this.y0 == null) {
                this.y0 = new C3125oc(this);
            }
        } else {
            if (z || !z2) {
                return;
            }
            this.y0 = null;
        }
    }

    public final void setEnableTouchBeginCallback(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "setEnableTouchBeginCallback " + this + " " + z);
        }
        this.p = z;
    }

    public final void setEnableTouchEndCallback(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "setEnableTouchEndCallback " + this + " " + z);
        }
        this.o = z;
    }

    public void setExitAnimation(int i) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "setExitAnimation " + this);
        }
        this.T = i;
    }

    public final void setExposureTracker(U u) {
        this.K0 = u;
    }

    public void setFriendlyViews(Map<View, FriendlyObstructionPurpose> map) {
        this.i0 = map;
    }

    public void setFullScreenActivityContext(Activity activity) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "setFullScreenActivityContext " + this);
        }
        this.u = new WeakReference(activity);
        Y();
        if (this.e || activity == null) {
            return;
        }
        xo xoVar = this.N0;
        if (xoVar != null) {
            xoVar.a();
        }
        this.N0 = new xo(activity, this.R0, this.i);
    }

    public final void setImmersiveMode(boolean z) {
        this.W0 = z;
    }

    public void setImpressionId(String str) {
        this.d = str;
    }

    public final void setLandingPageTelemetryControlInfoOnWebViewClient(Ya ya) {
        U5 u5 = this.D0;
        if (u5 != null) {
            u5.j = ya;
            u5.k = new Wa(ya, u5);
        }
    }

    public final void setLandingScheme(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f = str;
    }

    public final void setMCreativeType(String str) {
        this.F0 = str;
    }

    public final void setMImpressionMinPercentageViewed(int i) {
        this.x0 = i;
    }

    public final void setMImpressionMinTimeViewed(int i) {
        this.w0 = i;
    }

    public final void setMViewableAd(Fn fn) {
        this.n0 = fn;
    }

    public final void setMarkupTypeAdUnit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.S0 = str;
    }

    public final void setOrientationProperties(Ff ff) {
        Intrinsics.checkNotNullParameter(ff, "<set-?>");
        this.G0 = ff;
    }

    public final void setPingAckListener(InterfaceC2801bg pingAckListener) {
        Intrinsics.checkNotNullParameter(pingAckListener, "pingAckListener");
        this.q = pingAckListener;
    }

    public final void setPingManager(C2878eg pingManager) {
        Intrinsics.checkNotNullParameter(pingManager, "pingManager");
        this.f0 = pingManager;
    }

    public final void setPlacementId(long j) {
        this.W = j;
    }

    public void setReferenceContainer(C c) {
        this.k0 = c;
    }

    public final void setRenderViewEventListener(AbstractC2880ei abstractC2880ei) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "setRenderViewEventListener " + this);
        }
        this.x = abstractC2880ei;
    }

    public final void setRenderViewTelemetry(C3081mi c3081mi) {
        this.d0 = c3081mi;
    }

    public final void setScrollable(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "setScrollable " + this);
        }
        setScrollContainer(z);
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    public final void setShouldFireLandingPageBeacons(boolean z) {
        this.M0 = z;
    }

    public void setTelemetryManagerMap(Map<String, C3188r1> map) {
        this.P0 = map;
    }

    public final void setUnloaded(boolean z) {
        this.O0 = z;
    }

    public final void setUseCustomClose(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "setUseCustomClose " + this + " " + z);
        }
        this.G = z;
    }

    public void setViewTouchTimestamp(long j) {
        this.g = j;
    }

    public final void setWatermark(final WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        if (!getAdConfig().getWatermarkEnabled()) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "Watermark disabled from config. ignoring...");
                return;
            }
            return;
        }
        final byte[] bArrDecode = Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        if (!this.b0.get()) {
            this.b0.set(true);
            this.c0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: adsuki.blighty
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    GestureDetectorOnGestureListenerC2829ci.a(this.f3343kowloon, bArrDecode, watermarkData);
                }
            };
            getViewTreeObserver().addOnGlobalLayoutListener(this.c0);
        } else {
            InterfaceC3072m9 interfaceC3072m10 = this.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).c(TAG2, "Watermark layout listener already set; ignoring duplicate setWatermark call");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "stopLoading " + this);
        }
        if (this.M.get()) {
            return;
        }
        super.stopLoading();
    }

    public final void t() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireEvent " + this + " 2");
        }
    }

    public void u() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireImpression " + this);
        }
        if (Intrinsics.wireman("video", this.F0) || Intrinsics.wireman("audio", this.F0)) {
            return;
        }
        F();
        g("window.imraidview.impressionRendered();");
        getListener().c(this);
    }

    public final void v() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireOnUserInteraction " + this);
        }
        g("window.imraidview.onUserInteraction();");
    }

    public final void w() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "firePopupBlockedEvent " + this);
        }
        g("window.mraidview.popupBlocked('popupBlocked')");
    }

    public final void x() {
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "fullScreenActivity is not null and finishing");
            }
            InMobiAdActivity inMobiAdActivity = fullScreenActivity instanceof InMobiAdActivity ? (InMobiAdActivity) fullScreenActivity : null;
            if (inMobiAdActivity != null) {
                inMobiAdActivity.a();
            } else {
                fullScreenActivity.finish();
            }
        }
    }

    public final boolean z() {
        if (Intrinsics.wireman(getAdType(), "banner") && getAdConfig().getMraid3().getBannerEnabled()) {
            return true;
        }
        return Intrinsics.wireman(getAdType(), "int") && getAdConfig().getMraid3().getInterstitialEnabled();
    }

    public final void l() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "dismissCurrentIntAdViewContainerInShowNextPodFlow " + this);
        }
        C3324wc c3324wc = this.A;
        if (c3324wc != null) {
            C2951hc c2951hc = c3324wc.c;
            if (c2951hc != null) {
                c2951hc.b();
            }
            c3324wc.c = null;
        }
        if (Intrinsics.wireman("Default", this.z)) {
            setAndUpdateViewState("Hidden");
            if (getParent() instanceof ViewGroup) {
                this.k.b(new Function1() { // from class: adsuki.pact
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC2829ci.b((C3031ki) obj);
                    }
                });
            }
            SparseArray sparseArray = InMobiAdActivity.k;
            Intrinsics.checkNotNullParameter(this, "container");
            InMobiAdActivity.k.remove(hashCode());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GestureDetectorOnGestureListenerC2829ci(Context context, byte b, Set set, String str, boolean z, String landingScheme, long j, C2932gi c2932gi, InterfaceC3072m9 interfaceC3072m9, Di route, ko webViewFactory, C3113o0 c3113o0, AdConfig adConfig) {
        Kh nh;
        vo voVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        super(applicationContext);
        this.b = b;
        this.c = set;
        this.d = str;
        this.e = z;
        this.f = landingScheme;
        this.g = j;
        this.h = c2932gi;
        this.i = interfaceC3072m9;
        this.j = route;
        this.k = webViewFactory;
        this.l = c3113o0;
        this.m = adConfig;
        this.p = true;
        this.q = new Yh(this);
        this.s = new C2933gj(interfaceC3072m9);
        this.t = saneness.saneness(new Function0() { // from class: adsuki.disrupture
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC2829ci.c(this.f3412kowloon);
            }
        });
        this.u = new WeakReference(null);
        this.v = new WeakReference(null);
        this.y = beachfront.saneness(false, 1, null);
        this.z = "Default";
        this.E = true;
        this.F = true;
        this.H = true;
        this.I = Hn.UNKNOWN;
        this.M = new AtomicBoolean(false);
        this.N = new Object();
        this.O = new Object();
        this.Q = true;
        this.T = -1;
        this.W = Long.MIN_VALUE;
        this.b0 = new AtomicBoolean(false);
        this.e0 = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: adsuki.kabul
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC2829ci.b(this.f3496kowloon);
            }
        });
        this.g0 = saneness.saneness(new Function0() { // from class: adsuki.specky
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC2829ci.A();
            }
        });
        this.u0 = new Ph(this);
        this.v0 = new Sh(this);
        this.w0 = Integer.MIN_VALUE;
        this.x0 = Integer.MIN_VALUE;
        this.I0 = new AtomicBoolean(true);
        this.Q0 = new Qh(this);
        this.R0 = new C2803bi(this);
        this.S0 = "html";
        this.T0 = new Th(this, context);
        this.U0 = new Rh(this);
        this.V0 = new Oh(this);
        String TAG = g1;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
        e1.getClass();
        h1.a();
        this.k0 = this;
        this.o0 = true;
        this.G0 = new Ff();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b == 1);
        this.z0 = gestureDetector;
        this.A0 = new C3307vk(this);
        if (this.n && this.y0 == null) {
            this.y0 = new C3125oc(this);
        }
        if (c2932gi != null) {
            this.d0 = new C3081mi(c2932gi);
        }
        Jh.a(this, interfaceC3072m9);
        if (c3113o0 != null) {
            setAdType(c3113o0.a);
            this.W0 = c3113o0.b;
            this.W = c3113o0.c;
            this.l0 = c3113o0.d;
            setCreativeId(c3113o0.e);
            this.m0 = c3113o0.i;
            this.q0 = c3113o0.j;
            this.S0 = c3113o0.g;
            String str2 = c3113o0.h;
            if (str2 != null) {
                setAdSize(str2);
            }
            setTelemetryManagerMap(c3113o0.k);
            b(c3113o0.f);
        }
        this.a1 = new C2777ai(this);
        this.b1 = new Vh(this);
        if (getAdConfig().getRendering().getDisableShowCustomView()) {
            nh = new Kh(this);
        } else {
            nh = new Nh(this);
        }
        this.c1 = nh;
        if (!this.W0 && !F3.a(context)) {
            voVar = new vo(0, 0, 0, 0);
        } else {
            voVar = new vo(0, 44, 44, 0);
        }
        this.d1 = voVar;
    }

    public final void i(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "loadScript " + this);
        }
        loadUrl(str);
    }

    public final void k() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "disableHardwareAcceleration called. " + this);
        }
        try {
            setLayerType(1, null);
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
        }
    }

    public final void f(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "processUseCustomCloseRequest " + this + " " + z);
        }
        setUseCustomClose(z);
        U();
    }

    public final void c(String str, String str2) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "sendTelemetryForAutoRedirectFraud " + this + " " + str + " " + str2);
        }
        HashMap map = new HashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            map.put("creativeId", creativeId);
        }
        map.put("trigger", str);
        String impressionId = getImpressionId();
        if (impressionId != null) {
            map.put("impressionId", impressionId);
        }
        map.put("adType", str2);
        a("BlockAutoRedirection", map);
    }

    public final void h() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "completeFromInterActive " + this);
        }
        D4 d4 = this.X0;
        if (d4 != null) {
            d4.g();
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "completeFromInterActive");
        }
    }

    public final void f(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (getAdConfig().getPingV2().getEnabled()) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).a(TAG, "handlePing " + this);
            }
            if (this.f0 == null) {
                this.f0 = new C2878eg(this.q, this.d0);
            }
            C2878eg c2878eg = this.f0;
            Intrinsics.beachfront(c2878eg);
            c2878eg.getClass();
            Intrinsics.checkNotNullParameter(json, "json");
            cutely.wireman(A9.d, null, null, new C2827cg(c2878eg, json, null), 3, null);
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "pings v2 is disabled " + this);
        }
        C3081mi c3081mi = this.d0;
        if (c3081mi != null) {
            Intrinsics.checkNotNullParameter("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3081mi.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2257);
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            AbstractC3004jg.a("PingFailed", mapA);
        }
        InterfaceC2801bg interfaceC2801bg = this.q;
        Z5[] z5Arr = Z5.a;
        ((Yh) interfaceC2801bg).a("", -100, "Ping V2 is disabled from SDK config", System.currentTimeMillis(), 0);
    }

    public final void g() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "closeAll " + this);
        }
        InterfaceC3312w0 interfaceC3312w0 = this.m0;
        if (interfaceC3312w0 != null) {
            interfaceC3312w0.b();
        }
        x();
    }

    public final void c(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireViewableChange " + this + " " + z);
        }
        g("window.mraidview.broadcastEvent('viewableChange'," + z + ");");
    }

    public final void a(C3125oc movementGestureDetector, MotionEvent initialEvent, MotionEvent endEvent) {
        Intrinsics.checkNotNullParameter(movementGestureDetector, "movementGestureDetector");
        Intrinsics.checkNotNullParameter(initialEvent, "initialEvent");
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        if (!this.e && getRenderingConfig().getSupportedGestures().contains(4)) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).a(TAG, arytenoidectomy.cutely(" onScaleDetected\n " + initialEvent + " \n " + endEvent));
            }
            JSONArray jSONArray = new JSONArray();
            float f = 2;
            jSONArray.put(new JSONArray((Collection) adultoid.kowloon(Integer.valueOf(F3.c((endEvent.getX(1) + endEvent.getX()) / f)), Integer.valueOf(F3.c((endEvent.getY(1) + endEvent.getY()) / f)))));
            g("window.imraidview.onGestureDetected('4', '" + jSONArray + "');");
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).c(TAG2, "Pinch gesture is disabled from config");
        }
    }

    public static final Unit c(C3031ki it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.m();
        return Unit.f29295attabal;
    }

    public final void b(float f, float f2) {
        if (!this.o) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "Touch End is disabled via enableTouchEnd API");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "onTouchEnd detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(f));
            jSONArray.put(F3.c(f2));
        } catch (JSONException e) {
            InterfaceC3072m9 interfaceC3072m11 = this.i;
            if (interfaceC3072m11 != null) {
                String TAG3 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3097n9) interfaceC3072m11).a(TAG3, "Exception in onTouchEnd", e);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('10', '" + jSONArray2 + "');");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:75:0x0150 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r6.equals("html5video") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011b, code lost:
    
        if (r6.equals("inlineVideo") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        if (r5.B == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0124, code lost:
    
        if (r5.Q == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0126, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:
    
        r6 = r5.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0129, code lost:
    
        if (r6 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        r2 = com.inmobi.media.GestureDetectorOnGestureListenerC2829ci.g1;
        p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "TAG");
        ((com.inmobi.media.C3097n9) r6).c(r2, "HTML5 video supported:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0146, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC2829ci.m(java.lang.String):boolean");
    }

    public final void c(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "evaluateScript " + this);
        }
        evaluateJavascript(str, null);
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    public static /* synthetic */ void getCloseAssetArea$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    public static /* synthetic */ void getWindowInsetListener$annotations() {
    }

    @Override // com.inmobi.media.InterfaceC3105nh
    public final boolean c() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "canRedirectExternally Called");
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement()) {
            return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
        }
        return true;
    }

    public final void e(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireStateChange " + this + " " + str);
        }
        g("window.mraidview.broadcastEvent('stateChange','" + str + "');");
    }

    public final void c(String jsCallbackNamespace, String callback, String blob) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(blob, "blob");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "retrievedBlob");
        }
        a(jsCallbackNamespace, callback + "(" + blob + ");");
    }

    public final void e(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "processDisableCloseRegionRequest " + this + " " + z);
        }
        this.J = z;
        U();
    }

    public final void c(int i) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "showPodAdAtIndex " + this + " " + i);
        }
        if (this.I == Hn.VISIBLE && this.m0 != null && !this.M.get()) {
            InterfaceC3312w0 interfaceC3312w0 = this.m0;
            if (interfaceC3312w0 != null) {
                interfaceC3312w0.a(i, this, getFullScreenActivity());
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).b(TAG2, "Cannot show index pod ad as the current ad is not viewable");
        }
        b(false);
    }

    public final void setPreloadView(boolean z) {
    }

    public static final C3058lk b(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        return new C3058lk(gestureDetectorOnGestureListenerC2829ci.getAdConfig().getRendering().getScrollThrottleInterval());
    }

    public final void a(float f, float f2) {
        if (!this.p) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).c(TAG, "Touch Begin is disabled via enableTouchBegin API");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "onTouchBegin detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(f));
            jSONArray.put(F3.c(f2));
        } catch (JSONException e) {
            InterfaceC3072m9 interfaceC3072m11 = this.i;
            if (interfaceC3072m11 != null) {
                String TAG3 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3097n9) interfaceC3072m11).a(TAG3, "Exception in onTouchBegin", e);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('9', '" + jSONArray2 + "');");
    }

    @Override // com.inmobi.media.C
    public void b() throws JSONException {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "destroyContainer " + this);
        }
        j();
        this.k.b(new Function1() { // from class: adsuki.redevelopment
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GestureDetectorOnGestureListenerC2829ci.a((C3031ki) obj);
            }
        });
        removeAllViews();
        AdConfig.OmidConfig omidConfig = getAdConfig().getViewability().getOmidConfig();
        if (this.o0 && omidConfig.isOmidEnabled()) {
            Bf.a.getClass();
            if (Omid.isActive()) {
                new C2957hi(this, omidConfig.getWebViewRetainTime()).a();
                return;
            }
        }
        super.destroy();
    }

    public final void c(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (getLandingPageConfig().getEnableOnLpLifeCycleEvent()) {
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).a(TAG, "onLpLifeCycleEvent " + this);
            }
            g("window.imraid.broadcastEvent('onLpLifeCycleEvent', " + jsonObject + ");");
        }
    }

    public final void c(GestureDetectorOnGestureListenerC2829ci sourceView, String targetId) throws JSONException {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "fireShowWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.g("window.imraidview.broadcastEvent('webViewShown'," + jSONObject + ");");
    }

    @Override // com.inmobi.media.AbstractC3364y2
    public final Ua d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C3287v0 c3287v0;
        C3287v0 c3287v1;
        C3287v0 c3287v2;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "initLandingPageHandler " + this);
        }
        boolean z = this.e;
        String str6 = this.f;
        boolean zIsCCTEnabled = getAdConfig().getCctEnabled();
        boolean partialTabsEnabled = getAdConfig().getPartialTabsEnabled();
        C2932gi c2932gi = this.h;
        Va va = new Va(z, str6, zIsCCTEnabled, partialTabsEnabled, c2932gi != null ? c2932gi.m : null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Rh rh = this.U0;
        Za za = null;
        Th th = this.T0;
        if (!this.e) {
            C2932gi c2932gi2 = this.h;
            long j = (c2932gi2 == null || (c3287v2 = c2932gi2.a) == null) ? 0L : c3287v2.a;
            String impressionId = getImpressionId();
            String str7 = impressionId == null ? "" : impressionId;
            C2932gi c2932gi3 = this.h;
            if (c2932gi3 == null || (c3287v1 = c2932gi3.a) == null || (str = c3287v1.f) == null) {
                str = "";
            }
            if (c2932gi3 == null || (c3287v0 = c2932gi3.a) == null || (str2 = c3287v0.e) == null) {
                str2 = "";
            }
            if (c2932gi3 == null || (str3 = c2932gi3.b) == null) {
                str3 = "";
            }
            if (c2932gi3 == null || (str4 = c2932gi3.f) == null) {
                str4 = "";
            }
            za = new Za(j, str7, str, str2, str3, str4, (c2932gi3 == null || (str5 = c2932gi3.d) == null) ? "" : str5, c2932gi3 != null ? c2932gi3.h : false, this.f);
        }
        return new Ua(context, va, rh, th, this, za, this.i, new WeakReference(this));
    }

    public static final void a(GestureDetectorOnGestureListenerC2829ci renderView, byte[] bArr, WatermarkData watermarkData) {
        InterfaceC3072m9 interfaceC3072m9 = renderView.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "adding overlay to renderview");
        }
        Context context = renderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FrameLayout overlayLayout = Zn.a(context, bArr, watermarkData.getAlpha());
        Intrinsics.checkNotNullParameter(overlayLayout, "overlayLayout");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (renderView.getParent() != null) {
            ViewParent parent = renderView.getParent();
            Intrinsics.competently(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).addView(overlayLayout, 0);
        }
        renderView.getViewableAd().a(overlayLayout, FriendlyObstructionPurpose.NOT_VISIBLE);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = renderView.c0;
        if (onGlobalLayoutListener != null) {
            renderView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            renderView.c0 = null;
        }
    }

    public final void b(Df orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "handle orientationChange " + this + " " + orientation);
        }
        a(Ef.a(orientation));
    }

    public final void b(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "processMediaPlaybackRequest " + this);
        }
        if (this.O0) {
            InterfaceC3072m9 interfaceC3072m10 = this.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).b(TAG2, "Media playback is not allowed after unload! Ignoring request ...");
                return;
            }
            return;
        }
        if (1 != this.b) {
            InterfaceC3072m9 interfaceC3072m11 = this.i;
            if (interfaceC3072m11 != null) {
                String TAG3 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3097n9) interfaceC3072m11).b(TAG3, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        Activity activity = (Activity) this.u.get();
        if (activity == null) {
            InterfaceC3072m9 interfaceC3072m12 = this.i;
            if (interfaceC3072m12 != null) {
                String TAG4 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C3097n9) interfaceC3072m12).b(TAG4, "Media playback is  not allowed before it is visible! Ignoring request ...");
            }
            a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        }
        C3324wc c3324wc = this.A;
        if (c3324wc != null) {
            c3324wc.a(url, activity);
        }
    }

    public final void a(String url, String templateInfoStr, boolean z) {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci;
        Exception exc;
        Activity activity;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(templateInfoStr, "templateInfoStr");
        try {
            JSONObject jSONObject = new JSONObject(templateInfoStr);
            InterfaceC3072m9 interfaceC3072m9 = this.i;
            if (interfaceC3072m9 != null) {
                try {
                    String TAG = g1;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C3097n9) interfaceC3072m9).a(TAG, "report - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
                } catch (Exception e) {
                    exc = e;
                    gestureDetectorOnGestureListenerC2829ci = this;
                }
            }
            if (Intrinsics.wireman(getAdType(), "int") && Build.VERSION.SDK_INT >= 29 && (activity = (Activity) this.u.get()) != null) {
                taiyuan taiyuanVar = E0.a;
                try {
                    E0.a(activity, this, url, z, jSONObject, this.Q0);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    gestureDetectorOnGestureListenerC2829ci = this;
                }
            } else {
                gestureDetectorOnGestureListenerC2829ci = this;
                try {
                    taiyuan taiyuanVar2 = E0.a;
                    E0.a(gestureDetectorOnGestureListenerC2829ci, this, url, z, jSONObject, gestureDetectorOnGestureListenerC2829ci.Q0);
                    return;
                } catch (Exception e3) {
                    e = e3;
                }
            }
        } catch (Exception e4) {
            e = e4;
            gestureDetectorOnGestureListenerC2829ci = this;
        }
        exc = e;
        InterfaceC3072m9 interfaceC3072m10 = gestureDetectorOnGestureListenerC2829ci.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, "issue wile reporting ad", exc);
        }
    }

    public static final Unit b(C3031ki it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.m();
        return Unit.f29295attabal;
    }

    public final void b(int i) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "loadPodAd " + this);
        }
        if (this.I == Hn.VISIBLE && this.m0 != null && !this.M.get()) {
            InterfaceC3312w0 interfaceC3312w0 = this.m0;
            if (interfaceC3312w0 != null) {
                interfaceC3312w0.a(i, this);
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).b(TAG2, "Cannot load index pod ad as the current ad is not viewable");
        }
        a(false);
    }

    public final void a(MotionEvent motionEvent) {
        C3125oc c3125oc;
        if (this.e && !this.U) {
            this.U = true;
            SparseArray sparseArray = InMobiAdActivity.k;
            e1.getClass();
            JSONObject jsonObject = Mh.a("IN_CUSTOM_BROWSER", "onInteraction");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = InMobiAdActivity.l;
            if (gestureDetectorOnGestureListenerC2829ci != null) {
                gestureDetectorOnGestureListenerC2829ci.c(jsonObject);
            }
        }
        if (this.b == 1 && (c3125oc = this.y0) != null) {
            c3125oc.a(motionEvent);
        }
        this.z0.onTouchEvent(motionEvent);
    }

    public final void b(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "fireNextAdShowComplete " + this);
        }
        String str = "window.imraidview.broadcastEvent('adShowSuccess'," + z + ");";
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).a(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        g(str);
    }

    public final void b(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "creativeType " + this + " " + str);
        }
        this.F0 = str;
    }

    public final void a(AbstractC2880ei abstractC2880ei) {
        WatermarkData watermarkData;
        AdQualityControl adQualityControl;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "initialize " + this);
        }
        int i = Build.VERSION.SDK_INT;
        if (Intrinsics.wireman(this.S0, "htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        N();
        this.x = abstractC2880ei;
        ViewParent parent = getParent();
        this.w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        setBackgroundColor(getRenderingConfig().getWebviewBackgroundColor());
        String url = getMraidConfig().getUrl();
        int maxRetries = getMraidConfig().getMaxRetries();
        int retryInterval = getMraidConfig().getRetryInterval();
        long expiry = getMraidConfig().getExpiry();
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        C3175qc c3175qc = new C3175qc(url, maxRetries, retryInterval, expiry, interfaceC3072m10);
        if (url != null) {
            cutely.wireman(A9.c, null, null, new C3150pc(c3175qc, null), 3, null);
        } else if (interfaceC3072m10 != null) {
            String TAG2 = c3175qc.f;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).b(TAG2, "MRAID Js Url provided is invalid.");
        }
        setImportantForAccessibility(2);
        setScrollable(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(getAdConfig().getRendering().getEnableDomStorage());
        getSettings().setGeolocationEnabled(true);
        e();
        if (this.e && getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
        setWebChromeClient(this.c1);
        if (!this.e) {
            C3297va c3297va = new C3297va(this.b, this);
            InterfaceC3072m9 logger = this.i;
            if (logger != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3297va.c = logger;
            }
            addJavascriptInterface(c3297va, "sdkController");
        }
        this.A = new C3324wc(this, this.i);
        this.H0 = new L0(getAdConfig().getAdQuality(), this.i);
        if (i >= 29) {
            C2981ii c2981ii = new C2981ii(this.i, this.d0);
            Object value = AbstractC3119o6.c.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            setWebViewRenderProcessClient((ExecutorService) value, c2981ii);
        }
        C3113o0 c3113o0 = this.l;
        if (c3113o0 != null && (adQualityControl = c3113o0.n) != null) {
            L0 l0 = this.H0;
            if (l0 == null) {
                Intrinsics.preprohormone("adQualityManager");
                l0 = null;
            }
            l0.getClass();
            Intrinsics.checkNotNullParameter(adQualityControl, "adQualityControl");
            l0.a("adQuality session setup");
            if (!l0.a.getEnabled()) {
                l0.a("config kill switch while setup - false. ad quality will skip");
            } else if (l0.c.get()) {
                l0.a("session already started. skip");
            } else {
                l0.a("verifying control flags");
                String beacon = adQualityControl.getBeacon();
                if (beacon != null && beacon.length() == 0) {
                    l0.a("no beacon received. aborting...");
                    saran saranVar = E0.e;
                    if (saranVar != null) {
                        privatdozent.dern(saranVar, new CancellationException("Shutdown"));
                    }
                    E0.e = null;
                    l0.a("session end - cleanup");
                    l0.g = null;
                    l0.f.clear();
                    l0.c.set(false);
                    l0.d.set(false);
                    l0.a("ad quality session is already in progress. skipping...");
                } else {
                    l0.g = adQualityControl;
                }
            }
        }
        C3113o0 c3113o1 = this.l;
        if (c3113o1 != null && (watermarkData = c3113o1.m) != null) {
            setWatermark(watermarkData);
        }
        C3113o0 c3113o2 = this.l;
        if (c3113o2 != null ? Intrinsics.wireman(c3113o2.l, Boolean.TRUE) : false) {
            k();
        }
    }

    public final void d(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireDetectAutoRedirectFraud " + this + " " + str);
        }
        g("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "onUserLandingInitialized " + this + " isInAppBrowser: " + this.e);
        }
        g("window.imraid.broadcastEvent('onUserLandingInitialized');");
        if (str2 == null) {
            return;
        }
        a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
    }

    public final void d(JSONObject jSONObject) {
        short s;
        final String strOptString = jSONObject.optString(IronSourceConstants.EVENTS_ERROR_CODE);
        Object objA = H3.a(new Function0() { // from class: adsuki.ocellation
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Short.valueOf(GestureDetectorOnGestureListenerC2829ci.l(strOptString));
            }
        });
        if (Result.m3357isSuccessimpl(objA)) {
            short sShortValue = ((Number) objA).shortValue();
            C3081mi c3081mi = this.d0;
            if (c3081mi != null) {
                Map mapA = c3081mi.a();
                switch (sShortValue) {
                    case 101:
                        s = 2261;
                        break;
                    case 102:
                        s = 2262;
                        break;
                    case 103:
                        s = 2263;
                        break;
                    case 104:
                        s = 2267;
                        break;
                    case 105:
                        s = 2266;
                        break;
                    case 106:
                        s = 2265;
                        break;
                    case 107:
                        s = 2264;
                        break;
                    default:
                        switch (sShortValue) {
                            case 301:
                                s = 2268;
                                break;
                            case 302:
                                s = 2269;
                                break;
                            case 303:
                                s = 2270;
                                break;
                            case AD_EXPIRED_VALUE:
                                s = 2271;
                                break;
                            case MRAID_BRIDGE_ERROR_VALUE:
                                s = 2272;
                                break;
                            case 306:
                                s = 2273;
                                break;
                            case 307:
                                s = 2274;
                                break;
                            case 308:
                                s = 2275;
                                break;
                            case ASSET_FAILED_TO_DELETE_VALUE:
                                s = 2276;
                                break;
                            case AD_HTML_FAILED_TO_LOAD_VALUE:
                                s = 2277;
                                break;
                            case MRAID_JS_CALL_EMPTY_VALUE:
                                s = 2278;
                                break;
                            case DEEPLINK_OPEN_FAILED_VALUE:
                                s = 2280;
                                break;
                            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                                s = 2281;
                                break;
                            default:
                                s = sShortValue;
                                break;
                        }
                        break;
                }
                mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
                long j = c3081mi.c;
                saran saranVar = AbstractC2984il.a;
                mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
                Wj wj = Wj.a;
                Wj.b("CompanionWebViewLoadFailed", mapA, EnumC2779ak.SDK);
            }
        }
    }

    public final void b(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "onCTLifeCycleEvent " + this);
        }
        g("window.imraid.broadcastEvent('onCTLifeCycleEvent', " + jsonObject + ");");
    }

    public final void j(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C3081mi c3081mi = this.d0;
        if (c3081mi != null) {
            c3081mi.b();
        }
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "loadUrlInWebView " + this);
        }
        this.P = false;
        if (this.M.get()) {
            return;
        }
        loadUrl(url);
    }

    public final void b(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireLandingPageTracker " + this);
        }
        getListener().a(this, trackerName, macros);
    }

    public final void b(GestureDetectorOnGestureListenerC2829ci sourceView, String targetId) throws JSONException {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "fireLoadWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        C3081mi c3081mi = this.d0;
        jSONObject.put("latency", c3081mi != null ? c3081mi.h : 0L);
        sourceView.g("window.imraidview.broadcastEvent('webViewLoaded', " + jSONObject + ");");
    }

    public static final void d(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, String str) {
        try {
            if (gestureDetectorOnGestureListenerC2829ci.M.get()) {
                return;
            }
            String str2 = "javascript:try{" + str + "}catch(e){}";
            InterfaceC3072m9 interfaceC3072m9 = gestureDetectorOnGestureListenerC2829ci.i;
            if (interfaceC3072m9 != null) {
                String TAG = g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3097n9) interfaceC3072m9).a(TAG, "Injecting javascript");
            }
            gestureDetectorOnGestureListenerC2829ci.c(str2);
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m10 = gestureDetectorOnGestureListenerC2829ci.i;
            if (interfaceC3072m10 != null) {
                String TAG2 = g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3097n9) interfaceC3072m10).b(TAG2, "SDK encountered an unexpected error injecting JavaScript in the Ad container; " + e.getMessage());
            }
        }
    }

    public final void a(RelativeLayout adView) {
        C3377yf c3377yf;
        Intrinsics.checkNotNullParameter(adView, "adBackgroundView");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("HtmlVideoPlayer", "inflateVideoPlayer " + this);
        }
        C3295v8 c3295v8 = this.Y0;
        if (c3295v8 != null) {
            Intrinsics.checkNotNullParameter(adView, "parentView");
            if (c3295v8.g.get()) {
                return;
            }
            InterfaceC3072m9 interfaceC3072m10 = c3295v8.c;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).b("HybridVideoPlayerHandler", "Inflate called");
            }
            if (c3295v8.i && (c3377yf = c3295v8.p) != null) {
                Intrinsics.checkNotNullParameter(adView, "parentView");
                InterfaceC3072m9 interfaceC3072m11 = c3377yf.g;
                if (interfaceC3072m11 != null) {
                    Intrinsics.checkNotNullExpressionValue("yf", "TAG");
                    ((C3097n9) interfaceC3072m11).c("yf", "startOmidSession");
                }
                Ae ae = c3377yf.e;
                if (ae != null) {
                    Intrinsics.checkNotNullParameter(adView, "adView");
                    if (ae.c == null) {
                        InterfaceC3072m9 interfaceC3072m12 = ae.b;
                        if (interfaceC3072m12 != null) {
                            ((C3097n9) interfaceC3072m12).a(AbstractC2863e1.f, "Failed to registerAdView. adSession is null");
                        }
                    } else {
                        InterfaceC3072m9 interfaceC3072m13 = ae.b;
                        if (interfaceC3072m13 != null) {
                            ((C3097n9) interfaceC3072m13).a(AbstractC2863e1.f, "registerAdView");
                        }
                        P4.a(ae.a, new Y0(ae, adView, null));
                    }
                }
                Ae ae2 = c3377yf.e;
                if (ae2 != null) {
                    if (ae2.c == null) {
                        InterfaceC3072m9 interfaceC3072m14 = ae2.b;
                        if (interfaceC3072m14 != null) {
                            ((C3097n9) interfaceC3072m14).a(AbstractC2863e1.f, "Failed to startAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC3072m9 interfaceC3072m15 = ae2.b;
                        if (interfaceC3072m15 != null) {
                            ((C3097n9) interfaceC3072m15).a(AbstractC2863e1.f, "startAdSession");
                        }
                        P4.a(ae2.a, new C2786b1(ae2, null));
                    }
                }
            }
            c3295v8.k.a(adView);
            c3295v8.k.e();
            c3295v8.o = true;
        }
    }

    public final void a(EnumC3146p8 enumC3146p8, Object obj) {
        if (obj instanceof String) {
            obj = "'" + obj + "'";
        }
        String str = "window.imraid.broadcastEvent('" + enumC3146p8.a + "', " + obj + ");";
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).b(TAG, "fireHtmlVideoEvents: " + str);
        }
        g(str);
    }

    public final void a(HashMap params) {
        C3377yf c3377yf;
        Ae ae;
        Intrinsics.checkNotNullParameter(params, "params");
        getListener().a(params);
        C3295v8 c3295v8 = this.Y0;
        if (c3295v8 == null || (c3377yf = c3295v8.p) == null || (ae = c3377yf.e) == null) {
            return;
        }
        ae.a(InteractionType.CLICK);
    }

    public static final Unit a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "it");
        SparseArray sparseArray = InMobiAdActivity.k;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = InMobiAdActivity.l;
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.c(jsonObject);
        }
        return Unit.f29295attabal;
    }

    public static final Unit a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        SparseArray sparseArray = InMobiAdActivity.k;
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = InMobiAdActivity.l;
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.b(trackerName, macros);
        }
        return Unit.f29295attabal;
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "initContextualData " + this);
        }
        this.X0 = new D4(ad != null ? ad.getContextData() : null, this.W);
    }

    public static final Unit a(C3031ki it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.b();
        return Unit.f29295attabal;
    }

    @Override // com.inmobi.media.InterfaceC3105nh
    public final void a(String mraidApi) {
        Intrinsics.checkNotNullParameter(mraidApi, "mraidApi");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "sendFraudBeaconAndTelemetryEvent " + this);
        }
        d(mraidApi);
        String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        c(mraidApi, adType);
    }

    public final void a(boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireNextAdLoadComplete " + this);
        }
        String str = "window.imraidview.broadcastEvent('adLoadSuccess'," + z + ");";
        InterfaceC3072m9 interfaceC3072m10 = this.i;
        if (interfaceC3072m10 != null) {
            String TAG2 = g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3097n9) interfaceC3072m10).c(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        g(str);
    }

    public final void a(int i, int i2) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireSizeChanged " + this + " w-" + i + " h-" + i2);
        }
        g("window.mraidview.broadcastEvent('sizeChange'," + i + "," + i2 + ");");
    }

    public final void a(int i) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireOrientationChange " + this + " " + i);
        }
        g("window.imraid.broadcastEvent('orientationChange','" + i + "');");
    }

    public final void a(String str, JSONObject message) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireError " + this + " - " + message);
        }
        g("window.imraidview.broadcastEvent('error','" + message + "', '" + str + "');");
        d(message);
    }

    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireError " + this + " - " + message + " - " + str2);
        }
        if (str == null || str2 == null) {
            return;
        }
        a(str, "broadcastEvent('error',\"" + message + "\", \"" + str2 + "\")");
    }

    public final void a(String str, String callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "fireJavaScriptCallback " + this);
        }
        if (str == null) {
            return;
        }
        g(str + "." + callback);
    }

    public final void a(String str, HashMap map) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "processTelemetryEvent " + this);
        }
        getListener().a(str, map);
    }

    public void a(Ff orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "setOrientationProperties " + this);
        }
        this.G0 = orientationProperties;
        Y();
    }

    public static final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        gestureDetectorOnGestureListenerC2829ci.getListener().k(gestureDetectorOnGestureListenerC2829ci);
    }

    @Override // com.inmobi.media.Gf
    public final void a(Df orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "onOrientationUpdate " + this);
        }
    }

    public final void a(Df orientation, wo woVar) {
        JSONObject jSONObjectA;
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "fireOnSafeAreaChanged " + this);
        }
        Intrinsics.checkNotNullParameter(woVar, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        try {
            woVar.getClass();
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            vo voVar = (vo) woVar.a.get(orientation);
            if (voVar != null) {
                jSONObjectA = voVar.a();
                jSONObjectA.put("orientation", Ef.a(orientation));
            } else {
                jSONObjectA = null;
            }
        } catch (Exception unused) {
        }
        g("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObjectA + ")");
    }

    public final boolean a(JsResult jsResult) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "shouldRenderPopup " + this);
        }
        if (getRenderingConfig().getShouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        w();
        return false;
    }

    @Override // com.inmobi.media.InterfaceC3105nh
    public final boolean a() {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "hasUserInteracted " + getViewTouchTimestamp() + " " + getRenderingConfig().getUserTouchResetTime());
        }
        if (!getRenderingConfig().getAutoRedirectionEnforcement() || this.l0) {
            return true;
        }
        return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
    }

    public final void a(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).a(TAG, "handlePingException " + this, e);
        }
        InterfaceC2801bg interfaceC2801bg = this.q;
        Z5[] z5Arr = Z5.a;
        ((Yh) interfaceC2801bg).a("", PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED, "Ping exception occurred", System.currentTimeMillis(), 0);
        taiyuan taiyuanVar = P9.a;
        AbstractC2973i9.a(e);
    }

    public static final Unit a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = gestureDetectorOnGestureListenerC2829ci.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "onRenderProcessGone");
        }
        gestureDetectorOnGestureListenerC2829ci.getListener().a(gestureDetectorOnGestureListenerC2829ci, z);
        return Unit.f29295attabal;
    }

    public final void a(boolean z, short s) {
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "fireRenderProcessGoneTelemetry");
        }
        C3081mi c3081mi = this.d0;
        if (c3081mi != null) {
            c3081mi.a(z, s);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC2829ci sourceView, String targetId) throws JSONException {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC3072m9 interfaceC3072m9 = this.i;
        if (interfaceC3072m9 != null) {
            String TAG = g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m9).c(TAG, "fireDestroyWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.g("window.imraidview.broadcastEvent('destroyWebView'," + jSONObject + ");");
    }
}
