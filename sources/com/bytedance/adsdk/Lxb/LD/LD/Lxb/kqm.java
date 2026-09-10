package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

/* JADX INFO: loaded from: classes.dex */
public abstract class kqm implements com.bytedance.adsdk.Lxb.LD.LD.Lxb {
    protected com.bytedance.adsdk.Lxb.LD.LD.Lxb LD;
    protected com.bytedance.adsdk.Lxb.LD.LD.Lxb Lxb;
    protected com.bytedance.adsdk.Lxb.LD.ZU.lk lk;

    public kqm(com.bytedance.adsdk.Lxb.LD.ZU.lk lkVar) {
        this.lk = lkVar;
    }

    public void LD(com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb) {
        this.LD = lxb;
    }

    public void Lxb(com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb) {
        this.Lxb = lxb;
    }

    public String toString() {
        return LD();
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public String LD() {
        return this.Lxb.LD() + this.lk.Lxb() + this.LD.LD();
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public com.bytedance.adsdk.Lxb.LD.ZU.JXs Lxb() {
        return com.bytedance.adsdk.Lxb.LD.ZU.lc.OPERATOR_RESULT;
    }
}
