package com.bytedance.sdk.openadsdk.core.jbs;

import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.xd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ay extends com.bytedance.sdk.component.adexpress.fi.ri {
    private qt ac;
    private String aw;
    private com.bytedance.sdk.openadsdk.ka.aw bgr;
    private com.bytedance.sdk.component.adexpress.lr.xha bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.ka.ka.fi f18123co;
    private final com.bytedance.sdk.component.mj.lr.ik ihz;
    private String jbs;
    private Context mj;
    private com.bytedance.sdk.openadsdk.core.model.wjv.ri nr;
    private com.bytedance.sdk.openadsdk.core.model.wjv qt;
    private JSONObject sf;
    private dzy slm;
    private volatile int tan;
    private final Runnable uq;
    private final Map<String, com.bytedance.sdk.openadsdk.ihz.ri.ri.ik> vr;
    com.bytedance.sdk.openadsdk.utils.ri xha;

    public ay(Context context, com.bytedance.sdk.component.adexpress.lr.aw awVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.ka.ka.fi fiVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        super(context, awVar, themeStatusBroadcastReceiver);
        this.vr = Collections.synchronizedMap(new HashMap());
        this.tan = 0;
        this.ihz = new com.bytedance.sdk.component.mj.lr.ik("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.jbs.ay.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.fi.ri) ay.this).di.get()) {
                    return;
                }
                ay ayVar = ay.this;
                ayVar.sf = ayVar.sf().ik();
                ay ayVar2 = ay.this;
                ayVar2.ri(ayVar2.sf);
                if (ay.this.tan == 0) {
                    ay.this.bu();
                }
                com.bytedance.sdk.openadsdk.core.vr.ik().post(ay.this.uq);
            }
        };
        this.uq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ay.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.fi.ri) ay.this).di.get() || ay.this.bu == null) {
                    return;
                }
                ay.this.co();
                ay ayVar = ay.this;
                ay.super.ri(ayVar.bu);
            }
        };
        if (this.ka == null) {
            return;
        }
        this.mj = context;
        this.jbs = awVar.ka();
        this.qt = wjvVar;
        this.f18123co = fiVar;
        themeStatusBroadcastReceiver.ri(this);
        bu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bu() {
        if (this.ka.getWebView() == null || !com.bytedance.sdk.openadsdk.utils.dzy.di()) {
            this.tan = 1;
            com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ay.3
                @Override // java.lang.Runnable
                public void run() {
                    ay.this.nr();
                }
            });
        } else {
            nr();
        }
        if (!bgr.lr(this.qt) || this.lr) {
            return;
        }
        bgr.ri(this.qt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nr() {
        com.bytedance.sdk.component.jbs.di diVar = this.ka;
        if (diVar == null || diVar.getWebView() == null || this.tan == 2) {
            return;
        }
        this.aw = ri(this.qt);
        this.ka.setDisplayZoomControls(false);
        ri(xd.ri(this.aw));
        aw();
        dzy dzyVar = new dzy(this.mj);
        this.slm = dzyVar;
        dzyVar.ik(true);
        bgr();
        this.tan = 2;
    }

    public void aw() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.qt;
        if (wjvVar == null || wjvVar.sez() == null) {
            return;
        }
        this.nr = this.qt.sez();
    }

    public void bgr() {
        com.bytedance.sdk.component.jbs.di diVar = this.ka;
        if (diVar == null || diVar.getWebView() == null) {
            return;
        }
        this.ka.setBackgroundColor(0);
        this.ka.setBackgroundResource(R.color.transparent);
        ri(this.ka);
        if (ri() != null) {
            this.bgr = new com.bytedance.sdk.openadsdk.ka.aw(this.qt, ri().getWebView()).lr(false);
        }
        this.bgr.ri(this.f18123co);
        qt qtVar = new qt(this.mj, this.slm, this.qt, this.bgr, sf());
        this.ac = qtVar;
        this.ka.setWebViewClient(qtVar);
        this.ka.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ri.ka(this.slm, this.bgr));
        com.bytedance.sdk.component.adexpress.fi.fi.ri().ri(this.ka, this.slm);
    }

    public void co() {
        dzy dzyVar;
        com.bytedance.sdk.component.jbs.di diVar = this.ka;
        if (diVar == null || diVar.getWebView() == null || (dzyVar = this.slm) == null) {
            return;
        }
        dzyVar.lr(this.ka).ri(this.qt).ik(this.qt.tn()).ka(this.qt.yjg()).lr(ig.ri(this.jbs)).fi(this.qt.uo()).ri(this).ri(this.sf).ri(this.ka).ri(this.f18123co);
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.ri
    public void onThemeChanged(int i) {
        if (this.slm == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
        } catch (JSONException unused) {
        }
        this.slm.ri("themeChange", jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.ri
    public void qt() {
        super.qt();
        com.bytedance.sdk.openadsdk.utils.ri riVar = this.xha;
        if (riVar != null) {
            riVar.lr(this);
        }
    }

    public dzy slm() {
        return this.slm;
    }

    public qt vr() {
        return this.ac;
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.ri
    public void di() {
        if (ri() == null) {
            return;
        }
        try {
            ri().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.ri, com.bytedance.sdk.component.adexpress.lr.ka
    public int ik() {
        return this.qt.hpn();
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.ri
    public void jbs() {
        super.jbs();
        com.bytedance.sdk.openadsdk.utils.ri riVarFi = com.bytedance.sdk.openadsdk.core.slm.ri().fi();
        this.xha = riVarFi;
        riVarFi.ri(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.ri
    public void ka() {
        if (this.di.get()) {
            return;
        }
        super.ka();
        dzy dzyVar = this.slm;
        if (dzyVar != null) {
            dzyVar.ik();
            this.slm.co();
            this.slm = null;
        }
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.bgr;
        if (awVar != null) {
            awVar.ka(false);
        }
        com.bytedance.sdk.openadsdk.core.vr.ik().removeCallbacks(this.uq);
        this.vr.clear();
    }

    public void lr(int i) {
        if (this.slm == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zoom_type", i);
            this.slm.ri("expressAdViewWillZoom", jSONObject);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.WebViewRender", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.ri
    public void mj() {
        super.mj();
        if (this.slm == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.slm.ri("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.ri
    public void xha() {
        dzy dzyVar = this.slm;
        if (dzyVar == null) {
            return;
        }
        dzyVar.ri("expressWebviewRecycle", (JSONObject) null);
    }

    public static String ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        return com.bytedance.sdk.component.adexpress.ri.lr.lr.ka((wjvVar == null || !wjvVar.nbc()) ? null : "v3");
    }

    private void lr(boolean z) {
        if (this.slm == null || this.ka == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z);
            this.slm.ri("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.ri, com.bytedance.sdk.component.adexpress.lr.ka
    public void ri(com.bytedance.sdk.component.adexpress.lr.xha xhaVar) {
        this.bu = xhaVar;
        com.bytedance.sdk.openadsdk.utils.dzy.ik((Runnable) this.ihz);
    }

    private void ri(com.bytedance.sdk.component.jbs.di diVar) {
        if (diVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.ri.ik.ri(this.mj).ri(false).ri(diVar.getWebView());
            diVar.setVerticalScrollBarEnabled(false);
            diVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.ri.ik.ri(diVar);
            diVar.bgr();
            diVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.tan.ri(diVar.getWebView(), BuildConfig.VERSION_CODE));
            diVar.setMixedContentMode(0);
            diVar.setJavaScriptEnabled(true);
            diVar.setJavaScriptCanOpenWindowsAutomatically(true);
            diVar.setDomStorageEnabled(true);
            diVar.setDatabaseEnabled(true);
            diVar.setAllowFileAccess(false);
            diVar.setSupportZoom(true);
            diVar.setBuiltInZoomControls(true);
            diVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            diVar.setUseWideViewPort(true);
            diVar.setCacheMode(-1);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.WebViewRender", e.toString());
        }
    }

    public static boolean lr(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.ri
    public com.bytedance.sdk.component.jbs.di ri() {
        return this.ka;
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.ri
    public void ri(int i) {
        if (i == this.fi) {
            return;
        }
        this.fi = i;
        lr(i == 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.ri, com.bytedance.sdk.component.adexpress.lr.sf
    public void ri(com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
        super.ri(bgrVar);
        if (this.ik) {
            com.bytedance.sdk.component.utils.jbs.lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ay.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = ((com.bytedance.sdk.component.adexpress.fi.ri) ay.this).ka.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar) {
        dzy dzyVar = this.slm;
        if (dzyVar != null) {
            dzyVar.ri(lrVar);
        }
    }
}
