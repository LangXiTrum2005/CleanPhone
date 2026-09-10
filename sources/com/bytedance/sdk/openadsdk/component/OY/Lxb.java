package com.bytedance.sdk.openadsdk.component.OY;

/* JADX INFO: loaded from: classes2.dex */
public final class Lxb {
    private long LD;
    private float Lxb;

    public long LD() {
        return this.LD;
    }

    public float Lxb() {
        return this.Lxb;
    }

    public void Lxb(float f) {
        StringBuilder sb = new StringBuilder("setTotalTime() called with: time = [");
        sb.append(f);
        sb.append("]");
        this.Lxb = f;
    }

    public void Lxb(long j) {
        this.LD = j;
    }
}
