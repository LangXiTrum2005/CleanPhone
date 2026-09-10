package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.fco;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.hzv;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.smartdigimkt.b0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class aaj extends com.bytedance.sdk.openadsdk.core.mo.lnr implements com.bytedance.sdk.component.adexpress.dynamic.mml, com.bytedance.sdk.component.adexpress.ud.bjy, com.bytedance.sdk.component.adexpress.ud.jpc, com.bytedance.sdk.openadsdk.core.lnr.qdl.InterfaceC0118qdl, bjy {
    protected HashSet<String> aaj;
    private final AtomicBoolean ag;
    private oth ax;
    boolean bch;
    protected boolean bjy;
    protected com.bytedance.sdk.component.adexpress.ud.ud bqt;
    private com.bytedance.sdk.component.adexpress.ud.tvp car;
    private final Runnable cx;
    private final SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> dk;
    private String ekw;
    private float en;
    protected String exc;
    public FrameLayout exu;
    private String fco;
    protected com.bytedance.sdk.openadsdk.core.model.ljh fs;
    private ThemeStatusBroadcastReceiver gt;
    private boolean gy;
    private com.bytedance.sdk.openadsdk.core.rq.lnr.ud hkc;
    private boolean hzv;
    private float ijp;
    private bch irn;
    private List<com.bytedance.sdk.component.adexpress.ud.to> jjk;
    protected int jl;
    private String jpc;
    protected com.bytedance.sdk.component.adexpress.ud.lnr jtx;
    protected ViewGroup jyq;
    private long kab;
    private com.bytedance.sdk.openadsdk.mml.mml.mzz kdv;
    public com.bytedance.sdk.component.adexpress.ud.mml<? extends View> koa;
    int ljh;
    private com.bytedance.sdk.openadsdk.lnr.lnr lnr;
    private int lte;
    private com.bytedance.sdk.component.adexpress.ud.exu mlb;
    private TTDislikeDialogAbstract mml;
    private jpc mo;
    private com.bytedance.sdk.openadsdk.core.mml.wd.qdl mrf;
    private PAGExpressAdWrapperListener mzz;
    private float nz;
    private final ViewTreeObserver.OnScrollChangedListener om;
    public boolean oth;
    private boolean qdl;
    private com.bytedance.sdk.openadsdk.core.mml.tvp ra;
    private float rc;
    protected boolean rdp;
    protected AdSlot rq;
    private com.bytedance.sdk.openadsdk.core.rq.mo.mml sy;
    private com.bytedance.sdk.component.adexpress.ud.mo taz;
    private com.bytedance.sdk.openadsdk.core.rq.ud.wd tid;
    protected String to;
    protected final Context tvp;
    private int ud;
    public com.bytedance.sdk.openadsdk.mml.wd uw;
    private float vu;
    private final Runnable wak;
    private lnr wc;
    private tvp wd;
    private com.bytedance.sdk.component.adexpress.ud.to.qdl xi;
    long xmv;
    private final Runnable yh;
    boolean yt;
    private com.bytedance.sdk.component.adexpress.ud.jtx zlt;
    private float zy;

    public aaj(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, AdSlot adSlot, String str) {
        super(context);
        this.qdl = true;
        this.ud = 0;
        this.to = "embeded_ad";
        this.jpc = null;
        this.bjy = false;
        this.yt = true;
        this.jl = -1;
        this.ekw = "";
        this.oth = false;
        this.gy = true;
        this.ljh = -1;
        this.uw = new com.bytedance.sdk.openadsdk.mml.wd();
        this.xmv = 0L;
        this.ag = new AtomicBoolean(false);
        this.om = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.tvp.aaj.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                aaj aajVar = aaj.this;
                if (aajVar.yt && aajVar.tvp()) {
                    aaj.this.bqt();
                    aaj aajVar2 = aaj.this;
                    aajVar2.removeCallbacks(aajVar2.cx);
                    aaj aajVar3 = aaj.this;
                    aajVar3.postDelayed(aajVar3.cx, 500L);
                }
            }
        };
        this.cx = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.aaj.2
            @Override // java.lang.Runnable
            public void run() {
                if (!hzv.qdl(aaj.this, 0, 5, false)) {
                    aaj.this.mo(8);
                } else {
                    aaj aajVar = aaj.this;
                    aajVar.mo(aajVar.getVisibility());
                }
            }
        };
        this.yh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.aaj.3
            @Override // java.lang.Runnable
            public void run() {
                aaj.this.mo(0);
            }
        };
        this.wak = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.aaj.4
            @Override // java.lang.Runnable
            public void run() {
                aaj.this.mo(8);
            }
        };
        this.lte = 8;
        this.dk = new SparseArray<>();
        this.ijp = -1.0f;
        this.zy = -1.0f;
        this.en = -1.0f;
        this.nz = -1.0f;
        this.kab = 0L;
        this.to = str;
        this.tvp = context;
        this.fs = ljhVar;
        this.rq = adSlot;
        this.oth = false;
        wd();
    }

    private void bjy() {
        if (this.fs.vz() == 1 && this.fs.uj()) {
            yt();
            this.xi = new com.bytedance.sdk.component.adexpress.ud.fs(this.jjk, this.car);
            return;
        }
        if (kdv()) {
            jtx();
            return;
        }
        try {
            uw();
            bch bchVar = new bch(this.tvp, this.mlb, this.gt, this.kdv, this.fs);
            this.irn = bchVar;
            com.bytedance.sdk.component.adexpress.ud.jtx jtxVar = new com.bytedance.sdk.component.adexpress.ud.jtx(this.tvp, this.mlb, bchVar, this);
            this.zlt = jtxVar;
            this.jjk.add(jtxVar);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.aaj.qdl("NativeExpressView", "NativeExpressView dynamicRender fail", e2);
        }
        yt();
        this.xi = new com.bytedance.sdk.component.adexpress.ud.fs(this.jjk, this.car);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bqt() {
        if (this.ag.get()) {
            this.uw.qdl(System.currentTimeMillis(), hzv.qdl(this));
        }
    }

    private void exu() {
        com.bytedance.sdk.openadsdk.core.model.ljh.qdl qdlVarXdk = this.fs.xdk();
        if (!TextUtils.equals(this.to, "embeded_ad") || qdlVarXdk == null) {
            return;
        }
        String str = qdlVarXdk.to();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            if (iOptInt == 0 || iOptInt2 == 0) {
                return;
            }
            this.rc = iOptInt2;
            this.vu = iOptInt;
        } catch (Exception unused) {
        }
    }

    private void jtx() {
        this.ud = this.fs.ra();
        try {
            uw();
            xmv();
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.aaj.qdl("NativeExpressView", "NativeExpressView dynamicRender fail", e2);
        }
        boolean z2 = this.fs.qk() == 1;
        this.qdl = z2;
        if (z2) {
            yt();
        }
        Objects.toString(this.jjk);
        this.xi = new com.bytedance.sdk.component.adexpress.ud.fs(this.jjk, this.car);
    }

    private boolean kdv() {
        return TextUtils.equals(this.to, "fullscreen_interstitial_ad") || TextUtils.equals(this.to, "rewarded_video") || TextUtils.equals("open_ad", this.to) || bch.ud(this.to) || TextUtils.equals(this.to, "embeded_ad");
    }

    private boolean koa() {
        return com.bytedance.sdk.openadsdk.core.model.ljh.mzz(this.fs);
    }

    private void rc() {
        List<com.bytedance.sdk.component.adexpress.ud.to> list = this.jjk;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.ud.to> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    private void rdp() {
        long jOptLong;
        boolean z2;
        com.bytedance.sdk.component.adexpress.ud.exu.qdl qdlVar;
        com.bytedance.sdk.openadsdk.mml.jl jlVar = new com.bytedance.sdk.openadsdk.mml.jl(1, this.to, this.fs);
        this.kdv = jlVar;
        this.car = new exu(jlVar, this.to, this.fs, this.jpc, this.hzv);
        final boolean zDps = this.fs.dps();
        try {
            com.bytedance.sdk.openadsdk.core.model.ljh.qdl qdlVarXdk = this.fs.xdk();
            if (qdlVarXdk != null) {
                String strTvp = qdlVarXdk.tvp();
                if (TextUtils.isEmpty(strTvp)) {
                    jOptLong = 0;
                } else {
                    jOptLong = new JSONObject(strTvp).optLong("render_delay_time");
                }
            } else {
                jOptLong = 0;
            }
        } catch (Exception unused) {
        }
        try {
            z2 = !com.bytedance.sdk.openadsdk.core.model.ljh.mzz(this.fs) && com.bytedance.sdk.openadsdk.core.yt.mml().exu(this.jpc) == 1;
            try {
                if (!com.bytedance.sdk.openadsdk.core.settings.rq.lnr().rdp(this.jpc) || this.fs.taz() == 5 || this.fs.taz() == 6 || this.fs.ok() == 3) {
                    z2 = true;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            z2 = false;
        }
        long jMin = Math.min(Math.max(jOptLong, 0L), 10000L);
        int renderTimeout = getRenderTimeout();
        double dMo = this.fs.tdy() != null ? this.fs.tdy().mo() * ((double) this.fs.tdy().oth()) : 0.0d;
        int i2 = this.ljh;
        this.bch = i2 != -1 && i2 < ((int) dMo);
        if (com.bytedance.sdk.openadsdk.core.rq.mml.qdl(this.fs) || com.bytedance.sdk.openadsdk.core.rq.mml.ud(this.fs) || com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml.qdl(this.to)) {
            com.bytedance.sdk.openadsdk.core.rq.mo.qdl.C0125qdl c0125qdl = new com.bytedance.sdk.openadsdk.core.rq.mo.qdl.C0125qdl();
            if (com.bytedance.sdk.openadsdk.core.rq.mml.qdl(this.fs)) {
                c0125qdl.qdl(com.bytedance.sdk.openadsdk.core.rq.mml.qdl(this.fs, this.to));
            }
            c0125qdl.qdl((com.bytedance.adsdk.ugeno.core.jl) this.car);
            c0125qdl.qdl(this.vu);
            c0125qdl.ud(this.rc);
            c0125qdl.mo(this.hzv);
            qdlVar = c0125qdl;
        } else {
            qdlVar = new com.bytedance.sdk.component.adexpress.ud.exu.qdl();
        }
        qdlVar.mzz(zDps);
        qdlVar.qdl(this.to).ud(this.fs.yre()).lnr(this.fs.htl()).mml(this.fs.ir()).qdl(this.car).mml(this.fs.fpw()).qdl(renderTimeout).ud(this.fs.tvf()).lnr(this.gy).ud(this.fs.fzn()).qdl(jMin).lnr(this.fs.ygv()).qdl(com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.ud(this.fs)).mml(z2).mzz(this.ljh).qdl(this.bch).qdl(dMo).mo(com.bytedance.sdk.openadsdk.core.settings.rq.lnr().oth()).mo(com.bytedance.sdk.openadsdk.jyq.qdl.qdl("inject_data_reuse_open", 0)).wd(this.fs.rjh().qdl()).jpc(this.fs.rjh().ud()).qdl(new com.bytedance.sdk.component.adexpress.ud.mzz() { // from class: com.bytedance.sdk.openadsdk.core.tvp.aaj.5
            @Override // com.bytedance.sdk.component.adexpress.ud.mzz
            public JSONObject qdl() {
                try {
                    aaj aajVar = aaj.this;
                    com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = aajVar.fs;
                    if (ljhVar == null) {
                        aajVar.ekw = "material is null";
                        return null;
                    }
                    if (zDps) {
                        aajVar.ax = new oth();
                        float f = aaj.this.vu;
                        float f2 = aaj.this.rc;
                        aaj aajVar2 = aaj.this;
                        JSONObject jSONObjectQdl = com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl(f, f2, aajVar2.bjy, aajVar2.fs, aajVar2.to, aajVar2.ax);
                        aaj.this.ekw = com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl();
                        return jSONObjectQdl;
                    }
                    if (!com.bytedance.sdk.openadsdk.core.rq.mml.qdl(ljhVar)) {
                        float f3 = aaj.this.vu;
                        float f4 = aaj.this.rc;
                        aaj aajVar3 = aaj.this;
                        JSONObject jSONObjectQdl2 = com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl(f3, f4, aajVar3.bjy, aajVar3.fs);
                        aaj.this.lnr(jSONObjectQdl2);
                        return jSONObjectQdl2;
                    }
                    aaj.this.ax = new oth();
                    aaj aajVar4 = aaj.this;
                    JSONObject jSONObjectQdl3 = com.bytedance.sdk.openadsdk.core.rq.mml.qdl(aajVar4.fs, aajVar4.ax);
                    aaj.this.ekw = com.bytedance.sdk.openadsdk.core.rq.mml.qdl();
                    return jSONObjectQdl3;
                } catch (Throwable unused4) {
                    return null;
                }
            }
        });
        qdl(qdlVar);
        this.mlb = qdlVar.qdl();
    }

    private void uw() {
        if (com.bytedance.sdk.openadsdk.core.rdp.mzz()) {
            return;
        }
        fs.qdl();
    }

    private void vu() {
        List<com.bytedance.sdk.component.adexpress.ud.to> list = this.jjk;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.ud.to> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void xmv() {
        aaj aajVar;
        com.bytedance.sdk.openadsdk.core.rq.mo.mml mmlVar;
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar;
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar2 = this.fs;
        if (ljhVar2 == null || ljhVar2.vz() != 1 || this.fs.dk() == 2) {
            if (!com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml.qdl(this.to) || (ljhVar = this.fs) == null || ljhVar.dk() == 2) {
                com.bytedance.sdk.openadsdk.core.wd.qdl.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.wd.qdl.qdl();
                int i2 = this.ud;
                if (i2 != 0) {
                    if (i2 == 3) {
                        com.bytedance.sdk.component.adexpress.dynamic.mzz.wd wdVar = new com.bytedance.sdk.component.adexpress.dynamic.mzz.wd();
                        Context applicationContext = this.tvp.getApplicationContext();
                        com.bytedance.sdk.component.adexpress.ud.exu exuVar = this.mlb;
                        ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.gt;
                        boolean z2 = this.oth;
                        com.bytedance.sdk.component.adexpress.ud.ud udVar = new com.bytedance.sdk.component.adexpress.ud.ud(applicationContext, exuVar, themeStatusBroadcastReceiver, z2, wdVar, this, qdlVar, new mo(this.tvp, themeStatusBroadcastReceiver, z2, wdVar, exuVar, qdlVar));
                        this.bqt = udVar;
                        this.jjk.add(udVar);
                        return;
                    }
                    if (i2 == 7) {
                        com.bytedance.sdk.openadsdk.core.rq.mo.mml mmlVar2 = new com.bytedance.sdk.openadsdk.core.rq.mo.mml(this.tvp, this.fs, this.oth, (com.bytedance.sdk.openadsdk.core.rq.mo.qdl) this.mlb, this);
                        this.sy = mmlVar2;
                        com.bytedance.sdk.openadsdk.core.rq.ud.wd wdVar2 = new com.bytedance.sdk.openadsdk.core.rq.ud.wd(this.tvp, mmlVar2, this, this.mlb);
                        this.tid = wdVar2;
                        wdVar2.qdl(this);
                        this.jjk.add(this.tid);
                        return;
                    }
                    if (i2 != 9) {
                        if (i2 != 10) {
                            return;
                        }
                        if (!this.hzv || (mmlVar = this.sy) == null) {
                            aajVar = this;
                            aajVar.sy = new com.bytedance.sdk.openadsdk.core.rq.mo.wd(this.tvp, this.fs, this.oth, (com.bytedance.sdk.openadsdk.core.rq.mo.qdl) this.mlb, this);
                        } else {
                            mmlVar.qdl(this.fs, this.oth, (com.bytedance.sdk.openadsdk.core.rq.mo.qdl) this.mlb, this);
                            aajVar = this;
                        }
                        com.bytedance.sdk.openadsdk.core.rq.ud.wd wdVar3 = new com.bytedance.sdk.openadsdk.core.rq.ud.wd(aajVar.tvp, aajVar.sy, this, aajVar.mlb);
                        aajVar.tid = wdVar3;
                        wdVar3.qdl(this);
                        aajVar.jjk.add(aajVar.tid);
                        return;
                    }
                }
                bch bchVar = new bch(this.tvp, this.mlb, this.gt, this.kdv, this.fs);
                this.irn = bchVar;
                com.bytedance.sdk.component.adexpress.ud.jtx jtxVar = new com.bytedance.sdk.component.adexpress.ud.jtx(this.tvp, this.mlb, bchVar, this);
                this.zlt = jtxVar;
                this.jjk.add(jtxVar);
            }
        }
    }

    private void yt() {
        if (com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml.qdl(this.to)) {
            com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml mmlVar = new com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml(this.tvp, this.fs, this.oth, (com.bytedance.sdk.openadsdk.core.rq.mo.qdl) this.mlb, this, this.vu, this.rc, this.bjy, this.to);
            com.bytedance.sdk.openadsdk.core.rq.ud.wd wdVar = new com.bytedance.sdk.openadsdk.core.rq.ud.wd(this.tvp, mmlVar, this, this.mlb);
            mmlVar.qdl((bjy) this);
            this.jjk.add(wdVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.ud.mo moVar = new com.bytedance.sdk.component.adexpress.ud.mo(this.tvp, this.mlb, new jyq(this, this.gt, this.mlb));
        this.taz = moVar;
        this.jjk.add(moVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.bjy
    public void a_(int i2) {
        com.bytedance.sdk.component.adexpress.ud.tvp tvpVar = this.car;
        if (tvpVar != null) {
            if (!this.qdl) {
                tvpVar.jpc();
            }
            this.car.tvp();
            ((exu) this.car).rq();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.mzz;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.jpc.qdl(i2), i2);
        }
        oth othVar = this.ax;
        if (othVar != null) {
            othVar.qdl(this.fs, this.to);
        }
    }

    public void aaj() {
        try {
            FrameLayout frameLayout = this.exu;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.exu);
        } catch (Throwable unused) {
        }
    }

    public void bch() {
        com.bytedance.sdk.openadsdk.core.rq.lnr.ud udVar = new com.bytedance.sdk.openadsdk.core.rq.lnr.ud(this.tvp, this.fs);
        this.hkc = udVar;
        udVar.qdl(this);
        this.hkc.qdl(new com.bytedance.sdk.openadsdk.core.rq.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.core.tvp.aaj.7
            @Override // com.bytedance.sdk.openadsdk.core.rq.lnr.qdl
            public void qdl(View view, int i2, com.bytedance.sdk.component.adexpress.lnr lnrVar) {
                qdl(view, i2, lnrVar);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i2;
        SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray;
        jpc jpcVar = this.mo;
        int i3 = 0;
        if (jpcVar != null) {
            jpcVar.ud(motionEvent.getDeviceId());
            this.mo.qdl(motionEvent.getSource());
            this.mo.lnr(motionEvent.getToolType(0));
        }
        tvp tvpVar = this.wd;
        if (tvpVar != null) {
            tvpVar.ud(motionEvent.getDeviceId());
            this.wd.qdl(motionEvent.getSource());
            this.wd.lnr(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            i3 = 3;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    i3 = actionMasked != 3 ? -1 : 4;
                } else {
                    this.en = Math.abs(motionEvent.getX() - this.ijp) + this.en;
                    this.nz = Math.abs(motionEvent.getY() - this.zy) + this.nz;
                    this.ijp = motionEvent.getX();
                    this.zy = motionEvent.getY();
                    i2 = (System.currentTimeMillis() - this.kab <= 200 || (this.en <= 8.0f && this.nz <= 8.0f)) ? 2 : 1;
                }
            }
            sparseArray = this.dk;
            if (sparseArray != null) {
                sparseArray.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl(i2, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        this.ijp = motionEvent.getRawX();
        this.zy = motionEvent.getRawY();
        this.kab = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.to.lnr.qdl(motionEvent);
        i2 = i3;
        sparseArray = this.dk;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl(i2, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void exc() {
        if (this.fs == null) {
            return;
        }
        this.xmv = SystemClock.elapsedRealtime();
        if (this.fs.vxm()) {
            lnr lnrVar = this.wc;
            if (lnrVar == null) {
                a_(106);
                return;
            } else {
                lnrVar.qdl((com.bytedance.sdk.component.adexpress.ud.bjy) this);
                this.wc.qdl();
                return;
            }
        }
        this.kdv.qdl();
        com.bytedance.sdk.component.adexpress.ud.to.qdl qdlVar = this.xi;
        if (qdlVar != null) {
            qdlVar.qdl(this);
        }
        try {
            this.xi.qdl();
        } catch (Throwable unused) {
        }
    }

    public void fs() {
        try {
            lnr lnrVar = this.wc;
            if (lnrVar != null) {
                lnrVar.ud();
            }
            oth();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.ud.to> list = this.jjk;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.ud.to> it = list.iterator();
                while (it.hasNext()) {
                    it.next().qdl();
                }
            }
            com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.fs);
            com.bytedance.sdk.openadsdk.bch.qdl.lnr.ud(this.fs);
            this.lnr = null;
            this.mml = null;
            this.rq = null;
            this.fs = null;
            this.mzz = null;
            this.mo = null;
            this.jtx = null;
            this.wd = null;
            com.bytedance.sdk.openadsdk.core.rq.lnr.ud udVar = this.hkc;
            if (udVar != null) {
                udVar.mml();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.qdl("NativeExpressView", "detach error", th);
        }
    }

    public com.bytedance.sdk.openadsdk.mml.wd getAdShowTime() {
        return this.uw;
    }

    public lnr getBrandBannerController() {
        return this.wc;
    }

    public jpc getClickCreativeListener() {
        return this.mo;
    }

    public tvp getClickListener() {
        return this.wd;
    }

    public String getClosedListenerKey() {
        return this.fco;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar != null) {
            return mmlVar.lnr();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.rc).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.vu).intValue();
    }

    public hkc getJsObject() {
        bch bchVar = this.irn;
        if (bchVar != null) {
            return bchVar.jtx();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        to toVarBjy;
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (!(mmlVar instanceof bch) || (toVarBjy = ((bch) mmlVar).bjy()) == null) {
            return 0;
        }
        return toVarBjy.qdl();
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.yt.mml().fco();
    }

    public String getUgenTemplateErrorReason() {
        return this.ekw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl.InterfaceC0118qdl
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.mml.tvp tvpVar = this.ra;
        if (tvpVar != null) {
            return tvpVar.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.tvp.mo getWebView() {
        bch bchVar = this.irn;
        if (bchVar == null) {
            return null;
        }
        return bchVar.qdl();
    }

    public void jl() {
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar instanceof bch) {
            if (mmlVar == null) {
                return;
            }
            ((bch) mmlVar).jpc();
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.fs;
            com.bytedance.sdk.component.utils.tvp.ud().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.aaj.6
                @Override // java.lang.Runnable
                public void run() {
                    aaj.this.mzz(1);
                }
            }, ((long) (ljhVar != null ? ljhVar.oth().mml() : 5)) * 1000);
        } else if (mmlVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.wd) {
            ((com.bytedance.sdk.openadsdk.core.rq.mo.wd) mmlVar).rq();
        }
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar2 = this.fs;
        if (ljhVar2 != null && (mmlVarZm = ljhVar2.zm()) != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
            mmlVarQdl.qdl(0L);
        }
        if ((this.koa instanceof com.bytedance.sdk.openadsdk.core.rq.mo.wd) && com.bytedance.sdk.openadsdk.core.model.yt.qdl(this.fs)) {
            qdl(this.koa);
        }
    }

    public boolean jpc() {
        return true;
    }

    public boolean jyq() {
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        return mmlVar != null && (mmlVar instanceof jyq);
    }

    public boolean ljh() {
        return this.ag.get();
    }

    public long lnr() {
        return 0L;
    }

    public long mml() {
        return 0L;
    }

    public void mo() {
    }

    public int mzz() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bqt();
        vu();
        getViewTreeObserver().addOnScrollChangedListener(this.om);
        com.bytedance.sdk.openadsdk.core.tvp.ud().qdl(this.fco, this.mrf);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.om);
        com.bytedance.sdk.openadsdk.core.tvp.ud().mo(this.fco);
        rc();
        qdl(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        bqt();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z2 ? getVisibility() : 8);
        }
        bqt();
        com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(this.fs, z2);
        if (z2) {
            com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.fs, 4);
        } else {
            com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.fs, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        qdl(i2, true, false);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mml
    public void onvideoComplate() {
    }

    public void oth() {
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.fs;
        if (ljhVar == null || (mmlVarZm = ljhVar.zm()) == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
            return;
        }
        mmlVarQdl.mzz(getVideoProgress());
    }

    public void qdl() {
    }

    public void rq() {
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.ud.lnr lnrVar) {
        this.jtx = lnrVar;
        com.bytedance.sdk.component.adexpress.ud.mo moVar = this.taz;
        if (moVar != null) {
            moVar.qdl(lnrVar);
        }
    }

    public void setBannerClickClosedListener(com.bytedance.sdk.openadsdk.core.mml.wd.qdl qdlVar) {
        this.mrf = qdlVar;
    }

    public void setClickCreativeListener(jpc jpcVar) {
        this.mo = jpcVar;
        if (jpcVar != null) {
            jpcVar.qdl((com.bytedance.sdk.openadsdk.core.lnr.qdl.InterfaceC0118qdl) this);
        }
    }

    public void setClickListener(tvp tvpVar) {
        this.wd = tvpVar;
    }

    public void setClosedListenerKey(String str) {
        this.fco = str;
        lnr lnrVar = this.wc;
        if (lnrVar != null) {
            lnrVar.qdl(str);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.lnr.lnr lnrVar) {
        qdl qdlVar;
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar != null && (mmlVar instanceof jyq) && (qdlVar = (qdl) mmlVar.mzz()) != null) {
            qdlVar.setDislikeInner(lnrVar);
        }
        lnr lnrVar2 = this.wc;
        if (lnrVar2 != null) {
            lnrVar2.qdl(lnrVar);
        }
        this.lnr = lnrVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.mzz = pAGExpressAdWrapperListener;
        lnr lnrVar = this.wc;
        if (lnrVar != null) {
            lnrVar.qdl(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.mzz mzzVar) {
        if (this.irn != null && getJsObject() != null) {
            getJsObject().qdl(mzzVar);
        }
        com.bytedance.sdk.openadsdk.core.rq.mo.mml mmlVar = this.sy;
        if (mmlVar != null) {
            mmlVar.qdl(mzzVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        qdl qdlVar;
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar != null && (mmlVar instanceof jyq) && (qdlVar = (qdl) mmlVar.mzz()) != null) {
            qdlVar.setDislikeOuter(tTDislikeDialogAbstract);
        }
        lnr lnrVar = this.wc;
        if (lnrVar != null) {
            lnrVar.qdl(tTDislikeDialogAbstract);
        }
        this.mml = tTDislikeDialogAbstract;
    }

    public void setSoundMute(boolean z2) {
        this.oth = z2;
        com.bytedance.sdk.component.adexpress.ud.ud udVar = this.bqt;
        if (udVar != null && udVar.ud() != null) {
            this.bqt.ud().setSoundMute(z2);
        }
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml) {
            ((com.bytedance.sdk.openadsdk.core.rq.mo.mml) mmlVar).setSoundMute(z2);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setTime(CharSequence charSequence, int i2, int i3, boolean z2) {
        try {
            int i4 = Integer.parseInt(String.valueOf(charSequence));
            ud(i4, i2);
            com.bytedance.sdk.openadsdk.core.rq.lnr.ud udVar = this.hkc;
            if (udVar != null) {
                udVar.qdl(i4);
            }
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setTimeUpdate(int i2) {
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.mml.tvp tvpVar) {
        this.ra = tvpVar;
    }

    public void setVideoBusiness(com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        bch bchVar = this.irn;
        if (bchVar != null) {
            bchVar.qdl(udVar);
        }
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.fs.wd wdVar) {
        if (this.irn == null || getJsObject() == null) {
            return;
        }
        getJsObject().qdl(wdVar);
    }

    public void to() {
        bch bchVar = this.irn;
        if (bchVar == null || bchVar.mzz() == null) {
            return;
        }
        this.irn.mo();
    }

    public boolean tvp() {
        return true;
    }

    public void ud() {
    }

    public void wd() {
        this.aaj = new HashSet<>();
        this.gt = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.rq;
        if (adSlot != null) {
            this.vu = adSlot.getExpressViewAcceptedWidth();
            this.rc = this.rq.getExpressViewAcceptedHeight();
            exu();
            this.jpc = this.rq.getCodeId();
            if (TextUtils.equals(this.to, "fullscreen_interstitial_ad")) {
                this.ljh = this.fs.ws();
            } else if (TextUtils.equals(this.to, "rewarded_video")) {
                this.ljh = this.fs.qg();
            } else if (TextUtils.equals(this.to, "open_ad")) {
                com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.fs;
                if (ljhVar == null || ljhVar.ud() < 0) {
                    this.ljh = com.bytedance.sdk.openadsdk.core.yt.mml().oth(this.jpc);
                } else {
                    this.ljh = this.fs.ud();
                }
                if (this.ljh < 0) {
                    this.ljh = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.fs.vxm()) {
            this.wc = new lnr(this.tvp, this, this.fs, this.to);
            return;
        }
        rdp();
        this.jjk = new ArrayList();
        bjy();
        com.bytedance.sdk.component.adexpress.ud.jtx jtxVar = this.zlt;
        if (jtxVar != null) {
            this.irn = (bch) jtxVar.ud();
        }
        hkc jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.mo(this.to);
        }
    }

    public void lnr(JSONObject jSONObject) {
    }

    public void mo(int i2) {
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar == null || !(mmlVar instanceof bch)) {
            return;
        }
        ((bch) mmlVar).qdl(i2);
        this.lte = i2;
    }

    public void qdl(int i2) {
    }

    public void ud(int i2) {
    }

    public void mzz(int i2) {
        if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(this.fs)) {
            com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
            if (mmlVar instanceof bch) {
                ((bch) mmlVar).ud(i2);
            }
        }
    }

    public void qdl(int i2, com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
    }

    public boolean ud(com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
        return true;
    }

    public com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl lnr(int i2) {
        return new com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(i2);
    }

    public void qdl(int i2, String str) {
    }

    public boolean ud(JSONObject jSONObject) {
        return false;
    }

    public void qdl(com.bytedance.sdk.component.adexpress.ud.exu.qdl qdlVar) {
    }

    public void qdl(String str, JSONObject jSONObject) {
    }

    public void ud(int i2, int i3) {
        int iMin;
        if (TextUtils.equals(this.to, "banner_ad")) {
            return;
        }
        int i4 = this.ljh;
        int i5 = ((i3 < i4 || i4 < 0 || !(this.bch || TextUtils.equals(this.to, "open_ad"))) && !((i2 == 0 && TextUtils.equals(this.to, "open_ad")) || mzz() == 5)) ? 0 : 1;
        if (i3 <= this.ljh) {
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.fs;
            if (ljhVar != null && ljhVar.tdy() != null) {
                iMin = (int) (Math.min(this.ljh, this.fs.tdy().mo() * ((double) this.fs.tdy().oth())) - ((double) i3));
            } else {
                iMin = this.ljh - i3;
            }
        } else {
            iMin = 0;
        }
        com.bytedance.sdk.component.adexpress.ud.ud udVar = this.bqt;
        if (udVar != null && udVar.ud() != null) {
            this.bqt.ud().setTime(String.valueOf(i2), i5, iMin, false);
        }
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml) {
            ((com.bytedance.sdk.openadsdk.core.rq.mo.mml) mmlVar).setTime(String.valueOf(i2), i5, iMin, false);
        }
    }

    public void qdl(boolean z2, String str) {
    }

    public boolean qdl(JSONObject jSONObject) {
        return false;
    }

    public void qdl(int i2, boolean z2, boolean z3) {
        this.yt = z2;
        removeCallbacks(this.wak);
        removeCallbacks(this.yh);
        if (i2 == 0) {
            if (z3) {
                this.yh.run();
                return;
            } else {
                postDelayed(this.yh, 50L);
                return;
            }
        }
        if (z3) {
            this.wak.run();
        } else {
            postDelayed(this.wak, 50L);
        }
    }

    public void ud(int i2, String str) {
        hkc hkcVarJtx;
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar == null || !(mmlVar instanceof bch) || (hkcVarJtx = ((bch) mmlVar).jtx()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i2);
            jSONObject.put("flag", str);
            hkcVarJtx.qdl("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void qdl(View view, int i2, com.bytedance.sdk.component.adexpress.lnr lnrVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.component.utils.aaj.qdl("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i2));
        if (i2 == -1 || lnrVar == null) {
            return;
        }
        HashMap map = new HashMap();
        if (vu.lnr(this.fs)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.jtx jtxVar = (com.bytedance.sdk.openadsdk.core.model.jtx) lnrVar;
        if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(this.fs)) {
            try {
                JSONObject jSONObject2 = jtxVar.exu;
                if (jSONObject2 != null) {
                    int iOptInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", iOptInt);
                    map.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.lnr(th.toString(), new Object[0]);
            }
        }
        jpc jpcVar = this.mo;
        if (jpcVar != null) {
            jpcVar.mml(getDynamicShowType());
            this.mo.qdl(map);
        }
        tvp tvpVar = this.wd;
        if (tvpVar != null) {
            tvpVar.mml(getDynamicShowType());
            this.wd.qdl(map);
        }
        float f = jtxVar.qdl;
        float f2 = jtxVar.ud;
        float f3 = jtxVar.lnr;
        float f4 = jtxVar.mml;
        boolean z2 = jtxVar.rq;
        SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray = jtxVar.to;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.dk;
        }
        SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray2 = sparseArray;
        String str = jtxVar.wd;
        JSONObject jSONObjectQdl = null;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectQdl = view != this ? qdl(view) : null;
            view2 = view;
        }
        jtxVar.jpc = i2;
        if (jSONObjectQdl != null && jtxVar.tvp == null) {
            jtxVar.tvp = jSONObjectQdl;
        }
        if (i2 != 13) {
            switch (i2) {
                case 1:
                    FrameLayout frameLayout = this.exu;
                    if (frameLayout != null) {
                        frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.fs;
                    if (ljhVar == null || ljhVar.sy() != 1 || z2) {
                        tvp tvpVar2 = this.wd;
                        if (tvpVar2 != null) {
                            tvpVar2.qdl(jtxVar);
                            this.wd.qdl(str);
                            this.wd.qdl(view2, f, f2, f3, f4, sparseArray2, z2);
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.mzz;
                        if (pAGExpressAdWrapperListener != null && !jtxVar.rdp) {
                            pAGExpressAdWrapperListener.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (jtxVar.fs > 0) {
                        fco.qdl(true);
                    }
                    jpc jpcVar2 = this.mo;
                    if (jpcVar2 != null) {
                        jpcVar2.qdl(jtxVar);
                        this.mo.qdl(str);
                        if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(this.fs) && (jSONObject = jtxVar.exu) != null) {
                            this.mo.mml(jSONObject.optBoolean("is_ceiling_page", false));
                        }
                        this.mo.qdl(view2, f, f2, f3, f4, sparseArray2, z2);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.mzz;
                    if (pAGExpressAdWrapperListener2 != null && !jtxVar.rdp) {
                        pAGExpressAdWrapperListener2.onAdClicked();
                    }
                    fco.qdl(false);
                    com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.fs, 9);
                    break;
                case 3:
                    TTDislikeDialogAbstract tTDislikeDialogAbstract = this.mml;
                    if (tTDislikeDialogAbstract != null) {
                        tTDislikeDialogAbstract.show();
                    } else {
                        com.bytedance.sdk.openadsdk.lnr.lnr lnrVar2 = this.lnr;
                        if (lnrVar2 != null) {
                            lnrVar2.qdl();
                        } else {
                            TTDelegateActivity.qdl(this.fs, this.fco);
                        }
                    }
                    break;
                case 4:
                    FrameLayout frameLayout2 = this.exu;
                    if (frameLayout2 != null) {
                        frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.ljh ljhVar2 = this.fs;
                    if (ljhVar2 == null || ljhVar2.sy() != 1 || z2) {
                        gy.lnr(this.fs);
                        if ("embeded_ad".equals(this.to) && koa() && !this.rdp && gy.lnr(this.fs)) {
                            jpc jpcVar3 = this.mo;
                            if (jpcVar3 != null) {
                                jpcVar3.qdl(jtxVar);
                                this.mo.qdl(str);
                                this.mo.qdl(view2, f, f2, f3, f4, sparseArray2, z2);
                            }
                        } else {
                            tvp tvpVar3 = this.wd;
                            if (tvpVar3 != null) {
                                tvpVar3.qdl(jtxVar);
                                this.wd.qdl(str);
                                this.wd.qdl(view2, f, f2, f3, f4, sparseArray2, z2);
                            }
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.mzz;
                        if (pAGExpressAdWrapperListener3 != null && !jtxVar.rdp) {
                            pAGExpressAdWrapperListener3.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 5:
                    qdl(!this.oth, "dynamicClick");
                    break;
                case 6:
                    qdl();
                    break;
                case 7:
                    TTWebsiteActivity.qdl(this.tvp, this.fs, this.to);
                    break;
            }
            return;
        }
        int i3 = jtxVar.bjy;
        if (i3 >= 0) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("switch", i3);
                qdl(jSONObject4);
            } catch (Throwable unused) {
            }
        }
    }

    public void wd(int i2) {
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if ((mmlVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.wd) && i2 == 4) {
            ((com.bytedance.sdk.openadsdk.core.rq.mo.wd) mmlVar).to();
        }
    }

    public aaj(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, AdSlot adSlot, String str, boolean z2, boolean z3) {
        super(context);
        this.qdl = true;
        this.ud = 0;
        this.to = "embeded_ad";
        this.jpc = null;
        this.bjy = false;
        this.yt = true;
        this.jl = -1;
        this.ekw = "";
        this.oth = false;
        this.gy = true;
        this.ljh = -1;
        this.uw = new com.bytedance.sdk.openadsdk.mml.wd();
        this.xmv = 0L;
        this.ag = new AtomicBoolean(false);
        this.om = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.tvp.aaj.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                aaj aajVar = aaj.this;
                if (aajVar.yt && aajVar.tvp()) {
                    aaj.this.bqt();
                    aaj aajVar2 = aaj.this;
                    aajVar2.removeCallbacks(aajVar2.cx);
                    aaj aajVar3 = aaj.this;
                    aajVar3.postDelayed(aajVar3.cx, 500L);
                }
            }
        };
        this.cx = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.aaj.2
            @Override // java.lang.Runnable
            public void run() {
                if (!hzv.qdl(aaj.this, 0, 5, false)) {
                    aaj.this.mo(8);
                } else {
                    aaj aajVar = aaj.this;
                    aajVar.mo(aajVar.getVisibility());
                }
            }
        };
        this.yh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.aaj.3
            @Override // java.lang.Runnable
            public void run() {
                aaj.this.mo(0);
            }
        };
        this.wak = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.aaj.4
            @Override // java.lang.Runnable
            public void run() {
                aaj.this.mo(8);
            }
        };
        this.lte = 8;
        this.dk = new SparseArray<>();
        this.ijp = -1.0f;
        this.zy = -1.0f;
        this.en = -1.0f;
        this.nz = -1.0f;
        this.kab = 0L;
        this.to = str;
        this.tvp = context;
        this.fs = ljhVar;
        this.rq = adSlot;
        this.oth = z2;
        this.gy = z3;
        wd();
    }

    public static JSONObject qdl(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put(TtmlNode.LEFT, iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void qdl(com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar, com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar;
        this.ag.set(true);
        this.koa = mmlVar;
        mmlVar.lnr();
        if (this.lte != getWindowVisibility() && jpc()) {
            mo(getWindowVisibility());
        }
        if (mmlVar.lnr() == 3 && (ljhVar = this.fs) != null && ljhVar.taz() == 1) {
            this.fs.jpc(0);
        }
        if (mmlVar.lnr() != 1 || (mmlVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml)) {
            View viewMzz = mmlVar.mzz();
            if (viewMzz.getParent() != null) {
                ((ViewGroup) viewMzz.getParent()).removeView(viewMzz);
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                arrayList.add(getChildAt(i2));
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3) instanceof com.bytedance.sdk.component.tvp.mo) {
                    removeView((View) arrayList.get(i3));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(this.fs)) {
                addView(mmlVar.mzz(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(mmlVar.mzz());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar2 = this.fs;
        if (ljhVar2 != null) {
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl(ljhVar2.jpc(), this.xmv, this.to, mmlVar.lnr());
        }
        com.bytedance.sdk.component.adexpress.ud.tvp tvpVar = this.car;
        if (tvpVar != null) {
            ((exu) tvpVar).rq();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.mzz;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) rdpVar.lnr(), (float) rdpVar.mml());
        }
        if ((this.koa instanceof com.bytedance.sdk.openadsdk.core.rq.mo.wd) && com.bytedance.sdk.openadsdk.core.model.yt.qdl(this.fs)) {
            bch();
        }
        if (ud(rdpVar)) {
            com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this, this.fs, lnr(getDynamicShowType()));
        }
        oth othVar = this.ax;
        if (othVar != null) {
            othVar.qdl(this.fs, this.to);
        }
    }

    public JSONObject qdl(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (!(this.koa instanceof bch)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (ljhVar != null) {
                if (ljhVar.xdk() != null && ljhVar.xdk().fs()) {
                    jSONObject.put("engine_version", ljhVar.xdk().rq());
                } else if (ljhVar.kr() != null) {
                    jSONObject.put("engine_version", a.k);
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
            return jSONObject;
        } catch (Exception e2) {
            e2.getMessage();
            return jSONObject;
        }
    }

    public void qdl(com.bytedance.sdk.component.adexpress.ud.mml mmlVar) {
        if (this.hkc == null) {
            return;
        }
        try {
            if (mmlVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.wd) {
                ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.rq.mo.wd) mmlVar).mo().rq();
                this.jyq = viewGroup;
                if (viewGroup != null) {
                    this.hkc.ud();
                    View viewLnr = this.hkc.lnr();
                    if (viewLnr != null) {
                        ViewGroup viewGroup2 = (ViewGroup) viewLnr.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewLnr);
                        }
                        this.jyq.addView(viewLnr, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, AdSlot adSlot, String str, boolean z2, boolean z3) {
        if (ljhVar == null) {
            return;
        }
        this.to = str;
        this.fs = ljhVar;
        this.rq = adSlot;
        this.oth = z2;
        this.gy = z3;
        int iRa = ljhVar.ra();
        this.ud = iRa;
        if (iRa != 10) {
            return;
        }
        this.hzv = true;
        wd();
        exc();
        this.hzv = false;
    }
}
