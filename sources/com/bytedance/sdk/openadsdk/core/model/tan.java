package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes2.dex */
public class tan {
    public static int lr = 2;
    public static int ri = 1;
    private int ik = 5;
    private int ka = 30;
    private int fi = 70;
    private int di = 1;
    private int xha = ri;
    private int mj = 0;
    private int jbs = 0;
    private int qt = 3;

    public int di() {
        return this.fi;
    }

    public int fi() {
        return this.ka;
    }

    public int ik() {
        return this.mj;
    }

    public int ka() {
        return this.ik;
    }

    public int lr() {
        return this.jbs;
    }

    public int mj() {
        return this.xha;
    }

    public int ri() {
        return this.qt;
    }

    public int xha() {
        return this.di;
    }

    public void di(int i) {
        this.fi = i;
    }

    public void fi(int i) {
        this.ka = i;
    }

    public void ik(int i) {
        this.mj = i;
    }

    public void ka(int i) {
        this.ik = i;
    }

    public void lr(int i) {
        this.jbs = i;
    }

    public void mj(int i) {
        this.xha = i;
    }

    public void ri(int i) {
        this.qt = i;
    }

    public void xha(int i) {
        this.di = i;
    }

    public boolean ri(boolean z) {
        if (z) {
            int i = this.mj;
            return i == 1 || i == 3;
        }
        int i2 = this.mj;
        return i2 == 3 || i2 == 2;
    }
}
