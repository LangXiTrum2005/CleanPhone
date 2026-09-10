package com.thinkup.core.common.no.n;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes6.dex */
public final class mn implements oom {
    private final Deflater m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final on f42083n;
    private final o0 o;
    private boolean o0;
    private final CRC32 oo = new CRC32();

    private mn(oom oomVar) {
        if (oomVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        Deflater deflater = new Deflater(-1, true);
        this.m = deflater;
        o0 o0VarO = nm.o(oomVar);
        this.o = o0VarO;
        this.f42083n = new on(o0VarO, deflater);
        n nVarN = o0VarO.n();
        nVarN.mn(8075);
        nVarN.n0(8);
        nVarN.n0(0);
        nVarN.mo(0);
        nVarN.n0(0);
        nVarN.n0(0);
    }

    private Deflater m() {
        return this.m;
    }

    private void n() {
        n nVarN = this.o.n();
        nVarN.mn(8075);
        nVarN.n0(8);
        nVarN.n0(0);
        nVarN.mo(0);
        nVarN.n0(0);
        nVarN.n0(0);
    }

    private void o0() {
        this.o.m0((int) this.oo.getValue());
        this.o.m0((int) this.m.getBytesRead());
    }

    @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.o0) {
            return;
        }
        this.f42083n.m();
        this.o.m0((int) this.oo.getValue());
        this.o.m0((int) this.m.getBytesRead());
        th = null;
        try {
            this.m.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.o.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.o0 = true;
        if (th != null) {
            omo.o(th);
        }
    }

    @Override // com.thinkup.core.common.no.n.oom, java.io.Flushable
    public final void flush() {
        this.f42083n.flush();
    }

    @Override // com.thinkup.core.common.no.n.oom
    public final void o(n nVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return;
        }
        m(nVar, j);
        this.f42083n.o(nVar, j);
    }

    private void m(n nVar, long j) {
        o0n o0nVar = nVar.m;
        while (j > 0) {
            int iMin = (int) Math.min(j, o0nVar.oo - o0nVar.o0);
            this.oo.update(o0nVar.f42090n, o0nVar.o0, iMin);
            j -= (long) iMin;
            o0nVar = o0nVar.m0;
        }
    }

    @Override // com.thinkup.core.common.no.n.oom
    public final om0 o() {
        return this.o.o();
    }
}
