package com.bytedance.sdk.openadsdk.bgr;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.jbs.di;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.slm;
import com.bytedance.sdk.openadsdk.core.widget.ri.ik;
import com.bytedance.sdk.openadsdk.core.widget.ri.ka;
import com.bytedance.sdk.openadsdk.ka.aw;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.uq;
import com.bytedance.sdk.openadsdk.wjv.fi;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static int ik = 2;
    private static long ka = 3600000;
    private static volatile ri ri;
    private LinkedHashMap<Integer, SoftReference<di>> fi;
    private final Handler lr;

    public ri() {
        ik = fi.ri("pre_render_count", 2);
        long jRi = fi.ri("pre_render_duration", 3600000);
        ka = jRi;
        if (ik <= 0) {
            ik = 2;
        }
        if (jRi <= 0) {
            ka = 3600000L;
        }
        this.fi = new LinkedHashMap<>();
        this.lr = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                SoftReference softReference;
                int i = message.what;
                if (ri.this.fi == null || (softReference = (SoftReference) ri.this.fi.get(Integer.valueOf(i))) == null) {
                    return false;
                }
                di diVar = (di) softReference.get();
                ri.this.ri(i, 2, new wjv(), diVar == null ? "" : diVar.getTag());
                return false;
            }
        });
    }

    public static boolean ik(wjv wjvVar) {
        return ac.mj(wjvVar) || ac.lr(wjvVar) || ac.ik(wjvVar);
    }

    public di lr(wjv wjvVar) {
        if (wjvVar == null || TextUtils.isEmpty(wjvVar.smj())) {
            return null;
        }
        String strSmj = wjvVar.smj();
        if (TextUtils.isEmpty(strSmj)) {
            return null;
        }
        int iHashCode = strSmj.hashCode();
        SoftReference<di> softReference = this.fi.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        di diVar = softReference.get();
        ri(wjvVar, diVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - wjvVar.jfv()).floatValue(), "web_use_pre_render");
        ri(iHashCode, 3, wjvVar, diVar.getTag());
        return diVar;
    }

    public static ri ri() {
        if (ri == null) {
            synchronized (ri.class) {
                try {
                    if (ri == null) {
                        ri = new ri();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public void ri(final wjv wjvVar) {
        final String str;
        if (wjvVar == null || !ik(wjvVar)) {
            return;
        }
        tan tanVarSu = wjvVar.su();
        if (tanVarSu == null) {
            tanVarSu = new tan();
        }
        wjvVar.wm();
        if (wjvVar.wm()) {
            String strSmj = wjvVar.smj();
            if (TextUtils.isEmpty(strSmj)) {
                return;
            }
            final int iHashCode = strSmj.hashCode();
            if (ac.lr(wjvVar)) {
                str = "landingpage_split_screen";
            } else if (ac.ka(wjvVar)) {
                str = "landingpage_direct";
            } else if (ac.ik(wjvVar)) {
                str = "landingpage_split_ceiling";
            } else {
                str = "";
            }
            LinkedHashMap<Integer, SoftReference<di>> linkedHashMap = this.fi;
            if (linkedHashMap == null || !linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                HashMap map = new HashMap();
                map.put(wjvVar.mvf(), wjvVar);
                if (tanVarSu.lr() == 2) {
                    com.bytedance.sdk.openadsdk.xha.lr.ri().ri((Map<String, wjv>) map, new com.bytedance.sdk.openadsdk.xha.lr.ri() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.2
                        @Override // com.bytedance.sdk.openadsdk.xha.lr.ri
                        public void ri() {
                            ri.this.ri(iHashCode, wjvVar, str, true);
                        }
                    }, true);
                    return;
                }
                if (tanVarSu.lr() == 1) {
                    com.bytedance.sdk.openadsdk.xha.lr.ri().ri((Map<String, wjv>) map, (com.bytedance.sdk.openadsdk.xha.lr.ri) null, true);
                    ri(iHashCode, wjvVar, str, true);
                } else if (tanVarSu.lr() == 0) {
                    ri(iHashCode, wjvVar, str, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final int i, final wjv wjvVar, final String str, final boolean z) {
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.3
            private com.bytedance.sdk.openadsdk.core.widget.ri.fi ri(final di diVar, aw awVar) {
                com.bytedance.sdk.openadsdk.core.widget.ri.fi fiVar = new com.bytedance.sdk.openadsdk.core.widget.ri.fi(nr.ri(), null, wjvVar.tn(), awVar, true) { // from class: com.bytedance.sdk.openadsdk.bgr.ri.3.3
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str2) {
                        di diVar2 = diVar;
                        if (diVar2 != null) {
                            diVar2.setPreFinish(true);
                        }
                        super.onPageFinished(webView, str2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        di diVar2 = diVar;
                        if (diVar2 != null) {
                            diVar2.setPreStart(true);
                        }
                        super.onPageStarted(webView, str2, bitmap);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, int i2, String str2, String str3) {
                        String strKa = com.bytedance.sdk.openadsdk.core.widget.ri.fi.ka(str3);
                        boolean z2 = false;
                        boolean z3 = strKa != null && strKa.startsWith("image");
                        if (strKa != null && strKa.startsWith("mp4")) {
                            z2 = true;
                        }
                        if (!z3 && !z2 && !diVar.ik()) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            ri.this.ri(i, 4, wjvVar, str);
                        }
                        super.onReceivedError(webView, i2, str2, str3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            ri.this.ri(i, 4, wjvVar, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        try {
                            if (!z) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            di diVar2 = diVar;
                            if (diVar2 != null) {
                                diVar2.ri++;
                            }
                            WebResourceResponseModel webResourceResponseModelRi = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(com.bytedance.sdk.openadsdk.xha.lr.ri().lr(), wjvVar.mvf(), str2);
                            if (webResourceResponseModelRi != null && webResourceResponseModelRi.getWebResourceResponse() != null) {
                                di diVar3 = diVar;
                                if (diVar3 != null) {
                                    diVar3.lr++;
                                }
                                return webResourceResponseModelRi.getWebResourceResponse();
                            }
                            if (diVar != null && webResourceResponseModelRi != null && webResourceResponseModelRi.getMsg() == 2) {
                                diVar.ik++;
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        return super.shouldOverrideUrlLoading(webView, str2);
                    }
                };
                fiVar.ri(wjvVar);
                fiVar.ri(str);
                return fiVar;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.utils.ri riVarFi;
                Activity activityLr;
                if (ri.this.fi != null && ri.this.fi.size() >= ri.ik) {
                    Map.Entry entry = (Map.Entry) ri.this.fi.entrySet().iterator().next();
                    SoftReference softReference = (SoftReference) entry.getValue();
                    if (softReference != null) {
                        di diVar = (di) softReference.get();
                        ri.this.ri(((Integer) entry.getKey()).intValue(), 1, wjvVar, diVar == null ? "" : diVar.getTag());
                    }
                }
                if (ri.this.lr != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    ri.this.lr.sendMessageDelayed(messageObtain, ri.ka);
                }
                SoftReference softReference2 = new SoftReference(new di(nr.ri(), false, di.ik.LANDING_PAGE_PRE_RENDER));
                final di diVar2 = (di) softReference2.get();
                if (diVar2 == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.dzy dzyVar = null;
                diVar2.setLayerType(2, null);
                qd.ri((View) diVar2, 4);
                diVar2.setTag(str);
                diVar2.setLandingPage(true);
                tan tanVarSu = wjvVar.su();
                int iRi = tanVarSu != null ? tanVarSu.ri() : 3;
                if (iRi == 2) {
                    int iIk = qd.ik(nr.ri());
                    int iFi = qd.fi(nr.ri());
                    int iBbu = wjvVar.bbu();
                    if (iBbu == 1) {
                        if (iIk >= iFi) {
                            diVar2.layout(0, 0, iFi, iIk);
                        } else {
                            diVar2.layout(0, 0, iIk, iFi);
                        }
                    } else if (iBbu == 2) {
                        if (iIk < iFi) {
                            diVar2.layout(0, 0, iFi, iIk);
                        } else {
                            diVar2.layout(0, 0, iIk, iFi);
                        }
                    }
                } else if (iRi == 1 && (riVarFi = slm.ri().fi()) != null && (activityLr = riVarFi.lr()) != null) {
                    final int iHashCode = activityLr.hashCode();
                    riVarFi.ri(new com.bytedance.sdk.component.adexpress.ri() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.3.1
                        @Override // com.bytedance.sdk.component.adexpress.ri
                        public void ri(Activity activity) {
                            int i2 = iHashCode;
                            if (i2 == 0 || activity == null || i2 != activity.hashCode() || diVar2.ik()) {
                                return;
                            }
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            ri.this.ri(i, 5, wjvVar, str);
                        }
                    });
                    FrameLayout frameLayout = (FrameLayout) activityLr.findViewById(R.id.content);
                    if (frameLayout != null) {
                        frameLayout.addView(diVar2);
                    }
                }
                int iRi2 = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(com.bytedance.sdk.openadsdk.xha.lr.ri().lr(), wjvVar.mvf());
                aw awVar = new aw(wjvVar, diVar2.getWebView());
                awVar.ri(iRi2 > 0 ? 2 : 0);
                awVar.ri(true);
                awVar.lr(true);
                diVar2.setWebViewClient(ri(diVar2, awVar));
                diVar2.setWebChromeClient(new ka(dzyVar, awVar) { // from class: com.bytedance.sdk.openadsdk.bgr.ri.3.2
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.ka, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i2) {
                        super.onProgressChanged(webView, i2);
                        if (i2 == 100) {
                            diVar2.setPreProgressHundred(true);
                        }
                    }
                });
                ri.this.ri(diVar2, wjvVar.smj());
                ri.ri(wjvVar, str, Double.valueOf((System.currentTimeMillis() / 1000) - wjvVar.jfv()).floatValue(), "web_start_pre_render");
                if (ri.this.fi != null) {
                    ri.this.fi.put(Integer.valueOf(i), softReference2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(int i, int i2, wjv wjvVar, String str) {
        LinkedHashMap<Integer, SoftReference<di>> linkedHashMap = this.fi;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i))) {
            this.fi.remove(Integer.valueOf(i));
        }
        Handler handler = this.lr;
        if (handler != null) {
            handler.removeMessages(i);
        }
        ri(wjvVar, str, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(di diVar, String str) {
        if (diVar == null) {
            return;
        }
        ik.ri(nr.ri()).ri(false).lr(false).ri(diVar.getWebView());
        diVar.setMixedContentMode(0);
        uq.ri(diVar, str);
    }

    public static void ri(wjv wjvVar, String str, final float f, String str2) {
        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, str, str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.4
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, f);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ri(wjv wjvVar, final String str, final int i) {
        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.bgr.ri.5
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }
}
