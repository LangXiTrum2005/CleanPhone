package com.bytedance.sdk.openadsdk.core.OY;

import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.bytedance.sdk.openadsdk.utils.xan;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class eK extends com.bytedance.sdk.component.adexpress.JXs.Lxb {
    private final com.bytedance.sdk.component.OY.OY DY;
    private Ivz IeN;
    private com.bytedance.sdk.openadsdk.ZU.ZU.JXs JVA;
    private com.bytedance.sdk.openadsdk.ZU.JVA NXR;
    private String OY;
    private com.bytedance.sdk.openadsdk.core.model.tD QAg;
    private final Map<String, com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc> STP;
    private final Runnable Sfi;
    private com.bytedance.sdk.component.adexpress.LD.ebl VVE;
    private volatile int brP;
    private Context ebl;
    private com.bytedance.sdk.openadsdk.core.model.tD.Lxb kqm;
    com.bytedance.sdk.openadsdk.utils.Lxb lc;
    private JSONObject nBu;
    private String sLN;
    private nBu tD;

    public eK(Context context, com.bytedance.sdk.component.adexpress.LD.NXR nxr, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        super(context, nxr, themeStatusBroadcastReceiver);
        this.STP = Collections.synchronizedMap(new HashMap());
        this.brP = 0;
        this.DY = new com.bytedance.sdk.component.OY.OY("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.OY.eK.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.JXs.Lxb) eK.this).JXs.get()) {
                    return;
                }
                if ((eK.this.QAg instanceof com.bytedance.sdk.openadsdk.core.model.DY) && ((com.bytedance.sdk.openadsdk.core.model.DY) eK.this.QAg).JW()) {
                    eK.this.LD(true);
                }
                eK eKVar = eK.this;
                eKVar.nBu = eKVar.JVA().lk();
                eK eKVar2 = eK.this;
                eKVar2.Lxb(eKVar2.nBu);
                if (eK.this.brP == 0) {
                    eK.this.kqm();
                }
                com.bytedance.sdk.openadsdk.core.STP.lk().post(eK.this.Sfi);
            }
        };
        this.Sfi = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.eK.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.JXs.Lxb) eK.this).JXs.get() || eK.this.VVE == null) {
                    return;
                }
                eK.this.sLN();
                eK eKVar = eK.this;
                eK.super.Lxb(eKVar.VVE);
            }
        };
        if (this.lk == null) {
            return;
        }
        this.ebl = context;
        this.OY = nxr.ZU();
        this.QAg = tDVar;
        this.JVA = jXs;
        themeStatusBroadcastReceiver.Lxb(this);
        kqm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void brP() {
        com.bytedance.sdk.component.QAg.ZU zu = this.lk;
        if (zu == null || zu.getWebView() == null || this.brP == 2) {
            return;
        }
        this.sLN = Lxb(this.QAg);
        this.lk.setDisplayZoomControls(false);
        Lxb(xan.Lxb(this.sLN));
        NXR();
        Ivz ivz = new Ivz(this.ebl);
        this.IeN = ivz;
        ivz.ZU(true);
        STP();
        this.brP = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kqm() {
        if (this.lk.getWebView() != null && hg.JXs()) {
            brP();
        } else {
            this.brP = 1;
            hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.eK.3
                @Override // java.lang.Runnable
                public void run() {
                    eK.this.brP();
                }
            });
        }
    }

    public nBu IeN() {
        return this.tD;
    }

    public void NXR() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.QAg;
        if (tDVar == null || tDVar.rW() == null) {
            return;
        }
        this.kqm = this.QAg.rW();
    }

    public void STP() {
        com.bytedance.sdk.component.QAg.ZU zu = this.lk;
        if (zu == null || zu.getWebView() == null) {
            return;
        }
        this.lk.setBackgroundColor(0);
        this.lk.setBackgroundResource(R.color.transparent);
        Lxb(this.lk);
        if (Lxb() != null) {
            this.NXR = new com.bytedance.sdk.openadsdk.ZU.JVA(this.QAg, Lxb().getWebView()).Lxb(false);
        }
        this.NXR.Lxb(this.JVA);
        nBu nbu = new nBu(this.ebl, this.IeN, this.QAg, this.NXR, JVA());
        this.tD = nbu;
        this.lk.setWebViewClient(nbu);
        this.lk.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU(this.IeN, this.NXR));
        com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().Lxb(this.lk, this.IeN);
    }

    public Ivz VVE() {
        return this.IeN;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.Lxb
    public void onThemeChanged(int i) {
        if (this.IeN == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i);
        } catch (JSONException unused) {
        }
        this.IeN.Lxb("themeChange", jSONObject);
    }

    public void sLN() {
        Ivz ivz;
        com.bytedance.sdk.component.QAg.ZU zu = this.lk;
        if (zu == null || zu.getWebView() == null || (ivz = this.IeN) == null) {
            return;
        }
        ivz.LD(this.lk).Lxb(this.QAg).lk(this.QAg.bG()).ZU(this.QAg.Lv()).LD(nJ.Lxb(this.OY)).JXs(this.QAg.cf()).Lxb(this).Lxb(this.nBu).Lxb(this.lk).Lxb(this.JVA);
    }

    public void LD(int i) {
        if (this.IeN == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zoom_type", i);
            this.IeN.Lxb("expressAdViewWillZoom", jSONObject);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.WebViewRender", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.Lxb
    public void OY() {
        super.OY();
        if (this.IeN == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.IeN.Lxb("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.Lxb
    public void QAg() {
        super.QAg();
        com.bytedance.sdk.openadsdk.utils.Lxb lxbJXs = com.bytedance.sdk.openadsdk.core.IeN.Lxb().JXs();
        this.lc = lxbJXs;
        lxbJXs.Lxb(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.Lxb
    public void ZU() {
        if (this.JXs.get()) {
            return;
        }
        super.ZU();
        Ivz ivz = this.IeN;
        if (ivz != null) {
            ivz.LD();
            this.IeN.JVA();
            this.IeN = null;
        }
        com.bytedance.sdk.openadsdk.ZU.JVA jva = this.NXR;
        if (jva != null) {
            jva.lk(false);
        }
        com.bytedance.sdk.openadsdk.core.STP.lk().removeCallbacks(this.Sfi);
        this.STP.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.Lxb
    public void ebl() {
        Ivz ivz = this.IeN;
        if (ivz == null) {
            return;
        }
        ivz.Lxb("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.Lxb
    public void lc() {
        if (Lxb() == null) {
            return;
        }
        try {
            Lxb().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.Lxb, com.bytedance.sdk.component.adexpress.LD.ZU
    public int lk() {
        return this.QAg.id();
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.Lxb
    public void nBu() {
        super.nBu();
        com.bytedance.sdk.openadsdk.utils.Lxb lxb = this.lc;
        if (lxb != null) {
            lxb.LD(this);
        }
    }

    private void lk(boolean z) {
        if (this.IeN == null || this.lk == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z);
            this.IeN.Lxb("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static String Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        return com.bytedance.sdk.component.adexpress.Lxb.LD.LD.ZU((tDVar == null || !tDVar.Pw()) ? null : "v3");
    }

    public static boolean LD(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.Lxb, com.bytedance.sdk.component.adexpress.LD.ZU
    public void Lxb(com.bytedance.sdk.component.adexpress.LD.ebl eblVar) {
        this.VVE = eblVar;
        hg.LD(this.DY);
    }

    private void Lxb(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.Lxb.lk.Lxb(this.ebl).Lxb(false).Lxb(zu.getWebView());
            zu.setVerticalScrollBarEnabled(false);
            zu.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.Lxb.lk.Lxb(zu);
            zu.nBu();
            zu.setUserAgentString(com.bytedance.sdk.openadsdk.utils.kqm.Lxb(zu.getWebView(), BuildConfig.VERSION_CODE));
            zu.setMixedContentMode(0);
            zu.setJavaScriptEnabled(true);
            zu.setJavaScriptCanOpenWindowsAutomatically(true);
            zu.setDomStorageEnabled(true);
            zu.setDatabaseEnabled(true);
            zu.setAllowFileAccess(false);
            zu.setSupportZoom(true);
            zu.setBuiltInZoomControls(true);
            zu.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            zu.setUseWideViewPort(true);
            zu.setCacheMode(-1);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.WebViewRender", e.toString());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.Lxb
    public com.bytedance.sdk.component.QAg.ZU Lxb() {
        return this.lk;
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.Lxb
    public void Lxb(int i) {
        if (i == this.ZU) {
            return;
        }
        this.ZU = i;
        lk(i == 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.Lxb, com.bytedance.sdk.component.adexpress.LD.JVA
    public void Lxb(com.bytedance.sdk.component.adexpress.LD.STP stp) {
        super.Lxb(stp);
        if (this.LD) {
            com.bytedance.sdk.component.utils.ebl.LD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.eK.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = ((com.bytedance.sdk.component.adexpress.JXs.Lxb) eK.this).lk.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }
}
