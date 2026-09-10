package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3605hO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4454a = null;
    public int b;
    public int c;
    public Object d;
    public Serializable e;
    public Object f;
    public Serializable g;

    public C3605hO(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.b = 0;
        this.c = 0;
        this.g = new HashSet();
        hashSet.add(RW.a(cls));
        for (Class cls2 : clsArr) {
            AbstractC3375el.l(cls2, "Null interface");
            ((Set) this.d).add(RW.a(cls2));
        }
    }

    public static C3517gO a(C3605hO c3605hO) {
        return new C3517gO(c3605hO);
    }

    public final void b(C5226zo c5226zo) {
        if (!(!((Set) this.d).contains(c5226zo.f5344a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((Set) this.e).add(c5226zo);
    }

    public final C3190ch c() {
        if (((InterfaceC3718ih) this.f) != null) {
            return new C3190ch((String) this.f4454a, new HashSet((Set) this.d), new HashSet((Set) this.e), this.b, this.c, (InterfaceC3718ih) this.f, (Set) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final synchronized ExecutorService d() {
        ExecutorService executorService;
        try {
            if (((ExecutorService) this.f4454a) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String strV0 = AbstractC2995aW.v0(" Dispatcher", Vg0.g);
                AbstractC2995aW.q(strV0, "name");
                this.f4454a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new Pg0(strV0, false));
            }
            executorService = (ExecutorService) this.f4454a;
            AbstractC2995aW.n(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final FX e(String str) {
        for (FX fx : (ArrayDeque) this.f) {
            if (AbstractC2995aW.i(fx.c.b.f3175a.d, str)) {
                return fx;
            }
        }
        for (FX fx2 : (ArrayDeque) this.e) {
            if (AbstractC2995aW.i(fx2.c.b.f3175a.d, str)) {
                return fx2;
            }
        }
        return null;
    }

    public final void f(ArrayDeque arrayDeque, Object obj) {
        Runnable runnableH;
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnableH = h();
        }
        if (k() || runnableH == null) {
            return;
        }
        runnableH.run();
    }

    public final void g(FX fx) {
        AbstractC2995aW.q(fx, NotificationCompat.CATEGORY_CALL);
        fx.b.decrementAndGet();
        f((ArrayDeque) this.f, fx);
    }

    public final synchronized Runnable h() {
        return (Runnable) this.d;
    }

    public final synchronized int i() {
        return this.b;
    }

    public final synchronized int j() {
        return this.c;
    }

    public final boolean k() {
        int i;
        boolean z;
        byte[] bArr = Vg0.f3884a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.e).iterator();
                AbstractC2995aW.p(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    FX fx = (FX) it.next();
                    if (((ArrayDeque) this.f).size() >= i()) {
                        break;
                    }
                    if (fx.b.get() < j()) {
                        it.remove();
                        fx.b.incrementAndGet();
                        arrayList.add(fx);
                        ((ArrayDeque) this.f).add(fx);
                    }
                }
                i = 0;
                z = l() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        while (i < size) {
            int i2 = i + 1;
            FX fx2 = (FX) arrayList.get(i);
            ExecutorService executorServiceD = d();
            fx2.getClass();
            IX ix = fx2.c;
            C3605hO c3605hO = ix.f3221a.f5131a;
            byte[] bArr2 = Vg0.f3884a;
            try {
                try {
                    executorServiceD.execute(fx2);
                } catch (Throwable th2) {
                    ix.f3221a.f5131a.g(fx2);
                    throw th2;
                }
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                ix.i(interruptedIOException);
                fx2.f3069a.onFailure(ix, interruptedIOException);
                ix.f3221a.f5131a.g(fx2);
            }
            i = i2;
        }
        return z;
    }

    public final synchronized int l() {
        return ((ArrayDeque) this.f).size() + ((ArrayDeque) this.g).size();
    }

    public final void m(int i) {
        if (!(this.b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.b = i;
    }
}
