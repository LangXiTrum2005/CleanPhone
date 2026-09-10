package com.thinkup.core.common.no.n;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class mm extends om0 {
    private om0 o;

    public mm(om0 om0Var) {
        if (om0Var == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.o = om0Var;
    }

    @Override // com.thinkup.core.common.no.n.om0
    public final boolean d_() {
        return this.o.d_();
    }

    @Override // com.thinkup.core.common.no.n.om0
    public final long e_() {
        return this.o.e_();
    }

    @Override // com.thinkup.core.common.no.n.om0
    public final om0 f_() {
        return this.o.f_();
    }

    @Override // com.thinkup.core.common.no.n.om0
    public final long g_() {
        return this.o.g_();
    }

    public final om0 o() {
        return this.o;
    }

    @Override // com.thinkup.core.common.no.n.om0
    public final om0 om() {
        return this.o.om();
    }

    @Override // com.thinkup.core.common.no.n.om0
    public final void on() throws InterruptedIOException {
        this.o.on();
    }

    public final mm o(om0 om0Var) {
        if (om0Var == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.o = om0Var;
        return this;
    }

    @Override // com.thinkup.core.common.no.n.om0
    public final om0 o(long j, TimeUnit timeUnit) {
        return this.o.o(j, timeUnit);
    }

    @Override // com.thinkup.core.common.no.n.om0
    public final om0 o(long j) {
        return this.o.o(j);
    }
}
