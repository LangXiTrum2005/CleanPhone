package com.bytedance.adsdk.LD.Lxb.Lxb;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Sfi implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, lk {
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> JXs;
    private final boolean LD;
    private final String Lxb;
    private final com.bytedance.adsdk.LD.lk.LD.tD.Lxb ZU;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> ebl;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> lc;
    private final List<com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb> lk = new ArrayList();

    public Sfi(com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.tD tDVar) {
        this.Lxb = tDVar.Lxb();
        this.LD = tDVar.lc();
        this.ZU = tDVar.LD();
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb = tDVar.ZU().Lxb();
        this.JXs = Lxb;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb2 = tDVar.lk().Lxb();
        this.lc = Lxb2;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb3 = tDVar.JXs().Lxb();
        this.ebl = Lxb3;
        lxb.Lxb(Lxb);
        lxb.Lxb(Lxb2);
        lxb.Lxb(Lxb3);
        Lxb.Lxb(this);
        Lxb2.Lxb(this);
        Lxb3.Lxb(this);
    }

    public com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> JXs() {
        return this.ebl;
    }

    public com.bytedance.adsdk.LD.lk.LD.tD.Lxb LD() {
        return this.ZU;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
    }

    public com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> ZU() {
        return this.lc;
    }

    public boolean lc() {
        return this.LD;
    }

    public com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> lk() {
        return this.JXs;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        for (int i = 0; i < this.lk.size(); i++) {
            this.lk.get(i).Lxb();
        }
    }

    public void Lxb(com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb interfaceC0024Lxb) {
        this.lk.add(interfaceC0024Lxb);
    }
}
