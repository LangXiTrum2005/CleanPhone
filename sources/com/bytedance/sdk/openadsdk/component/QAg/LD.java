package com.bytedance.sdk.openadsdk.component.QAg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.LD.NXR;
import com.bytedance.sdk.component.adexpress.LD.STP;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.OY.eK;
import com.bytedance.sdk.openadsdk.core.OY.tD;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends tD {
    private Fo0 Ivz;
    private com.bytedance.sdk.openadsdk.component.OY.lk JXs;
    private final com.bytedance.sdk.openadsdk.component.Lxb LD;
    boolean Lxb;
    private final com.bytedance.sdk.openadsdk.component.OY.Lxb ZU;
    private FrameLayout ebl;
    private com.bytedance.sdk.openadsdk.component.lc.Lxb lc;
    private final com.bytedance.sdk.openadsdk.component.lc.LD lk;

    public LD(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, AdSlot adSlot, String str, com.bytedance.sdk.openadsdk.component.Lxb lxb, com.bytedance.sdk.openadsdk.component.lc.LD ld, com.bytedance.sdk.openadsdk.component.OY.Lxb lxb2) {
        super(context, tDVar, adSlot, str, true, true);
        this.Lxb = true;
        this.LD = lxb;
        this.lk = ld;
        this.ZU = lxb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk(STP stp) {
        if (stp == null) {
            return;
        }
        if (stp.Lxb() != null) {
            if (this.Lxb) {
                stp.Lxb().setTag(com.bytedance.sdk.component.adexpress.dynamic.Lxb.lc, 1);
                ((FrameLayout) stp.Lxb()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) stp.Lxb();
                this.ebl = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.Lxb = false;
                return;
            }
            return;
        }
        double dLc = stp.lc();
        double dEbl = stp.ebl();
        double dOY = stp.OY();
        double dQAg = stp.QAg();
        int iLk = le.lk(this.OY, (float) dLc);
        int iLk2 = le.lk(this.OY, (float) dEbl);
        int iLk3 = le.lk(this.OY, (float) dOY);
        int iLk4 = le.lk(this.OY, (float) dQAg);
        if ((dQAg != 0.0d && dOY != 0.0d) || this.KPU.lk() == 7 || this.KPU.lk() == 10) {
            if ((this.KPU.lk() == 7 || this.KPU.lk() == 10) && (stp instanceof com.bytedance.sdk.openadsdk.core.JVA.ZU.LD)) {
                FrameLayout frameLayoutVVE = ((com.bytedance.sdk.openadsdk.core.JVA.ZU.LD) stp).VVE();
                if (frameLayoutVVE != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutVVE.addView(this.ebl, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.ebl.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iLk3, iLk4);
            }
            layoutParams2.width = iLk3;
            layoutParams2.height = iLk4;
            layoutParams2.topMargin = iLk2;
            layoutParams2.leftMargin = iLk;
            layoutParams2.setMarginStart(iLk);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.ebl.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void JXs() {
        com.bytedance.sdk.openadsdk.component.lc.Lxb lxb = this.lc;
        if (lxb != null) {
            lxb.LD(this);
        }
    }

    public void LD(final STP stp) {
        if (stp == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.QAg.LD.1
            @Override // java.lang.Runnable
            public void run() {
                LD.this.lk(stp);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb(int i, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public int ZU() {
        com.bytedance.sdk.openadsdk.component.OY.lk lkVar = this.JXs;
        if (lkVar != null && lkVar.lc()) {
            return 1;
        }
        com.bytedance.sdk.openadsdk.component.OY.lk lkVar2 = this.JXs;
        if (lkVar2 != null && lkVar2.JXs()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.OY.lk lkVar3 = this.JXs;
        if (lkVar3 != null && lkVar3.ZU()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.OY.lk lkVar4 = this.JXs;
        if (lkVar4 != null && lkVar4.LD()) {
            return 4;
        }
        com.bytedance.sdk.openadsdk.component.OY.lk lkVar5 = this.JXs;
        return (lkVar5 == null || !lkVar5.lk()) ? 3 : 5;
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD
    public int getDynamicShowType() {
        if (this.KPU == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD
    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.ebl.Lxb.Lxb(this.JVA, kqm.ZU().ebl(String.valueOf(this.JVA.Td())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.ebl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD
    public void lc() {
        this.STP = true;
        this.ebl = new FrameLayout(this.OY);
        if (!com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(this.JVA) && !com.bytedance.sdk.openadsdk.core.JVA.lk.LD(this.JVA)) {
            addView(this.ebl, new FrameLayout.LayoutParams(-1, -1));
        }
        super.lc();
    }

    public void setExpressVideoListenerProxy(Fo0 fo0) {
        this.Ivz = fo0;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.lc.Lxb lxb) {
        this.lc = lxb;
    }

    public void setVideoManager(com.bytedance.sdk.openadsdk.component.OY.lk lkVar) {
        this.JXs = lkVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void LD() {
        super.LD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.component.adexpress.LD.IeN
    public void Lxb(com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu, STP stp) {
        this.KPU = zu;
        if (zu instanceof eK) {
            eK eKVar = (eK) zu;
            if (eKVar.VVE() != null) {
                eKVar.VVE().Lxb((com.bytedance.sdk.openadsdk.core.OY.STP) this);
            }
        }
        if (stp != null && stp.lk()) {
            LD(stp);
        }
        super.Lxb(zu, stp);
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb() {
        com.bytedance.sdk.openadsdk.component.lc.Lxb lxb = this.lc;
        if (lxb != null) {
            lxb.Lxb(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb(int i) {
        com.bytedance.sdk.openadsdk.component.OY.lk lkVar = this.JXs;
        if (lkVar == null) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                lkVar.ebl();
                this.lk.ZU();
                return;
            } else if (i == 3) {
                lkVar.OY();
                this.lk.lk();
                return;
            } else if (i == 4) {
                lkVar.QAg();
                return;
            } else if (i != 5) {
                return;
            }
        }
        if (lkVar.ZU() || this.JXs.JXs()) {
            return;
        }
        this.JXs.Lxb(getVideoFrameLayout(), this.LD, this.JVA);
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.component.adexpress.LD.OY
    public void Lxb(View view, int i, com.bytedance.sdk.component.adexpress.lk lkVar) {
        if (i != -1 && lkVar != null && i == 3) {
            JXs();
        } else {
            super.Lxb(view, i, lkVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD
    public void Lxb(NXR.Lxb lxb) {
        lxb.JXs(com.bytedance.sdk.openadsdk.component.ebl.Lxb.LD());
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD
    public void Lxb(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.JVA;
        boolean z = tDVar != null && tDVar.id() == 0;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = this.JVA;
        com.bytedance.sdk.openadsdk.component.ebl.Lxb.Lxb(jSONObject, tDVar2 != null ? tDVar2.Td() : 0, z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public long lk() {
        return this.ZU.LD();
    }
}
