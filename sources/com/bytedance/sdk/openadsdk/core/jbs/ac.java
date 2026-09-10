package com.bytedance.sdk.openadsdk.core.jbs;

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
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.ig;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.pv;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ac extends com.bytedance.sdk.openadsdk.core.di.ik implements com.bytedance.sdk.component.adexpress.dynamic.ka, com.bytedance.sdk.component.adexpress.lr.mj, com.bytedance.sdk.component.adexpress.lr.vr, com.bytedance.sdk.openadsdk.core.ik.ri.InterfaceC0250ri, vr {
    private final SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> aac;
    protected HashSet<String> ac;
    private long ajz;
    public FrameLayout aw;
    boolean ay;
    protected boolean bgr;
    private ay bnj;
    boolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.model.wjv f18122co;
    private mj di;
    private float dw;
    private boolean dzy;
    private final Runnable fe;
    private final ViewTreeObserver.OnScrollChangedListener feb;
    private PAGExpressAdWrapperListener fi;
    public com.bytedance.sdk.openadsdk.ka.xha fr;
    private com.bytedance.sdk.openadsdk.core.co.di.ka gcp;
    private com.bytedance.sdk.openadsdk.ka.ka.fi hcw;
    private com.bytedance.sdk.openadsdk.core.ka.xha.ri ig;
    protected com.bytedance.sdk.component.adexpress.lr.lr igq;
    protected ViewGroup ihz;
    private com.bytedance.sdk.openadsdk.ik.ik ik;
    protected final Context jbs;
    private final AtomicBoolean jc;
    private TTDislikeDialogAbstract ka;
    private ik kt;
    private int lr;
    private String mj;
    private com.bytedance.sdk.component.adexpress.lr.aw nd;
    protected int nr;
    private String oh;
    private float ory;
    private float pc;
    private String pv;
    private boolean qd;
    private com.bytedance.sdk.openadsdk.core.co.lr.xha qh;
    protected String qt;
    private boolean ri;
    private com.bytedance.sdk.component.adexpress.lr.di rzk;
    private float saa;
    protected AdSlot sf;
    private com.bytedance.sdk.component.adexpress.lr.qt.ri siy;
    protected com.bytedance.sdk.component.adexpress.lr.ik slm;
    private uq srn;
    long su;
    private ThemeStatusBroadcastReceiver ta;
    protected String tan;
    private final Runnable tnn;
    private com.bytedance.sdk.component.adexpress.lr.jbs tw;
    public boolean uq;
    protected boolean vr;
    private List<com.bytedance.sdk.component.adexpress.lr.qt> whw;
    int wjv;
    private com.bytedance.sdk.openadsdk.core.co.ik.lr xd;
    private float xe;
    private jbs xha;
    private com.bytedance.sdk.component.adexpress.lr.slm xm;
    private float yjm;
    private int zb;
    public com.bytedance.sdk.component.adexpress.lr.ka<? extends View> zf;
    private com.bytedance.sdk.openadsdk.core.ka.jbs zk;
    private final Runnable zyn;

    public ac(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, String str) {
        super(context);
        this.ri = true;
        this.lr = 0;
        this.qt = "embeded_ad";
        this.mj = null;
        this.vr = false;
        this.bu = true;
        this.nr = -1;
        this.oh = "";
        this.uq = false;
        this.qd = true;
        this.wjv = -1;
        this.fr = new com.bytedance.sdk.openadsdk.ka.xha();
        this.su = 0L;
        this.jc = new AtomicBoolean(false);
        this.feb = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                ac acVar = ac.this;
                if (acVar.bu && acVar.jbs()) {
                    ac.this.igq();
                    ac acVar2 = ac.this;
                    acVar2.removeCallbacks(acVar2.zyn);
                    ac acVar3 = ac.this;
                    acVar3.postDelayed(acVar3.zyn, 500L);
                }
            }
        };
        this.zyn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.2
            @Override // java.lang.Runnable
            public void run() {
                if (!pv.ri(ac.this, 0, 5, false)) {
                    ac.this.di(8);
                } else {
                    ac acVar = ac.this;
                    acVar.di(acVar.getVisibility());
                }
            }
        };
        this.tnn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.3
            @Override // java.lang.Runnable
            public void run() {
                ac.this.di(0);
            }
        };
        this.fe = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.4
            @Override // java.lang.Runnable
            public void run() {
                ac.this.di(8);
            }
        };
        this.zb = 8;
        this.aac = new SparseArray<>();
        this.xe = -1.0f;
        this.yjm = -1.0f;
        this.saa = -1.0f;
        this.pc = -1.0f;
        this.ajz = 0L;
        this.qt = str;
        this.jbs = context;
        this.f18122co = wjvVar;
        this.sf = adSlot;
        this.uq = false;
        xha();
    }

    private void aw() {
        com.bytedance.sdk.openadsdk.core.model.wjv.ri riVarSez = this.f18122co.sez();
        if (!TextUtils.equals(this.qt, "embeded_ad") || riVarSez == null) {
            return;
        }
        String strQt = riVarSez.qt();
        if (TextUtils.isEmpty(strQt)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strQt);
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            if (iOptInt == 0 || iOptInt2 == 0) {
                return;
            }
            this.ory = iOptInt2;
            this.dw = iOptInt;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    private void bgr() {
        long jOptLong;
        boolean z;
        com.bytedance.sdk.component.adexpress.lr.aw.ri riVar;
        com.bytedance.sdk.openadsdk.ka.tan tanVar = new com.bytedance.sdk.openadsdk.ka.tan(1, this.qt, this.f18122co);
        this.hcw = tanVar;
        this.tw = new aw(tanVar, this.qt, this.f18122co, this.mj, this.dzy);
        final boolean zNbc = this.f18122co.nbc();
        try {
            com.bytedance.sdk.openadsdk.core.model.wjv.ri riVarSez = this.f18122co.sez();
            if (riVarSez != null) {
                String strJbs = riVarSez.jbs();
                if (TextUtils.isEmpty(strJbs)) {
                    jOptLong = 0;
                } else {
                    jOptLong = new JSONObject(strJbs).optLong("render_delay_time");
                }
            } else {
                jOptLong = 0;
            }
        } catch (Exception unused) {
        }
        try {
            z = !com.bytedance.sdk.openadsdk.core.model.wjv.fi(this.f18122co) && com.bytedance.sdk.openadsdk.core.nr.ka().aw(this.mj) == 1;
            try {
                if (!com.bytedance.sdk.openadsdk.core.settings.sf.lr().bgr(this.mj) || this.f18122co.nd() == 5 || this.f18122co.nd() == 6 || this.f18122co.go() == 3) {
                    z = true;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            z = false;
        }
        long jMin = Math.min(Math.max(jOptLong, 0L), Ua.s);
        int renderTimeout = getRenderTimeout();
        double dBeachfront = this.f18122co.eu() != null ? this.f18122co.eu().beachfront() * ((double) this.f18122co.eu().polder()) : 0.0d;
        int i = this.wjv;
        this.ay = i != -1 && i < ((int) dBeachfront);
        if (com.bytedance.sdk.openadsdk.core.co.fi.ri(this.f18122co) || com.bytedance.sdk.openadsdk.core.co.fi.lr(this.f18122co) || com.bytedance.sdk.openadsdk.core.co.di.ri.di.ri(this.qt)) {
            com.bytedance.sdk.openadsdk.core.co.di.ri.C0239ri c0239ri = new com.bytedance.sdk.openadsdk.core.co.di.ri.C0239ri();
            if (com.bytedance.sdk.openadsdk.core.co.fi.ri(this.f18122co)) {
                c0239ri.ri(com.bytedance.sdk.openadsdk.core.co.fi.ri(this.f18122co, this.qt));
            }
            c0239ri.ri((com.bytedance.adsdk.ugeno.core.nr) this.tw);
            c0239ri.ri(this.dw);
            c0239ri.lr(this.ory);
            c0239ri.di(this.dzy);
            riVar = c0239ri;
        } else {
            riVar = new com.bytedance.sdk.component.adexpress.lr.aw.ri();
        }
        riVar.fi(zNbc);
        riVar.ri(this.qt).lr(this.f18122co.tn()).ik(this.f18122co.uo()).ka(this.f18122co.yjg()).ri(this.tw).ka(this.f18122co.rmw()).ri(renderTimeout).lr(this.f18122co.nlk()).ik(this.qd).lr(this.f18122co.hws()).ri(jMin).ik(this.f18122co.adz()).ri(com.bytedance.sdk.openadsdk.core.jbs.ri.lr.lr(this.f18122co)).ka(z).fi(this.wjv).ri(this.ay).ri(dBeachfront).di(com.bytedance.sdk.openadsdk.core.settings.sf.lr().ac()).di(com.bytedance.sdk.openadsdk.wjv.fi.ri("inject_data_reuse_open", 0)).xha(this.f18122co.ckl().ri()).mj(this.f18122co.ckl().lr()).ri(new com.bytedance.sdk.component.adexpress.lr.fi() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.5
            @Override // com.bytedance.sdk.component.adexpress.lr.fi
            public JSONObject ri() {
                try {
                    ac acVar = ac.this;
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = acVar.f18122co;
                    if (wjvVar == null) {
                        acVar.oh = "material is null";
                        return null;
                    }
                    if (zNbc) {
                        acVar.srn = new uq();
                        float f = ac.this.dw;
                        float f2 = ac.this.ory;
                        ac acVar2 = ac.this;
                        JSONObject jSONObjectRi = com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri(f, f2, acVar2.vr, acVar2.f18122co, acVar2.qt, acVar2.srn);
                        ac.this.oh = com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri();
                        return jSONObjectRi;
                    }
                    if (!com.bytedance.sdk.openadsdk.core.co.fi.ri(wjvVar)) {
                        float f3 = ac.this.dw;
                        float f4 = ac.this.ory;
                        ac acVar3 = ac.this;
                        JSONObject jSONObjectRi2 = com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri(f3, f4, acVar3.vr, acVar3.f18122co);
                        ac.this.ik(jSONObjectRi2);
                        return jSONObjectRi2;
                    }
                    ac.this.srn = new uq();
                    ac acVar4 = ac.this;
                    JSONObject jSONObjectRi3 = com.bytedance.sdk.openadsdk.core.co.fi.ri(acVar4.f18122co, acVar4.srn);
                    ac.this.oh = com.bytedance.sdk.openadsdk.core.co.fi.ri();
                    return jSONObjectRi3;
                } catch (Throwable unused4) {
                    return null;
                }
            }
        });
        ri(riVar);
        this.nd = riVar.ri();
    }

    private void bu() {
        if (com.bytedance.sdk.openadsdk.core.co.di.ri.di.ri(this.qt)) {
            com.bytedance.sdk.openadsdk.core.co.di.ri.di diVar = new com.bytedance.sdk.openadsdk.core.co.di.ri.di(this.jbs, this.f18122co, this.uq, (com.bytedance.sdk.openadsdk.core.co.di.ri) this.nd, this, this.dw, this.ory, this.vr, this.qt);
            com.bytedance.sdk.openadsdk.core.co.lr.xha xhaVar = new com.bytedance.sdk.openadsdk.core.co.lr.xha(this.jbs, diVar, this, this.nd);
            diVar.ri((vr) this);
            this.whw.add(xhaVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.lr.di diVar2 = new com.bytedance.sdk.component.adexpress.lr.di(this.jbs, this.nd, new ihz(this, this.ta, this.nd));
        this.rzk = diVar2;
        this.whw.add(diVar2);
    }

    private void dw() {
        List<com.bytedance.sdk.component.adexpress.lr.qt> list = this.whw;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.lr.qt> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void fr() {
        if (com.bytedance.sdk.openadsdk.core.vr.fi()) {
            return;
        }
        co.ri();
    }

    private boolean hcw() {
        return TextUtils.equals(this.qt, "fullscreen_interstitial_ad") || TextUtils.equals(this.qt, "rewarded_video") || TextUtils.equals("open_ad", this.qt) || ay.lr(this.qt) || TextUtils.equals(this.qt, "embeded_ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void igq() {
        if (this.jc.get()) {
            this.fr.ri(System.currentTimeMillis(), pv.ri(this));
        }
    }

    private void ory() {
        List<com.bytedance.sdk.component.adexpress.lr.qt> list = this.whw;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.lr.qt> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void slm() {
        this.lr = this.f18122co.hpn();
        try {
            fr();
            su();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ri("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        boolean z = this.f18122co.qmx() == 1;
        this.ri = z;
        if (z) {
            bu();
        }
        Objects.toString(this.whw);
        this.siy = new com.bytedance.sdk.component.adexpress.lr.co(this.whw, this.tw);
    }

    private void su() {
        ac acVar;
        com.bytedance.sdk.openadsdk.core.co.di.ka kaVar;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f18122co;
        if (wjvVar2 == null || wjvVar2.lji() != 1 || this.f18122co.ajz() == 2) {
            if (!com.bytedance.sdk.openadsdk.core.co.di.ri.di.ri(this.qt) || (wjvVar = this.f18122co) == null || wjvVar.ajz() == 2) {
                com.bytedance.sdk.openadsdk.core.xha.ri.ri riVar = new com.bytedance.sdk.openadsdk.core.xha.ri.ri();
                int i = this.lr;
                if (i != 0) {
                    if (i == 3) {
                        com.bytedance.sdk.component.adexpress.dynamic.fi.xha xhaVar = new com.bytedance.sdk.component.adexpress.dynamic.fi.xha();
                        Context applicationContext = this.jbs.getApplicationContext();
                        com.bytedance.sdk.component.adexpress.lr.aw awVar = this.nd;
                        ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.ta;
                        boolean z = this.uq;
                        com.bytedance.sdk.component.adexpress.lr.lr lrVar = new com.bytedance.sdk.component.adexpress.lr.lr(applicationContext, awVar, themeStatusBroadcastReceiver, z, xhaVar, this, riVar, new di(this.jbs, themeStatusBroadcastReceiver, z, xhaVar, awVar, riVar));
                        this.igq = lrVar;
                        this.whw.add(lrVar);
                        return;
                    }
                    if (i == 7) {
                        com.bytedance.sdk.openadsdk.core.co.di.ka kaVar2 = new com.bytedance.sdk.openadsdk.core.co.di.ka(this.jbs, this.f18122co, this.uq, (com.bytedance.sdk.openadsdk.core.co.di.ri) this.nd, this);
                        this.gcp = kaVar2;
                        com.bytedance.sdk.openadsdk.core.co.lr.xha xhaVar2 = new com.bytedance.sdk.openadsdk.core.co.lr.xha(this.jbs, kaVar2, this, this.nd);
                        this.qh = xhaVar2;
                        xhaVar2.ri(this);
                        this.whw.add(this.qh);
                        return;
                    }
                    if (i != 9) {
                        if (i != 10) {
                            return;
                        }
                        if (!this.dzy || (kaVar = this.gcp) == null) {
                            acVar = this;
                            acVar.gcp = new com.bytedance.sdk.openadsdk.core.co.di.xha(this.jbs, this.f18122co, this.uq, (com.bytedance.sdk.openadsdk.core.co.di.ri) this.nd, this);
                        } else {
                            kaVar.ri(this.f18122co, this.uq, (com.bytedance.sdk.openadsdk.core.co.di.ri) this.nd, this);
                            acVar = this;
                        }
                        com.bytedance.sdk.openadsdk.core.co.lr.xha xhaVar3 = new com.bytedance.sdk.openadsdk.core.co.lr.xha(acVar.jbs, acVar.gcp, this, acVar.nd);
                        acVar.qh = xhaVar3;
                        xhaVar3.ri(this);
                        acVar.whw.add(acVar.qh);
                        return;
                    }
                }
                ay ayVar = new ay(this.jbs, this.nd, this.ta, this.hcw, this.f18122co);
                this.bnj = ayVar;
                com.bytedance.sdk.component.adexpress.lr.slm slmVar = new com.bytedance.sdk.component.adexpress.lr.slm(this.jbs, this.nd, ayVar, this);
                this.xm = slmVar;
                this.whw.add(slmVar);
            }
        }
    }

    private void vr() {
        if (this.f18122co.lji() == 1 && this.f18122co.zz()) {
            bu();
            this.siy = new com.bytedance.sdk.component.adexpress.lr.co(this.whw, this.tw);
            return;
        }
        if (hcw()) {
            slm();
            return;
        }
        try {
            fr();
            ay ayVar = new ay(this.jbs, this.nd, this.ta, this.hcw, this.f18122co);
            this.bnj = ayVar;
            com.bytedance.sdk.component.adexpress.lr.slm slmVar = new com.bytedance.sdk.component.adexpress.lr.slm(this.jbs, this.nd, ayVar, this);
            this.xm = slmVar;
            this.whw.add(slmVar);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ri("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        bu();
        this.siy = new com.bytedance.sdk.component.adexpress.lr.co(this.whw, this.tw);
    }

    private boolean zf() {
        return com.bytedance.sdk.openadsdk.core.model.wjv.fi(this.f18122co);
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.vr
    public void a_(int i) {
        com.bytedance.sdk.component.adexpress.lr.jbs jbsVar = this.tw;
        if (jbsVar != null) {
            if (!this.ri) {
                jbsVar.xha();
            }
            this.tw.mj();
            ((aw) this.tw).qt();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fi;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.jbs.ri(i), i);
        }
        uq uqVar = this.srn;
        if (uqVar != null) {
            uqVar.ri(this.f18122co, this.qt);
        }
    }

    public void ac() {
        try {
            FrameLayout frameLayout = this.aw;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.aw);
        } catch (Throwable unused) {
        }
    }

    public void ay() {
        com.bytedance.sdk.openadsdk.core.co.ik.lr lrVar = new com.bytedance.sdk.openadsdk.core.co.ik.lr(this.jbs, this.f18122co);
        this.xd = lrVar;
        lrVar.ri(this);
        this.xd.ri(new com.bytedance.sdk.openadsdk.core.co.ik.ri() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.7
            @Override // com.bytedance.sdk.openadsdk.core.co.ik.ri
            public void ri(View view, int i, com.bytedance.sdk.component.adexpress.ik ikVar) {
                ri(view, i, ikVar);
            }
        });
    }

    public void co() {
        try {
            ik ikVar = this.kt;
            if (ikVar != null) {
                ikVar.lr();
            }
            uq();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.lr.qt> list = this.whw;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.lr.qt> it = list.iterator();
                while (it.hasNext()) {
                    it.next().ri();
                }
            }
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.f18122co);
            com.bytedance.sdk.openadsdk.ay.ri.ik.lr(this.f18122co);
            this.ik = null;
            this.ka = null;
            this.sf = null;
            this.f18122co = null;
            this.fi = null;
            this.di = null;
            this.slm = null;
            this.xha = null;
            com.bytedance.sdk.openadsdk.core.co.ik.lr lrVar = this.xd;
            if (lrVar != null) {
                lrVar.ka();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ri("NativeExpressView", "detach error", th);
        }
    }

    public void di() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        mj mjVar = this.di;
        if (mjVar != null) {
            mjVar.lr(motionEvent.getDeviceId());
            this.di.ri(motionEvent.getSource());
            this.di.ik(motionEvent.getToolType(0));
        }
        jbs jbsVar = this.xha;
        if (jbsVar != null) {
            jbsVar.lr(motionEvent.getDeviceId());
            this.xha.ri(motionEvent.getSource());
            this.xha.ik(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i2 = 3;
            if (actionMasked == 1) {
                i = i2;
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
                i = i2;
            } else {
                this.saa += Math.abs(motionEvent.getX() - this.xe);
                this.pc += Math.abs(motionEvent.getY() - this.yjm);
                this.xe = motionEvent.getX();
                this.yjm = motionEvent.getY();
                i = (System.currentTimeMillis() - this.ajz <= 200 || (this.saa <= 8.0f && this.pc <= 8.0f)) ? 2 : 1;
            }
        } else {
            this.xe = motionEvent.getRawX();
            this.yjm = motionEvent.getRawY();
            this.ajz = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.sf.ik.ri(motionEvent);
            i = 0;
        }
        SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray = this.aac;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.ik.ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public int fi() {
        return 0;
    }

    public com.bytedance.sdk.openadsdk.ka.xha getAdShowTime() {
        return this.fr;
    }

    public ik getBrandBannerController() {
        return this.kt;
    }

    public mj getClickCreativeListener() {
        return this.di;
    }

    public jbs getClickListener() {
        return this.xha;
    }

    public String getClosedListenerKey() {
        return this.pv;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar != null) {
            return kaVar.ik();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.ory).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.dw).intValue();
    }

    public PAGExpressAdWrapperListener getExpressInteractionListener() {
        return this.fi;
    }

    public dzy getJsObject() {
        ay ayVar = this.bnj;
        if (ayVar != null) {
            return ayVar.slm();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        qt qtVarVr;
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (!(kaVar instanceof ay) || (qtVarVr = ((ay) kaVar).vr()) == null) {
            return 0;
        }
        return qtVarVr.ri();
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.nr.ka().dzy();
    }

    public String getUgenTemplateErrorReason() {
        return this.oh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ik.ri.InterfaceC0250ri
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.ka.jbs jbsVar = this.zk;
        if (jbsVar != null) {
            return jbsVar.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.jbs.di getWebView() {
        ay ayVar = this.bnj;
        if (ayVar == null) {
            return null;
        }
        return ayVar.ri();
    }

    public boolean ihz() {
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        return kaVar != null && (kaVar instanceof ihz);
    }

    public long ik() {
        return 0L;
    }

    public boolean jbs() {
        return true;
    }

    public long ka() {
        return 0L;
    }

    public void lr() {
    }

    public boolean mj() {
        return true;
    }

    public void nr() {
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar instanceof ay) {
            if (kaVar == null) {
                return;
            }
            ((ay) kaVar).mj();
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f18122co;
            com.bytedance.sdk.component.utils.jbs.lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.6
                @Override // java.lang.Runnable
                public void run() {
                    ac.this.fi(1);
                }
            }, ((long) (wjvVar != null ? wjvVar.su().ka() : 5)) * 1000);
        } else if (kaVar instanceof com.bytedance.sdk.openadsdk.core.co.di.xha) {
            ((com.bytedance.sdk.openadsdk.core.co.di.xha) kaVar).sf();
        }
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f18122co;
        if (wjvVar2 != null && (kaVarQc = wjvVar2.qc()) != null && (kaVarRi = kaVarQc.ri()) != null) {
            kaVarRi.ri(0L);
        }
        if ((this.zf instanceof com.bytedance.sdk.openadsdk.core.co.di.xha) && com.bytedance.sdk.openadsdk.core.model.bu.ri(this.f18122co)) {
            ri(this.zf);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        igq();
        dw();
        getViewTreeObserver().addOnScrollChangedListener(this.feb);
        com.bytedance.sdk.openadsdk.core.qt.lr().ri(this.pv, this.ig);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.feb);
        com.bytedance.sdk.openadsdk.core.qt.lr().di(this.pv);
        ory();
        ri(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        igq();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z ? getVisibility() : 8);
        }
        igq();
        com.bytedance.sdk.openadsdk.ay.ri.ik.ri(this.f18122co, z);
        if (z) {
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.f18122co, 4);
        } else {
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.f18122co, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ri(i, true, false);
    }

    public void qt() {
        ay ayVar = this.bnj;
        if (ayVar == null || ayVar.fi() == null) {
            return;
        }
        this.bnj.di();
    }

    public void ri() {
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.lr.ik ikVar) {
        this.slm = ikVar;
        com.bytedance.sdk.component.adexpress.lr.di diVar = this.rzk;
        if (diVar != null) {
            diVar.ri(ikVar);
        }
    }

    public void setBannerClickClosedListener(com.bytedance.sdk.openadsdk.core.ka.xha.ri riVar) {
        this.ig = riVar;
    }

    public void setClickCreativeListener(mj mjVar) {
        this.di = mjVar;
        if (mjVar != null) {
            mjVar.ri((com.bytedance.sdk.openadsdk.core.ik.ri.InterfaceC0250ri) this);
        }
    }

    public void setClickListener(jbs jbsVar) {
        this.xha = jbsVar;
    }

    public void setClosedListenerKey(String str) {
        this.pv = str;
        ik ikVar = this.kt;
        if (ikVar != null) {
            ikVar.ri(str);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.ik.ik ikVar) {
        ri riVar;
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar != null && (kaVar instanceof ihz) && (riVar = (ri) kaVar.fi()) != null) {
            riVar.setDislikeInner(ikVar);
        }
        ik ikVar2 = this.kt;
        if (ikVar2 != null) {
            ikVar2.ri(ikVar);
        }
        this.ik = ikVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.fi = pAGExpressAdWrapperListener;
        ik ikVar = this.kt;
        if (ikVar != null) {
            ikVar.ri(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.fi fiVar) {
        if (this.bnj != null && getJsObject() != null) {
            getJsObject().ri(fiVar);
        }
        com.bytedance.sdk.openadsdk.core.co.di.ka kaVar = this.gcp;
        if (kaVar != null) {
            kaVar.ri(fiVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        ri riVar;
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar != null && (kaVar instanceof ihz) && (riVar = (ri) kaVar.fi()) != null) {
            riVar.setDislikeOuter(tTDislikeDialogAbstract);
        }
        ik ikVar = this.kt;
        if (ikVar != null) {
            ikVar.ri(tTDislikeDialogAbstract);
        }
        this.ka = tTDislikeDialogAbstract;
    }

    public void setSoundMute(boolean z) {
        this.uq = z;
        com.bytedance.sdk.component.adexpress.lr.lr lrVar = this.igq;
        if (lrVar != null && lrVar.lr() != null) {
            this.igq.lr().setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar instanceof com.bytedance.sdk.openadsdk.core.co.di.ka) {
            ((com.bytedance.sdk.openadsdk.core.co.di.ka) kaVar).setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ka
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        try {
            int i3 = Integer.parseInt(String.valueOf(charSequence));
            lr(i3, i);
            com.bytedance.sdk.openadsdk.core.co.ik.lr lrVar = this.xd;
            if (lrVar != null) {
                lrVar.ri(i3);
            }
        } catch (NumberFormatException unused) {
        }
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.ka.jbs jbsVar) {
        this.zk = jbsVar;
    }

    public void setVideoBusiness(com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar) {
        ay ayVar = this.bnj;
        if (ayVar != null) {
            ayVar.ri(lrVar);
        }
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.aw.xha xhaVar) {
        if (this.bnj == null || getJsObject() == null) {
            return;
        }
        getJsObject().ri(xhaVar);
    }

    public void tan() {
        if (this.f18122co == null) {
            return;
        }
        this.su = SystemClock.elapsedRealtime();
        if (this.f18122co.zyu()) {
            ik ikVar = this.kt;
            if (ikVar == null) {
                a_(106);
                return;
            } else {
                ikVar.ri((com.bytedance.sdk.component.adexpress.lr.vr) this);
                this.kt.ri();
                return;
            }
        }
        this.hcw.ri();
        com.bytedance.sdk.component.adexpress.lr.qt.ri riVar = this.siy;
        if (riVar != null) {
            riVar.ri(this);
        }
        try {
            this.siy.ri();
        } catch (Throwable unused) {
        }
    }

    public void uq() {
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f18122co;
        if (wjvVar == null || (kaVarQc = wjvVar.qc()) == null || (kaVarRi = kaVarQc.ri()) == null) {
            return;
        }
        kaVarRi.fi(getVideoProgress());
    }

    public boolean wjv() {
        return this.jc.get();
    }

    public void xha() {
        this.ac = new HashSet<>();
        this.ta = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.sf;
        if (adSlot != null) {
            this.dw = adSlot.getExpressViewAcceptedWidth();
            this.ory = this.sf.getExpressViewAcceptedHeight();
            aw();
            this.mj = this.sf.getCodeId();
            if (TextUtils.equals(this.qt, "fullscreen_interstitial_ad")) {
                this.wjv = this.f18122co.mhp();
            } else if (TextUtils.equals(this.qt, "rewarded_video")) {
                this.wjv = this.f18122co.plm();
            } else if (TextUtils.equals(this.qt, "open_ad")) {
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f18122co;
                if (wjvVar == null || wjvVar.lr() < 0) {
                    this.wjv = com.bytedance.sdk.openadsdk.core.nr.ka().uq(this.mj);
                } else {
                    this.wjv = this.f18122co.lr();
                }
                if (this.wjv < 0) {
                    this.wjv = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.f18122co.zyu()) {
            this.kt = new ik(this.jbs, this, this.f18122co, this.qt);
            return;
        }
        bgr();
        this.whw = new ArrayList();
        vr();
        com.bytedance.sdk.component.adexpress.lr.slm slmVar = this.xm;
        if (slmVar != null) {
            this.bnj = (ay) slmVar.lr();
        }
        dzy jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.di(this.qt);
        }
    }

    public void di(int i) {
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar == null || !(kaVar instanceof ay)) {
            return;
        }
        ((ay) kaVar).ri(i);
        this.zb = i;
    }

    public void ik(JSONObject jSONObject) {
    }

    public void lr(int i) {
    }

    public void ri(int i) {
    }

    public void fi(int i) {
        if (com.bytedance.sdk.openadsdk.core.model.ac.ik(this.f18122co)) {
            com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
            if (kaVar instanceof ay) {
                ((ay) kaVar).lr(i);
            }
        }
    }

    public boolean lr(com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
        return true;
    }

    public void ri(int i, com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
    }

    public com.bytedance.sdk.openadsdk.ay.lr.fi.ri ik(int i) {
        return new com.bytedance.sdk.openadsdk.ay.lr.fi.ri(i);
    }

    public boolean lr(JSONObject jSONObject) {
        return false;
    }

    public void ri(int i, String str) {
    }

    public void ri(com.bytedance.sdk.component.adexpress.lr.aw.ri riVar) {
    }

    public void lr(int i, int i2) {
        int iMin;
        if (TextUtils.equals(this.qt, "banner_ad")) {
            return;
        }
        String str = this.qt;
        int i3 = this.wjv;
        int i4 = ((i2 < i3 || i3 < 0 || !(this.ay || TextUtils.equals(str, "open_ad"))) && !((i == 0 && TextUtils.equals(this.qt, "open_ad")) || fi() == 5)) ? 0 : 1;
        if (i2 <= this.wjv) {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f18122co;
            if (wjvVar != null && wjvVar.eu() != null) {
                iMin = (int) (Math.min(this.wjv, this.f18122co.eu().beachfront() * ((double) this.f18122co.eu().polder())) - ((double) i2));
            } else {
                iMin = this.wjv - i2;
            }
        } else {
            iMin = 0;
        }
        com.bytedance.sdk.component.adexpress.lr.lr lrVar = this.igq;
        if (lrVar != null && lrVar.lr() != null) {
            this.igq.lr().setTime(String.valueOf(i), i4, iMin, false);
        }
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar instanceof com.bytedance.sdk.openadsdk.core.co.di.ka) {
            ((com.bytedance.sdk.openadsdk.core.co.di.ka) kaVar).setTime(String.valueOf(i), i4, iMin, false);
        }
    }

    public void ri(String str, JSONObject jSONObject) {
    }

    public void ri(boolean z, String str) {
    }

    public boolean ri(JSONObject jSONObject) {
        return false;
    }

    public void ri(int i, boolean z, boolean z2) {
        this.bu = z;
        removeCallbacks(this.fe);
        removeCallbacks(this.tnn);
        if (i == 0) {
            if (z2) {
                this.tnn.run();
                return;
            } else {
                postDelayed(this.tnn, 50L);
                return;
            }
        }
        if (z2) {
            this.fe.run();
        } else {
            postDelayed(this.fe, 50L);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ka
    public void onvideoComplate() {
    }

    public void sf() {
    }

    public void lr(int i, String str) {
        dzy dzyVarSlm;
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar == null || !(kaVar instanceof ay) || (dzyVarSlm = ((ay) kaVar).slm()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i);
            jSONObject.put("flag", str);
            dzyVarSlm.ri("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void ri(View view, int i, com.bytedance.sdk.component.adexpress.ik ikVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.component.utils.ac.ri("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i));
        if (i == -1 || ikVar == null) {
            return;
        }
        HashMap map = new HashMap();
        if (dw.ik(this.f18122co)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.slm slmVar = (com.bytedance.sdk.openadsdk.core.model.slm) ikVar;
        if (com.bytedance.sdk.openadsdk.core.model.ac.ik(this.f18122co)) {
            try {
                JSONObject jSONObject2 = slmVar.aw;
                if (jSONObject2 != null) {
                    int iOptInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", iOptInt);
                    map.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ik(th.toString(), new Object[0]);
            }
        }
        mj mjVar = this.di;
        if (mjVar != null) {
            mjVar.ka(getDynamicShowType());
            this.di.ri(map);
        }
        jbs jbsVar = this.xha;
        if (jbsVar != null) {
            jbsVar.ka(getDynamicShowType());
            this.xha.ri(map);
        }
        float f = slmVar.ri;
        float f2 = slmVar.lr;
        float f3 = slmVar.ik;
        float f4 = slmVar.ka;
        boolean z = slmVar.sf;
        SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray = slmVar.qt;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.aac;
        }
        SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray2 = sparseArray;
        String str = slmVar.xha;
        JSONObject jSONObjectRi = null;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectRi = view != this ? ri(view) : null;
            view2 = view;
        }
        slmVar.mj = i;
        if (jSONObjectRi != null && slmVar.jbs == null) {
            slmVar.jbs = jSONObjectRi;
        }
        if (i != 13) {
            switch (i) {
                case 1:
                    FrameLayout frameLayout = this.aw;
                    if (frameLayout != null) {
                        frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f18122co;
                    if (wjvVar == null || wjvVar.xe() != 1 || z) {
                        jbs jbsVar2 = this.xha;
                        if (jbsVar2 != null) {
                            jbsVar2.ri(slmVar);
                            this.xha.ri(str);
                            this.xha.ri(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fi;
                        if (pAGExpressAdWrapperListener != null && !slmVar.bgr) {
                            pAGExpressAdWrapperListener.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (slmVar.f18141co > 0) {
                        ig.ri(true);
                    }
                    mj mjVar2 = this.di;
                    if (mjVar2 != null) {
                        mjVar2.ri(slmVar);
                        this.di.ri(str);
                        if (com.bytedance.sdk.openadsdk.core.model.ac.ik(this.f18122co) && (jSONObject = slmVar.aw) != null) {
                            this.di.ka(jSONObject.optBoolean("is_ceiling_page", false));
                        }
                        this.di.ri(view2, f, f2, f3, f4, sparseArray2, z);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.fi;
                    if (pAGExpressAdWrapperListener2 != null && !slmVar.bgr) {
                        pAGExpressAdWrapperListener2.onAdClicked();
                    }
                    ig.ri(false);
                    com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.f18122co, 9);
                    break;
                case 3:
                    TTDislikeDialogAbstract tTDislikeDialogAbstract = this.ka;
                    if (tTDislikeDialogAbstract != null) {
                        tTDislikeDialogAbstract.show();
                    } else {
                        com.bytedance.sdk.openadsdk.ik.ik ikVar2 = this.ik;
                        if (ikVar2 != null) {
                            ikVar2.ri();
                        } else {
                            TTDelegateActivity.ri(this.f18122co, this.pv);
                        }
                    }
                    break;
                case 4:
                    FrameLayout frameLayout2 = this.aw;
                    if (frameLayout2 != null) {
                        frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f18122co;
                    if (wjvVar2 == null || wjvVar2.xe() != 1 || z) {
                        com.bytedance.sdk.openadsdk.utils.ig.ik(this.f18122co);
                        if ("embeded_ad".equals(this.qt) && zf() && !this.bgr && com.bytedance.sdk.openadsdk.utils.ig.ik(this.f18122co)) {
                            mj mjVar3 = this.di;
                            if (mjVar3 != null) {
                                mjVar3.ri(slmVar);
                                this.di.ri(str);
                                this.di.ri(view2, f, f2, f3, f4, sparseArray2, z);
                            }
                        } else {
                            jbs jbsVar3 = this.xha;
                            if (jbsVar3 != null) {
                                jbsVar3.ri(slmVar);
                                this.xha.ri(str);
                                this.xha.ri(view2, f, f2, f3, f4, sparseArray2, z);
                            }
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.fi;
                        if (pAGExpressAdWrapperListener3 != null && !slmVar.bgr) {
                            pAGExpressAdWrapperListener3.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 5:
                    ri(!this.uq, "dynamicClick");
                    break;
                case 6:
                    ri();
                    break;
                case 7:
                    TTWebsiteActivity.ri(this.jbs, this.f18122co, this.qt);
                    break;
            }
            return;
        }
        int i2 = slmVar.vr;
        if (i2 >= 0) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("switch", i2);
                ri(jSONObject4);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ka
    public void setTimeUpdate(int i) {
    }

    public void xha(int i) {
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if ((kaVar instanceof com.bytedance.sdk.openadsdk.core.co.di.xha) && i == 4) {
            ((com.bytedance.sdk.openadsdk.core.co.di.xha) kaVar).qt();
        }
    }

    public ac(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, String str, boolean z, boolean z2) {
        super(context);
        this.ri = true;
        this.lr = 0;
        this.qt = "embeded_ad";
        this.mj = null;
        this.vr = false;
        this.bu = true;
        this.nr = -1;
        this.oh = "";
        this.uq = false;
        this.qd = true;
        this.wjv = -1;
        this.fr = new com.bytedance.sdk.openadsdk.ka.xha();
        this.su = 0L;
        this.jc = new AtomicBoolean(false);
        this.feb = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                ac acVar = ac.this;
                if (acVar.bu && acVar.jbs()) {
                    ac.this.igq();
                    ac acVar2 = ac.this;
                    acVar2.removeCallbacks(acVar2.zyn);
                    ac acVar3 = ac.this;
                    acVar3.postDelayed(acVar3.zyn, 500L);
                }
            }
        };
        this.zyn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.2
            @Override // java.lang.Runnable
            public void run() {
                if (!pv.ri(ac.this, 0, 5, false)) {
                    ac.this.di(8);
                } else {
                    ac acVar = ac.this;
                    acVar.di(acVar.getVisibility());
                }
            }
        };
        this.tnn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.3
            @Override // java.lang.Runnable
            public void run() {
                ac.this.di(0);
            }
        };
        this.fe = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.4
            @Override // java.lang.Runnable
            public void run() {
                ac.this.di(8);
            }
        };
        this.zb = 8;
        this.aac = new SparseArray<>();
        this.xe = -1.0f;
        this.yjm = -1.0f;
        this.saa = -1.0f;
        this.pc = -1.0f;
        this.ajz = 0L;
        this.qt = str;
        this.jbs = context;
        this.f18122co = wjvVar;
        this.sf = adSlot;
        this.uq = z;
        this.qd = z2;
        xha();
    }

    public static JSONObject ri(View view) {
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

    public void ri(com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar, com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        this.jc.set(true);
        this.zf = kaVar;
        kaVar.ik();
        if (this.zb != getWindowVisibility() && mj()) {
            di(getWindowVisibility());
        }
        if (kaVar.ik() == 3 && (wjvVar = this.f18122co) != null && wjvVar.nd() == 1) {
            this.f18122co.co(0);
        }
        if (kaVar.ik() != 1 || (kaVar instanceof com.bytedance.sdk.openadsdk.core.co.di.ka)) {
            View viewFi = kaVar.fi();
            if (viewFi.getParent() != null) {
                ((ViewGroup) viewFi.getParent()).removeView(viewFi);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                arrayList.add(getChildAt(i));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) instanceof com.bytedance.sdk.component.jbs.di) {
                    removeView((View) arrayList.get(i2));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.ac.ik(this.f18122co)) {
                addView(kaVar.fi(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(kaVar.fi());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f18122co;
        if (wjvVar2 != null) {
            com.bytedance.sdk.openadsdk.slm.ka.ri(wjvVar2.jbs(), this.su, this.qt, kaVar.ik());
        }
        com.bytedance.sdk.component.adexpress.lr.jbs jbsVar = this.tw;
        if (jbsVar != null) {
            ((aw) jbsVar).qt();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fi;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) bgrVar.ik(), (float) bgrVar.ka());
        }
        if ((this.zf instanceof com.bytedance.sdk.openadsdk.core.co.di.xha) && com.bytedance.sdk.openadsdk.core.model.bu.ri(this.f18122co)) {
            ay();
        }
        if (lr(bgrVar)) {
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this, this.f18122co, ik(getDynamicShowType()));
        }
        uq uqVar = this.srn;
        if (uqVar != null) {
            uqVar.ri(this.f18122co, this.qt);
        }
    }

    public JSONObject ri(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (!(this.zf instanceof ay)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (wjvVar != null) {
                if (wjvVar.sez() != null && wjvVar.sez().co()) {
                    jSONObject.put("engine_version", wjvVar.sez().sf());
                } else if (wjvVar.zv() != null) {
                    jSONObject.put("engine_version", "v3");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
            return jSONObject;
        } catch (Exception e) {
            e.getMessage();
            return jSONObject;
        }
    }

    public void ri(com.bytedance.sdk.component.adexpress.lr.ka kaVar) {
        if (this.xd == null) {
            return;
        }
        try {
            if (kaVar instanceof com.bytedance.sdk.openadsdk.core.co.di.xha) {
                ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.co.di.xha) kaVar).di().sf();
                this.ihz = viewGroup;
                if (viewGroup != null) {
                    this.xd.lr();
                    View viewIk = this.xd.ik();
                    if (viewIk != null) {
                        ViewGroup viewGroup2 = (ViewGroup) viewIk.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewIk);
                        }
                        this.ihz.addView(viewIk, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, String str, boolean z, boolean z2) {
        if (wjvVar == null) {
            return;
        }
        this.qt = str;
        this.f18122co = wjvVar;
        this.sf = adSlot;
        this.uq = z;
        this.qd = z2;
        int iHpn = wjvVar.hpn();
        this.lr = iHpn;
        if (iHpn != 10) {
            return;
        }
        this.dzy = true;
        xha();
        tan();
        this.dzy = false;
    }
}
