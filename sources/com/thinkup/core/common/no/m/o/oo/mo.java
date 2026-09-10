package com.thinkup.core.common.no.m.o.oo;

import com.thinkup.core.common.no.m.ooo;
import com.thinkup.core.common.no.n.om0;
import com.thinkup.core.common.no.n.oom;
import com.thinkup.core.common.no.n.oon;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mo {
    static final /* synthetic */ boolean mm = true;
    long m;
    com.thinkup.core.common.no.m.o.oo.m m0;
    private final Deque<ooo> mn;
    IOException mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f42051n;
    private boolean n0;
    private final m no;
    long o = 0;
    final om o0;
    final n om;
    final n on;
    final o oo;

    public final class m implements oon {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ boolean f42052n = true;
        boolean m;
        private ooo m0;
        boolean o;
        private final long on;
        private final com.thinkup.core.common.no.n.n oo = new com.thinkup.core.common.no.n.n();
        private final com.thinkup.core.common.no.n.n om = new com.thinkup.core.common.no.n.n();

        public m(long j) {
            this.on = j;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0092  */
        /* JADX WARN: Code duplicated, block: B:41:0x0096 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x0098 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x0099  */
        @Override // com.thinkup.core.common.no.n.oon
        public final long a_(com.thinkup.core.common.no.n.n nVar, long j) throws Throwable {
            Throwable nmVar;
            long jA_;
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            while (true) {
                synchronized (mo.this) {
                    try {
                        mo.this.om.n();
                        try {
                            mo moVar = mo.this;
                            if (moVar.m0 != null) {
                                nmVar = moVar.mo;
                                if (nmVar == null) {
                                    nmVar = new nm(mo.this.m0);
                                }
                            } else {
                                nmVar = null;
                            }
                            if (this.o) {
                                throw new IOException("stream closed");
                            }
                            if (this.om.m() > 0) {
                                com.thinkup.core.common.no.n.n nVar2 = this.om;
                                jA_ = nVar2.a_(nVar, Math.min(j, nVar2.m()));
                                mo moVar2 = mo.this;
                                long j2 = moVar2.o + jA_;
                                moVar2.o = j2;
                                if (nmVar != null || j2 < moVar2.o0.nn.oo() / 2) {
                                    break;
                                    break;
                                }
                                mo moVar3 = mo.this;
                                moVar3.o0.o(moVar3.f42051n, moVar3.o);
                                mo.this.o = 0L;
                                break;
                            }
                            if (this.m || nmVar != null) {
                                jA_ = -1;
                                break;
                            }
                            mo.this.mo();
                            mo.this.om.m();
                        } catch (Throwable th) {
                            mo.this.om.m();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (jA_ != -1) {
                    o(jA_);
                    return jA_;
                }
                if (nmVar == null) {
                    return -1L;
                }
                throw nmVar;
            }
            mo.this.om.m();
            if (jA_ != -1) {
                o(jA_);
                return jA_;
            }
            if (nmVar == null) {
                return -1L;
            }
            throw nmVar;
        }

        @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long jM;
            synchronized (mo.this) {
                this.o = true;
                jM = this.om.m();
                this.om.omm();
                mo.this.notifyAll();
            }
            if (jM > 0) {
                o(jM);
            }
            mo.this.on();
        }

        private void o(long j) {
            if (!f42052n && Thread.holdsLock(mo.this)) {
                throw new AssertionError();
            }
            mo.this.o0.o(j);
        }

        public final void o(com.thinkup.core.common.no.n.oo ooVar, long j) throws EOFException {
            boolean z2;
            boolean z3;
            long jM;
            if (!f42052n && Thread.holdsLock(mo.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (mo.this) {
                    z2 = this.m;
                    z3 = this.om.m() + j > this.on;
                }
                if (z3) {
                    ooVar.mo(j);
                    mo.this.o(com.thinkup.core.common.no.m.o.oo.m.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z2) {
                    ooVar.mo(j);
                    return;
                }
                long jA_ = ooVar.a_(this.oo, j);
                if (jA_ != -1) {
                    j -= jA_;
                    synchronized (mo.this) {
                        try {
                            if (this.o) {
                                jM = this.oo.m();
                                this.oo.omm();
                            } else {
                                boolean z4 = this.om.m() == 0;
                                this.om.o((oon) this.oo);
                                if (z4) {
                                    mo.this.notifyAll();
                                }
                                jM = 0;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (jM > 0) {
                        o(jM);
                    }
                } else {
                    throw new EOFException();
                }
            }
        }

        @Override // com.thinkup.core.common.no.n.oon
        public final om0 o() {
            return mo.this.om;
        }
    }

    public final class o implements oom {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ boolean f42053n = true;
        private static final long oo = 16384;
        boolean m;
        boolean o;
        private final com.thinkup.core.common.no.n.n om = new com.thinkup.core.common.no.n.n();
        private ooo on;

        public o() {
        }

        @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (!f42053n && Thread.holdsLock(mo.this)) {
                throw new AssertionError();
            }
            synchronized (mo.this) {
                if (this.o) {
                    return;
                }
                if (!mo.this.oo.m) {
                    boolean z2 = this.om.m() > 0;
                    if (this.on != null) {
                        while (this.om.m() > 0) {
                            o(false);
                        }
                        mo moVar = mo.this;
                        moVar.o0.o(moVar.f42051n, true, com.thinkup.core.common.no.m.o.n.o(this.on));
                    } else if (z2) {
                        while (this.om.m() > 0) {
                            o(true);
                        }
                    } else {
                        mo moVar2 = mo.this;
                        moVar2.o0.o(moVar2.f42051n, true, (com.thinkup.core.common.no.n.n) null, 0L);
                    }
                }
                synchronized (mo.this) {
                    this.o = true;
                }
                mo.this.o0.o0m.m();
                mo.this.on();
            }
        }

        @Override // com.thinkup.core.common.no.n.oom, java.io.Flushable
        public final void flush() throws IOException {
            if (!f42053n && Thread.holdsLock(mo.this)) {
                throw new AssertionError();
            }
            synchronized (mo.this) {
                mo.this.m0();
            }
            while (this.om.m() > 0) {
                o(false);
                mo.this.o0.o0m.m();
            }
        }

        @Override // com.thinkup.core.common.no.n.oom
        public final void o(com.thinkup.core.common.no.n.n nVar, long j) throws IOException {
            if (!f42053n && Thread.holdsLock(mo.this)) {
                throw new AssertionError();
            }
            this.om.o(nVar, j);
            while (this.om.m() >= 16384) {
                o(false);
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005e  */
        private void o(boolean z2) throws IOException {
            mo moVar;
            long jMin;
            mo moVar2;
            boolean z3;
            synchronized (mo.this) {
                mo.this.on.n();
                while (true) {
                    try {
                        moVar = mo.this;
                        if (moVar.m > 0 || this.m || this.o || moVar.m0 != null) {
                            break;
                        } else {
                            moVar.mo();
                        }
                    } catch (Throwable th) {
                        mo.this.on.m();
                        throw th;
                    }
                }
                moVar.on.m();
                mo.this.m0();
                jMin = Math.min(mo.this.m, this.om.m());
                moVar2 = mo.this;
                moVar2.m -= jMin;
            }
            moVar2.on.n();
            if (z2) {
                try {
                    if (jMin == this.om.m()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } finally {
                    mo.this.on.m();
                }
            } else {
                z3 = false;
            }
            boolean z4 = z3;
            mo moVar3 = mo.this;
            moVar3.o0.o(moVar3.f42051n, z4, this.om, jMin);
        }

        @Override // com.thinkup.core.common.no.n.oom
        public final om0 o() {
            return mo.this.on;
        }
    }

    public mo(int i2, om omVar, boolean z2, boolean z3, ooo oooVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.mn = arrayDeque;
        this.om = new n();
        this.on = new n();
        if (omVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f42051n = i2;
        this.o0 = omVar;
        this.m = omVar.o00.oo();
        m mVar = new m(omVar.nn.oo());
        this.no = mVar;
        o oVar = new o();
        this.oo = oVar;
        mVar.m = z3;
        oVar.m = z2;
        if (oooVar != null) {
            arrayDeque.add(oooVar);
        }
        if (m() && oooVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m() && oooVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private int mm() {
        return this.f42051n;
    }

    private om mn() {
        return this.o0;
    }

    private synchronized com.thinkup.core.common.no.m.o.oo.m n0() {
        return this.m0;
    }

    private om0 nm() {
        return this.on;
    }

    private om0 no() {
        return this.om;
    }

    public final boolean m() {
        return this.o0.om == ((this.f42051n & 1) == 1);
    }

    public final void m0() throws IOException {
        o oVar = this.oo;
        if (oVar.o) {
            throw new IOException("stream closed");
        }
        if (oVar.m) {
            throw new IOException("stream finished");
        }
        if (this.m0 != null) {
            IOException iOException = this.mo;
            if (iOException == null) {
                throw new nm(this.m0);
            }
        }
    }

    public final void mo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final synchronized ooo n() throws IOException {
        this.om.n();
        while (this.mn.isEmpty() && this.m0 == null) {
            try {
                mo();
            } catch (Throwable th) {
                this.om.m();
                throw th;
            }
        }
        this.om.m();
        if (this.mn.isEmpty()) {
            IOException iOException = this.mo;
            if (iOException != null) {
                throw iOException;
            }
            throw new nm(this.m0);
        }
        return this.mn.removeFirst();
    }

    public final synchronized boolean o() {
        try {
            if (this.m0 != null) {
                return false;
            }
            m mVar = this.no;
            if (mVar.m || mVar.o) {
                o oVar = this.oo;
                if ((oVar.m || oVar.o) && this.n0) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ooo o0() throws IOException {
        try {
            if (this.m0 != null) {
                IOException iOException = this.mo;
                if (iOException != null) {
                    throw iOException;
                }
                throw new nm(this.m0);
            }
            m mVar = this.no;
            if (!mVar.m || !mVar.oo.on() || !this.no.om.on()) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            if (this.no.m0 != null) {
                return this.no.m0;
            }
            return com.thinkup.core.common.no.m.o.n.f42026n;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final oom om() {
        synchronized (this) {
            try {
                if (!this.n0 && !m()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.oo;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002b  */
    public final void on() {
        boolean z2;
        boolean zO;
        if (!mm && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                m mVar = this.no;
                if (mVar.m || !mVar.o) {
                    z2 = false;
                } else {
                    o oVar = this.oo;
                    if (oVar.m || oVar.o) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                zO = o();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            o(com.thinkup.core.common.no.m.o.oo.m.CANCEL, (IOException) null);
        } else {
            if (zO) {
                return;
            }
            this.o0.m(this.f42051n);
        }
    }

    public final oon oo() {
        return this.no;
    }

    public class n extends com.thinkup.core.common.no.n.o {
        public n() {
        }

        public final void m() throws IOException {
            if (o0()) {
                throw o((IOException) null);
            }
        }

        @Override // com.thinkup.core.common.no.n.o
        public final void o() {
            mo.this.o(com.thinkup.core.common.no.m.o.oo.m.CANCEL);
            mo.this.o0.n();
        }

        @Override // com.thinkup.core.common.no.n.o
        public final IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    private boolean m(com.thinkup.core.common.no.m.o.oo.m mVar, IOException iOException) {
        if (!mm && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.m0 != null) {
                    return false;
                }
                if (this.no.m && this.oo.m) {
                    return false;
                }
                this.m0 = mVar;
                this.mo = iOException;
                notifyAll();
                this.o0.m(this.f42051n);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(List<com.thinkup.core.common.no.m.o.oo.n> list, boolean z2, boolean z3) {
        boolean z4;
        if (!mm && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (list != null) {
            synchronized (this) {
                z4 = true;
                try {
                    this.n0 = true;
                    if (z2) {
                        this.oo.m = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3) {
                synchronized (this.o0) {
                    if (this.o0.nm != 0) {
                        z4 = false;
                    }
                }
                z3 = z4;
            }
            this.o0.o(this.f42051n, z2, list);
            if (z3) {
                this.o0.o0m.m();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public final synchronized void m(com.thinkup.core.common.no.m.o.oo.m mVar) {
        if (this.m0 == null) {
            this.m0 = mVar;
            notifyAll();
        }
    }

    private void o(ooo oooVar) {
        synchronized (this) {
            try {
                if (!this.oo.m) {
                    if (oooVar.o() != 0) {
                        this.oo.on = oooVar;
                    } else {
                        throw new IllegalArgumentException("trailers.size() == 0");
                    }
                } else {
                    throw new IllegalStateException("already finished");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(com.thinkup.core.common.no.m.o.oo.m mVar, IOException iOException) {
        if (m(mVar, iOException)) {
            this.o0.m(this.f42051n, mVar);
        }
    }

    public final void o(com.thinkup.core.common.no.m.o.oo.m mVar) {
        if (m(mVar, null)) {
            this.o0.o(this.f42051n, mVar);
        }
    }

    public final void o(com.thinkup.core.common.no.n.oo ooVar, int i2) throws EOFException {
        if (!mm && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.no.o(ooVar, i2);
    }

    public final void o(ooo oooVar, boolean z2) {
        boolean zO;
        if (!mm && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.n0 && z2) {
                    this.no.m0 = oooVar;
                } else {
                    this.n0 = true;
                    this.mn.add(oooVar);
                }
                if (z2) {
                    this.no.m = true;
                }
                zO = o();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zO) {
            return;
        }
        this.o0.m(this.f42051n);
    }

    public final void o(long j) {
        this.m += j;
        if (j > 0) {
            notifyAll();
        }
    }
}
