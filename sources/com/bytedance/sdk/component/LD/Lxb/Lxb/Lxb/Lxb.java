package com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends com.bytedance.sdk.component.LD.Lxb.ZU {
    public static volatile QAg Lxb;
    private ExecutorService ZU;
    private List<com.bytedance.sdk.component.LD.Lxb.LD> LD = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.LD.Lxb.LD> lk = new CopyOnWriteArrayList();

    public Lxb(ExecutorService executorService) {
        this.ZU = executorService;
    }

    public boolean JXs() {
        return (Lxb == null || Lxb.Lxb() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.ZU
    public ExecutorService LD() {
        ExecutorService executorServiceLxb = Lxb != null ? Lxb.Lxb() : null;
        return executorServiceLxb != null ? executorServiceLxb : this.ZU;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.ZU
    public int Lxb() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.ZU
    public List<com.bytedance.sdk.component.LD.Lxb.LD> ZU() {
        return this.lk;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.ZU
    public List<com.bytedance.sdk.component.LD.Lxb.LD> lk() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.ZU
    public void Lxb(int i) {
    }

    public static void Lxb(QAg qAg) {
        Lxb = qAg;
    }
}
