package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.app.Activity;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class nBu implements com.bytedance.sdk.openadsdk.sLN.ebl {
    protected boolean IeN;
    protected final Lxb JVA;
    protected boolean NXR;
    protected final Activity OY;

    @NonNull
    protected final com.bytedance.sdk.openadsdk.core.model.tD QAg;
    protected boolean STP;
    protected FrameLayout VVE;
    protected AtomicBoolean brP = new AtomicBoolean(false);
    protected volatile boolean ebl;
    protected com.bytedance.sdk.openadsdk.tD.Lxb.Lxb kqm;
    protected final String nBu;
    protected boolean sLN;

    public nBu(Lxb lxb) {
        this.JVA = lxb;
        this.OY = lxb.Pw;
        this.nBu = lxb.JXs;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = lxb.LD;
        this.QAg = tDVar;
        this.NXR = eK.JXs(tDVar);
    }

    private void ebl() {
        int iPyu = this.QAg.pyu();
        if (iPyu == -1) {
            if (eK.QAg(this.QAg)) {
                com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb = this.kqm;
                if (lxb == null || !lxb.JXs()) {
                    this.JVA.bG.aH();
                    return;
                } else {
                    this.JVA.tD.set(true);
                    this.JVA.bG.IeN();
                }
            } else {
                this.JVA.tD.set(true);
                this.JVA.bG.IeN();
            }
        } else {
            if (iPyu < 0) {
                return;
            }
            this.JVA.nJ.ZU(false);
            if (eK.QAg(this.QAg)) {
                com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb2 = this.kqm;
                if (lxb2 == null || !lxb2.JXs()) {
                    this.JVA.JJ.sendEmptyMessageDelayed(1, iPyu);
                    return;
                }
                this.JVA.JJ.sendEmptyMessageDelayed(600, iPyu);
            } else {
                this.JVA.JJ.sendEmptyMessageDelayed(600, iPyu);
            }
        }
        com.bytedance.sdk.openadsdk.utils.sLN sln = this.JVA.MGT;
        if (sln != null) {
            sln.Lxb(iPyu);
        }
    }

    public void JVA() {
        if (!this.brP.compareAndSet(false, true)) {
            this.JVA.hg.QAg();
            return;
        }
        com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb = this.kqm;
        if (lxb != null) {
            lxb.Lxb(true);
        }
        this.JVA.hg.lc(true);
        Lxb lxb2 = this.JVA;
        lxb2.le.Lxb(true, lxb2.bG);
        if (this.JVA.le.ebl()) {
            Lxb lxb3 = this.JVA;
            lxb3.MGT.Lxb(lxb3.OY);
            return;
        }
        Lxb lxb4 = this.JVA;
        lxb4.hg.Lxb(lxb4.Of, true);
        this.JVA.hg.lk(true);
        this.JVA.hg.LD(true);
        this.JVA.JJ.removeMessages(600);
    }

    public void JXs() {
        com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb;
        if (!this.NXR || this.brP.get() || (lxb = this.kqm) == null) {
            return;
        }
        lxb.lk();
    }

    public void LD(int i) {
    }

    public void Lxb(long j) {
    }

    public void OY() {
    }

    public boolean QAg() {
        return false;
    }

    public void ZU() {
        com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb;
        if (!this.NXR || this.brP.get() || (lxb = this.kqm) == null) {
            return;
        }
        lxb.LD();
    }

    public void lc() {
        if (this.NXR && !this.IeN) {
            this.IeN = true;
            com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb = this.kqm;
            if (lxb != null) {
                lxb.ZU();
            }
            FrameLayout frameLayout = this.VVE;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            DeviceUtils.AudioInfoReceiver.LD(this);
        }
    }

    public void lk() {
        if (this.NXR) {
            this.ebl = true;
            lk(this.JVA.Of);
            this.kqm.Lxb();
            ebl();
            if (eK.nBu(this.QAg)) {
                this.JVA.hg.lc();
            }
        }
    }

    public boolean nBu() {
        return this.ebl;
    }

    public void LD(boolean z) {
        if (this.NXR) {
            Lxb lxb = this.JVA;
            if (lxb.VU) {
                this.VVE = (FrameLayout) lxb.rW.findViewById(com.bytedance.sdk.openadsdk.utils.STP.XM);
                Lxb(z);
            }
        }
    }

    public void Lxb() {
        if (this.NXR && !this.sLN) {
            this.sLN = true;
            DeviceUtils.AudioInfoReceiver.Lxb(this);
        }
    }

    public com.bytedance.sdk.openadsdk.sLN.JXs LD() {
        return new com.bytedance.sdk.openadsdk.sLN.JXs() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu.1
            @Override // com.bytedance.sdk.openadsdk.sLN.JXs
            public void Lxb() {
                nBu.this.JVA.dR.Lxb(false);
            }
        };
    }

    public void Lxb(boolean z) {
        FrameLayout frameLayout = this.VVE;
        if (frameLayout != null) {
            Lxb lxb = this.JVA;
            com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb2 = new com.bytedance.sdk.openadsdk.tD.Lxb.Lxb(lxb.NDz, this.QAg, lxb.Ns, z, frameLayout);
            this.kqm = lxb2;
            lxb2.Lxb(this.JVA.dR);
            this.kqm.Lxb(true, LD());
        }
    }

    public void lk(boolean z) {
        if (this.NXR && this.kqm != null && this.ebl) {
            this.kqm.Lxb(z);
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.LD.JXs jXs) {
        com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb;
        if (this.NXR && (lxb = this.kqm) != null) {
            lxb.Lxb(jXs);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sLN.ebl
    public void Lxb(int i) {
        if (this.JVA.xan.LD()) {
            Lxb lxb = this.JVA;
            boolean z = lxb.Of;
            lxb.xan.Lxb();
            if (i == 0) {
                this.JVA.nJ.LD(true);
                lk(true);
                return;
            } else {
                this.JVA.nJ.LD(false);
                lk(false);
                return;
            }
        }
        this.JVA.xan.Lxb(-1);
        Lxb lxb2 = this.JVA;
        boolean z2 = lxb2.Of;
        lxb2.xan.Lxb();
        Lxb lxb3 = this.JVA;
        if (lxb3.Ld) {
            if (i == 0) {
                lxb3.Of = true;
                lxb3.nJ.LD(true);
                lk(true);
            } else {
                lxb3.Of = false;
                lxb3.nJ.LD(false);
                lk(false);
            }
        }
    }
}
