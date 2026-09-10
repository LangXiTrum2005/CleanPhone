package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.utils.DY;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    private final com.bytedance.sdk.openadsdk.component.reward.view.lc LD;
    private final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb Lxb;
    private Lxb lk;

    public interface Lxb {
        void Lxb(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.LD.LD ld, int i);

        void VVE();
    }

    public JXs(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        this.Lxb = lxb;
        this.LD = new com.bytedance.sdk.openadsdk.component.reward.view.lc(lxb);
    }

    private int OY() {
        int iMb = this.Lxb.LD.mb();
        if (iMb <= 5000 && iMb >= 0) {
            if (iMb < 1000) {
                iMb += 1000;
            }
            int iLxb = com.bytedance.sdk.openadsdk.core.kqm.ZU().Lxb(this.Lxb.LD.Td());
            if (iLxb <= 5000 && iLxb >= 0) {
                if (iLxb < 1000) {
                    iLxb += 1000;
                }
                return Math.min(iMb, iLxb);
            }
        }
        return -1;
    }

    private void QAg() {
        if (eK.tD(this.Lxb.LD)) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            if (lxb.Of) {
                lxb.nJ.LD(true);
                this.Lxb.xan.Lxb(true);
            }
        }
    }

    public boolean JXs() {
        com.bytedance.sdk.openadsdk.component.reward.view.lc lcVar = this.LD;
        if (lcVar != null) {
            return lcVar.JXs();
        }
        return false;
    }

    public void LD() {
        this.LD.lk();
    }

    public void Lxb() {
        this.LD.Lxb();
    }

    public void ZU() {
        Lxb(true);
    }

    public boolean ebl() {
        return this.LD.lc();
    }

    public Lxb lc() {
        return this.lk;
    }

    public boolean lk(com.bytedance.sdk.openadsdk.component.reward.LD.LD ld) {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb;
        com.bytedance.sdk.openadsdk.utils.sLN sln;
        this.Lxb.OY = OY();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
        int i = lxb2.OY;
        boolean z = false;
        if (lxb2.LD.JXs()) {
            return false;
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.Lxb;
        int i2 = lxb3.OY;
        if (i2 == -1) {
            if (eK.OY(lxb3.LD) && this.Lxb.hg.brP()) {
                ld.aH();
            } else if (eK.nBu(this.Lxb.LD) && this.Lxb.hg.brP()) {
                ld.aH();
            } else {
                ld.IeN();
                z = true;
            }
        } else if (i2 >= 0) {
            lxb3.Sfi.set(false);
            Message messageObtain = Message.obtain();
            messageObtain.what = TypedValues.TransitionType.TYPE_DURATION;
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = this.Lxb;
            messageObtain.arg1 = lxb4.OY;
            lxb4.JJ.sendMessage(messageObtain);
            if (!eK.QAg(this.Lxb.LD)) {
                z = true;
            }
        }
        if (!this.Lxb.hg.id() && z && (sln = (lxb = this.Lxb).MGT) != null) {
            sln.Lxb(lxb.OY);
        }
        return true;
    }

    public void LD(com.bytedance.sdk.openadsdk.component.reward.LD.LD ld) {
        int iPyu = this.Lxb.LD.pyu();
        if (eK.brP(this.Lxb.LD)) {
            iPyu = (this.Lxb.LD.Rt() + 1) * 1000;
        }
        if (iPyu == -1) {
            if (eK.OY(this.Lxb.LD)) {
                if (eK.eK(this.Lxb.LD) && this.Lxb.CSn.ebl()) {
                    ld.IeN();
                    return;
                } else {
                    ld.aH();
                    return;
                }
            }
            ld.IeN();
        } else {
            if (iPyu < 0) {
                return;
            }
            this.Lxb.nJ.ZU(false);
            if (!eK.OY(this.Lxb.LD)) {
                this.Lxb.JJ.sendEmptyMessageDelayed(600, iPyu);
            } else {
                if (!eK.eK(this.Lxb.LD) || !this.Lxb.CSn.ebl()) {
                    this.Lxb.JJ.sendEmptyMessageDelayed(1, iPyu);
                    return;
                }
                this.Lxb.JJ.sendEmptyMessageDelayed(600, iPyu);
            }
        }
        com.bytedance.sdk.openadsdk.utils.sLN sln = this.Lxb.MGT;
        if (sln != null) {
            sln.Lxb(iPyu);
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.LD.JXs jXs) {
        this.LD.Lxb(jXs);
    }

    public void Lxb(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.LD.LD ld, int i) {
        int i2;
        if (this.Lxb != null) {
            com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb("videoForceBreak", this.Lxb.LD);
            com.bytedance.sdk.openadsdk.eK.Lxb.lk.LD(this.Lxb.LD);
        }
        Objects.toString(ld);
        if (this.Lxb.Pw.isFinishing() || ld == null) {
            return;
        }
        this.Lxb.BcA.sLN();
        if (z2) {
            this.Lxb.IeN.set(true);
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        boolean z4 = false;
        if (lxb.jeq && !lxb.VVE.get() && !com.bytedance.sdk.openadsdk.core.model.kqm.QAg(this.Lxb.LD) && (!com.bytedance.sdk.openadsdk.core.model.kqm.LD(this.Lxb.LD) || !this.Lxb.IeN.get() || !this.Lxb.kqm.get())) {
            if ((com.bytedance.sdk.openadsdk.core.model.kqm.LD(this.Lxb.LD) && z3) || !LD(z2)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.model.kqm.LD(this.Lxb.LD) || com.bytedance.sdk.openadsdk.core.model.kqm.ZU(this.Lxb.LD) || com.bytedance.sdk.openadsdk.core.model.kqm.JXs(this.Lxb.LD)) {
                this.Lxb.nJ.lk(false);
                ld.IeN();
                return;
            }
        }
        if (this.Lxb.Pw.isDestroyed() || this.Lxb.Pw.isFinishing()) {
            return;
        }
        if (this.Lxb.LD.JP()) {
            com.bytedance.sdk.openadsdk.component.reward.view.OY oy = this.Lxb.id;
            com.bytedance.sdk.openadsdk.core.OY.lk brandBannerController = (oy == null || oy.Lxb() == null) ? null : oy.Lxb().getBrandBannerController();
            if (brandBannerController != null) {
                brandBannerController.LD();
            }
            this.Lxb.Pw.finish();
            return;
        }
        Lxb lxb2 = this.lk;
        if (lxb2 != null) {
            lxb2.Lxb(z, z2, z3, ld, i);
            return;
        }
        this.Lxb.eK.NXR();
        this.Lxb.hg.KPU();
        this.Lxb.JVA.set(false);
        this.Lxb.sLN.set(false);
        this.Lxb.nE.Lxb();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.Lxb;
        STP stp = lxb3.nJ;
        if (!lxb3.ebl && lxb3.LD.FV()) {
            z4 = true;
        }
        stp.Lxb(z4);
        if (this.Lxb.nBu.getAndSet(true)) {
            return;
        }
        if (eK.LD(this.Lxb.LD)) {
            HashMap map = new HashMap();
            if (this.Lxb.hg.BcA()) {
                i2 = 1;
            } else {
                i2 = !this.Lxb.hg.tD() ? -1 : 2;
            }
            map.put("webview_state", Integer.valueOf(i2));
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = this.Lxb;
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(lxb4.LD, lxb4.JXs, z, z2, z3, lxb4.Pw.isFinishing(), i, map);
        }
        if (this.Lxb.LD.Lxb() && eK.ebl(this.Lxb.LD) && z) {
            this.Lxb.nJ.ZU(true);
        }
        if (eK.ebl(this.Lxb.LD)) {
            this.Lxb.nJ.lk(true);
        }
        QAg();
        if (eK.JXs(this.Lxb.LD)) {
            this.Lxb.nJ.lk(true);
            this.Lxb.BcA.lk();
            com.bytedance.sdk.openadsdk.component.reward.view.OY oy2 = this.Lxb.id;
            if (oy2 != null) {
                oy2.lc();
            }
            this.Lxb.CSn.brP();
            return;
        }
        Lxb(z, ld);
    }

    private boolean LD(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.view.LD ldLxb;
        if (!com.bytedance.sdk.openadsdk.core.model.kqm.lk(this.Lxb.LD) || (ldLxb = this.Lxb.id.Lxb()) == null || ldLxb.ZU != 0 || z) {
            return true;
        }
        this.Lxb.nJ.lk(false);
        return false;
    }

    public void lk() {
        this.LD.ZU();
    }

    public void Lxb(boolean z, com.bytedance.sdk.openadsdk.component.reward.LD.LD ld) {
        IeN ieN;
        if (eK.brP(this.Lxb.LD)) {
            return;
        }
        this.Lxb.brP.set(z);
        ld.STP();
        if (this.Lxb.LD.chu()) {
            this.Lxb.nJ.ZU(false);
        } else {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            lxb.nJ.ZU(eK.brP(lxb.LD));
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
        lxb2.nJ.lk(eK.ebl(lxb2.LD));
        if (this.Lxb.LD.Lxb() && eK.ebl(this.Lxb.LD) && z) {
            this.Lxb.nJ.ZU(true);
        }
        this.Lxb.hg.Ivz();
        com.bytedance.sdk.openadsdk.core.model.kqm kqmVar = this.Lxb.BcA.IeN;
        if (kqmVar != null) {
            kqmVar.JXs();
        }
        this.Lxb.BcA.lk();
        com.bytedance.sdk.openadsdk.component.reward.view.OY oy = this.Lxb.id;
        if (oy != null) {
            oy.lc();
        }
        OY oy2 = this.Lxb.CSn;
        if (oy2 != null) {
            oy2.ebl(OY.LD);
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.Lxb;
        if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.tD.Lxb(lxb3.NDz, lxb3.LD))) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = this.Lxb;
            DY.Lxb(lxb4.Pw, eK.NXR(lxb4.LD), this.Lxb.LD, com.bytedance.sdk.openadsdk.ZU.LD.Lxb.lk);
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.tD.lk(this.Lxb.LD) && (ieN = this.Lxb.CG) != null) {
            ieN.lc();
        }
        if (!com.bytedance.sdk.openadsdk.core.model.tD.Lxb(this.Lxb.LD) && (com.bytedance.sdk.openadsdk.core.model.tD.lk(this.Lxb.LD) || !this.Lxb.hg.Pw())) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb5 = this.Lxb;
            if (com.bytedance.sdk.openadsdk.core.model.tD.Lxb(lxb5.LD, lxb5.hg.brP(), this.Lxb.hg.JJ(), this.Lxb.CG.sLN(), this.Lxb.hg.nE()) || eK.ebl(this.Lxb.LD)) {
                if (!com.bytedance.sdk.openadsdk.core.model.tD.ZU(this.Lxb.LD) && !eK.ebl(this.Lxb.LD) && !com.bytedance.sdk.openadsdk.core.model.tD.lk(this.Lxb.LD)) {
                    this.Lxb.hg.Lxb(true, 0, (String) null);
                }
                if (eK.ebl(this.Lxb.LD)) {
                    if (eK.eK(this.Lxb.LD) && !this.Lxb.hg.BcA()) {
                        if (!this.Lxb.hg.brP()) {
                            if (this.Lxb.CSn.ZU() != null) {
                                this.Lxb.CSn.ZU().Lxb(2);
                            }
                            this.Lxb.CSn.JXs();
                            return;
                        } else {
                            if (this.Lxb.CSn.ZU() != null) {
                                this.Lxb.CSn.ZU().Lxb(-1);
                            }
                            this.Lxb.CSn.lc();
                            this.Lxb.nJ.ZU(false);
                            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb6 = this.Lxb;
                            lxb6.CSn.Lxb(lxb6.KPU.JXs());
                            return;
                        }
                    }
                    if (this.Lxb.hg.BcA() && this.Lxb.CSn.ZU() != null) {
                        this.Lxb.CSn.ZU().Lxb(1);
                    }
                    LD(ld);
                } else {
                    lk(ld);
                }
                Lxb(ld);
                return;
            }
        }
        ZU();
    }

    public void Lxb(com.bytedance.sdk.openadsdk.component.reward.LD.LD ld) {
        this.Lxb.hg.Lxb(0.0f);
        this.Lxb.BcA.Lxb(0.0f);
        if (!com.bytedance.sdk.openadsdk.core.model.tD.lk(this.Lxb.LD)) {
            this.Lxb.CG.Lxb(8);
            this.Lxb.hg.LD(0);
            this.Lxb.hg.dR();
        } else {
            this.Lxb.hg.LD(8);
            this.Lxb.CG.Lxb(0);
            this.Lxb.CG.ebl();
        }
        if (this.Lxb.ebl) {
            le.Lxb((View) ld.STP, 0);
            this.Lxb.BcA.JXs(8);
        }
        this.Lxb.BcA.lk(8);
        this.Lxb.BcA.ebl();
        if (com.bytedance.sdk.openadsdk.core.model.tD.lk(this.Lxb.LD)) {
            this.Lxb.JJ.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        this.Lxb.JJ.sendEmptyMessageDelayed(500, 100L);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        lxb.hg.Lxb(lxb.Of, true);
        this.Lxb.hg.lk(true);
        this.Lxb.hg.LD(true);
        Ivz ivzSLN = this.Lxb.hg.sLN();
        if (ivzSLN != null) {
            ivzSLN.Lxb("prerender_page_show", (JSONObject) null);
        }
    }

    public void Lxb(boolean z) {
        if (!com.bytedance.sdk.openadsdk.core.model.tD.ZU(this.Lxb.LD)) {
            this.Lxb.hg.Lxb(false, 408, "end_card_timeout");
        }
        this.Lxb.hg.xan();
        this.Lxb.hg.LD(8);
        this.Lxb.CG.Lxb(8);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        if (lxb.ebl) {
            le.Lxb((View) lxb.bG.STP, 8);
            this.Lxb.BcA.JXs(0);
        }
        this.Lxb.BcA.lk(8);
        if (this.Lxb.LD.chu()) {
            if (!this.LD.Lxb(this.Lxb.eK)) {
                this.Lxb.Pw.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.lc lcVar = this.Lxb.FGm;
            if (lcVar != null) {
                this.LD.Lxb(lcVar.aH().ebl());
            }
            this.LD.LD();
        }
        this.Lxb.BcA.ebl();
        if (z) {
            lk(this.Lxb.bG);
        }
        this.Lxb.nJ.lk(false);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
        lxb2.KPU.Lxb(lxb2.LD.cR());
    }

    public void Lxb(Lxb lxb) {
        this.lk = lxb;
    }
}
