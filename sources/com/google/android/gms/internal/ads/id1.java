package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class id1 extends md1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ee1 f15717o = new ee1(id1.class, 0);
    public y91 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f15718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f15719n;

    public id1(y91 y91Var, boolean z10, boolean z11) {
        int size = y91Var.size();
        this.f17403h = null;
        this.f17404i = size;
        this.l = y91Var;
        this.f15718m = z10;
        this.f15719n = z11;
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final void e() {
        y91 y91Var = this.l;
        r(1);
        if ((y91Var != null) && (this.f13503a instanceof nc1)) {
            boolean zK = k();
            mb1 mb1VarH = y91Var.h();
            while (mb1VarH.hasNext()) {
                ((ListenableFuture) mb1VarH.next()).cancel(zK);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final String f() {
        y91 y91Var = this.l;
        return y91Var != null ? "futures=".concat(y91Var.toString()) : super.f();
    }

    public abstract void r(int i10);

    public final void s(int i10, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.l = null;
                cancel(false);
            } else {
                try {
                    w(i10, ic1.b(listenableFuture));
                } catch (ExecutionException e10) {
                    t(e10.getCause());
                } catch (Throwable th2) {
                    t(th2);
                }
            }
        } finally {
            u(null);
        }
    }

    public final void t(Throwable th2) {
        th2.getClass();
        if (this.f15718m && !d(th2)) {
            Set set = this.f17403h;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f13503a instanceof nc1)) {
                    Throwable thA = a();
                    Objects.requireNonNull(thA);
                    while (thA != null && setNewSetFromMap.add(thA)) {
                        thA = thA.getCause();
                    }
                }
                md1.f17401j.c(this, setNewSetFromMap);
                set = this.f17403h;
                Objects.requireNonNull(set);
            }
            Throwable cause = th2;
            while (true) {
                if (cause == null) {
                    f15717o.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
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
            f15717o.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z10 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
        }
    }

    public final void u(y91 y91Var) {
        int iF = md1.f17401j.f(this);
        int i10 = 0;
        ps1.d0("Less than 0 remaining futures", iF >= 0);
        if (iF == 0) {
            if (y91Var != null) {
                mb1 mb1VarH = y91Var.h();
                while (mb1VarH.hasNext()) {
                    ListenableFuture listenableFuture = (ListenableFuture) mb1VarH.next();
                    if (!listenableFuture.isCancelled()) {
                        try {
                            w(i10, ic1.b(listenableFuture));
                        } catch (ExecutionException e10) {
                            t(e10.getCause());
                        } catch (Throwable th2) {
                            t(th2);
                        }
                    }
                    i10++;
                }
            }
            this.f17403h = null;
            x();
            r(2);
        }
    }

    public final void v() {
        Objects.requireNonNull(this.l);
        if (this.l.isEmpty()) {
            x();
            return;
        }
        boolean z10 = this.f15718m;
        td1 td1Var = td1.f20333a;
        if (z10) {
            mb1 mb1VarH = this.l.h();
            int i10 = 0;
            while (mb1VarH.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) mb1VarH.next();
                int i11 = i10 + 1;
                if (listenableFuture.isDone()) {
                    s(i10, listenableFuture);
                } else {
                    listenableFuture.addListener(new xj0(i10, 1, this, listenableFuture), td1Var);
                }
                i10 = i11;
            }
            return;
        }
        y91 y91Var = this.l;
        y91 y91Var2 = true != this.f15719n ? null : y91Var;
        gm0 gm0Var = new gm0(20, this, y91Var2);
        mb1 mb1VarH2 = y91Var.h();
        while (mb1VarH2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) mb1VarH2.next();
            if (listenableFuture2.isDone()) {
                u(y91Var2);
            } else {
                listenableFuture2.addListener(gm0Var, td1Var);
            }
        }
    }

    public abstract void w(int i10, Object obj);

    public abstract void x();
}
