package com.thinkup.core.common.no.n;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m0 implements oom {
    private final oom o;

    public m0(oom oomVar) {
        if (oomVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.o = oomVar;
    }

    private oom m() {
        return this.o;
    }

    @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.o.close();
    }

    @Override // com.thinkup.core.common.no.n.oom, java.io.Flushable
    public void flush() {
        this.o.flush();
    }

    @Override // com.thinkup.core.common.no.n.oom
    public void o(n nVar, long j) {
        this.o.o(nVar, j);
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.o.toString() + ")";
    }

    @Override // com.thinkup.core.common.no.n.oom
    public final om0 o() {
        return this.o.o();
    }
}
