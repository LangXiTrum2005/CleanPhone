package com.bytedance.adsdk.LD.Lxb.LD;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class QAg extends com.bytedance.adsdk.LD.ebl.Lxb<PointF> {
    private final com.bytedance.adsdk.LD.ebl.Lxb<PointF> JVA;
    private Path nBu;

    public QAg(com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.ebl.Lxb<PointF> lxb) {
        super(eblVar, lxb.Lxb, lxb.LD, lxb.lk, lxb.ZU, lxb.JXs, lxb.lc, lxb.ebl);
        this.JVA = lxb;
        Lxb();
    }

    public Path LD() {
        return this.nBu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Lxb() {
        T t;
        T t2;
        T t3 = this.LD;
        boolean z = (t3 == 0 || (t2 = this.Lxb) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.Lxb;
        if (t4 == 0 || (t = this.LD) == 0 || z) {
            return;
        }
        com.bytedance.adsdk.LD.ebl.Lxb<PointF> lxb = this.JVA;
        this.nBu = com.bytedance.adsdk.LD.lc.lc.Lxb((PointF) t4, (PointF) t, lxb.OY, lxb.QAg);
    }
}
