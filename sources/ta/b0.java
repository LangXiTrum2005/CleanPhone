package ta;

import com.google.android.gms.internal.ads.ee1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import oa.e2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ee1 f50586o = new ee1(b0.class, 2);
    public oa.c0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f50587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a0 f50588n;

    public b0(oa.c0 c0Var, boolean z10) {
        int size = c0Var.size();
        this.f50670h = null;
        this.f50671i = size;
        this.l = c0Var;
        this.f50587m = z10;
    }

    @Override // ta.r
    public final void c() {
        oa.c0 c0Var = this.l;
        this.l = null;
        this.f50588n = null;
        if ((this.f50646a instanceof d) && (c0Var != null)) {
            boolean zP = p();
            e2 it = c0Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zP);
            }
        }
    }

    @Override // ta.r
    public final void i() {
        a0 a0Var = this.f50588n;
        if (a0Var != null) {
            a0Var.d();
        }
    }

    @Override // ta.r
    public final String j() {
        oa.c0 c0Var = this.l;
        if (c0Var == null) {
            return super.j();
        }
        return "futures=" + c0Var;
    }

    public final void q(oa.c0 c0Var) {
        int iG = x.f50668j.g(this);
        go.k.s("Less than 0 remaining futures", iG >= 0);
        if (iG == 0) {
            if (c0Var != null) {
                e2 it = c0Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        boolean z10 = false;
                        while (true) {
                            try {
                                future.get();
                                break;
                            } catch (InterruptedException unused) {
                                z10 = true;
                            } catch (Throwable th2) {
                                if (z10) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th2;
                            }
                        }
                        if (z10) {
                            try {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e10) {
                                r(e10.getCause());
                            } catch (Throwable th3) {
                                r(th3);
                            }
                        }
                    }
                }
            }
            this.f50670h = null;
            a0 a0Var = this.f50588n;
            if (a0Var != null) {
                try {
                    a0Var.f50581c.execute(a0Var);
                } catch (RejectedExecutionException e11) {
                    a0Var.f50582d.n(e11);
                }
            }
            this.l = null;
        }
    }

    public final void r(Throwable th2) {
        th2.getClass();
        if (this.f50587m && !n(th2)) {
            Set set = this.f50670h;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f50646a instanceof d)) {
                    Throwable thA = a();
                    Objects.requireNonNull(thA);
                    while (thA != null && setNewSetFromMap.add(thA)) {
                        thA = thA.getCause();
                    }
                }
                x.f50668j.c(this, setNewSetFromMap);
                set = this.f50670h;
                Objects.requireNonNull(set);
            }
            Throwable cause = th2;
            while (true) {
                if (cause == null) {
                    f50586o.a().log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        boolean z10 = th2 instanceof Error;
        if (z10) {
            f50586o.a().log(Level.SEVERE, z10 ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
        }
    }

    public final void s() {
        Objects.requireNonNull(this.l);
        if (this.l.isEmpty()) {
            a0 a0Var = this.f50588n;
            if (a0Var != null) {
                try {
                    a0Var.f50581c.execute(a0Var);
                    return;
                } catch (RejectedExecutionException e10) {
                    a0Var.f50582d.n(e10);
                    return;
                }
            }
            return;
        }
        boolean z10 = this.f50587m;
        c0 c0Var = c0.f50592a;
        if (!z10) {
            l2.u uVar = new l2.u(22, this, (Object) null);
            e2 it = this.l.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    q(null);
                } else {
                    listenableFuture.addListener(uVar, c0Var);
                }
            }
            return;
        }
        e2 it2 = this.l.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i11 = i10 + 1;
            if (listenableFuture2.isDone()) {
                t(listenableFuture2);
            } else {
                listenableFuture2.addListener(new l2.u(this, i10, listenableFuture2), c0Var);
            }
            i10 = i11;
        }
    }

    public final void t(ListenableFuture listenableFuture) {
        try {
            boolean z10 = false;
            if (listenableFuture.isCancelled()) {
                this.l = null;
                cancel(false);
            } else {
                while (true) {
                    try {
                        try {
                            listenableFuture.get();
                            break;
                        } catch (ExecutionException e10) {
                            r(e10.getCause());
                        } catch (Throwable th2) {
                            r(th2);
                        }
                    } catch (InterruptedException unused) {
                        z10 = true;
                    } catch (Throwable th3) {
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th3;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
            q(null);
        } catch (Throwable th4) {
            q(null);
            throw th4;
        }
    }
}
