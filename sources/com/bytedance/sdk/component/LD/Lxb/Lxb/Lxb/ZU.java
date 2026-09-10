package com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb;

import android.text.TextUtils;
import com.bytedance.sdk.component.LD.Lxb.JVA;
import com.bytedance.sdk.component.LD.Lxb.NXR;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends JVA {
    public JXs OY;
    public Lxb QAg;

    public ZU(JVA.Lxb lxb) {
        super(lxb);
        JXs jXs = new JXs();
        this.OY = jXs;
        this.QAg = new Lxb(jXs.LD());
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.JVA
    public com.bytedance.sdk.component.LD.Lxb.ZU Lxb() {
        return this.OY;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.JVA
    public com.bytedance.sdk.component.LD.Lxb.LD Lxb(NXR nxr) {
        nxr.Lxb(this);
        if (nxr.LD() == null || nxr.LD().Lxb() == null || TextUtils.isEmpty(nxr.LD().Lxb().toString())) {
            return null;
        }
        if (Lxb.Lxb == null || !Lxb.Lxb.LD() || !this.QAg.JXs() || "setting".equals(nxr.lc())) {
            LD ld = new LD(nxr, this.OY);
            this.OY.lk().add(ld);
            return ld;
        }
        LD ld2 = new LD(nxr, this.QAg);
        this.QAg.lk().add(ld2);
        return ld2;
    }
}
