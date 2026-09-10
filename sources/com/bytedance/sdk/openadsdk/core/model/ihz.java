package com.bytedance.sdk.openadsdk.core.model;

import com.ironsource.Ua;

/* JADX INFO: loaded from: classes2.dex */
public class ihz {
    private long ri = Ua.s;
    private long lr = Ua.s;
    private long ik = 10;
    private long ka = 20;
    private String fi = "";

    public String fi() {
        return this.fi;
    }

    public long ik() {
        return this.ik;
    }

    public long ka() {
        return this.ka;
    }

    public long lr() {
        return this.lr;
    }

    public long ri() {
        return this.ri;
    }

    public void ik(long j) {
        if (j <= 0) {
            this.ik = 10L;
        } else {
            this.ik = j;
        }
    }

    public void ka(long j) {
        if (j < 0) {
            this.ka = 20L;
        } else {
            this.ka = j;
        }
    }

    public void lr(long j) {
        if (j < 0) {
            this.lr = 20L;
        } else {
            this.lr = j;
        }
    }

    public void ri(long j) {
        if (j <= 0) {
            this.ri = 10L;
        } else {
            this.ri = j;
        }
    }

    public void ri(String str) {
        this.fi = str;
    }
}
