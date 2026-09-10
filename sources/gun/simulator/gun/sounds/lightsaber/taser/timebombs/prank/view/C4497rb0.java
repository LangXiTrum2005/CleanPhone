package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4497rb0 {
    public static final C4497rb0 h;
    public static final Logger i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4322pb0 f4936a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final RunnableC4410qb0 g = new RunnableC4410qb0(this);

    static {
        String strV0 = AbstractC2995aW.v0(" TaskRunner", Vg0.g);
        AbstractC2995aW.q(strV0, "name");
        h = new C4497rb0(new C4322pb0(new Pg0(strV0, true)));
        Logger logger = Logger.getLogger(C4497rb0.class.getName());
        AbstractC2995aW.p(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public C4497rb0(C4322pb0 c4322pb0) {
        this.f4936a = c4322pb0;
    }

    public static final void a(C4497rb0 c4497rb0, AbstractC3882kb0 abstractC3882kb0) {
        c4497rb0.getClass();
        byte[] bArr = Vg0.f3884a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC3882kb0.f4603a);
        try {
            long jA = abstractC3882kb0.a();
            synchronized (c4497rb0) {
                c4497rb0.b(abstractC3882kb0, jA);
            }
        } finally {
            synchronized (c4497rb0) {
                c4497rb0.b(abstractC3882kb0, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(AbstractC3882kb0 abstractC3882kb0, long j) {
        byte[] bArr = Vg0.f3884a;
        C4234ob0 c4234ob0 = abstractC3882kb0.c;
        AbstractC2995aW.n(c4234ob0);
        if (c4234ob0.d != abstractC3882kb0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z = c4234ob0.f;
        c4234ob0.f = false;
        c4234ob0.d = null;
        this.e.remove(c4234ob0);
        if (j != -1 && !z && !c4234ob0.c) {
            c4234ob0.e(abstractC3882kb0, j, true);
        }
        if (!c4234ob0.e.isEmpty()) {
            this.f.add(c4234ob0);
        }
    }

    public final AbstractC3882kb0 c() {
        boolean z;
        byte[] bArr = Vg0.f3884a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C4322pb0 c4322pb0 = this.f4936a;
            c4322pb0.getClass();
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC3882kb0 abstractC3882kb0 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC3882kb0 abstractC3882kb1 = (AbstractC3882kb0) ((C4234ob0) it.next()).e.get(0);
                long jMax = Math.max(0L, abstractC3882kb1.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC3882kb0 != null) {
                        z = true;
                        break;
                    }
                    abstractC3882kb0 = abstractC3882kb1;
                }
            }
            if (abstractC3882kb0 != null) {
                byte[] bArr2 = Vg0.f3884a;
                abstractC3882kb0.d = -1L;
                C4234ob0 c4234ob0 = abstractC3882kb0.c;
                AbstractC2995aW.n(c4234ob0);
                c4234ob0.e.remove(abstractC3882kb0);
                arrayList.remove(c4234ob0);
                c4234ob0.d = abstractC3882kb0;
                this.e.add(c4234ob0);
                if (z || (!this.c && (!arrayList.isEmpty()))) {
                    RunnableC4410qb0 runnableC4410qb0 = this.g;
                    AbstractC2995aW.q(runnableC4410qb0, "runnable");
                    c4322pb0.f4840a.execute(runnableC4410qb0);
                }
                return abstractC3882kb0;
            }
            if (this.c) {
                if (jMin < this.d - jNanoTime) {
                    notify();
                }
                return null;
            }
            this.c = true;
            this.d = jNanoTime + jMin;
            try {
                try {
                    long j = jMin / 1000000;
                    Long.signum(j);
                    long j2 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        wait(j, (int) j2);
                    }
                } catch (InterruptedException unused) {
                    d();
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.e;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                ((C4234ob0) arrayList.get(size)).b();
                if (i2 < 0) {
                    break;
                } else {
                    size = i2;
                }
            }
        }
        ArrayList arrayList2 = this.f;
        int size2 = arrayList2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i3 = size2 - 1;
            C4234ob0 c4234ob0 = (C4234ob0) arrayList2.get(size2);
            c4234ob0.b();
            if (c4234ob0.e.isEmpty()) {
                arrayList2.remove(size2);
            }
            if (i3 < 0) {
                return;
            } else {
                size2 = i3;
            }
        }
    }

    public final void e(C4234ob0 c4234ob0) {
        AbstractC2995aW.q(c4234ob0, "taskQueue");
        byte[] bArr = Vg0.f3884a;
        if (c4234ob0.d == null) {
            boolean z = !c4234ob0.e.isEmpty();
            ArrayList arrayList = this.f;
            if (z) {
                AbstractC2995aW.q(arrayList, "<this>");
                if (!arrayList.contains(c4234ob0)) {
                    arrayList.add(c4234ob0);
                }
            } else {
                arrayList.remove(c4234ob0);
            }
        }
        boolean z2 = this.c;
        C4322pb0 c4322pb0 = this.f4936a;
        if (z2) {
            c4322pb0.getClass();
            notify();
        } else {
            c4322pb0.getClass();
            RunnableC4410qb0 runnableC4410qb0 = this.g;
            AbstractC2995aW.q(runnableC4410qb0, "runnable");
            c4322pb0.f4840a.execute(runnableC4410qb0);
        }
    }

    public final C4234ob0 f() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new C4234ob0(this, AbstractC2995aW.v0(Integer.valueOf(i2), "Q"));
    }
}
