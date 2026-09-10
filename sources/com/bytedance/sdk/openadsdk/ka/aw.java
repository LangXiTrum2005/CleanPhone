package com.bytedance.sdk.openadsdk.ka;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.google.android.gms.ads.AdSize;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aw {
    private static final int[] ik = {10, 30, 50, 75, 100};
    private boolean ac;
    private String aw;
    private int ay;
    private String bgr;
    private volatile long bnj;
    private boolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18155co;
    private int di;
    private long dw;
    private final int[] dzy;
    private volatile int fe;
    private final AtomicInteger feb;
    private long fi;
    private final wjv fr;
    private final AtomicBoolean gcp;
    private long hcw;
    private boolean ig;
    private long igq;
    private int ihz;
    private final AtomicBoolean jbs;
    private co jc;
    private int ka;
    private volatile long kt;
    AtomicBoolean lr;
    private final AtomicBoolean mj;
    private boolean nd;
    private com.bytedance.sdk.openadsdk.uq.mj nr;
    private boolean oh;
    private long ory;
    private WeakReference<WebView> pv;
    private com.bytedance.sdk.openadsdk.ka.ka.fi qd;
    private long qh;
    private final AtomicBoolean qt;
    public com.bytedance.sdk.openadsdk.core.widget.ri.di.ri ri;
    private String rzk;
    private int sf;
    private volatile long siy;
    private com.bytedance.sdk.openadsdk.core.widget.ri.di slm;
    private boolean srn;
    private String su;
    private int ta;
    private jbs tan;
    private final AtomicBoolean tnn;
    private String tw;
    private long uq;
    private final Context vr;
    private volatile long whw;
    private long wjv;
    private final boolean xd;
    private final AtomicBoolean xha;
    private final AtomicBoolean xm;
    private long zf;
    private final AtomicInteger zyn;

    public static class ri {
        private final int[] ri;

        public ri(int[] iArr) {
            this.ri = iArr;
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int iIntValue;
            try {
                iIntValue = Float.valueOf(str).intValue();
                if (iIntValue > 100) {
                    iIntValue = 100;
                } else if (iIntValue < 0) {
                    iIntValue = 0;
                }
            } catch (Throwable unused) {
            }
            int[] iArr = this.ri;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            iArr[0] = iIntValue;
        }
    }

    public aw(wjv wjvVar, WebView webView, co coVar, int i) {
        this(wjvVar, webView);
        this.jc = coVar;
        this.ta = i;
    }

    private boolean jbs() {
        wjv wjvVar;
        return this.srn && (wjvVar = this.fr) != null && wjvVar.dzy();
    }

    private int qt() {
        WeakReference<WebView> weakReference = this.pv;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() == 0) {
                    return 1;
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public void di() {
        if (jbs() && this.siy > 0 && this.whw > 0 && !this.xm.getAndSet(true)) {
            ik.lr(this.whw - this.siy, this.fr, this.rzk, (String) null);
        }
    }

    public void mj() {
        if (("landingpage".equals(this.su) || "landingpage_endcard".equals(this.su) || "landingpage_split_screen".equals(this.su) || "landingpage_direct".equals(this.su) || "aggregate_page".equals(this.su) || "landingpage_split_ceiling".equals(this.su)) && this.di == 2) {
            if (this.zf > 0 || !ik()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - Math.max(this.igq, this.zf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.di);
                    jSONObject.put("max_scroll_percent", this.dzy[0]);
                    jSONObject.put("jump_times", this.feb.getAndSet(0));
                    jSONObject.put("click_times", this.zyn.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.qt.set(true);
                ri("stay_page", jSONObject, Math.min(jCurrentTimeMillis, TTAdConstant.AD_MAX_EVENT_TIME));
                com.bytedance.sdk.openadsdk.di.lr.ri().ri("landingPause", this.fr, this.tw);
            }
        }
    }

    public void xha() {
        if (this.hcw == 0) {
            this.hcw = System.currentTimeMillis();
        }
        this.igq = System.currentTimeMillis();
        if ("landingpage".equals(this.su) || "landingpage_endcard".equals(this.su) || "landingpage_split_screen".equals(this.su) || "landingpage_direct".equals(this.su) || "aggregate_page".equals(this.su)) {
            if (this.gcp.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.di.lr.ri().ri("landingStart", this.fr, this.tw);
            } else {
                com.bytedance.sdk.openadsdk.di.lr.ri().ri("landingContinue", this.fr, this.tw);
            }
        }
        if (ac.mj(this.fr) || ac.lr(this.fr)) {
            ri(true, SystemClock.elapsedRealtime());
        }
    }

    public void fi() {
        if (jbs()) {
            this.siy = SystemClock.elapsedRealtime();
            di();
        }
    }

    public boolean ik() {
        return this.srn;
    }

    public void ka() {
        if (jbs()) {
            this.bnj = SystemClock.elapsedRealtime();
            ik.ri(this.fr, this.rzk);
        }
    }

    public com.bytedance.sdk.openadsdk.ka.ka.fi lr() {
        return this.qd;
    }

    public void ik(boolean z) {
        this.srn = z;
    }

    public aw lr(boolean z) {
        this.ig = z;
        return this;
    }

    public aw(wjv wjvVar, WebView webView) {
        this(wjvVar, webView, false);
    }

    public void ik(String str) {
        if (!this.ig || this.fr == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i = this.ta;
            if (i >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.fr.smj();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        ri("load_start", jSONObject);
    }

    public void lr(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.rzk = str;
    }

    public wjv ri() {
        return this.fr;
    }

    public aw(wjv wjvVar, WebView webView, boolean z) {
        this.ka = 0;
        this.fi = -1L;
        this.di = 1;
        this.xha = new AtomicBoolean(false);
        this.mj = new AtomicBoolean(false);
        this.jbs = new AtomicBoolean(false);
        this.qt = new AtomicBoolean(false);
        this.sf = -1;
        this.ac = false;
        this.ihz = 0;
        this.lr = new AtomicBoolean(false);
        this.su = "landingpage";
        this.igq = 0L;
        this.zf = 0L;
        this.dw = 0L;
        this.ory = 0L;
        this.hcw = 0L;
        this.oh = false;
        this.xd = false;
        int[] iArr = {0};
        this.dzy = iArr;
        this.ig = false;
        this.srn = false;
        this.kt = 0L;
        this.feb = new AtomicInteger(0);
        this.zyn = new AtomicInteger(0);
        this.tnn = new AtomicBoolean(false);
        this.fe = 0;
        this.ta = -1;
        this.xm = new AtomicBoolean(false);
        this.gcp = new AtomicBoolean(false);
        this.nd = false;
        Context contextRi = com.bytedance.sdk.openadsdk.core.nr.ri();
        this.vr = contextRi;
        this.fr = wjvVar;
        if (webView == null) {
            return;
        }
        this.ac = z;
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.pv = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (wjvVar != null && wjvVar.ezp()) {
            com.bytedance.sdk.openadsdk.core.widget.ri.di diVar = new com.bytedance.sdk.openadsdk.core.widget.ri.di(webView2, wjvVar, contextRi, this.ac);
            this.slm = diVar;
            this.ri = diVar.ik();
        }
        if (wjvVar != null && wjvVar.evm() && com.bytedance.sdk.openadsdk.core.settings.sf.lr().ay()) {
            this.tan = new jbs(wjvVar, webView, this.ac);
        }
        if (webView instanceof com.bytedance.sdk.component.jbs.fi) {
            this.qh = ((com.bytedance.sdk.component.jbs.fi) webView2).ri;
        } else {
            this.qh = System.currentTimeMillis();
        }
        try {
            webView2.addJavascriptInterface(new ri(iArr), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ri("LandingPageLog", "addJavascriptInterface exception", e);
        }
        if (wjvVar != null && wjvVar.ljo() != null) {
            this.fi = wjvVar.ljo().optLong("page_id", -1L);
        }
        this.tw = String.valueOf(SystemClock.elapsedRealtime());
    }

    private String fi(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void ka(boolean z) {
        WeakReference<WebView> weakReference = this.pv;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.ac.ri("LandingPageLog", "removeJavascriptInterface exception", e);
            }
        }
        if (this.mj.compareAndSet(false, true)) {
            ri(z, "1");
            if (this.ig) {
                ik.ri(this.fr, this.su, System.currentTimeMillis() - this.hcw, this.ta, qt());
            }
        } else if (this.di == 2 && !this.qt.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.di);
                jSONObject.put("max_scroll_percent", this.dzy[0]);
                jSONObject.put("jump_times", this.feb.getAndSet(0));
                jSONObject.put("click_times", this.zyn.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            ri("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.su) || "landingpage_endcard".equals(this.su) || "landingpage_split_screen".equals(this.su) || "landingpage_direct".equals(this.su) || "aggregate_page".equals(this.su) || "landingpage_split_ceiling".equals(this.su)) {
            com.bytedance.sdk.openadsdk.di.lr.ri().ri("landingFinish", this.fr, this.tw);
        }
    }

    public void ri(boolean z) {
        if (z) {
            this.ihz = 1;
        }
    }

    public void fi(boolean z) {
        this.nd = z;
    }

    public void lr(WebView webView, String str, boolean z) {
        jbs jbsVar = this.tan;
        if (jbsVar == null || !z) {
            return;
        }
        jbsVar.ri(webView, str);
    }

    public void ri(co coVar) {
        this.jc = coVar;
    }

    public void ri(long j) {
        this.zf = j;
    }

    public void lr(int i) {
        com.bytedance.sdk.openadsdk.core.widget.ri.di diVar = this.slm;
        if (diVar == null || !this.bu) {
            return;
        }
        diVar.ri(i);
    }

    public void ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.ri.di diVar = this.slm;
        if (diVar != null) {
            diVar.ri(str);
        }
        jbs jbsVar = this.tan;
        if (jbsVar != null) {
            jbsVar.ik(str);
        }
        this.su = str;
    }

    public void ri(int i) {
        this.ta = i;
    }

    public void ri(com.bytedance.sdk.openadsdk.ka.ka.fi fiVar) {
        this.qd = fiVar;
    }

    public void ri(com.bytedance.sdk.openadsdk.uq.mj mjVar) {
        this.nr = mjVar;
    }

    public void ri(WebView webView, int i) {
        if (webView == null) {
            return;
        }
        if (this.kt == 0) {
            this.kt = SystemClock.elapsedRealtime();
        }
        if (this.dw == 0 && i > 0) {
            this.dw = System.currentTimeMillis();
        } else if (this.ory == 0 && i == 100) {
            this.ory = System.currentTimeMillis();
        }
        if (this.ka != ik.length && ("landingpage".equals(this.su) || "landingpage_endcard".equals(this.su) || "landingpage_split_screen".equals(this.su) || "landingpage_direct".equals(this.su) || "aggregate_page".equals(this.su))) {
            int i2 = this.ka;
            while (true) {
                int[] iArr = ik;
                if (i2 >= iArr.length || i < iArr[this.ka]) {
                    break;
                }
                int i3 = i2 + 1;
                this.ka = i3;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j = this.fi;
                    if (j != -1) {
                        jSONObject.put("page_id", j);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i2]);
                } catch (Exception unused) {
                }
                ri("progress_load_finish", jSONObject);
                i2 = i3;
            }
        }
        if (i == 100) {
            ri(false, SystemClock.elapsedRealtime());
            ri(webView.getUrl(), NotificationCompat.CATEGORY_PROGRESS, Math.min(this.ory - this.dw, TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    public void ka(String str) {
        if (!this.ig || this.fr == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i = this.ta;
            if (i >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.fr.smj();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        ri("progress_load_finish", jSONObject);
    }

    private void ri(String str, String str2, long j) {
        if (this.jbs.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, 200);
                    int i = AdSize.MEDIUM_RECTANGLE_WIDTH;
                    if (iIndexOf == -1 || iIndexOf > 300) {
                        iIndexOf = str.indexOf(63);
                    }
                    if (iIndexOf != -1 && iIndexOf <= 300) {
                        i = iIndexOf;
                    }
                    str = str.substring(0, i);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            ri("load_finish_progress", jSONObject, j);
        }
    }

    public void ri(WebView webView, String str, Bitmap bitmap, boolean z, int i) {
        this.bu = z;
        this.ay++;
        com.bytedance.sdk.openadsdk.core.widget.ri.di diVar = this.slm;
        if (diVar != null && z) {
            diVar.lr(str);
            this.slm.lr();
        }
        jbs jbsVar = this.tan;
        if (jbsVar != null && z) {
            jbsVar.ri(str, i);
        }
        WeakReference<WebView> weakReference = this.pv;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > this.fe) {
                    this.feb.incrementAndGet();
                }
                this.fe = webBackForwardListCopyBackForwardList.getCurrentIndex();
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.ac.ri("LandingPageLog", "copyBackForwardList exception", e);
            }
        }
        if (this.kt == 0) {
            this.kt = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.qd;
        if (fiVar != null) {
            fiVar.ka();
        }
        if (this.xha.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i2 = this.ta;
                if (i2 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i2));
                }
            } catch (Exception unused) {
            }
            ri("load_start", jSONObject);
        }
    }

    public void ri(WebView webView, String str, boolean z) {
        ri(false, SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.core.widget.ri.di diVar = this.slm;
        if (diVar != null && z) {
            diVar.ri();
        }
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.qd;
        if (fiVar != null) {
            fiVar.fi();
        }
        jbs jbsVar = this.tan;
        if (jbsVar != null && z) {
            jbsVar.ri(str);
        }
        if (webView != null && !this.oh && this.ig) {
            this.oh = true;
            com.bytedance.sdk.component.utils.bgr.ri(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.mj.compareAndSet(false, true)) {
            if (this.di != 3) {
                this.di = 2;
            }
            this.igq = System.currentTimeMillis();
            boolean z2 = this.di == 2;
            int iQt = qt();
            if (z2) {
                long j = this.ory - this.dw;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.sf);
                    jSONObject.put("error_msg", this.aw);
                    jSONObject.put("error_url", this.bgr);
                    int i = this.ta;
                    if (i >= 0) {
                        jSONObject.put("preload_status", i);
                    }
                    jSONObject.put("first_page", iQt);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.fr.smj());
                    jSONObject.put("preload_h5_type", this.fr.qd());
                } catch (Exception unused) {
                }
                ri(z, "0");
                long jMin = Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME);
                ri("load_finish", jSONObject, jMin);
                if (jbs()) {
                    this.whw = SystemClock.elapsedRealtime();
                    di();
                    ik.ri(this.fr, this.rzk, this.whw - this.bnj);
                }
                ri(str, "load_finish", jMin);
                co coVar = this.jc;
                if (coVar != null) {
                    coVar.ri(iQt);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.sf);
                jSONObject2.put("error_msg", this.aw);
                jSONObject2.put("error_url", this.bgr);
                jSONObject2.put("first_page", iQt);
                int i2 = this.ta;
                if (i2 >= 0) {
                    jSONObject2.put("preload_status", i2);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.fr.smj());
                jSONObject2.put("preload_h5_type", this.fr.qd());
            } catch (Exception unused2) {
            }
            ri(z, "2");
            ri("load_fail", jSONObject2);
            if (jbs()) {
                ik.ri(this.fr, this.rzk, SystemClock.elapsedRealtime() - this.bnj, this.sf, this.aw, this.bgr);
            }
            if (this.f18155co) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                ri("load_fail_main", jSONObject2);
            }
        }
    }

    public void ri(WebView webView, int i, String str, String str2, String str3, boolean z) {
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.qd;
        if (fiVar != null) {
            fiVar.ri((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.di != 2) {
            this.di = 3;
        }
        this.sf = i;
        this.aw = str;
        this.bgr = str2;
        this.f18155co = z;
    }

    public void ri(com.bytedance.sdk.component.jbs.di diVar) {
        int iSaa;
        Bitmap bitmapRi;
        wjv wjvVar;
        if ((!"landingpage".equals(this.su) && !"landingpage_endcard".equals(this.su) && !"landingpage_split_screen".equals(this.su) && !"landingpage_direct".equals(this.su) && !"aggregate_page".equals(this.su)) || (iSaa = com.bytedance.sdk.openadsdk.core.nr.ka().saa()) == 0 || new Random().nextInt(100) + 1 > iSaa || diVar == null || diVar.getWebView() == null || diVar.getVisibility() != 0 || (bitmapRi = qd.ri(diVar)) == null || (wjvVar = this.fr) == null) {
            return;
        }
        qd.ri(wjvVar, this.su, "landing_page_blank", bitmapRi, diVar.getUrl(), this.fi);
    }

    private void ri(String str, JSONObject jSONObject) {
        ri(str, jSONObject, -1L);
    }

    private void ri(final String str, final JSONObject jSONObject, final long j) {
        if (!this.ig || this.fr == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.mj mjVar = this.nr;
        final int iIg = mjVar != null ? mjVar.ig() : -1;
        ik.ri(System.currentTimeMillis(), this.fr, this.su, str, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.aw.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                if (jSONObject != null) {
                    try {
                        boolean zLr = dw.lr(aw.this.fr);
                        jSONObject.put("is_playable", zLr ? 1 : 0);
                        jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ri(aw.this.fr) ? 1 : 0);
                        if (zLr && ("load_finish".equals(str) || "load_fail".equals(str))) {
                            jSONObject.put("playable_has_show", iIg);
                        }
                        if ("stay_page".equals(str)) {
                            jSONObject.put("first_page", aw.this.ay > 1 ? 0 : 1);
                        }
                    } catch (JSONException unused) {
                    }
                }
                String unused2 = aw.this.su;
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 > 0) {
                        jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j2);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if ("load_start".equals(str) || "load_finish".equals(str) || "progress_load_finish".equals(str)) {
                        jSONObject2.put("is_reused", aw.this.nd ? 1 : 0);
                    }
                    if (com.bytedance.sdk.openadsdk.bgr.ri.ik(aw.this.fr)) {
                        jSONObject2.put("is_lp_pre_render", aw.this.ihz);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public void ri(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.ri.di diVar = this.slm;
        if (diVar != null && this.bu) {
            diVar.ri(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.kt != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.zyn.incrementAndGet();
                this.zyn.get();
                if (this.tnn.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.fr.smj());
                } catch (JSONException unused) {
                }
                ri("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.kt, 0L));
            }
        }
    }

    public void ri(String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.ri.di diVar = this.slm;
        if (diVar != null && z) {
            diVar.ik(str);
        }
        jbs jbsVar = this.tan;
        if (jbsVar == null || !z) {
            return;
        }
        jbsVar.lr(str);
    }

    private void ri(boolean z, final String str) {
        if (z) {
            final int iQt = qt();
            ik.ri(new com.bytedance.sdk.component.mj.lr.ik("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.ka.aw.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.di diVarXd = com.bytedance.sdk.openadsdk.core.nr.ka().xd();
                        boolean zRi = aw.this.ri(diVarXd, str);
                        if (zRi) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.di.lr)) {
                                aw.this.ri(iQt, str);
                                return;
                            }
                            if (TextUtils.isEmpty(diVarXd.ik) || !zRi) {
                                return;
                            }
                            String str2 = diVarXd.ik;
                            com.bytedance.sdk.component.xha.lr.lr lrVarIk = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ik();
                            lrVarIk.ik(str2);
                            HashMap map = new HashMap();
                            map.put("content-type", "application/json; charset=utf-8");
                            lrVarIk.ka(map);
                            lrVarIk.ri(9);
                            lrVarIk.lr("sendPrefLog");
                            lrVarIk.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.ka.aw.2.1
                                @Override // com.bytedance.sdk.component.xha.ri.ri
                                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.xha.ri.ri
                                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.di.lr = lrVar.ka();
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        aw.this.ri(iQt, str);
                                    } catch (Exception e) {
                                        com.bytedance.sdk.component.utils.ac.ri("LandingPageLog", "TTWebViewClient : onPageFinished", e);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.ac.ik(th.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(int i, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.di.lr)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.di.lr);
            jSONObject.putOpt(BidResponsedEx.KEY_CID, ri().tn());
            jSONObject.putOpt("ad_id", ri().tn());
            jSONObject.put("log_extra", ri().yjg());
            ig.ri(sb, "\"/** adInfo **/\"", jSONObject.toString());
            ig.ri(sb, "\"/** first_page **/\"", String.valueOf(i));
            ig.ri(sb, "\"/** ix_to_externalurl **/\"", this.fi != -1 ? "1" : "0");
            ig.ri(sb, "\"/** preload_status **/\"", this.ta == 2 ? "2" : "0");
            ig.ri(sb, "\"/** scene_state **/\"", str);
            ig.ri(sb, "\"/** web_init_time **/\"", String.valueOf(this.qh));
            ig.ri(sb, "\"/** channel_name **/\"", "\"" + ri().mvf() + "\"");
            ig.ri(sb, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            ig.ri(sb, "\"/** web_url **/\"", "\"" + ri().smj() + "\"");
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final String strFi = fi(string);
            WeakReference<WebView> weakReference = this.pv;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(strFi) || webView == null) {
                return;
            }
            dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.aw.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.bgr.ri(webView, strFi);
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik(th.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(com.bytedance.sdk.openadsdk.core.settings.di diVar, String str) {
        str.getClass();
        switch (str) {
            case "0":
                return diVar.ka;
            case "1":
                return diVar.fi;
            case "2":
                return diVar.di;
            default:
                return false;
        }
    }

    public void ri(boolean z, long j) {
        if (z) {
            this.uq = j;
        } else {
            this.wjv = j;
        }
        if (this.uq <= 0 || this.wjv <= 0 || !this.bu || !this.lr.compareAndSet(false, true)) {
            return;
        }
        ri(this.fr, this.su, this.wjv - this.uq, this.ihz, this.nd);
    }

    public static void ri(final wjv wjvVar, final String str, final long j, final int i, final boolean z) {
        ik.ri(System.currentTimeMillis(), wjvVar, str, "lp_feeling_duration", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.aw.4
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_lp_pre_render", i);
                    jSONObject.put("meta_pre_render", wjvVar.wm() ? 1 : 0);
                    com.bytedance.sdk.openadsdk.core.model.tan tanVarSu = wjvVar.su();
                    if (tanVarSu == null) {
                        tanVarSu = new com.bytedance.sdk.openadsdk.core.model.tan();
                    }
                    jSONObject.put("pre_render_status", tanVarSu.ik());
                    jSONObject.put("pre_render_use_gecko", tanVarSu.lr());
                    jSONObject.put("pre_render_add_type", tanVarSu.ri());
                    jSONObject.put("is_reused", z ? 1 : 0);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public void ri(String str, long j) {
        if (!this.ig || this.fr == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", this.sf);
            jSONObject.put("error_msg", this.aw);
            jSONObject.put("error_url", this.bgr);
            int i = this.ta;
            if (i >= 0) {
                jSONObject.put("preload_status", i);
            }
            jSONObject.put("first_page", qt());
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            if (TextUtils.isEmpty(str)) {
                str = this.fr.smj();
            }
            jSONObject.put("url", str);
            jSONObject.put("preload_h5_type", this.fr.qd());
        } catch (Exception unused) {
        }
        ri("load_finish", jSONObject, Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME));
    }
}
