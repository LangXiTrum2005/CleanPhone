package com.bytedance.adsdk.LD.lk.LD;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class kqm implements lk {
    private final int LD;
    private final String Lxb;
    private final boolean ZU;
    private final com.bytedance.adsdk.LD.lk.Lxb.OY lk;

    public kqm(String str, int i, com.bytedance.adsdk.LD.lk.Lxb.OY oy, boolean z) {
        this.Lxb = str;
        this.LD = i;
        this.lk = oy;
        this.ZU = z;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.OY LD() {
        return this.lk;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public boolean lk() {
        return this.ZU;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.Lxb);
        sb.append(", index=");
        return DM.k(sb, this.LD, '}');
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return new com.bytedance.adsdk.LD.Lxb.Lxb.brP(qAg, lxb, this);
    }
}
