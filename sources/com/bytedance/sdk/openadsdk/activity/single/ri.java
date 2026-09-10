package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.component.reward.ri.qt;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.vr;
import com.google.android.gms.ads.AdSize;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri extends mj implements igq.ri, com.bytedance.sdk.openadsdk.component.reward.ri.fi.ri {
    private int ac;
    private boolean ay;
    private boolean dw;
    protected boolean fi;
    private long fr;
    private boolean igq;
    private Bundle ihz;
    protected int ik;
    protected boolean ka;
    protected com.bytedance.sdk.openadsdk.component.reward.lr.lr lr;
    protected final igq ri;
    private long su;
    private int uq;
    private boolean wjv;
    private CountDownTimer zf;

    public ri(lr lrVar, wjv wjvVar, int i, int i2, boolean z) {
        super(lrVar, wjvVar, i, i2, z);
        this.ri = new igq(Looper.getMainLooper(), this);
        this.ac = 1;
        this.uq = 0;
        this.wjv = false;
        this.ka = false;
        aac();
    }

    private void aac() {
        this.igq = dw.ik(this.di) && this.di.biu();
        if (this.igq) {
            this.su = ((long) this.di.gy()) * 1000;
        }
    }

    private void ajz() {
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar;
        if (this.di.di() || (lrVar = this.lr) == null) {
            return;
        }
        lrVar.ri(this.jbs.dzy.di());
        this.lr.ay();
    }

    private void pc() {
        if (this.di.di() && !this.wjv) {
            this.wjv = true;
            ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ri.3
                @Override // java.lang.Runnable
                public void run() {
                    float[] fArrRi;
                    if (ri.this.xha.su()) {
                        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = ri.this.jbs;
                        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = ri.this.jbs;
                        fArrRi = new float[]{qd.ik(riVar.ig, riVar.pv.getWidth()), qd.ik(riVar2.ig, riVar2.pv.getHeight())};
                    } else {
                        ri riVar3 = ri.this;
                        fArrRi = riVar3.jbs.fr.ri(riVar3.ac);
                    }
                    if (!ri.this.jbs.igq.ri()) {
                        ri.this.jbs.igq.ri(fArrRi);
                    } else {
                        ri riVar4 = ri.this;
                        riVar4.jbs.igq.ri(riVar4.di);
                    }
                }
            });
        }
    }

    private boolean saa() {
        if (this.di.di()) {
            return this.jbs.jbs.get();
        }
        return true;
    }

    private void xe() {
        this.jbs.pv.ri(this.lr);
        this.lr.ri(this, this.ri);
        this.lr.qt();
    }

    private void yjm() {
        this.lr.fr();
        this.ik = (int) this.jbs.ihz.qd();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar.xe) {
            ri(riVar.su.fi());
            ri(this.jbs.su.ka());
        }
        a_();
        ajz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void ac() {
        super.ac();
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.lr;
        if (lrVar != null) {
            lrVar.ihz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public final void aw() {
        super.aw();
        if (this.jbs == null || com.bytedance.sdk.component.utils.lr.ri(kt())) {
            return;
        }
        this.jbs.ory.fr();
        com.bytedance.sdk.openadsdk.utils.ka.ri(kt(), this.jbs.lr);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public com.bytedance.sdk.openadsdk.component.reward.ri.ri ay() {
        return this.jbs;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void bgr() {
        super.bgr();
        if (this.igq) {
            this.fr = System.currentTimeMillis();
            CountDownTimer countDownTimer = this.zf;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.lr;
        if (lrVar == null) {
            return;
        }
        lrVar.nr();
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = this.jbs.ay;
        if (jbsVar != null) {
            jbsVar.mj();
        }
        if (this.xha.su()) {
            this.jbs.ay.ri(8, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void co() {
        lr lrVar = this.xha;
        if (lrVar == null) {
            return;
        }
        lrVar.lr(this, ri(10));
    }

    public final void di() {
        Message message = new Message();
        message.what = 400;
        if (this.di.qa()) {
            lr(10000);
        }
        this.ri.sendMessageDelayed(message, 2000L);
    }

    public void dw() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar != null && riVar.ihz.jbs()) {
            this.jbs.ihz.ihz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void fi() {
        lr lrVar = this.xha;
        if (lrVar != null) {
            lrVar.ri(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public boolean fr() {
        return this.jbs.ay.jbs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public boolean hcw() {
        return this.di.hpn() == 10 && !fr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void igq() {
        com.bytedance.sdk.openadsdk.component.reward.view.ik ikVarRi;
        super.igq();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar == null || (ikVarRi = riVar.ay.ri()) == null || !ikVarRi.wjv()) {
            return;
        }
        zb();
    }

    public void ihz() {
        if (this.ay) {
            return;
        }
        this.ay = true;
        whw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void ik() {
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar;
        super.ik();
        if (this.jbs == null || (lrVar = this.lr) == null) {
            return;
        }
        lrVar.vr();
        this.jbs.tnn = true;
        if (saa()) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
            riVar.oh.ri(riVar.lr.nlk());
        }
        this.jbs.dzy.vr();
        this.jbs.ory.bu();
        this.jbs.wjv.fi();
        if (this.lr.lr()) {
            this.jbs.ihz.ri(this.lr);
            if (this.jbs.ihz.fe()) {
                ri(this.jbs.ihz.vr(), true);
            } else if (this.jbs.ihz.xha() && this.xha.su()) {
                pv();
            } else {
                this.jbs.ihz.ri(false, this, this.uq != 0);
            }
        }
        this.uq++;
        pc();
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = this.jbs.ay;
        if (jbsVar != null) {
            jbsVar.xha();
        }
        this.jbs.fr.ri(this.ri);
        if (this.xha.su()) {
            this.jbs.ay.ri(0, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.igq) {
            long j = this.fr;
            if (j != 0 && jCurrentTimeMillis - j > this.su) {
                jc().ri(this, ri(8));
                return;
            }
            if (j != 0) {
                this.su -= jCurrentTimeMillis - j;
            }
            ri(this.su);
        }
    }

    public com.bytedance.sdk.openadsdk.ka.xha jbs() {
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar;
        if (!this.di.di()) {
            com.bytedance.sdk.openadsdk.ka.xha xhaVar = new com.bytedance.sdk.openadsdk.ka.xha();
            xhaVar.ri(System.currentTimeMillis(), 1.0f);
            return xhaVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar != null && (jbsVar = riVar.ay) != null && jbsVar.ri() != null) {
            return this.jbs.ay.ri().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.ka.xha xhaVar2 = new com.bytedance.sdk.openadsdk.ka.xha();
        xhaVar2.ri(System.currentTimeMillis(), 1.0f);
        return xhaVar2;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void ka() {
        super.ka();
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.lr;
        if (lrVar == null) {
            return;
        }
        lrVar.tan();
    }

    public abstract void lr();

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void lr(boolean z) {
    }

    public Map<String, Object> mj() {
        wjv wjvVar;
        HashMap map = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar != null && riVar.ay != null && (wjvVar = this.di) != null && wjvVar.ajz() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.jbs.ay.sf()));
            JSONObject jSONObjectRi = this.jbs.ay.ri((JSONObject) null);
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

    public final void nr() {
        this.ri.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public boolean oh() {
        return this.jbs.ay.qt() && !fr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ory() {
        this.ka = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj, com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void qt() {
        super.qt();
        if (this.di.di()) {
            this.jbs.ay.aw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public final void sf() {
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.lr;
        if (lrVar == null) {
            return;
        }
        lrVar.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public final View slm() {
        return this.jbs.ihz.jc();
    }

    public void su() {
        pc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void tan() {
        super.tan();
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.lr;
        if (lrVar == null) {
            return;
        }
        lrVar.lr(this.nr);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public boolean uq() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        return riVar != null && riVar.ihz.xd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public final void vr() {
        this.jbs.ihz.srn();
    }

    public void wjv() {
        this.xha.ri(this, ri(com.bytedance.sdk.openadsdk.ka.lr.C0265lr.lr));
    }

    public abstract FrameLayout xha();

    public void zf() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar == null) {
            return;
        }
        riVar.ihz.slm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ka(boolean z) {
        lr lrVar = this.xha;
        if (lrVar != null) {
            lrVar.ri(this, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public final void ri(Activity activity, Bundle bundle) {
        this.ihz = bundle;
        super.ri(activity, bundle);
        ri(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public final com.bytedance.sdk.openadsdk.component.reward.view.mj ri() {
        return this.jbs.pv;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void ri(Activity activity, lr.fi fiVar) {
        try {
            this.ac = this.di.bbu();
            ri(activity, this.di, this.ihz);
            if (this.jbs.xe && this.di.biu()) {
                this.jbs.zyn = fiVar.ka;
            }
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
            if (riVar.xe && this.qt > 0) {
                riVar.zyn = fiVar.ka;
            }
            xe();
            yjm();
            if (ac.fi(this.di)) {
                nd();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ri("TTAD.AdScene", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.slm.ka.lr();
            feb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void bu() {
    }

    private void ri(Activity activity, wjv wjvVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = new com.bytedance.sdk.openadsdk.component.reward.ri.ri(activity, this.ri, wjvVar, this, 1, this.xha.lr(), this.jbs);
        this.jbs = riVar;
        riVar.xe = this.xha.di();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.jbs;
        riVar2.yjm = this.aw;
        riVar2.qmx = riVar2.xe && ac.fi(wjvVar);
        this.jbs.saa = this.xha.ka();
        this.jbs.pc = this.xha.ay();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = this.jbs;
        riVar3.ajz = this;
        riVar3.dw = this.xha.uq();
        Intent intent = activity.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.ri.lr.ri(this.jbs, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.ri.lr.ri(intent, this.jbs);
            wjvVar.ri(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.jbs.qh) {
            lr();
        }
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVarRi = com.bytedance.sdk.openadsdk.component.reward.lr.di.ri(this.jbs);
        this.lr = lrVarRi;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar4 = this.jbs;
        riVar4.nd = lrVarRi;
        riVar4.xd.ri(this);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar5 = this.jbs;
        if (riVar5.xe) {
            riVar5.ihz.ri(new com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.ri.1
                @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri
                public void ri(int i) {
                    ri riVar6 = ri.this;
                    lr lrVar = riVar6.xha;
                    if (lrVar == null) {
                        return;
                    }
                    lrVar.lr(riVar6, i);
                }
            });
            if (!this.xha.su()) {
                this.xha.ay().setShowSound(wjv.fi(wjvVar));
            }
        }
        vr.ri(this.jbs);
        Objects.toString(this.lr);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void ik(boolean z) {
        qt qtVar;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar == null || (qtVar = riVar.su) == null) {
            return;
        }
        qtVar.lr(z);
        this.jbs.su.ik(z);
    }

    private void ri(com.bytedance.sdk.openadsdk.core.ik.lr lrVar) {
        if (lrVar != null) {
            HashMap map = new HashMap();
            try {
                int i = this.sf + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            lrVar.ri(map);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void ri(Activity activity) {
        super.ri(activity);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar == null) {
            return;
        }
        riVar.fr.ri();
    }

    private void ri(long j) {
        this.zf = new CountDownTimer(j, 1000L) { // from class: com.bytedance.sdk.openadsdk.activity.single.ri.2
            @Override // android.os.CountDownTimer
            public void onFinish() {
                lr lrVarJc = ri.this.jc();
                ri riVar = ri.this;
                lrVarJc.ri(riVar, riVar.ri(8));
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                ri.this.su = j2;
            }
        }.start();
    }

    public final void ri(boolean z, int i) {
        ri(z, false, i);
    }

    public final void ri(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        riVar.xd.ri(z, z2, false, riVar.nd, i);
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.lr;
        if (lrVar == null) {
            return;
        }
        lrVar.ri(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(String str, JSONObject jSONObject) {
        lr lrVar;
        if (str == null || !"skipToNextAd".equals(str) || (lrVar = this.xha) == null) {
            return;
        }
        lrVar.lr(this, ri(7));
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public boolean ri(long j, boolean z) {
        ac acVar;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar == null) {
            return false;
        }
        riVar.ay.lr(false);
        this.fi = false;
        com.bytedance.sdk.openadsdk.ka.xha xhaVarJbs = jbs();
        if (xha() == null) {
            return false;
        }
        this.jbs.ihz.ri(xha(), xhaVarJbs);
        Map<String, Object> mapMj = this.di.di() ? mj() : null;
        euthanasia.attabal.wireman wiremanVar = new euthanasia.attabal.wireman() { // from class: com.bytedance.sdk.openadsdk.activity.single.ri.4
            @Override // euthanasia.attabal.wireman
            public void lr(long j2, int i) {
                ri.this.jbs.ihz.sf();
                ac acVar2 = ri.this.jbs.dzy.vr;
                if (acVar2 != null) {
                    acVar2.qt();
                }
                if (ri.this.jbs.ihz.di()) {
                    ri.this.di();
                    return;
                }
                ri.this.jbs.ihz.ac();
                if (ri.this.di.di()) {
                    ri.this.jbs.ay.ri(true);
                }
                ri riVar2 = ri.this;
                riVar2.xha.ri(riVar2, riVar2.ri(3));
            }

            @Override // euthanasia.attabal.wireman
            public void ri(long j2, int i) {
                ri riVar2 = ri.this;
                if (riVar2.fi) {
                    return;
                }
                riVar2.fi = true;
                boolean zDi = riVar2.di.di();
                ri.this.ri.removeMessages(AdSize.MEDIUM_RECTANGLE_WIDTH);
                ri.this.nr();
                ri.this.jbs.ihz.ri(j2, j2);
                if (zDi) {
                    ri.this.jbs.ay.lr(true);
                } else {
                    ri.this.jbs.slm.set(true);
                }
                if (ri.this.jbs.lr.nd() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = ri.this.jbs;
                    if (riVar3.ik) {
                        riVar3.uq.ik().ri(ri.this.jbs.lr);
                        vr.lr();
                    }
                }
                if (!zDi && ri.this.jbs.lr.ovz()) {
                    ri.this.jbs.lr.ta(1);
                    ri.this.jbs.dzy.bu();
                }
                if (ri.this.jbs.lr.nd() == 21 && !ri.this.jbs.lr.tan()) {
                    ri.this.jbs.lr.fi(true);
                    ri.this.jbs.dzy.bu();
                }
                lr.fi fiVarRi = ri.this.ri(5);
                fiVarRi.fi = true;
                ri riVar4 = ri.this;
                riVar4.xha.ri(riVar4, fiVarRi);
            }

            @Override // euthanasia.attabal.wireman
            public void ri() {
                ri.this.jbs.ihz.sf();
                ri.this.nr();
                ri riVar2 = ri.this;
                riVar2.xha.ri(riVar2, riVar2.ri(6));
            }

            @Override // euthanasia.attabal.wireman
            public void ri(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar;
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = ri.this.jbs;
                if (!riVar2.tnn && riVar2.ihz.di()) {
                    ri.this.jbs.ihz.lr(true);
                }
                if (ri.this.jbs.jbs.get()) {
                    return;
                }
                if (j2 != ri.this.jbs.ihz.bgr()) {
                    ri.this.nr();
                }
                if (!ri.this.jbs.ihz.di()) {
                    ri.this.ri.removeMessages(AdSize.MEDIUM_RECTANGLE_WIDTH);
                    return;
                }
                ri.this.jbs.ihz.ri(j2, j3);
                int i = (int) (j2 / 1000);
                if ((ri.this.jbs.bu.get() || ri.this.jbs.qt.get()) && ri.this.jbs.ihz.di()) {
                    ri.this.jbs.ihz.uq();
                }
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = ri.this.jbs;
                if (riVar3.ka) {
                    riVar3.dzy.fi(i);
                }
                if (ri.this.di.di() && (jbsVar = ri.this.jbs.ay) != null && jbsVar.ri() != null) {
                    ri.this.jbs.ay.ri().setTime(String.valueOf(ri.this.ik), i, 0, false);
                    ri.this.jbs.ay.ri().ri(j2, j3);
                }
                ri.this.ri((j2 * 1.0f) / j3);
                ri.this.jbs.ri(true);
            }
        };
        this.jbs.ihz.ri(wiremanVar);
        if (!this.di.di() && (acVar = this.jbs.dzy.vr) != null) {
            acVar.ri(wiremanVar);
        }
        return this.jbs.ihz.ri(j, z, mapMj, this.lr);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.fi.ri
    public void ri(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar, int i) {
        ri(z, z2, z3, i);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void ri(mj mjVar, mj mjVar2, lr.fi fiVar) {
        super.ri(mjVar, mjVar2, fiVar);
        if (mjVar == this && (mjVar2 instanceof fi)) {
            int i = fiVar.lr;
            if (i == 3) {
                com.bytedance.sdk.openadsdk.component.reward.ri.vr vrVar = this.jbs.ihz;
                vrVar.ri(!vrVar.ig() ? 1 : 0, 2);
            } else if (i == 6) {
                com.bytedance.sdk.openadsdk.component.reward.ri.vr vrVar2 = this.jbs.ihz;
                vrVar2.ri(!vrVar2.ig() ? 1 : 0, !this.jbs.ihz.ig() ? 1 : 0);
            } else if (i == 5 && !wjv.fi(this.jbs.lr) && fiVar.fi) {
                this.jbs.ihz.ri("skip", true);
            }
            this.jbs.oh.ri(false);
            this.jbs.oh.ka(false);
        }
    }

    public void ri(float f) {
        lr lrVar = this.xha;
        if (lrVar == null) {
            return;
        }
        lrVar.ri(f);
        if (this.ay || this.di.nd() == 43 || f < this.di.tnn() / 100.0f) {
            return;
        }
        mj mjVarFr = this.xha.fr();
        if (mjVarFr instanceof ri) {
            ((ri) mjVarFr).ihz();
        }
    }

    public lr.fi ri(int i) {
        lr.fi fiVar = new lr.fi(i, this.jbs);
        fiVar.ka = this.jbs.zyn;
        return fiVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void ri(Map<String, Object> map, float f, float f2) {
        super.ri(map, f, f2);
        this.xha.ri(map, this, f, f2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void ri(wjv wjvVar, int i, int i2) {
        super.ri(wjvVar, i, i2);
        aac();
        this.wjv = false;
        this.dw = true;
    }
}
