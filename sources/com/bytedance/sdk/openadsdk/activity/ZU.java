package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN;
import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.LD.QAg;
import com.bytedance.sdk.openadsdk.component.reward.view.OY;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.NXR;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends Lxb {
    int JXs;
    private boolean lc;

    public ZU(LD ld, tD tDVar, int i) {
        super(ld, tDVar, i);
    }

    private void JXs(int i) {
        this.lk.nJ.Lxb(null, new SpannableStringBuilder(String.format(com.bytedance.sdk.component.utils.tD.Lxb(kqm.Lxb(), "tt_skip_ad_time_text"), Integer.valueOf(i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZU(int i) {
        int iTD = kqm.ZU().tD(String.valueOf(this.lk.lc));
        if (!kqm.ZU().lc(String.valueOf(this.lk.lc)) || (!tD.JXs(this.lk.LD) && !this.lk.lk)) {
            if (i >= iTD) {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
                if (!lxb.LXE) {
                    lxb.Lxb(true);
                }
                LD();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.lk;
        if (!lxb2.LXE) {
            lxb2.Lxb(true);
        }
        if (i > iTD) {
            LD();
        } else {
            JXs(iTD - i);
            this.lk.nJ.JXs(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.Lxb
    public void LD() {
        if (tD.JXs(this.lk.LD)) {
            this.lk.nJ.Lxb(null, TTAdDislikeToast.getSkipText());
        } else {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
            if (lxb.lk) {
                this.lk.nJ.Lxb(null, TTAdDislikeToast.getSkipText());
            } else {
                lxb.nJ.Lxb(null, "X");
            }
        }
        this.lk.nJ.JXs(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public boolean a_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public String b_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void c_() {
        if (this.lk.LD.Za() != 100.0f) {
            this.lc = true;
        }
        Ivz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb
    public void ebl() {
        KPU();
        if (this.OY.Lxb()) {
            this.lk.id.nBu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb, com.bytedance.sdk.openadsdk.activity.lc
    public void lk(Activity activity) {
        super.lk(activity);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        if (lxb == null || !LD(lxb.LD) || Lxb(this.lk.LD)) {
            return;
        }
        if (this.lc) {
            this.lc = false;
            id();
        } else if (this.lk.hg.CG()) {
            id();
        }
    }

    private boolean Lxb(tD tDVar) {
        return tDVar == null || tDVar.Za() == 100.0f;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
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
            com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
            if (ld == null || !(ld instanceof QAg)) {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
                lxb.eK.Lxb(lxb.id.LD(), eblVar);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.lk;
                if (!lxb2.Lpq) {
                    lxb2.eK.Lxb(((QAg) ld).Ivz(), eblVar);
                } else {
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.lk;
                    lxb3.eK.Lxb(lxb3.id.LD(), eblVar);
                }
            }
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
            this.lk.eK.Lxb(new Fo0() { // from class: com.bytedance.sdk.openadsdk.activity.ZU.3
                boolean Lxb;

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void LD(long j2, int i) {
                    ((Lxb) ZU.this).Lxb.removeMessages(300);
                    if (ZU.this.lk.eK.LD()) {
                        ZU.this.JXs();
                        return;
                    }
                    ZU.this.lk.eK.NXR();
                    sLN.Lxb("TTAD.AdScene", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                    ZU.this.lk.id.Lxb(true);
                    LD ldAH = ZU.this.aH();
                    ZU zu = ZU.this;
                    ldAH.Lxb(zu, zu.LD(3));
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void Lxb(long j2, int i) {
                    if (this.Lxb) {
                        return;
                    }
                    this.Lxb = true;
                    ((Lxb) ZU.this).Lxb.removeMessages(300);
                    ZU.this.NXR();
                    ZU.this.lk.eK.Lxb(j2, j2);
                    ZU.this.lk.id.LD(true);
                    if (ZU.this.lk.LD.kqm() == 36) {
                        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = ZU.this.lk;
                        if (lxb4.lk) {
                            lxb4.aH.lk().ZU();
                            NXR.LD();
                        }
                    }
                    if (ZU.this.lk.LD.kqm() == 21 && !ZU.this.lk.LD.ZU()) {
                        ZU.this.lk.LD.LD(true);
                        ZU.this.lk.BcA.kqm();
                    }
                    ZU zu = ZU.this;
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb5 = zu.lk;
                    if (lxb5.nTb) {
                        LD.JXs jXsLD = zu.LD(5);
                        jXsLD.JXs = true;
                        ZU.this.aH().Lxb(ZU.this, jXsLD);
                        return;
                    }
                    if (lxb5.lk) {
                        if (lxb5.LD.MH()) {
                            if (ZU.this.lk.id.QAg() == 1) {
                                ZU.this.lk.nJ.lk();
                                return;
                            }
                            return;
                        } else {
                            ZU.this.Lxb(false, 5);
                            if (tD.JXs(ZU.this.lk.LD)) {
                                return;
                            }
                            ZU.this.lk.eK.Lxb("skip", true);
                            return;
                        }
                    }
                    if (tD.JXs(lxb5.LD)) {
                        ZU.this.id();
                        return;
                    }
                    OY oy3 = ZU.this.lk.id;
                    if (oy3 == null || oy3.Lxb() == null) {
                        return;
                    }
                    ZU.this.lk.id.Lxb().setTime("0", 0, 0, false);
                    if (ZU.this.lk.id.OY()) {
                        ZU.this.lk.nJ.Lxb("0", "X");
                        ZU.this.lk.nJ.JXs(true);
                        ZU.this.lk.nJ.lk();
                    }
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void Lxb() {
                    ((Lxb) ZU.this).Lxb.removeMessages(300);
                    ZU.this.NXR();
                    LD ldAH = ZU.this.aH();
                    ZU zu = ZU.this;
                    ldAH.Lxb(zu, zu.LD(6));
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void Lxb(long j2, long j3) {
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = ZU.this.lk;
                    if (!lxb4.Ld && lxb4.eK.LD()) {
                        ZU.this.lk.eK.IeN();
                    }
                    if (ZU.this.lk.nBu.get()) {
                        return;
                    }
                    ((Lxb) ZU.this).Lxb.removeMessages(300);
                    if (j2 != ZU.this.lk.eK.OY()) {
                        ZU.this.NXR();
                    }
                    if (ZU.this.lk.eK.LD()) {
                        ZU.this.lk.eK.Lxb(j2, j3);
                        ZU zu = ZU.this;
                        long j4 = j2 / 1000;
                        zu.JXs = (int) (zu.lk.eK.KPU() - j4);
                        int i = (int) j4;
                        if ((ZU.this.lk.DY.get() || ZU.this.lk.JVA.get()) && ZU.this.lk.eK.LD()) {
                            ZU.this.lk.eK.IeN();
                        }
                        OY oy3 = ZU.this.lk.id;
                        if (oy3 != null && oy3.Lxb() != null) {
                            ZU.this.lk.id.Lxb().setTime(String.valueOf(ZU.this.JXs), i, 0, false);
                        }
                        ZU.this.Lxb((j2 * 1.0f) / j3);
                        if (ZU.this.lk.id.OY() || ZU.this.lk.LD.JP()) {
                            ZU.this.ZU(i);
                            ZU zu2 = ZU.this;
                            if (zu2.JXs >= 0) {
                                zu2.lk.nJ.ZU(true);
                                ZU zu3 = ZU.this;
                                zu3.lk.nJ.Lxb(String.valueOf(zu3.JXs), null);
                            }
                        }
                    }
                }
            });
            return this.lk.eK.Lxb(j, z, map, this.LD);
        }
        ebl eblVar2 = new ebl();
        eblVar2.Lxb(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld2 = this.LD;
        if (ld2 != null && (ld2 instanceof QAg)) {
            this.lk.eK.Lxb(((QAg) ld2).Ivz(), eblVar2);
        } else {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = this.lk;
            lxb4.eK.Lxb(lxb4.BcA.lc(), eblVar2);
        }
        Fo0 fo0 = new Fo0() { // from class: com.bytedance.sdk.openadsdk.activity.ZU.4
            boolean Lxb;

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void LD(long j2, int i) {
                ((Lxb) ZU.this).Lxb.removeMessages(300);
                if (ZU.this.lk.eK.LD()) {
                    ZU.this.JXs();
                    return;
                }
                ZU.this.lk.eK.NXR();
                LD ldAH = ZU.this.aH();
                ZU zu = ZU.this;
                ldAH.Lxb(zu, zu.LD(3));
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, int i) {
                com.bytedance.sdk.openadsdk.utils.sLN sln;
                if (this.Lxb) {
                    return;
                }
                this.Lxb = true;
                ((Lxb) ZU.this).Lxb.removeMessages(300);
                ZU.this.NXR();
                ZU.this.lk.eK.Lxb(j2, j2);
                ZU.this.lk.tD.set(true);
                if (ZU.this.lk.LD.ZE()) {
                    ZU.this.lk.LD.CG(1);
                    ZU.this.lk.BcA.kqm();
                }
                if (ZU.this.lk.LD.kqm() == 21 && !ZU.this.lk.LD.ZU()) {
                    ZU.this.lk.LD.LD(true);
                    ZU.this.lk.BcA.kqm();
                }
                ZU zu = ZU.this;
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb5 = zu.lk;
                if (lxb5.nTb) {
                    LD.JXs jXsLD = zu.LD(5);
                    jXsLD.JXs = true;
                    ZU.this.aH().Lxb(ZU.this, jXsLD);
                    return;
                }
                if (!lxb5.lk) {
                    if (lxb5.LD.MH()) {
                        ZU.this.lk.nJ.lk();
                        return;
                    }
                    if (!tD.JXs(ZU.this.lk.LD)) {
                        ZU.this.lk.eK.Lxb("skip", true);
                    }
                    ZU.this.id();
                    return;
                }
                if (lxb5.LD.MH()) {
                    ZU.this.lk.nJ.lk();
                    return;
                }
                ZU.this.Lxb(false, 5);
                if (com.bytedance.sdk.openadsdk.core.model.kqm.LD(ZU.this.lk.LD) && (sln = ZU.this.lk.MGT) != null) {
                    sln.Lxb(0L);
                }
                if (tD.JXs(ZU.this.lk.LD)) {
                    return;
                }
                ZU.this.lk.eK.Lxb("skip", true);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb() {
                ((Lxb) ZU.this).Lxb.removeMessages(300);
                ZU.this.NXR();
                LD ldAH = ZU.this.aH();
                ZU zu = ZU.this;
                ldAH.Lxb(zu, zu.LD(6));
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb5 = ZU.this.lk;
                if (!lxb5.Ld && lxb5.eK.LD()) {
                    ZU.this.lk.eK.IeN();
                }
                if (ZU.this.lk.nBu.get()) {
                    return;
                }
                ((Lxb) ZU.this).Lxb.removeMessages(300);
                if (j2 != ZU.this.lk.eK.OY()) {
                    ZU.this.NXR();
                }
                ZU.this.lk.eK.Lxb(j2, j3);
                ZU zu = ZU.this;
                long j4 = j2 / 1000;
                zu.JXs = (int) (zu.lk.eK.KPU() - j4);
                int i = (int) j4;
                if ((ZU.this.lk.DY.get() || ZU.this.lk.JVA.get()) && ZU.this.lk.eK.LD()) {
                    ZU.this.lk.eK.IeN();
                }
                ZU.this.ZU(i);
                ZU.this.Lxb((j2 * 1.0f) / j3);
                ZU zu2 = ZU.this;
                int i2 = zu2.JXs;
                if (i2 >= 0) {
                    zu2.lk.nJ.Lxb(String.valueOf(i2), null);
                }
            }
        };
        this.lk.eK.Lxb(fo0);
        com.bytedance.sdk.openadsdk.core.model.kqm kqmVar = this.lk.BcA.IeN;
        if (kqmVar != null) {
            kqmVar.Lxb(fo0);
        }
        return this.lk.eK.Lxb(j, z, null, this.LD);
    }

    private boolean LD(tD tDVar) {
        if (tDVar == null) {
            return false;
        }
        return kqm.ZU().DY(String.valueOf(this.lk.lc));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Lxb
    public void lk() {
        final View viewNBu = this.lk.BcA.nBu();
        if (viewNBu != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.ZU.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ZU.this.lk.hg.id() && ZU.this.lk.nBu.get()) {
                        boolean zNXR = ZU.this.lk.CG.NXR();
                        ZU.this.lk.hg.JXs(zNXR);
                        ZU.this.lk.BcA.JXs(8);
                        ZU.this.lk.JJ.sendEmptyMessageDelayed(600, 5000L);
                        if (!tD.lk(ZU.this.lk.LD)) {
                            return;
                        }
                        if (tD.lk(ZU.this.lk.LD) && zNXR) {
                            return;
                        }
                    }
                    if (ZU.this.lk.LD.Njp()) {
                        if (ZU.this.lk.LD.chu()) {
                            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = ZU.this.lk;
                            if (lxb.le != null) {
                                lxb.LD.CG(2);
                                if (ZU.this.lk.le.JXs()) {
                                    return;
                                }
                            }
                        } else if (ZU.this.lk.LD.qK() == 0 && !ZU.this.lk.hg.kqm()) {
                            ZU.this.lk.LD.CG(11);
                            if (ZU.this.lk.hg.ZU()) {
                                ZU.this.lk.LD.CG(12);
                            }
                            try {
                                ZU.this.lk.BcA.kqm();
                                return;
                            } catch (Exception unused) {
                            }
                        }
                    }
                    ZU.this.lk.hg.foI();
                    ZU.this.lk.CG.JVA();
                    ZU.this.lk.KPU.lc();
                    ZU.this.id();
                }
            };
            viewNBu.setOnClickListener(onClickListener);
            viewNBu.setTag(viewNBu.getId(), onClickListener);
        }
        this.lk.nJ.Lxb(new com.bytedance.sdk.openadsdk.component.reward.top.LD() { // from class: com.bytedance.sdk.openadsdk.activity.ZU.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void LD(View view) {
                ZU zu = ZU.this;
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = zu.lk;
                lxb.Of = !lxb.Of;
                com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = zu.LD;
                if (ld != null && ld.ZU() != null) {
                    ZU.this.LD.ZU().Lxb(ZU.this.lk.Of);
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = ZU.this.lk;
                lxb2.eK.LD(lxb2.Of);
                if (!eK.tD(ZU.this.lk.LD) || ZU.this.lk.nBu.get()) {
                    if (eK.ebl(ZU.this.lk.LD)) {
                        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = ZU.this.lk;
                        lxb3.xan.Lxb(lxb3.Of, true);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = ZU.this.lk;
                    lxb4.hg.ZU(lxb4.Of);
                    tD tDVar = ZU.this.lk.LD;
                    if (tDVar == null || tDVar.SlV() == null || ZU.this.lk.LD.SlV().Lxb() == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb5 = ZU.this.lk;
                    if (lxb5.eK != null) {
                        if (lxb5.Of) {
                            lxb5.LD.SlV().Lxb().OY(ZU.this.lk.eK.ebl());
                        } else {
                            lxb5.LD.SlV().Lxb().QAg(ZU.this.lk.eK.ebl());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void Lxb(View view) {
                if (eK.OY(ZU.this.lk.LD) && (eK.brP(ZU.this.lk.LD) || ZU.this.lk.nBu.get())) {
                    if (ZU.this.lk.CSn.Lxb()) {
                        ZU.this.lk.CSn.Lxb(5);
                        return;
                    } else {
                        ZU.this.lk.hg.OY();
                        return;
                    }
                }
                if (eK.brP(ZU.this.lk.LD) || (com.bytedance.sdk.openadsdk.core.model.kqm.Lxb(ZU.this.lk.LD) && !ZU.this.lk.VVE.get())) {
                    if (!eK.OY(ZU.this.lk.LD) && ZU.this.lk.CSn.Lxb()) {
                        ZU.this.lk.CSn.Lxb(4);
                    }
                    ZU.this.id();
                    return;
                }
                if (ZU.this.lk.LD.uao()) {
                    if (ZU.this.lk.BcA.JVA() != null) {
                        ZU.this.lk.LD.CG(2);
                        ZU.this.lk.BcA.kqm();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = ZU.this.lk;
                if (!lxb.lk && lxb.LD.Njp() && !ZU.this.lk.LD.chu()) {
                    ZU.this.lk.LD.CG(13);
                    try {
                        ZU.this.lk.BcA.kqm();
                        return;
                    } catch (Exception unused) {
                    }
                }
                IeN.Lxb lxb2 = new IeN.Lxb();
                lxb2.Lxb(ZU.this.lk.eK.ebl());
                lxb2.lk(ZU.this.lk.eK.tD());
                lxb2.LD(ZU.this.lk.eK.JVA());
                lxb2.lk(3);
                lxb2.ZU(ZU.this.lk.eK.brP());
                com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(ZU.this.lk.eK.lk(), lxb2, ZU.this.lk.eK.Lxb());
                com.bytedance.sdk.openadsdk.core.eK.lk(ZU.this.lk.lc);
                ZU.this.lk.eK.Lxb("skip", false);
                ZU.this.lk.nJ.ZU(false);
                ZU zu = ZU.this;
                if (zu.lk.lk) {
                    zu.Lxb(true, 4);
                } else {
                    zu.id();
                }
                tD tDVar = ZU.this.lk.LD;
                if (tDVar != null && tDVar.SlV() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = ZU.this.lk;
                    if (lxb3.eK != null) {
                        lxb3.LD.SlV().Lxb().lc(ZU.this.lk.eK.ebl());
                        ZU.this.lk.LD.SlV().Lxb().JXs(ZU.this.lk.eK.ebl());
                    }
                }
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(ZU.this.lk.LD, 5);
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
                ZU zu = ZU.this;
                zu.lk.nE.Lxb(zu.LD);
            }
        });
    }
}
