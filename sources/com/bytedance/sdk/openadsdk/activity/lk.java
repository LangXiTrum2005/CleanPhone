package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.component.reward.LD.ebl;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.JVA;
import com.bytedance.sdk.openadsdk.component.reward.view.OY;
import com.bytedance.sdk.openadsdk.core.DY;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends lc implements aH.Lxb, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD {
    private static String JXs;
    private static String NXR;
    private static String ZU;
    private static String ebl;
    private static String lc;
    private boolean DY;
    private int IeN;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.LD.LD LD;
    protected final aH Lxb;
    private Bundle STP;
    private LD.JXs VVE;
    private String brP;
    private boolean kqm;
    protected com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lk;
    private String tD;

    public lk(LD ld, tD tDVar, int i) {
        super(ld, tDVar, i);
        this.Lxb = new aH(Looper.getMainLooper(), this);
        this.IeN = 0;
        this.DY = true;
        Lxb(tDVar, this.STP);
        try {
            VVE();
        } catch (Throwable th) {
            sLN.Lxb("TTAD.EndCardScene", "onCreate: ", th);
            id();
        }
    }

    private void Sfi() {
        final View viewNBu = this.lk.BcA.nBu();
        if (viewNBu != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.lk.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (lk.this.lk.hg.id()) {
                        boolean zNXR = lk.this.lk.CG.NXR();
                        lk.this.lk.hg.JXs(zNXR);
                        lk.this.lk.BcA.JXs(8);
                        View view2 = viewNBu;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.JXs.ZU) {
                            ((com.bytedance.sdk.openadsdk.core.JXs.ZU) view2).setImageResource(com.bytedance.sdk.component.utils.tD.ZU(lk.this.lk.NDz, "tt_close_btn"));
                        }
                        lk.this.lk.JJ.sendEmptyMessageDelayed(600, 5000L);
                        if (!tD.lk(lk.this.lk.LD)) {
                            return;
                        }
                        if (tD.lk(lk.this.lk.LD) && zNXR) {
                            return;
                        }
                    }
                    if (lk.this.lk.LD.Njp()) {
                        if (lk.this.lk.LD.chu()) {
                            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = lk.this.lk;
                            if (lxb.le != null) {
                                lxb.LD.CG(2);
                                if (lk.this.lk.le.JXs()) {
                                    return;
                                }
                            }
                        } else if (lk.this.lk.LD.qK() == 0 && !lk.this.lk.hg.kqm()) {
                            lk.this.lk.LD.CG(11);
                            if (lk.this.lk.hg.ZU()) {
                                lk.this.lk.LD.CG(12);
                            }
                            try {
                                lk.this.lk.BcA.kqm();
                                return;
                            } catch (Exception unused) {
                            }
                        }
                    }
                    lk.this.lk.hg.foI();
                    lk.this.lk.CG.JVA();
                    lk.this.lk.KPU.lc();
                    if (eK.ZU(lk.this.lk.LD) && lk.this.Lxb(true, true)) {
                        return;
                    }
                    lk.this.id();
                }
            };
            viewNBu.setOnClickListener(onClickListener);
            viewNBu.setTag(viewNBu.getId(), onClickListener);
        }
        this.lk.nJ.Lxb(new com.bytedance.sdk.openadsdk.component.reward.top.LD() { // from class: com.bytedance.sdk.openadsdk.activity.lk.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void LD(View view) {
                com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = lk.this.LD;
                if (ld != null && ld.ZU() != null) {
                    lk.this.LD.ZU().Lxb(lk.this.lk.Of);
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = lk.this.lk;
                lxb.Of = !lxb.Of;
                StringBuilder sb = new StringBuilder("will set is Mute ");
                sb.append(lk.this.lk.Of);
                sb.append(" mLastVolume=");
                sb.append(lk.this.lk.xan.Lxb());
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = lk.this.lk;
                lxb2.eK.LD(lxb2.Of);
                if (!eK.tD(lk.this.lk.LD) || lk.this.lk.nBu.get()) {
                    if (eK.ebl(lk.this.lk.LD)) {
                        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = lk.this.lk;
                        lxb3.xan.Lxb(lxb3.Of, true);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = lk.this.lk;
                    lxb4.hg.ZU(lxb4.Of);
                    tD tDVar = lk.this.lk.LD;
                    if (tDVar != null && tDVar.SlV() != null && lk.this.lk.LD.SlV().Lxb() != null) {
                        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb5 = lk.this.lk;
                        if (lxb5.eK != null) {
                            if (lxb5.Of) {
                                lxb5.LD.SlV().Lxb().OY(lk.this.lk.eK.ebl());
                            } else {
                                lxb5.LD.SlV().Lxb().QAg(lk.this.lk.eK.ebl());
                            }
                        }
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb6 = lk.this.lk;
                    lxb6.CSn.lc(lxb6.Of);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void Lxb(View view) {
                lk lkVar = lk.this;
                if (lkVar.Lxb(eK.lk(lkVar.lk.LD), false)) {
                    return;
                }
                if (eK.JXs(lk.this.lk.LD)) {
                    if (eK.nBu(lk.this.lk.LD)) {
                        lk.this.lk.CSn.kqm();
                        return;
                    }
                    View view2 = viewNBu;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        lk.this.id();
                        return;
                    }
                }
                if (eK.OY(lk.this.lk.LD)) {
                    if (lk.this.lk.CSn.Lxb()) {
                        lk.this.lk.CSn.Lxb(5);
                        return;
                    } else {
                        lk.this.lk.hg.OY();
                        return;
                    }
                }
                if (!eK.brP(lk.this.lk.LD) && (!kqm.Lxb(lk.this.lk.LD) || lk.this.lk.VVE.get())) {
                    lk.this.id();
                    return;
                }
                if (!eK.OY(lk.this.lk.LD) && lk.this.lk.CSn.Lxb()) {
                    lk.this.lk.CSn.Lxb(4);
                }
                lk.this.id();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void ZU(View view) {
                View view2 = viewNBu;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void lk(View view) {
                lk lkVar = lk.this;
                lkVar.lk.nE.Lxb(lkVar.LD);
            }
        });
    }

    private void VVE() {
        this.lk.rW.Lxb(this.LD);
        this.LD.Lxb(this, this.Lxb);
        this.LD.JVA();
    }

    private void brP() {
        if (this.kqm) {
            return;
        }
        this.kqm = true;
        this.LD.Lxb(this.sLN);
        Sfi();
    }

    private boolean eK() {
        if (this.lk.nBu.get() && this.lk.ebl) {
            return false;
        }
        if (this.OY.Lxb()) {
            return this.lk.nBu.get();
        }
        return true;
    }

    private JSONObject nE() {
        JSONObject jSONObject = new JSONObject();
        int iDY = (int) this.lk.eK.DY();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.lk.LD.Sfi());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.lk.LD.HD());
            jSONObject.put("network", IeN.lk(this.lk.NDz));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int iBcA = this.lk.LD.BcA();
            String strLk = "unKnow";
            if (iBcA == 2) {
                strLk = nJ.LD();
            } else if (iBcA == 1) {
                strLk = nJ.lk();
            }
            jSONObject.put("user_agent", strLk);
            jSONObject.put("extra", this.lk.LD.Mvg());
            jSONObject.put("media_extra", this.tD);
            jSONObject.put("video_duration", this.lk.LD.JJ().d);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("duration", iDY);
            jSONObject.put("user_id", this.brP);
            jSONObject.put("trans_id", com.bytedance.sdk.openadsdk.utils.eK.Lxb().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            sLN.Lxb("TTAD.EndCardScene", "", th);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public String DY() {
        return this.lk.sRq;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb HD() {
        return this.lk;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void IeN() {
        super.IeN();
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld == null) {
            return;
        }
        ld.HD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final void JVA() {
        if (!this.lk.STP.getAndSet(true) || eK.brP(this.lk.LD)) {
            this.lk.KPU.Lxb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public final void JXs(Activity activity) {
        super.JXs(activity);
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld == null) {
            return;
        }
        ld.DY();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public final void LD(Activity activity) {
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld;
        super.LD(activity);
        if (this.lk == null || (ld = this.LD) == null) {
            return;
        }
        ld.kqm();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        lxb.Ld = true;
        lxb.foI.LD(this.Lxb);
        if (eK()) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.lk;
            lxb2.nJ.Lxb(lxb2.LD.FV());
        }
        this.lk.BcA.IeN();
        this.lk.hg.HD();
        this.lk.CSn.NXR();
        if (this.LD.LD()) {
            this.lk.eK.Lxb(this.LD);
            this.lk.eK.Lxb(false, this, this.IeN != 0);
        }
        this.IeN++;
        OY oy = this.lk.id;
        if (oy != null) {
            oy.ebl();
        }
        this.lk.foI.Lxb(this.Lxb);
        this.LD.tD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final void OY() {
        if (aH() == null) {
            return;
        }
        this.lk.le.Lxb(this.VVE.Lxb.getBoolean("isSkip", false), this.VVE.Lxb.getBoolean("force", false), this.VVE.Lxb.getBoolean("isFromLandingPage", false), this.LD, this.VVE.LD);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final void QAg() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void STP() {
        boolean z = (1.0f - (this.lk.CSn.LD() / ((float) this.lk.LD.Rt()))) * 100.0f >= ((float) com.bytedance.sdk.openadsdk.core.kqm.ZU().foI(String.valueOf(this.lk.lc)).lc);
        int iLxb = com.bytedance.sdk.openadsdk.core.kqm.ZU().Lxb(String.valueOf(this.lk.lc));
        if (iLxb == 0) {
            boolean zJXs = this.lk.CSn.lk() ? true : this.lk.hg.sLN().JXs();
            if (!z || !zJXs) {
                return;
            }
        } else if (iLxb != 1 || !z) {
            return;
        }
        lk();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final void ZU() {
        Ivz();
        this.lk.LD.BK();
        this.lk.LD.Lxb(true);
        if (tD.JXs(this.lk.LD)) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
            tD tDVar = lxb.LD;
            com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, lxb.JXs, tDVar.mhk());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public boolean a_() {
        return this.lk.ZU;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public String b_() {
        return this.lk.JXs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void c_() {
        Ivz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void kqm() {
        super.kqm();
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld != null) {
            ld.eK();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final void lc() {
        KPU();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void lk(Activity activity) {
        super.lk(activity);
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld == null) {
            return;
        }
        ld.Sfi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final View nBu() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void sLN() {
        lk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public boolean tD() {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        return lxb != null && lxb.eK.aH();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(String str, JSONObject jSONObject) {
    }

    public void JXs() {
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld == null) {
            return;
        }
        ld.foI();
        this.lk.le.LD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public boolean Lxb(long j, boolean z) {
        return false;
    }

    public void lk() {
        if (aH().nBu().getBoolean("reward_verify", false) || aH().STP()) {
            return;
        }
        aH().nBu().putBoolean("reward_verify", true);
        if (com.bytedance.sdk.openadsdk.core.kqm.ZU().VVE(String.valueOf(this.lk.lc))) {
            Lxb(true, this.lk.LD.HD(), this.lk.LD.Sfi(), 0, "");
        } else {
            com.bytedance.sdk.openadsdk.core.kqm.lk().Lxb(nE(), new com.bytedance.sdk.openadsdk.core.tD.LD() { // from class: com.bytedance.sdk.openadsdk.activity.lk.3
                @Override // com.bytedance.sdk.openadsdk.core.tD.LD
                public void Lxb(int i, String str) {
                    lk.this.Lxb(false, 0, "", i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.tD.LD
                public void Lxb(DY.LD ld) {
                    lk.this.Lxb(ld.LD, ld.lk.Lxb(), ld.lk.LD(), 0, "");
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public final void Lxb(Activity activity, Bundle bundle) {
        this.STP = bundle;
        super.Lxb(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public final void ZU(Activity activity) {
        super.ZU(activity);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        if (lxb == null) {
            return;
        }
        lxb.hg.hg();
        com.bytedance.sdk.openadsdk.utils.lk.Lxb(activity, this.lk.LD);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public final View Lxb() {
        return this.lk.rW;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void Lxb(Activity activity, LD.JXs jXs) {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb;
        super.Lxb(activity, jXs);
        this.VVE = jXs;
        Intent intent = activity.getIntent();
        this.tD = intent.getStringExtra("media_extra");
        this.brP = intent.getStringExtra("user_id");
        try {
            if (ebl == null) {
                ebl = com.bytedance.sdk.component.utils.tD.Lxb(this.lk.NDz, "tt_reward_msg");
                ZU = com.bytedance.sdk.component.utils.tD.Lxb(this.lk.NDz, "tt_msgPlayable");
                lc = com.bytedance.sdk.component.utils.tD.Lxb(this.lk.NDz, "tt_negtiveBtnBtnText");
                NXR = com.bytedance.sdk.component.utils.tD.Lxb(this.lk.NDz, "tt_postiveBtnText");
                JXs = com.bytedance.sdk.component.utils.tD.Lxb(this.lk.NDz, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            sLN.Lxb("TTAD.EndCardScene", th.getMessage());
        }
        if (jXs != null && (lxb = jXs.lk) != null) {
            this.lk.NXR.set(lxb.NXR.get());
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.lk;
            lxb2.FD = lxb.FD;
            lxb2.STP.set(lxb.STP.get());
            this.lk.eK.Lxb(lxb.eK.Lxb());
        }
        brP();
        OY();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void LD(boolean z) {
        JVA jva;
        long j = this.DY ? this.lk.FD : 0L;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        if (lxb != null && (jva = lxb.KPU) != null) {
            jva.LD(z);
            this.lk.KPU.lk(z);
            if (z && j > 0) {
                this.lk.FD = j;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.lk;
        if (lxb2 != null) {
            com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = lxb2.bG;
            if (ld instanceof com.bytedance.sdk.openadsdk.component.reward.LD.lc) {
                ((com.bytedance.sdk.openadsdk.component.reward.LD.lc) ld).LD(z);
            }
        }
        if (z) {
            this.DY = false;
        }
    }

    private void Lxb(tD tDVar, Bundle bundle) {
        Activity activityCSn = CSn();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = new com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb(activityCSn, this.Lxb, tDVar, this, 2);
        this.lk = lxb;
        lxb.nTb = aH().Lxb();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.lk;
        lxb2.FGm = this;
        lxb2.xan = aH().brP();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.LD.Lxb(this.lk, activityCSn.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ldLxb = ebl.Lxb(this.lk);
        this.LD = ldLxb;
        this.lk.bG = ldLxb;
        Objects.toString(ldLxb);
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public final void Lxb(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld == null) {
            return;
        }
        ld.Lxb(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(boolean z) {
        if (z) {
            lk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void Lxb(lc lcVar, lc lcVar2, LD.JXs jXs) {
        super.Lxb(lcVar, lcVar2, jXs);
        if (lcVar != null || lcVar2 == this) {
            return;
        }
        if (eK.ebl(this.lk.LD) || com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("ivrv_new_arch_endcard_view_add_at_first", 0) == 1) {
            aH().Lxb(Lxb());
        }
        brP();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Lxb(final boolean z, boolean z2) {
        if (!this.lk.ZU || aH().nBu().getBoolean("reward_verify", false) || aH().STP()) {
            return false;
        }
        if (!z2 && aH().nBu().getBoolean("user_has_give_up_reward", false)) {
            return false;
        }
        if (!com.bytedance.sdk.openadsdk.core.kqm.ZU().OY(String.valueOf(this.lk.lc))) {
            if (!z2) {
                return false;
            }
            if (z) {
                id();
                return true;
            }
        }
        this.lk.DY.set(true);
        if (z) {
            this.lk.CSn.STP();
        }
        final com.bytedance.sdk.openadsdk.core.widget.LD ld = new com.bytedance.sdk.openadsdk.core.widget.LD(this.lk.Pw);
        this.LD.NXR = ld;
        if (z) {
            ld.Lxb(ZU).LD(JXs).lk(lc);
        } else {
            ld.Lxb(ebl).LD(NXR).lk(lc);
        }
        this.LD.NXR.Lxb(new com.bytedance.sdk.openadsdk.core.widget.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.lk.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.LD.Lxb
            public void LD() {
                ld.dismiss();
                lk.this.aH().nBu().putBoolean("user_has_give_up_reward", true);
                lk.this.lk.DY.set(false);
                lk.this.lk.CSn.lc(Integer.MAX_VALUE);
                if (z) {
                    if (eK.OY(lk.this.lk.LD)) {
                        if (lk.this.lk.CSn.Lxb()) {
                            lk.this.lk.CSn.Lxb(5);
                            return;
                        } else {
                            lk.this.lk.hg.OY();
                            return;
                        }
                    }
                    lk.this.lk.KPU.lc();
                    if (lk.this.lk.CSn.Lxb()) {
                        lk.this.lk.CSn.Lxb(4);
                    }
                    lk.this.id();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.LD.Lxb
            public void Lxb() {
                if (z) {
                    lk.this.lk.CSn.JXs(1000);
                }
                ld.dismiss();
                lk.this.lk.DY.set(false);
            }
        }).show();
        return true;
    }
}
