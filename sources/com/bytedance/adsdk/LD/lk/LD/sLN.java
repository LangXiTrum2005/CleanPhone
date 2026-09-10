package com.bytedance.adsdk.LD.lk.LD;

/* JADX INFO: loaded from: classes.dex */
public class sLN implements lk {
    private final boolean JXs;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD LD;
    private final String Lxb;
    private final com.bytedance.adsdk.LD.lk.Lxb.sLN ZU;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD lk;

    public sLN(String str, com.bytedance.adsdk.LD.lk.Lxb.LD ld, com.bytedance.adsdk.LD.lk.Lxb.LD ld2, com.bytedance.adsdk.LD.lk.Lxb.sLN sln, boolean z) {
        this.Lxb = str;
        this.LD = ld;
        this.lk = ld2;
        this.ZU = sln;
        this.JXs = z;
    }

    public boolean JXs() {
        return this.JXs;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.sLN ZU() {
        return this.ZU;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD lk() {
        return this.lk;
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return new com.bytedance.adsdk.LD.Lxb.Lxb.VVE(qAg, lxb, this);
    }
}
