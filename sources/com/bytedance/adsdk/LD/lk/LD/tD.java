package com.bytedance.adsdk.LD.lk.LD;

import com.bytedance.adsdk.LD.Lxb.Lxb.Sfi;

/* JADX INFO: loaded from: classes.dex */
public class tD implements lk {
    private final com.bytedance.adsdk.LD.lk.Lxb.LD JXs;
    private final Lxb LD;
    private final String Lxb;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD ZU;
    private final boolean lc;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD lk;

    public enum Lxb {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Lxb Lxb(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public tD(String str, Lxb lxb, com.bytedance.adsdk.LD.lk.Lxb.LD ld, com.bytedance.adsdk.LD.lk.Lxb.LD ld2, com.bytedance.adsdk.LD.lk.Lxb.LD ld3, boolean z) {
        this.Lxb = str;
        this.LD = lxb;
        this.lk = ld;
        this.ZU = ld2;
        this.JXs = ld3;
        this.lc = z;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD JXs() {
        return this.JXs;
    }

    public Lxb LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD ZU() {
        return this.lk;
    }

    public boolean lc() {
        return this.lc;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD lk() {
        return this.ZU;
    }

    public String toString() {
        return "Trim Path: {start: " + this.lk + ", end: " + this.ZU + ", offset: " + this.JXs + "}";
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return new Sfi(lxb, this);
    }
}
