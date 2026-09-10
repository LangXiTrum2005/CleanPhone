package tj;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.Xa;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj.x f50801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f50802b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f50803c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f50804d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReferenceQueue f50805e = new ReferenceQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f50806f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f50807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q1.c f50808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f50809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f50810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f50811k;

    public c(qj.x xVar) {
        this.f50801a = xVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f50807g = handler;
        q1.c cVar = new q1.c(this, 7);
        this.f50808h = cVar;
        this.f50809i = 65536L;
        this.f50811k = Xa.C;
        handler.postDelayed(cVar, Xa.C);
    }

    public final void a(long j10, Object instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        f();
        c(j10, instance);
    }

    public final long b(Object instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        f();
        if (!d(instance)) {
            long j10 = this.f50809i;
            this.f50809i = 1 + j10;
            c(j10, instance);
            return j10;
        }
        throw new IllegalArgumentException(("Instance of " + instance.getClass() + " has already been added.").toString());
    }

    public final void c(long j10, Object obj) {
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "Identifier must be >= 0: ").toString());
        }
        Long lValueOf = Long.valueOf(j10);
        HashMap map = this.f50803c;
        if (map.containsKey(lValueOf)) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "Identifier has already been added: ").toString());
        }
        b bVar = new b(obj, this.f50805e);
        this.f50802b.put(bVar, Long.valueOf(j10));
        map.put(Long.valueOf(j10), bVar);
        this.f50806f.put(bVar, Long.valueOf(j10));
        this.f50804d.put(Long.valueOf(j10), obj);
    }

    public final boolean d(Object obj) {
        f();
        if (obj != null) {
            return this.f50802b.containsKey(new b(obj));
        }
        return false;
    }

    public final Object e(long j10) {
        f();
        b bVar = (b) this.f50803c.get(Long.valueOf(j10));
        if (bVar != null) {
            return bVar.get();
        }
        return null;
    }

    public final void f() {
        if (this.f50810j) {
            Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }
}
