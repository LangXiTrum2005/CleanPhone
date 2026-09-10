package w6;

import a7.p;
import android.os.Looper;
import com.ironsource.X3;
import g6.w;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Future, x6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f52953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f52954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f52955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f52957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f52958h;

    public e(int i10, int i11) {
        this.f52951a = i10;
        this.f52952b = i11;
    }

    @Override // x6.a
    public final synchronized void a(Object obj) {
    }

    @Override // x6.a
    public final synchronized void b(c cVar) {
        this.f52954d = cVar;
    }

    @Override // x6.a
    public final synchronized void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f52955e = true;
                notifyAll();
                c cVar = null;
                if (z10) {
                    c cVar2 = this.f52954d;
                    this.f52954d = null;
                    cVar = cVar2;
                }
                if (cVar != null) {
                    cVar.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x6.a
    public final synchronized c d() {
        return this.f52954d;
    }

    @Override // x6.a
    public final void e(g gVar) throws Throwable {
        gVar.l(this.f52951a, this.f52952b);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return h(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    public final synchronized Object h(Long l) {
        if (!isDone()) {
            char[] cArr = p.f3444a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f52955e) {
            throw new CancellationException();
        }
        if (this.f52957g) {
            throw new ExecutionException(this.f52958h);
        }
        if (this.f52956f) {
            return this.f52953c;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f52957g) {
            throw new ExecutionException(this.f52958h);
        }
        if (this.f52955e) {
            throw new CancellationException();
        }
        if (!this.f52956f) {
            throw new TimeoutException();
        }
        return this.f52953c;
    }

    public final synchronized void i(w wVar) {
        this.f52957g = true;
        this.f52958h = wVar;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f52955e;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.f52955e || this.f52956f || this.f52957g;
    }

    public final synchronized void j(Object obj) {
        this.f52956f = true;
        this.f52953c = obj;
        notifyAll();
    }

    public final String toString() {
        c cVar;
        String str;
        String strQ = defpackage.e.q(super.toString(), "[status=", new StringBuilder());
        synchronized (this) {
            try {
                cVar = null;
                if (this.f52955e) {
                    str = "CANCELLED";
                } else if (this.f52957g) {
                    str = "FAILURE";
                } else if (this.f52956f) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    cVar = this.f52954d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar == null) {
            return wi.d.i(strQ, str, X3.j.f27836e);
        }
        return strQ + str + ", request=[" + cVar + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return h(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // t6.f
    public final void f() {
    }

    @Override // x6.a
    public final void g() {
    }

    @Override // t6.f
    public final void onDestroy() {
    }

    @Override // t6.f
    public final void onStart() {
    }
}
