package com.bytedance.sdk.component.lr.ri;

/* JADX INFO: loaded from: classes2.dex */
public final class di {
    private final String[] ri;

    public di(String[] strArr) {
        this.ri = strArr;
    }

    public String lr(int i) {
        return this.ri[(i * 2) + 1];
    }

    public int ri() {
        return this.ri.length / 2;
    }

    public String ri(int i) {
        return this.ri[i * 2];
    }
}
