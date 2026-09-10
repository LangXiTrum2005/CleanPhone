package com.bytedance.adsdk.LD.lk.LD;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class LD implements lk {
    private final boolean JXs;
    private final com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> LD;
    private final String Lxb;
    private final boolean ZU;
    private final com.bytedance.adsdk.LD.lk.Lxb.lc lk;

    public LD(String str, com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> nxr, com.bytedance.adsdk.LD.lk.Lxb.lc lcVar, boolean z, boolean z2) {
        this.Lxb = str;
        this.LD = nxr;
        this.lk = lcVar;
        this.ZU = z;
        this.JXs = z2;
    }

    public boolean JXs() {
        return this.JXs;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> LD() {
        return this.LD;
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return new com.bytedance.adsdk.LD.Lxb.Lxb.lc(qAg, lxb, this);
    }

    public boolean ZU() {
        return this.ZU;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.lc lk() {
        return this.lk;
    }

    public String Lxb() {
        return this.Lxb;
    }
}
