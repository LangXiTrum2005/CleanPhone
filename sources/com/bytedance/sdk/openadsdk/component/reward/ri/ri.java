package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public com.bytedance.sdk.openadsdk.utils.bgr aac;
    public final AtomicBoolean ac;
    public com.bytedance.sdk.openadsdk.activity.single.mj ajz;
    public final AtomicBoolean aw;
    public final com.bytedance.sdk.openadsdk.component.reward.view.jbs ay;
    public final AtomicBoolean bgr;
    public int bnj;
    public final AtomicBoolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final AtomicBoolean f18096co;
    public final int di;
    public com.bytedance.sdk.openadsdk.aw.jbs dw;
    public final com.bytedance.sdk.openadsdk.component.reward.view.sf dzy;
    private long eb;
    public int fe;
    public String feb;
    public final String fi;
    public final sf fr;
    public long gcp;
    public final aw hcw;
    public boolean hpn;
    private int hws;
    public final boolean id;
    public final Activity ig;
    public final di igq;
    public final vr ihz;
    public final boolean ik;
    public final AtomicBoolean jbs;
    public final igq jc;
    private String jxw;
    public final boolean ka;
    public final boolean kt;
    public wjv lr;
    public boolean luy;
    public int mj;
    public com.bytedance.sdk.openadsdk.component.reward.lr.lr nd;
    private int nh;
    public final AtomicBoolean nr;
    public final co oh;
    public final slm ory;
    public com.bytedance.sdk.openadsdk.component.reward.top.ik pc;
    public final com.bytedance.sdk.openadsdk.component.reward.view.mj pv;
    public final com.bytedance.sdk.openadsdk.core.bgr.ka.lr qd;
    public boolean qh;
    public boolean qmx;
    public final AtomicBoolean qt;
    public final int ri;
    public boolean rzk;
    public boolean saa;
    public final AtomicBoolean sf;
    public float siy;
    public final AtomicBoolean slm;
    public final Context srn;
    public final qt su;
    public boolean ta;
    public final AtomicBoolean tan;
    public boolean tnn;
    public boolean tw;
    public boolean ud;
    public final ka uq;
    public final AtomicBoolean vr;
    private long vt;
    public int whw;
    public final mj wjv;
    public final fi xd;
    public boolean xe;
    public int xha;
    public int xm;
    public boolean yjm;
    public boolean zb;
    public final ik zf;
    public com.bytedance.sdk.openadsdk.component.reward.co zk;
    public boolean zyn;

    public ri(Activity activity, igq igqVar, wjv wjvVar, com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar, int i, boolean z) {
        this(activity, igqVar, wjvVar, lrVar, i, z, null);
    }

    public long di() {
        return this.vt + (SystemClock.elapsedRealtime() - this.eb);
    }

    public void fi() {
        if (this.eb <= 0) {
            this.eb = SystemClock.elapsedRealtime();
        }
        this.vt += SystemClock.elapsedRealtime() - this.eb;
    }

    public boolean ik() {
        return this.nh != 0;
    }

    public Map<String, Object> jbs() {
        wjv wjvVar;
        HashMap map = new HashMap();
        if (this.ay != null && (wjvVar = this.lr) != null && wjvVar.ajz() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.ay.sf()));
            JSONObject jSONObjectRi = this.ay.ri((JSONObject) null);
            if (jSONObjectRi != null) {
                Iterator<String> itKeys = jSONObjectRi.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectRi.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    public void ka() {
        this.eb = SystemClock.elapsedRealtime();
    }

    public int lr() {
        return this.hws;
    }

    public com.bytedance.sdk.openadsdk.ka.xha mj() {
        if (!this.lr.di()) {
            com.bytedance.sdk.openadsdk.ka.xha xhaVar = new com.bytedance.sdk.openadsdk.ka.xha();
            xhaVar.ri(System.currentTimeMillis(), 1.0f);
            return xhaVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = this.ay;
        if (jbsVar != null && jbsVar.ri() != null) {
            return this.ay.ri().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.ka.xha xhaVar2 = new com.bytedance.sdk.openadsdk.ka.xha();
        xhaVar2.ri(System.currentTimeMillis(), 1.0f);
        return xhaVar2;
    }

    public int ri() {
        return this.nh;
    }

    public boolean xha() {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar;
        return !this.xe || (mjVar = this.ajz) == null || !(mjVar instanceof com.bytedance.sdk.openadsdk.activity.single.fi) || ((com.bytedance.sdk.openadsdk.activity.single.fi) mjVar).ri;
    }

    public ri(Activity activity, igq igqVar, wjv wjvVar, com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar, int i, boolean z, ri riVar) {
        this.xha = 0;
        this.mj = 0;
        this.jbs = new AtomicBoolean(false);
        this.qt = new AtomicBoolean(false);
        this.sf = new AtomicBoolean(false);
        this.f18096co = new AtomicBoolean(false);
        this.aw = new AtomicBoolean(false);
        this.bgr = new AtomicBoolean(false);
        this.vr = new AtomicBoolean(false);
        this.slm = new AtomicBoolean(false);
        this.bu = new AtomicBoolean(false);
        this.nr = new AtomicBoolean(false);
        this.tan = new AtomicBoolean(false);
        this.ac = new AtomicBoolean(false);
        this.tnn = false;
        this.bnj = 1;
        this.gcp = 0L;
        this.ajz = null;
        this.luy = true;
        this.hpn = false;
        this.qmx = false;
        this.hws = -1;
        this.jxw = "";
        this.nh = 0;
        this.ig = activity;
        this.qd = lrVar;
        Context contextRi = nr.ri();
        this.srn = contextRi;
        this.lr = wjvVar;
        this.ri = i;
        this.ud = riVar != null;
        this.zb = i == 0 || i == 1;
        this.kt = i == 0 || i == 2;
        this.jc = igqVar;
        this.id = z;
        boolean z2 = wjvVar.eb().getDurationSlotType() == 7;
        this.ka = z2;
        this.fi = z2 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.tw = wjvVar.di();
        int iUr = wjvVar.ur();
        this.di = iUr;
        this.zyn = nr.ka().bu(String.valueOf(iUr));
        this.ik = com.bytedance.sdk.openadsdk.core.settings.sf.lr().bgr(String.valueOf(iUr));
        this.fr = new sf(this);
        this.dzy = i == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.co(this) : wjvVar.di() ? new com.bytedance.sdk.openadsdk.component.reward.view.sf(this) : new com.bytedance.sdk.openadsdk.component.reward.view.qt(this);
        this.pv = new com.bytedance.sdk.openadsdk.component.reward.view.mj(this);
        this.ihz = new vr(this);
        this.uq = new ka(this);
        this.wjv = new mj(this, wjvVar);
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = riVar != null ? riVar.ay : new com.bytedance.sdk.openadsdk.component.reward.view.jbs(this);
        this.ay = jbsVar;
        jbsVar.ri(this);
        this.ory = new slm(this);
        this.hcw = new aw(this);
        this.oh = new co(this);
        this.xd = new fi(this);
        this.su = new qt(this);
        di diVar = riVar != null ? riVar.igq : new di(this);
        this.igq = diVar;
        diVar.ri(this);
        this.zf = new ik(this);
        this.dw = new com.bytedance.sdk.openadsdk.aw.jbs(contextRi);
        this.aac = com.bytedance.sdk.openadsdk.utils.jbs.ri(activity, new com.bytedance.sdk.openadsdk.utils.jbs.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.ri.1
            @Override // com.bytedance.sdk.openadsdk.utils.jbs.ri
            public void lr() {
                co coVar = ri.this.oh;
                if (coVar != null) {
                    coVar.fi();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jbs.ri
            public View ri() {
                com.bytedance.sdk.openadsdk.component.reward.view.sf sfVar = ri.this.dzy;
                if (sfVar != null) {
                    return sfVar.qt();
                }
                return null;
            }
        });
    }

    public void ri(int i, String str, int i2) {
        this.hws = i;
        this.jxw = str;
        this.nh = i2;
    }

    public void ri(boolean z) {
        this.qh = z;
        this.oh.ka(z);
    }
}
