package com.bytedance.sdk.openadsdk.tD.Lxb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.Lxb.lc;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.JVA;
import com.bytedance.sdk.openadsdk.core.widget.nBu;
import com.bytedance.sdk.openadsdk.sLN.JXs;
import com.bytedance.sdk.openadsdk.tD.OY;
import com.bytedance.sdk.openadsdk.tD.ebl;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private AtomicBoolean IeN;

    @Nullable
    private JXs JVA;
    private final FrameLayout JXs;
    private final Context LD;
    protected com.bytedance.sdk.component.QAg.ZU Lxb;
    private volatile boolean NXR;
    private String OY;
    private final String QAg;
    private volatile boolean STP;
    private nBu VVE;
    private final int ZU;
    private InterfaceC0118Lxb brP;
    private Ivz ebl;
    private com.bytedance.sdk.openadsdk.core.LD.Lxb kqm;

    @Nullable
    private JVA lc;
    private final tD lk;
    private OY nBu;
    private boolean sLN;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tD.Lxb.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0118Lxb {
        void Lxb();
    }

    public Lxb(Context context, tD tDVar, int i, boolean z, FrameLayout frameLayout) {
        this(context, tDVar, i, z, frameLayout, false);
    }

    public Lxb(Context context, tD tDVar, int i, boolean z, FrameLayout frameLayout, boolean z2) {
        this.sLN = true;
        this.IeN = new AtomicBoolean(false);
        this.LD = context;
        this.lk = tDVar;
        this.ZU = i;
        String strLk = nJ.lk(tDVar.hg().getDurationSlotType());
        this.OY = strLk;
        int iLxb = nJ.Lxb(strLk);
        if (z2) {
            this.OY = nJ.LD(iLxb);
        }
        this.QAg = eK.NXR(tDVar);
        this.JXs = frameLayout;
        Lxb(frameLayout);
        Lxb(iLxb);
        lk(z);
        ebl();
    }

    private void ebl() {
        this.Lxb.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs(kqm.Lxb(), this.ebl, this.lk.bG(), null, true) { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.Lxb.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (Lxb.this.nBu != null) {
                    Lxb.this.nBu.QAg(str);
                }
                if (Lxb.this.sLN) {
                    Lxb.this.Lxb(0, 0);
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), Lxb.this.lk, Lxb.this.OY, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                Lxb.this.sLN = false;
                if (Lxb.this.nBu != null) {
                    Lxb.this.nBu.lc(com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(Lxb.this.lk));
                    Lxb.this.nBu.Lxb(i, str, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    Lxb.this.sLN = false;
                    if (Lxb.this.nBu != null) {
                        Lxb.this.nBu.lc(com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(Lxb.this.lk));
                        Lxb.this.nBu.Lxb(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (Lxb.this.lk.JJ() != null && !TextUtils.isEmpty(Lxb.this.lk.JJ().i)) {
                        if (Lxb.this.nBu != null) {
                            Lxb.this.nBu.nBu(str);
                        }
                        String strNXR = eK.NXR(Lxb.this.lk);
                        WebResourceResponse webResourceResponseLxb = com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(Lxb.this.lk.JJ().i, strNXR, str);
                        if (webResourceResponseLxb == null) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        if (Lxb.this.nBu != null) {
                            Lxb.this.nBu.JVA(str);
                        }
                        return webResourceResponseLxb;
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            @RequiresApi(api = 23)
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (Build.VERSION.SDK_INT >= 23 && webResourceRequest.isForMainFrame()) {
                    Lxb.this.sLN = false;
                    if (Lxb.this.nBu == null || webResourceError == null) {
                        return;
                    }
                    Lxb.this.nBu.lc(com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(Lxb.this.lk));
                    Lxb.this.nBu.Lxb(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }
        });
        this.Lxb.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU(this.ebl) { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.Lxb.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (Lxb.this.lc == null || Lxb.this.lc.getVisibility() != 0) {
                    return;
                }
                Lxb.this.lc.setProgress(i);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.Lxb.lk.Lxb(this.LD).Lxb(false).LD(false).Lxb(this.Lxb.getWebView());
        com.bytedance.sdk.component.QAg.ZU zu = this.Lxb;
        zu.setUserAgentString(com.bytedance.sdk.openadsdk.utils.kqm.Lxb(zu.getWebView(), BuildConfig.VERSION_CODE));
        this.Lxb.setMixedContentMode(0);
    }

    private void lk(boolean z) {
        com.bytedance.sdk.component.Lxb.kqm kqmVarLxb;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BidResponsedEx.KEY_CID, this.lk.bG());
            jSONObject.put("log_extra", this.lk.Lv());
        } catch (Throwable unused) {
        }
        if (QAg.LD().kqm()) {
            ebl.Lxb(new ebl.Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.Lxb.1
                @Override // com.bytedance.sdk.openadsdk.tD.ebl.Lxb
                public void Lxb(String str, String str2, Throwable th) {
                    sLN.Lxb(str, str2, th);
                }
            });
        }
        OY oyLxb = OY.Lxb(kqm.Lxb(), this.Lxb.getWebView(), new com.bytedance.sdk.openadsdk.tD.lk() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.Lxb.2
            @Override // com.bytedance.sdk.openadsdk.tD.lk
            public void Lxb(String str, JSONObject jSONObject2) {
                if (Lxb.this.ebl != null) {
                    Lxb.this.ebl.Lxb(str, jSONObject2);
                }
            }
        }, new com.bytedance.sdk.openadsdk.tD.Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.Lxb.3
            @Override // com.bytedance.sdk.openadsdk.tD.Lxb
            public void LD() {
                Lxb.this.ebl.lk(true);
                if (Lxb.this.JVA != null) {
                    Lxb.this.JVA.Lxb();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tD.Lxb
            public com.bytedance.sdk.openadsdk.tD.ZU Lxb() {
                String strLc = com.bytedance.sdk.openadsdk.common.LD.lc();
                strLc.getClass();
                switch (strLc) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tD.Lxb
            public void Lxb(JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("is_new_playable", 1);
                    if (Lxb.this.lk.FA()) {
                        jSONObject3.put("is_pre_render", 1);
                    }
                    jSONObject2.put("pag_json_data", jSONObject3.toString());
                } catch (JSONException e) {
                    sLN.Lxb("PlayableManager", e.getMessage());
                }
                com.bytedance.sdk.openadsdk.ZU.lk.LD(Lxb.this.lk, Lxb.this.OY, "playable_track", jSONObject2);
            }

            @Override // com.bytedance.sdk.openadsdk.tD.Lxb
            public void Lxb(int i, String str) {
                Lxb.this.sLN = false;
                if (i == 2 || i == 3 || i == 4) {
                    Lxb.this.Lxb(2, i);
                } else if (i == 5) {
                    Lxb.this.Lxb(3, i);
                } else {
                    Lxb.this.Lxb(1, 0);
                }
            }
        });
        this.nBu = oyLxb;
        oyLxb.ebl(this.QAg).JXs(com.bytedance.sdk.openadsdk.common.LD.Lxb(kqm.Lxb())).LD(com.bytedance.sdk.openadsdk.common.LD.JXs()).Lxb(com.bytedance.sdk.openadsdk.common.LD.Lxb()).ZU(com.bytedance.sdk.openadsdk.common.LD.ZU()).lk(jSONObject).lk(eK.JVA(this.lk)).ZU(true).Lxb(z).lk(false).Lxb(eK.DY(this.lk)).LD(eK.DY(this.lk)).Lxb("sdkEdition", com.bytedance.sdk.openadsdk.common.LD.lk()).JXs(eK.lc(this.lk)).lc(this.OY);
        this.nBu.Lxb(com.bytedance.sdk.openadsdk.tD.JXs.LD(this.LD));
        Set<String> setJVA = this.nBu.JVA();
        final WeakReference weakReference = new WeakReference(this.nBu);
        for (String str : setJVA) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (kqmVarLxb = this.ebl.Lxb()) != null) {
                kqmVarLxb.Lxb(str, new com.bytedance.sdk.component.Lxb.JXs<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.Lxb.4
                    @Override // com.bytedance.sdk.component.Lxb.JXs
                    public JSONObject Lxb(@NonNull JSONObject jSONObject2, @NonNull lc lcVar) {
                        try {
                            OY oy = (OY) weakReference.get();
                            if (oy == null) {
                                return null;
                            }
                            return oy.ZU(Lxb(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    public boolean JXs() {
        return this.NXR;
    }

    public void LD() {
        OY oy;
        if (!this.IeN.get() || (oy = this.nBu) == null) {
            return;
        }
        oy.lk(true);
    }

    public void ZU() {
        OY oy = this.nBu;
        if (oy != null) {
            oy.nJ();
        }
        com.bytedance.sdk.component.QAg.ZU zu = this.Lxb;
        if (zu != null) {
            zu.sLN();
        }
        Ivz ivz = this.ebl;
        if (ivz != null) {
            ivz.JVA();
        }
        this.Lxb = null;
    }

    public boolean lc() {
        Ivz ivz = this.ebl;
        if (ivz != null) {
            return ivz.JXs();
        }
        return false;
    }

    public static void Lxb(tD tDVar, JSONObject jSONObject) {
        if (jSONObject == null || tDVar == null || !eK.LD(tDVar) || !tDVar.II()) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_new_playable", 1);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    public void LD(boolean z) {
        OY oy = this.nBu;
        if (oy != null) {
            oy.JXs(z);
        }
    }

    private void Lxb(FrameLayout frameLayout) {
        com.bytedance.sdk.component.QAg.ZU zu = new com.bytedance.sdk.component.QAg.ZU(this.LD);
        this.Lxb = zu;
        zu.f_();
        this.Lxb.setLayerType(2, null);
        this.Lxb.setVisibility(4);
        this.Lxb.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.Lxb.setEnabled(true);
        this.Lxb.setTag(this.OY);
        this.Lxb.setMaterialMeta(this.lk.Bg());
        this.Lxb.setLandingPage(true);
        frameLayout.addView(this.Lxb, new FrameLayout.LayoutParams(-1, -1));
        nBu nbu = new nBu(this.LD);
        this.VVE = nbu;
        nbu.Lxb(this.lk, this.OY, this.kqm);
        frameLayout.addView(this.VVE, new FrameLayout.LayoutParams(-1, -1));
        if (this.lk.mOF()) {
            JVA jva = new JVA(this.LD);
            this.lc = jva;
            jva.LD();
            frameLayout.addView(this.lc, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private void Lxb(int i) {
        HashMap map = new HashMap();
        map.put("click_scence", 3);
        this.ebl = new Ivz(this.LD);
        this.ebl.LD(this.Lxb).Lxb(this.lk).lk(this.lk.bG()).ZU(this.lk.Lv()).LD(i).JXs(this.lk.cf()).Lxb(this.Lxb).LD(this.OY).Lxb(map).Lxb(new com.bytedance.sdk.openadsdk.ZU.kqm(3, this.OY, this.lk));
    }

    public void lk() {
        OY oy;
        if (!this.IeN.get() || (oy = this.nBu) == null) {
            return;
        }
        oy.lk(false);
    }

    public void Lxb(boolean z, JXs jXs) {
        this.JVA = jXs;
        this.nBu.LD(z);
        com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().LD(this.lk);
        this.Lxb.a_(this.QAg);
        OY oy = this.nBu;
        if (oy != null) {
            oy.lc(com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(this.lk));
            this.nBu.OY(this.QAg);
        }
    }

    public void Lxb() {
        boolean z;
        JVA jva;
        if (this.IeN.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.JXs;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (!this.STP && (jva = this.lc) != null) {
            jva.LD(this.lk, this.ZU);
            OY oy = this.nBu;
            if (oy != null) {
                oy.Ivz();
            }
            z = true;
        } else {
            this.nBu.lk(true);
            z = false;
        }
        if (this.nBu != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("webview_state", this.nBu.rW());
                jSONObject2.put("has_loading", z);
                jSONObject2.put("is_new_playable", 1);
                jSONObject.put("pag_json_data", jSONObject2.toString());
                jSONObject.put("playable_event", "start_show_plb");
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.ZU.lk.LD(this.lk, this.OY, "playable_track", jSONObject);
            this.nBu.lc(com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(this.lk));
        }
        this.Lxb.setVisibility(0);
    }

    public void Lxb(final int i, final int i2) {
        OY oy;
        InterfaceC0118Lxb interfaceC0118Lxb;
        if (this.STP) {
            return;
        }
        this.STP = true;
        if (i == 2) {
            this.NXR = true;
            this.nBu.Lxb(3);
        } else if (i == 1) {
            this.NXR = true;
            this.nBu.Lxb(2);
        } else if (i == 3) {
            this.NXR = true;
            this.nBu.Lxb(4);
        } else if (i == 0) {
            this.nBu.Lxb(1);
        }
        if (this.NXR && (interfaceC0118Lxb = this.brP) != null) {
            interfaceC0118Lxb.Lxb();
        }
        if (this.IeN.get() && (oy = this.nBu) != null) {
            oy.lk(true);
        }
        JVA jva = this.lc;
        if (jva != null) {
            jva.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.Lxb.7
                @Override // java.lang.Runnable
                public void run() {
                    if (Lxb.this.NXR) {
                        Lxb.this.VVE.setVisibility(0);
                        Lxb.this.Lxb(true);
                    }
                    Lxb.this.lc.lk();
                    if (Lxb.this.IeN.get()) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("remove_loading_page_type", i);
                            jSONObject2.put("remove_loading_page_reason", i2);
                            jSONObject2.put("playable_url", Lxb.this.QAg);
                            jSONObject2.put("duration", Lxb.this.lc.getDisplayDuration());
                            jSONObject2.put("is_new_playable", 1);
                            jSONObject.put("pag_json_data", jSONObject2.toString());
                            jSONObject.put("playable_event", "remove_loading_page");
                        } catch (Throwable unused) {
                        }
                        com.bytedance.sdk.openadsdk.ZU.lk.LD(Lxb.this.lk, Lxb.this.OY, "playable_track", jSONObject);
                    }
                }
            });
        }
    }

    public void Lxb(boolean z) {
        OY oy = this.nBu;
        if (oy != null) {
            oy.Lxb(z);
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.LD.Lxb lxb) {
        this.kqm = lxb;
        JVA jva = this.lc;
        if (jva != null && jva.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.JXs.OY downloadButton = this.lc.getDownloadButton();
            downloadButton.setOnClickListener(lxb);
            downloadButton.setOnTouchListener(lxb);
        }
        nBu nbu = this.VVE;
        if (nbu != null) {
            nbu.setClickListener(lxb);
        }
    }

    public void Lxb(InterfaceC0118Lxb interfaceC0118Lxb) {
        this.brP = interfaceC0118Lxb;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld) {
        Ivz ivz = this.ebl;
        if (ivz != null) {
            ivz.Lxb(ld);
        }
    }
}
