package g6;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.f6;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements g, Runnable, Comparable, b7.b {
    public volatile boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i9.i f41617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0.b f41618e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.e f41621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e6.f f41622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.f f41623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s f41624k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f41626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e6.i f41627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q f41628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f41629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f41630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f41631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Thread f41632t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e6.f f41633u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e6.f f41634v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f41635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.bumptech.glide.load.data.e f41636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile h f41637y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f41638z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f41614a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41615b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.e f41616c = new b7.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g9.k f41619f = new g9.k(17);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f6 f41620g = new f6();

    public j(i9.i iVar, v9.e eVar) {
        this.f41617d = iVar;
        this.f41618e = eVar;
    }

    @Override // b7.b
    public final b7.e a() {
        return this.f41616c;
    }

    @Override // g6.g
    public final void b(e6.f fVar, Object obj, com.bumptech.glide.load.data.e eVar, int i10, e6.f fVar2) {
        this.f41633u = fVar;
        this.f41635w = obj;
        this.f41636x = eVar;
        this.E = i10;
        this.f41634v = fVar2;
        this.B = fVar != this.f41614a.a().get(0);
        if (Thread.currentThread() != this.f41632t) {
            l(3);
        } else {
            f();
        }
    }

    @Override // g6.g
    public final void c(e6.f fVar, Exception exc, com.bumptech.glide.load.data.e eVar, int i10) {
        eVar.b();
        w wVar = new w("Fetching data failed", Collections.singletonList(exc));
        Class clsA = eVar.a();
        wVar.f41705b = fVar;
        wVar.f41706c = i10;
        wVar.f41707d = clsA;
        this.f41615b.add(wVar);
        if (Thread.currentThread() != this.f41632t) {
            l(2);
        } else {
            m();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int iOrdinal = this.f41623j.ordinal() - jVar.f41623j.ordinal();
        return iOrdinal == 0 ? this.f41629q - jVar.f41629q : iOrdinal;
    }

    public final a0 d(com.bumptech.glide.load.data.e eVar, Object obj, int i10) {
        if (obj == null) {
            eVar.b();
            return null;
        }
        try {
            int i11 = a7.j.f3432b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            a0 a0VarE = e(i10, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i(jElapsedRealtimeNanos, "Decoded result " + a0VarE, null);
            }
            return a0VarE;
        } finally {
            eVar.b();
        }
    }

    public final a0 e(int i10, Object obj) {
        Class<?> cls = obj.getClass();
        i iVar = this.f41614a;
        y yVarC = iVar.c(cls);
        e6.i iVar2 = this.f41627o;
        boolean z10 = i10 == 4 || iVar.f41613r;
        e6.h hVar = n6.n.f46597i;
        Boolean bool = (Boolean) iVar2.c(hVar);
        if (bool == null || (bool.booleanValue() && !z10)) {
            iVar2 = new e6.i();
            a7.d dVar = this.f41627o.f39148b;
            a7.d dVar2 = iVar2.f39148b;
            dVar2.g(dVar);
            dVar2.put(hVar, Boolean.valueOf(z10));
        }
        e6.i iVar3 = iVar2;
        com.bumptech.glide.load.data.g gVarG = this.f41621h.a().g(obj);
        try {
            return yVarC.a(this.l, this.f41625m, new b2.w(i10, 12, this), gVarG, iVar3);
        } finally {
            gVarG.b();
        }
    }

    public final void f() {
        a0 a0VarD;
        boolean zB;
        if (Log.isLoggable("DecodeJob", 2)) {
            i(this.f41630r, "Retrieved data", "data: " + this.f41635w + ", cache key: " + this.f41633u + ", fetcher: " + this.f41636x);
        }
        z zVar = null;
        try {
            a0VarD = d(this.f41636x, this.f41635w, this.E);
        } catch (w e10) {
            e6.f fVar = this.f41634v;
            int i10 = this.E;
            e10.f41705b = fVar;
            e10.f41706c = i10;
            e10.f41707d = null;
            this.f41615b.add(e10);
            a0VarD = null;
        }
        if (a0VarD == null) {
            m();
            return;
        }
        int i11 = this.E;
        boolean z10 = this.B;
        if (a0VarD instanceof x) {
            ((x) a0VarD).initialize();
        }
        if (((z) this.f41619f.f41772d) != null) {
            zVar = (z) z.f41712e.g();
            zVar.f41716d = false;
            zVar.f41715c = true;
            zVar.f41714b = a0VarD;
            a0VarD = zVar;
        }
        o();
        q qVar = this.f41628p;
        synchronized (qVar) {
            qVar.f41676n = a0VarD;
            qVar.f41677o = i11;
            qVar.f41684v = z10;
        }
        synchronized (qVar) {
            try {
                qVar.f41665b.a();
                if (qVar.f41683u) {
                    qVar.f41676n.b();
                    qVar.g();
                } else {
                    if (qVar.f41664a.f41662a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (qVar.f41678p) {
                        throw new IllegalStateException("Already have resource");
                    }
                    ea.b0 b0Var = qVar.f41668e;
                    a0 a0Var = qVar.f41676n;
                    boolean z11 = qVar.l;
                    s sVar = qVar.f41674k;
                    t tVar = qVar.f41666c;
                    b0Var.getClass();
                    qVar.f41681s = new u(a0Var, z11, true, sVar, tVar);
                    qVar.f41678p = true;
                    p pVar = qVar.f41664a;
                    pVar.getClass();
                    ArrayList<o> arrayList = new ArrayList(pVar.f41662a);
                    qVar.e(arrayList.size() + 1);
                    ((m) qVar.f41669f).d(qVar, qVar.f41674k, qVar.f41681s);
                    for (o oVar : arrayList) {
                        oVar.f41661b.execute(new n(qVar, oVar.f41660a, 1));
                    }
                    qVar.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.C = 5;
        try {
            g9.k kVar = this.f41619f;
            if (((z) kVar.f41772d) != null) {
                i9.i iVar = this.f41617d;
                e6.i iVar2 = this.f41627o;
                kVar.getClass();
                try {
                    iVar.a().l((e6.f) kVar.f41770b, new v9.e((e6.l) kVar.f41771c, (z) kVar.f41772d, iVar2, false, 16));
                    ((z) kVar.f41772d).d();
                } catch (Throwable th3) {
                    ((z) kVar.f41772d).d();
                    throw th3;
                }
            }
            if (zVar != null) {
                zVar.d();
            }
            f6 f6Var = this.f41620g;
            synchronized (f6Var) {
                f6Var.f14259b = true;
                zB = f6Var.b();
            }
            if (zB) {
                k();
            }
        } catch (Throwable th4) {
            if (zVar == null) {
                throw th4;
            }
            zVar.d();
            throw th4;
        }
    }

    public final h g() {
        int iC = v0.i.c(this.C);
        i iVar = this.f41614a;
        if (iC == 1) {
            return new b0(iVar, this);
        }
        if (iC == 2) {
            return new e(iVar.a(), iVar, this);
        }
        if (iC == 3) {
            return new e0(iVar, this);
        }
        if (iC == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(d5.u.y(this.C)));
    }

    public final int h(int i10) {
        boolean z10;
        boolean z11;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            switch (this.f41626n.f41647a) {
                case 0:
                case 1:
                    z10 = false;
                    break;
                default:
                    z10 = true;
                    break;
            }
            if (z10) {
                return 2;
            }
            return h(2);
        }
        if (iC != 1) {
            if (iC == 2) {
                return 4;
            }
            if (iC == 3 || iC == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(d5.u.y(i10)));
        }
        switch (this.f41626n.f41647a) {
            case 0:
                z11 = false;
                break;
            case 1:
            default:
                z11 = true;
                break;
        }
        if (z11) {
            return 3;
        }
        return h(3);
    }

    public final void i(long j10, String str, String str2) {
        StringBuilder sbJ = d5.u.j(str, " in ");
        sbJ.append(a7.j.a(j10));
        sbJ.append(", load key: ");
        sbJ.append(this.f41624k);
        sbJ.append(str2 != null ? ", ".concat(str2) : "");
        sbJ.append(", thread: ");
        sbJ.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbJ.toString());
    }

    public final void j() {
        boolean zB;
        o();
        w wVar = new w("Failed to load resource", new ArrayList(this.f41615b));
        q qVar = this.f41628p;
        synchronized (qVar) {
            qVar.f41679q = wVar;
        }
        synchronized (qVar) {
            try {
                qVar.f41665b.a();
                if (qVar.f41683u) {
                    qVar.g();
                } else {
                    if (qVar.f41664a.f41662a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (qVar.f41680r) {
                        throw new IllegalStateException("Already failed once");
                    }
                    qVar.f41680r = true;
                    s sVar = qVar.f41674k;
                    p pVar = qVar.f41664a;
                    pVar.getClass();
                    ArrayList<o> arrayList = new ArrayList(pVar.f41662a);
                    qVar.e(arrayList.size() + 1);
                    ((m) qVar.f41669f).d(qVar, sVar, null);
                    for (o oVar : arrayList) {
                        oVar.f41661b.execute(new n(qVar, oVar.f41660a, 0));
                    }
                    qVar.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f6 f6Var = this.f41620g;
        synchronized (f6Var) {
            f6Var.f14260c = true;
            zB = f6Var.b();
        }
        if (zB) {
            k();
        }
    }

    public final void k() {
        f6 f6Var = this.f41620g;
        synchronized (f6Var) {
            f6Var.f14259b = false;
            f6Var.f14258a = false;
            f6Var.f14260c = false;
        }
        g9.k kVar = this.f41619f;
        kVar.f41770b = null;
        kVar.f41771c = null;
        kVar.f41772d = null;
        i iVar = this.f41614a;
        iVar.f41599c = null;
        iVar.f41600d = null;
        iVar.f41609n = null;
        iVar.f41603g = null;
        iVar.f41607k = null;
        iVar.f41605i = null;
        iVar.f41610o = null;
        iVar.f41606j = null;
        iVar.f41611p = null;
        iVar.f41597a.clear();
        iVar.l = false;
        iVar.f41598b.clear();
        iVar.f41608m = false;
        this.f41638z = false;
        this.f41621h = null;
        this.f41622i = null;
        this.f41627o = null;
        this.f41623j = null;
        this.f41624k = null;
        this.f41628p = null;
        this.C = 0;
        this.f41637y = null;
        this.f41632t = null;
        this.f41633u = null;
        this.f41635w = null;
        this.E = 0;
        this.f41636x = null;
        this.f41630r = 0L;
        this.A = false;
        this.f41631s = null;
        this.f41615b.clear();
        this.f41618e.e(this);
    }

    public final void l(int i10) {
        this.D = i10;
        q qVar = this.f41628p;
        (qVar.f41675m ? qVar.f41672i : qVar.f41671h).execute(this);
    }

    public final void m() {
        this.f41632t = Thread.currentThread();
        int i10 = a7.j.f3432b;
        this.f41630r = SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.A && this.f41637y != null && !(zA = this.f41637y.a())) {
            this.C = h(this.C);
            this.f41637y = g();
            if (this.C == 4) {
                l(2);
                return;
            }
        }
        if ((this.C == 6 || this.A) && !zA) {
            j();
        }
    }

    public final void n() {
        String str;
        int iC = v0.i.c(this.D);
        if (iC == 0) {
            this.C = h(1);
            this.f41637y = g();
            m();
        } else {
            if (iC == 1) {
                m();
                return;
            }
            if (iC == 2) {
                f();
                return;
            }
            int i10 = this.D;
            if (i10 == 1) {
                str = "INITIALIZE";
            } else if (i10 != 2) {
                str = i10 != 3 ? "null" : "DECODE_DATA";
            } else {
                str = "SWITCH_TO_SOURCE_SERVICE";
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(str));
        }
    }

    public final void o() {
        this.f41616c.a();
        if (this.f41638z) {
            throw new IllegalStateException("Already notified", this.f41615b.isEmpty() ? null : (Throwable) l1.d.d(this.f41615b, 1));
        }
        this.f41638z = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.f41636x;
        try {
            try {
                if (this.A) {
                    j();
                    if (eVar != null) {
                        eVar.b();
                        return;
                    }
                    return;
                }
                n();
                if (eVar != null) {
                    eVar.b();
                }
            } catch (d e10) {
                throw e10;
            } catch (Throwable th2) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.A + ", stage: " + d5.u.y(this.C), th2);
                }
                if (this.C != 5) {
                    this.f41615b.add(th2);
                    j();
                }
                if (!this.A) {
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (eVar != null) {
                eVar.b();
            }
            throw th3;
        }
    }
}
