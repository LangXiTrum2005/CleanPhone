package com.thinkup.core.common.no.n;

import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes6.dex */
public final class on implements oom {
    private final Deflater m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42094n;
    private final o0 o;

    private on(oom oomVar, Deflater deflater) {
        this(nm.o(oomVar), deflater);
    }

    @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.f42094n) {
            return;
        }
        m();
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
        this.f42094n = true;
        if (th != null) {
            omo.o(th);
        }
    }

    @Override // com.thinkup.core.common.no.n.oom, java.io.Flushable
    public final void flush() {
        o(true);
        this.o.flush();
    }

    public final void m() {
        this.m.finish();
        o(false);
    }

    @Override // com.thinkup.core.common.no.n.oom
    public final void o(n nVar, long j) {
        omo.o(nVar.f42084n, 0L, j);
        while (j > 0) {
            o0n o0nVar = nVar.m;
            int iMin = (int) Math.min(j, o0nVar.oo - o0nVar.o0);
            this.m.setInput(o0nVar.f42090n, o0nVar.o0, iMin);
            o(false);
            long j2 = iMin;
            nVar.f42084n -= j2;
            int i2 = o0nVar.o0 + iMin;
            o0nVar.o0 = i2;
            if (i2 == o0nVar.oo) {
                nVar.m = o0nVar.n();
                oo0.o(o0nVar);
            }
            j -= j2;
        }
    }

    public final String toString() {
        return "DeflaterSink(" + this.o + ")";
    }

    public on(o0 o0Var, Deflater deflater) {
        if (o0Var == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.o = o0Var;
        this.m = deflater;
    }

    private void o(boolean z2) {
        o0n o0nVarOn;
        int iDeflate;
        n nVarN = this.o.n();
        while (true) {
            o0nVarOn = nVarN.on(1);
            if (z2) {
                Deflater deflater = this.m;
                byte[] bArr = o0nVarOn.f42090n;
                int i2 = o0nVarOn.oo;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.m;
                byte[] bArr2 = o0nVarOn.f42090n;
                int i3 = o0nVarOn.oo;
                iDeflate = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (iDeflate > 0) {
                o0nVarOn.oo += iDeflate;
                nVarN.f42084n += (long) iDeflate;
                this.o.omn();
            } else if (this.m.needsInput()) {
                break;
            }
        }
        if (o0nVarOn.o0 == o0nVarOn.oo) {
            nVarN.m = o0nVarOn.n();
            oo0.o(o0nVarOn);
        }
    }

    @Override // com.thinkup.core.common.no.n.oom
    public final om0 o() {
        return this.o.o();
    }
}
