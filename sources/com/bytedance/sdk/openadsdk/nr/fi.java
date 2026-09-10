package com.bytedance.sdk.openadsdk.nr;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.vr;

/* JADX INFO: loaded from: classes2.dex */
class fi implements ka {
    private int ik;
    private int ka;
    private int lr;
    private ka ri;

    public fi(ka kaVar, int i, int i2, int i3) {
        this.ri = kaVar;
        this.lr = i;
        this.ik = i2;
        this.ka = i3;
    }

    @Override // com.bytedance.sdk.openadsdk.nr.ka
    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
        com.bytedance.sdk.openadsdk.nr.lr.ri riVarRi = this.ri.ri();
        riVarRi.ri(BuildConfig.VERSION_NAME);
        riVarRi.ri(this.lr);
        riVarRi.lr(this.ik);
        riVarRi.ik(this.ka);
        riVarRi.di(qt.lr().xha());
        riVarRi.ka(vr.ka());
        return riVarRi;
    }
}
