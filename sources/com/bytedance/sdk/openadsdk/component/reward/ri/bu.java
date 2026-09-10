package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.srn;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import dumb.dern;
import dumb.saneness;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class bu implements com.bytedance.sdk.openadsdk.aw.mj {
    private com.bytedance.sdk.openadsdk.core.ik.xha di;
    private boolean fi;
    private com.bytedance.sdk.component.jbs.di ik;
    private final com.bytedance.sdk.openadsdk.component.reward.ri.ri jbs;
    private ImageView ka;
    private final wjv lr;
    private volatile boolean mj;
    private int qt;
    private final Activity ri;
    private final AtomicBoolean xha = new AtomicBoolean(false);

    public bu(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.jbs = riVar;
        this.lr = riVar.lr;
        this.ri = riVar.ig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik() {
        ri(Integer.MAX_VALUE, (String) null);
    }

    private void ka() {
        this.ik.fi();
        ri(this.ik);
        this.ik.setDisplayZoomControls(false);
        this.ik.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bu.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (i == 100) {
                    bu.this.ik();
                }
            }
        });
        this.ik.setWebViewClient(new com.bytedance.sdk.component.jbs.di.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bu.4
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                bu.this.ik();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    bu.this.ri(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (bu.this.ri(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.aw.mj
    public void ik(int i) {
        int i2 = this.qt;
        if (i2 == 0 && i > 0) {
            this.lr.sr().ri().jbs(this.jbs.ihz.aw());
        } else if (i2 > 0 && i == 0) {
            this.lr.sr().ri().mj(this.jbs.ihz.aw());
        }
        this.qt = i;
    }

    public void lr() {
        DeviceUtils.AudioInfoReceiver.lr(this);
        com.bytedance.sdk.component.jbs.di diVar = this.ik;
        if (diVar != null) {
            srn.ri(diVar.getWebView());
        }
    }

    public void ri() {
        DeviceUtils.AudioInfoReceiver.ri(this);
        this.qt = DeviceUtils.xha();
        if (this.lr.sr() != null) {
            this.di = new com.bytedance.sdk.openadsdk.core.ik.xha("VAST_END_CARD", this.lr.sr()) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bu.1
            };
            com.bytedance.sdk.openadsdk.core.aw.ik ikVarIk = this.lr.sr().ik();
            if (ikVarIk != null) {
                String strKa = ikVarIk.ka();
                if (!TextUtils.isEmpty(strKa)) {
                    this.fi = true;
                    this.ka = (ImageView) this.jbs.pv.findViewById(com.bytedance.sdk.openadsdk.utils.slm.qt);
                    ri(ikVarIk.ri(), ikVarIk.lr());
                    com.bytedance.sdk.openadsdk.qt.ka.ri(strKa).ri(ikVarIk.ri()).lr(ikVarIk.lr()).fi(qd.fi(nr.ri())).ka(qd.ik(nr.ri())).ik(1).ri(new com.bytedance.sdk.openadsdk.qt.lr(this.lr, strKa, new ri(this.ka, strKa, this, this.xha)));
                    return;
                }
                com.bytedance.sdk.component.jbs.di diVar = (com.bytedance.sdk.component.jbs.di) this.jbs.pv.findViewById(com.bytedance.sdk.openadsdk.utils.slm.sf);
                this.ik = diVar;
                if (diVar == null) {
                    return;
                }
                ka();
                String strIk = ikVarIk.ik();
                if (strIk != null) {
                    this.fi = true;
                    if (strIk.startsWith("http")) {
                        this.ik.a_(strIk);
                        return;
                    }
                    String strRi = com.bytedance.sdk.openadsdk.core.aw.fi.ri(strIk);
                    String str = TextUtils.isEmpty(strRi) ? strIk : strRi;
                    this.ik.setDefaultTextEncodingName("UTF -8");
                    this.ik.ri(null, str, "text/html", C.UTF8_NAME, null);
                }
            }
        }
    }

    public static class ri implements com.bytedance.sdk.component.fi.slm {
        private final WeakReference<bu> ik;
        private final AtomicBoolean ka;
        private final String lr;
        private final WeakReference<ImageView> ri;

        public ri(ImageView imageView, String str, bu buVar, AtomicBoolean atomicBoolean) {
            this.ri = new WeakReference<>(imageView);
            this.lr = str;
            this.ik = new WeakReference<>(buVar);
            this.ka = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
            bu buVar;
            ImageView imageView = this.ri.get();
            if (imageView == null || (buVar = this.ik.get()) == null || sfVar == null) {
                return;
            }
            Object objLr = sfVar.lr();
            if (objLr == null) {
                buVar.ri(-1, this.lr);
                return;
            }
            if (objLr instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objLr);
            } else if (objLr instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(objLr)) {
                    dern.attabal(objLr).start();
                }
                imageView.setImageDrawable((Drawable) objLr);
            }
            this.ka.set(true);
            buVar.ik();
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(int i, String str, Throwable th) {
            bu buVar;
            ImageView imageView = this.ri.get();
            if (imageView == null || (buVar = this.ik.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            buVar.ri(-2, this.lr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final int i, final String str) {
        if (this.mj) {
            return;
        }
        this.mj = true;
        if (i == Integer.MAX_VALUE) {
            wjv wjvVar = this.lr;
            com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, wjvVar.fi(), "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.ka.ik.ri(new com.bytedance.sdk.component.mj.lr.ik("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bu.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i);
                        jSONObject.put("error_code", i);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        com.bytedance.sdk.openadsdk.ka.ik.lr(bu.this.lr, bu.this.lr.fi(), "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void ri(com.bytedance.sdk.component.jbs.di diVar) {
        diVar.setVerticalScrollBarEnabled(false);
        diVar.setHorizontalScrollBarEnabled(false);
        diVar.setMixedContentMode(0);
        diVar.setJavaScriptEnabled(true);
        diVar.setJavaScriptCanOpenWindowsAutomatically(true);
        diVar.setDomStorageEnabled(true);
        diVar.setDatabaseEnabled(true);
        diVar.setCacheMode(-1);
        diVar.setAllowFileAccess(false);
        diVar.setSupportZoom(true);
        diVar.setBuiltInZoomControls(true);
        diVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        diVar.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(String str) {
        wjv wjvVar;
        if (str == null || (wjvVar = this.lr) == null || wjvVar.sr() == null || this.di == null) {
            return false;
        }
        this.lr.sr().di(str);
        this.di.onClick(this.ik);
        return true;
    }

    private void ri(int i, int i2) {
        if (i == 0 || i2 == 0 || this.ka == null) {
            return;
        }
        int iIk = qd.ik((Context) this.ri);
        int iFi = qd.fi(this.ri);
        float f = i / i2;
        float f2 = iIk;
        if (f <= f2 / iFi) {
            iIk = (int) Math.ceil(f2 * f);
        } else {
            iFi = (int) Math.ceil(f2 / f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ka.getLayoutParams();
        layoutParams.width = iIk;
        layoutParams.height = iFi;
        layoutParams.gravity = 17;
        this.ka.setLayoutParams(layoutParams);
        this.ka.setOnClickListener(this.di);
        this.ka.setOnTouchListener(this.di);
    }

    public boolean ri(vr vrVar) {
        com.bytedance.sdk.openadsdk.core.aw.ik ikVarIk;
        if (!this.fi) {
            return false;
        }
        if (this.ka != null && this.xha.get()) {
            this.ka.setVisibility(0);
        } else {
            com.bytedance.sdk.component.jbs.di diVar = this.ik;
            if (diVar != null) {
                diVar.setVisibility(0);
                if (this.ik.getWebView() != null) {
                    this.ik.getWebView().setOnTouchListener(this.di);
                }
            }
        }
        wjv wjvVar = this.lr;
        if (wjvVar == null || wjvVar.sr() == null || (ikVarIk = this.lr.sr().ik()) == null) {
            return true;
        }
        ikVarIk.lr(vrVar != null ? vrVar.aw() : -1L);
        return true;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.ik.fi fiVar) {
        com.bytedance.sdk.openadsdk.core.ik.xha xhaVar = this.di;
        if (xhaVar != null) {
            xhaVar.ri(fiVar);
        }
    }
}
