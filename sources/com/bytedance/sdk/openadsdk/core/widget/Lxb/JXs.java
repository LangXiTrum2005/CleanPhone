package com.bytedance.sdk.openadsdk.core.widget.Lxb;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.openadsdk.ZU.JVA;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.model.kqm;
import com.bytedance.sdk.openadsdk.core.model.nBu;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.DY;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends com.bytedance.sdk.component.QAg.ZU.Lxb {
    private static final HashSet<String> DY;
    private final Stack<String> IeN;
    private Map<String, Object> JVA;
    protected final String JXs;
    private String LD;
    private final boolean Lxb;
    private com.bytedance.sdk.openadsdk.common.ZU NXR;
    protected boolean OY;
    protected boolean QAg;
    private String STP;
    private boolean VVE;
    protected final Context ZU;
    private JSONObject brP;
    protected boolean ebl;
    private TTCeilingLandingPageActivity.Lxb kqm;
    protected JVA lc;
    protected final Ivz lk;
    private nBu nBu;
    private boolean sLN;
    private tD tD;

    static {
        HashSet<String> hashSet = new HashSet<>();
        DY = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public JXs(Context context, Ivz ivz, String str, com.bytedance.sdk.openadsdk.common.ZU zu, JVA jva, boolean z, boolean z2, TTCeilingLandingPageActivity.Lxb lxb) {
        this(context, ivz, str, zu, jva, z);
        this.VVE = z2;
        this.kqm = lxb;
    }

    private boolean JXs(String str) {
        if (kqm.OY(this.tD)) {
            return TextUtils.equals(this.tD.Mx(), str);
        }
        return false;
    }

    public static String ZU(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !DY.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(strSubstring);
    }

    public boolean LD(String str) {
        String strLk;
        String strLxb;
        if (this.ZU == null) {
            return false;
        }
        tD tDVar = this.tD;
        if (tDVar == null || tDVar.MGT() == null) {
            strLk = "";
            strLxb = "";
        } else {
            strLk = this.tD.MGT().lk();
            strLxb = this.tD.MGT().Lxb();
        }
        if (!com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lk.Lxb()) {
            return com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.Lxb.Lxb(str, this.ZU, this.LD, this.tD, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.Lxb.Lxb(this.tD, strLk, this.ZU, this.LD, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ZU.Lxb(this.ZU, strLxb, strLk, this.LD, this.tD);
        }
        Context context = this.ZU;
        tD tDVar2 = this.tD;
        return com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lk.Lxb(context, str, tDVar2, nJ.LD(tDVar2), null, true) || com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.JXs.Lxb(this.tD, strLk, this.ZU, this.LD, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.JXs.Lxb(this.ZU, strLxb, strLk, this.LD, this.tD);
    }

    public void Lxb(nBu nbu) {
        this.nBu = nbu;
    }

    public boolean lk(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (kqm.OY(this.tD) && this.brP == null && this.nBu == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.ZU instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                this.ZU.startActivity(intent);
                LD();
                this.brP = null;
                this.nBu = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        JVA jva = this.lc;
        if (jva != null) {
            jva.Lxb(webView, str, this.Lxb);
        }
        com.bytedance.sdk.openadsdk.common.ZU zu = this.NXR;
        if (zu != null) {
            zu.LD(webView, str, this.Lxb);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        tD tDVar;
        super.onPageStarted(webView, str, bitmap);
        tD tDVar2 = this.tD;
        int iLxb = (tDVar2 != null && tDVar2.Ld() && com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("opt_web_index", false)) ? nJ.Lxb(webView) : -1;
        JVA jva = this.lc;
        if (jva != null) {
            jva.Lxb(webView, str, bitmap, this.Lxb, iLxb);
        }
        com.bytedance.sdk.openadsdk.common.ZU zu = this.NXR;
        if (zu != null) {
            zu.lk(webView, str, this.Lxb);
        }
        if (this.Lxb && (tDVar = this.tD) != null && tDVar.Ld() && this.tD.JVA().LD() >= 2) {
            if (!TextUtils.isEmpty(str) && !str.equals(this.STP)) {
                if (this.IeN.contains(str)) {
                    while (!str.equals(this.IeN.peek())) {
                        this.IeN.pop();
                    }
                } else {
                    this.IeN.push(str);
                }
            }
            this.STP = str;
        }
        if (!this.OY || this.QAg) {
            return;
        }
        this.QAg = true;
        lk.Lxb(this.ZU).Lxb(true).LD(webView.getSettings().getBuiltInZoomControls()).Lxb(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (Build.VERSION.SDK_INT < 23 && this.lc != null) {
            this.lc.Lxb(webView, i, str, str2, ZU(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.lc == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.lc.Lxb(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.lc != null) {
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
            this.lc.Lxb(webView, primaryError, strConcat, str, ZU(str), true);
        }
    }

    @Override // com.bytedance.sdk.component.QAg.ZU.Lxb, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().LD();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        JVA jva = this.lc;
        if (jva != null) {
            jva.Lxb(str, this.Lxb);
        }
        com.bytedance.sdk.openadsdk.common.ZU zu = this.NXR;
        if (zu != null) {
            zu.Lxb(webView, str, this.Lxb);
        }
        if (Lxb(webView, str)) {
            return true;
        }
        try {
            Uri uri = Uri.parse(str);
            String lowerCase = uri.getScheme().toLowerCase();
            if ("bytedance".equals(lowerCase)) {
                com.bytedance.sdk.openadsdk.utils.kqm.Lxb(uri, this.lk);
                return true;
            }
            if (lk(str)) {
                return true;
            }
            if (!IeN.Lxb(str)) {
                if (kqm.OY(this.tD)) {
                    Lxb(lowerCase, str);
                    return true;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(uri);
                    intent.addFlags(268435456);
                    com.bytedance.sdk.component.utils.LD.Lxb(this.ZU, intent, null);
                } catch (Throwable unused) {
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        } catch (Throwable unused2) {
            Ivz ivz = this.lk;
            if (ivz != null && ivz.ZU()) {
                return true;
            }
        }
    }

    public void Lxb(Map<String, Object> map) {
        this.JVA = map;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        JVA jva = this.lc;
        if (jva != null) {
            jva.LD(webView, str, this.Lxb);
        }
        com.bytedance.sdk.openadsdk.common.ZU zu = this.NXR;
        if (zu != null) {
            zu.Lxb(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public void Lxb(JSONObject jSONObject) {
        this.brP = jSONObject;
    }

    public JXs(Context context, Ivz ivz, String str, com.bytedance.sdk.openadsdk.common.ZU zu, JVA jva, boolean z) {
        this(context, ivz, str, jva, z);
        this.NXR = zu;
    }

    public void Lxb(String str) {
        this.LD = str;
    }

    public void Lxb(tD tDVar) {
        this.tD = tDVar;
    }

    public JXs(Context context, Ivz ivz, String str, JVA jva, boolean z) {
        this.ebl = true;
        this.OY = true;
        this.QAg = false;
        this.ZU = context;
        this.lk = ivz;
        this.JXs = str;
        this.lc = jva;
        this.Lxb = z;
        this.IeN = new Stack<>();
    }

    private void Lxb(String str, String str2) {
        if ((JXs(str) || "market".equals(str)) && ((this.nBu != null || this.brP != null) && LD(str2))) {
            LD();
        }
        this.nBu = null;
        this.brP = null;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (Build.VERSION.SDK_INT < 23 || this.lc == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String str = "";
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders.containsKey("accept")) {
            str = requestHeaders.get("accept");
        }
        this.lc.Lxb(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, str, webResourceRequest.isForMainFrame());
    }

    private boolean Lxb(WebView webView, String str) {
        if (!nJ.ZU(this.tD) || this.tD.JVA() == null || webView == null) {
            return false;
        }
        int iLD = this.tD.JVA().LD();
        int size = this.IeN.size();
        if (this.VVE) {
            size++;
        }
        if (size + 1 != iLD) {
            return false;
        }
        DY.Lxb(this.ZU, str, this.tD, com.bytedance.sdk.openadsdk.ZU.LD.Lxb.ZU);
        TTCeilingLandingPageActivity.Lxb lxb = this.kqm;
        if (lxb != null) {
            lxb.Lxb();
        }
        return true;
    }

    public void LD() {
        if (TextUtils.isEmpty(this.LD) || !kqm.ebl(this.tD) || this.sLN) {
            return;
        }
        nBu nbu = this.nBu;
        if (nbu != null) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.tD, nbu, this.LD, true, this.JVA, 1);
            this.sLN = true;
            return;
        }
        JSONObject jSONObject = this.brP;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.tD, this.LD, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
            this.sLN = true;
        }
    }
}
