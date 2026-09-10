package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.CG;

/* JADX INFO: loaded from: classes2.dex */
public class CSn {
    private int JVA;
    private long JXs;
    public long LD;
    public boolean Lxb;
    private long OY;
    private long QAg;
    private long ebl;
    private long lc;
    private long nBu;
    private CG lk = CG.lk();
    private CG ZU = CG.lk();

    public long JXs() {
        return this.OY;
    }

    public void LD(CG cg) {
        this.ZU = cg;
        this.QAg = cg.Lxb(this.lk);
    }

    public void Lxb(CG cg, CG cg2, int i, CG cg3) {
        this.JXs = cg.Lxb(this.lk);
        this.lc = cg2.Lxb(cg);
        this.ebl = i;
        this.OY = cg3.Lxb(cg2);
    }

    public int OY() {
        return this.JVA;
    }

    public long ZU() {
        return this.ebl;
    }

    public long ebl() {
        return this.nBu;
    }

    public long lc() {
        return this.QAg;
    }

    public long lk() {
        return this.lc;
    }

    public long LD() {
        return this.JXs;
    }

    public void Lxb(CG cg) {
        this.lk = cg;
    }

    public CG Lxb() {
        return this.lk;
    }

    public void Lxb(long j) {
        this.nBu = j;
    }

    public void Lxb(int i) {
        this.JVA = i;
    }
}
