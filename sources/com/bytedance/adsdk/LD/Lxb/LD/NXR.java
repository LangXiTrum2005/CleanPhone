package com.bytedance.adsdk.LD.Lxb.LD;

import android.graphics.Path;
import com.bytedance.adsdk.LD.Lxb.Lxb.tD;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class NXR extends Lxb<com.bytedance.adsdk.LD.lk.LD.STP, Path> {
    private final Path JXs;
    private final com.bytedance.adsdk.LD.lk.LD.STP ZU;
    private List<tD> lc;

    public NXR(List<com.bytedance.adsdk.LD.ebl.Lxb<com.bytedance.adsdk.LD.lk.LD.STP>> list) {
        super(list);
        this.ZU = new com.bytedance.adsdk.LD.lk.LD.STP();
        this.JXs = new Path();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public Path Lxb(com.bytedance.adsdk.LD.ebl.Lxb<com.bytedance.adsdk.LD.lk.LD.STP> lxb, float f) {
        this.ZU.Lxb(lxb.Lxb, lxb.LD, f);
        com.bytedance.adsdk.LD.lk.LD.STP stpLxb = this.ZU;
        List<tD> list = this.lc;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                stpLxb = this.lc.get(size).Lxb(stpLxb);
            }
        }
        com.bytedance.adsdk.LD.lc.JXs.Lxb(stpLxb, this.JXs);
        return this.JXs;
    }

    public void Lxb(List<tD> list) {
        this.lc = list;
    }
}
