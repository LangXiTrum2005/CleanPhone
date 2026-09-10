package com.thinkup.core.common.no.m.o.m;

import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.m0o;
import com.thinkup.core.common.no.m.o0m;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.ooo;
import com.thinkup.core.common.no.n.nm;
import com.thinkup.core.common.no.n.oom;
import com.thinkup.core.common.no.n.oon;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    final com.thinkup.core.common.no.m.oo m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final o0m f42010n;
    final mm o;
    final o0 o0;
    private boolean om;
    final com.thinkup.core.common.no.m.o.n.n oo;

    public final class m extends com.thinkup.core.common.no.n.mo {
        private final long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f42011n;
        private boolean o0;
        private boolean oo;

        public m(oon oonVar, long j) {
            super(oonVar);
            this.m = j;
            if (j == 0) {
                o(null);
            }
        }

        private IOException o(IOException iOException) {
            if (this.o0) {
                return iOException;
            }
            this.o0 = true;
            return n.this.o(true, false, iOException);
        }

        @Override // com.thinkup.core.common.no.n.mo, com.thinkup.core.common.no.n.oon
        public final long a_(com.thinkup.core.common.no.n.n nVar, long j) throws IOException {
            if (this.oo) {
                throw new IllegalStateException("closed");
            }
            try {
                long jA_ = m().a_(nVar, j);
                if (jA_ == -1) {
                    o(null);
                    return -1L;
                }
                long j2 = this.f42011n + jA_;
                long j3 = this.m;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.m + " bytes but received " + j2);
                }
                this.f42011n = j2;
                if (j2 == j3) {
                    o(null);
                }
                return jA_;
            } catch (IOException e2) {
                throw o(e2);
            }
        }

        @Override // com.thinkup.core.common.no.n.mo, com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.oo) {
                return;
            }
            this.oo = true;
            try {
                super.close();
                o(null);
            } catch (IOException e2) {
                throw o(e2);
            }
        }
    }

    public n(mm mmVar, com.thinkup.core.common.no.m.oo ooVar, o0m o0mVar, o0 o0Var, com.thinkup.core.common.no.m.o.n.n nVar) {
        this.o = mmVar;
        this.m = ooVar;
        this.f42010n = o0mVar;
        this.o0 = o0Var;
        this.oo = nVar;
    }

    private static void mn() {
    }

    private static void n0() {
    }

    private void nm() {
        this.oo.oo();
    }

    private void no() {
        this.o.n();
    }

    public final boolean m() {
        return this.om;
    }

    public final void m0() {
        this.oo.o().oo();
    }

    public final void mm() {
        this.o.o(this, true, false, null);
    }

    public final void mo() {
        this.oo.oo();
        this.o.o(this, true, true, null);
    }

    public final void n() throws IOException {
        try {
            this.oo.m();
        } catch (IOException e2) {
            o(e2);
            throw e2;
        }
    }

    public final oo o() {
        return this.oo.o();
    }

    public final void o0() throws IOException {
        try {
            this.oo.n();
        } catch (IOException e2) {
            o(e2);
            throw e2;
        }
    }

    public final com.thinkup.core.common.no.m.o.mn.o.oo om() {
        this.o.n();
        return this.oo.o().o(this);
    }

    public final void on() {
        o(true, true, null);
    }

    public final ooo oo() {
        return this.oo.o0();
    }

    public final oom m(onm onmVar) {
        this.om = false;
        long jM = onmVar.o0().m();
        return new o(this.oo.o(onmVar, jM), jM);
    }

    public final void o(onm onmVar) throws IOException {
        try {
            this.oo.o(onmVar);
        } catch (IOException e2) {
            o(e2);
            throw e2;
        }
    }

    public final m00.o o(boolean z2) throws IOException {
        try {
            m00.o oVarO = this.oo.o(z2);
            if (oVarO == null) {
                return oVarO;
            }
            com.thinkup.core.common.no.m.o.o.o.o(oVarO, this);
            return oVarO;
        } catch (IOException e2) {
            o(e2);
            throw e2;
        }
    }

    public final class o extends com.thinkup.core.common.no.n.m0 {
        private boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f42012n;
        private long o0;
        private boolean oo;

        public o(oom oomVar, long j) {
            super(oomVar);
            this.f42012n = j;
        }

        @Override // com.thinkup.core.common.no.n.m0, com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.oo) {
                return;
            }
            this.oo = true;
            long j = this.f42012n;
            if (j != -1 && this.o0 != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                o(null);
            } catch (IOException e2) {
                throw o(e2);
            }
        }

        @Override // com.thinkup.core.common.no.n.m0, com.thinkup.core.common.no.n.oom, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e2) {
                throw o(e2);
            }
        }

        @Override // com.thinkup.core.common.no.n.m0, com.thinkup.core.common.no.n.oom
        public final void o(com.thinkup.core.common.no.n.n nVar, long j) throws IOException {
            if (this.oo) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f42012n;
            if (j2 == -1 || this.o0 + j <= j2) {
                try {
                    super.o(nVar, j);
                    this.o0 += j;
                    return;
                } catch (IOException e2) {
                    throw o(e2);
                }
            }
            throw new ProtocolException("expected " + this.f42012n + " bytes but received " + (this.o0 + j));
        }

        private IOException o(IOException iOException) {
            if (this.m) {
                return iOException;
            }
            this.m = true;
            return n.this.o(false, true, iOException);
        }
    }

    public final m0o o(m00 m00Var) throws IOException {
        try {
            String strO = m00Var.o("Content-Type");
            long jO = this.oo.o(m00Var);
            return new com.thinkup.core.common.no.m.o.n.m0(strO, jO, nm.o(new m(this.oo.m(m00Var), jO)));
        } catch (IOException e2) {
            o(e2);
            throw e2;
        }
    }

    private void o(IOException iOException) {
        this.o0.m();
        this.oo.o().o(iOException);
    }

    public final IOException o(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            o(iOException);
        }
        return this.o.o(this, z3, z2, iOException);
    }
}
