package com.thinkup.core.common.no.m.o.m;

import com.thinkup.core.common.no.m.m0m;
import com.thinkup.core.common.no.m.omn;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class om {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final /* synthetic */ boolean f42014n = true;
    private static final Executor o0 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.thinkup.core.common.no.m.o.n.o(omn.o + " ConnectionPool", true));
    boolean m;
    private final long om;
    private final int oo;
    private final Runnable on = new Runnable() { // from class: com.thinkup.core.common.no.m.o.m.om.1
        @Override // java.lang.Runnable
        public final void run() {
            while (true) {
                long jO = om.this.o(System.nanoTime());
                if (jO == -1) {
                    return;
                }
                if (jO > 0) {
                    long j = jO / 1000000;
                    long j2 = jO - (1000000 * j);
                    synchronized (om.this) {
                        try {
                            om.this.wait(j, (int) j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    };
    private final Deque<oo> m0 = new ArrayDeque();
    final on o = new on();

    public om(int i2, TimeUnit timeUnit) {
        this.oo = i2;
        this.om = timeUnit.toNanos(5L);
    }

    public final synchronized int m() {
        return this.m0.size();
    }

    public final void n() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<oo> it = this.m0.iterator();
                while (it.hasNext()) {
                    oo next = it.next();
                    if (next.oo.isEmpty()) {
                        next.m = true;
                        arrayList.add(next);
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.thinkup.core.common.no.m.o.n.o(((oo) it2.next()).m());
        }
    }

    public final synchronized int o() {
        int i2;
        Iterator<oo> it = this.m0.iterator();
        i2 = 0;
        while (it.hasNext()) {
            if (it.next().oo.isEmpty()) {
                i2++;
            }
        }
        return i2;
    }

    public final boolean m(oo ooVar) {
        if (!f42014n && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (ooVar.m || this.oo == 0) {
            this.m0.remove(ooVar);
            return true;
        }
        notifyAll();
        return false;
    }

    public final boolean o(com.thinkup.core.common.no.m.o oVar, mm mmVar, List<m0m> list, boolean z2) {
        if (!f42014n && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (oo ooVar : this.m0) {
            if (!z2 || ooVar.on()) {
                if (ooVar.o(oVar, list)) {
                    mmVar.o(ooVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final void o(oo ooVar) {
        if (!f42014n && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.m) {
            this.m = true;
            o0.execute(this.on);
        }
        this.m0.add(ooVar);
    }

    public final long o(long j) {
        int size;
        synchronized (this) {
            try {
                oo ooVar = null;
                long j2 = Long.MIN_VALUE;
                int i2 = 0;
                int i3 = 0;
                for (oo ooVar2 : this.m0) {
                    List<Reference<mm>> list = ooVar2.oo;
                    int i4 = 0;
                    while (true) {
                        if (i4 < list.size()) {
                            Reference<mm> reference = list.get(i4);
                            if (reference.get() == null) {
                                com.thinkup.core.common.no.m.o.on.n.oo().o("A connection to " + ooVar2.o().o().o() + " was leaked. Did you forget to close a response body?", ((mm.o) reference).o);
                                list.remove(i4);
                                ooVar2.m = true;
                                if (list.isEmpty()) {
                                    ooVar2.om = j - this.om;
                                    size = 0;
                                    break;
                                }
                            } else {
                                i4++;
                            }
                        } else {
                            size = list.size();
                            break;
                        }
                    }
                    if (size > 0) {
                        i3++;
                    } else {
                        i2++;
                        long j3 = j - ooVar2.om;
                        if (j3 > j2) {
                            ooVar = ooVar2;
                            j2 = j3;
                        }
                    }
                }
                long j4 = this.om;
                if (j2 < j4 && i2 <= this.oo) {
                    if (i2 > 0) {
                        return j4 - j2;
                    }
                    if (i3 > 0) {
                        return j4;
                    }
                    this.m = false;
                    return -1L;
                }
                this.m0.remove(ooVar);
                com.thinkup.core.common.no.m.o.n.o(ooVar.m());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int o(oo ooVar, long j) {
        List<Reference<mm>> list = ooVar.oo;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference<mm> reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                com.thinkup.core.common.no.m.o.on.n.oo().o("A connection to " + ooVar.o().o().o() + " was leaked. Did you forget to close a response body?", ((mm.o) reference).o);
                list.remove(i2);
                ooVar.m = true;
                if (list.isEmpty()) {
                    ooVar.om = j - this.om;
                    return 0;
                }
            }
        }
        return list.size();
    }

    private void o(m0m m0mVar, IOException iOException) {
        if (m0mVar.m().type() != Proxy.Type.DIRECT) {
            com.thinkup.core.common.no.m.o oVarO = m0mVar.o();
            oVarO.on().connectFailed(oVarO.o().o(), m0mVar.m().address(), iOException);
        }
        this.o.o(m0mVar);
    }
}
