package com.bytedance.sdk.openadsdk.core.tvp;

import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.datastore.preferences.protobuf.a;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.hzv;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class bch extends com.bytedance.sdk.component.adexpress.mzz.qdl {
    private to aaj;
    private final Map<String, com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo> bjy;
    private volatile int exc;
    private String exu;
    private com.bytedance.sdk.openadsdk.mml.mml.mzz fs;
    private com.bytedance.sdk.openadsdk.core.model.ljh.qdl jl;
    private Context jpc;
    private hkc jtx;
    private final com.bytedance.sdk.component.jpc.jpc jyq;
    private final Runnable oth;
    private com.bytedance.sdk.openadsdk.mml.fs rdp;
    private JSONObject rq;
    private com.bytedance.sdk.openadsdk.core.model.ljh to;
    private String tvp;
    com.bytedance.sdk.openadsdk.utils.qdl wd;
    private com.bytedance.sdk.component.adexpress.ud.wd yt;

    public bch(Context context, com.bytedance.sdk.component.adexpress.ud.exu exuVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        super(context, exuVar, themeStatusBroadcastReceiver);
        this.bjy = a.r();
        this.exc = 0;
        this.jyq = new com.bytedance.sdk.component.jpc.jpc("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.tvp.bch.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.mzz.qdl) bch.this).mo.get()) {
                    return;
                }
                bch bchVar = bch.this;
                bchVar.rq = bchVar.rq().lnr();
                bch bchVar2 = bch.this;
                bchVar2.qdl(bchVar2.rq);
                if (bch.this.exc == 0) {
                    bch.this.yt();
                }
                com.bytedance.sdk.openadsdk.core.rdp.lnr().post(bch.this.oth);
            }
        };
        this.oth = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.bch.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.mzz.qdl) bch.this).mo.get() || bch.this.yt == null) {
                    return;
                }
                bch.this.fs();
                bch bchVar = bch.this;
                bch.super.qdl(bchVar.yt);
            }
        };
        if (this.mml == null) {
            return;
        }
        this.jpc = context;
        this.tvp = exuVar.mml();
        this.to = ljhVar;
        this.fs = mzzVar;
        themeStatusBroadcastReceiver.qdl(this);
        yt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jl() {
        com.bytedance.sdk.component.tvp.mo moVar = this.mml;
        if (moVar == null || moVar.getWebView() == null || this.exc == 2) {
            return;
        }
        this.exu = qdl(this.to);
        this.mml.setDisplayZoomControls(false);
        qdl(hzv.qdl(this.exu));
        exu();
        hkc hkcVar = new hkc(this.jpc);
        this.jtx = hkcVar;
        hkcVar.lnr(true);
        rdp();
        this.exc = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yt() {
        if (this.mml.getWebView() == null || !fco.mo()) {
            this.exc = 1;
            fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.bch.3
                @Override // java.lang.Runnable
                public void run() {
                    bch.this.jl();
                }
            });
        } else {
            jl();
        }
        if (!rdp.ud(this.to) || this.ud) {
            return;
        }
        rdp.qdl(this.to);
    }

    public to bjy() {
        return this.aaj;
    }

    public void exu() {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.to;
        if (ljhVar == null || ljhVar.xdk() == null) {
            return;
        }
        this.jl = this.to.xdk();
    }

    public void fs() {
        hkc hkcVar;
        com.bytedance.sdk.component.tvp.mo moVar = this.mml;
        if (moVar == null || moVar.getWebView() == null || (hkcVar = this.jtx) == null) {
            return;
        }
        hkcVar.ud(this.mml).qdl(this.to).lnr(this.to.yre()).mml(this.to.ir()).ud(gy.qdl(this.tvp)).mzz(this.to.htl()).qdl(this).qdl(this.rq).qdl(this.mml).qdl(this.fs);
    }

    public hkc jtx() {
        return this.jtx;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.qdl
    public void onThemeChanged(int i2) {
        if (this.jtx == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i2);
        } catch (JSONException unused) {
        }
        this.jtx.qdl("themeChange", jSONObject);
    }

    public void rdp() {
        com.bytedance.sdk.component.tvp.mo moVar = this.mml;
        if (moVar == null || moVar.getWebView() == null) {
            return;
        }
        this.mml.setBackgroundColor(0);
        this.mml.setBackgroundResource(R.color.transparent);
        qdl(this.mml);
        if (qdl() != null) {
            this.rdp = new com.bytedance.sdk.openadsdk.mml.fs(this.to, qdl().getWebView()).ud(false);
        }
        this.rdp.qdl(this.fs);
        to toVar = new to(this.jpc, this.jtx, this.to, this.rdp, rq());
        this.aaj = toVar;
        this.mml.setWebViewClient(toVar);
        this.mml.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.qdl.mml(this.jtx, this.rdp));
        com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().qdl(this.mml, this.jtx);
    }

    @Override // com.bytedance.sdk.component.adexpress.mzz.qdl
    public void to() {
        super.to();
        com.bytedance.sdk.openadsdk.utils.qdl qdlVar = this.wd;
        if (qdlVar != null) {
            qdlVar.ud(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mzz.qdl
    public void jpc() {
        super.jpc();
        if (this.jtx == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.jtx.qdl("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mzz.qdl, com.bytedance.sdk.component.adexpress.ud.mml
    public int lnr() {
        return this.to.ra();
    }

    @Override // com.bytedance.sdk.component.adexpress.mzz.qdl
    public void mml() {
        if (this.mo.get()) {
            return;
        }
        super.mml();
        hkc hkcVar = this.jtx;
        if (hkcVar != null) {
            hkcVar.lnr();
            this.jtx.fs();
            this.jtx = null;
        }
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.rdp;
        if (fsVar != null) {
            fsVar.mml(false);
        }
        com.bytedance.sdk.openadsdk.core.rdp.lnr().removeCallbacks(this.oth);
        this.bjy.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.mzz.qdl
    public void mo() {
        if (qdl() == null) {
            return;
        }
        try {
            qdl().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mzz.qdl
    public void tvp() {
        super.tvp();
        com.bytedance.sdk.openadsdk.utils.qdl qdlVarMzz = com.bytedance.sdk.openadsdk.core.bjy.qdl().mzz();
        this.wd = qdlVarMzz;
        qdlVarMzz.qdl(this);
    }

    public void ud(int i2) {
        if (this.jtx == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zoom_type", i2);
            this.jtx.qdl("expressAdViewWillZoom", jSONObject);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.WebViewRender", e2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mzz.qdl
    public void wd() {
        hkc hkcVar = this.jtx;
        if (hkcVar == null) {
            return;
        }
        hkcVar.qdl("expressWebviewRecycle", (JSONObject) null);
    }

    public static String qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        return com.bytedance.sdk.component.adexpress.qdl.ud.ud.mml((ljhVar == null || !ljhVar.dps()) ? null : com.smartdigimkt.b0.a.k);
    }

    private void ud(boolean z2) {
        if (this.jtx == null || this.mml == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z2);
            this.jtx.qdl("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mzz.qdl, com.bytedance.sdk.component.adexpress.ud.mml
    public void qdl(com.bytedance.sdk.component.adexpress.ud.wd wdVar) {
        this.yt = wdVar;
        fco.ud(this.jyq);
    }

    private void qdl(com.bytedance.sdk.component.tvp.mo moVar) {
        if (moVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.qdl.lnr.qdl(this.jpc).qdl(false).qdl(moVar.getWebView());
            moVar.setVerticalScrollBarEnabled(false);
            moVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.qdl.lnr.qdl(moVar);
            moVar.rdp();
            moVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.exc.qdl(moVar.getWebView(), BuildConfig.VERSION_CODE));
            moVar.setMixedContentMode(0);
            moVar.setJavaScriptEnabled(true);
            moVar.setJavaScriptCanOpenWindowsAutomatically(true);
            moVar.setDomStorageEnabled(true);
            moVar.setDatabaseEnabled(true);
            moVar.setAllowFileAccess(false);
            moVar.setSupportZoom(true);
            moVar.setBuiltInZoomControls(true);
            moVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            moVar.setUseWideViewPort(true);
            moVar.setCacheMode(-1);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.WebViewRender", e2.toString());
        }
    }

    public static boolean ud(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.mzz.qdl
    public com.bytedance.sdk.component.tvp.mo qdl() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.component.adexpress.mzz.qdl
    public void qdl(int i2) {
        if (i2 == this.mzz) {
            return;
        }
        this.mzz = i2;
        ud(i2 == 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.mzz.qdl, com.bytedance.sdk.component.adexpress.ud.rq
    public void qdl(com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
        super.qdl(rdpVar);
        if (this.lnr) {
            com.bytedance.sdk.component.utils.tvp.ud().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.bch.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = ((com.bytedance.sdk.component.adexpress.mzz.qdl) bch.this).mml.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        hkc hkcVar = this.jtx;
        if (hkcVar != null) {
            hkcVar.qdl(udVar);
        }
    }
}
