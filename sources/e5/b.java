package e5;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.internal.ads.j60;
import com.google.common.util.concurrent.ListenableFuture;
import d5.o;
import ea.e2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a, l5.a {
    public static final String l = o.i("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f39076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j60 f39077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g9.k f39078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f39079e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f39082h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f39081g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f39080f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f39083i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f39084j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f39075a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f39085k = new Object();

    public b(Context context, j60 j60Var, g9.k kVar, WorkDatabase workDatabase, List list) {
        this.f39076b = context;
        this.f39077c = j60Var;
        this.f39078d = kVar;
        this.f39079e = workDatabase;
        this.f39082h = list;
    }

    public static boolean b(String str, m mVar) {
        boolean zIsDone;
        if (mVar == null) {
            o.g().e(l, defpackage.e.n("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        mVar.f39136s = true;
        mVar.h();
        ListenableFuture listenableFuture = mVar.f39135r;
        if (listenableFuture != null) {
            zIsDone = listenableFuture.isDone();
            mVar.f39135r.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = mVar.f39124f;
        if (listenableWorker == null || zIsDone) {
            o.g().e(m.f39118t, "WorkSpec " + mVar.f39123e + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        o.g().e(l, defpackage.e.n("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(a aVar) {
        synchronized (this.f39085k) {
            this.f39084j.add(aVar);
        }
    }

    public final boolean c(String str) {
        boolean z10;
        synchronized (this.f39085k) {
            try {
                z10 = this.f39081g.containsKey(str) || this.f39080f.containsKey(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final void d(a aVar) {
        synchronized (this.f39085k) {
            this.f39084j.remove(aVar);
        }
    }

    @Override // e5.a
    public final void e(String str, boolean z10) {
        synchronized (this.f39085k) {
            try {
                this.f39081g.remove(str);
                o.g().e(l, b.class.getSimpleName() + " " + str + " executed; reschedule = " + z10, new Throwable[0]);
                Iterator it = this.f39084j.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).e(str, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(String str, d5.h hVar) {
        synchronized (this.f39085k) {
            try {
                o.g().h(l, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                m mVar = (m) this.f39081g.remove(str);
                if (mVar != null) {
                    if (this.f39075a == null) {
                        PowerManager.WakeLock wakeLockA = n5.l.a(this.f39076b, "ProcessorForegroundLck");
                        this.f39075a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f39080f.put(str, mVar);
                    this.f39076b.startForegroundService(l5.b.b(this.f39076b, str, hVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g(String str, v9.e eVar) {
        synchronized (this.f39085k) {
            try {
                if (c(str)) {
                    o.g().e(l, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f39076b;
                j60 j60Var = this.f39077c;
                g9.k kVar = this.f39078d;
                WorkDatabase workDatabase = this.f39079e;
                v9.e eVar2 = new v9.e(9);
                Context applicationContext = context.getApplicationContext();
                List list = this.f39082h;
                if (eVar == null) {
                    eVar = eVar2;
                }
                m mVar = new m();
                mVar.f39126h = new d5.k();
                o5.j jVar = new o5.j();
                mVar.f39134q = jVar;
                mVar.f39135r = null;
                mVar.f39119a = applicationContext;
                mVar.f39125g = kVar;
                mVar.f39128j = this;
                mVar.f39120b = str;
                mVar.f39121c = list;
                mVar.f39122d = eVar;
                mVar.f39124f = null;
                mVar.f39127i = j60Var;
                mVar.f39129k = workDatabase;
                mVar.l = workDatabase.n();
                mVar.f39130m = workDatabase.i();
                mVar.f39131n = workDatabase.o();
                m0 m0Var = new m0(5);
                m0Var.f11735c = this;
                m0Var.f11734b = str;
                m0Var.f11736d = jVar;
                jVar.addListener(m0Var, (e2) this.f39078d.f41772d);
                this.f39081g.put(str, mVar);
                ((n5.j) this.f39078d.f41770b).execute(mVar);
                o.g().e(l, wi.d.i(b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this.f39085k) {
            try {
                if (this.f39080f.isEmpty()) {
                    Context context = this.f39076b;
                    String str = l5.b.f45037j;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f39076b.startService(intent);
                    } catch (Throwable th2) {
                        o.g().f(l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f39075a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f39075a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean i(String str) {
        boolean zB;
        synchronized (this.f39085k) {
            o.g().e(l, "Processor stopping foreground work " + str, new Throwable[0]);
            zB = b(str, (m) this.f39080f.remove(str));
        }
        return zB;
    }

    public final boolean j(String str) {
        boolean zB;
        synchronized (this.f39085k) {
            o.g().e(l, "Processor stopping background work " + str, new Throwable[0]);
            zB = b(str, (m) this.f39081g.remove(str));
        }
        return zB;
    }
}
