package com.thinkup.core.common.no.m.o.o0;

import android.support.v4.media.session.PlaybackStateCompat;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.o.n.mn;
import com.thinkup.core.common.no.m.o.n.mo;
import com.thinkup.core.common.no.m.omm;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.ooo;
import com.thinkup.core.common.no.n.mm;
import com.thinkup.core.common.no.n.om0;
import com.thinkup.core.common.no.n.oom;
import com.thinkup.core.common.no.n.oon;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements com.thinkup.core.common.no.m.o.n.n {
    private static final int m = 0;
    private static final int m0 = 6;
    private static final int mo = 262144;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f42038n = 1;
    private static final int o0 = 2;
    private static final int om = 4;
    private static final int on = 5;
    private static final int oo = 3;
    private final omm mm;
    private final com.thinkup.core.common.no.m.o.m.oo mn;
    private final com.thinkup.core.common.no.n.oo n0;
    private int nm = 0;
    private long nn = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    private final com.thinkup.core.common.no.n.o0 no;
    private ooo o00;

    public final class m implements oom {
        private final mm m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f42039n;

        public m() {
            this.m = new mm(o.this.no.o());
        }

        @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f42039n) {
                return;
            }
            this.f42039n = true;
            o.this.no.m("0\r\n\r\n");
            o.o(this.m);
            o.this.nm = 3;
        }

        @Override // com.thinkup.core.common.no.n.oom, java.io.Flushable
        public final synchronized void flush() {
            if (this.f42039n) {
                return;
            }
            o.this.no.flush();
        }

        @Override // com.thinkup.core.common.no.n.oom
        public final om0 o() {
            return this.m;
        }

        @Override // com.thinkup.core.common.no.n.oom
        public final void o(com.thinkup.core.common.no.n.n nVar, long j) {
            if (this.f42039n) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            o.this.no.nm(j);
            o.this.no.m(IOUtils.LINE_SEPARATOR_WINDOWS);
            o.this.no.o(nVar, j);
            o.this.no.m(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
    }

    public class n extends AbstractC0674o {
        private static final long oo = -1;
        private boolean m0;
        private final com.thinkup.core.common.no.m.oom om;
        private long on;

        public n(com.thinkup.core.common.no.m.oom oomVar) {
            super(o.this, (byte) 0);
            this.on = -1L;
            this.m0 = true;
            this.om = oomVar;
        }

        private void n() throws ProtocolException {
            if (this.on != -1) {
                o.this.n0.oon();
            }
            try {
                this.on = o.this.n0.o0n();
                String strTrim = o.this.n0.oon().trim();
                if (this.on < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.on + strTrim + "\"");
                }
                if (this.on == 0) {
                    this.m0 = false;
                    o oVar = o.this;
                    oVar.o00 = oVar.m0();
                    com.thinkup.core.common.no.m.o.n.oo.o(o.this.mm.oo(), this.om, o.this.o00);
                    m();
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // com.thinkup.core.common.no.m.o.o0.o.AbstractC0674o, com.thinkup.core.common.no.n.oon
        public final long a_(com.thinkup.core.common.no.n.n nVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            if (this.m) {
                throw new IllegalStateException("closed");
            }
            if (!this.m0) {
                return -1L;
            }
            long j2 = this.on;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    o.this.n0.oon();
                }
                try {
                    this.on = o.this.n0.o0n();
                    String strTrim = o.this.n0.oon().trim();
                    if (this.on < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.on + strTrim + "\"");
                    }
                    if (this.on == 0) {
                        this.m0 = false;
                        o oVar = o.this;
                        oVar.o00 = oVar.m0();
                        com.thinkup.core.common.no.m.o.n.oo.o(o.this.mm.oo(), this.om, o.this.o00);
                        m();
                    }
                    if (!this.m0) {
                        return -1L;
                    }
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            }
            long jA_ = super.a_(nVar, Math.min(j, this.on));
            if (jA_ != -1) {
                this.on -= jA_;
                return jA_;
            }
            o.this.mn.oo();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }

        @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.m) {
                return;
            }
            if (this.m0 && !com.thinkup.core.common.no.m.o.n.o(this, TimeUnit.MILLISECONDS)) {
                o.this.mn.oo();
                m();
            }
            this.m = true;
        }
    }

    public class o0 extends AbstractC0674o {
        private long oo;

        public o0(long j) {
            super(o.this, (byte) 0);
            this.oo = j;
            if (j == 0) {
                m();
            }
        }

        @Override // com.thinkup.core.common.no.m.o.o0.o.AbstractC0674o, com.thinkup.core.common.no.n.oon
        public final long a_(com.thinkup.core.common.no.n.n nVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            if (this.m) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.oo;
            if (j2 == 0) {
                return -1L;
            }
            long jA_ = super.a_(nVar, Math.min(j2, j));
            if (jA_ == -1) {
                o.this.mn.oo();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m();
                throw protocolException;
            }
            long j3 = this.oo - jA_;
            this.oo = j3;
            if (j3 == 0) {
                m();
            }
            return jA_;
        }

        @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.m) {
                return;
            }
            if (this.oo != 0 && !com.thinkup.core.common.no.m.o.n.o(this, TimeUnit.MILLISECONDS)) {
                o.this.mn.oo();
                m();
            }
            this.m = true;
        }
    }

    public class om extends AbstractC0674o {
        private boolean oo;

        private om() {
            super(o.this, (byte) 0);
        }

        @Override // com.thinkup.core.common.no.m.o.o0.o.AbstractC0674o, com.thinkup.core.common.no.n.oon
        public final long a_(com.thinkup.core.common.no.n.n nVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            if (this.m) {
                throw new IllegalStateException("closed");
            }
            if (this.oo) {
                return -1L;
            }
            long jA_ = super.a_(nVar, j);
            if (jA_ != -1) {
                return jA_;
            }
            this.oo = true;
            m();
            return -1L;
        }

        @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.m) {
                return;
            }
            if (!this.oo) {
                m();
            }
            this.m = true;
        }

        public /* synthetic */ om(o oVar, byte b2) {
            this();
        }
    }

    public final class oo implements oom {
        private final mm m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f42041n;

        private oo() {
            this.m = new mm(o.this.no.o());
        }

        @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f42041n) {
                return;
            }
            this.f42041n = true;
            o.o(this.m);
            o.this.nm = 3;
        }

        @Override // com.thinkup.core.common.no.n.oom, java.io.Flushable
        public final void flush() {
            if (this.f42041n) {
                return;
            }
            o.this.no.flush();
        }

        @Override // com.thinkup.core.common.no.n.oom
        public final om0 o() {
            return this.m;
        }

        @Override // com.thinkup.core.common.no.n.oom
        public final void o(com.thinkup.core.common.no.n.n nVar, long j) {
            if (this.f42041n) {
                throw new IllegalStateException("closed");
            }
            com.thinkup.core.common.no.m.o.n.o(nVar.m(), j);
            o.this.no.o(nVar, j);
        }

        public /* synthetic */ oo(o oVar, byte b2) {
            this();
        }
    }

    public o(omm ommVar, com.thinkup.core.common.no.m.o.m.oo ooVar, com.thinkup.core.common.no.n.oo ooVar2, com.thinkup.core.common.no.n.o0 o0Var) {
        this.mm = ommVar;
        this.mn = ooVar;
        this.n0 = ooVar2;
        this.no = o0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ooo m0() {
        ooo.o oVar = new ooo.o();
        while (true) {
            String strOn = on();
            if (strOn.length() == 0) {
                return oVar.o();
            }
            com.thinkup.core.common.no.m.o.o.o.o(oVar, strOn);
        }
    }

    private oom mm() {
        if (this.nm == 1) {
            this.nm = 2;
            return new oo(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.nm);
    }

    private oon mn() {
        if (this.nm == 4) {
            this.nm = 5;
            this.mn.oo();
            return new om(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.nm);
    }

    private oom mo() {
        if (this.nm == 1) {
            this.nm = 2;
            return new m();
        }
        throw new IllegalStateException("state: " + this.nm);
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.no.m.o.o0.o$o, reason: collision with other inner class name */
    public abstract class AbstractC0674o implements oon {
        protected boolean m;
        protected final mm o;

        private AbstractC0674o() {
            this.o = new mm(o.this.n0.o());
        }

        @Override // com.thinkup.core.common.no.n.oon
        public long a_(com.thinkup.core.common.no.n.n nVar, long j) throws IOException {
            try {
                return o.this.n0.a_(nVar, j);
            } catch (IOException e2) {
                o.this.mn.oo();
                m();
                throw e2;
            }
        }

        public final void m() {
            if (o.this.nm == 6) {
                return;
            }
            if (o.this.nm == 5) {
                o.o(this.o);
                o.this.nm = 6;
            } else {
                throw new IllegalStateException("state: " + o.this.nm);
            }
        }

        @Override // com.thinkup.core.common.no.n.oon
        public final om0 o() {
            return this.o;
        }

        public /* synthetic */ AbstractC0674o(o oVar, byte b2) {
            this();
        }
    }

    private boolean om() {
        return this.nm == 6;
    }

    private String on() {
        String strOm = this.n0.om(this.nn);
        this.nn -= (long) strOm.length();
        return strOm;
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final oon m(m00 m00Var) {
        if (!com.thinkup.core.common.no.m.o.n.oo.o0(m00Var)) {
            return o(0L);
        }
        if ("chunked".equalsIgnoreCase(m00Var.o("Transfer-Encoding"))) {
            com.thinkup.core.common.no.m.oom oomVarO = m00Var.o().o();
            if (this.nm == 4) {
                this.nm = 5;
                return new n(oomVarO);
            }
            throw new IllegalStateException("state: " + this.nm);
        }
        long jO = com.thinkup.core.common.no.m.o.n.oo.o(m00Var);
        if (jO != -1) {
            return o(jO);
        }
        if (this.nm == 4) {
            this.nm = 5;
            this.mn.oo();
            return new om(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.nm);
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final void n() {
        this.no.flush();
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final ooo o0() {
        if (this.nm != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        ooo oooVar = this.o00;
        return oooVar != null ? oooVar : com.thinkup.core.common.no.m.o.n.f42026n;
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final void oo() {
        com.thinkup.core.common.no.m.o.m.oo ooVar = this.mn;
        if (ooVar != null) {
            ooVar.om();
        }
    }

    public final void n(m00 m00Var) {
        long jO = com.thinkup.core.common.no.m.o.n.oo.o(m00Var);
        if (jO == -1) {
            return;
        }
        oon oonVarO = o(jO);
        com.thinkup.core.common.no.m.o.n.o(oonVarO, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        oonVarO.close();
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final com.thinkup.core.common.no.m.o.m.oo o() {
        return this.mn;
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final oom o(onm onmVar, long j) {
        if (onmVar.o0() != null) {
            onmVar.o0();
        }
        if ("chunked".equalsIgnoreCase(onmVar.o("Transfer-Encoding"))) {
            if (this.nm == 1) {
                this.nm = 2;
                return new m();
            }
            throw new IllegalStateException("state: " + this.nm);
        }
        if (j != -1) {
            if (this.nm == 1) {
                this.nm = 2;
                return new oo(this, (byte) 0);
            }
            throw new IllegalStateException("state: " + this.nm);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final void o(onm onmVar) {
        Proxy.Type type = this.mn.o().m().type();
        StringBuilder sb = new StringBuilder();
        sb.append(onmVar.m());
        sb.append(' ');
        if (!onmVar.on() && type == Proxy.Type.HTTP) {
            sb.append(onmVar.o());
        } else {
            sb.append(mo.o(onmVar.o()));
        }
        sb.append(" HTTP/1.1");
        o(onmVar.n(), sb.toString());
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final void m() {
        this.no.flush();
    }

    private static void m(mm mmVar) {
        om0 om0VarO = mmVar.o();
        mmVar.o(om0.f42093n);
        om0VarO.om();
        om0VarO.f_();
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final long o(m00 m00Var) {
        if (!com.thinkup.core.common.no.m.o.n.oo.o0(m00Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(m00Var.o("Transfer-Encoding"))) {
            return -1L;
        }
        return com.thinkup.core.common.no.m.o.n.oo.o(m00Var);
    }

    public final void o(ooo oooVar, String str) {
        if (this.nm == 0) {
            this.no.m(str).m(IOUtils.LINE_SEPARATOR_WINDOWS);
            int iO = oooVar.o();
            for (int i2 = 0; i2 < iO; i2++) {
                this.no.m(oooVar.o(i2)).m(": ").m(oooVar.m(i2)).m(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            this.no.m(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.nm = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.nm);
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final m00.o o(boolean z2) throws IOException {
        String strN0;
        int i2 = this.nm;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException("state: " + this.nm);
        }
        try {
            mn mnVarO = mn.o(on());
            m00.o oVarO = new m00.o().o(mnVarO.o0).o(mnVarO.oo).o(mnVarO.om).o(m0());
            if (z2 && mnVarO.oo == 100) {
                return null;
            }
            if (mnVarO.oo == 100) {
                this.nm = 3;
                return oVarO;
            }
            this.nm = 4;
            return oVarO;
        } catch (EOFException e2) {
            com.thinkup.core.common.no.m.o.m.oo ooVar = this.mn;
            if (ooVar != null) {
                strN0 = ooVar.o().o().o().n0();
            } else {
                strN0 = "unknown";
            }
            throw new IOException("unexpected end of stream on ".concat(String.valueOf(strN0)), e2);
        }
    }

    private oon o(long j) {
        if (this.nm == 4) {
            this.nm = 5;
            return new o0(j);
        }
        throw new IllegalStateException("state: " + this.nm);
    }

    private oon o(com.thinkup.core.common.no.m.oom oomVar) {
        if (this.nm == 4) {
            this.nm = 5;
            return new n(oomVar);
        }
        throw new IllegalStateException("state: " + this.nm);
    }

    public static /* synthetic */ void o(mm mmVar) {
        om0 om0VarO = mmVar.o();
        mmVar.o(om0.f42093n);
        om0VarO.om();
        om0VarO.f_();
    }
}
