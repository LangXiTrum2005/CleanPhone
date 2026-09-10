package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4790ur implements InterfaceC2418Fl, InterfaceC2322Bt {
    public static final C4710tz z = new C4710tz(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4702tr f5107a;
    public final C4508rh b;
    public final InterfaceC5054xr c;
    public final Pools.Pool d;
    public final C4710tz e;
    public final InterfaceC4878vr f;
    public final ExecutorServiceC3480fy g;
    public final ExecutorServiceC3480fy h;
    public final ExecutorServiceC3480fy i;
    public final ExecutorServiceC3480fy j;
    public final AtomicInteger k;
    public InterfaceC4650tG l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public InterfaceC3616hZ q;
    public EnumC4516rl r;
    public boolean s;
    public C3039ay t;
    public boolean u;
    public C5142yr v;
    public RunnableC2496Il w;
    public volatile boolean x;
    public boolean y;

    public C4790ur(ExecutorServiceC3480fy executorServiceC3480fy, ExecutorServiceC3480fy executorServiceC3480fy2, ExecutorServiceC3480fy executorServiceC3480fy3, ExecutorServiceC3480fy executorServiceC3480fy4, InterfaceC4878vr interfaceC4878vr, InterfaceC5054xr interfaceC5054xr, C2296At c2296At) {
        C4710tz c4710tz = z;
        this.f5107a = new C4702tr(new ArrayList(2));
        this.b = new C4508rh();
        this.k = new AtomicInteger();
        this.g = executorServiceC3480fy;
        this.h = executorServiceC3480fy2;
        this.i = executorServiceC3480fy3;
        this.j = executorServiceC3480fy4;
        this.f = interfaceC4878vr;
        this.c = interfaceC5054xr;
        this.d = c2296At;
        this.e = c4710tz;
    }

    public final synchronized void a(InterfaceC3878kZ interfaceC3878kZ, Executor executor) {
        try {
            this.b.a();
            C4702tr c4702tr = this.f5107a;
            c4702tr.getClass();
            c4702tr.f5054a.add(new C4614sr(interfaceC3878kZ, executor));
            int i = 1;
            if (this.s) {
                e(1);
                executor.execute(new RunnableC4526rr(this, interfaceC3878kZ, i));
            } else {
                int i2 = 0;
                if (this.u) {
                    e(1);
                    executor.execute(new RunnableC4526rr(this, interfaceC3878kZ, i2));
                } else {
                    AbstractC2871Wx.S("Cannot add callbacks to a cancelled EngineJob", !this.x);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.x = true;
        RunnableC2496Il runnableC2496Il = this.w;
        runnableC2496Il.B = true;
        InterfaceC3726il interfaceC3726il = runnableC2496Il.z;
        if (interfaceC3726il != null) {
            interfaceC3726il.cancel();
        }
        InterfaceC4878vr interfaceC4878vr = this.f;
        InterfaceC4650tG interfaceC4650tG = this.l;
        C4439qr c4439qr = (C4439qr) interfaceC4878vr;
        synchronized (c4439qr) {
            RE re = c4439qr.f4906a;
            re.getClass();
            Map map = this.p ? re.b : re.f3651a;
            if (equals(map.get(interfaceC4650tG))) {
                map.remove(interfaceC4650tG);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2322Bt
    public final C4508rh c() {
        return this.b;
    }

    public final void d() {
        C5142yr c5142yr;
        synchronized (this) {
            try {
                this.b.a();
                AbstractC2871Wx.S("Not yet complete!", f());
                int iDecrementAndGet = this.k.decrementAndGet();
                AbstractC2871Wx.S("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c5142yr = this.v;
                    i();
                } else {
                    c5142yr = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5142yr != null) {
            c5142yr.d();
        }
    }

    public final synchronized void e(int i) {
        C5142yr c5142yr;
        AbstractC2871Wx.S("Not yet complete!", f());
        if (this.k.getAndAdd(i) == 0 && (c5142yr = this.v) != null) {
            c5142yr.c();
        }
    }

    public final boolean f() {
        return this.u || this.s || this.x;
    }

    public final void g() {
        synchronized (this) {
            try {
                this.b.a();
                if (this.x) {
                    i();
                    return;
                }
                if (this.f5107a.f5054a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.u = true;
                InterfaceC4650tG interfaceC4650tG = this.l;
                C4702tr c4702tr = this.f5107a;
                c4702tr.getClass();
                ArrayList<C4614sr> arrayList = new ArrayList(c4702tr.f5054a);
                e(arrayList.size() + 1);
                ((C4439qr) this.f).d(this, interfaceC4650tG, null);
                for (C4614sr c4614sr : arrayList) {
                    c4614sr.b.execute(new RunnableC4526rr(this, c4614sr.f5002a, 0));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this) {
            try {
                this.b.a();
                if (this.x) {
                    this.q.recycle();
                    i();
                    return;
                }
                if (this.f5107a.f5054a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.s) {
                    throw new IllegalStateException("Already have resource");
                }
                C4710tz c4710tz = this.e;
                InterfaceC3616hZ interfaceC3616hZ = this.q;
                boolean z2 = this.m;
                InterfaceC4650tG interfaceC4650tG = this.l;
                InterfaceC5054xr interfaceC5054xr = this.c;
                c4710tz.getClass();
                this.v = new C5142yr(interfaceC3616hZ, z2, true, interfaceC4650tG, interfaceC5054xr);
                int i = 1;
                this.s = true;
                C4702tr c4702tr = this.f5107a;
                c4702tr.getClass();
                ArrayList<C4614sr> arrayList = new ArrayList(c4702tr.f5054a);
                e(arrayList.size() + 1);
                ((C4439qr) this.f).d(this, this.l, this.v);
                for (C4614sr c4614sr : arrayList) {
                    c4614sr.b.execute(new RunnableC4526rr(this, c4614sr.f5002a, i));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        if (this.l == null) {
            throw new IllegalArgumentException();
        }
        this.f5107a.f5054a.clear();
        this.l = null;
        this.v = null;
        this.q = null;
        this.u = false;
        this.x = false;
        this.s = false;
        this.y = false;
        this.w.m();
        this.w = null;
        this.t = null;
        this.r = null;
        this.d.release(this);
    }

    public final synchronized void j(InterfaceC3878kZ interfaceC3878kZ) {
        try {
            this.b.a();
            C4702tr c4702tr = this.f5107a;
            c4702tr.f5054a.remove(new C4614sr(interfaceC3878kZ, FW.d));
            if (this.f5107a.f5054a.isEmpty()) {
                b();
                if (this.s || this.u) {
                    if (this.k.get() == 0) {
                        i();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(RunnableC2496Il runnableC2496Il) {
        ExecutorServiceC3480fy executorServiceC3480fy;
        this.w = runnableC2496Il;
        int i = runnableC2496Il.i(1);
        if (i == 2 || i == 3) {
            executorServiceC3480fy = this.g;
        } else if (this.n) {
            executorServiceC3480fy = this.i;
        } else {
            executorServiceC3480fy = this.o ? this.j : this.h;
        }
        executorServiceC3480fy.execute(runnableC2496Il);
    }
}
