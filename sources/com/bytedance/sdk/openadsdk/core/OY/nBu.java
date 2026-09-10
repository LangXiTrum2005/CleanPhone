package com.bytedance.sdk.openadsdk.core.OY;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class nBu extends com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs {
    private final com.bytedance.sdk.openadsdk.core.model.tD LD;
    public ArrayList<Integer> Lxb;
    private com.bytedance.sdk.component.adexpress.LD.NXR nBu;

    public nBu(Context context, Ivz ivz, com.bytedance.sdk.openadsdk.core.model.tD tDVar, com.bytedance.sdk.openadsdk.ZU.JVA jva, com.bytedance.sdk.component.adexpress.LD.NXR nxr) {
        super(context, ivz, tDVar.bG(), jva, false);
        this.Lxb = new ArrayList<>();
        this.LD = tDVar;
        this.nBu = nxr;
    }

    private WebResourceResponse JXs(String str) {
        InputStream inputStreamLxb;
        if (TextUtils.isEmpty(str) || (inputStreamLxb = com.bytedance.sdk.openadsdk.core.ZU.Lxb.Lxb().Lxb(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", C.UTF8_NAME, inputStreamLxb);
        Lxb(webResourceResponse);
        return webResourceResponse;
    }

    private WebResourceResponse ZU() {
        InputStream inputStreamOpenRawResource;
        int iEbl = com.bytedance.sdk.openadsdk.core.QAg.LD().ebl();
        if (iEbl == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.kqm.Lxb().getResources();
        if (resources != null) {
            try {
                inputStreamOpenRawResource = resources.openRawResource(iEbl);
            } catch (Resources.NotFoundException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("ExpressClient", e.toString());
                inputStreamOpenRawResource = null;
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new WebResourceResponse(com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb.IMAGE.Lxb(), C.UTF8_NAME, inputStreamOpenRawResource);
        }
        return null;
    }

    private String lk() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.LD;
        if (tDVar == null) {
            return null;
        }
        if (tDVar.rW() != null) {
            return this.LD.rW().NXR();
        }
        if (this.LD.dR() != null) {
            return "v3";
        }
        return null;
    }

    public int Lxb() {
        for (Integer num : this.Lxb) {
            if (num.intValue() == 3 || num.intValue() == 2 || num.intValue() == -1) {
                return num.intValue();
            }
        }
        return TextUtils.isEmpty(lk()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.ebl = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.OY = false;
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.Lxb.LD.Lxb Lxb = Lxb(webView, str);
            Lxb(jCurrentTimeMillis, System.currentTimeMillis(), str, (Lxb == null || Lxb.Lxb() == null) ? 2 : 1);
            if (Lxb != null && Lxb.LD() != 5) {
                Lxb.LD();
                this.Lxb.add(Integer.valueOf(Lxb.LD()));
            }
            if (Lxb != null && Lxb.Lxb() != null) {
                return Lxb.Lxb();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("ExpressClient", "shouldInterceptRequest error2", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    private com.bytedance.sdk.component.adexpress.Lxb.LD.Lxb Lxb(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.IeN ieN = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.equals("local://pag_open_icon_id") && !str.equals(com.bytedance.sdk.openadsdk.core.OY.Lxb.LD.Lxb)) {
            com.bytedance.sdk.openadsdk.core.model.tD.Lxb lxbRW = this.LD.rW();
            if (lxbRW != null && !TextUtils.isEmpty(str) && str.equals(lxbRW.ZU())) {
                com.bytedance.sdk.component.adexpress.Lxb.LD.Lxb lxb = new com.bytedance.sdk.component.adexpress.Lxb.LD.Lxb();
                lxb.Lxb(5);
                WebResourceResponse webResourceResponseJXs = JXs(str);
                lxb.Lxb(webResourceResponseJXs);
                com.bytedance.sdk.openadsdk.core.ZU.Lxb.Lxb().Lxb(webResourceResponseJXs != null);
                return lxb;
            }
            com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb Lxb = com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb(str);
            if (Lxb != com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb.IMAGE) {
                for (com.bytedance.sdk.openadsdk.core.model.IeN ieN2 : this.LD.uxf()) {
                    if (!TextUtils.isEmpty(ieN2.Lxb()) && !TextUtils.isEmpty(str)) {
                        String strLxb = ieN2.Lxb();
                        if (strLxb.startsWith("https")) {
                            strLxb = strLxb.replaceFirst("https", ProxyConfig.MATCH_HTTP);
                        }
                        if ((str.startsWith("https") ? str.replaceFirst("https", ProxyConfig.MATCH_HTTP) : str).equals(strLxb)) {
                            ieN = ieN2;
                            break;
                        }
                    }
                }
            }
            if (Lxb != com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb.IMAGE && ieN == null) {
                return com.bytedance.sdk.component.adexpress.Lxb.LD.LD.Lxb(str, Lxb, "", lk());
            }
            com.bytedance.sdk.component.adexpress.Lxb.LD.Lxb lxb2 = new com.bytedance.sdk.component.adexpress.Lxb.LD.Lxb();
            lxb2.Lxb(5);
            lxb2.Lxb(Lxb(str, com.bytedance.sdk.openadsdk.core.OY.Lxb.LD.Lxb(this.LD, str)));
            return lxb2;
        }
        com.bytedance.sdk.component.adexpress.Lxb.LD.Lxb lxb3 = new com.bytedance.sdk.component.adexpress.Lxb.LD.Lxb();
        lxb3.Lxb(5);
        lxb3.Lxb(ZU());
        return lxb3;
    }

    private WebResourceResponse Lxb(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamLxb = com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(str, str2);
            if (inputStreamLxb == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb.IMAGE.Lxb(), "utf-8", inputStreamLxb);
            try {
                Lxb(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th) {
                th = th;
                webResourceResponse = webResourceResponse2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        com.bytedance.sdk.component.utils.sLN.Lxb("ExpressClient", "get image WebResourceResponse error", th);
        return webResourceResponse;
    }

    private void Lxb(long j, long j2, String str, int i) {
        com.bytedance.sdk.openadsdk.ZU.JVA jva = this.lc;
        if (jva == null || jva.LD() == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb Lxb = com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb(str);
        if (Lxb == com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb.HTML) {
            this.lc.LD().Lxb(str, j, j2, i);
        } else if (Lxb == com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb.JS) {
            this.lc.LD().LD(str, j, j2, i);
        }
    }

    private void Lxb(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(HttpResponseHeader.AccessControlAllowOrigin, ProxyConfig.MATCH_ALL_SCHEMES);
        webResourceResponse.setResponseHeaders(map);
    }
}
