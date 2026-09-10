package w6;

import a7.j;
import a7.p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.ironsource.X3;
import d5.u;
import g6.a0;
import g6.m;
import g6.q;
import g6.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements c {
    public static final boolean C = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.e f52960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f52961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f52962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f52963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.e f52964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f52965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f52966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f52967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f52968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f52969k;
    public final com.bumptech.glide.f l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x6.a f52970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f52971n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y6.a f52972o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Executor f52973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a0 f52974q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v9.e f52975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f52976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile m f52977t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f52978u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f52979v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f52980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f52981x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f52982y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f52983z;

    public g(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, com.bumptech.glide.f fVar, x6.a aVar2, e eVar2, ArrayList arrayList, d dVar, m mVar, y6.a aVar3, Executor executor) {
        this.f52959a = C ? String.valueOf(hashCode()) : null;
        this.f52960b = new b7.e();
        this.f52961c = obj;
        this.f52964f = eVar;
        this.f52965g = obj2;
        this.f52966h = cls;
        this.f52967i = aVar;
        this.f52968j = i10;
        this.f52969k = i11;
        this.l = fVar;
        this.f52970m = aVar2;
        this.f52962d = eVar2;
        this.f52971n = arrayList;
        this.f52963e = dVar;
        this.f52977t = mVar;
        this.f52972o = aVar3;
        this.f52973p = executor;
        this.B = 1;
        if (this.A == null && ((Map) eVar.f10472g.f47386b).containsKey(com.bumptech.glide.d.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // w6.c
    public final boolean a() {
        boolean z10;
        synchronized (this.f52961c) {
            z10 = this.B == 4;
        }
        return z10;
    }

    public final void b() {
        if (this.f52983z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f52960b.a();
        this.f52970m.getClass();
        v9.e eVar = this.f52975r;
        if (eVar != null) {
            synchronized (((m) eVar.f52505d)) {
                ((q) eVar.f52503b).h((g) eVar.f52504c);
            }
            this.f52975r = null;
        }
    }

    @Override // w6.c
    public final boolean c(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.f fVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.f fVar2;
        int size2;
        boolean zEquals;
        boolean zE;
        if (!(cVar instanceof g)) {
            return false;
        }
        synchronized (this.f52961c) {
            try {
                i10 = this.f52968j;
                i11 = this.f52969k;
                obj = this.f52965g;
                cls = this.f52966h;
                aVar = this.f52967i;
                fVar = this.l;
                List list = this.f52971n;
                size = list != null ? list.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar = (g) cVar;
        synchronized (gVar.f52961c) {
            try {
                i12 = gVar.f52968j;
                i13 = gVar.f52969k;
                obj2 = gVar.f52965g;
                cls2 = gVar.f52966h;
                aVar2 = gVar.f52967i;
                fVar2 = gVar.l;
                List list2 = gVar.f52971n;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (i10 == i12 && i11 == i13) {
            char[] cArr = p.f3444a;
            if (obj == null) {
                zEquals = obj2 == null;
            } else {
                zEquals = obj.equals(obj2);
            }
            if (zEquals && cls.equals(cls2)) {
                if (aVar == null) {
                    zE = aVar2 == null;
                } else {
                    zE = aVar.e(aVar2);
                }
                if (zE && fVar == fVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w6.c
    public final void clear() {
        synchronized (this.f52961c) {
            try {
                if (this.f52983z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f52960b.a();
                if (this.B == 6) {
                    return;
                }
                b();
                a0 a0Var = this.f52974q;
                if (a0Var != null) {
                    this.f52974q = null;
                } else {
                    a0Var = null;
                }
                d dVar = this.f52963e;
                if (dVar == null || dVar.f(this)) {
                    x6.a aVar = this.f52970m;
                    d();
                    aVar.g();
                }
                this.B = 6;
                if (a0Var != null) {
                    this.f52977t.getClass();
                    m.f(a0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Drawable d() {
        if (this.f52979v == null) {
            this.f52967i.getClass();
            this.f52979v = null;
        }
        return this.f52979v;
    }

    public final void e(String str) {
        StringBuilder sbJ = u.j(str, " this: ");
        sbJ.append(this.f52959a);
        Log.v("GlideRequest", sbJ.toString());
    }

    public final void f(w wVar, int i10) {
        Drawable drawable;
        this.f52960b.a();
        synchronized (this.f52961c) {
            try {
                wVar.getClass();
                int i11 = this.f52964f.f10473h;
                if (i11 <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f52965g + "] with dimensions [" + this.f52981x + "x" + this.f52982y + X3.j.f27836e, wVar);
                    if (i11 <= 4) {
                        wVar.d();
                    }
                }
                this.f52975r = null;
                this.B = 5;
                d dVar = this.f52963e;
                if (dVar != null) {
                    dVar.d(this);
                }
                boolean z10 = true;
                this.f52983z = true;
                try {
                    List<e> list = this.f52971n;
                    if (list != null) {
                        for (e eVar : list) {
                            d dVar2 = this.f52963e;
                            if (dVar2 != null) {
                                dVar2.getRoot().a();
                            }
                            eVar.i(wVar);
                        }
                    }
                    e eVar2 = this.f52962d;
                    if (eVar2 != null) {
                        d dVar3 = this.f52963e;
                        if (dVar3 != null) {
                            dVar3.getRoot().a();
                        }
                        eVar2.i(wVar);
                    }
                    d dVar4 = this.f52963e;
                    if (dVar4 != null && !dVar4.e(this)) {
                        z10 = false;
                    }
                    if (z10) {
                        if (this.f52965g == null) {
                            if (this.f52980w == null) {
                                this.f52967i.getClass();
                                this.f52980w = null;
                            }
                            drawable = this.f52980w;
                        } else {
                            drawable = null;
                        }
                        if (drawable == null) {
                            if (this.f52978u == null) {
                                this.f52967i.getClass();
                                this.f52978u = null;
                            }
                            drawable = this.f52978u;
                        }
                        if (drawable == null) {
                            d();
                        }
                        this.f52970m.c();
                    }
                    this.f52983z = false;
                } catch (Throwable th2) {
                    this.f52983z = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // w6.c
    public final boolean g() {
        boolean z10;
        synchronized (this.f52961c) {
            z10 = this.B == 6;
        }
        return z10;
    }

    @Override // w6.c
    public final boolean h() {
        boolean z10;
        synchronized (this.f52961c) {
            z10 = this.B == 4;
        }
        return z10;
    }

    public final void i(a0 a0Var, int i10, boolean z10) {
        this.f52960b.a();
        a0 a0Var2 = null;
        try {
            synchronized (this.f52961c) {
                try {
                    this.f52975r = null;
                    if (a0Var == null) {
                        f(new w("Expected to receive a Resource<R> with an object of " + this.f52966h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = a0Var.get();
                    try {
                        if (obj == null || !this.f52966h.isAssignableFrom(obj.getClass())) {
                            this.f52974q = null;
                            StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                            sb2.append(this.f52966h);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(a0Var);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            f(new w(sb2.toString()), 5);
                        } else {
                            d dVar = this.f52963e;
                            if (dVar == null || dVar.i(this)) {
                                k(a0Var, obj, i10);
                                return;
                            } else {
                                this.f52974q = null;
                                this.B = 4;
                            }
                        }
                        this.f52977t.getClass();
                        m.f(a0Var);
                    } catch (Throwable th2) {
                        a0Var2 = a0Var;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (a0Var2 != null) {
                this.f52977t.getClass();
                m.f(a0Var2);
            }
            throw th4;
        }
    }

    @Override // w6.c
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f52961c) {
            int i10 = this.B;
            z10 = i10 == 2 || i10 == 3;
        }
        return z10;
    }

    @Override // w6.c
    public final void j() {
        synchronized (this.f52961c) {
            try {
                if (this.f52983z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f52960b.a();
                int i10 = j.f3432b;
                this.f52976s = SystemClock.elapsedRealtimeNanos();
                if (this.f52965g == null) {
                    if (p.i(this.f52968j, this.f52969k)) {
                        this.f52981x = this.f52968j;
                        this.f52982y = this.f52969k;
                    }
                    if (this.f52980w == null) {
                        this.f52967i.getClass();
                        this.f52980w = null;
                    }
                    f(new w("Received null model"), this.f52980w == null ? 5 : 3);
                    return;
                }
                int i11 = this.B;
                if (i11 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i11 == 4) {
                    i(this.f52974q, 5, false);
                    return;
                }
                List<e> list = this.f52971n;
                if (list != null) {
                    for (e eVar : list) {
                    }
                }
                this.B = 3;
                if (p.i(this.f52968j, this.f52969k)) {
                    l(this.f52968j, this.f52969k);
                } else {
                    this.f52970m.e(this);
                }
                int i12 = this.B;
                if (i12 == 2 || i12 == 3) {
                    d dVar = this.f52963e;
                    if (dVar == null || dVar.e(this)) {
                        x6.a aVar = this.f52970m;
                        d();
                        aVar.getClass();
                    }
                }
                if (C) {
                    e("finished run method in " + j.a(this.f52976s));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(a0 a0Var, Object obj, int i10) {
        d dVar = this.f52963e;
        if (dVar != null) {
            dVar.getRoot().a();
        }
        this.B = 4;
        this.f52974q = a0Var;
        if (this.f52964f.f10473h <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + u.x(i10) + " for " + this.f52965g + " with size [" + this.f52981x + "x" + this.f52982y + "] in " + j.a(this.f52976s) + " ms");
        }
        if (dVar != null) {
            dVar.b(this);
        }
        this.f52983z = true;
        try {
            List list = this.f52971n;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).j(obj);
                }
            }
            e eVar = this.f52962d;
            if (eVar != null) {
                eVar.j(obj);
            }
            this.f52972o.getClass();
            this.f52970m.a(obj);
        } finally {
            this.f52983z = false;
        }
    }

    public final void l(int i10, int i11) throws Throwable {
        Object obj;
        int iRound = i10;
        this.f52960b.a();
        Object obj2 = this.f52961c;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = C;
                    if (z10) {
                        e("Got onSizeReady in " + j.a(this.f52976s));
                    }
                    if (this.B != 3) {
                        return;
                    }
                    this.B = 2;
                    this.f52967i.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.f52981x = iRound;
                    this.f52982y = i11 == Integer.MIN_VALUE ? i11 : Math.round(1.0f * i11);
                    if (z10) {
                        e("finished setup for calling load in " + j.a(this.f52976s));
                    }
                    m mVar = this.f52977t;
                    com.bumptech.glide.e eVar = this.f52964f;
                    Object obj3 = this.f52965g;
                    a aVar = this.f52967i;
                    try {
                        try {
                            try {
                                try {
                                    this.f52975r = mVar.a(eVar, obj3, aVar.f52936g, this.f52981x, this.f52982y, aVar.f52940k, this.f52966h, this.l, aVar.f52931b, aVar.f52939j, aVar.f52937h, aVar.f52943o, aVar.f52938i, aVar.f52933d, aVar.f52944p, this, this.f52973p);
                                    if (this.B != 2) {
                                        this.f52975r = null;
                                    }
                                    if (z10) {
                                        e("finished onSizeReady in " + j.a(this.f52976s));
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj = obj2;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                obj = obj2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj = obj2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    obj = obj2;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    @Override // w6.c
    public final void pause() {
        synchronized (this.f52961c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f52961c) {
            obj = this.f52965g;
            cls = this.f52966h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + X3.j.f27836e;
    }
}
