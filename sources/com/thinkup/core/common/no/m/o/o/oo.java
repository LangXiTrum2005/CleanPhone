package com.thinkup.core.common.no.m.o.o;

import com.thinkup.core.common.no.n.m0;
import com.thinkup.core.common.no.n.oom;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
class oo extends m0 {
    private boolean o;

    public oo(oom oomVar) {
        super(oomVar);
    }

    @Override // com.thinkup.core.common.no.n.m0, com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.o) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.o = true;
            m();
        }
    }

    @Override // com.thinkup.core.common.no.n.m0, com.thinkup.core.common.no.n.oom, java.io.Flushable
    public void flush() {
        if (this.o) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.o = true;
            m();
        }
    }

    public void m() {
    }

    @Override // com.thinkup.core.common.no.n.m0, com.thinkup.core.common.no.n.oom
    public final void o(com.thinkup.core.common.no.n.n nVar, long j) throws EOFException {
        if (this.o) {
            nVar.mo(j);
            return;
        }
        try {
            super.o(nVar, j);
        } catch (IOException unused) {
            this.o = true;
            m();
        }
    }
}
