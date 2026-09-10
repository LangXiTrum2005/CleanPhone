package com.bytedance.adsdk.LD.lk.LD;

/* JADX INFO: loaded from: classes.dex */
public class OY {
    private final com.bytedance.adsdk.LD.lk.Lxb.OY LD;
    private final Lxb Lxb;
    private final boolean ZU;
    private final com.bytedance.adsdk.LD.lk.Lxb.ZU lk;

    public enum Lxb {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public OY(Lxb lxb, com.bytedance.adsdk.LD.lk.Lxb.OY oy, com.bytedance.adsdk.LD.lk.Lxb.ZU zu, boolean z) {
        this.Lxb = lxb;
        this.LD = oy;
        this.lk = zu;
        this.ZU = z;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.OY LD() {
        return this.LD;
    }

    public Lxb Lxb() {
        return this.Lxb;
    }

    public boolean ZU() {
        return this.ZU;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.ZU lk() {
        return this.lk;
    }
}
