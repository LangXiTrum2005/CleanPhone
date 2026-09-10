package com.bytedance.sdk.openadsdk.component.reward.LD;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes2.dex */
public class nBu extends LD {
    public nBu(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        super(lxb);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void DY() {
        super.DY();
        if (eK.brP(this.Lxb.LD)) {
            this.nBu.removeMessages(600);
            this.Lxb.CSn.lk("go_background");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean JXs() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void Lxb(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void Sfi() {
        super.Sfi();
        if (eK.brP(this.Lxb.LD)) {
            this.nBu.removeMessages(600);
            this.Lxb.CSn.lk("go_background");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void ebl() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void kqm() {
        if (eK.OY(this.LD) && this.Lxb.hg.rW() && !this.Lxb.hg.NDz()) {
            brP();
        }
        if (eK.ebl(this.Lxb.LD)) {
            if (DeviceUtils.ebl() == 0) {
                this.Lxb.Of = true;
            }
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            if (lxb.Of) {
                lxb.nJ.LD(true);
                this.Lxb.xan.Lxb(true);
            }
        }
        this.Lxb.MGT.Lxb();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean lc() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void tD() {
        if (this.Lxb.CSn.OY(com.bytedance.sdk.openadsdk.component.reward.Lxb.OY.lk) && eK.brP(this.Lxb.LD)) {
            this.Lxb.CSn.lk("return_foreground");
            com.bytedance.sdk.openadsdk.core.widget.LD ld = this.NXR;
            if ((ld == null || !ld.isShowing()) && this.Lxb.CSn.LD() >= 0.0f) {
                this.Lxb.CSn.JXs(0);
            }
        }
    }

    public static boolean Lxb(tD tDVar) {
        return eK.ebl(tDVar) || eK.brP(tDVar);
    }
}
