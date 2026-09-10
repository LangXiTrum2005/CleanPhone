package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.hg;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class brP implements com.bytedance.sdk.openadsdk.sLN.ebl {
    private com.bytedance.sdk.openadsdk.common.NXR CG;
    private View CSn;
    private boolean FD;
    private boolean HD;
    private int IeN;
    private boolean JJ;

    @NonNull
    private final com.bytedance.sdk.openadsdk.core.model.tD JVA;
    com.bytedance.sdk.openadsdk.ZU.JVA JXs;
    private long KPU;
    Ivz LD;
    private com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.Lxb LXE;
    private int Ld;
    private String Lpq;
    Ivz Lxb;
    private boolean NDz;
    private int NXR;
    private ILoader Ns;
    protected com.bytedance.sdk.openadsdk.ZU.ZU.JXs OY;
    private boolean Pw;
    private boolean SS;
    private final boolean STP;
    private boolean Sfi;
    private int VVE;
    protected String ZU;
    private View aH;
    private String ae;
    private com.bytedance.sdk.component.QAg.ZU brP;
    private boolean dR;
    private boolean eK;
    private float foI;
    private float id;
    private com.bytedance.sdk.component.QAg.ZU kqm;
    private final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb le;
    private boolean nJ;
    private com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs rW;
    private final String sLN;
    private long sRq;
    private com.bytedance.sdk.openadsdk.common.ZU wbY;
    private boolean xr;
    protected boolean lk = true;
    private boolean tD = false;
    private final AtomicBoolean DY = new AtomicBoolean(true);
    int lc = 0;
    String ebl = "";
    boolean QAg = false;
    private SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> Ivz = new SparseArray<>();
    private boolean nE = true;
    private float xan = -1.0f;
    private float hg = -1.0f;
    private boolean BcA = false;
    private long VU = -1;
    private volatile int Of = 0;
    private int JZE = -1;
    private volatile int Sv = 0;
    private volatile int uxf = 0;
    private long Nu = 0;
    public boolean nBu = false;
    private int bG = -1;

    public static class LD implements com.bytedance.sdk.openadsdk.sLN.Lxb {
        private final View Lxb;

        public LD(View view) {
            this.Lxb = view;
        }

        @Override // com.bytedance.sdk.openadsdk.sLN.Lxb
        public int LD() {
            View view = this.Lxb;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            return measuredWidth <= 0 ? le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb()) : measuredWidth;
        }

        @Override // com.bytedance.sdk.openadsdk.sLN.Lxb
        public int Lxb() {
            View view = this.Lxb;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            return measuredHeight <= 0 ? le.ZU(com.bytedance.sdk.openadsdk.core.kqm.Lxb()) : measuredHeight;
        }
    }

    public interface ZU {
        void Lxb(WebView webView, int i);

        void Lxb(WebView webView, String str);

        void Lxb(WebView webView, String str, Bitmap bitmap);
    }

    public static class lk implements com.bytedance.sdk.openadsdk.sLN.QAg {
        private final com.bytedance.sdk.component.QAg.ZU Lxb;

        @Override // com.bytedance.sdk.openadsdk.sLN.QAg
        public void LD() {
            com.bytedance.sdk.component.QAg.ZU zu = this.Lxb;
            if (zu == null) {
                return;
            }
            zu.STP();
        }

        @Override // com.bytedance.sdk.openadsdk.sLN.QAg
        public void Lxb() {
            com.bytedance.sdk.component.QAg.ZU zu = this.Lxb;
            if (zu == null) {
                return;
            }
            zu.JVA();
        }

        private lk(com.bytedance.sdk.component.QAg.ZU zu) {
            this.Lxb = zu;
        }
    }

    public brP(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        this.le = lxb;
        this.JVA = lxb.LD;
        this.sLN = lxb.JXs;
        this.STP = lxb.ZU;
    }

    private com.bytedance.sdk.openadsdk.ZU.ZU.JXs Of() {
        return new com.bytedance.sdk.openadsdk.ZU.kqm(eK.ebl(this.JVA) ? 3 : 2, this.STP ? "rewarded_video" : "fullscreen_interstitial_ad", this.JVA);
    }

    public static /* synthetic */ int STP(brP brp) {
        int i = brp.Sv;
        brp.Sv = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void VU() {
        this.Pw = true;
        this.xr = false;
        this.le.JJ.removeMessages(600);
        this.le.JJ.removeMessages(TypedValues.TransitionType.TYPE_DURATION);
        this.le.JJ.removeMessages(TypedValues.Custom.TYPE_INT);
        this.le.nJ.ZU(false);
        this.le.tD.set(true);
        this.le.bG.IeN();
        this.JVA.wVL();
        if (this.JVA.wVL() || !nJ.OY(eK.Lxb(this.JVA))) {
            return;
        }
        View viewNBu = this.le.BcA.nBu();
        View.OnClickListener onClickListener = (View.OnClickListener) viewNBu.getTag(viewNBu.getId());
        if (onClickListener != null) {
            Lxb lxb = new Lxb(this.le, viewNBu, onClickListener);
            viewNBu.setOnClickListener(lxb);
            viewNBu.setOnTouchListener(lxb);
        }
    }

    public static /* synthetic */ int VVE(brP brp) {
        int i = brp.uxf;
        brp.uxf = i + 1;
        return i;
    }

    public static /* synthetic */ int kqm(brP brp) {
        int i = brp.Of;
        brp.Of = i + 1;
        return i;
    }

    private void sRq() {
        this.LD.Lxb("showPlayableEndCardOverlay", (JSONObject) null);
        this.le.JJ.sendEmptyMessageDelayed(600, 1000L);
        this.le.JJ.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.5
            @Override // java.lang.Runnable
            public void run() {
                brP.this.VU();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.sLN sln = this.le.MGT;
        if (sln != null) {
            sln.Lxb(0L);
        }
    }

    public boolean BcA() {
        return this.Sfi && this.DY.get();
    }

    public boolean CG() {
        Ivz ivz = this.Lxb;
        if (ivz == null) {
            return false;
        }
        return ivz.OY();
    }

    public boolean JJ() {
        return this.nBu;
    }

    public boolean NDz() {
        return this.Pw;
    }

    public boolean Pw() {
        com.bytedance.sdk.component.QAg.ZU zu = this.kqm;
        return zu == null || zu.getWebView() == null;
    }

    public void dR() {
        com.bytedance.sdk.openadsdk.ZU.JVA jva = this.JXs;
        if (jva != null) {
            jva.JXs();
        }
    }

    public void le() {
        le.Lxb((View) this.brP, 8);
    }

    public void nJ() {
        le.Lxb((View) this.kqm, 0);
        le.Lxb((View) this.brP, 8);
    }

    public boolean rW() {
        return this.xr;
    }

    public String CSn() {
        return this.ZU;
    }

    public void DY() {
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.OY;
        if (jXs != null) {
            jXs.QAg();
        }
        com.bytedance.sdk.openadsdk.ZU.JVA jva = this.JXs;
        if (jva != null) {
            jva.OY();
        }
    }

    public void HD() {
        com.bytedance.sdk.component.QAg.ZU zu = this.kqm;
        if (zu != null) {
            zu.QAg();
        }
        com.bytedance.sdk.component.QAg.ZU zu2 = this.brP;
        if (zu2 != null) {
            zu2.QAg();
        }
        if (this.VU == 0) {
            this.VU = SystemClock.elapsedRealtime();
        }
        Ivz ivz = this.Lxb;
        if (ivz != null) {
            ivz.nBu();
            com.bytedance.sdk.component.QAg.ZU zu3 = this.kqm;
            if (zu3 != null) {
                if (zu3.getVisibility() == 0) {
                    this.Lxb.LD(true);
                    LD(this.Lxb, true);
                    Lxb(this.Lxb, false, true);
                    if (eK.nBu(this.JVA) && !this.Pw && this.le.LD.wVL()) {
                        QAg();
                    }
                } else {
                    this.Lxb.LD(false);
                    LD(this.Lxb, false);
                    Lxb(this.Lxb, true, false);
                }
            }
        }
        if (this.LD != null && eK.OY(this.JVA)) {
            this.LD.nBu();
            com.bytedance.sdk.component.QAg.ZU zu4 = this.brP;
            if (zu4 != null) {
                if (zu4.getVisibility() == 0) {
                    this.LD.LD(true);
                    LD(this.LD, true);
                    Lxb(this.LD, false, true);
                    if (!this.Pw && this.le.LD.wVL()) {
                        sRq();
                    }
                } else {
                    this.LD.LD(false);
                    LD(this.LD, false);
                    Lxb(this.LD, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.ZU.JVA jva = this.JXs;
        if (jva != null) {
            jva.ebl();
        }
    }

    public void IeN() {
        KG kgJJ;
        if (eK.JXs(this.JVA)) {
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.JVA;
            if (tDVar != null && (kgJJ = tDVar.JJ()) != null) {
                this.ZU = kgJJ.h;
            }
        } else {
            this.ZU = eK.NXR(this.JVA);
        }
        String strLxb = Lxb(this.ZU, this.JVA, this.NXR, this.VVE, this.IeN);
        this.ZU = strLxb;
        if (TextUtils.isEmpty(strLxb)) {
            return;
        }
        this.dR = this.ZU.contains("use_second_endcard=1");
    }

    public void Ivz() {
        com.bytedance.sdk.openadsdk.ZU.JVA jva = this.JXs;
        if (jva != null) {
            jva.Lxb(System.currentTimeMillis());
        }
    }

    public com.bytedance.sdk.component.QAg.ZU JVA() {
        return this.brP;
    }

    public void KPU() {
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.OY;
        if (jXs != null) {
            jXs.ebl();
        }
    }

    public Ivz NXR() {
        return this.LD;
    }

    public void QAg() {
        this.Lxb.Lxb("showPlayableEndCardOverlay", (JSONObject) null);
        this.le.JJ.sendEmptyMessageDelayed(600, 1000L);
        this.le.JJ.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.6
            @Override // java.lang.Runnable
            public void run() {
                brP.this.VU();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.sLN sln = this.le.MGT;
        if (sln != null) {
            sln.Lxb(0L);
        }
    }

    public com.bytedance.sdk.openadsdk.ZU.JVA STP() {
        return this.JXs;
    }

    public void Sfi() {
        com.bytedance.sdk.component.QAg.ZU zu = this.kqm;
        if (zu != null) {
            zu.JVA();
        }
        com.bytedance.sdk.component.QAg.ZU zu2 = this.brP;
        if (zu2 != null) {
            zu2.JVA();
        }
        if (this.VU > 0) {
            this.sRq = (SystemClock.elapsedRealtime() - this.VU) + this.sRq;
            this.VU = 0L;
        }
        Ivz ivz = this.Lxb;
        if (ivz != null) {
            ivz.LD(false);
            LD(this.Lxb, false);
            Lxb(this.Lxb, true, false);
        }
        if (this.LD == null || !eK.OY(this.JVA)) {
            return;
        }
        this.LD.LD(false);
        LD(this.LD, false);
        Lxb(this.LD, true, false);
    }

    public void VVE() {
        com.bytedance.sdk.component.QAg.ZU zu = this.kqm;
        if (zu != null) {
            hg.Lxb(zu.getWebView());
        }
        com.bytedance.sdk.component.QAg.ZU zu2 = this.brP;
        if (zu2 != null) {
            hg.Lxb(zu2.getWebView());
        }
        long j = this.sRq;
        if (j > 0) {
            if (this.VU > 0) {
                this.sRq = (SystemClock.elapsedRealtime() - this.VU) + j;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", com.bytedance.sdk.openadsdk.core.model.tD.lk(this.JVA) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.le.LD, this.sLN, "second_endcard_duration", jSONObject, this.sRq);
        }
        this.kqm = null;
        if (this.OY != null && !com.bytedance.sdk.openadsdk.core.model.kqm.ZU(this.JVA) && !com.bytedance.sdk.openadsdk.core.model.kqm.JXs(this.JVA) && !com.bytedance.sdk.openadsdk.core.model.tD.lk(this.JVA)) {
            this.OY.Lxb(true);
            this.OY.sLN();
        }
        Ivz ivz = this.Lxb;
        if (ivz != null) {
            ivz.JVA();
        }
        Ivz ivz2 = this.LD;
        if (ivz2 != null) {
            ivz2.JVA();
        }
        com.bytedance.sdk.openadsdk.ZU.JVA jva = this.JXs;
        if (jva != null) {
            jva.lk(this.JVA.le() || eK.ebl(this.JVA));
        }
        DeviceUtils.AudioInfoReceiver.LD(this);
    }

    public String aH() {
        return this.ebl;
    }

    public boolean brP() {
        return this.DY.get();
    }

    public int eK() {
        return this.lc;
    }

    public void foI() {
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.OY;
        if (jXs != null) {
            jXs.OY();
        }
    }

    public void hg() {
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.OY;
        if (jXs != null) {
            jXs.nBu();
        }
    }

    public boolean id() {
        if (com.bytedance.sdk.openadsdk.core.model.tD.lk(this.JVA)) {
            return this.dR && !this.NDz && this.le.CG.sLN();
        }
        return this.dR && !this.NDz && this.DY.get() && this.Sfi;
    }

    public boolean kqm() {
        String str = this.ZU;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public com.bytedance.sdk.component.QAg.ZU nBu() {
        return this.kqm;
    }

    public boolean nE() {
        return this.QAg;
    }

    public Ivz sLN() {
        return this.Lxb;
    }

    public boolean tD() {
        return this.Sfi;
    }

    public void xan() {
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.OY;
        if (jXs != null) {
            jXs.lk();
            this.OY.ZU();
        }
    }

    public void JXs() {
        if (eK.JXs(this.JVA)) {
            return;
        }
        lc();
    }

    public void OY() {
        if (this.kqm == null) {
            return;
        }
        this.DY.set(this.HD);
        if (this.brP.getVisibility() == 0 && this.HD) {
            sRq();
            return;
        }
        this.le.nJ.lk(false);
        this.le.CSn.ebl(OY.lk);
        Lxb(this.Lxb, true, false);
        LD(this.Lxb, false);
        Lxb(this.Lxb, false);
        this.kqm.sLN();
        if (this.HD) {
            this.brP.setVisibility(0);
            Lxb(this.LD, this.le.Of, true);
            LD(this.LD, true);
            Lxb(this.LD, true);
            this.le.JJ.removeMessages(600);
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.le;
            if (!lxb.le.lk(lxb.bG)) {
                this.le.bG.aH();
            }
        } else {
            if (this.le.CSn.Lxb()) {
                this.le.CSn.Lxb(5);
            }
            this.le.le.ZU();
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.le;
            lxb2.MGT.Lxb(lxb2.OY);
        }
        this.xr = true;
    }

    public void ebl() {
        KG kgJJ = this.JVA.JJ();
        if (kgJJ == null) {
            return;
        }
        String str = kgJJ.h;
        this.ae = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.ae = Lxb(this.ae, this.JVA, this.NXR, this.VVE, this.IeN);
        this.brP.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), this.LD, this.JVA.bG(), this.JXs, this.JVA.le() || eK.ebl(this.JVA)) { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = brP.this.OY;
                if (jXs != null) {
                    jXs.lc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                super.onPageStarted(webView, str2, bitmap);
                com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = brP.this.OY;
                if (jXs != null) {
                    jXs.JXs();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str2, String str3) {
                if (brP.this.Lxb(str3)) {
                    return;
                }
                brP.this.HD = false;
                brP brp = brP.this;
                brp.lc = i;
                brp.ebl = str2;
                if (brp.OY != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (Build.VERSION.SDK_INT >= 23) {
                            jSONObject.put("code", i);
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str2);
                        }
                        brP.this.OY.Lxb(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                super.onReceivedError(webView, i, str2, str3);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            @TargetApi(21)
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    brP.this.HD = false;
                    if (webResourceResponse != null) {
                        brP.this.lc = webResourceResponse.getStatusCode();
                        brP.this.ebl = "onReceivedHttpError";
                    }
                }
                if (brP.this.OY != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (webResourceResponse != null) {
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                        }
                        brP.this.OY.Lxb(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                if (webResourceRequest != null) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            @TargetApi(23)
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !brP.this.Lxb(webResourceRequest.getUrl().toString())) {
                    brP.this.HD = false;
                    if (brP.this.OY != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (Build.VERSION.SDK_INT >= 23 && webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                            }
                            brP.this.OY.Lxb(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    if (webResourceError != null) {
                        brP.this.lc = webResourceError.getErrorCode();
                        brP.this.ebl = String.valueOf(webResourceError.getDescription());
                    }
                    if (webResourceRequest == null) {
                        return;
                    }
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                }
            }
        });
        this.brP.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU(this.LD, this.JXs) { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (!brP.this.le.ebl || brP.this.le.ae == null) {
                    return;
                }
                brP.this.le.ae.Lxb(webView, i, brP.this.LXE);
            }
        });
        com.bytedance.sdk.openadsdk.utils.tD.Lxb(this.brP, this.ae);
        this.HD = true;
    }

    public void lc() {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.tD.Lxb(this.le.NDz, this.JVA))) {
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.JVA;
            if (tDVar != null && !tDVar.cFD() && this.Ns == null && kqm()) {
                this.Lpq = this.JVA.oc();
                this.Ns = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().LD();
                int iLxb = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(this.Ns, this.Lpq);
                this.Ld = iLxb;
                this.JZE = iLxb > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.Lpq)) {
                    com.bytedance.sdk.openadsdk.ZU.JVA jva = this.JXs;
                    if (jva != null) {
                        jva.Lxb(this.JZE);
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(this.Nu, this.JVA, "landingpage_endcard", this.Ns, this.Lpq);
                }
            }
            if ((TextUtils.isEmpty(this.ZU) || !this.ZU.contains("play.google.com/store")) && !com.bytedance.sdk.openadsdk.core.model.kqm.lc(this.JVA) && !com.bytedance.sdk.openadsdk.core.model.kqm.JXs(this.JVA)) {
                if (this.lk) {
                    if (this.kqm != null && !TextUtils.isEmpty(this.ZU) && com.bytedance.sdk.openadsdk.core.model.tD.LD(this.JVA)) {
                        if (this.FD) {
                            return;
                        }
                        String strM = DM.m(new StringBuilder(), this.ZU, "&is_pre_render=1");
                        com.bytedance.sdk.openadsdk.ZU.JVA jva2 = this.JXs;
                        if (jva2 != null) {
                            jva2.ZU();
                        }
                        if (eK.ebl(this.JVA)) {
                            com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().LD(this.JVA);
                        }
                        com.bytedance.sdk.openadsdk.utils.tD.Lxb(this.kqm, strM);
                        this.le.CSn.Lxb(strM);
                        this.FD = true;
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.tD.lk(this.JVA)) {
                        this.le.CG.lk();
                        return;
                    }
                    return;
                }
                return;
            }
            this.QAg = true;
        }
    }

    public void LD() {
        com.bytedance.sdk.openadsdk.common.NXR nxr;
        this.aH = this.le.Pw.findViewById(R.id.content);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.le;
        boolean z = lxb.ebl;
        this.nJ = z;
        if (z && (nxr = this.CG) != null) {
            this.kqm = nxr.ZU();
        } else {
            com.bytedance.sdk.component.QAg.ZU zu = (com.bytedance.sdk.component.QAg.ZU) lxb.rW.findViewById(com.bytedance.sdk.openadsdk.utils.STP.STP);
            this.kqm = zu;
            if (zu != null && com.bytedance.sdk.openadsdk.core.model.tD.LD(this.JVA)) {
                this.kqm.f_();
            } else {
                le.Lxb((View) this.kqm, 8);
            }
        }
        com.bytedance.sdk.component.QAg.ZU zu2 = (com.bytedance.sdk.component.QAg.ZU) this.le.rW.findViewById(com.bytedance.sdk.openadsdk.utils.STP.VVE);
        this.brP = zu2;
        if (zu2 != null && eK.ebl(this.JVA) && eK.OY(this.JVA)) {
            this.brP.f_();
            this.brP.setDisplayZoomControls(false);
        } else {
            le.Lxb((View) this.brP, 8);
        }
        com.bytedance.sdk.component.QAg.ZU zu3 = this.kqm;
        if (zu3 != null) {
            zu3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (brP.this.kqm == null || brP.this.kqm.getViewTreeObserver() == null) {
                        return;
                    }
                    brP.this.kqm.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = brP.this.kqm.getMeasuredWidth();
                    int measuredHeight = brP.this.kqm.getMeasuredHeight();
                    if (brP.this.kqm.getVisibility() == 0) {
                        brP.this.Lxb(measuredWidth, measuredHeight);
                    }
                }
            });
        }
        com.bytedance.sdk.component.QAg.ZU zu4 = this.brP;
        if (zu4 != null) {
            zu4.setLandingPage(true);
            this.brP.setTag(eK.ebl(this.JVA) ? this.sLN : "landingpage_endcard");
            this.brP.setWebViewClient(new com.bytedance.sdk.component.QAg.ZU.Lxb());
            this.brP.setMaterialMeta(this.JVA.Bg());
        }
    }

    public boolean ZU() {
        return this.NDz;
    }

    public boolean lk() {
        return this.JJ;
    }

    public void JXs(boolean z) {
        this.NDz = true;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("endcard_overlay_render_type", com.bytedance.sdk.openadsdk.core.model.tD.lk(this.JVA) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ZU.lk.LD(this.JVA, this.sLN, "use_second_endcard", jSONObject);
        this.VU = SystemClock.elapsedRealtime();
        try {
            if (!com.bytedance.sdk.openadsdk.core.model.tD.lk(this.JVA)) {
                this.Lxb.Lxb("click_endcard_close", (JSONObject) null);
            } else if (z) {
                this.le.CG.OY();
                com.bytedance.sdk.openadsdk.ZU.lk.LD(this.JVA, this.sLN, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.le;
        lxb.MGT.Lxb(lxb.OY);
    }

    public void ZU(boolean z) {
        if (this.Lxb == null || this.le.Pw.isFinishing()) {
            return;
        }
        this.le.CSn.JXs(z);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            this.Lxb.Lxb("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void lk(boolean z) {
        LD(this.Lxb, z);
    }

    public static class Lxb extends com.bytedance.sdk.openadsdk.core.LD.Lxb implements com.bytedance.sdk.openadsdk.core.LD.LD.Lxb {
        private final View LD;
        private final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb Lxb;
        private final View.OnClickListener lk;

        public Lxb(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb, View view, View.OnClickListener onClickListener) {
            super(lxb.Pw, lxb.LD, lxb.JXs, lxb.ZU ? 7 : 5);
            this.Lxb = lxb;
            this.LD = view;
            this.lk = onClickListener;
            HashMap map = new HashMap();
            map.put("close_auto_click", Boolean.TRUE);
            map.put("click_scence", 2);
            Lxb(map);
            Lxb(lxb.aH.lk());
            Lxb(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb, com.bytedance.sdk.openadsdk.core.LD.LD, com.bytedance.sdk.openadsdk.core.LD.lk
        public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, boolean z) {
            if (!((com.bytedance.sdk.openadsdk.core.LD.LD) this).lc.wVL()) {
                super.Lxb(view, f, f2, f3, f4, sparseArray, z);
                this.Lxb.dR.c_();
            } else {
                this.lk.onClick(view);
                this.LD.setOnTouchListener(null);
                this.LD.setOnClickListener(this.lk);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
        public void Lxb(View view, int i) {
            this.LD.setOnTouchListener(null);
            this.LD.setOnClickListener(this.lk);
        }
    }

    public void Lxb() {
        if (this.eK) {
            return;
        }
        this.eK = true;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.le;
        this.NXR = lxb.Ns;
        this.IeN = lxb.uxf;
        this.VVE = lxb.Nu;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LD();
        this.Nu = SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    public void Lxb(String str, final com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld) {
        Lxb(str, new ZU() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.12
            @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.ZU
            public void Lxb(WebView webView, String str2) {
                if (brP.this.le.Pw.isFinishing()) {
                    return;
                }
                brP.this.le.CSn.LD(brP.this.brP());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.ZU
            public void Lxb(WebView webView, String str2, Bitmap bitmap) {
                if (brP.this.BcA || !eK.brP(brP.this.le.LD)) {
                    return;
                }
                brP.this.BcA = true;
                brP.this.le.CSn.Lxb(brP.this.le.lc, brP.this.le.LD, brP.this.le.LD.cR());
                if (!eK.OY(brP.this.JVA)) {
                    brP.this.le.JJ.sendEmptyMessageDelayed(600, brP.this.le.CSn.QAg() * 1000);
                }
                brP.this.le.CSn.nBu();
                brP.this.le.dR.JVA();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.ZU
            public void Lxb(WebView webView, int i) {
                try {
                    if (!eK.brP(brP.this.le.LD) || !brP.this.le.LD.mOF() || brP.this.le.Pw.isFinishing()) {
                        if (!brP.this.le.ebl || brP.this.le.ae == null) {
                            return;
                        }
                        brP.this.le.ae.Lxb(webView, i, brP.this.LXE);
                        return;
                    }
                    brP.this.le.CSn.lk(i);
                } catch (Exception unused) {
                }
            }
        });
        if (eK.brP(this.le.LD)) {
            Lxb(this.brP);
            this.le.CSn.Lxb(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.13
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                    brP.this.le.aH.LD();
                    com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld2 = ld;
                    if (ld2 != null) {
                        ld2.ZU();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.le;
        lxb.CSn.lk(lxb.wbY);
        Lxb(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.14
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                brP.this.le.aH.LD();
                com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld2 = ld;
                if (ld2 != null) {
                    ld2.ZU();
                }
            }
        });
    }

    public void Lxb(com.bytedance.sdk.openadsdk.sLN.JXs jXs, String str, final com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld) {
        if (this.kqm == null) {
            return;
        }
        HashMap map = new HashMap();
        if (eK.ebl(this.JVA)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        this.OY = Of();
        Ivz ivz = new Ivz(this.le.Pw);
        this.Lxb = ivz;
        ivz.Lxb(this.le.dR);
        String strCf = this.JVA.cf();
        this.Lxb.LD(this.kqm).Lxb(this.JVA).lk(this.JVA.bG()).ZU(this.JVA.Lv()).LD(this.JVA.cR() ? 7 : 5).Lxb(new LD(this.kqm)).JXs(strCf).Lxb(this.kqm).LD(kqm() ? "landingpage_endcard" : str).Lxb(map).Lxb(this.OY).Lxb(new com.bytedance.sdk.openadsdk.core.widget.lc() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.16
            @Override // com.bytedance.sdk.openadsdk.core.widget.lc
            public void Lxb() {
                if (brP.this.rW != null) {
                    brP.this.rW.LD();
                }
                com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld2 = ld;
                if (ld2 != null) {
                    ld2.ZU();
                }
            }
        }).Lxb(new Ivz.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.15
            @Override // com.bytedance.sdk.openadsdk.core.Ivz.Lxb
            public void Lxb() {
                brP.this.VU();
            }
        });
        HashMap map2 = new HashMap();
        if (eK.OY(this.JVA)) {
            map2.put("click_scence", 2);
        }
        Ivz ivz2 = new Ivz(this.le.Pw);
        this.LD = ivz2;
        ivz2.Lxb(this.le.dR);
        Ivz ivzJXs = this.LD.LD(this.brP).Lxb(this.JVA).lk(this.JVA.bG()).ZU(this.JVA.Lv()).LD(this.JVA.cR() ? 7 : 5).Lxb(new LD(this.brP)).Lxb(this.brP).JXs(strCf);
        if (kqm()) {
            str = "landingpage_endcard";
        }
        ivzJXs.LD(str).Lxb(map2).Lxb(this.OY).Lxb(new com.bytedance.sdk.openadsdk.core.widget.lc() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.18
            @Override // com.bytedance.sdk.openadsdk.core.widget.lc
            public void Lxb() {
                if (brP.this.rW != null) {
                    brP.this.rW.LD();
                }
            }
        }).Lxb(new Ivz.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.17
            @Override // com.bytedance.sdk.openadsdk.core.Ivz.Lxb
            public void Lxb() {
                brP.this.VU();
            }
        });
        this.Lxb.Lxb(new lk(this.kqm));
        this.LD.Lxb(new lk(this.brP));
        this.Lxb.Lxb(this.le.BcA.nBu()).Lxb(this.le.wbY).Lxb(jXs).Lxb(this.le.CSn.JVA()).Lxb(new com.bytedance.sdk.openadsdk.sLN.LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.19
            @Override // com.bytedance.sdk.openadsdk.sLN.LD
            public void Lxb(boolean z, int i, String str2) {
                if (z) {
                    brP brp = brP.this;
                    brp.nBu = true;
                    if (brp.SS) {
                        brP.this.SS = false;
                        brP brp2 = brP.this;
                        brp2.Lxb(brp2.le.Of, true);
                    }
                }
                if (!com.bytedance.sdk.openadsdk.core.model.tD.ZU(brP.this.le.LD) || eK.ebl(brP.this.le.LD)) {
                    return;
                }
                brP.this.Lxb(z, i, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.sLN.LD
            public void Lxb() {
                brP.this.JJ = true;
                brP.this.le.BcA.nBu().performClick();
            }
        });
        this.Lxb.JXs(this.dR);
        this.LD.Lxb(this.le.BcA.nBu()).Lxb(new com.bytedance.sdk.openadsdk.sLN.LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.2
            @Override // com.bytedance.sdk.openadsdk.sLN.LD
            public void Lxb(boolean z, int i, String str2) {
            }

            @Override // com.bytedance.sdk.openadsdk.sLN.LD
            public void Lxb() {
                brP.this.JJ = true;
                brP.this.le.BcA.nBu().performClick();
            }
        });
    }

    public void LD(int i) {
        le.Lxb((View) this.kqm, i);
        com.bytedance.sdk.component.QAg.ZU zu = this.kqm;
        if (zu != null) {
            le.Lxb((View) zu.getWebView(), i);
        }
        if (this.kqm != null && (this.JVA.le() || eK.ebl(this.JVA))) {
            this.kqm.setLandingPage(true);
            this.kqm.setTag(eK.ebl(this.JVA) ? this.sLN : "landingpage_endcard");
            this.kqm.setMaterialMeta(this.JVA.Bg());
        }
        if (i == 0 && eK.OY(this.JVA)) {
            ebl();
        }
    }

    public void LD(boolean z) {
        Lxb(this.Lxb, z);
    }

    public void lc(boolean z) {
        this.xr = z;
    }

    public void LD(Ivz ivz, boolean z) {
        try {
            this.le.CSn.ZU(z);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z ? 1 : 0);
            ivz.Lxb("viewableChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void Lxb(int i, int i2) {
        if (this.Lxb == null || this.le.Pw.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            this.Lxb.Lxb("resize", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void Lxb(boolean z) {
        this.lk = z;
    }

    private static String Lxb(String str, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i, int i2, int i3) {
        String strConcat;
        String strConcat2;
        float fZa = tDVar.Za();
        if (!TextUtils.isEmpty(str)) {
            if (i == 1) {
                if (str.contains("?")) {
                    strConcat2 = str.concat("&");
                } else {
                    strConcat2 = str.concat("?");
                }
                str = DM.h(strConcat2, "orientation=portrait");
            }
            if (str.contains("?")) {
                strConcat = str.concat("&");
            } else {
                strConcat = str.concat("?");
            }
            str = strConcat + "height=" + i2 + "&width=" + i3 + "&aspect_ratio=" + fZa;
        }
        return !eK.ebl(tDVar) ? com.bytedance.sdk.openadsdk.utils.ZU.Lxb(str) : str;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.common.NXR nxr) {
        this.CG = nxr;
    }

    public void Lxb(float f) {
        le.Lxb(this.kqm, f);
    }

    public void Lxb(Ivz ivz, boolean z) {
        if (this.Lxb == null || this.le.Pw.isFinishing()) {
            return;
        }
        ivz.LD(z);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Lxb(String str, final ZU zu) {
        com.bytedance.sdk.component.QAg.ZU zu2;
        com.bytedance.sdk.component.QAg.ZU zu3 = this.kqm;
        if (zu3 != null && zu3.getWebView() != null) {
            com.bytedance.sdk.openadsdk.ZU.JVA jvaLxb = new com.bytedance.sdk.openadsdk.ZU.JVA(this.JVA, this.kqm.getWebView(), new com.bytedance.sdk.openadsdk.ZU.nBu() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.7
                @Override // com.bytedance.sdk.openadsdk.ZU.nBu
                public void Lxb(int i) {
                    if (TextUtils.isEmpty(brP.this.Lpq)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(brP.this.Ld, brP.this.Of, brP.this.uxf, brP.this.Sv - brP.this.uxf, brP.this.JVA, "landingpage_endcard", i);
                }
            }, this.JZE).Lxb(true);
            this.JXs = jvaLxb;
            this.LXE = jvaLxb.Lxb;
            jvaLxb.Lxb(kqm() ? "landingpage_endcard" : str);
            this.JXs.LD(this.sLN);
            this.JXs.LD(true);
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                this.kqm.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.8
                    @Override // android.view.View.OnScrollChangeListener
                    public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                        com.bytedance.sdk.openadsdk.ZU.JVA jva = brP.this.JXs;
                        if (jva != null) {
                            jva.LD(i3);
                        }
                    }
                });
            }
            OY oy = this.le.CSn;
            if (oy != null) {
                this.JXs.Lxb(oy.ZU());
            }
            com.bytedance.sdk.openadsdk.common.ZU zuLxb = nJ.Lxb(this.JVA, this.kqm, this.le.Pw, this.sLN);
            this.wbY = zuLxb;
            if (zuLxb != null) {
                if (kqm()) {
                    str = "landingpage_endcard";
                }
                zuLxb.Lxb(str);
            }
            if (kqm()) {
                nJ.Lxb(this.JVA, this.kqm);
            }
            com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs jXs = new com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), this.Lxb, this.JVA.bG(), this.wbY, this.JXs, this.JVA.le() || eK.ebl(this.JVA)) { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.9
                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    super.onPageFinished(webView, str2);
                    brP.this.FD = false;
                    brP.this.Sfi = true;
                    if (brP.this.le.hg.id()) {
                        View viewNBu = brP.this.le.BcA.nBu();
                        if (viewNBu instanceof com.bytedance.sdk.openadsdk.core.JXs.ZU) {
                            ((com.bytedance.sdk.openadsdk.core.JXs.ZU) viewNBu).setImageResource(com.bytedance.sdk.component.utils.tD.ZU(brP.this.le.NDz, "tt_skip_btn"));
                        }
                    }
                    DeviceUtils.AudioInfoReceiver.Lxb(brP.this);
                    brP.this.bG = DeviceUtils.ebl();
                    com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs2 = brP.this.OY;
                    if (jXs2 != null) {
                        jXs2.lc();
                    }
                    brP.this.le.CSn.LD(str2);
                    ZU zu4 = zu;
                    if (zu4 != null) {
                        zu4.Lxb(webView, str2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                    super.onPageStarted(webView, str2, bitmap);
                    com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs2 = brP.this.OY;
                    if (jXs2 != null) {
                        jXs2.JXs();
                    }
                    ZU zu4 = zu;
                    if (zu4 != null) {
                        zu4.Lxb(webView, str2, bitmap);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i2, String str2, String str3) {
                    super.onReceivedError(webView, i2, str2, str3);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 < 23 && !brP.this.Lxb(str3)) {
                        brP.this.DY.set(false);
                        brP brp = brP.this;
                        brp.lc = i2;
                        brp.ebl = str2;
                        brp.FD = false;
                        brP.this.le.CSn.Lxb(i2, str2, str3);
                        if (brP.this.OY != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (i3 >= 23) {
                                    jSONObject.put("code", i2);
                                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str2);
                                }
                                brP.this.OY.Lxb(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                @TargetApi(21)
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    brP.this.le.CSn.Lxb(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    if (webResourceRequest.getUrl() != null) {
                        webResourceRequest.getUrl().toString();
                    }
                    if (webResourceRequest.isForMainFrame()) {
                        brP.this.DY.set(false);
                        brP.this.FD = false;
                        brP.this.lc = webResourceResponse.getStatusCode();
                        brP.this.ebl = "onReceivedHttpError";
                    }
                    if (brP.this.OY != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                            brP.this.OY.Lxb(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                    if (eK.ebl(brP.this.JVA)) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        WebResourceResponse webResourceResponseLxb = com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(brP.this.JVA.JJ().i, eK.NXR(brP.this.JVA), str2);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (brP.this.OY != null) {
                            com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb Lxb2 = com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb(str2);
                            int i2 = webResourceResponseLxb != null ? 1 : 2;
                            if (Lxb2 == com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb.HTML) {
                                brP.this.OY.Lxb(str2, jCurrentTimeMillis, jCurrentTimeMillis2, i2);
                            } else if (Lxb2 == com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb.JS) {
                                brP.this.OY.LD(str2, jCurrentTimeMillis, jCurrentTimeMillis2, i2);
                            }
                        }
                        return webResourceResponseLxb != null ? webResourceResponseLxb : super.shouldInterceptRequest(webView, str2);
                    }
                    try {
                        if (TextUtils.isEmpty(brP.this.Lpq)) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                        brP.STP(brP.this);
                        WebResourceResponseModel webResourceResponseModelLxb = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(brP.this.Ns, brP.this.Lpq, str2);
                        if (webResourceResponseModelLxb != null && webResourceResponseModelLxb.getWebResourceResponse() != null) {
                            brP.VVE(brP.this);
                            return webResourceResponseModelLxb.getWebResourceResponse();
                        }
                        if (webResourceResponseModelLxb != null && webResourceResponseModelLxb.getMsg() == 2) {
                            brP.kqm(brP.this);
                        }
                        return super.shouldInterceptRequest(webView, str2);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                @TargetApi(23)
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 23) {
                        return;
                    }
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Objects.toString(webResourceError.getDescription());
                        webResourceRequest.getUrl().toString();
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !brP.this.Lxb(webResourceRequest.getUrl().toString())) {
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            brP.this.le.CSn.Lxb(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                        }
                        if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                            brP.this.DY.set(false);
                            brP.this.FD = false;
                        }
                        if (brP.this.OY != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (i2 >= 23 && webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                                }
                                brP.this.OY.Lxb(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            brP.this.lc = webResourceError.getErrorCode();
                            brP.this.ebl = String.valueOf(webResourceError.getDescription());
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                @TargetApi(21)
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }
            };
            this.rW = jXs;
            this.kqm.setWebViewClient(jXs);
            this.rW.Lxb(this.JVA);
            this.rW.Lxb(this.STP ? "rewarded_video" : "fullscreen_interstitial_ad");
            if (this.JVA.le() && (zu2 = this.kqm) != null && zu2.getWebView() != null) {
                this.kqm.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.10
                    private final int LD = com.bytedance.sdk.openadsdk.core.kqm.LD();

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        int i2;
                        com.bytedance.sdk.openadsdk.ZU.JVA jva = brP.this.JXs;
                        if (jva != null) {
                            jva.Lxb(motionEvent);
                        }
                        if (brP.this.wbY != null) {
                            brP.this.wbY.Lxb(motionEvent);
                        }
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                brP.this.nE = true;
                                brP.this.Ivz = new SparseArray();
                                brP.this.id = motionEvent.getRawX();
                                brP.this.foI = motionEvent.getRawY();
                                brP.this.KPU = System.currentTimeMillis();
                                try {
                                    long landingPageClickBegin = brP.this.kqm.getLandingPageClickBegin();
                                    if (landingPageClickBegin > 0 && landingPageClickBegin < brP.this.KPU) {
                                        brP.this.KPU = landingPageClickBegin;
                                        brP.this.kqm.setLandingPageClickBegin(-1L);
                                    }
                                } catch (Exception unused) {
                                }
                                brP.this.xan = -1.0f;
                                brP.this.hg = -1.0f;
                                i2 = 0;
                            } else if (actionMasked == 1) {
                                i2 = 3;
                            } else if (actionMasked != 2) {
                                i2 = actionMasked != 3 ? -1 : 4;
                            } else {
                                float rawX = motionEvent.getRawX();
                                float rawY = motionEvent.getRawY();
                                if (Math.abs(rawX - brP.this.id) >= this.LD || Math.abs(rawY - brP.this.foI) >= this.LD) {
                                    brP.this.nE = false;
                                }
                                brP.this.xan += Math.abs(motionEvent.getX() - brP.this.id);
                                brP.this.hg += Math.abs(motionEvent.getY() - brP.this.foI);
                                int i3 = (System.currentTimeMillis() - brP.this.KPU <= 200 || (brP.this.xan <= 8.0f && brP.this.hg <= 8.0f)) ? 2 : 1;
                                if (brP.this.nJ) {
                                    if (rawY - brP.this.foI > 8.0f) {
                                        brP.this.CG.Lxb();
                                    }
                                    if (rawY - brP.this.foI < -8.0f) {
                                        brP.this.CG.LD();
                                    }
                                }
                                i2 = i3;
                            }
                            brP.this.Ivz.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.LD.lk.Lxb(i2, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                            if (motionEvent.getAction() != 1 || view.getVisibility() != 0 || Float.valueOf(view.getAlpha()).intValue() != 1) {
                                return false;
                            }
                            if ((brP.this.tD && !com.bytedance.sdk.openadsdk.core.model.kqm.OY(brP.this.JVA)) || !brP.this.nE) {
                                return false;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("down_x", brP.this.id);
                            jSONObject.put("down_y", brP.this.foI);
                            jSONObject.put("down_time", brP.this.KPU);
                            jSONObject.put("up_x", motionEvent.getRawX());
                            jSONObject.put("up_y", motionEvent.getRawY());
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                long landingPageClickEnd = brP.this.kqm.getLandingPageClickEnd();
                                if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis) {
                                    try {
                                        brP.this.kqm.setLandingPageClickEnd(-1L);
                                    } catch (Exception unused2) {
                                    }
                                    jCurrentTimeMillis = landingPageClickEnd;
                                }
                            } catch (Exception unused3) {
                            }
                            jSONObject.put("up_time", jCurrentTimeMillis);
                            int[] iArr = new int[2];
                            if (brP.this.nJ) {
                                brP brp = brP.this;
                                brp.CSn = brp.le.rW.findViewById(com.bytedance.sdk.openadsdk.utils.STP.MGT);
                            } else {
                                brP brp2 = brP.this;
                                brp2.CSn = brp2.le.rW.findViewById(520093713);
                            }
                            if (brP.this.CSn != null) {
                                brP.this.CSn.getLocationOnScreen(iArr);
                                jSONObject.put("button_x", iArr[0]);
                                jSONObject.put("button_y", iArr[1]);
                                jSONObject.put("button_width", brP.this.CSn.getWidth());
                                jSONObject.put("button_height", brP.this.CSn.getHeight());
                            }
                            if (brP.this.aH != null) {
                                int[] iArr2 = new int[2];
                                brP.this.aH.getLocationOnScreen(iArr2);
                                jSONObject.put("ad_x", iArr2[0]);
                                jSONObject.put("ad_y", iArr2[1]);
                                jSONObject.put("width", brP.this.aH.getWidth());
                                jSONObject.put("height", brP.this.aH.getHeight());
                            }
                            jSONObject.put("toolType", motionEvent.getToolType(0));
                            jSONObject.put("deviceId", motionEvent.getDeviceId());
                            jSONObject.put("source", motionEvent.getSource());
                            jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.nBu.Lxb(brP.this.Ivz, com.bytedance.sdk.openadsdk.core.QAg.LD().Lxb() ? 1 : 2));
                            jSONObject.put("user_behavior_type", brP.this.nE ? 1 : 2);
                            jSONObject.put("click_scence", 2);
                            if (brP.this.rW != null) {
                                brP.this.rW.Lxb(jSONObject);
                            }
                            if (brP.this.tD || com.bytedance.sdk.openadsdk.core.model.kqm.ebl(brP.this.JVA)) {
                                return false;
                            }
                            if (brP.this.STP) {
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(brP.this.JVA, "rewarded_video", CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
                            } else {
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(brP.this.JVA, "fullscreen_interstitial_ad", CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
                            }
                            brP.this.tD = true;
                            return false;
                        } catch (Throwable unused4) {
                            return false;
                        }
                    }
                });
            }
            com.bytedance.sdk.component.QAg.ZU zu4 = this.kqm;
            if (zu4 != null) {
                zu4.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU(this.Lxb, this.JXs, this.wbY) { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.brP.11
                    @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i2) {
                        super.onProgressChanged(webView, i2);
                        ZU zu5 = zu;
                        if (zu5 != null) {
                            zu5.Lxb(webView, i2);
                        }
                    }
                });
            }
            Lxb(this.kqm);
            if (i >= 24) {
                this.kqm.setLayerType(1, null);
            }
            this.kqm.setBackgroundColor(-1);
            this.kqm.setDisplayZoomControls(false);
        }
        JXs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.JVA.le() && str.endsWith(".mp4");
    }

    public void Lxb(DownloadListener downloadListener) {
        com.bytedance.sdk.component.QAg.ZU zu = this.kqm;
        if (zu == null || downloadListener == null) {
            return;
        }
        zu.setDownloadListener(downloadListener);
    }

    public void Lxb(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.Lxb.lk.Lxb(this.le.Pw).Lxb(false).LD(false).Lxb(zu.getWebView());
        zu.setUserAgentString(com.bytedance.sdk.openadsdk.utils.kqm.Lxb(zu.getWebView(), BuildConfig.VERSION_CODE));
        zu.setMixedContentMode(0);
    }

    public void Lxb(boolean z, boolean z2) {
        Lxb(this.Lxb, z, z2);
    }

    public void Lxb(Ivz ivz, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z2);
            com.bytedance.sdk.openadsdk.activity.lc lcVar = this.le.FGm;
            if (lcVar != null) {
                jSONObject.put("multi_ads_show", lcVar.aH().ebl());
            }
            ivz.Lxb("endcard_control_event", jSONObject);
            if (z2) {
                if (this.Sfi) {
                    return;
                }
                this.SS = true;
                return;
            }
            this.SS = false;
        } catch (Exception unused) {
        }
    }

    public void Lxb(boolean z, int i, String str) {
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.OY;
        if (jXs == null) {
            return;
        }
        if (z) {
            jXs.LD();
        } else {
            jXs.Lxb(i, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sLN.ebl
    public void Lxb(int i) {
        int i2 = this.bG;
        if (i2 <= 0 && i > 0) {
            ZU(false);
        } else if (i2 > 0 && i == 0) {
            ZU(true);
        }
        this.bG = i;
    }
}
