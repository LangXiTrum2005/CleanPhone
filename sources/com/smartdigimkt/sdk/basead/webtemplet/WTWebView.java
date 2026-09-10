package com.smartdigimkt.sdk.basead.webtemplet;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.smartdigimkt.g6.i;
import com.smartdigimkt.g6.j;
import com.smartdigimkt.sdk.basead.ui.web.BaseWebView;
import com.smartdigimkt.u2.m;
import com.smartdigimkt.w5.g;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class WTWebView extends BaseWebView {
    private boolean A0;
    private long B0;
    private long C0;
    private long D0;
    private long E0;
    private com.smartdigimkt.g6.c F0;
    private final String g0;
    private long h0;
    private com.smartdigimkt.h7.b i0;
    private com.smartdigimkt.w6.f j0;
    private com.smartdigimkt.v6.a k0;
    private boolean l0;
    j m0;
    i n0;
    com.smartdigimkt.g6.c o0;
    private Object p0;
    private com.smartdigimkt.g6.f q0;
    private f r0;
    volatile boolean s0;
    volatile boolean t0;
    private Object u0;
    boolean v0;
    private final List<com.smartdigimkt.sdk.basead.webtemplet.a> w0;
    private volatile boolean x0;
    private String y0;
    private long z0;

    public class a implements com.smartdigimkt.g6.c {
        public a() {
        }

        @Override // com.smartdigimkt.g6.c
        public void a(WebView webView) {
            com.smartdigimkt.g6.c cVar = WTWebView.this.o0;
            if (cVar != null) {
                cVar.a(webView);
            }
        }

        @Override // com.smartdigimkt.g6.c
        public void loadingResourceStatus(WebView webView, int i2) {
            com.smartdigimkt.g6.c cVar = WTWebView.this.o0;
            if (cVar != null) {
                cVar.loadingResourceStatus(webView, i2);
            }
        }

        @Override // com.smartdigimkt.g6.c
        public void onPageFinished(WebView webView, String str) {
            com.smartdigimkt.g6.c cVar = WTWebView.this.o0;
            if (cVar != null) {
                cVar.onPageFinished(webView, str);
            }
        }

        @Override // com.smartdigimkt.g6.c
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (WTWebView.this.B0 == 0) {
                WTWebView.this.B0 = System.currentTimeMillis();
            }
            com.smartdigimkt.g6.c cVar = WTWebView.this.o0;
            if (cVar != null) {
                cVar.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // com.smartdigimkt.g6.c
        public void onProgressChanged(WebView webView, int i2) {
            com.smartdigimkt.g6.c cVar = WTWebView.this.o0;
            if (cVar != null) {
                cVar.onProgressChanged(webView, i2);
            }
        }

        @Override // com.smartdigimkt.g6.c
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            com.smartdigimkt.g6.c cVar = WTWebView.this.o0;
            if (cVar != null) {
                cVar.onReceivedError(webView, i2, str, str2);
            }
            WTWebView.this.a("", "onReceivedError:" + i2 + "," + str);
        }

        @Override // com.smartdigimkt.g6.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            com.smartdigimkt.g6.c cVar = WTWebView.this.o0;
            if (cVar != null) {
                cVar.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
            WTWebView.this.a("", "onReceivedSslError");
        }

        @Override // com.smartdigimkt.g6.c
        public void onRenderProcessGone(WebView webView) {
            com.smartdigimkt.g6.c cVar = WTWebView.this.o0;
            if (cVar != null) {
                cVar.onRenderProcessGone(webView);
            }
            WTWebView.this.a("", "onRenderProcessGone");
        }

        @Override // com.smartdigimkt.g6.c
        public void readyState(WebView webView, int i2) {
            com.smartdigimkt.g6.c cVar = WTWebView.this.o0;
            if (cVar != null) {
                cVar.readyState(webView, i2);
            }
        }

        @Override // com.smartdigimkt.g6.c
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.smartdigimkt.g6.c cVar = WTWebView.this.o0;
            if (cVar != null) {
                return cVar.shouldOverrideUrlLoading(webView, str);
            }
            return false;
        }
    }

    public class b implements com.smartdigimkt.h7.b {
        public b() {
        }

        @Override // com.smartdigimkt.h7.b
        public boolean a() {
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            WTWebView.this.h5ShowException("{\"error_code\":-999,\"error_message\":\"render timeout\"}");
        }
    }

    public class c implements ViewTreeObserver.OnPreDrawListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            try {
                if (WTWebView.this.s0) {
                    return false;
                }
                WTWebView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                WTWebView.this.s0 = true;
                WTWebView.this.f();
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
    }

    public class d implements Runnable {
        final /* synthetic */ String X;

        public d(String str) {
            this.X = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.i7.d.b(WTWebView.this.j0, WTWebView.this.k0, this.X);
        }
    }

    public class e implements Runnable {
        final /* synthetic */ int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ Map f38589Y;

        public e(int i2, Map map) {
            this.X = i2;
            this.f38589Y = map;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01ec A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:101:0x01ed  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.smartdigimkt.k6.c] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // java.lang.Runnable
        public void run() {
            String str;
            ?? r3;
            String str2;
            String string;
            ?? r1 = this.X;
            String string2 = "";
            if (r1 != 101) {
                try {
                    if (r1 != 301) {
                        if (r1 == 305) {
                            Map map = this.f38589Y;
                            r1 = com.smartdigimkt.k6.b.a.o;
                            if (map != null) {
                                JSONObject jSONObject = new JSONObject();
                                Object obj = this.f38589Y.get("wt_view_width");
                                if (obj != null) {
                                    jSONObject.put("view_width", obj);
                                }
                                Object obj2 = this.f38589Y.get("wt_view_height");
                                if (obj2 != null) {
                                    jSONObject.put("view_height", obj2);
                                }
                                string = jSONObject.toString();
                                r1 = r1;
                            }
                            str2 = string2;
                            r3 = r1;
                        } else if (r1 == 107) {
                            str = com.smartdigimkt.k6.b.a.f36224n;
                        } else if (r1 != 108) {
                            switch (r1) {
                                case 110:
                                    str = com.smartdigimkt.k6.b.a.f;
                                    break;
                                case 111:
                                    str = com.smartdigimkt.k6.b.a.f36220e;
                                    break;
                                case 112:
                                    str = com.smartdigimkt.k6.b.a.g;
                                    break;
                                case 113:
                                    Map map2 = this.f38589Y;
                                    r1 = com.smartdigimkt.k6.b.a.f36218b;
                                    if (map2 != null) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        Object obj3 = this.f38589Y.get("click_type");
                                        if (obj3 != null) {
                                            jSONObject2.put("cl_s_type", obj3);
                                        }
                                        Object obj4 = this.f38589Y.get(g.a.g);
                                        if (obj3 != null) {
                                            jSONObject2.put("cl_area", obj4);
                                        }
                                        string = jSONObject2.toString();
                                        r1 = r1;
                                    }
                                    str2 = string2;
                                    r3 = r1;
                                    break;
                                case 114:
                                    str = com.smartdigimkt.k6.b.a.f36217a;
                                    break;
                                case 115:
                                    str = com.smartdigimkt.k6.b.a.f36219c;
                                    break;
                                default:
                                    switch (r1) {
                                        case 121:
                                            if (this.f38589Y == null) {
                                                str2 = "";
                                                r3 = com.smartdigimkt.k6.b.a.f36221h;
                                            } else {
                                                try {
                                                    JSONObject jSONObject3 = new JSONObject();
                                                    Object obj5 = this.f38589Y.get(g.a.f39430h);
                                                    if (obj5 != null) {
                                                        jSONObject3.put(g.a.f39430h, obj5);
                                                    }
                                                    string2 = jSONObject3.toString();
                                                } catch (Throwable unused) {
                                                }
                                                r1 = com.smartdigimkt.k6.b.a.f36221h;
                                                str2 = string2;
                                                r3 = r1;
                                            }
                                            break;
                                        case 122:
                                            str = com.smartdigimkt.k6.b.a.f36222i;
                                            break;
                                        case 123:
                                            Map map3 = this.f38589Y;
                                            r1 = com.smartdigimkt.k6.b.a.j;
                                            if (map3 != null) {
                                                JSONObject jSONObject4 = new JSONObject();
                                                Object obj6 = this.f38589Y.get("video_length");
                                                if (obj6 != null) {
                                                    jSONObject4.put("duration", obj6);
                                                }
                                                string = jSONObject4.toString();
                                                r1 = r1;
                                            }
                                            str2 = string2;
                                            r3 = r1;
                                            break;
                                        case 124:
                                            str = com.smartdigimkt.k6.b.a.m;
                                            break;
                                        case 125:
                                            Map map4 = this.f38589Y;
                                            r1 = com.smartdigimkt.k6.b.a.f36225p;
                                            if (map4 != null) {
                                                JSONObject jSONObject5 = new JSONObject();
                                                Object obj7 = this.f38589Y.get(g.a.k);
                                                if (obj7 != null) {
                                                    jSONObject5.put("progress", obj7);
                                                }
                                                string = jSONObject5.toString();
                                                r1 = r1;
                                            }
                                            str2 = string2;
                                            r3 = r1;
                                            break;
                                        default:
                                            str2 = "";
                                            r3 = string2;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            Map map5 = this.f38589Y;
                            r1 = com.smartdigimkt.k6.b.a.f36223l;
                            if (map5 != null) {
                                JSONObject jSONObject6 = new JSONObject();
                                Object obj8 = this.f38589Y.get(g.a.f39431i);
                                if (obj8 != null) {
                                    jSONObject6.put("error_message", obj8);
                                }
                                string = jSONObject6.toString();
                                r1 = r1;
                            }
                            str2 = string2;
                            r3 = r1;
                        }
                        if (TextUtils.isEmpty(r3)) {
                            return;
                        }
                        com.smartdigimkt.k6.c.a().a(WTWebView.this, r3, str2);
                    }
                    String str3 = com.smartdigimkt.k6.b.a.d;
                    JSONObject jSONObject7 = new JSONObject();
                    JSONObject jSONObject8 = new JSONObject();
                    String strS = WTWebView.this.j0.s();
                    if (!TextUtils.isEmpty(strS)) {
                        if (WTWebView.this.j0.F() > 0 || WTWebView.this.j0.D() > 0) {
                            jSONObject8.put("image_width", WTWebView.this.j0.F());
                            jSONObject8.put("image_height", WTWebView.this.j0.D());
                        } else {
                            int[] iArrA = com.smartdigimkt.o8.b.a(com.smartdigimkt.m3.j.a().a(1, strS));
                            if (iArrA != null) {
                                jSONObject8.put("image_width", iArrA[0]);
                                jSONObject8.put("image_height", iArrA[1]);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(WTWebView.this.j0.k0()) && WTWebView.this.j0.l0() > 0 && WTWebView.this.j0.j0() > 0) {
                        jSONObject8.put("video_width", WTWebView.this.j0.l0());
                        jSONObject8.put("video_height", WTWebView.this.j0.j0());
                    }
                    jSONObject7.put(com.smartdigimkt.k6.b.c.g, jSONObject8);
                    string = jSONObject7.toString();
                    r1 = str3;
                    string2 = string;
                } catch (Throwable unused2) {
                }
                str2 = string2;
                r3 = r1;
                if (TextUtils.isEmpty(r3)) {
                    return;
                }
                com.smartdigimkt.k6.c.a().a(WTWebView.this, r3, str2);
            }
            str = com.smartdigimkt.k6.b.a.k;
            r3 = str;
            str2 = "";
            if (TextUtils.isEmpty(r3)) {
                return;
            }
            com.smartdigimkt.k6.c.a().a(WTWebView.this, r3, str2);
        }
    }

    public interface f {
        void a();
    }

    public WTWebView(Context context) {
        super(context);
        this.g0 = "WTWebView";
        this.h0 = m.D0;
        this.s0 = false;
        this.t0 = false;
        this.u0 = new Object();
        this.v0 = false;
        this.w0 = androidx.media3.extractor.text.ttml.a.u();
        this.x0 = false;
        this.y0 = "";
        this.A0 = false;
        this.B0 = 0L;
        this.C0 = 0L;
        this.D0 = 0L;
        this.E0 = 0L;
        this.F0 = new a();
    }

    private void e() {
        Class cls = Boolean.TYPE;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setTextZoom(100);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable unused) {
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setAllowUniversalAccessFromFileURLs(false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            settings.setMixedContentMode(1);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod(com.smartdigimkt.n8.b.a("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, 0);
        } catch (Throwable unused2) {
        }
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", cls);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(settings, Boolean.FALSE);
        } catch (Throwable unused3) {
        }
        try {
            Method declaredMethod3 = WebSettings.class.getDeclaredMethod(com.smartdigimkt.n8.b.a("c2V0QWxsb3dVbml2ZXJzYWxBY2Nlc3NGcm9tRmlsZVVSTHM="), cls);
            declaredMethod3.setAccessible(true);
            declaredMethod3.invoke(settings, Boolean.TRUE);
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        f fVar;
        synchronized (this.u0) {
            try {
                if (this.s0 && this.t0 && (fVar = this.r0) != null) {
                    fVar.a();
                    this.r0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object getJsCommunicationObject() {
        return this.p0;
    }

    public Object getJsObject(String str) {
        com.smartdigimkt.g6.f fVar = this.q0;
        if (fVar == null) {
            return null;
        }
        return fVar.a(str);
    }

    public void h5ShowException(String str) {
        String strOptString;
        if (this.i0 != null) {
            com.smartdigimkt.h7.e.b().a(this.i0);
            this.i0 = null;
        }
        int iOptInt = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            iOptInt = jSONObject.optInt("error_code", 0);
            strOptString = jSONObject.optString("error_message", "");
        } catch (Throwable unused) {
            strOptString = "unknown";
        }
        a(iOptInt == -999 ? 3 : 2, iOptInt + "," + strOptString);
        com.smartdigimkt.g6.c cVar = this.o0;
        if (cVar != null) {
            cVar.onReceivedError(this, iOptInt, strOptString, getUrl());
        }
        a(androidx.datastore.preferences.protobuf.a.f(iOptInt, ""), strOptString);
    }

    public void initData(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, boolean z2) {
        com.smartdigimkt.w6.g gVar;
        this.j0 = fVar;
        this.k0 = aVar;
        this.l0 = z2;
        if (aVar == null || (gVar = aVar.t) == null) {
            return;
        }
        this.h0 = gVar.e0();
    }

    public boolean isPreload() {
        return this.l0;
    }

    public void jsCallInitSuccess() {
        this.C0 = System.currentTimeMillis();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (TextUtils.isEmpty(this.y0)) {
            this.y0 = str;
            this.z0 = System.currentTimeMillis();
            if (this.i0 == null) {
                this.i0 = new b();
                com.smartdigimkt.h7.e.b().a(this.i0, this.h0);
            }
        }
        super.loadUrl(str);
    }

    public void notifyInnerAdEvent(int i2, Map<String, Object> map) {
        if (this.x0) {
            com.smartdigimkt.l7.b.a().b((Runnable) new e(i2, map), 2);
            return;
        }
        synchronized (this.w0) {
            this.w0.add(new com.smartdigimkt.sdk.basead.webtemplet.a(i2, map));
        }
    }

    public void offerDataInject() {
        this.D0 = System.currentTimeMillis();
        String string = "";
        try {
            if (getContext() == null) {
                com.smartdigimkt.m6.b.p().k();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("offer_data", new JSONObject(this.j0.U()));
            JSONObject jSONObject2 = new JSONObject();
            String strS = this.j0.s();
            if (!TextUtils.isEmpty(strS)) {
                if (this.j0.F() > 0 || this.j0.D() > 0) {
                    jSONObject2.put("image_width", this.j0.F());
                    jSONObject2.put("image_height", this.j0.D());
                } else {
                    int[] iArrA = com.smartdigimkt.o8.b.a(com.smartdigimkt.m3.j.a().a(1, strS));
                    if (iArrA != null) {
                        jSONObject2.put("image_width", iArrA[0]);
                        jSONObject2.put("image_height", iArrA[1]);
                    }
                }
            }
            if (!TextUtils.isEmpty(this.j0.k0()) && this.j0.l0() > 0 && this.j0.j0() > 0) {
                jSONObject2.put("video_width", this.j0.l0());
                jSONObject2.put("video_height", this.j0.j0());
            }
            jSONObject.put(com.smartdigimkt.k6.b.c.g, jSONObject2);
            string = jSONObject.toString();
        } catch (Throwable unused) {
        }
        com.smartdigimkt.k6.c.a().a((WebView) this, com.smartdigimkt.k6.b.C0521b.f36226a, string);
        this.E0 = System.currentTimeMillis();
        this.x0 = true;
        synchronized (this.w0) {
            try {
                if (!this.w0.isEmpty()) {
                    for (com.smartdigimkt.sdk.basead.webtemplet.a aVar : this.w0) {
                        notifyInnerAdEvent(aVar.f38590a, aVar.f38591b);
                    }
                    this.w0.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.web.BaseWebView, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v0) {
            return;
        }
        this.v0 = true;
        notifyInnerAdEvent(301, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("wt_view_width", Integer.valueOf(i2));
            map.put("wt_view_height", Integer.valueOf(i3));
            notifyInnerAdEvent(305, map);
        } catch (Throwable unused) {
        }
    }

    public void prepare(f fVar) {
        this.r0 = fVar;
        getViewTreeObserver().addOnPreDrawListener(new c());
    }

    public void release() {
        try {
            if (this.i0 != null) {
                com.smartdigimkt.h7.e.b().a(this.i0);
                this.i0 = null;
            }
            setVisibility(8);
            setDownloadListener(null);
            this.p0 = null;
            if (this.F0 != null) {
                this.F0 = null;
            }
            if (this.o0 != null) {
                this.o0 = null;
            }
            destroy();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void renderSuccess() {
        if (this.i0 != null) {
            com.smartdigimkt.h7.e.b().a(this.i0);
            this.i0 = null;
        }
        this.t0 = true;
        com.smartdigimkt.g6.c cVar = this.o0;
        if (cVar != null) {
            cVar.a(this);
        }
        f();
        d();
    }

    public void sendEventDA(String str) {
        com.smartdigimkt.l7.b.a().g(new d(str));
    }

    public void setJsCommunicationObject(Object obj) {
        this.p0 = obj;
    }

    public void setWebViewListener(com.smartdigimkt.g6.c cVar) {
        this.o0 = cVar;
        i iVar = this.n0;
        if (iVar != null) {
            iVar.a(this.F0);
        }
        j jVar = this.m0;
        if (jVar != null) {
            jVar.a(this.F0);
        }
    }

    public void setWebViewTransparent() {
        setBackgroundColor(0);
        setBackgroundDrawable(null);
        setBackground(null);
    }

    private void d() {
        a(1, "");
        if (!this.j0.s0() || TextUtils.isEmpty(this.j0.n())) {
            return;
        }
        HashMap map = new HashMap();
        map.put(g.a.f39430h, this.j0.n());
        notifyInnerAdEvent(121, map);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.web.BaseWebView
    public void b() {
        super.b();
        e();
        i iVar = new i(this);
        this.n0 = iVar;
        iVar.a(this);
        setWebChromeClient(this.n0);
        j jVar = new j();
        this.m0 = jVar;
        jVar.a(this);
        setWebViewClient(this.m0);
        this.q0 = new com.smartdigimkt.g6.f(this);
        setWebViewTransparent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        com.smartdigimkt.h6.a aVarA;
        Object obj = this.p0;
        if (obj == null || !(obj instanceof com.smartdigimkt.h6.e) || (aVarA = ((com.smartdigimkt.h6.e) obj).a()) == null) {
            return;
        }
        aVarA.a(str, str2);
    }

    private synchronized void a(int i2, String str) {
        if (!this.A0 && !this.e0) {
            this.A0 = true;
            com.smartdigimkt.w6.f fVar = this.j0;
            com.smartdigimkt.v6.a aVar = this.k0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.z0;
            com.smartdigimkt.i7.d.a(fVar, aVar, i2, jCurrentTimeMillis - j, str, this.B0, this.C0, this.D0, this.E0, j);
        }
    }

    private int b(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            return (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName) || !packageInfo.versionName.equals("77.0.3865.92")) ? 0 : 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    public WTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g0 = "WTWebView";
        this.h0 = m.D0;
        this.s0 = false;
        this.t0 = false;
        this.u0 = new Object();
        this.v0 = false;
        this.w0 = androidx.media3.extractor.text.ttml.a.u();
        this.x0 = false;
        this.y0 = "";
        this.A0 = false;
        this.B0 = 0L;
        this.C0 = 0L;
        this.D0 = 0L;
        this.E0 = 0L;
        this.F0 = new a();
    }

    public WTWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g0 = "WTWebView";
        this.h0 = m.D0;
        this.s0 = false;
        this.t0 = false;
        this.u0 = new Object();
        this.v0 = false;
        this.w0 = androidx.media3.extractor.text.ttml.a.u();
        this.x0 = false;
        this.y0 = "";
        this.A0 = false;
        this.B0 = 0L;
        this.C0 = 0L;
        this.D0 = 0L;
        this.E0 = 0L;
        this.F0 = new a();
    }
}
