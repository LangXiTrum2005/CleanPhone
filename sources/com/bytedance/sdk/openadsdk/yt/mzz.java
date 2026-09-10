package com.bytedance.sdk.openadsdk.yt;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.tvp;

/* JADX INFO: loaded from: classes3.dex */
class mzz implements mml {
    private int lnr;
    private int mml;
    private mml qdl;
    private int ud;

    public mzz(mml mmlVar, int i2, int i3, int i4) {
        this.qdl = mmlVar;
        this.ud = i2;
        this.lnr = i3;
        this.mml = i4;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.mml
    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
        com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVarGeneratorModel = this.qdl.generatorModel();
        qdlVarGeneratorModel.qdl(BuildConfig.VERSION_NAME);
        qdlVarGeneratorModel.qdl(this.ud);
        qdlVarGeneratorModel.ud(this.lnr);
        qdlVarGeneratorModel.lnr(this.mml);
        qdlVarGeneratorModel.mo(tvp.ud().wd());
        qdlVarGeneratorModel.mml(rdp.mml());
        return qdlVarGeneratorModel;
    }
}
