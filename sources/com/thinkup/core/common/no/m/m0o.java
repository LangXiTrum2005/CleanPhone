package com.thinkup.core.common.no.m;

import android.support.v4.media.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m0o implements Closeable {
    private Reader o;

    public static final class o extends Reader {
        private final Charset m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f41993n;
        private final com.thinkup.core.common.no.n.oo o;
        private Reader o0;

        public o(com.thinkup.core.common.no.n.oo ooVar, Charset charset) {
            this.o = ooVar;
            this.m = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f41993n = true;
            Reader reader = this.o0;
            if (reader != null) {
                reader.close();
            } else {
                this.o.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i2, int i3) throws IOException {
            if (this.f41993n) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.o0;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.o.mo(), com.thinkup.core.common.no.m.o.n.o(this.o, this.m));
                this.o0 = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i2, i3);
        }
    }

    private Charset m0() {
        om0 om0VarO = o();
        return om0VarO != null ? om0VarO.o(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    private static m0o o(om0 om0Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (om0Var != null) {
            Charset charsetO = om0Var.o((Charset) null);
            if (charsetO == null) {
                om0Var = om0.m(om0Var + "; charset=utf-8");
            } else {
                charset = charsetO;
            }
        }
        com.thinkup.core.common.no.n.n nVarM = new com.thinkup.core.common.no.n.n().m(str, charset);
        return o(om0Var, nVarM.m(), nVarM);
    }

    private byte[] om() throws IOException {
        long jM = m();
        if (jM > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(jM)));
        }
        com.thinkup.core.common.no.n.oo ooVarN = n();
        try {
            byte[] bArrOmo = ooVarN.omo();
            ooVarN.close();
            if (jM == -1 || jM == bArrOmo.length) {
                return bArrOmo;
            }
            throw new IOException(a.i(bArrOmo.length, ") disagree", a.v(jM, "Content-Length (", ") and stream length (")));
        } catch (Throwable th) {
            if (ooVarN != null) {
                try {
                    ooVarN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private Reader on() {
        Reader reader = this.o;
        if (reader != null) {
            return reader;
        }
        o oVar = new o(n(), m0());
        this.o = oVar;
        return oVar;
    }

    private InputStream oo() {
        return n().mo();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.thinkup.core.common.no.m.o.n.o(n());
    }

    public abstract long m();

    public abstract com.thinkup.core.common.no.n.oo n();

    public abstract om0 o();

    public final String o0() {
        com.thinkup.core.common.no.n.oo ooVarN = n();
        try {
            String strO = ooVarN.o(com.thinkup.core.common.no.m.o.n.o(ooVarN, m0()));
            ooVarN.close();
            return strO;
        } catch (Throwable th) {
            if (ooVarN != null) {
                try {
                    ooVarN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static m0o o(om0 om0Var, byte[] bArr) {
        return o(om0Var, bArr.length, new com.thinkup.core.common.no.n.n().o0(bArr));
    }

    private static m0o o(om0 om0Var, com.thinkup.core.common.no.n.om omVar) {
        return o(om0Var, omVar.mm(), new com.thinkup.core.common.no.n.n().o0(omVar));
    }

    public static m0o o(final om0 om0Var, final long j, final com.thinkup.core.common.no.n.oo ooVar) {
        if (ooVar != null) {
            return new m0o() { // from class: com.thinkup.core.common.no.m.m0o.1
                @Override // com.thinkup.core.common.no.m.m0o
                public final long m() {
                    return j;
                }

                @Override // com.thinkup.core.common.no.m.m0o
                public final com.thinkup.core.common.no.n.oo n() {
                    return ooVar;
                }

                @Override // com.thinkup.core.common.no.m.m0o
                public final om0 o() {
                    return om0Var;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
