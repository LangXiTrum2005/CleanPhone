package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.tD;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private boolean JXs;

    @Nullable
    private RFEndCardBackUpLayout LD;
    private final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb Lxb;
    private tD ZU;
    private boolean lk;

    public lc(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        this.Lxb = lxb;
    }

    public boolean JXs() {
        tD tDVar = this.ZU;
        if (tDVar != null) {
            return tDVar.lk();
        }
        return false;
    }

    public void LD() {
        this.JXs = true;
        le.Lxb((View) this.LD, 0);
    }

    public void Lxb() {
        if (this.lk) {
            return;
        }
        this.lk = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.Lxb.rW.findViewById(STP.wCT);
        this.LD = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.Lxb);
        }
        if (this.Lxb.LD.chu()) {
            this.ZU = new tD(this.Lxb);
        }
    }

    public void ZU() {
        tD tDVar = this.ZU;
        if (tDVar != null) {
            tDVar.LD();
        }
    }

    public boolean lc() {
        return this.JXs;
    }

    public void lk() {
        tD tDVar = this.ZU;
        if (tDVar != null) {
            tDVar.Lxb();
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.LD.JXs jXs) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.LD;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        le.Lxb(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        tD tDVar = this.ZU;
        if (tDVar != null) {
            tDVar.Lxb(jXs);
        }
    }

    public boolean Lxb(kqm kqmVar) {
        this.JXs = true;
        tD tDVar = this.ZU;
        if (tDVar == null || !tDVar.Lxb(kqmVar)) {
            return false;
        }
        le.Lxb((View) this.LD, 0);
        return true;
    }

    public void Lxb(int i) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.LD;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i);
    }
}
