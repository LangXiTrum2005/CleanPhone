package com.thinkup.core.common.o0o;

import com.thinkup.core.api.TUAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42165n;
    m0 o;
    long o0;
    TUAdRequest om;
    o0 oo;

    public m(m0 m0Var, int i2, TUAdRequest tUAdRequest) {
        this.o = m0Var;
        this.m = i2;
        this.om = tUAdRequest;
    }

    private boolean n() {
        return this.f42165n;
    }

    private long o0() {
        return this.o0;
    }

    public final void m() {
        this.f42165n = true;
    }

    public final TUAdRequest o() {
        return this.om;
    }

    public final void o(long j) {
        this.o0 = j;
    }

    public final void o(o0 o0Var) {
        this.oo = o0Var;
    }
}
