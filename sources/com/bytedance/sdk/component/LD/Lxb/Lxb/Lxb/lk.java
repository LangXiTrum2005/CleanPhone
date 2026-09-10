package com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb;

import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements com.bytedance.sdk.component.LD.Lxb.OY.Lxb {
    NXR LD;
    List<com.bytedance.sdk.component.LD.Lxb.OY> Lxb;
    int lk = 0;

    public lk(List<com.bytedance.sdk.component.LD.Lxb.OY> list, NXR nxr) {
        this.Lxb = list;
        this.LD = nxr;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.OY.Lxb
    public NXR Lxb() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.OY.Lxb
    public IeN Lxb(NXR nxr) throws IOException {
        this.LD = nxr;
        int i = this.lk + 1;
        this.lk = i;
        if (i >= this.Lxb.size()) {
            return null;
        }
        return this.Lxb.get(this.lk).Lxb(this);
    }
}
