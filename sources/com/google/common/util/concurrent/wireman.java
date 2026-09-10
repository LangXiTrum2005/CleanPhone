package com.google.common.util.concurrent;

import com.ironsource.X3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractTransformFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wireman<I, O, F, T> extends cutely.attabal<O> implements Runnable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    @CheckForNull
    public adultoid<? extends I> f22050adultoid;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    @CheckForNull
    public F f22051dovishness;

    /* JADX INFO: compiled from: AbstractTransformFuture.java */
    public static final class attabal<I, O> extends wireman<I, O, impromptu<? super I, ? extends O>, adultoid<? extends O>> {
        public attabal(adultoid<? extends I> adultoidVar, impromptu<? super I, ? extends O> impromptuVar) {
            super(adultoidVar, impromptuVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.wireman
        /* JADX INFO: renamed from: creditor, reason: merged with bridge method [inline-methods] */
        public adultoid<? extends O> saran(impromptu<? super I, ? extends O> impromptuVar, I i) throws Exception {
            adultoid<? extends O> adultoidVarApply = impromptuVar.apply(i);
            com.google.common.base.formularize.arytenoidectomy(adultoidVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", impromptuVar);
            return adultoidVarApply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.wireman
        /* JADX INFO: renamed from: starveling, reason: merged with bridge method [inline-methods] */
        public void privatdozent(adultoid<? extends O> adultoidVar) {
            yemenite(adultoidVar);
        }
    }

    /* JADX INFO: compiled from: AbstractTransformFuture.java */
    public static final class saneness<I, O> extends wireman<I, O, com.google.common.base.marial<? super I, ? extends O>, O> {
        public saneness(adultoid<? extends I> adultoidVar, com.google.common.base.marial<? super I, ? extends O> marialVar) {
            super(adultoidVar, marialVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.wireman
        /* JADX INFO: renamed from: creditor, reason: merged with bridge method [inline-methods] */
        public O saran(com.google.common.base.marial<? super I, ? extends O> marialVar, I i) {
            return marialVar.apply(i);
        }

        @Override // com.google.common.util.concurrent.wireman
        public void privatdozent(O o) {
            trm(o);
        }
    }

    public wireman(adultoid<? extends I> adultoidVar, F f) {
        this.f22050adultoid = (adultoid) com.google.common.base.formularize.triweekly(adultoidVar);
        this.f22051dovishness = (F) com.google.common.base.formularize.triweekly(f);
    }

    public static <I, O> adultoid<O> grimness(adultoid<I> adultoidVar, impromptu<? super I, ? extends O> impromptuVar, Executor executor) {
        com.google.common.base.formularize.triweekly(executor);
        attabal attabalVar = new attabal(adultoidVar, impromptuVar);
        adultoidVar.taiyuan(attabalVar, rotuma.dern(executor, attabalVar));
        return attabalVar;
    }

    public static <I, O> adultoid<O> seminary(adultoid<I> adultoidVar, com.google.common.base.marial<? super I, ? extends O> marialVar, Executor executor) {
        com.google.common.base.formularize.triweekly(marialVar);
        saneness sanenessVar = new saneness(adultoidVar, marialVar);
        adultoidVar.taiyuan(sanenessVar, rotuma.dern(executor, sanenessVar));
        return sanenessVar;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    public String cord() {
        String str;
        adultoid<? extends I> adultoidVar = this.f22050adultoid;
        F f = this.f22051dovishness;
        String strCord = super.cord();
        if (adultoidVar != null) {
            str = "inputFuture=[" + adultoidVar + "], ";
        } else {
            str = "";
        }
        if (f != null) {
            return str + "function=[" + f + X3.j.e;
        }
        if (strCord == null) {
            return null;
        }
        return str + strCord;
    }

    public abstract void privatdozent(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        adultoid<? extends I> adultoidVar = this.f22050adultoid;
        F f = this.f22051dovishness;
        if ((isCancelled() | (adultoidVar == null)) || (f == null)) {
            return;
        }
        this.f22050adultoid = null;
        if (adultoidVar.isCancelled()) {
            yemenite(adultoidVar);
            return;
        }
        try {
            try {
                Object objSaran = saran(f, arytenoidectomy.beachfront(adultoidVar));
                this.f22051dovishness = null;
                privatdozent(objSaran);
            } catch (Throwable th) {
                try {
                    cuirassed.saneness(th);
                    oilcan(th);
                } finally {
                    this.f22051dovishness = null;
                }
            }
        } catch (Error e) {
            oilcan(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            oilcan(e2.getCause());
        } catch (Exception e3) {
            oilcan(e3);
        }
    }

    public abstract T saran(F f, I i) throws Exception;

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void triweekly() {
        preprohormone(this.f22050adultoid);
        this.f22050adultoid = null;
        this.f22051dovishness = null;
    }
}
