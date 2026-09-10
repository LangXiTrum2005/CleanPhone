package com.thinkup.core.common.no.m.o.n;

import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.oon;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class on implements oon.o {
    private final com.thinkup.core.common.no.m.o.m.mm m;
    private final int m0;
    private int mm;
    private final int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.thinkup.core.common.no.m.o.m.n f42030n;
    private final List<oon> o;
    private final int o0;
    private final com.thinkup.core.common.no.m.oo om;
    private final int on;
    private final onm oo;

    public on(List<oon> list, com.thinkup.core.common.no.m.o.m.mm mmVar, com.thinkup.core.common.no.m.o.m.n nVar, int i2, onm onmVar, com.thinkup.core.common.no.m.oo ooVar, int i3, int i4, int i5) {
        this.o = list;
        this.m = mmVar;
        this.f42030n = nVar;
        this.o0 = i2;
        this.oo = onmVar;
        this.om = ooVar;
        this.on = i3;
        this.m0 = i4;
        this.mo = i5;
    }

    @Override // com.thinkup.core.common.no.m.oon.o
    public final com.thinkup.core.common.no.m.mm m() {
        com.thinkup.core.common.no.m.o.m.n nVar = this.f42030n;
        if (nVar != null) {
            return nVar.o();
        }
        return null;
    }

    public final com.thinkup.core.common.no.m.o.m.n m0() {
        com.thinkup.core.common.no.m.o.m.n nVar = this.f42030n;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException();
    }

    @Override // com.thinkup.core.common.no.m.oon.o
    public final oon.o n(int i2, TimeUnit timeUnit) {
        return new on(this.o, this.m, this.f42030n, this.o0, this.oo, this.om, this.on, this.m0, com.thinkup.core.common.no.m.o.n.o("timeout", i2, timeUnit));
    }

    @Override // com.thinkup.core.common.no.m.oon.o
    public final oon.o o(int i2, TimeUnit timeUnit) {
        return new on(this.o, this.m, this.f42030n, this.o0, this.oo, this.om, com.thinkup.core.common.no.m.o.n.o("timeout", i2, timeUnit), this.m0, this.mo);
    }

    @Override // com.thinkup.core.common.no.m.oon.o
    public final int o0() {
        return this.on;
    }

    @Override // com.thinkup.core.common.no.m.oon.o
    public final int om() {
        return this.mo;
    }

    public final com.thinkup.core.common.no.m.o.m.mm on() {
        return this.m;
    }

    @Override // com.thinkup.core.common.no.m.oon.o
    public final int oo() {
        return this.m0;
    }

    @Override // com.thinkup.core.common.no.m.oon.o
    public final oon.o m(int i2, TimeUnit timeUnit) {
        return new on(this.o, this.m, this.f42030n, this.o0, this.oo, this.om, this.on, com.thinkup.core.common.no.m.o.n.o("timeout", i2, timeUnit), this.mo);
    }

    @Override // com.thinkup.core.common.no.m.oon.o
    public final com.thinkup.core.common.no.m.oo n() {
        return this.om;
    }

    @Override // com.thinkup.core.common.no.m.oon.o
    public final onm o() {
        return this.oo;
    }

    @Override // com.thinkup.core.common.no.m.oon.o
    public final m00 o(onm onmVar) {
        return o(onmVar, this.m, this.f42030n);
    }

    public final m00 o(onm onmVar, com.thinkup.core.common.no.m.o.m.mm mmVar, com.thinkup.core.common.no.m.o.m.n nVar) {
        if (this.o0 < this.o.size()) {
            this.mm++;
            com.thinkup.core.common.no.m.o.m.n nVar2 = this.f42030n;
            if (nVar2 != null && !nVar2.o().o(onmVar.o())) {
                throw new IllegalStateException("network interceptor " + this.o.get(this.o0 - 1) + " must retain the same host and port");
            }
            if (this.f42030n != null && this.mm > 1) {
                throw new IllegalStateException("network interceptor " + this.o.get(this.o0 - 1) + " must call proceed() exactly once");
            }
            on onVar = new on(this.o, mmVar, nVar, this.o0 + 1, onmVar, this.om, this.on, this.m0, this.mo);
            oon oonVar = this.o.get(this.o0);
            m00 m00VarO = oonVar.o(onVar);
            if (nVar != null && this.o0 + 1 < this.o.size() && onVar.mm != 1) {
                throw new IllegalStateException("network interceptor " + oonVar + " must call proceed() exactly once");
            }
            if (m00VarO == null) {
                throw new NullPointerException("interceptor " + oonVar + " returned null");
            }
            if (m00VarO.on() != null) {
                return m00VarO;
            }
            throw new IllegalStateException("interceptor " + oonVar + " returned a response with no body");
        }
        throw new AssertionError();
    }
}
