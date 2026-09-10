package com.bytedance.sdk.component.adexpress.ri.ri;

import com.bytedance.sdk.component.fi.vr;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static ri fi = new ri();
    private volatile fi di;
    private volatile ik ik;
    private volatile vr ka;
    private volatile ka lr;
    private volatile lr ri;

    private ri() {
    }

    public static ri ri() {
        return fi;
    }

    public fi di() {
        return this.di;
    }

    public vr fi() {
        return this.ka;
    }

    public ik ik() {
        return this.ik;
    }

    public ka ka() {
        return this.lr;
    }

    public lr lr() {
        return this.ri;
    }

    public void ri(lr lrVar) {
        this.ri = lrVar;
    }

    public void ri(ik ikVar) {
        this.ik = ikVar;
    }

    public void ri(ka kaVar) {
        this.lr = kaVar;
    }

    public void ri(vr vrVar) {
        this.ka = vrVar;
    }
}
