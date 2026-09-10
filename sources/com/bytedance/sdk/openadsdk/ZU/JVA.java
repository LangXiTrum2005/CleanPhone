package com.bytedance.sdk.openadsdk.ZU;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
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
public class JVA {
    private static final int[] LD = {10, 30, 50, 75, 100};
    private volatile long BcA;
    private com.bytedance.sdk.openadsdk.ZU.ZU.JXs CG;
    private long CSn;
    private int DY;
    private String HD;
    private com.bytedance.sdk.openadsdk.core.widget.Lxb.lc IeN;
    private final boolean Ivz;
    private int JJ;
    private boolean JVA;
    private int JXs;
    private String JZE;
    private boolean KPU;
    private final AtomicBoolean Ld;
    private long Lpq;
    public com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.Lxb Lxb;
    private volatile int NDz;
    private String NXR;
    private final AtomicBoolean Ns;
    private final AtomicBoolean OY;
    private volatile long Of;
    private final AtomicInteger Pw;
    private final AtomicBoolean QAg;
    private final Context STP;
    private final tD Sfi;
    private String Sv;
    private volatile long VU;
    private boolean VVE;
    private long ZU;
    private long aH;
    private OY brP;
    private final AtomicBoolean dR;
    private long eK;
    private final AtomicBoolean ebl;
    private long foI;
    private boolean hg;
    private long id;
    private com.bytedance.sdk.openadsdk.tD.OY kqm;
    private final AtomicBoolean lc;
    private nBu le;
    private int lk;
    private int nBu;
    private final AtomicInteger nE;
    private boolean nJ;
    private final AtomicInteger rW;
    private String sLN;
    private volatile long sRq;
    private boolean tD;
    private WeakReference<WebView> xan;

    public class Lxb {
        private Lxb() {
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i = 0;
            try {
                int iIntValue = Float.valueOf(str).intValue();
                if (iIntValue > 100) {
                    i = 100;
                } else if (iIntValue >= 0) {
                    i = iIntValue;
                }
            } catch (Throwable unused) {
            }
            JVA.this.nE.set(i);
        }
    }

    public JVA(tD tDVar, WebView webView, nBu nbu, int i) {
        this(tDVar, webView);
        this.le = nbu;
        this.JJ = i;
    }

    private boolean QAg() {
        tD tDVar;
        return this.nJ && (tDVar = this.Sfi) != null && tDVar.cFD();
    }

    private int nBu() {
        WeakReference<WebView> weakReference = this.xan;
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

    public void JXs() {
        if (QAg()) {
            this.sRq = SystemClock.elapsedRealtime();
            lc();
        }
    }

    public void OY() {
        if (("landingpage".equals(this.HD) || "landingpage_endcard".equals(this.HD) || "landingpage_split_screen".equals(this.HD) || "landingpage_direct".equals(this.HD) || "aggregate_page".equals(this.HD)) && this.JXs == 2) {
            if (this.aH > 0 || !lk()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - Math.max(this.eK, this.aH);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.JXs);
                    jSONObject.put("max_scroll_percent", this.nE.get());
                    jSONObject.put("jump_times", this.rW.getAndSet(0));
                    jSONObject.put("click_times", this.Pw.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.QAg.set(true);
                Lxb("stay_page", jSONObject, Math.min(jCurrentTimeMillis, TTAdConstant.AD_MAX_EVENT_TIME));
                com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb("landingPause", this.Sfi, this.Sv);
            }
        }
    }

    public void ZU() {
        if (QAg()) {
            this.VU = SystemClock.elapsedRealtime();
            lk.Lxb(this.Sfi, this.JZE);
        }
    }

    public void ebl() {
        if (this.foI == 0) {
            this.foI = System.currentTimeMillis();
        }
        this.eK = System.currentTimeMillis();
        if ("landingpage".equals(this.HD) || "landingpage_endcard".equals(this.HD) || "landingpage_split_screen".equals(this.HD) || "landingpage_direct".equals(this.HD) || "aggregate_page".equals(this.HD)) {
            if (this.Ns.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb("landingStart", this.Sfi, this.Sv);
            } else {
                com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb("landingContinue", this.Sfi, this.Sv);
            }
        }
    }

    public void lc() {
        if (QAg() && this.sRq > 0 && this.Of > 0 && !this.Ld.getAndSet(true)) {
            lk.LD(this.Of - this.sRq, this.Sfi, this.JZE, (String) null);
        }
    }

    public com.bytedance.sdk.openadsdk.ZU.ZU.JXs LD() {
        return this.CG;
    }

    public boolean lk() {
        return this.nJ;
    }

    private String lk(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void LD(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.JZE = str;
    }

    public JVA(tD tDVar, WebView webView) {
        this(tDVar, webView, false);
    }

    public tD Lxb() {
        return this.Sfi;
    }

    public void lk(boolean z) {
        WeakReference<WebView> weakReference = this.xan;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("LandingPageLog", "removeJavascriptInterface exception", e);
            }
        }
        if (this.ebl.compareAndSet(false, true)) {
            Lxb(z, "1");
            if (this.hg) {
                lk.Lxb(this.Sfi, this.HD, System.currentTimeMillis() - this.foI, this.JJ, nBu());
            }
        } else if (this.JXs == 2 && !this.QAg.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.JXs);
                jSONObject.put("max_scroll_percent", this.nE.get());
                jSONObject.put("jump_times", this.rW.getAndSet(0));
                jSONObject.put("click_times", this.Pw.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            Lxb("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.HD) || "landingpage_endcard".equals(this.HD) || "landingpage_split_screen".equals(this.HD) || "landingpage_direct".equals(this.HD) || "aggregate_page".equals(this.HD)) {
            com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb("landingFinish", this.Sfi, this.Sv);
        }
    }

    public JVA(tD tDVar, WebView webView, boolean z) {
        this.lk = 0;
        this.ZU = -1L;
        this.JXs = 1;
        this.lc = new AtomicBoolean(false);
        this.ebl = new AtomicBoolean(false);
        this.OY = new AtomicBoolean(false);
        this.QAg = new AtomicBoolean(false);
        this.nBu = -1;
        this.tD = false;
        this.HD = "landingpage";
        this.eK = 0L;
        this.aH = 0L;
        this.CSn = 0L;
        this.id = 0L;
        this.foI = 0L;
        this.KPU = false;
        this.Ivz = false;
        this.nE = new AtomicInteger(0);
        this.hg = false;
        this.nJ = false;
        this.BcA = 0L;
        this.rW = new AtomicInteger(0);
        this.Pw = new AtomicInteger(0);
        this.dR = new AtomicBoolean(false);
        this.NDz = 0;
        this.JJ = -1;
        this.Ld = new AtomicBoolean(false);
        this.Ns = new AtomicBoolean(false);
        Context contextLxb = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
        this.STP = contextLxb;
        this.Sfi = tDVar;
        if (webView == null) {
            return;
        }
        this.tD = z;
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.xan = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (tDVar != null && tDVar.Of()) {
            com.bytedance.sdk.openadsdk.core.widget.Lxb.lc lcVar = new com.bytedance.sdk.openadsdk.core.widget.Lxb.lc(webView2, tDVar, contextLxb, this.tD);
            this.IeN = lcVar;
            this.Lxb = lcVar.lk();
        }
        if (tDVar != null && tDVar.Ld() && com.bytedance.sdk.openadsdk.core.settings.VVE.TA().FV()) {
            this.brP = new OY(tDVar, webView, this.tD);
        }
        if (webView instanceof com.bytedance.sdk.component.QAg.lk) {
            this.Lpq = ((com.bytedance.sdk.component.QAg.lk) webView2).Lxb;
        } else {
            this.Lpq = System.currentTimeMillis();
        }
        try {
            webView2.addJavascriptInterface(new Lxb(), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("LandingPageLog", "addJavascriptInterface exception", e);
        }
        if (tDVar != null && tDVar.Mvg() != null) {
            this.ZU = tDVar.Mvg().optLong("page_id", -1L);
        }
        this.Sv = String.valueOf(SystemClock.elapsedRealtime());
    }

    public void LD(boolean z) {
        this.nJ = z;
    }

    public void Lxb(long j) {
        this.aH = j;
    }

    public void LD(WebView webView, String str, boolean z) {
        OY oy = this.brP;
        if (oy == null || !z) {
            return;
        }
        oy.Lxb(webView, str);
    }

    public void Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.Lxb.lc lcVar = this.IeN;
        if (lcVar != null) {
            lcVar.Lxb(str);
        }
        OY oy = this.brP;
        if (oy != null) {
            oy.lk(str);
        }
        this.HD = str;
    }

    public void LD(int i) {
        com.bytedance.sdk.openadsdk.core.widget.Lxb.lc lcVar = this.IeN;
        if (lcVar == null || !this.VVE) {
            return;
        }
        lcVar.Lxb(i);
    }

    public void Lxb(int i) {
        this.JJ = i;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs) {
        this.CG = jXs;
    }

    public JVA Lxb(boolean z) {
        this.hg = z;
        return this;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.tD.OY oy) {
        this.kqm = oy;
    }

    public void Lxb(WebView webView, int i) {
        if (webView == null) {
            return;
        }
        if (this.BcA == 0) {
            this.BcA = SystemClock.elapsedRealtime();
        }
        if (this.CSn == 0 && i > 0) {
            this.CSn = System.currentTimeMillis();
        } else if (this.id == 0 && i == 100) {
            this.id = System.currentTimeMillis();
        }
        if (this.lk != LD.length && ("landingpage".equals(this.HD) || "landingpage_endcard".equals(this.HD) || "landingpage_split_screen".equals(this.HD) || "landingpage_direct".equals(this.HD) || "aggregate_page".equals(this.HD))) {
            int i2 = this.lk;
            while (true) {
                int[] iArr = LD;
                if (i2 >= iArr.length || i < iArr[this.lk]) {
                    break;
                }
                int i3 = i2 + 1;
                this.lk = i3;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j = this.ZU;
                    if (j != -1) {
                        jSONObject.put("page_id", j);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i2]);
                } catch (Exception unused) {
                }
                Lxb("progress_load_finish", jSONObject);
                i2 = i3;
            }
        }
        if (i == 100) {
            Lxb(webView.getUrl(), "progress", Math.min(this.id - this.CSn, TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    private void Lxb(String str, String str2, long j) {
        if (this.OY.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, 200);
                    int i = 300;
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
            Lxb("load_finish_progress", jSONObject, j);
        }
    }

    public void Lxb(WebView webView, String str, Bitmap bitmap, boolean z, int i) {
        this.VVE = z;
        this.DY++;
        com.bytedance.sdk.openadsdk.core.widget.Lxb.lc lcVar = this.IeN;
        if (lcVar != null && z) {
            lcVar.LD(str);
            this.IeN.LD();
        }
        OY oy = this.brP;
        if (oy != null && z) {
            oy.Lxb(str, i);
        }
        WeakReference<WebView> weakReference = this.xan;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > this.NDz) {
                    this.rW.incrementAndGet();
                }
                this.NDz = webBackForwardListCopyBackForwardList.getCurrentIndex();
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("LandingPageLog", "copyBackForwardList exception", e);
            }
        }
        if (this.BcA == 0) {
            this.BcA = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.CG;
        if (jXs != null) {
            jXs.JXs();
        }
        if (this.lc.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i2 = this.JJ;
                if (i2 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i2));
                }
            } catch (Exception unused) {
            }
            Lxb("load_start", jSONObject);
        }
    }

    public void Lxb(WebView webView, String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.Lxb.lc lcVar = this.IeN;
        if (lcVar != null && z) {
            lcVar.Lxb();
        }
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.CG;
        if (jXs != null) {
            jXs.lc();
        }
        OY oy = this.brP;
        if (oy != null && z) {
            oy.Lxb(str);
        }
        if (webView != null && !this.KPU && this.hg) {
            this.KPU = true;
            com.bytedance.sdk.component.utils.JVA.Lxb(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.ebl.compareAndSet(false, true)) {
            if (this.JXs != 3) {
                this.JXs = 2;
            }
            this.eK = System.currentTimeMillis();
            boolean z2 = this.JXs == 2;
            int iNBu = nBu();
            if (z2) {
                long j = this.id - this.CSn;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.nBu);
                    jSONObject.put("error_msg", this.sLN);
                    jSONObject.put("error_url", this.NXR);
                    int i = this.JJ;
                    if (i >= 0) {
                        jSONObject.put("preload_status", i);
                    }
                    jSONObject.put("first_page", iNBu);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.Sfi.Sv());
                    jSONObject.put("preload_h5_type", this.Sfi.XM());
                } catch (Exception unused) {
                }
                Lxb(z, "0");
                long jMin = Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME);
                Lxb("load_finish", jSONObject, jMin);
                if (QAg()) {
                    this.Of = SystemClock.elapsedRealtime();
                    lc();
                    lk.Lxb(this.Sfi, this.JZE, this.Of - this.VU);
                }
                Lxb(str, "load_finish", jMin);
                nBu nbu = this.le;
                if (nbu != null) {
                    nbu.Lxb(iNBu);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.nBu);
                jSONObject2.put("error_msg", this.sLN);
                jSONObject2.put("error_url", this.NXR);
                jSONObject2.put("first_page", iNBu);
                int i2 = this.JJ;
                if (i2 >= 0) {
                    jSONObject2.put("preload_status", i2);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.Sfi.Sv());
                jSONObject2.put("preload_h5_type", this.Sfi.XM());
            } catch (Exception unused2) {
            }
            Lxb(z, "2");
            Lxb("load_fail", jSONObject2);
            if (QAg()) {
                lk.Lxb(this.Sfi, this.JZE, SystemClock.elapsedRealtime() - this.VU, this.nBu, this.sLN, this.NXR);
            }
            if (this.JVA) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                Lxb("load_fail_main", jSONObject2);
            }
        }
    }

    public void Lxb(WebView webView, int i, String str, String str2, String str3, boolean z) {
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.CG;
        if (jXs != null) {
            jXs.Lxb((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.JXs != 2) {
            this.JXs = 3;
        }
        this.nBu = i;
        this.sLN = str;
        this.NXR = str2;
        this.JVA = z;
    }

    public void Lxb(com.bytedance.sdk.component.QAg.ZU zu) {
        int iSS;
        Bitmap bitmapLxb;
        tD tDVar;
        if ((!"landingpage".equals(this.HD) && !"landingpage_endcard".equals(this.HD) && !"landingpage_split_screen".equals(this.HD) && !"landingpage_direct".equals(this.HD) && !"aggregate_page".equals(this.HD)) || (iSS = com.bytedance.sdk.openadsdk.core.kqm.ZU().SS()) == 0 || new Random().nextInt(100) + 1 > iSS || zu == null || zu.getWebView() == null || zu.getVisibility() != 0 || (bitmapLxb = le.Lxb(zu)) == null || (tDVar = this.Sfi) == null) {
            return;
        }
        le.Lxb(tDVar, this.HD, "landing_page_blank", bitmapLxb, zu.getUrl(), this.ZU);
    }

    private void Lxb(String str, JSONObject jSONObject) {
        Lxb(str, jSONObject, -1L);
    }

    private void Lxb(final String str, final JSONObject jSONObject, final long j) {
        if (!this.hg || this.Sfi == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.tD.OY oy = this.kqm;
        final int iLe = oy != null ? oy.le() : -1;
        lk.Lxb(System.currentTimeMillis(), this.Sfi, this.HD, str, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.JVA.1
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    boolean zLD = eK.LD(JVA.this.Sfi);
                    int i = 0;
                    jSONObject.put("is_playable", zLD ? 1 : 0);
                    jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(JVA.this.Sfi) ? 1 : 0);
                    if (zLD && ("load_finish".equals(str) || "load_fail".equals(str))) {
                        jSONObject.put("playable_has_show", iLe);
                    }
                    if ("stay_page".equals(str)) {
                        JSONObject jSONObject2 = jSONObject;
                        if (JVA.this.DY <= 1) {
                            i = 1;
                        }
                        jSONObject2.put("first_page", i);
                    }
                } catch (JSONException unused) {
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("ad_extra_data", jSONObject.toString());
                        long j2 = j;
                        if (j2 > 0) {
                            jSONObject3.put("duration", j2);
                        }
                    } catch (JSONException unused2) {
                    }
                    return jSONObject3;
                } catch (JSONException unused3) {
                    return null;
                }
            }
        });
    }

    public void Lxb(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.Lxb.lc lcVar = this.IeN;
        if (lcVar != null && this.VVE) {
            lcVar.Lxb(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.BcA != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.Pw.incrementAndGet();
                if (this.dR.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.Sfi.Sv());
                } catch (JSONException unused) {
                }
                Lxb("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.BcA, 0L));
            }
        }
    }

    public void Lxb(String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.Lxb.lc lcVar = this.IeN;
        if (lcVar != null && z) {
            lcVar.lk(str);
        }
        OY oy = this.brP;
        if (oy == null || !z) {
            return;
        }
        oy.LD(str);
    }

    private void Lxb(boolean z, final String str) {
        if (z) {
            final int iNBu = nBu();
            lk.Lxb(new com.bytedance.sdk.component.OY.OY("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.ZU.JVA.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.ebl eblVarCSn = com.bytedance.sdk.openadsdk.core.kqm.ZU().CSn();
                        boolean zLxb = JVA.this.Lxb(eblVarCSn, str);
                        if (zLxb) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.ebl.LD)) {
                                JVA.this.Lxb(iNBu, str);
                                return;
                            }
                            if (TextUtils.isEmpty(eblVarCSn.lk) || !zLxb) {
                                return;
                            }
                            String str2 = eblVarCSn.lk;
                            com.bytedance.sdk.component.ebl.LD.LD ldLk = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().lk();
                            ldLk.LD(str2);
                            HashMap map = new HashMap();
                            map.put("content-type", "application/json; charset=utf-8");
                            ldLk.ZU(map);
                            ldLk.Lxb(9);
                            ldLk.Lxb("sendPrefLog");
                            ldLk.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.JVA.2.1
                                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.ebl.LD = ld.ZU();
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        JVA.this.Lxb(iNBu, str);
                                    } catch (Exception e) {
                                        com.bytedance.sdk.component.utils.sLN.Lxb("LandingPageLog", "TTWebViewClient : onPageFinished", e);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.sLN.LD(th.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(int i, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.ebl.LD)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.ebl.LD);
            jSONObject.putOpt(BidResponsedEx.KEY_CID, Lxb().bG());
            jSONObject.putOpt("ad_id", Lxb().bG());
            jSONObject.put("log_extra", Lxb().Lv());
            nJ.Lxb(sb, "\"/** adInfo **/\"", jSONObject.toString());
            nJ.Lxb(sb, "\"/** first_page **/\"", String.valueOf(i));
            nJ.Lxb(sb, "\"/** ix_to_externalurl **/\"", this.ZU != -1 ? "1" : "0");
            nJ.Lxb(sb, "\"/** preload_status **/\"", this.JJ == 2 ? "2" : "0");
            nJ.Lxb(sb, "\"/** scene_state **/\"", str);
            nJ.Lxb(sb, "\"/** web_init_time **/\"", String.valueOf(this.Lpq));
            nJ.Lxb(sb, "\"/** channel_name **/\"", "\"" + Lxb().oc() + "\"");
            nJ.Lxb(sb, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            nJ.Lxb(sb, "\"/** web_url **/\"", "\"" + Lxb().Sv() + "\"");
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final String strLk = lk(string);
            WeakReference<WebView> weakReference = this.xan;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(strLk) || webView == null) {
                return;
            }
            hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.JVA.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.JVA.Lxb(webView, strLk);
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.LD(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Lxb(com.bytedance.sdk.openadsdk.core.settings.ebl eblVar, String str) {
        str.getClass();
        switch (str) {
            case "0":
                return eblVar.ZU;
            case "1":
                return eblVar.JXs;
            case "2":
                return eblVar.lc;
            default:
                return false;
        }
    }
}
