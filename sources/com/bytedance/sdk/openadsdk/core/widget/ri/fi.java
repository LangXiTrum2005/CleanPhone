package com.bytedance.sdk.openadsdk.core.widget.ri;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.nr;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.co;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.ka.aw;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.tan;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends com.bytedance.sdk.component.jbs.di.ri {
    private static final HashSet<String> ihz;
    private wjv ac;
    private com.bytedance.sdk.openadsdk.common.fi aw;
    private String bgr;
    private TTCeilingLandingPageActivity.ri bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18151co;
    protected aw di;
    protected final String fi;
    protected final dzy ik;
    protected boolean jbs;
    protected final Context ka;
    private String lr;
    protected boolean mj;
    private com.bytedance.sdk.openadsdk.core.bgr.ka.lr nr;
    private co qt;
    private final boolean ri;
    private Map<String, Object> sf;
    private boolean slm;
    private JSONObject tan;
    private final Stack<String> vr;
    protected boolean xha;

    static {
        HashSet<String> hashSet = new HashSet<>();
        ihz = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public fi(Context context, dzy dzyVar, String str, com.bytedance.sdk.openadsdk.common.fi fiVar, aw awVar, boolean z, boolean z2, TTCeilingLandingPageActivity.ri riVar) {
        this(context, dzyVar, str, fiVar, awVar, z);
        this.slm = z2;
        this.bu = riVar;
    }

    private boolean fi(String str) {
        if (ac.qt(this.ac)) {
            return TextUtils.equals(this.ac.wd(), str);
        }
        return false;
    }

    public static String ka(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !ihz.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(strSubstring);
    }

    public void ik() {
        if (TextUtils.isEmpty(this.lr) || !ac.jbs(this.ac) || this.f18151co) {
            return;
        }
        co coVar = this.qt;
        if (coVar != null) {
            com.bytedance.sdk.openadsdk.ka.ik.ri("click", this.ac, coVar, this.lr, true, this.sf, 1);
            this.f18151co = true;
            return;
        }
        JSONObject jSONObject = this.tan;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.ka.ik.ri(this.ac, this.lr, "click", jSONObject);
            this.f18151co = true;
        }
    }

    public aw lr() {
        return this.di;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        aw awVar = this.di;
        if (awVar != null) {
            awVar.ri(webView, str, this.ri);
        }
        com.bytedance.sdk.openadsdk.common.fi fiVar = this.aw;
        if (fiVar != null) {
            fiVar.lr(webView, str, this.ri);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebView webView2;
        String str2;
        wjv wjvVar;
        super.onPageStarted(webView, str, bitmap);
        wjv wjvVar2 = this.ac;
        int iRi = (wjvVar2 != null && wjvVar2.evm() && com.bytedance.sdk.openadsdk.wjv.fi.ri("opt_web_index", false)) ? ig.ri(webView) : -1;
        aw awVar = this.di;
        if (awVar != null) {
            webView2 = webView;
            str2 = str;
            awVar.ri(webView2, str2, bitmap, this.ri, iRi);
        } else {
            webView2 = webView;
            str2 = str;
        }
        com.bytedance.sdk.openadsdk.common.fi fiVar = this.aw;
        if (fiVar != null) {
            fiVar.ik(webView2, str2, this.ri);
        }
        if (this.ri && (wjvVar = this.ac) != null && wjvVar.evm() && this.ac.fr().lr() >= 2) {
            if (!TextUtils.isEmpty(str2) && !str2.equals(this.bgr)) {
                if (this.vr.contains(str2)) {
                    while (!str2.equals(this.vr.peek())) {
                        this.vr.pop();
                    }
                } else {
                    this.vr.push(str2);
                }
            }
            this.bgr = str2;
        }
        if (!this.mj || this.jbs) {
            return;
        }
        this.jbs = true;
        ik.ri(this.ka).ri(true).lr(webView2.getSettings().getBuiltInZoomControls()).ri(webView2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.di == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.di.ri(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.di != null) {
            int primaryError = 0;
            String strConcat = "SslError: unknown";
            String url = null;
            if (sslError != null) {
                try {
                    primaryError = sslError.getPrimaryError();
                    strConcat = "SslError: ".concat(String.valueOf(sslError));
                    url = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str = url;
            this.di.ri(webView, primaryError, strConcat, str, ka(str), true);
        }
    }

    @Override // com.bytedance.sdk.component.jbs.di.ri, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.fi.fi.ri().lr();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, final String str) {
        fi fiVar;
        String str2;
        dzy dzyVar;
        Intent uri;
        aw awVar = this.di;
        if (awVar != null) {
            awVar.ri(str, this.ri);
        }
        com.bytedance.sdk.openadsdk.common.fi fiVar2 = this.aw;
        if (fiVar2 != null) {
            fiVar2.ri(webView, str, this.ri);
        }
        if (ri(webView, str)) {
            return true;
        }
        wjv wjvVar = this.ac;
        if (wjvVar != null && wjvVar.nr() == 1 && ((com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.ri(str, this.ac) || com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.ri(this.ac, str)) && com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.lr(this.ac, this.ka, true))) {
            return true;
        }
        try {
            Uri uri2 = Uri.parse(str);
            final String lowerCase = uri2.getScheme().toLowerCase();
            if ("bytedance".equals(lowerCase)) {
                tan.ri(uri2, this.ik);
                return true;
            }
            if (ik(str)) {
                return true;
            }
            if (nr.ri(str)) {
                str2 = str;
                return super.shouldOverrideUrlLoading(webView, str2);
            }
            if (ac.qt(this.ac)) {
                ri(lowerCase, str);
                return true;
            }
            try {
                if (str.startsWith("intent:")) {
                    uri = Intent.parseUri(str, 1);
                } else if (str.startsWith("android-app:")) {
                    uri = Intent.parseUri(str, 2);
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(uri2);
                    uri = intent;
                }
                uri.addFlags(268435456);
                com.bytedance.sdk.component.utils.lr.ri(this.ka, uri, new com.bytedance.sdk.component.utils.lr.InterfaceC0216lr() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.fi.1
                    @Override // com.bytedance.sdk.component.utils.lr.InterfaceC0216lr
                    public void ri() {
                        fi.this.ri(lowerCase, true, 0, "", str);
                    }

                    @Override // com.bytedance.sdk.component.utils.lr.InterfaceC0216lr
                    public void ri(Throwable th) {
                        fi.this.ri(lowerCase, false, 2, th.getMessage(), str);
                    }
                });
                fiVar = this;
                str2 = str;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ri("WebChromeClient", "parseUri", th);
                fiVar = this;
                str2 = str;
                try {
                    fiVar.ri(lowerCase, false, 1, th.getMessage(), str2);
                } catch (Throwable unused) {
                    dzyVar = fiVar.ik;
                    if (dzyVar != null) {
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView, str2);
                }
            }
            com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar = fiVar.nr;
            if (lrVar != null) {
                lrVar.zb();
            }
            return true;
        } catch (Throwable unused2) {
            fiVar = this;
            str2 = str;
            dzyVar = fiVar.ik;
            if (dzyVar != null && dzyVar.fi()) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str2);
        }
    }

    public boolean lr(String str) {
        String strIk;
        String strRi;
        if (this.ka == null) {
            return false;
        }
        wjv wjvVar = this.ac;
        if (wjvVar == null || wjvVar.tyz() == null) {
            strIk = "";
            strRi = "";
        } else {
            strIk = this.ac.tyz().ik();
            strRi = this.ac.tyz().ri();
        }
        Context context = this.ka;
        wjv wjvVar2 = this.ac;
        return com.bytedance.sdk.openadsdk.ihz.ri.ri.ri.ri(context, str, wjvVar2, ig.lr(wjvVar2), null, true) || com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.ri(this.ac, strIk, this.ka, this.lr, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.ri(this.ka, strRi, strIk, this.lr, this.ac);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.di == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.di.ri(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, str, webResourceRequest.isForMainFrame());
    }

    public void ri(co coVar) {
        this.qt = coVar;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        aw awVar = this.di;
        if (awVar != null) {
            awVar.lr(webView, str, this.ri);
        }
        com.bytedance.sdk.openadsdk.common.fi fiVar = this.aw;
        if (fiVar != null) {
            fiVar.ri(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public void ri(Map<String, Object> map) {
        this.sf = map;
    }

    public fi(Context context, dzy dzyVar, String str, com.bytedance.sdk.openadsdk.common.fi fiVar, aw awVar, boolean z) {
        this(context, dzyVar, str, awVar, z);
        this.aw = fiVar;
    }

    public void ri(JSONObject jSONObject) {
        this.tan = jSONObject;
    }

    public void ri(String str) {
        this.lr = str;
    }

    public fi(Context context, dzy dzyVar, String str, aw awVar, boolean z) {
        this.xha = true;
        this.mj = true;
        this.jbs = false;
        this.ka = context;
        this.ik = dzyVar;
        this.fi = str;
        this.di = awVar;
        this.ri = z;
        this.vr = new Stack<>();
    }

    public void ri(wjv wjvVar) {
        this.ac = wjvVar;
    }

    private void ri(String str, String str2) {
        if ((fi(str) || "market".equals(str)) && ((this.qt != null || this.tan != null) && lr(str2))) {
            ik();
        }
        this.qt = null;
        this.tan = null;
    }

    public boolean ik(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (ac.qt(this.ac) && this.tan == null && this.qt == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.ka instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                this.ka.startActivity(intent);
                ik();
                this.tan = null;
                this.qt = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean ri(WebView webView, String str) {
        if (!ig.ka(this.ac) || this.ac.fr() == null || webView == null) {
            return false;
        }
        int iLr = this.ac.fr().lr();
        int size = this.vr.size();
        if (this.slm) {
            size++;
        }
        if (size + 1 != iLr) {
            return false;
        }
        com.bytedance.sdk.openadsdk.utils.wjv.ri(this.ka, str, this.ac, com.bytedance.sdk.openadsdk.ka.lr.ri.ka, true);
        TTCeilingLandingPageActivity.ri riVar = this.bu;
        if (riVar != null) {
            riVar.ri();
        }
        return true;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar) {
        this.nr = lrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final String str, final boolean z, final int i, final String str2, final String str3) {
        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), this.ac, this.lr, "lp_not_http_open", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.fi.2
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z);
                    jSONObject.put("error_type", i);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
