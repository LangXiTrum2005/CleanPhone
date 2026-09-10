package com.p004ironsource.sdk.controller;

import android.R;
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
import com.p004ironsource.InterfaceC3358h;
import com.p004ironsource.d9;
import com.p004ironsource.dk;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mt;
import com.p004ironsource.pk;
import com.p004ironsource.pw;
import com.p004ironsource.q8;
import com.p004ironsource.q9;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.sdk.utils.SDKUtils;

/* JADX INFO: loaded from: classes5.dex */
public class OpenUrlActivity extends Activity {
    private static final String j = "OpenUrlActivity";
    private static final int k = SDKUtils.generateViewId();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f26815l = SDKUtils.generateViewId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f26817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProgressBar f26818c;
    boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RelativeLayout f26819e;
    private String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f26816a = null;
    private final Handler g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f26820h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f26821i = new b();

    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i2) {
            if ((i2 & 4098) == 0) {
                OpenUrlActivity.this.g.removeCallbacks(OpenUrlActivity.this.f26821i);
                OpenUrlActivity.this.g.postDelayed(OpenUrlActivity.this.f26821i, 500L);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f26820h));
        }
    }

    public class c extends WebViewClient {
        private c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f26818c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f26818c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            try {
                q8 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.c()) {
                    if (featureFlagCatchUrlError.e() && OpenUrlActivity.this.f26817b != null) {
                        OpenUrlActivity.this.f26817b.d(str, str2);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th) {
                q9.d().a(th);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(OpenUrlActivity.j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!new mt(str, pk.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().c()).a()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                pw.a(OpenUrlActivity.this, str);
                OpenUrlActivity.this.f26817b.z();
            } catch (Exception e2) {
                q9.d().a(e2);
                StringBuilder sb = new StringBuilder();
                sb.append(e2 instanceof ActivityNotFoundException ? d9.c.x : d9.c.y);
                if (OpenUrlActivity.this.f26817b != null) {
                    OpenUrlActivity.this.f26817b.d(sb.toString(), str);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }

        public /* synthetic */ c(OpenUrlActivity openUrlActivity, a aVar) {
            this();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String f26825a = "is_store";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final String f26826b = "external_url";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final String f26827c = "secondary_web_view";
        static final String d = "immersive";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final String f26828e = "no activity to handle url";
        static final String f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3358h f26829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f26830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f26831c;
        private boolean d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f26832e = false;
        private boolean f = false;

        public e(InterfaceC3358h interfaceC3358h) {
            this.f26829a = interfaceC3358h;
        }

        public Intent a(Context context) {
            Intent intentA = this.f26829a.a(context);
            intentA.putExtra("external_url", this.f26831c);
            intentA.putExtra("secondary_web_view", this.d);
            intentA.putExtra("is_store", this.f26832e);
            intentA.putExtra(d9.h.v, this.f);
            if (!(context instanceof Activity)) {
                intentA.setFlags(this.f26830b);
            }
            return intentA;
        }

        public e b(boolean z2) {
            this.d = z2;
            return this;
        }

        public e c(boolean z2) {
            this.f26832e = z2;
            return this;
        }

        public e a(int i2) {
            this.f26830b = i2;
            return this;
        }

        public e a(String str) {
            this.f26831c = str;
            return this;
        }

        public e a(boolean z2) {
            this.f = z2;
            return this;
        }
    }

    private void e() {
        requestWindowFeature(1);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.f26817b;
        if (vVar != null) {
            vVar.a(false, d9.h.f24718Y);
            if (this.f26819e == null || (viewGroup = (ViewGroup) this.f26816a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(k) != null) {
                viewGroup.removeView(this.f26816a);
            }
            if (viewGroup.findViewById(f26815l) != null) {
                viewGroup.removeView(this.f26818c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.d && (vVar = this.f26817b) != null) {
            vVar.c(d9.h.j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f26816a.stopLoading();
        this.f26816a.clearHistory();
        try {
            this.f26816a.loadUrl(str);
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("OpenUrlActivity:: loadUrl: ", th);
            sbP.append(th.toString());
            Logger.e(j, sbP.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f26816a.canGoBack()) {
            this.f26816a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(j, "onCreate()");
        try {
            this.f26817b = (v) dk.b((Context) this).a().j();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f = extras.getString("external_url");
            this.d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(d9.h.v, false);
            this.f26820h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.f26821i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f26819e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f26820h && (i2 == 25 || i2 == 24)) {
            this.g.postDelayed(this.f26821i, 500L);
        }
        return super.onKeyDown(i2, keyEvent);
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
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (this.f26820h && z2) {
            runOnUiThread(this.f26821i);
        }
    }

    private void a() {
        if (this.f26818c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.f26818c = progressBar;
            progressBar.setId(f26815l);
        }
        if (findViewById(f26815l) == null) {
            this.f26818c.setLayoutParams(androidx.media3.extractor.text.ttml.a.f(-2, -2, 13));
            this.f26818c.setVisibility(4);
            this.f26819e.addView(this.f26818c);
        }
    }

    private void b() {
        if (this.f26816a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f26816a = webView;
            webView.setId(k);
            this.f26816a.getSettings().setJavaScriptEnabled(true);
            this.f26816a.setWebViewClient(new c(this, null));
            loadUrl(this.f);
        }
        if (findViewById(k) == null) {
            this.f26819e.addView(this.f26816a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.f26817b;
        if (vVar != null) {
            vVar.a(true, d9.h.f24718Y);
        }
    }

    private void c() {
        WebView webView = this.f26816a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }
}
