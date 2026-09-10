package com.bytedance.sdk.openadsdk.uq.ri;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.jbs.di;
import com.bytedance.sdk.component.ri.vr;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.widget.jbs;
import com.bytedance.sdk.openadsdk.core.widget.qt;
import com.bytedance.sdk.openadsdk.uq.fi;
import com.bytedance.sdk.openadsdk.uq.mj;
import com.bytedance.sdk.openadsdk.uq.xha;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.tan;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private lr ac;
    private volatile boolean aw;
    private long ay;
    private volatile boolean bgr;
    private AtomicBoolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18168co;
    private qt di;
    private final FrameLayout fi;
    private StringBuilder fr;
    private boolean ihz;
    private final wjv ik;
    private final String jbs;
    private final int ka;
    private final Context lr;
    private String mj;
    private jbs nr;
    private mj qt;
    protected di ri;
    private com.bytedance.sdk.openadsdk.aw.di sf;
    private AtomicBoolean slm;
    private InterfaceC0278ri su;
    private com.bytedance.sdk.openadsdk.core.ik.ri tan;
    private int uq;
    private int vr;
    private int wjv;
    private dzy xha;

    public interface lr {
        void ri();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.ri.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0278ri {
        void ri(int i);
    }

    public ri(Context context, wjv wjvVar, int i, boolean z, FrameLayout frameLayout) {
        this(context, wjvVar, i, z, frameLayout, false);
    }

    public ri(Context context, wjv wjvVar, int i, boolean z, FrameLayout frameLayout, boolean z2) {
        this(context, wjvVar, i, z, frameLayout, z2, 0);
    }

    private void ik(boolean z) {
        vr vrVarLr;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BidResponsedEx.KEY_CID, this.ik.tn());
            jSONObject.put("log_extra", this.ik.yjg());
        } catch (Throwable unused) {
        }
        if (com.bytedance.sdk.openadsdk.core.qt.lr().vr()) {
            xha.ri(new xha.ri() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.1
            });
        }
        mj mjVarRi = mj.ri(nr.ri(), this.ri.getWebView(), new com.bytedance.sdk.openadsdk.uq.ik() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.2
            @Override // com.bytedance.sdk.openadsdk.uq.ik
            public void ri(String str, JSONObject jSONObject2) {
                if (ri.this.xha != null) {
                    ri.this.xha.ri(str, jSONObject2);
                }
            }
        }, new com.bytedance.sdk.openadsdk.uq.ri() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.3
            @Override // com.bytedance.sdk.openadsdk.uq.ri
            public void ik() {
                if (ri.this.xha.bgr() != null) {
                    ri.this.xha.bgr().ri(true);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.uq.ri
            public void lr() {
                ri.this.xha.lr(true);
                if (ri.this.sf != null) {
                    ri.this.sf.ri();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.uq.ri
            public com.bytedance.sdk.openadsdk.uq.ka ri() {
                String strDi = com.bytedance.sdk.openadsdk.common.ik.di();
                strDi.getClass();
                switch (strDi) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.uq.ka.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.uq.ka.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.uq.ka.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.uq.ka.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.uq.ka.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.uq.ka.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.uq.ri
            public void ri(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), ri.this.ik, ri.this.mj, "playable_track", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.3.1
                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject ik() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject ri() {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (!ri.this.ik.mm()) {
                                return jSONObject3;
                            }
                            jSONObject3.put("is_pre_render", 1);
                            return jSONObject3;
                        } catch (JSONException e) {
                            ac.ik("PlayableManager", e.getMessage());
                            return null;
                        }
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.uq.ri
            public void ri(int i, String str) {
                ri.this.f18168co = false;
                if (i == 2 || i == 3 || i == 4) {
                    ri.this.ri(2, i);
                } else if (i == 5) {
                    ri.this.ri(3, i);
                } else {
                    ri.this.ri(1, 0);
                }
            }
        });
        this.qt = mjVarRi;
        mjVarRi.xha(this.jbs).fi(com.bytedance.sdk.openadsdk.common.ik.ri(nr.ri())).lr(com.bytedance.sdk.openadsdk.common.ik.fi()).ri(com.bytedance.sdk.openadsdk.common.ik.ri()).ka(com.bytedance.sdk.openadsdk.common.ik.ka()).ik(jSONObject).ik(dw.qt(this.ik)).ka(true).ri(z).ik(false).ri(dw.bu(this.ik)).lr(dw.bu(this.ik)).ri("sdkEdition", com.bytedance.sdk.openadsdk.common.ik.ik()).fi(dw.di(this.ik)).di(this.mj);
        this.qt.ri(fi.lr(this.lr));
        Set<String> setSf = this.qt.sf();
        final WeakReference weakReference = new WeakReference(this.qt);
        for (String str : setSf) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (vrVarLr = this.xha.lr()) != null) {
                vrVarLr.ri(str, new com.bytedance.sdk.component.ri.ka<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.4
                    @Override // com.bytedance.sdk.component.ri.ka
                    public JSONObject ri(String str2, JSONObject jSONObject2, com.bytedance.sdk.component.ri.fi fiVar) {
                        try {
                            mj mjVar = (mj) weakReference.get();
                            if (mjVar == null) {
                                return null;
                            }
                            return mjVar.ka(ri(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private void mj() {
        this.ri.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.ri.fi(nr.ri(), this.xha, this.ik.tn(), null, true) { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (ri.this.qt != null) {
                    ri.this.qt.jbs(str);
                }
                if (ri.this.f18168co) {
                    ri.this.ri(0, 0);
                    com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), ri.this.ik, ri.this.mj, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                ri.this.f18168co = false;
                if (ri.this.qt != null) {
                    ri.this.qt.di(com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ri(ri.this.ik));
                    ri.this.qt.ri(i, str, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    ri.this.f18168co = false;
                    if (ri.this.qt != null) {
                        ri.this.qt.di(com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ri(ri.this.ik));
                        ri.this.qt.ri(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (ri.this.ik.eu() != null && !TextUtils.isEmpty(ri.this.ik.eu().saneness())) {
                        if (ri.this.qt != null) {
                            ri.this.qt.qt(str);
                        }
                        String strCo = dw.co(ri.this.ik);
                        WebResourceResponse webResourceResponseRi = com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ri(ri.this.ik.eu().saneness(), strCo, str);
                        if (webResourceResponseRi == null) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        if (ri.this.qt != null) {
                            ri.this.qt.sf(str);
                        }
                        return webResourceResponseRi;
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    ri.this.f18168co = false;
                    if (ri.this.qt == null || webResourceError == null) {
                        return;
                    }
                    ri.this.qt.di(com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ri(ri.this.ik));
                    ri.this.qt.ri(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }
        });
        this.ri.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ri.ka(this.xha) { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.ka, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.ka, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (ri.this.di == null || ri.this.di.getVisibility() != 0) {
                    return;
                }
                ri.this.di.setProgress(i);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.ri.ik.ri(this.lr).ri(false).lr(false).ri(this.ri.getWebView());
        di diVar = this.ri;
        diVar.setUserAgentString(tan.ri(diVar.getWebView(), BuildConfig.VERSION_CODE));
        this.ri.setMixedContentMode(0);
    }

    public boolean di() {
        dzy dzyVar = this.xha;
        if (dzyVar != null) {
            return dzyVar.di();
        }
        return false;
    }

    public boolean fi() {
        return this.aw;
    }

    public void ka() {
        mj mjVar = this.qt;
        if (mjVar != null) {
            mjVar.pv();
        }
        di diVar = this.ri;
        if (diVar != null) {
            diVar.slm();
        }
        dzy dzyVar = this.xha;
        if (dzyVar != null) {
            dzyVar.co();
        }
        this.ay = System.currentTimeMillis();
        this.fr = new StringBuilder();
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                StringBuilder sb = this.fr;
                sb.append(stackTraceElement);
                sb.append("\n");
            }
        } catch (Throwable th) {
            ac.ri("PlayableManager", "onDestroy() error", th);
        }
        this.ri = null;
    }

    public void lr() {
        mj mjVar;
        if (!this.slm.get() || (mjVar = this.qt) == null) {
            return;
        }
        mjVar.ik(true);
    }

    public dzy xha() {
        return this.xha;
    }

    public ri(Context context, wjv wjvVar, int i, boolean z, FrameLayout frameLayout, boolean z2, int i2) {
        this.f18168co = true;
        this.slm = new AtomicBoolean(false);
        this.bu = new AtomicBoolean(false);
        this.wjv = 0;
        this.ay = 0L;
        this.lr = context;
        this.ik = wjvVar;
        this.uq = i2;
        if (wjvVar != null && wjvVar.ka() != null && wjvVar.ka().ka() != null) {
            this.wjv = wjvVar.ka().ka().size();
        }
        this.ka = i;
        String strIk = ig.ik(wjvVar.eb().getDurationSlotType());
        this.mj = strIk;
        int iRi = ig.ri(strIk);
        this.ihz = z2;
        if (z2) {
            this.mj = ig.lr(iRi);
        }
        this.jbs = dw.co(wjvVar);
        this.fi = frameLayout;
        ri(frameLayout);
        ri(iRi);
        ik(z);
        mj();
    }

    public void ri(InterfaceC0278ri interfaceC0278ri) {
        this.su = interfaceC0278ri;
    }

    private void ri(FrameLayout frameLayout) {
        di diVar = new di(this.lr, true, di.ik.PLAYABLE);
        this.ri = diVar;
        diVar.fi();
        this.ri.setLayerType(2, null);
        this.ri.setVisibility(4);
        this.ri.setBackgroundColor(-16777216);
        this.ri.setEnabled(true);
        this.ri.setTag(this.mj);
        this.ri.setMaterialMeta(this.ik.nb());
        this.ri.setLandingPage(true);
        frameLayout.addView(this.ri, new FrameLayout.LayoutParams(-1, -1));
        jbs jbsVar = new jbs(this.lr);
        this.nr = jbsVar;
        jbsVar.ri(this.ik, this.mj, this.tan, this.ihz);
        frameLayout.addView(this.nr, new FrameLayout.LayoutParams(-1, -1));
        if (this.ik.dvr()) {
            qt qtVar = new qt(this.lr);
            this.di = qtVar;
            qtVar.lr();
            frameLayout.addView(this.di, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void lr(boolean z) {
        mj mjVar = this.qt;
        if (mjVar != null) {
            mjVar.fi(z);
        }
    }

    private void ri(int i) {
        HashMap map = new HashMap();
        map.put("click_scence", 3);
        this.xha = new dzy(this.lr);
        String strUo = this.ik.uo();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", this.ik.zyn());
            jSONObject.put("currentIndex", this.uq);
            jSONObject.put("totalAdCount", this.wjv);
        } catch (JSONException unused) {
        }
        this.xha.lr(this.ri).ri(this.ik).ri(com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri(this.ik, true, jSONObject)).ik(this.ik.tn()).ka(this.ik.yjg()).lr(i).fi(strUo).ri(this.ri).lr(this.mj).ri(map).ri(new com.bytedance.sdk.openadsdk.ka.tan(3, this.mj, this.ik));
    }

    public void ik() {
        mj mjVar;
        if (!this.slm.get() || (mjVar = this.qt) == null) {
            return;
        }
        mjVar.ik(false);
    }

    public void ri(boolean z, com.bytedance.sdk.openadsdk.aw.di diVar) {
        this.sf = diVar;
        this.qt.lr(z);
        com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().lr(this.ik);
        this.ri.a_(this.jbs);
        mj mjVar = this.qt;
        if (mjVar != null) {
            mjVar.di(com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ri(this.ik));
            this.qt.mj(this.jbs);
        }
    }

    public void ri() {
        qt qtVar;
        final boolean z = true;
        if (this.slm.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.fi;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (!this.bgr && (qtVar = this.di) != null) {
            qtVar.lr(this.ik, this.ka);
            mj mjVar = this.qt;
            if (mjVar != null) {
                mjVar.ory();
            }
        } else {
            this.qt.ik(true);
            dzy dzyVar = this.xha;
            if (dzyVar != null && dzyVar.bgr() != null) {
                this.xha.bgr().fi();
            }
            InterfaceC0278ri interfaceC0278ri = this.su;
            if (interfaceC0278ri != null) {
                interfaceC0278ri.ri(this.vr);
            }
            z = false;
        }
        if (this.qt != null) {
            com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), this.ik, this.mj, "playable_track", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.7
                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject ik() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject ri() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", ri.this.qt.srn());
                        jSONObject.put("has_loading", z);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            this.qt.di(com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ri(this.ik));
        }
        di diVar = this.ri;
        if (diVar != null) {
            diVar.setVisibility(0);
        } else {
            com.bytedance.sdk.openadsdk.slm.ka.ri("plb_npe_crash", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.8
                @Override // com.bytedance.sdk.openadsdk.slm.lr
                public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crash_ts", System.currentTimeMillis());
                    if (ri.this.fr != null) {
                        jSONObject.put("destroy_stack_trace", ri.this.fr.toString());
                    }
                    jSONObject.put("destroy_ts", ri.this.ay);
                    return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("plb_npe_crash").lr(jSONObject.toString());
                }
            });
        }
    }

    public void ri(final int i, final int i2) {
        InterfaceC0278ri interfaceC0278ri;
        mj mjVar;
        lr lrVar;
        if (this.bgr) {
            return;
        }
        this.bgr = true;
        this.vr = i;
        if (i == 2) {
            this.aw = true;
            this.qt.ri(3);
        } else if (i == 1) {
            this.aw = true;
            this.qt.ri(2);
        } else if (i == 3) {
            this.aw = true;
            this.qt.ri(4);
        } else if (i == 0) {
            this.qt.ri(1);
        }
        if (this.aw && (lrVar = this.ac) != null) {
            lrVar.ri();
        }
        if (this.slm.get() && (mjVar = this.qt) != null) {
            mjVar.ik(true);
        }
        dzy dzyVar = this.xha;
        if (dzyVar != null && dzyVar.bgr() != null) {
            this.xha.bgr().fi();
        }
        if (!this.aw && (interfaceC0278ri = this.su) != null) {
            interfaceC0278ri.ri(i);
        }
        qt qtVar = this.di;
        if (qtVar != null) {
            qtVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.9
                @Override // java.lang.Runnable
                public void run() {
                    if (ri.this.aw) {
                        ri.this.nr.setVisibility(0);
                        if (ri.this.su != null) {
                            ri.this.su.ri(i);
                        }
                        ri.this.ri(true);
                    }
                    ri.this.qt.xha(ri.this.aw);
                    ri.this.di.ik();
                    if (ri.this.slm.get()) {
                        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), ri.this.ik, ri.this.mj, "playable_track", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ri.9.1
                            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                            public JSONObject ik() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }

                            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                            public JSONObject ri() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i);
                                    jSONObject.put("remove_loading_page_reason", i2);
                                    jSONObject.put("playable_url", ri.this.jbs);
                                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, ri.this.di.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void ri(boolean z) {
        mj mjVar = this.qt;
        if (mjVar != null) {
            mjVar.ri(z);
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.ik.ri riVar) {
        this.tan = riVar;
        qt qtVar = this.di;
        if (qtVar != null && qtVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.di.mj downloadButton = this.di.getDownloadButton();
            downloadButton.setOnClickListener(riVar);
            downloadButton.setOnTouchListener(riVar);
        }
        jbs jbsVar = this.nr;
        if (jbsVar != null) {
            jbsVar.setClickListener(riVar);
        }
    }

    public void ri(lr lrVar) {
        this.ac = lrVar;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar) {
        dzy dzyVar = this.xha;
        if (dzyVar != null) {
            dzyVar.ri(lrVar);
        }
    }
}
