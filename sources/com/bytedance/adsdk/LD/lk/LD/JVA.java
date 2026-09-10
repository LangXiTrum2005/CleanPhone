package com.bytedance.adsdk.LD.lk.LD;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class JVA implements lk {
    private final boolean JXs;
    private final com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> LD;
    private final String Lxb;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD ZU;
    private final com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> lk;

    public JVA(String str, com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> nxr, com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> nxr2, com.bytedance.adsdk.LD.lk.Lxb.LD ld, boolean z) {
        this.Lxb = str;
        this.LD = nxr;
        this.lk = nxr2;
        this.ZU = ld;
        this.JXs = z;
    }

    public boolean JXs() {
        return this.JXs;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD LD() {
        return this.ZU;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> ZU() {
        return this.LD;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> lk() {
        return this.lk;
    }

    public String toString() {
        return "RectangleShape{position=" + this.LD + ", size=" + this.lk + '}';
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return new com.bytedance.adsdk.LD.Lxb.Lxb.IeN(qAg, lxb, this);
    }
}
