package com.bytedance.adsdk.LD.lk.LD;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public class JXs implements lk {
    private final com.bytedance.adsdk.LD.lk.Lxb.lc JXs;
    private final Path.FillType LD;
    private final ebl Lxb;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD OY;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD QAg;
    private final com.bytedance.adsdk.LD.lk.Lxb.ZU ZU;
    private final String ebl;
    private final com.bytedance.adsdk.LD.lk.Lxb.lc lc;
    private final com.bytedance.adsdk.LD.lk.Lxb.lk lk;
    private final boolean nBu;

    public JXs(String str, ebl eblVar, Path.FillType fillType, com.bytedance.adsdk.LD.lk.Lxb.lk lkVar, com.bytedance.adsdk.LD.lk.Lxb.ZU zu, com.bytedance.adsdk.LD.lk.Lxb.lc lcVar, com.bytedance.adsdk.LD.lk.Lxb.lc lcVar2, com.bytedance.adsdk.LD.lk.Lxb.LD ld, com.bytedance.adsdk.LD.lk.Lxb.LD ld2, boolean z) {
        this.Lxb = eblVar;
        this.LD = fillType;
        this.lk = lkVar;
        this.ZU = zu;
        this.JXs = lcVar;
        this.lc = lcVar2;
        this.ebl = str;
        this.OY = ld;
        this.QAg = ld2;
        this.nBu = z;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.ZU JXs() {
        return this.ZU;
    }

    public ebl LD() {
        return this.Lxb;
    }

    public String Lxb() {
        return this.ebl;
    }

    public boolean OY() {
        return this.nBu;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.lk ZU() {
        return this.lk;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.lc ebl() {
        return this.lc;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.lc lc() {
        return this.JXs;
    }

    public Path.FillType lk() {
        return this.LD;
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return new com.bytedance.adsdk.LD.Lxb.Lxb.OY(qAg, eblVar, lxb, this);
    }
}
