package com.thinkup.core.common.oom.m;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class on implements o {
    private final m0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f42296n;
    private final List<n> o;
    private volatile boolean o0;

    public on(List<n> list, m0 m0Var, int i2) {
        this.o = list;
        this.m = m0Var;
        this.f42296n = i2;
    }

    private void m(m0 m0Var) {
        if (this.o0 || m0Var == null || m0Var.o0 == null) {
            return;
        }
        this.o0 = true;
        m0Var.o0.o();
    }

    @Override // com.thinkup.core.common.oom.m.o
    public final m0 o() {
        return this.m;
    }

    @Override // com.thinkup.core.common.oom.m.o
    public final void o(m0 m0Var) {
        try {
            List<n> list = this.o;
            if (list == null || this.f42296n < list.size()) {
                this.o.get(this.f42296n).o(new on(this.o, m0Var, this.f42296n + 1));
            } else {
                m(m0Var);
            }
        } catch (Throwable unused) {
            m(m0Var);
        }
    }
}
