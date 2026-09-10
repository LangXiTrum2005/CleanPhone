package com.bytedance.sdk.openadsdk.eK.LD;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class OY extends LD {
    private int ZU;

    public OY(Integer num, View view, tD tDVar, JXs.Lxb lxb) {
        super(num, view, tDVar, 2000, lxb);
        this.ZU = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.eK.LD.LD
    public void LD(int i) {
        if (QAg()) {
            return;
        }
        if (i == 6 || i == 5) {
            this.ZU = 0;
            OY();
        }
        if (i == 3 || i == 2) {
            this.ZU = 2;
            OY();
        }
        if (this.ZU == 1 || i != 0) {
            return;
        }
        this.ZU = 1;
        Lxb();
    }

    @Override // com.bytedance.sdk.openadsdk.eK.LD.LD
    public void Lxb() {
        if (this.ZU != 1) {
            return;
        }
        super.Lxb();
    }

    @Override // com.bytedance.sdk.openadsdk.eK.LD.LD
    public void ZU() {
        super.ZU();
    }

    @Override // com.bytedance.sdk.openadsdk.eK.LD.LD
    public int lc() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.eK.LD.LD
    public boolean lk() {
        return lc.Lxb(this.Lxb.get(), this.LD.op()) && this.ZU == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.eK.LD.LD
    public boolean sLN() {
        int i = this.ZU;
        boolean z = i == 2 || i == 0;
        if (z) {
            this.lk.set(false);
        }
        return !z || super.sLN();
    }
}
