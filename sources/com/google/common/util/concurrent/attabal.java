package com.google.common.util.concurrent;

import com.ironsource.X3;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractCatchingFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class attabal<V, X extends Throwable, F, T> extends cutely.attabal<V> implements Runnable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    @CheckForNull
    public adultoid<? extends V> f22024adultoid;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    @CheckForNull
    public Class<X> f22025dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    @CheckForNull
    public F f22026gintrap;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractCatchingFuture.java */
    public static final class C0315attabal<V, X extends Throwable> extends attabal<V, X, impromptu<? super X, ? extends V>, adultoid<? extends V>> {
        public C0315attabal(adultoid<? extends V> adultoidVar, Class<X> cls, impromptu<? super X, ? extends V> impromptuVar) {
            super(adultoidVar, cls, impromptuVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.attabal
        /* JADX INFO: renamed from: creditor, reason: merged with bridge method [inline-methods] */
        public adultoid<? extends V> saran(impromptu<? super X, ? extends V> impromptuVar, X x) throws Exception {
            adultoid<? extends V> adultoidVarApply = impromptuVar.apply(x);
            com.google.common.base.formularize.arytenoidectomy(adultoidVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", impromptuVar);
            return adultoidVarApply;
        }

        @Override // com.google.common.util.concurrent.attabal
        /* JADX INFO: renamed from: starveling, reason: merged with bridge method [inline-methods] */
        public void privatdozent(adultoid<? extends V> adultoidVar) {
            yemenite(adultoidVar);
        }
    }

    /* JADX INFO: compiled from: AbstractCatchingFuture.java */
    public static final class saneness<V, X extends Throwable> extends attabal<V, X, com.google.common.base.marial<? super X, ? extends V>, V> {
        public saneness(adultoid<? extends V> adultoidVar, Class<X> cls, com.google.common.base.marial<? super X, ? extends V> marialVar) {
            super(adultoidVar, cls, marialVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.attabal
        /* JADX INFO: renamed from: creditor, reason: merged with bridge method [inline-methods] */
        public V saran(com.google.common.base.marial<? super X, ? extends V> marialVar, X x) throws Exception {
            return marialVar.apply(x);
        }

        @Override // com.google.common.util.concurrent.attabal
        public void privatdozent(V v) {
            trm(v);
        }
    }

    public attabal(adultoid<? extends V> adultoidVar, Class<X> cls, F f) {
        this.f22024adultoid = (adultoid) com.google.common.base.formularize.triweekly(adultoidVar);
        this.f22025dovishness = (Class) com.google.common.base.formularize.triweekly(cls);
        this.f22026gintrap = (F) com.google.common.base.formularize.triweekly(f);
    }

    public static <X extends Throwable, V> adultoid<V> grimness(adultoid<? extends V> adultoidVar, Class<X> cls, impromptu<? super X, ? extends V> impromptuVar, Executor executor) {
        C0315attabal c0315attabal = new C0315attabal(adultoidVar, cls, impromptuVar);
        adultoidVar.taiyuan(c0315attabal, rotuma.dern(executor, c0315attabal));
        return c0315attabal;
    }

    public static <V, X extends Throwable> adultoid<V> seminary(adultoid<? extends V> adultoidVar, Class<X> cls, com.google.common.base.marial<? super X, ? extends V> marialVar, Executor executor) {
        saneness sanenessVar = new saneness(adultoidVar, cls, marialVar);
        adultoidVar.taiyuan(sanenessVar, rotuma.dern(executor, sanenessVar));
        return sanenessVar;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    public String cord() {
        String str;
        adultoid<? extends V> adultoidVar = this.f22024adultoid;
        Class<X> cls = this.f22025dovishness;
        F f = this.f22026gintrap;
        String strCord = super.cord();
        if (adultoidVar != null) {
            str = "inputFuture=[" + adultoidVar + "], ";
        } else {
            str = "";
        }
        if (cls == null || f == null) {
            if (strCord == null) {
                return null;
            }
            return str + strCord;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + f + X3.j.e;
    }

    public abstract void privatdozent(T t);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objBeachfront;
        adultoid<? extends V> adultoidVar = this.f22024adultoid;
        Class<X> cls = this.f22025dovishness;
        F f = this.f22026gintrap;
        if (((f == null) || ((adultoidVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.f22024adultoid = null;
        try {
            th = adultoidVar instanceof unhat.attabal ? unhat.saneness.attabal((unhat.attabal) adultoidVar) : null;
            objBeachfront = th == null ? arytenoidectomy.beachfront(adultoidVar) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + adultoidVar.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            trm(preprohormone.attabal(objBeachfront));
            return;
        }
        if (!cuirassed.attabal(th, cls)) {
            yemenite(adultoidVar);
            return;
        }
        try {
            Object objSaran = saran(f, th);
            this.f22025dovishness = null;
            this.f22026gintrap = null;
            privatdozent(objSaran);
        } catch (Throwable th2) {
            try {
                cuirassed.saneness(th2);
                oilcan(th2);
            } finally {
                this.f22025dovishness = null;
                this.f22026gintrap = null;
            }
        }
    }

    public abstract T saran(F f, X x) throws Exception;

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void triweekly() {
        preprohormone(this.f22024adultoid);
        this.f22024adultoid = null;
        this.f22025dovishness = null;
        this.f22026gintrap = null;
    }
}
