package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.R;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.ri.ri.ri.ik.attabal;
import com.bytedance.sdk.component.utils.zf;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.ka.tan;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.uq;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class slm implements com.bytedance.sdk.openadsdk.aw.mj {
    private View ac;
    private int aw;
    private long ay;
    private int bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final boolean f18097co;
    private final com.bytedance.sdk.openadsdk.component.reward.ri.ri dw;
    private boolean dzy;
    private com.bytedance.sdk.openadsdk.core.widget.ri.fi hcw;
    private boolean ig;
    private View ihz;
    protected String ik;
    com.bytedance.sdk.openadsdk.ka.aw ka;
    private int kt;
    private boolean nr;
    private boolean pv;
    private boolean qh;
    private final String qt;
    dzy ri;
    private boolean rzk;
    private int sf;
    private boolean siy;
    private long srn;
    private boolean tan;
    private ILoader tnn;
    private float uq;
    private com.bytedance.sdk.component.jbs.di vr;
    private com.bytedance.sdk.openadsdk.core.widget.ri.di.ri whw;
    private float wjv;
    private boolean xd;
    protected com.bytedance.sdk.openadsdk.ka.ka.fi xha;
    private com.bytedance.sdk.openadsdk.common.fi xm;
    private String zyn;
    protected boolean lr = true;
    private boolean slm = false;
    private final AtomicBoolean bu = new AtomicBoolean(true);
    int fi = 0;
    String di = "";
    boolean mj = false;
    private SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> fr = new SparseArray<>();
    private boolean su = true;
    private float igq = -1.0f;
    private float zf = -1.0f;
    private boolean ory = false;
    private long oh = 0;
    private long qd = -1;
    private volatile int jc = 0;
    private int feb = -1;
    private volatile int fe = 0;
    private volatile int ta = 0;
    private long bnj = 0;
    public boolean jbs = false;
    private int gcp = -1;

    public static class ik implements com.bytedance.sdk.openadsdk.aw.qt {
        private final com.bytedance.sdk.component.jbs.di ri;

        @Override // com.bytedance.sdk.openadsdk.aw.qt
        public void lr() {
            com.bytedance.sdk.component.jbs.di diVar = this.ri;
            if (diVar == null) {
                return;
            }
            diVar.nr();
        }

        @Override // com.bytedance.sdk.openadsdk.aw.qt
        public void ri() {
            com.bytedance.sdk.component.jbs.di diVar = this.ri;
            if (diVar == null) {
                return;
            }
            diVar.vr();
        }

        private ik(com.bytedance.sdk.component.jbs.di diVar) {
            this.ri = diVar;
        }
    }

    public interface ka {
        void ri(WebView webView, String str);
    }

    public static class lr implements com.bytedance.sdk.openadsdk.aw.ri {
        private final View ri;

        public lr(View view) {
            this.ri = view;
        }

        @Override // com.bytedance.sdk.openadsdk.aw.ri
        public int lr() {
            View view = this.ri;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            return measuredWidth <= 0 ? qd.ik(nr.ri()) : measuredWidth;
        }

        @Override // com.bytedance.sdk.openadsdk.aw.ri
        public int ri() {
            View view = this.ri;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            return measuredHeight <= 0 ? qd.fi(nr.ri()) : measuredHeight;
        }
    }

    public slm(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.dw = riVar;
        this.qt = riVar.fi;
        this.f18097co = riVar.ka;
    }

    public static /* synthetic */ int aw(slm slmVar) {
        int i = slmVar.ta;
        slmVar.ta = i + 1;
        return i;
    }

    public static /* synthetic */ int bgr(slm slmVar) {
        int i = slmVar.jc;
        slmVar.jc = i + 1;
        return i;
    }

    private com.bytedance.sdk.openadsdk.ka.ka.fi dzy() {
        return new tan(2, this.f18097co ? "rewarded_video" : "fullscreen_interstitial_ad", this.dw.lr);
    }

    public static /* synthetic */ int sf(slm slmVar) {
        int i = slmVar.fe;
        slmVar.fe = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xd() {
        this.xd = true;
        this.qh = false;
        this.dw.jc.removeMessages(600);
        this.dw.jc.removeMessages(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
        this.dw.jc.removeMessages(900);
        this.dw.oh.ka(false);
        this.dw.slm.set(true);
        this.dw.nd.aw();
        wjv wjvVar = this.dw.lr;
        wjvVar.nhl();
        if (wjvVar.nhl() || !ig.mj(dw.ri(wjvVar))) {
            return;
        }
        View viewQt = this.dw.dzy.qt();
        View.OnClickListener onClickListener = (View.OnClickListener) viewQt.getTag(viewQt.getId());
        if (onClickListener != null) {
            ri riVar = new ri(this.dw, viewQt, onClickListener);
            viewQt.setOnClickListener(riVar);
            viewQt.setOnTouchListener(riVar);
        }
    }

    public boolean dw() {
        com.bytedance.sdk.component.jbs.di diVar = this.vr;
        return diVar == null || diVar.getWebView() == null;
    }

    public boolean hcw() {
        return this.xd;
    }

    public boolean oh() {
        return this.jbs;
    }

    public void ory() {
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.ka;
        if (awVar != null) {
            awVar.fi();
        }
    }

    public boolean zf() {
        return this.qh;
    }

    public boolean ac() {
        if (wjv.ik(this.dw.lr)) {
            return this.dzy && !this.pv && this.dw.hcw.co();
        }
        return this.dzy && !this.pv && this.bu.get() && this.nr;
    }

    public boolean aw() {
        return this.bu.get();
    }

    public boolean ay() {
        return this.mj;
    }

    public boolean bgr() {
        return this.nr;
    }

    public void bu() {
        com.bytedance.sdk.component.jbs.di diVar = this.vr;
        if (diVar != null) {
            diVar.aw();
        }
        if (this.qd == 0) {
            this.qd = SystemClock.elapsedRealtime();
        }
        wjv wjvVar = this.dw.lr;
        dzy dzyVar = this.ri;
        if (dzyVar != null) {
            dzyVar.sf();
            com.bytedance.sdk.component.jbs.di diVar2 = this.vr;
            if (diVar2 != null) {
                if (diVar2.getVisibility() == 0) {
                    this.ri.ri(true);
                    lr(this.ri, true);
                    ri(this.ri, false, true);
                    if (dw.mj(wjvVar) && !this.xd && this.dw.lr.nhl()) {
                        xha();
                    }
                } else {
                    this.ri.ri(false);
                    lr(this.ri, false);
                    ri(this.ri, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.ka;
        if (awVar != null) {
            awVar.xha();
        }
    }

    public boolean co() {
        String str = this.ik;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public void fr() {
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.jbs();
        }
    }

    public boolean igq() {
        return this.nr && this.bu.get();
    }

    public void ihz() {
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.xha();
        }
    }

    public dzy jbs() {
        return this.ri;
    }

    public com.bytedance.sdk.component.jbs.di mj() {
        return this.vr;
    }

    public int nr() {
        return this.fi;
    }

    public void qt() {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar;
        wjv wjvVar = this.dw.lr;
        String strMj = wjvVar.mj();
        if (!TextUtils.isEmpty(strMj) && (mjVar = this.dw.ajz) != null && (mjVar.ig() || this.dw.ajz.jc().su())) {
            this.ik = strMj;
        } else if (dw.fi(wjvVar)) {
            attabal attabalVarEu = wjvVar.eu();
            if (attabalVarEu != null) {
                this.ik = attabalVarEu.marial();
            }
        } else {
            this.ik = dw.co(wjvVar);
        }
        String strRi = ri(this.ik, wjvVar, this.sf, this.bgr, this.aw);
        this.ik = strRi;
        if (TextUtils.isEmpty(strRi)) {
            return;
        }
        this.dzy = this.ik.contains("use_second_endcard=1");
    }

    public void sf() {
        com.bytedance.sdk.component.jbs.di diVar = this.vr;
        if (diVar != null) {
            zf.ri(diVar);
        }
        wjv wjvVar = this.dw.lr;
        long j = this.srn;
        if (j > 0) {
            if (this.qd > 0) {
                this.srn = j + (SystemClock.elapsedRealtime() - this.qd);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", wjv.ik(wjvVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.ka.ik.ri(this.dw.lr, this.qt, "second_endcard_duration", jSONObject, this.srn);
        }
        this.vr = null;
        if (this.xha != null && !ac.ka(wjvVar) && !ac.xha(wjvVar) && !wjv.ik(wjvVar)) {
            this.xha.ri(true);
            this.xha.sf();
        }
        dzy dzyVar = this.ri;
        if (dzyVar != null) {
            dzyVar.co();
        }
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.ka;
        if (awVar != null) {
            awVar.ka(wjvVar.che());
        }
        DeviceUtils.AudioInfoReceiver.lr(this);
    }

    public void slm() {
        com.bytedance.sdk.component.jbs.di diVar = this.vr;
        if (diVar != null) {
            diVar.vr();
        }
        if (this.qd > 0) {
            this.srn += SystemClock.elapsedRealtime() - this.qd;
            this.qd = 0L;
        }
        dzy dzyVar = this.ri;
        if (dzyVar != null) {
            dzyVar.ri(false);
            lr(this.ri, false);
            ri(this.ri, true, false);
        }
    }

    public boolean su() {
        dzy dzyVar = this.ri;
        if (dzyVar == null) {
            return false;
        }
        return dzyVar.jbs();
    }

    public String tan() {
        return this.di;
    }

    public void uq() {
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.di();
        }
    }

    public void vr() {
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.mj();
        }
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.ka;
        if (awVar != null) {
            awVar.mj();
        }
    }

    public void wjv() {
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.ka;
        if (awVar != null) {
            awVar.ri(System.currentTimeMillis());
        }
    }

    public void xha() {
        this.ri.ri("showPlayableEndCardOverlay", (JSONObject) null);
        this.dw.jc.sendEmptyMessageDelayed(600, 1000L);
        this.dw.jc.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.10
            @Override // java.lang.Runnable
            public void run() {
                slm.this.xd();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.bgr bgrVar = this.dw.aac;
        if (bgrVar != null) {
            bgrVar.ri(0L);
        }
    }

    public void di() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.dw;
        wjv wjvVar = riVar.lr;
        if (TextUtils.isEmpty(wjv.ri(riVar.srn, wjvVar))) {
            if (wjvVar != null && !wjvVar.dzy() && this.tnn == null && co()) {
                this.zyn = wjvVar.mvf();
                this.tnn = com.bytedance.sdk.openadsdk.xha.lr.ri().lr();
                int iRi = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(this.tnn, this.zyn);
                this.kt = iRi;
                this.feb = iRi > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.zyn)) {
                    com.bytedance.sdk.openadsdk.ka.aw awVar = this.ka;
                    if (awVar != null) {
                        awVar.ri(this.feb);
                    }
                    com.bytedance.sdk.openadsdk.ka.ik.ri.ri(this.bnj, wjvVar, "landingpage_endcard", this.tnn, this.zyn);
                }
            }
            if ((!TextUtils.isEmpty(this.ik) && this.ik.contains("play.google.com/store")) || ((wjvVar != null && !wjvVar.zyn() && ac.mj(wjvVar)) || ac.xha(wjvVar))) {
                this.mj = true;
                return;
            }
            if (this.lr) {
                boolean z = this.dw.saa;
                if (this.vr != null && ((z || !TextUtils.isEmpty(this.ik)) && wjv.lr(wjvVar))) {
                    if (this.rzk) {
                        return;
                    }
                    String str = this.ik + "&is_pre_render=1";
                    com.bytedance.sdk.openadsdk.ka.aw awVar2 = this.ka;
                    if (awVar2 != null) {
                        awVar2.ka();
                    }
                    uq.ri(this.vr, str);
                    this.rzk = true;
                    return;
                }
                if (wjv.ik(wjvVar)) {
                    this.dw.hcw.ik();
                }
            }
        }
    }

    public void fi() {
        if (dw.fi(this.dw.lr) && this.dw.luy) {
            return;
        }
        di();
    }

    public boolean ik() {
        return this.ig;
    }

    public boolean ka() {
        return this.pv;
    }

    public void lr() {
        this.ac = this.dw.ig.findViewById(R.id.content);
        com.bytedance.sdk.component.jbs.di diVar = (com.bytedance.sdk.component.jbs.di) this.dw.pv.findViewById(com.bytedance.sdk.openadsdk.utils.slm.slm);
        this.vr = diVar;
        if (diVar != null && wjv.lr(this.dw.lr)) {
            this.vr.fi();
        } else {
            qd.ri((View) this.vr, 8);
        }
        com.bytedance.sdk.component.jbs.di diVar2 = this.vr;
        if (diVar2 != null) {
            diVar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (slm.this.vr == null || slm.this.vr.getViewTreeObserver() == null) {
                        return;
                    }
                    slm.this.vr.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = slm.this.vr.getMeasuredWidth();
                    int measuredHeight = slm.this.vr.getMeasuredHeight();
                    if (slm.this.vr.getVisibility() == 0) {
                        slm.this.ri(measuredWidth, measuredHeight);
                    }
                }
            });
        }
    }

    public void fi(boolean z) {
        if (this.ri == null || this.dw.ig.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            this.ri.ri("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void ik(boolean z) {
        lr(this.ri, z);
    }

    public void ka(boolean z) {
        if (dw.lr(this.dw.lr)) {
            return;
        }
        fi(z);
    }

    public static class ri extends com.bytedance.sdk.openadsdk.core.ik.ri implements com.bytedance.sdk.openadsdk.core.ik.lr.ri {
        private final View.OnClickListener ik;
        private final View lr;
        private final com.bytedance.sdk.openadsdk.component.reward.ri.ri ri;

        public ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, View view, View.OnClickListener onClickListener) {
            super(riVar.ig, riVar.lr, riVar.fi, riVar.ka ? 7 : 5);
            this.ri = riVar;
            this.lr = view;
            this.ik = onClickListener;
            HashMap map = new HashMap();
            map.put("close_auto_click", Boolean.TRUE);
            map.put("click_scence", 2);
            ri(map);
            ri(riVar.uq.ik());
            ri(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.ik.ri, com.bytedance.sdk.openadsdk.core.ik.lr, com.bytedance.sdk.openadsdk.core.ik.ik
        public void ri(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, boolean z) {
            if (!this.ri.lr.nhl()) {
                super.ri(view, f, f2, f3, f4, sparseArray, z);
                this.ri.qd.xd();
            } else {
                this.ik.onClick(view);
                this.lr.setOnTouchListener(null);
                this.lr.setOnClickListener(this.ik);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
        public void ri(View view, int i) {
            this.lr.setOnTouchListener(null);
            this.lr.setOnClickListener(this.ik);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.aw.mj
    public void ik(int i) {
        int i2 = this.gcp;
        if (i2 <= 0 && i > 0) {
            ka(false);
        } else if (i2 > 0 && i == 0) {
            ka(true);
        }
        this.gcp = i;
    }

    public void xha(boolean z) {
        this.qh = z;
    }

    public void ri() {
        if (this.tan) {
            return;
        }
        this.tan = true;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.dw;
        this.sf = riVar.bnj;
        this.aw = riVar.whw;
        this.bgr = riVar.xm;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lr();
        this.bnj = SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    public void lr(boolean z) {
        ri(this.ri, z);
    }

    public void lr(dzy dzyVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z ? 1 : 0);
            dzyVar.ri(X3.h.V, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void lr(int i) {
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.ri(i);
            this.xha.ik();
        }
    }

    public void ri(String str, final com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar) {
        ri(str, new ka() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.ri.slm.ka
            public void ri(WebView webView, String str2) {
                if (slm.this.dw.ig.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.ri.ri unused = slm.this.dw;
                slm.this.aw();
            }
        });
        ri(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.6
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                slm.this.dw.uq.lr();
                com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar2 = lrVar;
                if (lrVar2 != null) {
                    lrVar2.gcp();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(int i, com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar) {
        this.dw.ac.get();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.dw;
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar = riVar.ajz;
        if (mjVar == null || !mjVar.f18078co || riVar.ac.get()) {
            return;
        }
        this.dw.ac.set(true);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.dw;
        if (riVar2.xe && ac.aw(riVar2.lr) && lrVar != null) {
            lrVar.fi();
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.aw.di diVar, String str, final com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar) {
        if (this.vr == null) {
            return;
        }
        HashMap map = new HashMap();
        final wjv wjvVar = this.dw.lr;
        map.put("click_scence", 2);
        this.xha = dzy();
        dzy dzyVar = new dzy(this.dw.ig);
        this.ri = dzyVar;
        dzyVar.ri(this.dw.qd);
        dzy dzyVarRi = this.ri.lr(this.vr).ri(wjvVar).ri(com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri(wjvVar)).ik(wjvVar.tn()).ka(wjvVar.yjg()).lr(wjvVar.qa() ? 7 : 5).ri(new lr(this.vr)).fi(wjvVar.uo()).ri(this.vr);
        if (co()) {
            str = "landingpage_endcard";
        }
        dzyVarRi.lr(str).ri(map).ri(this.xha).ri(new com.bytedance.sdk.openadsdk.core.widget.fi() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.fi
            public void ri() {
                if (slm.this.hcw != null) {
                    slm.this.hcw.ik();
                }
                com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar2 = lrVar;
                if (lrVar2 != null) {
                    lrVar2.gcp();
                }
            }
        }).ri(new dzy.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.7
            @Override // com.bytedance.sdk.openadsdk.core.dzy.ri
            public void ri() {
                slm.this.xd();
            }
        });
        this.ri.ri(new ik(this.vr));
        this.ri.ri(this.dw.dzy.qt()).ri(this.dw.wjv.ik()).ri(new com.bytedance.sdk.openadsdk.aw.ik() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.9
            @Override // com.bytedance.sdk.openadsdk.aw.ik
            public void ri(boolean z, int i, String str2) {
                if (z) {
                    slm slmVar = slm.this;
                    slmVar.jbs = true;
                    if (slmVar.siy) {
                        slm.this.siy = false;
                        slm slmVar2 = slm.this;
                        slmVar2.ri(slmVar2.dw.zyn, true);
                    }
                }
                if (wjv.ka(wjvVar)) {
                    slm.this.ri(z, i, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.aw.ik
            public void ri() {
                slm.this.ig = true;
                slm.this.dw.dzy.qt().performClick();
            }
        });
        this.ri.ka(this.dzy);
    }

    public void di(boolean z) {
        this.pv = true;
        JSONObject jSONObject = new JSONObject();
        wjv wjvVar = this.dw.lr;
        try {
            jSONObject.put("endcard_overlay_render_type", wjv.ik(wjvVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, this.qt, "use_second_endcard", jSONObject);
        this.qd = SystemClock.elapsedRealtime();
        try {
            if (!wjv.ik(wjvVar)) {
                this.ri.ri("click_endcard_close", (JSONObject) null);
            } else if (z) {
                this.dw.hcw.mj();
                com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, this.qt, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.dw;
        riVar.aac.ri(riVar.xha);
    }

    public void ri(int i, int i2) {
        if (this.ri == null || this.dw.ig.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            this.ri.ri("resize", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void ri(boolean z) {
        this.lr = z;
    }

    private static String ri(String str, wjv wjvVar, int i, int i2, int i3) {
        String str2;
        String str3;
        float fGz = wjvVar.gz();
        if (!TextUtils.isEmpty(str)) {
            if (i == 1) {
                if (str.contains("?")) {
                    str3 = str + X3.j.c;
                } else {
                    str3 = str + "?";
                }
                str = str3 + "orientation=portrait";
            }
            if (str.contains("?")) {
                str2 = str + X3.j.c;
            } else {
                str2 = str + "?";
            }
            str = str2 + "height=" + i2 + "&width=" + i3 + "&aspect_ratio=" + fGz;
        }
        return !dw.lr(wjvVar) ? com.bytedance.sdk.openadsdk.utils.di.ri(str) : str;
    }

    public void ri(int i) {
        if (this.nr || !this.bu.get()) {
            ri(0, this.dw.qd);
        }
        qd.ri((View) this.vr, i);
        com.bytedance.sdk.component.jbs.di diVar = this.vr;
        if (diVar != null) {
            qd.ri((View) diVar.getWebView(), i);
        }
        wjv wjvVar = this.dw.lr;
        if (this.vr == null || !wjvVar.che()) {
            return;
        }
        this.vr.setLandingPage(true);
        this.vr.setTag("landingpage_endcard");
        this.vr.setMaterialMeta(wjvVar.nb());
    }

    public void ri(float f) {
        qd.ri(this.vr, f);
    }

    public void ri(dzy dzyVar, boolean z) {
        if (this.ri == null || this.dw.ig.isFinishing()) {
            return;
        }
        dzyVar.ri(z);
    }

    private void ri(String str, final ka kaVar) {
        com.bytedance.sdk.component.jbs.di diVar;
        final wjv wjvVar = this.dw.lr;
        com.bytedance.sdk.component.jbs.di diVar2 = this.vr;
        if (diVar2 == null || diVar2.getWebView() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.aw awVarLr = new com.bytedance.sdk.openadsdk.ka.aw(wjvVar, this.vr.getWebView(), new com.bytedance.sdk.openadsdk.ka.co() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.11
            @Override // com.bytedance.sdk.openadsdk.ka.co
            public void ri(int i) {
                if (TextUtils.isEmpty(slm.this.zyn)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.ka.ik.ri.ri(slm.this.kt, slm.this.jc, slm.this.ta, slm.this.fe - slm.this.ta, wjvVar, "landingpage_endcard", i);
            }
        }, this.feb).lr(true);
        this.ka = awVarLr;
        this.whw = awVarLr.ri;
        awVarLr.ri(co() ? "landingpage_endcard" : str);
        this.ka.lr(this.qt);
        this.ka.ik(true);
        this.vr.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.12
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                com.bytedance.sdk.openadsdk.ka.aw awVar = slm.this.ka;
                if (awVar != null) {
                    awVar.lr(i2);
                }
            }
        });
        mj mjVar = this.dw.wjv;
        if (mjVar != null) {
            this.ka.ri(mjVar.ri());
        }
        com.bytedance.sdk.openadsdk.common.fi fiVarRi = ig.ri(wjvVar, this.vr, this.dw.ig, this.qt);
        this.xm = fiVarRi;
        if (fiVarRi != null) {
            fiVarRi.ri(co() ? "landingpage_endcard" : str);
        }
        if (co()) {
            ig.ri(wjvVar, this.vr);
        }
        com.bytedance.sdk.openadsdk.core.widget.ri.fi fiVar = new com.bytedance.sdk.openadsdk.core.widget.ri.fi(nr.ri(), this.ri, wjvVar.tn(), this.xm, this.ka, wjvVar.che()) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                slm.this.rzk = false;
                slm.this.nr = true;
                slm slmVar = slm.this;
                slmVar.ri(100, slmVar.dw.qd);
                if (slm.this.dw.ory.ac()) {
                    View viewQt = slm.this.dw.dzy.qt();
                    if (viewQt instanceof com.bytedance.sdk.openadsdk.core.di.ka) {
                        ((com.bytedance.sdk.openadsdk.core.di.ka) viewQt).setImageResource(com.bytedance.sdk.component.utils.uq.ka(slm.this.dw.srn, "tt_skip_btn"));
                    }
                }
                DeviceUtils.AudioInfoReceiver.ri(slm.this);
                slm.this.gcp = DeviceUtils.xha();
                com.bytedance.sdk.openadsdk.ka.ka.fi fiVar2 = slm.this.xha;
                if (fiVar2 != null) {
                    fiVar2.fi();
                }
                com.bytedance.sdk.openadsdk.component.reward.ri.ri unused = slm.this.dw;
                ka kaVar2 = kaVar;
                if (kaVar2 != null) {
                    kaVar2.ri(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                super.onPageStarted(webView, str2, bitmap);
                com.bytedance.sdk.openadsdk.ka.ka.fi fiVar2 = slm.this.xha;
                if (fiVar2 != null) {
                    fiVar2.ka();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str2, String str3) {
                super.onReceivedError(webView, i, str2, str3);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                com.bytedance.sdk.openadsdk.component.reward.ri.ri unused = slm.this.dw;
                webResourceRequest.isForMainFrame();
                webResourceRequest.getUrl();
                webResourceResponse.getStatusCode();
                if (webResourceRequest.getUrl() != null) {
                    webResourceRequest.getUrl().toString();
                }
                if (webResourceRequest.isForMainFrame()) {
                    slm.this.bu.set(false);
                    slm.this.rzk = false;
                    slm.this.fi = webResourceResponse.getStatusCode();
                    slm slmVar = slm.this;
                    slmVar.di = "onReceivedHttpError";
                    slmVar.ri(slmVar.fi, slmVar.dw.qd);
                }
                if (slm.this.xha != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", webResourceResponse.getStatusCode());
                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                        slm.this.xha.ri(jSONObject);
                    } catch (JSONException unused2) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                try {
                    if (TextUtils.isEmpty(slm.this.zyn)) {
                        return super.shouldInterceptRequest(webView, str2);
                    }
                    slm.sf(slm.this);
                    WebResourceResponseModel webResourceResponseModelRi = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(slm.this.tnn, slm.this.zyn, str2);
                    if (webResourceResponseModelRi != null && webResourceResponseModelRi.getWebResourceResponse() != null) {
                        slm.aw(slm.this);
                        return webResourceResponseModelRi.getWebResourceResponse();
                    }
                    if (webResourceResponseModelRi != null && webResourceResponseModelRi.getMsg() == 2) {
                        slm.bgr(slm.this);
                    }
                    return super.shouldInterceptRequest(webView, str2);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ac.ri("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    Objects.toString(webResourceError.getDescription());
                    webResourceRequest.getUrl().toString();
                }
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !slm.this.ri(webResourceRequest.getUrl().toString())) {
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        com.bytedance.sdk.openadsdk.component.reward.ri.ri unused = slm.this.dw;
                        webResourceError.getErrorCode();
                        String.valueOf(webResourceError.getDescription());
                        String.valueOf(webResourceRequest.getUrl());
                    }
                    if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                        slm.this.bu.set(false);
                        slm.this.rzk = false;
                        slm.this.ri(webResourceError != null ? webResourceError.getErrorCode() : -1, slm.this.dw.qd);
                    }
                    if (slm.this.xha != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                            }
                            slm.this.xha.ri(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceError != null) {
                        slm.this.fi = webResourceError.getErrorCode();
                        slm.this.di = String.valueOf(webResourceError.getDescription());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                try {
                    return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ac.ri("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            }
        };
        this.hcw = fiVar;
        this.vr.setWebViewClient(fiVar);
        this.hcw.ri(wjvVar);
        this.hcw.ri(this.f18097co ? "rewarded_video" : "fullscreen_interstitial_ad");
        if (wjvVar.che() && (diVar = this.vr) != null && diVar.getWebView() != null) {
            this.vr.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.3
                private final int ik = nr.lr();

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int i;
                    com.bytedance.sdk.openadsdk.ka.aw awVar = slm.this.ka;
                    if (awVar != null) {
                        awVar.ri(motionEvent);
                    }
                    if (slm.this.xm != null) {
                        slm.this.xm.ri(motionEvent);
                    }
                    try {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked != 0) {
                            int i2 = 3;
                            if (actionMasked == 1) {
                                i = i2;
                            } else if (actionMasked != 2) {
                                i2 = actionMasked != 3 ? -1 : 4;
                                i = i2;
                            } else {
                                float rawX = motionEvent.getRawX();
                                float rawY = motionEvent.getRawY();
                                if (Math.abs(rawX - slm.this.uq) >= this.ik || Math.abs(rawY - slm.this.wjv) >= this.ik) {
                                    slm.this.su = false;
                                }
                                slm.this.igq += Math.abs(motionEvent.getX() - slm.this.uq);
                                slm.this.zf += Math.abs(motionEvent.getY() - slm.this.wjv);
                                i = (System.currentTimeMillis() - slm.this.ay <= 200 || (slm.this.igq <= 8.0f && slm.this.zf <= 8.0f)) ? 2 : 1;
                            }
                        } else {
                            slm.this.su = true;
                            slm.this.fr = new SparseArray();
                            slm.this.uq = motionEvent.getRawX();
                            slm.this.wjv = motionEvent.getRawY();
                            slm.this.ay = System.currentTimeMillis();
                            try {
                                long landingPageClickBegin = slm.this.vr.getLandingPageClickBegin();
                                if (landingPageClickBegin > 0 && landingPageClickBegin < slm.this.ay) {
                                    slm.this.ay = landingPageClickBegin;
                                    slm.this.vr.setLandingPageClickBegin(-1L);
                                }
                            } catch (Exception unused) {
                            }
                            slm.this.igq = -1.0f;
                            slm.this.zf = -1.0f;
                            i = 0;
                        }
                        slm.this.fr.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.ik.ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                        if (motionEvent.getAction() == 1 && ac.di(slm.this.dw.lr) && slm.this.dw.qd != null) {
                            slm.this.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    slm.this.dw.qd.qh();
                                }
                            });
                        }
                        if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1 && ((!slm.this.slm || ac.qt(wjvVar)) && slm.this.su)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("down_x", slm.this.uq);
                            jSONObject.put("down_y", slm.this.wjv);
                            jSONObject.put("down_time", slm.this.ay);
                            jSONObject.put("up_x", motionEvent.getRawX());
                            jSONObject.put("up_y", motionEvent.getRawY());
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                long landingPageClickEnd = slm.this.vr.getLandingPageClickEnd();
                                if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis) {
                                    try {
                                        slm.this.vr.setLandingPageClickEnd(-1L);
                                    } catch (Exception unused2) {
                                    }
                                    jCurrentTimeMillis = landingPageClickEnd;
                                }
                            } catch (Exception unused3) {
                            }
                            jSONObject.put("up_time", jCurrentTimeMillis);
                            int[] iArr = new int[2];
                            slm slmVar = slm.this;
                            slmVar.ihz = slmVar.dw.pv.findViewById(520093713);
                            if (slm.this.ihz != null) {
                                slm.this.ihz.getLocationOnScreen(iArr);
                                jSONObject.put("button_x", iArr[0]);
                                jSONObject.put("button_y", iArr[1]);
                                jSONObject.put("button_width", slm.this.ihz.getWidth());
                                jSONObject.put("button_height", slm.this.ihz.getHeight());
                            }
                            if (slm.this.ac != null) {
                                int[] iArr2 = new int[2];
                                slm.this.ac.getLocationOnScreen(iArr2);
                                jSONObject.put("ad_x", iArr2[0]);
                                jSONObject.put("ad_y", iArr2[1]);
                                jSONObject.put("width", slm.this.ac.getWidth());
                                jSONObject.put("height", slm.this.ac.getHeight());
                            }
                            jSONObject.put("toolType", motionEvent.getToolType(0));
                            jSONObject.put("deviceId", motionEvent.getDeviceId());
                            jSONObject.put("source", motionEvent.getSource());
                            jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.co.ri(slm.this.fr, com.bytedance.sdk.openadsdk.core.qt.lr().ri() ? 1 : 2));
                            jSONObject.put("user_behavior_type", slm.this.su ? 1 : 2);
                            jSONObject.put("click_scence", 2);
                            if (slm.this.hcw != null) {
                                slm.this.hcw.ri(jSONObject);
                            }
                            if (!slm.this.slm && !ac.jbs(wjvVar)) {
                                if (slm.this.f18097co) {
                                    com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, "rewarded_video", "click", jSONObject);
                                } else {
                                    com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, "fullscreen_interstitial_ad", "click", jSONObject);
                                }
                                slm.this.slm = true;
                            }
                        }
                    } catch (Throwable unused4) {
                    }
                    return false;
                }
            });
        }
        com.bytedance.sdk.component.jbs.di diVar3 = this.vr;
        if (diVar3 != null) {
            diVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ri.ka(this.ri, this.ka, this.xm) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.slm.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.ka, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                }
            });
        }
        ri(this.vr);
        this.vr.setLayerType(1, null);
        this.vr.setBackgroundColor(-1);
        this.vr.setDisplayZoomControls(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.dw.lr.che() && str.endsWith(".mp4");
    }

    public void ri(DownloadListener downloadListener) {
        com.bytedance.sdk.component.jbs.di diVar = this.vr;
        if (diVar == null || downloadListener == null) {
            return;
        }
        diVar.setDownloadListener(downloadListener);
    }

    public void ri(com.bytedance.sdk.component.jbs.di diVar) {
        if (diVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.ri.ik.ri(this.dw.ig).ri(false).lr(false).ri(diVar.getWebView());
        diVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.tan.ri(diVar.getWebView(), BuildConfig.VERSION_CODE));
        diVar.setMixedContentMode(0);
    }

    public void ri(boolean z, boolean z2) {
        ri(this.ri, z, z2);
    }

    public void ri(dzy dzyVar, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z2);
            com.bytedance.sdk.openadsdk.activity.single.mj mjVar = this.dw.ajz;
            String str = TtmlNode.END;
            if (mjVar != null) {
                jSONObject.put("multi_ads_show", mjVar.jc().qt());
                if (!mjVar.bu) {
                    str = "mid";
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", TtmlNode.END);
            }
            dzyVar.ri("endcard_control_event", jSONObject);
            if (z2) {
                if (this.nr) {
                    return;
                }
                this.siy = true;
                return;
            }
            this.siy = false;
        } catch (Exception unused) {
        }
    }

    public void ri(boolean z, int i, String str) {
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.xha;
        if (fiVar == null) {
            return;
        }
        if (z) {
            fiVar.lr();
        } else {
            fiVar.ri(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.oh < 100) {
            return false;
        }
        this.oh = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
