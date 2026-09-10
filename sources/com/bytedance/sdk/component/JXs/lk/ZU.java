package com.bytedance.sdk.component.JXs.lk;

import com.bytedance.sdk.component.JXs.JVA;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ZU<T> implements JVA {
    private int JVA;
    private int JXs;
    private String LD;
    private String Lxb;
    private boolean OY;
    private boolean QAg;
    private T ZU;
    private Map<String, String> ebl;
    private int lc;
    private T lk;
    private com.bytedance.sdk.component.JXs.ebl nBu;

    @Override // com.bytedance.sdk.component.JXs.JVA
    public boolean JXs() {
        return this.OY;
    }

    @Override // com.bytedance.sdk.component.JXs.JVA
    public T LD() {
        return this.lk;
    }

    public ZU Lxb(lk lkVar, T t) {
        this.lk = t;
        this.Lxb = lkVar.JXs();
        this.LD = lkVar.Lxb();
        this.JXs = lkVar.LD();
        this.lc = lkVar.lk();
        this.QAg = lkVar.IeN();
        this.nBu = lkVar.VVE();
        this.JVA = lkVar.kqm();
        return this;
    }

    @Override // com.bytedance.sdk.component.JXs.JVA
    public Map<String, String> ZU() {
        return this.ebl;
    }

    @Override // com.bytedance.sdk.component.JXs.JVA
    public int ebl() {
        return this.JVA;
    }

    @Override // com.bytedance.sdk.component.JXs.JVA
    public boolean lc() {
        return this.QAg;
    }

    @Override // com.bytedance.sdk.component.JXs.JVA
    public T lk() {
        return this.ZU;
    }

    public ZU Lxb(lk lkVar, T t, Map<String, String> map, boolean z) {
        this.ebl = map;
        this.OY = z;
        return Lxb(lkVar, t);
    }

    @Override // com.bytedance.sdk.component.JXs.JVA
    public String Lxb() {
        return this.LD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.JXs.JVA
    public void Lxb(Object obj) {
        this.ZU = this.lk;
        this.lk = obj;
    }
}
