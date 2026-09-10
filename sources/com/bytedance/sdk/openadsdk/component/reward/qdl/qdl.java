package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    public final AtomicBoolean aaj;
    public final Activity ag;
    public final com.bytedance.sdk.openadsdk.component.reward.view.tvp ax;
    public final bjy bch;
    public final AtomicBoolean bjy;
    public boolean blf;
    public final com.bytedance.sdk.openadsdk.component.reward.view.to bqt;
    private long bx;
    public boolean car;
    public final koa cx;
    public long dk;
    public com.bytedance.sdk.openadsdk.fs.tvp ekw;
    public com.bytedance.sdk.openadsdk.component.reward.ud.ud en;
    public boolean ew;
    public final AtomicBoolean exc;
    public final AtomicBoolean exu;
    public final fs fco;
    public final AtomicBoolean fs;
    public com.bytedance.sdk.openadsdk.component.reward.top.lnr fzn;
    public com.bytedance.sdk.openadsdk.component.reward.rq gg;
    public boolean gt;
    public final com.bytedance.sdk.openadsdk.component.reward.view.fs gy;
    public final jtx hkc;
    public final exu hzv;
    public com.bytedance.sdk.openadsdk.common.exu ijp;
    public boolean irn;
    public boolean ji;
    public boolean jjk;
    public final AtomicBoolean jl;
    public int jpc;
    public final AtomicBoolean jtx;
    private long jut;
    public final AtomicBoolean jyq;
    public com.bytedance.sdk.openadsdk.utils.rdp kab;
    public final lnr kdv;
    public final rq koa;
    public final AtomicBoolean ljh;
    public final boolean lnr;
    public com.bytedance.sdk.openadsdk.activity.jpc lq;
    public boolean lte;
    public boolean mlb;
    public final boolean mml;
    public final int mo;
    public final mzz mrf;
    public final String mzz;
    public boolean nz;
    public final Context om;
    public final AtomicBoolean oth;
    public final int qdl;
    public boolean qk;
    public boolean ra;
    public final mo rc;
    public final AtomicBoolean rdp;
    public final AtomicBoolean rq;
    public boolean rzg;
    public int sy;
    public float taz;
    public int tid;
    public final AtomicBoolean to;
    public boolean tqd;
    public int tvp;
    public ljh ud;
    public final mml uw;
    public final to vu;
    public String wak;
    public final com.bytedance.sdk.openadsdk.core.exu.mml.ud wc;
    public final boolean wd;
    public int xi;
    public final jpc xmv;
    public final boolean yh;
    public final AtomicBoolean yt;
    public int zlt;
    public final boolean zvv;
    public boolean zy;

    public qdl(Activity activity, koa koaVar, ljh ljhVar, com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar, int i2, boolean z2) {
        this(activity, koaVar, ljhVar, udVar, i2, z2, null);
    }

    public long lnr() {
        return (SystemClock.elapsedRealtime() - this.bx) + this.jut;
    }

    public boolean mml() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        return !this.ra || (jpcVar = this.lq) == null || !(jpcVar instanceof com.bytedance.sdk.openadsdk.activity.mzz) || ((com.bytedance.sdk.openadsdk.activity.mzz) jpcVar).qdl;
    }

    public Map<String, Object> mo() {
        ljh ljhVar;
        HashMap map = new HashMap();
        if (this.bqt != null && (ljhVar = this.ud) != null && ljhVar.dk() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.bqt.rq()));
            JSONObject jSONObjectQdl = this.bqt.qdl((JSONObject) null);
            if (jSONObjectQdl != null) {
                Iterator<String> itKeys = jSONObjectQdl.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectQdl.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    public com.bytedance.sdk.openadsdk.mml.wd mzz() {
        if (!this.ud.mo()) {
            com.bytedance.sdk.openadsdk.mml.wd wdVar = new com.bytedance.sdk.openadsdk.mml.wd();
            wdVar.qdl(System.currentTimeMillis(), 1.0f);
            return wdVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.to toVar = this.bqt;
        if (toVar != null && toVar.qdl() != null) {
            return this.bqt.qdl().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.mml.wd wdVar2 = new com.bytedance.sdk.openadsdk.mml.wd();
        wdVar2.qdl(System.currentTimeMillis(), 1.0f);
        return wdVar2;
    }

    public void qdl(boolean z2) {
        this.mlb = z2;
        this.fco.mml(z2);
    }

    public void ud() {
        if (this.bx <= 0) {
            this.bx = SystemClock.elapsedRealtime();
        }
        this.jut = (SystemClock.elapsedRealtime() - this.bx) + this.jut;
    }

    public qdl(Activity activity, koa koaVar, ljh ljhVar, com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar, int i2, boolean z2, qdl qdlVar) {
        this.jpc = 0;
        this.tvp = 0;
        this.to = new AtomicBoolean(false);
        this.rq = new AtomicBoolean(false);
        this.fs = new AtomicBoolean(false);
        this.exu = new AtomicBoolean(false);
        this.rdp = new AtomicBoolean(false);
        this.bjy = new AtomicBoolean(false);
        this.jtx = new AtomicBoolean(false);
        this.yt = new AtomicBoolean(false);
        this.jl = new AtomicBoolean(false);
        this.exc = new AtomicBoolean(false);
        this.aaj = new AtomicBoolean(false);
        this.jyq = new AtomicBoolean(false);
        this.oth = new AtomicBoolean(false);
        this.ljh = new AtomicBoolean(false);
        this.irn = false;
        this.zlt = 1;
        this.dk = 0L;
        this.lq = null;
        this.rzg = true;
        this.ew = false;
        this.blf = false;
        this.ag = activity;
        this.wc = udVar;
        Context contextQdl = com.bytedance.sdk.openadsdk.core.yt.qdl();
        this.om = contextQdl;
        this.ud = ljhVar;
        this.qdl = i2;
        this.ji = qdlVar != null;
        this.nz = i2 == 0 || i2 == 1;
        this.yh = i2 == 0 || i2 == 2;
        this.cx = koaVar;
        this.zvv = z2;
        boolean z3 = ljhVar.ji().getDurationSlotType() == 7;
        this.mml = z3;
        this.mzz = z3 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.zy = ljhVar.mo();
        this.wd = aaj.exu(ljhVar);
        int iFz = ljhVar.fz();
        this.mo = iFz;
        this.gt = com.bytedance.sdk.openadsdk.core.yt.mml().yt(String.valueOf(iFz));
        this.lnr = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().rdp(String.valueOf(iFz));
        this.koa = new rq(this);
        this.gy = i2 == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.exu(this) : ljhVar.mo() ? new com.bytedance.sdk.openadsdk.component.reward.view.fs(this) : new com.bytedance.sdk.openadsdk.component.reward.view.rq(this);
        this.ax = new com.bytedance.sdk.openadsdk.component.reward.view.tvp(this);
        this.bch = new bjy(this);
        this.uw = new mml(this);
        this.xmv = new jpc(this, ljhVar);
        com.bytedance.sdk.openadsdk.component.reward.view.to toVar = qdlVar != null ? qdlVar.bqt : new com.bytedance.sdk.openadsdk.component.reward.view.to(this);
        this.bqt = toVar;
        toVar.qdl(this);
        this.hkc = new jtx(this);
        this.hzv = new exu(this);
        this.fco = new fs(this);
        this.mrf = new mzz(this);
        this.vu = new to(this);
        mo moVar = qdlVar != null ? qdlVar.rc : new mo(this);
        this.rc = moVar;
        moVar.qdl(this);
        this.kdv = new lnr(this);
        this.ekw = new com.bytedance.sdk.openadsdk.fs.tvp(contextQdl);
        this.kab = com.bytedance.sdk.openadsdk.utils.tvp.qdl(activity, new com.bytedance.sdk.openadsdk.utils.tvp.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.qdl.1
            @Override // com.bytedance.sdk.openadsdk.utils.tvp.qdl
            public View qdl() {
                com.bytedance.sdk.openadsdk.component.reward.view.fs fsVar = qdl.this.gy;
                if (fsVar != null) {
                    return fsVar.to();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.tvp.qdl
            public void ud() {
                fs fsVar = qdl.this.fco;
                if (fsVar != null) {
                    fsVar.mzz();
                }
            }
        });
    }

    public void qdl() {
        this.bx = SystemClock.elapsedRealtime();
    }
}
