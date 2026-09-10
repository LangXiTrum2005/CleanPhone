package com.bytedance.sdk.openadsdk.core.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private int di;
    private List<String> fi;
    private List<Integer> ik;
    private int ka;
    private int lr;
    private int ri;
    private int xha;

    public List<Integer> di() {
        return this.ik;
    }

    public int fi() {
        return this.lr;
    }

    public List<String> ik() {
        return this.fi;
    }

    public int ka() {
        return this.ri;
    }

    public int lr() {
        int i = this.xha;
        if (i >= 2) {
            return i;
        }
        return 0;
    }

    public boolean ri() {
        return this.di == 1;
    }

    public int xha() {
        return this.ka;
    }

    public void fi(int i) {
        this.ka = i;
    }

    public void ik(int i) {
        this.ri = i;
    }

    public void ka(int i) {
        this.lr = i;
    }

    public void lr(int i) {
        this.xha = i;
    }

    public void ri(int i) {
        this.di = i;
    }

    public void lr(List<Integer> list) {
        this.ik = list;
    }

    public void ri(List<String> list) {
        this.fi = list;
    }
}
