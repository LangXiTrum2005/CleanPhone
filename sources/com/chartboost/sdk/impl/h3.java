package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h3 implements z6 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f14067A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f14068B;
    public int C;
    public int D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f14069E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f14070F;
    public boolean G;
    public int H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public xd f14071I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ij f14072J;
    public float K;
    public float L;
    public float M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final k5 f14073N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kb f14076c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lh f14077e;
    public final a8 f;
    public final z2 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e3 f14078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Mediation f14079i;
    public final String j;
    public final hd k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n0 f14080l;
    public final dk m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z6 f14081n;
    public final Function2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f14082p;
    public long q;
    public long r;
    public boolean s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14083u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14084w;
    public int x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14085z;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14086b = new a();

        public a() {
            super(2, x9.class, "<init>", "<init>(Ljava/lang/String;Lcom/chartboost/sdk/tracking/EventTrackerExtensions;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x9 invoke(String p0, z6 p1) {
            Intrinsics.f(p0, "p0");
            Intrinsics.f(p1, "p1");
            return new x9(p0, p1);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14087a;

        static {
            int[] iArr = new int[mi.values().length];
            try {
                iArr[mi.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mi.RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mi.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mi.BUFFER_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mi.BUFFER_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mi.QUARTILE1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mi.MIDPOINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mi.QUARTILE3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mi.COMPLETED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mi.SKIP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[mi.VOLUME_CHANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f14087a = iArr;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ij f14089b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ij ijVar) {
            super(0);
            this.f14089b = ijVar;
        }

        public final void a() {
            this.f14089b.a();
            this.f14089b.removeAllViews();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        public final void a() {
            if (h3.this.s) {
                return;
            }
            za.a("Webview seems to be taking more time loading the html content, so closing the view.", (Throwable) null, 2, (Object) null);
            h3.this.a(fh.i.TIMEOUT_EVENT, "");
            h3.this.m.a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public h3(Context context, String location, kb adUnitMType, String adTypeTraitsName, lh uiPoster, a8 fileCache, z2 z2Var, e3 e3Var, Mediation mediation, String str, hd openMeasurementImpressionCallback, n0 adUnitRendererCallback, dk webViewTimeoutInterface, z6 eventTracker, Function2 impressionTrackerRequestFactory) {
        Intrinsics.f(context, "context");
        Intrinsics.f(location, "location");
        Intrinsics.f(adUnitMType, "adUnitMType");
        Intrinsics.f(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.f(uiPoster, "uiPoster");
        Intrinsics.f(fileCache, "fileCache");
        Intrinsics.f(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.f(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.f(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(impressionTrackerRequestFactory, "impressionTrackerRequestFactory");
        this.f14074a = context;
        this.f14075b = location;
        this.f14076c = adUnitMType;
        this.d = adTypeTraitsName;
        this.f14077e = uiPoster;
        this.f = fileCache;
        this.g = z2Var;
        this.f14078h = e3Var;
        this.f14079i = mediation;
        this.j = str;
        this.k = openMeasurementImpressionCallback;
        this.f14080l = adUnitRendererCallback;
        this.m = webViewTimeoutInterface;
        this.f14081n = eventTracker;
        this.o = impressionTrackerRequestFactory;
        this.G = true;
        this.H = -1;
        this.f14071I = xd.PLAYING;
        this.f14073N = new c();
    }

    public final CBError.Impression A() {
        File file = this.f.a().f13491a;
        if (file == null) {
            za.b("External Storage path is unavailable or media not mounted", (Throwable) null, 2, (Object) null);
            return CBError.Impression.ERROR_LOADING_WEB_VIEW;
        }
        this.f14082p = android.support.v4.media.a.n(AdPayload.FILE_SCHEME, file.getAbsolutePath(), "/");
        String str = this.j;
        if (str == null || str.length() != 0) {
            return null;
        }
        za.b("Empty template being passed in the response", (Throwable) null, 2, (Object) null);
        return CBError.Impression.ERROR_DISPLAYING_VIEW;
    }

    public final void B() {
        this.f14077e.a(MBInterstitialActivity.WEB_LOAD_TIME, new e());
    }

    public final void C() {
        this.f14080l.a();
        this.G = true;
        this.H = -1;
    }

    public final void D() {
        this.M = 1.0f;
    }

    public abstract ij b(Context context);

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f14081n.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14081n.clearFromStorage(chVar);
    }

    public final void d(String str) {
        z2 z2Var;
        if (str != null && str.length() != 0 && (z2Var = this.g) != null) {
            z2Var.a((v2) this.o.invoke(str, this.f14081n));
            za.a("###### Sending VAST Tracking Event: ".concat(str), (Throwable) null, 2, (Object) null);
        } else {
            za.a("###### Sending VAST Tracking Event Failed: " + str, (Throwable) null, 2, (Object) null);
        }
    }

    public final void e() {
        ij ijVar = this.f14072J;
        if (ijVar == null || !this.s) {
            this.C = this.y;
            this.D = this.f14085z;
            this.f14069E = this.f14067A;
            this.f14070F = this.f14068B;
            return;
        }
        int[] iArr = new int[2];
        ijVar.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1] - this.x;
        int width = ijVar.getWidth();
        int height = ijVar.getHeight();
        this.y = i2;
        this.f14085z = i3;
        int i4 = width + i2;
        this.f14067A = i4;
        int i5 = height + i3;
        this.f14068B = i5;
        this.C = i2;
        this.D = i3;
        this.f14069E = i4;
        this.f14070F = i5;
        za.a(android.support.v4.media.a.g(i2, i2, "CalculatePosition: defaultXPos: ", " , currentXPos: "), (Throwable) null, 2, (Object) null);
    }

    public void f() {
        this.k.f();
        ij ijVar = this.f14072J;
        if (ijVar != null) {
            this.f14077e.a(1000L, new d(ijVar));
        }
        this.f14072J = null;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.f14082p;
    }

    public final String i() {
        e();
        return a(this.C, this.D, this.f14069E, this.f14070F);
    }

    public final k5 j() {
        return this.f14073N;
    }

    public final String k() {
        e();
        return a(this.y, this.f14085z, this.f14067A, this.f14068B);
    }

    public final String l() {
        return this.f14075b;
    }

    public final String m() {
        String string = s2.a(s2.a("width", Integer.valueOf(this.v)), s2.a("height", Integer.valueOf(this.f14084w))).toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public final hd n() {
        return this.k;
    }

    public final String o() {
        String string = s2.a(s2.a("allowOrientationChange", Boolean.valueOf(this.G)), s2.a("forceOrientation", a(this.H))).toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public final String p() {
        String string = s2.a(s2.a("width", Integer.valueOf(this.t)), s2.a("height", Integer.valueOf(this.f14083u))).toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14081n.persist(chVar);
    }

    public final e3 q() {
        return this.f14078h;
    }

    public final lh r() {
        return this.f14077e;
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f14081n.refresh(ahVar);
    }

    public final float s() {
        return this.K;
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f14081n.store(ugVar);
    }

    public final float t() {
        return this.L;
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14081n.track(chVar);
    }

    public final ij u() {
        return this.f14072J;
    }

    public final void v() {
        this.M = 0.0f;
    }

    public abstract void w();

    public void x() {
        i3 webView;
        Context context;
        this.s = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.r = jCurrentTimeMillis;
        za.a(androidx.datastore.preferences.protobuf.a.i((jCurrentTimeMillis - this.q) / ((long) 1000), "Total web view load response time "), (Throwable) null, 2, (Object) null);
        ij ijVar = this.f14072J;
        if (ijVar != null && (context = ijVar.getContext()) != null) {
            a(context);
        }
        ij ijVar2 = this.f14072J;
        if (ijVar2 == null || (webView = ijVar2.getWebView()) == null) {
            return;
        }
        a((WebView) webView);
        e();
    }

    public void y() {
        i3 webView;
        e3 e3Var;
        ij ijVar = this.f14072J;
        if (ijVar == null || (webView = ijVar.getWebView()) == null || (e3Var = this.f14078h) == null) {
            return;
        }
        e3Var.a(webView, this.f14075b, this.d);
        webView.onPause();
    }

    public void z() {
        i3 webView;
        e3 e3Var;
        ij ijVar = this.f14072J;
        if (ijVar == null || (webView = ijVar.getWebView()) == null || (e3Var = this.f14078h) == null) {
            return;
        }
        e3Var.b(webView, this.f14075b, this.d);
        webView.onResume();
    }

    public static final class c implements k5 {
        public c() {
        }

        @Override // com.chartboost.sdk.impl.k5
        public void a(String message) {
            Intrinsics.f(message, "message");
            h3.this.c(message);
        }

        @Override // com.chartboost.sdk.impl.k5
        public void b() {
            ij ijVarU = h3.this.u();
            i3 webView = ijVarU != null ? ijVarU.getWebView() : null;
            if (h3.this.f14076c == kb.VIDEO || webView == null) {
                return;
            }
            hd hdVarN = h3.this.n();
            kb kbVar = h3.this.f14076c;
            List list = Collections.EMPTY_LIST;
            Intrinsics.e(list, "emptyList(...)");
            hdVarN.a(kbVar, webView, null, list);
        }

        @Override // com.chartboost.sdk.impl.k5
        public void c() {
            h3.this.x();
        }

        @Override // com.chartboost.sdk.impl.k5
        public void d() {
            h3.this.B();
        }

        @Override // com.chartboost.sdk.impl.k5
        public void a(View obstructionView) {
            Intrinsics.f(obstructionView, "obstructionView");
            h3.this.n().a(obstructionView);
        }

        @Override // com.chartboost.sdk.impl.k5
        public void a() {
            h3.this.q = System.currentTimeMillis();
        }
    }

    public final int b(String name) {
        Intrinsics.f(name, "name");
        if (name.equals(com.ironsource.d9.h.D)) {
            return 1;
        }
        return name.equals(com.ironsource.d9.h.C) ? 0 : -1;
    }

    public final CBError.Impression c(String error) {
        Intrinsics.f(error, "error");
        a(fh.i.WEBVIEW_ERROR, error);
        za.b(error, (Throwable) null, 2, (Object) null);
        this.s = true;
        return CBError.Impression.WEB_VIEW_CLIENT_RECEIVED_ERROR;
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f14081n.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f14081n.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f14081n.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f14081n.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f14081n.mo189track(event);
    }

    public final void a(WebView webView) {
        Intrinsics.f(webView, "webView");
        this.v = webView.getWidth();
        this.f14084w = webView.getHeight();
    }

    public final void b(float f) {
        this.L = f;
    }

    public final void a(Context context) {
        Intrinsics.f(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.t = displayMetrics.widthPixels;
        this.f14083u = displayMetrics.heightPixels;
    }

    public final String a(int i2) {
        if (i2 == -1) {
            return "none";
        }
        if (i2 == 0) {
            return com.ironsource.d9.h.C;
        }
        if (i2 != 1) {
            return "error";
        }
        return com.ironsource.d9.h.D;
    }

    public final String a(int i2, int i3, int i4, int i5) {
        String string = s2.a(s2.a("x", Integer.valueOf(i2)), s2.a("y", Integer.valueOf(i3)), s2.a("width", Integer.valueOf(i4)), s2.a("height", Integer.valueOf(i5))).toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public final void a(List verificationScriptResourceList, Integer num) {
        i3 webView;
        Intrinsics.f(verificationScriptResourceList, "verificationScriptResourceList");
        ij ijVar = this.f14072J;
        if (ijVar == null || (webView = ijVar.getWebView()) == null) {
            return;
        }
        this.k.a(this.f14076c, webView, num, verificationScriptResourceList);
    }

    public /* synthetic */ h3(Context context, String str, kb kbVar, String str2, lh lhVar, a8 a8Var, z2 z2Var, e3 e3Var, Mediation mediation, String str3, hd hdVar, n0 n0Var, dk dkVar, z6 z6Var, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, kbVar, str2, lhVar, a8Var, z2Var, e3Var, mediation, str3, hdVar, n0Var, dkVar, z6Var, (i2 & 16384) != 0 ? a.f14086b : function2);
    }

    public final void a(float f, float f2) {
        float f3 = 4;
        float f4 = f / f3;
        float f5 = f / 2;
        float f6 = (f * 3) / f3;
        if (f2 >= f4 && f2 < f5) {
            a(mi.QUARTILE1);
            return;
        }
        if (f2 >= f5 && f2 < f6) {
            a(mi.MIDPOINT);
        } else if (f2 >= f6) {
            a(mi.QUARTILE3);
        }
    }

    public final void a(mi event) {
        Intrinsics.f(event, "event");
        za.a("sendWebViewVastOmEvent: " + event.name(), (Throwable) null, 2, (Object) null);
        if (this.f14076c != kb.VIDEO) {
            return;
        }
        hd hdVar = this.k;
        switch (b.f14087a[event.ordinal()]) {
            case 1:
                hdVar.a(this.K, this.M);
                break;
            case 2:
                if (this.f14071I == xd.PAUSED) {
                    hdVar.e();
                }
                break;
            case 3:
                hdVar.a();
                break;
            case 4:
                hdVar.a(true);
                break;
            case 5:
                hdVar.a(false);
                break;
            case 6:
                hdVar.a(me.FIRST);
                break;
            case 7:
                hdVar.a(me.MIDDLE);
                break;
            case 8:
                hdVar.a(me.THIRD);
                break;
            case 9:
                hdVar.d();
                break;
            case 10:
                hdVar.c();
                break;
            case 11:
                hdVar.a(this.M);
                break;
        }
    }

    public final void a(boolean z2, String forceOrientationString) {
        Intrinsics.f(forceOrientationString, "forceOrientationString");
        this.G = z2;
        int iB = b(forceOrientationString);
        this.H = iB;
        this.f14080l.a(iB, z2);
    }

    public final void a(float f) {
        this.K = f;
    }

    public final void a(fh fhVar, String str) {
        if (str == null) {
            str = "no message";
        }
        track((ch) new h5(fhVar, str, this.d, this.f14075b, this.f14079i, null, 32, null));
    }

    public final CBError.Impression a(CBImpressionActivity activity) {
        Intrinsics.f(activity, "activity");
        if (this.f14072J == null) {
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.e(applicationContext, "getApplicationContext(...)");
            this.f14072J = b(applicationContext);
        }
        this.f14080l.a(this.f14074a);
        return null;
    }

    public final CBError.Impression a(ViewGroup viewGroup) {
        if (this.f14072J == null) {
            if ((viewGroup != null ? viewGroup.getContext() : null) != null) {
                Context context = viewGroup.getContext();
                Intrinsics.e(context, "getContext(...)");
                this.f14072J = b(context);
            } else {
                return CBError.Impression.ERROR_CREATING_VIEW;
            }
        }
        return null;
    }

    public final void a(xd newState) {
        Intrinsics.f(newState, "newState");
        this.f14071I = newState;
    }
}
