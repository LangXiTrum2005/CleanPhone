package com.thinkup.core.common.no.m.o.mn;

import android.support.v4.media.a;
import com.p004ironsource.ko;
import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.mo0;
import com.thinkup.core.common.no.m.moo;
import com.thinkup.core.common.no.m.o0m;
import com.thinkup.core.common.no.m.omm;
import com.thinkup.core.common.no.m.omn;
import com.thinkup.core.common.no.m.on0;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.n.nm;
import com.thinkup.core.common.no.n.om;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements mo0, com.thinkup.core.common.no.m.o.mn.n.o {
    static final /* synthetic */ boolean m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List<on0> f42020n = Collections.singletonList(on0.HTTP_1_1);
    private static final long o0 = 16777216;
    private static final long oo = 60000;
    private final long m0;
    private com.thinkup.core.common.no.m.oo mm;
    private final Runnable mn;
    private final String mo;
    private com.thinkup.core.common.no.m.o.mn.n n0;
    private ScheduledExecutorService nm;
    private oo nn;
    private com.thinkup.core.common.no.m.o.mn.o0 no;
    final moo o;
    private long o0m;
    private boolean o0n;
    private final onm om;
    private int om0;
    private int omm;
    private boolean omn;
    private int omo;
    private final Random on;
    private ScheduledFuture<?> oo0;
    private String oom;
    private boolean oon;
    private final ArrayDeque<om> o00 = new ArrayDeque<>();
    private final ArrayDeque<Object> o0o = new ArrayDeque<>();
    private int ooo = -1;

    public static final class m {
        final om m;
        final int o = 1001;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final long f42021n = 60000;

        public m(om omVar) {
            this.m = omVar;
        }
    }

    public static final class n {
        final om m;
        final int o;

        public n(int i2, om omVar) {
            this.o = i2;
            this.m = omVar;
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.no.m.o.mn.o$o, reason: collision with other inner class name */
    public final class RunnableC0673o implements Runnable {
        public RunnableC0673o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.n();
        }
    }

    public final class o0 implements Runnable {
        public o0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.mo();
        }
    }

    public static abstract class oo implements Closeable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f42022n = true;
        public final com.thinkup.core.common.no.n.oo o0;
        public final com.thinkup.core.common.no.n.o0 oo;

        public oo(com.thinkup.core.common.no.n.oo ooVar, com.thinkup.core.common.no.n.o0 o0Var) {
            this.o0 = ooVar;
            this.oo = o0Var;
        }
    }

    public o(onm onmVar, moo mooVar, Random random, long j) {
        if (!ko.f25534a.equals(onmVar.m())) {
            throw new IllegalArgumentException("Request must be GET: " + onmVar.m());
        }
        this.om = onmVar;
        this.o = mooVar;
        this.on = random;
        this.m0 = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.mo = om.o(bArr).m();
        this.mn = new Runnable() { // from class: com.thinkup.core.common.no.m.o.mn.o.1
            @Override // java.lang.Runnable
            public final void run() {
                do {
                    try {
                    } catch (IOException unused) {
                        o.this.mm();
                        return;
                    }
                } while (o.this.m0());
            }
        };
    }

    private boolean mn() {
        try {
            this.n0.o();
            return this.ooo == -1;
        } catch (Exception unused) {
            mm();
            return false;
        }
    }

    private void n0() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.oo0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.nm.shutdown();
        this.nm.awaitTermination(10L, TimeUnit.SECONDS);
    }

    private synchronized int nm() {
        return this.omo;
    }

    private synchronized int nn() {
        return this.omm;
    }

    private synchronized int no() {
        return this.om0;
    }

    private void o00() {
        if (!m && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ScheduledExecutorService scheduledExecutorService = this.nm;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.mn);
        }
    }

    @Override // com.thinkup.core.common.no.m.mo0
    public final synchronized long m() {
        return this.o0m;
    }

    public final boolean m0() {
        oo ooVar;
        synchronized (this) {
            try {
                if (this.oon) {
                    return false;
                }
                com.thinkup.core.common.no.m.o.mn.o0 o0Var = this.no;
                om omVarPoll = this.o00.poll();
                Object obj = null;
                if (omVarPoll == null) {
                    Object objPoll = this.o0o.poll();
                    if (objPoll instanceof m) {
                        if (this.ooo != -1) {
                            ooVar = this.nn;
                            this.nn = null;
                            this.nm.shutdown();
                        } else {
                            this.oo0 = this.nm.schedule(new RunnableC0673o(), ((m) objPoll).f42021n, TimeUnit.MILLISECONDS);
                        }
                        obj = objPoll;
                    } else if (objPoll == null) {
                        return false;
                    }
                    ooVar = null;
                    obj = objPoll;
                } else {
                    ooVar = null;
                }
                try {
                    if (omVarPoll != null) {
                        o0Var.m(omVarPoll);
                    } else if (obj instanceof n) {
                        om omVar = ((n) obj).m;
                        int i2 = ((n) obj).o;
                        long jMm = omVar.mm();
                        if (o0Var.m0) {
                            throw new IllegalStateException("Another message writer is active. Did you call close()?");
                        }
                        o0Var.m0 = true;
                        com.thinkup.core.common.no.m.o.mn.o0.o oVar = o0Var.on;
                        oVar.o = i2;
                        oVar.m = jMm;
                        oVar.f42024n = true;
                        oVar.o0 = false;
                        com.thinkup.core.common.no.n.o0 o0VarO = nm.o(oVar);
                        o0VarO.o0(omVar);
                        o0VarO.close();
                        synchronized (this) {
                            this.o0m -= (long) omVar.mm();
                        }
                    } else {
                        if (!(obj instanceof m)) {
                            throw new AssertionError();
                        }
                        m mVar = (m) obj;
                        o0Var.o(mVar.o, mVar.m);
                    }
                    com.thinkup.core.common.no.m.o.n.o(ooVar);
                    return true;
                } catch (Throwable th) {
                    com.thinkup.core.common.no.m.o.n.o(ooVar);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void mm() {
        synchronized (this) {
            try {
                if (this.oon) {
                    return;
                }
                this.oon = true;
                oo ooVar = this.nn;
                this.nn = null;
                ScheduledFuture<?> scheduledFuture = this.oo0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.nm;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                com.thinkup.core.common.no.m.o.n.o(ooVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void mo() {
        synchronized (this) {
            try {
                if (this.oon) {
                    return;
                }
                com.thinkup.core.common.no.m.o.mn.o0 o0Var = this.no;
                int i2 = this.omn ? this.om0 : -1;
                this.om0++;
                this.omn = true;
                if (i2 == -1) {
                    try {
                        o0Var.o(om.m);
                    } catch (IOException unused) {
                        mm();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                    sb.append(this.m0);
                    sb.append("ms (after ");
                    new SocketTimeoutException(a.i(i2 - 1, " successful ping/pongs)", sb));
                    mm();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.thinkup.core.common.no.m.mo0
    public final void n() {
        this.mm.n();
    }

    @Override // com.thinkup.core.common.no.m.mo0
    public final onm o() {
        return this.om;
    }

    public final void o0() throws IOException {
        while (this.ooo == -1) {
            this.n0.o();
        }
    }

    @Override // com.thinkup.core.common.no.m.o.mn.n.o
    public final void om() {
    }

    @Override // com.thinkup.core.common.no.m.o.mn.n.o
    public final synchronized void on() {
        this.omm++;
        this.omn = false;
    }

    @Override // com.thinkup.core.common.no.m.o.mn.n.o
    public final void oo() {
    }

    private synchronized boolean n(om omVar) {
        try {
            if (!this.oon && (!this.o0n || !this.o0o.isEmpty())) {
                this.o00.add(omVar);
                o00();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.thinkup.core.common.no.m.o.mn.n.o
    public final synchronized void m(om omVar) {
        try {
            if (!this.oon && (!this.o0n || !this.o0o.isEmpty())) {
                this.o00.add(omVar);
                o00();
                this.omo++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(omm ommVar) {
        omm ommVarO = ommVar.oo0().o(o0m.o).o(f42020n).o();
        final onm onmVarM = this.om.oo().o("Upgrade", "websocket").o("Connection", "Upgrade").o("Sec-WebSocket-Key", this.mo).o("Sec-WebSocket-Version", "13").m();
        com.thinkup.core.common.no.m.oo ooVarO = com.thinkup.core.common.no.m.o.o.o.o(ommVarO, onmVarM);
        this.mm = ooVarO;
        ooVarO.o(new com.thinkup.core.common.no.m.om() { // from class: com.thinkup.core.common.no.m.o.mn.o.2
            @Override // com.thinkup.core.common.no.m.om
            public final void o(m00 m00Var) {
                com.thinkup.core.common.no.m.o.m.n nVarO = com.thinkup.core.common.no.m.o.o.o.o(m00Var);
                try {
                    o.this.o(m00Var, nVarO);
                    try {
                        o.this.o(omn.o + " webSocket " + onmVarM.o().n0(), nVarO.om());
                        o.this.o0();
                    } catch (Exception unused) {
                        o.this.mm();
                    }
                } catch (IOException unused2) {
                    if (nVarO != null) {
                        nVarO.on();
                    }
                    o.this.mm();
                    com.thinkup.core.common.no.m.o.n.o(m00Var);
                }
            }

            @Override // com.thinkup.core.common.no.m.om
            public final void o(IOException iOException) {
                o.this.mm();
            }
        });
    }

    private synchronized boolean n(String str) {
        om omVarO;
        try {
            com.thinkup.core.common.no.m.o.mn.m.m(1001);
            if (str != null) {
                omVarO = om.o(str);
                if (omVarO.mm() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
                }
            } else {
                omVarO = null;
            }
            if (!this.oon && !this.o0n) {
                this.o0n = true;
                this.o0o.add(new m(omVarO));
                o00();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.thinkup.core.common.no.m.mo0
    public final boolean m(String str) {
        return n(str);
    }

    public final void o(m00 m00Var, com.thinkup.core.common.no.m.o.m.n nVar) throws ProtocolException {
        if (m00Var.n() == 101) {
            String strO = m00Var.o("Connection");
            if ("Upgrade".equalsIgnoreCase(strO)) {
                String strO2 = m00Var.o("Upgrade");
                if ("websocket".equalsIgnoreCase(strO2)) {
                    String strO3 = m00Var.o("Sec-WebSocket-Accept");
                    String strM = om.o(this.mo + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").o0().m();
                    if (!strM.equals(strO3)) {
                        throw new ProtocolException(androidx.datastore.preferences.protobuf.a.n("Expected 'Sec-WebSocket-Accept' header value '", strM, "' but was '", strO3, "'"));
                    }
                    if (nVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                    return;
                }
                throw new ProtocolException(a.n("Expected 'Upgrade' header value 'websocket' but was '", strO2, "'"));
            }
            throw new ProtocolException(a.n("Expected 'Connection' header value 'Upgrade' but was '", strO, "'"));
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + m00Var.n() + " " + m00Var.o0() + "'");
    }

    public final void o(String str, oo ooVar) {
        synchronized (this) {
            try {
                this.nn = ooVar;
                this.no = new com.thinkup.core.common.no.m.o.mn.o0(ooVar.f42022n, ooVar.oo, this.on);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.thinkup.core.common.no.m.o.n.o(str, false));
                this.nm = scheduledThreadPoolExecutor;
                if (this.m0 != 0) {
                    o0 o0Var = new o0();
                    long j = this.m0;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(o0Var, j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.o0o.isEmpty()) {
                    o00();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.n0 = new com.thinkup.core.common.no.m.o.mn.n(ooVar.f42022n, ooVar.o0, this);
    }

    private void o(int i2, TimeUnit timeUnit) throws InterruptedException {
        this.nm.awaitTermination(i2, timeUnit);
    }

    @Override // com.thinkup.core.common.no.m.o.mn.n.o
    public final void o(int i2, String str) {
        oo ooVar;
        if (i2 != -1) {
            synchronized (this) {
                try {
                    if (this.ooo == -1) {
                        this.ooo = i2;
                        this.oom = str;
                        ooVar = null;
                        if (this.o0n && this.o0o.isEmpty()) {
                            oo ooVar2 = this.nn;
                            this.nn = null;
                            ScheduledFuture<?> scheduledFuture = this.oo0;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.nm.shutdown();
                            ooVar = ooVar2;
                        }
                    } else {
                        throw new IllegalStateException("already closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.thinkup.core.common.no.m.o.n.o(ooVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.thinkup.core.common.no.m.mo0
    public final boolean o(String str) {
        if (str != null) {
            return o(om.o(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    @Override // com.thinkup.core.common.no.m.mo0
    public final boolean o(om omVar) {
        if (omVar != null) {
            return o(omVar, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    private synchronized boolean o(om omVar, int i2) {
        if (!this.oon && !this.o0n) {
            if (this.o0m + ((long) omVar.mm()) > o0) {
                n((String) null);
                return false;
            }
            this.o0m += (long) omVar.mm();
            this.o0o.add(new n(i2, omVar));
            o00();
            return true;
        }
        return false;
    }
}
