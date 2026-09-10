package g6;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements r, t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f41648i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ni.f f41649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ea.a0 f41650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i6.e f41651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fc.f f41652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bc.i f41653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i9.i f41654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2.p f41655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k5.g f41656h;

    public m(i6.e eVar, n5.f fVar, j6.e eVar2, j6.e eVar3, j6.e eVar4, j6.e eVar5) throws Throwable {
        this.f41651c = eVar;
        i9.i iVar = new i9.i(fVar);
        this.f41654f = iVar;
        k5.g gVar = new k5.g(7);
        this.f41656h = gVar;
        synchronized (this) {
            try {
                try {
                    synchronized (gVar) {
                        try {
                            gVar.f44328d = this;
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    }
                    this.f41650b = new ea.a0(17);
                    this.f41649a = new ni.f(2);
                    this.f41652d = new fc.f(eVar2, eVar3, eVar4, eVar5, this, this);
                    this.f41655g = new b2.p(iVar);
                    this.f41653e = new bc.i(8);
                    eVar.f42897d = this;
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
    }

    public static void c(String str, long j10, s sVar) {
        StringBuilder sbJ = d5.u.j(str, " in ");
        sbJ.append(a7.j.a(j10));
        sbJ.append("ms, key: ");
        sbJ.append(sVar);
        Log.v("Engine", sbJ.toString());
    }

    public static void f(a0 a0Var) {
        if (!(a0Var instanceof u)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((u) a0Var).d();
    }

    public final v9.e a(com.bumptech.glide.e eVar, Object obj, e6.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.f fVar2, l lVar, a7.d dVar, boolean z10, boolean z11, e6.i iVar, boolean z12, boolean z13, w6.g gVar, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f41648i) {
            int i12 = a7.j.f3432b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f41650b.getClass();
        s sVar = new s(obj, fVar, i10, i11, dVar, cls, cls2, iVar);
        synchronized (this) {
            try {
                u uVarB = b(sVar, z12, jElapsedRealtimeNanos);
                if (uVarB == null) {
                    return g(eVar, obj, fVar, i10, i11, cls, cls2, fVar2, lVar, dVar, z10, z11, iVar, z12, z13, gVar, executor, sVar, jElapsedRealtimeNanos);
                }
                gVar.i(uVarB, 5, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u b(s sVar, boolean z10, long j10) {
        u uVar;
        Object obj;
        m mVar;
        s sVar2;
        u uVar2;
        if (z10) {
            k5.g gVar = this.f41656h;
            synchronized (gVar) {
                c cVar = (c) ((HashMap) gVar.f44326b).get(sVar);
                if (cVar == null) {
                    uVar = null;
                } else {
                    uVar = (u) cVar.get();
                    if (uVar == null) {
                        gVar.n(cVar);
                    }
                }
            }
            if (uVar != null) {
                uVar.a();
            }
            if (uVar != null) {
                if (f41648i) {
                    c("Loaded resource from active resources", j10, sVar);
                }
                return uVar;
            }
            i6.e eVar = this.f41651c;
            synchronized (eVar) {
                a7.k kVar = (a7.k) ((LinkedHashMap) eVar.f3437c).remove(sVar);
                if (kVar == null) {
                    obj = null;
                } else {
                    eVar.f3436b -= (long) kVar.f3434b;
                    obj = kVar.f3433a;
                }
            }
            a0 a0Var = (a0) obj;
            if (a0Var == null) {
                mVar = this;
                sVar2 = sVar;
                uVar2 = null;
            } else if (a0Var instanceof u) {
                uVar2 = (u) a0Var;
                mVar = this;
                sVar2 = sVar;
            } else {
                mVar = this;
                sVar2 = sVar;
                uVar2 = new u(a0Var, true, true, sVar2, mVar);
            }
            if (uVar2 != null) {
                uVar2.a();
                mVar.f41656h.a(sVar2, uVar2);
            }
            if (uVar2 != null) {
                if (f41648i) {
                    c("Loaded resource from cache", j10, sVar2);
                }
                return uVar2;
            }
        }
        return null;
    }

    public final synchronized void d(q qVar, e6.f fVar, u uVar) {
        if (uVar != null) {
            try {
                if (uVar.f41694a) {
                    this.f41656h.a(fVar, uVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ni.f fVar2 = this.f41649a;
        fVar2.getClass();
        qVar.getClass();
        HashMap map = fVar2.f46764a;
        if (qVar.equals(map.get(fVar))) {
            map.remove(fVar);
        }
    }

    public final void e(e6.f fVar, u uVar) {
        k5.g gVar = this.f41656h;
        synchronized (gVar) {
            c cVar = (c) ((HashMap) gVar.f44326b).remove(fVar);
            if (cVar != null) {
                cVar.f41569c = null;
                cVar.clear();
            }
        }
        if (uVar.f41694a) {
        } else {
            this.f41653e.e(uVar, false);
        }
    }

    public final v9.e g(com.bumptech.glide.e eVar, Object obj, e6.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.f fVar2, l lVar, Map map, boolean z10, boolean z11, e6.i iVar, boolean z12, boolean z13, w6.g gVar, Executor executor, s sVar, long j10) {
        j6.e eVar2;
        q qVar = (q) this.f41649a.f46764a.get(sVar);
        if (qVar != null) {
            qVar.b(gVar, executor);
            if (f41648i) {
                c("Added to existing load", j10, sVar);
            }
            return new v9.e(this, gVar, qVar);
        }
        q qVar2 = (q) ((v9.e) this.f41652d.f40786h).g();
        synchronized (qVar2) {
            qVar2.f41674k = sVar;
            qVar2.l = z12;
            qVar2.f41675m = z13;
        }
        b2.p pVar = this.f41655g;
        j jVar = (j) ((v9.e) pVar.f5365d).g();
        int i12 = pVar.f5363b;
        pVar.f5363b = i12 + 1;
        i iVar2 = jVar.f41614a;
        i9.i iVar3 = jVar.f41617d;
        iVar2.f41599c = eVar;
        iVar2.f41600d = obj;
        iVar2.f41609n = fVar;
        iVar2.f41601e = i10;
        iVar2.f41602f = i11;
        iVar2.f41611p = lVar;
        iVar2.f41603g = cls;
        iVar2.f41604h = iVar3;
        iVar2.f41607k = cls2;
        iVar2.f41610o = fVar2;
        iVar2.f41605i = iVar;
        iVar2.f41606j = map;
        iVar2.f41612q = z10;
        iVar2.f41613r = z11;
        jVar.f41621h = eVar;
        jVar.f41622i = fVar;
        jVar.f41623j = fVar2;
        jVar.f41624k = sVar;
        jVar.l = i10;
        jVar.f41625m = i11;
        jVar.f41626n = lVar;
        jVar.f41627o = iVar;
        jVar.f41628p = qVar2;
        jVar.f41629q = i12;
        jVar.D = 1;
        jVar.f41631s = obj;
        ni.f fVar3 = this.f41649a;
        fVar3.getClass();
        fVar3.f46764a.put(sVar, qVar2);
        qVar2.b(gVar, executor);
        synchronized (qVar2) {
            qVar2.f41682t = jVar;
            int iH = jVar.h(1);
            if (iH == 2 || iH == 3) {
                eVar2 = qVar2.f41670g;
            } else {
                eVar2 = qVar2.f41675m ? qVar2.f41672i : qVar2.f41671h;
            }
            eVar2.execute(jVar);
        }
        if (f41648i) {
            c("Started new load", j10, sVar);
        }
        return new v9.e(this, gVar, qVar2);
    }
}
