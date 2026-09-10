package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.ekw;
import com.smartdigimkt.b0.a;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public class to extends com.bytedance.sdk.openadsdk.core.widget.qdl.mzz {
    public ArrayList<Integer> qdl;
    private boolean rq;
    private com.bytedance.sdk.component.adexpress.ud.exu to;
    private final com.bytedance.sdk.openadsdk.core.model.ljh ud;

    public to(Context context, hkc hkcVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, com.bytedance.sdk.openadsdk.mml.fs fsVar, com.bytedance.sdk.component.adexpress.ud.exu exuVar) {
        super(context, hkcVar, ljhVar.yre(), fsVar, false);
        this.rq = false;
        this.qdl = new ArrayList<>();
        this.ud = ljhVar;
        this.to = exuVar;
        this.rq = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("inject_data_normal_open", 0) == 1;
    }

    private com.bytedance.sdk.component.adexpress.qdl.ud.qdl lnr(String str, com.bytedance.sdk.component.adexpress.mml.tvp.qdl qdlVar) {
        ekw.qdl qdlVarMo;
        JSONArray jSONArrayLnr;
        ekw ekwVarKr = this.ud.kr();
        if (ekwVarKr == null || (qdlVarMo = ekwVarKr.mo()) == null || (jSONArrayLnr = qdlVarMo.lnr()) == null || jSONArrayLnr.length() <= 0) {
            return null;
        }
        return qdl(jSONArrayLnr, str, qdlVar);
    }

    private WebResourceResponse mml(String str, com.bytedance.sdk.component.adexpress.mml.tvp.qdl qdlVar) {
        InputStream inputStreamUd;
        if (TextUtils.isEmpty(str) || (inputStreamUd = rdp.ud(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(qdlVar.qdl(), "UTF-8", inputStreamUd);
        qdl(webResourceResponse);
        return webResourceResponse;
    }

    private WebResourceResponse mzz() {
        InputStream inputStreamOpenRawResource;
        int iTvp = com.bytedance.sdk.openadsdk.core.tvp.ud().tvp();
        if (iTvp == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.yt.qdl().getResources();
        if (resources != null) {
            try {
                inputStreamOpenRawResource = resources.openRawResource(iTvp);
            } catch (Resources.NotFoundException e2) {
                com.bytedance.sdk.component.utils.aaj.lnr("ExpressClient", e2.toString());
                inputStreamOpenRawResource = null;
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new WebResourceResponse(com.bytedance.sdk.component.adexpress.mml.tvp.qdl.IMAGE.qdl(), "UTF-8", inputStreamOpenRawResource);
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.qdl.ud.qdl ud(String str, com.bytedance.sdk.component.adexpress.mml.tvp.qdl qdlVar) {
        ekw.qdl qdlVarMo;
        JSONArray jSONArrayUd;
        ekw ekwVarKr = this.ud.kr();
        if (ekwVarKr == null || (qdlVarMo = ekwVarKr.mo()) == null || (jSONArrayUd = qdlVarMo.ud()) == null || jSONArrayUd.length() <= 0) {
            return null;
        }
        return qdl(jSONArrayUd, str, qdlVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.wd = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.jpc = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.ud.exu exuVar = this.to;
        if (exuVar != null && exuVar.ljh() && this.rq) {
            this.to.lnr();
            com.bytedance.sdk.component.utils.rdp.qdl(webView, "javascript:window.SDK_INJECT_DATA=" + this.to.lnr());
        }
    }

    public int qdl() {
        for (Integer num : this.qdl) {
            if (num.intValue() == 3 || num.intValue() == 2 || num.intValue() == -1) {
                return num.intValue();
            }
        }
        return TextUtils.isEmpty(mml()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.qdl("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String str2;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVarQdl = qdl(webView, str);
            str2 = str;
            try {
                qdl(jCurrentTimeMillis, System.currentTimeMillis(), str2, (qdlVarQdl == null || qdlVarQdl.qdl() == null) ? 2 : 1);
                if (qdlVarQdl != null && qdlVarQdl.ud() != 5) {
                    qdlVarQdl.ud();
                    this.qdl.add(Integer.valueOf(qdlVarQdl.ud()));
                }
                if (qdlVarQdl != null && qdlVarQdl.qdl() != null) {
                    return qdlVarQdl.qdl();
                }
            } catch (Throwable th) {
                th = th;
                com.bytedance.sdk.component.utils.aaj.qdl("ExpressClient", "shouldInterceptRequest error2", th);
            }
        } catch (Throwable th2) {
            th = th2;
            str2 = str;
        }
        return super.shouldInterceptRequest(webView, str2);
    }

    private String mml() {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.ud;
        if (ljhVar == null) {
            return null;
        }
        if (ljhVar.xdk() != null) {
            return this.ud.xdk().rq();
        }
        if (this.ud.kr() != null) {
            return a.k;
        }
        return null;
    }

    private WebResourceResponse mzz(String str) {
        InputStream inputStreamQdl;
        if (TextUtils.isEmpty(str) || (inputStreamQdl = com.bytedance.sdk.openadsdk.core.mzz.qdl.qdl().qdl(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", "UTF-8", inputStreamQdl);
        qdl(webResourceResponse);
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdl(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.jl jlVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.equals("local://pag_open_icon_id") && !str.equals(com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl)) {
            com.bytedance.sdk.openadsdk.core.model.ljh.qdl qdlVarXdk = this.ud.xdk();
            if (qdlVarXdk != null && !TextUtils.isEmpty(str) && str.equals(qdlVarXdk.ud())) {
                com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVar = new com.bytedance.sdk.component.adexpress.qdl.ud.qdl();
                qdlVar.qdl(5);
                WebResourceResponse webResourceResponseMzz = mzz(str);
                qdlVar.qdl(webResourceResponseMzz);
                com.bytedance.sdk.openadsdk.core.mzz.qdl.qdl().qdl(webResourceResponseMzz != null);
                return qdlVar;
            }
            com.bytedance.sdk.component.adexpress.mml.tvp.qdl qdlVarQdl = com.bytedance.sdk.component.adexpress.mml.tvp.qdl(str);
            if (rdp.ud(this.ud)) {
                com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVarQdl2 = qdl(str, qdlVarQdl);
                if (qdlVarQdl2 != null) {
                    return qdlVarQdl2;
                }
                com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVarUd = ud(str, qdlVarQdl);
                if (qdlVarUd != null) {
                    Log.d("ExpressClient", "interceptTemplate: Hit fetch file cache url=".concat(str));
                    return qdlVarUd;
                }
                com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVarLnr = lnr(str, qdlVarQdl);
                if (qdlVarLnr != null) {
                    return qdlVarLnr;
                }
            }
            if (qdlVarQdl != com.bytedance.sdk.component.adexpress.mml.tvp.qdl.IMAGE) {
                for (com.bytedance.sdk.openadsdk.core.model.jl jlVar2 : this.ud.vm()) {
                    if (!TextUtils.isEmpty(jlVar2.qdl()) && !TextUtils.isEmpty(str)) {
                        String strQdl = jlVar2.qdl();
                        if (strQdl.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                            strQdl = strQdl.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http");
                        }
                        if ((str.startsWith(HttpRequest.DEFAULT_SCHEME) ? str.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http") : str).equals(strQdl)) {
                            jlVar = jlVar2;
                            break;
                        }
                    }
                }
            }
            if (qdlVarQdl != com.bytedance.sdk.component.adexpress.mml.tvp.qdl.IMAGE && jlVar == null) {
                return com.bytedance.sdk.component.adexpress.qdl.ud.ud.qdl(str, qdlVarQdl, "", mml());
            }
            com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVar2 = new com.bytedance.sdk.component.adexpress.qdl.ud.qdl();
            qdlVar2.qdl(5);
            qdlVar2.qdl(qdl(str, com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl(this.ud, str)));
            return qdlVar2;
        }
        com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVar3 = new com.bytedance.sdk.component.adexpress.qdl.ud.qdl();
        qdlVar3.qdl(5);
        qdlVar3.qdl(mzz());
        return qdlVar3;
    }

    private com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdl(String str, com.bytedance.sdk.component.adexpress.mml.tvp.qdl qdlVar) {
        ekw.qdl qdlVarMo;
        JSONArray jSONArrayQdl;
        ekw ekwVarKr = this.ud.kr();
        if (ekwVarKr != null && (qdlVarMo = ekwVarKr.mo()) != null && (jSONArrayQdl = qdlVarMo.qdl()) != null && jSONArrayQdl.length() > 0) {
            for (int i2 = 0; i2 < jSONArrayQdl.length(); i2++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.rq.lnr.qdl(jSONArrayQdl.optString(i2), com.bytedance.sdk.openadsdk.core.settings.rq.lnr().oth()), str) && qdlVar == com.bytedance.sdk.component.adexpress.mml.tvp.qdl.IMAGE) {
                    com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVar2 = new com.bytedance.sdk.component.adexpress.qdl.ud.qdl();
                    qdlVar2.qdl(5);
                    qdlVar2.qdl(qdl(str, com.bytedance.sdk.component.utils.mzz.qdl(str)));
                    return qdlVar2;
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdl(JSONArray jSONArray, String str, com.bytedance.sdk.component.adexpress.mml.tvp.qdl qdlVar) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.rq.lnr.qdl(jSONArray.optString(i2), com.bytedance.sdk.openadsdk.core.settings.rq.lnr().oth()), str)) {
                    com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVar2 = new com.bytedance.sdk.component.adexpress.qdl.ud.qdl();
                    qdlVar2.qdl(5);
                    qdlVar2.qdl(mml(str, qdlVar));
                    return qdlVar2;
                }
            }
        }
        return null;
    }

    private WebResourceResponse qdl(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamQdl = com.bytedance.sdk.openadsdk.tvp.mml.qdl(str, str2);
            if (inputStreamQdl == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(com.bytedance.sdk.component.adexpress.mml.tvp.qdl.IMAGE.qdl(), "utf-8", inputStreamQdl);
            try {
                qdl(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th) {
                th = th;
                webResourceResponse = webResourceResponse2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        com.bytedance.sdk.component.utils.aaj.qdl("ExpressClient", "get image WebResourceResponse error", th);
        return webResourceResponse;
    }

    private void qdl(long j, long j2, String str, int i2) {
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.mo;
        if (fsVar == null || fsVar.ud() == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.mml.tvp.qdl qdlVarQdl = com.bytedance.sdk.component.adexpress.mml.tvp.qdl(str);
        if (qdlVarQdl == com.bytedance.sdk.component.adexpress.mml.tvp.qdl.HTML) {
            this.mo.ud().qdl(str, j, j2, i2);
        } else if (qdlVarQdl == com.bytedance.sdk.component.adexpress.mml.tvp.qdl.JS) {
            this.mo.ud().ud(str, j, j2, i2);
        }
    }

    private void qdl(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Access-Control-Allow-Origin", "*");
        webResourceResponse.setResponseHeaders(map);
    }
}
