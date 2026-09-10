package com.thinkup.core.common.no.n;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mo implements oon {
    private final oon o;

    public mo(oon oonVar) {
        if (oonVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.o = oonVar;
    }

    @Override // com.thinkup.core.common.no.n.oon
    public long a_(n nVar, long j) {
        return this.o.a_(nVar, j);
    }

    @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.o.close();
    }

    public final oon m() {
        return this.o;
    }

    @Override // com.thinkup.core.common.no.n.oon
    public final om0 o() {
        return this.o.o();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.o.toString() + ")";
    }
}
