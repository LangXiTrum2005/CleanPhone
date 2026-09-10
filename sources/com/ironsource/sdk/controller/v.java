package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.B5;
import com.ironsource.C0239a2;
import com.ironsource.C0241a4;
import com.ironsource.C0256b1;
import com.ironsource.C0274c1;
import com.ironsource.C0286cd;
import com.ironsource.C0301da;
import com.ironsource.C0313e4;
import com.ironsource.C0314e5;
import com.ironsource.C0349g4;
import com.ironsource.C0353g8;
import com.ironsource.C0355ga;
import com.ironsource.C0377he;
import com.ironsource.C0395ie;
import com.ironsource.C0402j4;
import com.ironsource.C0407j9;
import com.ironsource.C0434l0;
import com.ironsource.C0460m8;
import com.ironsource.C0474n4;
import com.ironsource.C0514p8;
import com.ironsource.C0532q8;
import com.ironsource.C0549r8;
import com.ironsource.C0596u1;
import com.ironsource.C0603u8;
import com.ironsource.C0611ug;
import com.ironsource.C0639w8;
import com.ironsource.C0653x4;
import com.ironsource.C0693z8;
import com.ironsource.Dg;
import com.ironsource.E1;
import com.ironsource.EnumC0443l9;
import com.ironsource.H8;
import com.ironsource.InterfaceC0262b7;
import com.ironsource.InterfaceC0331f4;
import com.ironsource.InterfaceC0480na;
import com.ironsource.InterfaceC0510p4;
import com.ironsource.InterfaceC0545r4;
import com.ironsource.InterfaceC0551ra;
import com.ironsource.InterfaceC0563s4;
import com.ironsource.InterfaceC0581t4;
import com.ironsource.InterfaceC0599u4;
import com.ironsource.InterfaceC0632w1;
import com.ironsource.InterfaceC0674y7;
import com.ironsource.Kb;
import com.ironsource.N;
import com.ironsource.Nb;
import com.ironsource.O6;
import com.ironsource.Oc;
import com.ironsource.Pe;
import com.ironsource.Qc;
import com.ironsource.R3;
import com.ironsource.R7;
import com.ironsource.Rc;
import com.ironsource.Sc;
import com.ironsource.T3;
import com.ironsource.T4;
import com.ironsource.U3;
import com.ironsource.U4;
import com.ironsource.X3;
import com.ironsource.X4;
import com.ironsource.Y6;
import com.ironsource.Z3;
import com.ironsource.eh;
import com.ironsource.gh;
import com.ironsource.hh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.ph;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class v implements com.ironsource.sdk.controller.l, Oc, DownloadListener {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f30524d0 = "about:blank";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static int f30525e0 = 0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static String f30526f0 = "is_store";
    public static String g0 = "external_url";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static String f30527h0 = "secondary_web_view";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static String f30528i0 = "success";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static String f30529j0 = "fail";
    private InterfaceC0563s4 A;
    private String B;
    private com.ironsource.sdk.controller.d C;
    private Dg D;
    private C0274c1 E;
    private U4 H;
    private com.ironsource.sdk.controller.o I;
    private com.ironsource.sdk.controller.q J;
    private com.ironsource.sdk.controller.u K;
    private com.ironsource.sdk.controller.i L;
    private com.ironsource.sdk.controller.a M;
    private com.ironsource.sdk.controller.j N;
    private C0596u1 O;
    private C0653x4 P;
    private gh Q;
    private com.ironsource.sdk.controller.c R;
    private R3 S;
    private JSONObject T;
    private com.ironsource.sdk.controller.l.a U;
    private com.ironsource.sdk.controller.l.b V;
    private C0402j4 W;
    private boolean X;
    private final boolean Y;
    private final InterfaceC0674y7 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R7 f30530a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    C0241a4 f30531a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0331f4 f30532b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private volatile C0355ga f30533b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Qc f30535c0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f30539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0314e5 f30540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private q f30542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f30543k;
    private CountDownTimer l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CountDownTimer f30544m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p f30549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f30550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FrameLayout f30551t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f30552u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private FrameLayout f30553v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private EnumC0089v f30554w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f30555x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC0599u4 f30556y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private InterfaceC0581t4 f30557z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30534c = "v";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30536d = "IronSource";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30537e = "We're sorry, some error occurred. we will investigate it";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eh f30545n = new eh();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f30546o = 50;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f30547p = 50;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f30548q = X3.e.f27729b;
    private Object F = new Object();
    private boolean G = false;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0532q8 f30560a;

        public c(C0532q8 c0532q8) {
            this.f30560a = c0532q8;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.R.c("controller html - failed to download - " + this.f30560a.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30562a;

        public d(Context context) {
            this.f30562a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.f30562a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30564a;

        public e(Context context) {
            this.f30564a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.g(this.f30564a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0514p8.e f30566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30567b;

        public f(C0514p8.e eVar, String str) {
            this.f30566a = eVar;
            this.f30567b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0545r4 interfaceC0545r4A;
            C0514p8.e eVar = this.f30566a;
            if ((eVar == C0514p8.e.RewardedVideo || eVar == C0514p8.e.Interstitial) && (interfaceC0545r4A = v.this.a(eVar)) != null) {
                interfaceC0545r4A.b(this.f30566a, this.f30567b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements gh {
        public h() {
        }

        @Override // com.ironsource.gh
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f30571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f30572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30574d;

        public i(JSONObject jSONObject, WebView webView, int i10, String str) {
            this.f30571a = jSONObject;
            this.f30572b = webView;
            this.f30573c = i10;
            this.f30574d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(this.f30571a, this.f30572b);
            if (v.B()) {
                v.this.f30545n.a(this.f30573c, this.f30574d);
                v.this.m("about:blank");
            } else {
                v.this.m("about:blank");
                v.this.m(this.f30574d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k implements t {
        public k() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C0514p8.e eVar, T4 t10) {
            v.this.a(str, eVar, t10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class l implements t {
        public l() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C0514p8.e eVar, T4 t10) {
            v.this.a(str, eVar, t10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class m implements t {
        public m() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C0514p8.e eVar, T4 t10) {
            v.this.a(str, eVar, t10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0514p8.e f30584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T4 f30585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30586c;

        public n(C0514p8.e eVar, T4 t10, String str) {
            this.f30584a = eVar;
            this.f30585b = t10;
            this.f30586c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            T4 t10;
            C0514p8.e eVar = C0514p8.e.RewardedVideo;
            C0514p8.e eVar2 = this.f30584a;
            if ((eVar != eVar2 && C0514p8.e.Interstitial != eVar2 && C0514p8.e.Banner != eVar2) || (t10 = this.f30585b) == null || TextUtils.isEmpty(t10.h())) {
                return;
            }
            InterfaceC0545r4 interfaceC0545r4A = v.this.a(this.f30584a);
            Log.d(v.this.f30534c, "onAdProductInitFailed (message:" + this.f30586c + ")(" + this.f30584a + ")");
            if (interfaceC0545r4A != null) {
                interfaceC0545r4A.a(this.f30584a, this.f30585b.h(), this.f30586c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class p extends WebChromeClient {
        public /* synthetic */ p(v vVar, int i10) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(v.this.f30533b0.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new r(v.this, 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            View view = v.this.f30550s;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            v vVar = v.this;
            vVar.f30551t.removeView(vVar.f30550s);
            v vVar2 = v.this;
            vVar2.f30550s = null;
            vVar2.f30551t.setVisibility(8);
            v.this.f30552u.onCustomViewHidden();
            v.this.f30533b0.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            v.this.f30533b0.setVisibility(8);
            if (v.this.f30550s != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            v.this.f30551t.addView(view);
            v vVar = v.this;
            vVar.f30550s = view;
            vVar.f30552u = customViewCallback;
            vVar.f30551t.setVisibility(0);
        }

        private p() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C0514p8.e f30590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f30591b;

        public q(C0514p8.e eVar, String str) {
            this.f30590a = eVar;
            this.f30591b = str;
        }

        public String a() {
            return this.f30591b;
        }

        public C0514p8.e b() {
            return this.f30590a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class r extends WebViewClient {
        public /* synthetic */ r(v vVar, int i10) {
            this();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(v.this.f30534c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context contextQ = v.this.q();
            contextQ.startActivity(new OpenUrlActivity.e(new com.ironsource.sdk.controller.k.c()).a(str).b(false).a(contextQ));
            return true;
        }

        private r() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class s {

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30595b;

            public a(String str, String str2) {
                this.f30594a = str;
                this.f30595b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f30594a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f30534c, "onRVShowFail(message:" + this.f30594a + ")");
                v.this.f30556y.b(this.f30595b, str);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30597a;

            public b(String str) {
                this.f30597a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f30534c, "onInterstitialInitSuccess()");
                v.this.f30557z.a(C0514p8.e.Interstitial, this.f30597a, (C0256b1) null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30599a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30600b;

            public c(String str, String str2) {
                this.f30599a = str;
                this.f30600b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f30599a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f30534c, "onInterstitialInitFail(message:" + str + ")");
                v.this.f30557z.a(C0514p8.e.Interstitial, this.f30600b, str);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0545r4 f30602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0514p8.e f30603b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30604c;

            public d(InterfaceC0545r4 interfaceC0545r4, C0514p8.e eVar, String str) {
                this.f30602a = interfaceC0545r4;
                this.f30603b = eVar;
                this.f30604c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f30602a.a(this.f30603b, this.f30604c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30606a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ JSONObject f30607b;

            public e(String str, JSONObject jSONObject) {
                this.f30606a = str;
                this.f30607b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f30557z.a(this.f30606a, this.f30607b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30609a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30610b;

            public f(String str, String str2) {
                this.f30609a = str;
                this.f30610b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f30609a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f30557z.a(this.f30610b, str);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30612a;

            public g(String str) {
                this.f30612a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f30534c, "onBannerInitSuccess()");
                v.this.A.a(C0514p8.e.Banner, this.f30612a, (C0256b1) null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30614a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30615b;

            public h(String str, String str2) {
                this.f30614a = str;
                this.f30615b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f30614a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f30534c, "onBannerInitFail(message:" + str + ")");
                v.this.A.a(C0514p8.e.Banner, this.f30615b, str);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0353g8 f30618b;

            public i(String str, C0353g8 c0353g8) {
                this.f30617a = str;
                this.f30618b = c0353g8;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f30534c, "onBannerLoadSuccess()");
                v.this.A.a(this.f30617a, this.f30618b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30621b;

            public j(String str, String str2) {
                this.f30620a = str;
                this.f30621b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f30534c, "onLoadBannerFail()");
                String str = this.f30620a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.A.c(this.f30621b, str);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class k implements Runnable {
            public k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.I();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class l implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30624a;

            public l(String str) {
                this.f30624a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new JSONObject(this.f30624a).has(com.ironsource.sdk.controller.f.b.f30387b)) {
                        v.this.U.a(com.ironsource.sdk.controller.f.a.a(this.f30624a));
                    } else {
                        v.this.V.a(Nb.a(this.f30624a));
                    }
                } catch (JSONException e10) {
                    C0474n4.d().a(e10);
                    Logger.e(v.this.f30534c, "failed to parse received message");
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class m implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0514p8.e f30626a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30627b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30628c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ JSONObject f30629d;

            public m(C0514p8.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f30626a = eVar;
                this.f30627b = str;
                this.f30628c = str2;
                this.f30629d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0545r4 interfaceC0545r4A;
                C0514p8.e eVar = this.f30626a;
                if ((eVar == C0514p8.e.Interstitial || eVar == C0514p8.e.RewardedVideo || eVar == C0514p8.e.Banner) && (interfaceC0545r4A = v.this.a(eVar)) != null) {
                    interfaceC0545r4A.a(this.f30626a, this.f30627b, this.f30628c, this.f30629d);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class n implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30631a;

            public n(String str) {
                this.f30631a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.f30534c, "omidAPI(" + this.f30631a + ")");
                    v.this.I.a(new C0395ie(this.f30631a).toString(), s.this.new w());
                } catch (Exception e10) {
                    C0474n4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                    Logger.i(v.this.f30534c, "omidAPI failed with exception " + e10.getMessage());
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class o implements Runnable {
            public o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.E();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class p implements Runnable {
            public p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f30533b0.removeJavascriptInterface(X3.f27646e);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class q implements Runnable {
            public q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f30533b0.getSettings().setMixedContentMode(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class r implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f30636a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30637b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C0256b1 f30638c;

            public r(int i10, String str, C0256b1 c0256b1) {
                this.f30636a = i10;
                this.f30637b = str;
                this.f30638c = c0256b1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f30636a <= 0) {
                    v.this.f30556y.c(this.f30637b);
                } else {
                    Log.d(v.this.f30534c, "onRVInitSuccess()");
                    v.this.f30556y.a(C0514p8.e.RewardedVideo, this.f30637b, this.f30638c);
                }
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$s, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0087s implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30640a;

            public RunnableC0087s(String str) {
                this.f30640a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.N.a(new JSONObject(this.f30640a), s.this.new w());
                } catch (Exception e10) {
                    C0474n4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                    Logger.i(v.this.f30534c, "fileSystemAPI failed with exception " + e10.getMessage());
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class t implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30643b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f30644c;

            public t(String str, String str2, int i10) {
                this.f30642a = str;
                this.f30643b = str2;
                this.f30644c = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f30642a.equalsIgnoreCase(C0514p8.e.RewardedVideo.toString())) {
                    v.this.f30556y.a(this.f30643b, this.f30644c);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class u implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30646a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f30647b;

            public u(String str, int i10) {
                this.f30646a = str;
                this.f30647b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f30557z.onInterstitialAdRewarded(this.f30646a, this.f30647b);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$v, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0088v implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30649a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30650b;

            public RunnableC0088v(String str, String str2) {
                this.f30649a = str;
                this.f30650b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f30649a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f30534c, "onRVInitFail(message:" + str + ")");
                v.this.f30556y.a(C0514p8.e.RewardedVideo, this.f30650b, str);
            }
        }

        public s() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void s(String str) {
            try {
                Logger.i(v.this.f30534c, "permissionsAPI(" + str + ")");
                v.this.J.a(new C0395ie(str).toString(), new w());
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f30534c, "permissionsAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.f30534c, "adClicked(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d(X3.i.f27802m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            C0514p8.e eVarG = v.this.g(strD);
            InterfaceC0545r4 interfaceC0545r4A = v.this.a(eVarG);
            if (eVarG == null || interfaceC0545r4A == null) {
                return;
            }
            v.this.b(new d(interfaceC0545r4A, eVarG, strFetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            Log.d(v.this.f30536d, "adCredited(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d(X3.i.f27799k);
            int i10 = strD != null ? Integer.parseInt(strD) : 0;
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            String strD2 = c0395ie.d(X3.i.f27802m);
            if (TextUtils.isEmpty(strD2)) {
                Log.d(v.this.f30536d, "adCredited | product type is missing");
            }
            if (C0514p8.e.Interstitial.toString().equalsIgnoreCase(strD2)) {
                a(strFetchDemandSourceId, i10);
            } else if (v.this.r(strD2)) {
                v.this.b(new t(strD2, strFetchDemandSourceId, i10));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            Logger.i(v.this.f30534c, "adUnitsReady(" + str + ")");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C0395ie(str));
            C0256b1 c0256b1 = new C0256b1(str);
            if (!c0256b1.g()) {
                v.this.a(str, false, X3.c.f27707r, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String strD = c0256b1.d();
            if (C0514p8.e.RewardedVideo.toString().equalsIgnoreCase(strD) && v.this.r(strD)) {
                v.this.b(new r(Integer.parseInt(c0256b1.c()), strFetchDemandSourceId, c0256b1));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            v.this.f30530a.a(new a0(this, str, 1), R7.l);
        }

        @JavascriptInterface
        public void androidSandboxApi(String str) {
            R7.f27125a.b(new a0(this, str, 4));
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.f30534c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C0514p8.e eVarG;
            try {
                Logger.i(v.this.f30534c, "cleanAdInstance(" + str + ")");
                C0395ie c0395ie = new C0395ie(str);
                String strD = c0395ie.d(X3.i.f27802m);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
                if (TextUtils.isEmpty(strFetchDemandSourceId) || (eVarG = v.this.g(strD)) == null) {
                    return;
                }
                v.this.H.b(eVarG, strFetchDemandSourceId);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> arrayListA = C0301da.e().a();
                C0395ie c0395ie = new C0395ie(str);
                if (!arrayListA.isEmpty()) {
                    c0395ie.b(X3.i.f27823x0, arrayListA.toString());
                }
                v.this.a(c0395ie.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            v.this.f30530a.a(new a0(this, str, 8), "deleteFile");
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            v.this.f30530a.a(new a0(this, str, 0), "deleteFolder");
        }

        @JavascriptInterface
        public void destroyInlineStore(String str) {
            Logger.i(v.this.f30534c, "destroyInlineStore() called");
            try {
                com.unity3d.ironsourceads.internal.services.a.AbstractC0221a abstractC0221aA = new com.unity3d.ironsourceads.internal.services.b().a(v.this.q(), EnumC0443l9.f29175b.a(new C0395ie(str).a(X3.f.f27739e, EnumC0443l9.APP_ACTIVITY.b())));
                if (abstractC0221aA instanceof com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.C0222a) {
                    v.this.a(str, false, ((com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.C0222a) abstractC0221aA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            v.this.f30530a.a(new a0(this, str, 6), R7.f27135k);
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            f2.t("displayWebView(", str, ")", v.this.f30534c);
            v.this.a(str, true, (String) null, (String) null);
            C0395ie c0395ie = new C0395ie(str);
            boolean zBooleanValue = ((Boolean) c0395ie.b(X3.i.f27786d)).booleanValue();
            String strD = c0395ie.d(X3.i.f27802m);
            boolean zC = c0395ie.c(X3.i.f27816u);
            String strD2 = c0395ie.d("adViewId");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            boolean zC2 = c0395ie.c(X3.i.f27827z0);
            if (!zBooleanValue) {
                v.this.a(EnumC0089v.Gone);
                v.this.o();
                return;
            }
            v.this.G = c0395ie.c(X3.i.f27818v);
            boolean zC3 = c0395ie.c(X3.i.f27824y);
            EnumC0089v enumC0089vV = v.this.v();
            EnumC0089v enumC0089v = EnumC0089v.Display;
            if (enumC0089vV == enumC0089v) {
                Logger.i(v.this.f30534c, "State: " + v.this.f30554w);
                return;
            }
            v.this.a(enumC0089v);
            Logger.i(v.this.f30534c, "State: " + v.this.f30554w);
            Context contextQ = v.this.q();
            String strT = v.this.t();
            int iK = v.this.Z.K(contextQ);
            if (zC) {
                com.ironsource.sdk.controller.h hVar = new com.ironsource.sdk.controller.h(contextQ);
                hVar.addView(v.this.f30553v);
                hVar.a(v.this);
                return;
            }
            Intent intent = zC3 ? new Intent(contextQ, (Class<?>) InterstitialActivity.class) : new Intent(contextQ, (Class<?>) ControllerActivity.class);
            C0514p8.e eVar = C0514p8.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(strD)) {
                if ("application".equals(strT)) {
                    strT = SDKUtils.translateRequestedOrientation(v.this.Z.M(contextQ));
                }
                intent.putExtra(X3.i.f27802m, eVar.toString());
                v.this.E.a(eVar.ordinal());
                v.this.E.f(strFetchDemandSourceId);
                if (v.this.r(eVar.toString())) {
                    v.this.f30556y.c(eVar, strFetchDemandSourceId);
                }
            } else {
                C0514p8.e eVar2 = C0514p8.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(strD)) {
                    if ("application".equals(strT)) {
                        strT = SDKUtils.translateRequestedOrientation(v.this.Z.M(contextQ));
                    }
                    intent.putExtra(X3.i.f27802m, eVar2.toString());
                }
            }
            if (strD2 != null) {
                intent.putExtra("adViewId", strD2);
            }
            intent.putExtra(X3.i.f27827z0, zC2);
            intent.setFlags(536870912);
            intent.putExtra(X3.i.f27818v, v.this.G);
            intent.putExtra(X3.i.A, strT);
            intent.putExtra(X3.i.B, iK);
            v vVar = v.this;
            vVar.f30542j = new q(vVar.g(strD), strFetchDemandSourceId);
            contextQ.startActivity(intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            v.this.f30530a.a(new a0(this, str, 5), R7.f27130f);
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            f2.t("fileSystemAPI(", str, ")", v.this.f30534c);
            v.this.a(new RunnableC0087s(str));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004d  */
        @JavascriptInterface
        public void getApplicationInfo(String str) {
            f2.t("getApplicationInfo(", str, ")", v.this.f30534c);
            String strE = v.this.e(str);
            String strD = v.this.d(str);
            C0395ie c0395ie = new C0395ie(str);
            Object[] objArrF = v.this.f(c0395ie.d(X3.i.f27802m), SDKUtils.fetchDemandSourceId(c0395ie));
            String str2 = (String) objArrF[0];
            if (((Boolean) objArrF[1]).booleanValue()) {
                if (TextUtils.isEmpty(strD)) {
                    strE = null;
                } else {
                    strE = strD;
                }
            } else if (TextUtils.isEmpty(strE)) {
                strE = null;
            }
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, str2, X3.h.f27765n, X3.h.f27766o));
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            v.this.f30530a.a(new a0(this, str, 9), R7.f27133i);
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String strE;
            Logger.i(v.this.f30534c, "getConnectivityInfo(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d(v.f30528i0);
            String strD2 = c0395ie.d(v.f30529j0);
            JSONObject jSONObject = new JSONObject();
            v vVar = v.this;
            R3 r3 = vVar.S;
            if (r3 != null) {
                jSONObject = r3.a(vVar.f30533b0.getContext());
            }
            if (jSONObject.length() > 0) {
                strE = v.this.e(strD, jSONObject.toString());
            } else {
                strE = v.this.e(strD2, v.e0(v.this, "errMsg", X3.c.A, null, null, null, null, null, null));
            }
            v.this.i(strE);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            Logger.i(v.this.f30534c, "getControllerConfig(" + str + ")");
            String strD = new C0395ie(str).d(v.f30528i0);
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            v.this.i(v.this.e(strD, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) {
            String strD;
            Logger.i(v.this.f30534c, "getMediationState(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD2 = c0395ie.d("demandSourceName");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            String strD3 = c0395ie.d(X3.i.f27802m);
            if (strD3 == null || strD2 == null) {
                return;
            }
            try {
                C0514p8.e productType = SDKUtils.getProductType(strD3);
                if (productType != null) {
                    T4 t4A = v.this.H.a(productType, strFetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(X3.i.f27802m, strD3);
                    jSONObject.put("demandSourceName", strD2);
                    jSONObject.put("demandSourceId", strFetchDemandSourceId);
                    if (t4A == null || t4A.a(-1)) {
                        strD = v.this.d(str);
                    } else {
                        strD = v.this.e(str);
                        jSONObject.put("state", t4A.j());
                    }
                    a(strD, jSONObject.toString());
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void getDeviceStatus(String str) {
            v.this.f30530a.a(new a0(this, str, 3), R7.f27128d);
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            f2.t("getDeviceVolume(", str, ")", v.this.f30534c);
            try {
                Context context = v.this.f30533b0.getContext();
                float fA = X4.b(context).a(context);
                C0395ie c0395ie = new C0395ie(str);
                c0395ie.b(X3.j.P, String.valueOf(fA));
                v.this.a(c0395ie.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            Logger.i(v.this.f30534c, "getInitSummery(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            c0395ie.a(X3.j.f27859q0, v.this.T);
            v.this.a(c0395ie.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            C0639w8.a(C0377he.f28826z, new C0549r8().a(B5.f25711y, str).a());
            String strE = v.this.e(str);
            String string = SDKUtils.getOrientation(v.this.f30533b0.getContext()).toString();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, string, X3.h.X, X3.h.Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            Logger.i(v.this.f30534c, "getUserData(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            if (!c0395ie.a(X3.i.W)) {
                v.this.a(str, false, X3.c.F, (String) null);
                return;
            }
            String strE = v.this.e(str);
            String strD = c0395ie.d(X3.i.W);
            v.this.i(v.this.e(strE, v.e0(v.this, strD, C0301da.e().a(strD), null, null, null, null, null, null)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            v.this.f30530a.a(new a0(this, str, 7), R7.f27129e);
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.f30534c, "initController(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            CountDownTimer countDownTimer = v.this.f30544m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.f30544m = null;
            }
            if (c0395ie.a(X3.i.f27810q)) {
                String strD = c0395ie.d(X3.i.f27810q);
                if (X3.i.f27813s.equalsIgnoreCase(strD)) {
                    v vVar = v.this;
                    vVar.f30541i = true;
                    vVar.R.d();
                } else if (X3.i.f27812r.equalsIgnoreCase(strD)) {
                    v.this.R.c();
                } else if (!X3.i.f27815t.equalsIgnoreCase(strD)) {
                    Logger.i(v.this.f30534c, "No STAGE mentioned! should not get here!");
                } else {
                    v.this.R.c(defpackage.e.n("controller js failed to initialize : ", c0395ie.d("errMsg")));
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            f2.t("onAdWindowsClosed(", str, ")", v.this.f30534c);
            v.this.E.a();
            v.this.E.f(null);
            v.this.f30542j = null;
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d(X3.i.f27802m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            C0514p8.e eVarG = v.this.g(strD);
            Log.d(v.this.f30536d, "onAdClosed() with type " + eVarG);
            if (v.this.r(strD)) {
                v.this.a(eVarG, strFetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.i(v.this.f30534c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            f2.t("onGetApplicationInfoFail(", str, ")", v.this.f30534c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            f2.t("onGetApplicationInfoSuccess(", str, ")", v.this.f30534c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            f2.t("onGetCachedFilesMapFail(", str, ")", v.this.f30534c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            f2.t("onGetCachedFilesMapSuccess(", str, ")", v.this.f30534c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            f2.t("onGetDeviceStatusFail(", str, ")", v.this.f30534c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            f2.t("onGetDeviceStatusSuccess(", str, ")", v.this.f30534c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.f30534c, "onInitBannerFail(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f30534c, "onInitBannerFail failed with no demand source");
                return;
            }
            U4 u6 = v.this.H;
            C0514p8.e eVar = C0514p8.e.Banner;
            T4 t4A = u6.a(eVar, strFetchDemandSourceId);
            if (t4A != null) {
                t4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new h(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(v.this.f30534c, "onInitBannerSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C0395ie(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f30534c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.r(C0514p8.e.Banner.toString())) {
                v.this.b(new g(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.f30534c, "onInitInterstitialFail(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f30534c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            U4 u6 = v.this.H;
            C0514p8.e eVar = C0514p8.e.Interstitial;
            T4 t4A = u6.a(eVar, strFetchDemandSourceId);
            if (t4A != null) {
                t4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new c(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(v.this.f30534c, "onInitInterstitialSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C0395ie(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f30534c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.r(C0514p8.e.Interstitial.toString())) {
                v.this.b(new b(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.f30534c, "onInitRewardedVideoFail(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            U4 u6 = v.this.H;
            C0514p8.e eVar = C0514p8.e.RewardedVideo;
            T4 t4A = u6.a(eVar, strFetchDemandSourceId);
            if (t4A != null) {
                t4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new RunnableC0088v(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.f30534c, "onLoadBannerFail()");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(strFetchDemandSourceId) && v.this.r(C0514p8.e.Banner.toString())) {
                v.this.b(new j(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.f30534c, "onLoadBannerSuccess()");
            C0395ie c0395ie = new C0395ie(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            String strD = c0395ie.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            H8 h8A = C0460m8.a().a(strD);
            if (h8A == null) {
                v.this.A.c(strFetchDemandSourceId, "not found view for the current adViewId= " + strD);
                return;
            }
            if (h8A instanceof C0353g8) {
                C0353g8 c0353g8 = (C0353g8) h8A;
                if (v.this.r(C0514p8.e.Banner.toString())) {
                    v.this.b(new i(strFetchDemandSourceId, c0353g8));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.f30534c, "onLoadInterstitialFail(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            a(strFetchDemandSourceId, false);
            if (v.this.r(C0514p8.e.Interstitial.toString())) {
                v.this.b(new f(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.f30534c, "onLoadInterstitialSuccess(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            JSONObject jSONObjectA = c0395ie.a();
            a(strFetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.r(C0514p8.e.Interstitial.toString())) {
                v.this.b(new e(strFetchDemandSourceId, jSONObjectA));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            f2.t("onReceivedMessage(", str, ")", v.this.f30534c);
            R7.f27125a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.f30534c, "onShowInterstitialFail(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            v.this.b(new com.applovin.impl.sdk.v(this, v.this.r(C0514p8.e.Interstitial.toString()), strD, strFetchDemandSourceId, 7));
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            f2.t("onShowInterstitialSuccess(", str, ")", v.this.f30534c);
            v.this.a(str, true, (String) null, (String) null);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C0395ie(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f30534c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C0274c1 c0274c1 = v.this.E;
            C0514p8.e eVar = C0514p8.e.Interstitial;
            c0274c1.a(eVar.ordinal());
            v.this.E.f(strFetchDemandSourceId);
            v.this.b(new cj.i(this, v.this.r(eVar.toString()), strFetchDemandSourceId, 5));
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.f30534c, "onShowRewardedVideoFail(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
            if (v.this.r(C0514p8.e.RewardedVideo.toString())) {
                v.this.b(new a(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            f2.t("onShowRewardedVideoSuccess(", str, ")", v.this.f30534c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(v.this.f30534c, "onVideoStatusChanged(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d(X3.i.f27802m);
            if (v.this.D == null || TextUtils.isEmpty(strD)) {
                return;
            }
            String strD2 = c0395ie.d("status");
            if (X3.i.f27787d0.equalsIgnoreCase(strD2)) {
                v.this.D.onVideoStarted();
                return;
            }
            if (X3.i.f27789e0.equalsIgnoreCase(strD2)) {
                v.this.D.onVideoPaused();
                return;
            }
            if (X3.i.f27791f0.equalsIgnoreCase(strD2)) {
                v.this.D.onVideoResumed();
                return;
            }
            if (X3.i.g0.equalsIgnoreCase(strD2)) {
                v.this.D.onVideoEnded();
                return;
            }
            if (X3.i.f27794h0.equalsIgnoreCase(strD2)) {
                v.this.D.onVideoStopped();
                return;
            }
            Logger.i(v.this.f30534c, "onVideoStatusChanged: unknown status: " + strD2);
        }

        @JavascriptInterface
        public void openInlineStore(String str) {
            try {
                Logger.i(v.this.f30534c, "openInlineStore(" + str + ")");
                C0395ie c0395ie = new C0395ie(str);
                com.unity3d.ironsourceads.internal.services.a.AbstractC0221a abstractC0221aA = new com.unity3d.ironsourceads.internal.services.b().a(v.this.q(), new C0407j9(c0395ie.d("url"), c0395ie.d(X3.f.f27737c), EnumC0443l9.f29175b.a(c0395ie.a(X3.f.f27739e, EnumC0443l9.APP_ACTIVITY.b())), (!c0395ie.a(X3.f.f27738d) || c0395ie.e(X3.f.f27738d)) ? null : (JSONObject) c0395ie.b(X3.f.f27738d)));
                if (abstractC0221aA instanceof com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.C0222a) {
                    v.this.a(str, false, ((com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.C0222a) abstractC0221aA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.i(v.this.f30534c, "openUrl(" + str + ")");
                C0395ie c0395ie = new C0395ie(str);
                com.ironsource.sdk.controller.p.c cVarA = new com.ironsource.sdk.controller.p.a(c0395ie.d("method"), new Sc(v.this.G, 805306368)).a(c0395ie.c(X3.i.L0) ? v.this.f30533b0.getContext() : v.this.q(), new Rc(c0395ie.d("url"), c0395ie.d("package_name")));
                if (cVarA instanceof com.ironsource.sdk.controller.p.c.a) {
                    v.this.a(str, false, ((com.ironsource.sdk.controller.p.c.a) cVarA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            v.this.c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            v.this.f30530a.a(new a0(this, str, 2), R7.f27134j);
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            String str2;
            try {
                Logger.i(v.this.f30534c, "postAdEventNotification(" + str + ")");
                C0395ie c0395ie = new C0395ie(str);
                String strD = c0395ie.d(X3.i.f27798j0);
                if (TextUtils.isEmpty(strD)) {
                    v.this.a(str, false, X3.c.f27712w, (String) null);
                    return;
                }
                String strD2 = c0395ie.d(X3.i.f27800k0);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c0395ie);
                String str3 = !TextUtils.isEmpty(strFetchDemandSourceId) ? strFetchDemandSourceId : strD2;
                JSONObject jSONObject = (JSONObject) c0395ie.b(X3.i.f27801l0);
                String strD3 = c0395ie.d(X3.i.f27802m);
                C0514p8.e eVarG = v.this.g(strD3);
                if (!v.this.r(strD3)) {
                    v.this.a(str, false, X3.c.f27711v, (String) null);
                    return;
                }
                String strE = v.this.e(str);
                if (TextUtils.isEmpty(strE)) {
                    str2 = str3;
                } else {
                    str2 = str3;
                    v.this.i(v.this.a(strE, v.e0(v.this, X3.i.f27802m, strD3, X3.i.f27798j0, strD, "demandSourceName", strD2, "demandSourceId", str2), X3.h.f27753c0, X3.h.f27755d0));
                }
                v.this.b(new m(eVarG, str2, strD, jSONObject));
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            f2.t("removeCloseEventHandler(", str, ")", v.this.f30534c);
            CountDownTimer countDownTimer = v.this.l;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            v.this.f30543k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            v.this.c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.i(v.this.f30534c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            v.this.c(new k());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                Logger.i(v.this.f30534c, "saveFile(" + str + ")");
                C0395ie c0395ie = new C0395ie(str);
                String strD = c0395ie.d("path");
                String strD2 = c0395ie.d(X3.i.f27782b);
                if (TextUtils.isEmpty(strD2)) {
                    v.this.a(str, false, X3.c.f27697g, "1");
                    return;
                }
                C0693z8 c0693z8 = new C0693z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, strD), SDKUtils.getFileName(strD2));
                IronSourceStorageUtils.ensurePathSafety(c0693z8, v.this.B);
                v vVar = v.this;
                if (vVar.Z.a(vVar.B) <= 0) {
                    v.this.a(str, false, Z3.A, (String) null);
                    return;
                }
                if (c0693z8.exists()) {
                    v.this.a(str, false, Z3.f28088z, (String) null);
                    return;
                }
                if (!T3.h(v.this.f30533b0.getContext())) {
                    v.this.a(str, false, Z3.C, (String) null);
                    return;
                }
                v.this.a(str, true, (String) null, (String) null);
                v.this.f30540h.a(c0693z8, strD2, c0395ie.a("connectionTimeout", 0), c0395ie.a("readTimeout", 0));
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.f30534c, "setBackButtonState(" + str + ")");
            C0301da.e().c(new C0395ie(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.f30534c, "setForceClose(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            String strD = c0395ie.d("width");
            String strD2 = c0395ie.d("height");
            v.this.f30546o = Integer.parseInt(strD);
            v.this.f30547p = Integer.parseInt(strD2);
            v.this.f30548q = c0395ie.d(X3.i.L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            f2.t("setMixedContentAlwaysAllow(", str, ")", v.this.f30534c);
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.f30534c, "setOrientation(" + str + ")");
                String strD = new C0395ie(str).d("orientation");
                v.this.o(strD);
                v vVar = v.this;
                if (vVar.f30535c0 != null) {
                    v.this.f30535c0.onOrientationChanged(strD, vVar.Z.K(vVar.f30533b0.getContext()));
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.f30534c, "setStoreSearchKeys(" + str + ")");
            C0301da.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.i(v.this.f30534c, "setUserData(" + str + ")");
            C0395ie c0395ie = new C0395ie(str);
            if (!c0395ie.a(X3.i.W)) {
                v.this.a(str, false, X3.c.F, (String) null);
                return;
            }
            if (!c0395ie.a(X3.i.X)) {
                v.this.a(str, false, X3.c.G, (String) null);
                return;
            }
            String strD = c0395ie.d(X3.i.W);
            String strD2 = c0395ie.d(X3.i.X);
            C0301da.e().a(strD, strD2);
            v.this.i(v.this.e(v.this.e(str), v.e0(v.this, strD, strD2, null, null, null, null, null, null)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            f2.t("setWebviewBackgroundColor(", str, ")", v.this.f30534c);
            v.this.q(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            f2.t("stillAlive(", str, ")", v.this.f30534c);
            v.this.f30532b.a();
        }

        public void u(String str) {
            v.this.i(v.this.a(X3.h.f27754d, str, (String) null, (String) null));
        }

        public void v(String str) {
            v.this.i(v.this.a(X3.h.f27756e, str, (String) null, (String) null));
        }

        private void a(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", v.this.C.f());
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                Logger.d(v.this.f30534c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(X3.a.f27673h, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                C0639w8.a(C0377he.f28816p, new C0549r8().a(B5.A, e10.getMessage()).a());
                Logger.d(v.this.f30534c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.X) {
                return;
            }
            a(jSONObject);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m(String str) {
            try {
                Logger.i(v.this.f30534c, "deleteFolder(" + str + ")");
                String strD = new C0395ie(str).d("path");
                if (strD == null) {
                    v.this.a(str, false, X3.c.f27697g, "1");
                    return;
                }
                C0693z8 c0693z8 = new C0693z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, strD));
                IronSourceStorageUtils.ensurePathSafety(c0693z8, v.this.B);
                if (!c0693z8.exists()) {
                    v.this.a(str, false, X3.c.f27695e, "1");
                } else {
                    v.this.a(str, IronSourceStorageUtils.deleteFolder(c0693z8.getPath()), (String) null, (String) null);
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void n(String str) {
            try {
                Logger.i(v.this.f30534c, "deviceDataAPI(" + str + ")");
                v.this.L.a(new C0395ie(str).toString(), new w());
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f30534c, "deviceDataAPI failed with exception " + e10.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void o(String str) {
            try {
                Logger.i(v.this.f30534c, "dsSharedSignalsAPI(" + str + ")");
                v.this.P.a(new C0395ie(str).toString(), new w());
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f30534c, "dsSharedSignalsAPI failed with exception " + e10.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void p(String str) {
            f2.t("getCachedFilesMap(", str, ")", v.this.f30534c);
            String strE = v.this.e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            C0395ie c0395ie = new C0395ie(str);
            if (!c0395ie.a("path")) {
                v.this.a(str, false, X3.c.f27708s, (String) null);
                return;
            }
            String str2 = (String) c0395ie.b("path");
            if (!IronSourceStorageUtils.isPathExist(v.this.B, str2)) {
                v.this.a(str, false, X3.c.f27709t, (String) null);
                return;
            }
            v.this.i(v.this.a(strE, IronSourceStorageUtils.getCachedFilesMap(v.this.B, str2), X3.h.f27770s, X3.h.f27769r));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0046  */
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void q(String str) {
            f2.t("getDeviceStatus(", str, ")", v.this.f30534c);
            String strE = v.this.e(str);
            String strD = v.this.d(str);
            v vVar = v.this;
            Object[] objArrD = vVar.d(vVar.f30533b0.getContext());
            String str2 = (String) objArrD[0];
            if (((Boolean) objArrD[1]).booleanValue()) {
                if (TextUtils.isEmpty(strD)) {
                    strE = null;
                } else {
                    strE = strD;
                }
            } else if (TextUtils.isEmpty(strE)) {
                strE = null;
            }
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, str2, X3.h.l, X3.h.f27764m));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void r(String str) {
            try {
                Logger.i(v.this.f30534c, "iabTokenAPI(" + str + ")");
                v.this.K.a(new C0395ie(str).toString(), new w());
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f30534c, "iabTokenAPI failed with exception " + e10.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            try {
                InterfaceC0632w1 interfaceC0632w1A = InterfaceC0632w1.a(str);
                v vVar = v.this;
                C0596u1.a aVarA = vVar.O.a(vVar.f30533b0.getContext(), interfaceC0632w1A);
                v.this.i(v.this.e(aVarA.f(), aVarA.i().toString()));
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class w implements InterfaceC0480na {
            public w() {
            }

            @Override // com.ironsource.InterfaceC0480na
            public void a(boolean z10, String str, String str2) {
                C0395ie c0395ie = new C0395ie();
                c0395ie.b(z10 ? v.f30528i0 : v.f30529j0, str);
                c0395ie.b("data", str2);
                v.this.a(c0395ie.toString(), z10, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC0480na
            public void a(boolean z10, String str, C0395ie c0395ie) {
                c0395ie.b(z10 ? v.f30528i0 : v.f30529j0, str);
                v.this.a(c0395ie.toString(), z10, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC0480na
            public void a(boolean z10, String str, JSONObject jSONObject) {
                try {
                    jSONObject.put(z10 ? v.f30528i0 : v.f30529j0, str);
                    v.this.a(jSONObject.toString(), z10, (String) null, (String) null);
                } catch (JSONException e10) {
                    C0474n4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (b(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException e10) {
                    C0474n4.d().a(e10);
                    Logger.d(v.this.f30534c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void l(String str) {
            try {
                Logger.i(v.this.f30534c, "deleteFile(" + str + ")");
                C0395ie c0395ie = new C0395ie(str);
                String strD = c0395ie.d(X3.i.f27782b);
                String strD2 = c0395ie.d("path");
                if (strD2 != null && !TextUtils.isEmpty(strD)) {
                    C0693z8 c0693z8 = new C0693z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, strD2), strD);
                    IronSourceStorageUtils.ensurePathSafety(c0693z8, v.this.B);
                    if (!c0693z8.exists()) {
                        v.this.a(str, false, X3.c.f27696f, "1");
                        return;
                    } else {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(c0693z8), (String) null, (String) null);
                        return;
                    }
                }
                v.this.a(str, false, X3.c.f27697g, "1");
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        public boolean b(String str) {
            if (TextUtils.isEmpty(str) || str.contains(C0239a2.f28156f)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return (jSONObject.getString("testerABGroup").isEmpty() || jSONObject.getString("testFriendlyName").isEmpty()) ? false : true;
            } catch (JSONException e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                return false;
            }
        }

        private void a(String str, int i10) {
            T4 t4A;
            v vVar = v.this;
            C0514p8.e eVar = C0514p8.e.Interstitial;
            if (vVar.r(eVar.toString()) && (t4A = v.this.H.a(eVar, str)) != null && t4A.k()) {
                v.this.b(new u(str, i10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str) {
            if (z10) {
                v.this.f30557z.c(C0514p8.e.Interstitial, str);
                v.this.f30557z.b(str);
            }
            a(str, false);
        }

        private void a(String str, boolean z10) {
            T4 t4A = v.this.H.a(C0514p8.e.Interstitial, str);
            if (t4A != null) {
                t4A.a(z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str, String str2) {
            if (z10) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f30557z.d(str2, str);
            }
            a(str2, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void j(String str) {
            try {
                Logger.i(v.this.f30534c, "adViewAPI(" + str + ")");
                v.this.M.a(new C0395ie(str).toString(), new w());
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f30534c, "adViewAPI failed with exception " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface t {
        void a(String str, C0514p8.e eVar, T4 t10);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f30653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f30654b;
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum EnumC0089v {
        Display,
        Gone
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class w extends WebViewClient {
        public /* synthetic */ w(v vVar, int i10) {
            this();
        }

        private void a() {
            String strB = v.this.f30545n.b();
            if (strB != null) {
                v.this.m(strB);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (v.B() && v.this.f30545n.c() && str.equals("about:blank")) {
                a();
            }
            if (str.contains("adUnit") || str.contains("index.html")) {
                v.this.D();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            com.ironsource.sdk.controller.c cVar;
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains(X3.f27647f) && (cVar = v.this.R) != null) {
                cVar.c("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i10 + ")");
            }
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.e(v.this.f30534c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            com.ironsource.sdk.controller.c cVar = v.this.R;
            if (cVar != null) {
                cVar.b(str);
            }
            v.this.w();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean zContains;
            Logger.i("shouldInterceptRequest", str);
            try {
                zContains = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException e10) {
                C0474n4.d().a(e10);
                zContains = false;
            }
            if (zContains) {
                StringBuilder sb2 = new StringBuilder("file://");
                sb2.append(v.this.B);
                String strQ = defpackage.e.q(File.separator, "mraid.js", sb2);
                try {
                    new FileInputStream(new File(strQ));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(strQ));
                } catch (FileNotFoundException e11) {
                    C0474n4.d().a(e11);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (v.this.h(str)) {
                    v.this.A();
                    return true;
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        private w() {
        }
    }

    public v(Context context, U4 u6, C0241a4 c0241a4, com.ironsource.sdk.controller.c cVar, R7 r10, int i10, C0314e5 c0314e5, String str, com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.l.b bVar, String str2, String str3) throws Throwable {
        CountDownLatch countDownLatch;
        int i11 = 0;
        p pVar = new p(this, i11);
        this.f30549r = pVar;
        boolean zS = Kb.Y().h().s();
        this.Y = Kb.Y().h().E();
        if (zS) {
            countDownLatch = new CountDownLatch(1);
            a(context, r10, countDownLatch);
        } else {
            countDownLatch = null;
        }
        this.Z = Kb.Y().a();
        if (!zS) {
            this.f30533b0 = new C0355ga(context, new InterfaceC0551ra.a());
        }
        Logger.i(this.f30534c, "C'tor");
        this.f30531a0 = c0241a4;
        this.R = cVar;
        this.f30530a = r10;
        this.H = u6;
        if (!zS) {
            a(context, this.f30533b0);
        }
        this.B = str;
        this.E = new C0274c1();
        this.T = new JSONObject();
        this.f30540h = c0314e5;
        this.U = aVar;
        this.V = bVar;
        boolean zOptBoolean = SDKUtils.getNetworkConfiguration().optBoolean(X3.a.f27674i, false);
        this.X = zOptBoolean;
        if (zOptBoolean) {
            this.W = new C0402j4(new C0349g4(SDKUtils.getControllerUrl(), this.B, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new C0286cd(SDKUtils.getControllerUrl())), new y(this, 0), c0314e5, new InterfaceC0510p4.a());
        } else {
            c0314e5.a(this);
            this.C = new com.ironsource.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.B, SDKUtils.getControllerUrl(), c0314e5);
        }
        if (!zS) {
            this.f30533b0.setWebViewClient(new w(this, i11));
            this.f30533b0.setWebChromeClient(pVar);
            hh.a(this.f30533b0);
            a(this.f30533b0);
            this.f30533b0.setDownloadListener(this);
        }
        this.S = c(context);
        b(context);
        b(i10);
        this.f30538f = str2;
        this.f30539g = str3;
        if (zS) {
            try {
                countDownLatch.await();
                if (this.f30533b0 == null) {
                    IronLog.INTERNAL.error("WebView initialization failed");
                    this.R.c("WebView initialization failed");
                    return;
                }
            } catch (InterruptedException e10) {
                IronLog.INTERNAL.error("WebView initialization was interrupted", e10);
                C0474n4.d().a(e10);
                Thread.currentThread().interrupt();
                this.R.c("WebView initialization was interrupted");
                return;
            }
        }
        this.f30532b = InterfaceC0331f4.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    public static /* bridge */ /* synthetic */ String e0(v vVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return vVar.a(str, str2, str3, str4, str5, str6, str7, str8, null, false);
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        Logger.i(this.f30534c, str + " " + str4);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g extends R3 {
        public g(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC0584t7
        public void a(String str, JSONObject jSONObject) {
            v vVar = v.this;
            if (vVar.f30541i) {
                vVar.n(str);
            }
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC0584t7
        public void b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !v.this.f30541i) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                v.this.d(jSONObject);
            } catch (JSONException e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC0584t7
        public void a() {
            v vVar = v.this;
            if (vVar.f30541i) {
                vVar.n("none");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean B() {
        return Kb.Y().h().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        ViewParent parent = this.f30533b0.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f30533b0);
        }
        this.f30533b0.destroy();
    }

    @SuppressLint({"NewApi"})
    private void J() {
    }

    private void a(Context context, R7 r10, CountDownLatch countDownLatch) {
        r10.d(new ph(this, context, countDownLatch, 14));
    }

    private R3 c(Context context) {
        return new g(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        boolean z11 = true;
        Map<String, String> mapG = null;
        if (TextUtils.isEmpty(str)) {
            z10 = true;
        } else {
            T4 t4A = this.H.a(g(str), str2);
            if (t4A != null) {
                mapG = t4A.g();
                mapG.put("demandSourceName", t4A.f());
                mapG.put("demandSourceId", t4A.h());
            }
            try {
                jSONObject.put(X3.i.f27802m, str);
            } catch (JSONException e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            z10 = false;
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e11) {
                C0474n4.d().a(e11);
                IronLog.INTERNAL.error(e11.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f30539g)) {
            try {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27838f), SDKUtils.encodeString(this.f30539g));
            } catch (JSONException e12) {
                C0474n4.d().a(e12);
                IronLog.INTERNAL.error(e12.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f30538f)) {
            try {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27840g), SDKUtils.encodeString(this.f30538f));
            } catch (JSONException e13) {
                C0474n4.d().a(e13);
                IronLog.INTERNAL.error(e13.toString());
            }
            z11 = z10;
        }
        if (mapG != null && !mapG.isEmpty()) {
            for (Map.Entry<String, String> entry : mapG.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    p(entry.getValue());
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e14) {
                    C0474n4.d().a(e14);
                    IronLog.INTERNAL.error(e14.toString());
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z11)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new b2.o(18, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str) {
        this.f30533b0.a(new com.ironsource.sdk.controller.m.b(str, r()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str) {
        try {
            Logger.i(this.f30534c, "load(): " + str);
            this.f30533b0.loadUrl(str);
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            Logger.e(this.f30534c, "WebViewController::load: " + th2);
        }
    }

    private void n() {
        CountDownTimer countDownTimer;
        if (!Kb.Y().h().h() || (countDownTimer = this.f30544m) == null) {
            return;
        }
        countDownTimer.cancel();
        this.f30544m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str) {
        C0395ie c0395ie = new C0395ie(str);
        String strD = c0395ie.d("color");
        String strD2 = c0395ie.d("adViewId");
        int color = !X3.i.T.equalsIgnoreCase(strD) ? Color.parseColor(strD) : 0;
        if (strD2 == null) {
            this.f30533b0.setBackgroundColor(color);
            return;
        }
        WebView presentingView = C0460m8.a().a(strD2).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(color);
        }
    }

    public void A() {
        i(f(X3.h.Z));
    }

    public void D() {
        i(f(X3.h.A));
    }

    public void E() {
        try {
            this.f30533b0.onPause();
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            Logger.i(this.f30534c, "WebViewController: onPause() - " + th2);
        }
    }

    public void F() {
        this.D = null;
    }

    public void G() {
        this.f30533b0.a();
        this.f30535c0 = null;
    }

    public void H() {
        this.f30533b0.requestFocus();
    }

    public void I() {
        try {
            this.f30533b0.onResume();
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            Logger.i(this.f30534c, "WebViewController: onResume() - " + th2);
        }
    }

    public com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.r(sVar);
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = X3.c.f27715z;
        }
        i(e(X3.h.f27751a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        i(f(X3.h.f27771t));
    }

    public void g(String str, String str2) {
        i(e(X3.h.W, a(X3.i.f27808p, str2, X3.i.f27802m, str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public C0514p8.c h() {
        return C0514p8.c.Web;
    }

    public void j(String str) {
        i(e(X3.f.f27744j, a("errMsg", str, null, null, null, null, null, null, null, false)));
    }

    public void l(String str) {
        i(e(X3.h.f27774w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void o(String str) {
        this.f30555x = str;
    }

    public gh p() {
        if (this.Q == null) {
            this.Q = new h();
        }
        return this.Q;
    }

    public int r() {
        return f30525e0;
    }

    public FrameLayout s() {
        return this.f30553v;
    }

    public String t() {
        return this.f30555x;
    }

    public C0274c1 u() {
        return this.E;
    }

    public EnumC0089v v() {
        return this.f30554w;
    }

    public void w() {
        if (this.f30542j == null) {
            return;
        }
        o();
        C0514p8.e eVarB = this.f30542j.b();
        String strA = this.f30542j.a();
        if (r(eVarB.toString())) {
            a(eVarB, strA);
        }
    }

    public void x() {
        this.f30549r.onHideCustomView();
    }

    public boolean y() {
        return this.f30550s != null;
    }

    public void z() {
        i(f(X3.f.f27742h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, CountDownLatch countDownLatch) {
        try {
            try {
                this.f30533b0 = new C0355ga(context, new InterfaceC0551ra.a());
                a(context, this.f30533b0);
                this.f30533b0.setWebViewClient(new w(this, 0));
                this.f30533b0.setWebChromeClient(this.f30549r);
                hh.a(this.f30533b0);
                a(this.f30533b0);
                this.f30533b0.setDownloadListener(this);
            } catch (Exception e10) {
                this.R.c("Failed to create WebView on UI thread");
                IronLog.INTERNAL.error("Failed to create WebView on UI thread", e10);
                C0474n4.d().a(e10);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Qc qc2 = this.f30535c0;
        if (qc2 != null) {
            qc2.onCloseRequested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.f30534c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C0514p8.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(C0514p8.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C0514p8.e.Banner.toString()) || this.A == null : this.f30556y == null) : this.f30557z != null) {
            z10 = true;
        }
        if (!z10) {
            Logger.d(this.f30534c, "Trying to trigger a listener - no listener was found for product ".concat(str));
        }
        return z10;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
        if (this.X) {
            this.W.b();
            return;
        }
        this.C.a(new C0549r8());
        if (this.C.k()) {
            a(1);
        }
    }

    public void c(String str, String str2) {
        v vVar;
        String str3;
        try {
            vVar = this;
            str3 = str;
            try {
                vVar.i(vVar.e(X3.h.f27767p, vVar.a(X3.i.f27782b, str3, "path", b(str2), null, null, null, null, null, false)));
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                C0474n4.d().a(exc);
                vVar.b(str3, str2, exc.getMessage());
            }
        } catch (Exception e11) {
            e = e11;
            vVar = this;
            str3 = str;
        }
    }

    public boolean h(String str) {
        try {
            if (!new Pe(str, C0301da.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return false;
            }
            C0611ug.a(q(), str);
            return true;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new C0395ie(str).d(f30528i0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new C0395ie(str).d(f30529j0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0514p8.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C0514p8.e eVar = C0514p8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C0514p8.e eVar2 = C0514p8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C0514p8.e eVar3 = C0514p8.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    private void p(String str) {
        if (str.equalsIgnoreCase("0")) {
            this.f30533b0.getSettings().setCacheMode(2);
        } else {
            this.f30533b0.getSettings().setCacheMode(-1);
        }
    }

    private String e(Context context) {
        String[] strArr = {"com.android.vending", "com.google.market"};
        for (int i10 = 0; i10 < 2; i10++) {
            String strA = a(context, strArr[i10]);
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        return "";
    }

    public void n(String str) {
        try {
            String strD = U3.d(this.f30533b0.getContext());
            Logger.i(this.f30534c, "device status changed, connection type " + str);
            C0603u8.a(str);
            C0603u8.b(strD);
            i(e(X3.h.f27775x, a("connectionType", str, "rawConnectionType", strD, null, null, null, null, null, false)));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) {
        X4 x4B = X4.b(context);
        JSONObject jSONObject = new JSONObject();
        boolean z10 = false;
        try {
            jSONObject.put(X3.j.f27868z, "none");
            jSONObject.put(X3.j.A, SDKUtils.translateDeviceOrientation(this.Z.A(context)));
            String strD = x4B.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = x4B.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
            } else {
                z10 = true;
            }
            SDKUtils.loadGoogleAdvertiserInfo(context);
            String advertiserId = SDKUtils.getAdvertiserId();
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(this.f30534c, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            String limitAdTracking = SDKUtils.getLimitAdTracking();
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(this.f30534c, "add LAT");
                jSONObject.put(X3.j.M, Boolean.parseBoolean(limitAdTracking));
            }
            String strE = x4B.e();
            if (strE != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27850m), SDKUtils.encodeString(strE));
            } else {
                z10 = true;
            }
            String strF = x4B.f();
            if (strF != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27852n), strF.replaceAll("[^0-9/.]", ""));
            } else {
                z10 = true;
            }
            String strF2 = x4B.f();
            if (strF2 != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27854o), SDKUtils.encodeString(strF2));
            }
            String strValueOf = String.valueOf(x4B.a());
            if (strValueOf != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27856p), strValueOf);
            } else {
                z10 = true;
            }
            jSONObject.put(O6.f26722j0, String.valueOf(C0434l0.a()));
            String sDKVersion = SDKUtils.getSDKVersion();
            if (sDKVersion != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27858q), SDKUtils.encodeString(sDKVersion));
            }
            if (x4B.b() != null && x4B.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27860r), SDKUtils.encodeString(x4B.b()));
            }
            String strB = U3.b(context);
            if (strB.equals("none")) {
                z10 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
            }
            String strD2 = U3.d(context);
            if (strD2 != null) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strD2));
            } else {
                z10 = true;
            }
            jSONObject.put(SDKUtils.encodeString(X3.j.f27864v), U3.e(context));
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27866x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            jSONObject.put(X3.j.f27867y, SDKUtils.encodeString(String.valueOf(this.Z.a(this.B))));
            String strValueOf2 = String.valueOf(this.Z.o());
            if (TextUtils.isEmpty(strValueOf2)) {
                z10 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString(X3.j.G) + X3.j.f27834d + SDKUtils.encodeString("width") + X3.j.f27836e, SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(SDKUtils.encodeString(X3.j.G) + X3.j.f27834d + SDKUtils.encodeString("height") + X3.j.f27836e, SDKUtils.encodeString(String.valueOf(this.Z.b())));
            String strG = E1.g(this.f30533b0.getContext());
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
            }
            String strValueOf3 = String.valueOf(this.Z.r());
            if (!TextUtils.isEmpty(strValueOf3)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.K), SDKUtils.encodeString(strValueOf3));
            }
            String strValueOf4 = String.valueOf(this.Z.p());
            if (!TextUtils.isEmpty(strValueOf4)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.O), SDKUtils.encodeString(strValueOf4));
            }
            jSONObject.put(SDKUtils.encodeString(X3.j.P), X4.b(context).a(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.Y), this.Z.l(context));
            jSONObject.put(SDKUtils.encodeString("mcc"), T3.b(context));
            jSONObject.put(SDKUtils.encodeString("mnc"), T3.c(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.S), T3.f(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.R), SDKUtils.encodeString(T3.g(context)));
            jSONObject.put(SDKUtils.encodeString(X3.j.V), E1.f(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.X), E1.d(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.W), SDKUtils.encodeString(E1.b(context)));
            String strE2 = E1.e(context);
            if (!TextUtils.isEmpty(strE2)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27833c0), SDKUtils.encodeString(strE2));
            }
            jSONObject.put(SDKUtils.encodeString(X3.j.f27855o0), SDKUtils.encodeString(e(this.f30533b0.getContext())));
            jSONObject.put(SDKUtils.encodeString(X3.j.f27857p0), this.Z.u(context));
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z10)};
    }

    public void b(int i10) {
        f30525e0 = i10;
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        i(f(X3.h.f27772u));
    }

    private String c(JSONObject jSONObject) {
        X4 x4B = X4.b(this.f30533b0.getContext());
        StringBuilder sb2 = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            wi.d.m(sb2, "SDKVersion=", sDKVersion, X3.j.f27832c);
        }
        String strE = x4B.e();
        if (!TextUtils.isEmpty(strE)) {
            sb2.append("deviceOs=");
            sb2.append(strE);
        }
        Uri uri = Uri.parse(SDKUtils.getControllerUrl());
        if (uri != null) {
            String str = uri.getScheme() + ":";
            String host = uri.getHost();
            int port = uri.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            d5.u.r(sb2, "&protocol=", str, "&domain=", host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String string = new JSONObject(jSONObject, new String[]{X3.j.Z, X3.j.f27840g}).toString();
                    if (!TextUtils.isEmpty(string)) {
                        sb2.append(X3.j.f27832c);
                        sb2.append("controllerConfig");
                        sb2.append(X3.j.f27830b);
                        sb2.append(string);
                    }
                } catch (JSONException e10) {
                    C0474n4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
            sb2.append("&debug=");
            sb2.append(r());
            boolean featureFlagLoadControllerAndPlayerFromBundle = FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle();
            boolean zB = C0313e4.b(this.f30533b0.getContext());
            if (featureFlagLoadControllerAndPlayerFromBundle && zB) {
                sb2.append("&chfb=true");
                IronLog.INTERNAL.verbose("controller html was loaded from bundle, setting in html params");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new com.ironsource.sdk.controller.m.a(str, str2).a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t10, Map<String, String> map, InterfaceC0581t4 interfaceC0581t4) {
        a(t10, map);
    }

    public Context q() {
        return this.f30531a0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context) {
        try {
            R3 r3 = this.S;
            if (r3 == null) {
                return;
            }
            r3.c(context);
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t10) {
        Map<String, String> mapB = t10.b();
        if (mapB != null) {
            i(e(X3.h.T, SDKUtils.flatMapToJsonAsString(mapB)));
        }
        this.H.b(C0514p8.e.Interstitial, t10.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(X3.h.f27757e0, jSONObject != null ? jSONObject.toString() : null));
    }

    @SuppressLint({"AddJavascriptInterface"})
    private void a(WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), X3.f27645d);
        webView.addJavascriptInterface(b(sVar), X3.f27646e);
    }

    private String b(String str) {
        String str2 = this.B + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    public void b(String str, String str2, String str3) {
        try {
            i(e(X3.h.f27768q, a(X3.i.f27782b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
        }
    }

    public com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.g(new com.ironsource.sdk.controller.b(new s()), sVar);
    }

    public void a(com.ironsource.sdk.controller.o oVar) {
        this.I = oVar;
    }

    public void a(com.ironsource.sdk.controller.q qVar) {
        this.J = qVar;
    }

    public void a(com.ironsource.sdk.controller.u uVar) {
        this.K = uVar;
    }

    public void b(boolean z10, String str) {
        i(e(X3.h.V, a(X3.i.K, str, null, null, null, null, null, null, X3.i.f27806o, z10)));
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f30576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f30577b;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.R.c(X3.c.f27700j);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    IronLog.INTERNAL.verbose("Stopping WebView load before retry attempt $nextAttempt");
                    v.this.f30533b0.stopLoading();
                } catch (Exception unused) {
                    IronLog.INTERNAL.verbose("Failed to stop WebView loading: $error");
                }
                j jVar = j.this;
                v.this.a(jVar.f30576a + 1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j10, long j11, int i10, int i11) {
            super(j10, j11);
            this.f30576a = i10;
            this.f30577b = i11;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(v.this.f30534c, "Loading Controller Timer Finish");
            if (this.f30576a >= this.f30577b) {
                v.this.b(new a());
            } else if (v.B()) {
                v.this.c(new b());
            } else {
                v.this.a(this.f30576a + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    public void a(com.ironsource.sdk.controller.i iVar) {
        this.L = iVar;
    }

    public void a(com.ironsource.sdk.controller.a aVar) {
        this.M = aVar;
        aVar.a(p());
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    public void a(com.ironsource.sdk.controller.j jVar) {
        this.N = jVar;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        a(new d(context));
    }

    public void a(C0596u1 c0596u1) {
        this.O = c0596u1;
    }

    public void b(Runnable runnable) {
        R7 r10 = this.f30530a;
        if (r10 != null) {
            r10.c(runnable);
        }
    }

    private void a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f30553v = new FrameLayout(context);
        this.f30551t = new FrameLayout(context);
        this.f30551t.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f30551t.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.f30553v.addView(this.f30551t, layoutParams);
        this.f30553v.addView(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            R3 r3 = this.S;
            if (r3 == null) {
                return;
            }
            r3.b(context);
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    private String f(String str) {
        return new com.ironsource.sdk.controller.m.a(str).a();
    }

    @SuppressLint({"NewApi"})
    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        a(this.E);
    }

    public void a(C0653x4 c0653x4) {
        this.P = c0653x4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0545r4 a(C0514p8.e eVar) {
        if (eVar == C0514p8.e.Interstitial) {
            return this.f30557z;
        }
        if (eVar == C0514p8.e.RewardedVideo) {
            return this.f30556y;
        }
        if (eVar == C0514p8.e.Banner) {
            return this.A;
        }
        return null;
    }

    private boolean c(C0693z8 c0693z8) {
        int iSaveFile;
        boolean zCopyFileFromBundleToStorage = SDKUtils.copyFileFromBundleToStorage(this.f30533b0.getContext(), c0693z8);
        if (!zCopyFileFromBundleToStorage) {
            return false;
        }
        byte[] bArrA = C0313e4.a(this.f30533b0.getContext(), X3.f27648g);
        String strA = C0313e4.a(this.f30533b0.getContext());
        if (strA == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0693z8.getParent());
        String str = File.separator;
        d5.u.r(sb2, str, "controller_", strA, str);
        sb2.append(X3.f27648g);
        String string = sb2.toString();
        if (bArrA == null || bArrA.length == 0) {
            return zCopyFileFromBundleToStorage;
        }
        try {
            iSaveFile = IronSourceStorageUtils.saveFile(bArrA, string);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("exception: " + e10.getMessage());
            iSaveFile = 0;
            zCopyFileFromBundleToStorage = false;
        }
        if (iSaveFile != 0) {
            return zCopyFileFromBundleToStorage;
        }
        IronLog.INTERNAL.verbose("failed to read bytes for " + c0693z8.getName());
        return false;
    }

    public void a(Dg dg2) {
        this.D = dg2;
    }

    public void a(int i10) {
        String string;
        if (!this.X && !this.C.m()) {
            Logger.i(this.f30534c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String strC = c(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            strC = String.format("%s&sessionid=%s", strC, initSDKParams.get("sessionid"));
        }
        if (this.X) {
            string = this.W.c().toURI().toString();
        } else {
            string = this.C.g().toURI().toString();
        }
        String strI = wi.d.i(string, "?", strC);
        this.f30530a.d(new i(controllerConfigAsJSONObject, this.f30533b0, i10, strI));
        n();
        this.f30544m = new j(1000 * Kb.Y().h().I(), 1000L, i10, Kb.Y().h().c()).start();
    }

    public void c(String str) {
        if (str.equals(X3.i.f27795i)) {
            o();
        }
        i(e(X3.h.f27777z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    private String c(String str, String str2, String str3) {
        return new com.ironsource.sdk.controller.m.a(str, null, str2, str3).a();
    }

    public void c(Runnable runnable) {
        R7 r10 = this.f30530a;
        if (r10 != null) {
            r10.d(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean zOptBoolean = jSONObject.optBoolean("inspectWebview");
        if (zOptBoolean) {
            WebView.setWebContentsDebuggingEnabled(zOptBoolean);
        }
    }

    private void a(String str, C0514p8.e eVar, T4 t10, t tVar) {
        if (TextUtils.isEmpty(str)) {
            tVar.a("Application key are missing", eVar, t10);
        } else {
            i(a(eVar, t10).f30654b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t10, InterfaceC0599u4 interfaceC0599u4) {
        this.f30538f = str;
        this.f30539g = str2;
        this.f30556y = interfaceC0599u4;
        this.E.i(str);
        this.E.j(str2);
        a(str, C0514p8.e.RewardedVideo, t10, new k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t10, InterfaceC0581t4 interfaceC0581t4) {
        this.f30538f = str;
        this.f30539g = str2;
        this.f30557z = interfaceC0581t4;
        this.E.g(str);
        this.E.h(this.f30539g);
        a(this.f30538f, C0514p8.e.Interstitial, t10, new l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC0581t4 interfaceC0581t4) {
        HashMap map = new HashMap();
        map.put("demandSourceName", str);
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        this.E.d(str, true);
        i(a(X3.h.E, strFlatMapToJsonAsString, X3.h.F, X3.h.G));
    }

    private void a(T4 t10, Map<String, String> map) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, t10.b()});
        if (map.containsKey("adm")) {
            this.f30532b.a(new z(this));
        }
        this.E.d(t10.h(), true);
        i(a(X3.h.E, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), X3.h.F, X3.h.G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0262b7 interfaceC0262b7) {
        interfaceC0262b7.a(new z(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Y6 y10) {
        try {
            this.R.a(y10);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            Logger.e(this.f30534c, "handleLoadAd: " + e10);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0581t4 interfaceC0581t4) {
        i(a(C0514p8.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t10, Map<String, String> map, InterfaceC0581t4 interfaceC0581t4) {
        i(a(C0514p8.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, t10.b()}))));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        T4 t4A = this.H.a(C0514p8.e.Interstitial, str);
        return t4A != null && t4A.d();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t10, InterfaceC0563s4 interfaceC0563s4) {
        this.f30538f = str;
        this.f30539g = str2;
        this.A = interfaceC0563s4;
        a(str, C0514p8.e.Banner, t10, new m());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t10, Map<String, String> map, InterfaceC0563s4 interfaceC0563s4) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, t10.b()});
        if (map != null) {
            i(a(X3.h.N, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), X3.h.O, X3.h.R));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t10) {
        Map<String, String> mapB = t10.b();
        if (mapB != null) {
            i(a(X3.h.S, SDKUtils.flatMapToJsonAsString(mapB), X3.h.P, X3.h.Q));
        }
        this.H.b(C0514p8.e.Banner, t10.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0563s4 interfaceC0563s4) {
        i(a(X3.h.N, jSONObject.toString(), X3.h.O, X3.h.R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        i(a(cVar.e(), cVar.h(), X3.h.U, X3.h.U));
    }

    private u a(C0514p8.e eVar, T4 t10) {
        u uVar = new u();
        if (eVar != C0514p8.e.RewardedVideo && eVar != C0514p8.e.Interstitial && eVar != C0514p8.e.Banner) {
            return uVar;
        }
        HashMap map = new HashMap();
        map.put(X3.j.f27840g, this.f30538f);
        if (!TextUtils.isEmpty(this.f30539g)) {
            map.put(X3.j.f27838f, this.f30539g);
        }
        if (t10 != null) {
            if (t10.g() != null) {
                map.putAll(t10.g());
                map.put(X3.i.f27825y0, String.valueOf(N.f26615a.c(t10.h())));
            }
            map.put("demandSourceName", t10.f());
            map.put("demandSourceId", t10.h());
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        X3.h hVarA = X3.h.a(eVar);
        String strA = a(hVarA.f27778a, strFlatMapToJsonAsString, hVarA.f27779b, hVarA.f27780c);
        uVar.f30653a = hVarA.f27778a;
        uVar.f30654b = strA;
        return uVar;
    }

    private String a(C0514p8.e eVar, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String strOptString = jSONObject.optString("demandSourceName");
        String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        T4 t4A = this.H.a(eVar, strFetchDemandSourceId);
        if (t4A != null) {
            if (t4A.g() != null) {
                map.putAll(t4A.g());
            }
            if (!TextUtils.isEmpty(strOptString)) {
                map.put("demandSourceName", strOptString);
            }
            if (!TextUtils.isEmpty(strFetchDemandSourceId)) {
                map.put("demandSourceId", strFetchDemandSourceId);
            }
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        X3.h hVarB = X3.h.b(eVar);
        return a(hVarB.f27778a, strFlatMapToJsonAsString, hVarB.f27779b, hVarB.f27780c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object d(C0693z8 c0693z8) {
        this.f30540h.a(this);
        if (c0693z8 != null && c0693z8.exists()) {
            a(c0693z8);
            return null;
        }
        a(new C0693z8(X3.f27647f), new C0532q8(1, "Unable to download Html file"));
        return null;
    }

    public void d(JSONObject jSONObject) {
        Logger.i(this.f30534c, "device connection info changed: " + jSONObject.toString());
        i(e(X3.h.f27776y, a(X3.j.f27842h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, C0514p8.e eVar, T4 t10) {
        if (r(eVar.toString())) {
            b(new n(eVar, t10, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0599u4 interfaceC0599u4) {
        i(a(C0514p8.e.RewardedVideo, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.T = jSONObject;
        }
    }

    public void a(boolean z10, String str) {
        i(e(X3.h.V, a(X3.i.M0, str, null, null, null, null, null, null, X3.i.f27806o, z10)));
    }

    public void a(int i10, boolean z10) {
        i(e(X3.f.f27743i, a(X3.f.f27740f, String.valueOf(i10), null, null, null, null, null, null, X3.f.f27741g, z10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z10, String str2, String str3) {
        String strD = new C0395ie(str).d(z10 ? f30528i0 : f30529j0);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        i(e(strD, a(b(str, str2), str3)));
    }

    private String a(String str, String str2) {
        return a(str, str2, X3.i.f27792g);
    }

    private String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str).put(str3, str2).toString();
            } catch (JSONException e10) {
                C0474n4.d().a(e10);
            }
        }
        return str;
    }

    private String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z10);
            }
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObject.toString();
    }

    private String a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ironsource.Oc
    public void a(C0693z8 c0693z8) {
        if (this.X && this.W.a(c0693z8)) {
            a(1);
        } else {
            if (c0693z8.getName().contains(X3.f27647f)) {
                C0313e4.a(this.f30533b0.getContext(), false);
                IronLog.INTERNAL.verbose("controller html was loaded from server");
                this.C.a(new o());
                return;
            }
            c(c0693z8.getName(), c0693z8.getParent());
        }
    }

    @Override // com.ironsource.Oc
    public void a(C0693z8 c0693z8, C0532q8 c0532q8) {
        if (this.X && this.W.a(c0693z8)) {
            this.R.c("controller html - failed to download - " + c0532q8.b());
            return;
        }
        boolean zCopyFileFromBundleToStorage = false;
        if (c0693z8.getName().contains(X3.f27647f)) {
            if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && c0693z8.getName().equals(X3.f27647f)) {
                IronLog.INTERNAL.verbose("copying from bundle to storage " + c0693z8.getName() + " and sdk_controller.min.gz.js");
                zCopyFileFromBundleToStorage = c(c0693z8);
            }
            if (zCopyFileFromBundleToStorage) {
                C0639w8.a(C0377he.C);
                C0313e4.a(this.f30533b0.getContext(), true);
                this.C.a(new a());
                return;
            }
            this.C.a(new b(), new c(c0532q8));
            return;
        }
        if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && a((File) c0693z8)) {
            IronLog.INTERNAL.verbose("copying from bundle to storage " + c0693z8.getName());
            zCopyFileFromBundleToStorage = SDKUtils.copyFileFromBundleToStorage(this.f30533b0.getContext(), c0693z8);
        }
        if (zCopyFileFromBundleToStorage) {
            c(c0693z8.getName(), c0693z8.getParent());
        } else {
            b(c0693z8.getName(), c0693z8.getParent(), c0532q8.b());
        }
    }

    private boolean a(File file) {
        return C0313e4.a().contains(file.getName());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        a(new e(context));
    }

    public void a(Qc qc2) {
        this.f30535c0 = qc2;
        this.f30533b0.a(qc2);
    }

    public void a(EnumC0089v enumC0089v) {
        this.f30554w = enumC0089v;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        if (this.Y) {
            if (this.f30533b0 != null) {
                this.f30530a.d(new androidx.fragment.app.n(this, 28));
            }
        } else if (this.f30533b0 != null) {
            this.f30533b0.destroy();
        }
        C0314e5 c0314e5 = this.f30540h;
        if (c0314e5 != null) {
            c0314e5.d();
        }
        R3 r3 = this.S;
        if (r3 != null) {
            r3.b();
        }
        CountDownTimer countDownTimer = this.f30544m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return new com.ironsource.sdk.controller.m.a(str, str2, str3, str4).a();
    }

    public void a(C0514p8.e eVar, String str) {
        b(new f(eVar, str));
    }

    public void a(C0274c1 c0274c1) {
        synchronized (this.F) {
            try {
                if (c0274c1.j() && this.f30541i) {
                    Log.d(this.f30534c, "restoreState(state:" + c0274c1 + ")");
                    int iC = c0274c1.c();
                    if (iC != -1) {
                        C0514p8.e eVar = C0514p8.e.RewardedVideo;
                        if (iC == eVar.ordinal()) {
                            Log.d(this.f30534c, "onRVAdClosed()");
                            String strB = c0274c1.b();
                            InterfaceC0545r4 interfaceC0545r4A = a(eVar);
                            if (interfaceC0545r4A != null && !TextUtils.isEmpty(strB)) {
                                interfaceC0545r4A.b(eVar, strB);
                            }
                        } else {
                            C0514p8.e eVar2 = C0514p8.e.Interstitial;
                            if (iC == eVar2.ordinal()) {
                                Log.d(this.f30534c, "onInterstitialAdClosed()");
                                String strB2 = c0274c1.b();
                                InterfaceC0545r4 interfaceC0545r4A2 = a(eVar2);
                                if (interfaceC0545r4A2 != null && !TextUtils.isEmpty(strB2)) {
                                    interfaceC0545r4A2.b(eVar2, strB2);
                                }
                            }
                        }
                        c0274c1.a(-1);
                        c0274c1.f(null);
                    } else {
                        Log.d(this.f30534c, "No ad was opened");
                    }
                    String strD = c0274c1.d();
                    String strF = c0274c1.f();
                    for (T4 t10 : this.H.a(C0514p8.e.Interstitial)) {
                        if (t10.e() == 2) {
                            Log.d(this.f30534c, "initInterstitial(appKey:" + strD + ", userId:" + strF + ", demandSource:" + t10.f() + ")");
                            a(strD, strF, t10, this.f30557z);
                        }
                    }
                    String strG = c0274c1.g();
                    String strH = c0274c1.h();
                    for (T4 t11 : this.H.a(C0514p8.e.RewardedVideo)) {
                        if (t11.e() == 2) {
                            String strF2 = t11.f();
                            Log.d(this.f30534c, "onRVNoMoreOffers()");
                            this.f30556y.c(strF2);
                            Log.d(this.f30534c, "initRewardedVideo(appKey:" + strG + ", userId:" + strH + ", demandSource:" + strF2 + ")");
                            a(strG, strH, t11, this.f30556y);
                        }
                    }
                    c0274c1.a(false);
                }
                this.E = c0274c1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(Runnable runnable) {
        R7 r10 = this.f30530a;
        if (r10 != null) {
            r10.b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.f30531a0.a(activity);
    }
}
