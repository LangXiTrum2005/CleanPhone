package com.bytedance.sdk.openadsdk.core.tvp;

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
import com.bytedance.sdk.openadsdk.core.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
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

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends com.bytedance.sdk.component.tvp.mo implements com.bytedance.sdk.openadsdk.core.tvp.lnr.InterfaceC0138lnr {
    private int bjy;
    private List<String> exu;
    private int fs;
    private ljh jpc;
    private long jtx;
    protected boolean mml;
    AtomicBoolean mo;
    protected boolean mzz;
    private ud rdp;
    private String rq;
    private com.bytedance.sdk.openadsdk.core.model.ljh to;
    private lnr tvp;
    AtomicBoolean wd;

    public static class qdl extends com.bytedance.sdk.component.tvp.mo.qdl {
        public static final Set<String> qdl = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.tvp.mzz.qdl.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        com.bytedance.sdk.openadsdk.core.tvp.lnr.InterfaceC0138lnr ud;

        public qdl(com.bytedance.sdk.openadsdk.core.tvp.lnr.InterfaceC0138lnr interfaceC0138lnr) {
            this.ud = interfaceC0138lnr;
        }

        private void qdl(String str) {
            int iLastIndexOf;
            com.bytedance.sdk.openadsdk.core.tvp.lnr.InterfaceC0138lnr interfaceC0138lnr;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(com.thinkup.core.common.n.mo.ono)) > 0) {
                if (!qdl.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0138lnr = this.ud) == null) {
                    return;
                }
                interfaceC0138lnr.ud(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            com.bytedance.sdk.openadsdk.core.tvp.lnr.InterfaceC0138lnr interfaceC0138lnr = this.ud;
            if (interfaceC0138lnr != null) {
                interfaceC0138lnr.qdl();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                qdl(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            qdl(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.ud.qdl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            qdl(webResourceRequest.getUrl().toString());
        }

        private void qdl(String str, int i2, String str2) {
            com.bytedance.sdk.openadsdk.core.tvp.lnr.InterfaceC0138lnr interfaceC0138lnr = this.ud;
            if (interfaceC0138lnr != null) {
                interfaceC0138lnr.qdl(106, i2);
            }
        }
    }

    public interface ud {
        View qdl();

        void qdl(int i2, int i3);

        void qdl(View view, int i2);

        void ud();
    }

    public mzz(Context context) {
        super(context, com.bytedance.sdk.component.tvp.mo.lnr.DSP);
        this.mml = false;
        this.mzz = false;
        this.mo = new AtomicBoolean(false);
        this.wd = new AtomicBoolean(false);
        this.fs = 0;
    }

    private void jyq() {
        if (this.exu == null) {
            com.bytedance.sdk.openadsdk.mml.lnr.ud(this.to, this.rq, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(new com.bytedance.sdk.component.jpc.jpc("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.tvp.mzz.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (mzz.this.exu != null && mzz.this.wd.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = mzz.this.exu.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.mml.lnr.ud(mzz.this.to, mzz.this.rq, "dsp_html_error_url", jSONObject);
                            mzz.this.exu = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void aaj() {
        this.mo.set(false);
        String strFk = this.to.fk();
        if (TextUtils.isEmpty(strFk)) {
            return;
        }
        String strQdl = com.bytedance.sdk.openadsdk.core.fs.mzz.qdl(strFk);
        String str = TextUtils.isEmpty(strQdl) ? strFk : strQdl;
        this.fs = 0;
        qdl(null, str, "text/html", "UTF-8", null);
        this.jtx = SystemClock.elapsedRealtime();
    }

    public void exc() {
        ud udVar = this.rdp;
        if (udVar != null) {
            udVar.ud();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.jtx);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.to, this.rq, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.component.tvp.mo
    public void jtx() {
        this.tvp.ud();
        super.jtx();
    }

    @Override // com.bytedance.sdk.component.tvp.mo, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mml) {
            this.tvp.qdl(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.tvp.mo, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.tvp.qdl();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.bjy / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.to, this.rq, "load_rate", jSONObject);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        boolean z2 = i2 == 0;
        this.mzz = z2;
        this.tvp.qdl(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.lnr.InterfaceC0138lnr
    public void ud(String str) {
        if (this.exu == null) {
            this.exu = new ArrayList();
        }
        this.exu.add(str);
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, ud udVar, String str) {
        this.rdp = udVar;
        this.to = ljhVar;
        this.rq = str;
        this.tvp = new lnr();
        this.jpc = new ljh(getContext());
        setWebViewClient(new qdl(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.tvp.mzz.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i2) {
                mzz.this.bjy = i2;
                super.onProgressChanged(webView, i2);
                if (i2 >= 100) {
                    mzz.this.qdl();
                }
            }
        });
        com.bytedance.sdk.component.utils.tvp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.mzz.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = mzz.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.tvp.mzz.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            mzz.this.jpc.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    public static class lnr {
        protected int qdl = 0;
        private com.bytedance.sdk.openadsdk.core.fs.mo ud = com.bytedance.sdk.openadsdk.core.fs.mo.qdl();

        public void qdl(WebView webView) {
            if (webView != null && this.qdl == 0) {
                if (this.ud == null) {
                    this.ud = com.bytedance.sdk.openadsdk.core.fs.mo.qdl();
                }
                this.ud.qdl(webView);
                this.ud.ud();
                this.qdl = 1;
            }
        }

        public void ud() {
            qdl();
        }

        public void qdl(boolean z2) {
            com.bytedance.sdk.openadsdk.core.fs.mo moVar;
            if (this.qdl == 1 && z2 && (moVar = this.ud) != null) {
                moVar.lnr();
                this.qdl = 3;
            }
        }

        public void qdl(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.fs.mo moVar = this.ud;
            if (moVar != null) {
                moVar.qdl(view, friendlyObstructionPurpose);
            }
        }

        public void qdl() {
            com.bytedance.sdk.openadsdk.core.fs.mo moVar;
            int i2 = this.qdl;
            if (i2 != 0 && i2 != 4 && (moVar = this.ud) != null) {
                moVar.mml();
            }
            this.qdl = 4;
            this.ud = null;
        }
    }

    public void qdl(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.tvp.qdl(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.lnr.InterfaceC0138lnr
    public void qdl(String str) {
        boolean zQdl;
        if (TextUtils.isEmpty(str) || this.to == null || !this.jpc.ud()) {
            return;
        }
        int iQdl = gy.qdl(this.rq);
        View viewQdl = null;
        if (!com.bytedance.sdk.component.utils.jl.qdl(str) && (this.to.bo() == null || TextUtils.isEmpty(this.to.bo().qdl()))) {
            com.bytedance.sdk.openadsdk.core.model.exu exuVar = new com.bytedance.sdk.openadsdk.core.model.exu();
            exuVar.qdl(str);
            this.to.qdl(exuVar);
            str = null;
        }
        this.to.lnr(true);
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.to;
        if (ljhVar == null || ljhVar.bo() == null || TextUtils.isEmpty(this.to.bo().qdl())) {
            zQdl = false;
        } else {
            zQdl = fco.qdl(getContext(), this.to, iQdl, this.rq, true, (Map<String, Object>) null);
            if (!zQdl && !TextUtils.isEmpty(this.to.bo().ud())) {
                str = this.to.bo().ud();
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.to, this.rq, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = str;
        if (!zQdl) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                fco.qdl(getContext(), this.to, iQdl, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.mml.qdl) null, this.rq, true, str2);
            }
        }
        if (this.jpc != null) {
            ud udVar = this.rdp;
            if (udVar != null) {
                viewQdl = udVar.qdl();
                this.rdp.qdl(this, 2);
            }
            com.bytedance.sdk.openadsdk.core.model.fs fsVarQdl = this.jpc.qdl(getContext(), viewQdl);
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", this.to, fsVarQdl, this.rq, true, (Map<String, Object>) map, this.jpc.ud() ? 1 : 2);
        }
        ljh ljhVar2 = this.jpc;
        if (ljhVar2 != null) {
            ljhVar2.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.lnr.InterfaceC0138lnr
    public void qdl(int i2, int i3) {
        ud udVar = this.rdp;
        if (udVar != null) {
            udVar.qdl(i2, i3);
        }
        this.fs = i3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i3);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.jtx);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.to, this.rq, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.lnr.InterfaceC0138lnr
    public void qdl() {
        if (this.mo.compareAndSet(false, true)) {
            this.mml = true;
            this.tvp.qdl(getWebView());
            this.tvp.qdl(this.mzz);
            exc();
            jyq();
        }
    }
}
