package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.bgr;
import com.bytedance.sdk.openadsdk.common.slm;
import com.bytedance.sdk.openadsdk.component.reward.co;
import com.bytedance.sdk.openadsdk.core.ay;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.nr;
import com.bytedance.sdk.openadsdk.ka.qt;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.su;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mj implements com.bytedance.sdk.openadsdk.core.bgr.ka.lr {
    public boolean aw;
    public String bgr;
    public boolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f18078co;
    protected wjv di;
    private nr ik;
    protected com.bytedance.sdk.openadsdk.component.reward.ri.ri jbs;
    private boolean lr;
    protected boolean nr;
    public int qt;
    private boolean ri;
    public int sf;
    protected slm tan;
    public String vr;
    protected final lr xha;
    protected final AtomicBoolean mj = new AtomicBoolean(false);
    public boolean slm = false;

    public mj(lr lrVar, wjv wjvVar, int i, int i2, boolean z) {
        this.xha = lrVar;
        this.di = wjvVar;
        this.qt = i;
        this.sf = i2;
        this.bu = z;
    }

    private Runnable ihz() {
        return new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.2
            @Override // java.lang.Runnable
            public void run() {
                mj.this.feb();
            }
        };
    }

    private slm mj() {
        return new slm(this.jbs) { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.1
            @Override // com.bytedance.sdk.openadsdk.common.slm
            public void ik() {
                mj.this.feb();
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            public boolean lr() {
                return mj.this.xha.co().getBoolean("reward_verify", false) || mj.this.xha.bu();
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            public boolean ri() {
                return mj.this.xha.aw();
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            public void ri(boolean z) {
                mj.this.xha.lr(z);
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            public void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
                mj.this.ri(riVar);
            }
        };
    }

    private com.bytedance.sdk.openadsdk.common.ri.lr wjv() {
        return new com.bytedance.sdk.openadsdk.common.ri.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.3
            @Override // com.bytedance.sdk.openadsdk.common.ri.lr
            public void ri(boolean z, int i) {
                mj mjVar = mj.this;
                if (mjVar instanceof ri) {
                    ((ri) mjVar).ri(z, i);
                } else if (mjVar instanceof fi) {
                    mjVar.sf();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.ri.lr
            public void ri() {
                mj.this.feb();
            }
        };
    }

    private com.bytedance.sdk.openadsdk.common.ri.InterfaceC0226ri zf() {
        return new com.bytedance.sdk.openadsdk.common.ri.InterfaceC0226ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.4
            @Override // com.bytedance.sdk.openadsdk.common.ri.InterfaceC0226ri
            public void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, View view) {
                mj.this.lr(riVar);
            }
        };
    }

    public void a_() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar;
        lr lrVar = this.xha;
        boolean z = lrVar != null && lrVar.ik();
        if (z && (riVar = this.jbs) != null && !(riVar.ajz instanceof di)) {
            this.tan = mj();
        }
        if (z) {
            ri(this.tan);
        }
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.ri.ri ay();

    public boolean b_() {
        return false;
    }

    public void bnj() {
        ik(0);
    }

    public abstract boolean c_();

    public abstract String d_();

    public void di(boolean z) {
        this.nr = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void dzy() {
        ik(2);
    }

    public abstract void e_();

    public abstract boolean f_();

    public void fe() {
        lr lrVar = this.xha;
        if (lrVar == null || lrVar.tan()) {
            return;
        }
        this.xha.slm();
        this.xha.ihz();
    }

    public void feb() {
        if (this.di != null) {
            com.bytedance.sdk.openadsdk.di.lr.ri().ri("videoForceBreak", this.di);
        }
        this.xha.xha();
    }

    public void fi(boolean z) {
        this.lr = z;
    }

    public boolean fr() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public final void gcp() {
        wjv wjvVar;
        ta();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar == null || (wjvVar = riVar.lr) == null) {
            return;
        }
        wjvVar.qx();
        this.jbs.lr.ka(true);
        if (wjv.fi(this.jbs.lr)) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.jbs;
            wjv wjvVar2 = riVar2.lr;
            com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar2, riVar2.fi, wjvVar2.hp());
        }
    }

    public boolean hcw() {
        return false;
    }

    public boolean ig() {
        lr lrVar = this.xha;
        return lrVar != null && lrVar.ri(this, this.qt);
    }

    public void ik() {
    }

    public abstract void ik(boolean z);

    public lr jc() {
        return this.xha;
    }

    public void ka() {
    }

    public Activity kt() {
        return this.xha.mj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void lr(int i) {
    }

    public void nd() {
        if (qd() || ay() == null || ay().pv == null || !ay().lr.tl()) {
            return;
        }
        nr nrVar = new nr(ay(), new nr.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
            public void di() {
                mj.this.ka(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
            public void fi() {
                mj.this.ka(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
            public void ik() {
                lr lrVar = mj.this.xha;
                if (lrVar != null) {
                    lrVar.hcw();
                }
                mj.this.ka(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
            public int ka() {
                lr lrVar = mj.this.xha;
                if (lrVar != null) {
                    return lrVar.oh();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
            public void lr() {
                lr lrVar = mj.this.xha;
                if (lrVar != null) {
                    lrVar.ory();
                }
                mj.this.ka(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
            public void ri() {
                mj mjVar = mj.this;
                mjVar.ik(mjVar.ay());
            }
        });
        this.ik = nrVar;
        nrVar.ri(ay().pv);
    }

    public boolean oh() {
        return false;
    }

    public boolean qd() {
        return this.bu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void qh() {
        lr lrVar = this.xha;
        if (lrVar != null) {
            lrVar.ri(this, true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void qt() {
        toString();
        fe();
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.view.mj ri();

    public void ri(Activity activity) {
    }

    public abstract void ri(Activity activity, lr.fi fiVar);

    public abstract void ri(String str);

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public List<wjv> rzk() {
        return this.xha.zf();
    }

    public JSONObject siy() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("media_extra", this.vr);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("user_id", this.bgr);
            jSONObject.put("trans_id", su.ri().replace("-", ""));
            if (ay() != null) {
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVarAy = ay();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, (int) riVarAy.ihz.igq());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, riVarAy.lr.saa());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, riVarAy.lr.pc());
                jSONObject.put("network", com.bytedance.sdk.component.utils.nr.ik(riVarAy.srn));
                JSONObject jSONObjectLjo = riVarAy.lr.ljo();
                jSONObjectLjo.put(L6.V0, com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().lr());
                jSONObject.put("extra", jSONObjectLjo);
                jSONObject.put("video_duration", riVarAy.lr.eu().beachfront());
                String strKa = "unKnow";
                int iHd = riVarAy.lr.hd();
                if (iHd == 2) {
                    strKa = ig.lr();
                } else if (iHd == 1) {
                    strKa = ig.ka();
                }
                jSONObject.put("user_agent", strKa);
            }
            return jSONObject;
        } catch (Throwable th) {
            ac.ri("Scene", "", th);
            return null;
        }
    }

    public int srn() {
        return this.sf;
    }

    public final void ta() {
        this.xha.bgr();
    }

    public void tan() {
        nr nrVar = this.ik;
        if (nrVar != null) {
            nrVar.mj();
            this.ik = null;
        }
        this.ri = false;
    }

    public void tnn() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar;
        co coVar;
        if (!c_() || (riVar = this.jbs) == null || (coVar = riVar.zk) == null) {
            return;
        }
        coVar.ka();
    }

    public boolean tw() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVarAy;
        nr nrVar;
        if (qd() || (riVarAy = ay()) == null || !riVarAy.lr.tl() || (nrVar = this.ik) == null) {
            return false;
        }
        return nrVar.ri(riVarAy.ig);
    }

    public abstract boolean uq();

    public void whw() {
        com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(this.di.qf()).ri(), this.di);
        lrVarRi.ri("material_meta", this.di);
        lrVarRi.ri("ad_slot", this.di.eb());
        com.bytedance.sdk.openadsdk.core.bgr.fi.ri.ri(lrVarRi, new laky.attabal() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.6
            @Override // laky.saneness.attabal
            public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i) {
            }

            @Override // laky.saneness.attabal
            public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i, String str) {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void xd() {
        ta();
    }

    public boolean xm() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void zb() {
        if (ay() != null) {
            ay().su.ri();
        }
    }

    public boolean zyn() {
        wjv wjvVarRi = this.xha.ri();
        if (wjvVarRi != null) {
            List<wjv> listLsq = wjvVarRi.lsq();
            for (int i = 0; i < listLsq.size(); i++) {
                wjv wjvVar = listLsq.get(i);
                if (wjvVar != null && wjvVar.feb()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void ik(final int i) {
        if (!this.xha.co().getBoolean("reward_verify", false) && !this.xha.bu() && !this.xha.aw()) {
            this.xha.co().putBoolean("reward_verify", true);
            if (ay() != null) {
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVarAy = ay();
                if (com.bytedance.sdk.openadsdk.core.nr.ka().slm(String.valueOf(riVarAy.di))) {
                    ri(true, riVarAy.lr.pc(), riVarAy.lr.saa(), 0, "", i);
                } else {
                    com.bytedance.sdk.openadsdk.core.nr.ik().ri(siy(), new com.bytedance.sdk.openadsdk.core.wjv.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.5
                        @Override // com.bytedance.sdk.openadsdk.core.wjv.lr
                        public void ri(int i2, String str) {
                            mj.this.ri(false, 0, "", i2, str, i);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.wjv.lr
                        public void ri(ay.lr lrVar) {
                            mj.this.ri(lrVar.lr, lrVar.ik.ri(), lrVar.ik.lr(), 0, "", i);
                        }
                    });
                }
            }
        }
    }

    public void ka(int i) {
        lr lrVar = this.xha;
        if (lrVar != null) {
            lrVar.ri(i);
        }
    }

    public final void lr(Activity activity, lr.fi fiVar) {
        if (this.ri) {
            return;
        }
        this.ri = true;
        ri(activity, fiVar);
    }

    public void ri(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(Bundle bundle) {
    }

    public void ri(mj mjVar, mj mjVar2, lr.fi fiVar) {
    }

    public void lr(Activity activity) {
        if (com.bytedance.sdk.openadsdk.wjv.fi.mj() && activity != null && activity.isChangingConfigurations()) {
            lr lrVar = this.xha;
            if (lrVar == null || lrVar.ri() == null) {
                return;
            }
            qt.ri(this.xha.ri(), "close_interception_config_change", this.xha.ri().fi(), (String) null);
            return;
        }
        Objects.toString(this.xha);
        if (!this.xha.tan() && !zyn()) {
            long jJbs = this.xha.ri().jbs();
            if (jJbs > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jJbs;
                if (jElapsedRealtime > 0) {
                    this.di.lr(jElapsedRealtime);
                }
            }
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVarAy = ay();
            if (riVarAy != null) {
                riVarAy.ri(BackupConstant.CLOSE_NOT_SHOW_ONE_TO_N_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1004);
                riVarAy.su.ri();
            }
        }
        tnn();
        this.xha.vr();
    }

    public void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
    }

    public void ri(Map<String, Object> map, float f, float f2) {
    }

    private void ri(slm slmVar) {
        com.bytedance.sdk.openadsdk.common.ri.lr(new bgr.ri(this.jbs, "BVA", ihz(), wjv()).ri(b_()).ri(slmVar).ri(zf()).ri());
    }

    public void ik(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        if (ig()) {
            return;
        }
        lr.fi fiVar = new lr.fi(8, riVar);
        fiVar.ka = riVar.zyn;
        lr lrVar = this.xha;
        if (lrVar != null) {
            lrVar.lr(this, fiVar);
        }
    }

    public void ri(boolean z, boolean z2, boolean z3, int i) {
        this.xha.ri(this, z, z2, z3, i);
    }

    public final void ri(boolean z, int i, String str, int i2, String str2, int i3) {
        if (this.xha.bu()) {
            return;
        }
        this.xha.ri(this, z, i, str, i2, str2, i3);
        co.ri(this.di, z, i3);
    }

    public void ac() {
    }

    public void aw() {
    }

    public void bgr() {
    }

    public void igq() {
    }

    public void pv() {
    }

    public void lr(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        if (riVar == null) {
            return;
        }
        try {
            int iOh = this.xha.oh();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", Math.max(iOh, 0));
            com.bytedance.sdk.openadsdk.ka.ik.fi(this.di, riVar.fi, jSONObject);
        } catch (Throwable unused) {
        }
        ik(riVar);
    }

    public void ri(wjv wjvVar, int i, int i2) {
        this.di = wjvVar;
        this.qt = i;
        this.sf = i2;
    }
}
