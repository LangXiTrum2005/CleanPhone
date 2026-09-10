package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.h2;
import com.applovin.impl.l0;
import com.applovin.impl.p0;
import com.applovin.impl.p8;
import com.applovin.impl.q7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u7;
import com.applovin.impl.v4;
import com.applovin.impl.z4;
import com.applovin.impl.z7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b extends l0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f7472j = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f7473k = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f7474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f7476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f7479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f7480i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends v4 {
        public a() {
        }

        @Override // com.applovin.impl.v4
        public Map a() {
            return CollectionUtils.hashMap("name", "AdWebView");
        }
    }

    public b(c cVar, com.applovin.impl.sdk.l lVar, Context context) {
        super(context);
        this.f7479h = new ArrayList();
        this.f7480i = new Object();
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f7475d = lVar;
        this.f7474c = lVar.Q();
        Integer num = (Integer) lVar.a(z4.K6);
        if (num.intValue() > 0) {
            synchronized (f7473k) {
                Set set = f7472j;
                set.add(this);
                q7.a("AdWebView", set.size(), num.intValue(), lVar.E());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(cVar != null ? cVar : new a());
        setWebChromeClient(new com.applovin.impl.t(cVar != null ? cVar.d() : null, lVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (p0.g() && ((Boolean) lVar.a(z4.f10146f6)).booleanValue()) {
            setWebViewRenderProcessClient(new d(lVar).a());
        }
        setOnTouchListener(new q(0));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.r
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f7525a.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f7477f = true;
        this.f7478g = false;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f7476e;
    }

    public void setAdHtmlLoaded(boolean z10) {
        this.f7478g = z10;
        if (z10 && ((Boolean) this.f7475d.a(z4.C6)).booleanValue()) {
            b();
        }
    }

    private void b() {
        synchronized (this.f7480i) {
            try {
                Iterator it = this.f7479h.iterator();
                while (it.hasNext()) {
                    p8.a(this, (String) it.next(), "AdWebView", this.f7475d);
                }
                this.f7479h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.p.a()) {
            return true;
        }
        this.f7474c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String string;
        if (!this.f7477f) {
            this.f7476e = bVar;
            try {
                applySettings(bVar);
                if (q7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                bVar.a(SystemClock.elapsedRealtime());
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.k(), ((com.applovin.impl.sdk.ad.a) bVar).d1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7474c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof r7) {
                    r7 r7Var = (r7) bVar;
                    u7 u7VarC1 = r7Var.c1();
                    if (u7VarC1 != null) {
                        z7 z7VarE = u7VarC1.e();
                        Uri uriC = z7VarE.c();
                        if (uriC != null) {
                            string = uriC.toString();
                        } else {
                            string = "";
                        }
                        String strB = z7VarE.b();
                        String strE1 = r7Var.e1();
                        if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strB)) {
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f7474c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (z7VarE.d() == z7.a.STATIC) {
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f7474c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String strA = a((String) this.f7475d.a(z4.S4), string);
                            if (r7Var.t1() && r7Var.isOpenMeasurementEnabled() && r7Var.u1()) {
                                strA = this.f7475d.g0().a(strA, h2.a((AppLovinAdImpl) bVar));
                            }
                            loadDataWithBaseURL(bVar.k(), strA, "text/html", null, "");
                            return;
                        }
                        if (z7VarE.d() == z7.a.HTML) {
                            if (StringUtils.isValidString(strB)) {
                                String strA2 = a(strE1, strB);
                                if (StringUtils.isValidString(strA2)) {
                                    strB = strA2;
                                }
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f7474c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + strB);
                                }
                                loadDataWithBaseURL(bVar.k(), strB, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f7474c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(string, bVar.k(), strE1, this.f7475d, r7Var);
                                return;
                            }
                            return;
                        }
                        String str = string;
                        if (z7VarE.d() == z7.a.IFRAME) {
                            if (StringUtils.isValidString(str)) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f7474c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(str, bVar.k(), strE1, this.f7475d, r7Var);
                                return;
                            } else {
                                if (StringUtils.isValidString(strB)) {
                                    String strA3 = a(strE1, strB);
                                    if (StringUtils.isValidString(strA3)) {
                                        strB = strA3;
                                    }
                                    if (com.applovin.impl.sdk.p.a()) {
                                        this.f7474c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + strB);
                                    }
                                    loadDataWithBaseURL(bVar.k(), strB, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f7474c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7474c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th2) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th2);
            }
        }
        com.applovin.impl.sdk.p.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    public void a(String str) {
        if (((Boolean) this.f7475d.a(z4.C6)).booleanValue()) {
            if (this.f7478g) {
                p8.a(this, str, "AdWebView", this.f7475d);
                return;
            }
            synchronized (this.f7479h) {
                this.f7479h.add(str);
            }
            return;
        }
        p8.a(this, str, "AdWebView", this.f7475d);
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.l lVar, r7 r7Var) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.A("Rendering webview for VAST ad with resourceContents : ", strA, this.f7474c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strA, "text/html", null, "");
            return;
        }
        String strA2 = a((String) lVar.a(z4.T4), str);
        if (StringUtils.isValidString(strA2)) {
            if (r7Var.t1() && r7Var.isOpenMeasurementEnabled()) {
                strA2 = lVar.g0().a(strA2, h2.a((AppLovinAdImpl) r7Var));
            }
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.A("Rendering webview for VAST ad with resourceContents : ", strA2, this.f7474c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strA2, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            defpackage.e.A("Rendering webview for VAST ad with resourceURL : ", str, this.f7474c, "AdWebView");
        }
        loadUrl(str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
    }
}
