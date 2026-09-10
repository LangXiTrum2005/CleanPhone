package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f4541k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4542a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.f f4543b = new r.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4544c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f4546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f4547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0 f4551j;

    public e0() {
        Object obj = f4541k;
        this.f4547f = obj;
        this.f4551j = new a0(this, 0);
        this.f4546e = obj;
        this.f4548g = -1;
    }

    public static void a(String str) {
        q.a.L().f48509b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(defpackage.e.o("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(d0 d0Var) {
        if (d0Var.f4537b) {
            if (!d0Var.f()) {
                d0Var.b(false);
                return;
            }
            int i10 = d0Var.f4538c;
            int i11 = this.f4548g;
            if (i10 >= i11) {
                return;
            }
            d0Var.f4538c = i11;
            d0Var.f4536a.A(this.f4546e);
        }
    }

    public final void c(d0 d0Var) {
        if (this.f4549h) {
            this.f4550i = true;
            return;
        }
        this.f4549h = true;
        do {
            this.f4550i = false;
            if (d0Var != null) {
                b(d0Var);
                d0Var = null;
            } else {
                r.f fVar = this.f4543b;
                fVar.getClass();
                r.d dVar = new r.d(fVar);
                fVar.f49216c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((d0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f4550i) {
                        break;
                    }
                }
            }
        } while (this.f4550i);
        this.f4549h = false;
    }

    public final void d(v vVar, g0 g0Var) {
        Object obj;
        a("observe");
        if (((x) vVar.getLifecycle()).f4609d == n.f4564a) {
            return;
        }
        c0 c0Var = new c0(this, vVar, g0Var);
        r.f fVar = this.f4543b;
        r.c cVarB = fVar.b(g0Var);
        if (cVarB != null) {
            obj = cVarB.f49208b;
        } else {
            r.c cVar = new r.c(g0Var, c0Var);
            fVar.f49217d++;
            r.c cVar2 = fVar.f49215b;
            if (cVar2 == null) {
                fVar.f49214a = cVar;
                fVar.f49215b = cVar;
            } else {
                cVar2.f49209c = cVar;
                cVar.f49210d = cVar2;
                fVar.f49215b = cVar;
            }
            obj = null;
        }
        d0 d0Var = (d0) obj;
        if (d0Var != null && !d0Var.e(vVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (d0Var != null) {
            return;
        }
        vVar.getLifecycle().a(c0Var);
    }

    public final void e(g0 g0Var) {
        Object obj;
        a("observeForever");
        b0 b0Var = new b0(this, g0Var);
        r.f fVar = this.f4543b;
        r.c cVarB = fVar.b(g0Var);
        if (cVarB != null) {
            obj = cVarB.f49208b;
        } else {
            r.c cVar = new r.c(g0Var, b0Var);
            fVar.f49217d++;
            r.c cVar2 = fVar.f49215b;
            if (cVar2 == null) {
                fVar.f49214a = cVar;
                fVar.f49215b = cVar;
            } else {
                cVar2.f49209c = cVar;
                cVar.f49210d = cVar2;
                fVar.f49215b = cVar;
            }
            obj = null;
        }
        d0 d0Var = (d0) obj;
        if (d0Var instanceof c0) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (d0Var != null) {
            return;
        }
        b0Var.b(true);
    }

    public void h(Object obj) {
        boolean z10;
        synchronized (this.f4542a) {
            z10 = this.f4547f == f4541k;
            this.f4547f = obj;
        }
        if (z10) {
            q.a aVarL = q.a.L();
            a0 a0Var = this.f4551j;
            q.b bVar = aVarL.f48509b;
            if (bVar.f48512d == null) {
                synchronized (bVar.f48510b) {
                    try {
                        if (bVar.f48512d == null) {
                            bVar.f48512d = Handler.createAsync(Looper.getMainLooper());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            bVar.f48512d.post(a0Var);
        }
    }

    public void i(g0 g0Var) {
        a("removeObserver");
        d0 d0Var = (d0) this.f4543b.h(g0Var);
        if (d0Var == null) {
            return;
        }
        d0Var.c();
        d0Var.b(false);
    }

    public void j(Object obj) {
        a("setValue");
        this.f4548g++;
        this.f4546e = obj;
        c(null);
    }

    public void f() {
    }

    public void g() {
    }
}
