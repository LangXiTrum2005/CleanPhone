package com.thinkup.core.common.no.n;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes6.dex */
public final class no implements oon {
    private final Inflater m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42087n;
    private final oo o;
    private boolean o0;

    private no(oon oonVar, Inflater inflater) {
        this(nm.o(oonVar), inflater);
    }

    private boolean m() {
        if (!this.m.needsInput()) {
            return false;
        }
        n();
        if (this.m.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.o.on()) {
            return true;
        }
        o0n o0nVar = this.o.n().m;
        int i2 = o0nVar.oo;
        int i3 = o0nVar.o0;
        int i4 = i2 - i3;
        this.f42087n = i4;
        this.m.setInput(o0nVar.f42090n, i3, i4);
        return false;
    }

    private void n() {
        int i2 = this.f42087n;
        if (i2 == 0) {
            return;
        }
        int remaining = i2 - this.m.getRemaining();
        this.f42087n -= remaining;
        this.o.mo(remaining);
    }

    @Override // com.thinkup.core.common.no.n.oon
    public final long a_(n nVar, long j) throws IOException {
        boolean z2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.o0) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            z2 = false;
            if (this.m.needsInput()) {
                n();
                if (this.m.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                if (this.o.on()) {
                    z2 = true;
                } else {
                    o0n o0nVar = this.o.n().m;
                    int i2 = o0nVar.oo;
                    int i3 = o0nVar.o0;
                    int i4 = i2 - i3;
                    this.f42087n = i4;
                    this.m.setInput(o0nVar.f42090n, i3, i4);
                }
            }
            try {
                o0n o0nVarOn = nVar.on(1);
                int iInflate = this.m.inflate(o0nVarOn.f42090n, o0nVarOn.oo, (int) Math.min(j, 8192 - o0nVarOn.oo));
                if (iInflate > 0) {
                    o0nVarOn.oo += iInflate;
                    long j2 = iInflate;
                    nVar.f42084n += j2;
                    return j2;
                }
                if (!this.m.finished() && !this.m.needsDictionary()) {
                }
                n();
                if (o0nVarOn.o0 != o0nVarOn.oo) {
                    return -1L;
                }
                nVar.m = o0nVarOn.n();
                oo0.o(o0nVarOn);
                return -1L;
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        } while (!z2);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.o0) {
            return;
        }
        this.m.end();
        this.o0 = true;
        this.o.close();
    }

    @Override // com.thinkup.core.common.no.n.oon
    public final om0 o() {
        return this.o.o();
    }

    public no(oo ooVar, Inflater inflater) {
        if (ooVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.o = ooVar;
        this.m = inflater;
    }
}
