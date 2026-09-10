package com.p004ironsource.sdk.controller;

import A.RunnableC0899k;
import A.U;
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
import com.p004ironsource.C3367l0;
import com.p004ironsource.a9;
import com.p004ironsource.aa;
import com.p004ironsource.b4;
import com.p004ironsource.bf;
import com.p004ironsource.cl;
import com.p004ironsource.d9;
import com.p004ironsource.dc;
import com.p004ironsource.dh;
import com.p004ironsource.di;
import com.p004ironsource.f9;
import com.p004ironsource.fq;
import com.p004ironsource.g9;
import com.p004ironsource.gb;
import com.p004ironsource.gq;
import com.p004ironsource.hs;
import com.p004ironsource.i1;
import com.p004ironsource.is;
import com.p004ironsource.j9;
import com.p004ironsource.jh;
import com.p004ironsource.k9;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mh;
import com.p004ironsource.mt;
import com.p004ironsource.n9;
import com.p004ironsource.ne;
import com.p004ironsource.nh;
import com.p004ironsource.oh;
import com.p004ironsource.on;
import com.p004ironsource.pg;
import com.p004ironsource.pk;
import com.p004ironsource.pw;
import com.p004ironsource.q3;
import com.p004ironsource.q9;
import com.p004ironsource.qn;
import com.p004ironsource.rh;
import com.p004ironsource.rk;
import com.p004ironsource.rp;
import com.p004ironsource.s3;
import com.p004ironsource.s9;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.sdk.utils.SDKUtils;
import com.p004ironsource.th;
import com.p004ironsource.tx;
import com.p004ironsource.u9;
import com.p004ironsource.up;
import com.p004ironsource.ux;
import com.p004ironsource.v9;
import com.p004ironsource.va;
import com.p004ironsource.vf;
import com.p004ironsource.vh;
import com.p004ironsource.vp;
import com.p004ironsource.w9;
import com.p004ironsource.wa;
import com.p004ironsource.wp;
import com.p004ironsource.ww;
import com.p004ironsource.x2;
import com.p004ironsource.x4;
import com.p004ironsource.x8;
import com.p004ironsource.x9;
import com.p004ironsource.y2;
import com.p004ironsource.ye;
import com.p004ironsource.yk;
import com.p004ironsource.z8;
import com.p004ironsource.za;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.model.AdPayload;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class v implements com.p004ironsource.sdk.controller.l, rp, DownloadListener {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f27031b0 = "about:blank";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static int f27032c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static String f27033d0 = "is_store";
    public static String e0 = "external_url";
    public static String f0 = "secondary_web_view";
    private static String g0 = "success";
    private static String h0 = "fail";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f27034A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private com.p004ironsource.sdk.controller.d f27035B;
    private ww C;
    private y2 D;
    private wa G;
    private com.p004ironsource.sdk.controller.o H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private com.p004ironsource.sdk.controller.q f27038I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.p004ironsource.sdk.controller.u f27039J;
    private com.p004ironsource.sdk.controller.i K;
    private com.p004ironsource.sdk.controller.a L;
    private com.p004ironsource.sdk.controller.j M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private q3 f27040N;
    private aa O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private tx f27041P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private com.p004ironsource.sdk.controller.c f27042Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private x8 f27043R;
    private JSONObject S;
    private com.ironsource.sdk.controller.l.a T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private com.ironsource.sdk.controller.l.b f27044U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private n9 f27045V;
    private boolean W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    g9 f27046Y;
    final rk Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pg f27047a;
    private up a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j9 f27048b;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final gb f27051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f27052i;
    private p j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CountDownTimer f27053l;
    public CountDownTimer m;
    private final o q;
    private View r;
    private FrameLayout s;
    private WebChromeClient.CustomViewCallback t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f27056u;
    private u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f27057w;
    private x9 x;
    private w9 y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private v9 f27058z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27049c = "v";
    private String d = "IronSource";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27050e = "We're sorry, some error occurred. we will investigate it";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27054n = 50;
    private int o = 50;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f27055p = d9.e.f24670b;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Object f27036E = new Object();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f27037F = false;
    private final vf X = on.U().f();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ nh f27060a;

        public b(nh nhVar) {
            this.f27060a = nhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f27042Q.b("controller html - failed to download - " + this.f27060a.b());
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f27062a;

        public c(Context context) {
            this.f27062a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.e(this.f27062a);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f27064a;

        public d(Context context) {
            this.f27064a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.f27064a);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.e f27066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27067b;

        public e(mh.e eVar, String str) {
            this.f27066a = eVar;
            this.f27067b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            u9 u9VarA;
            mh.e eVar = this.f27066a;
            if ((eVar == mh.e.RewardedVideo || eVar == mh.e.Interstitial) && (u9VarA = v.this.a(eVar)) != null) {
                u9VarA.a(this.f27066a, this.f27067b);
            }
        }
    }

    public class f extends x8 {
        public f(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.p004ironsource.x8, com.p004ironsource.qf
        public void a() {
            if (v.this.f27052i) {
                v.this.m("none");
            }
        }

        @Override // com.p004ironsource.x8, com.p004ironsource.qf
        public void b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !v.this.f27052i) {
                return;
            }
            try {
                jSONObject.put(d9.i.t, str);
                v.this.e(jSONObject);
            } catch (JSONException e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @Override // com.p004ironsource.x8, com.p004ironsource.qf
        public void a(String str, JSONObject jSONObject) {
            if (v.this.f27052i) {
                v.this.m(str);
            }
        }
    }

    public class g implements tx {
        public g() {
        }

        @Override // com.p004ironsource.tx
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f27071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f27072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27073c;

        public h(JSONObject jSONObject, WebView webView, String str) {
            this.f27071a = jSONObject;
            this.f27072b = webView;
            this.f27073c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(this.f27071a, this.f27072b);
            v.this.l("about:blank");
            v.this.l(this.f27073c);
        }
    }

    public class i extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f27074a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f27042Q.b(d9.c.j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j, long j2, int i2) {
            super(j, j2);
            this.f27074a = i2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(v.this.f27049c, "Loading Controller Timer Finish");
            int i2 = this.f27074a;
            if (i2 == 3) {
                v.this.b(new a());
            } else {
                v.this.a(i2 + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.i(v.this.f27049c, "Loading Controller Timer Tick " + j);
        }
    }

    public class j implements s {
        public j() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, mh.e eVar, va vaVar) {
            v.this.a(str, eVar, vaVar);
        }
    }

    public class k implements s {
        public k() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, mh.e eVar, va vaVar) {
            v.this.a(str, eVar, vaVar);
        }
    }

    public class l implements s {
        public l() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, mh.e eVar, va vaVar) {
            v.this.a(str, eVar, vaVar);
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.e f27080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ va f27081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27082c;

        public m(mh.e eVar, va vaVar, String str) {
            this.f27080a = eVar;
            this.f27081b = vaVar;
            this.f27082c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            va vaVar;
            mh.e eVar = mh.e.RewardedVideo;
            mh.e eVar2 = this.f27080a;
            if ((eVar != eVar2 && mh.e.Interstitial != eVar2 && mh.e.Banner != eVar2) || (vaVar = this.f27081b) == null || TextUtils.isEmpty(vaVar.h())) {
                return;
            }
            u9 u9VarA = v.this.a(this.f27080a);
            Log.d(v.this.f27049c, "onAdProductInitFailed (message:" + this.f27082c + ")(" + this.f27080a + ")");
            if (u9VarA != null) {
                u9VarA.a(this.f27080a, this.f27081b.h(), this.f27082c);
            }
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    public class o extends WebChromeClient {
        private o() {
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(v.this.Z.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z2, boolean z3, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new q(v.this, null));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            if (v.this.r == null) {
                return;
            }
            v.this.r.setVisibility(8);
            v.this.s.removeView(v.this.r);
            v.this.r = null;
            v.this.s.setVisibility(8);
            v.this.t.onCustomViewHidden();
            v.this.Z.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            v.this.Z.setVisibility(8);
            if (v.this.r != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            v.this.s.addView(view);
            v.this.r = view;
            v.this.t = customViewCallback;
            v.this.s.setVisibility(0);
        }

        public /* synthetic */ o(v vVar, f fVar) {
            this();
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        mh.e f27085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f27086b;

        public p(mh.e eVar, String str) {
            this.f27085a = eVar;
            this.f27086b = str;
        }

        public String a() {
            return this.f27086b;
        }

        public mh.e b() {
            return this.f27085a;
        }
    }

    public class q extends WebViewClient {
        private q() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(v.this.f27049c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context contextQ = v.this.q();
            contextQ.startActivity(new OpenUrlActivity.e(new com.ironsource.sdk.controller.k.b()).a(str).b(false).a(contextQ));
            return true;
        }

        public /* synthetic */ q(v vVar, f fVar) {
            this();
        }
    }

    public class r {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27089a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27090b;

            public a(String str, String str2) {
                this.f27089a = str;
                this.f27090b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f27089a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f27049c, "onRVShowFail(message:" + this.f27089a + ")");
                v.this.x.d(this.f27090b, str);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27092a;

            public b(String str) {
                this.f27092a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f27049c, "onInterstitialInitSuccess()");
                v.this.y.a(mh.e.Interstitial, this.f27092a, (x2) null);
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27094a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27095b;

            public c(String str, String str2) {
                this.f27094a = str;
                this.f27095b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f27094a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f27049c, "onInterstitialInitFail(message:" + str + ")");
                v.this.y.a(mh.e.Interstitial, this.f27095b, str);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u9 f27097a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ mh.e f27098b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f27099c;

            public d(u9 u9Var, mh.e eVar, String str) {
                this.f27097a = u9Var;
                this.f27098b = eVar;
                this.f27099c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27097a.c(this.f27098b, this.f27099c);
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27100a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ JSONObject f27101b;

            public e(String str, JSONObject jSONObject) {
                this.f27100a = str;
                this.f27101b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.y.a(this.f27100a, this.f27101b);
            }
        }

        public class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27103a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27104b;

            public f(String str, String str2) {
                this.f27103a = str;
                this.f27104b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f27103a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.y.c(this.f27104b, str);
            }
        }

        public class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27106a;

            public g(String str) {
                this.f27106a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f27049c, "onBannerInitSuccess()");
                v.this.f27058z.a(mh.e.Banner, this.f27106a, (x2) null);
            }
        }

        public class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27108a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27109b;

            public h(String str, String str2) {
                this.f27108a = str;
                this.f27109b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f27108a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f27049c, "onBannerInitFail(message:" + str + ")");
                v.this.f27058z.a(mh.e.Banner, this.f27109b, str);
            }
        }

        public class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27111a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ dh f27112b;

            public i(String str, dh dhVar) {
                this.f27111a = str;
                this.f27112b = dhVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f27049c, "onBannerLoadSuccess()");
                v.this.f27058z.a(this.f27111a, this.f27112b);
            }
        }

        public class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27115b;

            public j(String str, String str2) {
                this.f27114a = str;
                this.f27115b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f27049c, "onLoadBannerFail()");
                String str = this.f27114a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f27058z.a(this.f27115b, str);
            }
        }

        public class k implements Runnable {
            public k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.F();
            }
        }

        public class l implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27118a;

            public l(String str) {
                this.f27118a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new JSONObject(this.f27118a).has(com.ironsource.sdk.controller.f.b.MSG_ID)) {
                        v.this.T.a(com.ironsource.sdk.controller.f.a.a(this.f27118a));
                    } else {
                        v.this.f27044U.a(qn.a(this.f27118a));
                    }
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    Logger.e(v.this.f27049c, "failed to parse received message");
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
        }

        public class m implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mh.e f27120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27121b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f27122c;
            final /* synthetic */ JSONObject d;

            public m(mh.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f27120a = eVar;
                this.f27121b = str;
                this.f27122c = str2;
                this.d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                u9 u9VarA;
                mh.e eVar = this.f27120a;
                if ((eVar == mh.e.Interstitial || eVar == mh.e.RewardedVideo || eVar == mh.e.Banner) && (u9VarA = v.this.a(eVar)) != null) {
                    u9VarA.a(this.f27120a, this.f27121b, this.f27122c, this.d);
                }
            }
        }

        public class n implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27124a;

            public n(String str) {
                this.f27124a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.f27049c, "omidAPI(" + this.f27124a + ")");
                    v.this.H.a(new is(this.f27124a).toString(), r.this.new w());
                } catch (Exception e2) {
                    q9.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                    Logger.i(v.this.f27049c, "omidAPI failed with exception " + e2.getMessage());
                }
            }
        }

        public class o implements Runnable {
            public o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.B();
            }
        }

        public class p implements Runnable {
            public p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.removeJavascriptInterface(d9.f24625e);
            }
        }

        public class q implements Runnable {
            public q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.getSettings().setMixedContentMode(0);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$r$r, reason: collision with other inner class name */
        public class RunnableC0297r implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f27129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27130b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ x2 f27131c;

            public RunnableC0297r(int i2, String str, x2 x2Var) {
                this.f27129a = i2;
                this.f27130b = str;
                this.f27131c = x2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f27129a <= 0) {
                    v.this.x.c(this.f27130b);
                } else {
                    Log.d(v.this.f27049c, "onRVInitSuccess()");
                    v.this.x.a(mh.e.RewardedVideo, this.f27130b, this.f27131c);
                }
            }
        }

        public class s implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27132a;

            public s(String str) {
                this.f27132a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.M.a(new JSONObject(this.f27132a), r.this.new w());
                } catch (Exception e2) {
                    q9.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                    Logger.i(v.this.f27049c, "fileSystemAPI failed with exception " + e2.getMessage());
                }
            }
        }

        public class t implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27134a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27135b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f27136c;

            public t(String str, String str2, int i2) {
                this.f27134a = str;
                this.f27135b = str2;
                this.f27136c = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f27134a.equalsIgnoreCase(mh.e.RewardedVideo.toString())) {
                    v.this.x.a(this.f27135b, this.f27136c);
                }
            }
        }

        public class u implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27137a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f27138b;

            public u(String str, int i2) {
                this.f27137a = str;
                this.f27138b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.y.onInterstitialAdRewarded(this.f27137a, this.f27138b);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$r$v, reason: collision with other inner class name */
        public class RunnableC0298v implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27140a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27141b;

            public RunnableC0298v(String str, String str2) {
                this.f27140a = str;
                this.f27141b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f27140a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f27049c, "onRVInitFail(message:" + str + ")");
                v.this.x.a(mh.e.RewardedVideo, this.f27141b, str);
            }
        }

        public class w implements yk {
            public w() {
            }

            @Override // com.p004ironsource.yk
            public void a(boolean z2, String str, is isVar) {
                isVar.b(z2 ? v.g0 : v.h0, str);
                v.this.a(isVar.toString(), z2, (String) null, (String) null);
            }

            @Override // com.p004ironsource.yk
            public void a(boolean z2, String str, String str2) {
                is isVar = new is();
                isVar.b(z2 ? v.g0 : v.h0, str);
                isVar.b("data", str2);
                v.this.a(isVar.toString(), z2, (String) null, (String) null);
            }

            @Override // com.p004ironsource.yk
            public void a(boolean z2, String str, JSONObject jSONObject) {
                String str2;
                try {
                    if (z2) {
                        str2 = v.g0;
                    } else {
                        str2 = v.h0;
                    }
                    jSONObject.put(str2, str);
                    v.this.a(jSONObject.toString(), z2, (String) null, (String) null);
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
        }

        public r() {
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.f27049c, "adClicked(" + str + ")");
            is isVar = new is(str);
            String strD = isVar.d(d9.h.m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            mh.e eVarG = v.this.g(strD);
            u9 u9VarA = v.this.a(eVarG);
            if (eVarG == null || u9VarA == null) {
                return;
            }
            v.this.b(new d(u9VarA, eVarG, strFetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            Log.d(v.this.d, "adCredited(" + str + ")");
            is isVar = new is(str);
            String strD = isVar.d(d9.h.k);
            int i2 = strD != null ? Integer.parseInt(strD) : 0;
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            String strD2 = isVar.d(d9.h.m);
            if (TextUtils.isEmpty(strD2)) {
                Log.d(v.this.d, "adCredited | product type is missing");
            }
            if (mh.e.Interstitial.toString().equalsIgnoreCase(strD2)) {
                a(strFetchDemandSourceId, i2);
            } else if (v.this.q(strD2)) {
                v.this.b(new t(strD2, strFetchDemandSourceId, i2));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            Logger.i(v.this.f27049c, "adUnitsReady(" + str + ")");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new is(str));
            x2 x2Var = new x2(str);
            if (!x2Var.g()) {
                v.this.a(str, false, d9.c.r, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String strD = x2Var.d();
            if (mh.e.RewardedVideo.toString().equalsIgnoreCase(strD) && v.this.q(strD)) {
                v.this.b(new RunnableC0297r(Integer.parseInt(x2Var.c()), strFetchDemandSourceId, x2Var));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                Logger.i(v.this.f27049c, "adViewAPI(" + str + ")");
                v.this.L.a(new is(str).toString(), new w());
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.f27049c, "adViewAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void androidSandboxApi(String str) {
            pg.f26494a.b(new com.google.android.exoplayer2.video.a(5, this, str));
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.f27049c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            mh.e eVarG;
            try {
                Logger.i(v.this.f27049c, "cleanAdInstance(" + str + ")");
                is isVar = new is(str);
                String strD = isVar.d(d9.h.m);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
                if (TextUtils.isEmpty(strFetchDemandSourceId) || (eVarG = v.this.g(strD)) == null) {
                    return;
                }
                v.this.G.b(eVarG, strFetchDemandSourceId);
            } catch (Exception e2) {
                q9.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> arrayListA = pk.e().a();
                is isVar = new is(str);
                if (!arrayListA.isEmpty()) {
                    isVar.b(d9.h.x0, arrayListA.toString());
                }
                v.this.a(isVar.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                q9.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        public void d(String str) {
            v.this.i(v.this.a(d9.g.f24694e, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            v vVar;
            String str2;
            try {
                Logger.i(v.this.f27049c, "deleteFile(" + str + ")");
                is isVar = new is(str);
                String strD = isVar.d(d9.h.f24719b);
                String strD2 = isVar.d("path");
                if (strD2 == null || TextUtils.isEmpty(strD)) {
                    vVar = v.this;
                    str2 = d9.c.g;
                } else {
                    vh vhVar = new vh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.f27034A, strD2), strD);
                    IronSourceStorageUtils.ensurePathSafety(vhVar, v.this.f27034A);
                    if (vhVar.exists()) {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(vhVar), (String) null, (String) null);
                        return;
                    } else {
                        vVar = v.this;
                        str2 = d9.c.f;
                    }
                }
                vVar.a(str, false, str2, "1");
            } catch (Exception e2) {
                q9.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            v vVar;
            String str2;
            try {
                Logger.i(v.this.f27049c, "deleteFolder(" + str + ")");
                String strD = new is(str).d("path");
                if (strD == null) {
                    vVar = v.this;
                    str2 = d9.c.g;
                } else {
                    vh vhVar = new vh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.f27034A, strD));
                    IronSourceStorageUtils.ensurePathSafety(vhVar, v.this.f27034A);
                    if (vhVar.exists()) {
                        v.this.a(str, IronSourceStorageUtils.deleteFolder(vhVar.getPath()), (String) null, (String) null);
                        return;
                    } else {
                        vVar = v.this;
                        str2 = d9.c.f24653e;
                    }
                }
                vVar.a(str, false, str2, "1");
            } catch (Exception e2) {
                q9.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                Logger.i(v.this.f27049c, "deviceDataAPI(" + str + ")");
                v.this.K.a(new is(str).toString(), new w());
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.f27049c, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("displayWebView(", str, ")", v.this.f27049c);
            v.this.a(str, true, (String) null, (String) null);
            is isVar = new is(str);
            boolean zBooleanValue = ((Boolean) isVar.b(d9.h.d)).booleanValue();
            String strD = isVar.d(d9.h.m);
            boolean zC = isVar.c(d9.h.f24730u);
            String strD2 = isVar.d("adViewId");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            boolean zC2 = isVar.c(d9.h.z0);
            if (!zBooleanValue) {
                v.this.a(u.Gone);
                v.this.o();
                return;
            }
            v.this.f27037F = isVar.c(d9.h.v);
            boolean zC3 = isVar.c(d9.h.y);
            u uVarV = v.this.v();
            u uVar = u.Display;
            if (uVarV == uVar) {
                Logger.i(v.this.f27049c, "State: " + v.this.v);
                return;
            }
            v.this.a(uVar);
            Logger.i(v.this.f27049c, "State: " + v.this.v);
            Context contextQ = v.this.q();
            String strT = v.this.t();
            int iL = v.this.X.L(contextQ);
            if (zC) {
                com.p004ironsource.sdk.controller.h hVar = new com.p004ironsource.sdk.controller.h(contextQ);
                hVar.addView(v.this.f27056u);
                hVar.a(v.this);
                return;
            }
            Intent intent = zC3 ? new Intent(contextQ, (Class<?>) InterstitialActivity.class) : new Intent(contextQ, (Class<?>) ControllerActivity.class);
            mh.e eVar = mh.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(strD)) {
                if ("application".equals(strT)) {
                    strT = SDKUtils.translateRequestedOrientation(v.this.X.N(contextQ));
                }
                intent.putExtra(d9.h.m, eVar.toString());
                v.this.D.a(eVar.ordinal());
                v.this.D.f(strFetchDemandSourceId);
                if (v.this.q(eVar.toString())) {
                    v.this.x.b(eVar, strFetchDemandSourceId);
                }
            } else {
                mh.e eVar2 = mh.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(strD)) {
                    if ("application".equals(strT)) {
                        strT = SDKUtils.translateRequestedOrientation(v.this.X.N(contextQ));
                    }
                    intent.putExtra(d9.h.m, eVar2.toString());
                }
            }
            if (strD2 != null) {
                intent.putExtra("adViewId", strD2);
            }
            intent.putExtra(d9.h.z0, zC2);
            intent.setFlags(536870912);
            intent.putExtra(d9.h.v, v.this.f27037F);
            intent.putExtra(d9.h.f24706A, strT);
            intent.putExtra(d9.h.f24707B, iL);
            v vVar = v.this;
            vVar.j = new p(vVar.g(strD), strFetchDemandSourceId);
            contextQ.startActivity(intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            try {
                Logger.i(v.this.f27049c, "dsSharedSignalsAPI(" + str + ")");
                v.this.O.a(new is(str).toString(), new w());
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.f27049c, "dsSharedSignalsAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("fileSystemAPI(", str, ")", v.this.f27049c);
            v.this.a(new s(str));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004d  */
        @JavascriptInterface
        public void getApplicationInfo(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("getApplicationInfo(", str, ")", v.this.f27049c);
            String strE = v.this.e(str);
            String strD = v.this.d(str);
            is isVar = new is(str);
            Object[] objArrF = v.this.f(isVar.d(d9.h.m), SDKUtils.fetchDemandSourceId(isVar));
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
            v.this.i(v.this.a(strE, str2, d9.g.f24698n, d9.g.o));
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("getCachedFilesMap(", str, ")", v.this.f27049c);
            String strE = v.this.e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            is isVar = new is(str);
            if (!isVar.a("path")) {
                v.this.a(str, false, d9.c.s, (String) null);
                return;
            }
            String str2 = (String) isVar.b("path");
            if (!IronSourceStorageUtils.isPathExist(v.this.f27034A, str2)) {
                v.this.a(str, false, d9.c.t, (String) null);
                return;
            }
            v.this.i(v.this.a(strE, IronSourceStorageUtils.getCachedFilesMap(v.this.f27034A, str2), d9.g.s, d9.g.r));
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String strE;
            Logger.i(v.this.f27049c, "getConnectivityInfo(" + str + ")");
            is isVar = new is(str);
            String strD = isVar.d(v.g0);
            String strD2 = isVar.d(v.h0);
            JSONObject jSONObject = new JSONObject();
            if (v.this.f27043R != null) {
                jSONObject = v.this.f27043R.a(v.this.Z.getContext());
            }
            if (jSONObject.length() > 0) {
                strE = v.this.e(strD, jSONObject.toString());
            } else {
                strE = v.this.e(strD2, v.this.a("errMsg", d9.c.f24647A, null, null, null, null, null, null, null, false));
            }
            v.this.i(strE);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            Logger.i(v.this.f27049c, "getControllerConfig(" + str + ")");
            String strD = new is(str).d(v.g0);
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
            Logger.i(v.this.f27049c, "getMediationState(" + str + ")");
            is isVar = new is(str);
            String strD2 = isVar.d("demandSourceName");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            String strD3 = isVar.d(d9.h.m);
            if (strD3 == null || strD2 == null) {
                return;
            }
            try {
                mh.e productType = SDKUtils.getProductType(strD3);
                if (productType != null) {
                    va vaVarA = v.this.G.a(productType, strFetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(d9.h.m, strD3);
                    jSONObject.put("demandSourceName", strD2);
                    jSONObject.put("demandSourceId", strFetchDemandSourceId);
                    if (vaVarA == null || vaVarA.a(-1)) {
                        strD = v.this.d(str);
                    } else {
                        strD = v.this.e(str);
                        jSONObject.put("state", vaVarA.j());
                    }
                    a(strD, jSONObject.toString());
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0044  */
        @JavascriptInterface
        public void getDeviceStatus(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("getDeviceStatus(", str, ")", v.this.f27049c);
            String strE = v.this.e(str);
            String strD = v.this.d(str);
            v vVar = v.this;
            Object[] objArrD = vVar.d(vVar.Z.getContext());
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
            v.this.i(v.this.a(strE, str2, d9.g.f24697l, d9.g.m));
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("getDeviceVolume(", str, ")", v.this.f27049c);
            try {
                Context context = v.this.Z.getContext();
                float fA = za.b(context).a(context);
                is isVar = new is(str);
                isVar.b(d9.i.f24741P, String.valueOf(fA));
                v.this.a(isVar.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            Logger.i(v.this.f27049c, "getInitSummery(" + str + ")");
            is isVar = new is(str);
            isVar.a(d9.i.r0, v.this.S);
            v.this.a(isVar.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            th.a(hs.f25285z, new oh().a(dc.y, str).a());
            String strE = v.this.e(str);
            String string = SDKUtils.getOrientation(v.this.Z.getContext()).toString();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, string, d9.g.X, d9.g.f24690Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            Logger.i(v.this.f27049c, "getUserData(" + str + ")");
            is isVar = new is(str);
            if (!isVar.a("key")) {
                v.this.a(str, false, d9.c.f24650F, (String) null);
                return;
            }
            String strE = v.this.e(str);
            String strD = isVar.d("key");
            v.this.i(v.this.e(strE, v.this.a(strD, pk.e().a(strD), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                Logger.i(v.this.f27049c, "iabTokenAPI(" + str + ")");
                v.this.f27039J.a(new is(str).toString(), new w());
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.f27049c, "iabTokenAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.f27049c, "initController(" + str + ")");
            is isVar = new is(str);
            CountDownTimer countDownTimer = v.this.m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.m = null;
            }
            if (isVar.a("stage")) {
                String strD = isVar.d("stage");
                if (d9.h.s.equalsIgnoreCase(strD)) {
                    v.this.f27052i = true;
                    v.this.f27042Q.c();
                } else if (d9.h.r.equalsIgnoreCase(strD)) {
                    v.this.f27042Q.b();
                } else if (!d9.h.t.equalsIgnoreCase(strD)) {
                    Logger.i(v.this.f27049c, "No STAGE mentioned! should not get here!");
                } else {
                    v.this.f27042Q.b(android.support.v4.media.a.C("controller js failed to initialize : ", isVar.d("errMsg")));
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("onAdWindowsClosed(", str, ")", v.this.f27049c);
            v.this.D.a();
            v.this.D.f(null);
            v.this.j = null;
            is isVar = new is(str);
            String strD = isVar.d(d9.h.m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            mh.e eVarG = v.this.g(strD);
            Log.d(v.this.d, "onAdClosed() with type " + eVarG);
            if (v.this.q(strD)) {
                v.this.a(eVarG, strFetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.i(v.this.f27049c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("onGetApplicationInfoFail(", str, ")", v.this.f27049c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("onGetApplicationInfoSuccess(", str, ")", v.this.f27049c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("onGetCachedFilesMapFail(", str, ")", v.this.f27049c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("onGetCachedFilesMapSuccess(", str, ")", v.this.f27049c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("onGetDeviceStatusFail(", str, ")", v.this.f27049c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("onGetDeviceStatusSuccess(", str, ")", v.this.f27049c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.f27049c, "onInitBannerFail(" + str + ")");
            is isVar = new is(str);
            String strD = isVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f27049c, "onInitBannerFail failed with no demand source");
                return;
            }
            wa waVar = v.this.G;
            mh.e eVar = mh.e.Banner;
            va vaVarA = waVar.a(eVar, strFetchDemandSourceId);
            if (vaVarA != null) {
                vaVarA.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new h(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(v.this.f27049c, "onInitBannerSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new is(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f27049c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.q(mh.e.Banner.toString())) {
                v.this.b(new g(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.f27049c, "onInitInterstitialFail(" + str + ")");
            is isVar = new is(str);
            String strD = isVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f27049c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            wa waVar = v.this.G;
            mh.e eVar = mh.e.Interstitial;
            va vaVarA = waVar.a(eVar, strFetchDemandSourceId);
            if (vaVarA != null) {
                vaVarA.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new c(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(v.this.f27049c, "onInitInterstitialSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new is(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f27049c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.q(mh.e.Interstitial.toString())) {
                v.this.b(new b(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.f27049c, "onInitRewardedVideoFail(" + str + ")");
            is isVar = new is(str);
            String strD = isVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            wa waVar = v.this.G;
            mh.e eVar = mh.e.RewardedVideo;
            va vaVarA = waVar.a(eVar, strFetchDemandSourceId);
            if (vaVarA != null) {
                vaVarA.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new RunnableC0298v(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.f27049c, "onLoadBannerFail()");
            is isVar = new is(str);
            String strD = isVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(strFetchDemandSourceId) && v.this.q(mh.e.Banner.toString())) {
                v.this.b(new j(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.f27049c, "onLoadBannerSuccess()");
            is isVar = new is(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            String strD = isVar.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            di diVarA = jh.a().a(strD);
            if (diVarA == null) {
                v.this.f27058z.a(strFetchDemandSourceId, "not found view for the current adViewId= " + strD);
                return;
            }
            if (diVarA instanceof dh) {
                dh dhVar = (dh) diVarA;
                if (v.this.q(mh.e.Banner.toString())) {
                    v.this.b(new i(strFetchDemandSourceId, dhVar));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.f27049c, "onLoadInterstitialFail(" + str + ")");
            is isVar = new is(str);
            String strD = isVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            a(strFetchDemandSourceId, false);
            if (v.this.q(mh.e.Interstitial.toString())) {
                v.this.b(new f(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.f27049c, "onLoadInterstitialSuccess(" + str + ")");
            is isVar = new is(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            JSONObject jSONObjectA = isVar.a();
            a(strFetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.q(mh.e.Interstitial.toString())) {
                v.this.b(new e(strFetchDemandSourceId, jSONObjectA));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("onReceivedMessage(", str, ")", v.this.f27049c);
            pg.f26494a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.f27049c, "onShowInterstitialFail(" + str + ")");
            is isVar = new is(str);
            String strD = isVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            v.this.b(new U(this, v.this.q(mh.e.Interstitial.toString()), strD, strFetchDemandSourceId, 9));
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("onShowInterstitialSuccess(", str, ")", v.this.f27049c);
            v.this.a(str, true, (String) null, (String) null);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new is(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f27049c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            y2 y2Var = v.this.D;
            mh.e eVar = mh.e.Interstitial;
            y2Var.a(eVar.ordinal());
            v.this.D.f(strFetchDemandSourceId);
            v.this.b(new RunnableC0899k(this, v.this.q(eVar.toString()), strFetchDemandSourceId, 7));
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.f27049c, "onShowRewardedVideoFail(" + str + ")");
            is isVar = new is(str);
            String strD = isVar.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
            if (v.this.q(mh.e.RewardedVideo.toString())) {
                v.this.b(new a(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("onShowRewardedVideoSuccess(", str, ")", v.this.f27049c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(v.this.f27049c, "onVideoStatusChanged(" + str + ")");
            is isVar = new is(str);
            String strD = isVar.d(d9.h.m);
            if (v.this.C == null || TextUtils.isEmpty(strD)) {
                return;
            }
            String strD2 = isVar.d("status");
            if (d9.h.f24723d0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStarted();
                return;
            }
            if (d9.h.e0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoPaused();
                return;
            }
            if (d9.h.f0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoResumed();
                return;
            }
            if (d9.h.g0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoEnded();
                return;
            }
            if (d9.h.h0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStopped();
                return;
            }
            Logger.i(v.this.f27049c, "onVideoStatusChanged: unknown status: " + strD2);
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.i(v.this.f27049c, "openUrl(" + str + ")");
                is isVar = new is(str);
                com.ironsource.sdk.controller.p.c cVarA = new com.ironsource.sdk.controller.p.a(isVar.d("method"), new wp(v.this.f27037F, 805306368)).a(isVar.c(d9.h.L0) ? v.this.Z.getContext() : v.this.q(), new vp(isVar.d("url"), isVar.d("package_name")));
                if (cVarA instanceof com.ironsource.sdk.controller.p.c.a) {
                    v.this.a(str, false, ((com.ironsource.sdk.controller.p.c.a) cVarA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                v.this.a(str, false, e2.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            v.this.c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                Logger.i(v.this.f27049c, "permissionsAPI(" + str + ")");
                v.this.f27038I.a(new is(str).toString(), new w());
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.f27049c, "permissionsAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            Exception exc;
            String str2;
            try {
                Logger.i(v.this.f27049c, "postAdEventNotification(" + str + ")");
                is isVar = new is(str);
                String strD = isVar.d(d9.h.j0);
                try {
                    if (TextUtils.isEmpty(strD)) {
                        v.this.a(str, false, d9.c.f24660w, (String) null);
                        return;
                    }
                    String strD2 = isVar.d(d9.h.k0);
                    String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(isVar);
                    String str3 = !TextUtils.isEmpty(strFetchDemandSourceId) ? strFetchDemandSourceId : strD2;
                    JSONObject jSONObject = (JSONObject) isVar.b(d9.h.l0);
                    String strD3 = isVar.d(d9.h.m);
                    mh.e eVarG = v.this.g(strD3);
                    try {
                        if (!v.this.q(strD3)) {
                            v.this.a(str, false, d9.c.v, (String) null);
                            return;
                        }
                        String strE = v.this.e(str);
                        if (TextUtils.isEmpty(strE)) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            v.this.i(v.this.a(strE, v.this.a(d9.h.m, strD3, d9.h.j0, strD, "demandSourceName", strD2, "demandSourceId", str2, null, false), d9.g.f24692c0, d9.g.f24693d0));
                        }
                        try {
                            v.this.b(new m(eVarG, str2, strD, jSONObject));
                            return;
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    exc = e4;
                }
            } catch (Exception e5) {
                e = e5;
            }
            exc = e;
            q9.d().a(exc);
            IronLog.INTERNAL.error(exc.toString());
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("removeCloseEventHandler(", str, ")", v.this.f27049c);
            if (v.this.f27053l != null) {
                v.this.f27053l.cancel();
            }
            v.this.k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            v.this.c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.i(v.this.f27049c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            v.this.c(new k());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            v vVar;
            String str2;
            try {
                Logger.i(v.this.f27049c, "saveFile(" + str + ")");
                is isVar = new is(str);
                String strD = isVar.d("path");
                String strD2 = isVar.d(d9.h.f24719b);
                if (TextUtils.isEmpty(strD2)) {
                    v.this.a(str, false, d9.c.g, "1");
                    return;
                }
                vh vhVar = new vh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.f27034A, strD), SDKUtils.getFileName(strD2));
                IronSourceStorageUtils.ensurePathSafety(vhVar, v.this.f27034A);
                if (v.this.X.a(v.this.f27034A) <= 0) {
                    vVar = v.this;
                    str2 = f9.f24983A;
                } else if (vhVar.exists()) {
                    vVar = v.this;
                    str2 = f9.f24998z;
                } else {
                    if (z8.h(v.this.Z.getContext())) {
                        v.this.a(str, true, (String) null, (String) null);
                        v.this.f27051h.a(vhVar, strD2, isVar.a("connectionTimeout", 0), isVar.a("readTimeout", 0));
                        return;
                    }
                    vVar = v.this;
                    str2 = f9.C;
                }
                vVar.a(str, false, str2, (String) null);
            } catch (Exception e2) {
                q9.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.f27049c, "setBackButtonState(" + str + ")");
            pk.e().c(new is(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.f27049c, "setForceClose(" + str + ")");
            is isVar = new is(str);
            String strD = isVar.d("width");
            String strD2 = isVar.d("height");
            v.this.f27054n = Integer.parseInt(strD);
            v.this.o = Integer.parseInt(strD2);
            v.this.f27055p = isVar.d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("setMixedContentAlwaysAllow(", str, ")", v.this.f27049c);
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.f27049c, "setOrientation(" + str + ")");
                String strD = new is(str).d("orientation");
                v.this.n(strD);
                if (v.this.a0 != null) {
                    v.this.a0.onOrientationChanged(strD, v.this.X.L(v.this.Z.getContext()));
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.f27049c, "setStoreSearchKeys(" + str + ")");
            pk.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.i(v.this.f27049c, "setUserData(" + str + ")");
            is isVar = new is(str);
            if (!isVar.a("key")) {
                v.this.a(str, false, d9.c.f24650F, (String) null);
                return;
            }
            if (!isVar.a("value")) {
                v.this.a(str, false, d9.c.G, (String) null);
                return;
            }
            String strD = isVar.d("key");
            String strD2 = isVar.d("value");
            pk.e().a(strD, strD2);
            v.this.i(v.this.e(v.this.e(str), v.this.a(strD, strD2, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("setWebviewBackgroundColor(", str, ")", v.this.f27049c);
            v.this.p(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            com.google.firebase.crashlytics.internal.model.a.w("stillAlive(", str, ")", v.this.f27049c);
            v.this.f27048b.a();
        }

        private void a(String str, int i2) {
            va vaVarA;
            v vVar = v.this;
            mh.e eVar = mh.e.Interstitial;
            if (vVar.q(eVar.toString()) && (vaVarA = v.this.G.a(eVar, str)) != null && vaVarA.k()) {
                v.this.b(new u(str, i2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            try {
                q3.a aVarA = v.this.f27040N.a(v.this.Z.getContext(), s3.a(str));
                v.this.i(v.this.e(aVarA.f(), aVarA.i().toString()));
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        public void c(String str) {
            v.this.i(v.this.a(d9.g.d, str, (String) null, (String) null));
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(d9.a.f24636h, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e2) {
                q9.d().a(e2);
                th.a(hs.f25282p, new oh().a(dc.f24769A, e2.getMessage()).a());
                Logger.d(v.this.f27049c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.W) {
                return;
            }
            a(jSONObject);
        }

        private void a(String str, boolean z2) {
            va vaVarA = v.this.G.a(mh.e.Interstitial, str);
            if (vaVarA != null) {
                vaVarA.a(z2);
            }
        }

        private void a(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", v.this.f27035B.f());
            } catch (Exception e2) {
                q9.d().a(e2);
                Logger.d(v.this.f27049c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    Logger.d(v.this.f27049c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z2, String str) {
            if (z2) {
                v.this.y.b(mh.e.Interstitial, str);
                v.this.y.b(str);
            }
            a(str, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z2, String str, String str2) {
            if (z2) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.y.b(str2, str);
            }
            a(str2, false);
        }

        public boolean a(String str) {
            if (TextUtils.isEmpty(str) || str.contains(x4.DISABLED_AUCTION_FALLBACK_ID)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return (jSONObject.getString("testerABGroup").isEmpty() || jSONObject.getString("testFriendlyName").isEmpty()) ? false : true;
            } catch (JSONException e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                return false;
            }
        }
    }

    public interface s {
        void a(String str, mh.e eVar, va vaVar);
    }

    public static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f27144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f27145b;
    }

    public enum u {
        Display,
        Gone
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    public class C0299v extends WebViewClient {
        private C0299v() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                v.this.A();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains(d9.f) && v.this.f27042Q != null) {
                v.this.f27042Q.b("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i2 + ")");
            }
            super.onReceivedError(webView, i2, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.e(v.this.f27049c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (v.this.f27042Q != null) {
                v.this.f27042Q.c(str);
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
            } catch (MalformedURLException e2) {
                q9.d().a(e2);
                zContains = false;
            }
            if (zContains) {
                StringBuilder sb = new StringBuilder(AdPayload.FILE_SCHEME);
                sb.append(v.this.f27034A);
                String strR = android.support.v4.media.a.r(sb, File.separator, "mraid.js");
                try {
                    new FileInputStream(new File(strR));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(strR));
                } catch (FileNotFoundException e3) {
                    q9.d().a(e3);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (v.this.h(str)) {
                    v.this.z();
                    return true;
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public /* synthetic */ C0299v(v vVar, f fVar) {
            this();
        }
    }

    public v(Context context, wa waVar, g9 g9Var, com.p004ironsource.sdk.controller.c cVar, pg pgVar, int i2, gb gbVar, String str, com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.l.b bVar, String str2, String str3) throws Throwable {
        rk rkVar = new rk(context, new cl.a());
        this.Z = rkVar;
        Logger.i(this.f27049c, "C'tor");
        this.f27046Y = g9Var;
        this.f27042Q = cVar;
        this.f27047a = pgVar;
        this.G = waVar;
        a(context, rkVar);
        this.f27034A = str;
        this.D = new y2();
        this.S = new JSONObject();
        this.f27051h = gbVar;
        this.T = aVar;
        this.f27044U = bVar;
        boolean zOptBoolean = SDKUtils.getNetworkConfiguration().optBoolean(d9.a.f24637i, false);
        this.W = zOptBoolean;
        if (zOptBoolean) {
            this.f27045V = new n9(new k9(SDKUtils.getControllerUrl(), this.f27034A, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new gq(SDKUtils.getControllerUrl())), new androidx.room.b(this, 10), gbVar, new s9.a());
        } else {
            gbVar.a(this);
            this.f27035B = new com.p004ironsource.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.f27034A, SDKUtils.getControllerUrl(), gbVar);
        }
        f fVar = null;
        o oVar = new o(this, fVar);
        this.q = oVar;
        rkVar.setWebViewClient(new C0299v(this, fVar));
        rkVar.setWebChromeClient(oVar);
        ux.a(rkVar);
        a(rkVar);
        rkVar.setDownloadListener(this);
        this.f27043R = c(context);
        b(context);
        b(i2);
        this.f = str2;
        this.g = str3;
        this.f27048b = j9.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    private x8 c(Context context) {
        return new f(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new is(str).d(g0);
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void destroy() {
        this.Z.destroy();
        gb gbVar = this.f27051h;
        if (gbVar != null) {
            gbVar.d();
        }
        x8 x8Var = this.f27043R;
        if (x8Var != null) {
            x8Var.b();
        }
        CountDownTimer countDownTimer = this.m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public mh.c g() {
        return mh.c.Web;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        Logger.i(this.f27049c, str + " " + str4);
    }

    public tx p() {
        if (this.f27041P == null) {
            this.f27041P = new g();
        }
        return this.f27041P;
    }

    public Context q() {
        return this.f27046Y.a();
    }

    public int r() {
        return f27032c0;
    }

    public FrameLayout s() {
        return this.f27056u;
    }

    public y2 u() {
        return this.D;
    }

    public u v() {
        return this.v;
    }

    private void G() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new is(str).d(h0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new com.ironsource.sdk.controller.m.a(str, str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public mh.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        mh.e eVar = mh.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        mh.e eVar2 = mh.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        mh.e eVar3 = mh.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        up upVar = this.a0;
        if (upVar != null) {
            upVar.onCloseRequested();
        }
    }

    public void A() {
        i(f(d9.g.f24678A));
    }

    public void B() {
        try {
            this.Z.onPause();
        } catch (Throwable th) {
            q9.d().a(th);
            Logger.i(this.f27049c, "WebViewController: onPause() - " + th);
        }
    }

    public void C() {
        this.C = null;
    }

    public void D() {
        this.Z.a();
        this.a0 = null;
    }

    public void E() {
        this.Z.requestFocus();
    }

    public void F() {
        try {
            this.Z.onResume();
        } catch (Throwable th) {
            q9.d().a(th);
            Logger.i(this.f27049c, "WebViewController: onResume() - " + th);
        }
    }

    public void m(String str) {
        try {
            String strD = a9.d(this.Z.getContext());
            Logger.i(this.f27049c, "device status changed, connection type " + str);
            rh.a(str);
            rh.b(strD);
            try {
                i(e(d9.g.x, a(d9.i.t, str, d9.i.f24758u, strD, null, null, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                q9.d().a(exc);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(exc));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public String t() {
        return this.f27057w;
    }

    public void w() {
        if (this.j == null) {
            return;
        }
        o();
        mh.e eVarB = this.j.b();
        String strA = this.j.a();
        if (q(eVarB.toString())) {
            a(eVarB, strA);
        }
    }

    public void x() {
        this.q.onHideCustomView();
    }

    public boolean y() {
        return this.r != null;
    }

    public void z() {
        i(f(d9.g.Z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c(vh vhVar) {
        this.f27051h.a(this);
        if (vhVar == null || !vhVar.exists()) {
            a(new vh(d9.f), new nh(1, "Unable to download Html file"));
            return null;
        }
        a(vhVar);
        return null;
    }

    private String d(JSONObject jSONObject) {
        za zaVarB = za.b(this.Z.getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            android.support.v4.media.a.A(sb, "SDKVersion=", sDKVersion, d9.i.f24749c);
        }
        String strE = zaVarB.e();
        if (!TextUtils.isEmpty(strE)) {
            sb.append("deviceOs=");
            sb.append(strE);
        }
        Uri uri = Uri.parse(SDKUtils.getControllerUrl());
        if (uri != null) {
            String str = uri.getScheme() + ":";
            String host = uri.getHost();
            int port = uri.getPort();
            if (port != -1) {
                host = androidx.datastore.preferences.protobuf.a.m(host, ":", port);
            }
            androidx.media3.extractor.text.ttml.a.C(sb, "&protocol=", str, "&domain=", host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String string = new JSONObject(jSONObject, new String[]{d9.i.Z, d9.i.g}).toString();
                    if (!TextUtils.isEmpty(string)) {
                        sb.append(d9.i.f24749c);
                        sb.append("controllerConfig");
                        sb.append(d9.i.f24747b);
                        sb.append(string);
                    }
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
            sb.append("&debug=");
            sb.append(r());
        }
        return sb.toString();
    }

    private String f(String str) {
        return new com.ironsource.sdk.controller.m.a(str).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new com.google.android.exoplayer2.video.a(4, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str) {
        this.Z.a(new com.ironsource.sdk.controller.m.b(str, r()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str) {
        try {
            Logger.i(this.f27049c, "load(): " + str);
            this.Z.loadUrl(str);
        } catch (Throwable th) {
            q9.d().a(th);
            Logger.e(this.f27049c, "WebViewController::load: " + th);
        }
    }

    private void o(String str) {
        WebSettings settings;
        int i2;
        if (str.equalsIgnoreCase("0")) {
            settings = this.Z.getSettings();
            i2 = 2;
        } else {
            settings = this.Z.getSettings();
            i2 = -1;
        }
        settings.setCacheMode(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        is isVar = new is(str);
        String strD = isVar.d("color");
        String strD2 = isVar.d("adViewId");
        int color = !d9.h.T.equalsIgnoreCase(strD) ? Color.parseColor(strD) : 0;
        if (strD2 == null) {
            this.Z.setBackgroundColor(color);
            return;
        }
        WebView presentingView = jh.a().a(strD2).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(String str) {
        boolean z2 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.f27049c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(mh.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(mh.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(mh.e.Banner.toString()) || this.f27058z == null : this.x == null) : this.y != null) {
            z2 = true;
        }
        if (!z2) {
            Logger.d(this.f27049c, "Trying to trigger a listener - no listener was found for product ".concat(str));
        }
        return z2;
    }

    public com.p004ironsource.sdk.controller.r b(com.p004ironsource.sdk.controller.s sVar) {
        return new com.p004ironsource.sdk.controller.r(sVar);
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void e() {
        a(this.D);
    }

    public boolean h(String str) {
        try {
            if (!new mt(str, pk.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().c()).a()) {
                return false;
            }
            pw.a(q(), str);
            return true;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public void k(String str) {
        i(e(d9.g.f24701w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void n(String str) {
        this.f27057w = str;
    }

    private String c(String str, String str2, String str3) {
        return new com.ironsource.sdk.controller.m.a(str, null, str2, str3).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        try {
            x8 x8Var = this.f27043R;
            if (x8Var == null) {
                return;
            }
            x8Var.b(context);
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void f() {
        i(f(d9.g.f24700u));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            x8 x8Var = this.f27043R;
            if (x8Var == null) {
                return;
            }
            x8Var.c(context);
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public com.p004ironsource.sdk.controller.g a(com.p004ironsource.sdk.controller.s sVar) {
        return new com.p004ironsource.sdk.controller.g(new com.p004ironsource.sdk.controller.b(new r()), sVar);
    }

    public void g(String str, String str2) {
        i(e(d9.g.W, a(d9.h.f24729p, str2, d9.h.m, str, null, null, null, null, null, false)));
    }

    private String b(String str) {
        String str2 = this.f27034A + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) {
        boolean z2;
        JSONObject jSONObject = new JSONObject();
        boolean z3 = true;
        Map<String, String> mapG = null;
        if (TextUtils.isEmpty(str)) {
            z2 = true;
        } else {
            va vaVarA = this.G.a(g(str), str2);
            if (vaVarA != null) {
                mapG = vaVarA.g();
                mapG.put("demandSourceName", vaVarA.f());
                mapG.put("demandSourceId", vaVarA.h());
            }
            try {
                jSONObject.put(d9.h.m, str);
            } catch (JSONException e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
            z2 = false;
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e3) {
                q9.d().a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
        }
        if (!TextUtils.isEmpty(this.g)) {
            try {
                jSONObject.put(SDKUtils.encodeString(d9.i.f), SDKUtils.encodeString(this.g));
            } catch (JSONException e4) {
                q9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f)) {
            try {
                jSONObject.put(SDKUtils.encodeString(d9.i.g), SDKUtils.encodeString(this.f));
            } catch (JSONException e5) {
                q9.d().a(e5);
                IronLog.INTERNAL.error(e5.toString());
            }
            z3 = z2;
        }
        if (mapG != null && !mapG.isEmpty()) {
            for (Map.Entry<String, String> entry : mapG.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    o(entry.getValue());
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e6) {
                    q9.d().a(e6);
                    IronLog.INTERNAL.error(e6.toString());
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z3)};
    }

    public void c(Runnable runnable) {
        pg pgVar = this.f27047a;
        if (pgVar != null) {
            pgVar.d(runnable);
        }
    }

    public void e(JSONObject jSONObject) {
        Logger.i(this.f27049c, "device connection info changed: " + jSONObject.toString());
        i(e(d9.g.y, a(d9.i.h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    private t a(mh.e eVar, va vaVar) {
        t tVar = new t();
        if (eVar != mh.e.RewardedVideo && eVar != mh.e.Interstitial && eVar != mh.e.Banner) {
            return tVar;
        }
        HashMap map = new HashMap();
        map.put(d9.i.g, this.f);
        if (!TextUtils.isEmpty(this.g)) {
            map.put(d9.i.f, this.g);
        }
        if (vaVar != null) {
            if (vaVar.g() != null) {
                map.putAll(vaVar.g());
                map.put(d9.h.y0, String.valueOf(C3367l0.f25553a.c(vaVar.h())));
            }
            map.put("demandSourceName", vaVar.f());
            map.put("demandSourceId", vaVar.h());
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        d9.g gVarA = d9.g.a(eVar);
        String strA = a(gVarA.f24703a, strFlatMapToJsonAsString, gVarA.f24704b, gVarA.f24705c);
        tVar.f27144a = gVarA.f24703a;
        tVar.f27145b = strA;
        return tVar;
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    public void c(String str) {
        if (str.equals(d9.h.f24726i)) {
            o();
        }
        i(e(d9.g.f24702z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u9 a(mh.e eVar) {
        if (eVar == mh.e.Interstitial) {
            return this.y;
        }
        if (eVar == mh.e.RewardedVideo) {
            return this.x;
        }
        if (eVar == mh.e.Banner) {
            return this.f27058z;
        }
        return null;
    }

    public void b(int i2) {
        f27032c0 = i2;
    }

    public void c(String str, String str2) {
        String str3;
        try {
            str3 = str;
            try {
                i(e(d9.g.f24699p, a(d9.h.f24719b, str3, "path", b(str2), null, null, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                q9.d().a(exc);
                b(str3, str2, exc.getMessage());
            }
        } catch (Exception e3) {
            e = e3;
            str3 = str;
        }
    }

    private void c(JSONObject jSONObject) throws JSONException {
        jSONObject.put(SDKUtils.encodeString("gpi"), fq.d(this.Z.getContext()));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(Context context) {
        a(new c(context));
    }

    private String a(mh.e eVar, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String strOptString = jSONObject.optString("demandSourceName");
        String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        va vaVarA = this.G.a(eVar, strFetchDemandSourceId);
        if (vaVarA != null) {
            if (vaVarA.g() != null) {
                map.putAll(vaVarA.g());
            }
            if (!TextUtils.isEmpty(strOptString)) {
                map.put("demandSourceName", strOptString);
            }
            if (!TextUtils.isEmpty(strFetchDemandSourceId)) {
                map.put("demandSourceId", strFetchDemandSourceId);
            }
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        d9.g gVarB = d9.g.b(eVar);
        return a(gVarB.f24703a, strFlatMapToJsonAsString, gVarB.f24704b, gVarB.f24705c);
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(va vaVar) {
        Map<String, String> mapB = vaVar.b();
        if (mapB != null) {
            i(e(d9.g.T, SDKUtils.flatMapToJsonAsString(mapB)));
        }
        this.G.b(mh.e.Interstitial, vaVar.h());
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(va vaVar, Map<String, String> map, w9 w9Var) {
        a(vaVar, map);
    }

    public void b(Runnable runnable) {
        pg pgVar = this.f27047a;
        if (pgVar != null) {
            pgVar.c(runnable);
        }
    }

    private String a(String str, String str2) {
        return a(str, str2, d9.h.g);
    }

    public void b(String str, String str2, String str3) {
        try {
            try {
                i(e(d9.g.q, a(d9.h.f24719b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                q9.d().a(e);
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str).put(str3, str2).toString();
            } catch (JSONException e2) {
                q9.d().a(e2);
            }
        }
        return str;
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(d9.g.e0, jSONObject != null ? jSONObject.toString() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return new com.ironsource.sdk.controller.m.a(str, str2, str3, str4).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2) {
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
                jSONObject.put(str9, z2);
            }
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject.toString();
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a() {
        if (this.W) {
            this.f27045V.a();
            return;
        }
        this.f27035B.a(new oh());
        if (this.f27035B.k()) {
            a(1);
        }
    }

    public void a(int i2) {
        if (!this.W && !this.f27035B.m()) {
            Logger.i(this.f27049c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String strD = d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            strD = String.format("%s&sessionid=%s", strD, initSDKParams.get("sessionid"));
        }
        this.f27047a.d(new h(controllerConfigAsJSONObject, this.Z, android.support.v4.media.a.D((this.W ? this.f27045V.getHtmlFile() : this.f27035B.g()).toURI().toString(), "?", strD)));
        this.m = new i(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, 1000L, i2).start();
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void d() {
        i(f(d9.g.t));
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = d9.c.f24661z;
        }
        i(e(d9.g.a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) {
        za zaVarB = za.b(context);
        JSONObject jSONObject = new JSONObject();
        boolean z2 = false;
        try {
            jSONObject.put(d9.i.f24760z, "none");
            jSONObject.put(d9.i.f24734A, SDKUtils.translateDeviceOrientation(this.X.H(context)));
            String strD = zaVarB.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.k), SDKUtils.encodeString(strD));
            }
            String strC = zaVarB.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.f24755l), SDKUtils.encodeString(strC));
            } else {
                z2 = true;
            }
            SDKUtils.loadGoogleAdvertiserInfo(context);
            String advertiserId = SDKUtils.getAdvertiserId();
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(this.f27049c, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            String limitAdTracking = SDKUtils.getLimitAdTracking();
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(this.f27049c, "add LAT");
                jSONObject.put(d9.i.M, Boolean.parseBoolean(limitAdTracking));
            }
            String strE = zaVarB.e();
            if (strE != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.m), SDKUtils.encodeString(strE));
            } else {
                z2 = true;
            }
            String strF = zaVarB.f();
            if (strF != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.f24756n), strF.replaceAll("[^0-9/.]", ""));
            } else {
                z2 = true;
            }
            String strF2 = zaVarB.f();
            if (strF2 != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.o), SDKUtils.encodeString(strF2));
            }
            String strValueOf = String.valueOf(zaVarB.a());
            if (strValueOf != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.f24757p), strValueOf);
            } else {
                z2 = true;
            }
            jSONObject.put(ne.h0, String.valueOf(i1.a()));
            String sDKVersion = SDKUtils.getSDKVersion();
            if (sDKVersion != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.q), SDKUtils.encodeString(sDKVersion));
            }
            if (zaVarB.b() != null && zaVarB.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(d9.i.r), SDKUtils.encodeString(zaVarB.b()));
            }
            String strB = a9.b(context);
            if (strB.equals("none")) {
                z2 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString(d9.i.t), SDKUtils.encodeString(strB));
            }
            String strD2 = a9.d(context);
            if (strD2 != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.f24758u), SDKUtils.encodeString(strD2));
            } else {
                z2 = true;
            }
            jSONObject.put(SDKUtils.encodeString(d9.i.v), a9.e(context));
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            jSONObject.put(d9.i.y, SDKUtils.encodeString(String.valueOf(this.X.a(this.f27034A))));
            String strValueOf2 = String.valueOf(this.X.s());
            if (TextUtils.isEmpty(strValueOf2)) {
                z2 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString(d9.i.G) + d9.i.d + SDKUtils.encodeString("width") + d9.i.f24752e, SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(SDKUtils.encodeString(d9.i.G) + d9.i.d + SDKUtils.encodeString("height") + d9.i.f24752e, SDKUtils.encodeString(String.valueOf(this.X.a())));
            String strG = b4.g(this.Z.getContext());
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
            }
            String strValueOf3 = String.valueOf(this.X.h());
            if (!TextUtils.isEmpty(strValueOf3)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.K), SDKUtils.encodeString(strValueOf3));
            }
            String strValueOf4 = String.valueOf(this.X.f());
            if (!TextUtils.isEmpty(strValueOf4)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.O), SDKUtils.encodeString(strValueOf4));
            }
            jSONObject.put(SDKUtils.encodeString(d9.i.f24741P), za.b(context).a(context));
            jSONObject.put(SDKUtils.encodeString(d9.i.f24746Y), this.X.y(context));
            jSONObject.put(SDKUtils.encodeString("mcc"), z8.b(context));
            jSONObject.put(SDKUtils.encodeString("mnc"), z8.c(context));
            jSONObject.put(SDKUtils.encodeString(d9.i.S), z8.f(context));
            jSONObject.put(SDKUtils.encodeString(d9.i.f24743R), SDKUtils.encodeString(z8.g(context)));
            jSONObject.put(SDKUtils.encodeString(d9.i.f24745V), b4.f(context));
            jSONObject.put(SDKUtils.encodeString(d9.i.X), b4.d(context));
            jSONObject.put(SDKUtils.encodeString(d9.i.W), SDKUtils.encodeString(b4.b(context)));
            String strE2 = b4.e(context);
            if (!TextUtils.isEmpty(strE2)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.f24750c0), SDKUtils.encodeString(strE2));
            }
            c(jSONObject);
            jSONObject.put(SDKUtils.encodeString(d9.i.p0), this.X.C(context));
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.f27046Y.a(activity);
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(Context context) {
        a(new d(context));
    }

    private void a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f27056u = new FrameLayout(context);
        this.s = new FrameLayout(context);
        this.s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.s.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.f27056u.addView(this.s, layoutParams);
        this.f27056u.addView(frameLayout);
    }

    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    private void a(WebView webView) {
        com.p004ironsource.sdk.controller.s sVar = new com.p004ironsource.sdk.controller.s(com.p004ironsource.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), d9.d);
        webView.addJavascriptInterface(b(sVar), d9.f24625e);
    }

    public void a(aa aaVar) {
        this.O = aaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(bf bfVar) {
        bfVar.a(new z(this));
    }

    public void a(mh.e eVar, String str) {
        b(new e(eVar, str));
    }

    public void a(q3 q3Var) {
        this.f27040N = q3Var;
    }

    public void a(com.p004ironsource.sdk.controller.a aVar) {
        this.L = aVar;
        aVar.a(p());
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        i(a(cVar.e(), cVar.h(), d9.g.f24688U, d9.g.f24688U));
    }

    public void a(com.p004ironsource.sdk.controller.i iVar) {
        this.K = iVar;
    }

    public void a(com.p004ironsource.sdk.controller.j jVar) {
        this.M = jVar;
    }

    public void a(com.p004ironsource.sdk.controller.o oVar) {
        this.H = oVar;
    }

    public void a(com.p004ironsource.sdk.controller.q qVar) {
        this.f27038I = qVar;
    }

    public void a(com.p004ironsource.sdk.controller.u uVar) {
        this.f27039J = uVar;
    }

    public void a(u uVar) {
        this.v = uVar;
    }

    public void a(up upVar) {
        this.a0 = upVar;
        this.Z.a(upVar);
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(va vaVar) {
        Map<String, String> mapB = vaVar.b();
        if (mapB != null) {
            i(a(d9.g.S, SDKUtils.flatMapToJsonAsString(mapB), d9.g.f24685P, d9.g.f24686Q));
        }
        this.G.b(mh.e.Banner, vaVar.h());
    }

    private void a(va vaVar, Map<String, String> map) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, vaVar.b()});
        if (map.containsKey("adm")) {
            this.f27048b.a(new z(this));
        }
        this.D.d(vaVar.h(), true);
        i(a(d9.g.f24680E, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), d9.g.f24681F, d9.g.G));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, v9 v9Var) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, vaVar.b()});
        if (map != null) {
            i(a(d9.g.f24684N, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), d9.g.O, d9.g.f24687R));
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, w9 w9Var) {
        i(a(mh.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, vaVar.b()}))));
    }

    @Override // com.p004ironsource.rp
    public void a(vh vhVar) {
        if (this.W && this.f27045V.a(vhVar)) {
            a(1);
        } else if (vhVar.getName().contains(d9.f)) {
            this.f27035B.a(new n());
        } else {
            c(vhVar.getName(), vhVar.getParent());
        }
    }

    @Override // com.p004ironsource.rp
    public void a(vh vhVar, nh nhVar) {
        if (this.W && this.f27045V.a(vhVar)) {
            this.f27042Q.b("controller html - failed to download - " + nhVar.b());
            return;
        }
        if (vhVar.getName().contains(d9.f)) {
            this.f27035B.a(new a(), new b(nhVar));
        } else {
            b(vhVar.getName(), vhVar.getParent(), nhVar.b());
        }
    }

    public void a(ww wwVar) {
        this.C = wwVar;
    }

    public void a(y2 y2Var) {
        String strB;
        u9 u9VarA;
        synchronized (this.f27036E) {
            try {
                if (y2Var.j() && this.f27052i) {
                    Log.d(this.f27049c, "restoreState(state:" + y2Var + ")");
                    int iC = y2Var.c();
                    if (iC != -1) {
                        mh.e eVar = mh.e.RewardedVideo;
                        if (iC == eVar.ordinal()) {
                            Log.d(this.f27049c, "onRVAdClosed()");
                            strB = y2Var.b();
                            u9VarA = a(eVar);
                            if (u9VarA != null && !TextUtils.isEmpty(strB)) {
                                u9VarA.a(eVar, strB);
                            }
                        } else {
                            eVar = mh.e.Interstitial;
                            if (iC == eVar.ordinal()) {
                                Log.d(this.f27049c, "onInterstitialAdClosed()");
                                strB = y2Var.b();
                                u9VarA = a(eVar);
                                if (u9VarA != null && !TextUtils.isEmpty(strB)) {
                                    u9VarA.a(eVar, strB);
                                }
                            }
                        }
                        y2Var.a(-1);
                        y2Var.f(null);
                    } else {
                        Log.d(this.f27049c, "No ad was opened");
                    }
                    String strD = y2Var.d();
                    String strF = y2Var.f();
                    for (va vaVar : this.G.a(mh.e.Interstitial)) {
                        if (vaVar.e() == 2) {
                            Log.d(this.f27049c, "initInterstitial(appKey:" + strD + ", userId:" + strF + ", demandSource:" + vaVar.f() + ")");
                            a(strD, strF, vaVar, this.y);
                        }
                    }
                    String strG = y2Var.g();
                    String strH = y2Var.h();
                    for (va vaVar2 : this.G.a(mh.e.RewardedVideo)) {
                        if (vaVar2.e() == 2) {
                            String strF2 = vaVar2.f();
                            Log.d(this.f27049c, "onRVNoMoreOffers()");
                            this.x.c(strF2);
                            Log.d(this.f27049c, "initRewardedVideo(appKey:" + strG + ", userId:" + strH + ", demandSource:" + strF2 + ")");
                            a(strG, strH, vaVar2, this.x);
                        }
                    }
                    y2Var.a(false);
                }
                this.D = y2Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ye yeVar) {
        try {
            this.f27042Q.a(yeVar);
        } catch (Exception e2) {
            q9.d().a(e2);
            Logger.e(this.f27049c, "handleLoadAd: " + e2);
        }
    }

    public void a(Runnable runnable) {
        pg pgVar = this.f27047a;
        if (pgVar != null) {
            pgVar.b(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, mh.e eVar, va vaVar) {
        if (q(eVar.toString())) {
            b(new m(eVar, vaVar, str));
        }
    }

    private void a(String str, mh.e eVar, va vaVar, s sVar) {
        if (TextUtils.isEmpty(str)) {
            sVar.a("Application key are missing", eVar, vaVar);
        } else {
            i(a(eVar, vaVar).f27145b);
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, w9 w9Var) {
        HashMap map = new HashMap();
        map.put("demandSourceName", str);
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        this.D.d(str, true);
        i(a(d9.g.f24680E, strFlatMapToJsonAsString, d9.g.f24681F, d9.g.G));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, v9 v9Var) {
        this.f = str;
        this.g = str2;
        this.f27058z = v9Var;
        a(str, mh.e.Banner, vaVar, new l());
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, w9 w9Var) {
        this.f = str;
        this.g = str2;
        this.y = w9Var;
        this.D.g(str);
        this.D.h(this.g);
        a(this.f, mh.e.Interstitial, vaVar, new k());
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, x9 x9Var) {
        this.f = str;
        this.g = str2;
        this.x = x9Var;
        this.D.i(str);
        this.D.j(str2);
        a(str, mh.e.RewardedVideo, vaVar, new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z2, String str2, String str3) {
        String strD = new is(str).d(z2 ? g0 : h0);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        i(e(strD, a(b(str, str2), str3)));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.S = jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean zOptBoolean = jSONObject.optBoolean("inspectWebview");
        if (zOptBoolean) {
            WebView.setWebContentsDebuggingEnabled(zOptBoolean);
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, v9 v9Var) {
        i(a(d9.g.f24684N, jSONObject.toString(), d9.g.O, d9.g.f24687R));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, w9 w9Var) {
        i(a(mh.e.Interstitial, jSONObject));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, x9 x9Var) {
        i(a(mh.e.RewardedVideo, jSONObject));
    }

    public void a(boolean z2, String str) {
        i(e(d9.g.f24689V, a(d9.h.K, str, null, null, null, null, null, null, d9.h.o, z2)));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public boolean a(String str) {
        va vaVarA = this.G.a(mh.e.Interstitial, str);
        return vaVarA != null && vaVarA.d();
    }
}
