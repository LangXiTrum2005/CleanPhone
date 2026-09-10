package com.thinkup.core.common.no.m.o.oo;

import android.support.v4.media.a;
import com.thinkup.core.common.no.m.omn;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class om implements Closeable {
    static final int m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f42059n = 2;
    static final int o = 16777216;
    static final int o0 = 3;
    static final long oo = 1000000000;
    private static final ExecutorService oom = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.thinkup.core.common.no.m.o.n.o(omn.o + " Http2Connection", true));
    static final /* synthetic */ boolean ooo = true;
    int mm;
    int mn;
    final String mo;
    final n0 n0;
    long nm;
    final no o00;
    final mm o0m;
    final oo o0n;
    final Socket o0o;
    final boolean om;
    private final ScheduledExecutorService om0;
    private final ExecutorService omo;
    final n on;
    final Set<Integer> oo0;
    private boolean oon;
    final Map<Integer, mo> m0 = new LinkedHashMap();
    private long omm = 0;
    private long omn = 0;
    private long on0 = 0;
    private long ono = 0;
    private long onm = 0;
    private long onn = 0;
    private long m00 = 0;
    long no = 0;
    no nn = new no();

    public final class m extends com.thinkup.core.common.no.m.o.m {
        public m() {
            super(a.r(new StringBuilder(), omn.o, " %s ping"), om.this.mo);
        }

        @Override // com.thinkup.core.common.no.m.o.m
        public final void n() {
            boolean z2;
            synchronized (om.this) {
                if (om.this.omn < om.this.omm) {
                    z2 = true;
                } else {
                    om.n(om.this);
                    z2 = false;
                }
            }
            if (z2) {
                om.this.o((IOException) null);
            } else {
                om.this.o(false, 1, 0);
            }
        }
    }

    public static abstract class n {
        public static final n m0 = new n() { // from class: com.thinkup.core.common.no.m.o.oo.om.n.1
            @Override // com.thinkup.core.common.no.m.o.oo.om.n
            public final void o(mo moVar) {
                moVar.o(com.thinkup.core.common.no.m.o.oo.m.REFUSED_STREAM, (IOException) null);
            }
        };

        public abstract void o(mo moVar);

        public void o(om omVar) {
        }
    }

    public final class o0 extends com.thinkup.core.common.no.m.o.m {
        final int m;
        final boolean o;
        final int o0;

        public o0(int i2, int i3) {
            super(a.r(new StringBuilder(), omn.o, " %s ping %08x%08x"), om.this.mo, Integer.valueOf(i2), Integer.valueOf(i3));
            this.o = true;
            this.m = i2;
            this.o0 = i3;
        }

        @Override // com.thinkup.core.common.no.m.o.m
        public final void n() {
            om.this.o(this.o, this.m, this.o0);
        }
    }

    public class oo extends com.thinkup.core.common.no.m.o.m implements m0.m {
        final m0 o;

        /* JADX INFO: renamed from: com.thinkup.core.common.no.m.o.oo.om$oo$3, reason: invalid class name */
        public class AnonymousClass3 extends com.thinkup.core.common.no.m.o.m {
            public AnonymousClass3(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // com.thinkup.core.common.no.m.o.m
            public final void n() {
                om omVar = om.this;
                omVar.on.o(omVar);
            }
        }

        public oo(m0 m0Var) {
            super(a.r(new StringBuilder(), omn.o, " %s"), om.this.mo);
            this.o = m0Var;
        }

        @Override // com.thinkup.core.common.no.m.o.oo.m0.m
        public final void m() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.thinkup.core.common.no.m.o.oo.m] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.thinkup.core.common.no.m.o.oo.m0, java.io.Closeable] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.thinkup.core.common.no.m.o.m
        public final void n() throws Throwable {
            com.thinkup.core.common.no.m.o.oo.m mVar;
            com.thinkup.core.common.no.m.o.oo.m mVar2 = com.thinkup.core.common.no.m.o.oo.m.INTERNAL_ERROR;
            IOException e2 = null;
            try {
                try {
                    this.o.o(this);
                    while (this.o.o(false, (m0.m) this)) {
                    }
                    com.thinkup.core.common.no.m.o.oo.m mVar3 = com.thinkup.core.common.no.m.o.oo.m.NO_ERROR;
                    try {
                        om.this.o(mVar3, com.thinkup.core.common.no.m.o.oo.m.CANCEL, (IOException) null);
                        mVar = mVar3;
                    } catch (IOException e3) {
                        e2 = e3;
                        com.thinkup.core.common.no.m.o.oo.m mVar4 = com.thinkup.core.common.no.m.o.oo.m.PROTOCOL_ERROR;
                        om omVar = om.this;
                        omVar.o(mVar4, mVar4, e2);
                        mVar = omVar;
                    }
                } catch (IOException e4) {
                    e2 = e4;
                } catch (Throwable th) {
                    th = th;
                    mVar = mVar2;
                    om.this.o(mVar, mVar2, e2);
                    com.thinkup.core.common.no.m.o.n.o(this.o);
                    throw th;
                }
                mVar2 = this.o;
                com.thinkup.core.common.no.m.o.n.o((Closeable) mVar2);
            } catch (Throwable th2) {
                th = th2;
                om.this.o(mVar, mVar2, e2);
                com.thinkup.core.common.no.m.o.n.o(this.o);
                throw th;
            }
        }

        @Override // com.thinkup.core.common.no.m.o.oo.m0.m
        public final void o() {
        }

        @Override // com.thinkup.core.common.no.m.o.oo.m0.m
        public final void o0() {
        }

        @Override // com.thinkup.core.common.no.m.o.oo.m0.m
        public final void o(boolean z2, int i2, com.thinkup.core.common.no.n.oo ooVar, int i3) throws IOException {
            if (om.n(i2)) {
                om.this.o(i2, ooVar, i3, z2);
                return;
            }
            mo moVarO = om.this.o(i2);
            if (moVarO == null) {
                om.this.o(i2, com.thinkup.core.common.no.m.o.oo.m.PROTOCOL_ERROR);
                long j = i3;
                om.this.o(j);
                ooVar.mo(j);
                return;
            }
            moVarO.o(ooVar, i3);
            if (z2) {
                moVarO.o(com.thinkup.core.common.no.m.o.n.f42026n, true);
            }
        }

        @Override // com.thinkup.core.common.no.m.o.oo.m0.m
        public final void o(boolean z2, int i2, List<com.thinkup.core.common.no.m.o.oo.n> list) {
            if (om.n(i2)) {
                om.this.o(i2, list, z2);
                return;
            }
            synchronized (om.this) {
                try {
                    mo moVarO = om.this.o(i2);
                    if (moVarO == null) {
                        if (om.this.oon) {
                            return;
                        }
                        om omVar = om.this;
                        if (i2 <= omVar.mm) {
                            return;
                        }
                        if (i2 % 2 == omVar.mn % 2) {
                            return;
                        }
                        final mo moVar = new mo(i2, om.this, false, z2, com.thinkup.core.common.no.m.o.n.m(list));
                        om omVar2 = om.this;
                        omVar2.mm = i2;
                        omVar2.m0.put(Integer.valueOf(i2), moVar);
                        om.oom.execute(new com.thinkup.core.common.no.m.o.m(omn.o + " %s stream %d", new Object[]{om.this.mo, Integer.valueOf(i2)}) { // from class: com.thinkup.core.common.no.m.o.oo.om.oo.1
                            @Override // com.thinkup.core.common.no.m.o.m
                            public final void n() {
                                try {
                                    om.this.on.o(moVar);
                                } catch (IOException e2) {
                                    com.thinkup.core.common.no.m.o.on.n.oo().o(4, "Http2Connection.Listener failure for " + om.this.mo, e2);
                                    try {
                                        moVar.o(com.thinkup.core.common.no.m.o.oo.m.PROTOCOL_ERROR, e2);
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                        });
                        return;
                    }
                    moVarO.o(com.thinkup.core.common.no.m.o.n.m(list), z2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.thinkup.core.common.no.m.o.oo.m0.m
        public final void o(int i2, com.thinkup.core.common.no.m.o.oo.m mVar) {
            if (om.n(i2)) {
                om.this.n(i2, mVar);
                return;
            }
            mo moVarM = om.this.m(i2);
            if (moVarM != null) {
                moVarM.m(mVar);
            }
        }

        @Override // com.thinkup.core.common.no.m.o.oo.m0.m
        public final void o(final no noVar) {
            try {
                om.this.om0.execute(new com.thinkup.core.common.no.m.o.m(omn.o + " %s ACK Settings", new Object[]{om.this.mo}) { // from class: com.thinkup.core.common.no.m.o.oo.om.oo.2
                    final /* synthetic */ boolean o = false;

                    @Override // com.thinkup.core.common.no.m.o.m
                    public final void n() {
                        mo[] moVarArr;
                        long j;
                        oo ooVar = oo.this;
                        boolean z2 = this.o;
                        no noVar2 = noVar;
                        synchronized (om.this.o0m) {
                            synchronized (om.this) {
                                try {
                                    int iOo = om.this.o00.oo();
                                    if (z2) {
                                        om.this.o00.o();
                                    }
                                    om.this.o00.o(noVar2);
                                    int iOo2 = om.this.o00.oo();
                                    moVarArr = null;
                                    if (iOo2 == -1 || iOo2 == iOo) {
                                        j = 0;
                                    } else {
                                        j = iOo2 - iOo;
                                        if (!om.this.m0.isEmpty()) {
                                            moVarArr = (mo[]) om.this.m0.values().toArray(new mo[om.this.m0.size()]);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            try {
                                om omVar = om.this;
                                omVar.o0m.o(omVar.o00);
                            } catch (IOException e2) {
                                om.this.o(e2);
                            }
                        }
                        if (moVarArr != null) {
                            for (mo moVar : moVarArr) {
                                synchronized (moVar) {
                                    moVar.o(j);
                                }
                            }
                        }
                        om.oom.execute(ooVar.new AnonymousClass3(a.r(new StringBuilder(), omn.o, " %s settings"), om.this.mo));
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        private void o(boolean z2, no noVar) {
            mo[] moVarArr;
            long j;
            synchronized (om.this.o0m) {
                synchronized (om.this) {
                    try {
                        int iOo = om.this.o00.oo();
                        if (z2) {
                            om.this.o00.o();
                        }
                        om.this.o00.o(noVar);
                        int iOo2 = om.this.o00.oo();
                        moVarArr = null;
                        if (iOo2 == -1 || iOo2 == iOo) {
                            j = 0;
                        } else {
                            j = iOo2 - iOo;
                            if (!om.this.m0.isEmpty()) {
                                moVarArr = (mo[]) om.this.m0.values().toArray(new mo[om.this.m0.size()]);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    om omVar = om.this;
                    omVar.o0m.o(omVar.o00);
                } catch (IOException e2) {
                    om.this.o(e2);
                }
            }
            if (moVarArr != null) {
                for (mo moVar : moVarArr) {
                    synchronized (moVar) {
                        moVar.o(j);
                    }
                }
            }
            om.oom.execute(new AnonymousClass3(a.r(new StringBuilder(), omn.o, " %s settings"), om.this.mo));
        }

        @Override // com.thinkup.core.common.no.m.o.oo.m0.m
        public final void o(boolean z2, int i2, int i3) {
            if (!z2) {
                try {
                    om.this.om0.execute(om.this.new o0(i2, i3));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (om.this) {
                try {
                    if (i2 == 1) {
                        om.om(om.this);
                    } else if (i2 == 2) {
                        om.on(om.this);
                    } else if (i2 == 3) {
                        om.m0(om.this);
                        om.this.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.thinkup.core.common.no.m.o.oo.m0.m
        public final void o(int i2, com.thinkup.core.common.no.n.om omVar) {
            mo[] moVarArr;
            omVar.mm();
            synchronized (om.this) {
                moVarArr = (mo[]) om.this.m0.values().toArray(new mo[om.this.m0.size()]);
                om.mo(om.this);
            }
            for (mo moVar : moVarArr) {
                if (moVar.f42051n > i2 && moVar.m()) {
                    moVar.m(com.thinkup.core.common.no.m.o.oo.m.REFUSED_STREAM);
                    om.this.m(moVar.f42051n);
                }
            }
        }

        @Override // com.thinkup.core.common.no.m.o.oo.m0.m
        public final void o(int i2, long j) {
            if (i2 == 0) {
                synchronized (om.this) {
                    om omVar = om.this;
                    omVar.nm += j;
                    omVar.notifyAll();
                }
                return;
            }
            mo moVarO = om.this.o(i2);
            if (moVarO != null) {
                synchronized (moVarO) {
                    moVarO.o(j);
                }
            }
        }

        @Override // com.thinkup.core.common.no.m.o.oo.m0.m
        public final void o(int i2, List<com.thinkup.core.common.no.m.o.oo.n> list) throws Throwable {
            om.this.o(i2, list);
        }
    }

    public om(o oVar) {
        no noVar = new no();
        this.o00 = noVar;
        this.oo0 = new LinkedHashSet();
        this.n0 = oVar.om;
        boolean z2 = oVar.on;
        this.om = z2;
        this.on = oVar.oo;
        int i2 = z2 ? 1 : 2;
        this.mn = i2;
        if (z2) {
            this.mn = i2 + 2;
        }
        if (z2) {
            this.nn.o(7, 16777216);
        }
        String str = oVar.m;
        this.mo = str;
        String str2 = omn.o;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.thinkup.core.common.no.m.o.n.o(com.thinkup.core.common.no.m.o.n.o("%s %s Writer", str2, str), false));
        this.om0 = scheduledThreadPoolExecutor;
        if (oVar.m0 != 0) {
            m mVar = new m();
            int i3 = oVar.m0;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(mVar, i3, i3, TimeUnit.MILLISECONDS);
        }
        this.omo = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.thinkup.core.common.no.m.o.n.o(com.thinkup.core.common.no.m.o.n.o("%s %s Push Observer", str2, str), true));
        noVar.o(7, 65535);
        noVar.o(5, 16384);
        this.nm = noVar.oo();
        this.o0o = oVar.o;
        this.o0m = new mm(oVar.o0, z2);
        this.o0n = new oo(new m0(oVar.f42060n, z2));
    }

    public static /* synthetic */ long m0(om omVar) {
        long j = omVar.onn;
        omVar.onn = 1 + j;
        return j;
    }

    private void mm() {
        this.o0m.o();
        this.o0m.m(this.nn);
        int iOo = this.nn.oo();
        if (iOo != 65535) {
            this.o0m.o(0, iOo - 65535);
        }
        new Thread(this.o0n).start();
    }

    public static /* synthetic */ boolean mo(om omVar) {
        omVar.oon = true;
        return true;
    }

    public static boolean n(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public static /* synthetic */ long om(om omVar) {
        long j = omVar.omn;
        omVar.omn = 1 + j;
        return j;
    }

    public static /* synthetic */ long on(om omVar) {
        long j = omVar.ono;
        omVar.ono = 1 + j;
        return j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o(com.thinkup.core.common.no.m.o.oo.m.NO_ERROR, com.thinkup.core.common.no.m.o.oo.m.CANCEL, (IOException) null);
    }

    private synchronized void m0() {
        while (this.onn < this.onm) {
            wait();
        }
    }

    private void mo() {
        this.o0m.m();
    }

    public static /* synthetic */ long n(om omVar) {
        long j = omVar.omm;
        omVar.omm = 1 + j;
        return j;
    }

    private void om() {
        synchronized (this) {
            this.onm++;
        }
        o(false, 3, 1330343787);
        m0();
    }

    private void on() {
        synchronized (this) {
            this.onm++;
        }
        o(false, 3, 1330343787);
    }

    private synchronized int oo() {
        return this.m0.size();
    }

    public final synchronized mo m(int i2) {
        mo moVarRemove;
        moVarRemove = this.m0.remove(Integer.valueOf(i2));
        notifyAll();
        return moVarRemove;
    }

    private mo n(int i2, List<com.thinkup.core.common.no.m.o.oo.n> list, boolean z2) throws Throwable {
        Throwable th;
        boolean z3 = !z2;
        synchronized (this.o0m) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.mn > 1073741823) {
                                try {
                                    o(com.thinkup.core.common.no.m.o.oo.m.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            try {
                                if (!this.oon) {
                                    int i3 = this.mn;
                                    this.mn = i3 + 2;
                                    mo moVar = new mo(i3, this, z3, false, null);
                                    boolean z4 = !z2 || this.nm == 0 || moVar.m == 0;
                                    if (moVar.o()) {
                                        this.m0.put(Integer.valueOf(i3), moVar);
                                    }
                                    if (i2 == 0) {
                                        this.o0m.o(z3, i3, list);
                                    } else if (!this.om) {
                                        this.o0m.o(i2, i3, list);
                                    } else {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    if (z4) {
                                        this.o0m.m();
                                    }
                                    return moVar;
                                }
                                throw new com.thinkup.core.common.no.m.o.oo.o();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        th = th;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    public final synchronized mo o(int i2) {
        return this.m0.get(Integer.valueOf(i2));
    }

    public final synchronized int o() {
        return this.o00.o0();
    }

    private mo m(int i2, List<com.thinkup.core.common.no.m.o.oo.n> list, boolean z2) {
        if (!this.om) {
            return n(i2, list, z2);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    public final synchronized void o(long j) {
        long j2 = this.no + j;
        this.no = j2;
        if (j2 >= this.nn.oo() / 2) {
            o(0, this.no);
            this.no = 0L;
        }
    }

    public static class o {
        String m;
        int m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        com.thinkup.core.common.no.n.oo f42060n;
        Socket o;
        com.thinkup.core.common.no.n.o0 o0;
        n oo = n.m0;
        n0 om = n0.o;
        boolean on = true;

        private o o(Socket socket) {
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            return o(socket, remoteSocketAddress instanceof InetSocketAddress ? ((InetSocketAddress) remoteSocketAddress).getHostName() : remoteSocketAddress.toString(), com.thinkup.core.common.no.n.nm.o(com.thinkup.core.common.no.n.nm.m(socket)), com.thinkup.core.common.no.n.nm.o(com.thinkup.core.common.no.n.nm.o(socket)));
        }

        public final o o(Socket socket, String str, com.thinkup.core.common.no.n.oo ooVar, com.thinkup.core.common.no.n.o0 o0Var) {
            this.o = socket;
            this.m = str;
            this.f42060n = ooVar;
            this.o0 = o0Var;
            return this;
        }

        public final o o(n nVar) {
            this.oo = nVar;
            return this;
        }

        private o o(n0 n0Var) {
            this.om = n0Var;
            return this;
        }

        public final o o(int i2) {
            this.m0 = i2;
            return this;
        }

        public final om o() {
            return new om(this);
        }
    }

    public final void m(int i2, com.thinkup.core.common.no.m.o.oo.m mVar) {
        this.o0m.o(i2, mVar);
    }

    public final synchronized boolean m(long j) {
        if (this.oon) {
            return false;
        }
        return this.ono >= this.on0 || j < this.m00;
    }

    public final mo o(List<com.thinkup.core.common.no.m.o.oo.n> list, boolean z2) {
        return n(0, list, z2);
    }

    public final void o(int i2, boolean z2, List<com.thinkup.core.common.no.m.o.oo.n> list) {
        this.o0m.o(z2, i2, list);
    }

    public final void m() {
        this.o0m.o();
        this.o0m.m(this.nn);
        int iOo = this.nn.oo();
        if (iOo != 65535) {
            this.o0m.o(0, iOo - 65535);
        }
        new Thread(this.o0n).start();
    }

    public final void o(int i2, boolean z2, com.thinkup.core.common.no.n.n nVar, long j) {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.o0m.o(z2, i2, nVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.nm;
                            if (j2 <= 0) {
                                if (this.m0.containsKey(Integer.valueOf(i2))) {
                                    wait();
                                } else {
                                    throw new IOException("stream closed");
                                }
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j2), this.o0m.n());
                j3 = iMin;
                this.nm -= j3;
            }
            j -= j3;
            this.o0m.o(z2 && j == 0, i2, nVar, iMin);
        }
    }

    public final void n() {
        synchronized (this) {
            try {
                long j = this.ono;
                long j2 = this.on0;
                if (j < j2) {
                    return;
                }
                this.on0 = j2 + 1;
                this.m00 = System.nanoTime() + 1000000000;
                try {
                    this.om0.execute(new com.thinkup.core.common.no.m.o.m(omn.o + " %s ping", this.mo) { // from class: com.thinkup.core.common.no.m.o.oo.om.3
                        @Override // com.thinkup.core.common.no.m.o.m
                        public final void n() {
                            om.this.o(false, 2, 0);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(final int i2, final com.thinkup.core.common.no.m.o.oo.m mVar) {
        try {
            this.om0.execute(new com.thinkup.core.common.no.m.o.m("%s %s stream %d", new Object[]{omn.o, this.mo, Integer.valueOf(i2)}) { // from class: com.thinkup.core.common.no.m.o.oo.om.1
                @Override // com.thinkup.core.common.no.m.o.m
                public final void n() {
                    try {
                        om.this.m(i2, mVar);
                    } catch (IOException e2) {
                        om.this.o(e2);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void o(final int i2, final long j) {
        try {
            this.om0.execute(new com.thinkup.core.common.no.m.o.m("%s Window Update %s stream %d", new Object[]{omn.o, this.mo, Integer.valueOf(i2)}) { // from class: com.thinkup.core.common.no.m.o.oo.om.2
                @Override // com.thinkup.core.common.no.m.o.m
                public final void n() {
                    try {
                        om.this.o0m.o(i2, j);
                    } catch (IOException e2) {
                        om.this.o(e2);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void o(boolean z2, int i2, int i3) {
        try {
            this.o0m.o(z2, i2, i3);
        } catch (IOException e2) {
            o(e2);
        }
    }

    public final void n(final int i2, final com.thinkup.core.common.no.m.o.oo.m mVar) {
        o(new com.thinkup.core.common.no.m.o.m(a.r(new StringBuilder(), omn.o, " %s Push Reset[%s]"), new Object[]{this.mo, Integer.valueOf(i2)}) { // from class: com.thinkup.core.common.no.m.o.oo.om.7
            @Override // com.thinkup.core.common.no.m.o.m
            public final void n() {
                synchronized (om.this) {
                    om.this.oo0.remove(Integer.valueOf(i2));
                }
            }
        });
    }

    private void o(com.thinkup.core.common.no.m.o.oo.m mVar) {
        synchronized (this.o0m) {
            synchronized (this) {
                if (this.oon) {
                    return;
                }
                this.oon = true;
                this.o0m.o(this.mm, mVar, com.thinkup.core.common.no.m.o.n.o);
            }
        }
    }

    public final void o(com.thinkup.core.common.no.m.o.oo.m mVar, com.thinkup.core.common.no.m.o.oo.m mVar2, IOException iOException) {
        mo[] moVarArr;
        if (!ooo && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        try {
            o(mVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.m0.isEmpty()) {
                    moVarArr = null;
                } else {
                    moVarArr = (mo[]) this.m0.values().toArray(new mo[this.m0.size()]);
                    this.m0.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (moVarArr != null) {
            for (mo moVar : moVarArr) {
                try {
                    moVar.o(mVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.o0m.close();
        } catch (IOException unused3) {
        }
        try {
            this.o0o.close();
        } catch (IOException unused4) {
        }
        this.om0.shutdown();
        this.omo.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(IOException iOException) {
        com.thinkup.core.common.no.m.o.oo.m mVar = com.thinkup.core.common.no.m.o.oo.m.PROTOCOL_ERROR;
        o(mVar, mVar, iOException);
    }

    private void o(no noVar) {
        synchronized (this.o0m) {
            synchronized (this) {
                if (!this.oon) {
                    this.nn.o(noVar);
                } else {
                    throw new com.thinkup.core.common.no.m.o.oo.o();
                }
            }
            this.o0m.m(noVar);
        }
    }

    public final void o(final int i2, final List<com.thinkup.core.common.no.m.o.oo.n> list) throws Throwable {
        Throwable th;
        synchronized (this) {
            try {
                if (this.oo0.contains(Integer.valueOf(i2))) {
                    try {
                        o(i2, com.thinkup.core.common.no.m.o.oo.m.PROTOCOL_ERROR);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    this.oo0.add(Integer.valueOf(i2));
                    try {
                        try {
                            o(new com.thinkup.core.common.no.m.o.m(omn.o + " %s Push Request[%s]", new Object[]{this.mo, Integer.valueOf(i2)}) { // from class: com.thinkup.core.common.no.m.o.oo.om.4
                                @Override // com.thinkup.core.common.no.m.o.m
                                public final void n() {
                                    try {
                                        om.this.o0m.o(i2, com.thinkup.core.common.no.m.o.oo.m.CANCEL);
                                        synchronized (om.this) {
                                            om.this.oo0.remove(Integer.valueOf(i2));
                                        }
                                    } catch (IOException unused) {
                                    }
                                }
                            });
                            return;
                        } catch (RejectedExecutionException unused) {
                            return;
                        }
                    } catch (RejectedExecutionException unused2) {
                        return;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            throw th;
        }
    }

    public final void o(final int i2, final List<com.thinkup.core.common.no.m.o.oo.n> list, final boolean z2) {
        try {
            try {
                o(new com.thinkup.core.common.no.m.o.m(omn.o + " %s Push Headers[%s]", new Object[]{this.mo, Integer.valueOf(i2)}) { // from class: com.thinkup.core.common.no.m.o.oo.om.5
                    @Override // com.thinkup.core.common.no.m.o.m
                    public final void n() {
                        try {
                            om.this.o0m.o(i2, com.thinkup.core.common.no.m.o.oo.m.CANCEL);
                            synchronized (om.this) {
                                om.this.oo0.remove(Integer.valueOf(i2));
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        } catch (RejectedExecutionException unused2) {
        }
    }

    public final void o(final int i2, com.thinkup.core.common.no.n.oo ooVar, final int i3, final boolean z2) throws IOException {
        final com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
        long j = i3;
        ooVar.o(j);
        ooVar.a_(nVar, j);
        if (nVar.m() == j) {
            o(new com.thinkup.core.common.no.m.o.m(a.r(new StringBuilder(), omn.o, " %s Push Data[%s]"), new Object[]{this.mo, Integer.valueOf(i2)}) { // from class: com.thinkup.core.common.no.m.o.oo.om.6
                @Override // com.thinkup.core.common.no.m.o.m
                public final void n() {
                    try {
                        om.this.n0.o(nVar, i3);
                        om.this.o0m.o(i2, com.thinkup.core.common.no.m.o.oo.m.CANCEL);
                        synchronized (om.this) {
                            om.this.oo0.remove(Integer.valueOf(i2));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
            return;
        }
        throw new IOException(nVar.m() + " != " + i3);
    }

    private synchronized void o(com.thinkup.core.common.no.m.o.m mVar) {
        if (!this.oon) {
            this.omo.execute(mVar);
        }
    }
}
