package com.bytedance.sdk.openadsdk.component.reward.LD;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.NXR;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.core.model.IeN;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.JVA;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.sLN;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LD extends com.bytedance.sdk.openadsdk.component.reward.LD.Lxb {
    private com.bytedance.sdk.openadsdk.sLN.JXs IeN;
    protected String JVA;
    public com.bytedance.sdk.openadsdk.core.widget.LD NXR;
    public LinearLayout STP;
    protected com.bytedance.sdk.openadsdk.core.LD.JXs sLN;

    public interface Lxb {
        void Lxb(boolean z);
    }

    public LD(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        super(lxb);
    }

    public void CSn() {
        this.sLN = this.Lxb.KPU.lk();
    }

    public void DY() {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        if (lxb == null) {
            return;
        }
        lxb.Ld = false;
        boolean z = lxb.Of;
        if (!lxb.JVA.get()) {
            this.Lxb.eK.nBu();
        }
        VVE();
        this.Lxb.hg.Sfi();
        this.Lxb.CSn.VVE();
        this.Lxb.HD.set(true);
        if (this.Lxb.nBu.get()) {
            this.Lxb.Sfi.set(true);
        }
        sLN sln = this.Lxb.MGT;
        if (sln != null) {
            sln.LD();
        }
        this.Lxb.LD();
    }

    public void HD() {
        com.bytedance.sdk.openadsdk.component.reward.view.OY oy = this.Lxb.id;
        if (oy != null) {
            oy.lc();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.nBu nbu = this.Lxb.BcA;
        if (nbu != null) {
            nbu.STP();
        }
        this.Lxb.eK.CSn();
        if (!JXs()) {
            this.Lxb.nBu.get();
        }
        this.Lxb.hg.VVE();
        this.Lxb.CSn.ebl(com.bytedance.sdk.openadsdk.component.reward.Lxb.OY.Lxb);
        this.Lxb.BcA.sLN();
        this.Lxb.le.lk();
        this.Lxb.foI.LD();
        sLN sln = this.Lxb.MGT;
        if (sln != null) {
            sln.lk();
        }
    }

    public void IeN() {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        if (lxb.ebl) {
            return;
        }
        lxb.nJ.lc();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
        if (lxb2.nTb && (lxb2.FGm instanceof com.bytedance.sdk.openadsdk.activity.Lxb)) {
            return;
        }
        lxb2.BcA.JXs(0);
    }

    public void JVA() {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        lxb.foI.Lxb(lxb.ZU);
        this.Lxb.BcA.LD();
        this.Lxb.le.Lxb();
        if (!this.Lxb.LD.chu()) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
            if (lxb2.ebl && TextUtils.isEmpty(tD.Lxb(lxb2.NDz, this.LD))) {
                sLN();
            }
            this.Lxb.hg.Lxb();
            this.Lxb.CG.Lxb();
        }
        this.Lxb.CSn.IeN();
        this.Lxb.nJ.Lxb();
        if (eK.ebl(this.Lxb.LD)) {
            com.bytedance.sdk.component.QAg.ZU zuNBu = this.Lxb.hg.nBu();
            if (zuNBu != null) {
                zuNBu.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.Lxb.hg.JVA().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.Lxb.nJ.lk(true);
            if (eK.brP(this.Lxb.LD)) {
                this.Lxb.BcA.ZU();
                le.Lxb((View) zuNBu, 4);
                le.Lxb((View) this.Lxb.hg.JVA(), 0);
            }
        }
        if (eK.lc(this.Lxb.LD)) {
            this.Lxb.BcA.ZU();
            le.Lxb((View) this.Lxb.hg.nBu(), 4);
        }
        if (kqm.ZU(this.Lxb.LD) || kqm.LD(this.Lxb.LD) || kqm.JXs(this.Lxb.LD)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.Lxb;
        com.bytedance.sdk.openadsdk.component.reward.view.nBu nbu = lxb3.BcA;
        int iLk = le.lk(lxb3.NDz, lxb3.uxf);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = this.Lxb;
        nbu.Lxb(iLk, le.lk(lxb4.NDz, lxb4.Nu));
        this.Lxb.aH.Lxb();
        if (eK.brP(this.Lxb.LD)) {
            this.Lxb.hg.Lxb(true);
            this.Lxb.hg.JXs();
            Lxb(false, false, false, com.bytedance.sdk.openadsdk.ZU.LD.C0078LD.lk);
        } else {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb5 = this.Lxb;
            if (lxb5.xr) {
                lxb5.BcA.Lxb(0);
            }
        }
    }

    public abstract boolean JXs();

    public boolean KPU() {
        return true;
    }

    public abstract void Lxb(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.Lxb
    public void Lxb(com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld, aH aHVar) {
        super.Lxb(ld, aHVar);
        if (this.Lxb.LD.Lxb()) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            if (lxb.jeq) {
                lxb.hg.Lxb(false);
            }
        }
        if (eK.brP(this.Lxb.LD)) {
            this.Lxb.CSn.sLN();
        }
    }

    public void NXR() {
    }

    public RFEndCardBackUpLayout OY() {
        return new RFEndCardBackUpLayout(this.Lxb.NDz);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x00fd  */
    public View QAg() {
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(this.Lxb.Pw);
        lkVar.setId(STP.Yw);
        View viewLD = com.bytedance.sdk.openadsdk.core.widget.ebl.LD(this.Lxb.Pw);
        viewLD.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = le.lk(this.Lxb.Pw, 20.0f);
        layoutParams.rightMargin = le.lk(this.Lxb.Pw, 16.0f);
        viewLD.setLayoutParams(layoutParams);
        viewLD.setContentDescription(com.bytedance.sdk.component.utils.tD.Lxb(this.Lxb.Pw, "tt_ad_close_text"));
        viewLD.setVisibility(8);
        View pAGLogoView = new PAGLogoView(this.Lxb.Pw);
        pAGLogoView.setId(520093757);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, le.lk(this.Lxb.Pw, 14.0f));
        layoutParams2.gravity = 8388691;
        pAGLogoView.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(this.Lxb.Pw);
        zu.setId(STP.xNP);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(le.lk(this.Lxb.Pw, 32.0f), le.lk(this.Lxb.Pw, 14.0f));
        layoutParams3.gravity = 8388693;
        zu.setLayoutParams(layoutParams3);
        zu.setPadding(le.lk(this.Lxb.Pw, 9.0f), 0, le.lk(this.Lxb.Pw, 9.0f), 0);
        zu.setScaleType(ImageView.ScaleType.FIT_CENTER);
        View jva = new JVA(this.Lxb.Pw);
        jva.setId(STP.JP);
        jva.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        jva.setClickable(true);
        jva.setFocusable(true);
        lkVar.addView(pAGLogoView);
        lkVar.addView(zu);
        lkVar.addView(jva);
        if (this.Lxb.LD.LYC()) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            if (!lxb.nTb || lxb.Lxb != 1) {
                View lkVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.lk(this.Lxb.Pw);
                lkVar2.setId(STP.qK);
                lkVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                lkVar.addView(lkVar2);
            }
        } else {
            View lkVar3 = new com.bytedance.sdk.openadsdk.component.reward.top.lk(this.Lxb.Pw);
            lkVar3.setId(STP.qK);
            lkVar3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            lkVar.addView(lkVar3);
        }
        lkVar.addView(viewLD);
        return lkVar;
    }

    public void STP() {
        com.bytedance.sdk.openadsdk.core.widget.LD ld = this.NXR;
        if (ld == null || !ld.isShowing()) {
            return;
        }
        this.NXR.dismiss();
    }

    public void Sfi() {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        if (lxb == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.nBu nbu = lxb.BcA;
        if (nbu != null) {
            nbu.VVE();
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
        boolean z = lxb2.Of;
        lxb2.xan.Lxb();
        DeviceUtils.ebl();
        this.Lxb.hg.DY();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.Lxb;
        if (lxb3.Of) {
            lxb3.Pw.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.LD.LD.2
                @Override // java.lang.Runnable
                public void run() {
                    if (LD.this.Lxb.xan.Lxb() > 0) {
                        LD.this.Lxb.xan.Lxb(false);
                    }
                }
            });
        }
    }

    public void VVE() {
        this.nBu.removeMessages(300);
    }

    public Lxb ZU() {
        return null;
    }

    public void aH() {
        this.Lxb.nJ.lk();
        this.Lxb.nJ.JXs(true);
    }

    public void brP() {
        int i;
        if (this.Lxb.nBu.get()) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            if (!lxb.ebl && lxb.Sfi.getAndSet(false) && ((i = this.Lxb.OY) >= 0 || i == -1)) {
                Message messageObtain = Message.obtain();
                messageObtain.what = TypedValues.TransitionType.TYPE_DURATION;
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
                messageObtain.arg1 = lxb2.OY;
                lxb2.JJ.sendMessage(messageObtain);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.Lxb;
        if (lxb3.QAg <= 0 || !lxb3.HD.getAndSet(false)) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = TypedValues.Custom.TYPE_INT;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = this.Lxb;
        messageObtain2.arg1 = lxb4.QAg;
        lxb4.JJ.sendMessage(messageObtain2);
    }

    public void eK() {
        int iLxb;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.OY oy;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.STP stp;
        if (com.bytedance.sdk.openadsdk.core.kqm.ZU().Sfi(String.valueOf(this.Lxb.lc)) == 1) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            if (lxb.ZU) {
                iLxb = eK.lk(lxb.LD) ? com.bytedance.sdk.openadsdk.core.kqm.ZU().Lxb(String.valueOf(this.Lxb.lc), true) : com.bytedance.sdk.openadsdk.core.kqm.ZU().nBu(String.valueOf(this.Lxb.lc));
            } else {
                iLxb = eK.lk(lxb.LD) ? com.bytedance.sdk.openadsdk.core.kqm.ZU().Lxb(String.valueOf(this.Lxb.lc), false) : com.bytedance.sdk.openadsdk.core.kqm.ZU().tD(String.valueOf(this.Lxb.lc));
            }
            com.bytedance.sdk.openadsdk.component.reward.view.nBu nbu = this.Lxb.BcA;
            if (nbu != null && nbu.QAg()) {
                com.bytedance.sdk.openadsdk.component.reward.view.nBu nbu2 = this.Lxb.BcA;
                if (nbu2 != null) {
                    nbu2.nBu().performClick();
                    return;
                }
                return;
            }
            if ((!this.Lxb.nBu.get() || eK.lk(this.Lxb.LD)) && iLxb != -1) {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm kqmVar = this.Lxb.eK;
                if (((kqmVar == null || kqmVar.OY() < ((long) iLxb) * 1000) && ((oy = this.Lxb.CSn) == null || !oy.ZU(iLxb))) || (stp = this.Lxb.nJ) == null) {
                    return;
                }
                stp.ZU();
            }
        }
    }

    public abstract void ebl();

    public final void foI() {
        if (this.Lxb.Pw.isFinishing()) {
            return;
        }
        this.Lxb.hg.IeN();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        String str = lxb.ZU ? "reward_endcard" : "fullscreen_endcard";
        lxb.hg.Lxb(this.IeN, str, lxb.dR);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
        lxb2.CSn.Lxb(this.IeN, lxb2.Of);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.Lxb;
        lxb3.hg.Lxb(str, lxb3.dR);
        this.Lxb.hg.JXs();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    public void id() {
        tD tDVar;
        if (!lc() && ((this instanceof OY) || (this instanceof QAg))) {
            this.Lxb.KPU.LD();
            return;
        }
        if (!this.QAg.Lxb(this.JXs.QAg(), false)) {
            this.nBu.removeMessages(300);
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            if (lxb.nTb) {
                com.bytedance.sdk.openadsdk.activity.lc lcVar = lxb.FGm;
                if (lcVar instanceof com.bytedance.sdk.openadsdk.activity.Lxb) {
                    ((com.bytedance.sdk.openadsdk.activity.Lxb) lcVar).Sfi();
                } else {
                    Lxb(com.bytedance.sdk.openadsdk.ZU.LD.C0078LD.Lxb);
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm kqmVar = this.JXs;
                    kqmVar.Lxb(!kqmVar.foI() ? 1 : 0, 4);
                }
            } else {
                Lxb(com.bytedance.sdk.openadsdk.ZU.LD.C0078LD.Lxb);
                com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm kqmVar2 = this.JXs;
                kqmVar2.Lxb(!kqmVar2.foI() ? 1 : 0, 4);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
        if (lxb2 == null || (tDVar = lxb2.LD) == null || lxb2.MGT == null || !tDVar.JP()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.Lxb;
        lxb3.MGT.Lxb(lxb3.eK.DY());
    }

    public void kqm() {
        if (!eK.nBu(this.LD) || this.Lxb.hg.rW()) {
            brP();
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        if (lxb == null) {
            return;
        }
        sLN sln = lxb.MGT;
        if (sln != null) {
            sln.Lxb();
        }
        this.Lxb.Lxb();
    }

    public abstract boolean lc();

    public View nBu() {
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar;
        if (this.LD.nE() != 5) {
            eblVar = new com.bytedance.sdk.openadsdk.core.JXs.ebl(this.Lxb.Pw);
            eblVar.setId(STP.cf);
        } else {
            eblVar = null;
        }
        Objects.toString(eblVar);
        return eblVar;
    }

    public void sLN() {
        LinearLayout linearLayout = (LinearLayout) this.Lxb.rW.findViewById(STP.NXR);
        this.STP = linearLayout;
        le.Lxb((View) linearLayout, 8);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        lxb.ae = new NXR(lxb.Pw, lxb.LD, "landingpage_endcard");
        this.Lxb.ae.lk().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.LD.LD.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LD.this.Lxb.BcA.nBu().performClick();
            }
        });
        this.STP.addView(this.Lxb.ae.JXs(), new LinearLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
        lxb2.hg.Lxb(lxb2.ae);
    }

    public void tD() {
    }

    public void Lxb(com.bytedance.sdk.openadsdk.component.reward.view.ebl eblVar) {
        Lxb(eblVar, this.Lxb);
    }

    public void Lxb(boolean z, boolean z2, boolean z3, int i) {
        this.Lxb.le.Lxb(z, z2, z3, this, i);
    }

    public void Lxb(int i) {
        this.JXs.NXR();
        Lxb(false, true, false, i);
        if (this.Lxb.ZU) {
            this.QAg.Lxb(10000);
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.sLN.JXs jXs) {
        this.IeN = jXs;
        lk();
        if (!this.Lxb.LD.chu() && KPU()) {
            foI();
        }
        if (KPU()) {
            this.Lxb.le.LD();
        }
        if (kqm.ZU(this.Lxb.LD) || kqm.JXs(this.Lxb.LD)) {
            this.nBu.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        lxb.BcA.Lxb(lxb.Sv == 100.0f);
        CSn();
        ebl();
    }

    /* JADX WARN: Code duplicated, block: B:93:0x020f  */
    public void Lxb(Message message) {
        int i = message.what;
        if (i == 1) {
            aH();
            return;
        }
        if (i == 300) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            if (lxb.nTb) {
                com.bytedance.sdk.openadsdk.activity.lc lcVar = lxb.FGm;
                if (lcVar instanceof com.bytedance.sdk.openadsdk.activity.Lxb) {
                    ((com.bytedance.sdk.openadsdk.activity.Lxb) lcVar).Sfi();
                } else {
                    Lxb(com.bytedance.sdk.openadsdk.ZU.LD.C0078LD.LD);
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm kqmVar = this.Lxb.eK;
                    kqmVar.Lxb(!kqmVar.foI() ? 1 : 0, 1 ^ (this.Lxb.eK.foI() ? 1 : 0));
                }
            } else {
                Lxb(com.bytedance.sdk.openadsdk.ZU.LD.C0078LD.LD);
                com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm kqmVar2 = this.Lxb.eK;
                kqmVar2.Lxb(!kqmVar2.foI() ? 1 : 0, 1 ^ (this.Lxb.eK.foI() ? 1 : 0));
            }
            if (this.Lxb.LD.SlV() == null || this.Lxb.LD.SlV().Lxb() == null) {
                return;
            }
            this.Lxb.LD.SlV().Lxb().Lxb(com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb.GENERAL_LINEAR_AD_ERROR);
            return;
        }
        if (i == 400) {
            this.Lxb.eK.NXR();
            Lxb(false, true, false, 3);
            return;
        }
        if (i == 500) {
            if (!eK.ebl(this.Lxb.LD)) {
                this.Lxb.nJ.lk(false);
            }
            com.bytedance.sdk.component.QAg.ZU zuNBu = this.Lxb.hg.nBu();
            if (zuNBu != null && zuNBu.getWebView() != null) {
                zuNBu.QAg();
                zuNBu.getWebView().resumeTimers();
            }
            if (this.Lxb.hg.nBu() != null) {
                this.Lxb.hg.Lxb(1.0f);
                this.Lxb.BcA.Lxb(1.0f);
            }
            if (!this.Lxb.LD.cR() && this.Lxb.eK.LD() && this.Lxb.brP.get()) {
                this.Lxb.eK.NXR();
                return;
            }
            return;
        }
        if (i == 600) {
            IeN();
            return;
        }
        if (i == 700) {
            int i2 = message.arg1;
            if (this.Lxb.Sfi.get()) {
                return;
            }
            if (i2 > 0) {
                this.Lxb.nJ.LD();
                this.Lxb.nJ.Lxb((i2 / 1000) + bc.aH);
                this.Lxb.nJ.JXs(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = TypedValues.TransitionType.TYPE_DURATION;
                messageObtain.arg1 = i2 - 1000;
                this.Lxb.OY -= 1000;
                this.nBu.sendMessageDelayed(messageObtain, 1000L);
                return;
            }
            this.nBu.removeMessages(TypedValues.TransitionType.TYPE_DURATION);
            if (eK.QAg(this.LD)) {
                if (!this.Lxb.CSn.ebl() && this.Lxb.hg.brP()) {
                    aH();
                    return;
                } else {
                    IeN();
                    return;
                }
            }
            IeN();
            return;
        }
        if (i != 800) {
            if (i == 900 && !this.Lxb.HD.get()) {
                int i3 = message.arg1;
                double dKPU = this.Lxb.eK.KPU();
                Lxb(i3, (long) (1000.0d * dKPU));
                if (i3 > 0) {
                    this.Lxb.nJ.LD();
                    this.Lxb.nJ.Lxb((i3 / 1000) + bc.aH);
                    this.Lxb.nJ.JXs(false);
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = TypedValues.Custom.TYPE_INT;
                    int i4 = i3 - 1000;
                    messageObtain2.arg1 = i4;
                    this.Lxb.QAg = i4;
                    this.nBu.sendMessageDelayed(messageObtain2, 1000L);
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
                    if (lxb2.nTb) {
                        com.bytedance.sdk.openadsdk.activity.lc lcVar2 = lxb2.FGm;
                        if (!(lcVar2 instanceof com.bytedance.sdk.openadsdk.activity.Lxb) || dKPU <= 0.0d) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.activity.Lxb) lcVar2).Lxb((float) (1.0d - (((double) (i3 / 1000.0f)) / dKPU)));
                        return;
                    }
                    return;
                }
                this.nBu.removeMessages(TypedValues.Custom.TYPE_INT);
                IeN();
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.Lxb;
                com.bytedance.sdk.openadsdk.activity.lc lcVar3 = lxb3.FGm;
                if (lxb3.nTb && (lcVar3 instanceof com.bytedance.sdk.openadsdk.activity.Lxb)) {
                    lcVar3.aH().Lxb(lcVar3, new com.bytedance.sdk.openadsdk.activity.LD.JXs(5, this.Lxb));
                    return;
                }
                return;
            }
            return;
        }
        if (!eK.ebl(this.Lxb.LD)) {
            this.Lxb.nJ.lk(false);
        }
        this.Lxb.BcA.Lxb(1.0f);
        if (!this.Lxb.LD.cR() && this.Lxb.eK.LD() && this.Lxb.brP.get()) {
            this.Lxb.eK.NXR();
        }
    }

    private void Lxb(long j, long j2) {
        long j3 = j2 - j;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        Activity activity = lxb.Pw;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).Lxb(j3, j2);
            return;
        }
        com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld = lxb.dR;
        if (ld instanceof com.bytedance.sdk.openadsdk.activity.JXs) {
            ((com.bytedance.sdk.openadsdk.activity.JXs) ld).Lxb(j3, j2);
        }
    }

    public static void Lxb(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        final com.bytedance.sdk.openadsdk.core.JXs.ZU zu;
        Context context = frameLayout.getContext();
        if (lxb.jeq) {
            com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
            lkVar.setId(STP.nBu);
            frameLayout.addView(lkVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutLxb = Lxb(context);
            String strLxb = "";
            if (tD.JXs(lxb.LD)) {
                KG kgJJ = lxb.LD.JJ();
                if (kgJJ != null) {
                    strLxb = kgJJ.f;
                }
            } else {
                List<IeN> listUxf = lxb.LD.uxf();
                if (listUxf != null && !listUxf.isEmpty()) {
                    strLxb = listUxf.get(0).Lxb();
                }
            }
            if (TextUtils.isEmpty(strLxb)) {
                zu = null;
            } else {
                zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
                int i = STP.nrJ;
                zu.setId(i);
                zu.setTag(i, strLxb);
                zu.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutLxb.addView(zu);
            }
            lkVar.addView(frameLayoutLxb);
            View lkVar2 = new com.bytedance.sdk.openadsdk.component.reward.view.lk(context);
            lkVar2.setId(STP.sLN);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(lkVar2, layoutParams);
            lkVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.LD.LD.3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = lxb.rW.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = lxb.rW.findViewById(STP.xNP);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = lxb.rW.findViewById(STP.cFD);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.JXs.ZU zu2 = zu;
                    if (zu2 != null) {
                        ViewGroup.LayoutParams layoutParams5 = zu2.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            zu.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
            jXs.setId(STP.NXR);
            jXs.setOrientation(1);
            jXs.setVisibility(8);
            frameLayout.addView(jXs, new FrameLayout.LayoutParams(-1, -1));
        }
        if (lxb.VU) {
            View zu2 = new com.bytedance.sdk.component.QAg.ZU(context, true);
            zu2.setId(STP.STP);
            zu2.setLayerType(2, null);
            zu2.setVisibility(4);
            frameLayout.addView(zu2, new FrameLayout.LayoutParams(-1, -1));
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(STP.IeN);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (eK.LD(lxb.LD)) {
                View lkVar3 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
                lkVar3.setId(STP.XM);
                lkVar3.setVisibility(4);
                frameLayout.addView(lkVar3, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        View zu3 = new com.bytedance.sdk.component.QAg.ZU(context, true);
        zu3.setId(STP.VVE);
        zu3.setVisibility(8);
        frameLayout.addView(zu3, new FrameLayout.LayoutParams(-1, -1));
    }

    public static FrameLayout Lxb(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar.setId(STP.JVA);
        lkVar.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        lkVar.setLayoutParams(layoutParams);
        return lkVar;
    }
}
