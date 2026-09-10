package com.bytedance.adsdk.LD.lk.LD;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public class IeN implements lk {
    private final com.bytedance.adsdk.LD.lk.Lxb.ZU JXs;
    private final Path.FillType LD;
    private final boolean Lxb;
    private final com.bytedance.adsdk.LD.lk.Lxb.Lxb ZU;
    private final boolean lc;
    private final String lk;

    public IeN(String str, boolean z, Path.FillType fillType, com.bytedance.adsdk.LD.lk.Lxb.Lxb lxb, com.bytedance.adsdk.LD.lk.Lxb.ZU zu, boolean z2) {
        this.lk = str;
        this.Lxb = z;
        this.LD = fillType;
        this.ZU = lxb;
        this.JXs = zu;
        this.lc = z2;
    }

    public boolean JXs() {
        return this.lc;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.Lxb LD() {
        return this.ZU;
    }

    public String Lxb() {
        return this.lk;
    }

    public Path.FillType ZU() {
        return this.LD;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.ZU lk() {
        return this.JXs;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.Lxb + '}';
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return new com.bytedance.adsdk.LD.Lxb.Lxb.ebl(qAg, lxb, this);
    }
}
