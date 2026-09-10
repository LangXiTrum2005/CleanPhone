package com.bytedance.sdk.component.LD.Lxb;

/* JADX INFO: loaded from: classes2.dex */
public final class lc {
    private final String[] Lxb;

    public lc(String[] strArr) {
        this.Lxb = strArr;
    }

    public String LD(int i) {
        return this.Lxb[(i * 2) + 1];
    }

    public int Lxb() {
        return this.Lxb.length / 2;
    }

    public String Lxb(int i) {
        return this.Lxb[i * 2];
    }
}
