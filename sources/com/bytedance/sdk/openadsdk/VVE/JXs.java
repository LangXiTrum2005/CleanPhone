package com.bytedance.sdk.openadsdk.VVE;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.STP;

/* JADX INFO: loaded from: classes2.dex */
class JXs implements ZU {
    private int JXs;
    private ZU LD;
    long Lxb = System.currentTimeMillis();
    private int ZU;
    private int lk;

    public JXs(ZU zu, int i, int i2, int i3) {
        this.LD = zu;
        this.lk = i;
        this.ZU = i2;
        this.JXs = i3;
    }

    @Override // com.bytedance.sdk.openadsdk.VVE.ZU
    public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
        com.bytedance.sdk.openadsdk.VVE.LD.Lxb lxbGeneratorModel = this.LD.generatorModel();
        lxbGeneratorModel.Lxb(BuildConfig.VERSION_NAME);
        lxbGeneratorModel.Lxb(this.lk);
        lxbGeneratorModel.LD(this.ZU);
        lxbGeneratorModel.lk(this.JXs);
        lxbGeneratorModel.LD(this.Lxb);
        lxbGeneratorModel.lc(QAg.LD().JXs());
        lxbGeneratorModel.ZU(STP.ZU());
        return lxbGeneratorModel;
    }
}
