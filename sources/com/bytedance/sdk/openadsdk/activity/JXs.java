package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.OY;
import com.bytedance.sdk.openadsdk.core.DY;
import com.bytedance.sdk.openadsdk.core.model.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.NXR;
import com.bytedance.sdk.openadsdk.utils.eK;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends Lxb {
    private static String IeN;
    private static String NXR;
    private static String STP;
    private static String VVE;
    private static String kqm;
    private int DY;
    protected int JXs;
    private String brP;
    int ebl;
    protected int lc;
    private String tD;

    public JXs(LD ld, tD tDVar, int i) {
        super(ld, tDVar, i);
        this.DY = -1;
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
            jSONObject.put("play_start_ts", this.lc);
            jSONObject.put("play_end_ts", this.JXs);
            jSONObject.put("duration", iDY);
            jSONObject.put("user_id", this.brP);
            jSONObject.put("trans_id", eK.Lxb().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            sLN.Lxb("TTAD.RewardAdScene", "", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0078  */
    public void xan() {
        com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN.Lxb lxb = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN.Lxb();
        lxb.Lxb(this.lk.eK.ebl());
        lxb.lk(this.lk.eK.tD());
        lxb.LD(this.lk.eK.JVA());
        lxb.lk(3);
        lxb.ZU(this.lk.eK.brP());
        com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(this.lk.eK.lk(), lxb, this.lk.eK.Lxb());
        com.bytedance.sdk.openadsdk.core.eK.lk(this.lk.lc);
        this.lk.eK.Lxb("skip", false);
        if (this.lk.lk) {
            Lxb(true, 4);
            if (kqm.Lxb(this.lk.LD) && !this.lk.VVE.get()) {
                id();
            }
        } else {
            id();
        }
        com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbSlV = this.lk.LD.SlV();
        if (lxbSlV != null) {
            com.bytedance.sdk.openadsdk.core.sLN.ZU zuLxb = lxbSlV.Lxb();
            long jEbl = this.lk.eK.ebl();
            zuLxb.lc(jEbl);
            zuLxb.JXs(jEbl);
        }
        com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this.lk.LD, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb
    public void LD() {
        this.lk.nJ.Lxb(null, TTAdDislikeToast.getSkipText());
        this.lk.nJ.JXs(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb, com.bytedance.sdk.openadsdk.activity.lc, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void STP() {
        if (this.OY.cR()) {
            int i = com.bytedance.sdk.openadsdk.core.kqm.ZU().foI(String.valueOf(this.lk.lc)).lc;
            if (com.bytedance.sdk.openadsdk.core.model.eK.tD(this.lk.LD)) {
                if ((1.0d - (((double) this.ebl) / this.lk.eK.KPU())) * 100.0d < i) {
                    return;
                }
            } else {
                boolean z = (1.0f - (this.lk.CSn.LD() / ((float) this.lk.LD.Rt()))) * 100.0f >= ((float) i);
                int iLxb = com.bytedance.sdk.openadsdk.core.kqm.ZU().Lxb(String.valueOf(this.lk.lc));
                if (iLxb == 0) {
                    boolean zJXs = this.lk.CSn.lk() ? true : this.lk.hg.sLN().JXs();
                    if (!z || !zJXs) {
                        return;
                    }
                } else if (iLxb != 1 || !z) {
                    return;
                }
            }
            eK();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public boolean a_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public String b_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void c_() {
        Ivz();
    }

    public void eK() {
        if (aH().nBu().getBoolean("reward_verify", false) || aH().STP()) {
            return;
        }
        aH().nBu().putBoolean("reward_verify", true);
        if (com.bytedance.sdk.openadsdk.core.kqm.ZU().VVE(String.valueOf(this.lk.lc))) {
            Lxb(true, this.lk.LD.HD(), this.lk.LD.Sfi(), 0, "");
        } else {
            com.bytedance.sdk.openadsdk.core.kqm.lk().Lxb(nE(), new com.bytedance.sdk.openadsdk.core.tD.LD() { // from class: com.bytedance.sdk.openadsdk.activity.JXs.6
                @Override // com.bytedance.sdk.openadsdk.core.tD.LD
                public void Lxb(int i, String str) {
                    JXs.this.Lxb(false, 0, "", i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.tD.LD
                public void Lxb(DY.LD ld) {
                    boolean z = ld.LD;
                    JXs.this.Lxb(ld.LD, ld.lk.Lxb(), ld.lk.LD(), 0, "");
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb
    public void ebl() {
        KPU();
        if (this.OY.Lxb()) {
            this.lk.id.nBu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb
    public void lk() {
        final View viewNBu = this.lk.BcA.nBu();
        if (viewNBu != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.JXs.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (JXs.this.lk.hg.id() && JXs.this.lk.nBu.get()) {
                        boolean zNXR = JXs.this.lk.CG.NXR();
                        JXs.this.lk.hg.JXs(zNXR);
                        JXs.this.lk.BcA.JXs(8);
                        JXs.this.lk.JJ.sendEmptyMessageDelayed(600, 5000L);
                        if (!tD.lk(JXs.this.lk.LD)) {
                            return;
                        }
                        if (tD.lk(JXs.this.lk.LD) && zNXR) {
                            return;
                        }
                    }
                    if (JXs.this.lk.LD.Njp()) {
                        if (JXs.this.lk.LD.chu()) {
                            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = JXs.this.lk;
                            if (lxb.le != null) {
                                lxb.LD.CG(2);
                                if (JXs.this.lk.le.JXs()) {
                                    return;
                                }
                            }
                        } else if (JXs.this.lk.LD.qK() == 0 && !JXs.this.lk.hg.kqm()) {
                            JXs.this.lk.LD.CG(11);
                            if (JXs.this.lk.hg.ZU()) {
                                JXs.this.lk.LD.CG(12);
                            }
                            try {
                                JXs.this.lk.BcA.kqm();
                                return;
                            } catch (Exception unused) {
                            }
                        }
                    }
                    JXs.this.lk.hg.foI();
                    JXs.this.lk.CG.JVA();
                    JXs.this.lk.KPU.lc();
                    if (com.bytedance.sdk.openadsdk.core.model.eK.ZU(JXs.this.lk.LD)) {
                        JXs.this.Lxb(true, true, (Runnable) null);
                    } else {
                        JXs.this.id();
                    }
                }
            };
            viewNBu.setOnClickListener(onClickListener);
            viewNBu.setTag(viewNBu.getId(), onClickListener);
        }
        this.lk.nJ.Lxb(new com.bytedance.sdk.openadsdk.component.reward.top.LD() { // from class: com.bytedance.sdk.openadsdk.activity.JXs.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void LD(View view) {
                com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = JXs.this.LD;
                if (ld != null && ld.ZU() != null) {
                    JXs.this.LD.ZU().Lxb(JXs.this.lk.Of);
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = JXs.this.lk;
                lxb.Of = !lxb.Of;
                StringBuilder sb = new StringBuilder("will set is Mute ");
                sb.append(JXs.this.lk.Of);
                sb.append(" mLastVolume=");
                sb.append(JXs.this.lk.xan.Lxb());
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = JXs.this.lk;
                lxb2.eK.LD(lxb2.Of);
                if (!com.bytedance.sdk.openadsdk.core.model.eK.tD(JXs.this.lk.LD) || JXs.this.lk.nBu.get()) {
                    if (com.bytedance.sdk.openadsdk.core.model.eK.ebl(JXs.this.lk.LD)) {
                        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = JXs.this.lk;
                        lxb3.xan.Lxb(lxb3.Of, true);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = JXs.this.lk;
                    lxb4.hg.ZU(lxb4.Of);
                    tD tDVar = JXs.this.lk.LD;
                    if (tDVar == null || tDVar.SlV() == null || JXs.this.lk.LD.SlV().Lxb() == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb5 = JXs.this.lk;
                    if (lxb5.eK != null) {
                        if (lxb5.Of) {
                            lxb5.LD.SlV().Lxb().OY(JXs.this.lk.eK.ebl());
                        } else {
                            lxb5.LD.SlV().Lxb().QAg(JXs.this.lk.eK.ebl());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void Lxb(View view) {
                if (JXs.this.lk.LD.uao()) {
                    if (JXs.this.lk.BcA.JVA() != null) {
                        JXs.this.lk.LD.CG(2);
                        JXs.this.lk.BcA.kqm();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = JXs.this.lk;
                if (!lxb.lk && lxb.LD.Njp() && !JXs.this.lk.LD.chu()) {
                    JXs.this.lk.LD.CG(13);
                    try {
                        JXs.this.lk.BcA.kqm();
                        return;
                    } catch (Exception unused) {
                    }
                }
                JXs jXs = JXs.this;
                jXs.Lxb(com.bytedance.sdk.openadsdk.core.model.eK.lk(jXs.lk.LD), false, (Runnable) null);
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
                JXs jXs = JXs.this;
                jXs.lk.nE.Lxb(jXs.LD);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void sLN() {
        eK();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb, com.bytedance.sdk.openadsdk.activity.lc
    public void Lxb(Activity activity, LD.JXs jXs) {
        super.Lxb(activity, jXs);
        if (activity.isFinishing()) {
            return;
        }
        Intent intent = activity.getIntent();
        this.tD = intent.getStringExtra("media_extra");
        this.brP = intent.getStringExtra("user_id");
        try {
            if (VVE == null) {
                VVE = com.bytedance.sdk.component.utils.tD.Lxb(this.lk.NDz, "tt_reward_msg");
                NXR = com.bytedance.sdk.component.utils.tD.Lxb(this.lk.NDz, "tt_msgPlayable");
                IeN = com.bytedance.sdk.component.utils.tD.Lxb(this.lk.NDz, "tt_negtiveBtnBtnText");
                kqm = com.bytedance.sdk.component.utils.tD.Lxb(this.lk.NDz, "tt_postiveBtnText");
                STP = com.bytedance.sdk.component.utils.tD.Lxb(this.lk.NDz, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            sLN.Lxb("TTAD.RewardAdScene", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(int i) {
        if (i == 10000) {
            eK();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public boolean Lxb(long j, boolean z) {
        ebl eblVar;
        if (this.OY.Lxb()) {
            OY oy = this.lk.id;
            if (oy != null && oy.Lxb() != null) {
                eblVar = this.lk.id.Lxb().getAdShowTime();
            } else {
                eblVar = new ebl();
            }
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
            lxb.eK.Lxb(lxb.id.LD(), eblVar);
            HashMap map = new HashMap();
            OY oy2 = this.lk.id;
            if (oy2 != null) {
                map.put("dynamic_show_type", Integer.valueOf(oy2.QAg()));
                JSONObject jSONObjectLxb = this.lk.id.Lxb((JSONObject) null);
                if (jSONObjectLxb != null) {
                    Iterator<String> itKeys = jSONObjectLxb.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            map.put(next, jSONObjectLxb.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
            this.lk.eK.Lxb(new Fo0() { // from class: com.bytedance.sdk.openadsdk.activity.JXs.3
                boolean Lxb;

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void LD(long j2, int i) {
                    ((Lxb) JXs.this).Lxb.removeMessages(300);
                    if (JXs.this.lk.eK.LD()) {
                        JXs.this.JXs();
                        return;
                    }
                    JXs.this.eK();
                    JXs.this.lk.eK.NXR();
                    JXs.this.lk.id.Lxb(true);
                    LD ldAH = JXs.this.aH();
                    JXs jXs = JXs.this;
                    ldAH.Lxb(jXs, jXs.LD(3));
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void Lxb(long j2, int i) {
                    if (this.Lxb) {
                        return;
                    }
                    this.Lxb = true;
                    ((Lxb) JXs.this).Lxb.removeMessages(300);
                    JXs.this.NXR();
                    JXs.this.lk.eK.Lxb(j2, j2);
                    JXs.this.lk.id.LD(true);
                    if (JXs.this.lk.LD.kqm() == 36) {
                        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = JXs.this.lk;
                        if (lxb2.lk) {
                            lxb2.aH.lk().ZU();
                            NXR.LD();
                        }
                    }
                    if (JXs.this.lk.LD.kqm() == 21 && !JXs.this.lk.LD.ZU()) {
                        JXs.this.lk.LD.LD(true);
                        JXs.this.lk.BcA.kqm();
                    }
                    JXs jXs = JXs.this;
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = jXs.lk;
                    if (lxb3.nTb) {
                        LD ldAH = jXs.aH();
                        JXs jXs2 = JXs.this;
                        ldAH.Lxb(jXs2, jXs2.LD(5));
                    } else if (lxb3.lk) {
                        if (!lxb3.LD.MH()) {
                            JXs.this.Lxb(false, 5);
                            if (!tD.JXs(JXs.this.lk.LD)) {
                                JXs.this.lk.eK.Lxb("skip", true);
                            }
                        } else if (JXs.this.lk.id.QAg() == 1) {
                            JXs.this.lk.nJ.lk();
                        }
                    } else if (!lxb3.LD.MH()) {
                        if (!tD.JXs(JXs.this.lk.LD)) {
                            JXs.this.lk.eK.Lxb("skip", true);
                        }
                        JXs.this.id();
                    } else if (JXs.this.lk.id.QAg() == 1) {
                        JXs.this.lk.nJ.lk();
                    }
                    JXs.this.JXs = (int) (System.currentTimeMillis() / 1000);
                    JXs jXs3 = JXs.this;
                    if (jXs3.lk.nTb) {
                        return;
                    }
                    jXs3.eK();
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void Lxb() {
                    ((Lxb) JXs.this).Lxb.removeMessages(300);
                    JXs.this.NXR();
                    JXs.this.eK();
                    LD ldAH = JXs.this.aH();
                    JXs jXs = JXs.this;
                    ldAH.Lxb(jXs, jXs.LD(6));
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void Lxb(long j2, long j3) {
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = JXs.this.lk;
                    if (!lxb2.Ld && lxb2.eK.LD()) {
                        JXs.this.lk.eK.IeN();
                    }
                    if (JXs.this.lk.nBu.get()) {
                        return;
                    }
                    ((Lxb) JXs.this).Lxb.removeMessages(300);
                    if (j2 != JXs.this.lk.eK.OY()) {
                        JXs.this.NXR();
                    }
                    if (JXs.this.lk.eK.LD()) {
                        JXs.this.lk.eK.Lxb(j2, j3);
                        int iNBu = com.bytedance.sdk.openadsdk.core.kqm.ZU().nBu(String.valueOf(JXs.this.lk.lc));
                        boolean z2 = JXs.this.lk.id.OY() && iNBu != -1 && iNBu >= 0;
                        JXs jXs = JXs.this;
                        long j4 = j2 / 1000;
                        jXs.ebl = (int) (jXs.lk.eK.KPU() - j4);
                        int i = (int) j4;
                        if ((JXs.this.lk.DY.get() || JXs.this.lk.JVA.get()) && JXs.this.lk.eK.LD()) {
                            JXs.this.lk.eK.IeN();
                        }
                        JXs jXs2 = JXs.this;
                        int i2 = jXs2.ebl;
                        if (i2 >= 0) {
                            jXs2.lk.nJ.Lxb(String.valueOf(i2), null);
                        }
                        JXs.this.lk.BcA.ZU(i);
                        JXs.this.Lxb(j2, j3);
                        OY oy3 = JXs.this.lk.id;
                        if (oy3 != null && oy3.Lxb() != null) {
                            JXs.this.lk.id.Lxb().setTime(String.valueOf(JXs.this.ebl), i, 0, false);
                        }
                        JXs.this.Lxb((j2 * 1.0f) / j3);
                        JXs jXs3 = JXs.this;
                        if (jXs3.ebl > 0) {
                            if (z2 && i >= iNBu && jXs3.lk.LD.kqm() != 5) {
                                JXs.this.lk.Lxb(true);
                                JXs jXs4 = JXs.this;
                                jXs4.lk.nJ.Lxb(String.valueOf(jXs4.ebl), TTAdDislikeToast.getSkipText());
                                JXs.this.lk.nJ.JXs(true);
                                return;
                            }
                            JXs jXs5 = JXs.this;
                            jXs5.lk.nJ.Lxb(String.valueOf(jXs5.ebl), null);
                        }
                    }
                }
            });
            boolean zLxb = this.lk.eK.Lxb(j, z, map, this.LD);
            if (zLxb && !z) {
                this.lc = (int) (System.currentTimeMillis() / 1000);
            }
            return zLxb;
        }
        ebl eblVar2 = new ebl();
        eblVar2.Lxb(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.lk;
        lxb2.eK.Lxb(lxb2.BcA.lc(), eblVar2);
        Fo0 fo0 = new Fo0() { // from class: com.bytedance.sdk.openadsdk.activity.JXs.4
            boolean Lxb;

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void LD(long j2, int i) {
                ((Lxb) JXs.this).Lxb.removeMessages(300);
                if (JXs.this.lk.eK.LD()) {
                    JXs.this.JXs();
                    return;
                }
                JXs.this.lk.eK.NXR();
                JXs.this.eK();
                LD ldAH = JXs.this.aH();
                JXs jXs = JXs.this;
                ldAH.Lxb(jXs, jXs.LD(3));
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, int i) {
                com.bytedance.sdk.openadsdk.utils.sLN sln;
                if (this.Lxb) {
                    return;
                }
                this.Lxb = true;
                ((Lxb) JXs.this).Lxb.removeMessages(300);
                JXs.this.NXR();
                JXs jXs = JXs.this;
                if (!jXs.lk.nTb) {
                    jXs.eK();
                }
                JXs.this.lk.eK.Lxb(j2, j2);
                JXs.this.lk.tD.set(true);
                if (JXs.this.lk.LD.ZE()) {
                    JXs.this.lk.LD.CG(1);
                    JXs.this.lk.BcA.kqm();
                }
                if (JXs.this.lk.LD.kqm() == 21 && !JXs.this.lk.LD.ZU()) {
                    JXs.this.lk.LD.LD(true);
                    JXs.this.lk.BcA.kqm();
                }
                JXs.this.JXs = (int) (System.currentTimeMillis() / 1000);
                JXs jXs2 = JXs.this;
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = jXs2.lk;
                if (lxb3.nTb) {
                    LD.JXs jXsLD = jXs2.LD(5);
                    jXsLD.JXs = true;
                    JXs.this.aH().Lxb(JXs.this, jXsLD);
                    return;
                }
                if (kqm.ZU(lxb3.LD) || kqm.LD(JXs.this.lk.LD) || kqm.JXs(JXs.this.lk.LD)) {
                    JXs.this.Lxb(false, 5);
                    if (!kqm.LD(JXs.this.lk.LD) || (sln = JXs.this.lk.MGT) == null) {
                        return;
                    }
                    sln.Lxb(0L);
                    return;
                }
                if (kqm.Lxb(JXs.this.lk.LD) && !JXs.this.lk.VVE.get()) {
                    JXs.this.lk.Lxb(true);
                    JXs.this.lk.nJ.JXs(true);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = JXs.this.lk;
                if (!lxb4.lk) {
                    if (lxb4.LD.MH()) {
                        JXs.this.lk.nJ.lk();
                        return;
                    }
                    if (!tD.JXs(JXs.this.lk.LD)) {
                        JXs.this.lk.eK.Lxb("skip", true);
                    }
                    JXs.this.id();
                    return;
                }
                if (lxb4.LD.MH()) {
                    JXs.this.lk.nJ.lk();
                    return;
                }
                JXs.this.Lxb(false, 5);
                if (tD.JXs(JXs.this.lk.LD)) {
                    return;
                }
                JXs.this.lk.eK.Lxb("skip", true);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb() {
                ((Lxb) JXs.this).Lxb.removeMessages(300);
                JXs.this.NXR();
                JXs.this.eK();
                LD ldAH = JXs.this.aH();
                JXs jXs = JXs.this;
                ldAH.Lxb(jXs, jXs.LD(6));
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = JXs.this.lk;
                if (!lxb3.Ld && lxb3.eK.LD()) {
                    JXs.this.lk.eK.IeN();
                }
                if (JXs.this.lk.nBu.get()) {
                    return;
                }
                ((Lxb) JXs.this).Lxb.removeMessages(300);
                if (j2 != JXs.this.lk.eK.OY()) {
                    JXs.this.NXR();
                }
                JXs.this.lk.eK.Lxb(j2, j3);
                JXs jXs = JXs.this;
                long j4 = j2 / 1000;
                double d = j4;
                jXs.ebl = (int) (jXs.lk.eK.KPU() - d);
                JXs jXs2 = JXs.this;
                int i = jXs2.ebl;
                if (i >= 0) {
                    jXs2.lk.nJ.Lxb(String.valueOf(i), null);
                }
                JXs jXs3 = JXs.this;
                jXs3.ebl = (int) (jXs3.lk.eK.KPU() - d);
                int i2 = (int) j4;
                int iNBu = com.bytedance.sdk.openadsdk.core.kqm.ZU().nBu(String.valueOf(JXs.this.lk.lc));
                boolean z2 = iNBu >= 0;
                if ((JXs.this.lk.DY.get() || JXs.this.lk.JVA.get()) && JXs.this.lk.eK.LD()) {
                    JXs.this.lk.eK.IeN();
                }
                JXs.this.lk.BcA.ZU(i2);
                JXs.this.Lxb(j2, j3);
                JXs.this.Lxb((j2 * 1.0f) / j3);
                JXs jXs4 = JXs.this;
                if (jXs4.ebl > 0) {
                    jXs4.lk.nJ.ZU(true);
                    if (z2 && i2 >= iNBu) {
                        JXs.this.lk.Lxb(true);
                        JXs jXs5 = JXs.this;
                        jXs5.lk.nJ.Lxb(String.valueOf(jXs5.ebl), TTAdDislikeToast.getSkipText());
                        JXs.this.lk.nJ.JXs(true);
                        return;
                    }
                    JXs jXs6 = JXs.this;
                    jXs6.lk.nJ.Lxb(String.valueOf(jXs6.ebl), null);
                }
            }
        };
        this.lk.eK.Lxb(fo0);
        kqm kqmVar = this.lk.BcA.IeN;
        if (kqmVar != null) {
            kqmVar.Lxb(fo0);
        }
        boolean zLxb2 = this.lk.eK.Lxb(j, z, null, this.LD);
        if (zLxb2 && !z) {
            this.lc = (int) (System.currentTimeMillis() / 1000);
        }
        return zLxb2;
    }

    public void Lxb(long j, long j2) {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        if (lxb.nTb) {
            return;
        }
        long j3 = (((long) lxb.JZE) * 1000) + j;
        if (this.DY == -1) {
            this.DY = com.bytedance.sdk.openadsdk.core.kqm.ZU().foI(String.valueOf(this.lk.lc)).lc;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS && j3 >= 27000) {
            eK();
        } else if ((j3 * 100) / j2 >= this.DY) {
            eK();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Lxb(final boolean z, boolean z2, final Runnable runnable) {
        if (!z2 && aH().nBu().getBoolean("user_has_give_up_reward", false) && (com.bytedance.sdk.openadsdk.core.model.eK.OY(this.lk.LD) || runnable != null)) {
            if (runnable == null) {
                xan();
            }
            return false;
        }
        if (!com.bytedance.sdk.openadsdk.core.kqm.ZU().OY(String.valueOf(this.lk.lc))) {
            if (runnable == null) {
                if (z) {
                    id();
                    return false;
                }
                xan();
            }
            return false;
        }
        if (aH().nBu().getBoolean("reward_verify", false)) {
            if (runnable == null) {
                if (com.bytedance.sdk.openadsdk.core.model.eK.OY(this.lk.LD)) {
                    xan();
                    return false;
                }
                if (z) {
                    id();
                    return false;
                }
                xan();
            }
            return false;
        }
        this.lk.DY.set(true);
        this.lk.eK.IeN();
        if (z) {
            this.lk.CSn.STP();
        }
        final com.bytedance.sdk.openadsdk.core.widget.LD ld = new com.bytedance.sdk.openadsdk.core.widget.LD(CSn());
        this.LD.NXR = ld;
        if (z) {
            ld.Lxb(NXR).LD(STP).lk(IeN);
        } else {
            ld.Lxb(VVE).LD(kqm).lk(IeN);
        }
        this.LD.NXR.Lxb(new com.bytedance.sdk.openadsdk.core.widget.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.JXs.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.LD.Lxb
            public void LD() {
                ld.dismiss();
                JXs.this.aH().nBu().putBoolean("user_has_give_up_reward", true);
                JXs.this.lk.DY.set(false);
                JXs.this.lk.CSn.lc(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                if (!z) {
                    JXs.this.xan();
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.eK.OY(JXs.this.lk.LD)) {
                    if (JXs.this.lk.CSn.Lxb()) {
                        JXs.this.lk.CSn.Lxb(5);
                        return;
                    } else {
                        JXs.this.xan();
                        return;
                    }
                }
                JXs.this.lk.KPU.lc();
                if (JXs.this.lk.CSn.Lxb()) {
                    JXs.this.lk.CSn.Lxb(4);
                }
                JXs.this.id();
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.LD.Lxb
            public void Lxb() {
                JXs.this.lk.eK.STP();
                if (z) {
                    JXs.this.lk.CSn.JXs(1000);
                }
                ld.dismiss();
                JXs.this.lk.DY.set(false);
            }
        }).show();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.lk.FGm != null && aH().lc() == null && Lxb(com.bytedance.sdk.openadsdk.core.model.eK.lk(this.lk.LD), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.JXs.7
            @Override // java.lang.Runnable
            public void run() {
                JXs.super.Lxb(str, jSONObject);
            }
        })) {
            return;
        }
        super.Lxb(str, jSONObject);
    }
}
