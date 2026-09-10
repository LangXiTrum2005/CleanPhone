package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends com.bytedance.sdk.component.jbs.di implements com.bytedance.sdk.openadsdk.core.jbs.ik.InterfaceC0252ik {
    private List<String> aw;
    private lr bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int f18125co;
    AtomicBoolean di;
    protected boolean fi;
    private ik jbs;
    protected boolean ka;
    private wjv mj;
    private com.bytedance.sdk.openadsdk.core.model.wjv qt;
    private String sf;
    private long slm;
    private int vr;
    AtomicBoolean xha;

    public interface lr {
        void lr();

        View ri();

        void ri(int i, int i2);

        void ri(View view, int i);
    }

    public static class ri extends com.bytedance.sdk.component.jbs.di.ri {
        public static final Set<String> ri = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.jbs.fi.ri.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        com.bytedance.sdk.openadsdk.core.jbs.ik.InterfaceC0252ik lr;

        public ri(com.bytedance.sdk.openadsdk.core.jbs.ik.InterfaceC0252ik interfaceC0252ik) {
            this.lr = interfaceC0252ik;
        }

        private void ri(String str) {
            int iLastIndexOf;
            com.bytedance.sdk.openadsdk.core.jbs.ik.InterfaceC0252ik interfaceC0252ik;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!ri.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0252ik = this.lr) == null) {
                    return;
                }
                interfaceC0252ik.lr(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            com.bytedance.sdk.openadsdk.core.jbs.ik.InterfaceC0252ik interfaceC0252ik = this.lr;
            if (interfaceC0252ik != null) {
                interfaceC0252ik.ri();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                ri(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            ri(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.lr.ri(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            ri(webResourceRequest.getUrl().toString());
        }

        private void ri(String str, int i, String str2) {
            com.bytedance.sdk.openadsdk.core.jbs.ik.InterfaceC0252ik interfaceC0252ik = this.lr;
            if (interfaceC0252ik != null) {
                interfaceC0252ik.ri(106, i);
            }
        }
    }

    public fi(Context context) {
        super(context, com.bytedance.sdk.component.jbs.di.ik.DSP);
        this.ka = false;
        this.fi = false;
        this.di = new AtomicBoolean(false);
        this.xha = new AtomicBoolean(false);
        this.f18125co = 0;
    }

    private void ihz() {
        if (this.aw == null) {
            com.bytedance.sdk.openadsdk.ka.ik.lr(this.qt, this.sf, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.ka.ik.ri(new com.bytedance.sdk.component.mj.lr.ik("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.jbs.fi.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (fi.this.aw != null && fi.this.xha.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = fi.this.aw.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.ka.ik.lr(fi.this.qt, fi.this.sf, "dsp_html_error_url", jSONObject);
                            fi.this.aw = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void ac() {
        this.di.set(false);
        String strRko = this.qt.rko();
        if (TextUtils.isEmpty(strRko)) {
            return;
        }
        String strRi = com.bytedance.sdk.openadsdk.core.aw.fi.ri(strRko);
        String str = TextUtils.isEmpty(strRi) ? strRko : strRi;
        this.f18125co = 0;
        ri(null, str, "text/html", C.UTF8_NAME, null);
        this.slm = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.component.jbs.di, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.ka) {
            this.jbs.ri(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.jbs.di, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.jbs.ri();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.vr / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.qt, this.sf, "load_rate", jSONObject);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        this.fi = z;
        this.jbs.ri(z);
    }

    @Override // com.bytedance.sdk.component.jbs.di
    public void slm() {
        this.jbs.lr();
        super.slm();
    }

    public void tan() {
        lr lrVar = this.bgr;
        if (lrVar != null) {
            lrVar.lr();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.slm);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.qt, this.sf, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ik.InterfaceC0252ik
    public void lr(String str) {
        if (this.aw == null) {
            this.aw = new ArrayList();
        }
        this.aw.add(str);
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, lr lrVar, String str) {
        this.bgr = lrVar;
        this.qt = wjvVar;
        this.sf = str;
        this.jbs = new ik();
        this.mj = new wjv(getContext());
        setWebViewClient(new ri(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.jbs.fi.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                fi.this.vr = i;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    fi.this.ri();
                }
            }
        });
        com.bytedance.sdk.component.utils.jbs.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.fi.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = fi.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.jbs.fi.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            fi.this.mj.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    public static class ik {
        protected int ri = 0;
        private com.bytedance.sdk.openadsdk.core.aw.di lr = com.bytedance.sdk.openadsdk.core.aw.di.ri();

        public void lr() {
            ri();
        }

        public void ri(WebView webView) {
            if (webView != null && this.ri == 0) {
                if (this.lr == null) {
                    this.lr = com.bytedance.sdk.openadsdk.core.aw.di.ri();
                }
                this.lr.ri(webView);
                this.lr.lr();
                this.ri = 1;
            }
        }

        public void ri(boolean z) {
            com.bytedance.sdk.openadsdk.core.aw.di diVar;
            if (this.ri == 1 && z && (diVar = this.lr) != null) {
                diVar.ik();
                this.ri = 3;
            }
        }

        public void ri(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.aw.di diVar = this.lr;
            if (diVar != null) {
                diVar.ri(view, friendlyObstructionPurpose);
            }
        }

        public void ri() {
            com.bytedance.sdk.openadsdk.core.aw.di diVar;
            int i = this.ri;
            if (i != 0 && i != 4 && (diVar = this.lr) != null) {
                diVar.ka();
            }
            this.ri = 4;
            this.lr = null;
        }
    }

    public void ri(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.jbs.ri(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ik.InterfaceC0252ik
    public void ri(String str) {
        boolean zRi;
        if (TextUtils.isEmpty(str) || this.qt == null || !this.mj.lr()) {
            return;
        }
        int iRi = ig.ri(this.sf);
        View viewRi = null;
        if (!com.bytedance.sdk.component.utils.nr.ri(str) && (this.qt.lau() == null || TextUtils.isEmpty(this.qt.lau().ri()))) {
            com.bytedance.sdk.openadsdk.core.model.aw awVar = new com.bytedance.sdk.openadsdk.core.model.aw();
            awVar.ri(str);
            this.qt.ri(awVar);
            str = null;
        }
        this.qt.ka(true);
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.qt;
        if (wjvVar == null || wjvVar.lau() == null || TextUtils.isEmpty(this.qt.lau().ri())) {
            zRi = false;
        } else {
            zRi = com.bytedance.sdk.openadsdk.core.ig.ri(getContext(), this.qt, iRi, this.sf, true, (Map<String, Object>) null);
            if (!zRi && !TextUtils.isEmpty(this.qt.lau().lr())) {
                str = this.qt.lau().lr();
                com.bytedance.sdk.openadsdk.ka.ik.ri(this.qt, this.sf, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = str;
        if (!zRi) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.core.ig.ri(getContext(), this.qt, iRi, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.ka.ri) null, this.sf, true, str2);
            }
        }
        if (this.mj != null) {
            lr lrVar = this.bgr;
            if (lrVar != null) {
                viewRi = lrVar.ri();
                this.bgr.ri(this, 2);
            }
            com.bytedance.sdk.openadsdk.core.model.co coVarRi = this.mj.ri(getContext(), viewRi);
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.ka.ik.ri("click", this.qt, coVarRi, this.sf, true, (Map<String, Object>) map, this.mj.lr() ? 1 : 2);
        }
        wjv wjvVar2 = this.mj;
        if (wjvVar2 != null) {
            wjvVar2.ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ik.InterfaceC0252ik
    public void ri(int i, int i2) {
        lr lrVar = this.bgr;
        if (lrVar != null) {
            lrVar.ri(i, i2);
        }
        this.f18125co = i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i2);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.slm);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.qt, this.sf, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ik.InterfaceC0252ik
    public void ri() {
        if (this.di.compareAndSet(false, true)) {
            this.ka = true;
            this.jbs.ri(getWebView());
            this.jbs.ri(this.fi);
            tan();
            ihz();
        }
    }
}
