package com.mbridge.msdk.newreward.player;

/* JADX INFO: loaded from: classes2.dex */
public class Calculate {
    private int mValue;

    public int addOne() {
        int i = this.mValue + 1;
        this.mValue = i;
        return i;
    }

    public int reduceOne() {
        int i = this.mValue - 1;
        this.mValue = i;
        return i;
    }
}
