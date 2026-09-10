package com.thinkup.core.common.no.n;

/* JADX INFO: loaded from: classes6.dex */
final class o00 implements oon {
    private final n m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0n f42088n;
    private final oo o;
    private int o0;
    private long om;
    private boolean oo;

    public o00(oo ooVar) {
        this.o = ooVar;
        n nVarN = ooVar.n();
        this.m = nVarN;
        o0n o0nVar = nVarN.m;
        this.f42088n = o0nVar;
        this.o0 = o0nVar != null ? o0nVar.o0 : -1;
    }

    @Override // com.thinkup.core.common.no.n.oon
    public final long a_(n nVar, long j) {
        o0n o0nVar;
        o0n o0nVar2;
        if (this.oo) {
            throw new IllegalStateException("closed");
        }
        o0n o0nVar3 = this.f42088n;
        if (o0nVar3 != null && (o0nVar3 != (o0nVar2 = this.m.m) || this.o0 != o0nVar2.o0)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        this.o.m(this.om + j);
        if (this.f42088n == null && (o0nVar = this.m.m) != null) {
            this.f42088n = o0nVar;
            this.o0 = o0nVar.o0;
        }
        long jMin = Math.min(j, this.m.f42084n - this.om);
        if (jMin <= 0) {
            return -1L;
        }
        this.m.o(nVar, this.om, jMin);
        this.om += jMin;
        return jMin;
    }

    @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.oo = true;
    }

    @Override // com.thinkup.core.common.no.n.oon
    public final om0 o() {
        return this.o.o();
    }
}
