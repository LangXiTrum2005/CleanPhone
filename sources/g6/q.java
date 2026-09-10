package g6;

import com.google.android.gms.internal.ads.f6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements b7.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ea.b0 f41663w = new ea.b0(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f41666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0.b f41667d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f41669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j6.e f41670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j6.e f41671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j6.e f41672i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s f41674k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a0 f41676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public w f41679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f41680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u f41681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f41682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f41683u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f41684v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f41664a = new p(new ArrayList(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.e f41665b = new b7.e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f41673j = new AtomicInteger();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ea.b0 f41668e = f41663w;

    public q(j6.e eVar, j6.e eVar2, j6.e eVar3, j6.e eVar4, m mVar, m mVar2, v9.e eVar5) {
        this.f41670g = eVar;
        this.f41671h = eVar2;
        this.f41672i = eVar4;
        this.f41669f = mVar;
        this.f41666c = mVar2;
        this.f41667d = eVar5;
    }

    @Override // b7.b
    public final b7.e a() {
        return this.f41665b;
    }

    public final synchronized void b(w6.g gVar, Executor executor) {
        try {
            this.f41665b.a();
            this.f41664a.f41662a.add(new o(gVar, executor));
            if (this.f41678p) {
                e(1);
                executor.execute(new n(this, gVar, 1));
            } else if (this.f41680r) {
                e(1);
                executor.execute(new n(this, gVar, 0));
            } else {
                a7.h.a("Cannot add callbacks to a cancelled EngineJob", !this.f41683u);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.f41683u = true;
        j jVar = this.f41682t;
        jVar.A = true;
        h hVar = jVar.f41637y;
        if (hVar != null) {
            hVar.cancel();
        }
        r rVar = this.f41669f;
        s sVar = this.f41674k;
        m mVar = (m) rVar;
        synchronized (mVar) {
            ni.f fVar = mVar.f41649a;
            fVar.getClass();
            HashMap map = fVar.f46764a;
            if (equals(map.get(sVar))) {
                map.remove(sVar);
            }
        }
    }

    public final void d() {
        u uVar;
        synchronized (this) {
            try {
                this.f41665b.a();
                a7.h.a("Not yet complete!", f());
                int iDecrementAndGet = this.f41673j.decrementAndGet();
                a7.h.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    uVar = this.f41681s;
                    g();
                } else {
                    uVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (uVar != null) {
            uVar.d();
        }
    }

    public final synchronized void e(int i10) {
        u uVar;
        a7.h.a("Not yet complete!", f());
        if (this.f41673j.getAndAdd(i10) == 0 && (uVar = this.f41681s) != null) {
            uVar.a();
        }
    }

    public final boolean f() {
        return this.f41680r || this.f41678p || this.f41683u;
    }

    public final synchronized void g() {
        boolean zB;
        if (this.f41674k == null) {
            throw new IllegalArgumentException();
        }
        this.f41664a.f41662a.clear();
        this.f41674k = null;
        this.f41681s = null;
        this.f41676n = null;
        this.f41680r = false;
        this.f41683u = false;
        this.f41678p = false;
        this.f41684v = false;
        j jVar = this.f41682t;
        f6 f6Var = jVar.f41620g;
        synchronized (f6Var) {
            f6Var.f14258a = true;
            zB = f6Var.b();
        }
        if (zB) {
            jVar.k();
        }
        this.f41682t = null;
        this.f41679q = null;
        this.f41677o = 0;
        this.f41667d.e(this);
    }

    public final synchronized void h(w6.g gVar) {
        try {
            this.f41665b.a();
            this.f41664a.f41662a.remove(new o(gVar, a7.h.f3430b));
            if (this.f41664a.f41662a.isEmpty()) {
                c();
                if (this.f41678p || this.f41680r) {
                    if (this.f41673j.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
