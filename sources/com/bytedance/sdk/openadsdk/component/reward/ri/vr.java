package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.app.Activity;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.ihz;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.google.android.gms.ads.AdSize;
import com.unity3d.services.UnityAdsConstants;
import euthanasia.attabal;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import logician.dern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class vr {
    private String ac;
    private boolean aw;
    private boolean ay;
    private boolean bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private long f18098co;
    attabal di;
    private com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri dw;
    boolean ik;
    private FrameLayout jbs;
    final boolean ka;
    private final wjv mj;
    private long nr;
    private com.bytedance.sdk.openadsdk.ka.xha ory;
    private final String qt;
    private long sf;
    private long tan;
    private boolean uq;
    private boolean vr;
    private final ri wjv;
    private final Activity xha;
    protected boolean ri = false;
    boolean lr = false;
    protected boolean fi = false;
    private long slm = -1;
    private int bu = -1;
    private boolean fr = false;
    private int su = 0;
    private float igq = 1.0f;
    private boolean zf = false;
    private volatile boolean hcw = false;
    private HashSet<String> ihz = new HashSet<>();

    public vr(ri riVar) {
        this.wjv = riVar;
        this.xha = riVar.ig;
        this.mj = riVar.lr;
        this.ka = riVar.ka;
        this.qt = riVar.fi;
    }

    private void ta() {
        attabal attabalVar = this.di;
        if (attabalVar == null || attabalVar.sf() == null) {
            return;
        }
        this.sf = this.di.di();
        if (this.di.sf().ik() || !this.di.sf().lr()) {
            this.di.lr();
            this.di.ka();
            this.ri = true;
        }
    }

    public void ac() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            attabalVar.fi();
        }
    }

    public long aw() {
        attabal attabalVar = this.di;
        return attabalVar != null ? attabalVar.di() : this.sf;
    }

    public int ay() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.qt();
        }
        return 0;
    }

    public long bgr() {
        return this.f18098co;
    }

    public long bu() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.xha();
        }
        return 0L;
    }

    public boolean co() {
        return this.ri;
    }

    public boolean di() {
        attabal attabalVar = this.di;
        return (attabalVar == null || attabalVar.sf() == null || !this.di.sf().di()) ? false : true;
    }

    public boolean dw() {
        return this.di != null;
    }

    public void dzy() {
        this.fr = false;
        tan();
    }

    public boolean fe() {
        return this.aw;
    }

    public void feb() {
        attabal attabalVar = this.di;
        if (attabalVar instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.ri) {
            ((com.bytedance.sdk.openadsdk.core.bgr.ka.ri) attabalVar).srn();
        }
    }

    public com.bytedance.sdk.openadsdk.ka.xha fi() {
        return this.ory;
    }

    public int fr() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.mj();
        }
        return 0;
    }

    public boolean hcw() {
        return this.hcw;
    }

    public boolean ig() {
        attabal attabalVar = this.di;
        if (attabalVar == null || attabalVar.sf() == null) {
            return false;
        }
        return this.di.sf().ri();
    }

    public long igq() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.jbs();
        }
        return 0L;
    }

    public void ihz() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            attabalVar.ik();
        }
    }

    public boolean jbs() {
        attabal attabalVar = this.di;
        return (attabalVar == null || attabalVar.sf() == null || !this.di.sf().xha()) ? false : true;
    }

    public View jc() {
        attabal attabalVar = this.di;
        if (attabalVar instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.ri) {
            return (View) ((com.bytedance.sdk.openadsdk.core.bgr.ka.ri) attabalVar).ig();
        }
        return null;
    }

    public boolean ka() {
        int i;
        if (this.zf) {
            return this.fr && this.su == 1;
        }
        return this.fr && ((i = this.su) == 2 || i == 1);
    }

    public void kt() {
        attabal attabalVar = this.di;
        if (attabalVar instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.ri) {
            ((com.bytedance.sdk.openadsdk.core.bgr.ka.ri) attabalVar).qd();
        }
    }

    public canonical.attabal mj() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar instanceof com.bytedance.sdk.openadsdk.component.reward.ka ? ((com.bytedance.sdk.openadsdk.component.reward.ka) attabalVar).bu() : attabalVar.co();
        }
        return null;
    }

    public dern nr() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.sf();
        }
        return null;
    }

    public void oh() {
        int i = this.su;
        if (i == 1 || i == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                ri(jSONObject);
            } catch (Throwable th) {
                ac.ri("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th);
            }
        }
    }

    public boolean ory() {
        attabal attabalVar = this.di;
        return attabalVar != null && attabalVar.sf() == null;
    }

    public void pv() {
        try {
            if (di()) {
                this.fi = true;
                uq();
            }
        } catch (Exception e) {
            ac.ik("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public double qd() {
        double dBeachfront;
        long jKa;
        com.bytedance.sdk.openadsdk.component.reward.co coVar;
        ihz ihzVarAy = this.mj.ay();
        if (!com.bytedance.sdk.openadsdk.core.model.ac.ka(this.mj) || ihzVarAy == null) {
            if (!com.bytedance.sdk.openadsdk.core.model.ac.xha(this.mj) || ihzVarAy == null) {
                com.bykv.vk.openvk.ri.ri.ri.ik.attabal attabalVarEu = this.mj.eu();
                dBeachfront = attabalVarEu != null ? attabalVarEu.beachfront() * ((double) attabalVarEu.polder()) : 0.0d;
            } else {
                jKa = ihzVarAy.ka();
            }
            coVar = this.wjv.zk;
            if (coVar != null) {
                coVar.ri((long) dBeachfront);
            }
            return dBeachfront;
        }
        jKa = ihzVarAy.lr();
        dBeachfront = jKa;
        coVar = this.wjv.zk;
        if (coVar != null) {
            coVar.ri((long) dBeachfront);
        }
        return dBeachfront;
    }

    public boolean qt() {
        attabal attabalVar = this.di;
        return attabalVar != null && attabalVar.bgr();
    }

    public void sf() {
        this.hcw = false;
        igq igqVar = this.wjv.jc;
        if (igqVar != null) {
            igqVar.removeMessages(AdSize.MEDIUM_RECTANGLE_WIDTH);
        }
    }

    public void slm() {
        try {
            if (di()) {
                this.di.lr();
            }
        } catch (Throwable th) {
            ac.ik("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage(), new Object[0]);
        }
    }

    public void srn() {
        attabal attabalVar = this.di;
        if (attabalVar instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.ri) {
            ((com.bytedance.sdk.openadsdk.core.bgr.ka.ri) attabalVar).dzy();
        }
    }

    public long su() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.jbs() + this.di.xha();
        }
        return 0L;
    }

    public void tan() {
        attabal attabalVar = this.di;
        if (attabalVar == null) {
            return;
        }
        attabalVar.ka();
        this.di = null;
    }

    public void tnn() {
        attabal attabalVar = this.di;
        if (attabalVar == null || attabalVar.sf() == null) {
            return;
        }
        this.sf = this.di.di();
        ac();
        ri(true);
        this.aw = true;
    }

    public void uq() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            attabalVar.lr();
        }
    }

    public long vr() {
        return this.sf;
    }

    public long wjv() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.jbs();
        }
        return 0L;
    }

    public boolean xd() {
        return this.ik;
    }

    public boolean xha() {
        attabal attabalVar = this.di;
        return attabalVar != null && attabalVar.aw();
    }

    public boolean zf() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            if (attabalVar.sf() != null) {
                dern dernVarSf = this.di.sf();
                if (dernVarSf.xha() || dernVarSf.mj()) {
                    attabal attabalVar2 = this.di;
                    if (attabalVar2 instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.ri) {
                        ((com.bytedance.sdk.openadsdk.core.bgr.ka.ri) attabalVar2).pv();
                    }
                    return true;
                }
            } else if (co()) {
                ri(false);
                attabal attabalVar3 = this.di;
                if (attabalVar3 instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.ri) {
                    ((com.bytedance.sdk.openadsdk.core.bgr.ka.ri) attabalVar3).pv();
                }
                return true;
            }
        }
        return false;
    }

    public void zyn() {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            attabalVar.ri();
        }
    }

    public void fi(boolean z) {
        this.vr = z;
        attabal attabalVar = this.di;
        if (attabalVar instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.ri) {
            ((com.bytedance.sdk.openadsdk.core.bgr.ka.ri) attabalVar).di(z);
        }
    }

    public boolean ik() {
        return this.fr;
    }

    public long lr() {
        return this.nr;
    }

    public long ri() {
        return this.slm;
    }

    private void lr(long j, long j2) {
        int iAbs = (int) Math.abs(((long) this.bu) - j);
        int i = this.bu;
        if (i < 0 || iAbs > 500 || i > j2 || iAbs >= 500 || this.ihz.contains(this.ac)) {
            return;
        }
        if (this.bu > j) {
            com.bytedance.sdk.openadsdk.core.vr.ik().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.vr.1
                @Override // java.lang.Runnable
                public void run() {
                    vr.this.pv();
                    vr.this.wjv.ay.ri(vr.this.bu, vr.this.ac);
                }
            }, iAbs);
        } else {
            pv();
            this.wjv.ay.ri(this.bu, this.ac);
        }
        this.ihz.add(this.ac);
    }

    public void ik(boolean z) {
        this.ik = z;
    }

    public void ri(long j) {
        this.slm = j;
    }

    public void ka(boolean z) {
        this.ay = z;
        if (this.di instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.ri) {
            if (z) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ka.ri) this.di).lr(this.mj.eu().polder());
            } else {
                this.mj.eu().stratoscope(1);
                ((com.bytedance.sdk.openadsdk.core.bgr.ka.ri) this.di).lr(1);
            }
        }
    }

    public void ri(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.ka.xha xhaVar) {
        if (this.uq) {
            return;
        }
        this.uq = true;
        this.jbs = frameLayout;
        if (this.mj.cmy() != null) {
            this.su = this.mj.cmy().lr();
            this.igq = this.mj.cmy().ri();
        }
        this.ory = xhaVar;
        if (wjv.fi(this.mj)) {
            this.zf = true;
            this.di = new com.bytedance.sdk.openadsdk.core.bgr.ka.ri(this.xha, this.jbs, this.mj, xhaVar);
            ka(this.ay);
            com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri interfaceC0235ri = this.dw;
            if (interfaceC0235ri != null) {
                ((com.bytedance.sdk.openadsdk.core.bgr.ka.ri) this.di).ri(interfaceC0235ri);
            }
            ((com.bytedance.sdk.openadsdk.core.bgr.ka.ri) this.di).di(this.vr);
            return;
        }
        this.zf = false;
        com.bytedance.sdk.openadsdk.component.reward.ka kaVar = new com.bytedance.sdk.openadsdk.component.reward.ka(this.mj, xhaVar);
        this.di = kaVar;
        com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri interfaceC0235ri2 = this.dw;
        if (interfaceC0235ri2 != null) {
            kaVar.ri(interfaceC0235ri2);
        }
    }

    public void lr(long j) {
        this.sf = j;
    }

    public void lr(boolean z) {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            attabalVar.lr();
            this.bgr = z;
        }
    }

    public void lr(com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar) {
        if (!zf() || lrVar == null) {
            return;
        }
        lrVar.ri(vr(), true);
    }

    public void ri(com.bytedance.sdk.openadsdk.ka.xha xhaVar) {
        this.ory = xhaVar;
    }

    public void ri(long j, long j2) {
        this.f18098co = j;
        if (this.hcw && (ig() || di() || j > 0)) {
            sf();
        }
        lr(j, j2);
    }

    public void ri(int i, String str) {
        this.bu = i;
        this.ac = str;
    }

    public void ri(boolean z) {
        this.ri = z;
    }

    public void ri(int i, int i2) {
        if (this.di != null) {
            com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri riVar = new com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri();
            riVar.ik(bu());
            riVar.ka(su());
            riVar.lr(aw());
            riVar.ri(i);
            riVar.lr(i2);
            com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ka(this.di.co(), riVar);
        }
    }

    public void ri(attabal.wireman wiremanVar) {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            attabalVar.ri(wiremanVar);
        }
    }

    public void ri(boolean z, String str) {
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            attabalVar.ri(z, str);
        }
    }

    public void ri(String str, boolean z) {
        if (this.di != null) {
            long jAw = aw();
            if (this.mj.siy()) {
                jAw = this.wjv.di();
            }
            long j = jAw;
            JSONObject jSONObjectRi = ig.ri(this.mj, this.di.xha(), this.di.sf());
            try {
                jSONObjectRi.put("auto_click", z);
                if (!z) {
                    ri riVar = this.wjv;
                    com.bytedance.sdk.openadsdk.ka.ik.ri(jSONObjectRi, riVar.ka ? riVar.lr.plm() : riVar.lr.mhp(), (int) j);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.ka.ik.ri(this.mj, this.qt, str, j, ay(), jSONObjectRi, this.ory);
            su();
            ay();
        }
        kt();
    }

    public boolean ri(long j, boolean z, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar) {
        boolean zRi;
        boolean z2 = false;
        if (!dw()) {
            ri riVar = this.wjv;
            com.bytedance.sdk.openadsdk.ka.qt.ri(riVar.lr, "show_ad_fail", riVar.fi, "video_controller_not_ready");
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.ac.ka(this.wjv.lr) || com.bytedance.sdk.openadsdk.core.model.ac.xha(this.wjv.lr)) {
            return true;
        }
        if (!z || !ory()) {
            ri(lrVar);
        }
        try {
            zRi = ri(j, this.wjv.zyn);
            try {
                this.aw = false;
            } catch (Exception unused) {
                z2 = zRi;
                zRi = z2;
            }
        } catch (Exception unused2) {
        }
        if (zRi && !z) {
            this.wjv.su.ri(map);
        } else if (!zRi) {
            ri riVar2 = this.wjv;
            com.bytedance.sdk.openadsdk.ka.qt.ri(riVar2.lr, "show_ad_fail", riVar2.fi, "video_play_fail");
        }
        return zRi;
    }

    public void ri(com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar) {
        if (this.wjv.jbs.get()) {
            return;
        }
        ri riVar = this.wjv;
        if (riVar.tnn && !dw.ik(riVar.lr)) {
            boolean zFi = wjv.fi(this.wjv.lr);
            boolean zKa = this.wjv.ay.ka();
            int iAw = nr.ka().aw(String.valueOf(this.wjv.di));
            if ((!zFi && iAw == 1 && zKa) || com.bytedance.sdk.openadsdk.core.model.ac.ka(this.wjv.lr) || com.bytedance.sdk.openadsdk.core.model.ac.xha(this.wjv.lr) || this.fi || !lrVar.fi()) {
                return;
            }
            this.wjv.jc.removeMessages(AdSize.MEDIUM_RECTANGLE_WIDTH);
            Message messageObtain = Message.obtain();
            messageObtain.what = AdSize.MEDIUM_RECTANGLE_WIDTH;
            this.wjv.jc.sendMessageDelayed(messageObtain, 5000L);
            this.hcw = true;
        }
    }

    public boolean ri(JSONObject jSONObject) {
        int i;
        if (this.di != null && jSONObject != null && ((i = this.su) == 1 || i == 2)) {
            int iOptInt = jSONObject.optInt("switch", 0);
            float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
            this.igq = fOptDouble;
            if (fOptDouble <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.wjv.lr.cmy() != null) {
                this.igq = this.wjv.lr.cmy().ri();
            }
            if (iOptInt == 0) {
                this.igq = 1.0f;
                if (this.fr) {
                    long jCurrentTimeMillis = this.nr + (System.currentTimeMillis() - this.tan);
                    this.nr = jCurrentTimeMillis;
                    attabal attabalVar = this.di;
                    if (attabalVar != null) {
                        attabalVar.ri(jCurrentTimeMillis);
                    }
                    com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar = this.wjv.qd;
                    if (lrVar != null) {
                        lrVar.ka(false);
                    }
                }
            } else if (iOptInt == 1 && !this.fr) {
                this.tan = System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar2 = this.wjv.qd;
                if (lrVar2 != null) {
                    lrVar2.ka(true);
                }
            }
            this.fr = iOptInt == 1;
            if (this.su == 1) {
                return true;
            }
            attabal attabalVar2 = this.di;
            if (attabalVar2 == null) {
                return false;
            }
            return attabalVar2.ri(this.igq);
        }
        this.fr = false;
        return false;
    }

    private boolean ri(long j, boolean z) {
        if (this.di == null || this.mj.eu() == null) {
            return false;
        }
        String strRi = CacheDirFactory.getICacheDir(this.mj.qf()).ri();
        File file = new File(strRi, this.mj.eu().dern());
        if (file.exists() && file.length() > 0) {
            this.lr = true;
        }
        com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(strRi, this.mj);
        lrVarRi.lr(this.mj.tn());
        lrVarRi.lr(this.jbs.getWidth());
        lrVarRi.ik(this.jbs.getHeight());
        lrVarRi.ik(this.mj.yjg());
        lrVarRi.ri(j);
        lrVarRi.ri(z);
        return this.di.ri(lrVarRi);
    }

    public void ri(com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar) {
        try {
            this.fi = false;
            if (co()) {
                ta();
                lr(lrVar);
            } else if (jbs()) {
                ihz();
            }
        } catch (Throwable th) {
            ac.ik("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void ri(boolean z, com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar, boolean z2) {
        if (this.bgr || !(!z2 || z || this.fi)) {
            if (jbs()) {
                ihz();
            } else {
                ta();
                lr(lrVar);
            }
            this.bgr = false;
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri interfaceC0235ri) {
        this.dw = interfaceC0235ri;
    }
}
