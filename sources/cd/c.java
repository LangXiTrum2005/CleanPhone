package cd;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.b1;
import androidx.fragment.app.h1;
import androidx.fragment.app.m0;
import androidx.fragment.app.t0;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import h9.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.n;
import ld.g;
import md.h;
import nd.l;
import nd.o0;
import nd.r0;
import s4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final fd.a f6348r = fd.a.d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile c f6349s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f6350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f6351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f6352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f6353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f6354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f6355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f6356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f6357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f6358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dd.a f6359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jj.d f6360k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f6361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f6362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f6363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6365q;

    public c(g gVar, jj.d dVar) {
        dd.a aVarE = dd.a.e();
        fd.a aVar = f.f6372e;
        this.f6350a = new WeakHashMap();
        this.f6351b = new WeakHashMap();
        this.f6352c = new WeakHashMap();
        this.f6353d = new WeakHashMap();
        this.f6354e = new HashMap();
        this.f6355f = new HashSet();
        this.f6356g = new HashSet();
        this.f6357h = new AtomicInteger(0);
        this.f6363o = l.BACKGROUND;
        this.f6364p = false;
        this.f6365q = true;
        this.f6358i = gVar;
        this.f6360k = dVar;
        this.f6359j = aVarE;
        this.l = true;
    }

    public static c a() {
        if (f6349s == null) {
            synchronized (c.class) {
                try {
                    if (f6349s == null) {
                        f6349s = new c(g.f45301s, new jj.d(23));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f6349s;
    }

    public final void b(String str) {
        synchronized (this.f6354e) {
            try {
                Long l = (Long) this.f6354e.get(str);
                if (l == null) {
                    this.f6354e.put(str, 1L);
                } else {
                    this.f6354e.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f6356g) {
            try {
                Iterator it = this.f6356g.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()) != null) {
                        try {
                            bd.c.a();
                        } catch (IllegalStateException e10) {
                            bd.d.f5590a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Activity activity) {
        md.d dVar;
        WeakHashMap weakHashMap = this.f6353d;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        f fVar = (f) this.f6351b.get(activity);
        i iVar = fVar.f6374b;
        HashMap map = fVar.f6375c;
        fd.a aVar = f.f6372e;
        if (fVar.f6376d) {
            if (!map.isEmpty()) {
                aVar.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            md.d dVarA = fVar.a();
            try {
                iVar.p(fVar.f6373a);
            } catch (IllegalArgumentException | NullPointerException e10) {
                if (e10 instanceof NullPointerException) {
                    throw e10;
                }
                aVar.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
                dVarA = new md.d();
            }
            k kVar = (k) iVar.f50111a;
            Object obj = kVar.f42287b;
            kVar.f42287b = new SparseIntArray[9];
            fVar.f6376d = false;
            dVar = dVarA;
        } else {
            aVar.a("Cannot stop because no recording was started");
            dVar = new md.d();
        }
        if (dVar.b()) {
            md.g.a(trace, (gd.d) dVar.a());
            trace.stop();
        } else {
            f6348r.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void e(String str, h hVar, h hVar2) {
        if (this.f6359j.o()) {
            o0 o0VarZ = r0.z();
            o0VarZ.q(str);
            o0VarZ.o(hVar.f45967a);
            o0VarZ.p(hVar.c(hVar2));
            o0VarZ.i(SessionManager.getInstance().perfSession().a());
            int andSet = this.f6357h.getAndSet(0);
            synchronized (this.f6354e) {
                try {
                    o0VarZ.k(this.f6354e);
                    if (andSet != 0) {
                        o0VarZ.m(andSet, "_tsns");
                    }
                    this.f6354e.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f6358i.c((r0) o0VarZ.build(), l.FOREGROUND_BACKGROUND);
        }
    }

    public final void f(Activity activity) {
        if (this.l && this.f6359j.o()) {
            f fVar = new f(activity);
            this.f6351b.put(activity, fVar);
            if (activity instanceof FragmentActivity) {
                e eVar = new e(this.f6360k, this.f6358i, this, fVar);
                this.f6352c.put(activity, eVar);
                m0 m0Var = ((FragmentActivity) activity).F().f4335o;
                m0Var.getClass();
                ((CopyOnWriteArrayList) m0Var.f4385b).add(new t0(eVar));
            }
        }
    }

    public final void g(l lVar) {
        this.f6363o = lVar;
        synchronized (this.f6355f) {
            try {
                Iterator it = this.f6355f.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f6363o);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f6351b.remove(activity);
        if (this.f6352c.containsKey(activity)) {
            h1 h1VarF = ((FragmentActivity) activity).F();
            b1 cb2 = (b1) this.f6352c.remove(activity);
            m0 m0Var = h1VarF.f4335o;
            m0Var.getClass();
            n.f(cb2, "cb");
            synchronized (((CopyOnWriteArrayList) m0Var.f4385b)) {
                int size = ((CopyOnWriteArrayList) m0Var.f4385b).size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((t0) ((CopyOnWriteArrayList) m0Var.f4385b).get(i10)).f4471a == cb2) {
                        ((CopyOnWriteArrayList) m0Var.f4385b).remove(i10);
                        break;
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f6350a.isEmpty()) {
                this.f6360k.getClass();
                this.f6361m = new h();
                this.f6350a.put(activity, Boolean.TRUE);
                if (this.f6365q) {
                    g(l.FOREGROUND);
                    c();
                    this.f6365q = false;
                } else {
                    e("_bs", this.f6362n, this.f6361m);
                    g(l.FOREGROUND);
                }
            } else {
                this.f6350a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.l && this.f6359j.o()) {
                if (!this.f6351b.containsKey(activity)) {
                    f(activity);
                }
                ((f) this.f6351b.get(activity)).b();
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.f6358i, this.f6360k, this);
                trace.start();
                this.f6353d.put(activity, trace);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.l) {
                d(activity);
            }
            if (this.f6350a.containsKey(activity)) {
                this.f6350a.remove(activity);
                if (this.f6350a.isEmpty()) {
                    this.f6360k.getClass();
                    h hVar = new h();
                    this.f6362n = hVar;
                    e("_fs", this.f6361m, hVar);
                    g(l.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
