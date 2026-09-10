package com.bytedance.sdk.openadsdk.component.mj;

import com.ironsource.X3;

/* JADX INFO: loaded from: classes2.dex */
public final class ri {
    private long fi;
    private long ik;
    private boolean ka;
    private long lr;
    private float ri;

    public long ik() {
        return this.lr;
    }

    public long ka() {
        return this.ik;
    }

    public float lr() {
        return this.ri;
    }

    public void ri(boolean z) {
        this.ka = z;
    }

    public void ik(long j) {
        this.ik = j;
    }

    public void lr(long j) {
        this.lr = j;
    }

    public long ri() {
        return this.fi;
    }

    public void ri(long j) {
        this.fi = j;
    }

    public void ri(float f) {
        StringBuilder sb = new StringBuilder("setTotalTime() called with: time = [");
        sb.append(f);
        sb.append(X3.j.e);
        this.ri = f;
    }
}
