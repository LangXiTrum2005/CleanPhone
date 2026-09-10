package lo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class d extends v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f45629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Condition f45630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f45631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f45632k;
    public static d l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f45634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45635g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f45629h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.n.e(conditionNewCondition, "newCondition(...)");
        f45630i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f45631j = millis;
        f45632k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        d dVar;
        long j10 = this.f45675c;
        boolean z10 = this.f45673a;
        if (j10 != 0 || z10) {
            ReentrantLock reentrantLock = f45629h;
            reentrantLock.lock();
            try {
                if (this.f45633e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f45633e = true;
                if (l == null) {
                    l = new d();
                    j6.a aVar = new j6.a("Okio Watchdog");
                    aVar.setDaemon(true);
                    aVar.start();
                }
                long jNanoTime = System.nanoTime();
                if (j10 != 0 && z10) {
                    this.f45635g = Math.min(j10, c() - jNanoTime) + jNanoTime;
                } else if (j10 != 0) {
                    this.f45635g = j10 + jNanoTime;
                } else {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    this.f45635g = c();
                }
                long j11 = this.f45635g - jNanoTime;
                d dVar2 = l;
                kotlin.jvm.internal.n.c(dVar2);
                while (true) {
                    dVar = dVar2.f45634f;
                    if (dVar == null || j11 < dVar.f45635g - jNanoTime) {
                        break;
                        break;
                    }
                    dVar2 = dVar;
                }
                this.f45634f = dVar;
                dVar2.f45634f = this;
                if (dVar2 == l) {
                    f45630i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f45629h;
        reentrantLock.lock();
        try {
            if (!this.f45633e) {
                return false;
            }
            this.f45633e = false;
            d dVar = l;
            while (dVar != null) {
                d dVar2 = dVar.f45634f;
                if (dVar2 == this) {
                    dVar.f45634f = this.f45634f;
                    this.f45634f = null;
                    return false;
                }
                dVar = dVar2;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
