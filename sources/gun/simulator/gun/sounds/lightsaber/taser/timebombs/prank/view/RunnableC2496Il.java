package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2496Il implements InterfaceC3639hl, Runnable, Comparable, InterfaceC2322Bt {
    public volatile boolean A;
    public volatile boolean B;
    public boolean C;
    public int D;
    public int E;
    public final C4351pr d;
    public final Pools.Pool e;
    public C2923Yx h;
    public InterfaceC4650tG i;
    public IV j;
    public C4966wr k;
    public int l;
    public int m;
    public AbstractC2940Zo n;
    public YS o;
    public InterfaceC2418Fl p;
    public int q;
    public boolean r;
    public Object s;
    public Thread t;
    public InterfaceC4650tG u;
    public InterfaceC4650tG v;
    public Object w;
    public EnumC4516rl x;
    public InterfaceC3551gl y;
    public volatile InterfaceC3726il z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2392El f3236a = new C2392El();
    public final ArrayList b = new ArrayList();
    public final C4508rh c = new C4508rh();
    public final C2444Gl f = new C2444Gl();
    public final C2470Hl g = new C2470Hl();

    public RunnableC2496Il(C4351pr c4351pr, C2296At c2296At) {
        this.d = c4351pr;
        this.e = c2296At;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3639hl
    public final void a(InterfaceC4650tG interfaceC4650tG, Exception exc, InterfaceC3551gl interfaceC3551gl, EnumC4516rl enumC4516rl) {
        interfaceC3551gl.b();
        C3039ay c3039ay = new C3039ay("Fetching data failed", Collections.singletonList(exc));
        Class clsA = interfaceC3551gl.a();
        c3039ay.b = interfaceC4650tG;
        c3039ay.c = enumC4516rl;
        c3039ay.d = clsA;
        this.b.add(c3039ay);
        if (Thread.currentThread() != this.t) {
            o(2);
        } else {
            p();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3639hl
    public final void b(InterfaceC4650tG interfaceC4650tG, Object obj, InterfaceC3551gl interfaceC3551gl, EnumC4516rl enumC4516rl, InterfaceC4650tG interfaceC4650tG2) {
        this.u = interfaceC4650tG;
        this.w = obj;
        this.y = interfaceC3551gl;
        this.x = enumC4516rl;
        this.v = interfaceC4650tG2;
        this.C = interfaceC4650tG != this.f3236a.a().get(0);
        if (Thread.currentThread() != this.t) {
            o(3);
        } else {
            g();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2322Bt
    public final C4508rh c() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC2496Il runnableC2496Il = (RunnableC2496Il) obj;
        int iOrdinal = this.j.ordinal() - runnableC2496Il.j.ordinal();
        return iOrdinal == 0 ? this.q - runnableC2496Il.q : iOrdinal;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3639hl
    public final void d() {
        o(2);
    }

    public final InterfaceC3616hZ e(InterfaceC3551gl interfaceC3551gl, Object obj, EnumC4516rl enumC4516rl) {
        if (obj == null) {
            interfaceC3551gl.b();
            return null;
        }
        try {
            int i = AbstractC4653tJ.f5029a;
            SystemClock.elapsedRealtimeNanos();
            InterfaceC3616hZ interfaceC3616hZF = f(obj, enumC4516rl);
            if (Log.isLoggable("DecodeJob", 2)) {
                interfaceC3616hZF.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.k);
                Thread.currentThread().getName();
            }
            return interfaceC3616hZF;
        } finally {
            interfaceC3551gl.b();
        }
    }

    public final InterfaceC3616hZ f(Object obj, EnumC4516rl enumC4516rl) {
        Class<?> cls = obj.getClass();
        C2392El c2392El = this.f3236a;
        HI hiC = c2392El.c(cls);
        YS ys = this.o;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = enumC4516rl == EnumC4516rl.d || c2392El.r;
            VS vs = C2629Np.i;
            Boolean bool = (Boolean) ys.c(vs);
            if (bool == null || (bool.booleanValue() && !z)) {
                ys = new YS();
                CachedHashCodeArrayMap cachedHashCodeArrayMap = this.o.b;
                CachedHashCodeArrayMap cachedHashCodeArrayMap2 = ys.b;
                cachedHashCodeArrayMap2.putAll((SimpleArrayMap) cachedHashCodeArrayMap);
                cachedHashCodeArrayMap2.put(vs, Boolean.valueOf(z));
            }
        }
        YS ys2 = ys;
        InterfaceC3989ll interfaceC3989llH = this.h.b().h(obj);
        try {
            return hiC.a(this.l, this.m, new C3692iN(this, enumC4516rl, 5), ys2, interfaceC3989llH);
        } finally {
            interfaceC3989llH.b();
        }
    }

    public final void g() {
        InterfaceC3616hZ interfaceC3616hZE;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.w + ", cache key: " + this.u + ", fetcher: " + this.y;
            int i = AbstractC4653tJ.f5029a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.k);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        C3688iJ c3688iJ = null;
        try {
            interfaceC3616hZE = e(this.y, this.w, this.x);
        } catch (C3039ay e) {
            InterfaceC4650tG interfaceC4650tG = this.v;
            EnumC4516rl enumC4516rl = this.x;
            e.b = interfaceC4650tG;
            e.c = enumC4516rl;
            e.d = null;
            this.b.add(e);
            interfaceC3616hZE = null;
        }
        if (interfaceC3616hZE == null) {
            p();
            return;
        }
        EnumC4516rl enumC4516rl2 = this.x;
        boolean z = this.C;
        if (interfaceC3616hZE instanceof InterfaceC3506gD) {
            ((InterfaceC3506gD) interfaceC3616hZE).initialize();
        }
        if (((C3688iJ) this.f.c) != null) {
            c3688iJ = (C3688iJ) C3688iJ.e.acquire();
            c3688iJ.d = false;
            c3688iJ.c = true;
            c3688iJ.b = interfaceC3616hZE;
            interfaceC3616hZE = c3688iJ;
        }
        r();
        C4790ur c4790ur = (C4790ur) this.p;
        synchronized (c4790ur) {
            c4790ur.q = interfaceC3616hZE;
            c4790ur.r = enumC4516rl2;
            c4790ur.y = z;
        }
        c4790ur.h();
        this.D = 5;
        try {
            C2444Gl c2444Gl = this.f;
            if (((C3688iJ) c2444Gl.c) != null) {
                c2444Gl.a(this.d, this.o);
            }
            if (c3688iJ != null) {
                c3688iJ.d();
            }
            k();
        } catch (Throwable th) {
            if (c3688iJ != null) {
                c3688iJ.d();
            }
            throw th;
        }
    }

    public final InterfaceC3726il h() {
        int iD = DM.D(this.D);
        C2392El c2392El = this.f3236a;
        if (iD == 1) {
            return new C3704iZ(c2392El, this);
        }
        if (iD == 2) {
            return new C3110bl(c2392El.a(), c2392El, this);
        }
        if (iD == 3) {
            return new C3676i80(c2392El, this);
        }
        if (iD == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC5044xl.z(this.D)));
    }

    public final int i(int i) {
        int iD = DM.D(i);
        if (iD == 0) {
            switch (((C2914Yo) this.n).e) {
                case 1:
                case 2:
                    return i(2);
                default:
                    return 2;
            }
        }
        if (iD == 1) {
            switch (((C2914Yo) this.n).e) {
                case 1:
                case 3:
                    return i(3);
                case 2:
                default:
                    return 3;
            }
        }
        if (iD == 2) {
            return this.r ? 6 : 4;
        }
        if (iD == 3 || iD == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC5044xl.z(i)));
    }

    public final void j() {
        r();
        C3039ay c3039ay = new C3039ay("Failed to load resource", new ArrayList(this.b));
        C4790ur c4790ur = (C4790ur) this.p;
        synchronized (c4790ur) {
            c4790ur.t = c3039ay;
        }
        c4790ur.g();
        l();
    }

    public final void k() {
        boolean zA;
        C2470Hl c2470Hl = this.g;
        synchronized (c2470Hl) {
            c2470Hl.b = true;
            zA = c2470Hl.a();
        }
        if (zA) {
            n();
        }
    }

    public final void l() {
        boolean zA;
        C2470Hl c2470Hl = this.g;
        synchronized (c2470Hl) {
            c2470Hl.c = true;
            zA = c2470Hl.a();
        }
        if (zA) {
            n();
        }
    }

    public final void m() {
        boolean zA;
        C2470Hl c2470Hl = this.g;
        synchronized (c2470Hl) {
            c2470Hl.f3183a = true;
            zA = c2470Hl.a();
        }
        if (zA) {
            n();
        }
    }

    public final void n() {
        C2470Hl c2470Hl = this.g;
        synchronized (c2470Hl) {
            c2470Hl.b = false;
            c2470Hl.f3183a = false;
            c2470Hl.c = false;
        }
        C2444Gl c2444Gl = this.f;
        c2444Gl.f3136a = null;
        c2444Gl.b = null;
        c2444Gl.c = null;
        C2392El c2392El = this.f3236a;
        c2392El.c = null;
        c2392El.d = null;
        c2392El.n = null;
        c2392El.g = null;
        c2392El.k = null;
        c2392El.i = null;
        c2392El.o = null;
        c2392El.j = null;
        c2392El.p = null;
        c2392El.f3035a.clear();
        c2392El.l = false;
        c2392El.b.clear();
        c2392El.m = false;
        this.A = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.D = 0;
        this.z = null;
        this.t = null;
        this.u = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.B = false;
        this.b.clear();
        this.e.release(this);
    }

    public final void o(int i) {
        ExecutorServiceC3480fy executorServiceC3480fy;
        this.E = i;
        C4790ur c4790ur = (C4790ur) this.p;
        if (c4790ur.n) {
            executorServiceC3480fy = c4790ur.i;
        } else {
            executorServiceC3480fy = c4790ur.o ? c4790ur.j : c4790ur.h;
        }
        executorServiceC3480fy.execute(this);
    }

    public final void p() {
        this.t = Thread.currentThread();
        int i = AbstractC4653tJ.f5029a;
        SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.B && this.z != null && !(zC = this.z.c())) {
            this.D = i(this.D);
            this.z = h();
            if (this.D == 4) {
                o(2);
                return;
            }
        }
        if ((this.D == 6 || this.B) && !zC) {
            j();
        }
    }

    public final void q() {
        int iD = DM.D(this.E);
        if (iD == 0) {
            this.D = i(1);
            this.z = h();
            p();
        } else if (iD == 1) {
            p();
        } else {
            if (iD != 2) {
                throw new IllegalStateException("Unrecognized run reason: ".concat(AbstractC5044xl.y(this.E)));
            }
            g();
        }
    }

    public final void r() {
        this.c.a();
        if (this.A) {
            throw new IllegalStateException("Already notified", this.b.isEmpty() ? null : (Throwable) DM.e(this.b, 1));
        }
        this.A = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3551gl interfaceC3551gl = this.y;
        try {
            try {
                if (this.B) {
                    j();
                    if (interfaceC3551gl != null) {
                        interfaceC3551gl.b();
                        return;
                    }
                    return;
                }
                q();
                if (interfaceC3551gl != null) {
                    interfaceC3551gl.b();
                }
            } catch (C2590Mc e) {
                throw e;
            } catch (Throwable th) {
                if (this.D != 5) {
                    this.b.add(th);
                    j();
                }
                if (!this.B) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (interfaceC3551gl != null) {
                interfaceC3551gl.b();
            }
            throw th2;
        }
    }
}
