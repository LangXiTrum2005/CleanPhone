package com.bytedance.sdk.openadsdk.core.widget.qdl;

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
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.mml.fs;
import com.bytedance.sdk.openadsdk.utils.exc;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.oth;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends com.bytedance.sdk.component.tvp.mo.qdl {
    private static final HashSet<String> jyq;
    private ljh aaj;
    private final Stack<String> bjy;
    private JSONObject exc;
    private com.bytedance.sdk.openadsdk.common.mml exu;
    private boolean fs;
    private com.bytedance.sdk.openadsdk.core.exu.mml.ud jl;
    protected boolean jpc;
    private boolean jtx;
    protected final hkc lnr;
    protected final Context mml;
    protected fs mo;
    protected final String mzz;
    private final boolean qdl;
    private String rdp;
    private Map<String, Object> rq;
    private com.bytedance.sdk.openadsdk.core.model.fs to;
    protected boolean tvp;
    private String ud;
    protected boolean wd;
    private TTCeilingLandingPageActivity.qdl yt;

    static {
        HashSet<String> hashSet = new HashSet<>();
        jyq = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public mzz(Context context, hkc hkcVar, String str, com.bytedance.sdk.openadsdk.common.mml mmlVar, fs fsVar, boolean z2, boolean z3, TTCeilingLandingPageActivity.qdl qdlVar) {
        this(context, hkcVar, str, mmlVar, fsVar, z2);
        this.jtx = z3;
        this.yt = qdlVar;
    }

    public static String mml(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !jyq.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(strSubstring);
    }

    private boolean mzz(String str) {
        if (aaj.to(this.aaj)) {
            return TextUtils.equals(this.aaj.op(), str);
        }
        return false;
    }

    public void lnr() {
        if (TextUtils.isEmpty(this.ud) || !aaj.tvp(this.aaj) || this.fs) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.fs fsVar = this.to;
        if (fsVar != null) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", this.aaj, fsVar, this.ud, true, this.rq, 1);
            this.fs = true;
            return;
        }
        JSONObject jSONObject = this.exc;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.aaj, this.ud, "click", jSONObject);
            this.fs = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        fs fsVar = this.mo;
        if (fsVar != null) {
            fsVar.qdl(webView, str, this.qdl);
        }
        com.bytedance.sdk.openadsdk.common.mml mmlVar = this.exu;
        if (mmlVar != null) {
            mmlVar.ud(webView, str, this.qdl);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebView webView2;
        String str2;
        ljh ljhVar;
        super.onPageStarted(webView, str, bitmap);
        ljh ljhVar2 = this.aaj;
        int iQdl = (ljhVar2 != null && ljhVar2.se() && com.bytedance.sdk.openadsdk.jyq.qdl.qdl("opt_web_index", false)) ? gy.qdl(webView) : -1;
        fs fsVar = this.mo;
        if (fsVar != null) {
            webView2 = webView;
            str2 = str;
            fsVar.qdl(webView2, str2, bitmap, this.qdl, iQdl);
        } else {
            webView2 = webView;
            str2 = str;
        }
        com.bytedance.sdk.openadsdk.common.mml mmlVar = this.exu;
        if (mmlVar != null) {
            mmlVar.lnr(webView2, str2, this.qdl);
        }
        if (this.qdl && (ljhVar = this.aaj) != null && ljhVar.se() && this.aaj.jyq().ud() >= 2) {
            if (!TextUtils.isEmpty(str2) && !str2.equals(this.rdp)) {
                if (this.bjy.contains(str2)) {
                    while (!str2.equals(this.bjy.peek())) {
                        this.bjy.pop();
                    }
                } else {
                    this.bjy.push(str2);
                }
            }
            this.rdp = str2;
        }
        if (!this.jpc || this.tvp) {
            return;
        }
        this.tvp = true;
        lnr.qdl(this.mml).qdl(true).ud(webView2.getSettings().getBuiltInZoomControls()).qdl(webView2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.mo == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.mo.qdl(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.mo != null) {
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
            this.mo.qdl(webView, primaryError, strConcat, str, mml(str), true);
        }
    }

    @Override // com.bytedance.sdk.component.tvp.mo.qdl, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().ud();
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
        mzz mzzVar;
        String str2;
        hkc hkcVar;
        Intent uri;
        fs fsVar = this.mo;
        if (fsVar != null) {
            fsVar.qdl(str, this.qdl);
        }
        com.bytedance.sdk.openadsdk.common.mml mmlVar = this.exu;
        if (mmlVar != null) {
            mmlVar.qdl(webView, str, this.qdl);
        }
        if (qdl(webView, str)) {
            return true;
        }
        ljh ljhVar = this.aaj;
        if (ljhVar != null && ljhVar.rdp() == 1 && ((com.bytedance.sdk.openadsdk.exc.qdl.qdl.mzz.qdl(str, this.aaj) || com.bytedance.sdk.openadsdk.exc.qdl.qdl.mzz.qdl(this.aaj, str)) && com.bytedance.sdk.openadsdk.exc.qdl.qdl.mzz.ud(this.aaj, this.mml, true))) {
            return true;
        }
        try {
            Uri uri2 = Uri.parse(str);
            final String lowerCase = uri2.getScheme().toLowerCase();
            if ("bytedance".equals(lowerCase)) {
                exc.qdl(uri2, this.lnr);
                return true;
            }
            if (lnr(str)) {
                return true;
            }
            if (jl.qdl(str)) {
                str2 = str;
                return super.shouldOverrideUrlLoading(webView, str2);
            }
            if (aaj.to(this.aaj)) {
                qdl(lowerCase, str);
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
                com.bytedance.sdk.component.utils.ud.qdl(this.mml, uri, new com.bytedance.sdk.component.utils.ud.InterfaceC0095ud() { // from class: com.bytedance.sdk.openadsdk.core.widget.qdl.mzz.1
                    @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0095ud
                    public void qdl() {
                        mzz.this.qdl(lowerCase, true, 0, "", str);
                    }

                    @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0095ud
                    public void qdl(Throwable th) {
                        mzz.this.qdl(lowerCase, false, 2, th.getMessage(), str);
                    }
                });
                mzzVar = this;
                str2 = str;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.qdl("WebChromeClient", "parseUri", th);
                mzzVar = this;
                str2 = str;
                try {
                    mzzVar.qdl(lowerCase, false, 1, th.getMessage(), str2);
                } catch (Throwable unused) {
                    hkcVar = mzzVar.lnr;
                    if (hkcVar != null) {
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView, str2);
                }
            }
            com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar = mzzVar.jl;
            if (udVar != null) {
                udVar.yt();
            }
            return true;
        } catch (Throwable unused2) {
            mzzVar = this;
            str2 = str;
            hkcVar = mzzVar.lnr;
            if (hkcVar != null && hkcVar.mzz()) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str2);
        }
    }

    public fs ud() {
        return this.mo;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.mo == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.mo.qdl(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, str, webResourceRequest.isForMainFrame());
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.fs fsVar) {
        this.to = fsVar;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        fs fsVar = this.mo;
        if (fsVar != null) {
            fsVar.ud(webView, str, this.qdl);
        }
        com.bytedance.sdk.openadsdk.common.mml mmlVar = this.exu;
        if (mmlVar != null) {
            mmlVar.qdl(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public boolean ud(String str) {
        String strLnr;
        String strQdl;
        if (this.mml == null) {
            return false;
        }
        ljh ljhVar = this.aaj;
        if (ljhVar == null || ljhVar.fhs() == null) {
            strLnr = "";
            strQdl = "";
        } else {
            strLnr = this.aaj.fhs().lnr();
            strQdl = this.aaj.fhs().qdl();
        }
        if (!com.bytedance.sdk.openadsdk.exc.qdl.qdl.lnr.qdl()) {
            return com.bytedance.sdk.openadsdk.exc.qdl.qdl.qdl.qdl(str, this.mml, this.ud, this.aaj, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.exc.qdl.qdl.qdl.qdl(this.aaj, strLnr, this.mml, this.ud, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.exc.qdl.qdl.mml.qdl(this.mml, strQdl, strLnr, this.ud, this.aaj);
        }
        Context context = this.mml;
        ljh ljhVar2 = this.aaj;
        return com.bytedance.sdk.openadsdk.exc.qdl.qdl.lnr.qdl(context, str, ljhVar2, gy.ud(ljhVar2), null, true) || com.bytedance.sdk.openadsdk.exc.qdl.qdl.mzz.qdl(this.aaj, strLnr, this.mml, this.ud, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.exc.qdl.qdl.mzz.qdl(this.mml, strQdl, strLnr, this.ud, this.aaj);
    }

    public void qdl(Map<String, Object> map) {
        this.rq = map;
    }

    public mzz(Context context, hkc hkcVar, String str, com.bytedance.sdk.openadsdk.common.mml mmlVar, fs fsVar, boolean z2) {
        this(context, hkcVar, str, fsVar, z2);
        this.exu = mmlVar;
    }

    public void qdl(JSONObject jSONObject) {
        this.exc = jSONObject;
    }

    public void qdl(String str) {
        this.ud = str;
    }

    public mzz(Context context, hkc hkcVar, String str, fs fsVar, boolean z2) {
        this.wd = true;
        this.jpc = true;
        this.tvp = false;
        this.mml = context;
        this.lnr = hkcVar;
        this.mzz = str;
        this.mo = fsVar;
        this.qdl = z2;
        this.bjy = new Stack<>();
    }

    public void qdl(ljh ljhVar) {
        this.aaj = ljhVar;
    }

    private void qdl(String str, String str2) {
        if ((mzz(str) || "market".equals(str)) && ((this.to != null || this.exc != null) && ud(str2))) {
            lnr();
        }
        this.to = null;
        this.exc = null;
    }

    public boolean lnr(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (aaj.to(this.aaj) && this.exc == null && this.to == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.mml instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                this.mml.startActivity(intent);
                lnr();
                this.exc = null;
                this.to = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean qdl(WebView webView, String str) {
        if (!gy.mml(this.aaj) || this.aaj.jyq() == null || webView == null) {
            return false;
        }
        int iUd = this.aaj.jyq().ud();
        int size = this.bjy.size();
        if (this.jtx) {
            size++;
        }
        if (size + 1 != iUd) {
            return false;
        }
        oth.qdl(this.mml, str, this.aaj, com.bytedance.sdk.openadsdk.mml.ud.qdl.mml);
        TTCeilingLandingPageActivity.qdl qdlVar = this.yt;
        if (qdlVar != null) {
            qdlVar.qdl();
        }
        return true;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        this.jl = udVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final String str, final boolean z2, final int i2, final String str2, final String str3) {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), this.aaj, this.ud, "lp_not_http_open", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.core.widget.qdl.mzz.2
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z2);
                    jSONObject.put("error_type", i2);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
