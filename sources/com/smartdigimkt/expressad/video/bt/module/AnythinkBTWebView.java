package com.smartdigimkt.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p004ironsource.d9;
import com.smartdigimkt.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.f1.k;
import com.smartdigimkt.n.h;
import com.smartdigimkt.o.g;
import com.smartdigimkt.v0.u;
import com.smartdigimkt.z2.j;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkBTWebView extends BTBaseView implements IMraidJSBridge, g {
    private static final String F0 = "portrait";
    private static final String G0 = "landscape";
    private com.smartdigimkt.f3.d A0;
    private List<com.smartdigimkt.x.d> B0;
    private WindVaneWebView C0;
    private j D0;
    private WebView E0;
    private String u0;
    private String v0;
    private String w0;
    private boolean x0;
    private ImageView y0;
    private boolean z0;

    public class a extends com.smartdigimkt.k.a {
        public a() {
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.n.c
        public void a(Object obj) {
            super.a(obj);
            try {
                String strD = AnythinkBTWebView.this.D0 != null ? AnythinkBTWebView.this.D0.d() : "";
                h.a().b(obj, TextUtils.isEmpty(strD) ? "" : Base64.encodeToString(strD.getBytes(), 2));
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.u4.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (AnythinkBTWebView.this.E0 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", AnythinkBTWebView.this.h0);
                    jSONObject.put("code", BTBaseView.s0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", AnythinkBTWebView.this.h0);
                    jSONObject2.put("result", 1);
                    jSONObject.put("data", jSONObject2);
                    h.a().a(AnythinkBTWebView.this.E0, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e2) {
                    com.smartdigimkt.z1.c.c().a(AnythinkBTWebView.this.E0, e2.getMessage());
                    e2.getMessage();
                }
            }
            h.a().a(AnythinkBTWebView.this.C0);
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.u4.c
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            if (AnythinkBTWebView.this.E0 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", AnythinkBTWebView.this.h0);
                    jSONObject.put("code", BTBaseView.s0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", AnythinkBTWebView.this.h0);
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    h.a().a(AnythinkBTWebView.this.E0, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e2) {
                    com.smartdigimkt.z1.c.c().a(AnythinkBTWebView.this.E0, e2.getMessage());
                    e2.getMessage();
                }
            }
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.u4.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (AnythinkBTWebView.this.E0 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", AnythinkBTWebView.this.h0);
                    jSONObject.put("code", BTBaseView.s0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", AnythinkBTWebView.this.h0);
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", sslError.toString());
                    jSONObject.put("data", jSONObject2);
                    h.a().a(AnythinkBTWebView.this.E0, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e2) {
                    com.smartdigimkt.z1.c.c().a(AnythinkBTWebView.this.E0, e2.getMessage());
                    e2.getMessage();
                }
            }
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.u4.c
        public void readyState(WebView webView, int i2) {
            super.readyState(webView, i2);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AnythinkBTWebView.this.E0 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.s0);
                    jSONObject.put("id", AnythinkBTWebView.this.h0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    h.a().a(AnythinkBTWebView.this.E0, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    com.smartdigimkt.z1.c.c().a(AnythinkBTWebView.this.E0, "onClicked", AnythinkBTWebView.this.h0);
                }
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AnythinkBTWebView.this.close();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (AnythinkBTWebView.this.C0 != null) {
                    AnythinkBTWebView.this.C0.clearWebView();
                    AnythinkBTWebView.this.C0.release();
                }
                AnythinkBTWebView.this.u0 = null;
                AnythinkBTWebView.this.v0 = null;
                AnythinkBTWebView.this.w0 = null;
                if (AnythinkBTWebView.this.E0 != null) {
                    AnythinkBTWebView.this.E0 = null;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public AnythinkBTWebView(Context context) {
        super(context);
        this.x0 = false;
        this.z0 = false;
    }

    private void setIntentFilter(com.smartdigimkt.u4.d dVar) {
        WindVaneWebView windVaneWebView = this.C0;
        if (windVaneWebView != null) {
            windVaneWebView.setFilter(dVar);
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.C0 != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.s0);
                jSONObject2.put("id", this.h0);
                jSONObject2.put(d9.h.j0, str);
                jSONObject2.put("data", jSONObject);
                h.a().a((WebView) this.C0, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.smartdigimkt.z1.c.c().a((WebView) this.C0, "broadcast", this.h0);
            }
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void close() {
        WebView webView = this.E0;
        if (webView != null) {
            BTBaseView.a(webView, "onPlayerCloseBtnClicked", this.h0);
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void expand(String str, boolean z2) {
    }

    public List<com.smartdigimkt.x.d> getCampaigns() {
        return this.B0;
    }

    public String getFilePath() {
        return this.v0;
    }

    public String getFileURL() {
        return this.u0;
    }

    public String getHtml() {
        return this.w0;
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.mraid.IMraidJSBridge
    public com.smartdigimkt.x.d getMraidCampaign() {
        return this.f0;
    }

    public com.smartdigimkt.f3.d getRewardUnitSetting() {
        return this.A0;
    }

    public WindVaneWebView getWebView() {
        return this.C0;
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.C0 = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.C0.setVisibility(0);
        j jVar = new j(null, this.f0, this.B0);
        this.D0 = jVar;
        jVar.setUnitId(this.g0);
        this.C0.setObject(this.D0);
        this.C0.setMraidObject(this);
        this.C0.setWebViewListener(new a());
        addView(this.C0, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new b());
        try {
            ImageView imageView = new ImageView(getContext());
            this.y0 = imageView;
            imageView.setImageResource(findDrawable("sdm_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.y0.setLayoutParams(layoutParams);
            this.y0.setVisibility(this.x0 ? 4 : 8);
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar != null && dVar.K2()) {
                this.y0.setVisibility(4);
            }
            this.y0.setOnClickListener(new c());
            addView(this.y0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void notifyEvent(String str) {
        WindVaneWebView windVaneWebView = this.C0;
        if (windVaneWebView != null) {
            BTBaseView.a(windVaneWebView, str, this.h0);
        }
    }

    public void onBackPressed() {
        if (this.C0 != null) {
            com.smartdigimkt.z1.c.c().a((WebView) this.C0, "onSystemBackPressed", this.h0);
        }
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.C0 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", "landscape");
                } else {
                    jSONObject.put("orientation", "portrait");
                }
                jSONObject.put("instanceId", this.h0);
                h.a().a((WebView) this.C0, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void onDestory() {
        if (this.z0) {
            return;
        }
        this.z0 = true;
        try {
            if (this.C0 != null) {
                com.smartdigimkt.z1.c.c().a((WebView) this.C0, "onSystemDestory", this.h0);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new d(), 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.f1.j
    public void onFinishRedirection(k kVar, String str) {
        if (kVar == null) {
            return;
        }
        u.a(kVar, this);
    }

    @Override // com.smartdigimkt.f1.j
    public void onRedirectionFailed(k kVar, String str) {
        if (kVar == null) {
            return;
        }
        u.a(kVar, this);
    }

    @Override // com.smartdigimkt.f1.j
    public void onStartRedirection(k kVar, String str) {
        u.b(kVar, this);
    }

    @Override // com.smartdigimkt.s4.b
    public void open(String str) {
        try {
            String strP0 = this.f0.p0();
            if (!TextUtils.isEmpty(str)) {
                this.f0.H(str);
                a(str);
            }
            new com.smartdigimkt.o.a(getContext(), this.g0).a(this.f0);
            this.f0.H(strP0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.u0)) {
            this.C0.loadUrl(this.u0);
        } else if (!TextUtils.isEmpty(this.v0)) {
            this.C0.loadUrl(this.v0);
        } else {
            if (TextUtils.isEmpty(this.w0)) {
                return;
            }
            this.C0.loadDataWithBaseURL("", this.w0, "text/html", "UTF-8", null);
        }
    }

    public void setCampaigns(List<com.smartdigimkt.x.d> list) {
        this.B0 = list;
    }

    public void setCreateWebView(WebView webView) {
        this.E0 = webView;
    }

    public void setFilePath(String str) {
        this.v0 = str;
    }

    public void setFileURL(String str) {
        this.u0 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zContains = str.contains("play.google.com");
        setWebviewClickable(!zContains);
        if (zContains) {
            setIntentFilter(new com.smartdigimkt.u4.d());
        }
    }

    public void setHtml(String str) {
        this.w0 = str;
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void setRewardUnitSetting(com.smartdigimkt.f3.d dVar) {
        this.A0 = dVar;
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.C0;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void setWebviewClickable(boolean z2) {
        WindVaneWebView windVaneWebView = this.C0;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z2);
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void unload() {
        close();
    }

    @Override // com.smartdigimkt.s4.b
    public void useCustomClose(boolean z2) {
        try {
            this.y0.setVisibility(z2 ? 4 : 0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.C0;
        if (windVaneWebView == null || !windVaneWebView.canGoBack()) {
            return false;
        }
        this.C0.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.C0;
        if (windVaneWebView == null || !windVaneWebView.canGoForward()) {
            return false;
        }
        this.C0.goForward();
        return true;
    }

    public void webviewLoad(int i2) {
        if (this.D0 == null) {
            this.D0 = new j(null, this.f0, this.B0);
        }
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar != null) {
            this.D0.c(dVar);
        } else {
            List<com.smartdigimkt.x.d> list = this.B0;
            if (list != null && list.size() > 0) {
                this.D0.a(this.B0);
                if (this.B0.size() == 1) {
                    this.D0.c(this.B0.get(0));
                }
            }
        }
        com.smartdigimkt.f3.d dVar2 = this.A0;
        if (dVar2 != null) {
            this.D0.setRewardUnitSetting(dVar2);
        }
        this.D0.setUnitId(this.g0);
        this.D0.c(this.h0);
        if (i2 == 1) {
            this.D0.l();
        }
        WindVaneWebView windVaneWebView = this.C0;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.D0);
        }
        com.smartdigimkt.x.d dVar3 = this.f0;
        if (dVar3 != null && dVar3.K2()) {
            this.y0.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.C0;
        if (windVaneWebView == null) {
            return false;
        }
        windVaneWebView.reload();
        return true;
    }

    public AnythinkBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x0 = false;
        this.z0 = false;
    }

    private void a(String str) {
        try {
            getMraidCampaign();
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
