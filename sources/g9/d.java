package g9;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1.b f41751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41752b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41753c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41754d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41755e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f41756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile g1.a f41757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile g1.a f41758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Semaphore f41759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f41760j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f41759i = new Semaphore(0);
        this.f41760j = set;
    }

    public final void a() {
        if (this.f41757g != null) {
            boolean z10 = this.f41752b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f41755e = true;
                }
            }
            if (this.f41758h != null) {
                this.f41757g.getClass();
                this.f41757g = null;
                return;
            }
            this.f41757g.getClass();
            g1.a aVar = this.f41757g;
            aVar.f41337c.set(true);
            if (aVar.f41335a.cancel(false)) {
                this.f41758h = this.f41757g;
            }
            this.f41757g = null;
        }
    }

    public final void b() {
        if (this.f41758h != null || this.f41757g == null) {
            return;
        }
        this.f41757g.getClass();
        if (this.f41756f == null) {
            this.f41756f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        g1.a aVar = this.f41757g;
        Executor executor = this.f41756f;
        if (aVar.f41336b == 1) {
            aVar.f41336b = 2;
            executor.execute(aVar.f41335a);
            return;
        }
        int iC = v0.i.c(aVar.f41336b);
        if (iC == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iC == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.f41757g = new g1.a(this);
        b();
    }

    public final void d() {
        Iterator it = this.f41760j.iterator();
        if (it.hasNext()) {
            ((j9.l) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f41759i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=0}");
        return sb2.toString();
    }
}
