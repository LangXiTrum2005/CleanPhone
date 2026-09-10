package com.bytedance.sdk.openadsdk.component.JXs;

import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private int JXs;
    private int LD;
    private int Lxb;
    private com.bytedance.sdk.openadsdk.core.model.Lxb ZU;
    private boolean ebl;
    private String lc;
    private tD lk;

    public LD(int i, int i2, tD tDVar, com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        this.Lxb = i;
        this.LD = i2;
        this.lk = tDVar;
        this.ZU = lxb;
    }

    public tD JXs() {
        return this.lk;
    }

    public boolean LD() {
        return this.ebl;
    }

    public com.bytedance.sdk.openadsdk.core.model.Lxb Lxb() {
        return this.ZU;
    }

    public int ZU() {
        return this.LD;
    }

    public String ebl() {
        return this.lc;
    }

    public int lc() {
        return this.JXs;
    }

    public int lk() {
        return this.Lxb;
    }

    public void Lxb(boolean z) {
        this.ebl = z;
    }

    public LD(int i, int i2, int i3, String str) {
        this.Lxb = i;
        this.LD = i2;
        this.JXs = i3;
        this.lc = str;
    }
}
