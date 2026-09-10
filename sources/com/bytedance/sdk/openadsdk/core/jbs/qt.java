package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.TypedValue;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.oh;
import com.ironsource.A5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends com.bytedance.sdk.openadsdk.core.widget.ri.fi {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private static final byte[] f18127co = {-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 1, 0, 0, 0, 1, 8, 6, 0, 0, 0, 31, 21, -60, -119, 0, 0, 0, 10, 73, 68, 65, 84, 120, -100, 99, 96, 96, 96, 96, 0, 0, 0, 3, 0, 1, -2, 60, -79, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    private final com.bytedance.sdk.openadsdk.core.model.wjv lr;
    private com.bytedance.sdk.component.adexpress.lr.aw qt;
    public ArrayList<Integer> ri;
    private boolean sf;

    public qt(Context context, dzy dzyVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, com.bytedance.sdk.openadsdk.ka.aw awVar, com.bytedance.sdk.component.adexpress.lr.aw awVar2) {
        super(context, dzyVar, wjvVar.tn(), awVar, false);
        this.sf = false;
        this.ri = new ArrayList<>();
        this.lr = wjvVar;
        this.qt = awVar2;
        this.sf = com.bytedance.sdk.openadsdk.wjv.fi.ri("inject_data_normal_open", 0) == 1;
    }

    private WebResourceResponse fi() {
        InputStream inputStreamOpenRawResource;
        int iJbs = com.bytedance.sdk.openadsdk.core.qt.lr().jbs();
        if (iJbs == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.nr.ri().getResources();
        if (resources != null) {
            try {
                TypedValue typedValue = new TypedValue();
                resources.getValueForDensity(iJbs, 0, typedValue, true);
                CharSequence charSequence = typedValue.string;
                inputStreamOpenRawResource = (charSequence == null || !charSequence.toString().endsWith(".xml")) ? resources.openRawResource(iJbs) : new ByteArrayInputStream(f18127co);
            } catch (Resources.NotFoundException e) {
                com.bytedance.sdk.component.utils.ac.ik("ExpressClient", e.toString());
                inputStreamOpenRawResource = null;
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new WebResourceResponse(com.bytedance.sdk.component.adexpress.ka.jbs.ri.IMAGE.ri(), C.UTF8_NAME, inputStreamOpenRawResource);
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.ri.lr.ri ik(String str, com.bytedance.sdk.component.adexpress.ka.jbs.ri riVar) {
        oh.ri riVarDi;
        JSONArray jSONArrayIk;
        oh ohVarZv = this.lr.zv();
        if (ohVarZv == null || (riVarDi = ohVarZv.di()) == null || (jSONArrayIk = riVarDi.ik()) == null || jSONArrayIk.length() <= 0) {
            return null;
        }
        return ri(jSONArrayIk, str, riVar);
    }

    private WebResourceResponse ka(String str, com.bytedance.sdk.component.adexpress.ka.jbs.ri riVar) {
        InputStream inputStreamLr;
        if (TextUtils.isEmpty(str) || (inputStreamLr = bgr.lr(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(riVar.ri(), C.UTF8_NAME, inputStreamLr);
        ri(webResourceResponse);
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.ri.lr.ri lr(String str, com.bytedance.sdk.component.adexpress.ka.jbs.ri riVar) {
        oh.ri riVarDi;
        JSONArray jSONArrayLr;
        oh ohVarZv = this.lr.zv();
        if (ohVarZv == null || (riVarDi = ohVarZv.di()) == null || (jSONArrayLr = riVarDi.lr()) == null || jSONArrayLr.length() <= 0) {
            return null;
        }
        return ri(jSONArrayLr, str, riVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.xha = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.mj = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.lr.aw awVar = this.qt;
        if (awVar != null && awVar.wjv() && this.sf) {
            this.qt.ik();
            com.bytedance.sdk.component.utils.bgr.ri(webView, "javascript:window.SDK_INJECT_DATA=" + this.qt.ik());
        }
    }

    public int ri() {
        for (Integer num : this.ri) {
            if (num.intValue() == 3 || num.intValue() == 2 || num.intValue() == -1) {
                return num.intValue();
            }
        }
        return TextUtils.isEmpty(ka()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ri("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String str2;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.ri.lr.ri riVarRi = ri(webView, str);
            str2 = str;
            try {
                ri(jCurrentTimeMillis, System.currentTimeMillis(), str2, (riVarRi == null || riVarRi.ri() == null) ? 2 : 1);
                if (riVarRi != null && riVarRi.lr() != 5) {
                    riVarRi.lr();
                    this.ri.add(Integer.valueOf(riVarRi.lr()));
                }
                if (riVarRi != null && riVarRi.ri() != null) {
                    return riVarRi.ri();
                }
            } catch (Throwable th) {
                th = th;
                com.bytedance.sdk.component.utils.ac.ri("ExpressClient", "shouldInterceptRequest error2", th);
            }
        } catch (Throwable th2) {
            th = th2;
            str2 = str;
        }
        return super.shouldInterceptRequest(webView, str2);
    }

    private String ka() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.lr;
        if (wjvVar == null) {
            return null;
        }
        if (wjvVar.sez() != null) {
            return this.lr.sez().sf();
        }
        if (this.lr.zv() != null) {
            return "v3";
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.ri.lr.ri ri(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.nr nrVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.equals("local://pag_open_icon_id") && !str.equals(com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri)) {
            com.bytedance.sdk.openadsdk.core.model.wjv.ri riVarSez = this.lr.sez();
            if (riVarSez != null && !TextUtils.isEmpty(str) && str.equals(riVarSez.lr())) {
                com.bytedance.sdk.component.adexpress.ri.lr.ri riVar = new com.bytedance.sdk.component.adexpress.ri.lr.ri();
                riVar.ri(5);
                WebResourceResponse webResourceResponseFi = fi(str);
                riVar.ri(webResourceResponseFi);
                com.bytedance.sdk.openadsdk.core.fi.ri.ri().ri(webResourceResponseFi != null);
                return riVar;
            }
            com.bytedance.sdk.component.adexpress.ka.jbs.ri riVarRi = com.bytedance.sdk.component.adexpress.ka.jbs.ri(str);
            if (bgr.lr(this.lr)) {
                com.bytedance.sdk.component.adexpress.ri.lr.ri riVarRi2 = ri(str, riVarRi);
                if (riVarRi2 != null) {
                    return riVarRi2;
                }
                com.bytedance.sdk.component.adexpress.ri.lr.ri riVarLr = lr(str, riVarRi);
                if (riVarLr != null) {
                    "interceptTemplate: Hit fetch file cache url=".concat(str);
                    return riVarLr;
                }
                com.bytedance.sdk.component.adexpress.ri.lr.ri riVarIk = ik(str, riVarRi);
                if (riVarIk != null) {
                    return riVarIk;
                }
            }
            if (riVarRi != com.bytedance.sdk.component.adexpress.ka.jbs.ri.IMAGE) {
                for (com.bytedance.sdk.openadsdk.core.model.nr nrVar2 : this.lr.rbz()) {
                    if (!TextUtils.isEmpty(nrVar2.ri()) && !TextUtils.isEmpty(str)) {
                        String strRi = nrVar2.ri();
                        if (strRi.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                            strRi = strRi.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http");
                        }
                        if ((str.startsWith(HttpRequest.DEFAULT_SCHEME) ? str.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http") : str).equals(strRi)) {
                            nrVar = nrVar2;
                            break;
                        }
                    }
                }
            }
            if (riVarRi != com.bytedance.sdk.component.adexpress.ka.jbs.ri.IMAGE && nrVar == null) {
                return com.bytedance.sdk.component.adexpress.ri.lr.lr.ri(str, riVarRi, "", ka());
            }
            com.bytedance.sdk.component.adexpress.ri.lr.ri riVar2 = new com.bytedance.sdk.component.adexpress.ri.lr.ri();
            riVar2.ri(5);
            riVar2.ri(ri(str, com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri(this.lr, str)));
            return riVar2;
        }
        com.bytedance.sdk.component.adexpress.ri.lr.ri riVar3 = new com.bytedance.sdk.component.adexpress.ri.lr.ri();
        riVar3.ri(5);
        riVar3.ri(fi());
        return riVar3;
    }

    private WebResourceResponse fi(String str) {
        InputStream inputStreamRi;
        if (TextUtils.isEmpty(str) || (inputStreamRi = com.bytedance.sdk.openadsdk.core.fi.ri.ri().ri(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", C.UTF8_NAME, inputStreamRi);
        ri(webResourceResponse);
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.ri.lr.ri ri(String str, com.bytedance.sdk.component.adexpress.ka.jbs.ri riVar) {
        oh.ri riVarDi;
        JSONArray jSONArrayRi;
        oh ohVarZv = this.lr.zv();
        if (ohVarZv != null && (riVarDi = ohVarZv.di()) != null && (jSONArrayRi = riVarDi.ri()) != null && jSONArrayRi.length() > 0) {
            for (int i = 0; i < jSONArrayRi.length(); i++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.co.ka.ri(jSONArrayRi.optString(i), com.bytedance.sdk.openadsdk.core.settings.sf.lr().ac()), str) && riVar == com.bytedance.sdk.component.adexpress.ka.jbs.ri.IMAGE) {
                    com.bytedance.sdk.component.adexpress.ri.lr.ri riVar2 = new com.bytedance.sdk.component.adexpress.ri.lr.ri();
                    riVar2.ri(5);
                    riVar2.ri(ri(str, com.bytedance.sdk.component.utils.fi.ri(str)));
                    return riVar2;
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.ri.lr.ri ri(JSONArray jSONArray, String str, com.bytedance.sdk.component.adexpress.ka.jbs.ri riVar) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.co.ka.ri(jSONArray.optString(i), com.bytedance.sdk.openadsdk.core.settings.sf.lr().ac()), str)) {
                    com.bytedance.sdk.component.adexpress.ri.lr.ri riVar2 = new com.bytedance.sdk.component.adexpress.ri.lr.ri();
                    riVar2.ri(5);
                    riVar2.ri(ka(str, riVar));
                    return riVar2;
                }
            }
        }
        return null;
    }

    private WebResourceResponse ri(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamRi = com.bytedance.sdk.openadsdk.qt.ka.ri(str, str2);
            if (inputStreamRi == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(com.bytedance.sdk.component.adexpress.ka.jbs.ri.IMAGE.ri(), A5.O, inputStreamRi);
            try {
                ri(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th) {
                th = th;
                webResourceResponse = webResourceResponse2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        com.bytedance.sdk.component.utils.ac.ri("ExpressClient", "get image WebResourceResponse error", th);
        return webResourceResponse;
    }

    private void ri(long j, long j2, String str, int i) {
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.di;
        if (awVar == null || awVar.lr() == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ka.jbs.ri riVarRi = com.bytedance.sdk.component.adexpress.ka.jbs.ri(str);
        if (riVarRi == com.bytedance.sdk.component.adexpress.ka.jbs.ri.HTML) {
            this.di.lr().ri(str, j, j2, i);
        } else if (riVarRi == com.bytedance.sdk.component.adexpress.ka.jbs.ri.JS) {
            this.di.lr().lr(str, j, j2, i);
        }
    }

    private void ri(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Access-Control-Allow-Origin", "*");
        webResourceResponse.setResponseHeaders(map);
    }
}
