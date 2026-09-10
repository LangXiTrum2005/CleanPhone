package com.bytedance.sdk.component.OY;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OY implements Comparable<OY>, Runnable {
    private String LD;
    private int Lxb;

    public OY(String str, int i) {
        this.Lxb = 0;
        this.Lxb = i == 0 ? 5 : i;
        this.LD = str;
    }

    public String getName() {
        return this.LD;
    }

    public int getPriority() {
        return this.Lxb;
    }

    public void setPriority(int i) {
        this.Lxb = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(OY oy) {
        if (getPriority() < oy.getPriority()) {
            return 1;
        }
        return getPriority() >= oy.getPriority() ? -1 : 0;
    }

    public OY(String str) {
        this.Lxb = 5;
        this.LD = str;
    }
}
