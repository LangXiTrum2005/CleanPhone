package com.bytedance.adsdk.LD.lk.LD;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class nBu implements lk {
    private final boolean JVA;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD JXs;
    private final Lxb LD;
    private final String Lxb;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD OY;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD QAg;
    private final com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> ZU;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD ebl;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD lc;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD lk;
    private final boolean nBu;

    public enum Lxb {
        STAR(1),
        POLYGON(2);

        private final int lk;

        Lxb(int i) {
            this.lk = i;
        }

        public static Lxb Lxb(int i) {
            for (Lxb lxb : values()) {
                if (lxb.lk == i) {
                    return lxb;
                }
            }
            return null;
        }
    }

    public nBu(String str, Lxb lxb, com.bytedance.adsdk.LD.lk.Lxb.LD ld, com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> nxr, com.bytedance.adsdk.LD.lk.Lxb.LD ld2, com.bytedance.adsdk.LD.lk.Lxb.LD ld3, com.bytedance.adsdk.LD.lk.Lxb.LD ld4, com.bytedance.adsdk.LD.lk.Lxb.LD ld5, com.bytedance.adsdk.LD.lk.Lxb.LD ld6, boolean z, boolean z2) {
        this.Lxb = str;
        this.LD = lxb;
        this.lk = ld;
        this.ZU = nxr;
        this.JXs = ld2;
        this.lc = ld3;
        this.ebl = ld4;
        this.OY = ld5;
        this.QAg = ld6;
        this.nBu = z;
        this.JVA = z2;
    }

    public boolean JVA() {
        return this.JVA;
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

    public com.bytedance.adsdk.LD.lk.Lxb.LD OY() {
        return this.OY;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD QAg() {
        return this.QAg;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> ZU() {
        return this.ZU;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD ebl() {
        return this.ebl;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD lc() {
        return this.lc;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD lk() {
        return this.lk;
    }

    public boolean nBu() {
        return this.nBu;
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return new com.bytedance.adsdk.LD.Lxb.Lxb.STP(qAg, lxb, this);
    }
}
