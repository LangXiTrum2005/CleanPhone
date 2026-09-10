package com.inmobi.media;

import A.RunnableC0887e;
import A.RunnableC0905n;
import A.RunnableC0913u;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.recyclerview.widget.RecyclerView;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.inmobi.media.S0;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$ABConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$AdABConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$AdNonABConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$AdPreloadConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$MediationConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$NonABConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$PreloadConfig;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TreeSet;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class S0 extends AbstractC3037gc implements InterfaceC2944b2, InterfaceC3007ee, Te, InterfaceC2925a0 {
    public static final /* synthetic */ int M = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f23130A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f23131B;
    public final A C;
    public N D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C3031g6 f23132E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C3319y7 f23133F;
    public final Handler G;
    public final LinkedHashMap H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final U0 f23134I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public WatermarkData f23135J;
    public final Lazy K;
    public final K0 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f23136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdConfig f23137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f23138c;
    public C3151ne d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B0 f23139e;
    public WeakReference f;
    public ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public T7 f23140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f23141i;
    public InterfaceC3333z5 j;
    public byte k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f23142l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3005ec f23143n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23144p;
    public boolean q;
    public boolean r;
    public C2969ca s;
    public Z t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C3312y0 f23145u;
    public C3039ge v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23146w;
    public int x;
    public long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TreeSet f23147z;

    public S0(Context context, Z adPlacement, F0 f0) {
        Boolean boolO;
        Intrinsics.f(context, "context");
        Intrinsics.f(adPlacement, "adPlacement");
        this.g = new ArrayList();
        this.y = -1L;
        this.f23147z = new TreeSet();
        this.C = A.f22668a;
        this.G = new Handler(Looper.getMainLooper());
        this.H = new LinkedHashMap();
        this.f23134I = new U0(this);
        this.K = LazyKt.b(new R0(this));
        this.L = new K0(this);
        toString();
        this.f23138c = new WeakReference(context);
        this.t = adPlacement;
        WeakReference weakReference = new WeakReference(f0);
        this.f = weakReference;
        String strQ = q();
        C3312y0 c3312y0 = this.f23145u;
        this.D = new N(weakReference, strQ, (c3312y0 == null || (boolO = c3312y0.o()) == null) ? false : boolO.booleanValue());
        n0();
    }

    public static /* synthetic */ void R() {
    }

    public static /* synthetic */ void U() {
    }

    public static final tf c(S0 s0) {
        return (tf) s0.K.getX();
    }

    public static final /* synthetic */ String e() {
        return "S0";
    }

    public final int A() {
        return this.x;
    }

    public long A0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "timeSincePodShow ", this));
        }
        if (this.f23130A) {
            return System.currentTimeMillis() - this.y;
        }
        return -1L;
    }

    public final TreeSet<Integer> B() {
        return this.f23147z;
    }

    public final Ue B0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "trySetTheLocalVideoDescriptor ", this));
        }
        C3040h c3040hM = m();
        if (c3040hM == null) {
            throw new IllegalStateException("No ad");
        }
        if (!(c3040hM instanceof W8)) {
            return null;
        }
        W8 w8 = (W8) c3040hM;
        C3072j c3072jB = Nc.a().b(w8.f23317a);
        if (c3072jB == null || !c3072jB.a()) {
            throw new IllegalStateException("Asset not available in cache");
        }
        String str = c3072jB.f23704c;
        String str2 = w8.f23318b;
        String str3 = w8.f23319c;
        ArrayList arrayList = w8.d;
        ArrayList arrayList2 = w8.f23320e;
        AdConfig adConfig = this.f23137b;
        Intrinsics.c(adConfig);
        return new Ue(str, str2, str3, arrayList, arrayList2, adConfig.getVastVideo());
    }

    public final long C() {
        return this.y;
    }

    public final void C0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("S0", "ad unloaded");
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).d("S0", "AdUnit " + this + " state - UNLOADED");
        }
        d((byte) 8);
    }

    public final Handler D() {
        return this.f23142l;
    }

    public final String E() {
        String strU;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "markupType getter ", this));
        }
        C3040h c3040hM = m();
        return (c3040hM == null || (strU = c3040hM.u()) == null) ? "unknown" : strU;
    }

    public Integer F() {
        return null;
    }

    public final T7 G() {
        return this.f23140h;
    }

    public final C2969ca H() {
        return this.s;
    }

    public final Z I() {
        return this.t;
    }

    public abstract byte J();

    public String K() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "getPodAdContext ", this));
        }
        if (this.f23130A) {
            return this.f23131B;
        }
        return null;
    }

    public final String L() {
        return d(0);
    }

    public final Map<String, String> M() {
        return this.t.f();
    }

    public JSONArray N() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "getRenderableAdIndexes ", this));
        }
        JSONArray jSONArray = new JSONArray();
        for (Integer num : this.f23147z) {
            Intrinsics.c(num);
            jSONArray.put(num.intValue());
        }
        return jSONArray;
    }

    public long O() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "getShowTimeStamp ", this));
        }
        if (this.f23130A) {
            return this.y;
        }
        return -1L;
    }

    public final Unit P() {
        F0 f0R = r();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zA = a(f0R, jCurrentTimeMillis);
        Unit unit = Unit.f43263a;
        if (zA) {
            return unit;
        }
        this.r = true;
        if (this.s == null) {
            this.s = new C2969ca(this);
        }
        A a2 = this.C;
        int iHashCode = hashCode();
        H4 h4 = new H4(this, jCurrentTimeMillis, this.j);
        a2.getClass();
        A.a(iHashCode, h4);
        return unit;
    }

    public final byte Q() {
        return this.f23136a;
    }

    public final String S() {
        LinkedList<C3040h> linkedListF;
        C3040h c3040h;
        String strW;
        C3312y0 c3312y0 = this.f23145u;
        return (c3312y0 == null || (linkedListF = c3312y0.f()) == null || (c3040h = (C3040h) CollectionsKt.y(linkedListF)) == null || (strW = c3040h.w()) == null) ? "" : strW;
    }

    public final byte T() {
        return this.k;
    }

    public final void V() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "handleInterActive ", this));
        }
        A a2 = this.C;
        int iHashCode = hashCode();
        J0 j0 = new J0(this);
        a2.getClass();
        A.a(iHashCode, j0);
    }

    public final boolean W() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "hasAdExpired ", this));
        }
        C3040h c3040hM = m();
        if (c3040hM == null) {
            return false;
        }
        AdConfig adConfig = this.f23137b;
        Intrinsics.c(adConfig);
        return c3040hM.a(adConfig.getCacheConfig(q()).getTimeToLive());
    }

    public final boolean X() {
        AdConfig.RenderingConfig rendering;
        AdConfig adConfig = this.f23137b;
        return adConfig != null && (rendering = adConfig.getRendering()) != null && rendering.getEnablePubMuteControl() && Uc.o();
    }

    public final boolean Y() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.f23136a));
        }
        if (!G4.f22837a.a()) {
            g();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (f0()) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                StringBuilder sbA = H6.a("S0", "TAG", "Some of the dependency libraries for ");
                sbA.append(q());
                sbA.append(" not found");
                ((A5) interfaceC3333z6).b("S0", sbA.toString());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b2 = this.f23136a;
        if (b2 == 1) {
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b("S0", "load with reasponse called while loading");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b2 != 7) {
            return false;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).b("S0", "ad active before load");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public final boolean Z() {
        return this.o;
    }

    public abstract /* synthetic */ void a(int i2, GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec);

    @Override // com.inmobi.media.AbstractC3037gc
    public void a(GestureDetectorOnGestureListenerC3005ec renderView, boolean z2) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", "onRenderProcessGone didCrash=" + z2 + " state=" + ((int) this.f23136a));
        }
        byte b2 = this.f23136a;
        if (b2 == 0) {
            short s = z2 ? (short) 2214 : (short) 2213;
            m0();
            renderView.a(z2, s);
            return;
        }
        if (b2 == 1) {
            short s2 = z2 ? (short) 2216 : (short) 2215;
            m0();
            b(s2);
            F0 f0R = r();
            if (f0R != null) {
                f0R.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b2 == 3) {
            renderView.a(z2, z2 ? (short) 2226 : (short) 2225);
            return;
        }
        if (b2 == 2) {
            m0();
            b(z2 ? (short) 2218 : (short) 2217);
            F0 f0R2 = r();
            if (f0R2 != null) {
                f0R2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b2 == 4 || b2 == 6 || b2 == 7 || b2 != 8) {
            return;
        }
        renderView.a(z2, z2 ? (short) 2240 : (short) 2241);
    }

    public final boolean a0() {
        return this.m;
    }

    public abstract /* synthetic */ void b();

    public final boolean b0() {
        return this.f23130A;
    }

    public void c0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "load  ", this));
        }
        U0 u0 = this.f23134I;
        u0.getClass();
        u0.f23243c = SystemClock.elapsedRealtime();
        a(new L0(this), new M0(this));
    }

    public final void d(byte b2) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "from ");
            sbA.append((int) this.f23136a);
            sbA.append(" to ");
            sbA.append((int) b2);
            sbA.append(' ');
            sbA.append(this);
            ((A5) interfaceC3333z5).d("S0", sbA.toString());
        }
        this.f23136a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff A[LOOP:1: B:58:0x00f9->B:60:0x00ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x010d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ef A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void d0() throws IllegalStateException {
        List<String> listC;
        Iterator<String> it;
        int size;
        int i2;
        C3312y0 c3312y0;
        List<String> listC2;
        LinkedList<C3040h> linkedListF;
        C3040h c3040h;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "loadAd_ ", this));
        }
        C3040h c3040hM = m();
        if (c3040hM == null || W()) {
            c3040hM = null;
        }
        if (c3040hM == null) {
            throw new IllegalStateException("Unable to get topAd");
        }
        String strU = c3040hM.u();
        int iHashCode = strU.hashCode();
        if (iHashCode == -1084172778) {
            if (strU.equals("inmobiJson")) {
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    StringBuilder sbA = H6.a("S0", "TAG", "Loading ad with impressionId : ");
                    sbA.append(c3040hM.s());
                    ((A5) interfaceC3333z6).a("S0", sbA.toString());
                }
                C3312y0 c3312y1 = this.f23145u;
                if (c3312y1 != null) {
                    AdConfig adConfig = this.f23137b;
                    Intrinsics.c(adConfig);
                    c3312y1.a(adConfig, this, this.j);
                }
                listC = c3040hM.c(C3040h.WIN_BEACON);
                if (this.f23130A) {
                    C3312y0 c3312y2 = this.f23145u;
                    Intrinsics.c(c3312y2);
                    size = c3312y2.f().size();
                    while (i2 < size) {
                        c3312y0 = this.f23145u;
                        if (c3312y0 != null) {
                            listC2 = null;
                        } else {
                            listC2 = null;
                        }
                        if (listC2 == null) {
                        }
                    }
                }
                if (listC == null) {
                    return;
                }
                it = listC.iterator();
                while (it.hasNext()) {
                    C3298x2.f24089a.a(it.next(), true, this.j);
                }
            }
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                StringBuilder sbA2 = H6.a("S0", "TAG", "Can not handle fallback for");
                sbA2.append(c3040hM.u());
                ((A5) interfaceC3333z7).b("S0", sbA2.toString());
            }
            throw new IllegalStateException("Can not handle fallback for markup type: " + c3040hM.u());
        }
        if (iHashCode == 3213227) {
            listC = c3040hM.c(C3040h.WIN_BEACON);
            if (this.f23130A) {
                C3312y0 c3312y3 = this.f23145u;
                Intrinsics.c(c3312y3);
                size = c3312y3.f().size();
                while (i2 < size) {
                    c3312y0 = this.f23145u;
                    if (c3312y0 != null) {
                        listC2 = null;
                    } else {
                        listC2 = null;
                    }
                    if (listC2 == null) {
                    }
                }
            }
            if (listC == null) {
                return;
            }
            it = listC.iterator();
            while (it.hasNext()) {
                C3298x2.f24089a.a(it.next(), true, this.j);
            }
        }
        listC = c3040hM.c(C3040h.WIN_BEACON);
        if (this.f23130A) {
            C3312y0 c3312y4 = this.f23145u;
            Intrinsics.c(c3312y4);
            size = c3312y4.f().size();
            for (i2 = 1; i2 < size; i2++) {
                c3312y0 = this.f23145u;
                if (c3312y0 != null || (linkedListF = c3312y0.f()) == null || (c3040h = linkedListF.get(i2)) == null) {
                    listC2 = null;
                } else {
                    listC2 = c3040h.c(C3040h.WIN_BEACON);
                }
                if (listC2 == null && (listC instanceof LinkedList)) {
                    ((LinkedList) listC).addAll(listC2);
                }
            }
        }
        if (listC == null) {
            return;
        }
        it = listC.iterator();
        while (it.hasNext()) {
            C3298x2.f24089a.a(it.next(), true, this.j);
        }
    }

    public final void e0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "makeUnitActive ", this));
        }
        this.o = false;
    }

    public final void f(int i2) {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "initializeHtmlAdContainer ", this));
        }
        Context contextT = t();
        if (contextT == null) {
            return;
        }
        try {
            if (this.g.get(i2) != null && ((gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) this.g.get(i2)) == null || !gestureDetectorOnGestureListenerC3005ec.f23573J.get())) {
                return;
            }
            C3040h c3040hB = b(i2);
            Q qA = a(i2);
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = ((tf) this.K.getX()).a(new Cc("adUnit-" + i2, "default"), contextT, (short) 0, qA);
            this.g.set(i2, gestureDetectorOnGestureListenerC3005ecA);
            AdConfig adConfig = this.f23137b;
            Intrinsics.c(adConfig);
            gestureDetectorOnGestureListenerC3005ecA.a(this, adConfig);
            InterfaceC3333z5 interfaceC3333z6 = gestureDetectorOnGestureListenerC3005ecA.f23587i;
            if (interfaceC3333z6 != null) {
                String str = GestureDetectorOnGestureListenerC3005ec.a1;
                ((A5) interfaceC3333z6).c(str, Ob.a(gestureDetectorOnGestureListenerC3005ecA, str, "TAG", "initContextualData "));
            }
            gestureDetectorOnGestureListenerC3005ecA.T0 = new C2996e3(c3040hB, gestureDetectorOnGestureListenerC3005ecA.T);
        } catch (Exception e2) {
            a((GestureDetectorOnGestureListenerC3005ec) this.g.get(this.f23146w), (short) 2136);
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).a("S0", "Exception while initializing WebView", e2);
            }
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public boolean f0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "missingPrerequisitesForAd ", this));
        }
        try {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            reflectionFactory.b(RecyclerView.class).l();
            reflectionFactory.b(CustomTabsClient.class).l();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public final void g(F0 f0) {
        Boolean boolO;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "adUnitEventListener setter ", this));
        }
        WeakReference weakReference = new WeakReference(f0);
        this.f = weakReference;
        String strQ = q();
        C3312y0 c3312y0 = this.f23145u;
        N n2 = new N(weakReference, strQ, (c3312y0 == null || (boolO = c3312y0.o()) == null) ? false : boolO.booleanValue());
        this.D = n2;
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            n2.f = interfaceC3333z6;
        }
    }

    public void g0() {
        U0 u0 = this.f23134I;
        u0.getClass();
        u0.f23245h = SystemClock.elapsedRealtime();
    }

    public final void h(int i2) {
        this.f23146w = i2;
    }

    public final T h0() {
        String string;
        Integer num;
        Integer num2;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "prepareAdRequest ", this));
        }
        Context contextT = t();
        X9 x9 = null;
        Z9 z9 = contextT != null ? new Z9(contextT, this.j) : null;
        AdConfig adConfig = this.f23137b;
        String url = adConfig != null ? adConfig.getUrl() : null;
        AdConfig adConfig2 = this.f23137b;
        Intrinsics.c(adConfig2);
        C3262ue c3262ue = new C3262ue(adConfig2.getIncludeIds());
        ArrayList arrayListA = Nc.a().a();
        if (arrayListA.isEmpty()) {
            string = null;
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(URLEncoder.encode(((C3072j) it.next()).f23703b, "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
            }
            string = jSONArray.toString();
        }
        Z z2 = this.t;
        if (z9 != null) {
            if (z9.d) {
                x9 = new X9(MapsKt.g(new Pair("n-h-id", z9.f23409c)));
            } else {
                InterfaceC3333z5 interfaceC3333z6 = z9.f23408b;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).a("NovatiqDataHandler", "Novatiq disabled. skip");
                }
                x9 = new X9(EmptyMap.X);
            }
        }
        X9 x10 = x9;
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        AdConfig adConfig3 = this.f23137b;
        T t = new T(url, c3262ue, string, z2, x10, interfaceC3333z7, adConfig3 != null ? adConfig3.getApplyGzipReq() : false);
        t.C = this.t.i();
        t.f23190B = q();
        t.f23189A = "unifiedSdkJson";
        t.D = o();
        C3319y7 c3319y7 = this.f23133F;
        int iIntValue = 15000;
        t.f23013p = (c3319y7 == null || (num2 = c3319y7.d) == null) ? 15000 : num2.intValue();
        C3319y7 c3319y8 = this.f23133F;
        if (c3319y8 != null && (num = c3319y8.d) != null) {
            iIntValue = num.intValue();
        }
        t.q = iIntValue;
        t.o = X();
        return t;
    }

    public final void i(int i2) {
        this.x = i2;
    }

    public C3151ne i0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "provideTimeoutConfigurations ", this));
        }
        C3151ne c3151ne = this.d;
        Intrinsics.c(c3151ne);
        return c3151ne;
    }

    public final AdConfig j() {
        return this.f23137b;
    }

    public abstract void j0();

    public final InterfaceC3295x k() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "adMarkupContainer getter ", this));
        }
        byte b2 = this.f23136a;
        String strE = E();
        int iHashCode = strE.hashCode();
        if (iHashCode == -1084172778) {
            if (!strE.equals("inmobiJson") || b2 == 0 || 1 == b2 || 3 == b2 || 2 == b2) {
                return null;
            }
            return this.f23140h;
        }
        if (iHashCode == 3213227) {
            if (!strE.equals("html") || b2 == 0 || 1 == b2 || 3 == b2 || 8 == b2) {
                return null;
            }
            return w();
        }
        if (iHashCode != 1236050372 || !strE.equals("htmlUrl") || b2 == 0 || 1 == b2 || 3 == b2 || 8 == b2) {
            return null;
        }
        return w();
    }

    public void k0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "resetContainersForNextAd ", this));
        }
        T7 t7 = this.f23140h;
        if (t7 != null) {
            t7.b();
        }
        this.f23140h = null;
        int size = this.g.size();
        int i2 = this.x;
        if (size <= i2 || this.g.get(i2) == null) {
            return;
        }
        a(this.x, false);
    }

    public final AdMetaInfo l() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "adMetaInfo getter ", this));
        }
        C3040h c3040hM = m();
        if (c3040hM != null) {
            return c3040hM.d();
        }
        return null;
    }

    public final S6 l0() {
        String strS;
        String strP;
        String strW;
        String str;
        boolean z2;
        String strT;
        Boolean boolO;
        long jL = this.t.l();
        C3040h c3040hU = u();
        if (c3040hU == null || (strS = c3040hU.s()) == null) {
            strS = "";
        }
        String strValueOf = String.valueOf(this.t.m());
        String strQ = q();
        String strE = E();
        C3040h c3040hU2 = u();
        if (c3040hU2 == null || (strP = c3040hU2.p()) == null) {
            strP = "";
        }
        C3040h c3040hU3 = u();
        if (c3040hU3 == null || (strW = c3040hU3.w()) == null) {
            strW = "";
        }
        C3312y0 c3312y0 = this.f23145u;
        boolean zBooleanValue = (c3312y0 == null || (boolO = c3312y0.o()) == null) ? false : boolO.booleanValue();
        C3040h c3040hU4 = u();
        if (c3040hU4 == null || (strT = c3040hU4.t()) == null) {
            boolean z3 = zBooleanValue;
            str = "";
            z2 = z3;
        } else {
            z2 = zBooleanValue;
            str = strT;
        }
        return new S6(jL, strS, strValueOf, strQ, strE, strP, strW, z2, str);
    }

    public final C3040h m() {
        return b(0);
    }

    public final void m0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).d("S0", "AdUnit " + this + " state - FAILED");
        }
        d((byte) 3);
        b((byte) 1);
    }

    public final String n() {
        C3312y0 c3312y0 = this.f23145u;
        if (c3312y0 != null) {
            return c3312y0.c();
        }
        return null;
    }

    public final void n0() {
        toString();
        String strB = Uc.b();
        LinkedHashMap linkedHashMap = O2.f23027a;
        Config configA = M2.a("ads", strB, null);
        this.f23137b = configA instanceof AdConfig ? (AdConfig) configA : null;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "timeOutConfiguration getter ", this));
        }
        AdConfig adConfig = this.f23137b;
        Intrinsics.c(adConfig);
        this.d = adConfig.getTimeouts();
        d((byte) 0);
        this.f23139e = new B0(this, this, this.t);
        this.f23141i = new HashMap();
        this.k = (byte) -1;
        this.f23142l = new Handler(Looper.getMainLooper());
        this.m = false;
        this.v = new C3039ge(this);
    }

    public HashMap o() {
        return new HashMap();
    }

    public final boolean o0() {
        Unit unit;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "shouldBlockLoadAd ", this));
        }
        C3040h c3040hM = m();
        if (c3040hM != null && 4 == this.f23136a && !W()) {
            F0 f0R = r();
            if (f0R != null) {
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).a("S0", "ad is ready - load success");
                }
                f(f0R);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                b((short) 2188);
            }
            return true;
        }
        if (c3040hM == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b("S0", "ad no longer available");
            }
            return true;
        }
        if (2 == this.f23136a) {
            if (!W()) {
                return false;
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
            InterfaceC3333z5 interfaceC3333z8 = this.j;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).b("S0", "ad is expired");
            }
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
        InterfaceC3333z5 interfaceC3333z9 = this.j;
        if (interfaceC3333z9 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "ad no longer available. state - ");
            sbA.append((int) this.f23136a);
            ((A5) interfaceC3333z9).b("S0", sbA.toString());
        }
        return true;
    }

    public final B0 p() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "adStore getter ", this));
        }
        if (this.f23139e == null) {
            this.f23139e = new B0(this, this, this.t);
        }
        B0 b1 = this.f23139e;
        Intrinsics.c(b1);
        return b1;
    }

    public final boolean p0() {
        AdConfig adConfig;
        return Intrinsics.a(this.t.m(), "AB") && (adConfig = this.f23137b) != null && adConfig.getSkipNetCheckHB();
    }

    public abstract String q();

    public void q0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "signalAvailabilityChange ", this));
        }
    }

    public final F0 r() {
        InterfaceC3333z5 interfaceC3333z5;
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).c("S0", D0.a("S0", "TAG", "adUnitEventListener getter ", this));
        }
        F0 f0 = (F0) this.f.get();
        if (f0 == null && (interfaceC3333z5 = this.j) != null) {
            ((A5) interfaceC3333z5).b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return f0;
    }

    public void r0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "signalSuccess ", this));
        }
    }

    public final U0 s() {
        return this.f23134I;
    }

    public final void s0() {
        LinkedList<C3040h> linkedListF;
        C3040h c3040h;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "startLoadingHTMLAd ", this));
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = null;
        try {
            f(this.f23146w);
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                StringBuilder sb = new StringBuilder("Loading ad with impressionId : ");
                C3312y0 c3312y0 = this.f23145u;
                sb.append((c3312y0 == null || (linkedListF = c3312y0.f()) == null || (c3040h = linkedListF.get(this.f23146w)) == null) ? null : c3040h.s());
                ((A5) interfaceC3333z6).a("S0", sb.toString());
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = (GestureDetectorOnGestureListenerC3005ec) this.g.get(this.f23146w);
            String strE = E();
            if (Intrinsics.a(strE, "html")) {
                InterfaceC3333z5 interfaceC3333z7 = this.j;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).a("S0", "loading into weview for " + E());
                }
                if (gestureDetectorOnGestureListenerC3005ec2 != null) {
                    gestureDetectorOnGestureListenerC3005ec2.d(d(this.f23146w));
                }
            } else if (Intrinsics.a(strE, "htmlUrl")) {
                InterfaceC3333z5 interfaceC3333z8 = this.j;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).a("S0", "loading into weview for " + E());
                }
                if (gestureDetectorOnGestureListenerC3005ec2 != null) {
                    gestureDetectorOnGestureListenerC3005ec2.e(d(this.f23146w));
                }
            }
            a(true, gestureDetectorOnGestureListenerC3005ec2);
            if (gestureDetectorOnGestureListenerC3005ec2 == null || !Intrinsics.a(E(), "htmlUrl")) {
                return;
            }
            k(gestureDetectorOnGestureListenerC3005ec2);
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z9 = this.j;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).a("S0", rf.a(e2, H6.a("S0", "TAG", "Loading ad markup into container encountered an unexpected error: ")));
            }
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            int i2 = this.f23146w;
            if (i2 >= 0 && i2 < this.g.size()) {
                gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) this.g.get(this.f23146w);
            }
            a(gestureDetectorOnGestureListenerC3005ec, (short) 2135);
        }
    }

    public final Context t() {
        WeakReference weakReference = this.f23138c;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final void t0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "submitAdLoadCalled ", this));
        }
        HashMap map = new HashMap();
        c(map);
        c("AdLoadCalled", map);
    }

    public final C3040h u() {
        return this.f23130A ? b(this.f23146w) : m();
    }

    public final void u0() {
        Boolean boolO;
        String strP;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "submitAdLoadSuccessfulEvent ADunit markuptype : ");
            sbA.append(E());
            sbA.append(' ');
            sbA.append(this);
            ((A5) interfaceC3333z5).c("S0", sbA.toString());
        }
        HashMap map = new HashMap();
        long j = this.f23134I.f23243c;
        ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("markupType", E());
        C3040h c3040hU = u();
        if (c3040hU != null && (strP = c3040hU.p()) != null) {
            map.put("creativeType", "\"" + strP + AbstractJsonLexerKt.STRING);
        }
        C3031g6 c3031g6 = this.f23132E;
        if (c3031g6 != null) {
            map.put("retryCount", Integer.valueOf(c3031g6.f23631b));
        }
        C3312y0 c3312y0 = this.f23145u;
        if (c3312y0 != null && (boolO = c3312y0.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c("AdLoadSuccessful", map);
    }

    public final A v() {
        return this.C;
    }

    public final void v0() {
        String strP;
        Boolean boolO;
        HashMap map = new HashMap();
        c(map);
        map.put("markupType", E());
        long j = this.f23134I.f23245h;
        ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("metadataBlob", S());
        C3031g6 c3031g6 = this.f23132E;
        if (c3031g6 != null) {
            map.put("retryCount", Integer.valueOf(c3031g6.f23631b));
        }
        C3312y0 c3312y0 = this.f23145u;
        if (c3312y0 != null && (boolO = c3312y0.o()) != null) {
            map.put("isRewarded", boolO);
        }
        C3040h c3040hU = u();
        if (c3040hU != null && (strP = c3040hU.p()) != null) {
            map.put("creativeType", "\"" + strP + AbstractJsonLexerKt.STRING);
        }
        c("ParseSuccess", map);
    }

    public GestureDetectorOnGestureListenerC3005ec w() {
        if (this.g.size() <= 0 || this.x >= this.g.size()) {
            return null;
        }
        return (GestureDetectorOnGestureListenerC3005ec) this.g.get(this.x);
    }

    public final void w0() {
        Boolean boolO;
        String strP;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "submitAdShowCalled ", this));
        }
        U0 u0 = this.f23134I;
        u0.getClass();
        u0.f23244e = SystemClock.elapsedRealtime();
        HashMap map = new HashMap();
        map.put("markupType", E());
        long j = this.f23134I.f23246i;
        ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        C3040h c3040hB = this.f23130A ? b(this.x) : m();
        if (c3040hB != null && (strP = c3040hB.p()) != null) {
            map.put("creativeType", "\"" + strP + AbstractJsonLexerKt.STRING);
        }
        C3312y0 c3312y0 = this.f23145u;
        if (c3312y0 != null && (boolO = c3312y0.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c("AdShowCalled", map);
    }

    public final GestureDetectorOnGestureListenerC3005ec x() {
        return this.f23143n;
    }

    public final void x0() {
        Boolean boolO;
        String strP;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "submitAdShowSuccess ", this));
        }
        HashMap map = new HashMap();
        long j = this.f23134I.f23244e;
        ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("markupType", E());
        C3040h c3040hB = this.f23130A ? b(this.x) : m();
        if (c3040hB != null && (strP = c3040hB.p()) != null) {
            map.put("creativeType", "\"" + strP + AbstractJsonLexerKt.STRING);
        }
        C3312y0 c3312y0 = this.f23145u;
        if (c3312y0 != null && (boolO = c3312y0.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c("AdShowSuccessful", map);
    }

    public final C3312y0 y() {
        return this.f23145u;
    }

    public final void y0() {
        HashMap map = new HashMap();
        c(map);
        c("AdGetSignalsCalled", map);
    }

    public final int z() {
        return this.f23146w;
    }

    public final void z0() {
        Boolean boolO;
        String strP;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "submitRenderSuccessEvent ADunit markuptype : ");
            sbA.append(E());
            sbA.append(' ');
            sbA.append(this);
            ((A5) interfaceC3333z5).c("S0", sbA.toString());
        }
        HashMap map = new HashMap();
        long j = this.f23134I.g;
        ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("markupType", E());
        C3040h c3040hB = this.f23130A ? b(this.x) : m();
        if (c3040hB != null && (strP = c3040hB.p()) != null) {
            map.put("creativeType", "\"" + strP + AbstractJsonLexerKt.STRING);
        }
        C3031g6 c3031g6 = this.f23132E;
        if (c3031g6 != null) {
            map.put("retryCount", Integer.valueOf(c3031g6.f23631b));
        }
        map.put("plType", Byte.valueOf(J()));
        C3312y0 c3312y0 = this.f23145u;
        if (c3312y0 != null && (boolO = c3312y0.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c((Map) map);
        c("RenderSuccess", map);
    }

    public final void e(C3312y0 c3312y0) {
        this.f23145u = c3312y0;
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void h(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "onRenderViewSignaledAdReady ", this));
        }
        if (this.o || t() == null) {
            b((short) 2186);
            return;
        }
        Handler handler = this.f23142l;
        if (handler != null) {
            handler.post(new A.C(this, renderView, 0));
        } else {
            b((short) 2187);
        }
    }

    public final void i() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "fireAdServedBeacon ", this));
        }
        InterfaceC3295x interfaceC3295xK = k();
        if (interfaceC3295xK == null) {
            return;
        }
        interfaceC3295xK.a((byte) 2, null);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void j(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        byte b2 = this.f23136a;
        if (b2 == 2) {
            C0();
            b((byte) 1);
            F0 f0R = r();
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (f0R != null) {
                f0R.a(this, inMobiAdRequestStatus);
            } else {
                InterfaceC3333z5 interfaceC3333z5 = this.j;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a();
                }
            }
            b((short) 2238);
            renderView.b();
            return;
        }
        if (b2 == 4) {
            n(renderView);
            renderView.b();
            b((byte) 4);
        } else {
            if (b2 == 6 || b2 == 7) {
                o(renderView);
                return;
            }
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                StringBuilder sbA = H6.a("S0", "TAG", "onUnloadCalled - invalid state - ");
                sbA.append((int) this.f23136a);
                ((A5) interfaceC3333z6).b("S0", sbA.toString());
            }
        }
    }

    public void m(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "Render view signaled ad ready, for index ");
            sbA.append(this.g.indexOf(gestureDetectorOnGestureListenerC3005ec));
            sbA.append(' ');
            sbA.append(this);
            ((A5) interfaceC3333z5).a("S0", sbA.toString());
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("S0", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).b();
        }
    }

    public void n(GestureDetectorOnGestureListenerC3005ec renderView) {
        int iL;
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", "onAdUnloadedAfterLoadSuccess");
        }
        if (!this.f23130A || (iL = l(renderView)) <= this.x) {
            C0();
        } else {
            this.f23147z.remove(Integer.valueOf(iL));
        }
    }

    public void o(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", "onAdUnloadedAfterShowSuccess");
        }
        renderView.i();
        b((byte) 4);
    }

    public final void b(boolean z2) {
        this.m = z2;
    }

    public final void c(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "setIsAssetReady ", this));
        }
        this.f23144p = z2;
    }

    public final Set e(int i2) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "getViewabilityTrackers ", this));
        }
        HashMap map = this.f23141i;
        if (map != null) {
            return (Set) map.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final boolean b(C3040h c3040h) {
        C3200r0 c3200r0Q;
        AdConfig.RenderingConfig rendering;
        AdConfig adConfig = this.f23137b;
        boolean z2 = false;
        boolean enableImmersive = (adConfig == null || (rendering = adConfig.getRendering()) == null) ? false : rendering.getEnableImmersive();
        boolean z3 = U3.f23258i;
        boolean zA = (c3040h == null || (c3200r0Q = c3040h.q()) == null) ? false : c3200r0Q.a(false);
        if (enableImmersive && z3 && zA) {
            z2 = true;
        }
        if (!z2) {
            b(enableImmersive, z3, zA);
        }
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            StringBuilder sb = new StringBuilder("Immersive support - config, device, adResponse - (");
            sb.append(enableImmersive);
            sb.append(' ');
            sb.append(z3);
            sb.append(' ');
            ((A5) interfaceC3333z5).a("S0", androidx.media3.extractor.text.ttml.a.r(sb, zA, ')'));
        }
        return z2;
    }

    public final String d(int i2) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "getPubContent ", this));
        }
        if (i2 > 0 && !this.f23130A) {
            return "";
        }
        C3040h c3040hB = b(i2);
        if (c3040hB != null) {
            return c3040hB.x();
        }
        return null;
    }

    public int l(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "getCurrentRenderingPodAdIndex ", this));
        }
        if (!this.f23130A) {
            return -1;
        }
        int iIndexOf = this.g.indexOf(renderView);
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).c("S0", X8.a("S0", "TAG", "getCurrentRenderingPodAdIndex ", iIndexOf));
        }
        return iIndexOf;
    }

    public final boolean c(int i2) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", "getAllowAutoRedirectionForIndex " + this + " index - " + i2);
        }
        C3040h c3040hB = b(i2);
        return c3040hB != null && c3040hB.i();
    }

    public final void e(F0 listener) {
        Intrinsics.f(listener, "listener");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onFetchSuccess ", this));
        }
        v0();
        AdMetaInfo adMetaInfoL = l();
        if (adMetaInfoL == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("S0", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).a("S0", "callback - onAdFetchSuccess");
        }
        listener.b(adMetaInfoL);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void i(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "RenderView visible, for index ");
            sbA.append(this.g.indexOf(renderView));
            sbA.append(' ');
            sbA.append(this);
            ((A5) interfaceC3333z5).a("S0", sbA.toString());
        }
    }

    public final void h() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "destroyAllContainer ", this));
        }
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(this, i2, false, 2, null);
        }
    }

    public void g() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "clear ", this));
        }
        if (this.o) {
            return;
        }
        this.o = true;
        Handler handler = this.f23142l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("S0", D0.a("S0", "TAG", "clearAdPods ", this));
        }
        if (this.f23130A) {
            h();
            this.g.clear();
            this.f23146w = 0;
            this.x = 0;
            this.f23147z.clear();
        }
        C3031g6 c3031g6 = this.f23132E;
        if (c3031g6 != null) {
            c3031g6.f23631b = 0;
        }
        HashMap map = this.f23141i;
        if (map != null) {
            map.clear();
        }
        k0();
        d((byte) 0);
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).d("S0", "AdUnit " + this + " state - CREATED");
        }
        A a2 = this.C;
        int iHashCode = hashCode();
        a2.getClass();
        SparseArray sparseArray = A.f22669b;
        sparseArray.remove(iHashCode);
        sparseArray.size();
        this.q = false;
        this.f23143n = null;
        this.m = false;
        this.f23144p = false;
        this.r = false;
        this.f23145u = null;
        this.f23130A = false;
    }

    public final void c(C3312y0 adSet) {
        Intrinsics.f(adSet, "adSet");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onAdFetchSuccessful ", this));
        }
        if (this.f23136a == 1) {
            this.f23145u = adSet;
        }
        if (!this.o && t() != null) {
            a(adSet);
            return;
        }
        b((short) 2185);
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).b("S0", "adUnit is destroyed");
        }
    }

    public final void d(F0 listener) {
        Intrinsics.f(listener, "listener");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onAdDisplayed ", this));
        }
        AdMetaInfo adMetaInfoL = l();
        if (adMetaInfoL == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("S0", "callback onAdDisplayed failed. ad meta info is null");
            }
            a(listener, (short) 85);
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).a("S0", "callback - onAdDisplayed");
        }
        listener.a(adMetaInfoL);
    }

    public final void k(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        List<String> listC;
        int iIndexOf = this.g.indexOf(gestureDetectorOnGestureListenerC3005ec);
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", "fireLoadAdTokenUrlSuccessful : " + iIndexOf + ' ' + this);
        }
        C3040h c3040hB = b(iIndexOf);
        if (c3040hB == null || (listC = c3040hB.c(C3040h.LOAD_AD_TOKEN_URL)) == null) {
            return;
        }
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            C3298x2.f24089a.a(it.next(), true, this.j);
        }
    }

    public final void b(boolean z2, boolean z3, boolean z4) {
        Pair<String, Short> pairA = a(z2, z3, z4);
        String str = (String) pairA.X;
        short sShortValue = ((Number) pairA.f43249Y).shortValue();
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("reason", str);
        mapS.put("errorCode", Short.valueOf(sShortValue));
        c("ImmersiveNotSupported", mapS);
    }

    public static final void a(Context context, S0 this$0) {
        Intrinsics.f(this$0, "this$0");
        C3163oa c3163oa = AbstractC3147na.f23833a;
        AdConfig adConfig = this$0.f23137b;
        c3163oa.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(context);
            } else {
                c3163oa.a(adConfig);
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public static final void e(S0 this$0) {
        Intrinsics.f(this$0, "this$0");
        if (6 == this$0.f23136a) {
            this$0.a(true, (short) 2158);
        }
    }

    public void c(String monetizationContext) {
        Intrinsics.f(monetizationContext, "monetizationContext");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "setMonetizationContext ", this));
        }
        this.t.b(monetizationContext);
    }

    public final void d(C3312y0 adSet) {
        Intrinsics.f(adSet, "adSet");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onAuctionNotClosed ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).c("S0", D0.a("S0", "TAG", "handleAuctionNotClosed ", this));
        }
        if (this.f23136a == 1) {
            this.f23145u = adSet;
            this.f23130A = adSet.n();
            F0 f0R = r();
            if (f0R != null) {
                f0R.a(this.t, adSet);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    public final boolean e(byte b2) {
        int iY;
        Integer num;
        long j;
        Timer timer;
        Integer num2;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "startTimer ", this));
        }
        if (b2 == 0) {
            C3319y7 c3319y7 = this.f23133F;
            if (c3319y7 == null || (num2 = c3319y7.d) == null) {
                j = MBInterstitialActivity.WEB_LOAD_TIME;
            } else {
                iY = num2.intValue();
                j = iY;
            }
        } else if (b2 == 1) {
            C3319y7 c3319y8 = this.f23133F;
            if (c3319y8 != null) {
                iY = c3319y8.f24123c;
                j = iY;
            } else {
                j = MBInterstitialActivity.WEB_LOAD_TIME;
            }
        } else {
            if (b2 == 2) {
                C3319y7 c3319y9 = this.f23133F;
                if (c3319y9 == null || (num = c3319y9.f24124e) == null) {
                    j = MBInterstitialActivity.WEB_LOAD_TIME;
                } else {
                    iY = num.intValue();
                }
            } else if (b2 == 4) {
                C3151ne c3151ne = this.d;
                Intrinsics.c(c3151ne);
                iY = c3151ne.Y();
            } else {
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).b("S0", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j = iY;
        }
        C3039ge c3039ge = this.v;
        if (c3039ge != null) {
            if (c3039ge.f23640b.containsKey(Byte.valueOf(b2)) && (timer = (Timer) c3039ge.f23640b.get(Byte.valueOf(b2))) != null) {
                timer.cancel();
                c3039ge.f23640b.remove(Byte.valueOf(b2));
            }
            try {
                Timer timer2 = new Timer("ge");
                c3039ge.f23640b.put(Byte.valueOf(b2), timer2);
                timer2.schedule(new C3023fe(c3039ge, b2), j);
                return true;
            } catch (InternalError e2) {
                e2.toString();
            } catch (OutOfMemoryError unused) {
                AbstractC3048h7.a((byte) 1, "ge", "Could not execute timer due to OutOfMemory.");
                c3039ge.f23639a.c(b2);
            }
        }
        return false;
    }

    public final short c(F0 adUnitEventListener) {
        HashMap mapA;
        short s;
        T7 t7;
        Intrinsics.f(adUnitEventListener, "adUnitEventListener");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "loadMarkupInContainerNative ", this));
        }
        WeakReference weakReference = new WeakReference(adUnitEventListener);
        try {
            byte bJ = J();
            JSONObject jSONObject = new JSONObject(L());
            AdConfig adConfig = this.f23137b;
            Intrinsics.c(adConfig);
            C3312y0 c3312y0 = this.f23145u;
            if (c3312y0 == null) {
                mapA = null;
            } else {
                boolean z2 = T9.f23231a;
                mapA = T9.a(c3312y0.h());
            }
            C3177p8 c3177p8 = new C3177p8(bJ, jSONObject, adConfig, mapA, B0(), this.j);
            C3040h c3040hM = m();
            if (!c3177p8.f() || t() == null || c3040hM == null) {
                return (short) 20;
            }
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("S0", "creating native ad container");
            }
            Context contextT = t();
            Intrinsics.c(contextT);
            byte bJ2 = J();
            String adImpressionId = c3040hM.s();
            Set setE = e(0);
            AdConfig adConfig2 = this.f23137b;
            Intrinsics.c(adConfig2);
            long jL = this.t.l();
            boolean zC = c(0);
            String creativeId = c3040hM.o();
            C2996e3 c2996e3 = new C2996e3(c3040hM, this.t.l());
            S6 s6L0 = l0();
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            Intrinsics.f(adImpressionId, "adImpressionId");
            Intrinsics.f(creativeId, "creativeId");
            if (c3177p8.c().contains("VIDEO")) {
                s = 0;
                t7 = new C2934a9(contextT, bJ2, c3177p8, adImpressionId, setE, adConfig2, jL, zC, creativeId, c2996e3, s6L0, interfaceC3333z7);
            } else {
                s = 0;
                t7 = new T7(contextT, bJ2, c3177p8, adImpressionId, setE, adConfig2, jL, zC, creativeId, c2996e3, s6L0, interfaceC3333z7);
            }
            t7.f23221w = new P0(this, weakReference);
            this.f23140h = t7;
            t7.f23210R = this.H;
            return s;
        } catch (IllegalStateException e2) {
            InterfaceC3333z5 interfaceC3333z8 = this.j;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).a("S0", "Error while setting video descriptor", e2);
            }
            return (short) 83;
        } catch (JSONException e3) {
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e3));
            return (short) 13;
        } catch (Exception e4) {
            InterfaceC3333z5 interfaceC3333z9 = this.j;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).b("S0", rf.a(e4, H6.a("S0", "TAG", "Encountered unexpected error in loading ad markup into container: ")));
            }
            S5 s6 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e4, "event"));
            return (short) 88;
        }
    }

    public final void f(F0 listener) {
        Intrinsics.f(listener, "listener");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "onLoadSuccess ", this));
        }
        AdMetaInfo adMetaInfoL = l();
        if (adMetaInfoL == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("S0", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).a("S0", "callback - onAdLoadSucceeded");
        }
        listener.c(adMetaInfoL);
    }

    public final C3040h b(int i2) {
        LinkedList<C3040h> linkedListF;
        LinkedList<C3040h> linkedListF2;
        toString();
        C3312y0 c3312y0 = this.f23145u;
        if (CollectionsKt.o((c3312y0 == null || (linkedListF2 = c3312y0.f()) == null) ? EmptyList.X : CollectionsKt.z(linkedListF2), Integer.valueOf(i2))) {
            C3312y0 c3312y1 = this.f23145u;
            if (c3312y1 == null || (linkedListF = c3312y1.f()) == null) {
                return null;
            }
            return linkedListF.get(i2);
        }
        C3312y0 c3312y2 = this.f23145u;
        if (c3312y2 != null) {
            return c3312y2.p();
        }
        return null;
    }

    public final void a(AdConfig adConfig) {
        this.f23137b = adConfig;
    }

    public static final void d(S0 s0) {
        int i2;
        String strK;
        InterfaceC3333z5 interfaceC3333z5 = s0.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "startAdFetchWorker ", s0));
        }
        U0 u0 = s0.f23134I;
        u0.getClass();
        u0.d = SystemClock.elapsedRealtime();
        InterfaceC3333z5 interfaceC3333z6 = s0.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("S0", D0.a("S0", "TAG", "doAdLoadWork ", s0));
        }
        try {
            s0.d((byte) 1);
            InterfaceC3333z5 interfaceC3333z7 = s0.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).d("S0", "AdUnit " + s0 + " state - LOADING");
            }
            InterfaceC3333z5 interfaceC3333z8 = s0.j;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).c("S0", "printPublisherTestId " + s0);
            }
            C3246te.f24014a.d();
            i2 = 0;
            if (s0.e((byte) 0)) {
                A a2 = s0.C;
                int iHashCode = s0.hashCode();
                L l2 = new L(s0, s0.j);
                a2.getClass();
                A.a(iHashCode, l2);
            } else {
                i2 = -2;
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z9 = s0.j;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).b("S0", rf.a(e2, H6.a("S0", "TAG", "Load failed with unexpected error: ")));
            }
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            s0.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
        if (i2 == -2) {
            strK = "Loading an ad resulted in an unexpected error";
        } else if (i2 == -1) {
            strK = "Ad request skipped as monetization is disabled";
        } else if (i2 == 0) {
            strK = "Fresh ad requested";
        } else if (i2 == 1) {
            strK = "Returning pre-cached ad";
        } else if (i2 != 2) {
            strK = androidx.datastore.preferences.protobuf.a.k("Unknown return value (", i2, ") from #doAdLoadWork()");
        } else {
            strK = "Already Loading";
        }
        InterfaceC3333z5 interfaceC3333z10 = s0.j;
        if (interfaceC3333z10 != null) {
            ((A5) interfaceC3333z10).c("S0", strK);
        }
    }

    public final void a(Handler handler) {
        this.f23142l = handler;
    }

    public final int b(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "parseViewabilityResponseValue ", this));
        }
        if (StringsKt.M(str, "track_", false)) {
            str = str.substring(6);
            Intrinsics.e(str, "this as java.lang.String).substring(startIndex)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final void a(C2969ca c2969ca) {
        this.s = c2969ca;
    }

    public final void a(long j) {
        this.y = j;
    }

    public final void a(TreeSet<Integer> treeSet) {
        Intrinsics.f(treeSet, "<set-?>");
        this.f23147z = treeSet;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    public final void a(Context context, Z adPlacement, F0 f0) {
        String strM;
        String strB;
        TimeoutConfigurations$AdNonABConfig banner;
        C3319y7 c3319y7;
        TimeoutConfigurations$AdPreloadConfig banner2;
        TimeoutConfigurations$AdABConfig banner3;
        InterfaceC3333z5 interfaceC3333z5;
        InterfaceC3333z5 interfaceC3333z6;
        InterfaceC3333z5 interfaceC3333z7;
        Boolean boolO;
        Intrinsics.f(context, "context");
        Intrinsics.f(adPlacement, "adPlacement");
        toString();
        a(context);
        WeakReference weakReference = new WeakReference(f0);
        this.f = weakReference;
        String strQ = q();
        C3312y0 c3312y0 = this.f23145u;
        this.D = new N(weakReference, strQ, (c3312y0 == null || (boolO = c3312y0.o()) == null) ? false : boolO.booleanValue());
        this.t = adPlacement;
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).a("S0", D0.a("S0", "TAG", "initTelemetry ", this));
        }
        this.H.put("AdImpressionSuccessful", this.f23134I);
        InterfaceC3333z5 interfaceC3333z9 = this.j;
        if (interfaceC3333z9 != null) {
            ((A5) interfaceC3333z9).c("S0", "initInternetAvailabilityAdRetry");
        }
        if (this.f23137b == null && (interfaceC3333z7 = this.j) != null) {
            ((A5) interfaceC3333z7).c("S0", "adConfig is null");
        }
        if (this.t.m() == null && (interfaceC3333z6 = this.j) != null) {
            ((A5) interfaceC3333z6).c("S0", "placement.placementType is null");
        }
        if (this.t.b() == null && (interfaceC3333z5 = this.j) != null) {
            ((A5) interfaceC3333z5).c("S0", "placement.adType is null");
        }
        AdConfig adConfig = this.f23137b;
        if (adConfig != null && (strM = this.t.m()) != null && (strB = this.t.b()) != null) {
            TimeoutConfigurations$MediationConfig mediationConfig = adConfig.getTimeouts().X();
            String strD = Vc.d();
            Intrinsics.f(mediationConfig, "mediationConfig");
            if (strM.equals("AB")) {
                TimeoutConfigurations$ABConfig aBConfig = mediationConfig.getAb();
                int iHashCode = strB.hashCode();
                if (iHashCode != -1396342996) {
                    if (iHashCode != -1052618729) {
                        if (iHashCode != 104431) {
                            if (iHashCode == 93166550 && strB.equals("audio")) {
                                banner3 = aBConfig.getAudio();
                            } else {
                                banner3 = aBConfig.getBanner();
                            }
                        } else if (strB.equals("int")) {
                            banner3 = aBConfig.getInt();
                        } else {
                            banner3 = aBConfig.getBanner();
                        }
                    } else if (strB.equals("native")) {
                        banner3 = aBConfig.getNative();
                    } else {
                        banner3 = aBConfig.getBanner();
                    }
                } else if (!strB.equals("banner")) {
                    banner3 = aBConfig.getBanner();
                } else {
                    banner3 = aBConfig.getBanner();
                }
                c3319y7 = new C3319y7(AbstractC3303x7.a(strD, banner3.getLoadRetryInterval()), AbstractC3303x7.a(strD, banner3.getMaxLoadRetries()), AbstractC3303x7.a(strD, banner3.getLoadTimeout()), (Integer) null, 24);
            } else if (strM.equals("Preload")) {
                TimeoutConfigurations$PreloadConfig preloadConfig = mediationConfig.getPreload();
                int iHashCode2 = strB.hashCode();
                if (iHashCode2 != -1396342996) {
                    if (iHashCode2 != -1052618729) {
                        if (iHashCode2 != 104431) {
                            if (iHashCode2 == 93166550 && strB.equals("audio")) {
                                banner2 = preloadConfig.getAudio();
                            } else {
                                banner2 = preloadConfig.getBanner();
                            }
                        } else if (strB.equals("int")) {
                            banner2 = preloadConfig.getInt();
                        } else {
                            banner2 = preloadConfig.getBanner();
                        }
                    } else if (strB.equals("native")) {
                        banner2 = preloadConfig.getNative();
                    } else {
                        banner2 = preloadConfig.getBanner();
                    }
                } else if (!strB.equals("banner")) {
                    banner2 = preloadConfig.getBanner();
                } else {
                    banner2 = preloadConfig.getBanner();
                }
                c3319y7 = new C3319y7(AbstractC3303x7.a(strD, banner2.getLoadRetryInterval()), AbstractC3303x7.a(strD, banner2.getMaxLoadRetries()), AbstractC3303x7.a(strD, banner2.getLoadTimeout()), Integer.valueOf(AbstractC3303x7.a(strD, banner2.getMuttTimeout())), Integer.valueOf(AbstractC3303x7.a(strD, banner2.getPreloadTimeout())));
            } else {
                TimeoutConfigurations$NonABConfig nonABConfig = mediationConfig.getNonAb();
                int iHashCode3 = strB.hashCode();
                if (iHashCode3 != -1396342996) {
                    if (iHashCode3 != -1052618729) {
                        if (iHashCode3 != 104431) {
                            if (iHashCode3 == 93166550 && strB.equals("audio")) {
                                banner = nonABConfig.getAudio();
                            } else {
                                banner = nonABConfig.getBanner();
                            }
                        } else if (strB.equals("int")) {
                            banner = nonABConfig.getInt();
                        } else {
                            banner = nonABConfig.getBanner();
                        }
                    } else if (strB.equals("native")) {
                        banner = nonABConfig.getNative();
                    } else {
                        banner = nonABConfig.getBanner();
                    }
                } else if (!strB.equals("banner")) {
                    banner = nonABConfig.getBanner();
                } else {
                    banner = nonABConfig.getBanner();
                }
                c3319y7 = new C3319y7(AbstractC3303x7.a(strD, banner.getLoadRetryInterval()), AbstractC3303x7.a(strD, banner.getMaxLoadRetries()), AbstractC3303x7.a(strD, banner.getLoadTimeout()), Integer.valueOf(AbstractC3303x7.a(strD, banner.getMuttTimeout())), 16);
            }
            this.f23132E = new C3031g6(c3319y7);
            this.f23133F = c3319y7;
        }
        if (U3.f23257h == null) {
            U3.f23257h = Float.valueOf(new TextView(context).getTextSize());
        }
        n0();
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void f(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "RenderView completed loading ad content, for index ");
            sbA.append(this.g.indexOf(renderView));
            sbA.append(' ');
            sbA.append(this);
            ((A5) interfaceC3333z5).a("S0", sbA.toString());
        }
    }

    public final void b(InMobiAdRequestStatus requestStatus, boolean z2, short s) {
        Intrinsics.f(requestStatus, "requestStatus");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("S0", "handleAdLoadFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.f23136a == 1 && z2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("S0", X8.a("S0", "TAG", "load failed - ", s));
            }
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).d("S0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 1);
        }
        F0 f0R = r();
        if (f0R != null) {
            f0R.a(this, requestStatus);
        } else {
            InterfaceC3333z5 interfaceC3333z8 = this.j;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).a();
            }
        }
        if (s != 0) {
            b(s);
        }
    }

    public final void f() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "checkInteractiveAndSignal ", this));
        }
        if (this.m && this.f23144p && this.q) {
            r0();
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void g(GestureDetectorOnGestureListenerC3005ec renderView) {
        Handler handler;
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "onRenderViewSignaledAdFailed ", this));
        }
        if (this.o || t() == null || (handler = this.f23142l) == null) {
            return;
        }
        handler.post(new A.C(this, renderView, 1));
    }

    public final void g(int i2) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "resetCurrentRenderingIndex ", this));
        }
        this.x = i2;
    }

    public final void b(C3312y0 adSet) {
        Intrinsics.f(adSet, "adSet");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "loadResponse ", this));
        }
        c(adSet);
    }

    public void b(F0 f0) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "handleAdScreenDisplayed ", this));
        }
    }

    public static final void b(S0 this$0, GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(renderView, "$renderView");
        this$0.a(renderView, (short) 2137);
    }

    public void b(final GestureDetectorOnGestureListenerC3005ec renderView, final short s) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onRenderViewError ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        try {
            Handler handler = this.f23142l;
            if (handler != null) {
                handler.post(new Runnable() { // from class: A.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        S0.a(this.X, renderView, s);
                    }
                });
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("S0", rf.a(e2, H6.a("S0", "TAG", "Loading ad markup into container encountered an unexpected error: ")));
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void b(HashMap<Object, Object> rewards) {
        Intrinsics.f(rewards, "rewards");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onAdRewardActionCompleted ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("S0", "Ad reward action completed. Params:" + rewards);
        }
        F0 f0R = r();
        if (f0R != null) {
            f0R.b(rewards);
        }
    }

    public static final void c(S0 this$0, GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(renderView, "$renderView");
        this$0.m(renderView);
    }

    public void d(String podAdContext) {
        Intrinsics.f(podAdContext, "podAdContext");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "setPodAdContext ", this));
        }
        if (this.f23130A) {
            this.f23131B = podAdContext;
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void c() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onAdScreenDisplayFailed ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).b("S0", "Ad failed to display");
        }
        Handler handler = this.f23142l;
        if (handler != null) {
            handler.post(new RunnableC0913u(this, 2));
        }
    }

    public final void b(short s) {
        long j;
        long jElapsedRealtime;
        Boolean boolO;
        String strP;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "submitAdLoadFailedEvent ", this));
        }
        HashMap map = new HashMap();
        if (s == 2138 || s == 2109) {
            j = this.f23134I.d;
            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if (s == 2139) {
            j = this.f23134I.g;
            ScheduledExecutorService scheduledExecutorService2 = Ie.f22893a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j = this.f23134I.f23243c;
            ScheduledExecutorService scheduledExecutorService3 = Ie.f22893a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        map.put("latency", Long.valueOf(jElapsedRealtime - j));
        map.put("errorCode", Short.valueOf(s));
        map.put("markupType", E());
        C3040h c3040hU = u();
        if (c3040hU != null && (strP = c3040hU.p()) != null) {
            map.put("creativeType", "\"" + strP + AbstractJsonLexerKt.STRING);
        }
        C3031g6 c3031g6 = this.f23132E;
        if (c3031g6 != null) {
            map.put("retryCount", Integer.valueOf(c3031g6.f23631b));
        }
        C3312y0 c3312y0 = this.f23145u;
        if (c3312y0 != null && (boolO = c3312y0.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c((Map) map);
        c("AdLoadFailed", map);
    }

    public final void d(boolean z2) {
        this.f23130A = z2;
    }

    public final void c(HashMap map) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "constructTelemetryPayload ", this));
        }
        map.put("adType", q());
        map.put("networkType", L3.q());
        map.put("plId", Long.valueOf(this.t.l()));
        String strM = this.t.m();
        if (strM != null) {
            map.put("plType", strM);
        }
    }

    public final void c(short s) {
        C3040h c3040hM;
        Boolean boolO;
        String strP;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "submitAdShowFailed ", this));
        }
        HashMap map = new HashMap();
        long j = this.f23134I.f23244e;
        ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("errorCode", Short.valueOf(s));
        map.put("markupType", E());
        if (this.f23130A) {
            c3040hM = b(this.x);
        } else {
            c3040hM = m();
        }
        if (c3040hM != null && (strP = c3040hM.p()) != null) {
            map.put("creativeType", "\"" + strP + AbstractJsonLexerKt.STRING);
        }
        C3312y0 c3312y0 = this.f23145u;
        if (c3312y0 != null && (boolO = c3312y0.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c((Map) map);
        c("AdShowFailed", map);
    }

    public final void b(Map<String, Object> payload) {
        Boolean boolO;
        String strP;
        Intrinsics.f(payload, "payload");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "submitServerError ", this));
        }
        if (this.f23139e == null) {
            return;
        }
        if (payload.get("reason") == null) {
            payload.put("reason", "");
        }
        C3040h c3040hU = u();
        if (c3040hU != null && (strP = c3040hU.p()) != null) {
            payload.put("creativeType", "\"" + strP + AbstractJsonLexerKt.STRING);
        }
        C3031g6 c3031g6 = this.f23132E;
        if (c3031g6 != null) {
            payload.put("retryCount", Integer.valueOf(c3031g6.f23631b));
        }
        C3312y0 c3312y0 = this.f23145u;
        if (c3312y0 != null && (boolO = c3312y0.o()) != null) {
            payload.put("isRewarded", boolO);
        }
        c(payload);
        B0 b1 = this.f23139e;
        Intrinsics.c(b1);
        b1.a(payload);
    }

    public final void c(Map map) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "updateIdsInTelemetryPayload ", this));
        }
        C3040h c3040hM = m();
        if (c3040hM != null) {
            map.put("creativeId", "\"" + c3040hM.o() + AbstractJsonLexerKt.STRING);
            map.put("impressionId", "\"" + c3040hM.s() + AbstractJsonLexerKt.STRING);
        }
    }

    public final void c(String eventType, Map<String, Object> kv) {
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(kv, "kv");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "submitTelemetryEvent ", this));
        }
        Pd pd = Pd.f23077a;
        Pd.b(eventType, kv, Td.SDK);
    }

    public void a(Context context) {
        Intrinsics.f(context, "context");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "setContext ", this));
        }
        this.f23138c = new WeakReference(context);
    }

    public final void a(InterfaceC3333z5 logger) {
        Intrinsics.f(logger, "logger");
        this.j = logger;
        B0 b0P = p();
        b0P.getClass();
        b0P.f = logger;
        N n2 = this.D;
        n2.getClass();
        n2.f = logger;
    }

    public void c(byte b2) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("S0", D0.a("S0", "TAG", "onOOM ", this));
        }
        if (b2 == 0) {
            a(this.t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (short) 2110);
            return;
        }
        if (b2 == 2 || b2 == 1) {
            byte b3 = this.f23136a;
            if (b3 == 0 || 1 == b3 || 2 == b3) {
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).a("S0", "onOOM INTERNAL_LOAD_TIME_OUT or PRE_LOAD_TIME_OUT");
                }
                this.G.removeCallbacksAndMessages(null);
                m0();
                b((short) 2112);
                F0 f0R = r();
                if (f0R != null) {
                    f0R.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
                    return;
                }
                return;
            }
            return;
        }
        if (b2 == 4) {
            F0 f0R2 = r();
            if (f0R2 != null) {
                f0R2.g();
                return;
            }
            return;
        }
        if (b2 == 3) {
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).a("S0", X8.a("S0", "TAG", "OOM Timeout scenario ignored for : ", b2));
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).a("S0", X8.a("S0", "TAG", "OOM Timeout scenario ignored for : ", b2));
        }
    }

    public final void b(long j) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "submitAdGetSignalsSucceeded ", this));
        }
        this.r = false;
        HashMap map = new HashMap();
        map.put("adType", q());
        map.put("latency", Long.valueOf(System.currentTimeMillis() - j));
        map.put("networkType", L3.q());
        c("AdGetSignalsSucceeded", map);
    }

    public final Q a(int i2) {
        String strU;
        String strT;
        Boolean boolO;
        String strO;
        String strP;
        String strW;
        C3040h c3040hB = b(i2);
        if (c3040hB == null || (strU = c3040hB.u()) == null) {
            strU = "html";
        }
        String str = strU;
        String strA = (Intrinsics.a(this.t.b(), "banner") || Intrinsics.a(this.t.b(), "audio")) ? this.t.a() : null;
        String strB = this.t.b();
        boolean zB = b(c3040hB);
        long jL = this.t.l();
        boolean zC = c(i2);
        String strE = this.t.e();
        String strP2 = c3040hB != null ? c3040hB.p() : null;
        AdMetaInfo adMetaInfoL = l();
        String creativeID = adMetaInfoL != null ? adMetaInfoL.getCreativeID() : null;
        boolean zP = this.t.p();
        String str2 = creativeID;
        LinkedHashMap linkedHashMap = this.H;
        WatermarkData watermarkData = this.f23135J;
        AdQualityControl adQualityControlE = c3040hB != null ? c3040hB.e() : null;
        byte bJ = J();
        HashMap map = this.f23141i;
        Set set = map != null ? (Set) map.get(Integer.valueOf(i2)) : null;
        C3040h c3040hB2 = b(i2);
        String strS = c3040hB2 != null ? c3040hB2.s() : null;
        if (c3040hB == null || (strT = c3040hB.t()) == null) {
            strT = "DEFAULT";
        }
        LinkedHashMap linkedHashMap2 = O2.f23027a;
        Set set2 = set;
        String str3 = strS;
        C3133mc c3133mc = new C3133mc(((TelemetryConfig) AbstractC3174p5.a("telemetry", "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig", null)).getMaxTemplateEvents());
        Z z2 = this.t;
        String strE2 = E();
        String str4 = (c3040hB == null || (strW = c3040hB.w()) == null) ? "" : strW;
        C3031g6 c3031g6 = this.f23132E;
        boolean zBooleanValue = false;
        int i3 = c3031g6 != null ? c3031g6.f23631b : 0;
        C3040h c3040hU = u();
        String str5 = (c3040hU == null || (strP = c3040hU.p()) == null) ? "" : strP;
        C3040h c3040hU2 = u();
        String str6 = (c3040hU2 == null || (strO = c3040hU2.o()) == null) ? "" : strO;
        C3312y0 c3312y0 = this.f23145u;
        if (c3312y0 != null && (boolO = c3312y0.o()) != null) {
            zBooleanValue = boolO.booleanValue();
        }
        return new Q(strB, zB, jL, zC, str2, strP2, str, strA, this, strE, linkedHashMap, Boolean.valueOf(zP), watermarkData, adQualityControlE, bJ, set2, str3, strT, new C3053hc(z2, strE2, str4, i3, str5, str6, zBooleanValue, i2, this.f23134I.j, c3133mc, "default"), this.j, 2228224);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void b(String eventType, Map<String, Object> kv) {
        C3040h c3040hU;
        String strP;
        C3031g6 c3031g6;
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(kv, "kv");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", "onTelemetryEvent " + this + " adState=" + ((int) this.f23136a));
        }
        byte b2 = this.f23136a;
        if (b2 == 3 || b2 == 8) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).c("S0", I6.a("S0", "TAG", "addRetryCountToTelemetryEvent event - ", eventType));
        }
        switch (eventType.hashCode()) {
            case -1959333523:
                if (eventType.equals("RenderSuccess")) {
                    c3031g6 = this.f23132E;
                    if (c3031g6 != null) {
                        kv.put("retryCount", Integer.valueOf(c3031g6.f23631b));
                    }
                }
                break;
            case 167123846:
                if (eventType.equals("ServerFill")) {
                    c3031g6 = this.f23132E;
                    if (c3031g6 != null) {
                        kv.put("retryCount", Integer.valueOf(c3031g6.f23631b));
                    }
                }
                break;
            case 885222501:
                if (eventType.equals("ServerError")) {
                    c3031g6 = this.f23132E;
                    if (c3031g6 != null) {
                        kv.put("retryCount", Integer.valueOf(c3031g6.f23631b));
                    }
                }
                break;
            case 925075267:
                if (eventType.equals("AdLoadSuccessful")) {
                    c3031g6 = this.f23132E;
                    if (c3031g6 != null) {
                        kv.put("retryCount", Integer.valueOf(c3031g6.f23631b));
                    }
                }
                break;
            case 1881615718:
                if (eventType.equals("AdLoadFailed")) {
                    c3031g6 = this.f23132E;
                    if (c3031g6 != null) {
                        kv.put("retryCount", Integer.valueOf(c3031g6.f23631b));
                    }
                }
                break;
            case 1925668903:
                if (eventType.equals("ServerNoFill")) {
                    c3031g6 = this.f23132E;
                    if (c3031g6 != null) {
                        kv.put("retryCount", Integer.valueOf(c3031g6.f23631b));
                    }
                }
                break;
        }
        if ((eventType.equals("ServerFill") ? true : eventType.equals("ServerError")) && (c3040hU = u()) != null && (strP = c3040hU.p()) != null) {
            kv.put("creativeType", strP);
        }
        c(eventType, kv);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void c(GestureDetectorOnGestureListenerC3005ec renderView) {
        List<String> listC;
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "fireImpressionTracker ", this));
        }
        C3040h c3040hB = b(this.g.indexOf(renderView));
        if (((c3040hB != null ? c3040hB.p() : null) != null && Intrinsics.a(c3040hB.p(), "video")) || c3040hB == null || (listC = c3040hB.c("impression")) == null) {
            return;
        }
        for (String str : listC) {
            Yd telemetryOnAdImpression = renderView.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            telemetryOnAdImpression.f23382e = "adResponseTracker";
            C3298x2.f24089a.b(str, true, (Z1) new M(this.D, telemetryOnAdImpression), this.j);
        }
    }

    public final void b(byte b2) {
        Timer timer;
        C3039ge c3039ge;
        Timer timer2;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "cancelTimer ", this));
        }
        if (b2 == 1 && (c3039ge = this.v) != null && (timer2 = (Timer) c3039ge.f23640b.get((byte) 2)) != null) {
            timer2.cancel();
            c3039ge.f23640b.remove((byte) 2);
        }
        C3039ge c3039ge2 = this.v;
        if (c3039ge2 == null || (timer = (Timer) c3039ge2.f23640b.get(Byte.valueOf(b2))) == null) {
            return;
        }
        timer.cancel();
        c3039ge2.f23640b.remove(Byte.valueOf(b2));
    }

    public final void b(int i2, boolean z2) {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "fireAdPodShowResult ", this));
        }
        ArrayList list = this.g;
        Intrinsics.f(list, "list");
        if (i2 < 0 || i2 >= list.size() || (gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) this.g.get(i2)) == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3005ec.b(z2);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void b(GestureDetectorOnGestureListenerC3005ec renderView) {
        List<String> listC;
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "fireClickTracker ", this));
        }
        C3040h c3040hB = b(this.g.indexOf(renderView));
        if (((c3040hB != null ? c3040hB.p() : null) != null && Intrinsics.a(c3040hB.p(), "video")) || c3040hB == null || (listC = c3040hB.c("click")) == null) {
            return;
        }
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            C3298x2.f24089a.a(it.next(), true, this.j);
        }
    }

    public final Pair<String, Short> a(boolean z2, boolean z3, boolean z4) {
        Short sh;
        StringBuilder sb = new StringBuilder("Immersive not supported on");
        BitSet bitSet = new BitSet(3);
        ArrayList arrayList = new ArrayList();
        if (!z2) {
            arrayList.add(" config");
            bitSet.set(0);
        }
        if (!z3) {
            arrayList.add(" device");
            bitSet.set(1);
        }
        if (!z4) {
            arrayList.add(" ad");
            bitSet.set(2);
        }
        sb.append(CollectionsKt.D(arrayList, ",", null, null, null, 62));
        if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
            sh = (short) 2202;
        } else if (bitSet.get(0) && bitSet.get(1)) {
            sh = (short) 2200;
        } else if (bitSet.get(0) && bitSet.get(2)) {
            sh = (short) 2199;
        } else if (bitSet.get(1) && bitSet.get(2)) {
            sh = (short) 2201;
        } else if (bitSet.get(0)) {
            sh = (short) 2196;
        } else if (bitSet.get(1)) {
            sh = (short) 2197;
        } else {
            sh = bitSet.get(2) ? (short) 2198 : null;
        }
        short sShortValue = sh != null ? sh.shortValue() : (short) -1;
        if (sShortValue == -1) {
            return new Pair<>("Invalid Reason", (short) -1);
        }
        return new Pair<>(sb.toString(), Short.valueOf(sShortValue));
    }

    public final void a(F0 listener, short s) {
        Intrinsics.f(listener, "listener");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "onAdShowFailed ", this));
        }
        c(s);
        listener.d();
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0293  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:147:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:153:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:163:0x0301  */
    /* JADX WARN: Instruction removed from duplicated block: B:163:0x0301, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0238: MOVE (r3 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:108:0x0238 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0240: MOVE (r3 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:111:0x023e */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public boolean a(C3040h ad, int i2, boolean z2) {
        Object obj;
        Object obj2;
        InterfaceC3333z5 interfaceC3333z5;
        HashMap map;
        String message;
        boolean z3;
        InterfaceC3333z5 interfaceC3333z6;
        InterfaceC3333z5 interfaceC3333z7;
        HashMap map2;
        String message2;
        Object obj3;
        Object obj4;
        AdConfig.ViewabilityConfig viewability;
        AdConfig.OmidConfig omidConfig;
        Intrinsics.f(ad, "ad");
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).c("S0", "didParseAdResponseAndExtractData " + this + " - index - " + i2);
        }
        boolean z4 = false;
        try {
            JSONObject jSONObjectC = ad.c();
            obj = "reason";
            try {
                if ("unknown".equals(ad.u())) {
                    InterfaceC3333z5 interfaceC3333z9 = this.j;
                    if (interfaceC3333z9 != null) {
                        ((A5) interfaceC3333z9).b("S0", "unknown markup type. fail");
                    }
                    if (!z2) {
                        return false;
                    }
                    HashMap map3 = new HashMap();
                    map3.put("errorCode", (short) 2163);
                    b((Map<String, Object>) map3);
                    return false;
                }
                String strX = ad.x();
                try {
                    try {
                        if (strX.length() > 0) {
                            long j = this.f23134I.f;
                            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
                            ad.f(StringsKt.I(strX, "@__imm_aft@", String.valueOf(SystemClock.elapsedRealtime() - j)));
                            InterfaceC3333z5 interfaceC3333z10 = this.j;
                            if (interfaceC3333z10 != null) {
                                try {
                                    ((A5) interfaceC3333z10).a("S0", "parsing of pub content success");
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    obj2 = "errorCode";
                                    interfaceC3333z7 = this.j;
                                    if (interfaceC3333z7 != null) {
                                        ((A5) interfaceC3333z7).a("S0", "Invalid Base64 encoding in received ad.", e);
                                    }
                                    S5 s5 = S5.f23167a;
                                    S5.d.a(new C3011f2(e));
                                    if (z2) {
                                        map2 = new HashMap();
                                        map2.put(obj2, (short) 2121);
                                        message2 = e.getMessage();
                                        if (message2 != null) {
                                            map2.put(obj, message2);
                                        }
                                        b((Map<String, Object>) map2);
                                    }
                                    z3 = z4;
                                } catch (JSONException e3) {
                                    e = e3;
                                    obj = obj;
                                    obj2 = "errorCode";
                                    interfaceC3333z5 = this.j;
                                    if (interfaceC3333z5 != null) {
                                        ((A5) interfaceC3333z5).a("S0", "Exception while parsing received ad.", e);
                                    }
                                    S5 s6 = S5.f23167a;
                                    S5.d.a(new C3011f2(e));
                                    if (z2) {
                                        map = new HashMap();
                                        map.put(obj2, (short) 2120);
                                        message = e.getMessage();
                                        if (message != null) {
                                            map.put(obj, message);
                                        }
                                        b((Map<String, Object>) map);
                                    }
                                    z3 = z4;
                                }
                            }
                            Context contextD = Uc.d();
                            HashMap map4 = this.f23141i;
                            Intrinsics.c(map4);
                            if (map4.get(Integer.valueOf(i2)) == null) {
                                Integer numValueOf = Integer.valueOf(i2);
                                HashMap map5 = this.f23141i;
                                Intrinsics.c(map5);
                                map5.put(numValueOf, new HashSet());
                            }
                            HashMap map6 = this.f23141i;
                            Intrinsics.c(map6);
                            Set set = (Set) map6.get(Integer.valueOf(i2));
                            if (set != null && set.isEmpty()) {
                                InterfaceC3333z5 interfaceC3333z11 = this.j;
                                if (interfaceC3333z11 != null) {
                                    ((A5) interfaceC3333z11).c("S0", "empty trackers");
                                }
                                AdConfig adConfig = this.f23137b;
                                Boolean boolValueOf = (adConfig == null || (viewability = adConfig.getViewability()) == null || (omidConfig = viewability.getOmidConfig()) == null) ? null : Boolean.valueOf(omidConfig.isOmidEnabled());
                                InterfaceC3333z5 interfaceC3333z12 = this.j;
                                if (interfaceC3333z12 != null) {
                                    ((A5) interfaceC3333z12).c("S0", "OMID enable - " + boolValueOf);
                                }
                                if (Intrinsics.a(boolValueOf, Boolean.TRUE) && jSONObjectC != null && jSONObjectC.has("metaInfo")) {
                                    InterfaceC3333z5 interfaceC3333z13 = this.j;
                                    if (interfaceC3333z13 != null) {
                                        ((A5) interfaceC3333z13).c("S0", "checking meta info");
                                    }
                                    JSONObject jSONObject = jSONObjectC.getJSONObject("metaInfo");
                                    if (jSONObject.has("omsdkInfo")) {
                                        InterfaceC3333z5 interfaceC3333z14 = this.j;
                                        if (interfaceC3333z14 != null) {
                                            ((A5) interfaceC3333z14).c("S0", "checking OMSDK meta info");
                                        }
                                        JSONObject jSONObject2 = jSONObject.getJSONObject("omsdkInfo");
                                        if (jSONObject2.has("omidEnabled") && jSONObject2.getBoolean("omidEnabled")) {
                                            String string = jSONObject.has("creativeType") ? jSONObject.getString("creativeType") : "unknown";
                                            Handler handler = this.f23142l;
                                            if (handler != null) {
                                                handler.post(new RunnableC0905n(11, contextD, this));
                                            }
                                            C3199qe c3199qe = new C3199qe((byte) 3);
                                            boolean zOptBoolean = jSONObject2.optBoolean("isolateVerificationScripts");
                                            String strOptString = jSONObject2.optString("customReferenceData");
                                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("macros");
                                            byte bOptInt = (byte) jSONObject2.optInt("impressionType");
                                            Intrinsics.c(string);
                                            Intrinsics.c(strOptString);
                                            c3199qe.f23941b = H0.a(string, strOptString, zOptBoolean, jSONObjectOptJSONObject, bOptInt);
                                            InterfaceC3333z5 interfaceC3333z15 = this.j;
                                            if (interfaceC3333z15 != null) {
                                                ((A5) interfaceC3333z15).c("S0", "Read out OMID params: " + c3199qe.f23941b);
                                            }
                                            set.add(c3199qe);
                                        }
                                    }
                                }
                                if (jSONObjectC != null && jSONObjectC.has("viewability")) {
                                    InterfaceC3333z5 interfaceC3333z16 = this.j;
                                    if (interfaceC3333z16 != null) {
                                        ((A5) interfaceC3333z16).c("S0", "checking viewability info");
                                    }
                                    JSONArray jSONArray = jSONObjectC.getJSONArray("viewability");
                                    Intrinsics.e(jSONArray, "getJSONArray(...)");
                                    HashMap mapA = a(jSONArray);
                                    if (mapA != null && !mapA.isEmpty()) {
                                        InterfaceC3333z5 interfaceC3333z17 = this.j;
                                        if (interfaceC3333z17 != null) {
                                            ((A5) interfaceC3333z17).c("S0", "checking for inmobi trackers");
                                        }
                                        C3199qe c3199qe2 = new C3199qe((byte) 2);
                                        c3199qe2.f23941b = mapA;
                                        set.add(c3199qe2);
                                    }
                                }
                                if (jSONObjectC != null && jSONObjectC.has("tracking") && "web".equals(jSONObjectC.getString("tracking"))) {
                                    this.k = (byte) 0;
                                }
                            }
                            z3 = true;
                            interfaceC3333z6 = this.j;
                            if (interfaceC3333z6 != null) {
                                ((A5) interfaceC3333z6).a("S0", "Parsing result - " + z3);
                            }
                            return z3;
                        }
                        try {
                            InterfaceC3333z5 interfaceC3333z18 = this.j;
                            if (interfaceC3333z18 != null) {
                                ((A5) interfaceC3333z18).a("S0", "empty punContent - fail");
                            }
                            if (!z2) {
                                return false;
                            }
                            try {
                                HashMap map7 = new HashMap();
                                obj2 = "errorCode";
                                try {
                                    map7.put(obj2, (short) 2162);
                                    b((Map<String, Object>) map7);
                                    return false;
                                } catch (IllegalArgumentException e4) {
                                    e = e4;
                                    z4 = false;
                                    interfaceC3333z7 = this.j;
                                    if (interfaceC3333z7 != null) {
                                        ((A5) interfaceC3333z7).a("S0", "Invalid Base64 encoding in received ad.", e);
                                    }
                                    S5 s7 = S5.f23167a;
                                    S5.d.a(new C3011f2(e));
                                    if (z2) {
                                        map2 = new HashMap();
                                        map2.put(obj2, (short) 2121);
                                        message2 = e.getMessage();
                                        if (message2 != null) {
                                            map2.put(obj, message2);
                                        }
                                        b((Map<String, Object>) map2);
                                    }
                                    z3 = z4;
                                    interfaceC3333z6 = this.j;
                                    if (interfaceC3333z6 != null) {
                                        ((A5) interfaceC3333z6).a("S0", "Parsing result - " + z3);
                                    }
                                    return z3;
                                } catch (JSONException e5) {
                                    e = e5;
                                    z4 = false;
                                    interfaceC3333z5 = this.j;
                                    if (interfaceC3333z5 != null) {
                                        ((A5) interfaceC3333z5).a("S0", "Exception while parsing received ad.", e);
                                    }
                                    S5 s8 = S5.f23167a;
                                    S5.d.a(new C3011f2(e));
                                    if (z2) {
                                        map = new HashMap();
                                        map.put(obj2, (short) 2120);
                                        message = e.getMessage();
                                        if (message != null) {
                                            map.put(obj, message);
                                        }
                                        b((Map<String, Object>) map);
                                    }
                                    z3 = z4;
                                    interfaceC3333z6 = this.j;
                                    if (interfaceC3333z6 != null) {
                                        ((A5) interfaceC3333z6).a("S0", "Parsing result - " + z3);
                                    }
                                    return z3;
                                }
                            } catch (JSONException e6) {
                                e = e6;
                                obj2 = "errorCode";
                            }
                        } catch (JSONException e7) {
                            e = e7;
                            obj2 = "errorCode";
                            z4 = false;
                            obj = obj;
                            interfaceC3333z5 = this.j;
                            if (interfaceC3333z5 != null) {
                                ((A5) interfaceC3333z5).a("S0", "Exception while parsing received ad.", e);
                            }
                            S5 s9 = S5.f23167a;
                            S5.d.a(new C3011f2(e));
                            if (z2) {
                                map = new HashMap();
                                map.put(obj2, (short) 2120);
                                message = e.getMessage();
                                if (message != null) {
                                    map.put(obj, message);
                                }
                                b((Map<String, Object>) map);
                            }
                            z3 = z4;
                            interfaceC3333z6 = this.j;
                            if (interfaceC3333z6 != null) {
                                ((A5) interfaceC3333z6).a("S0", "Parsing result - " + z3);
                            }
                            return z3;
                        }
                    } catch (IllegalArgumentException e8) {
                        e = e8;
                        obj2 = obj3;
                    }
                } catch (JSONException e9) {
                    e = e9;
                    obj2 = obj4;
                }
            } catch (IllegalArgumentException e10) {
                e = e10;
                obj2 = "errorCode";
                interfaceC3333z7 = this.j;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).a("S0", "Invalid Base64 encoding in received ad.", e);
                }
                S5 s10 = S5.f23167a;
                S5.d.a(new C3011f2(e));
                if (z2) {
                    map2 = new HashMap();
                    map2.put(obj2, (short) 2121);
                    message2 = e.getMessage();
                    if (message2 != null) {
                        map2.put(obj, message2);
                    }
                    b((Map<String, Object>) map2);
                }
                z3 = z4;
                interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).a("S0", "Parsing result - " + z3);
                }
                return z3;
            } catch (JSONException e11) {
                e = e11;
                obj2 = "errorCode";
            }
        } catch (IllegalArgumentException e12) {
            e = e12;
            obj = "reason";
        } catch (JSONException e13) {
            e = e13;
            obj = "reason";
            obj2 = "errorCode";
        }
    }

    public final HashMap a(JSONArray jSONArray) {
        JSONObject jSONObject;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "parseInMobiViewabilityParams ", this));
        }
        try {
            int length = jSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    jSONObject = null;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.has("inmobi")) {
                    jSONObject = jSONObject2.getJSONObject("inmobi");
                    break;
                }
                i2++;
            }
            if (jSONObject != null) {
                HashMap map = new HashMap();
                String strOptString = jSONObject.optString("time");
                Intrinsics.e(strOptString, "optString(...)");
                int iB = b(strOptString);
                if (iB != -1) {
                    map.put("time", Integer.valueOf(iB));
                }
                String strOptString2 = jSONObject.optString("view");
                Intrinsics.e(strOptString2, "optString(...)");
                int iB2 = b(strOptString2);
                if (iB2 != -1) {
                    map.put("view", Integer.valueOf(iB2));
                }
                String strOptString3 = jSONObject.optString("pixel");
                Intrinsics.e(strOptString3, "optString(...)");
                int iB3 = b(strOptString3);
                if (iB3 != -1) {
                    map.put("pixel", Integer.valueOf(iB3));
                }
                int iOptInt = jSONObject.optInt("type");
                if (iOptInt != -1) {
                    map.put("type", Integer.valueOf(iOptInt));
                    if (iOptInt == 2) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("frame");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 4) {
                            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("frame");
                            Intrinsics.e(jSONArrayOptJSONArray2, "optJSONArray(...)");
                            map.put("frame", jSONArrayOptJSONArray2);
                            return map;
                        }
                        map.put("frame", new JSONArray("[0,0,0,0]"));
                    }
                }
                return map;
            }
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("S0", E0.a(e2, H6.a("S0", "TAG", "Exception while parsing MoatParams from response : ")));
            }
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        }
        return null;
    }

    public void a(Z placement, boolean z2, short s) {
        Intrinsics.f(placement, "placement");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "onAssetAvailabilityChanged ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        if (s != 0) {
            b(s);
        }
        a(placement, z2);
    }

    public void a(int i2, GestureDetectorOnGestureListenerC3005ec renderView, Context context) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            StringBuilder sbU = android.support.v4.media.a.u(i2, "Show pod ad with index : ", " from creative: ");
            sbU.append(this.g.indexOf(renderView));
            sbU.append(' ');
            sbU.append(this);
            ((A5) interfaceC3333z5).c("S0", sbU.toString());
        }
        if (i2 >= 0) {
            this.x = i2;
        } else {
            this.x++;
        }
    }

    @Override // com.inmobi.media.InterfaceC2925a0
    public void a(GestureDetectorOnGestureListenerC3005ec renderView, Context context) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "closeCurrentPodAd ", this));
        }
    }

    public void a(Z placement, boolean z2) {
        Intrinsics.f(placement, "placement");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "handleAssetAvailabilityChanged ", this));
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("S0", "Asset availability changed (" + z2 + ") for placement ID (" + placement + ')');
        }
    }

    public void a(C3312y0 adSet) {
        LinkedList<C3040h> linkedListF;
        LinkedList<C3040h> linkedListF2;
        Intrinsics.f(adSet, "adSet");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "handleAdFetchSuccessful ", this));
        }
        if (this.f23136a == 1) {
            this.f23145u = adSet;
            this.f23130A = adSet.n();
            C3312y0 c3312y0 = this.f23145u;
            this.g = new ArrayList((c3312y0 == null || (linkedListF2 = c3312y0.f()) == null) ? 0 : linkedListF2.size());
            C3312y0 c3312y1 = this.f23145u;
            if (c3312y1 != null && (linkedListF = c3312y1.f()) != null) {
                for (C3040h c3040h : linkedListF) {
                    this.g.add(null);
                }
            }
            C3040h c3040hP = adSet.p();
            if (c3040hP == null) {
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).b("S0", "top ad is null. failed.");
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2119);
                return;
            }
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).a("S0", "starting executor. parsing ad response");
            }
            A a2 = this.C;
            int iHashCode = hashCode();
            C3258ua c3258ua = new C3258ua(this, c3040hP, adSet, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.j);
            a2.getClass();
            A.a(iHashCode, c3258ua);
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "incorrect state - ");
            sbA.append((int) this.f23136a);
            ((A5) interfaceC3333z8).b("S0", sbA.toString());
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
    }

    @Override // com.inmobi.media.InterfaceC2925a0
    public boolean a(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 == null) {
            return false;
        }
        ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "hasNextAdInAdPod ", this));
        return false;
    }

    public void a(boolean z2, InMobiAdRequestStatus status) {
        Intrinsics.f(status, "status");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onDidParseAfterFetch ", this));
        }
        if (z2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("S0", "Ad fetch successful");
            }
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).d("S0", "AdUnit " + this + " state - AVAILABLE");
            }
            d((byte) 2);
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).b("S0", "onComplete parse success");
        }
        b(status, true, (short) 0);
    }

    @Override // com.inmobi.media.InterfaceC3007ee
    public void a(byte b2) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "onTimeOut ", this));
        }
        if (b2 == 0) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                StringBuilder sbA = H6.a("S0", "TAG", "AdRequestTimeOut by timer, Adstate=");
                sbA.append((int) this.f23136a);
                ((A5) interfaceC3333z6).a("S0", sbA.toString());
            }
            if (this.f23136a != 3) {
                a(this.t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b2 != 2 && b2 != 1) {
            if (b2 == 4) {
                InterfaceC3333z5 interfaceC3333z7 = this.j;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).a("S0", "Show RequestTimeOut by show timer");
                }
                F0 f0R = r();
                if (f0R != null) {
                    f0R.g();
                    return;
                }
                return;
            }
            if (b2 == 3) {
                InterfaceC3333z5 interfaceC3333z8 = this.j;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).a("S0", "Bitmap TimeOut not handled here");
                    return;
                }
                return;
            }
            InterfaceC3333z5 interfaceC3333z9 = this.j;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).a("S0", "Unknown TimeOut ignored");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z10 = this.j;
        if (interfaceC3333z10 != null) {
            StringBuilder sbA2 = H6.a("S0", "TAG", "Internal LoadTimeOut by timer, Adstate=");
            sbA2.append((int) this.f23136a);
            ((A5) interfaceC3333z10).a("S0", sbA2.toString());
        }
        if (this.f23136a != 3) {
            this.G.removeCallbacksAndMessages(null);
            InterfaceC3333z5 interfaceC3333z11 = this.j;
            if (interfaceC3333z11 != null) {
                StringBuilder sbA3 = H6.a("S0", "TAG", "adUnitEventListener=");
                sbA3.append(r());
                sbA3.append(", Adstate=");
                sbA3.append((int) this.f23136a);
                ((A5) interfaceC3333z11).a("S0", sbA3.toString());
            }
            byte b3 = this.f23136a;
            if (2 == b3) {
                m0();
                b(T9.a(false) == null ? (short) 2139 : (short) 2203);
                F0 f0R2 = r();
                if (f0R2 != null) {
                    f0R2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == b3) {
                m0();
                b((short) 2138);
                F0 f0R3 = r();
                if (f0R3 != null) {
                    f0R3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public final void a(Z placement, InMobiAdRequestStatus requestStatus, short s) {
        Intrinsics.f(placement, "placement");
        Intrinsics.f(requestStatus, "requestStatus");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "onAdFetchFailed ", this));
        }
        if (!this.o && t() != null && this.f23136a != 3) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("S0", D0.a("S0", "TAG", "handleMarkupFetchFailure ", this));
            }
            try {
                if (Intrinsics.a(this.t, placement) && this.f23136a == 1) {
                    InterfaceC3333z5 interfaceC3333z7 = this.j;
                    if (interfaceC3333z7 != null) {
                        ((A5) interfaceC3333z7).b("S0", "Failed to fetch ad for placement id: " + placement + ", reason - " + requestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
                    }
                    String str = "MarkupFetch failed reason is: " + requestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String();
                    InterfaceC3333z5 interfaceC3333z8 = this.j;
                    if (interfaceC3333z8 != null) {
                        ((A5) interfaceC3333z8).b("S0", str);
                    }
                    InterfaceC3333z5 interfaceC3333z9 = this.j;
                    if (interfaceC3333z9 != null) {
                        ((A5) interfaceC3333z9).d("S0", "AdUnit " + this + " state - FAILED");
                    }
                    d((byte) 3);
                    b((byte) 1);
                    if (s != 0) {
                        a(s);
                    }
                    F0 f0R = r();
                    if (f0R != null) {
                        f0R.a(requestStatus);
                        return;
                    }
                    InterfaceC3333z5 interfaceC3333z10 = this.j;
                    if (interfaceC3333z10 != null) {
                        ((A5) interfaceC3333z10).a();
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z11 = this.j;
                if (interfaceC3333z11 != null) {
                    ((A5) interfaceC3333z11).a("S0", "onAdFetchFailed with error: ", e2);
                }
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
                return;
            }
        }
        InterfaceC3333z5 interfaceC3333z12 = this.j;
        if (interfaceC3333z12 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "callback ignored - isDestroyed - ");
            sbA.append(this.o);
            sbA.append(" context - ");
            sbA.append(t());
            sbA.append(" state- ");
            sbA.append((int) this.f23136a);
            ((A5) interfaceC3333z12).b("S0", sbA.toString());
        }
    }

    public final void a(boolean z2, short s) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("S0", "handleAdShowFailure " + this + " errorCode - " + ((int) s));
        }
        if (z2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).d("S0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 4);
        }
        F0 f0R = r();
        if (f0R != null) {
            f0R.d();
        }
        if (s != 0) {
            c(s);
        }
    }

    public final void a(InMobiAdRequestStatus requestStatus, boolean z2, short s) {
        Intrinsics.f(requestStatus, "requestStatus");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("S0", "handleAdFetchFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.f23136a == 3 && z2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).d("S0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 1);
        }
        F0 f0R = r();
        if (f0R != null) {
            f0R.a(this, requestStatus);
        }
        if (s != 0) {
            a(s);
        }
    }

    public final void a(Map<String, String> map) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.t.a(map);
    }

    public final void a(JSONObject responseJson) {
        Intrinsics.f(responseJson, "responseJson");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onAuctionClosed ", this));
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0905n(10, this, responseJson));
    }

    public static final void a(S0 this$0, JSONObject responseJson) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(responseJson, "$responseJson");
        A a2 = this$0.C;
        int iHashCode = this$0.hashCode();
        C3313y1 c3313y1 = new C3313y1(this$0, responseJson, this$0.j);
        a2.getClass();
        A.a(iHashCode, c3313y1);
    }

    public final void a(Function0 onSuccess, Function1 onMaxRetryReached) {
        Intrinsics.f(onSuccess, "onSuccess");
        Intrinsics.f(onMaxRetryReached, "onMaxRetryReached");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        Object c3144n7 = null;
        if (interfaceC3333z5 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "loadWithRetry ");
            C3031g6 c3031g6 = this.f23132E;
            sbA.append(c3031g6 != null ? Integer.valueOf(c3031g6.f23631b) : null);
            ((A5) interfaceC3333z5).c("S0", sbA.toString());
        }
        C3031g6 c3031g7 = this.f23132E;
        if (c3031g7 != null) {
            EnumC3157o4 enumC3157o4A = T9.a(false);
            if (enumC3157o4A == null) {
                c3144n7 = C3242ta.f24010a;
            } else {
                int i2 = c3031g7.f23631b + 1;
                c3031g7.f23631b = i2;
                if (i2 >= c3031g7.f23630a.f24122b) {
                    c3144n7 = new C3144n7(enumC3157o4A);
                } else {
                    c3144n7 = C3291wb.f24074a;
                }
            }
        }
        if (c3144n7 instanceof C3144n7) {
            onMaxRetryReached.invoke(((C3144n7) c3144n7).f23828a);
            return;
        }
        if (c3144n7 instanceof C3242ta) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("S0", "load with retry success");
            }
            onSuccess.invoke();
            return;
        }
        if (!(c3144n7 instanceof C3291wb)) {
            if (c3144n7 == null) {
                InterfaceC3333z5 interfaceC3333z7 = this.j;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).c("S0", "shouldProceedToLoad result null. starting as if we have internet.");
                }
                onSuccess.invoke();
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).c("S0", "load failed, retrying");
        }
        Handler handler = this.G;
        RunnableC0887e runnableC0887e = new RunnableC0887e(this, onSuccess, onMaxRetryReached, 5);
        C3319y7 c3319y7 = this.f23133F;
        handler.postDelayed(runnableC0887e, c3319y7 != null ? c3319y7.f24121a : 1000L);
    }

    public static final void a(S0 this$0, Function0 onSuccess, Function1 onMaxRetryReached) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(onSuccess, "$onSuccess");
        Intrinsics.f(onMaxRetryReached, "$onMaxRetryReached");
        InterfaceC3333z5 interfaceC3333z5 = this$0.j;
        if (interfaceC3333z5 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "Loading from retry Handler ");
            C3031g6 c3031g6 = this$0.f23132E;
            sbA.append(c3031g6 != null ? Integer.valueOf(c3031g6.f23631b) : null);
            ((A5) interfaceC3333z5).c("S0", sbA.toString());
        }
        this$0.a(onSuccess, onMaxRetryReached);
    }

    public void a(byte[] bArr) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "load response ", this));
        }
        U0 u0 = this.f23134I;
        u0.getClass();
        u0.f23243c = SystemClock.elapsedRealtime();
        U0 u1 = this.f23134I;
        u1.getClass();
        u1.f23245h = SystemClock.elapsedRealtime();
        if (Y()) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("S0", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr != null && bArr.length != 0) {
            if (this.s == null) {
                this.s = new C2969ca(this);
            }
            O0 o0 = new O0(this, bArr);
            if (p0()) {
                InterfaceC3333z5 interfaceC3333z7 = this.j;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).a("S0", "skipping internet check on load(byte[])");
                }
                o0.invoke();
                return;
            }
            InterfaceC3333z5 interfaceC3333z8 = this.j;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).a("S0", "starting load with retry");
            }
            a(o0, new N0(this));
            return;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
        InterfaceC3333z5 interfaceC3333z9 = this.j;
        if (interfaceC3333z9 != null) {
            ((A5) interfaceC3333z9).a("S0", "null response. failing");
        }
    }

    public final void a(InMobiAdRequestStatus requestStatus, short s) {
        Intrinsics.f(requestStatus, "requestStatus");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("S0", "loadResponseFailed " + this + " errorCode - " + ((int) s));
        }
        b(requestStatus, true, s);
    }

    public final boolean a(F0 f0, long j) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "isBlockingStateForGetSignals ", this));
        }
        if (this.r) {
            AbstractC3048h7.a((byte) 2, "InMobi", "getSignals() call is already in progress. Please wait for its execution to get complete");
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("S0", "getSignals() call is already in progress. Please wait for its execution to get complete");
            }
            return true;
        }
        if (!f0()) {
            return false;
        }
        if (f0 != null) {
            f0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
        }
        a(2007, j);
        return true;
    }

    public final void a(WeakReference<F0> listenerWeakReference, short s, InMobiAdRequestStatus status) {
        Intrinsics.f(listenerWeakReference, "listenerWeakReference");
        Intrinsics.f(status, "status");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "onLoadAdMarkupFailed ", this));
        }
        d((byte) 3);
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).d("S0", "AdUnit " + this + " state - FAILED");
        }
        b((byte) 1);
        if (this.o) {
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b("S0", "AdUnit destroyed while onLoadAdMarkupFailed");
                return;
            }
            return;
        }
        F0 f0 = listenerWeakReference.get();
        if (f0 != null) {
            if ("int".equals(q())) {
                a(f0, s);
                return;
            } else {
                b(s);
                f0.a(this, status);
                return;
            }
        }
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).b("S0", "Listener was garbage collected.Unable to give callback");
        }
    }

    public void a(F0 f0) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "handleAdScreenDismissed ", this));
        }
    }

    public final void a(WatermarkData watermarkData) {
        Intrinsics.f(watermarkData, "watermarkData");
        this.f23135J = watermarkData;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecW = w();
        if (gestureDetectorOnGestureListenerC3005ecW != null) {
            gestureDetectorOnGestureListenerC3005ecW.setWatermark(watermarkData);
        }
    }

    public static /* synthetic */ void a(S0 s0, int i2, boolean z2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroyContainer");
        }
        if ((i3 & 2) != 0) {
            z2 = true;
        }
        s0.a(i2, z2);
    }

    public final void a(int i2, boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", "Destroying container for index " + i2 + ' ' + this);
        }
        ArrayList list = this.g;
        Intrinsics.f(list, "list");
        if (i2 < 0 || i2 >= list.size()) {
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) this.g.get(i2);
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            gestureDetectorOnGestureListenerC3005ec.E0.set(z2);
            gestureDetectorOnGestureListenerC3005ec.stopLoading();
            gestureDetectorOnGestureListenerC3005ec.b();
        }
        this.g.set(i2, null);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void a(GestureDetectorOnGestureListenerC3005ec renderView, String trackerName, Map<String, String> macros) {
        Intrinsics.f(renderView, "renderView");
        Intrinsics.f(trackerName, "trackerName");
        Intrinsics.f(macros, "macros");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", "fireLandingPageTracker " + trackerName + ' ' + this);
        }
        C3040h c3040hB = b(this.g.indexOf(renderView));
        if (c3040hB != null) {
            List<String> listC = c3040hB.c(trackerName);
            if (listC == null) {
                return;
            }
            Iterator<String> it = listC.iterator();
            while (it.hasNext()) {
                String next = it.next();
                for (Map.Entry<String, String> entry : macros.entrySet()) {
                    next = StringsKt.I(next, entry.getKey(), entry.getValue());
                }
                C3298x2.f24089a.a(next, true, this.j);
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("S0", "fireLandingPageTracker failed");
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void a(String log) {
        Intrinsics.f(log, "log");
        F0 f0R = r();
        if (f0R != null) {
            f0R.a(log);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3005ec renderView, int i2) {
        Intrinsics.f(renderView, "renderView");
        this.g.add(i2, renderView);
        this.f23147z.add(Integer.valueOf(i2));
    }

    public void a(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, short s) {
        List<String> listC;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "Render view signaled ad failed, for index ");
            sbA.append(this.g.indexOf(gestureDetectorOnGestureListenerC3005ec));
            sbA.append(' ');
            sbA.append(this);
            ((A5) interfaceC3333z5).b("S0", sbA.toString());
        }
        if (gestureDetectorOnGestureListenerC3005ec == null || !Intrinsics.a(gestureDetectorOnGestureListenerC3005ec.getMarkupType(), "htmlUrl")) {
            return;
        }
        int iIndexOf = this.g.indexOf(gestureDetectorOnGestureListenerC3005ec);
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).b("S0", "fireLoadAdTokenUrlFailed : " + iIndexOf + ' ' + this);
        }
        C3040h c3040hB = b(iIndexOf);
        if (c3040hB == null || (listC = c3040hB.c(C3040h.LOAD_AD_TOKEN_URL_FAILURE)) == null) {
            return;
        }
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            C3298x2.f24089a.a(it.next(), true, this.j);
        }
    }

    public static final void a(S0 this$0, GestureDetectorOnGestureListenerC3005ec renderView, short s) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(renderView, "$renderView");
        this$0.a(renderView, s);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void a(HashMap<Object, Object> params) {
        Intrinsics.f(params, "params");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onAdInteraction ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("S0", "Ad interaction. Params: " + params);
        }
        F0 f0R = r();
        if (f0R != null) {
            f0R.a(params);
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void a(Yd telemetryOnAdImpression) {
        Intrinsics.f(telemetryOnAdImpression, "telemetryOnAdImpression");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onImpressionFiredFromTemplate ", this));
        }
        telemetryOnAdImpression.f23382e = "imraid_impressionFired";
        if (!this.o && t() != null) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("S0", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.f23142l;
            if (handler != null) {
                handler.post(new RunnableC0905n(9, this, telemetryOnAdImpression));
                return;
            }
            return;
        }
        telemetryOnAdImpression.b();
    }

    public static final void a(S0 this$0, Yd telemetryOnAdImpression) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(telemetryOnAdImpression, "$telemetryOnAdImpression");
        this$0.D.a(telemetryOnAdImpression);
    }

    @Override // com.inmobi.media.AbstractC3037gc, com.inmobi.media.Fe
    public void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onUserLeaveApplication ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("S0", "User left application");
        }
        F0 f0R = r();
        if (f0R != null) {
            f0R.h();
        }
    }

    public final void a(short s) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "submitAdLoadDroppedAtSDK ", this));
        }
        HashMap map = new HashMap();
        map.put("errorCode", Short.valueOf(s));
        c(map);
        c("AdLoadDroppedAtSDK", map);
    }

    public final void a(int i2, long j) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "submitAdGetSignalsFailed ", this));
        }
        this.r = false;
        HashMap map = new HashMap();
        map.put("adType", q());
        map.put("latency", Long.valueOf(System.currentTimeMillis() - j));
        map.put("networkType", L3.q());
        map.put("errorCode", Integer.valueOf(i2));
        c("AdGetSignalsFailed", map);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void a(String eventType, Map<String, Object> kv) {
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(kv, "kv");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onRenderViewRequestedAction ", this));
        }
        c(eventType, kv);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03f0 A[Catch: Exception -> 0x0403, TRY_LEAVE, TryCatch #7 {Exception -> 0x0403, blocks: (B:148:0x03df, B:150:0x03f0), top: B:179:0x03df }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0415  */
    /* JADX WARN: Code duplicated, block: B:161:0x0427  */
    /* JADX WARN: Code duplicated, block: B:189:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x023a  */
    public final void a(C3040h ad) {
        String str;
        String str2;
        String str3;
        String str4;
        InterfaceC3333z5 interfaceC3333z5;
        String str5;
        HashMap mapA;
        String strA;
        InterfaceC3333z5 interfaceC3333z6;
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        HashMap mapA2;
        String strA2;
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters2;
        AdConfig.ViewabilityConfig viewability;
        Intrinsics.f(ad, "ad");
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        String str6 = "TAG";
        String str7 = "S0";
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).c("S0", D0.a("S0", "TAG", "initOmidForAd ", this));
        }
        Context contextT = t();
        AdConfig adConfig = this.f23137b;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            AbstractC3147na.f23833a.getClass();
            if (Omid.isActive()) {
                boolean z2 = ad instanceof W8;
                Set setE = e(0);
                if (setE != null) {
                    Iterator it = setE.iterator();
                    while (it.hasNext()) {
                        C3199qe c3199qe = (C3199qe) it.next();
                        if (3 == c3199qe.f23940a) {
                            String str8 = "OMID video ad session created and JavaScript resources injected";
                            contextT = contextT;
                            z2 = z2;
                            Class<Map> cls = Map.class;
                            it = it;
                            String str9 = "macros";
                            String str10 = "OMID_VIEWABILITY";
                            if ("video" == c3199qe.f23941b.get("creativeType") && z2) {
                                W8 w8 = (W8) ad;
                                InterfaceC3333z5 interfaceC3333z8 = this.j;
                                if (interfaceC3333z8 != null) {
                                    ((A5) interfaceC3333z8).b(str7, D0.a(str7, str6, "initOmidForNativeVideoAd ", this));
                                }
                                try {
                                    InterfaceC3333z5 interfaceC3333z9 = this.j;
                                    if (interfaceC3333z9 != null) {
                                        ((A5) interfaceC3333z9).a(str7, "Processing OMID meta data to bootstrap impression tracking for this ad response");
                                    }
                                    String str11 = w8.f23317a;
                                    String str12 = w8.f23318b;
                                    String str13 = w8.f23319c;
                                    ArrayList arrayList = w8.d;
                                    ArrayList arrayList2 = w8.f23320e;
                                    AdConfig adConfig2 = this.f23137b;
                                    Intrinsics.c(adConfig2);
                                    Ue ue = new Ue(str11, str12, str13, arrayList, arrayList2, adConfig2.getVastVideo());
                                    byte bJ = J();
                                    String strL = L();
                                    Intrinsics.c(strL);
                                    JSONObject jSONObject = new JSONObject(strL);
                                    AdConfig adConfig3 = this.f23137b;
                                    Intrinsics.c(adConfig3);
                                    C3312y0 c3312y0 = this.f23145u;
                                    if (c3312y0 == null) {
                                        mapA2 = null;
                                    } else {
                                        boolean z3 = T9.f23231a;
                                        mapA2 = T9.a(c3312y0.h());
                                    }
                                    C3177p8 c3177p8 = new C3177p8(bJ, jSONObject, null, false, adConfig3, mapA2, ue, this.j);
                                    Object obj = c3177p8.n("VIDEO").get(0);
                                    Intrinsics.d(obj, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeVideoAsset");
                                    C2968c9 c2968c9 = (C2968c9) obj;
                                    if (contextT != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        String str14 = str7;
                                        try {
                                            Iterator it2 = c2968c9.s.iterator();
                                            while (it2.hasNext()) {
                                                it2 = it2;
                                                U8 u8 = (U8) it2.next();
                                                str8 = str8;
                                                if ("OMID_VIEWABILITY".equals(u8.f23265b) && (u8 instanceof C3051ha)) {
                                                    Map map = (Map) c3199qe.a(str9, cls);
                                                    Class<Map> cls2 = cls;
                                                    String strA3 = G0.a(((C3051ha) u8).g, map);
                                                    String str15 = str9;
                                                    String str16 = ((C3051ha) u8).f23662h;
                                                    String strA4 = G0.a(u8.d, map);
                                                    if (B2.a(strA3) && B2.a(str16)) {
                                                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters2 = VerificationScriptResource.createVerificationScriptResourceWithParameters(str16, new URL(strA4), strA3);
                                                        Intrinsics.c(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters2);
                                                    } else {
                                                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters2 = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(strA4));
                                                        Intrinsics.c(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters2);
                                                    }
                                                    arrayList3.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters2);
                                                    cls = cls2;
                                                    str9 = str15;
                                                }
                                            }
                                            String str17 = str8;
                                            if (arrayList3.size() != 0) {
                                                C2984d8 c2984d8A = a(c3177p8);
                                                if (c2984d8A != null) {
                                                    c3199qe.f23941b.put("videoSkippable", Boolean.TRUE);
                                                    c3199qe.f23941b.put("videoSkipOffset", Integer.valueOf(c2984d8A.f23520n));
                                                } else {
                                                    c3199qe.f23941b.put("videoSkippable", Boolean.FALSE);
                                                    c3199qe.f23941b.put("videoSkipOffset", 0);
                                                }
                                                HashMap map2 = c3199qe.f23941b;
                                                Object obj2 = c2968c9.t.get("shouldAutoPlay");
                                                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Any");
                                                map2.put("videoAutoPlay", obj2);
                                                HashMap map3 = c3199qe.f23941b;
                                                String strE = this.t.e();
                                                String str18 = (String) c3199qe.f23941b.get("creativeType");
                                                C3163oa c3163oa = AbstractC3147na.f23833a;
                                                c3163oa.getClass();
                                                Context contextD = Uc.d();
                                                if (contextD == null) {
                                                    strA2 = ";(function(omidGlobal) {\n  var n;function aa(a){var b=0;return function(){return b<a.length?{done:!1,value:a[b++]}:{done:!0}}}function p(a){var b='undefined'!=typeof Symbol&&Symbol.iterator&&a[Symbol.iterator];if(b)return b.call(a);if('number'==typeof a.length)return{next:aa(a)};throw Error(String(a)+' is not an iterable or ArrayLike');}function q(a){if(!(a instanceof Array)){a=p(a);for(var b,c=[];!(b=a.next()).done;)c.push(b.value);a=c}return a}\nvar ca='function'==typeof Object.create?Object.create:function(a){function b(){}b.prototype=a;return new b},t='function'==typeof Object.defineProperties?Object.defineProperty:function(a,b,c){if(a==Array.prototype||a==Object.prototype)return a;a[b]=c.value;return a};\nfunction da(a){a=['object'==typeof globalThis&&globalThis,a,'object'==typeof window&&window,'object'==typeof self&&self,'object'==typeof global&&global];for(var b=0;b<a.length;++b){var c=a[b];if(c&&c.Math==Math)return c}throw Error('Cannot find global object');}var ea=da(this);function u(a,b){if(b)a:{var c=ea;a=a.split('.');for(var d=0;d<a.length-1;d++){var e=a[d];if(!(e in c))break a;c=c[e]}a=a[a.length-1];d=c[a];b=b(d);b!=d&&null!=b&&t(c,a,{configurable:!0,writable:!0,value:b})}}var fa;\nif('function'==typeof Object.setPrototypeOf)fa=Object.setPrototypeOf;else{var ha;a:{var ia={a:!0},ja={};try{ja.__proto__=ia;ha=ja.a;break a}catch(a){}ha=!1}fa=ha?function(a,b){a.__proto__=b;if(a.__proto__!==b)throw new TypeError(a+' is not extensible');return a}:null}var ka=fa;\nfunction v(a,b){a.prototype=ca(b.prototype);a.prototype.constructor=a;if(ka)ka(a,b);else for(var c in b)if('prototype'!=c)if(Object.defineProperties){var d=Object.getOwnPropertyDescriptor(b,c);d&&Object.defineProperty(a,c,d)}else a[c]=b[c];a.La=b.prototype}function w(){for(var a=Number(this),b=[],c=a;c<arguments.length;c++)b[c-a]=arguments[c];return b}function x(a,b){return Object.prototype.hasOwnProperty.call(a,b)}\nvar la='function'==typeof Object.assign?Object.assign:function(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(d)for(var e in d)x(d,e)&&(a[e]=d[e])}return a};u('Object.assign',function(a){return a||la});\nu('Symbol',function(a){function b(f){if(this instanceof b)throw new TypeError('Symbol is not a constructor');return new c(d+(f||'')+'_'+e++,f)}function c(f,h){this.g=f;t(this,'description',{configurable:!0,writable:!0,value:h})}if(a)return a;c.prototype.toString=function(){return this.g};var d='jscomp_symbol_'+(1E9*Math.random()>>>0)+'_',e=0;return b});\nu('Symbol.iterator',function(a){if(a)return a;a=Symbol('Symbol.iterator');for(var b='Array Int8Array Uint8Array Uint8ClampedArray Int16Array Uint16Array Int32Array Uint32Array Float32Array Float64Array'.split(' '),c=0;c<b.length;c++){var d=ea[b[c]];'function'===typeof d&&'function'!=typeof d.prototype[a]&&t(d.prototype,a,{configurable:!0,writable:!0,value:function(){return ma(aa(this))}})}return a});function ma(a){a={next:a};a[Symbol.iterator]=function(){return this};return a}\nu('WeakMap',function(a){function b(g){this.g=(k+=Math.random()+1).toString();if(g){g=p(g);for(var l;!(l=g.next()).done;)l=l.value,this.set(l[0],l[1])}}function c(){}function d(g){var l=typeof g;return'object'===l&&null!==g||'function'===l}function e(g){if(!x(g,h)){var l=new c;t(g,h,{value:l})}}function f(g){var l=Object[g];l&&(Object[g]=function(m){if(m instanceof c)return m;Object.isExtensible(m)&&e(m);return l(m)})}if(function(){if(!a||!Object.seal)return!1;try{var g=Object.seal({}),l=Object.seal({}),\nm=new a([[g,2],[l,3]]);if(2!=m.get(g)||3!=m.get(l))return!1;m.delete(g);m.set(l,4);return!m.has(g)&&4==m.get(l)}catch(r){return!1}}())return a;var h='$jscomp_hidden_'+Math.random();f('freeze');f('preventExtensions');f('seal');var k=0;b.prototype.set=function(g,l){if(!d(g))throw Error('Invalid WeakMap key');e(g);if(!x(g,h))throw Error('WeakMap key fail: '+g);g[h][this.g]=l;return this};b.prototype.get=function(g){return d(g)&&x(g,h)?g[h][this.g]:void 0};b.prototype.has=function(g){return d(g)&&x(g,\nh)&&x(g[h],this.g)};b.prototype.delete=function(g){return d(g)&&x(g,h)&&x(g[h],this.g)?delete g[h][this.g]:!1};return b});\nu('Map',function(a){function b(){var k={};return k.H=k.next=k.head=k}function c(k,g){var l=k.g;return ma(function(){if(l){for(;l.head!=k.g;)l=l.H;for(;l.next!=l.head;)return l=l.next,{done:!1,value:g(l)};l=null}return{done:!0,value:void 0}})}function d(k,g){var l=g&&typeof g;'object'==l||'function'==l?f.has(g)?l=f.get(g):(l=''+ ++h,f.set(g,l)):l='p_'+g;var m=k.h[l];if(m&&x(k.h,l))for(k=0;k<m.length;k++){var r=m[k];if(g!==g&&r.key!==r.key||g===r.key)return{id:l,list:m,index:k,B:r}}return{id:l,list:m,\nindex:-1,B:void 0}}function e(k){this.h={};this.g=b();this.size=0;if(k){k=p(k);for(var g;!(g=k.next()).done;)g=g.value,this.set(g[0],g[1])}}if(function(){if(!a||'function'!=typeof a||!a.prototype.entries||'function'!=typeof Object.seal)return!1;try{var k=Object.seal({x:4}),g=new a(p([[k,'s']]));if('s'!=g.get(k)||1!=g.size||g.get({x:4})||g.set({x:4},'t')!=g||2!=g.size)return!1;var l=g.entries(),m=l.next();if(m.done||m.value[0]!=k||'s'!=m.value[1])return!1;m=l.next();return m.done||4!=m.value[0].x||\n't'!=m.value[1]||!l.next().done?!1:!0}catch(r){return!1}}())return a;var f=new WeakMap;e.prototype.set=function(k,g){k=0===k?0:k;var l=d(this,k);l.list||(l.list=this.h[l.id]=[]);l.B?l.B.value=g:(l.B={next:this.g,H:this.g.H,head:this.g,key:k,value:g},l.list.push(l.B),this.g.H.next=l.B,this.g.H=l.B,this.size++);return this};e.prototype.delete=function(k){k=d(this,k);return k.B&&k.list?(k.list.splice(k.index,1),k.list.length||delete this.h[k.id],k.B.H.next=k.B.next,k.B.next.H=k.B.H,k.B.head=null,this.size--,\n!0):!1};e.prototype.clear=function(){this.h={};this.g=this.g.H=b();this.size=0};e.prototype.has=function(k){return!!d(this,k).B};e.prototype.get=function(k){return(k=d(this,k).B)&&k.value};e.prototype.entries=function(){return c(this,function(k){return[k.key,k.value]})};e.prototype.keys=function(){return c(this,function(k){return k.key})};e.prototype.values=function(){return c(this,function(k){return k.value})};e.prototype.forEach=function(k,g){for(var l=this.entries(),m;!(m=l.next()).done;)m=m.value,\nk.call(g,m[1],m[0],this)};e.prototype[Symbol.iterator]=e.prototype.entries;var h=0;return e});u('Object.values',function(a){return a?a:function(b){var c=[],d;for(d in b)x(b,d)&&c.push(b[d]);return c}});function na(a,b){a instanceof String&&(a+='');var c=0,d=!1,e={next:function(){if(!d&&c<a.length){var f=c++;return{value:b(f,a[f]),done:!1}}d=!0;return{done:!0,value:void 0}}};e[Symbol.iterator]=function(){return e};return e}u('Array.prototype.keys',function(a){return a?a:function(){return na(this,function(b){return b})}});\nu('Set',function(a){function b(c){this.g=new Map;if(c){c=p(c);for(var d;!(d=c.next()).done;)this.add(d.value)}this.size=this.g.size}if(function(){if(!a||'function'!=typeof a||!a.prototype.entries||'function'!=typeof Object.seal)return!1;try{var c=Object.seal({x:4}),d=new a(p([c]));if(!d.has(c)||1!=d.size||d.add(c)!=d||1!=d.size||d.add({x:4})!=d||2!=d.size)return!1;var e=d.entries(),f=e.next();if(f.done||f.value[0]!=c||f.value[1]!=c)return!1;f=e.next();return f.done||f.value[0]==c||4!=f.value[0].x||\nf.value[1]!=f.value[0]?!1:e.next().done}catch(h){return!1}}())return a;b.prototype.add=function(c){c=0===c?0:c;this.g.set(c,c);this.size=this.g.size;return this};b.prototype.delete=function(c){c=this.g.delete(c);this.size=this.g.size;return c};b.prototype.clear=function(){this.g.clear();this.size=0};b.prototype.has=function(c){return this.g.has(c)};b.prototype.entries=function(){return this.g.entries()};b.prototype.values=function(){return this.g.values()};b.prototype.keys=b.prototype.values;b.prototype[Symbol.iterator]=\nb.prototype.values;b.prototype.forEach=function(c,d){var e=this;this.g.forEach(function(f){return c.call(d,f,f,e)})};return b});u('Object.is',function(a){return a?a:function(b,c){return b===c?0!==b||1/b===1/c:b!==b&&c!==c}});u('Array.prototype.includes',function(a){return a?a:function(b,c){var d=this;d instanceof String&&(d=String(d));var e=d.length;c=c||0;for(0>c&&(c=Math.max(c+e,0));c<e;c++){var f=d[c];if(f===b||Object.is(f,b))return!0}return!1}});\nu('String.prototype.includes',function(a){return a?a:function(b,c){if(null==this)throw new TypeError(\"The 'this' value for String.prototype.includes must not be null or undefined\");if(b instanceof RegExp)throw new TypeError('First argument to String.prototype.includes must not be a regular expression');return-1!==this.indexOf(b,c||0)}});u('Object.entries',function(a){return a?a:function(b){var c=[],d;for(d in b)x(b,d)&&c.push([d,b[d]]);return c}});\nu('Array.prototype.values',function(a){return a?a:function(){return na(this,function(b,c){return c})}});\nvar y={xa:'loaded',Fa:'start',ra:'firstQuartile',Aa:'midpoint',Ga:'thirdQuartile',pa:'complete',Ba:'pause',Da:'resume',oa:'bufferStart',na:'bufferFinish',Ea:'skipped',Ja:'volumeChange',Ca:'playerStateChange',ka:'adUserInteraction'},oa={ua:'generic',Ia:'video',za:'media'},pa={ca:'native',va:'html',V:'javascript'},qa={ca:'native',V:'javascript',NONE:'none'},ra={ta:'full',qa:'domain',wa:'limited'},sa={ma:'backgrounded',sa:'foregrounded'},ta={ya:'locked',Ha:'unlocked'},ua={la:'app',Ka:'web'};function z(a,b){this.x=null!=a.x?a.x:a.left;this.y=null!=a.y?a.y:a.top;this.width=a.width;this.height=a.height;this.endX=this.x+this.width;this.endY=this.y+this.height;this.adSessionId=a.adSessionId||void 0;this.isFriendlyObstructionFor=a.isFriendlyObstructionFor||[];this.h=a.friendlyObstructionClass||void 0;this.i=a.friendlyObstructionPurpose||void 0;this.j=a.friendlyObstructionReason||void 0;this.clipsToBounds=void 0!==a.clipsToBounds?!0===a.clipsToBounds:!0;this.m=void 0!==a.hasWindowFocus?!0===\na.hasWindowFocus:!0;this.notVisibleReason=a.notVisibleReason||void 0;this.noOutputDevice=a.noOutputDevice||void 0;this.isPipActive='true'===a.isPipActive||!0===a.isPipActive||!1;this.childViews=a.childViews||[];this.isCreative=a.isCreative||!1;this.g=b}function va(a){var b={};return b.width=a.width,b.height=a.height,b}function A(a){var b={};return Object.assign({},va(a),(b.x=a.x,b.y=a.y,b))}function C(a){var b=A(a),c={};return Object.assign({},b,(c.endX=a.endX,c.endY=a.endY,c))}\nfunction wa(a,b,c){a.x+=b;a.y+=c;a.endX+=b;a.endY+=c}z.prototype.N=function(a){if(null==a)return!1;a=A(a);var b=a.y,c=a.width,d=a.height;return this.x===a.x&&this.y===b&&this.width===c&&this.height===d};function xa(a){return a.width*a.height}function D(a){return 0===a.width||0===a.height};function ya(a,b){a=A(a);for(var c=[],d=[],e=0;e<b.length;e++){var f=A(b[e]);f=za(a,f);E(c,f.x);E(c,f.endX);E(d,f.y);E(d,f.endY)}c=c.sort(function(h,k){return h-k});d=d.sort(function(h,k){return h-k});return{ia:c,ja:d}}function za(a,b){return{x:Math.max(a.x,b.x),y:Math.max(a.y,b.y),endX:Math.min(a.x+a.width,b.x+b.width),endY:Math.min(a.y+a.height,b.y+b.height)}}function E(a,b){-1===a.indexOf(b)&&a.push(b)};function H(){this.h=this.g=this.D=this.u=this.m=this.s=void 0;this.A=0;this.l=[];this.v=[];this.C=0;this.o=[];this.j=[];this.i=[]}H.prototype.N=function(a){return null==a?!1:JSON.stringify(Aa(this))===JSON.stringify(Aa(a))};\nfunction Aa(a){var b=[],c=[],d={viewport:a.s,adView:{percentageInView:a.A,pixelsInView:a.C,reasons:a.i},declaredFriendlyObstructions:a.l.length};if(void 0!==a.g){d.adView.geometry=A(a.g);d.adView.geometry.pixels=xa(a.g);d.adView.onScreenGeometry=A(a.h);d.adView.onScreenGeometry.pixels=Ba(a);for(var e=0;e<a.j.length;e++)b.push(A(a.j[e]));for(e=0;e<a.v.length;e++){var f=a.v[e],h=f,k={};h.h&&(k.obstructionClass=h.h);h.i&&(k.obstructionPurpose=h.i);h.j&&(k.obstructionReason=h.j);f=za(a.g,f);c.push(Object.assign({},\n{x:f.x,y:f.y,width:f.endX-f.x,height:f.endY-f.y},k))}d.adView.onScreenGeometry.obstructions=b;d.adView.onScreenGeometry.friendlyObstructions=c;void 0!==a.u&&void 0!==a.D&&(d.adView.containerGeometry=A(a.u),d.adView.onScreenContainerGeometry=A(a.D),d.adView.measuringElement=!0)}return d}function Ca(a,b){b=va(b);a.s={};a.s.width=b.width;a.s.height=b.height;a.m={};a.m.x=0;a.m.y=0;a.m.width=b.width;a.m.height=b.height;a.m.endX=b.width;a.m.endY=b.height}\nfunction Da(){return{x:0,y:0,endX:0,endY:0,width:0,height:0}}function Ea(a,b){var c={};c.x=Math.max(a.x,b.x);c.y=Math.max(a.y,b.y);c.endX=Math.min(a.endX,b.endX);c.endY=Math.min(a.endY,b.endY);c.width=Math.max(0,c.endX-c.x);c.height=Math.max(0,c.endY-c.y);return c}function Fa(a,b){return.01<b.width-a.width||.01<b.height-a.height}function Ga(a){if(-1!==a.i.indexOf('backgrounded'))a.A=0,a.C=0;else{var b=xa(a.g);if(0!==b){var c=Ba(a);a.A=Math.round(c/b*100);a.C=c}}}\nfunction Ha(a,b){if(D(b)||!a.h)b=!1;else{var c=C(a.h),d=c.y,e=c.endX;a=c.endY;var f=b.endX;c=c.x;(f=f<c||.01>Math.abs(f-c))||(f=b.x,f=f>e||.01>Math.abs(f-e));(e=f)||(e=b.endY,e=e<d||.01>Math.abs(e-d));(d=e)||(b=b.y,d=b>a||.01>Math.abs(b-a));b=!d}return b}function I(a,b){for(var c=!1,d=0;d<a.i.length;d++)a.i[d]===b&&(c=!0);c||a.i.push(b)}\nfunction Ba(a){var b=Math,c=b.max,d=xa(a.h),e=a.j,f=0;if(0<e.length){var h=ya(a.h,e);a=h.ia;h=h.ja;for(var k=0;k<a.length-1;k++)for(var g=(a[k]+(a[k]+1))/2,l=a[k+1]-a[k],m=0;m<h.length-1;m++){for(var r=(h[m]+(h[m]+1))/2,F=h[m+1]-h[m],ba=!1,R=0;R<e.length;R++){var G=A(e[R]);if(G.x<g&&G.x+G.width>g&&G.y<r&&G.y+G.height>r){ba=!0;break}}ba&&(f+=Math.round(l)*Math.round(F))}}return c.call(b,0,d-f)};function Ia(){};function Ja(){}\nfunction Ka(a,b,c,d,e,f){var h=new H;b=new z(b,!1);Ca(h,b);La(a,b,h,d);if(!e)return h.i=['unmeasurable'],h.s=void 0,h.A=0,h.j=[],h.g&&(a=h.g,c={},a=new z((c.x=0,c.y=0,c.width=a.width,c.height=a.height,c),a.g),h.g=a),h.h=Da(),h;'locked'===f&&I(h,'deviceLocked');if(b.noOutputDevice)I(h,'backgrounded'),I(h,'noOutputDevice');else if('backgrounded'===c)I(h,'backgrounded');else if(void 0!==h.g){for(a=0;a<h.l.length;a++)Ha(h,h.l[a])&&h.v.push(h.l[a]);for(a=0;a<h.o.length;a++){if(c=Ha(h,h.o[a])){a:{c=h.o[a];\nfor(d=0;d<h.j.length;d++)if(h.j[d].N(c)){c=!0;break a}c=!1}c=!c}c&&(I(h,'obstructed'),h.j.push(h.o[a]))}Ga(h)}else I(h,'notFound');return h}\nfunction La(a,b,c,d){var e=b.isCreative?!0:b.adSessionId===d;if(e){c.g=b;var f=C(c.g);a=Ea(c.m,f);var h=c.g;'notAttached'===h.notVisibleReason||'noWindowFocus'===h.notVisibleReason||'noAdView'===h.notVisibleReason?(I(c,'notFound'),c.h=new z(Da(),!1)):(h=c.g,'viewInvisible'===h.notVisibleReason||'viewGone'===h.notVisibleReason||'viewNotVisible'===h.notVisibleReason||'viewAlphaZero'===h.notVisibleReason||'viewHidden'===h.notVisibleReason||void 0!==c.g.notVisibleReason||D(c.g)?(I(c,'hidden'),c.h=new z(Da(),\n!1)):(c.g.isPipActive&&I(c,'pictureInPicture'),c.g.m||(I(c,'backgrounded'),I(c,'noWindowFocus')),Fa(a,f)&&I(c,'clipped'),c.h=new z(a,!1)))}else if(f=!0,b.g&&(f=-1!==b.isFriendlyObstructionFor.indexOf(d)?!1:!1===b.clipsToBounds),f){h=b.childViews;for(var k=0;k<h.length;k++)f=void 0!==c.g,La(a,new z(h[k],f),c,d)}e||void 0===c.g||(b.g?-1!==b.isFriendlyObstructionFor.indexOf(d)?c.l.push(b):c.o.push(b):(e=C(b),d=C(c.h),A(c.h),!D(c.h)&&b.clipsToBounds&&(b=Ea(d,e),Fa(b,d)&&(I(c,'clipped'),c.h=new z(b,!1)))))}\n;function Ma(){this.h=new Map;this.g=null}function Na(){Oa||(Oa=new Ma);return Oa}var Oa=null;function Pa(a,b){this.y=this.x=0;this.width=a;this.height=b};function Qa(){this.adSessionId=null;this.m={apiVersion:'1.0',accessMode:'limited',environment:'app',omidJsInfo:{omidImplementer:'omsdk',serviceVersion:'1.5.5-iab77'}};this.C=null;this.A='foregrounded';this.M='unlocked';this.u=this.o='none';this.s=this.j=this.i=this.l=this.h=this.g=this.J=this.D=null;this.I=!0;this.v=new Map}\nfunction Ra(a,b){void 0!==b.contentUrl&&(a.C=b.contentUrl,b.contentUrl=void 0);var c=a.m||{};b.omidJsInfo=Object.assign({},c.omidJsInfo||{},b.omidJsInfo||{});b=Object.assign({},c,b);a.I||(null!=a.j?(b.videoElement=a.j,b.accessMode='full'):null!=a.i&&(b.slotElement=a.i,b.accessMode='full'));a.m=b};var J=function(){if('undefined'!==typeof omidGlobal&&omidGlobal)return omidGlobal;if('undefined'!==typeof global&&global)return global;if('undefined'!==typeof window&&window)return window;if('undefined'!==typeof globalThis&&globalThis)return globalThis;var a=Function('return this')();if(a)return a;throw Error('Could not determine global object context.');}();function Sa(a,b){this.g=a;this.h=b}ea.Object.defineProperties(Sa.prototype,{event:{configurable:!0,enumerable:!0,get:function(){return this.g}},origin:{configurable:!0,enumerable:!0,get:function(){return this.h}}});function K(){var a=w.apply(0,arguments);Ta(function(){throw new (Function.prototype.bind.apply(Error,[null,'Could not complete the test successfully - '].concat(q(a))));},function(){return console.error.apply(console,q(a))})}function Ua(){var a=w.apply(0,arguments);Ta(function(){},function(){return console.error.apply(console,q(a))})}function Ta(a,b){'undefined'!==typeof jasmine&&jasmine?a():'undefined'!==typeof console&&console&&console.error&&b()};function Va(a){this.g=a;this.m=[];this.i=[];this.j=[];this.l=[];this.o={}}function Wa(a,b){if(void 0!==a.g&&a.g.adSessionId&&!1!==Xa(a,b)){var c=b.event;a.j.filter(function(d){return d.type===c.type}).forEach(function(d){a.h(d.G,c)})}}function Ya(a,b){a.m.push(b);Wa(a,b)}function Za(a,b,c){void 0!==a.g&&a.g.adSessionId&&a.m.filter(function(d){return d.event.type===b&&Xa(a,d)}).map(function(d){return d.event}).forEach(function(d){a.h(c.G,d)})}\nfunction Xa(a,b){var c=b.event.type,d=-1!==Object.values(y).indexOf(c)&&'volumeChange'!==c;return'impression'===c||'loaded'===c&&a.g.h?b.origin===a.g.u:d?b.origin===a.g.o:!0}function $a(a,b,c){Object.keys(y).forEach(function(d){d=y[d];var e={type:d,R:c,G:b};a.j.push(e);Za(a,d,e)})}function ab(a,b,c,d){var e={U:c,R:d,G:b};a.l.push(e);a.i.forEach(function(f){var h=bb(f);'sessionStart'===f.event.type&&cb(a,h,e);a.h(e.G,h)})}\nfunction db(a,b,c){var d=L(a,'sessionError','native',{errorType:b,message:c});a.i.push(d);a.l.forEach(function(e){a.h(e.G,d.event)})}function eb(a,b){a.o=Object.assign(a.o,b);b=a.g.m;if(void 0!==b){b=Object.assign({},fb(gb(a,hb(a,{context:b}),!0)),{supportsLoadedEvent:!!a.g.h||'video'==a.g.g});Object.assign(b,{pageUrl:null,contentUrl:a.g.C});var c=L(a,'sessionStart','native',b);a.i.push(c);a.l.forEach(function(d){var e=bb(c);cb(a,e,d);a.h(d.G,e)},a);ib(a)}}\nfunction cb(a,b,c){c.U&&(b.data.verificationParameters=a.o[c.U]);c.R&&(c=a.g.v.get(c.R))&&(b.data.verificationParameters=c.verificationParameters,b.data.context.accessMode=c.accessMode,'full'===c.accessMode&&(a.g.j&&(b.data.context.videoElement=a.g.j),a.g.i&&(b.data.context.slotElement=a.g.i)))}function jb(a){var b=L(a,'sessionFinish','native');a.i.push(b);a.l.forEach(function(c){a.h(c.G,b.event)})}Va.prototype.h=function(a){var b=w.apply(1,arguments);try{a.apply(null,q(b))}catch(c){Ua(c)}};\nfunction kb(a,b){var c=(c=a.g.K)?Aa(c):null;c=gb(a,hb(a,c));Ya(a,L(a,'impression',b,c))}function lb(a,b,c){if(a.g.h||'display'!=a.g.g)b=L(a,'loaded',b,gb(a,hb(a,void 0===c?null:c))),Ya(a,b)}\nfunction mb(a,b,c,d){'start'!==b&&'volumeChange'!==b||null!=(d&&d.deviceVolume)||(d.deviceVolume=a.g.D);if(d&&('start'===b||'volumeChange'===b)){var e=d.videoPlayerVolume,f=d.mediaPlayerVolume;null!=e?(Object.assign(d,{mediaPlayerVolume:e}),a.g.J=e):null!=f&&(Object.assign(d,{videoPlayerVolume:f}),a.g.J=f)}Ya(a,L(a,b,c,d))}\nfunction ib(a){var b=a.m.filter(function(f){return Object.values(y).includes(f.event.type)&&'video'==a.g.g&&f.origin===a.g.o||'loaded'==f.event.type&&'display'==a.g.g&&f.origin===a.g.u?!0:!1}).map(function(f){return f.event}),c=a.g.adSessionId||'',d={};b=p(b);for(var e=b.next();!e.done;d={F:d.F},e=b.next()){d.F=e.value;d.F.adSessionId||(d.F.adSessionId=c);if('loaded'==d.F.type){if(!a.g.h&&'display'==a.g.g)continue;d.F.data=gb(a,hb(a,d.F.data))}a.j.filter(function(f){return function(h){return h.type===\nf.F.type}}(d)).forEach(function(f){return function(h){return h.G(f.F)}}(d))}}function nb(a,b,c){a:{c=new Set(c);a=p(a.m.concat(a.i));for(var d=a.next();!d.done;d=a.next())if(d=d.value,c.has(d.event.type)&&d.origin!=b){b=!0;break a}b=!1}return b?(K('Event owner cannot be registered after its events have already been published.'),!1):!0}function ob(a,b){nb(a,b,Object.values(y))&&pb(a,b)&&(a.g.o=b)}function qb(a,b){nb(a,b,['impression'])&&rb(a,b)&&(a.g.u=b)}\nfunction rb(a,b){var c=a.g.u;return'none'!=c&&c!=b?(K('Impression event is owned by '+(a.g.u+', not ')+(b+'.')),!1):!0}function pb(a,b){var c=a.g.o;return'none'!=c&&c!=b?(K('Media events are owned by '+(a.g.o+', not '+b+'.')),!1):!0}function gb(a,b,c){c=void 0===c?!1:c;b=Object.assign({},b);a.g.g&&Object.assign(b,{mediaType:a.g.g});a.g.h&&(c||'definedByJavaScript'!==a.g.h)&&Object.assign(b,{creativeType:a.g.h});return b}function fb(a){var b=Na().g;return b?Object.assign({},a,{lastActivity:b}):a}\nfunction hb(a,b){return a.g.l?Object.assign({},b,{impressionType:a.g.l}):b}function L(a,b,c,d){return new Sa({adSessionId:a.g.adSessionId||'',timestamp:(new Date).getTime(),type:b,data:d},c)}function bb(a){a=a.event;var b=a.data?Object.assign({},a.data):void 0;'sessionStart'===a.type&&(b.context=Object.assign({},b.context));return{adSessionId:a.adSessionId,timestamp:a.timestamp,type:a.type,data:b}};function sb(a,b,c){this.h=a;this.i=b;this.g=c}\nfunction M(a,b,c){'container'===b&&void 0!==a.g.L&&void 0!==a.g&&null!=a.g.adSessionId&&(a.g.O=Ka(a.i,a.g.L,a.g.A,a.g.adSessionId,!0,a.g.M));b=a.g;var d=b.O,e=b.P;if(d)if(e){b=new H;var f=d.s,h=d.g,k=d.h,g=e.g,l=e.h;f&&h&&k&&g&&l&&(Ca(b,f),b.u=new z(h,!1),b.D=new z(k,!1),b.o=Object.assign([],d.o),b.j=Object.assign([],d.j),b.l=Object.assign([],d.l),b.v=Object.assign([],d.v),b.i=Object.assign([],e.i,d.i),d=b.u.x,e=b.u.y,g=new z(g,!1),l=new z(l,!1),wa(g,d,e),wa(l,d,e),b.g=g,b.h=Ea(l,k),Ga(b))}else b=\nd;else b=null;k=a.g.K;if(b&&!b.N(k)||c)k=Aa(b),c&&(k.adView.reasons=k.adView.reasons||[c]),c=a.h,'audio'!=c.g.h&&Ya(c,L(c,'geometryChange','native',k)),a.g.K=b};function tb(){var a;this.g=a=void 0===a?omidGlobal:a}tb.prototype.setInterval=function(a,b){return ub(this,'setInterval')(a,b)};tb.prototype.clearInterval=function(a){ub(this,'clearInterval')(a)};function vb(a,b){ub(a,'clearTimeout')(b)}function ub(a,b){return a.g&&a.g[b]?a.g[b]:wb(a,b)}\nfunction xb(a,b,c,d){if(a.g.document&&a.g.document.body){var e=a.g.document.createElement('img');e.width=1;e.height=1;e.style.display='none';e.src=b;c&&e.addEventListener('load',function(){return c()});d&&e.addEventListener('error',function(){return d()});a.g.document.body.appendChild(e)}else wb(a,'sendUrl')(b,c,d)}function wb(a,b){if(a.g&&a.g.omidNative&&a.g.omidNative[b])return a.g.omidNative[b].bind(a.g.omidNative);throw Error('Native interface method \"'+b+'\" not found.');};function N(a){return'object'===typeof a}function O(a){return'number'===typeof a&&!isNaN(a)&&0<=a}function P(a){return'string'===typeof a}function Q(a,b){return P(a)&&-1!==Object.values(b).indexOf(a)}function yb(a){return!(!a||!a.tagName||'iframe'!==a.tagName.toLowerCase())};function S(a,b,c,d,e){this.j=a;this.ba=b;this.L=c;this.i=d;this.P=e;this.h=null;this.g=this.m=this.D=void 0;this.O=!0;this.J=void 0;zb(this)}\nfunction zb(a){if(!a.h){var b;a:{if((b=a.j.document)&&b.getElementsByClassName&&(b=b.getElementsByClassName('omid-element'))){if(1==b.length){b=b[0];break a}1<b.length&&a.O&&(db(a.L,'generic',\"More than one element with 'omid-element' class name.\"),a.O=!1)}b=null}if(b&&b.tagName&&'video'===b.tagName.toLowerCase())a.i.j=b;else if(b&&b.tagName)a.i.i=b;else return;Ab(a)}}function Ab(a){a.i.j?(a.h=a.i.j,a.o()):a.i.i&&(a.h=a.i.i,yb(a.h)?a.i.s&&a.o():a.o())}\nfunction Bb(a){a.g&&(yb(a.h)?a.i.s&&(a.K(),Cb(a)):(a.K(),Cb(a)))}S.prototype.A=function(){this.J&&(this.j.document.removeEventListener('visibilitychange',this.J),this.J=void 0)};S.prototype.o=function(){};function Cb(a){a.D&&(a.i.P=a.D,M(a.ba,'creative'))}function Db(a){if(a.g&&a.i.s){var b=new z(a.i.s,!1);wa(b,a.g.x,a.g.y);b.clipsToBounds=!0;return b}};function T(a,b,c,d,e,f){S.call(this,a,c,d,e,f);this.s=b;this.l=void 0}v(T,S);T.prototype.A=function(){void 0!==this.l&&(this.P.clearInterval(this.l),this.l=void 0);S.prototype.A.call(this)};T.prototype.o=function(){var a=this;S.prototype.o.call(this);null==this.h?this.l=void 0:void 0===this.l&&(this.l=this.P.setInterval(function(){return Eb(a)},200),Eb(this))};\nT.prototype.K=function(){if(this.m){var a=Db(this);if(a){this.g.isCreative=!1;a.isCreative=!0;for(var b=!1,c=0;c<this.g.childViews.length;c++)if(this.g.childViews[c].isCreative){this.g.childViews[c]=a;b=!0;break}b||this.g.childViews.push(a)}else this.g.isCreative=!0;this.D=Ka(this.s,this.m,this.i.A,this.i.adSessionId,this.I())}};T.prototype.I=function(){return!0};\nfunction Eb(a){if(void 0!==a.l){b:{try{var b=a.j.top;var c=0<=b.innerHeight&&0<=b.innerWidth;break b}catch(d){}c=!1}c?(c=a.j.top,c=new z(new Pa(c.innerWidth,c.innerHeight),!1)):c=new z(new Pa(0,0),!1);b=a.h.getBoundingClientRect();if(null==b.x||isNaN(b.x))b.x=b.left;if(null==b.y||isNaN(b.y))b.y=b.top;b=new z(b,!1);c.N(a.m)&&b.N(a.g)||(a.g=b,a.g.clipsToBounds=!0,a.m=c,a.m.childViews.push(a.g),Bb(a))}};function U(a,b,c,d,e,f){S.call(this,a,c,d,e,f);this.v=this.s=this.u=this.l=void 0;this.M=!1;this.C=void 0}v(U,S);U.prototype.A=function(){this.l&&this.l.disconnect();Fb(this);S.prototype.A.call(this)};U.prototype.o=function(){S.prototype.o.call(this);if(this.h&&(this.l||(this.l=Gb(this)),Hb(this),Ib(this.h)&&Jb(this),'backgrounded'===this.i.A)){var a=Kb(new Pa(0,0));this.C=this.g=this.m=a;Bb(this)}};\nU.prototype.K=function(){if(this.g&&this.C){var a=Db(this);if(a){var b=a;var c=this.C;var d=Math.max(a.x,c.x);var e=Math.max(a.y,c.y),f=Math.min(a.endX,c.endX);a=Math.min(a.endY,c.endY);f<=d||a<=e?d=null:(c={},d=new z((c.x=d,c.y=e,c.width=Math.abs(f-d),c.height=Math.abs(a-e),c),!1));d||(d=new z({x:0,y:0,width:0,height:0},!1))}else b=this.g,d=this.C;e=new H;this.m&&Ca(e,this.m);e.g=b;e.h=d;Ga(e);this.M?D(e.g)?I(e,'hidden'):100===e.A||I(e,'clipped'):I(e,'viewport');this.D=e}};U.prototype.I=function(){return!0};\nfunction Fb(a){a.u&&(a.u.disconnect(),a.u=void 0);a.s&&(a.s.disconnect(),a.s=void 0);a.v&&((0,a.j.removeEventListener)('resize',a.v),a.v=void 0)}function Hb(a){a.l&&a.h&&(a.l.unobserve(a.h),a.l.observe(a.h))}function Ib(a){a=a.getBoundingClientRect();return 0==a.width||0==a.height}\nfunction Gb(a){return new a.j.IntersectionObserver(function(b){try{if(b.length){for(var c,d=b[0],e=1;e<b.length;e++)b[e].time>d.time&&(d=b[e]);c=d;a.m=Kb(c.rootBounds);a.g=Kb(c.boundingClientRect);a.C=Kb(c.intersectionRect);a.M=!!c.isIntersecting;Bb(a)}}catch(f){a.A(),db(a.L,'generic','Problem handling IntersectionObserver callback: '+f.message)}},{root:null,rootMargin:'0px',threshold:[0,.1,.2,.3,.4,.5,.6,.7,.8,.9,1]})}\nfunction Jb(a){a.j.ResizeObserver?a.u||(a.u=Lb(a,function(){return Mb(a)}),a.u.observe(a.h)):(a.v||(a.v=function(){return Mb(a)},(0,a.j.addEventListener)('resize',a.v)),a.s||(a.s=new MutationObserver(function(){return Mb(a)}),a.s.observe(a.h,{childList:!1,attributes:!0,subtree:!1})))}function Mb(a){a.h&&!Ib(a.h)&&(Hb(a),Fb(a))}function Lb(a,b){return new a.j.ResizeObserver(b)}function Kb(a){if(a&&null!==a.x&&null!==a.y&&null!==a.width&&null!==a.height)return new z(a,!1)};function Nb(a){if('object'===typeof a&&'object'===typeof a.webOSSystem)return a.webOSSystem}function Ob(a){if('object'===typeof a&&'object'===typeof a.tizen)return a.tizen}function Pb(a){return'object'===typeof Ob(a)};function Qb(a,b){this.h=a;this.g=b};function Sb(){return'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g,function(a){var b=16*Math.random()|0;return'y'===a?(b&3|8).toString(16):b.toString(16)})};function Tb(a,b){var c=void 0===c?J:c;this.j=a;this.g=c;this.i=b;this.h=[]}\nfunction Ub(a){if(!a.g||!a.g.document)throw Error('OMID Service Script is not running within a window.');var b=a.h;a.h=[];b.forEach(function(c){try{var d=a.i.I?'limited':'full',e=Q(c.accessMode,ra)?c.accessMode:null;var f=e?'full'==e&&'limited'==d?d:'domain'==e?'limited':e:d;c.accessMode=f;a:{var h=c.resourceUrl,k=a.g.location.origin;try{var g=new URL(h,k);break a}catch(F){}try{g=new URL(h);break a}catch(F){}g=null}if(d=g){var l=Sb();Vb(a,l,d,f);var m=c.vendorKey,r=c.verificationParameters;m=void 0===\nm?'':m;r=void 0===r?'':r;m&&'string'===typeof m&&''!==m&&r&&'string'===typeof r&&''!==r&&(a.j.o[m]=r);a.i.v.set(l,c)}}catch(F){Ua('OMID verification script '+c.resourceUrl+' failed to load: '+F)}})}\nfunction Vb(a,b,c,d){var e=a.g.document,f=e.createElement('iframe');f.id='omid-verification-script-frame-'+b;f.style.display='none';if('full'==d){var h=function(){var k=f.contentWindow;k.omidVerificationProperties={serviceWindow:a.g,injectionSource:'app',injectionId:b};k=k.document;var g=k.createElement('script');g.src=c.href;k.head.appendChild(g);f.removeEventListener('load',h)};f.addEventListener('load',h)}else'limited'==d&&(f.srcdoc=\"<html><head>\\n<script type=\\\"text/javascript\\\">window['omidVerificationProperties'] = {\\n'serviceWindow': window.parent,\\n'injectionSource': 'app',\\n'injectionId': '\"+\n(b+'\\',\\n};\\x3c/script>\\n<script type=\"text/javascript\" src=\"')+c.href+'\">\\x3c/script>\\n</head><body></body></html>',f.sandbox='allow-scripts');e.body.appendChild(f);Na().h.set(b,f)};function Wb(a,b,c,d,e,f){var h=this;this.g=a;this.h=b;this.j=c;this.i=d;this.l=e;this.s=f;this.m=!1;Xb(this,function(k){if('sessionStart'===k.type){h.m=!0;try{Ub(h.l)}catch(g){K(g.message)}}'sessionFinish'===k.type&&(h.m=!1)})}function Xb(a,b,c,d){ab(a.h,b,c,d)}n=Wb.prototype;n.setSlotElement=function(a){a&&a.tagName?(this.g.i=a,this.i&&Ab(this.i)):K('setSlotElement called with a non-HTMLElement.  It will be ignored.')};n.setElementBounds=function(a){this.g.s=a;this.i&&Ab(this.i);this.i&&Bb(this.i)};\nn.error=function(a,b){db(this.h,a,b)};n.injectVerificationScriptResources=function(a){var b=this.l;b.h.push.apply(b.h,q(a));if(this.m)try{Ub(this.l)}catch(c){K(c.message)}};n.setCreativeType=function(a,b){b=void 0===b?null:b;if(!this.g.g||this.g.h)this.g.h=a,'video'==a||'audio'==a?this.g.g='video':'htmlDisplay'==a||'nativeDisplay'==a?this.g.g='display':'definedByJavaScript'==a&&b&&(this.g.g='none'==b?'display':'video')};n.setImpressionType=function(a){if(!this.g.g||this.g.h)this.g.l=a};\nn.setClientInfo=function(a,b,c){var d=this.g.m||{};d.omidJsInfo=Object.assign({},d.omidJsInfo,{sessionClientVersion:a,partnerName:b,partnerVersion:c});this.g.m=d;return this.g.m.omidJsInfo.serviceVersion};function Yb(a,b){if(!b)return a.g;for(var c=p(a.h.values()),d=c.next();!d.done;d=c.next())if(d=d.value,d.g.v.has(b))return d;return a.g}function V(a,b){return null==b?a.g:a.h.get(b)||a.g}function Zb(a){var b=new Qa,c=new Va(b),d=new Ia,e=new Ja,f=new sb(c,e,b);a=a.i;var h=omidGlobal;d=h?h.IntersectionObserver&&(h.MutationObserver||h.ResizeObserver)?new U(h,d,f,c,b,a):new T(h,e,f,c,b,a):null;return new Wb(b,c,f,d,new Tb(c,b),new Qb(c,b))};function $b(a){return a&&N(a)?Object.entries(a).reduce(function(b,c){var d=p(c);c=d.next().value;d=d.next().value;return b&&P(c)&&null!=d&&N(d)&&P(d.resourceUrl)},!0):!1};function W(a,b,c,d){this.h=a;this.method=b;this.version=c;this.g=d}function ac(a){return!!a&&void 0!==a.omid_message_guid&&void 0!==a.omid_message_method&&void 0!==a.omid_message_version&&'string'===typeof a.omid_message_guid&&'string'===typeof a.omid_message_method&&'string'===typeof a.omid_message_version&&(void 0===a.omid_message_args||void 0!==a.omid_message_args)}function bc(a){return new W(a.omid_message_guid,a.omid_message_method,a.omid_message_version,a.omid_message_args)}\nfunction cc(a){var b={};b=(b.omid_message_guid=a.h,b.omid_message_method=a.method,b.omid_message_version=a.version,b);void 0!==a.g&&(b.omid_message_args=a.g);return b};function dc(a){this.i=a};function X(a){this.i=a;this.handleExportedMessage=X.prototype.j.bind(this)}v(X,dc);X.prototype.h=function(a,b){b=void 0===b?this.i:b;if(!b)throw Error('Message destination must be defined at construction time or when sending the message.');b.handleExportedMessage(cc(a),this)};X.prototype.j=function(a,b){ac(a)&&this.g&&this.g(bc(a),b)};function ec(a){return fc(a,'SessionService.')}function fc(a,b){return(a=a.match(new RegExp('^'+b+'(.*)')))&&a[1]};function gc(a,b){this.i=b=void 0===b?J:b;var c=this;a.addEventListener('message',function(d){if('object'===typeof d.data){var e=d.data;ac(e)&&d.source&&c.g&&c.g(bc(e),d.source)}})}v(gc,dc);gc.prototype.h=function(a,b){b=void 0===b?this.i:b;if(!b)throw Error('Message destination must be defined at construction time or when sending the message.');b.postMessage(cc(a),'*')};function hc(a,b){b=void 0===b?{}:b;var c=J.webkit?J.webkit.messageHandlers.omidJsSessionService:J.omidJsSessionService;if(!c)return!1;c.postMessage(JSON.stringify({method:a,data:b}));return!0};function ic(){this.g=jc}n=ic.prototype;n.registerSessionObserver=function(a,b){Xb(V(this.g,a),b)};n.setSlotElement=function(a,b){V(this.g,a).setSlotElement(b)};n.setElementBounds=function(a,b){V(this.g,a).setElementBounds(b)};\nfunction kc(a,b,c,d,e){e=void 0===e?null:e;a=V(a.g,b);var f=a.g.m;f.sessionOwner||(f.sessionOwner=d?'native':'javascript');d?(b=b||Sb(),a.g.adSessionId=b,c.canMeasureVisibility=a.i.I(),Ra(a.g,c),eb(a.h,e),a.i&&zb(a.i)):b?(Ra(a.g,c),hc('startSession',{adSessionId:b})||K('On App, the native-layer JS Session Service must be initialized before starting an ad session using the JS API.')):K('Session client must be updated to start an App session from JS.')}\nfunction lc(a,b,c){c?(b=V(a.g,b),a=a.g,a.g=Zb(a),jb(b.h),b.i.A(),b.o&&(b.o.stop(),b.o=null)):b?hc('finishSession',{adSessionId:b})||K('On App, the native-layer JS Session Service must be initialized before finishing an ad session using the JS API.'):K('Session client must be updated to finish an App session from JS.')}n.error=function(a,b,c){V(this.g,a).error(b,c)};\nfunction Y(a,b,c,d){a=V(a.g,b);'impression'==c?rb(a.h,'javascript')&&(kb(a.h,'javascript'),a.i&&zb(a.i)):('loaded'==c?(d=void 0===d?null:d,pb(a.h,'javascript')&&lb(a.h,'javascript',d)):pb(a.h,'javascript')&&mb(a.h,c,'javascript',d),['loaded','start'].includes(c)&&a.i&&zb(a.i))}n.injectVerificationScriptResources=function(a,b){V(this.g,a).injectVerificationScriptResources(b)};n.setCreativeType=function(a,b,c){c=void 0===c?null:c;V(this.g,a).setCreativeType(b,c)};\nn.setImpressionType=function(a,b){V(this.g,a).setImpressionType(b)};n.setClientInfo=function(a,b,c,d){var e=this.g;if(null==a)a=e.g;else{var f=[].concat(q(e.h.values())).includes(e.g)?Zb(e):e.g;e.h.set(a,f);a=f}return a.setClientInfo(b,c,d)};function mc(a){a=a.split('-')[0].split('.');for(var b=['1','0','3'],c=0;3>c;c++){var d=parseInt(a[c],10),e=parseInt(b[c],10);if(d>e)break;else if(d<e)return!1}return!0};function nc(a,b){return/\\d+\\.\\d+\\.\\d+(-.*)?/.test(a)&&mc(a)?b:JSON.stringify(b)}function oc(a,b){return/\\d+\\.\\d+\\.\\d+(-.*)?/.test(a)&&mc(a)?b?b:[]:b&&'string'===typeof b?JSON.parse(b):[]};function pc(){var a=qc;var b=void 0===b?omidGlobal:b;this.g=a;this.h=b;this.j=new X;this.h.omid=this.h.omid||{};this.h.omid.v1_SessionServiceCommunication=this.j;this.i=b&&b.addEventListener&&b.postMessage?new gc(b):null;this.j.g=this.m.bind(this);this.i&&(this.i.g=this.l.bind(this))}pc.prototype.m=function(a,b){null!=ec(a.method)&&rc(this,a,b,this.j)};pc.prototype.l=function(a,b){null!=ec(a.method)&&rc(this,a,b,this.i)};\nfunction rc(a,b,c,d){function e(){var g=new W(f,'response',k,nc(k,w.apply(0,arguments)));d.h(g,c)}var f=b.h,h=b.method,k=b.version;b=oc(k,b.g);try{sc(a,h,e,b)}catch(g){d.h(new W(f,'error',k,'\\n        name: '+g.name+'\\n        message: '+g.message+'\\n        filename: '+g.filename+'\\n        lineNumber: '+g.lineNumber+'\\n        columnNumber: '+g.columnNumber+'\\n        stack: '+g.stack+'\\n        toString(): '+g.toString()),c)}}\nfunction sc(a,b,c,d){if(null!=ec(b))switch(ec(b)){case 'registerAdEvents':c=p(d).next().value;qb(V(a.g.g,c).h,'javascript');break;case 'registerMediaEvents':c=p(d).next().value;ob(V(a.g.g,c).h,'javascript');break;case 'registerSessionObserver':var e=p(d).next().value;a.g.registerSessionObserver(e,c);break;case 'setSlotElement':e=p(d);c=e.next().value;e=e.next().value;a.g.setSlotElement(e,c);break;case 'setVideoElement':e=p(d);c=e.next().value;e=e.next().value;a=V(a.g.g,e);c&&c.tagName&&'video'===\nc.tagName.toLowerCase()?(a.g.j=c,a.i&&Ab(a.i)):K('setVideoElement called with a non-HTMLVideoElement. It will be ignored.');break;case 'setElementBounds':e=p(d);c=e.next().value;e=e.next().value;a.g.setElementBounds(e,c);break;case 'startSession':c=p(d);d=c.next().value;c=c.next().value;b=a.h;if(null!=d&&N(d)){var f=d.customReferenceData,h=d.underEvaluation,k=d.universalAdId;P(f)||(f=void 0);'boolean'===typeof h||(h=!1);d={customReferenceData:f,underEvaluation:h};P(k)&&(d.universalAdId=k);if('object'===\ntypeof Nb(b)){var g=Nb(b),l;'object'===typeof g&&(l=g.identifier);d.app={appId:l&&'string'===typeof l?l:void 0};b:if(g=Nb(b),'object'===typeof g){try{e=JSON.parse(g.deviceInfo)}catch(F){e=void 0;break b}e={deviceType:e.modelName||'Unknown',osVersion:e.platformVersion||'Unknown',os:'webOS'}}else e=void 0;d.deviceInfo=e;d.deviceCategory='ctv'}else if(Pb(b)){b:{if(Pb(b)){try{var m=Ob(b).application.getCurrentApplication().appInfo.id}catch(F){e=void 0;break b}if('string'===typeof m){e=m;break b}}e=void 0}d.app=\n{appId:e};if(Pb(b)){e=Ob(b).systeminfo;if('object'===typeof e&&'function'===typeof e.getCapability){g=e.getCapability('http://tizen.org/system/model_name');var r=e.getCapability('http://tizen.org/feature/platform.version')}e={deviceType:g||'Unknown',osVersion:r||'Unknown',os:'tizen'}}else e=void 0;d.deviceInfo=e;Pb(b)&&'object'===typeof Ob(b).tvinputdevice&&(d.deviceCategory='ctv')}}else d=null;if(null==d)break;kc(a.g,c,d,!1);break;case 'finishSession':c=p(d).next().value;lc(a.g,c,!1);break;case 'impressionOccurred':c=\np(d).next().value;Y(a.g,c,'impression');break;case 'loaded':e=p(d);c=e.next().value;e=e.next().value;c?(g={skippable:c.isSkippable,autoPlay:c.isAutoPlay,position:c.position},c.isSkippable&&(g.skipOffset=c.skipOffset),Y(a.g,e,'loaded',g)):Y(a.g,e,'loaded');break;case 'start':g=p(d);c=g.next().value;e=g.next().value;g=g.next().value;Y(a.g,g,'start',{duration:c,mediaPlayerVolume:e});break;case 'firstQuartile':c=p(d).next().value;Y(a.g,c,'firstQuartile');break;case 'midpoint':c=p(d).next().value;Y(a.g,\nc,'midpoint');break;case 'thirdQuartile':c=p(d).next().value;Y(a.g,c,'thirdQuartile');break;case 'complete':c=p(d).next().value;Y(a.g,c,'complete');break;case 'pause':c=p(d).next().value;Y(a.g,c,'pause');break;case 'resume':c=p(d).next().value;Y(a.g,c,'resume');break;case 'bufferStart':c=p(d).next().value;Y(a.g,c,'bufferStart');break;case 'bufferFinish':c=p(d).next().value;Y(a.g,c,'bufferFinish');break;case 'skipped':c=p(d).next().value;Y(a.g,c,'skipped');break;case 'volumeChange':e=p(d);c=e.next().value;\ne=e.next().value;Y(a.g,e,'volumeChange',{mediaPlayerVolume:c});break;case 'playerStateChange':e=p(d);c=e.next().value;e=e.next().value;Y(a.g,e,'playerStateChange',{state:c});break;case 'adUserInteraction':e=p(d);c=e.next().value;e=e.next().value;Y(a.g,e,'adUserInteraction',{interactionType:c});break;case 'setClientInfo':l=p(d);e=l.next().value;g=l.next().value;r=l.next().value;l=l.next().value;a=a.g.setClientInfo(l,e,g,r);c(a);break;case 'injectVerificationScriptResources':e=p(d);c=e.next().value;\ne=e.next().value;a.g.injectVerificationScriptResources(e,c);break;case 'setCreativeType':e=p(d);c=e.next().value;e=e.next().value;a.g.setCreativeType(e,c);break;case 'setImpressionType':e=p(d);c=e.next().value;e=e.next().value;a.g.setImpressionType(e,c);break;case 'setContentUrl':e=p(d);c=e.next().value;e=e.next().value;V(a.g.g,e).g.C=c;break;case 'sessionError':g=p(d),c=g.next().value,e=g.next().value,g=g.next().value,a.g.error(g,c,e)}};function Z(){this.g=qc}n=Z.prototype;\nn.da=function(a,b){if(!(!(a&&N(a)&&Q(a.impressionOwner,qa))||'videoEventsOwner'in a&&null!=a.videoEventsOwner&&!Q(a.videoEventsOwner,qa)||'mediaEventsOwner'in a&&null!=a.mediaEventsOwner&&!Q(a.mediaEventsOwner,qa))){b=V(this.g.g,b);if(a.creativeType&&a.impressionType){var c=a.mediaEventsOwner;null==b.g.h&&b.setCreativeType(a.creativeType,c);null==b.g.l&&(b.g.l=a.impressionType);ob(b.h,c)}else c=a.videoEventsOwner,b.g.g=null==c||'none'===c?'display':'video',b.g.h=null,b.g.l=null,ob(b.h,c);qb(b.h,a.impressionOwner);\na&&null!=a.isolateVerificationScripts&&'boolean'===typeof a.isolateVerificationScripts&&(b.g.I=a.isolateVerificationScripts)}};\nn.aa=function(a,b,c,d){b&&'string'===typeof b.adSessionType&&(b.adSessionType=b.adSessionType.toLowerCase());var e;if(N(b)){if(e=Q(b.environment,ua)&&Q(b.adSessionType,pa))e=b.omidNativeInfo,e=N(e)?P(e.partnerName)&&P(e.partnerVersion):!1;e&&(e=b.app,e=N(e)?P(e.libraryVersion)&&P(e.appId):!1)}else e=!1;if(e){if($b(d)){e=p(Object.values(d));for(var f=e.next();!f.done;f=e.next())f.value.accessMode='limited';V(this.g.g,a).g.v=new Map(Object.entries(d))}kc(this.g,a,b,!0,c)}else K('Native ad session context invalid; session not started.')};\nn.W=function(a){lc(this.g,a,!0)};n.$=function(a,b){N(a)&&O(a.x)&&O(a.y)&&O(a.width)&&O(a.height)&&(b=V(this.g.g,b),b.g.L=a,M(b.j,'container'))};n.ha=function(a,b){Q(a,sa)&&(b=V(this.g.g,b),b.g.A=a,'backgrounded'===a?M(b.j,'container','backgrounded'):M(b.j,'container'))};n.Y=function(a,b){Q(a,ta)&&(b=V(this.g.g,b),b.g.M=a,'locked'===a?M(b.j,'container','deviceLocked'):M(b.j,'container'))};n.ea=function(a){'impression'===a&&this.T()};n.T=function(a){a=V(this.g.g,a);rb(a.h,'native')&&kb(a.h,'native')};\nn.X=function(a,b){this.S('loaded',void 0===a?null:a,b)};n.error=function(a,b,c){Q(a,oa)&&this.g.error(c,a,b)};n.fa=function(a,b,c){this.S(a,b,c)};n.S=function(a,b,c){Q(a,y)&&(void 0===b||N(b))&&(c=V(this.g.g,c),pb(c.h,'native')&&('loaded'==a?lb(c.h,'native',b):mb(c.h,a,'native',b)))};n.Z=function(a,b){b=V(this.g.g,b);'none'===b.h.g.o||'number'!==typeof a||isNaN(a)||(b.g.D=a,a=b.s,b=a.g.J,null!=b&&mb(a.h,'volumeChange','native',{mediaPlayerVolume:b,deviceVolume:a.g.D}))};\nn.ga=function(a){if(a&&N(a)&&O(a.timestamp)){var b=Na(),c=(b.g||{}).timestamp;if(!c||c<a.timestamp)b.g=a}};Z.prototype.startSession=Z.prototype.aa;Z.prototype.error=Z.prototype.error;Z.prototype.finishSession=Z.prototype.W;Z.prototype.publishAdEvent=Z.prototype.ea;Z.prototype.publishImpressionEvent=Z.prototype.T;Z.prototype.publishVideoEvent=Z.prototype.fa;Z.prototype.publishMediaEvent=Z.prototype.S;Z.prototype.publishLoadedEvent=Z.prototype.X;Z.prototype.setNativeViewHierarchy=Z.prototype.$;\nZ.prototype.setState=Z.prototype.ha;Z.prototype.setDeviceLockState=Z.prototype.Y;Z.prototype.setDeviceVolume=Z.prototype.Z;Z.prototype.init=Z.prototype.da;Z.prototype.setLastActivity=Z.prototype.ga;function tc(){var a=jc,b=uc,c=this;var d=void 0===d?J:d;this.j=a;this.g=b;this.l={};this.m={};this.i=new X;d.omid=d.omid||{};d.omid.v1_VerificationServiceCommunication=this.i;this.h=null;d&&d.addEventListener&&d.postMessage&&(this.h=new gc(d));this.i.g=function(e,f){vc(c,e,f,c.i)};this.h&&(this.h.g=function(e,f){c.h&&vc(c,e,f,c.h)})}function wc(a,b,c,d){a=Yb(a.j,d).h;'media'===b||'video'===b?$a(a,c,d):(c={type:b,R:d,G:c},a.j.push(c),Za(a,b,c))}function xc(a,b,c,d){a=Yb(a.j,d);Xb(a,b,c,d)}\nfunction yc(a,b,c,d){xb(a.g,b,c,d)}tc.prototype.setInterval=function(a,b){return this.g.setInterval(a,b)};tc.prototype.clearInterval=function(a){this.g.clearInterval(a)};function zc(a,b,c,d){wb(a.g,'downloadJavaScriptResource')(b,c,d)}\nfunction vc(a,b,c,d){function e(){var B=new W(f,'response',k,nc(k,w.apply(0,arguments)));d.h(B,c)}var f=b.h,h=b.method,k=b.version;b=oc(k,b.g);if(null!=fc(h,'VerificationService.')){h=fc(h,'VerificationService.');try{switch(h){case 'addEventListener':var g=p(b),l=g.next().value,m=g.next().value||Ac(c);wc(a,l,e,m);break;case 'addSessionListener':var r=p(b),F=r.next().value,ba=r.next().value||Ac(c);xc(a,e,F,ba);break;case 'sendUrl':var R=p(b).next().value;yc(a,R,function(){return e(!0)},function(){return e(!1)});\nbreak;case 'setTimeout':var G=p(b),Ec=G.next().value,Fc=G.next().value;a.l[Ec]=ub(a.g,'setTimeout')(e,Fc);break;case 'clearTimeout':var Gc=p(b).next().value;vb(a.g,a.l[Gc]);break;case 'setInterval':var Rb=p(b),Hc=Rb.next().value,Ic=Rb.next().value;a.m[Hc]=a.setInterval(e,Ic);break;case 'clearInterval':var Jc=p(b).next().value;a.clearInterval(a.m[Jc]);break;case 'injectJavaScriptResource':var Kc=p(b).next().value;zc(a,Kc,function(B){return e(!0,B)},function(){return e(!1)});break;case 'getVersion':e('1.5.5-iab77')}}catch(B){d.h(new W(f,\n'error',k,'\\n              name: '+B.name+'\\n              message: '+B.message+'\\n              filename: '+B.filename+'\\n              lineNumber: '+B.lineNumber+'\\n              columnNumber: '+B.columnNumber+'\\n              stack: '+B.stack+'\\n              toString(): '+B.toString()+'\\n          '),c)}}}\nfunction Ac(a){for(var b=Na().h,c=p(b.keys()),d=c.next();!d.done;d=c.next()){d=d.value;var e=b.get(d);if(e){if(e.contentWindow===a)return d;try{if(e.contentWindow.Object.prototype.isPrototypeOf(a))return d}catch(f){}}}};function Bc(a){var b={};return(b.app='omid_v1_present_app',b.web='omid_v1_present_web',b)[a]}function Cc(a,b){a.document.write('<iframe style=\"display:none\" id=\"'+(b+'\" name=\"'+b+'\" sandbox></iframe>'))}function Dc(a,b){var c=a.document.createElement('iframe');c.id=b;c.name=b;c.style.display='none';c.sandbox='';a.document.body.appendChild(c)}\nfunction Lc(a,b){var c=new MutationObserver(function(d){d.forEach(function(e){'BODY'===e.addedNodes[0].nodeName&&(e=Bc(b),Dc(a,'omid_v1_present'),Dc(a,e),c.disconnect())})});c.observe(a.document.documentElement,{childList:!0})};var uc=new tb,jc=new function(){this.i=uc;this.h=new Map;this.g=Zb(this)},qc=new ic;new tc;J.omidBridge=new Z;new pc;(function(a,b){a.frames&&a.document&&!['omid_v1_present','omid_v1_present_web','omid_v1_present_app'].some(function(c){return!!a.frames[c]})&&(null==a.document.body&&'MutationObserver'in a?Lc(a,b):(b=Bc(b),a.document.body?(Dc(a,'omid_v1_present'),Dc(a,b)):(Cc(a,'omid_v1_present'),Cc(a,b))))})(J,'app');\n}).call(this, this);";
                                                } else {
                                                    strA2 = new Sa(contextD, "omid_js_store").a("omid_js_string");
                                                    if (strA2 == null) {
                                                        strA2 = null;
                                                    }
                                                    if (strA2 == null) {
                                                        strA2 = ";(function(omidGlobal) {\n  var n;function aa(a){var b=0;return function(){return b<a.length?{done:!1,value:a[b++]}:{done:!0}}}function p(a){var b='undefined'!=typeof Symbol&&Symbol.iterator&&a[Symbol.iterator];if(b)return b.call(a);if('number'==typeof a.length)return{next:aa(a)};throw Error(String(a)+' is not an iterable or ArrayLike');}function q(a){if(!(a instanceof Array)){a=p(a);for(var b,c=[];!(b=a.next()).done;)c.push(b.value);a=c}return a}\nvar ca='function'==typeof Object.create?Object.create:function(a){function b(){}b.prototype=a;return new b},t='function'==typeof Object.defineProperties?Object.defineProperty:function(a,b,c){if(a==Array.prototype||a==Object.prototype)return a;a[b]=c.value;return a};\nfunction da(a){a=['object'==typeof globalThis&&globalThis,a,'object'==typeof window&&window,'object'==typeof self&&self,'object'==typeof global&&global];for(var b=0;b<a.length;++b){var c=a[b];if(c&&c.Math==Math)return c}throw Error('Cannot find global object');}var ea=da(this);function u(a,b){if(b)a:{var c=ea;a=a.split('.');for(var d=0;d<a.length-1;d++){var e=a[d];if(!(e in c))break a;c=c[e]}a=a[a.length-1];d=c[a];b=b(d);b!=d&&null!=b&&t(c,a,{configurable:!0,writable:!0,value:b})}}var fa;\nif('function'==typeof Object.setPrototypeOf)fa=Object.setPrototypeOf;else{var ha;a:{var ia={a:!0},ja={};try{ja.__proto__=ia;ha=ja.a;break a}catch(a){}ha=!1}fa=ha?function(a,b){a.__proto__=b;if(a.__proto__!==b)throw new TypeError(a+' is not extensible');return a}:null}var ka=fa;\nfunction v(a,b){a.prototype=ca(b.prototype);a.prototype.constructor=a;if(ka)ka(a,b);else for(var c in b)if('prototype'!=c)if(Object.defineProperties){var d=Object.getOwnPropertyDescriptor(b,c);d&&Object.defineProperty(a,c,d)}else a[c]=b[c];a.La=b.prototype}function w(){for(var a=Number(this),b=[],c=a;c<arguments.length;c++)b[c-a]=arguments[c];return b}function x(a,b){return Object.prototype.hasOwnProperty.call(a,b)}\nvar la='function'==typeof Object.assign?Object.assign:function(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(d)for(var e in d)x(d,e)&&(a[e]=d[e])}return a};u('Object.assign',function(a){return a||la});\nu('Symbol',function(a){function b(f){if(this instanceof b)throw new TypeError('Symbol is not a constructor');return new c(d+(f||'')+'_'+e++,f)}function c(f,h){this.g=f;t(this,'description',{configurable:!0,writable:!0,value:h})}if(a)return a;c.prototype.toString=function(){return this.g};var d='jscomp_symbol_'+(1E9*Math.random()>>>0)+'_',e=0;return b});\nu('Symbol.iterator',function(a){if(a)return a;a=Symbol('Symbol.iterator');for(var b='Array Int8Array Uint8Array Uint8ClampedArray Int16Array Uint16Array Int32Array Uint32Array Float32Array Float64Array'.split(' '),c=0;c<b.length;c++){var d=ea[b[c]];'function'===typeof d&&'function'!=typeof d.prototype[a]&&t(d.prototype,a,{configurable:!0,writable:!0,value:function(){return ma(aa(this))}})}return a});function ma(a){a={next:a};a[Symbol.iterator]=function(){return this};return a}\nu('WeakMap',function(a){function b(g){this.g=(k+=Math.random()+1).toString();if(g){g=p(g);for(var l;!(l=g.next()).done;)l=l.value,this.set(l[0],l[1])}}function c(){}function d(g){var l=typeof g;return'object'===l&&null!==g||'function'===l}function e(g){if(!x(g,h)){var l=new c;t(g,h,{value:l})}}function f(g){var l=Object[g];l&&(Object[g]=function(m){if(m instanceof c)return m;Object.isExtensible(m)&&e(m);return l(m)})}if(function(){if(!a||!Object.seal)return!1;try{var g=Object.seal({}),l=Object.seal({}),\nm=new a([[g,2],[l,3]]);if(2!=m.get(g)||3!=m.get(l))return!1;m.delete(g);m.set(l,4);return!m.has(g)&&4==m.get(l)}catch(r){return!1}}())return a;var h='$jscomp_hidden_'+Math.random();f('freeze');f('preventExtensions');f('seal');var k=0;b.prototype.set=function(g,l){if(!d(g))throw Error('Invalid WeakMap key');e(g);if(!x(g,h))throw Error('WeakMap key fail: '+g);g[h][this.g]=l;return this};b.prototype.get=function(g){return d(g)&&x(g,h)?g[h][this.g]:void 0};b.prototype.has=function(g){return d(g)&&x(g,\nh)&&x(g[h],this.g)};b.prototype.delete=function(g){return d(g)&&x(g,h)&&x(g[h],this.g)?delete g[h][this.g]:!1};return b});\nu('Map',function(a){function b(){var k={};return k.H=k.next=k.head=k}function c(k,g){var l=k.g;return ma(function(){if(l){for(;l.head!=k.g;)l=l.H;for(;l.next!=l.head;)return l=l.next,{done:!1,value:g(l)};l=null}return{done:!0,value:void 0}})}function d(k,g){var l=g&&typeof g;'object'==l||'function'==l?f.has(g)?l=f.get(g):(l=''+ ++h,f.set(g,l)):l='p_'+g;var m=k.h[l];if(m&&x(k.h,l))for(k=0;k<m.length;k++){var r=m[k];if(g!==g&&r.key!==r.key||g===r.key)return{id:l,list:m,index:k,B:r}}return{id:l,list:m,\nindex:-1,B:void 0}}function e(k){this.h={};this.g=b();this.size=0;if(k){k=p(k);for(var g;!(g=k.next()).done;)g=g.value,this.set(g[0],g[1])}}if(function(){if(!a||'function'!=typeof a||!a.prototype.entries||'function'!=typeof Object.seal)return!1;try{var k=Object.seal({x:4}),g=new a(p([[k,'s']]));if('s'!=g.get(k)||1!=g.size||g.get({x:4})||g.set({x:4},'t')!=g||2!=g.size)return!1;var l=g.entries(),m=l.next();if(m.done||m.value[0]!=k||'s'!=m.value[1])return!1;m=l.next();return m.done||4!=m.value[0].x||\n't'!=m.value[1]||!l.next().done?!1:!0}catch(r){return!1}}())return a;var f=new WeakMap;e.prototype.set=function(k,g){k=0===k?0:k;var l=d(this,k);l.list||(l.list=this.h[l.id]=[]);l.B?l.B.value=g:(l.B={next:this.g,H:this.g.H,head:this.g,key:k,value:g},l.list.push(l.B),this.g.H.next=l.B,this.g.H=l.B,this.size++);return this};e.prototype.delete=function(k){k=d(this,k);return k.B&&k.list?(k.list.splice(k.index,1),k.list.length||delete this.h[k.id],k.B.H.next=k.B.next,k.B.next.H=k.B.H,k.B.head=null,this.size--,\n!0):!1};e.prototype.clear=function(){this.h={};this.g=this.g.H=b();this.size=0};e.prototype.has=function(k){return!!d(this,k).B};e.prototype.get=function(k){return(k=d(this,k).B)&&k.value};e.prototype.entries=function(){return c(this,function(k){return[k.key,k.value]})};e.prototype.keys=function(){return c(this,function(k){return k.key})};e.prototype.values=function(){return c(this,function(k){return k.value})};e.prototype.forEach=function(k,g){for(var l=this.entries(),m;!(m=l.next()).done;)m=m.value,\nk.call(g,m[1],m[0],this)};e.prototype[Symbol.iterator]=e.prototype.entries;var h=0;return e});u('Object.values',function(a){return a?a:function(b){var c=[],d;for(d in b)x(b,d)&&c.push(b[d]);return c}});function na(a,b){a instanceof String&&(a+='');var c=0,d=!1,e={next:function(){if(!d&&c<a.length){var f=c++;return{value:b(f,a[f]),done:!1}}d=!0;return{done:!0,value:void 0}}};e[Symbol.iterator]=function(){return e};return e}u('Array.prototype.keys',function(a){return a?a:function(){return na(this,function(b){return b})}});\nu('Set',function(a){function b(c){this.g=new Map;if(c){c=p(c);for(var d;!(d=c.next()).done;)this.add(d.value)}this.size=this.g.size}if(function(){if(!a||'function'!=typeof a||!a.prototype.entries||'function'!=typeof Object.seal)return!1;try{var c=Object.seal({x:4}),d=new a(p([c]));if(!d.has(c)||1!=d.size||d.add(c)!=d||1!=d.size||d.add({x:4})!=d||2!=d.size)return!1;var e=d.entries(),f=e.next();if(f.done||f.value[0]!=c||f.value[1]!=c)return!1;f=e.next();return f.done||f.value[0]==c||4!=f.value[0].x||\nf.value[1]!=f.value[0]?!1:e.next().done}catch(h){return!1}}())return a;b.prototype.add=function(c){c=0===c?0:c;this.g.set(c,c);this.size=this.g.size;return this};b.prototype.delete=function(c){c=this.g.delete(c);this.size=this.g.size;return c};b.prototype.clear=function(){this.g.clear();this.size=0};b.prototype.has=function(c){return this.g.has(c)};b.prototype.entries=function(){return this.g.entries()};b.prototype.values=function(){return this.g.values()};b.prototype.keys=b.prototype.values;b.prototype[Symbol.iterator]=\nb.prototype.values;b.prototype.forEach=function(c,d){var e=this;this.g.forEach(function(f){return c.call(d,f,f,e)})};return b});u('Object.is',function(a){return a?a:function(b,c){return b===c?0!==b||1/b===1/c:b!==b&&c!==c}});u('Array.prototype.includes',function(a){return a?a:function(b,c){var d=this;d instanceof String&&(d=String(d));var e=d.length;c=c||0;for(0>c&&(c=Math.max(c+e,0));c<e;c++){var f=d[c];if(f===b||Object.is(f,b))return!0}return!1}});\nu('String.prototype.includes',function(a){return a?a:function(b,c){if(null==this)throw new TypeError(\"The 'this' value for String.prototype.includes must not be null or undefined\");if(b instanceof RegExp)throw new TypeError('First argument to String.prototype.includes must not be a regular expression');return-1!==this.indexOf(b,c||0)}});u('Object.entries',function(a){return a?a:function(b){var c=[],d;for(d in b)x(b,d)&&c.push([d,b[d]]);return c}});\nu('Array.prototype.values',function(a){return a?a:function(){return na(this,function(b,c){return c})}});\nvar y={xa:'loaded',Fa:'start',ra:'firstQuartile',Aa:'midpoint',Ga:'thirdQuartile',pa:'complete',Ba:'pause',Da:'resume',oa:'bufferStart',na:'bufferFinish',Ea:'skipped',Ja:'volumeChange',Ca:'playerStateChange',ka:'adUserInteraction'},oa={ua:'generic',Ia:'video',za:'media'},pa={ca:'native',va:'html',V:'javascript'},qa={ca:'native',V:'javascript',NONE:'none'},ra={ta:'full',qa:'domain',wa:'limited'},sa={ma:'backgrounded',sa:'foregrounded'},ta={ya:'locked',Ha:'unlocked'},ua={la:'app',Ka:'web'};function z(a,b){this.x=null!=a.x?a.x:a.left;this.y=null!=a.y?a.y:a.top;this.width=a.width;this.height=a.height;this.endX=this.x+this.width;this.endY=this.y+this.height;this.adSessionId=a.adSessionId||void 0;this.isFriendlyObstructionFor=a.isFriendlyObstructionFor||[];this.h=a.friendlyObstructionClass||void 0;this.i=a.friendlyObstructionPurpose||void 0;this.j=a.friendlyObstructionReason||void 0;this.clipsToBounds=void 0!==a.clipsToBounds?!0===a.clipsToBounds:!0;this.m=void 0!==a.hasWindowFocus?!0===\na.hasWindowFocus:!0;this.notVisibleReason=a.notVisibleReason||void 0;this.noOutputDevice=a.noOutputDevice||void 0;this.isPipActive='true'===a.isPipActive||!0===a.isPipActive||!1;this.childViews=a.childViews||[];this.isCreative=a.isCreative||!1;this.g=b}function va(a){var b={};return b.width=a.width,b.height=a.height,b}function A(a){var b={};return Object.assign({},va(a),(b.x=a.x,b.y=a.y,b))}function C(a){var b=A(a),c={};return Object.assign({},b,(c.endX=a.endX,c.endY=a.endY,c))}\nfunction wa(a,b,c){a.x+=b;a.y+=c;a.endX+=b;a.endY+=c}z.prototype.N=function(a){if(null==a)return!1;a=A(a);var b=a.y,c=a.width,d=a.height;return this.x===a.x&&this.y===b&&this.width===c&&this.height===d};function xa(a){return a.width*a.height}function D(a){return 0===a.width||0===a.height};function ya(a,b){a=A(a);for(var c=[],d=[],e=0;e<b.length;e++){var f=A(b[e]);f=za(a,f);E(c,f.x);E(c,f.endX);E(d,f.y);E(d,f.endY)}c=c.sort(function(h,k){return h-k});d=d.sort(function(h,k){return h-k});return{ia:c,ja:d}}function za(a,b){return{x:Math.max(a.x,b.x),y:Math.max(a.y,b.y),endX:Math.min(a.x+a.width,b.x+b.width),endY:Math.min(a.y+a.height,b.y+b.height)}}function E(a,b){-1===a.indexOf(b)&&a.push(b)};function H(){this.h=this.g=this.D=this.u=this.m=this.s=void 0;this.A=0;this.l=[];this.v=[];this.C=0;this.o=[];this.j=[];this.i=[]}H.prototype.N=function(a){return null==a?!1:JSON.stringify(Aa(this))===JSON.stringify(Aa(a))};\nfunction Aa(a){var b=[],c=[],d={viewport:a.s,adView:{percentageInView:a.A,pixelsInView:a.C,reasons:a.i},declaredFriendlyObstructions:a.l.length};if(void 0!==a.g){d.adView.geometry=A(a.g);d.adView.geometry.pixels=xa(a.g);d.adView.onScreenGeometry=A(a.h);d.adView.onScreenGeometry.pixels=Ba(a);for(var e=0;e<a.j.length;e++)b.push(A(a.j[e]));for(e=0;e<a.v.length;e++){var f=a.v[e],h=f,k={};h.h&&(k.obstructionClass=h.h);h.i&&(k.obstructionPurpose=h.i);h.j&&(k.obstructionReason=h.j);f=za(a.g,f);c.push(Object.assign({},\n{x:f.x,y:f.y,width:f.endX-f.x,height:f.endY-f.y},k))}d.adView.onScreenGeometry.obstructions=b;d.adView.onScreenGeometry.friendlyObstructions=c;void 0!==a.u&&void 0!==a.D&&(d.adView.containerGeometry=A(a.u),d.adView.onScreenContainerGeometry=A(a.D),d.adView.measuringElement=!0)}return d}function Ca(a,b){b=va(b);a.s={};a.s.width=b.width;a.s.height=b.height;a.m={};a.m.x=0;a.m.y=0;a.m.width=b.width;a.m.height=b.height;a.m.endX=b.width;a.m.endY=b.height}\nfunction Da(){return{x:0,y:0,endX:0,endY:0,width:0,height:0}}function Ea(a,b){var c={};c.x=Math.max(a.x,b.x);c.y=Math.max(a.y,b.y);c.endX=Math.min(a.endX,b.endX);c.endY=Math.min(a.endY,b.endY);c.width=Math.max(0,c.endX-c.x);c.height=Math.max(0,c.endY-c.y);return c}function Fa(a,b){return.01<b.width-a.width||.01<b.height-a.height}function Ga(a){if(-1!==a.i.indexOf('backgrounded'))a.A=0,a.C=0;else{var b=xa(a.g);if(0!==b){var c=Ba(a);a.A=Math.round(c/b*100);a.C=c}}}\nfunction Ha(a,b){if(D(b)||!a.h)b=!1;else{var c=C(a.h),d=c.y,e=c.endX;a=c.endY;var f=b.endX;c=c.x;(f=f<c||.01>Math.abs(f-c))||(f=b.x,f=f>e||.01>Math.abs(f-e));(e=f)||(e=b.endY,e=e<d||.01>Math.abs(e-d));(d=e)||(b=b.y,d=b>a||.01>Math.abs(b-a));b=!d}return b}function I(a,b){for(var c=!1,d=0;d<a.i.length;d++)a.i[d]===b&&(c=!0);c||a.i.push(b)}\nfunction Ba(a){var b=Math,c=b.max,d=xa(a.h),e=a.j,f=0;if(0<e.length){var h=ya(a.h,e);a=h.ia;h=h.ja;for(var k=0;k<a.length-1;k++)for(var g=(a[k]+(a[k]+1))/2,l=a[k+1]-a[k],m=0;m<h.length-1;m++){for(var r=(h[m]+(h[m]+1))/2,F=h[m+1]-h[m],ba=!1,R=0;R<e.length;R++){var G=A(e[R]);if(G.x<g&&G.x+G.width>g&&G.y<r&&G.y+G.height>r){ba=!0;break}}ba&&(f+=Math.round(l)*Math.round(F))}}return c.call(b,0,d-f)};function Ia(){};function Ja(){}\nfunction Ka(a,b,c,d,e,f){var h=new H;b=new z(b,!1);Ca(h,b);La(a,b,h,d);if(!e)return h.i=['unmeasurable'],h.s=void 0,h.A=0,h.j=[],h.g&&(a=h.g,c={},a=new z((c.x=0,c.y=0,c.width=a.width,c.height=a.height,c),a.g),h.g=a),h.h=Da(),h;'locked'===f&&I(h,'deviceLocked');if(b.noOutputDevice)I(h,'backgrounded'),I(h,'noOutputDevice');else if('backgrounded'===c)I(h,'backgrounded');else if(void 0!==h.g){for(a=0;a<h.l.length;a++)Ha(h,h.l[a])&&h.v.push(h.l[a]);for(a=0;a<h.o.length;a++){if(c=Ha(h,h.o[a])){a:{c=h.o[a];\nfor(d=0;d<h.j.length;d++)if(h.j[d].N(c)){c=!0;break a}c=!1}c=!c}c&&(I(h,'obstructed'),h.j.push(h.o[a]))}Ga(h)}else I(h,'notFound');return h}\nfunction La(a,b,c,d){var e=b.isCreative?!0:b.adSessionId===d;if(e){c.g=b;var f=C(c.g);a=Ea(c.m,f);var h=c.g;'notAttached'===h.notVisibleReason||'noWindowFocus'===h.notVisibleReason||'noAdView'===h.notVisibleReason?(I(c,'notFound'),c.h=new z(Da(),!1)):(h=c.g,'viewInvisible'===h.notVisibleReason||'viewGone'===h.notVisibleReason||'viewNotVisible'===h.notVisibleReason||'viewAlphaZero'===h.notVisibleReason||'viewHidden'===h.notVisibleReason||void 0!==c.g.notVisibleReason||D(c.g)?(I(c,'hidden'),c.h=new z(Da(),\n!1)):(c.g.isPipActive&&I(c,'pictureInPicture'),c.g.m||(I(c,'backgrounded'),I(c,'noWindowFocus')),Fa(a,f)&&I(c,'clipped'),c.h=new z(a,!1)))}else if(f=!0,b.g&&(f=-1!==b.isFriendlyObstructionFor.indexOf(d)?!1:!1===b.clipsToBounds),f){h=b.childViews;for(var k=0;k<h.length;k++)f=void 0!==c.g,La(a,new z(h[k],f),c,d)}e||void 0===c.g||(b.g?-1!==b.isFriendlyObstructionFor.indexOf(d)?c.l.push(b):c.o.push(b):(e=C(b),d=C(c.h),A(c.h),!D(c.h)&&b.clipsToBounds&&(b=Ea(d,e),Fa(b,d)&&(I(c,'clipped'),c.h=new z(b,!1)))))}\n;function Ma(){this.h=new Map;this.g=null}function Na(){Oa||(Oa=new Ma);return Oa}var Oa=null;function Pa(a,b){this.y=this.x=0;this.width=a;this.height=b};function Qa(){this.adSessionId=null;this.m={apiVersion:'1.0',accessMode:'limited',environment:'app',omidJsInfo:{omidImplementer:'omsdk',serviceVersion:'1.5.5-iab77'}};this.C=null;this.A='foregrounded';this.M='unlocked';this.u=this.o='none';this.s=this.j=this.i=this.l=this.h=this.g=this.J=this.D=null;this.I=!0;this.v=new Map}\nfunction Ra(a,b){void 0!==b.contentUrl&&(a.C=b.contentUrl,b.contentUrl=void 0);var c=a.m||{};b.omidJsInfo=Object.assign({},c.omidJsInfo||{},b.omidJsInfo||{});b=Object.assign({},c,b);a.I||(null!=a.j?(b.videoElement=a.j,b.accessMode='full'):null!=a.i&&(b.slotElement=a.i,b.accessMode='full'));a.m=b};var J=function(){if('undefined'!==typeof omidGlobal&&omidGlobal)return omidGlobal;if('undefined'!==typeof global&&global)return global;if('undefined'!==typeof window&&window)return window;if('undefined'!==typeof globalThis&&globalThis)return globalThis;var a=Function('return this')();if(a)return a;throw Error('Could not determine global object context.');}();function Sa(a,b){this.g=a;this.h=b}ea.Object.defineProperties(Sa.prototype,{event:{configurable:!0,enumerable:!0,get:function(){return this.g}},origin:{configurable:!0,enumerable:!0,get:function(){return this.h}}});function K(){var a=w.apply(0,arguments);Ta(function(){throw new (Function.prototype.bind.apply(Error,[null,'Could not complete the test successfully - '].concat(q(a))));},function(){return console.error.apply(console,q(a))})}function Ua(){var a=w.apply(0,arguments);Ta(function(){},function(){return console.error.apply(console,q(a))})}function Ta(a,b){'undefined'!==typeof jasmine&&jasmine?a():'undefined'!==typeof console&&console&&console.error&&b()};function Va(a){this.g=a;this.m=[];this.i=[];this.j=[];this.l=[];this.o={}}function Wa(a,b){if(void 0!==a.g&&a.g.adSessionId&&!1!==Xa(a,b)){var c=b.event;a.j.filter(function(d){return d.type===c.type}).forEach(function(d){a.h(d.G,c)})}}function Ya(a,b){a.m.push(b);Wa(a,b)}function Za(a,b,c){void 0!==a.g&&a.g.adSessionId&&a.m.filter(function(d){return d.event.type===b&&Xa(a,d)}).map(function(d){return d.event}).forEach(function(d){a.h(c.G,d)})}\nfunction Xa(a,b){var c=b.event.type,d=-1!==Object.values(y).indexOf(c)&&'volumeChange'!==c;return'impression'===c||'loaded'===c&&a.g.h?b.origin===a.g.u:d?b.origin===a.g.o:!0}function $a(a,b,c){Object.keys(y).forEach(function(d){d=y[d];var e={type:d,R:c,G:b};a.j.push(e);Za(a,d,e)})}function ab(a,b,c,d){var e={U:c,R:d,G:b};a.l.push(e);a.i.forEach(function(f){var h=bb(f);'sessionStart'===f.event.type&&cb(a,h,e);a.h(e.G,h)})}\nfunction db(a,b,c){var d=L(a,'sessionError','native',{errorType:b,message:c});a.i.push(d);a.l.forEach(function(e){a.h(e.G,d.event)})}function eb(a,b){a.o=Object.assign(a.o,b);b=a.g.m;if(void 0!==b){b=Object.assign({},fb(gb(a,hb(a,{context:b}),!0)),{supportsLoadedEvent:!!a.g.h||'video'==a.g.g});Object.assign(b,{pageUrl:null,contentUrl:a.g.C});var c=L(a,'sessionStart','native',b);a.i.push(c);a.l.forEach(function(d){var e=bb(c);cb(a,e,d);a.h(d.G,e)},a);ib(a)}}\nfunction cb(a,b,c){c.U&&(b.data.verificationParameters=a.o[c.U]);c.R&&(c=a.g.v.get(c.R))&&(b.data.verificationParameters=c.verificationParameters,b.data.context.accessMode=c.accessMode,'full'===c.accessMode&&(a.g.j&&(b.data.context.videoElement=a.g.j),a.g.i&&(b.data.context.slotElement=a.g.i)))}function jb(a){var b=L(a,'sessionFinish','native');a.i.push(b);a.l.forEach(function(c){a.h(c.G,b.event)})}Va.prototype.h=function(a){var b=w.apply(1,arguments);try{a.apply(null,q(b))}catch(c){Ua(c)}};\nfunction kb(a,b){var c=(c=a.g.K)?Aa(c):null;c=gb(a,hb(a,c));Ya(a,L(a,'impression',b,c))}function lb(a,b,c){if(a.g.h||'display'!=a.g.g)b=L(a,'loaded',b,gb(a,hb(a,void 0===c?null:c))),Ya(a,b)}\nfunction mb(a,b,c,d){'start'!==b&&'volumeChange'!==b||null!=(d&&d.deviceVolume)||(d.deviceVolume=a.g.D);if(d&&('start'===b||'volumeChange'===b)){var e=d.videoPlayerVolume,f=d.mediaPlayerVolume;null!=e?(Object.assign(d,{mediaPlayerVolume:e}),a.g.J=e):null!=f&&(Object.assign(d,{videoPlayerVolume:f}),a.g.J=f)}Ya(a,L(a,b,c,d))}\nfunction ib(a){var b=a.m.filter(function(f){return Object.values(y).includes(f.event.type)&&'video'==a.g.g&&f.origin===a.g.o||'loaded'==f.event.type&&'display'==a.g.g&&f.origin===a.g.u?!0:!1}).map(function(f){return f.event}),c=a.g.adSessionId||'',d={};b=p(b);for(var e=b.next();!e.done;d={F:d.F},e=b.next()){d.F=e.value;d.F.adSessionId||(d.F.adSessionId=c);if('loaded'==d.F.type){if(!a.g.h&&'display'==a.g.g)continue;d.F.data=gb(a,hb(a,d.F.data))}a.j.filter(function(f){return function(h){return h.type===\nf.F.type}}(d)).forEach(function(f){return function(h){return h.G(f.F)}}(d))}}function nb(a,b,c){a:{c=new Set(c);a=p(a.m.concat(a.i));for(var d=a.next();!d.done;d=a.next())if(d=d.value,c.has(d.event.type)&&d.origin!=b){b=!0;break a}b=!1}return b?(K('Event owner cannot be registered after its events have already been published.'),!1):!0}function ob(a,b){nb(a,b,Object.values(y))&&pb(a,b)&&(a.g.o=b)}function qb(a,b){nb(a,b,['impression'])&&rb(a,b)&&(a.g.u=b)}\nfunction rb(a,b){var c=a.g.u;return'none'!=c&&c!=b?(K('Impression event is owned by '+(a.g.u+', not ')+(b+'.')),!1):!0}function pb(a,b){var c=a.g.o;return'none'!=c&&c!=b?(K('Media events are owned by '+(a.g.o+', not '+b+'.')),!1):!0}function gb(a,b,c){c=void 0===c?!1:c;b=Object.assign({},b);a.g.g&&Object.assign(b,{mediaType:a.g.g});a.g.h&&(c||'definedByJavaScript'!==a.g.h)&&Object.assign(b,{creativeType:a.g.h});return b}function fb(a){var b=Na().g;return b?Object.assign({},a,{lastActivity:b}):a}\nfunction hb(a,b){return a.g.l?Object.assign({},b,{impressionType:a.g.l}):b}function L(a,b,c,d){return new Sa({adSessionId:a.g.adSessionId||'',timestamp:(new Date).getTime(),type:b,data:d},c)}function bb(a){a=a.event;var b=a.data?Object.assign({},a.data):void 0;'sessionStart'===a.type&&(b.context=Object.assign({},b.context));return{adSessionId:a.adSessionId,timestamp:a.timestamp,type:a.type,data:b}};function sb(a,b,c){this.h=a;this.i=b;this.g=c}\nfunction M(a,b,c){'container'===b&&void 0!==a.g.L&&void 0!==a.g&&null!=a.g.adSessionId&&(a.g.O=Ka(a.i,a.g.L,a.g.A,a.g.adSessionId,!0,a.g.M));b=a.g;var d=b.O,e=b.P;if(d)if(e){b=new H;var f=d.s,h=d.g,k=d.h,g=e.g,l=e.h;f&&h&&k&&g&&l&&(Ca(b,f),b.u=new z(h,!1),b.D=new z(k,!1),b.o=Object.assign([],d.o),b.j=Object.assign([],d.j),b.l=Object.assign([],d.l),b.v=Object.assign([],d.v),b.i=Object.assign([],e.i,d.i),d=b.u.x,e=b.u.y,g=new z(g,!1),l=new z(l,!1),wa(g,d,e),wa(l,d,e),b.g=g,b.h=Ea(l,k),Ga(b))}else b=\nd;else b=null;k=a.g.K;if(b&&!b.N(k)||c)k=Aa(b),c&&(k.adView.reasons=k.adView.reasons||[c]),c=a.h,'audio'!=c.g.h&&Ya(c,L(c,'geometryChange','native',k)),a.g.K=b};function tb(){var a;this.g=a=void 0===a?omidGlobal:a}tb.prototype.setInterval=function(a,b){return ub(this,'setInterval')(a,b)};tb.prototype.clearInterval=function(a){ub(this,'clearInterval')(a)};function vb(a,b){ub(a,'clearTimeout')(b)}function ub(a,b){return a.g&&a.g[b]?a.g[b]:wb(a,b)}\nfunction xb(a,b,c,d){if(a.g.document&&a.g.document.body){var e=a.g.document.createElement('img');e.width=1;e.height=1;e.style.display='none';e.src=b;c&&e.addEventListener('load',function(){return c()});d&&e.addEventListener('error',function(){return d()});a.g.document.body.appendChild(e)}else wb(a,'sendUrl')(b,c,d)}function wb(a,b){if(a.g&&a.g.omidNative&&a.g.omidNative[b])return a.g.omidNative[b].bind(a.g.omidNative);throw Error('Native interface method \"'+b+'\" not found.');};function N(a){return'object'===typeof a}function O(a){return'number'===typeof a&&!isNaN(a)&&0<=a}function P(a){return'string'===typeof a}function Q(a,b){return P(a)&&-1!==Object.values(b).indexOf(a)}function yb(a){return!(!a||!a.tagName||'iframe'!==a.tagName.toLowerCase())};function S(a,b,c,d,e){this.j=a;this.ba=b;this.L=c;this.i=d;this.P=e;this.h=null;this.g=this.m=this.D=void 0;this.O=!0;this.J=void 0;zb(this)}\nfunction zb(a){if(!a.h){var b;a:{if((b=a.j.document)&&b.getElementsByClassName&&(b=b.getElementsByClassName('omid-element'))){if(1==b.length){b=b[0];break a}1<b.length&&a.O&&(db(a.L,'generic',\"More than one element with 'omid-element' class name.\"),a.O=!1)}b=null}if(b&&b.tagName&&'video'===b.tagName.toLowerCase())a.i.j=b;else if(b&&b.tagName)a.i.i=b;else return;Ab(a)}}function Ab(a){a.i.j?(a.h=a.i.j,a.o()):a.i.i&&(a.h=a.i.i,yb(a.h)?a.i.s&&a.o():a.o())}\nfunction Bb(a){a.g&&(yb(a.h)?a.i.s&&(a.K(),Cb(a)):(a.K(),Cb(a)))}S.prototype.A=function(){this.J&&(this.j.document.removeEventListener('visibilitychange',this.J),this.J=void 0)};S.prototype.o=function(){};function Cb(a){a.D&&(a.i.P=a.D,M(a.ba,'creative'))}function Db(a){if(a.g&&a.i.s){var b=new z(a.i.s,!1);wa(b,a.g.x,a.g.y);b.clipsToBounds=!0;return b}};function T(a,b,c,d,e,f){S.call(this,a,c,d,e,f);this.s=b;this.l=void 0}v(T,S);T.prototype.A=function(){void 0!==this.l&&(this.P.clearInterval(this.l),this.l=void 0);S.prototype.A.call(this)};T.prototype.o=function(){var a=this;S.prototype.o.call(this);null==this.h?this.l=void 0:void 0===this.l&&(this.l=this.P.setInterval(function(){return Eb(a)},200),Eb(this))};\nT.prototype.K=function(){if(this.m){var a=Db(this);if(a){this.g.isCreative=!1;a.isCreative=!0;for(var b=!1,c=0;c<this.g.childViews.length;c++)if(this.g.childViews[c].isCreative){this.g.childViews[c]=a;b=!0;break}b||this.g.childViews.push(a)}else this.g.isCreative=!0;this.D=Ka(this.s,this.m,this.i.A,this.i.adSessionId,this.I())}};T.prototype.I=function(){return!0};\nfunction Eb(a){if(void 0!==a.l){b:{try{var b=a.j.top;var c=0<=b.innerHeight&&0<=b.innerWidth;break b}catch(d){}c=!1}c?(c=a.j.top,c=new z(new Pa(c.innerWidth,c.innerHeight),!1)):c=new z(new Pa(0,0),!1);b=a.h.getBoundingClientRect();if(null==b.x||isNaN(b.x))b.x=b.left;if(null==b.y||isNaN(b.y))b.y=b.top;b=new z(b,!1);c.N(a.m)&&b.N(a.g)||(a.g=b,a.g.clipsToBounds=!0,a.m=c,a.m.childViews.push(a.g),Bb(a))}};function U(a,b,c,d,e,f){S.call(this,a,c,d,e,f);this.v=this.s=this.u=this.l=void 0;this.M=!1;this.C=void 0}v(U,S);U.prototype.A=function(){this.l&&this.l.disconnect();Fb(this);S.prototype.A.call(this)};U.prototype.o=function(){S.prototype.o.call(this);if(this.h&&(this.l||(this.l=Gb(this)),Hb(this),Ib(this.h)&&Jb(this),'backgrounded'===this.i.A)){var a=Kb(new Pa(0,0));this.C=this.g=this.m=a;Bb(this)}};\nU.prototype.K=function(){if(this.g&&this.C){var a=Db(this);if(a){var b=a;var c=this.C;var d=Math.max(a.x,c.x);var e=Math.max(a.y,c.y),f=Math.min(a.endX,c.endX);a=Math.min(a.endY,c.endY);f<=d||a<=e?d=null:(c={},d=new z((c.x=d,c.y=e,c.width=Math.abs(f-d),c.height=Math.abs(a-e),c),!1));d||(d=new z({x:0,y:0,width:0,height:0},!1))}else b=this.g,d=this.C;e=new H;this.m&&Ca(e,this.m);e.g=b;e.h=d;Ga(e);this.M?D(e.g)?I(e,'hidden'):100===e.A||I(e,'clipped'):I(e,'viewport');this.D=e}};U.prototype.I=function(){return!0};\nfunction Fb(a){a.u&&(a.u.disconnect(),a.u=void 0);a.s&&(a.s.disconnect(),a.s=void 0);a.v&&((0,a.j.removeEventListener)('resize',a.v),a.v=void 0)}function Hb(a){a.l&&a.h&&(a.l.unobserve(a.h),a.l.observe(a.h))}function Ib(a){a=a.getBoundingClientRect();return 0==a.width||0==a.height}\nfunction Gb(a){return new a.j.IntersectionObserver(function(b){try{if(b.length){for(var c,d=b[0],e=1;e<b.length;e++)b[e].time>d.time&&(d=b[e]);c=d;a.m=Kb(c.rootBounds);a.g=Kb(c.boundingClientRect);a.C=Kb(c.intersectionRect);a.M=!!c.isIntersecting;Bb(a)}}catch(f){a.A(),db(a.L,'generic','Problem handling IntersectionObserver callback: '+f.message)}},{root:null,rootMargin:'0px',threshold:[0,.1,.2,.3,.4,.5,.6,.7,.8,.9,1]})}\nfunction Jb(a){a.j.ResizeObserver?a.u||(a.u=Lb(a,function(){return Mb(a)}),a.u.observe(a.h)):(a.v||(a.v=function(){return Mb(a)},(0,a.j.addEventListener)('resize',a.v)),a.s||(a.s=new MutationObserver(function(){return Mb(a)}),a.s.observe(a.h,{childList:!1,attributes:!0,subtree:!1})))}function Mb(a){a.h&&!Ib(a.h)&&(Hb(a),Fb(a))}function Lb(a,b){return new a.j.ResizeObserver(b)}function Kb(a){if(a&&null!==a.x&&null!==a.y&&null!==a.width&&null!==a.height)return new z(a,!1)};function Nb(a){if('object'===typeof a&&'object'===typeof a.webOSSystem)return a.webOSSystem}function Ob(a){if('object'===typeof a&&'object'===typeof a.tizen)return a.tizen}function Pb(a){return'object'===typeof Ob(a)};function Qb(a,b){this.h=a;this.g=b};function Sb(){return'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g,function(a){var b=16*Math.random()|0;return'y'===a?(b&3|8).toString(16):b.toString(16)})};function Tb(a,b){var c=void 0===c?J:c;this.j=a;this.g=c;this.i=b;this.h=[]}\nfunction Ub(a){if(!a.g||!a.g.document)throw Error('OMID Service Script is not running within a window.');var b=a.h;a.h=[];b.forEach(function(c){try{var d=a.i.I?'limited':'full',e=Q(c.accessMode,ra)?c.accessMode:null;var f=e?'full'==e&&'limited'==d?d:'domain'==e?'limited':e:d;c.accessMode=f;a:{var h=c.resourceUrl,k=a.g.location.origin;try{var g=new URL(h,k);break a}catch(F){}try{g=new URL(h);break a}catch(F){}g=null}if(d=g){var l=Sb();Vb(a,l,d,f);var m=c.vendorKey,r=c.verificationParameters;m=void 0===\nm?'':m;r=void 0===r?'':r;m&&'string'===typeof m&&''!==m&&r&&'string'===typeof r&&''!==r&&(a.j.o[m]=r);a.i.v.set(l,c)}}catch(F){Ua('OMID verification script '+c.resourceUrl+' failed to load: '+F)}})}\nfunction Vb(a,b,c,d){var e=a.g.document,f=e.createElement('iframe');f.id='omid-verification-script-frame-'+b;f.style.display='none';if('full'==d){var h=function(){var k=f.contentWindow;k.omidVerificationProperties={serviceWindow:a.g,injectionSource:'app',injectionId:b};k=k.document;var g=k.createElement('script');g.src=c.href;k.head.appendChild(g);f.removeEventListener('load',h)};f.addEventListener('load',h)}else'limited'==d&&(f.srcdoc=\"<html><head>\\n<script type=\\\"text/javascript\\\">window['omidVerificationProperties'] = {\\n'serviceWindow': window.parent,\\n'injectionSource': 'app',\\n'injectionId': '\"+\n(b+'\\',\\n};\\x3c/script>\\n<script type=\"text/javascript\" src=\"')+c.href+'\">\\x3c/script>\\n</head><body></body></html>',f.sandbox='allow-scripts');e.body.appendChild(f);Na().h.set(b,f)};function Wb(a,b,c,d,e,f){var h=this;this.g=a;this.h=b;this.j=c;this.i=d;this.l=e;this.s=f;this.m=!1;Xb(this,function(k){if('sessionStart'===k.type){h.m=!0;try{Ub(h.l)}catch(g){K(g.message)}}'sessionFinish'===k.type&&(h.m=!1)})}function Xb(a,b,c,d){ab(a.h,b,c,d)}n=Wb.prototype;n.setSlotElement=function(a){a&&a.tagName?(this.g.i=a,this.i&&Ab(this.i)):K('setSlotElement called with a non-HTMLElement.  It will be ignored.')};n.setElementBounds=function(a){this.g.s=a;this.i&&Ab(this.i);this.i&&Bb(this.i)};\nn.error=function(a,b){db(this.h,a,b)};n.injectVerificationScriptResources=function(a){var b=this.l;b.h.push.apply(b.h,q(a));if(this.m)try{Ub(this.l)}catch(c){K(c.message)}};n.setCreativeType=function(a,b){b=void 0===b?null:b;if(!this.g.g||this.g.h)this.g.h=a,'video'==a||'audio'==a?this.g.g='video':'htmlDisplay'==a||'nativeDisplay'==a?this.g.g='display':'definedByJavaScript'==a&&b&&(this.g.g='none'==b?'display':'video')};n.setImpressionType=function(a){if(!this.g.g||this.g.h)this.g.l=a};\nn.setClientInfo=function(a,b,c){var d=this.g.m||{};d.omidJsInfo=Object.assign({},d.omidJsInfo,{sessionClientVersion:a,partnerName:b,partnerVersion:c});this.g.m=d;return this.g.m.omidJsInfo.serviceVersion};function Yb(a,b){if(!b)return a.g;for(var c=p(a.h.values()),d=c.next();!d.done;d=c.next())if(d=d.value,d.g.v.has(b))return d;return a.g}function V(a,b){return null==b?a.g:a.h.get(b)||a.g}function Zb(a){var b=new Qa,c=new Va(b),d=new Ia,e=new Ja,f=new sb(c,e,b);a=a.i;var h=omidGlobal;d=h?h.IntersectionObserver&&(h.MutationObserver||h.ResizeObserver)?new U(h,d,f,c,b,a):new T(h,e,f,c,b,a):null;return new Wb(b,c,f,d,new Tb(c,b),new Qb(c,b))};function $b(a){return a&&N(a)?Object.entries(a).reduce(function(b,c){var d=p(c);c=d.next().value;d=d.next().value;return b&&P(c)&&null!=d&&N(d)&&P(d.resourceUrl)},!0):!1};function W(a,b,c,d){this.h=a;this.method=b;this.version=c;this.g=d}function ac(a){return!!a&&void 0!==a.omid_message_guid&&void 0!==a.omid_message_method&&void 0!==a.omid_message_version&&'string'===typeof a.omid_message_guid&&'string'===typeof a.omid_message_method&&'string'===typeof a.omid_message_version&&(void 0===a.omid_message_args||void 0!==a.omid_message_args)}function bc(a){return new W(a.omid_message_guid,a.omid_message_method,a.omid_message_version,a.omid_message_args)}\nfunction cc(a){var b={};b=(b.omid_message_guid=a.h,b.omid_message_method=a.method,b.omid_message_version=a.version,b);void 0!==a.g&&(b.omid_message_args=a.g);return b};function dc(a){this.i=a};function X(a){this.i=a;this.handleExportedMessage=X.prototype.j.bind(this)}v(X,dc);X.prototype.h=function(a,b){b=void 0===b?this.i:b;if(!b)throw Error('Message destination must be defined at construction time or when sending the message.');b.handleExportedMessage(cc(a),this)};X.prototype.j=function(a,b){ac(a)&&this.g&&this.g(bc(a),b)};function ec(a){return fc(a,'SessionService.')}function fc(a,b){return(a=a.match(new RegExp('^'+b+'(.*)')))&&a[1]};function gc(a,b){this.i=b=void 0===b?J:b;var c=this;a.addEventListener('message',function(d){if('object'===typeof d.data){var e=d.data;ac(e)&&d.source&&c.g&&c.g(bc(e),d.source)}})}v(gc,dc);gc.prototype.h=function(a,b){b=void 0===b?this.i:b;if(!b)throw Error('Message destination must be defined at construction time or when sending the message.');b.postMessage(cc(a),'*')};function hc(a,b){b=void 0===b?{}:b;var c=J.webkit?J.webkit.messageHandlers.omidJsSessionService:J.omidJsSessionService;if(!c)return!1;c.postMessage(JSON.stringify({method:a,data:b}));return!0};function ic(){this.g=jc}n=ic.prototype;n.registerSessionObserver=function(a,b){Xb(V(this.g,a),b)};n.setSlotElement=function(a,b){V(this.g,a).setSlotElement(b)};n.setElementBounds=function(a,b){V(this.g,a).setElementBounds(b)};\nfunction kc(a,b,c,d,e){e=void 0===e?null:e;a=V(a.g,b);var f=a.g.m;f.sessionOwner||(f.sessionOwner=d?'native':'javascript');d?(b=b||Sb(),a.g.adSessionId=b,c.canMeasureVisibility=a.i.I(),Ra(a.g,c),eb(a.h,e),a.i&&zb(a.i)):b?(Ra(a.g,c),hc('startSession',{adSessionId:b})||K('On App, the native-layer JS Session Service must be initialized before starting an ad session using the JS API.')):K('Session client must be updated to start an App session from JS.')}\nfunction lc(a,b,c){c?(b=V(a.g,b),a=a.g,a.g=Zb(a),jb(b.h),b.i.A(),b.o&&(b.o.stop(),b.o=null)):b?hc('finishSession',{adSessionId:b})||K('On App, the native-layer JS Session Service must be initialized before finishing an ad session using the JS API.'):K('Session client must be updated to finish an App session from JS.')}n.error=function(a,b,c){V(this.g,a).error(b,c)};\nfunction Y(a,b,c,d){a=V(a.g,b);'impression'==c?rb(a.h,'javascript')&&(kb(a.h,'javascript'),a.i&&zb(a.i)):('loaded'==c?(d=void 0===d?null:d,pb(a.h,'javascript')&&lb(a.h,'javascript',d)):pb(a.h,'javascript')&&mb(a.h,c,'javascript',d),['loaded','start'].includes(c)&&a.i&&zb(a.i))}n.injectVerificationScriptResources=function(a,b){V(this.g,a).injectVerificationScriptResources(b)};n.setCreativeType=function(a,b,c){c=void 0===c?null:c;V(this.g,a).setCreativeType(b,c)};\nn.setImpressionType=function(a,b){V(this.g,a).setImpressionType(b)};n.setClientInfo=function(a,b,c,d){var e=this.g;if(null==a)a=e.g;else{var f=[].concat(q(e.h.values())).includes(e.g)?Zb(e):e.g;e.h.set(a,f);a=f}return a.setClientInfo(b,c,d)};function mc(a){a=a.split('-')[0].split('.');for(var b=['1','0','3'],c=0;3>c;c++){var d=parseInt(a[c],10),e=parseInt(b[c],10);if(d>e)break;else if(d<e)return!1}return!0};function nc(a,b){return/\\d+\\.\\d+\\.\\d+(-.*)?/.test(a)&&mc(a)?b:JSON.stringify(b)}function oc(a,b){return/\\d+\\.\\d+\\.\\d+(-.*)?/.test(a)&&mc(a)?b?b:[]:b&&'string'===typeof b?JSON.parse(b):[]};function pc(){var a=qc;var b=void 0===b?omidGlobal:b;this.g=a;this.h=b;this.j=new X;this.h.omid=this.h.omid||{};this.h.omid.v1_SessionServiceCommunication=this.j;this.i=b&&b.addEventListener&&b.postMessage?new gc(b):null;this.j.g=this.m.bind(this);this.i&&(this.i.g=this.l.bind(this))}pc.prototype.m=function(a,b){null!=ec(a.method)&&rc(this,a,b,this.j)};pc.prototype.l=function(a,b){null!=ec(a.method)&&rc(this,a,b,this.i)};\nfunction rc(a,b,c,d){function e(){var g=new W(f,'response',k,nc(k,w.apply(0,arguments)));d.h(g,c)}var f=b.h,h=b.method,k=b.version;b=oc(k,b.g);try{sc(a,h,e,b)}catch(g){d.h(new W(f,'error',k,'\\n        name: '+g.name+'\\n        message: '+g.message+'\\n        filename: '+g.filename+'\\n        lineNumber: '+g.lineNumber+'\\n        columnNumber: '+g.columnNumber+'\\n        stack: '+g.stack+'\\n        toString(): '+g.toString()),c)}}\nfunction sc(a,b,c,d){if(null!=ec(b))switch(ec(b)){case 'registerAdEvents':c=p(d).next().value;qb(V(a.g.g,c).h,'javascript');break;case 'registerMediaEvents':c=p(d).next().value;ob(V(a.g.g,c).h,'javascript');break;case 'registerSessionObserver':var e=p(d).next().value;a.g.registerSessionObserver(e,c);break;case 'setSlotElement':e=p(d);c=e.next().value;e=e.next().value;a.g.setSlotElement(e,c);break;case 'setVideoElement':e=p(d);c=e.next().value;e=e.next().value;a=V(a.g.g,e);c&&c.tagName&&'video'===\nc.tagName.toLowerCase()?(a.g.j=c,a.i&&Ab(a.i)):K('setVideoElement called with a non-HTMLVideoElement. It will be ignored.');break;case 'setElementBounds':e=p(d);c=e.next().value;e=e.next().value;a.g.setElementBounds(e,c);break;case 'startSession':c=p(d);d=c.next().value;c=c.next().value;b=a.h;if(null!=d&&N(d)){var f=d.customReferenceData,h=d.underEvaluation,k=d.universalAdId;P(f)||(f=void 0);'boolean'===typeof h||(h=!1);d={customReferenceData:f,underEvaluation:h};P(k)&&(d.universalAdId=k);if('object'===\ntypeof Nb(b)){var g=Nb(b),l;'object'===typeof g&&(l=g.identifier);d.app={appId:l&&'string'===typeof l?l:void 0};b:if(g=Nb(b),'object'===typeof g){try{e=JSON.parse(g.deviceInfo)}catch(F){e=void 0;break b}e={deviceType:e.modelName||'Unknown',osVersion:e.platformVersion||'Unknown',os:'webOS'}}else e=void 0;d.deviceInfo=e;d.deviceCategory='ctv'}else if(Pb(b)){b:{if(Pb(b)){try{var m=Ob(b).application.getCurrentApplication().appInfo.id}catch(F){e=void 0;break b}if('string'===typeof m){e=m;break b}}e=void 0}d.app=\n{appId:e};if(Pb(b)){e=Ob(b).systeminfo;if('object'===typeof e&&'function'===typeof e.getCapability){g=e.getCapability('http://tizen.org/system/model_name');var r=e.getCapability('http://tizen.org/feature/platform.version')}e={deviceType:g||'Unknown',osVersion:r||'Unknown',os:'tizen'}}else e=void 0;d.deviceInfo=e;Pb(b)&&'object'===typeof Ob(b).tvinputdevice&&(d.deviceCategory='ctv')}}else d=null;if(null==d)break;kc(a.g,c,d,!1);break;case 'finishSession':c=p(d).next().value;lc(a.g,c,!1);break;case 'impressionOccurred':c=\np(d).next().value;Y(a.g,c,'impression');break;case 'loaded':e=p(d);c=e.next().value;e=e.next().value;c?(g={skippable:c.isSkippable,autoPlay:c.isAutoPlay,position:c.position},c.isSkippable&&(g.skipOffset=c.skipOffset),Y(a.g,e,'loaded',g)):Y(a.g,e,'loaded');break;case 'start':g=p(d);c=g.next().value;e=g.next().value;g=g.next().value;Y(a.g,g,'start',{duration:c,mediaPlayerVolume:e});break;case 'firstQuartile':c=p(d).next().value;Y(a.g,c,'firstQuartile');break;case 'midpoint':c=p(d).next().value;Y(a.g,\nc,'midpoint');break;case 'thirdQuartile':c=p(d).next().value;Y(a.g,c,'thirdQuartile');break;case 'complete':c=p(d).next().value;Y(a.g,c,'complete');break;case 'pause':c=p(d).next().value;Y(a.g,c,'pause');break;case 'resume':c=p(d).next().value;Y(a.g,c,'resume');break;case 'bufferStart':c=p(d).next().value;Y(a.g,c,'bufferStart');break;case 'bufferFinish':c=p(d).next().value;Y(a.g,c,'bufferFinish');break;case 'skipped':c=p(d).next().value;Y(a.g,c,'skipped');break;case 'volumeChange':e=p(d);c=e.next().value;\ne=e.next().value;Y(a.g,e,'volumeChange',{mediaPlayerVolume:c});break;case 'playerStateChange':e=p(d);c=e.next().value;e=e.next().value;Y(a.g,e,'playerStateChange',{state:c});break;case 'adUserInteraction':e=p(d);c=e.next().value;e=e.next().value;Y(a.g,e,'adUserInteraction',{interactionType:c});break;case 'setClientInfo':l=p(d);e=l.next().value;g=l.next().value;r=l.next().value;l=l.next().value;a=a.g.setClientInfo(l,e,g,r);c(a);break;case 'injectVerificationScriptResources':e=p(d);c=e.next().value;\ne=e.next().value;a.g.injectVerificationScriptResources(e,c);break;case 'setCreativeType':e=p(d);c=e.next().value;e=e.next().value;a.g.setCreativeType(e,c);break;case 'setImpressionType':e=p(d);c=e.next().value;e=e.next().value;a.g.setImpressionType(e,c);break;case 'setContentUrl':e=p(d);c=e.next().value;e=e.next().value;V(a.g.g,e).g.C=c;break;case 'sessionError':g=p(d),c=g.next().value,e=g.next().value,g=g.next().value,a.g.error(g,c,e)}};function Z(){this.g=qc}n=Z.prototype;\nn.da=function(a,b){if(!(!(a&&N(a)&&Q(a.impressionOwner,qa))||'videoEventsOwner'in a&&null!=a.videoEventsOwner&&!Q(a.videoEventsOwner,qa)||'mediaEventsOwner'in a&&null!=a.mediaEventsOwner&&!Q(a.mediaEventsOwner,qa))){b=V(this.g.g,b);if(a.creativeType&&a.impressionType){var c=a.mediaEventsOwner;null==b.g.h&&b.setCreativeType(a.creativeType,c);null==b.g.l&&(b.g.l=a.impressionType);ob(b.h,c)}else c=a.videoEventsOwner,b.g.g=null==c||'none'===c?'display':'video',b.g.h=null,b.g.l=null,ob(b.h,c);qb(b.h,a.impressionOwner);\na&&null!=a.isolateVerificationScripts&&'boolean'===typeof a.isolateVerificationScripts&&(b.g.I=a.isolateVerificationScripts)}};\nn.aa=function(a,b,c,d){b&&'string'===typeof b.adSessionType&&(b.adSessionType=b.adSessionType.toLowerCase());var e;if(N(b)){if(e=Q(b.environment,ua)&&Q(b.adSessionType,pa))e=b.omidNativeInfo,e=N(e)?P(e.partnerName)&&P(e.partnerVersion):!1;e&&(e=b.app,e=N(e)?P(e.libraryVersion)&&P(e.appId):!1)}else e=!1;if(e){if($b(d)){e=p(Object.values(d));for(var f=e.next();!f.done;f=e.next())f.value.accessMode='limited';V(this.g.g,a).g.v=new Map(Object.entries(d))}kc(this.g,a,b,!0,c)}else K('Native ad session context invalid; session not started.')};\nn.W=function(a){lc(this.g,a,!0)};n.$=function(a,b){N(a)&&O(a.x)&&O(a.y)&&O(a.width)&&O(a.height)&&(b=V(this.g.g,b),b.g.L=a,M(b.j,'container'))};n.ha=function(a,b){Q(a,sa)&&(b=V(this.g.g,b),b.g.A=a,'backgrounded'===a?M(b.j,'container','backgrounded'):M(b.j,'container'))};n.Y=function(a,b){Q(a,ta)&&(b=V(this.g.g,b),b.g.M=a,'locked'===a?M(b.j,'container','deviceLocked'):M(b.j,'container'))};n.ea=function(a){'impression'===a&&this.T()};n.T=function(a){a=V(this.g.g,a);rb(a.h,'native')&&kb(a.h,'native')};\nn.X=function(a,b){this.S('loaded',void 0===a?null:a,b)};n.error=function(a,b,c){Q(a,oa)&&this.g.error(c,a,b)};n.fa=function(a,b,c){this.S(a,b,c)};n.S=function(a,b,c){Q(a,y)&&(void 0===b||N(b))&&(c=V(this.g.g,c),pb(c.h,'native')&&('loaded'==a?lb(c.h,'native',b):mb(c.h,a,'native',b)))};n.Z=function(a,b){b=V(this.g.g,b);'none'===b.h.g.o||'number'!==typeof a||isNaN(a)||(b.g.D=a,a=b.s,b=a.g.J,null!=b&&mb(a.h,'volumeChange','native',{mediaPlayerVolume:b,deviceVolume:a.g.D}))};\nn.ga=function(a){if(a&&N(a)&&O(a.timestamp)){var b=Na(),c=(b.g||{}).timestamp;if(!c||c<a.timestamp)b.g=a}};Z.prototype.startSession=Z.prototype.aa;Z.prototype.error=Z.prototype.error;Z.prototype.finishSession=Z.prototype.W;Z.prototype.publishAdEvent=Z.prototype.ea;Z.prototype.publishImpressionEvent=Z.prototype.T;Z.prototype.publishVideoEvent=Z.prototype.fa;Z.prototype.publishMediaEvent=Z.prototype.S;Z.prototype.publishLoadedEvent=Z.prototype.X;Z.prototype.setNativeViewHierarchy=Z.prototype.$;\nZ.prototype.setState=Z.prototype.ha;Z.prototype.setDeviceLockState=Z.prototype.Y;Z.prototype.setDeviceVolume=Z.prototype.Z;Z.prototype.init=Z.prototype.da;Z.prototype.setLastActivity=Z.prototype.ga;function tc(){var a=jc,b=uc,c=this;var d=void 0===d?J:d;this.j=a;this.g=b;this.l={};this.m={};this.i=new X;d.omid=d.omid||{};d.omid.v1_VerificationServiceCommunication=this.i;this.h=null;d&&d.addEventListener&&d.postMessage&&(this.h=new gc(d));this.i.g=function(e,f){vc(c,e,f,c.i)};this.h&&(this.h.g=function(e,f){c.h&&vc(c,e,f,c.h)})}function wc(a,b,c,d){a=Yb(a.j,d).h;'media'===b||'video'===b?$a(a,c,d):(c={type:b,R:d,G:c},a.j.push(c),Za(a,b,c))}function xc(a,b,c,d){a=Yb(a.j,d);Xb(a,b,c,d)}\nfunction yc(a,b,c,d){xb(a.g,b,c,d)}tc.prototype.setInterval=function(a,b){return this.g.setInterval(a,b)};tc.prototype.clearInterval=function(a){this.g.clearInterval(a)};function zc(a,b,c,d){wb(a.g,'downloadJavaScriptResource')(b,c,d)}\nfunction vc(a,b,c,d){function e(){var B=new W(f,'response',k,nc(k,w.apply(0,arguments)));d.h(B,c)}var f=b.h,h=b.method,k=b.version;b=oc(k,b.g);if(null!=fc(h,'VerificationService.')){h=fc(h,'VerificationService.');try{switch(h){case 'addEventListener':var g=p(b),l=g.next().value,m=g.next().value||Ac(c);wc(a,l,e,m);break;case 'addSessionListener':var r=p(b),F=r.next().value,ba=r.next().value||Ac(c);xc(a,e,F,ba);break;case 'sendUrl':var R=p(b).next().value;yc(a,R,function(){return e(!0)},function(){return e(!1)});\nbreak;case 'setTimeout':var G=p(b),Ec=G.next().value,Fc=G.next().value;a.l[Ec]=ub(a.g,'setTimeout')(e,Fc);break;case 'clearTimeout':var Gc=p(b).next().value;vb(a.g,a.l[Gc]);break;case 'setInterval':var Rb=p(b),Hc=Rb.next().value,Ic=Rb.next().value;a.m[Hc]=a.setInterval(e,Ic);break;case 'clearInterval':var Jc=p(b).next().value;a.clearInterval(a.m[Jc]);break;case 'injectJavaScriptResource':var Kc=p(b).next().value;zc(a,Kc,function(B){return e(!0,B)},function(){return e(!1)});break;case 'getVersion':e('1.5.5-iab77')}}catch(B){d.h(new W(f,\n'error',k,'\\n              name: '+B.name+'\\n              message: '+B.message+'\\n              filename: '+B.filename+'\\n              lineNumber: '+B.lineNumber+'\\n              columnNumber: '+B.columnNumber+'\\n              stack: '+B.stack+'\\n              toString(): '+B.toString()+'\\n          '),c)}}}\nfunction Ac(a){for(var b=Na().h,c=p(b.keys()),d=c.next();!d.done;d=c.next()){d=d.value;var e=b.get(d);if(e){if(e.contentWindow===a)return d;try{if(e.contentWindow.Object.prototype.isPrototypeOf(a))return d}catch(f){}}}};function Bc(a){var b={};return(b.app='omid_v1_present_app',b.web='omid_v1_present_web',b)[a]}function Cc(a,b){a.document.write('<iframe style=\"display:none\" id=\"'+(b+'\" name=\"'+b+'\" sandbox></iframe>'))}function Dc(a,b){var c=a.document.createElement('iframe');c.id=b;c.name=b;c.style.display='none';c.sandbox='';a.document.body.appendChild(c)}\nfunction Lc(a,b){var c=new MutationObserver(function(d){d.forEach(function(e){'BODY'===e.addedNodes[0].nodeName&&(e=Bc(b),Dc(a,'omid_v1_present'),Dc(a,e),c.disconnect())})});c.observe(a.document.documentElement,{childList:!0})};var uc=new tb,jc=new function(){this.i=uc;this.h=new Map;this.g=Zb(this)},qc=new ic;new tc;J.omidBridge=new Z;new pc;(function(a,b){a.frames&&a.document&&!['omid_v1_present','omid_v1_present_web','omid_v1_present_app'].some(function(c){return!!a.frames[c]})&&(null==a.document.body&&'MutationObserver'in a?Lc(a,b):(b=Bc(b),a.document.body?(Dc(a,'omid_v1_present'),Dc(a,b)):(Cc(a,'omid_v1_present'),Cc(a,b))))})(J,'app');\n}).call(this, this);";
                                                    }
                                                }
                                                AdSessionContext adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(c3163oa.f23872b, strA2, arrayList3, strE, str18);
                                                Intrinsics.e(adSessionContextCreateNativeAdSessionContext, "createNativeAdSessionContext(...)");
                                                map3.put("omidAdSession", new C3035ga("native_video_ad", ImpressionType.VIEWABLE, adSessionContextCreateNativeAdSessionContext, false));
                                                c3199qe.f23941b.put("deferred", Boolean.TRUE);
                                                InterfaceC3333z5 interfaceC3333z10 = this.j;
                                                if (interfaceC3333z10 != null) {
                                                    str2 = str14;
                                                    try {
                                                        ((A5) interfaceC3333z10).a(str2, str17);
                                                        str7 = str2;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        InterfaceC3333z5 interfaceC3333z11 = this.j;
                                                        if (interfaceC3333z11 != null) {
                                                            str = str6;
                                                            ((A5) interfaceC3333z11).b(str2, rf.a(e, H6.a(str2, str, "Setting up impression tracking for OMID Native Video encountered an unexpected error: ")));
                                                        } else {
                                                            str = str6;
                                                        }
                                                        S5 s5 = S5.f23167a;
                                                        S5.d.a(AbstractC3285w5.a(e, "event"));
                                                        str7 = str2;
                                                        str6 = str;
                                                        contextT = contextT;
                                                        z2 = z2;
                                                        it = it;
                                                    }
                                                }
                                                str6 = str6;
                                            }
                                            str7 = str14;
                                            str6 = str6;
                                        } catch (Exception e3) {
                                            e = e3;
                                            str2 = str14;
                                        }
                                    }
                                    str6 = str6;
                                } catch (Exception e4) {
                                    e = e4;
                                    str2 = str7;
                                }
                            } else {
                                String str19 = "macros";
                                String str20 = "event";
                                str = str6;
                                str2 = str7;
                                InterfaceC3333z5 interfaceC3333z12 = this.j;
                                if (interfaceC3333z12 != null) {
                                    ((A5) interfaceC3333z12).c(str2, D0.a(str2, str, "initOmidForNativeDisplayAd ", this));
                                }
                                try {
                                    byte bJ2 = J();
                                    String strL2 = L();
                                    Intrinsics.c(strL2);
                                    JSONObject jSONObject2 = new JSONObject(strL2);
                                    AdConfig adConfig4 = this.f23137b;
                                    Intrinsics.c(adConfig4);
                                    C3312y0 c3312y1 = this.f23145u;
                                    if (c3312y1 == null) {
                                        mapA = null;
                                    } else {
                                        boolean z4 = T9.f23231a;
                                        mapA = T9.a(c3312y1.h());
                                    }
                                    List listN = new C3177p8(bJ2, jSONObject2, null, false, adConfig4, mapA, null, this.j).n("CONTAINER");
                                    boolean z5 = false;
                                    try {
                                        C2984d8 c2984d8 = (C2984d8) listN.get(0);
                                        if (contextT != null) {
                                            ArrayList arrayList4 = new ArrayList();
                                            Iterator it3 = c2984d8.s.iterator();
                                            while (it3.hasNext()) {
                                                try {
                                                    U8 u9 = (U8) it3.next();
                                                    it3 = it3;
                                                    if (str10.equals(u9.f23265b) && (u9 instanceof C3051ha)) {
                                                        String str21 = str10;
                                                        String str22 = str19;
                                                        Map map4 = (Map) c3199qe.a(str22, cls);
                                                        str19 = str22;
                                                        String strA5 = G0.a(((C3051ha) u9).g, map4);
                                                        str4 = str20;
                                                        try {
                                                            String str23 = ((C3051ha) u9).f23662h;
                                                            String strA6 = G0.a(u9.d, map4);
                                                            if (B2.a(strA5) && B2.a(str23)) {
                                                                verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(str23, new URL(strA6), strA5);
                                                                Intrinsics.c(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
                                                            } else {
                                                                verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(strA6));
                                                                Intrinsics.c(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
                                                            }
                                                            arrayList4.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
                                                            str10 = str21;
                                                            str20 = str4;
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            str3 = str;
                                                            z5 = false;
                                                            interfaceC3333z5 = this.j;
                                                            if (interfaceC3333z5 != null) {
                                                                str5 = str3;
                                                                ((A5) interfaceC3333z5).b(str2, rf.a(e, H6.a(str2, str5, "Setting up impression tracking for OMID Native Display encountered an unexpected error: ")));
                                                            } else {
                                                                str5 = str3;
                                                            }
                                                            S5 s6 = S5.f23167a;
                                                            S5.d.a(AbstractC3285w5.a(e, str4));
                                                            str7 = str2;
                                                            str6 = str5;
                                                            contextT = contextT;
                                                            z2 = z2;
                                                            it = it;
                                                        }
                                                    }
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    str4 = str20;
                                                }
                                            }
                                            str4 = str20;
                                            if (arrayList4.size() != 0) {
                                                HashMap map5 = c3199qe.f23941b;
                                                String strE2 = this.t.e();
                                                String str24 = (String) c3199qe.f23941b.get("creativeType");
                                                C3163oa c3163oa2 = AbstractC3147na.f23833a;
                                                c3163oa2.getClass();
                                                Context contextD2 = Uc.d();
                                                try {
                                                    if (contextD2 != null) {
                                                        str3 = str;
                                                        try {
                                                            strA = new Sa(contextD2, "omid_js_store").a("omid_js_string");
                                                            if (strA == null) {
                                                                strA = null;
                                                            }
                                                            if (strA == null) {
                                                            }
                                                            AdSessionContext adSessionContextCreateNativeAdSessionContext2 = AdSessionContext.createNativeAdSessionContext(c3163oa2.f23872b, strA, arrayList4, strE2, str24);
                                                            Intrinsics.e(adSessionContextCreateNativeAdSessionContext2, "createNativeAdSessionContext(...)");
                                                            z5 = false;
                                                            map5.put("omidAdSession", new C3035ga("native_display_ad", ImpressionType.VIEWABLE, adSessionContextCreateNativeAdSessionContext2, false));
                                                            c3199qe.f23941b.put("deferred", Boolean.TRUE);
                                                            interfaceC3333z6 = this.j;
                                                            if (interfaceC3333z6 != null) {
                                                                ((A5) interfaceC3333z6).a(str2, "OMID video ad session created and JavaScript resources injected");
                                                            }
                                                            str7 = str2;
                                                            contextT = contextT;
                                                            z2 = z2;
                                                            it = it;
                                                            str6 = str3;
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            z5 = false;
                                                            interfaceC3333z5 = this.j;
                                                            if (interfaceC3333z5 != null) {
                                                                str5 = str3;
                                                                ((A5) interfaceC3333z5).b(str2, rf.a(e, H6.a(str2, str5, "Setting up impression tracking for OMID Native Display encountered an unexpected error: ")));
                                                            } else {
                                                                str5 = str3;
                                                            }
                                                            S5 s7 = S5.f23167a;
                                                            S5.d.a(AbstractC3285w5.a(e, str4));
                                                            str7 = str2;
                                                            str6 = str5;
                                                            contextT = contextT;
                                                            z2 = z2;
                                                            it = it;
                                                        }
                                                    } else {
                                                        str3 = str;
                                                    }
                                                    map5.put("omidAdSession", new C3035ga("native_display_ad", ImpressionType.VIEWABLE, adSessionContextCreateNativeAdSessionContext2, false));
                                                    c3199qe.f23941b.put("deferred", Boolean.TRUE);
                                                    interfaceC3333z6 = this.j;
                                                    if (interfaceC3333z6 != null) {
                                                        ((A5) interfaceC3333z6).a(str2, "OMID video ad session created and JavaScript resources injected");
                                                    }
                                                    str7 = str2;
                                                    contextT = contextT;
                                                    z2 = z2;
                                                    it = it;
                                                    str6 = str3;
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    interfaceC3333z5 = this.j;
                                                    if (interfaceC3333z5 != null) {
                                                        str5 = str3;
                                                        ((A5) interfaceC3333z5).b(str2, rf.a(e, H6.a(str2, str5, "Setting up impression tracking for OMID Native Display encountered an unexpected error: ")));
                                                    } else {
                                                        str5 = str3;
                                                    }
                                                    S5 s8 = S5.f23167a;
                                                    S5.d.a(AbstractC3285w5.a(e, str4));
                                                    str7 = str2;
                                                    str6 = str5;
                                                    contextT = contextT;
                                                    z2 = z2;
                                                    it = it;
                                                }
                                                strA = ";(function(omidGlobal) {\n  var n;function aa(a){var b=0;return function(){return b<a.length?{done:!1,value:a[b++]}:{done:!0}}}function p(a){var b='undefined'!=typeof Symbol&&Symbol.iterator&&a[Symbol.iterator];if(b)return b.call(a);if('number'==typeof a.length)return{next:aa(a)};throw Error(String(a)+' is not an iterable or ArrayLike');}function q(a){if(!(a instanceof Array)){a=p(a);for(var b,c=[];!(b=a.next()).done;)c.push(b.value);a=c}return a}\nvar ca='function'==typeof Object.create?Object.create:function(a){function b(){}b.prototype=a;return new b},t='function'==typeof Object.defineProperties?Object.defineProperty:function(a,b,c){if(a==Array.prototype||a==Object.prototype)return a;a[b]=c.value;return a};\nfunction da(a){a=['object'==typeof globalThis&&globalThis,a,'object'==typeof window&&window,'object'==typeof self&&self,'object'==typeof global&&global];for(var b=0;b<a.length;++b){var c=a[b];if(c&&c.Math==Math)return c}throw Error('Cannot find global object');}var ea=da(this);function u(a,b){if(b)a:{var c=ea;a=a.split('.');for(var d=0;d<a.length-1;d++){var e=a[d];if(!(e in c))break a;c=c[e]}a=a[a.length-1];d=c[a];b=b(d);b!=d&&null!=b&&t(c,a,{configurable:!0,writable:!0,value:b})}}var fa;\nif('function'==typeof Object.setPrototypeOf)fa=Object.setPrototypeOf;else{var ha;a:{var ia={a:!0},ja={};try{ja.__proto__=ia;ha=ja.a;break a}catch(a){}ha=!1}fa=ha?function(a,b){a.__proto__=b;if(a.__proto__!==b)throw new TypeError(a+' is not extensible');return a}:null}var ka=fa;\nfunction v(a,b){a.prototype=ca(b.prototype);a.prototype.constructor=a;if(ka)ka(a,b);else for(var c in b)if('prototype'!=c)if(Object.defineProperties){var d=Object.getOwnPropertyDescriptor(b,c);d&&Object.defineProperty(a,c,d)}else a[c]=b[c];a.La=b.prototype}function w(){for(var a=Number(this),b=[],c=a;c<arguments.length;c++)b[c-a]=arguments[c];return b}function x(a,b){return Object.prototype.hasOwnProperty.call(a,b)}\nvar la='function'==typeof Object.assign?Object.assign:function(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(d)for(var e in d)x(d,e)&&(a[e]=d[e])}return a};u('Object.assign',function(a){return a||la});\nu('Symbol',function(a){function b(f){if(this instanceof b)throw new TypeError('Symbol is not a constructor');return new c(d+(f||'')+'_'+e++,f)}function c(f,h){this.g=f;t(this,'description',{configurable:!0,writable:!0,value:h})}if(a)return a;c.prototype.toString=function(){return this.g};var d='jscomp_symbol_'+(1E9*Math.random()>>>0)+'_',e=0;return b});\nu('Symbol.iterator',function(a){if(a)return a;a=Symbol('Symbol.iterator');for(var b='Array Int8Array Uint8Array Uint8ClampedArray Int16Array Uint16Array Int32Array Uint32Array Float32Array Float64Array'.split(' '),c=0;c<b.length;c++){var d=ea[b[c]];'function'===typeof d&&'function'!=typeof d.prototype[a]&&t(d.prototype,a,{configurable:!0,writable:!0,value:function(){return ma(aa(this))}})}return a});function ma(a){a={next:a};a[Symbol.iterator]=function(){return this};return a}\nu('WeakMap',function(a){function b(g){this.g=(k+=Math.random()+1).toString();if(g){g=p(g);for(var l;!(l=g.next()).done;)l=l.value,this.set(l[0],l[1])}}function c(){}function d(g){var l=typeof g;return'object'===l&&null!==g||'function'===l}function e(g){if(!x(g,h)){var l=new c;t(g,h,{value:l})}}function f(g){var l=Object[g];l&&(Object[g]=function(m){if(m instanceof c)return m;Object.isExtensible(m)&&e(m);return l(m)})}if(function(){if(!a||!Object.seal)return!1;try{var g=Object.seal({}),l=Object.seal({}),\nm=new a([[g,2],[l,3]]);if(2!=m.get(g)||3!=m.get(l))return!1;m.delete(g);m.set(l,4);return!m.has(g)&&4==m.get(l)}catch(r){return!1}}())return a;var h='$jscomp_hidden_'+Math.random();f('freeze');f('preventExtensions');f('seal');var k=0;b.prototype.set=function(g,l){if(!d(g))throw Error('Invalid WeakMap key');e(g);if(!x(g,h))throw Error('WeakMap key fail: '+g);g[h][this.g]=l;return this};b.prototype.get=function(g){return d(g)&&x(g,h)?g[h][this.g]:void 0};b.prototype.has=function(g){return d(g)&&x(g,\nh)&&x(g[h],this.g)};b.prototype.delete=function(g){return d(g)&&x(g,h)&&x(g[h],this.g)?delete g[h][this.g]:!1};return b});\nu('Map',function(a){function b(){var k={};return k.H=k.next=k.head=k}function c(k,g){var l=k.g;return ma(function(){if(l){for(;l.head!=k.g;)l=l.H;for(;l.next!=l.head;)return l=l.next,{done:!1,value:g(l)};l=null}return{done:!0,value:void 0}})}function d(k,g){var l=g&&typeof g;'object'==l||'function'==l?f.has(g)?l=f.get(g):(l=''+ ++h,f.set(g,l)):l='p_'+g;var m=k.h[l];if(m&&x(k.h,l))for(k=0;k<m.length;k++){var r=m[k];if(g!==g&&r.key!==r.key||g===r.key)return{id:l,list:m,index:k,B:r}}return{id:l,list:m,\nindex:-1,B:void 0}}function e(k){this.h={};this.g=b();this.size=0;if(k){k=p(k);for(var g;!(g=k.next()).done;)g=g.value,this.set(g[0],g[1])}}if(function(){if(!a||'function'!=typeof a||!a.prototype.entries||'function'!=typeof Object.seal)return!1;try{var k=Object.seal({x:4}),g=new a(p([[k,'s']]));if('s'!=g.get(k)||1!=g.size||g.get({x:4})||g.set({x:4},'t')!=g||2!=g.size)return!1;var l=g.entries(),m=l.next();if(m.done||m.value[0]!=k||'s'!=m.value[1])return!1;m=l.next();return m.done||4!=m.value[0].x||\n't'!=m.value[1]||!l.next().done?!1:!0}catch(r){return!1}}())return a;var f=new WeakMap;e.prototype.set=function(k,g){k=0===k?0:k;var l=d(this,k);l.list||(l.list=this.h[l.id]=[]);l.B?l.B.value=g:(l.B={next:this.g,H:this.g.H,head:this.g,key:k,value:g},l.list.push(l.B),this.g.H.next=l.B,this.g.H=l.B,this.size++);return this};e.prototype.delete=function(k){k=d(this,k);return k.B&&k.list?(k.list.splice(k.index,1),k.list.length||delete this.h[k.id],k.B.H.next=k.B.next,k.B.next.H=k.B.H,k.B.head=null,this.size--,\n!0):!1};e.prototype.clear=function(){this.h={};this.g=this.g.H=b();this.size=0};e.prototype.has=function(k){return!!d(this,k).B};e.prototype.get=function(k){return(k=d(this,k).B)&&k.value};e.prototype.entries=function(){return c(this,function(k){return[k.key,k.value]})};e.prototype.keys=function(){return c(this,function(k){return k.key})};e.prototype.values=function(){return c(this,function(k){return k.value})};e.prototype.forEach=function(k,g){for(var l=this.entries(),m;!(m=l.next()).done;)m=m.value,\nk.call(g,m[1],m[0],this)};e.prototype[Symbol.iterator]=e.prototype.entries;var h=0;return e});u('Object.values',function(a){return a?a:function(b){var c=[],d;for(d in b)x(b,d)&&c.push(b[d]);return c}});function na(a,b){a instanceof String&&(a+='');var c=0,d=!1,e={next:function(){if(!d&&c<a.length){var f=c++;return{value:b(f,a[f]),done:!1}}d=!0;return{done:!0,value:void 0}}};e[Symbol.iterator]=function(){return e};return e}u('Array.prototype.keys',function(a){return a?a:function(){return na(this,function(b){return b})}});\nu('Set',function(a){function b(c){this.g=new Map;if(c){c=p(c);for(var d;!(d=c.next()).done;)this.add(d.value)}this.size=this.g.size}if(function(){if(!a||'function'!=typeof a||!a.prototype.entries||'function'!=typeof Object.seal)return!1;try{var c=Object.seal({x:4}),d=new a(p([c]));if(!d.has(c)||1!=d.size||d.add(c)!=d||1!=d.size||d.add({x:4})!=d||2!=d.size)return!1;var e=d.entries(),f=e.next();if(f.done||f.value[0]!=c||f.value[1]!=c)return!1;f=e.next();return f.done||f.value[0]==c||4!=f.value[0].x||\nf.value[1]!=f.value[0]?!1:e.next().done}catch(h){return!1}}())return a;b.prototype.add=function(c){c=0===c?0:c;this.g.set(c,c);this.size=this.g.size;return this};b.prototype.delete=function(c){c=this.g.delete(c);this.size=this.g.size;return c};b.prototype.clear=function(){this.g.clear();this.size=0};b.prototype.has=function(c){return this.g.has(c)};b.prototype.entries=function(){return this.g.entries()};b.prototype.values=function(){return this.g.values()};b.prototype.keys=b.prototype.values;b.prototype[Symbol.iterator]=\nb.prototype.values;b.prototype.forEach=function(c,d){var e=this;this.g.forEach(function(f){return c.call(d,f,f,e)})};return b});u('Object.is',function(a){return a?a:function(b,c){return b===c?0!==b||1/b===1/c:b!==b&&c!==c}});u('Array.prototype.includes',function(a){return a?a:function(b,c){var d=this;d instanceof String&&(d=String(d));var e=d.length;c=c||0;for(0>c&&(c=Math.max(c+e,0));c<e;c++){var f=d[c];if(f===b||Object.is(f,b))return!0}return!1}});\nu('String.prototype.includes',function(a){return a?a:function(b,c){if(null==this)throw new TypeError(\"The 'this' value for String.prototype.includes must not be null or undefined\");if(b instanceof RegExp)throw new TypeError('First argument to String.prototype.includes must not be a regular expression');return-1!==this.indexOf(b,c||0)}});u('Object.entries',function(a){return a?a:function(b){var c=[],d;for(d in b)x(b,d)&&c.push([d,b[d]]);return c}});\nu('Array.prototype.values',function(a){return a?a:function(){return na(this,function(b,c){return c})}});\nvar y={xa:'loaded',Fa:'start',ra:'firstQuartile',Aa:'midpoint',Ga:'thirdQuartile',pa:'complete',Ba:'pause',Da:'resume',oa:'bufferStart',na:'bufferFinish',Ea:'skipped',Ja:'volumeChange',Ca:'playerStateChange',ka:'adUserInteraction'},oa={ua:'generic',Ia:'video',za:'media'},pa={ca:'native',va:'html',V:'javascript'},qa={ca:'native',V:'javascript',NONE:'none'},ra={ta:'full',qa:'domain',wa:'limited'},sa={ma:'backgrounded',sa:'foregrounded'},ta={ya:'locked',Ha:'unlocked'},ua={la:'app',Ka:'web'};function z(a,b){this.x=null!=a.x?a.x:a.left;this.y=null!=a.y?a.y:a.top;this.width=a.width;this.height=a.height;this.endX=this.x+this.width;this.endY=this.y+this.height;this.adSessionId=a.adSessionId||void 0;this.isFriendlyObstructionFor=a.isFriendlyObstructionFor||[];this.h=a.friendlyObstructionClass||void 0;this.i=a.friendlyObstructionPurpose||void 0;this.j=a.friendlyObstructionReason||void 0;this.clipsToBounds=void 0!==a.clipsToBounds?!0===a.clipsToBounds:!0;this.m=void 0!==a.hasWindowFocus?!0===\na.hasWindowFocus:!0;this.notVisibleReason=a.notVisibleReason||void 0;this.noOutputDevice=a.noOutputDevice||void 0;this.isPipActive='true'===a.isPipActive||!0===a.isPipActive||!1;this.childViews=a.childViews||[];this.isCreative=a.isCreative||!1;this.g=b}function va(a){var b={};return b.width=a.width,b.height=a.height,b}function A(a){var b={};return Object.assign({},va(a),(b.x=a.x,b.y=a.y,b))}function C(a){var b=A(a),c={};return Object.assign({},b,(c.endX=a.endX,c.endY=a.endY,c))}\nfunction wa(a,b,c){a.x+=b;a.y+=c;a.endX+=b;a.endY+=c}z.prototype.N=function(a){if(null==a)return!1;a=A(a);var b=a.y,c=a.width,d=a.height;return this.x===a.x&&this.y===b&&this.width===c&&this.height===d};function xa(a){return a.width*a.height}function D(a){return 0===a.width||0===a.height};function ya(a,b){a=A(a);for(var c=[],d=[],e=0;e<b.length;e++){var f=A(b[e]);f=za(a,f);E(c,f.x);E(c,f.endX);E(d,f.y);E(d,f.endY)}c=c.sort(function(h,k){return h-k});d=d.sort(function(h,k){return h-k});return{ia:c,ja:d}}function za(a,b){return{x:Math.max(a.x,b.x),y:Math.max(a.y,b.y),endX:Math.min(a.x+a.width,b.x+b.width),endY:Math.min(a.y+a.height,b.y+b.height)}}function E(a,b){-1===a.indexOf(b)&&a.push(b)};function H(){this.h=this.g=this.D=this.u=this.m=this.s=void 0;this.A=0;this.l=[];this.v=[];this.C=0;this.o=[];this.j=[];this.i=[]}H.prototype.N=function(a){return null==a?!1:JSON.stringify(Aa(this))===JSON.stringify(Aa(a))};\nfunction Aa(a){var b=[],c=[],d={viewport:a.s,adView:{percentageInView:a.A,pixelsInView:a.C,reasons:a.i},declaredFriendlyObstructions:a.l.length};if(void 0!==a.g){d.adView.geometry=A(a.g);d.adView.geometry.pixels=xa(a.g);d.adView.onScreenGeometry=A(a.h);d.adView.onScreenGeometry.pixels=Ba(a);for(var e=0;e<a.j.length;e++)b.push(A(a.j[e]));for(e=0;e<a.v.length;e++){var f=a.v[e],h=f,k={};h.h&&(k.obstructionClass=h.h);h.i&&(k.obstructionPurpose=h.i);h.j&&(k.obstructionReason=h.j);f=za(a.g,f);c.push(Object.assign({},\n{x:f.x,y:f.y,width:f.endX-f.x,height:f.endY-f.y},k))}d.adView.onScreenGeometry.obstructions=b;d.adView.onScreenGeometry.friendlyObstructions=c;void 0!==a.u&&void 0!==a.D&&(d.adView.containerGeometry=A(a.u),d.adView.onScreenContainerGeometry=A(a.D),d.adView.measuringElement=!0)}return d}function Ca(a,b){b=va(b);a.s={};a.s.width=b.width;a.s.height=b.height;a.m={};a.m.x=0;a.m.y=0;a.m.width=b.width;a.m.height=b.height;a.m.endX=b.width;a.m.endY=b.height}\nfunction Da(){return{x:0,y:0,endX:0,endY:0,width:0,height:0}}function Ea(a,b){var c={};c.x=Math.max(a.x,b.x);c.y=Math.max(a.y,b.y);c.endX=Math.min(a.endX,b.endX);c.endY=Math.min(a.endY,b.endY);c.width=Math.max(0,c.endX-c.x);c.height=Math.max(0,c.endY-c.y);return c}function Fa(a,b){return.01<b.width-a.width||.01<b.height-a.height}function Ga(a){if(-1!==a.i.indexOf('backgrounded'))a.A=0,a.C=0;else{var b=xa(a.g);if(0!==b){var c=Ba(a);a.A=Math.round(c/b*100);a.C=c}}}\nfunction Ha(a,b){if(D(b)||!a.h)b=!1;else{var c=C(a.h),d=c.y,e=c.endX;a=c.endY;var f=b.endX;c=c.x;(f=f<c||.01>Math.abs(f-c))||(f=b.x,f=f>e||.01>Math.abs(f-e));(e=f)||(e=b.endY,e=e<d||.01>Math.abs(e-d));(d=e)||(b=b.y,d=b>a||.01>Math.abs(b-a));b=!d}return b}function I(a,b){for(var c=!1,d=0;d<a.i.length;d++)a.i[d]===b&&(c=!0);c||a.i.push(b)}\nfunction Ba(a){var b=Math,c=b.max,d=xa(a.h),e=a.j,f=0;if(0<e.length){var h=ya(a.h,e);a=h.ia;h=h.ja;for(var k=0;k<a.length-1;k++)for(var g=(a[k]+(a[k]+1))/2,l=a[k+1]-a[k],m=0;m<h.length-1;m++){for(var r=(h[m]+(h[m]+1))/2,F=h[m+1]-h[m],ba=!1,R=0;R<e.length;R++){var G=A(e[R]);if(G.x<g&&G.x+G.width>g&&G.y<r&&G.y+G.height>r){ba=!0;break}}ba&&(f+=Math.round(l)*Math.round(F))}}return c.call(b,0,d-f)};function Ia(){};function Ja(){}\nfunction Ka(a,b,c,d,e,f){var h=new H;b=new z(b,!1);Ca(h,b);La(a,b,h,d);if(!e)return h.i=['unmeasurable'],h.s=void 0,h.A=0,h.j=[],h.g&&(a=h.g,c={},a=new z((c.x=0,c.y=0,c.width=a.width,c.height=a.height,c),a.g),h.g=a),h.h=Da(),h;'locked'===f&&I(h,'deviceLocked');if(b.noOutputDevice)I(h,'backgrounded'),I(h,'noOutputDevice');else if('backgrounded'===c)I(h,'backgrounded');else if(void 0!==h.g){for(a=0;a<h.l.length;a++)Ha(h,h.l[a])&&h.v.push(h.l[a]);for(a=0;a<h.o.length;a++){if(c=Ha(h,h.o[a])){a:{c=h.o[a];\nfor(d=0;d<h.j.length;d++)if(h.j[d].N(c)){c=!0;break a}c=!1}c=!c}c&&(I(h,'obstructed'),h.j.push(h.o[a]))}Ga(h)}else I(h,'notFound');return h}\nfunction La(a,b,c,d){var e=b.isCreative?!0:b.adSessionId===d;if(e){c.g=b;var f=C(c.g);a=Ea(c.m,f);var h=c.g;'notAttached'===h.notVisibleReason||'noWindowFocus'===h.notVisibleReason||'noAdView'===h.notVisibleReason?(I(c,'notFound'),c.h=new z(Da(),!1)):(h=c.g,'viewInvisible'===h.notVisibleReason||'viewGone'===h.notVisibleReason||'viewNotVisible'===h.notVisibleReason||'viewAlphaZero'===h.notVisibleReason||'viewHidden'===h.notVisibleReason||void 0!==c.g.notVisibleReason||D(c.g)?(I(c,'hidden'),c.h=new z(Da(),\n!1)):(c.g.isPipActive&&I(c,'pictureInPicture'),c.g.m||(I(c,'backgrounded'),I(c,'noWindowFocus')),Fa(a,f)&&I(c,'clipped'),c.h=new z(a,!1)))}else if(f=!0,b.g&&(f=-1!==b.isFriendlyObstructionFor.indexOf(d)?!1:!1===b.clipsToBounds),f){h=b.childViews;for(var k=0;k<h.length;k++)f=void 0!==c.g,La(a,new z(h[k],f),c,d)}e||void 0===c.g||(b.g?-1!==b.isFriendlyObstructionFor.indexOf(d)?c.l.push(b):c.o.push(b):(e=C(b),d=C(c.h),A(c.h),!D(c.h)&&b.clipsToBounds&&(b=Ea(d,e),Fa(b,d)&&(I(c,'clipped'),c.h=new z(b,!1)))))}\n;function Ma(){this.h=new Map;this.g=null}function Na(){Oa||(Oa=new Ma);return Oa}var Oa=null;function Pa(a,b){this.y=this.x=0;this.width=a;this.height=b};function Qa(){this.adSessionId=null;this.m={apiVersion:'1.0',accessMode:'limited',environment:'app',omidJsInfo:{omidImplementer:'omsdk',serviceVersion:'1.5.5-iab77'}};this.C=null;this.A='foregrounded';this.M='unlocked';this.u=this.o='none';this.s=this.j=this.i=this.l=this.h=this.g=this.J=this.D=null;this.I=!0;this.v=new Map}\nfunction Ra(a,b){void 0!==b.contentUrl&&(a.C=b.contentUrl,b.contentUrl=void 0);var c=a.m||{};b.omidJsInfo=Object.assign({},c.omidJsInfo||{},b.omidJsInfo||{});b=Object.assign({},c,b);a.I||(null!=a.j?(b.videoElement=a.j,b.accessMode='full'):null!=a.i&&(b.slotElement=a.i,b.accessMode='full'));a.m=b};var J=function(){if('undefined'!==typeof omidGlobal&&omidGlobal)return omidGlobal;if('undefined'!==typeof global&&global)return global;if('undefined'!==typeof window&&window)return window;if('undefined'!==typeof globalThis&&globalThis)return globalThis;var a=Function('return this')();if(a)return a;throw Error('Could not determine global object context.');}();function Sa(a,b){this.g=a;this.h=b}ea.Object.defineProperties(Sa.prototype,{event:{configurable:!0,enumerable:!0,get:function(){return this.g}},origin:{configurable:!0,enumerable:!0,get:function(){return this.h}}});function K(){var a=w.apply(0,arguments);Ta(function(){throw new (Function.prototype.bind.apply(Error,[null,'Could not complete the test successfully - '].concat(q(a))));},function(){return console.error.apply(console,q(a))})}function Ua(){var a=w.apply(0,arguments);Ta(function(){},function(){return console.error.apply(console,q(a))})}function Ta(a,b){'undefined'!==typeof jasmine&&jasmine?a():'undefined'!==typeof console&&console&&console.error&&b()};function Va(a){this.g=a;this.m=[];this.i=[];this.j=[];this.l=[];this.o={}}function Wa(a,b){if(void 0!==a.g&&a.g.adSessionId&&!1!==Xa(a,b)){var c=b.event;a.j.filter(function(d){return d.type===c.type}).forEach(function(d){a.h(d.G,c)})}}function Ya(a,b){a.m.push(b);Wa(a,b)}function Za(a,b,c){void 0!==a.g&&a.g.adSessionId&&a.m.filter(function(d){return d.event.type===b&&Xa(a,d)}).map(function(d){return d.event}).forEach(function(d){a.h(c.G,d)})}\nfunction Xa(a,b){var c=b.event.type,d=-1!==Object.values(y).indexOf(c)&&'volumeChange'!==c;return'impression'===c||'loaded'===c&&a.g.h?b.origin===a.g.u:d?b.origin===a.g.o:!0}function $a(a,b,c){Object.keys(y).forEach(function(d){d=y[d];var e={type:d,R:c,G:b};a.j.push(e);Za(a,d,e)})}function ab(a,b,c,d){var e={U:c,R:d,G:b};a.l.push(e);a.i.forEach(function(f){var h=bb(f);'sessionStart'===f.event.type&&cb(a,h,e);a.h(e.G,h)})}\nfunction db(a,b,c){var d=L(a,'sessionError','native',{errorType:b,message:c});a.i.push(d);a.l.forEach(function(e){a.h(e.G,d.event)})}function eb(a,b){a.o=Object.assign(a.o,b);b=a.g.m;if(void 0!==b){b=Object.assign({},fb(gb(a,hb(a,{context:b}),!0)),{supportsLoadedEvent:!!a.g.h||'video'==a.g.g});Object.assign(b,{pageUrl:null,contentUrl:a.g.C});var c=L(a,'sessionStart','native',b);a.i.push(c);a.l.forEach(function(d){var e=bb(c);cb(a,e,d);a.h(d.G,e)},a);ib(a)}}\nfunction cb(a,b,c){c.U&&(b.data.verificationParameters=a.o[c.U]);c.R&&(c=a.g.v.get(c.R))&&(b.data.verificationParameters=c.verificationParameters,b.data.context.accessMode=c.accessMode,'full'===c.accessMode&&(a.g.j&&(b.data.context.videoElement=a.g.j),a.g.i&&(b.data.context.slotElement=a.g.i)))}function jb(a){var b=L(a,'sessionFinish','native');a.i.push(b);a.l.forEach(function(c){a.h(c.G,b.event)})}Va.prototype.h=function(a){var b=w.apply(1,arguments);try{a.apply(null,q(b))}catch(c){Ua(c)}};\nfunction kb(a,b){var c=(c=a.g.K)?Aa(c):null;c=gb(a,hb(a,c));Ya(a,L(a,'impression',b,c))}function lb(a,b,c){if(a.g.h||'display'!=a.g.g)b=L(a,'loaded',b,gb(a,hb(a,void 0===c?null:c))),Ya(a,b)}\nfunction mb(a,b,c,d){'start'!==b&&'volumeChange'!==b||null!=(d&&d.deviceVolume)||(d.deviceVolume=a.g.D);if(d&&('start'===b||'volumeChange'===b)){var e=d.videoPlayerVolume,f=d.mediaPlayerVolume;null!=e?(Object.assign(d,{mediaPlayerVolume:e}),a.g.J=e):null!=f&&(Object.assign(d,{videoPlayerVolume:f}),a.g.J=f)}Ya(a,L(a,b,c,d))}\nfunction ib(a){var b=a.m.filter(function(f){return Object.values(y).includes(f.event.type)&&'video'==a.g.g&&f.origin===a.g.o||'loaded'==f.event.type&&'display'==a.g.g&&f.origin===a.g.u?!0:!1}).map(function(f){return f.event}),c=a.g.adSessionId||'',d={};b=p(b);for(var e=b.next();!e.done;d={F:d.F},e=b.next()){d.F=e.value;d.F.adSessionId||(d.F.adSessionId=c);if('loaded'==d.F.type){if(!a.g.h&&'display'==a.g.g)continue;d.F.data=gb(a,hb(a,d.F.data))}a.j.filter(function(f){return function(h){return h.type===\nf.F.type}}(d)).forEach(function(f){return function(h){return h.G(f.F)}}(d))}}function nb(a,b,c){a:{c=new Set(c);a=p(a.m.concat(a.i));for(var d=a.next();!d.done;d=a.next())if(d=d.value,c.has(d.event.type)&&d.origin!=b){b=!0;break a}b=!1}return b?(K('Event owner cannot be registered after its events have already been published.'),!1):!0}function ob(a,b){nb(a,b,Object.values(y))&&pb(a,b)&&(a.g.o=b)}function qb(a,b){nb(a,b,['impression'])&&rb(a,b)&&(a.g.u=b)}\nfunction rb(a,b){var c=a.g.u;return'none'!=c&&c!=b?(K('Impression event is owned by '+(a.g.u+', not ')+(b+'.')),!1):!0}function pb(a,b){var c=a.g.o;return'none'!=c&&c!=b?(K('Media events are owned by '+(a.g.o+', not '+b+'.')),!1):!0}function gb(a,b,c){c=void 0===c?!1:c;b=Object.assign({},b);a.g.g&&Object.assign(b,{mediaType:a.g.g});a.g.h&&(c||'definedByJavaScript'!==a.g.h)&&Object.assign(b,{creativeType:a.g.h});return b}function fb(a){var b=Na().g;return b?Object.assign({},a,{lastActivity:b}):a}\nfunction hb(a,b){return a.g.l?Object.assign({},b,{impressionType:a.g.l}):b}function L(a,b,c,d){return new Sa({adSessionId:a.g.adSessionId||'',timestamp:(new Date).getTime(),type:b,data:d},c)}function bb(a){a=a.event;var b=a.data?Object.assign({},a.data):void 0;'sessionStart'===a.type&&(b.context=Object.assign({},b.context));return{adSessionId:a.adSessionId,timestamp:a.timestamp,type:a.type,data:b}};function sb(a,b,c){this.h=a;this.i=b;this.g=c}\nfunction M(a,b,c){'container'===b&&void 0!==a.g.L&&void 0!==a.g&&null!=a.g.adSessionId&&(a.g.O=Ka(a.i,a.g.L,a.g.A,a.g.adSessionId,!0,a.g.M));b=a.g;var d=b.O,e=b.P;if(d)if(e){b=new H;var f=d.s,h=d.g,k=d.h,g=e.g,l=e.h;f&&h&&k&&g&&l&&(Ca(b,f),b.u=new z(h,!1),b.D=new z(k,!1),b.o=Object.assign([],d.o),b.j=Object.assign([],d.j),b.l=Object.assign([],d.l),b.v=Object.assign([],d.v),b.i=Object.assign([],e.i,d.i),d=b.u.x,e=b.u.y,g=new z(g,!1),l=new z(l,!1),wa(g,d,e),wa(l,d,e),b.g=g,b.h=Ea(l,k),Ga(b))}else b=\nd;else b=null;k=a.g.K;if(b&&!b.N(k)||c)k=Aa(b),c&&(k.adView.reasons=k.adView.reasons||[c]),c=a.h,'audio'!=c.g.h&&Ya(c,L(c,'geometryChange','native',k)),a.g.K=b};function tb(){var a;this.g=a=void 0===a?omidGlobal:a}tb.prototype.setInterval=function(a,b){return ub(this,'setInterval')(a,b)};tb.prototype.clearInterval=function(a){ub(this,'clearInterval')(a)};function vb(a,b){ub(a,'clearTimeout')(b)}function ub(a,b){return a.g&&a.g[b]?a.g[b]:wb(a,b)}\nfunction xb(a,b,c,d){if(a.g.document&&a.g.document.body){var e=a.g.document.createElement('img');e.width=1;e.height=1;e.style.display='none';e.src=b;c&&e.addEventListener('load',function(){return c()});d&&e.addEventListener('error',function(){return d()});a.g.document.body.appendChild(e)}else wb(a,'sendUrl')(b,c,d)}function wb(a,b){if(a.g&&a.g.omidNative&&a.g.omidNative[b])return a.g.omidNative[b].bind(a.g.omidNative);throw Error('Native interface method \"'+b+'\" not found.');};function N(a){return'object'===typeof a}function O(a){return'number'===typeof a&&!isNaN(a)&&0<=a}function P(a){return'string'===typeof a}function Q(a,b){return P(a)&&-1!==Object.values(b).indexOf(a)}function yb(a){return!(!a||!a.tagName||'iframe'!==a.tagName.toLowerCase())};function S(a,b,c,d,e){this.j=a;this.ba=b;this.L=c;this.i=d;this.P=e;this.h=null;this.g=this.m=this.D=void 0;this.O=!0;this.J=void 0;zb(this)}\nfunction zb(a){if(!a.h){var b;a:{if((b=a.j.document)&&b.getElementsByClassName&&(b=b.getElementsByClassName('omid-element'))){if(1==b.length){b=b[0];break a}1<b.length&&a.O&&(db(a.L,'generic',\"More than one element with 'omid-element' class name.\"),a.O=!1)}b=null}if(b&&b.tagName&&'video'===b.tagName.toLowerCase())a.i.j=b;else if(b&&b.tagName)a.i.i=b;else return;Ab(a)}}function Ab(a){a.i.j?(a.h=a.i.j,a.o()):a.i.i&&(a.h=a.i.i,yb(a.h)?a.i.s&&a.o():a.o())}\nfunction Bb(a){a.g&&(yb(a.h)?a.i.s&&(a.K(),Cb(a)):(a.K(),Cb(a)))}S.prototype.A=function(){this.J&&(this.j.document.removeEventListener('visibilitychange',this.J),this.J=void 0)};S.prototype.o=function(){};function Cb(a){a.D&&(a.i.P=a.D,M(a.ba,'creative'))}function Db(a){if(a.g&&a.i.s){var b=new z(a.i.s,!1);wa(b,a.g.x,a.g.y);b.clipsToBounds=!0;return b}};function T(a,b,c,d,e,f){S.call(this,a,c,d,e,f);this.s=b;this.l=void 0}v(T,S);T.prototype.A=function(){void 0!==this.l&&(this.P.clearInterval(this.l),this.l=void 0);S.prototype.A.call(this)};T.prototype.o=function(){var a=this;S.prototype.o.call(this);null==this.h?this.l=void 0:void 0===this.l&&(this.l=this.P.setInterval(function(){return Eb(a)},200),Eb(this))};\nT.prototype.K=function(){if(this.m){var a=Db(this);if(a){this.g.isCreative=!1;a.isCreative=!0;for(var b=!1,c=0;c<this.g.childViews.length;c++)if(this.g.childViews[c].isCreative){this.g.childViews[c]=a;b=!0;break}b||this.g.childViews.push(a)}else this.g.isCreative=!0;this.D=Ka(this.s,this.m,this.i.A,this.i.adSessionId,this.I())}};T.prototype.I=function(){return!0};\nfunction Eb(a){if(void 0!==a.l){b:{try{var b=a.j.top;var c=0<=b.innerHeight&&0<=b.innerWidth;break b}catch(d){}c=!1}c?(c=a.j.top,c=new z(new Pa(c.innerWidth,c.innerHeight),!1)):c=new z(new Pa(0,0),!1);b=a.h.getBoundingClientRect();if(null==b.x||isNaN(b.x))b.x=b.left;if(null==b.y||isNaN(b.y))b.y=b.top;b=new z(b,!1);c.N(a.m)&&b.N(a.g)||(a.g=b,a.g.clipsToBounds=!0,a.m=c,a.m.childViews.push(a.g),Bb(a))}};function U(a,b,c,d,e,f){S.call(this,a,c,d,e,f);this.v=this.s=this.u=this.l=void 0;this.M=!1;this.C=void 0}v(U,S);U.prototype.A=function(){this.l&&this.l.disconnect();Fb(this);S.prototype.A.call(this)};U.prototype.o=function(){S.prototype.o.call(this);if(this.h&&(this.l||(this.l=Gb(this)),Hb(this),Ib(this.h)&&Jb(this),'backgrounded'===this.i.A)){var a=Kb(new Pa(0,0));this.C=this.g=this.m=a;Bb(this)}};\nU.prototype.K=function(){if(this.g&&this.C){var a=Db(this);if(a){var b=a;var c=this.C;var d=Math.max(a.x,c.x);var e=Math.max(a.y,c.y),f=Math.min(a.endX,c.endX);a=Math.min(a.endY,c.endY);f<=d||a<=e?d=null:(c={},d=new z((c.x=d,c.y=e,c.width=Math.abs(f-d),c.height=Math.abs(a-e),c),!1));d||(d=new z({x:0,y:0,width:0,height:0},!1))}else b=this.g,d=this.C;e=new H;this.m&&Ca(e,this.m);e.g=b;e.h=d;Ga(e);this.M?D(e.g)?I(e,'hidden'):100===e.A||I(e,'clipped'):I(e,'viewport');this.D=e}};U.prototype.I=function(){return!0};\nfunction Fb(a){a.u&&(a.u.disconnect(),a.u=void 0);a.s&&(a.s.disconnect(),a.s=void 0);a.v&&((0,a.j.removeEventListener)('resize',a.v),a.v=void 0)}function Hb(a){a.l&&a.h&&(a.l.unobserve(a.h),a.l.observe(a.h))}function Ib(a){a=a.getBoundingClientRect();return 0==a.width||0==a.height}\nfunction Gb(a){return new a.j.IntersectionObserver(function(b){try{if(b.length){for(var c,d=b[0],e=1;e<b.length;e++)b[e].time>d.time&&(d=b[e]);c=d;a.m=Kb(c.rootBounds);a.g=Kb(c.boundingClientRect);a.C=Kb(c.intersectionRect);a.M=!!c.isIntersecting;Bb(a)}}catch(f){a.A(),db(a.L,'generic','Problem handling IntersectionObserver callback: '+f.message)}},{root:null,rootMargin:'0px',threshold:[0,.1,.2,.3,.4,.5,.6,.7,.8,.9,1]})}\nfunction Jb(a){a.j.ResizeObserver?a.u||(a.u=Lb(a,function(){return Mb(a)}),a.u.observe(a.h)):(a.v||(a.v=function(){return Mb(a)},(0,a.j.addEventListener)('resize',a.v)),a.s||(a.s=new MutationObserver(function(){return Mb(a)}),a.s.observe(a.h,{childList:!1,attributes:!0,subtree:!1})))}function Mb(a){a.h&&!Ib(a.h)&&(Hb(a),Fb(a))}function Lb(a,b){return new a.j.ResizeObserver(b)}function Kb(a){if(a&&null!==a.x&&null!==a.y&&null!==a.width&&null!==a.height)return new z(a,!1)};function Nb(a){if('object'===typeof a&&'object'===typeof a.webOSSystem)return a.webOSSystem}function Ob(a){if('object'===typeof a&&'object'===typeof a.tizen)return a.tizen}function Pb(a){return'object'===typeof Ob(a)};function Qb(a,b){this.h=a;this.g=b};function Sb(){return'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g,function(a){var b=16*Math.random()|0;return'y'===a?(b&3|8).toString(16):b.toString(16)})};function Tb(a,b){var c=void 0===c?J:c;this.j=a;this.g=c;this.i=b;this.h=[]}\nfunction Ub(a){if(!a.g||!a.g.document)throw Error('OMID Service Script is not running within a window.');var b=a.h;a.h=[];b.forEach(function(c){try{var d=a.i.I?'limited':'full',e=Q(c.accessMode,ra)?c.accessMode:null;var f=e?'full'==e&&'limited'==d?d:'domain'==e?'limited':e:d;c.accessMode=f;a:{var h=c.resourceUrl,k=a.g.location.origin;try{var g=new URL(h,k);break a}catch(F){}try{g=new URL(h);break a}catch(F){}g=null}if(d=g){var l=Sb();Vb(a,l,d,f);var m=c.vendorKey,r=c.verificationParameters;m=void 0===\nm?'':m;r=void 0===r?'':r;m&&'string'===typeof m&&''!==m&&r&&'string'===typeof r&&''!==r&&(a.j.o[m]=r);a.i.v.set(l,c)}}catch(F){Ua('OMID verification script '+c.resourceUrl+' failed to load: '+F)}})}\nfunction Vb(a,b,c,d){var e=a.g.document,f=e.createElement('iframe');f.id='omid-verification-script-frame-'+b;f.style.display='none';if('full'==d){var h=function(){var k=f.contentWindow;k.omidVerificationProperties={serviceWindow:a.g,injectionSource:'app',injectionId:b};k=k.document;var g=k.createElement('script');g.src=c.href;k.head.appendChild(g);f.removeEventListener('load',h)};f.addEventListener('load',h)}else'limited'==d&&(f.srcdoc=\"<html><head>\\n<script type=\\\"text/javascript\\\">window['omidVerificationProperties'] = {\\n'serviceWindow': window.parent,\\n'injectionSource': 'app',\\n'injectionId': '\"+\n(b+'\\',\\n};\\x3c/script>\\n<script type=\"text/javascript\" src=\"')+c.href+'\">\\x3c/script>\\n</head><body></body></html>',f.sandbox='allow-scripts');e.body.appendChild(f);Na().h.set(b,f)};function Wb(a,b,c,d,e,f){var h=this;this.g=a;this.h=b;this.j=c;this.i=d;this.l=e;this.s=f;this.m=!1;Xb(this,function(k){if('sessionStart'===k.type){h.m=!0;try{Ub(h.l)}catch(g){K(g.message)}}'sessionFinish'===k.type&&(h.m=!1)})}function Xb(a,b,c,d){ab(a.h,b,c,d)}n=Wb.prototype;n.setSlotElement=function(a){a&&a.tagName?(this.g.i=a,this.i&&Ab(this.i)):K('setSlotElement called with a non-HTMLElement.  It will be ignored.')};n.setElementBounds=function(a){this.g.s=a;this.i&&Ab(this.i);this.i&&Bb(this.i)};\nn.error=function(a,b){db(this.h,a,b)};n.injectVerificationScriptResources=function(a){var b=this.l;b.h.push.apply(b.h,q(a));if(this.m)try{Ub(this.l)}catch(c){K(c.message)}};n.setCreativeType=function(a,b){b=void 0===b?null:b;if(!this.g.g||this.g.h)this.g.h=a,'video'==a||'audio'==a?this.g.g='video':'htmlDisplay'==a||'nativeDisplay'==a?this.g.g='display':'definedByJavaScript'==a&&b&&(this.g.g='none'==b?'display':'video')};n.setImpressionType=function(a){if(!this.g.g||this.g.h)this.g.l=a};\nn.setClientInfo=function(a,b,c){var d=this.g.m||{};d.omidJsInfo=Object.assign({},d.omidJsInfo,{sessionClientVersion:a,partnerName:b,partnerVersion:c});this.g.m=d;return this.g.m.omidJsInfo.serviceVersion};function Yb(a,b){if(!b)return a.g;for(var c=p(a.h.values()),d=c.next();!d.done;d=c.next())if(d=d.value,d.g.v.has(b))return d;return a.g}function V(a,b){return null==b?a.g:a.h.get(b)||a.g}function Zb(a){var b=new Qa,c=new Va(b),d=new Ia,e=new Ja,f=new sb(c,e,b);a=a.i;var h=omidGlobal;d=h?h.IntersectionObserver&&(h.MutationObserver||h.ResizeObserver)?new U(h,d,f,c,b,a):new T(h,e,f,c,b,a):null;return new Wb(b,c,f,d,new Tb(c,b),new Qb(c,b))};function $b(a){return a&&N(a)?Object.entries(a).reduce(function(b,c){var d=p(c);c=d.next().value;d=d.next().value;return b&&P(c)&&null!=d&&N(d)&&P(d.resourceUrl)},!0):!1};function W(a,b,c,d){this.h=a;this.method=b;this.version=c;this.g=d}function ac(a){return!!a&&void 0!==a.omid_message_guid&&void 0!==a.omid_message_method&&void 0!==a.omid_message_version&&'string'===typeof a.omid_message_guid&&'string'===typeof a.omid_message_method&&'string'===typeof a.omid_message_version&&(void 0===a.omid_message_args||void 0!==a.omid_message_args)}function bc(a){return new W(a.omid_message_guid,a.omid_message_method,a.omid_message_version,a.omid_message_args)}\nfunction cc(a){var b={};b=(b.omid_message_guid=a.h,b.omid_message_method=a.method,b.omid_message_version=a.version,b);void 0!==a.g&&(b.omid_message_args=a.g);return b};function dc(a){this.i=a};function X(a){this.i=a;this.handleExportedMessage=X.prototype.j.bind(this)}v(X,dc);X.prototype.h=function(a,b){b=void 0===b?this.i:b;if(!b)throw Error('Message destination must be defined at construction time or when sending the message.');b.handleExportedMessage(cc(a),this)};X.prototype.j=function(a,b){ac(a)&&this.g&&this.g(bc(a),b)};function ec(a){return fc(a,'SessionService.')}function fc(a,b){return(a=a.match(new RegExp('^'+b+'(.*)')))&&a[1]};function gc(a,b){this.i=b=void 0===b?J:b;var c=this;a.addEventListener('message',function(d){if('object'===typeof d.data){var e=d.data;ac(e)&&d.source&&c.g&&c.g(bc(e),d.source)}})}v(gc,dc);gc.prototype.h=function(a,b){b=void 0===b?this.i:b;if(!b)throw Error('Message destination must be defined at construction time or when sending the message.');b.postMessage(cc(a),'*')};function hc(a,b){b=void 0===b?{}:b;var c=J.webkit?J.webkit.messageHandlers.omidJsSessionService:J.omidJsSessionService;if(!c)return!1;c.postMessage(JSON.stringify({method:a,data:b}));return!0};function ic(){this.g=jc}n=ic.prototype;n.registerSessionObserver=function(a,b){Xb(V(this.g,a),b)};n.setSlotElement=function(a,b){V(this.g,a).setSlotElement(b)};n.setElementBounds=function(a,b){V(this.g,a).setElementBounds(b)};\nfunction kc(a,b,c,d,e){e=void 0===e?null:e;a=V(a.g,b);var f=a.g.m;f.sessionOwner||(f.sessionOwner=d?'native':'javascript');d?(b=b||Sb(),a.g.adSessionId=b,c.canMeasureVisibility=a.i.I(),Ra(a.g,c),eb(a.h,e),a.i&&zb(a.i)):b?(Ra(a.g,c),hc('startSession',{adSessionId:b})||K('On App, the native-layer JS Session Service must be initialized before starting an ad session using the JS API.')):K('Session client must be updated to start an App session from JS.')}\nfunction lc(a,b,c){c?(b=V(a.g,b),a=a.g,a.g=Zb(a),jb(b.h),b.i.A(),b.o&&(b.o.stop(),b.o=null)):b?hc('finishSession',{adSessionId:b})||K('On App, the native-layer JS Session Service must be initialized before finishing an ad session using the JS API.'):K('Session client must be updated to finish an App session from JS.')}n.error=function(a,b,c){V(this.g,a).error(b,c)};\nfunction Y(a,b,c,d){a=V(a.g,b);'impression'==c?rb(a.h,'javascript')&&(kb(a.h,'javascript'),a.i&&zb(a.i)):('loaded'==c?(d=void 0===d?null:d,pb(a.h,'javascript')&&lb(a.h,'javascript',d)):pb(a.h,'javascript')&&mb(a.h,c,'javascript',d),['loaded','start'].includes(c)&&a.i&&zb(a.i))}n.injectVerificationScriptResources=function(a,b){V(this.g,a).injectVerificationScriptResources(b)};n.setCreativeType=function(a,b,c){c=void 0===c?null:c;V(this.g,a).setCreativeType(b,c)};\nn.setImpressionType=function(a,b){V(this.g,a).setImpressionType(b)};n.setClientInfo=function(a,b,c,d){var e=this.g;if(null==a)a=e.g;else{var f=[].concat(q(e.h.values())).includes(e.g)?Zb(e):e.g;e.h.set(a,f);a=f}return a.setClientInfo(b,c,d)};function mc(a){a=a.split('-')[0].split('.');for(var b=['1','0','3'],c=0;3>c;c++){var d=parseInt(a[c],10),e=parseInt(b[c],10);if(d>e)break;else if(d<e)return!1}return!0};function nc(a,b){return/\\d+\\.\\d+\\.\\d+(-.*)?/.test(a)&&mc(a)?b:JSON.stringify(b)}function oc(a,b){return/\\d+\\.\\d+\\.\\d+(-.*)?/.test(a)&&mc(a)?b?b:[]:b&&'string'===typeof b?JSON.parse(b):[]};function pc(){var a=qc;var b=void 0===b?omidGlobal:b;this.g=a;this.h=b;this.j=new X;this.h.omid=this.h.omid||{};this.h.omid.v1_SessionServiceCommunication=this.j;this.i=b&&b.addEventListener&&b.postMessage?new gc(b):null;this.j.g=this.m.bind(this);this.i&&(this.i.g=this.l.bind(this))}pc.prototype.m=function(a,b){null!=ec(a.method)&&rc(this,a,b,this.j)};pc.prototype.l=function(a,b){null!=ec(a.method)&&rc(this,a,b,this.i)};\nfunction rc(a,b,c,d){function e(){var g=new W(f,'response',k,nc(k,w.apply(0,arguments)));d.h(g,c)}var f=b.h,h=b.method,k=b.version;b=oc(k,b.g);try{sc(a,h,e,b)}catch(g){d.h(new W(f,'error',k,'\\n        name: '+g.name+'\\n        message: '+g.message+'\\n        filename: '+g.filename+'\\n        lineNumber: '+g.lineNumber+'\\n        columnNumber: '+g.columnNumber+'\\n        stack: '+g.stack+'\\n        toString(): '+g.toString()),c)}}\nfunction sc(a,b,c,d){if(null!=ec(b))switch(ec(b)){case 'registerAdEvents':c=p(d).next().value;qb(V(a.g.g,c).h,'javascript');break;case 'registerMediaEvents':c=p(d).next().value;ob(V(a.g.g,c).h,'javascript');break;case 'registerSessionObserver':var e=p(d).next().value;a.g.registerSessionObserver(e,c);break;case 'setSlotElement':e=p(d);c=e.next().value;e=e.next().value;a.g.setSlotElement(e,c);break;case 'setVideoElement':e=p(d);c=e.next().value;e=e.next().value;a=V(a.g.g,e);c&&c.tagName&&'video'===\nc.tagName.toLowerCase()?(a.g.j=c,a.i&&Ab(a.i)):K('setVideoElement called with a non-HTMLVideoElement. It will be ignored.');break;case 'setElementBounds':e=p(d);c=e.next().value;e=e.next().value;a.g.setElementBounds(e,c);break;case 'startSession':c=p(d);d=c.next().value;c=c.next().value;b=a.h;if(null!=d&&N(d)){var f=d.customReferenceData,h=d.underEvaluation,k=d.universalAdId;P(f)||(f=void 0);'boolean'===typeof h||(h=!1);d={customReferenceData:f,underEvaluation:h};P(k)&&(d.universalAdId=k);if('object'===\ntypeof Nb(b)){var g=Nb(b),l;'object'===typeof g&&(l=g.identifier);d.app={appId:l&&'string'===typeof l?l:void 0};b:if(g=Nb(b),'object'===typeof g){try{e=JSON.parse(g.deviceInfo)}catch(F){e=void 0;break b}e={deviceType:e.modelName||'Unknown',osVersion:e.platformVersion||'Unknown',os:'webOS'}}else e=void 0;d.deviceInfo=e;d.deviceCategory='ctv'}else if(Pb(b)){b:{if(Pb(b)){try{var m=Ob(b).application.getCurrentApplication().appInfo.id}catch(F){e=void 0;break b}if('string'===typeof m){e=m;break b}}e=void 0}d.app=\n{appId:e};if(Pb(b)){e=Ob(b).systeminfo;if('object'===typeof e&&'function'===typeof e.getCapability){g=e.getCapability('http://tizen.org/system/model_name');var r=e.getCapability('http://tizen.org/feature/platform.version')}e={deviceType:g||'Unknown',osVersion:r||'Unknown',os:'tizen'}}else e=void 0;d.deviceInfo=e;Pb(b)&&'object'===typeof Ob(b).tvinputdevice&&(d.deviceCategory='ctv')}}else d=null;if(null==d)break;kc(a.g,c,d,!1);break;case 'finishSession':c=p(d).next().value;lc(a.g,c,!1);break;case 'impressionOccurred':c=\np(d).next().value;Y(a.g,c,'impression');break;case 'loaded':e=p(d);c=e.next().value;e=e.next().value;c?(g={skippable:c.isSkippable,autoPlay:c.isAutoPlay,position:c.position},c.isSkippable&&(g.skipOffset=c.skipOffset),Y(a.g,e,'loaded',g)):Y(a.g,e,'loaded');break;case 'start':g=p(d);c=g.next().value;e=g.next().value;g=g.next().value;Y(a.g,g,'start',{duration:c,mediaPlayerVolume:e});break;case 'firstQuartile':c=p(d).next().value;Y(a.g,c,'firstQuartile');break;case 'midpoint':c=p(d).next().value;Y(a.g,\nc,'midpoint');break;case 'thirdQuartile':c=p(d).next().value;Y(a.g,c,'thirdQuartile');break;case 'complete':c=p(d).next().value;Y(a.g,c,'complete');break;case 'pause':c=p(d).next().value;Y(a.g,c,'pause');break;case 'resume':c=p(d).next().value;Y(a.g,c,'resume');break;case 'bufferStart':c=p(d).next().value;Y(a.g,c,'bufferStart');break;case 'bufferFinish':c=p(d).next().value;Y(a.g,c,'bufferFinish');break;case 'skipped':c=p(d).next().value;Y(a.g,c,'skipped');break;case 'volumeChange':e=p(d);c=e.next().value;\ne=e.next().value;Y(a.g,e,'volumeChange',{mediaPlayerVolume:c});break;case 'playerStateChange':e=p(d);c=e.next().value;e=e.next().value;Y(a.g,e,'playerStateChange',{state:c});break;case 'adUserInteraction':e=p(d);c=e.next().value;e=e.next().value;Y(a.g,e,'adUserInteraction',{interactionType:c});break;case 'setClientInfo':l=p(d);e=l.next().value;g=l.next().value;r=l.next().value;l=l.next().value;a=a.g.setClientInfo(l,e,g,r);c(a);break;case 'injectVerificationScriptResources':e=p(d);c=e.next().value;\ne=e.next().value;a.g.injectVerificationScriptResources(e,c);break;case 'setCreativeType':e=p(d);c=e.next().value;e=e.next().value;a.g.setCreativeType(e,c);break;case 'setImpressionType':e=p(d);c=e.next().value;e=e.next().value;a.g.setImpressionType(e,c);break;case 'setContentUrl':e=p(d);c=e.next().value;e=e.next().value;V(a.g.g,e).g.C=c;break;case 'sessionError':g=p(d),c=g.next().value,e=g.next().value,g=g.next().value,a.g.error(g,c,e)}};function Z(){this.g=qc}n=Z.prototype;\nn.da=function(a,b){if(!(!(a&&N(a)&&Q(a.impressionOwner,qa))||'videoEventsOwner'in a&&null!=a.videoEventsOwner&&!Q(a.videoEventsOwner,qa)||'mediaEventsOwner'in a&&null!=a.mediaEventsOwner&&!Q(a.mediaEventsOwner,qa))){b=V(this.g.g,b);if(a.creativeType&&a.impressionType){var c=a.mediaEventsOwner;null==b.g.h&&b.setCreativeType(a.creativeType,c);null==b.g.l&&(b.g.l=a.impressionType);ob(b.h,c)}else c=a.videoEventsOwner,b.g.g=null==c||'none'===c?'display':'video',b.g.h=null,b.g.l=null,ob(b.h,c);qb(b.h,a.impressionOwner);\na&&null!=a.isolateVerificationScripts&&'boolean'===typeof a.isolateVerificationScripts&&(b.g.I=a.isolateVerificationScripts)}};\nn.aa=function(a,b,c,d){b&&'string'===typeof b.adSessionType&&(b.adSessionType=b.adSessionType.toLowerCase());var e;if(N(b)){if(e=Q(b.environment,ua)&&Q(b.adSessionType,pa))e=b.omidNativeInfo,e=N(e)?P(e.partnerName)&&P(e.partnerVersion):!1;e&&(e=b.app,e=N(e)?P(e.libraryVersion)&&P(e.appId):!1)}else e=!1;if(e){if($b(d)){e=p(Object.values(d));for(var f=e.next();!f.done;f=e.next())f.value.accessMode='limited';V(this.g.g,a).g.v=new Map(Object.entries(d))}kc(this.g,a,b,!0,c)}else K('Native ad session context invalid; session not started.')};\nn.W=function(a){lc(this.g,a,!0)};n.$=function(a,b){N(a)&&O(a.x)&&O(a.y)&&O(a.width)&&O(a.height)&&(b=V(this.g.g,b),b.g.L=a,M(b.j,'container'))};n.ha=function(a,b){Q(a,sa)&&(b=V(this.g.g,b),b.g.A=a,'backgrounded'===a?M(b.j,'container','backgrounded'):M(b.j,'container'))};n.Y=function(a,b){Q(a,ta)&&(b=V(this.g.g,b),b.g.M=a,'locked'===a?M(b.j,'container','deviceLocked'):M(b.j,'container'))};n.ea=function(a){'impression'===a&&this.T()};n.T=function(a){a=V(this.g.g,a);rb(a.h,'native')&&kb(a.h,'native')};\nn.X=function(a,b){this.S('loaded',void 0===a?null:a,b)};n.error=function(a,b,c){Q(a,oa)&&this.g.error(c,a,b)};n.fa=function(a,b,c){this.S(a,b,c)};n.S=function(a,b,c){Q(a,y)&&(void 0===b||N(b))&&(c=V(this.g.g,c),pb(c.h,'native')&&('loaded'==a?lb(c.h,'native',b):mb(c.h,a,'native',b)))};n.Z=function(a,b){b=V(this.g.g,b);'none'===b.h.g.o||'number'!==typeof a||isNaN(a)||(b.g.D=a,a=b.s,b=a.g.J,null!=b&&mb(a.h,'volumeChange','native',{mediaPlayerVolume:b,deviceVolume:a.g.D}))};\nn.ga=function(a){if(a&&N(a)&&O(a.timestamp)){var b=Na(),c=(b.g||{}).timestamp;if(!c||c<a.timestamp)b.g=a}};Z.prototype.startSession=Z.prototype.aa;Z.prototype.error=Z.prototype.error;Z.prototype.finishSession=Z.prototype.W;Z.prototype.publishAdEvent=Z.prototype.ea;Z.prototype.publishImpressionEvent=Z.prototype.T;Z.prototype.publishVideoEvent=Z.prototype.fa;Z.prototype.publishMediaEvent=Z.prototype.S;Z.prototype.publishLoadedEvent=Z.prototype.X;Z.prototype.setNativeViewHierarchy=Z.prototype.$;\nZ.prototype.setState=Z.prototype.ha;Z.prototype.setDeviceLockState=Z.prototype.Y;Z.prototype.setDeviceVolume=Z.prototype.Z;Z.prototype.init=Z.prototype.da;Z.prototype.setLastActivity=Z.prototype.ga;function tc(){var a=jc,b=uc,c=this;var d=void 0===d?J:d;this.j=a;this.g=b;this.l={};this.m={};this.i=new X;d.omid=d.omid||{};d.omid.v1_VerificationServiceCommunication=this.i;this.h=null;d&&d.addEventListener&&d.postMessage&&(this.h=new gc(d));this.i.g=function(e,f){vc(c,e,f,c.i)};this.h&&(this.h.g=function(e,f){c.h&&vc(c,e,f,c.h)})}function wc(a,b,c,d){a=Yb(a.j,d).h;'media'===b||'video'===b?$a(a,c,d):(c={type:b,R:d,G:c},a.j.push(c),Za(a,b,c))}function xc(a,b,c,d){a=Yb(a.j,d);Xb(a,b,c,d)}\nfunction yc(a,b,c,d){xb(a.g,b,c,d)}tc.prototype.setInterval=function(a,b){return this.g.setInterval(a,b)};tc.prototype.clearInterval=function(a){this.g.clearInterval(a)};function zc(a,b,c,d){wb(a.g,'downloadJavaScriptResource')(b,c,d)}\nfunction vc(a,b,c,d){function e(){var B=new W(f,'response',k,nc(k,w.apply(0,arguments)));d.h(B,c)}var f=b.h,h=b.method,k=b.version;b=oc(k,b.g);if(null!=fc(h,'VerificationService.')){h=fc(h,'VerificationService.');try{switch(h){case 'addEventListener':var g=p(b),l=g.next().value,m=g.next().value||Ac(c);wc(a,l,e,m);break;case 'addSessionListener':var r=p(b),F=r.next().value,ba=r.next().value||Ac(c);xc(a,e,F,ba);break;case 'sendUrl':var R=p(b).next().value;yc(a,R,function(){return e(!0)},function(){return e(!1)});\nbreak;case 'setTimeout':var G=p(b),Ec=G.next().value,Fc=G.next().value;a.l[Ec]=ub(a.g,'setTimeout')(e,Fc);break;case 'clearTimeout':var Gc=p(b).next().value;vb(a.g,a.l[Gc]);break;case 'setInterval':var Rb=p(b),Hc=Rb.next().value,Ic=Rb.next().value;a.m[Hc]=a.setInterval(e,Ic);break;case 'clearInterval':var Jc=p(b).next().value;a.clearInterval(a.m[Jc]);break;case 'injectJavaScriptResource':var Kc=p(b).next().value;zc(a,Kc,function(B){return e(!0,B)},function(){return e(!1)});break;case 'getVersion':e('1.5.5-iab77')}}catch(B){d.h(new W(f,\n'error',k,'\\n              name: '+B.name+'\\n              message: '+B.message+'\\n              filename: '+B.filename+'\\n              lineNumber: '+B.lineNumber+'\\n              columnNumber: '+B.columnNumber+'\\n              stack: '+B.stack+'\\n              toString(): '+B.toString()+'\\n          '),c)}}}\nfunction Ac(a){for(var b=Na().h,c=p(b.keys()),d=c.next();!d.done;d=c.next()){d=d.value;var e=b.get(d);if(e){if(e.contentWindow===a)return d;try{if(e.contentWindow.Object.prototype.isPrototypeOf(a))return d}catch(f){}}}};function Bc(a){var b={};return(b.app='omid_v1_present_app',b.web='omid_v1_present_web',b)[a]}function Cc(a,b){a.document.write('<iframe style=\"display:none\" id=\"'+(b+'\" name=\"'+b+'\" sandbox></iframe>'))}function Dc(a,b){var c=a.document.createElement('iframe');c.id=b;c.name=b;c.style.display='none';c.sandbox='';a.document.body.appendChild(c)}\nfunction Lc(a,b){var c=new MutationObserver(function(d){d.forEach(function(e){'BODY'===e.addedNodes[0].nodeName&&(e=Bc(b),Dc(a,'omid_v1_present'),Dc(a,e),c.disconnect())})});c.observe(a.document.documentElement,{childList:!0})};var uc=new tb,jc=new function(){this.i=uc;this.h=new Map;this.g=Zb(this)},qc=new ic;new tc;J.omidBridge=new Z;new pc;(function(a,b){a.frames&&a.document&&!['omid_v1_present','omid_v1_present_web','omid_v1_present_app'].some(function(c){return!!a.frames[c]})&&(null==a.document.body&&'MutationObserver'in a?Lc(a,b):(b=Bc(b),a.document.body?(Dc(a,'omid_v1_present'),Dc(a,b)):(Cc(a,'omid_v1_present'),Cc(a,b))))})(J,'app');\n}).call(this, this);";
                                                AdSessionContext adSessionContextCreateNativeAdSessionContext3 = AdSessionContext.createNativeAdSessionContext(c3163oa2.f23872b, strA, arrayList4, strE2, str24);
                                                Intrinsics.e(adSessionContextCreateNativeAdSessionContext3, "createNativeAdSessionContext(...)");
                                                z5 = false;
                                            }
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        str3 = str;
                                        str4 = str20;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    str3 = str;
                                    str4 = str20;
                                }
                            }
                            str7 = str2;
                            str6 = str;
                            contextT = contextT;
                            z2 = z2;
                            it = it;
                        }
                    }
                }
            }
        }
    }

    public final C2984d8 a(C3177p8 c3177p8) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "isSkippableVideo ", this));
        }
        Iterator it = c3177p8.c().iterator();
        while (it.hasNext()) {
            C2984d8 c2984d8 = (C2984d8) c3177p8.n((String) it.next()).get(0);
            if (2 == c2984d8.k) {
                return c2984d8;
            }
        }
        return null;
    }

    public final void a(boolean z2, GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        Set<C3199qe> setE;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2;
        C3035ga c3035gaA;
        AdConfig.ViewabilityConfig viewability;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", D0.a("S0", "TAG", "omidSessionForHtmlMarkup ", this));
        }
        AdConfig adConfig = this.f23137b;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            AbstractC3147na.f23833a.getClass();
            if (Omid.isActive() && (setE = e(this.g.indexOf(gestureDetectorOnGestureListenerC3005ec))) != null) {
                for (C3199qe c3199qe : setE) {
                    if (3 == c3199qe.f23940a) {
                        try {
                            String str = (String) c3199qe.a("creativeType", String.class);
                            String str2 = (String) c3199qe.a("customReferenceData", String.class);
                            Boolean bool = (Boolean) c3199qe.a("isolateVerificationScripts", Boolean.class);
                            Byte b2 = (Byte) c3199qe.a("impressionType", Byte.class);
                            if (str == null || bool == null || b2 == null) {
                                gestureDetectorOnGestureListenerC3005ec2 = gestureDetectorOnGestureListenerC3005ec;
                                c3035gaA = null;
                            } else {
                                boolean zBooleanValue = bool.booleanValue();
                                String strE = this.t.e();
                                byte bByteValue = b2.byteValue();
                                gestureDetectorOnGestureListenerC3005ec2 = gestureDetectorOnGestureListenerC3005ec;
                                try {
                                    c3035gaA = AbstractC3083ja.a(str, gestureDetectorOnGestureListenerC3005ec2, zBooleanValue, strE, bByteValue, str2);
                                } catch (Exception e2) {
                                    e = e2;
                                    Exception exc = e;
                                    InterfaceC3333z5 interfaceC3333z6 = this.j;
                                    if (interfaceC3333z6 != null) {
                                        ((A5) interfaceC3333z6).b("S0", rf.a(exc, H6.a("S0", "TAG", "Setting up impression tracking for IAB encountered an unexpected error: ")));
                                    }
                                    S5 s5 = S5.f23167a;
                                    S5.d.a(AbstractC3285w5.a(exc, "event"));
                                }
                            }
                            if (c3035gaA != null) {
                                c3199qe.f23941b.put("omidAdSession", c3035gaA);
                                c3199qe.f23941b.put("deferred", Boolean.valueOf(z2));
                                InterfaceC3333z5 interfaceC3333z7 = this.j;
                                if (interfaceC3333z7 != null) {
                                    ((A5) interfaceC3333z7).a("S0", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                InterfaceC3333z5 interfaceC3333z8 = this.j;
                                if (interfaceC3333z8 != null) {
                                    ((A5) interfaceC3333z8).a("S0", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            gestureDetectorOnGestureListenerC3005ec2 = gestureDetectorOnGestureListenerC3005ec;
                        }
                        gestureDetectorOnGestureListenerC3005ec = gestureDetectorOnGestureListenerC3005ec2;
                    }
                }
            }
        }
    }

    public static final void a(S0 s0, C3040h c3040h, String str) {
        InterfaceC3333z5 interfaceC3333z5 = s0.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "updateAdForBlob ", s0));
        }
        c3040h.e(str);
        InterfaceC3333z5 interfaceC3333z6 = s0.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).c("S0", D0.a("S0", "TAG", "updateAd ", s0));
        }
        C3312y0 c3312y0 = s0.f23145u;
        if (c3312y0 != null) {
            c3312y0.a(c3040h);
        }
    }

    public void a(String blob, String str) {
        Intrinsics.f(blob, "blob");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "saveBlob ", this));
        }
        A a2 = this.C;
        int iHashCode = hashCode();
        Q0 q0 = new Q0(this, str, blob);
        a2.getClass();
        A.a(iHashCode, q0);
    }

    public void a(String jsCallbackNamespace, String callback, InterfaceC2961c2 receiver, String str) {
        Intrinsics.f(jsCallbackNamespace, "jsCallbackNamespace");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(receiver, "receiver");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "getBlob ", this));
        }
        A a2 = this.C;
        int iHashCode = hashCode();
        I0 i0 = new I0(this, str, receiver, jsCallbackNamespace, callback);
        a2.getClass();
        A.a(iHashCode, i0);
    }

    @Override // com.inmobi.media.Te
    public void a(C3040h ad, boolean z2, short s) {
        C3312y0 c3312y0;
        Intrinsics.f(ad, "ad");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("S0", D0.a("S0", "TAG", "onVastProcessCompleted ", this));
        }
        C3040h c3040hM = m();
        if (c3040hM == null || W()) {
            c3040hM = null;
        }
        if (c3040hM == null) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            StringBuilder sbA = H6.a("S0", "TAG", "Vast processing completed for ad with impressionId : ");
            sbA.append(c3040hM.s());
            ((A5) interfaceC3333z6).c("S0", sbA.toString());
        }
        String strU = c3040hM.u();
        int iHashCode = strU.hashCode();
        if (iHashCode != -1084172778) {
            if (iHashCode != 3213227) {
                if (iHashCode == 1236050372 && strU.equals("htmlUrl")) {
                    return;
                }
            } else if (strU.equals("html")) {
                return;
            }
        } else if (strU.equals("inmobiJson")) {
            if (this.f23136a == 2 && (c3312y0 = this.f23145u) != null) {
                c3312y0.a(ad);
                B0 b0P = p();
                String clientReqId = c3312y0.k();
                b0P.getClass();
                Intrinsics.f(clientReqId, "clientReqId");
                Set<C3307xb> setY = ad.y();
                if (setY.isEmpty()) {
                    b0P.f22708a.a(b0P.f22710c, true, (short) 0);
                    return;
                }
                C3088k c3088k = new C3088k(androidx.media3.extractor.text.ttml.a.m("toString(...)"), setY, b0P.g, null, 16);
                String strF = ad.f();
                if (strF != null) {
                    C3233t1.a(c3088k, strF);
                    return;
                }
                return;
            }
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b("S0", "Found inconsistent state after vast processing");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            StringBuilder sbA2 = H6.a("S0", "TAG", "Can not handle fallback for");
            sbA2.append(c3040hM.u());
            ((A5) interfaceC3333z8).b("S0", sbA2.toString());
        }
        throw new IllegalStateException("Can not handle fallback for markup type: " + c3040hM.u());
    }
}
