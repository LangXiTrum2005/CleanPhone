package com.bytedance.sdk.openadsdk.component.reward.qdl;

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
import com.bumptech.glide.load.resource.bitmap.a;
import com.bytedance.sdk.openadsdk.core.gy;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class yt implements com.bytedance.sdk.openadsdk.fs.jpc {
    private volatile boolean jpc;
    private com.bytedance.sdk.component.tvp.mo lnr;
    private ImageView mml;
    private com.bytedance.sdk.openadsdk.core.lnr.wd mo;
    private boolean mzz;
    private final Activity qdl;
    private int to;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl tvp;
    private final ljh ud;
    private final AtomicBoolean wd = new AtomicBoolean(false);

    public yt(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.tvp = qdlVar;
        this.ud = qdlVar.ud;
        this.qdl = qdlVar.ag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr() {
        qdl(Integer.MAX_VALUE, (String) null);
    }

    private void mml() {
        this.lnr.mzz();
        qdl(this.lnr);
        this.lnr.setDisplayZoomControls(false);
        this.lnr.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.yt.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i2) {
                super.onProgressChanged(webView, i2);
                if (i2 == 100) {
                    yt.this.lnr();
                }
            }
        });
        this.lnr.setWebViewClient(new com.bytedance.sdk.component.tvp.mo.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.yt.4
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                yt.this.lnr();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    yt.this.qdl(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (yt.this.qdl(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    public void ud() {
        DeviceUtils.AudioInfoReceiver.ud(this);
        com.bytedance.sdk.component.tvp.mo moVar = this.lnr;
        if (moVar != null) {
            gy.qdl(moVar.getWebView());
        }
    }

    public void qdl() {
        DeviceUtils.AudioInfoReceiver.qdl(this);
        this.to = DeviceUtils.wd();
        if (this.ud.aoy() != null) {
            this.mo = new com.bytedance.sdk.openadsdk.core.lnr.wd("VAST_END_CARD", this.ud.aoy()) { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.yt.1
            };
            com.bytedance.sdk.openadsdk.core.fs.lnr lnrVarLnr = this.ud.aoy().lnr();
            if (lnrVarLnr != null) {
                String strMzz = lnrVarLnr.mzz();
                if (!TextUtils.isEmpty(strMzz)) {
                    this.mzz = true;
                    this.mml = (ImageView) this.tvp.ax.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.jpc);
                    qdl(lnrVarLnr.ud(), lnrVarLnr.lnr());
                    com.bytedance.sdk.openadsdk.tvp.mml.qdl(strMzz).qdl(lnrVarLnr.ud()).ud(lnrVarLnr.lnr()).mzz(ax.mzz(com.bytedance.sdk.openadsdk.core.yt.qdl())).mml(ax.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl())).lnr(1).qdl(new com.bytedance.sdk.openadsdk.tvp.ud(this.ud, strMzz, new qdl(this.mml, strMzz, this, this.wd)));
                    return;
                }
                com.bytedance.sdk.component.tvp.mo moVar = (com.bytedance.sdk.component.tvp.mo) this.tvp.ax.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.tvp);
                this.lnr = moVar;
                if (moVar == null) {
                    return;
                }
                mml();
                String strMml = lnrVarLnr.mml();
                if (strMml != null) {
                    this.mzz = true;
                    if (strMml.startsWith("http")) {
                        this.lnr.a_(strMml);
                        return;
                    }
                    String strQdl = com.bytedance.sdk.openadsdk.core.fs.mzz.qdl(strMml);
                    String str = TextUtils.isEmpty(strQdl) ? strMml : strQdl;
                    this.lnr.setDefaultTextEncodingName("UTF -8");
                    this.lnr.qdl(null, str, "text/html", "UTF-8", null);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fs.jpc
    public void ud(int i2) {
        int i3 = this.to;
        if (i3 == 0 && i2 > 0) {
            this.ud.aoy().qdl().tvp(this.tvp.bch.fs());
        } else if (i3 > 0 && i2 == 0) {
            this.ud.aoy().qdl().jpc(this.tvp.bch.fs());
        }
        this.to = i2;
    }

    public static class qdl implements com.bytedance.sdk.component.mzz.jtx {
        private final WeakReference<yt> lnr;
        private final AtomicBoolean mml;
        private final WeakReference<ImageView> qdl;
        private final String ud;

        public qdl(ImageView imageView, String str, yt ytVar, AtomicBoolean atomicBoolean) {
            this.qdl = new WeakReference<>(imageView);
            this.ud = str;
            this.lnr = new WeakReference<>(ytVar);
            this.mml = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
            yt ytVar;
            ImageView imageView = this.qdl.get();
            if (imageView == null || (ytVar = this.lnr.get()) == null || rqVar == null) {
                return;
            }
            Object objUd = rqVar.ud();
            if (objUd == null) {
                ytVar.qdl(-1, this.ud);
                return;
            }
            if (objUd instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objUd);
            } else if (objUd instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && a.w(objUd)) {
                    a.l(objUd).start();
                }
                imageView.setImageDrawable((Drawable) objUd);
            }
            this.mml.set(true);
            ytVar.lnr();
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(int i2, String str, Throwable th) {
            yt ytVar;
            ImageView imageView = this.qdl.get();
            if (imageView == null || (ytVar = this.lnr.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            ytVar.qdl(-2, this.ud);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final int i2, final String str) {
        if (this.jpc) {
            return;
        }
        this.jpc = true;
        if (i2 == Integer.MAX_VALUE) {
            ljh ljhVar = this.ud;
            com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, ljhVar.mzz(), "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(new com.bytedance.sdk.component.jpc.jpc("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.yt.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i2);
                        jSONObject.put("error_code", i2);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        com.bytedance.sdk.openadsdk.mml.lnr.ud(yt.this.ud, yt.this.ud.mzz(), "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void qdl(com.bytedance.sdk.component.tvp.mo moVar) {
        moVar.setVerticalScrollBarEnabled(false);
        moVar.setHorizontalScrollBarEnabled(false);
        moVar.setMixedContentMode(0);
        moVar.setJavaScriptEnabled(true);
        moVar.setJavaScriptCanOpenWindowsAutomatically(true);
        moVar.setDomStorageEnabled(true);
        moVar.setDatabaseEnabled(true);
        moVar.setCacheMode(-1);
        moVar.setAllowFileAccess(false);
        moVar.setSupportZoom(true);
        moVar.setBuiltInZoomControls(true);
        moVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        moVar.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qdl(String str) {
        ljh ljhVar;
        if (str == null || (ljhVar = this.ud) == null || ljhVar.aoy() == null || this.mo == null) {
            return false;
        }
        this.ud.aoy().mo(str);
        this.mo.onClick(this.lnr);
        return true;
    }

    private void qdl(int i2, int i3) {
        if (i2 == 0 || i3 == 0 || this.mml == null) {
            return;
        }
        int iLnr = ax.lnr((Context) this.qdl);
        int iMzz = ax.mzz(this.qdl);
        float f = i2 / i3;
        float f2 = iLnr;
        if (f <= f2 / iMzz) {
            iLnr = (int) Math.ceil(f2 * f);
        } else {
            iMzz = (int) Math.ceil(f2 / f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mml.getLayoutParams();
        layoutParams.width = iLnr;
        layoutParams.height = iMzz;
        layoutParams.gravity = 17;
        this.mml.setLayoutParams(layoutParams);
        this.mml.setOnClickListener(this.mo);
        this.mml.setOnTouchListener(this.mo);
    }

    public boolean qdl(bjy bjyVar) {
        com.bytedance.sdk.openadsdk.core.fs.lnr lnrVarLnr;
        if (!this.mzz) {
            return false;
        }
        if (this.mml != null && this.wd.get()) {
            this.mml.setVisibility(0);
        } else {
            com.bytedance.sdk.component.tvp.mo moVar = this.lnr;
            if (moVar != null) {
                moVar.setVisibility(0);
                if (this.lnr.getWebView() != null) {
                    this.lnr.getWebView().setOnTouchListener(this.mo);
                }
            }
        }
        ljh ljhVar = this.ud;
        if (ljhVar == null || ljhVar.aoy() == null || (lnrVarLnr = this.ud.aoy().lnr()) == null) {
            return true;
        }
        lnrVarLnr.ud(bjyVar != null ? bjyVar.fs() : -1L);
        return true;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.lnr.mzz mzzVar) {
        com.bytedance.sdk.openadsdk.core.lnr.wd wdVar = this.mo;
        if (wdVar != null) {
            wdVar.qdl(mzzVar);
        }
    }
}
