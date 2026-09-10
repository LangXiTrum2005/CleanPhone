package com.bytedance.adsdk.LD.lk.LD;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class VVE implements lk {
    private final List<lk> LD;
    private final String Lxb;
    private final boolean lk;

    public VVE(String str, List<lk> list, boolean z) {
        this.Lxb = str;
        this.LD = list;
        this.lk = z;
    }

    public List<lk> LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public boolean lk() {
        return this.lk;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.Lxb + "' Shapes: " + Arrays.toString(this.LD.toArray()) + '}';
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return new com.bytedance.adsdk.LD.Lxb.Lxb.ZU(qAg, lxb, this, eblVar);
    }
}
