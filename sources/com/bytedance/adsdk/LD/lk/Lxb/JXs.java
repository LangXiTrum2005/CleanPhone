package com.bytedance.adsdk.LD.lk.Lxb;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class JXs implements NXR<PointF, PointF> {
    private final List<com.bytedance.adsdk.LD.ebl.Lxb<PointF>> Lxb;

    public JXs(List<com.bytedance.adsdk.LD.ebl.Lxb<PointF>> list) {
        this.Lxb = list;
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.NXR
    public boolean LD() {
        return this.Lxb.size() == 1 && this.Lxb.get(0).JXs();
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.NXR
    public com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> Lxb() {
        return this.Lxb.get(0).JXs() ? new com.bytedance.adsdk.LD.Lxb.LD.JVA(this.Lxb) : new com.bytedance.adsdk.LD.Lxb.LD.nBu(this.Lxb);
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.NXR
    public List<com.bytedance.adsdk.LD.ebl.Lxb<PointF>> lk() {
        return this.Lxb;
    }
}
