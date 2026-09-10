package com.bytedance.sdk.openadsdk.exu;

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
import com.bytedance.sdk.component.tvp.mo;
import com.bytedance.sdk.openadsdk.core.bjy;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.exc;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.widget.qdl.lnr;
import com.bytedance.sdk.openadsdk.core.widget.qdl.mml;
import com.bytedance.sdk.openadsdk.core.widget.qdl.mzz;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.fs;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.jyq;
import com.bytedance.sdk.openadsdk.wd.ud;
import com.smartdigimkt.x.d;
import com.thinkup.core.common.om.n;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static int lnr = 2;
    private static long mml = 3600000;
    private static volatile qdl qdl;
    private LinkedHashMap<Integer, SoftReference<mo>> mzz;
    private final Handler ud;

    public qdl() {
        lnr = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("pre_render_count", 2);
        long jQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("pre_render_duration", 3600000);
        mml = jQdl;
        if (lnr <= 0) {
            lnr = 2;
        }
        if (jQdl <= 0) {
            mml = n.m;
        }
        this.mzz = new LinkedHashMap<>();
        this.ud = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.exu.qdl.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                SoftReference softReference;
                int i2 = message.what;
                if (qdl.this.mzz == null || (softReference = (SoftReference) qdl.this.mzz.get(Integer.valueOf(i2))) == null) {
                    return false;
                }
                mo moVar = (mo) softReference.get();
                qdl.this.qdl(i2, 2, new ljh(), moVar == null ? "" : moVar.getTag());
                return false;
            }
        });
    }

    public static boolean lnr(ljh ljhVar) {
        return aaj.jpc(ljhVar) || aaj.ud(ljhVar) || aaj.lnr(ljhVar);
    }

    public mo ud(ljh ljhVar) {
        if (ljhVar == null || TextUtils.isEmpty(ljhVar.od())) {
            return null;
        }
        String strOd = ljhVar.od();
        if (TextUtils.isEmpty(strOd)) {
            return null;
        }
        int iHashCode = strOd.hashCode();
        SoftReference<mo> softReference = this.mzz.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        mo moVar = softReference.get();
        qdl(ljhVar, moVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - ljhVar.wsn()).floatValue(), "web_use_pre_render");
        qdl(iHashCode, 3, ljhVar, moVar.getTag());
        return moVar;
    }

    public static qdl qdl() {
        if (qdl == null) {
            synchronized (qdl.class) {
                try {
                    if (qdl == null) {
                        qdl = new qdl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public void qdl(final ljh ljhVar) {
        final String str;
        if (ljhVar == null || !lnr(ljhVar)) {
            return;
        }
        exc excVarOth = ljhVar.oth();
        if (excVarOth == null) {
            excVarOth = new exc();
        }
        ljhVar.tu();
        if (ljhVar.tu()) {
            String strOd = ljhVar.od();
            if (TextUtils.isEmpty(strOd)) {
                return;
            }
            final int iHashCode = strOd.hashCode();
            if (aaj.ud(ljhVar)) {
                str = "landingpage_split_screen";
            } else if (aaj.mml(ljhVar)) {
                str = "landingpage_direct";
            } else if (aaj.lnr(ljhVar)) {
                str = "landingpage_split_ceiling";
            } else {
                str = "";
            }
            LinkedHashMap<Integer, SoftReference<mo>> linkedHashMap = this.mzz;
            if (linkedHashMap == null || !linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                HashMap map = new HashMap();
                map.put(ljhVar.xmr(), ljhVar);
                if (excVarOth.ud() == 2) {
                    ud.qdl().qdl((Map<String, ljh>) map, new ud.qdl() { // from class: com.bytedance.sdk.openadsdk.exu.qdl.2
                        @Override // com.bytedance.sdk.openadsdk.wd.ud.qdl
                        public void qdl() {
                            qdl.this.qdl(iHashCode, ljhVar, str, true);
                        }
                    }, true);
                    return;
                }
                if (excVarOth.ud() == 1) {
                    ud.qdl().qdl((Map<String, ljh>) map, (ud.qdl) null, true);
                    qdl(iHashCode, ljhVar, str, true);
                } else if (excVarOth.ud() == 0) {
                    qdl(iHashCode, ljhVar, str, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final int i2, final ljh ljhVar, final String str, final boolean z2) {
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.exu.qdl.3
            private mzz qdl(final mo moVar, fs fsVar) {
                mzz mzzVar = new mzz(yt.qdl(), null, ljhVar.yre(), fsVar, true) { // from class: com.bytedance.sdk.openadsdk.exu.qdl.3.3
                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str2) {
                        mo moVar2 = moVar;
                        if (moVar2 != null) {
                            moVar2.setPreFinish(true);
                        }
                        super.onPageFinished(webView, str2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        mo moVar2 = moVar;
                        if (moVar2 != null) {
                            moVar2.setPreStart(true);
                        }
                        super.onPageStarted(webView, str2, bitmap);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, int i3, String str2, String str3) {
                        String strMml = mzz.mml(str3);
                        boolean z3 = false;
                        boolean z4 = strMml != null && strMml.startsWith(d.c.k);
                        if (strMml != null && strMml.startsWith("mp4")) {
                            z3 = true;
                        }
                        if (!z4 && !z3 && !moVar.lnr()) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            qdl.this.qdl(i2, 4, ljhVar, str);
                        }
                        super.onReceivedError(webView, i3, str2, str3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            qdl.this.qdl(i2, 4, ljhVar, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        try {
                            if (!z2) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            mo moVar2 = moVar;
                            if (moVar2 != null) {
                                moVar2.qdl++;
                            }
                            WebResourceResponseModel webResourceResponseModelQdl = ud.qdl().qdl(ud.qdl().ud(), ljhVar.xmr(), str2);
                            if (webResourceResponseModelQdl != null && webResourceResponseModelQdl.getWebResourceResponse() != null) {
                                mo moVar3 = moVar;
                                if (moVar3 != null) {
                                    moVar3.ud++;
                                }
                                return webResourceResponseModelQdl.getWebResourceResponse();
                            }
                            if (moVar != null && webResourceResponseModelQdl != null && webResourceResponseModelQdl.getMsg() == 2) {
                                moVar.lnr++;
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        return super.shouldOverrideUrlLoading(webView, str2);
                    }
                };
                mzzVar.qdl(ljhVar);
                mzzVar.qdl(str);
                return mzzVar;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.utils.qdl qdlVarMzz;
                Activity activityUd;
                if (qdl.this.mzz != null && qdl.this.mzz.size() >= qdl.lnr) {
                    Map.Entry entry = (Map.Entry) qdl.this.mzz.entrySet().iterator().next();
                    SoftReference softReference = (SoftReference) entry.getValue();
                    if (softReference != null) {
                        mo moVar = (mo) softReference.get();
                        qdl.this.qdl(((Integer) entry.getKey()).intValue(), 1, ljhVar, moVar == null ? "" : moVar.getTag());
                    }
                }
                if (qdl.this.ud != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i2;
                    qdl.this.ud.sendMessageDelayed(messageObtain, qdl.mml);
                }
                SoftReference softReference2 = new SoftReference(new mo(yt.qdl(), false, mo.lnr.LANDING_PAGE_PRE_RENDER));
                final mo moVar2 = (mo) softReference2.get();
                if (moVar2 == null) {
                    return;
                }
                hkc hkcVar = null;
                moVar2.setLayerType(2, null);
                ax.qdl((View) moVar2, 4);
                moVar2.setTag(str);
                moVar2.setLandingPage(true);
                exc excVarOth = ljhVar.oth();
                int iQdl = excVarOth != null ? excVarOth.qdl() : 3;
                if (iQdl == 2) {
                    int iLnr = ax.lnr(yt.qdl());
                    int iMzz = ax.mzz(yt.qdl());
                    int iJb = ljhVar.jb();
                    if (iJb == 1) {
                        if (iLnr >= iMzz) {
                            moVar2.layout(0, 0, iMzz, iLnr);
                        } else {
                            moVar2.layout(0, 0, iLnr, iMzz);
                        }
                    } else if (iJb == 2) {
                        if (iLnr < iMzz) {
                            moVar2.layout(0, 0, iMzz, iLnr);
                        } else {
                            moVar2.layout(0, 0, iLnr, iMzz);
                        }
                    }
                } else if (iQdl == 1 && (qdlVarMzz = bjy.qdl().mzz()) != null && (activityUd = qdlVarMzz.ud()) != null) {
                    final int iHashCode = activityUd.hashCode();
                    qdlVarMzz.qdl(new com.bytedance.sdk.component.adexpress.qdl() { // from class: com.bytedance.sdk.openadsdk.exu.qdl.3.1
                        @Override // com.bytedance.sdk.component.adexpress.qdl
                        public void qdl(Activity activity) {
                            int i3 = iHashCode;
                            if (i3 == 0 || activity == null || i3 != activity.hashCode() || moVar2.lnr()) {
                                return;
                            }
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            qdl.this.qdl(i2, 5, ljhVar, str);
                        }
                    });
                    FrameLayout frameLayout = (FrameLayout) activityUd.findViewById(R.id.content);
                    if (frameLayout != null) {
                        frameLayout.addView(moVar2);
                    }
                }
                int iQdl2 = ud.qdl().qdl(ud.qdl().ud(), ljhVar.xmr());
                fs fsVar = new fs(ljhVar, moVar2.getWebView());
                fsVar.qdl(iQdl2 > 0 ? 2 : 0);
                fsVar.qdl(true);
                fsVar.ud(true);
                moVar2.setWebViewClient(qdl(moVar2, fsVar));
                moVar2.setWebChromeClient(new mml(hkcVar, fsVar) { // from class: com.bytedance.sdk.openadsdk.exu.qdl.3.2
                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mml, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i3) {
                        super.onProgressChanged(webView, i3);
                        if (i3 == 100) {
                            moVar2.setPreProgressHundred(true);
                        }
                    }
                });
                qdl.this.qdl(moVar2, ljhVar.od());
                qdl.qdl(ljhVar, str, Double.valueOf((System.currentTimeMillis() / 1000) - ljhVar.wsn()).floatValue(), "web_start_pre_render");
                if (qdl.this.mzz != null) {
                    qdl.this.mzz.put(Integer.valueOf(i2), softReference2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i2, int i3, ljh ljhVar, String str) {
        LinkedHashMap<Integer, SoftReference<mo>> linkedHashMap = this.mzz;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i2))) {
            this.mzz.remove(Integer.valueOf(i2));
        }
        Handler handler = this.ud;
        if (handler != null) {
            handler.removeMessages(i2);
        }
        qdl(ljhVar, str, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(mo moVar, String str) {
        if (moVar == null) {
            return;
        }
        lnr.qdl(yt.qdl()).qdl(false).ud(false).qdl(moVar.getWebView());
        moVar.setMixedContentMode(0);
        jyq.qdl(moVar, str);
    }

    public static void qdl(ljh ljhVar, String str, final float f, String str2) {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.exu.qdl.4
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", f);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(ljh ljhVar, final String str, final int i2) {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.exu.qdl.5
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }
}
