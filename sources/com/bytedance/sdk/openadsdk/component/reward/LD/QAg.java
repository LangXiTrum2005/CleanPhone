package com.bytedance.sdk.openadsdk.component.reward.LD;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class QAg extends LD {
    private com.bytedance.sdk.openadsdk.component.reward.view.Lxb IeN;

    public QAg(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        super(lxb);
    }

    private boolean nE() {
        return tD.JXs(this.LD);
    }

    public FrameLayout Ivz() {
        com.bytedance.sdk.openadsdk.component.reward.view.Lxb lxb = this.IeN;
        if (lxb != null) {
            return lxb.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean JXs() {
        return nE();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public LD.Lxb ZU() {
        return new LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.LD.QAg.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD.Lxb
            public void Lxb(boolean z) {
                if (QAg.this.IeN != null) {
                    QAg.this.IeN.setIsMute(z);
                }
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void ebl() {
        this.lc.lk(8);
        this.lc.LD(8);
        if (this.LD.eK() == 2) {
            this.OY.Lxb(false);
            this.OY.lk(false);
            this.OY.ZU(false);
            this.lc.JXs(8);
            return;
        }
        this.OY.Lxb(this.LD.FV());
        this.OY.lk(nE());
        this.OY.ZU(nE());
        if (nE()) {
            this.lc.JXs(8);
        } else {
            this.OY.lc();
            this.lc.JXs(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean lc() {
        return nE();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void Lxb(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.view.Lxb lxb = new com.bytedance.sdk.openadsdk.component.reward.view.Lxb(this.Lxb.Pw, this.JVA);
        this.IeN = lxb;
        lxb.setDownloadListener(this.sLN);
        com.bytedance.sdk.openadsdk.component.reward.view.Lxb lxb2 = this.IeN;
        tD tDVar = this.LD;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.Lxb;
        lxb2.Lxb(tDVar, lxb3.Sv, lxb3.Ns, this.lk, this.ZU);
        frameLayout.addView(this.IeN.getInteractionStyleRootView());
    }

    public static boolean Lxb(tD tDVar) {
        return (tDVar.cR() || tDVar.Za() == 100.0f) ? false : true;
    }
}
