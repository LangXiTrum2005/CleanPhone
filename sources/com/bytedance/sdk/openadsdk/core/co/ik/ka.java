package com.bytedance.sdk.openadsdk.core.co.ik;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.lr.bgr;
import com.bytedance.sdk.component.adexpress.lr.sf;
import com.bytedance.sdk.component.jbs.di;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.jbs.vr;
import com.bytedance.sdk.openadsdk.core.model.bu;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.ri.fi;
import com.bytedance.sdk.openadsdk.utils.srn;
import com.bytedance.sdk.openadsdk.utils.tan;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka implements sf, ik<di> {
    private com.bytedance.sdk.openadsdk.core.co.ik.ri di;
    private String fi;
    private di ik;
    private boolean jbs = false;
    private dzy ka;
    private wjv lr;
    private final boolean mj;
    private ri qt;
    private Context ri;
    private int xha;

    public interface ri {
        void xha();
    }

    public ka(Context context, wjv wjvVar, boolean z) {
        this.xha = 1;
        this.ri = context;
        this.lr = wjvVar;
        this.xha = wjvVar.bbu();
        this.mj = z;
        if (z) {
            this.fi = bu.lr(this.lr).ri(this.xha == 1);
        } else {
            this.fi = bu.ik(this.lr).ri(this.xha == 1);
        }
    }

    private void mj() {
        dzy dzyVar = new dzy(this.ri);
        this.ka = dzyVar;
        dzyVar.lr(this.ik).ri(this.lr).ik(this.lr.tn()).ka(this.lr.yjg()).fi(this.lr.uo()).ri(com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, this.lr, null, null)).ri(this).ri(this.ik);
    }

    private void xha() {
        ka kaVar;
        this.ik.setBackgroundColor(0);
        this.ik.setBackgroundResource(R.color.transparent);
        this.ik.setVisibility(8);
        ri(this.ik);
        if (this.lr != null) {
            kaVar = this;
            this.ik.setWebViewClient(new fi(this.ri, this.ka, this.lr.tn(), null, false) { // from class: com.bytedance.sdk.openadsdk.core.co.ik.ka.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (ka.this.qt != null) {
                        ka.this.qt.xha();
                    }
                }
            });
        } else {
            kaVar = this;
        }
        com.bytedance.sdk.component.adexpress.fi.fi.ri().ri(kaVar.ik, kaVar.ka);
        kaVar.ik.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ri.ka(kaVar.ka));
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.ik.ik
    /* JADX INFO: renamed from: di, reason: merged with bridge method [inline-methods] */
    public di ka() {
        return this.ik;
    }

    public dzy fi() {
        return this.ka;
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.ik.ik
    public void ik() {
        dzy dzyVar = this.ka;
        if (dzyVar != null) {
            dzyVar.ik();
        }
        this.ka = null;
        try {
            di diVar = this.ik;
            if (diVar != null) {
                ViewGroup viewGroup = (ViewGroup) diVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.ik);
                }
                this.ik.slm();
            }
        } catch (Throwable unused) {
        }
        if (this.qt != null) {
            this.qt = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.ik.ik
    public void lr() {
        if (TextUtils.isEmpty(this.fi)) {
            this.ik.setVisibility(8);
        } else {
            this.ik.a_(this.fi);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.sf
    public void ri(bgr bgrVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.ik.ik
    public void ri() {
        this.ik = new di(this.ri, di.ik.EASY_PLAYABLE);
        xha();
        mj();
        if (this.mj) {
            return;
        }
        srn.ri(this.ik, false, this.lr.go(), false, new srn.lr() { // from class: com.bytedance.sdk.openadsdk.core.co.ik.ka.1
            @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
            public void lr() {
                ka.this.ri(false);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
            public void ri(View view, boolean z) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
            public void ri(boolean z) {
                ka.this.ri(z);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
            public void ri() {
                ka.this.ri(true);
            }
        }, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.ik.ik
    public void ri(com.bytedance.sdk.openadsdk.core.co.ik.ri riVar) {
        this.di = riVar;
    }

    private void ri(di diVar) {
        if (diVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.ri.ik.ri(this.ri).ri(false).ri(diVar.getWebView());
            diVar.setVerticalScrollBarEnabled(false);
            diVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.ri.ik.ri(diVar);
            diVar.bgr();
            diVar.setUserAgentString(tan.ri(diVar.getWebView(), BuildConfig.VERSION_CODE));
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
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.ik.ik
    public void ri(vr vrVar) {
        dzy dzyVar = this.ka;
        if (dzyVar != null) {
            dzyVar.ri(vrVar);
        }
    }

    public void ri(boolean z) {
        if (z == this.jbs) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", !z ? 1 : 0);
        } catch (Exception e) {
            e.getMessage();
        }
        this.ka.ri("visibleStateChange", jSONObject);
        this.jbs = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.sf
    public void ri(View view, int i, com.bytedance.sdk.component.adexpress.ik ikVar) {
        com.bytedance.sdk.openadsdk.core.co.ik.ri riVar = this.di;
        if (riVar != null) {
            riVar.ri(view, i, ikVar);
        }
    }

    public void ri(ri riVar) {
        this.qt = riVar;
    }
}
