package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.openadsdk.core.hg;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.le;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class tD implements com.bytedance.sdk.openadsdk.sLN.ebl {
    private boolean JXs;
    private final com.bytedance.sdk.openadsdk.core.model.tD LD;
    private final Activity Lxb;
    private volatile boolean OY;
    private final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb QAg;
    private ImageView ZU;
    private final AtomicBoolean ebl = new AtomicBoolean(false);
    private com.bytedance.sdk.openadsdk.core.LD.ebl lc;
    private com.bytedance.sdk.component.QAg.ZU lk;
    private int nBu;

    public tD(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        this.QAg = lxb;
        this.LD = lxb.LD;
        this.Lxb = lxb.Pw;
    }

    private void JXs() {
        this.lk.f_();
        Lxb(this.lk);
        this.lk.setDisplayZoomControls(false);
        this.lk.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.tD.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (i == 100) {
                    tD.this.ZU();
                }
            }
        });
        this.lk.setWebViewClient(new com.bytedance.sdk.component.QAg.ZU.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.tD.4
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                tD.this.ZU();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    tD.this.Lxb(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (tD.this.Lxb(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZU() {
        Lxb(Integer.MAX_VALUE, (String) null);
    }

    public boolean lk() {
        if (!this.JXs) {
            return false;
        }
        ImageView imageView = this.ZU;
        if (imageView != null) {
            imageView.performClick();
            return true;
        }
        com.bytedance.sdk.component.QAg.ZU zu = this.lk;
        if (zu == null) {
            return false;
        }
        this.lc.onClick(zu);
        return true;
    }

    public void LD() {
        DeviceUtils.AudioInfoReceiver.LD(this);
        com.bytedance.sdk.component.QAg.ZU zu = this.lk;
        if (zu != null) {
            hg.Lxb(zu.getWebView());
        }
    }

    public void Lxb() {
        DeviceUtils.AudioInfoReceiver.Lxb(this);
        this.nBu = DeviceUtils.ebl();
        if (this.LD.SlV() != null) {
            this.lc = new com.bytedance.sdk.openadsdk.core.LD.ebl("VAST_END_CARD", this.LD.SlV()) { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.tD.1
            };
            com.bytedance.sdk.openadsdk.core.sLN.lk lkVarLk = this.LD.SlV().lk();
            if (lkVarLk != null) {
                String strJXs = lkVarLk.JXs();
                if (!TextUtils.isEmpty(strJXs)) {
                    this.JXs = true;
                    this.ZU = (ImageView) this.QAg.rW.findViewById(com.bytedance.sdk.openadsdk.utils.STP.OY);
                    Lxb(lkVarLk.LD(), lkVarLk.lk());
                    com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(strJXs).Lxb(lkVarLk.LD()).LD(lkVarLk.lk()).JXs(le.ZU(com.bytedance.sdk.openadsdk.core.kqm.Lxb())).ZU(le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb())).lk(2).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(this.LD, strJXs, new Lxb(this.ZU, strJXs, this, this.ebl)));
                    return;
                }
                com.bytedance.sdk.component.QAg.ZU zu = (com.bytedance.sdk.component.QAg.ZU) this.QAg.rW.findViewById(com.bytedance.sdk.openadsdk.utils.STP.QAg);
                this.lk = zu;
                if (zu == null) {
                    return;
                }
                JXs();
                String strZU = lkVarLk.ZU();
                if (strZU != null) {
                    this.JXs = true;
                    if (strZU.startsWith(ProxyConfig.MATCH_HTTP)) {
                        this.lk.a_(strZU);
                        return;
                    }
                    String strLxb = com.bytedance.sdk.openadsdk.core.sLN.JXs.Lxb(strZU);
                    String str = TextUtils.isEmpty(strLxb) ? strZU : strLxb;
                    this.lk.setDefaultTextEncodingName("UTF -8");
                    this.lk.Lxb(null, str, "text/html", C.UTF8_NAME, null);
                }
            }
        }
    }

    public static class Lxb implements com.bytedance.sdk.component.JXs.VVE<Bitmap> {
        private final String LD;
        private final WeakReference<ImageView> Lxb;
        private final AtomicBoolean ZU;
        private final WeakReference<tD> lk;

        public Lxb(ImageView imageView, String str, tD tDVar, AtomicBoolean atomicBoolean) {
            this.Lxb = new WeakReference<>(imageView);
            this.LD = str;
            this.lk = new WeakReference<>(tDVar);
            this.ZU = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(com.bytedance.sdk.component.JXs.JVA<Bitmap> jva) {
            tD tDVar;
            ImageView imageView = this.Lxb.get();
            if (imageView == null || (tDVar = this.lk.get()) == null || jva == null) {
                return;
            }
            Bitmap bitmapLD = jva.LD();
            if (bitmapLD == null) {
                tDVar.Lxb(-1, this.LD);
                return;
            }
            imageView.setImageBitmap(bitmapLD);
            this.ZU.set(true);
            tDVar.ZU();
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(int i, String str, @Nullable Throwable th) {
            tD tDVar;
            ImageView imageView = this.Lxb.get();
            if (imageView == null || (tDVar = this.lk.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            tDVar.Lxb(-2, this.LD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final int i, final String str) {
        String strJVA;
        if (this.OY) {
            return;
        }
        this.OY = true;
        if (this.LD.SlV() != null) {
            strJVA = this.LD.SlV().JVA();
        } else {
            strJVA = "";
        }
        final String str2 = strJVA;
        if (i == Integer.MAX_VALUE) {
            com.bytedance.sdk.openadsdk.ZU.lk.LD(this.LD, str2, "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(new com.bytedance.sdk.component.OY.OY("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.tD.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i);
                        jSONObject.put("error_code", i);
                        String str3 = str;
                        if (str3 != null) {
                            jSONObject.put("url", str3);
                        }
                        com.bytedance.sdk.openadsdk.ZU.lk.LD(tD.this.LD, str2, "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void Lxb(com.bytedance.sdk.component.QAg.ZU zu) {
        zu.setVerticalScrollBarEnabled(false);
        zu.setHorizontalScrollBarEnabled(false);
        zu.setMixedContentMode(0);
        zu.setJavaScriptEnabled(true);
        zu.setJavaScriptCanOpenWindowsAutomatically(true);
        zu.setDomStorageEnabled(true);
        zu.setDatabaseEnabled(true);
        zu.setCacheMode(-1);
        zu.setAllowFileAccess(false);
        zu.setSupportZoom(true);
        zu.setBuiltInZoomControls(true);
        zu.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        zu.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Lxb(String str) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar;
        if (str == null || (tDVar = this.LD) == null || tDVar.SlV() == null || this.lc == null) {
            return false;
        }
        this.LD.SlV().ebl(str);
        this.lc.onClick(this.lk);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Lxb(int i, int i2) {
        if (i == 0 || i2 == 0 || this.ZU == null) {
            return;
        }
        int iLk = le.lk((Context) this.Lxb);
        int iZU = le.ZU((Context) this.Lxb);
        float f = i / i2;
        float f2 = iLk;
        if (f <= f2 / iZU) {
            iLk = (int) Math.ceil(f2 * f);
        } else {
            iZU = (int) Math.ceil(f2 / f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ZU.getLayoutParams();
        layoutParams.width = iLk;
        layoutParams.height = iZU;
        layoutParams.gravity = 17;
        this.ZU.setLayoutParams(layoutParams);
        this.ZU.setOnClickListener(this.lc);
        this.ZU.setOnTouchListener(this.lc);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean Lxb(kqm kqmVar) {
        com.bytedance.sdk.openadsdk.core.sLN.lk lkVarLk;
        if (!this.JXs) {
            return false;
        }
        if (this.ZU != null && this.ebl.get()) {
            this.ZU.setVisibility(0);
        } else {
            com.bytedance.sdk.component.QAg.ZU zu = this.lk;
            if (zu != null) {
                zu.setVisibility(0);
                if (this.lk.getWebView() != null) {
                    this.lk.getWebView().setOnTouchListener(this.lc);
                }
            }
        }
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.LD;
        if (tDVar == null || tDVar.SlV() == null || (lkVarLk = this.LD.SlV().lk()) == null) {
            return true;
        }
        lkVarLk.LD(kqmVar != null ? kqmVar.ebl() : -1L);
        return true;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.LD.JXs jXs) {
        com.bytedance.sdk.openadsdk.core.LD.ebl eblVar = this.lc;
        if (eblVar != null) {
            eblVar.Lxb(jXs);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sLN.ebl
    public void Lxb(int i) {
        int i2 = this.nBu;
        if (i2 == 0 && i > 0) {
            this.LD.SlV().Lxb().QAg(this.QAg.eK.ebl());
        } else if (i2 > 0 && i == 0) {
            this.LD.SlV().Lxb().OY(this.QAg.eK.ebl());
        }
        this.nBu = i;
    }
}
