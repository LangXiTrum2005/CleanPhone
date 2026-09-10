package com.thinkup.core.common.no.m.o.mn;

import android.support.v4.media.session.PlaybackStateCompat;
import com.thinkup.core.common.no.n.om;
import com.thinkup.core.common.no.n.om0;
import com.thinkup.core.common.no.n.oom;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
final class o0 {
    final Random m;
    boolean m0;
    private final com.thinkup.core.common.no.n.n.o mm;
    private final byte[] mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final com.thinkup.core.common.no.n.o0 f42023n;
    final boolean o;
    final com.thinkup.core.common.no.n.n o0;
    final com.thinkup.core.common.no.n.n om = new com.thinkup.core.common.no.n.n();
    final o on = new o();
    boolean oo;

    public o0(boolean z2, com.thinkup.core.common.no.n.o0 o0Var, Random random) {
        if (o0Var == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.o = z2;
        this.f42023n = o0Var;
        this.o0 = o0Var.n();
        this.m = random;
        this.mo = z2 ? new byte[4] : null;
        this.mm = z2 ? new com.thinkup.core.common.no.n.n.o() : null;
    }

    public final void m(om omVar) throws IOException {
        m(10, omVar);
    }

    public final void o(om omVar) throws IOException {
        m(9, omVar);
    }

    private void m(int i2, om omVar) throws IOException {
        if (this.oo) {
            throw new IOException("closed");
        }
        int iMm = omVar.mm();
        if (iMm > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.o0.n0(i2 | 128);
        if (this.o) {
            this.o0.n0(iMm | 128);
            this.m.nextBytes(this.mo);
            this.o0.o0(this.mo);
            if (iMm > 0) {
                long jM = this.o0.m();
                this.o0.o0(omVar);
                this.o0.o(this.mm);
                this.mm.o(jM);
                m.o(this.mm, this.mo);
                this.mm.close();
            }
        } else {
            this.o0.n0(iMm);
            this.o0.o0(omVar);
        }
        this.f42023n.flush();
    }

    public final void o(int i2, om omVar) {
        om omVarOo0 = om.m;
        if (i2 != 0 || omVar != null) {
            if (i2 != 0) {
                m.m(i2);
            }
            com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
            nVar.mn(i2);
            if (omVar != null) {
                nVar.o0(omVar);
            }
            omVarOo0 = nVar.oo0();
        }
        try {
            m(8, omVarOo0);
        } finally {
            this.oo = true;
        }
    }

    public final class o implements oom {
        long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f42024n;
        int o;
        boolean o0;

        public o() {
        }

        @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.o0) {
                throw new IOException("closed");
            }
            o0 o0Var = o0.this;
            o0Var.o(this.o, o0Var.om.m(), this.f42024n, true);
            this.o0 = true;
            o0.this.m0 = false;
        }

        @Override // com.thinkup.core.common.no.n.oom, java.io.Flushable
        public final void flush() throws IOException {
            if (this.o0) {
                throw new IOException("closed");
            }
            o0 o0Var = o0.this;
            o0Var.o(this.o, o0Var.om.m(), this.f42024n, false);
            this.f42024n = false;
        }

        @Override // com.thinkup.core.common.no.n.oom
        public final void o(com.thinkup.core.common.no.n.n nVar, long j) throws IOException {
            if (this.o0) {
                throw new IOException("closed");
            }
            o0.this.om.o(nVar, j);
            boolean z2 = this.f42024n && this.m != -1 && o0.this.om.m() > this.m - PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            long jMm = o0.this.om.mm();
            if (jMm <= 0 || z2) {
                return;
            }
            o0.this.o(this.o, jMm, this.f42024n, false);
            this.f42024n = false;
        }

        @Override // com.thinkup.core.common.no.n.oom
        public final om0 o() {
            return o0.this.f42023n.o();
        }
    }

    private oom o(int i2, long j) {
        if (!this.m0) {
            this.m0 = true;
            o oVar = this.on;
            oVar.o = i2;
            oVar.m = j;
            oVar.f42024n = true;
            oVar.o0 = false;
            return oVar;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    public final void o(int i2, long j, boolean z2, boolean z3) throws IOException {
        if (!this.oo) {
            if (!z2) {
                i2 = 0;
            }
            if (z3) {
                i2 |= 128;
            }
            this.o0.n0(i2);
            int i3 = this.o ? 128 : 0;
            if (j <= 125) {
                this.o0.n0(((int) j) | i3);
            } else if (j <= 65535) {
                this.o0.n0(i3 | 126);
                this.o0.mn((int) j);
            } else {
                this.o0.n0(i3 | 127);
                this.o0.o0o(j);
            }
            if (this.o) {
                this.m.nextBytes(this.mo);
                this.o0.o0(this.mo);
                if (j > 0) {
                    long jM = this.o0.m();
                    this.o0.o(this.om, j);
                    this.o0.o(this.mm);
                    this.mm.o(jM);
                    m.o(this.mm, this.mo);
                    this.mm.close();
                }
            } else {
                this.o0.o(this.om, j);
            }
            this.f42023n.om();
            return;
        }
        throw new IOException("closed");
    }
}
