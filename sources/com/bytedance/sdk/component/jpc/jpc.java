package com.bytedance.sdk.component.jpc;

/* JADX INFO: loaded from: classes.dex */
public abstract class jpc implements Comparable<jpc>, Runnable {
    private int qdl;
    private String ud;

    public jpc(String str, int i2) {
        this.qdl = 0;
        this.qdl = i2 == 0 ? 5 : i2;
        this.ud = str;
    }

    public String getName() {
        return this.ud;
    }

    public int getPriority() {
        return this.qdl;
    }

    public void setPriority(int i2) {
        this.qdl = i2;
    }

    @Override // java.lang.Comparable
    public int compareTo(jpc jpcVar) {
        if (getPriority() < jpcVar.getPriority()) {
            return 1;
        }
        return getPriority() >= jpcVar.getPriority() ? -1 : 0;
    }

    public jpc(String str) {
        this.qdl = 5;
        this.ud = str;
    }
}
