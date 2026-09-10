package g4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import com.google.android.gms.internal.ads.mk0;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile l4.b f41495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f41496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k4.b f41497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f41498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f41501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f41502h = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f41503i = new ThreadLocal();

    public f() {
        new ConcurrentHashMap();
        this.f41498d = d();
    }

    public final void a() {
        if (!this.f41499e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((SQLiteDatabase) this.f41497c.getWritableDatabase().f45023b).inTransaction() && this.f41503i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        l4.b writableDatabase = this.f41497c.getWritableDatabase();
        this.f41498d.c(writableDatabase);
        writableDatabase.d();
    }

    public abstract c d();

    public abstract k4.b e(mk0 mk0Var);

    public final void f() {
        this.f41497c.getWritableDatabase().o();
        if (((SQLiteDatabase) this.f41497c.getWritableDatabase().f45023b).inTransaction()) {
            return;
        }
        c cVar = this.f41498d;
        if (cVar.f41477d.compareAndSet(false, true)) {
            cVar.f41476c.f41496b.execute(cVar.f41482i);
        }
    }

    public final Cursor g(k4.c cVar) {
        a();
        b();
        return this.f41497c.getWritableDatabase().r(cVar);
    }

    public final void h() {
        this.f41497c.getWritableDatabase().s();
    }
}
