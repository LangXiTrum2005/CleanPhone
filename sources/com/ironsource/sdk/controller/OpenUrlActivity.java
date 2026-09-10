package com.ironsource.sdk.controller;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.C0301da;
import com.ironsource.C0474n4;
import com.ironsource.C0611ug;
import com.ironsource.InterfaceC0362h;
import com.ironsource.J3;
import com.ironsource.P9;
import com.ironsource.Pe;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class OpenUrlActivity extends Activity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f30244j = "OpenUrlActivity";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f30245k = SDKUtils.generateViewId();
    private static final int l = SDKUtils.generateViewId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f30247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProgressBar f30248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f30249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RelativeLayout f30250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30251f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f30246a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f30252g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f30253h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f30254i = new b();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 4098) == 0) {
                OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
                openUrlActivity.f30252g.removeCallbacks(openUrlActivity.f30254i);
                OpenUrlActivity openUrlActivity2 = OpenUrlActivity.this;
                openUrlActivity2.f30252g.postDelayed(openUrlActivity2.f30254i, 500L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f30253h));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends WebViewClient {
        public /* synthetic */ c(OpenUrlActivity openUrlActivity, int i10) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f30248c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f30248c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            v vVar;
            super.onReceivedError(webView, i10, str, str2);
            try {
                J3 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.b()) {
                    if (featureFlagCatchUrlError.e() && (vVar = OpenUrlActivity.this.f30247b) != null) {
                        vVar.d(str, str2);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th2) {
                C0474n4.d().a(th2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(OpenUrlActivity.f30244j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!new Pe(str, C0301da.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                C0611ug.a(OpenUrlActivity.this, str);
                OpenUrlActivity.this.f30247b.A();
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                StringBuilder sb2 = new StringBuilder();
                if (e10 instanceof ActivityNotFoundException) {
                    sb2.append(X3.c.f27713x);
                } else {
                    sb2.append(X3.c.f27714y);
                }
                v vVar = OpenUrlActivity.this.f30247b;
                if (vVar != null) {
                    vVar.d(sb2.toString(), str);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String f30258a = "is_store";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final String f30259b = "external_url";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final String f30260c = "secondary_web_view";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final String f30261d = "immersive";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final String f30262e = "no activity to handle url";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final String f30263f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0362h f30264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f30265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f30266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f30267d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f30268e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f30269f = false;

        public e(InterfaceC0362h interfaceC0362h) {
            this.f30264a = interfaceC0362h;
        }

        public e a(int i10) {
            this.f30265b = i10;
            return this;
        }

        public e b(boolean z10) {
            this.f30267d = z10;
            return this;
        }

        public e c(boolean z10) {
            this.f30268e = z10;
            return this;
        }

        public e a(String str) {
            this.f30266c = str;
            return this;
        }

        public e a(boolean z10) {
            this.f30269f = z10;
            return this;
        }

        public Intent a(Context context) {
            Intent intentA = this.f30264a.a(context);
            intentA.putExtra("external_url", this.f30266c);
            intentA.putExtra("secondary_web_view", this.f30267d);
            intentA.putExtra("is_store", this.f30268e);
            intentA.putExtra(X3.i.f27818v, this.f30269f);
            if (!(context instanceof Activity)) {
                intentA.setFlags(this.f30265b);
            }
            return intentA;
        }
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.f30247b;
        if (vVar != null) {
            vVar.b(false, X3.i.Y);
            if (this.f30250e == null || (viewGroup = (ViewGroup) this.f30246a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(f30245k) != null) {
                viewGroup.removeView(this.f30246a);
            }
            if (viewGroup.findViewById(l) != null) {
                viewGroup.removeView(this.f30248c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.f30249d && (vVar = this.f30247b) != null) {
            vVar.c(X3.i.f27797j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f30246a.stopLoading();
        this.f30246a.clearHistory();
        try {
            this.f30246a.loadUrl(str);
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            Logger.e(f30244j, "OpenUrlActivity:: loadUrl: " + th2.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f30246a.canGoBack()) {
            this.f30246a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f30244j, "onCreate()");
        try {
            this.f30247b = (v) P9.b((Context) this).a().k();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f30251f = extras.getString("external_url");
            this.f30249d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(X3.i.f27818v, false);
            this.f30253h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.f30254i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f30250e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f30253h && (i10 == 25 || i10 == 24)) {
            this.f30252g.postDelayed(this.f30254i, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f30253h && z10) {
            runOnUiThread(this.f30254i);
        }
    }

    private void a() {
        if (this.f30248c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.f30248c = progressBar;
            progressBar.setId(l);
        }
        if (findViewById(l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f30248c.setLayoutParams(layoutParams);
            this.f30248c.setVisibility(4);
            this.f30250e.addView(this.f30248c);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        if (this.f30246a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f30246a = webView;
            webView.setId(f30245k);
            this.f30246a.getSettings().setJavaScriptEnabled(true);
            this.f30246a.setWebViewClient(new c(this, 0));
            loadUrl(this.f30251f);
        }
        if (findViewById(f30245k) == null) {
            this.f30250e.addView(this.f30246a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.f30247b;
        if (vVar != null) {
            vVar.b(true, X3.i.Y);
        }
    }

    private void c() {
        WebView webView = this.f30246a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }

    private void e() {
        requestWindowFeature(1);
    }
}
