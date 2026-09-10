package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.R;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
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
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.mml.jl;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.exc;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.jyq;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import com.smartdigimkt.o1.b;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jtx implements com.bytedance.sdk.openadsdk.fs.jpc {
    private View aaj;
    private boolean ax;
    private long bch;
    private com.bytedance.sdk.component.tvp.mo bjy;
    private boolean car;
    private int cx;
    private boolean exc;
    private int exu;
    private boolean fco;
    private final boolean fs;
    private ILoader gt;
    private boolean gy;
    private com.bytedance.sdk.openadsdk.core.widget.qdl.mzz hkc;
    private boolean jl;
    private View jyq;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl kdv;
    private float ljh;
    protected String lnr;
    com.bytedance.sdk.openadsdk.mml.fs mml;
    private boolean mrf;
    private float oth;
    hkc qdl;
    private boolean rc;
    private int rdp;
    private int rq;
    private boolean sy;
    private com.bytedance.sdk.openadsdk.core.widget.qdl.mo.qdl taz;
    private com.bytedance.sdk.openadsdk.common.mml tid;
    private final String to;
    private com.bytedance.sdk.openadsdk.common.exu vu;
    private String wak;
    private long wc;
    protected com.bytedance.sdk.openadsdk.mml.mml.mzz wd;
    private boolean zlt;
    protected boolean ud = true;
    private boolean jtx = false;
    private final AtomicBoolean yt = new AtomicBoolean(true);
    int mzz = 0;
    String mo = "";
    boolean jpc = false;
    private SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> uw = new SparseArray<>();
    private boolean xmv = true;
    private float bqt = -1.0f;
    private float koa = -1.0f;
    private boolean ekw = false;
    private long hzv = 0;
    private long ag = -1;
    private volatile int om = 0;
    private int yh = -1;
    private volatile int irn = 0;
    private volatile int xi = 0;
    private long jjk = 0;
    public boolean tvp = false;
    private int mlb = -1;

    public static class lnr implements com.bytedance.sdk.openadsdk.fs.to {
        private final com.bytedance.sdk.component.tvp.mo qdl;

        @Override // com.bytedance.sdk.openadsdk.fs.to
        public void qdl() {
            com.bytedance.sdk.component.tvp.mo moVar = this.qdl;
            if (moVar == null) {
                return;
            }
            moVar.bjy();
        }

        @Override // com.bytedance.sdk.openadsdk.fs.to
        public void ud() {
            com.bytedance.sdk.component.tvp.mo moVar = this.qdl;
            if (moVar == null) {
                return;
            }
            moVar.jl();
        }

        private lnr(com.bytedance.sdk.component.tvp.mo moVar) {
            this.qdl = moVar;
        }
    }

    public interface mml {
        void qdl(WebView webView, int i2);

        void qdl(WebView webView, String str);
    }

    public static class ud implements com.bytedance.sdk.openadsdk.fs.qdl {
        private final View qdl;

        public ud(View view) {
            this.qdl = view;
        }

        @Override // com.bytedance.sdk.openadsdk.fs.qdl
        public int qdl() {
            View view = this.qdl;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            return measuredHeight <= 0 ? ax.mzz(com.bytedance.sdk.openadsdk.core.yt.qdl()) : measuredHeight;
        }

        @Override // com.bytedance.sdk.openadsdk.fs.qdl
        public int ud() {
            View view = this.qdl;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            return measuredWidth <= 0 ? ax.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl()) : measuredWidth;
        }
    }

    public jtx(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.kdv = qdlVar;
        this.to = qdlVar.mzz;
        this.fs = qdlVar.mml;
    }

    public static /* synthetic */ int bjy(jtx jtxVar) {
        int i2 = jtxVar.om;
        jtxVar.om = i2 + 1;
        return i2;
    }

    private com.bytedance.sdk.openadsdk.mml.mml.mzz fco() {
        return new jl(2, this.fs ? "rewarded_video" : "fullscreen_interstitial_ad", this.kdv.ud);
    }

    public static /* synthetic */ int fs(jtx jtxVar) {
        int i2 = jtxVar.irn;
        jtxVar.irn = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hzv() {
        this.fco = true;
        this.car = false;
        this.kdv.cx.removeMessages(600);
        this.kdv.cx.removeMessages(700);
        this.kdv.cx.removeMessages(b.z1);
        this.kdv.fco.mml(false);
        this.kdv.exc.set(true);
        this.kdv.en.bjy();
        ljh ljhVar = this.kdv.ud;
        ljhVar.jwd();
        if (ljhVar.jwd() || !gy.jpc(vu.qdl(ljhVar))) {
            return;
        }
        View view = this.kdv.gy.to();
        View.OnClickListener onClickListener = (View.OnClickListener) view.getTag(view.getId());
        if (onClickListener != null) {
            qdl qdlVar = new qdl(this.kdv, view, onClickListener);
            view.setOnClickListener(qdlVar);
            view.setOnTouchListener(qdlVar);
        }
    }

    public static /* synthetic */ int rdp(jtx jtxVar) {
        int i2 = jtxVar.xi;
        jtxVar.xi = i2 + 1;
        return i2;
    }

    public boolean ekw() {
        return this.fco;
    }

    public boolean hkc() {
        return this.tvp;
    }

    public void kdv() {
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.mml;
        if (fsVar != null) {
            fsVar.mzz();
        }
    }

    public boolean aaj() {
        if (ljh.lnr(this.kdv.ud)) {
            return this.mrf && !this.gy && this.kdv.hzv.fs();
        }
        return this.mrf && !this.gy && this.yt.get() && this.jl;
    }

    public boolean bch() {
        return this.jpc;
    }

    public void bjy() {
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.tvp();
        }
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.mml;
        if (fsVar != null) {
            fsVar.jpc();
        }
    }

    public boolean bqt() {
        hkc hkcVar = this.qdl;
        if (hkcVar == null) {
            return false;
        }
        return hkcVar.tvp();
    }

    public String exc() {
        return this.mo;
    }

    public boolean exu() {
        return this.yt.get();
    }

    public boolean fs() {
        String str = this.lnr;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public int jl() {
        return this.mzz;
    }

    public com.bytedance.sdk.component.tvp.mo jpc() {
        return this.bjy;
    }

    public void jtx() {
        com.bytedance.sdk.component.tvp.mo moVar = this.bjy;
        if (moVar != null) {
            moVar.bjy();
        }
        if (this.ag > 0) {
            this.wc = (SystemClock.elapsedRealtime() - this.ag) + this.wc;
            this.ag = 0L;
        }
        hkc hkcVar = this.qdl;
        if (hkcVar != null) {
            hkcVar.qdl(false);
            ud(this.qdl, false);
            qdl(this.qdl, true, false);
        }
    }

    public void jyq() {
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.jpc();
        }
    }

    public boolean koa() {
        return this.jl && this.yt.get();
    }

    public void ljh() {
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.mml;
        if (fsVar != null) {
            fsVar.qdl(System.currentTimeMillis());
        }
    }

    public void oth() {
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.wd();
        }
    }

    public boolean rc() {
        com.bytedance.sdk.component.tvp.mo moVar = this.bjy;
        return moVar == null || moVar.getWebView() == null;
    }

    public boolean rdp() {
        return this.jl;
    }

    public void rq() {
        com.bytedance.sdk.component.tvp.mo moVar = this.bjy;
        if (moVar != null) {
            com.bytedance.sdk.component.utils.vu.qdl(moVar);
        }
        ljh ljhVar = this.kdv.ud;
        long j = this.wc;
        if (j > 0) {
            if (this.ag > 0) {
                this.wc = (SystemClock.elapsedRealtime() - this.ag) + j;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", ljh.lnr(ljhVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.kdv.ud, this.to, "second_endcard_duration", jSONObject, this.wc);
        }
        this.bjy = null;
        if (this.wd != null && !aaj.mml(ljhVar) && !aaj.wd(ljhVar) && !ljh.lnr(ljhVar)) {
            this.wd.qdl(true);
            this.wd.fs();
        }
        hkc hkcVar = this.qdl;
        if (hkcVar != null) {
            hkcVar.fs();
        }
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.mml;
        if (fsVar != null) {
            fsVar.mml(ljhVar.zpu());
        }
        DeviceUtils.AudioInfoReceiver.ud(this);
    }

    public void to() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        ljh ljhVar = this.kdv.ud;
        String strWd = ljhVar.wd();
        if (!TextUtils.isEmpty(strWd) && (jpcVar = this.kdv.lq) != null && (jpcVar.ag() || this.kdv.lq.cx().bch())) {
            this.lnr = strWd;
        } else if (vu.mzz(ljhVar)) {
            com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = ljhVar.tdy();
            if (udVarTdy != null) {
                this.lnr = udVarTdy.fs();
            }
        } else {
            this.lnr = vu.fs(ljhVar);
        }
        String strQdl = qdl(this.lnr, ljhVar, this.rq, this.rdp, this.exu);
        this.lnr = strQdl;
        if (TextUtils.isEmpty(strQdl)) {
            return;
        }
        this.mrf = this.lnr.contains("use_second_endcard=1");
    }

    public hkc tvp() {
        return this.qdl;
    }

    public void uw() {
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.lnr();
            this.wd.mml();
        }
    }

    public boolean vu() {
        return this.car;
    }

    public void wd() {
        this.qdl.qdl("showPlayableEndCardOverlay", (JSONObject) null);
        this.kdv.cx.sendEmptyMessageDelayed(600, 1000L);
        this.kdv.cx.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.10
            @Override // java.lang.Runnable
            public void run() {
                jtx.this.hzv();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.rdp rdpVar = this.kdv.kab;
        if (rdpVar != null) {
            rdpVar.qdl(0L);
        }
    }

    public void xmv() {
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.to();
        }
    }

    public void yt() {
        com.bytedance.sdk.component.tvp.mo moVar = this.bjy;
        if (moVar != null) {
            moVar.exu();
        }
        if (this.ag == 0) {
            this.ag = SystemClock.elapsedRealtime();
        }
        ljh ljhVar = this.kdv.ud;
        hkc hkcVar = this.qdl;
        if (hkcVar != null) {
            hkcVar.rq();
            com.bytedance.sdk.component.tvp.mo moVar2 = this.bjy;
            if (moVar2 != null) {
                if (moVar2.getVisibility() == 0) {
                    this.qdl.qdl(true);
                    ud(this.qdl, true);
                    qdl(this.qdl, false, true);
                    if (vu.jpc(ljhVar) && !this.fco && this.kdv.ud.jwd()) {
                        wd();
                    }
                } else {
                    this.qdl.qdl(false);
                    ud(this.qdl, false);
                    qdl(this.qdl, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.mml;
        if (fsVar != null) {
            fsVar.wd();
        }
    }

    public void mo() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.kdv;
        ljh ljhVar = qdlVar.ud;
        if (TextUtils.isEmpty(ljh.qdl(qdlVar.om, ljhVar))) {
            if (ljhVar != null && !ljhVar.koa() && this.gt == null && fs()) {
                this.wak = ljhVar.xmr();
                this.gt = com.bytedance.sdk.openadsdk.wd.ud.qdl().ud();
                int iQdl = com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(this.gt, this.wak);
                this.cx = iQdl;
                this.yh = iQdl > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.wak)) {
                    com.bytedance.sdk.openadsdk.mml.fs fsVar = this.mml;
                    if (fsVar != null) {
                        fsVar.qdl(this.yh);
                    }
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl.qdl(this.jjk, ljhVar, "landingpage_endcard", this.gt, this.wak);
                }
            }
            if ((!TextUtils.isEmpty(this.lnr) && this.lnr.contains("play.google.com/store")) || ((ljhVar != null && !ljhVar.ax() && aaj.jpc(ljhVar)) || aaj.wd(ljhVar))) {
                this.jpc = true;
                return;
            }
            Log.d("TTAD.RFWVM", "preLoadEndCardForce: return mShouldPreloadEndCard " + this.ud + ",webViewIsLoading " + this.sy);
            if (this.ud) {
                boolean z2 = this.kdv.tqd;
                if (this.bjy != null && ((z2 || !TextUtils.isEmpty(this.lnr)) && ljh.ud(ljhVar))) {
                    if (this.sy) {
                        return;
                    }
                    String strR = a.r(new StringBuilder(), this.lnr, "&is_pre_render=1");
                    com.bytedance.sdk.openadsdk.mml.fs fsVar2 = this.mml;
                    if (fsVar2 != null) {
                        fsVar2.mml();
                    }
                    jyq.qdl(this.bjy, strR);
                    this.sy = true;
                    return;
                }
                if (ljh.lnr(ljhVar)) {
                    this.kdv.hzv.lnr();
                }
            }
        }
    }

    public void mzz() {
        if (vu.mzz(this.kdv.ud) && this.kdv.rzg) {
            return;
        }
        mo();
    }

    public boolean lnr() {
        return this.ax;
    }

    public boolean mml() {
        return this.gy;
    }

    public void ud() {
        com.bytedance.sdk.openadsdk.common.exu exuVar;
        this.aaj = this.kdv.ag.findViewById(R.id.content);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.kdv;
        boolean z2 = qdlVar.wd;
        this.rc = z2;
        if (z2 && (exuVar = this.vu) != null) {
            this.bjy = exuVar.mml();
        } else {
            com.bytedance.sdk.component.tvp.mo moVar = (com.bytedance.sdk.component.tvp.mo) qdlVar.ax.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.rdp);
            this.bjy = moVar;
            if (moVar != null && ljh.ud(this.kdv.ud)) {
                this.bjy.mzz();
            } else {
                ax.qdl((View) this.bjy, 8);
            }
        }
        com.bytedance.sdk.component.tvp.mo moVar2 = this.bjy;
        if (moVar2 != null) {
            moVar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (jtx.this.bjy == null || jtx.this.bjy.getViewTreeObserver() == null) {
                        return;
                    }
                    jtx.this.bjy.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = jtx.this.bjy.getMeasuredWidth();
                    int measuredHeight = jtx.this.bjy.getMeasuredHeight();
                    if (jtx.this.bjy.getVisibility() == 0) {
                        jtx.this.qdl(measuredWidth, measuredHeight);
                    }
                }
            });
        }
    }

    public void lnr(boolean z2) {
        ud(this.qdl, z2);
    }

    public void mml(boolean z2) {
        if (vu.ud(this.kdv.ud)) {
            return;
        }
        mzz(z2);
    }

    public void mzz(boolean z2) {
        if (this.qdl == null || this.kdv.ag.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z2);
            this.qdl.qdl("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static class qdl extends com.bytedance.sdk.openadsdk.core.lnr.qdl implements com.bytedance.sdk.openadsdk.core.lnr.ud.qdl {
        private final View.OnClickListener lnr;
        private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdl;
        private final View ud;

        public qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar, View view, View.OnClickListener onClickListener) {
            super(qdlVar.ag, qdlVar.ud, qdlVar.mzz, qdlVar.mml ? 7 : 5);
            this.qdl = qdlVar;
            this.ud = view;
            this.lnr = onClickListener;
            HashMap map = new HashMap();
            map.put("close_auto_click", Boolean.TRUE);
            map.put("click_scence", 2);
            qdl(map);
            qdl(qdlVar.uw.lnr());
            qdl(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl, com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
        public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, boolean z2) {
            if (!this.qdl.ud.jwd()) {
                super.qdl(view, f, f2, f3, f4, sparseArray, z2);
                this.qdl.wc.mrf();
            } else {
                this.lnr.onClick(view);
                this.ud.setOnTouchListener(null);
                this.ud.setOnClickListener(this.lnr);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
        public void qdl(View view, int i2) {
            this.ud.setOnTouchListener(null);
            this.ud.setOnClickListener(this.lnr);
        }
    }

    public void wd(boolean z2) {
        this.car = z2;
    }

    public void qdl() {
        if (this.exc) {
            return;
        }
        this.exc = true;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.kdv;
        this.rq = qdlVar.zlt;
        this.exu = qdlVar.tid;
        this.rdp = qdlVar.sy;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ud();
        this.jjk = SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    public void ud(boolean z2) {
        qdl(this.qdl, z2);
    }

    public void ud(hkc hkcVar, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z2 ? 1 : 0);
            hkcVar.qdl(d9.g.f24689V, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void qdl(String str, final com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        qdl(str, new mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.mml
            public void qdl(WebView webView, String str2) {
                if (jtx.this.kdv.ag.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl unused = jtx.this.kdv;
                jtx.this.exu();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.mml
            public void qdl(WebView webView, int i2) {
                try {
                    if (!jtx.this.kdv.wd || jtx.this.kdv.ijp == null) {
                        return;
                    }
                    jtx.this.kdv.ijp.qdl(webView, i2, jtx.this.taz);
                } catch (Exception unused) {
                }
            }
        });
        qdl(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.6
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                jtx.this.kdv.uw.ud();
                com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar2 = udVar;
                if (udVar2 != null) {
                    udVar2.car();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fs.jpc
    public void ud(int i2) {
        int i3 = this.mlb;
        if (i3 <= 0 && i2 > 0) {
            mml(false);
        } else if (i3 > 0 && i2 == 0) {
            mml(true);
        }
        this.mlb = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i2, com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        this.kdv.ljh.get();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.kdv;
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar = qdlVar.lq;
        if (jpcVar == null || !jpcVar.fs || qdlVar.ljh.get()) {
            return;
        }
        this.kdv.ljh.set(true);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.kdv;
        if (qdlVar2.ra && aaj.fs(qdlVar2.ud) && udVar != null) {
            udVar.mo();
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.fs.mo moVar, String str, final com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        if (this.bjy == null) {
            return;
        }
        HashMap map = new HashMap();
        final ljh ljhVar = this.kdv.ud;
        map.put("click_scence", 2);
        this.wd = fco();
        hkc hkcVar = new hkc(this.kdv.ag);
        this.qdl = hkcVar;
        hkcVar.qdl(this.kdv.wc);
        hkc hkcVarQdl = this.qdl.ud(this.bjy).qdl(ljhVar).qdl(com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl(ljhVar)).lnr(ljhVar.yre()).mml(ljhVar.ir()).ud(ljhVar.mq() ? 7 : 5).qdl(new ud(this.bjy)).mzz(ljhVar.htl()).qdl(this.bjy);
        if (fs()) {
            str = "landingpage_endcard";
        }
        hkcVarQdl.ud(str).qdl(map).qdl(this.wd).qdl(new com.bytedance.sdk.openadsdk.core.widget.mzz() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.mzz
            public void qdl() {
                if (jtx.this.hkc != null) {
                    jtx.this.hkc.lnr();
                }
                com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar2 = udVar;
                if (udVar2 != null) {
                    udVar2.car();
                }
            }
        }).qdl(new hkc.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.7
            @Override // com.bytedance.sdk.openadsdk.core.hkc.qdl
            public void qdl() {
                jtx.this.hzv();
            }
        });
        this.qdl.qdl(new lnr(this.bjy));
        this.qdl.qdl(this.kdv.gy.to()).qdl(this.kdv.xmv.lnr()).qdl(new com.bytedance.sdk.openadsdk.fs.lnr() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.9
            @Override // com.bytedance.sdk.openadsdk.fs.lnr
            public void qdl(boolean z2, int i2, String str2) {
                if (z2) {
                    jtx jtxVar = jtx.this;
                    jtxVar.tvp = true;
                    if (jtxVar.zlt) {
                        jtx.this.zlt = false;
                        jtx jtxVar2 = jtx.this;
                        jtxVar2.qdl(jtxVar2.kdv.gt, true);
                    }
                }
                if (ljh.mml(ljhVar)) {
                    jtx.this.qdl(z2, i2, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.fs.lnr
            public void qdl() {
                jtx.this.ax = true;
                jtx.this.kdv.gy.to().performClick();
            }
        });
        this.qdl.mml(this.mrf);
    }

    public void mo(boolean z2) {
        this.gy = true;
        JSONObject jSONObject = new JSONObject();
        ljh ljhVar = this.kdv.ud;
        try {
            jSONObject.put("endcard_overlay_render_type", ljh.lnr(ljhVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, this.to, "use_second_endcard", jSONObject);
        this.ag = SystemClock.elapsedRealtime();
        try {
            if (!ljh.lnr(ljhVar)) {
                this.qdl.qdl("click_endcard_close", (JSONObject) null);
            } else if (z2) {
                this.kdv.hzv.jpc();
                com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, this.to, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.kdv;
        qdlVar.kab.qdl(qdlVar.jpc);
    }

    public void qdl(int i2, int i3) {
        if (this.qdl == null || this.kdv.ag.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i2);
            jSONObject.put("height", i3);
            this.qdl.qdl("resize", jSONObject);
        } catch (Exception e2) {
            Log.e("TTAD.RFWVM", "", e2);
        }
    }

    public void qdl(boolean z2) {
        this.ud = z2;
    }

    private static String qdl(String str, ljh ljhVar, int i2, int i3, int i4) {
        String strConcat;
        String strConcat2;
        float fNv = ljhVar.nv();
        if (!TextUtils.isEmpty(str)) {
            if (i2 == 1) {
                if (str.contains("?")) {
                    strConcat2 = str.concat(d9.i.f24749c);
                } else {
                    strConcat2 = str.concat("?");
                }
                str = a.m(strConcat2, "orientation=portrait");
            }
            if (str.contains("?")) {
                strConcat = str.concat(d9.i.f24749c);
            } else {
                strConcat = str.concat("?");
            }
            str = strConcat + "height=" + i3 + "&width=" + i4 + "&aspect_ratio=" + fNv;
        }
        return !vu.ud(ljhVar) ? com.bytedance.sdk.openadsdk.utils.mo.qdl(str) : str;
    }

    public void qdl(int i2) {
        if (this.jl || !this.yt.get()) {
            qdl(0, this.kdv.wc);
        }
        ax.qdl((View) this.bjy, i2);
        com.bytedance.sdk.component.tvp.mo moVar = this.bjy;
        if (moVar != null) {
            ax.qdl((View) moVar.getWebView(), i2);
        }
        ljh ljhVar = this.kdv.ud;
        if (this.bjy == null || !ljhVar.zpu()) {
            return;
        }
        this.bjy.setLandingPage(true);
        this.bjy.setTag("landingpage_endcard");
        this.bjy.setMaterialMeta(ljhVar.il());
    }

    public void qdl(com.bytedance.sdk.openadsdk.common.exu exuVar) {
        this.vu = exuVar;
    }

    public void qdl(float f) {
        ax.qdl(this.bjy, f);
    }

    public void qdl(hkc hkcVar, boolean z2) {
        if (this.qdl == null || this.kdv.ag.isFinishing()) {
            return;
        }
        hkcVar.qdl(z2);
    }

    private void qdl(String str, final mml mmlVar) {
        com.bytedance.sdk.component.tvp.mo moVar;
        final ljh ljhVar = this.kdv.ud;
        com.bytedance.sdk.component.tvp.mo moVar2 = this.bjy;
        if (moVar2 == null || moVar2.getWebView() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.fs fsVarUd = new com.bytedance.sdk.openadsdk.mml.fs(ljhVar, this.bjy.getWebView(), new com.bytedance.sdk.openadsdk.mml.rq() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.11
            @Override // com.bytedance.sdk.openadsdk.mml.rq
            public void qdl(int i2) {
                if (TextUtils.isEmpty(jtx.this.wak)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.mml.lnr.qdl.qdl(jtx.this.cx, jtx.this.om, jtx.this.xi, jtx.this.irn - jtx.this.xi, ljhVar, "landingpage_endcard", i2);
            }
        }, this.yh).ud(true);
        this.mml = fsVarUd;
        this.taz = fsVarUd.qdl;
        fsVarUd.qdl(fs() ? "landingpage_endcard" : str);
        this.mml.ud(this.to);
        this.mml.lnr(true);
        this.bjy.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.12
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                com.bytedance.sdk.openadsdk.mml.fs fsVar = jtx.this.mml;
                if (fsVar != null) {
                    fsVar.ud(i3);
                }
            }
        });
        jpc jpcVar = this.kdv.xmv;
        if (jpcVar != null) {
            this.mml.qdl(jpcVar.qdl());
        }
        com.bytedance.sdk.openadsdk.common.mml mmlVarQdl = gy.qdl(ljhVar, this.bjy, this.kdv.ag, this.to);
        this.tid = mmlVarQdl;
        if (mmlVarQdl != null) {
            mmlVarQdl.qdl(fs() ? "landingpage_endcard" : str);
        }
        if (fs()) {
            gy.qdl(ljhVar, this.bjy);
        }
        com.bytedance.sdk.openadsdk.core.widget.qdl.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.widget.qdl.mzz(com.bytedance.sdk.openadsdk.core.yt.qdl(), this.qdl, ljhVar.yre(), this.tid, this.mml, ljhVar.zpu()) { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                jtx.this.sy = false;
                jtx.this.jl = true;
                jtx jtxVar = jtx.this;
                jtxVar.qdl(100, jtxVar.kdv.wc);
                if (jtx.this.kdv.hkc.aaj()) {
                    View view = jtx.this.kdv.gy.to();
                    if (view instanceof com.bytedance.sdk.openadsdk.core.mo.mml) {
                        ((com.bytedance.sdk.openadsdk.core.mo.mml) view).setImageResource(com.bytedance.sdk.component.utils.ljh.mml(jtx.this.kdv.om, "tt_skip_btn"));
                    }
                }
                DeviceUtils.AudioInfoReceiver.qdl(jtx.this);
                jtx.this.mlb = DeviceUtils.wd();
                com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar2 = jtx.this.wd;
                if (mzzVar2 != null) {
                    mzzVar2.mo();
                }
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl unused = jtx.this.kdv;
                mml mmlVar2 = mmlVar;
                if (mmlVar2 != null) {
                    mmlVar2.qdl(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                super.onPageStarted(webView, str2, bitmap);
                com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar2 = jtx.this.wd;
                if (mzzVar2 != null) {
                    mzzVar2.mzz();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i2, String str2, String str3) {
                super.onReceivedError(webView, i2, str2, str3);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl unused = jtx.this.kdv;
                webResourceRequest.isForMainFrame();
                webResourceRequest.getUrl();
                webResourceResponse.getStatusCode();
                if (webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest.isForMainFrame()) {
                    jtx.this.yt.set(false);
                    jtx.this.sy = false;
                    jtx.this.mzz = webResourceResponse.getStatusCode();
                    jtx jtxVar = jtx.this;
                    jtxVar.mo = "onReceivedHttpError";
                    jtxVar.qdl(jtxVar.mzz, jtxVar.kdv.wc);
                }
                if (jtx.this.wd != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", webResourceResponse.getStatusCode());
                        jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                        jtx.this.wd.qdl(jSONObject);
                    } catch (JSONException unused2) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                try {
                    if (TextUtils.isEmpty(jtx.this.wak)) {
                        return super.shouldInterceptRequest(webView, str2);
                    }
                    jtx.fs(jtx.this);
                    WebResourceResponseModel webResourceResponseModelQdl = com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(jtx.this.gt, jtx.this.wak, str2);
                    if (webResourceResponseModelQdl != null && webResourceResponseModelQdl.getWebResourceResponse() != null) {
                        jtx.rdp(jtx.this);
                        return webResourceResponseModelQdl.getWebResourceResponse();
                    }
                    if (webResourceResponseModelQdl != null && webResourceResponseModelQdl.getMsg() == 2) {
                        jtx.bjy(jtx.this);
                    }
                    return super.shouldInterceptRequest(webView, str2);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.aaj.qdl("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !jtx.this.qdl(webResourceRequest.getUrl().toString())) {
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl unused = jtx.this.kdv;
                        webResourceError.getErrorCode();
                        String.valueOf(webResourceError.getDescription());
                        String.valueOf(webResourceRequest.getUrl());
                    }
                    if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                        jtx.this.yt.set(false);
                        jtx.this.sy = false;
                        jtx.this.qdl(webResourceError != null ? webResourceError.getErrorCode() : -1, jtx.this.kdv.wc);
                    }
                    if (jtx.this.wd != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put("msg", webResourceError.getDescription());
                            }
                            jtx.this.wd.qdl(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceError != null) {
                        jtx.this.mzz = webResourceError.getErrorCode();
                        jtx.this.mo = String.valueOf(webResourceError.getDescription());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                try {
                    return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.aaj.qdl("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            }
        };
        this.hkc = mzzVar;
        this.bjy.setWebViewClient(mzzVar);
        this.hkc.qdl(ljhVar);
        this.hkc.qdl(this.fs ? "rewarded_video" : "fullscreen_interstitial_ad");
        if (ljhVar.zpu() && (moVar = this.bjy) != null && moVar.getWebView() != null) {
            this.bjy.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.3
                private final int lnr = com.bytedance.sdk.openadsdk.core.yt.ud();

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int i2;
                    com.bytedance.sdk.openadsdk.mml.fs fsVar = jtx.this.mml;
                    if (fsVar != null) {
                        fsVar.qdl(motionEvent);
                    }
                    if (jtx.this.tid != null) {
                        jtx.this.tid.qdl(motionEvent);
                    }
                    try {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked != 0) {
                            int i3 = 3;
                            if (actionMasked == 1) {
                                i2 = i3;
                            } else if (actionMasked != 2) {
                                i3 = actionMasked != 3 ? -1 : 4;
                                i2 = i3;
                            } else {
                                float rawX = motionEvent.getRawX();
                                float rawY = motionEvent.getRawY();
                                if (Math.abs(rawX - jtx.this.oth) >= this.lnr || Math.abs(rawY - jtx.this.ljh) >= this.lnr) {
                                    jtx.this.xmv = false;
                                }
                                jtx.this.bqt += Math.abs(motionEvent.getX() - jtx.this.oth);
                                jtx.this.koa += Math.abs(motionEvent.getY() - jtx.this.ljh);
                                int i4 = (System.currentTimeMillis() - jtx.this.bch <= 200 || (jtx.this.bqt <= 8.0f && jtx.this.koa <= 8.0f)) ? 2 : 1;
                                if (jtx.this.rc) {
                                    if (rawY - jtx.this.ljh > 8.0f) {
                                        jtx.this.vu.qdl();
                                    }
                                    if (rawY - jtx.this.ljh < -8.0f) {
                                        jtx.this.vu.ud();
                                    }
                                }
                                i2 = i4;
                            }
                        } else {
                            jtx.this.xmv = true;
                            jtx.this.uw = new SparseArray();
                            jtx.this.oth = motionEvent.getRawX();
                            jtx.this.ljh = motionEvent.getRawY();
                            jtx.this.bch = System.currentTimeMillis();
                            try {
                                long landingPageClickBegin = jtx.this.bjy.getLandingPageClickBegin();
                                if (landingPageClickBegin > 0 && landingPageClickBegin < jtx.this.bch) {
                                    jtx.this.bch = landingPageClickBegin;
                                    jtx.this.bjy.setLandingPageClickBegin(-1L);
                                }
                            } catch (Exception unused) {
                            }
                            jtx.this.bqt = -1.0f;
                            jtx.this.koa = -1.0f;
                            i2 = 0;
                        }
                        jtx.this.uw.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl(i2, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                        if (motionEvent.getAction() == 1 && aaj.mo(jtx.this.kdv.ud) && jtx.this.kdv.wc != null) {
                            jtx.this.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    jtx.this.kdv.wc.sy();
                                }
                            });
                        }
                        if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1 && ((!jtx.this.jtx || aaj.to(ljhVar)) && jtx.this.xmv)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("down_x", jtx.this.oth);
                            jSONObject.put("down_y", jtx.this.ljh);
                            jSONObject.put("down_time", jtx.this.bch);
                            jSONObject.put("up_x", motionEvent.getRawX());
                            jSONObject.put("up_y", motionEvent.getRawY());
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                long landingPageClickEnd = jtx.this.bjy.getLandingPageClickEnd();
                                if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis) {
                                    try {
                                        jtx.this.bjy.setLandingPageClickEnd(-1L);
                                    } catch (Exception unused2) {
                                    }
                                    jCurrentTimeMillis = landingPageClickEnd;
                                }
                            } catch (Exception unused3) {
                            }
                            jSONObject.put("up_time", jCurrentTimeMillis);
                            int[] iArr = new int[2];
                            if (jtx.this.rc) {
                                jtx jtxVar = jtx.this;
                                jtxVar.jyq = jtxVar.kdv.ax.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.en);
                            } else {
                                jtx jtxVar2 = jtx.this;
                                jtxVar2.jyq = jtxVar2.kdv.ax.findViewById(520093713);
                            }
                            if (jtx.this.jyq != null) {
                                jtx.this.jyq.getLocationOnScreen(iArr);
                                jSONObject.put("button_x", iArr[0]);
                                jSONObject.put("button_y", iArr[1]);
                                jSONObject.put("button_width", jtx.this.jyq.getWidth());
                                jSONObject.put("button_height", jtx.this.jyq.getHeight());
                            }
                            if (jtx.this.aaj != null) {
                                int[] iArr2 = new int[2];
                                jtx.this.aaj.getLocationOnScreen(iArr2);
                                jSONObject.put("ad_x", iArr2[0]);
                                jSONObject.put("ad_y", iArr2[1]);
                                jSONObject.put("width", jtx.this.aaj.getWidth());
                                jSONObject.put("height", jtx.this.aaj.getHeight());
                            }
                            jSONObject.put("toolType", motionEvent.getToolType(0));
                            jSONObject.put("deviceId", motionEvent.getDeviceId());
                            jSONObject.put("source", motionEvent.getSource());
                            jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.fs.qdl(jtx.this.uw, com.bytedance.sdk.openadsdk.core.tvp.ud().qdl() ? 1 : 2));
                            jSONObject.put("user_behavior_type", jtx.this.xmv ? 1 : 2);
                            jSONObject.put("click_scence", 2);
                            if (jtx.this.hkc != null) {
                                jtx.this.hkc.qdl(jSONObject);
                            }
                            if (!jtx.this.jtx && !aaj.tvp(ljhVar)) {
                                if (jtx.this.fs) {
                                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "rewarded_video", "click", jSONObject);
                                } else {
                                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "fullscreen_interstitial_ad", "click", jSONObject);
                                }
                                jtx.this.jtx = true;
                            }
                            return false;
                        }
                    } catch (Throwable th) {
                        Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th);
                    }
                    return false;
                }
            });
        }
        com.bytedance.sdk.component.tvp.mo moVar3 = this.bjy;
        if (moVar3 != null) {
            moVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.qdl.mml(this.qdl, this.mml, this.tid) { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.jtx.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mml, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i2) {
                    super.onProgressChanged(webView, i2);
                    mml mmlVar2 = mmlVar;
                    if (mmlVar2 != null) {
                        mmlVar2.qdl(webView, i2);
                    }
                }
            });
        }
        qdl(this.bjy);
        this.bjy.setLayerType(1, null);
        this.bjy.setBackgroundColor(-1);
        this.bjy.setDisplayZoomControls(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.kdv.ud.zpu() && str.endsWith(".mp4");
    }

    public void qdl(DownloadListener downloadListener) {
        com.bytedance.sdk.component.tvp.mo moVar = this.bjy;
        if (moVar == null || downloadListener == null) {
            return;
        }
        moVar.setDownloadListener(downloadListener);
    }

    public void qdl(com.bytedance.sdk.component.tvp.mo moVar) {
        if (moVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.qdl.lnr.qdl(this.kdv.ag).qdl(false).ud(false).qdl(moVar.getWebView());
        moVar.setUserAgentString(exc.qdl(moVar.getWebView(), BuildConfig.VERSION_CODE));
        moVar.setMixedContentMode(0);
    }

    public void qdl(boolean z2, boolean z3) {
        qdl(this.qdl, z2, z3);
    }

    public void qdl(hkc hkcVar, boolean z2, boolean z3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z2);
            jSONObject.put("endcard_show", z3);
            com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.kdv.lq;
            String str = TtmlNode.END;
            if (jpcVar != null) {
                jSONObject.put("multi_ads_show", jpcVar.cx().tvp());
                if (!jpcVar.yt) {
                    str = "mid";
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", TtmlNode.END);
            }
            hkcVar.qdl("endcard_control_event", jSONObject);
            if (z3) {
                if (this.jl) {
                    return;
                }
                this.zlt = true;
                return;
            }
            this.zlt = false;
        } catch (Exception unused) {
        }
    }

    public void qdl(boolean z2, int i2, String str) {
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.wd;
        if (mzzVar == null) {
            return;
        }
        if (z2) {
            mzzVar.ud();
        } else {
            mzzVar.qdl(i2, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qdl(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.hzv < 100) {
            return false;
        }
        this.hzv = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
