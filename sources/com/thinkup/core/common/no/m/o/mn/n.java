package com.thinkup.core.common.no.m.o.mn;

import androidx.datastore.preferences.protobuf.a;
import com.thinkup.core.common.no.n.om;
import com.thinkup.core.common.no.n.oo;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
final class n {
    final oo m;
    boolean m0;
    private final byte[] mn;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final o f42019n;
    private final com.thinkup.core.common.no.n.n.o n0;
    final boolean o;
    boolean o0;
    long om;
    boolean on;
    int oo;
    private final com.thinkup.core.common.no.n.n mo = new com.thinkup.core.common.no.n.n();
    private final com.thinkup.core.common.no.n.n mm = new com.thinkup.core.common.no.n.n();

    public interface o {
        void m(om omVar);

        void o(int i2, String str);

        void om();

        void on();

        void oo();
    }

    public n(boolean z2, oo ooVar, o oVar) {
        if (ooVar == null) {
            throw new NullPointerException("source == null");
        }
        this.o = z2;
        this.m = ooVar;
        this.f42019n = oVar;
        this.mn = z2 ? null : new byte[4];
        this.n0 = z2 ? null : new com.thinkup.core.common.no.n.n.o();
    }

    private void m() throws IOException {
        if (this.o0) {
            throw new IOException("closed");
        }
        long jG_ = this.m.o().g_();
        this.m.o().f_();
        try {
            byte bMn = this.m.mn();
            this.m.o().o(jG_, TimeUnit.NANOSECONDS);
            this.oo = bMn & 15;
            boolean z2 = (bMn & 128) != 0;
            this.on = z2;
            boolean z3 = (bMn & 8) != 0;
            this.m0 = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (bMn & 64) != 0;
            boolean z5 = (bMn & 32) != 0;
            boolean z6 = (bMn & 16) != 0;
            if (z4 || z5 || z6) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            byte bMn2 = this.m.mn();
            boolean z7 = (bMn2 & 128) != 0;
            if (z7 == this.o) {
                throw new ProtocolException(this.o ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = bMn2 & AbstractJsonLexerKt.TC_INVALID;
            this.om = j;
            if (j == 126) {
                this.om = ((long) this.m.n0()) & 65535;
            } else if (j == 127) {
                long jNm = this.m.nm();
                this.om = jNm;
                if (jNm < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.om) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.m0 && this.om > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z7) {
                this.m.m(this.mn);
            }
        } catch (Throwable th) {
            this.m.o().o(jG_, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private void n() throws ProtocolException {
        short sN0;
        String strOoo;
        long j = this.om;
        if (j > 0) {
            this.m.m(this.mo, j);
            if (!this.o) {
                this.mo.o(this.n0);
                this.n0.o(0L);
                m.o(this.n0, this.mn);
                this.n0.close();
            }
        }
        switch (this.oo) {
            case 8:
                long jM = this.mo.m();
                if (jM == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (jM != 0) {
                    sN0 = this.mo.n0();
                    strOoo = this.mo.ooo();
                    String strO = m.o(sN0);
                    if (strO != null) {
                        throw new ProtocolException(strO);
                    }
                } else {
                    sN0 = 1005;
                    strOoo = "";
                }
                this.f42019n.o(sN0, strOoo);
                this.o0 = true;
                return;
            case 9:
                this.f42019n.m(this.mo.oo0());
                return;
            case 10:
                o oVar = this.f42019n;
                this.mo.oo0();
                oVar.on();
                return;
            default:
                throw new ProtocolException(a.h(this.oo, new StringBuilder("Unknown control opcode: ")));
        }
    }

    private void o0() throws IOException {
        int i2 = this.oo;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException(a.h(i2, new StringBuilder("Unknown opcode: ")));
        }
        om();
        if (i2 == 1) {
            this.mm.ooo();
        } else {
            this.mm.oo0();
        }
    }

    private void om() throws IOException {
        while (!this.o0) {
            long j = this.om;
            if (j > 0) {
                this.m.m(this.mm, j);
                if (!this.o) {
                    this.mm.o(this.n0);
                    this.n0.o(this.mm.m() - this.om);
                    m.o(this.n0, this.mn);
                    this.n0.close();
                }
            }
            if (this.on) {
                return;
            }
            oo();
            if (this.oo != 0) {
                throw new ProtocolException(a.h(this.oo, new StringBuilder("Expected continuation opcode. Got: ")));
            }
        }
        throw new IOException("closed");
    }

    private void oo() throws IOException {
        while (!this.o0) {
            m();
            if (!this.m0) {
                return;
            } else {
                n();
            }
        }
    }

    public final void o() throws IOException {
        m();
        if (this.m0) {
            n();
            return;
        }
        int i2 = this.oo;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException(a.h(i2, new StringBuilder("Unknown opcode: ")));
        }
        om();
        if (i2 == 1) {
            this.mm.ooo();
        } else {
            this.mm.oo0();
        }
    }
}
