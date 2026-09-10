package com.inmobi.media;

import A.RunnableC0905n;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class GestureDetectorOnGestureListenerC3005ec extends X1 implements InterfaceC3295x, InterfaceC2961c2, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, InterfaceC3226sa, InterfaceC3323yb {
    public static final Gb Y0 = new Gb();
    public static final Eb Z0 = new Eb();
    public static final String a1 = "ec";
    public static final C3297x1 b1 = new C3297x1((Object) Boolean.FALSE, (Function0) Fb.f22826a, false, true);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public JSONObject f23568A;
    public InterfaceC2929a4 A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f23569B;
    public String B0;
    public boolean C;
    public C3210ra C0;
    public boolean D;
    public C3153o0 D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f23570E;
    public final AtomicBoolean E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public EnumC2991df f23571F;
    public boolean F0;
    public boolean G;
    public I G0;
    public boolean H;
    public String H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f23572I;
    public boolean I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final AtomicBoolean f23573J;
    public Df J0;
    public final Object K;
    public boolean K0;
    public final Object L;
    public Map L0;
    public boolean M;
    public final Jb M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f23574N;
    public final C2988dc N0;
    public View O;
    public String O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f23575P;
    public final Ub P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f23576Q;
    public final Pb Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f23577R;
    public final Hb R0;
    public boolean S;
    public boolean S0;
    public long T;
    public C2996e3 T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f23578U;
    public final Vb U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final AtomicBoolean f23579V;
    public final Xb V0;
    public C3149nc W;
    public final Wb W0;
    public Bf X0;
    public final Lazy a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f23580b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Ia f23581b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f23582c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Lazy f23583c0;
    public String d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f23584d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23585e;
    public Map e0;
    public String f;
    public InterfaceC2944b2 f0;
    public long g;
    public InterfaceC3295x g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3053hc f23586h;
    public boolean h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3333z5 f23587i;
    public boolean i0;
    public final Cc j;
    public InterfaceC2925a0 j0;
    public final tf k;
    public Xe k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Q f23588l;
    public final boolean l0;
    public Ha m;
    public int m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f23589n;
    public String n0;
    public final Bd o;
    public int[] o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f23590p;
    public long p0;
    public WeakReference q;
    public int q0;
    public WeakReference r;
    public final Ib r0;
    public AbstractC3037gc s;
    public final Sb s0;
    public final Zb t;
    public int t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f23591u;
    public int u0;
    public F7 v;
    public final C3335z7 v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AdConfig f23592w;
    public final GestureDetector w0;
    public boolean x;
    public boolean x0;
    public boolean y;
    public boolean y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public JSONObject f23593z;
    public C2963c4 z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public GestureDetectorOnGestureListenerC3005ec(Context context, byte b2, Set set, String str, boolean z2, String str2, long j, C3053hc c3053hc, InterfaceC3333z5 interfaceC3333z5, Cc route, tf webViewFactory, Q q, int i2) {
        Set set2 = (i2 & 4) != 0 ? null : set;
        String str3 = (i2 & 8) != 0 ? null : str;
        boolean z3 = (i2 & 16) != 0 ? false : z2;
        String landingScheme = (i2 & 32) != 0 ? "DEFAULT" : str2;
        long j2 = (i2 & 64) != 0 ? -1L : j;
        C3053hc c3053hc2 = (i2 & 128) != 0 ? null : c3053hc;
        Intrinsics.f(context, "context");
        Intrinsics.f(landingScheme, "landingScheme");
        Intrinsics.f(route, "route");
        Intrinsics.f(webViewFactory, "webViewFactory");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "getApplicationContext(...)");
        super(applicationContext);
        this.f23580b = b2;
        this.f23582c = set2;
        this.d = str3;
        this.f23585e = z3;
        this.f = landingScheme;
        this.g = j2;
        this.f23586h = c3053hc2;
        this.f23587i = interfaceC3333z5;
        this.j = route;
        this.k = webViewFactory;
        this.f23588l = q;
        this.m = new Yb(this);
        this.o = new Bd(interfaceC3333z5);
        this.f23590p = LazyKt.b(new C2954bc(this));
        this.q = new WeakReference(null);
        this.t = new Zb();
        this.f23591u = "Default";
        this.f23569B = true;
        this.C = true;
        this.f23570E = true;
        this.f23571F = EnumC2991df.UNKNOWN;
        this.f23573J = new AtomicBoolean(false);
        this.K = new Object();
        this.L = new Object();
        this.f23574N = true;
        this.f23576Q = -1;
        this.T = Long.MIN_VALUE;
        this.f23579V = new AtomicBoolean(false);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f43248Y;
        this.a0 = LazyKt.a(lazyThreadSafetyMode, new C2937ac(this));
        this.f23583c0 = LazyKt.a(lazyThreadSafetyMode, Tb.f23235a);
        this.r0 = new Ib(this);
        this.s0 = new Sb(this);
        this.t0 = Integer.MIN_VALUE;
        this.u0 = Integer.MIN_VALUE;
        this.E0 = new AtomicBoolean(true);
        this.M0 = new Jb(this);
        this.N0 = new C2988dc(this);
        this.O0 = "html";
        this.P0 = new Ub(this);
        this.Q0 = new Pb(this);
        this.R0 = new Hb(this);
        String TAG = a1;
        Intrinsics.e(TAG, "TAG");
        toString();
        Y0.getClass();
        b1.a();
        this.g0 = this;
        this.l0 = true;
        this.C0 = new C3210ra();
        this.v0 = new C3335z7(this);
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b2 == 1);
        this.w0 = gestureDetector;
        if (c3053hc2 != null) {
            this.W = new C3149nc(c3053hc2);
        }
        Cb.a(this, interfaceC3333z5);
        if (q != null) {
            setAdType(q.f23087a);
            this.S0 = q.f23088b;
            this.T = q.f23089c;
            this.i0 = q.d;
            setCreativeId(q.f23090e);
            this.j0 = q.f23092i;
            this.n0 = q.j;
            String str4 = q.g;
            if (str4 != null) {
                this.O0 = str4;
            }
            String str5 = q.f23091h;
            if (str5 != null) {
                setAdSize(str5);
            }
            setTelemetryManagerMap(q.k);
            String str6 = q.f;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c(TAG, "creativeType " + this + ' ' + str6);
            }
            this.B0 = str6;
        }
        this.U0 = new Vb(this);
        this.V0 = new Xb(this);
        this.W0 = new Wb(this);
        this.X0 = (this.S0 || B2.a(context)) ? new Bf(0, 44, 44, 0) : new Bf(0, 0, 0, 0);
    }

    public static final void a(GestureDetectorOnGestureListenerC3005ec this$0, byte[] overlayBytes, WatermarkData watermarkData) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(overlayBytes, "$overlayBytes");
        Intrinsics.f(watermarkData, "$watermarkData");
        if (this$0.f23579V.get()) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z5 = this$0.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "adding overlay to renderview");
        }
        Context context = this$0.getContext();
        Intrinsics.e(context, "getContext(...)");
        FrameLayout overlayLayout = nf.a(context, overlayBytes, watermarkData.getAlpha());
        Intrinsics.f(overlayLayout, "overlayLayout");
        if (this$0.getParent() != null) {
            ViewParent parent = this$0.getParent();
            Intrinsics.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).addView(overlayLayout, 0);
        }
        this$0.getViewableAd().a(overlayLayout, FriendlyObstructionPurpose.NOT_VISIBLE);
        this$0.f23579V.set(true);
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    public static /* synthetic */ void getCloseAssetArea$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    private final TelemetryConfig.LandingPageConfig getLandingPageConfig() {
        return (TelemetryConfig.LandingPageConfig) this.f23583c0.getX();
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    private final AdConfig.MraidConfig getMraidConfig() {
        return getMAdConfig().getMraid();
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    private final C2990de getScrollThrottler() {
        return (C2990de) this.a0.getX();
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    public static /* synthetic */ void getWindowInsetListener$annotations() {
    }

    private final void setAdSize(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z5).a(str2, Ob.a(this, str2, "TAG", "setAdSize "));
        }
        V3 v3 = U3.f23253a;
        this.m0 = (int) (U3.b() * Integer.parseInt(((String[]) new Regex("x").f(str, 0).toArray(new String[0]))[0]));
        this.p0 = ((int) (U3.b() * Integer.parseInt(((String[]) new Regex("x").f(str, 0).toArray(new String[0]))[1]))) * this.m0;
    }

    public final void A() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "updateActivitiesOrientationProperties "));
        }
        Activity activity = (Activity) this.q.get();
        if (activity == null || !(activity instanceof InMobiAdActivity)) {
            return;
        }
        C3210ra orientationProperties = this.C0;
        Intrinsics.f(orientationProperties, "orientationProperties");
        C3110l5 c3110l5 = ((InMobiAdActivity) activity).f22658a;
        if (c3110l5 != null) {
            c3110l5.a(orientationProperties);
        } else {
            Intrinsics.m("orientationHandler");
            throw null;
        }
    }

    public final void B() {
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).execute(new A.Y(this, 1));
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public void b() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "destroyContainer "));
        }
        h();
        this.k.b(Qb.f23111a);
        removeAllViews();
        AdConfig.OmidConfig omidConfig = getMAdConfig().getViewability().getOmidConfig();
        if (this.l0 && omidConfig.isOmidEnabled()) {
            AbstractC3147na.f23833a.getClass();
            if (Omid.isActive()) {
                new C3069ic(this, omidConfig.getWebViewRetainTime()).a();
                return;
            }
        }
        super.destroy();
    }

    public final void c(boolean z2) {
        AdQualityControl adQualityControl;
        Activity activity;
        AdQualityControl adQualityControl2;
        EnumC2991df enumC2991df = z2 ? EnumC2991df.VISIBLE : EnumC2991df.HIDDEN;
        if (this.f23571F == enumC2991df || this.M) {
            return;
        }
        this.f23571F = enumC2991df;
        if (z2) {
            getListener().i(this);
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "fireViewableChange " + this + ' ' + z2);
        }
        c("window.mraidview.broadcastEvent('viewableChange'," + z2 + ");");
        C3153o0 c3153o0 = this.D0;
        if (c3153o0 != null) {
            EnumC2991df adViewableStatus = this.f23571F;
            Intrinsics.f(adViewableStatus, "adViewableStatus");
            c3153o0.f23846h = adViewableStatus;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String str = a1;
            StringBuilder sbA = H6.a(str, "TAG", "fireAQSession - ");
            sbA.append(getAdType());
            sbA.append(" type - sdk - ");
            sbA.append(Build.VERSION.SDK_INT);
            ((A5) interfaceC3333z6).a(str, sbA.toString());
        }
        if (!Intrinsics.a(getAdType(), "int") || Build.VERSION.SDK_INT < 29 || (activity = (Activity) this.q.get()) == null) {
            C3153o0 c3153o1 = this.D0;
            if (c3153o1 == null) {
                Intrinsics.m("adQualityManager");
                throw null;
            }
            if (!c3153o1.a()) {
                c3153o1.a("session state invalid");
                return;
            }
            c3153o1.a("session start trigger...");
            c3153o1.f23844c.set(true);
            AdQualityControl adQualityControl3 = c3153o1.g;
            if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl = c3153o1.g) == null) {
                return;
            }
            c3153o1.a(this, (long) (adQualityControl.getScreenshotDelayInSeconds() * 1000), false, (Jb) null);
            return;
        }
        C3153o0 c3153o2 = this.D0;
        if (c3153o2 == null) {
            Intrinsics.m("adQualityManager");
            throw null;
        }
        if (!c3153o2.a()) {
            c3153o2.a("session state invalid");
            return;
        }
        c3153o2.a("session start trigger...");
        c3153o2.f23844c.set(true);
        AdQualityControl adQualityControl4 = c3153o2.g;
        if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl2 = c3153o2.g) == null) {
            return;
        }
        c3153o2.a(activity, (long) (adQualityControl2.getScreenshotDelayInSeconds() * 1000), false, (Jb) null);
    }

    public final void d(String str) {
        C3149nc c3149nc = this.W;
        if (c3149nc != null) {
            c3149nc.b();
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z5).a(str2, Ob.a(this, str2, "TAG", "loadDataInWebView "));
        }
        this.M = false;
        if (this.f23573J.get()) {
            return;
        }
        Intrinsics.c(str);
        loadDataWithBaseURL("", str, "text/html", "UTF-8", null);
    }

    public final void e(String str) {
        C3149nc c3149nc = this.W;
        if (c3149nc != null) {
            c3149nc.b();
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z5).a(str2, Ob.a(this, str2, "TAG", "loadUrlInWebView "));
        }
        this.M = false;
        if (this.f23573J.get() || str == null) {
            return;
        }
        loadUrl(str);
    }

    @Override // com.inmobi.media.X1
    public final M6 f() {
        String strM;
        String strB;
        String str;
        String str2;
        S6 s6;
        String str3;
        Z z2;
        Z z3;
        Z z4;
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str4 = a1;
            ((A5) interfaceC3333z5).a(str4, Ob.a(this, str4, "TAG", "initLandingPageHandler "));
        }
        N6 n6 = new N6(this.f23585e, this.f, getAdConfig().getCctEnabled(), getAdConfig().getPartialTabsEnabled());
        Context context = getContext();
        Intrinsics.e(context, "getContext(...)");
        Pb pb = this.Q0;
        Ub ub = this.P0;
        if (this.f23585e) {
            s6 = null;
        } else {
            C3053hc c3053hc = this.f23586h;
            long jL = (c3053hc == null || (z4 = c3053hc.f23664a) == null) ? 0L : z4.l();
            String impressionId = getImpressionId();
            String str5 = "";
            if (impressionId == null) {
                impressionId = "";
            }
            C3053hc c3053hc2 = this.f23586h;
            if (c3053hc2 == null || (z3 = c3053hc2.f23664a) == null || (strM = z3.m()) == null) {
                strM = "";
            }
            C3053hc c3053hc3 = this.f23586h;
            if (c3053hc3 == null || (z2 = c3053hc3.f23664a) == null || (strB = z2.b()) == null) {
                strB = "";
            }
            C3053hc c3053hc4 = this.f23586h;
            if (c3053hc4 == null || (str = c3053hc4.f23665b) == null) {
                str = "";
            }
            if (c3053hc4 == null || (str2 = c3053hc4.f23667e) == null) {
                str2 = "";
            }
            if (c3053hc4 != null && (str3 = c3053hc4.f23666c) != null) {
                str5 = str3;
            }
            s6 = new S6(jL, impressionId, strM, strB, str, str2, str5, c3053hc4 != null ? c3053hc4.g : false, this.f);
        }
        return new M6(context, n6, pb, ub, this, s6, this.f23587i);
    }

    public final void g() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "deferredDestroy "));
        }
        super.destroy();
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public AdConfig getAdConfig() {
        return getMAdConfig();
    }

    public final Q getAdMetaData() {
        return this.f23588l;
    }

    public final InterfaceC2925a0 getAdPodHandler() {
        return this.j0;
    }

    public final C3153o0 getAdQualityManager() {
        C3153o0 c3153o0 = this.D0;
        if (c3153o0 != null) {
            return c3153o0;
        }
        Intrinsics.m("adQualityManager");
        throw null;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public String getAdType() {
        return this.f23584d0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.i0;
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    public final String getBeaconUrl() {
        return this.H0;
    }

    public final Bf getCloseAssetArea() {
        return this.X0;
    }

    public final long getConfiguredArea() {
        return this.p0;
    }

    public Context getContainerContext() {
        Activity activity = (Activity) this.q.get();
        if (activity != null) {
            return activity;
        }
        Context context = getContext();
        Intrinsics.e(context, "getContext(...)");
        return context;
    }

    public final String getContentURL() {
        return this.n0;
    }

    public final C2996e3 getContextualDataHandler() {
        return this.T0;
    }

    public final String getCreativeID() {
        String creativeId = getCreativeId();
        return creativeId == null ? "" : creativeId;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public String getCreativeId() {
        return this.f23578U;
    }

    public final String getCurrentPosition() {
        JSONObject jSONObject = this.f23568A;
        String string = jSONObject != null ? jSONObject.toString() : null;
        return string == null ? "" : string;
    }

    public final Object getCurrentPositionMonitor() {
        return this.L;
    }

    public final int getCurrentRenderingPodAdIndex() {
        InterfaceC2925a0 interfaceC2925a0 = this.j0;
        if (interfaceC2925a0 != null) {
            return ((S0) interfaceC2925a0).l(this);
        }
        return 0;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public Object getDataModel() {
        return null;
    }

    public final String getDefaultPosition() {
        JSONObject jSONObject = this.f23593z;
        String string = jSONObject != null ? jSONObject.toString() : null;
        return string == null ? "" : string;
    }

    public final Object getDefaultPositionMonitor() {
        return this.K;
    }

    public final InterfaceC2929a4 getEmbeddedBrowserJsCallbacks() {
        return this.A0;
    }

    public final I getExposureTracker() {
        return this.G0;
    }

    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        return this.e0;
    }

    public final Activity getFullScreenActivity() {
        return (Activity) this.q.get();
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public InterfaceC3279w getFullScreenEventsListener() {
        return this.U0;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public String getImpressionId() {
        return this.d;
    }

    public final byte getImpressionType() {
        return this.f23589n;
    }

    public final String getLandingScheme() {
        return this.f;
    }

    public final AbstractC3037gc getListener() {
        AbstractC3037gc abstractC3037gc = this.s;
        if (abstractC3037gc != null) {
            return abstractC3037gc;
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "listener getter "));
        }
        Eb eb = Z0;
        this.s = eb;
        return eb;
    }

    public final AdConfig getMAdConfig() {
        AdConfig adConfig = this.f23592w;
        if (adConfig != null) {
            return adConfig;
        }
        Intrinsics.m("mAdConfig");
        throw null;
    }

    public final String getMCreativeType() {
        return this.B0;
    }

    public final int getMImpressionMinPercentageViewed() {
        return this.u0;
    }

    public final int getMImpressionMinTimeViewed() {
        return this.t0;
    }

    public final Xe getMViewableAd() {
        return this.k0;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public String getMarkupType() {
        return this.O0;
    }

    public final String getMarkupTypeAdUnit() {
        return this.O0;
    }

    public final F7 getMediaProcessor() {
        return this.v;
    }

    public final int getMinimumPixelsPainted() {
        return this.q0;
    }

    public final String getMraidJsString() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "mraidJsString getter "));
        }
        Context context = getContext();
        Intrinsics.e(context, "getContext(...)");
        String strA = new Sa(context, "mraid_js_store").a("mraid_js_string");
        if (strA == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
            if (interfaceC3333z6 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z6).a(TAG, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){this.event=a;this.count=0;var b=[];this.add=function(a){b.push(a);++this.count};this.remove=function(a){var e=!1,d=this;b=b.filter(function(b){if(b=b===a)--d.count,e=!0;return!b});return e};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){b.forEach(function(e){try{e.apply({},a)}catch(b){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});\nreturn c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners);c[a].add(b);\"micIntensityChange\"==a&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&\nwindow.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(e){this.log(e)}};this.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&\nwindow.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==a&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};\nthis.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{this.listeners[c]&&this.listeners[c].broadcast(b)}catch(e){}}};this.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var e=arguments[c],e=JSON.parse(e);b[c]=e}else b[c]=arguments[c];e=b[1];\"success\"!=e&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);\nwindow.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;window.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){e={};e.command=a;e.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b[arguments[c]]=\"\"+d);e.params=b}else for(var e=this.urlScheme+\"://\"+a,d,b=!0,c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b?(e+=\"?\",b=!1):e+=\"&\",e+=arguments[c]+\"=\"+escape(d));__im__iosNativeCall.executeNativeCall(e);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(e){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(e);return!1};a.popupBlocked=function(e){a.firePopupBlockedBeacon(e)};a.zeroPad=function(a){var c=\"\";10>a&&(c+=\"0\");return c+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(c){imraidview.showAlert(\"use CustomClose: \"+c)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,d){c?b.push(a):(eval(a),d&&(c=!0))};a.setOrientationProperties=function(e){try{e?(\"undefined\"!=typeof e.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=\ne.allowOrientationChange),\"undefined\"!=typeof e.forceOrientation&&(a.orientationProperties.forceOrientation=e.forceOrientation)):e=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(c){imraidview.showAlert(\"setOrientationProperties: \"+c+\", props = \"+e)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;\na.open=function(a){\"undefined\"==typeof a&&(a=null);try{sdkController.open(\"window.mraidview\",a)}catch(c){imraidview.showAlert(\"open: \"+c)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getScreenSize: \"+a)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getMaxSize: \"+a)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\n\")\")}catch(a){imraidview.showAlert(\"getCurrentPosition: \"+a)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getDefaultPosition: \"+a)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(a){imraidview.showAlert(\"getState: \"+a)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(a){imraidview.showAlert(\"isViewable: \"+\na)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(a){return 0==this.indexOf(a)});a.playVideo=function(a){var c=\"\";null!=a&&(c=a);try{sdkController.playVideo(\"window.mraidview\",c)}catch(b){imraidview.showAlert(\"playVideo: \"+b)}};a.stringify=function(c){if(\"undefined\"===\ntypeof JSON){var b=\"\",f;if(\"undefined\"==typeof c.length)return a.stringifyArg(c);for(f=0;f<c.length;f++)0<f&&(b+=\",\"),b+=a.stringifyArg(c[f]);return b+\"]\"}return JSON.stringify(c)};a.stringifyArg=function(a){var c,b,g;b=typeof a;c=\"\";if(\"number\"===b||\"boolean\"===b)c+=args;else if(a instanceof Array)c=c+\"[\"+a+\"]\";else if(a instanceof Object){b=!0;c+=\"{\";for(g in a)null!==a[g]&&(b||(c+=\",\"),c=c+'\"'+g+'\":',b=typeof a[g],c=\"number\"===b||\"boolean\"===b?c+a[g]:\"function\"===typeof a[g]?c+'\"\"':a[g]instanceof\nObject?c+this.stringify(args[i][g]):c+'\"'+a[g]+'\"',b=!1);c+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),c=c+'\"'+a+'\"';imraidview.showAlert(\"json:\"+c);return c};getPID=function(a){var c=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(c=a.id);return c};a.storePicture=function(c){console.log(\"bridge: storePicture\");if(\"string\"!=typeof c)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+c+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",c);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+c+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,c){};a.fireMediaErrorEvent=function(a,c){};a.fireMediaTimeUpdateEvent=function(a,c,b){};a.fireMediaCloseEvent=function(a,c,b){};a.fireMediaVolumeChangeEvent=function(a,c,b){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)};a.unload=function(){try{sdkController.unload(\"window.mraidview\")}catch(a){}};a.getCurrentAppOrientation=function(){var c;switch(a.orientation){case 0:case 180:c=\"portrait\";break;case 90:case 270:c=\"landscape\";break;default:c=\"none\"}return{orientation:c,locked:!1}};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(c){imraidview.showAlert(\"executeNativeExpand: \"+\nc+\", URL = \"+a)}};a.setExpandProperties=function(c){try{c?this.props=c:c=null;if(\"undefined\"!=typeof c.lockOrientation&&null!=c.lockOrientation&&\"undefined\"!=typeof c.orientation&&null!=c.orientation){var b={};b.allowOrientationChange=!c.lockOrientation;b.forceOrientation=c.orientation;a.setOrientationProperties(b)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(c))}catch(f){imraidview.showAlert(\"executeNativesetExpandProperties: \"+f+\", props = \"+c)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.resizeProps=null;a.setResizeProperties=function(c){var b,f;try{b=parseInt(c.width);f=parseInt(c.height);if(isNaN(b)||isNaN(f)||1>b||1>f)throw\"Invalid\";c.width=b;c.height=f;a.resizeProps=c;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(c))}catch(g){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+\nsdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(c){imraidview.showAlert(\"resize called in bridge\")}}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;c.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,c)}};b.getSdkVersionInt=function(){for(var a=imraid.getSdkVersion().split(\".\"),\nc=a.length,b=\"\",g=0;g<c;g++)b+=a[g];return parseInt(b)};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;inmobi.recordEvent(136,c)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\n\"Method not supported\",\"getExpandProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getExpandProperties is deprecated\",\"getExpandProperties\");return b.getExpandProperties()};a.setExpandProperties=function(c){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setExpandProperties\"):(\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(c.useCustomClose),window.mraid.broadcastEvent(\"error\",\n\"MRAID setExpandProperties is deprecated\",\"setExpandProperties\"),b.setExpandProperties(c))};a.getResizeProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getResizeProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getResizeProperties is deprecated\",\"getResizeProperties\");return b.getResizeProperties()};a.setResizeProperties=function(a){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\n\"setResizeProperties\"):(window.mraid.broadcastEvent(\"error\",\"MRAID setResizeProperties is deprecated\",\"setResizeProperties\"),b.setResizeProperties(a))};a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=function(a){try{1083<=b.getSdkVersionInt()?\"string\"===typeof a&&\"\"!==a.trim()?b.open(a):window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"expand\"):(window.mraid.broadcastEvent(\"error\",\"MRAID expand is deprecated\",\"expand\"),\nb.expand(a))}catch(c){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c))};a.resize=function(){try{1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"MRAID resize not supported\",\n\"resize\"):(window.mraid.broadcastEvent(\"error\",\"MRAID resize is deprecated\",\"resize\"),b.expand())}catch(a){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getVersion=function(){return\"3.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\n\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)};a.unload=function(){b.unload()};a.getCurrentAppOrientation=b.getCurrentAppOrientation;a.getLocation=function(){return null};a.getAudioVolume=b.getAudioVolume})();\n(function(){var a=window.imraidview={},b=!1;a.setOrientationProperties=function(c){try{c?(\"undefined\"!=typeof c.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=c.allowOrientationChange),\"undefined\"!=typeof c.forceOrientation&&(mraidview.orientationProperties.forceOrientation=c.forceOrientation),\"undefined\"!=typeof c.direction&&(mraidview.orientationProperties.direction=c.direction)):c=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(b){a.showAlert(\"setOrientationProperties: \"+\nb+\", props = \"+c)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var d={};d.name=a;var f=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(f=f+\"_\"+b);window.imraid.broadcastEvent(f,d)};a.fireMediaErrorEvent=function(a,b){var d={name:\"error\"};d.code=b;var f=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(f=f+\"_\"+a);window.imraid.broadcastEvent(f,\nd)};a.fireMediaTimeUpdateEvent=function(a,b,d){var f={name:\"timeupdate\",target:{}};f.target.currentTime=b;f.target.duration=d;b=\"inmobi_media_\"+f.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,f)};a.saveContent=function(a,b,d){window.imraid.addEventListener(\"saveContent_\"+a,d);sdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",\na)};a.fireGalleryImageSelectedEvent=function(a,b,d){var f=new Image;f.src=\"data:image/jpeg;base64,\"+a;f.width=b;f.height=d;window.imraid.broadcastEvent(\"galleryImageSelected\",f)};a.fireCameraPictureCatpturedEvent=function(a,b,d){var f=new Image;f.src=\"data:image/jpeg;base64,\"+a;f.width=b;f.height=d;window.imraid.broadcastEvent(\"cameraPictureCaptured\",f)};a.fireMediaCloseEvent=function(a,b,d){var f={name:\"close\"};f.viaUserInteraction=b;f.target={};f.target.currentTime=d;b=\"inmobi_media_\"+f.name;\"undefined\"!=\ntypeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,f)};a.fireMediaVolumeChangeEvent=function(a,b,d){var f={name:\"volumechange\",target:{}};f.target.volume=b;f.target.muted=d;b=\"inmobi_media_\"+f.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,f)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=\nfunction(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(c,b){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",c,b):sdkController.openExternal(\"window.imraidview\",c)}catch(d){a.showAlert(\"openExternal: \"+d)}};a.log=function(c){try{sdkController.log(\"window.imraidview\",c)}catch(b){a.showAlert(\"log: \"+b)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(c){try{sdkController.asyncPing(\"window.imraidview\",\nc)}catch(b){a.showAlert(\"asyncPing: \"+b)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};a.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};\na.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=function(){for(var c=a.getSdkVersion().split(\".\"),b=c.length,d=\"\",f=0;f<b;f++)d+=c[f];return parseInt(d)};a.getSdkVersionInt=getSdkVersionInt;a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");\nif(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(c,b,d,f){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",\nJSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(c){a.showAlert(\"getOrientation: \"+c)}};a.acceptAction=function(c){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(c))}catch(b){a.showAlert(\"acceptAction: \"+b+\", params = \"+c)}};a.rejectAction=function(c){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(c))}catch(b){a.showAlert(\"rejectAction: \"+\nb+\", params = \"+c)}};a.updateToPassbook=function(c){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};a.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,\narguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):sdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};\na.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,b,d){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,d)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&\nsdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&\nsdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=function(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=\nfunction(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};a.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};\na.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=function(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==\ntypeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpandInNative=function(a,b,d){try{void 0==a||\"string\"!=typeof a?console.log(\"url called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"screenPercentage called with invalid params\"):void 0==d||\"boolean\"!=typeof d?console.log(\"hideCloseButton called with invalid params\"):sdkController.customExpandInNative(\"window.imraidview\",\na,b,d)}catch(f){}};a.customExpand=function(b,e,d,f,g){try{void 0==d||\"number\"!=typeof d?console.log(\"screenPercentage called with invalid params\"):void 0==e||\"number\"!=typeof e?console.log(\"inputType called with invalid params\"):void 0==f||\"boolean\"!=typeof f?console.log(\"topNavBarVisible called with invalid params\"):void 0==g||\"boolean\"!=typeof g?console.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,e,d,f,g)}catch(h){a.showAlert(\"executeNativeCustomExpand: \"+\nh+\", input = \"+b+\", inputType = \"+e+\", screenPercentage = \"+d+\", bottomNavBarVisible = \"+g+\", topNavBarVisible = \"+f)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};a.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=function(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=\nfunction(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",a)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",a)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,\nvoid 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,d=void 0!=a.payload?a.payload:null;a=null;null!=d&&(a=mraidview.stringify(d));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(f){}};a.onUserAudioMuteInteraction=function(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=\nfunction(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=mraidview.getCurrentPosition(),e=b.height;return 40<=b.width&&40<=e?!0:!1}catch(d){a.showAlert(\"checkFallbackViewable: \"+d)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}};\na.loadWebView=function(b,e){try{\"string\"!==typeof b?a.showAlert(\"loadWebView: id parameter should be a string\"):\"string\"!==typeof e?a.showAlert(\"loadWebView: html parameter should be a string\"):sdkController.loadWebView(\"window.imraidview\",b,e)}catch(d){a.showAlert(\"loadWebView: \"+d)}};a.showWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"showWebView: id parameter should be a string\"):sdkController.showWebView(\"window.imraidview\",b)}catch(e){a.showAlert(\"showWebView: \"+e)}};a.sendMessage=\nfunction(b,e){try{\"string\"!==typeof b?a.showAlert(\"sendMessage: id parameter should be a string\"):\"string\"!==typeof e?a.showAlert(\"sendMessage: message parameter should be a string\"):sdkController.sendMessage(\"window.imraidview\",b,e)}catch(d){a.showAlert(\"sendMessage: \"+d)}};a.destroyWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"destroyWebView: id parameter should be a string\"):sdkController.destroyWebView(\"window.imraidview\",b)}catch(e){a.showAlert(\"destroyWebView: \"+e)}};a.pingV2=function(b){if(\"object\"===\ntypeof b&&null!==b)try{sdkController.pingV2(\"window.imraidview\",JSON.stringify(b))}catch(e){a.showAlert(\"pingV2: \"+e)}else a.showAlert(\"pingV2: pingJson is not a valid JSON object\")}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,d,f){var g=arguments.length,h,k=null;if(3>g){if(\"function\"===typeof arguments[g-1])h=arguments[g-1];else return;k={reason:1}}else a.saveContentIDMap[c]&&(h=arguments[2],k={reason:11,url:arguments[1]});\"function\"!==!h&&(k?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,h),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(k))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,d,f)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,c){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,c)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,c,f,g){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,c,f,g)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.pingV2=b.pingV2;a.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};\na.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};a.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;\na.showAd=b.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;a.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;\na.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.customExpandInNative=b.customExpandInNative;a.impressionFired=b.impressionFired;a.getImraidVersion=b.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;\na.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=b.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea;a.onReceviedSKANCallback=b.onReceviedSKANCallback;a.getOpenMode=b.getOpenMode;a.loadWebView=b.loadWebView;a.showWebView=b.showWebView;a.sendMessage=b.sendMessage;a.destroyWebView=b.destroyWebView;try{a.addEventListener(\"onUserLandingCompleted\",function(){1080>b.getSdkVersionInt()&&a.broadcastEvent(\"onUserLandingInitialized\")})}catch(c){}})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(e){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var d=-1;try{d=a.indexOf(b)}catch(f){}return d};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,e,d){if(!imIsObjValid(e)||!imIsObjValid(d))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+e+\",\"+d):a+(\"&u-tap-o=\"+e+\",\"+d));return a};b.performAdClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,f=a.landingConfig;if(!imIsObjValid(d)&&!imIsObjValid(f))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,m=null,n=null,l=null,q=null,p=null;if(imIsObjValid(e))try{m=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(r){n=\nm=0}imIsObjValid(f)?imIsObjValid(d)?(l=f.url,q=f.fallbackUrl,p=f.urlType,g=d.url,h=d.pingWV,k=d.fr):(l=f.url,p=f.urlType):(l=d.url,p=d.urlType);d=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"number\"!=typeof p||null==p)p=0;g=b.appendTapParams(g,m,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(l))switch(imIsObjValid(g)||\n(l=b.appendTapParams(l,m,n)),p){case 1:b.openEmbedded(l);break;case 2:\"ios\"==d?b.ios.openItunesProductView(l):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+d);break;default:b.openExternal(l,q)}else b.log(\"Landing url provided is null.\")}catch(s){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,f=a.landingConfig;\nif(!imIsObjValid(d)&&!imIsObjValid(f))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,m=null,n=null;if(imIsObjValid(e))try{m=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(l){n=m=0}imIsObjValid(d)&&(g=d.url,h=d.pingWV,k=d.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=\n!0;if(0>h||1<h)h=!0;g=b.appendTapParams(g,m,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(f)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,e){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,e)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
        if (interfaceC3333z7 != null) {
            String TAG2 = a1;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z7).a(TAG2, "Returning fetched Mraid Js string.");
        }
        return strA;
    }

    public final C3210ra getOrientationProperties() {
        return this.C0;
    }

    public final long getPlacementId() {
        return this.T;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public byte getPlacementType() {
        return this.f23580b;
    }

    public InterfaceC3295x getReferenceContainer() {
        return this.g0;
    }

    public final C3149nc getRenderViewTelemetry() {
        return this.W;
    }

    public final JSONArray getRenderableAdIndexes() {
        JSONArray jSONArrayN;
        InterfaceC2925a0 interfaceC2925a0 = this.j0;
        return (interfaceC2925a0 == null || (jSONArrayN = ((S0) interfaceC2925a0).N()) == null) ? new JSONArray() : jSONArrayN;
    }

    public final AdConfig.RenderingConfig getRenderingConfig() {
        return getMAdConfig().getRendering();
    }

    public final Cc getRoute() {
        return this.j;
    }

    public final JSONObject getSafeArea() {
        Df df = this.J0;
        if (df != null) {
            Integer numF = U3.f();
            Cf cf = (numF == null && (numF = U3.g) == null) ? null : (Cf) df.d.get(numF);
            if (cf != null) {
                return cf.a();
            }
        }
        return null;
    }

    public final boolean getShouldFireLandingPageBeacons() {
        return this.I0;
    }

    public final long getShowTimeStamp() {
        InterfaceC2925a0 interfaceC2925a0 = this.j0;
        if (interfaceC2925a0 != null) {
            return ((S0) interfaceC2925a0).O();
        }
        return 0L;
    }

    public final C2955bd getSiblingWebviewManager() {
        return (C2955bd) this.f23590p.getX();
    }

    public Map<String, U0> getTelemetryManagerMap() {
        return this.L0;
    }

    public Yd getTelemetryOnAdImpression() {
        Map<String, U0> telemetryManagerMap = getTelemetryManagerMap();
        return new Yd(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, this.B0, getCreativeId(), getMarkupType());
    }

    public final boolean getUnloaded() {
        return this.K0;
    }

    public final ef getVISIBILITY_CHANGE_LISTENER() {
        return this.R0;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public View getVideoContainerView() {
        return null;
    }

    public final String getViewState() {
        return this.f23591u;
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public long getViewTouchTimestamp() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    @Override // com.inmobi.media.InterfaceC3295x
    public Xe getViewableAd() {
        boolean z2;
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "viewableAd getter "));
        }
        if (this.k0 == null) {
            this.k0 = new L5(this, new C2940af(this), new S4(this.f23589n, this.B0, this.t0, this.u0, getVisibilityTrackingMinPercentage(), this.f23587i), this.f23587i);
            Set<C3199qe> set = this.f23582c;
            if (set != null) {
                for (C3199qe c3199qe : set) {
                    try {
                        if (c3199qe.f23940a == 3) {
                            Object obj = c3199qe.f23941b.get("omidAdSession");
                            C3035ga c3035ga = obj instanceof C3035ga ? (C3035ga) obj : null;
                            if (c3199qe.f23941b.containsKey("deferred")) {
                                Object obj2 = c3199qe.f23941b.get("deferred");
                                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                if (((Boolean) obj2).booleanValue()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = false;
                            }
                            Object obj3 = c3199qe.f23941b.get("customReferenceData");
                            String str2 = obj3 instanceof String ? (String) obj3 : null;
                            if (z2 && c3035ga != null) {
                                String str3 = this.n0;
                                C3163oa c3163oa = AbstractC3147na.f23833a;
                                c3163oa.getClass();
                                AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(c3163oa.f23872b, this, str3, str2);
                                Intrinsics.e(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
                                c3035ga.f23636c = adSessionContextCreateHtmlAdSessionContext;
                            }
                            if (c3035ga != null) {
                                Xe xe = this.k0;
                                Intrinsics.c(xe);
                                this.k0 = new C3099ka(this, xe, c3035ga, this.f23587i);
                            } else {
                                InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
                                if (interfaceC3333z6 != null) {
                                    String TAG = a1;
                                    Intrinsics.e(TAG, "TAG");
                                    ((A5) interfaceC3333z6).b(TAG, "Did not find a OMID ad session; the IAB decorator will not be applied.");
                                }
                            }
                        }
                    } catch (Exception e2) {
                        InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
                        if (interfaceC3333z7 != null) {
                            String str4 = a1;
                            ((A5) interfaceC3333z7).b(str4, rf.a(e2, H6.a(str4, "TAG", "Exception occurred while creating the HTML viewable ad : ")));
                        }
                    }
                }
            }
        }
        Xe xe2 = this.k0;
        Intrinsics.c(xe2);
        return xe2;
    }

    public final int[] getViewableFrameArray() {
        return this.o0;
    }

    public final int getVisibilityTrackingMinPercentage() {
        return "audio".equals(getAdType()) ? getMAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getMAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    public final tf getWebViewFactory() {
        return this.k;
    }

    public final Af getWindowInsetListener() {
        return this.N0;
    }

    public final Bd getWvStateMachine() {
        return this.o;
    }

    public final void h() {
        if (this.f23573J.get()) {
            return;
        }
        if (!this.f23570E) {
            this.f23570E = true;
            return;
        }
        this.f23573J.set(true);
        tf tfVar = this.k;
        String id = this.j.f22751b;
        tfVar.getClass();
        Intrinsics.f(id, "id");
        tfVar.f24017b.remove(id);
        InterfaceC3333z5 interfaceC3333z5 = tfVar.f24016a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("SiblingWebViewManager", AbstractC3041h0.a("Unregistered bridge for WebView ID: ", id));
        }
        Df df = this.J0;
        if (df != null) {
            df.a();
        }
        C2996e3 c2996e3 = this.T0;
        if (c2996e3 != null) {
            c2996e3.b();
        }
        this.M = true;
        this.f23576Q = -1;
        removeJavascriptInterface("sdkController");
        F7 f7 = this.v;
        if (f7 != null) {
            C3223s7 c3223s7 = f7.d;
            if (c3223s7 != null) {
                c3223s7.a();
            }
            f7.d = null;
            C3223s7 c3223s8 = f7.f22820e;
            if (c3223s8 != null) {
                c3223s8.a();
            }
            f7.f22820e = null;
            C3223s7 c3223s9 = f7.f;
            if (c3223s9 != null) {
                c3223s9.a();
            }
            f7.f = null;
        }
        this.q.clear();
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            weakReference.clear();
        }
        Xe xe = this.k0;
        if (xe != null) {
            xe.e();
        }
        Xe xe2 = this.k0;
        if (xe2 != null) {
            xe2.a();
        }
        Ia ia = this.f23581b0;
        if (ia != null) {
            C2947b5 c2947b5 = Aa.f22691a;
            if (c2947b5 != null) {
                String id2 = ia.f22890c;
                Intrinsics.f(id2, "id");
                c2947b5.f22983b.remove(id2);
                Iterator it = c2947b5.f22983b.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.e(next, "next(...)");
                    if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                        it.remove();
                    }
                }
            }
            F3 f3 = Aa.f22692b;
            if (f3 != null) {
                String id3 = ia.f22890c;
                Intrinsics.f(id3, "id");
                f3.f22983b.remove(id3);
                Iterator it2 = f3.f22983b.entrySet().iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    Intrinsics.e(next2, "next(...)");
                    if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                        it2.remove();
                    }
                }
            }
            ia.d.set(true);
        }
        this.f23581b0 = null;
        x();
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String str = a1;
            ((A5) interfaceC3333z6).a(str, Ob.a(this, str, "TAG", "stopTrackingAudioVolume "));
        }
        C3215s c3215s = C3215s.f23972a;
        C3215s.c(this.f23587i, this.r0);
        Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.clear();
        }
        setFriendlyViews(null);
        this.A0 = null;
        this.s = null;
        this.g0 = null;
        this.j0 = null;
        this.x0 = false;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public void i() {
        InterfaceC2925a0 interfaceC2925a0;
        Activity fullScreenActivity;
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "dismissCurrentViewContainer "));
        }
        F7 f7 = this.v;
        if (f7 != null) {
            C3271v7 c3271v7 = f7.f22819c;
            if (c3271v7 != null) {
                c3271v7.b();
            }
            f7.f22819c = null;
        }
        if ("Default".equals(this.f23591u)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            boolean z2 = parent instanceof ViewGroup;
            if (z2) {
                this.k.b(Rb.f23127a);
            }
            if (1 == this.f23580b) {
                InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
                if (interfaceC3333z6 != null) {
                    String str2 = a1;
                    ((A5) interfaceC3333z6).a(str2, Ob.a(this, str2, "TAG", "finishFullScreenActivity "));
                }
                InMobiAdActivity.k.remove(hashCode());
                if (getFullScreenActivity() != null) {
                    InterfaceC2925a0 interfaceC2925a1 = this.j0;
                    if (interfaceC2925a1 == null || !interfaceC2925a1.a(this)) {
                        Activity fullScreenActivity2 = getFullScreenActivity();
                        Intrinsics.d(fullScreenActivity2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                        ((InMobiAdActivity) fullScreenActivity2).f22661e = true;
                        Activity fullScreenActivity3 = getFullScreenActivity();
                        if (fullScreenActivity3 != null) {
                            fullScreenActivity3.finish();
                        }
                        if (this.f23576Q != -1 && (fullScreenActivity = getFullScreenActivity()) != null) {
                            fullScreenActivity.overridePendingTransition(0, this.f23576Q);
                        }
                    }
                } else {
                    if ("Default".equals(this.f23591u)) {
                        setAndUpdateViewState("Hidden");
                    }
                    z();
                }
            } else if (z2) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        if (this.f23571F != EnumC2991df.VISIBLE || (interfaceC2925a0 = this.j0) == null) {
            return;
        }
        interfaceC2925a0.a(this, getFullScreenActivity());
    }

    public final void j() {
        if (this.K0) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
            if (interfaceC3333z5 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).a(TAG, "fireAdFailed " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        this.y0 = true;
        C3149nc c3149nc = this.W;
        if (c3149nc != null) {
            Map mapA = c3149nc.a();
            long j = c3149nc.f23836c;
            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String strA = c3149nc.a("FireAdFailed");
            Pd pd = Pd.f23077a;
            Pd.b(strA, mapA, Td.SDK);
        }
        getListener().g(this);
    }

    public final void k() {
        if (this.f23573J.get()) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
            if (interfaceC3333z5 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).b(TAG, "fireAdReady called on destroyed view");
                return;
            }
            return;
        }
        if (this.K0) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
            if (interfaceC3333z6 != null) {
                String TAG2 = a1;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).a(TAG2, "fireAdReady " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        C3149nc c3149nc = this.W;
        if (c3149nc != null) {
            Map mapA = c3149nc.a();
            long j = c3149nc.f23836c;
            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            mapA.put("latency", Long.valueOf(jElapsedRealtime));
            c3149nc.f23838h = jElapsedRealtime;
            String strA = c3149nc.a("FireAdReady");
            Pd pd = Pd.f23077a;
            Pd.b(strA, mapA, Td.SDK);
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
        if (interfaceC3333z7 != null) {
            String str = a1;
            ((A5) interfaceC3333z7).a(str, Ob.a(this, str, "TAG", "fireAdReady "));
        }
        this.x0 = true;
        if (this.f23589n == 0) {
            m();
        }
        B();
        getListener().h(this);
    }

    public final void l() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "fireClickTrackers "));
        }
        C2996e3 c2996e3 = this.T0;
        if (c2996e3 != null && !c2996e3.g.get()) {
            c2996e3.d.g = 1;
            Intrinsics.c(c2996e3.f23543c);
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z6).a(str2, Ob.a(this, str2, "TAG", "fireOnUserInteraction "));
        }
        c("window.imraidview.onUserInteraction();");
        getListener().b(this);
    }

    public void m() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "fireImpression "));
        }
        if ("video".equals(this.B0) || "audio".equals(this.B0)) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z6).a(str2, Ob.a(this, str2, "TAG", "recordContextualData "));
        }
        C2996e3 c2996e3 = this.T0;
        if (c2996e3 != null) {
            c2996e3.a();
        }
        c("window.imraidview.impressionRendered();");
        getListener().c(this);
    }

    public final boolean n() {
        if (Intrinsics.a(getAdType(), "banner") && getAdConfig().getMraid3().getBannerEnabled()) {
            return true;
        }
        return Intrinsics.a(getAdType(), "int") && getAdConfig().getMraid3().getInterstitialEnabled();
    }

    public void o() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "onImpressionFired "));
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z6).a(str2, Ob.a(this, str2, "TAG", "recordContextualData "));
        }
        C2996e3 c2996e3 = this.T0;
        if (c2996e3 != null) {
            c2996e3.a();
        }
        getListener().a(getTelemetryOnAdImpression());
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        Set<View> setKeySet;
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "onAttachedToWindow "));
        }
        super.onAttachedToWindow();
        F7 f7 = this.v;
        if (f7 != null) {
            C3223s7 c3223s7 = f7.d;
            if (c3223s7 != null) {
                c3223s7.b();
            }
            C3223s7 c3223s8 = f7.f22820e;
            if (c3223s8 != null) {
                c3223s8.b();
            }
            C3223s7 c3223s9 = f7.f;
            if (c3223s9 != null) {
                c3223s9.b();
            }
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z6).c(str2, Ob.a(this, str2, "TAG", "setIsViewHardwareAccelerated "));
        }
        this.x = isHardwareAccelerated();
        LinkedHashSet linkedHashSetK0 = null;
        if (this.r == null) {
            ViewParent parent = getParent();
            this.r = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        y();
        InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
        if (interfaceC3333z7 != null) {
            String str3 = a1;
            ((A5) interfaceC3333z7).a(str3, Ob.a(this, str3, "TAG", "startTrackingExposure "));
        }
        if (!n() || this.f23585e) {
            gestureDetectorOnGestureListenerC3005ec = this;
            InterfaceC3333z5 interfaceC3333z8 = gestureDetectorOnGestureListenerC3005ec.f23587i;
            if (interfaceC3333z8 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z8).b(TAG, "exposureTracker is already initialized");
            }
        } else {
            Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
            if (friendlyViews != null && (setKeySet = friendlyViews.keySet()) != null) {
                linkedHashSetK0 = CollectionsKt.k0(setKeySet);
            }
            gestureDetectorOnGestureListenerC3005ec = this;
            gestureDetectorOnGestureListenerC3005ec.G0 = new I(gestureDetectorOnGestureListenerC3005ec, linkedHashSetK0, getAdConfig().getMraid3().getExposureChangeInterval(), this.s0, this.f23587i);
        }
        I i2 = gestureDetectorOnGestureListenerC3005ec.G0;
        if (i2 != null) {
            if (i2.j.compareAndSet(false, true)) {
                Throwable thA = Result.a(C2.a(new F(i2)));
                if (thA != null) {
                    InterfaceC3333z5 interfaceC3333z9 = i2.f22869e;
                    if (interfaceC3333z9 != null) {
                        ((A5) interfaceC3333z9).b("AdExposureTracker", androidx.datastore.preferences.protobuf.a.o(thA, new StringBuilder("Error starting exposure tracking - ")));
                    }
                    i2.j.set(false);
                    S5 s5 = S5.f23167a;
                    S5.d.a(new C3011f2(thA));
                }
            } else {
                InterfaceC3333z5 interfaceC3333z10 = i2.f22869e;
                if (interfaceC3333z10 != null) {
                    ((A5) interfaceC3333z10).c("AdExposureTracker", "Exposure tracking is already started");
                }
            }
        }
        InterfaceC3333z5 interfaceC3333z11 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z11 != null) {
            String str4 = a1;
            ((A5) interfaceC3333z11).a(str4, Ob.a(this, str4, "TAG", "startTrackingAudioVolume "));
        }
        if (n() && !gestureDetectorOnGestureListenerC3005ec.f23585e) {
            C3215s c3215s = C3215s.f23972a;
            C3215s.a(gestureDetectorOnGestureListenerC3005ec.f23587i, gestureDetectorOnGestureListenerC3005ec.r0);
        }
        InterfaceC3333z5 interfaceC3333z12 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z12 != null) {
            String TAG2 = a1;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z12).a(TAG2, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        InterfaceC3333z5 interfaceC3333z13 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z13 != null) {
            ((A5) interfaceC3333z13).b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "onDetachedFromWindow "));
        }
        C2963c4 c2963c4 = this.z0;
        if (c2963c4 != null) {
            C2963c4.a(c2963c4, 8, true, null, 12);
        }
        F7 f7 = this.v;
        if (f7 != null) {
            C3223s7 c3223s7 = f7.d;
            if (c3223s7 != null) {
                c3223s7.a();
            }
            C3223s7 c3223s8 = f7.f22820e;
            if (c3223s8 != null) {
                c3223s8.a();
            }
            C3223s7 c3223s9 = f7.f;
            if (c3223s9 != null) {
                c3223s9.a();
            }
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z6).a(TAG, "Detached from window");
        }
        C3153o0 c3153o0 = this.D0;
        if (c3153o0 == null) {
            Intrinsics.m("adQualityManager");
            throw null;
        }
        if (c3153o0.d.get()) {
            c3153o0.a("session end is already triggered");
        } else if (!c3153o0.f23842a.getEnabled()) {
            c3153o0.a("config kill switch - false. ad quality will skip");
        } else if (c3153o0.g == null) {
            c3153o0.a("setup not done. ignore trigger");
        } else {
            c3153o0.d.set(true);
            c3153o0.a(false);
        }
        if (this.E0.get()) {
            ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).schedule(new A.Y(this, 2), 1L, TimeUnit.SECONDS);
        }
        y();
        x();
        InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
        if (interfaceC3333z7 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z7).a(str2, Ob.a(this, str2, "TAG", "stopTrackingAudioVolume "));
        }
        C3215s c3215s = C3215s.f23972a;
        C3215s.c(this.f23587i, this.r0);
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e2) {
            InterfaceC3333z5 interfaceC3333z8 = this.f23587i;
            if (interfaceC3333z8 != null) {
                String str3 = a1;
                StringBuilder sbA = H6.a(str3, "TAG", "Detaching WebView from window encountered an error ( ");
                sbA.append(e2.getMessage());
                sbA.append(" )");
                ((A5) interfaceC3333z8).b(str3, sbA.toString());
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e2) {
        Intrinsics.f(e2, "e");
        if (this.f23585e || !getRenderingConfig().getSupportedGestures().contains(1)) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
            if (interfaceC3333z5 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).c(TAG, "Double tap gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String TAG2 = a1;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).a(TAG2, "onDoubleTapEvent detected \n " + e2);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (e2.getAction() == 1) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(B2.c(e2.getX()));
                jSONArray.put(B2.c(e2.getY()));
            } catch (JSONException e3) {
                InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
                if (interfaceC3333z7 != null) {
                    String TAG3 = a1;
                    Intrinsics.e(TAG3, "TAG");
                    ((A5) interfaceC3333z7).a(TAG3, "Exception in onDoubleTap", e3);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            c("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e2) {
        Intrinsics.f(e2, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e2) {
        Intrinsics.f(e2, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.f(e2, "e2");
        if (this.f23585e || !getRenderingConfig().getSupportedGestures().contains(6)) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
            if (interfaceC3333z5 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).c(TAG, "fling gesture is disabled from config");
            }
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) CollectionsKt.I(Integer.valueOf(B2.c(motionEvent.getX())), Integer.valueOf(B2.c(motionEvent.getY())))));
            jSONArray.put(new JSONArray((Collection) CollectionsKt.I(Integer.valueOf(B2.c(e2.getX())), Integer.valueOf(B2.c(e2.getY())))));
            jSONArray.put(new JSONArray((Collection) CollectionsKt.I(Float.valueOf(f), Float.valueOf(f2))));
        } catch (Exception e3) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
            if (interfaceC3333z6 != null) {
                String TAG2 = a1;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).a(TAG2, "Exception in onFling", e3);
            }
        }
        c("window.imraidview.onGestureDetected('6', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e2) {
        Intrinsics.f(e2, "e");
        if (this.f23585e || !getRenderingConfig().getSupportedGestures().contains(5)) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
            if (interfaceC3333z5 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).c(TAG, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String TAG2 = a1;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).a(TAG2, "onLongPress detected \n " + e2);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(B2.c(e2.getX()));
            jSONArray.put(B2.c(e2.getY()));
        } catch (JSONException e3) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
            if (interfaceC3333z7 != null) {
                String TAG3 = a1;
                Intrinsics.e(TAG3, "TAG");
                ((A5) interfaceC3333z7).a(TAG3, "Exception in onLongPress", e3);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        c("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.f(e2, "e2");
        boolean z2 = this.f23585e;
        if (z2 && !this.S) {
            this.S = true;
            SparseArray sparseArray = InMobiAdActivity.k;
            Y0.getClass();
            JSONObject jsonObject = Gb.a("IN_CUSTOM_BROWSER", "onScroll");
            Intrinsics.f(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = InMobiAdActivity.f22657l;
            if (gestureDetectorOnGestureListenerC3005ec == null) {
                return false;
            }
            gestureDetectorOnGestureListenerC3005ec.a(jsonObject);
            return false;
        }
        if (z2) {
            return false;
        }
        C2990de scrollThrottler = getScrollThrottler();
        scrollThrottler.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - scrollThrottler.f23532b < scrollThrottler.f23531a) {
            scrollThrottler.f23532b = jElapsedRealtime;
            return false;
        }
        scrollThrottler.f23532b = jElapsedRealtime;
        if (!getRenderingConfig().getSupportedGestures().contains(8)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) CollectionsKt.I(Integer.valueOf(B2.c(motionEvent.getX())), Integer.valueOf(B2.c(motionEvent.getY())))));
            jSONArray.put(new JSONArray((Collection) CollectionsKt.I(Integer.valueOf(B2.c(e2.getX())), Integer.valueOf(B2.c(e2.getY())))));
        } catch (Exception e3) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
            if (interfaceC3333z5 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).a(TAG, "Exception in onScroll", e3);
            }
        }
        c("window.imraidview.onGestureDetected('8', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e2) {
        Intrinsics.f(e2, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e2) {
        Intrinsics.f(e2, "e");
        if (this.f23585e || !getRenderingConfig().getSupportedGestures().contains(0)) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
            if (interfaceC3333z5 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).c(TAG, "Click gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String TAG2 = a1;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).a(TAG2, "onSingleTapConfirmed detected \n " + e2);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(B2.c(e2.getX()));
            jSONArray.put(B2.c(e2.getY()));
        } catch (JSONException e3) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
            if (interfaceC3333z7 != null) {
                String TAG3 = a1;
                Intrinsics.e(TAG3, "TAG");
                ((A5) interfaceC3333z7).a(TAG3, "Exception in onSingleTapConfirmed", e3);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        c("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e2) {
        Intrinsics.f(e2, "e");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "onSingleTapUp detected \n " + e2);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "onSizeChanged "));
        }
        super.onSizeChanged(i2, i3, i4, i5);
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            StringBuilder sb = new StringBuilder("onSizeChanged (");
            sb.append(i2);
            sb.append(", ");
            ((A5) interfaceC3333z6).a(TAG, android.support.v4.media.a.p(sb, i3, ')'));
        }
        if (i2 == 0 || i3 == 0) {
            return;
        }
        int iB = B2.b(i2 / U3.b());
        int iB2 = B2.b(i3 / U3.b());
        InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
        if (interfaceC3333z7 != null) {
            String TAG2 = a1;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z7).a(TAG2, "fireSizeChanged " + this + " w-" + iB + " h-" + iB2);
        }
        c("window.mraidview.broadcastEvent('sizeChange'," + iB + AbstractJsonLexerKt.COMMA + iB2 + ");");
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.f(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.F0) {
                InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
                if (interfaceC3333z5 != null) {
                    String TAG = a1;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).b(TAG, "onTouchEvent Invalid Coordinates " + event);
                }
                this.F0 = true;
            }
            return super.onTouchEvent(event);
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String str = a1;
            ((A5) interfaceC3333z6).a(str, Ob.a(this, str, "TAG", "onTouchEvent "));
        }
        if (this.f23585e && !this.f23577R) {
            this.f23577R = true;
            SparseArray sparseArray = InMobiAdActivity.k;
            Y0.getClass();
            JSONObject jsonObject = Gb.a("IN_CUSTOM_BROWSER", "onInteraction");
            Intrinsics.f(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = InMobiAdActivity.f22657l;
            if (gestureDetectorOnGestureListenerC3005ec != null) {
                gestureDetectorOnGestureListenerC3005ec.a(jsonObject);
            }
        }
        if (this.f23580b == 1) {
            this.v0.a(event);
        }
        this.w0.onTouchEvent(event);
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.onTouchEvent(event);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "onWindowFocusChanged " + this + " - " + z2);
        }
        super.onWindowFocusChanged(z2);
        if (z2) {
            if (isShown()) {
                P4 p4 = S4.k;
                if (p4.a(this, this, this.u0, null) && p4.a(this, this, this.u0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity == null || !fullScreenActivity.isInMultiWindowMode()) {
            c(z2);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onWindowVisibilityChanged " + this + ' ' + i2);
        }
        super.onWindowVisibilityChanged(i2);
        boolean z2 = false;
        boolean z3 = i2 == 0;
        if (z3) {
            int visibilityTrackingMinPercentage = getVisibilityTrackingMinPercentage();
            if (isShown()) {
                P4 p4 = S4.k;
                if (p4.a(this, this, visibilityTrackingMinPercentage, null) && p4.a(this, this, visibilityTrackingMinPercentage)) {
                    z2 = true;
                }
            }
        } else {
            z2 = z3;
        }
        c(z2);
    }

    public final void p() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "onUserLandingCompleted "));
        }
        c("window.imraid.broadcastEvent('onUserLandingCompleted');");
    }

    public final void q() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "processUnload "));
        }
        if (this.f23573J.get()) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
            if (interfaceC3333z6 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z6).b(TAG, "unload called on destroyed view");
                return;
            }
            return;
        }
        if (!n()) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
            if (interfaceC3333z7 != null) {
                String TAG2 = a1;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z7).b(TAG2, "mraid 3.0 is not enabled");
                return;
            }
            return;
        }
        if (this.y0) {
            InterfaceC3333z5 interfaceC3333z8 = this.f23587i;
            if (interfaceC3333z8 != null) {
                String TAG3 = a1;
                Intrinsics.e(TAG3, "TAG");
                ((A5) interfaceC3333z8).b(TAG3, "unload called on failed view");
                return;
            }
            return;
        }
        if (this.K0) {
            return;
        }
        this.K0 = true;
        ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
        A.Y y = new A.Y(this, 0);
        executorC3160o7.getClass();
        executorC3160o7.f23866a.post(y);
    }

    public final void r() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "setCurrentPosition "));
        }
        this.f23568A = new JSONObject();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        try {
            JSONObject jSONObject = this.f23568A;
            if (jSONObject != null) {
                jSONObject.put("x", B2.b(iArr[0] / U3.b()));
            }
            JSONObject jSONObject2 = this.f23568A;
            if (jSONObject2 != null) {
                jSONObject2.put("y", B2.b(iArr[1] / U3.b()));
            }
            int iB = B2.b(getWidth() / U3.b());
            int iB2 = B2.b(getHeight() / U3.b());
            JSONObject jSONObject3 = this.f23568A;
            if (jSONObject3 != null) {
                jSONObject3.put("width", iB);
            }
            JSONObject jSONObject4 = this.f23568A;
            if (jSONObject4 != null) {
                jSONObject4.put("height", iB2);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.L) {
            this.C = false;
            this.L.notifyAll();
        }
    }

    public final void s() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "setDefaultPosition "));
        }
        int[] iArr = new int[2];
        this.f23593z = new JSONObject();
        if (this.r == null) {
            ViewParent parent = getParent();
            this.r = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        WeakReference weakReference = this.r;
        try {
            if ((weakReference != null ? (ViewGroup) weakReference.get() : null) != null) {
                WeakReference weakReference2 = this.r;
                if (weakReference2 != null && (viewGroup3 = (ViewGroup) weakReference2.get()) != null) {
                    viewGroup3.getLocationOnScreen(iArr);
                }
                JSONObject jSONObject = this.f23593z;
                if (jSONObject != null) {
                    jSONObject.put("x", B2.b(iArr[0] / U3.b()));
                }
                JSONObject jSONObject2 = this.f23593z;
                if (jSONObject2 != null) {
                    jSONObject2.put("y", B2.b(iArr[1] / U3.b()));
                }
                WeakReference weakReference3 = this.r;
                int iB = B2.b(((weakReference3 == null || (viewGroup2 = (ViewGroup) weakReference3.get()) == null) ? 0 : viewGroup2.getWidth()) / U3.b());
                WeakReference weakReference4 = this.r;
                int iB2 = B2.b(((weakReference4 == null || (viewGroup = (ViewGroup) weakReference4.get()) == null) ? 0 : viewGroup.getHeight()) / U3.b());
                JSONObject jSONObject3 = this.f23593z;
                if (jSONObject3 != null) {
                    jSONObject3.put("width", iB);
                }
                JSONObject jSONObject4 = this.f23593z;
                if (jSONObject4 != null) {
                    jSONObject4.put("height", iB2);
                }
            } else {
                JSONObject jSONObject5 = this.f23593z;
                if (jSONObject5 != null) {
                    jSONObject5.put("x", 0);
                }
                JSONObject jSONObject6 = this.f23593z;
                if (jSONObject6 != null) {
                    jSONObject6.put("y", 0);
                }
                JSONObject jSONObject7 = this.f23593z;
                if (jSONObject7 != null) {
                    jSONObject7.put("width", 0);
                }
                JSONObject jSONObject8 = this.f23593z;
                if (jSONObject8 != null) {
                    jSONObject8.put("height", 0);
                }
            }
        } catch (JSONException unused) {
        }
        synchronized (this.K) {
            this.f23569B = false;
            this.K.notifyAll();
        }
    }

    public final void setAdPodHandler(InterfaceC2925a0 interfaceC2925a0) {
        this.j0 = interfaceC2925a0;
    }

    public void setAdType(String str) {
        this.f23584d0 = str;
    }

    public final void setAllowAutoRedirection(boolean z2) {
        this.i0 = z2;
    }

    public final void setAndUpdateViewState(String state) {
        Intrinsics.f(state, "state");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "setAndUpdateViewState "));
        }
        this.f23591u = state;
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String str2 = a1;
            StringBuilder sbA = H6.a(str2, "TAG", "set state:");
            sbA.append(this.f23591u);
            ((A5) interfaceC3333z6).a(str2, sbA.toString());
        }
        Locale locale = Locale.ENGLISH;
        String strP = com.applovin.impl.Z.p(locale, "ENGLISH", state, locale, "this as java.lang.String).toLowerCase(locale)");
        InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
        if (interfaceC3333z7 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z7).a(TAG, "fireStateChange " + this + ' ' + strP);
        }
        c("window.mraidview.broadcastEvent('stateChange','" + strP + "');");
    }

    public final void setBackButtonDisabled(boolean z2) {
        this.H = z2;
    }

    public final void setBeaconUrl(String str) {
        this.H0 = str;
    }

    public final void setBlobProvider(InterfaceC2944b2 interfaceC2944b2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "setBlobProvider "));
        }
        this.f0 = interfaceC2944b2;
    }

    public final void setCloseAssetArea(Bf value) {
        Intrinsics.f(value, "value");
        if (!this.S0) {
            Context context = getContext();
            Intrinsics.e(context, "getContext(...)");
            if (!B2.a(context)) {
                return;
            }
        }
        this.X0 = new Bf(0, value.f22729b, value.f22730c, 0);
    }

    public final void setCloseEndCardTracker(String str) {
        Ve veD;
        Le le;
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z5).a(str2, Ob.a(this, str2, "TAG", "setCloseEndCardTracker "));
        }
        InterfaceC3295x referenceContainer = getReferenceContainer();
        if (!(referenceContainer instanceof C2934a9) || str == null) {
            return;
        }
        C2934a9 c2934a9 = (C2934a9) referenceContainer;
        c2934a9.getClass();
        InterfaceC3333z5 interfaceC3333z6 = c2934a9.W;
        if (interfaceC3333z6 != null) {
            String str3 = c2934a9.X;
            ((A5) interfaceC3333z6).c(str3, I6.a(str3, "TAG", "Setting close end tracker with URL : ", str));
        }
        View videoContainerView = c2934a9.getVideoContainerView();
        if (videoContainerView instanceof C3130m9) {
            Object tag = ((C3130m9) videoContainerView).getVideoView().getTag();
            C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
            if (c2968c9 == null || (veD = c2968c9.d()) == null || (le = ((Ue) veD).j) == null) {
                return;
            }
            le.f.add(new U8(str, 0, "closeEndCard", null));
        }
    }

    public final void setConfiguredArea(long j) {
        this.p0 = ((long) getWidth()) * ((long) getHeight());
    }

    public final void setContentURL(String str) {
        this.n0 = str;
    }

    public final void setContextualDataHandler(C2996e3 c2996e3) {
        this.T0 = c2996e3;
    }

    public void setCreativeId(String str) {
        this.f23578U = str;
    }

    public final void setDisableBackButton(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "setDisableBackButton "));
        }
        this.H = z2;
    }

    public final void setEmbeddedBrowserJsCallbacks(InterfaceC2929a4 interfaceC2929a4) {
        this.A0 = interfaceC2929a4;
    }

    public void setExitAnimation(int i2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "setExitAnimation "));
        }
        this.f23576Q = i2;
    }

    public final void setExposureTracker(I i2) {
        this.G0 = i2;
    }

    public void setFriendlyViews(Map<View, FriendlyObstructionPurpose> map) {
        this.e0 = map;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public void setFullScreenActivityContext(Activity activity) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "setFullScreenActivityContext "));
        }
        this.q = new WeakReference(activity);
        A();
        if (this.f23585e || activity == null) {
            return;
        }
        Df df = this.J0;
        if (df != null) {
            df.a();
        }
        this.J0 = new Df(activity, this.N0, this.f23587i);
    }

    public final void setImmersiveMode(boolean z2) {
        this.S0 = z2;
    }

    public void setImpressionId(String str) {
        this.d = str;
    }

    public final void setLandingPageTelemetryControlInfoOnWebViewClient(R6 r6) {
        C2963c4 c2963c4 = this.z0;
        if (c2963c4 == null) {
            return;
        }
        c2963c4.j = r6;
        c2963c4.k = new O6(r6, c2963c4);
    }

    public final void setLandingScheme(String str) {
        Intrinsics.f(str, "<set-?>");
        this.f = str;
    }

    public final void setMAdConfig(AdConfig adConfig) {
        Intrinsics.f(adConfig, "<set-?>");
        this.f23592w = adConfig;
    }

    public final void setMCreativeType(String str) {
        this.B0 = str;
    }

    public final void setMImpressionMinPercentageViewed(int i2) {
        this.u0 = i2;
    }

    public final void setMImpressionMinTimeViewed(int i2) {
        this.t0 = i2;
    }

    public final void setMViewableAd(Xe xe) {
        this.k0 = xe;
    }

    public final void setMarkupTypeAdUnit(String str) {
        Intrinsics.f(str, "<set-?>");
        this.O0 = str;
    }

    public final void setOrientationProperties(C3210ra c3210ra) {
        Intrinsics.f(c3210ra, "<set-?>");
        this.C0 = c3210ra;
    }

    public final void setPingAckListener(Ha pingAckListener) {
        Intrinsics.f(pingAckListener, "pingAckListener");
        this.m = pingAckListener;
    }

    public final void setPingManager(Ia pingManager) {
        Intrinsics.f(pingManager, "pingManager");
        this.f23581b0 = pingManager;
    }

    public final void setPlacementId(long j) {
        this.T = j;
    }

    public final void setPreloadView(boolean z2) {
        this.h0 = z2;
    }

    public void setReferenceContainer(InterfaceC3295x interfaceC3295x) {
        this.g0 = interfaceC3295x;
    }

    public final void setRenderViewEventListener(AbstractC3037gc abstractC3037gc) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "setRenderViewEventListener "));
        }
        this.s = abstractC3037gc;
    }

    public final void setRenderViewTelemetry(C3149nc c3149nc) {
        this.W = c3149nc;
    }

    public final void setScrollable(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "setScrollable "));
        }
        setScrollContainer(z2);
        setVerticalScrollBarEnabled(z2);
        setHorizontalScrollBarEnabled(z2);
    }

    public final void setShouldFireLandingPageBeacons(boolean z2) {
        this.I0 = z2;
    }

    public void setTelemetryManagerMap(Map<String, U0> map) {
        this.L0 = map;
    }

    public final void setUnloaded(boolean z2) {
        this.K0 = z2;
    }

    public final void setUseCustomClose(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "setUseCustomClose " + this + ' ' + z2);
        }
        this.D = z2;
    }

    public void setViewTouchTimestamp(long j) {
        this.g = j;
    }

    public final void setWatermark(WatermarkData watermarkData) {
        Intrinsics.f(watermarkData, "watermarkData");
        if (getAdConfig().getWatermarkEnabled()) {
            byte[] bArrDecode = Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
            Intrinsics.e(bArrDecode, "decode(...)");
            getViewTreeObserver().addOnGlobalLayoutListener(new A.X(this, bArrDecode, watermarkData, 0));
        } else {
            InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
            if (interfaceC3333z5 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).c(TAG, "Watermark disabled from config. ignoring...");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "stopLoading "));
        }
        if (this.f23573J.get()) {
            return;
        }
        super.stopLoading();
    }

    public final void t() {
        int webImpressionMinPercentageViewed;
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "setFallbackImpressionMinPercentageViewed "));
        }
        if ("video".equals(this.B0)) {
            webImpressionMinPercentageViewed = getMAdConfig().getViewability().getVideoImpressionMinPercentageViewed();
        } else {
            webImpressionMinPercentageViewed = ("audio".equals(this.B0) && "audio".equals(getAdType())) ? getMAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getMAdConfig().getViewability().getWebImpressionMinPercentageViewed();
        }
        this.u0 = webImpressionMinPercentageViewed;
    }

    public final void u() {
        int webImpressionMinTimeViewed;
        if ("video".equals(this.B0)) {
            webImpressionMinTimeViewed = getMAdConfig().getViewability().getVideoImpressionMinTimeViewed();
        } else {
            webImpressionMinTimeViewed = ("audio".equals(this.B0) && "audio".equals(getAdType())) ? getMAdConfig().getViewability().getAudioImpressionMinTimeViewed() : getMAdConfig().getViewability().getWebImpressionMinTimeViewed();
        }
        this.t0 = webImpressionMinTimeViewed;
    }

    public final void v() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "setFallbackImpressionParams "));
        }
        u();
        t();
        w();
    }

    public final void w() {
        byte audioImpressionType;
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "setFallbackImpressionType "));
        }
        String adType = getAdType();
        if (Intrinsics.a(adType, "banner")) {
            audioImpressionType = getMAdConfig().getViewability().getBannerImpressionType();
        } else {
            audioImpressionType = Intrinsics.a(adType, "audio") ? getMAdConfig().getViewability().getAudioImpressionType() : getMAdConfig().getViewability().getInterstitialImpressionType();
        }
        this.f23589n = audioImpressionType;
    }

    public final void x() {
        InterfaceC3333z5 interfaceC3333z5;
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String str = a1;
            ((A5) interfaceC3333z6).a(str, Ob.a(this, str, "TAG", "stopTrackingExposure "));
        }
        I i2 = this.G0;
        if (i2 != null) {
            if (!i2.j.compareAndSet(true, false)) {
                InterfaceC3333z5 interfaceC3333z7 = i2.f22869e;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).c("AdExposureTracker", "Exposure tracking is already stopped");
                    return;
                }
                return;
            }
            Throwable thA = Result.a(C2.a(new G(i2)));
            if (thA == null || (interfaceC3333z5 = i2.f22869e) == null) {
                return;
            }
            ((A5) interfaceC3333z5).b("AdExposureTracker", androidx.datastore.preferences.protobuf.a.o(thA, new StringBuilder("Error stopping exposure tracking - ")));
        }
    }

    public final void y() {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        Lazy lazy = AbstractC3181pc.f23897a;
        if (Intrinsics.a(getRoute().f22751b, "default")) {
            gestureDetectorOnGestureListenerC3005ec = this;
        } else {
            tf webViewFactory = getWebViewFactory();
            webViewFactory.getClass();
            gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) webViewFactory.f24017b.get("default");
        }
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            new A2(gestureDetectorOnGestureListenerC3005ec, !this.D, !this.G, this.f23587i).a(this.X0);
        }
    }

    public final void z() {
        getListener().d(this);
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "ad dismissed");
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a();
        }
        C3153o0 c3153o0 = this.D0;
        if (c3153o0 == null) {
            Intrinsics.m("adQualityManager");
            throw null;
        }
        if (c3153o0.d.get()) {
            c3153o0.a("session end is already triggered");
            return;
        }
        if (!c3153o0.f23842a.getEnabled()) {
            c3153o0.a("config kill switch - false. ad quality will skip");
        } else if (c3153o0.g == null) {
            c3153o0.a("setup not done. ignore trigger");
        } else {
            c3153o0.d.set(true);
            c3153o0.a(false);
        }
    }

    public final void d(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "processDisableCloseRegionRequest " + this + ' ' + z2);
        }
        this.G = z2;
        y();
    }

    public final void e(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "processUseCustomCloseRequest " + this + ' ' + z2);
        }
        setUseCustomClose(z2);
        y();
    }

    public final void a(String url, String templateInfoStr, boolean z2) {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        Exception exc;
        Activity activity;
        Intrinsics.f(url, "url");
        Intrinsics.f(templateInfoStr, "templateInfoStr");
        try {
            JSONObject jSONObject = new JSONObject(templateInfoStr);
            InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
            if (interfaceC3333z5 != null) {
                try {
                    String TAG = a1;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).a(TAG, "report - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
                } catch (Exception e2) {
                    exc = e2;
                    gestureDetectorOnGestureListenerC3005ec = this;
                }
            }
            if (Intrinsics.a(getAdType(), "int") && Build.VERSION.SDK_INT >= 29 && (activity = (Activity) this.q.get()) != null) {
                ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
                try {
                    C3009f0.a(activity, this, url, z2, jSONObject, this.M0);
                    return;
                } catch (Exception e3) {
                    e = e3;
                    gestureDetectorOnGestureListenerC3005ec = this;
                }
            } else {
                gestureDetectorOnGestureListenerC3005ec = this;
                try {
                    ScheduledExecutorService scheduledExecutorService2 = C3009f0.f23594a;
                    C3009f0.a(gestureDetectorOnGestureListenerC3005ec, this, url, z2, jSONObject, gestureDetectorOnGestureListenerC3005ec.M0);
                    return;
                } catch (Exception e4) {
                    e = e4;
                }
            }
        } catch (Exception e5) {
            e = e5;
            gestureDetectorOnGestureListenerC3005ec = this;
        }
        exc = e;
        InterfaceC3333z5 interfaceC3333z6 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z6 != null) {
            String TAG2 = a1;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).a(TAG2, "issue wile reporting ad", exc);
        }
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public final boolean d() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "canRedirectExternally Called");
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement()) {
            return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
        }
        return true;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final void e() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "disableHardwareAcceleration called. "));
        }
        try {
            setLayerType(1, null);
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public static final void b(GestureDetectorOnGestureListenerC3005ec this$0, String js) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(js, "$js");
        try {
            if (this$0.f23573J.get()) {
                return;
            }
            String str = "javascript:try{" + js + "}catch(e){}";
            InterfaceC3333z5 interfaceC3333z5 = this$0.f23587i;
            if (interfaceC3333z5 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).a(TAG, "Injecting javascript");
            }
            InterfaceC3333z5 interfaceC3333z6 = this$0.f23587i;
            if (interfaceC3333z6 != null) {
                String TAG2 = a1;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).c(TAG2, "evaluateScript " + this$0);
            }
            this$0.evaluateJavascript(str, null);
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z7 = this$0.f23587i;
            if (interfaceC3333z7 != null) {
                String str2 = a1;
                ((A5) interfaceC3333z7).b(str2, rf.a(e2, H6.a(str2, "TAG", "SDK encountered an unexpected error injecting JavaScript in the Ad container; ")));
            }
        }
    }

    public static final void a(GestureDetectorOnGestureListenerC3005ec this$0) {
        InterfaceC3333z5 interfaceC3333z5;
        Intrinsics.f(this$0, "this$0");
        if (this$0.isAttachedToWindow() || (interfaceC3333z5 = this$0.f23587i) == null) {
            return;
        }
        ((A5) interfaceC3333z5).a();
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0354  */
    /* JADX WARN: Code duplicated, block: B:136:0x035d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0360  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    public final void a(AbstractC3037gc abstractC3037gc, AdConfig adConfig) {
        int audioNetworkLoadsLimit;
        WebViewClient webViewClient;
        boolean z2;
        Q q;
        Q q2;
        boolean zA;
        WatermarkData watermarkData;
        AdQualityControl adQualityControl;
        Intrinsics.f(adConfig, "adConfig");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "initialize "));
        }
        if (Intrinsics.a(this.O0, "htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        setMAdConfig(adConfig);
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z6).a(str2, Ob.a(this, str2, "TAG", "setImpressionParams "));
        }
        if (this.f23582c == null) {
            v();
        } else {
            try {
                v();
                for (C3199qe c3199qe : this.f23582c) {
                    if (c3199qe.f23940a == 2) {
                        if (c3199qe.f23941b.containsKey("type")) {
                            Object obj = c3199qe.f23941b.get("type");
                            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
                            this.f23589n = (byte) ((Integer) obj).intValue();
                        } else {
                            w();
                        }
                        if (c3199qe.f23941b.containsKey("time")) {
                            Object obj2 = c3199qe.f23941b.get("time");
                            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                            this.t0 = ((Integer) obj2).intValue();
                        } else {
                            u();
                        }
                        if (c3199qe.f23941b.containsKey("view")) {
                            Object obj3 = c3199qe.f23941b.get("view");
                            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Int");
                            this.u0 = ((Integer) obj3).intValue();
                        } else {
                            t();
                        }
                        if (this.f23589n == 2) {
                            if (c3199qe.f23941b.containsKey("pixel")) {
                                Object obj4 = c3199qe.f23941b.get("pixel");
                                Intrinsics.d(obj4, "null cannot be cast to non-null type kotlin.Int");
                                this.q0 = ((Integer) obj4).intValue();
                            } else {
                                w();
                            }
                            if (c3199qe.f23941b.containsKey("frame")) {
                                Object obj5 = c3199qe.f23941b.get("frame");
                                JSONArray jSONArray = obj5 instanceof JSONArray ? (JSONArray) obj5 : null;
                                if (jSONArray != null) {
                                    this.o0 = new int[jSONArray.length()];
                                    int length = jSONArray.length();
                                    for (int i2 = 0; i2 < length; i2++) {
                                        int[] iArr = this.o0;
                                        if (iArr != null) {
                                            Object obj6 = jSONArray.get(i2);
                                            Intrinsics.d(obj6, "null cannot be cast to non-null type kotlin.Int");
                                            iArr[i2] = ((Integer) obj6).intValue();
                                        }
                                    }
                                }
                            } else {
                                w();
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
                InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
                if (interfaceC3333z7 != null) {
                    String TAG = a1;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z7).b(TAG, "Exception in parsing the impressionType and pixel frame");
                }
                v();
            } catch (Exception unused2) {
                InterfaceC3333z5 interfaceC3333z8 = this.f23587i;
                if (interfaceC3333z8 != null) {
                    String TAG2 = a1;
                    Intrinsics.e(TAG2, "TAG");
                    ((A5) interfaceC3333z8).b(TAG2, "SDK encountered an unexpected error in parsing impression parameters");
                }
                v();
            }
        }
        this.s = abstractC3037gc;
        ViewParent parent = getParent();
        this.r = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        setBackgroundColor(getRenderingConfig().getWebviewBackgroundColor());
        new A7(getMraidConfig().getUrl(), getMraidConfig().getMaxRetries(), getMraidConfig().getRetryInterval(), getMraidConfig().getExpiry(), this.f23587i).a();
        setImportantForAccessibility(2);
        setScrollable(false);
        int i3 = Build.VERSION.SDK_INT;
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(getAdConfig().getRendering().getEnableDomStorage());
        getSettings().setGeolocationEnabled(true);
        if (this.f23585e) {
            InterfaceC3333z5 interfaceC3333z9 = this.f23587i;
            if (interfaceC3333z9 != null) {
                String TAG3 = a1;
                Intrinsics.e(TAG3, "TAG");
                ((A5) interfaceC3333z9).c(TAG3, "view is in-app browser. Using EmbeddedBrowserViewClient.");
            }
            C2963c4 c2963c4 = new C2963c4("IN_CUSTOM_BROWSER", Kb.f22930a, Lb.f22952a, Mb.f22985a, this.f23587i);
            this.z0 = c2963c4;
            webViewClient = c2963c4;
        } else {
            InterfaceC3333z5 interfaceC3333z10 = this.f23587i;
            if (interfaceC3333z10 != null) {
                String TAG4 = a1;
                Intrinsics.e(TAG4, "TAG");
                ((A5) interfaceC3333z10).c(TAG4, "view is ad. Using RenderViewClient");
            }
            C3021fc c3021fc = new C3021fc(this.W, this.f23587i, new Nb(this));
            String adType = getAdType();
            if (Intrinsics.a(adType, "banner")) {
                audioNetworkLoadsLimit = getMAdConfig().getRendering().getBannerNetworkLoadsLimit();
            } else {
                audioNetworkLoadsLimit = Intrinsics.a(adType, "audio") ? getMAdConfig().getRendering().getAudioNetworkLoadsLimit() : getMAdConfig().getRendering().getOtherNetworkLoadsLimit();
            }
            c3021fc.f23359b = audioNetworkLoadsLimit;
            webViewClient = c3021fc;
        }
        setWebViewClient(webViewClient);
        if (this.f23585e && getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
        setWebChromeClient(this.V0);
        if (!this.f23585e) {
            C3270v6 c3270v6 = new C3270v6(this.f23580b, this);
            InterfaceC3333z5 interfaceC3333z11 = this.f23587i;
            if (interfaceC3333z11 != null) {
                c3270v6.f24051c = interfaceC3333z11;
            }
            addJavascriptInterface(c3270v6, "sdkController");
        }
        this.v = new F7(this, this.f23587i);
        this.D0 = new C3153o0(adConfig.getAdQuality(), this.f23587i);
        if (i3 >= 29) {
            setWebViewRenderProcessClient((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX(), new C3085jc(this.f23587i, this.W));
        }
        Q q3 = this.f23588l;
        if (q3 == null || (adQualityControl = q3.f23094n) == null) {
            z2 = false;
        } else {
            C3153o0 c3153o0 = this.D0;
            if (c3153o0 != null) {
                c3153o0.a("adQuality session setup");
                if (!c3153o0.f23842a.getEnabled()) {
                    c3153o0.a("config kill switch - false. ad quality will skip");
                } else if (c3153o0.f23844c.get()) {
                    c3153o0.a("session already started. skip");
                } else {
                    c3153o0.a("verifying control flags");
                    String beacon = adQualityControl.getBeacon();
                    if (beacon != null && beacon.length() == 0) {
                        c3153o0.a("no beacon received. aborting...");
                        ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
                        if (scheduledExecutorService != null) {
                            scheduledExecutorService.shutdown();
                            try {
                                try {
                                    scheduledExecutorService.shutdownNow();
                                } catch (InterruptedException unused3) {
                                    scheduledExecutorService.shutdownNow();
                                    Thread.currentThread().interrupt();
                                    c3153o0.a("session end - cleanup");
                                    c3153o0.g = null;
                                    c3153o0.f.clear();
                                    z2 = false;
                                    c3153o0.f23844c.set(false);
                                    c3153o0.d.set(false);
                                    c3153o0.a("ad quality session is already in progress. skipping...");
                                    q = this.f23588l;
                                    if (q != null) {
                                        setWatermark(watermarkData);
                                    }
                                    q2 = this.f23588l;
                                    if (q2 != null) {
                                        zA = Intrinsics.a(q2.f23093l, Boolean.TRUE);
                                    } else {
                                        zA = z2;
                                    }
                                    if (zA) {
                                        e();
                                    }
                                }
                            } catch (Exception e2) {
                                Log.e("AdQualityComponent", "shutdown fail", e2);
                                Thread.currentThread().interrupt();
                            }
                        }
                        c3153o0.a("session end - cleanup");
                        c3153o0.g = null;
                        c3153o0.f.clear();
                        z2 = false;
                        c3153o0.f23844c.set(false);
                        c3153o0.d.set(false);
                        c3153o0.a("ad quality session is already in progress. skipping...");
                    } else {
                        z2 = false;
                        c3153o0.g = adQualityControl;
                    }
                }
                z2 = false;
            } else {
                Intrinsics.m("adQualityManager");
                throw null;
            }
        }
        q = this.f23588l;
        if (q != null && (watermarkData = q.m) != null) {
            setWatermark(watermarkData);
        }
        q2 = this.f23588l;
        if (q2 != null) {
            zA = Intrinsics.a(q2.f23093l, Boolean.TRUE);
        } else {
            zA = z2;
        }
        if (zA) {
            e();
        }
    }

    public final void b(String str, String url) {
        Intrinsics.f(url, "url");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z5).a(str2, Ob.a(this, str2, "TAG", "processMediaPlaybackRequest "));
        }
        if (this.K0) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
            if (interfaceC3333z6 != null) {
                String TAG = a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z6).b(TAG, "Media playback is not allowed after unload! Ignoring request ...");
                return;
            }
            return;
        }
        if (1 != this.f23580b) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
            if (interfaceC3333z7 != null) {
                String TAG2 = a1;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z7).b(TAG2, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        Activity activity = (Activity) this.q.get();
        if (activity == null) {
            InterfaceC3333z5 interfaceC3333z8 = this.f23587i;
            if (interfaceC3333z8 != null) {
                String TAG3 = a1;
                Intrinsics.e(TAG3, "TAG");
                ((A5) interfaceC3333z8).b(TAG3, "Media playback is  not allowed before it is visible! Ignoring request ...");
            }
            a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        }
        F7 f7 = this.v;
        if (f7 != null) {
            f7.a(url, activity);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:62:0x0109 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r6.equals("html5video") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        if (r6.equals("inlineVideo") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (r5.x == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        if (r5.f23574N == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e3, code lost:
    
        r6 = r5.f23587i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e5, code lost:
    
        if (r6 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e7, code lost:
    
        r2 = com.inmobi.media.GestureDetectorOnGestureListenerC3005ec.a1;
        kotlin.jvm.internal.Intrinsics.e(r2, "TAG");
        ((com.inmobi.media.A5) r6).c(r2, "HTML5 video supported:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3005ec.f(java.lang.String):boolean");
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final boolean c() {
        return this.f23573J.get();
    }

    public final void c(String js) {
        Intrinsics.f(js, "js");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "injectJavaScript " + this + " - " + js);
        }
        new Handler(getContainerContext().getMainLooper()).postAtFrontOfQueue(new RunnableC0905n(17, this, js));
    }

    public static final void b(GestureDetectorOnGestureListenerC3005ec this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.getListener().j(this$0);
    }

    public static final void c(GestureDetectorOnGestureListenerC3005ec this$0) {
        Intrinsics.f(this$0, "this$0");
        synchronized (this$0.t) {
            try {
                if ("Loading".equals(this$0.f23591u)) {
                    InterfaceC3333z5 interfaceC3333z5 = this$0.f23587i;
                    if (interfaceC3333z5 != null) {
                        String TAG = a1;
                        Intrinsics.e(TAG, "TAG");
                        ((A5) interfaceC3333z5).a(TAG, "updateWebViewLoaded " + this$0);
                    }
                    this$0.getListener().f(this$0);
                    this$0.setAndUpdateViewState("Default");
                    InterfaceC3333z5 interfaceC3333z6 = this$0.f23587i;
                    if (interfaceC3333z6 != null) {
                        String TAG2 = a1;
                        Intrinsics.e(TAG2, "TAG");
                        ((A5) interfaceC3333z6).a(TAG2, "updateWebViewLoaded state changed to " + this$0.f23591u);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, String contentId, String url) {
        Intrinsics.f(contentId, "contentId");
        Intrinsics.f(url, "url");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z5).c(str2, Ob.a(this, str2, "TAG", "processSaveContentRequest "));
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z6).a(TAG, "saveContent called: content ID: " + contentId + "; URL: " + url);
        }
        if (!f("saveContent")) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
            if (interfaceC3333z7 != null) {
                String TAG2 = a1;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z7).b(TAG2, "saveContent called despite the fact that it is not supported");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", url);
                jSONObject.put("reason", 7);
            } catch (JSONException unused) {
            }
            String string = jSONObject.toString();
            Intrinsics.e(string, "toString(...)");
            a(str, androidx.datastore.preferences.protobuf.a.n("sendSaveContentResult(\"saveContent_", contentId, "\", 'failed', \"", StringsKt.I(string, "\"", "\\\""), "\");"));
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(new C3307xb((byte) -1, url));
        C3088k c3088k = new C3088k(androidx.media3.extractor.text.ttml.a.m("toString(...)"), hashSet, this.W0, contentId, 2);
        c3088k.f23731c = str;
        C3233t1.a(c3088k);
    }

    public final void b(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "fireNextAdShowComplete "));
        }
        String str2 = "window.imraidview.broadcastEvent('adShowSuccess'," + z2 + ");";
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z6).a(TAG, str2 + " Index: " + getCurrentRenderingPodAdIndex());
        }
        c(str2);
    }

    public final void b(String json) {
        Intrinsics.f(json, "json");
        if (getAdConfig().getPingV2().getEnabled()) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
            if (interfaceC3333z5 != null) {
                String str = a1;
                ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "handlePing "));
            }
            if (this.f23581b0 == null) {
                this.f23581b0 = new Ia(this.m, this.W);
            }
            Ia ia = this.f23581b0;
            Intrinsics.c(ia);
            ia.b(json);
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z6).a(str2, Ob.a(this, str2, "TAG", "pings v2 is disabled "));
        }
        C3149nc c3149nc = this.W;
        if (c3149nc != null) {
            Map mapA = c3149nc.a();
            mapA.put("errorCode", (short) 2257);
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            Oa.a("PingFailed", mapA);
        }
        Ha ha = this.m;
        EnumC3141n4[] enumC3141n4Arr = EnumC3141n4.f23825a;
        ((Yb) ha).a("", -100, "Ping V2 is disabled from SDK config", System.currentTimeMillis(), 0);
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final void a(byte b2, Map map) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "fireEvent " + this + " 2");
        }
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public final void a(String mraidApi) {
        Intrinsics.f(mraidApi, "mraidApi");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "sendFraudBeaconAndTelemetryEvent "));
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z6).a(TAG, "fireDetectAutoRedirectFraud " + this + ' ' + mraidApi);
        }
        c("window.mraidview.fireRedirectFraudBeacon('" + mraidApi + "')");
        String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f23587i;
        if (interfaceC3333z7 != null) {
            String TAG2 = a1;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z7).c(TAG2, "sendTelemetryForAutoRedirectFraud " + this + ' ' + mraidApi + ' ' + adType);
        }
        HashMap map = new HashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            map.put("creativeId", creativeId);
        }
        map.put("trigger", mraidApi);
        String impressionId = getImpressionId();
        if (impressionId != null) {
            map.put("impressionId", impressionId);
        }
        map.put("adType", adType);
        InterfaceC3333z5 interfaceC3333z8 = this.f23587i;
        if (interfaceC3333z8 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z8).a(str2, Ob.a(this, str2, "TAG", "processTelemetryEvent "));
        }
        getListener().a("BlockAutoRedirection", map);
    }

    public final void a(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "fireNextAdLoadComplete "));
        }
        String str2 = "window.imraidview.broadcastEvent('adLoadSuccess'," + z2 + ");";
        InterfaceC3333z5 interfaceC3333z6 = this.f23587i;
        if (interfaceC3333z6 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z6).c(TAG, str2 + " Index: " + getCurrentRenderingPodAdIndex());
        }
        c(str2);
    }

    public final void a(String str, JSONObject message) {
        short s;
        Intrinsics.f(message, "message");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "fireError " + this + " - " + message);
        }
        c("window.imraidview.broadcastEvent('error','" + message + "', '" + str + "');");
        Object objA = C2.a(new C2971cc(message.optString("errorCode")));
        if (objA instanceof Result.Failure) {
            return;
        }
        short sShortValue = ((Number) objA).shortValue();
        C3149nc c3149nc = this.W;
        if (c3149nc != null) {
            Map mapA = c3149nc.a();
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
                        case BaseATView.g.f38290N /* 303 */:
                            s = 2270;
                            break;
                        case 304:
                            s = 2271;
                            break;
                        case 305:
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
                        case 313:
                            s = 2281;
                            break;
                        default:
                            s = sShortValue;
                            break;
                    }
                    break;
            }
            mapA.put("errorCode", Short.valueOf(s));
            long j = c3149nc.f23836c;
            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            Pd pd = Pd.f23077a;
            Pd.b("CompanionWebViewLoadFailed", mapA, Td.SDK);
        }
    }

    public final void a(String str, String message, String str2) {
        Intrinsics.f(message, "message");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            StringBuilder sb = new StringBuilder("fireError ");
            sb.append(this);
            sb.append(" - ");
            ((A5) interfaceC3333z5).a(TAG, android.support.v4.media.a.s(sb, message, " - ", str2));
        }
        if (str == null || str2 == null) {
            return;
        }
        a(str, androidx.datastore.preferences.protobuf.a.n("broadcastEvent('error',\"", message, "\", \"", str2, "\")"));
    }

    public final void a(String str, String callback) {
        Intrinsics.f(callback, "callback");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z5).a(str2, Ob.a(this, str2, "TAG", "fireJavaScriptCallback "));
        }
        if (str == null) {
            return;
        }
        c(str + '.' + callback);
    }

    public void a(C3210ra orientationProperties) {
        Intrinsics.f(orientationProperties, "orientationProperties");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "setOrientationProperties "));
        }
        this.C0 = orientationProperties;
        A();
    }

    @Override // com.inmobi.media.InterfaceC3226sa
    public final void a(EnumC3179pa orientation) {
        Intrinsics.f(orientation, "orientation");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "onOrientationUpdate "));
        }
    }

    public static final boolean a(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, JsResult jsResult) {
        InterfaceC3333z5 interfaceC3333z5 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(gestureDetectorOnGestureListenerC3005ec, str, "TAG", "shouldRenderPopup "));
        }
        if (gestureDetectorOnGestureListenerC3005ec.getRenderingConfig().getShouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        InterfaceC3333z5 interfaceC3333z6 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z6 != null) {
            String str2 = a1;
            ((A5) interfaceC3333z6).a(str2, Ob.a(gestureDetectorOnGestureListenerC3005ec, str2, "TAG", "firePopupBlockedEvent "));
        }
        gestureDetectorOnGestureListenerC3005ec.c("window.mraidview.popupBlocked('popupBlocked')");
        return false;
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public final boolean a() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            StringBuilder sbA = H6.a(str, "TAG", "hasUserInteracted ");
            sbA.append(getViewTouchTimestamp());
            sbA.append(' ');
            sbA.append(getRenderingConfig().getUserTouchResetTime());
            ((A5) interfaceC3333z5).a(str, sbA.toString());
        }
        if (!getRenderingConfig().getAutoRedirectionEnforcement() || this.i0) {
            return true;
        }
        return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
    }

    public static final void a(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, String str, String str2, String str3) {
        InterfaceC3333z5 interfaceC3333z5 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "onUserLandingInitialized " + gestureDetectorOnGestureListenerC3005ec + " isInAppBrowser: " + gestureDetectorOnGestureListenerC3005ec.f23585e);
        }
        gestureDetectorOnGestureListenerC3005ec.c("window.imraid.broadcastEvent('onUserLandingInitialized');");
        if (str2 == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3005ec.a(str2, androidx.datastore.preferences.protobuf.a.n("broadcastEvent('", str, "Successful','", str3, "');"));
    }

    public final void a(JSONObject jsonObject) {
        Intrinsics.f(jsonObject, "jsonObject");
        if (getLandingPageConfig().getEnableOnLpLifeCycleEvent()) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
            if (interfaceC3333z5 != null) {
                String str = a1;
                ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "onLpLifeCycleEvent "));
            }
            c("window.imraid.broadcastEvent('onLpLifeCycleEvent', " + jsonObject + ");");
        }
    }

    public final void a(String trackerName, Map macros) {
        Intrinsics.f(trackerName, "trackerName");
        Intrinsics.f(macros, "macros");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(this, str, "TAG", "fireLandingPageTracker "));
        }
        getListener().a(this, trackerName, macros);
    }

    public final void a(boolean z2, short s) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "fireRenderProcessGoneTelemetry");
        }
        C3149nc c3149nc = this.W;
        if (c3149nc != null) {
            String strA = c3149nc.a("WebViewRenderProcessGoneEvent");
            String str = c3149nc.f23834a.k;
            if (str == null) {
                str = "";
            }
            Pair pair = new Pair("trigger", str);
            long j = c3149nc.f23836c;
            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
            LinkedHashMap linkedHashMapL = MapsKt.l(pair, new Pair("latency", Long.valueOf(SystemClock.elapsedRealtime() - j)), new Pair("source", "render_view_" + c3149nc.f23834a.f23664a.b()), new Pair("isCrashed", Boolean.valueOf(z2)), new Pair("creativeId", c3149nc.f23834a.f), new Pair("errorCode", Short.valueOf(s)));
            Pd pd = Pd.f23077a;
            Pd.b(strA, linkedHashMapL, Td.SDK);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3005ec sourceView, String targetId) throws JSONException {
        Intrinsics.f(sourceView, "sourceView");
        Intrinsics.f(targetId, "targetId");
        InterfaceC3333z5 interfaceC3333z5 = this.f23587i;
        if (interfaceC3333z5 != null) {
            String str = a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(this, str, "TAG", "fireShowWebViewSuccess "));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.c("window.imraidview.broadcastEvent('webViewShown'," + jSONObject + ");");
    }
}
