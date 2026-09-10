package com.bytedance.sdk.openadsdk.core.rq.lnr;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.ud.rdp;
import com.bytedance.sdk.component.adexpress.ud.rq;
import com.bytedance.sdk.component.tvp.mo;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.yt;
import com.bytedance.sdk.openadsdk.core.tvp.bjy;
import com.bytedance.sdk.openadsdk.core.widget.qdl.mzz;
import com.bytedance.sdk.openadsdk.utils.ag;
import com.bytedance.sdk.openadsdk.utils.exc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml implements rq, lnr<mo> {
    private final boolean jpc;
    private mo lnr;
    private hkc mml;
    private com.bytedance.sdk.openadsdk.core.rq.lnr.qdl mo;
    private String mzz;
    private Context qdl;
    private qdl to;
    private boolean tvp = false;
    private ljh ud;
    private int wd;

    public interface qdl {
        void jpc();

        void wd();
    }

    public mml(Context context, ljh ljhVar, boolean z2) {
        this.wd = 1;
        this.qdl = context;
        this.ud = ljhVar;
        this.wd = ljhVar.jb();
        this.jpc = z2;
        if (z2) {
            this.mzz = yt.ud(this.ud).qdl(this.wd == 1);
        } else {
            this.mzz = yt.lnr(this.ud).qdl(this.wd == 1);
        }
    }

    private void jpc() {
        hkc hkcVar = new hkc(this.qdl);
        this.mml = hkcVar;
        hkcVar.ud(this.lnr).qdl(this.ud).lnr(this.ud.yre()).mml(this.ud.ir()).mzz(this.ud.htl()).qdl(com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl(0.0f, 0.0f, false, this.ud, null, null)).qdl(this).qdl(this.lnr);
    }

    private void wd() {
        mml mmlVar;
        this.lnr.setBackgroundColor(0);
        this.lnr.setBackgroundResource(R.color.transparent);
        this.lnr.setVisibility(8);
        qdl(this.lnr);
        if (this.ud != null) {
            mmlVar = this;
            this.lnr.setWebViewClient(new mzz(this.qdl, this.mml, this.ud.yre(), null, false) { // from class: com.bytedance.sdk.openadsdk.core.rq.lnr.mml.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (mml.this.to != null) {
                        mml.this.to.wd();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (mml.this.to != null) {
                        mml.this.to.jpc();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i2, String str, String str2) {
                    super.onReceivedError(webView, i2, str, str2);
                    if (mml.this.to != null) {
                        mml.this.to.jpc();
                    }
                }
            });
        } else {
            mmlVar = this;
        }
        com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().qdl(mmlVar.lnr, mmlVar.mml);
        mmlVar.lnr.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.qdl.mml(mmlVar.mml));
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.lnr.lnr
    public void lnr() {
        hkc hkcVar = this.mml;
        if (hkcVar != null) {
            hkcVar.lnr();
        }
        this.mml = null;
        try {
            mo moVar = this.lnr;
            if (moVar != null) {
                ViewGroup viewGroup = (ViewGroup) moVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.lnr);
                }
                this.lnr.jtx();
            }
        } catch (Throwable unused) {
        }
        if (this.to != null) {
            this.to = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.lnr.lnr
    /* JADX INFO: renamed from: mo, reason: merged with bridge method [inline-methods] */
    public mo mml() {
        return this.lnr;
    }

    public hkc mzz() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.rq
    public void qdl(rdp rdpVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.lnr.lnr
    public void ud() {
        if (TextUtils.isEmpty(this.mzz)) {
            this.lnr.setVisibility(8);
        } else {
            this.lnr.a_(this.mzz);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.lnr.lnr
    public void qdl() {
        this.lnr = new mo(this.qdl, mo.lnr.EASY_PLAYABLE);
        wd();
        jpc();
        if (this.jpc) {
            return;
        }
        ag.qdl(this.lnr, false, this.ud.ok(), false, new ag.ud() { // from class: com.bytedance.sdk.openadsdk.core.rq.lnr.mml.1
            @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
            public void qdl(View view, boolean z2) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
            public void ud() {
                mml.this.qdl(false);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
            public void qdl(boolean z2) {
                mml.this.qdl(z2);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
            public void qdl() {
                mml.this.qdl(true);
            }
        }, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.lnr.lnr
    public void qdl(com.bytedance.sdk.openadsdk.core.rq.lnr.qdl qdlVar) {
        this.mo = qdlVar;
    }

    private void qdl(mo moVar) {
        if (moVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.qdl.lnr.qdl(this.qdl).qdl(false).qdl(moVar.getWebView());
            moVar.setVerticalScrollBarEnabled(false);
            moVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.qdl.lnr.qdl(moVar);
            moVar.rdp();
            moVar.setUserAgentString(exc.qdl(moVar.getWebView(), BuildConfig.VERSION_CODE));
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
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.lnr.lnr
    public void qdl(bjy bjyVar) {
        hkc hkcVar = this.mml;
        if (hkcVar != null) {
            hkcVar.qdl(bjyVar);
        }
    }

    public void qdl(boolean z2) {
        if (z2 == this.tvp) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", !z2 ? 1 : 0);
        } catch (Exception e2) {
            e2.getMessage();
        }
        this.mml.qdl("visibleStateChange", jSONObject);
        this.tvp = z2;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.rq
    public void qdl(View view, int i2, com.bytedance.sdk.component.adexpress.lnr lnrVar) {
        com.bytedance.sdk.openadsdk.core.rq.lnr.qdl qdlVar = this.mo;
        if (qdlVar != null) {
            qdlVar.qdl(view, i2, lnrVar);
        }
    }

    public void qdl(qdl qdlVar) {
        this.to = qdlVar;
    }
}
