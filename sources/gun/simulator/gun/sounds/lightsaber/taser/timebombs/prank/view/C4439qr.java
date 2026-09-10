package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4439qr implements InterfaceC4878vr, VO, InterfaceC5054xr {
    public static final boolean h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RE f4906a;
    public final Qm0 b;
    public final C4830vK c;
    public final C4263or d;
    public final C4581sZ e;
    public final C4087mr f;
    public final C4624t0 g;

    public C4439qr(C4830vK c4830vK, AbstractC3997lp abstractC3997lp, ExecutorServiceC3480fy executorServiceC3480fy, ExecutorServiceC3480fy executorServiceC3480fy2, ExecutorServiceC3480fy executorServiceC3480fy3, ExecutorServiceC3480fy executorServiceC3480fy4) {
        this.c = c4830vK;
        C4351pr c4351pr = new C4351pr(abstractC3997lp);
        C4624t0 c4624t0 = new C4624t0();
        this.g = c4624t0;
        synchronized (this) {
            synchronized (c4624t0) {
                c4624t0.e = this;
            }
        }
        this.b = new Qm0(4);
        this.f4906a = new RE(0);
        this.d = new C4263or(executorServiceC3480fy, executorServiceC3480fy2, executorServiceC3480fy3, executorServiceC3480fy4, this, this);
        this.f = new C4087mr(c4351pr);
        this.e = new C4581sZ(0);
        c4830vK.e = this;
    }

    public static void f(InterfaceC3616hZ interfaceC3616hZ) {
        if (!(interfaceC3616hZ instanceof C5142yr)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C5142yr) interfaceC3616hZ).d();
    }

    public final C2444Gl a(C2923Yx c2923Yx, Object obj, InterfaceC4650tG interfaceC4650tG, int i, int i2, Class cls, Class cls2, IV iv, AbstractC2940Zo abstractC2940Zo, CachedHashCodeArrayMap cachedHashCodeArrayMap, boolean z, boolean z2, YS ys, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC3878kZ interfaceC3878kZ, Executor executor) {
        long jElapsedRealtimeNanos;
        if (h) {
            int i3 = AbstractC4653tJ.f5029a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j = jElapsedRealtimeNanos;
        this.b.getClass();
        C4966wr c4966wr = new C4966wr(obj, interfaceC4650tG, i, i2, cachedHashCodeArrayMap, cls, cls2, ys);
        synchronized (this) {
            try {
                C5142yr c5142yrC = c(c4966wr, z3, j);
                if (c5142yrC == null) {
                    return g(c2923Yx, obj, interfaceC4650tG, i, i2, cls, cls2, iv, abstractC2940Zo, cachedHashCodeArrayMap, z, z2, ys, z3, z4, z5, z6, interfaceC3878kZ, executor, c4966wr, j);
                }
                ((T60) interfaceC3878kZ).f(c5142yrC, EnumC4516rl.e, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C5142yr b(InterfaceC4650tG interfaceC4650tG) {
        C5142yr c5142yr;
        Object obj;
        C4830vK c4830vK = this.c;
        synchronized (c4830vK) {
            C4566sK c4566sK = (C4566sK) c4830vK.f5030a.remove(interfaceC4650tG);
            c5142yr = null;
            if (c4566sK == null) {
                obj = null;
            } else {
                c4830vK.c -= (long) c4566sK.b;
                obj = c4566sK.f4973a;
            }
        }
        InterfaceC3616hZ interfaceC3616hZ = (InterfaceC3616hZ) obj;
        if (interfaceC3616hZ != null) {
            c5142yr = interfaceC3616hZ instanceof C5142yr ? (C5142yr) interfaceC3616hZ : new C5142yr(interfaceC3616hZ, true, true, interfaceC4650tG, this);
        }
        if (c5142yr != null) {
            c5142yr.c();
            this.g.a(interfaceC4650tG, c5142yr);
        }
        return c5142yr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C5142yr c(C4966wr c4966wr, boolean z, long j) {
        C5142yr c5142yr;
        if (!z) {
            return null;
        }
        C4624t0 c4624t0 = this.g;
        synchronized (c4624t0) {
            C4536s0 c4536s0 = (C4536s0) c4624t0.c.get(c4966wr);
            if (c4536s0 == null) {
                c5142yr = null;
            } else {
                c5142yr = (C5142yr) c4536s0.get();
                if (c5142yr == null) {
                    c4624t0.b(c4536s0);
                }
            }
        }
        if (c5142yr != null) {
            c5142yr.c();
        }
        if (c5142yr != null) {
            if (h) {
                int i = AbstractC4653tJ.f5029a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(c4966wr);
            }
            return c5142yr;
        }
        C5142yr c5142yrB = b(c4966wr);
        if (c5142yrB == null) {
            return null;
        }
        if (h) {
            int i2 = AbstractC4653tJ.f5029a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(c4966wr);
        }
        return c5142yrB;
    }

    public final synchronized void d(C4790ur c4790ur, InterfaceC4650tG interfaceC4650tG, C5142yr c5142yr) {
        if (c5142yr != null) {
            try {
                if (c5142yr.f5303a) {
                    this.g.a(interfaceC4650tG, c5142yr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        RE re = this.f4906a;
        re.getClass();
        Map map = c4790ur.p ? re.b : re.f3651a;
        if (c4790ur.equals(map.get(interfaceC4650tG))) {
            map.remove(interfaceC4650tG);
        }
    }

    public final void e(InterfaceC4650tG interfaceC4650tG, C5142yr c5142yr) {
        C4624t0 c4624t0 = this.g;
        synchronized (c4624t0) {
            C4536s0 c4536s0 = (C4536s0) c4624t0.c.remove(interfaceC4650tG);
            if (c4536s0 != null) {
                c4536s0.c = null;
                c4536s0.clear();
            }
        }
        if (c5142yr.f5303a) {
        } else {
            this.e.e(c5142yr, false);
        }
    }

    public final C2444Gl g(C2923Yx c2923Yx, Object obj, InterfaceC4650tG interfaceC4650tG, int i, int i2, Class cls, Class cls2, IV iv, AbstractC2940Zo abstractC2940Zo, CachedHashCodeArrayMap cachedHashCodeArrayMap, boolean z, boolean z2, YS ys, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC3878kZ interfaceC3878kZ, Executor executor, C4966wr c4966wr, long j) {
        RE re = this.f4906a;
        C4790ur c4790ur = (C4790ur) (z6 ? re.b : re.f3651a).get(c4966wr);
        if (c4790ur != null) {
            c4790ur.a(interfaceC3878kZ, executor);
            if (h) {
                int i3 = AbstractC4653tJ.f5029a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(c4966wr);
            }
            return new C2444Gl(this, interfaceC3878kZ, c4790ur);
        }
        C4790ur c4790ur2 = (C4790ur) this.d.g.acquire();
        synchronized (c4790ur2) {
            c4790ur2.l = c4966wr;
            c4790ur2.m = z3;
            c4790ur2.n = z4;
            c4790ur2.o = z5;
            c4790ur2.p = z6;
        }
        C4087mr c4087mr = this.f;
        RunnableC2496Il runnableC2496Il = (RunnableC2496Il) c4087mr.b.acquire();
        int i4 = c4087mr.c;
        c4087mr.c = i4 + 1;
        C2392El c2392El = runnableC2496Il.f3236a;
        c2392El.c = c2923Yx;
        c2392El.d = obj;
        c2392El.n = interfaceC4650tG;
        c2392El.e = i;
        c2392El.f = i2;
        c2392El.p = abstractC2940Zo;
        c2392El.g = cls;
        c2392El.h = runnableC2496Il.d;
        c2392El.k = cls2;
        c2392El.o = iv;
        c2392El.i = ys;
        c2392El.j = cachedHashCodeArrayMap;
        c2392El.q = z;
        c2392El.r = z2;
        runnableC2496Il.h = c2923Yx;
        runnableC2496Il.i = interfaceC4650tG;
        runnableC2496Il.j = iv;
        runnableC2496Il.k = c4966wr;
        runnableC2496Il.l = i;
        runnableC2496Il.m = i2;
        runnableC2496Il.n = abstractC2940Zo;
        runnableC2496Il.r = z6;
        runnableC2496Il.o = ys;
        runnableC2496Il.p = c4790ur2;
        runnableC2496Il.q = i4;
        runnableC2496Il.E = 1;
        runnableC2496Il.s = obj;
        RE re2 = this.f4906a;
        re2.getClass();
        (c4790ur2.p ? re2.b : re2.f3651a).put(c4966wr, c4790ur2);
        c4790ur2.a(interfaceC3878kZ, executor);
        c4790ur2.k(runnableC2496Il);
        if (h) {
            int i5 = AbstractC4653tJ.f5029a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(c4966wr);
        }
        return new C2444Gl(this, interfaceC3878kZ, c4790ur2);
    }
}
