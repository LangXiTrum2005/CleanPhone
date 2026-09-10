package ud;

import android.util.Log;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xd.j f52037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f52038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f52039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f52040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s0.i f52041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f52042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ak.k f52043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0 f52044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f52045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f52046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f52047k;

    public c1(xd.j sessionsSettings, t0 sessionGenerator, p0 sessionFirelogPublisher, g1 timeProvider, s0.i sessionDataStore, c0 processDataManager, ak.k backgroundDispatcher) {
        kotlin.jvm.internal.n.f(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.n.f(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.n.f(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.n.f(timeProvider, "timeProvider");
        kotlin.jvm.internal.n.f(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.n.f(processDataManager, "processDataManager");
        kotlin.jvm.internal.n.f(backgroundDispatcher, "backgroundDispatcher");
        this.f52037a = sessionsSettings;
        this.f52038b = sessionGenerator;
        this.f52039c = sessionFirelogPublisher;
        this.f52040d = timeProvider;
        this.f52041e = sessionDataStore;
        this.f52042f = processDataManager;
        this.f52043g = backgroundDispatcher;
        this.f52047k = "";
        cn.d0.w(cn.d0.b(backgroundDispatcher), null, new y0(this, null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(c1 c1Var, String str, z0 z0Var, ak.f fVar) {
        b1 b1Var;
        String str2;
        if (fVar instanceof b1) {
            b1Var = (b1) fVar;
            int i10 = b1Var.f52023j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b1Var.f52023j = i10 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(c1Var, fVar);
            }
        } else {
            b1Var = new b1(c1Var, fVar);
        }
        Object objB = b1Var.f52021h;
        bk.a aVar = bk.a.f5708a;
        int i11 = b1Var.f52023j;
        if (i11 == 0) {
            t9.e.z(objB);
            if (kotlin.jvm.internal.n.a(c1Var.f52047k, str)) {
                return wj.r.f53297a;
            }
            c1Var.f52047k = str;
            vd.c cVar = vd.c.f52564a;
            b1Var.f52019f = str;
            b1Var.f52020g = z0Var;
            b1Var.f52023j = 1;
            objB = cVar.b(b1Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z0Var = b1Var.f52020g;
            str = b1Var.f52019f;
            t9.e.z(objB);
        }
        for (zb.h hVar : ((Map) objB).values()) {
            vd.e eVar = new vd.e(str);
            hVar.getClass();
            String str3 = "App Quality Sessions session changed: " + eVar;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            zb.g gVar = hVar.f54691b;
            synchronized (gVar) {
                if (!Objects.equals(gVar.f54689c, str)) {
                    zb.g.a(gVar.f54687a, gVar.f54688b, str);
                    gVar.f54689c = str;
                }
            }
            int iOrdinal = z0Var.ordinal();
            if (iOrdinal == 0) {
                str2 = "Notified " + vd.d.f52566a + " of new session " + str;
            } else {
                if (iOrdinal != 1) {
                    throw new aa.b((byte) 0, 20);
                }
                str2 = "Notified " + vd.d.f52566a + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return wj.r.f53297a;
    }

    public final void b() {
        this.f52045i = false;
        if (this.f52044h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f52042f.a());
        cn.d0.w(cn.d0.b(this.f52043g), null, new y0(this, null, 1), 3);
    }

    public final void c() {
        this.f52045i = true;
        i0 i0Var = this.f52044h;
        if (i0Var == null) {
            this.f52046j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        ak.f fVar = null;
        if (i0Var == null) {
            kotlin.jvm.internal.n.l("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f52042f.a());
        if (e(i0Var) || d(i0Var)) {
            cn.d0.w(cn.d0.b(this.f52043g), null, new b4.c(this, i0Var, fVar, 14), 3);
        }
    }

    public final boolean d(i0 i0Var) {
        Map map = i0Var.f52108c;
        boolean z10 = true;
        c0 c0Var = this.f52042f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + c0Var.a());
            return true;
        }
        c0Var.getClass();
        a0 a0Var = (a0) map.get(c0Var.a());
        if (a0Var != null && a0Var.f52010a == c0Var.f52033c && kotlin.jvm.internal.n.a(a0Var.f52011b, (String) c0Var.f52034d.getValue())) {
            z10 = false;
        }
        if (z10) {
            Log.d("FirebaseSessions", "Process " + c0Var.a() + " is stale");
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    public final boolean e(i0 i0Var) {
        bn.a aVarC;
        long jO;
        f1 f1Var = i0Var.f52107b;
        m0 m0Var = i0Var.f52106a;
        if (f1Var == null) {
            Log.d("FirebaseSessions", "Session " + m0Var.f52123a + " has not backgrounded yet");
            return false;
        }
        f1 f1VarA = this.f52040d.a();
        int i10 = bn.a.f5743d;
        long jP = d0.c.P(f1VarA.f52072a - f1Var.f52072a, bn.c.MILLISECONDS);
        xd.j jVar = this.f52037a;
        bn.a aVarC2 = jVar.f53758a.c();
        if (aVarC2 != null) {
            jO = aVarC2.f5744a;
            if (jO <= 0 || bn.a.e(jO)) {
                aVarC = jVar.f53759b.c();
                if (aVarC != null) {
                    jO = aVarC.f5744a;
                    if (jO > 0 || bn.a.e(jO)) {
                        jO = d0.c.O(30, bn.c.MINUTES);
                    }
                } else {
                    jO = d0.c.O(30, bn.c.MINUTES);
                }
            }
        } else {
            aVarC = jVar.f53759b.c();
            if (aVarC != null) {
                jO = aVarC.f5744a;
                if (jO > 0) {
                    jO = d0.c.O(30, bn.c.MINUTES);
                } else {
                    jO = d0.c.O(30, bn.c.MINUTES);
                }
            } else {
                jO = d0.c.O(30, bn.c.MINUTES);
            }
        }
        boolean z10 = bn.a.c(jP, jO) > 0;
        if (z10) {
            Log.d("FirebaseSessions", "Session " + m0Var.f52123a + " is expired");
        }
        return z10;
    }
}
