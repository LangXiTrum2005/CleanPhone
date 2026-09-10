package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: Futures.java */
/* JADX INFO: loaded from: classes3.dex */
public final class arytenoidectomy extends polloi {

    /* JADX INFO: compiled from: Futures.java */
    public static final class attabal<V> implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final triweekly<? super V> f22020arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Future<V> f22021kowloon;

        public attabal(Future<V> future, triweekly<? super V> triweeklyVar) {
            this.f22021kowloon = future;
            this.f22020arytenoidectomy = triweeklyVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thAttabal;
            Future<V> future = this.f22021kowloon;
            if ((future instanceof unhat.attabal) && (thAttabal = unhat.saneness.attabal((unhat.attabal) future)) != null) {
                this.f22020arytenoidectomy.onFailure(thAttabal);
                return;
            }
            try {
                this.f22020arytenoidectomy.onSuccess(arytenoidectomy.beachfront(this.f22021kowloon));
            } catch (ExecutionException e) {
                this.f22020arytenoidectomy.onFailure(e.getCause());
            } catch (Throwable th) {
                this.f22020arytenoidectomy.onFailure(th);
            }
        }

        public String toString() {
            return com.google.common.base.competently.saneness(this).impromptu(this.f22020arytenoidectomy).toString();
        }
    }

    /* JADX INFO: compiled from: Futures.java */
    public static final class saneness<V> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final boolean f22022attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final ImmutableList<adultoid<? extends V>> f22023saneness;

        public /* synthetic */ saneness(boolean z, ImmutableList immutableList, kowloon kowloonVar) {
            this(z, immutableList);
        }

        public <C> adultoid<C> attabal(Callable<C> callable, Executor executor) {
            return new CombinedFuture(this.f22023saneness, this.f22022attabal, executor, callable);
        }

        public saneness(boolean z, ImmutableList<adultoid<? extends V>> immutableList) {
            this.f22022attabal = z;
            this.f22023saneness = immutableList;
        }
    }

    public static <O> adultoid<O> apical(Callable<O> callable, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTaskGrimness = TrustedListenableFutureTask.grimness(callable);
        executor.execute(trustedListenableFutureTaskGrimness);
        return trustedListenableFutureTaskGrimness;
    }

    public static <V> void attabal(adultoid<V> adultoidVar, triweekly<? super V> triweeklyVar, Executor executor) {
        com.google.common.base.formularize.triweekly(triweeklyVar);
        adultoidVar.taiyuan(new attabal(adultoidVar, triweeklyVar), executor);
    }

    public static <V> V beachfront(Future<V> future) throws ExecutionException {
        com.google.common.base.formularize.rotuma(future.isDone(), "Future was expected to be done: %s", future);
        return (V) trm.attabal(future);
    }

    public static <V> adultoid<V> competently(Throwable th) {
        com.google.common.base.formularize.triweekly(th);
        return new molybdenite.attabal(th);
    }

    public static adultoid<Void> cutely(Runnable runnable, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTaskSeminary = TrustedListenableFutureTask.seminary(runnable, null);
        executor.execute(trustedListenableFutureTaskSeminary);
        return trustedListenableFutureTaskSeminary;
    }

    @SafeVarargs
    public static <V> adultoid<List<V>> dern(adultoid<? extends V>... adultoidVarArr) {
        return new taiyuan.attabal(ImmutableList.copyOf(adultoidVarArr), true);
    }

    public static <I, O> adultoid<O> formularize(adultoid<I> adultoidVar, com.google.common.base.marial<? super I, ? extends O> marialVar, Executor executor) {
        return wireman.seminary(adultoidVar, marialVar, executor);
    }

    public static <I, O> adultoid<O> impassible(adultoid<I> adultoidVar, impromptu<? super I, ? extends O> impromptuVar, Executor executor) {
        return wireman.grimness(adultoidVar, impromptuVar, executor);
    }

    public static <V> adultoid<V> impromptu(V v) {
        return v == null ? (adultoid<V>) molybdenite.f22042kowloon : new molybdenite(v);
    }

    public static <V, X extends Throwable> adultoid<V> marial(adultoid<? extends V> adultoidVar, Class<X> cls, impromptu<? super X, ? extends V> impromptuVar, Executor executor) {
        return com.google.common.util.concurrent.attabal.grimness(adultoidVar, cls, impromptuVar, executor);
    }

    public static <V> adultoid<List<V>> saneness(Iterable<? extends adultoid<? extends V>> iterable) {
        return new taiyuan.attabal(ImmutableList.copyOf(iterable), true);
    }

    public static adultoid<Void> taiyuan() {
        return molybdenite.f22042kowloon;
    }

    public static <V> saneness<V> triweekly(Iterable<? extends adultoid<? extends V>> iterable) {
        return new saneness<>(false, ImmutableList.copyOf(iterable), null);
    }

    public static <V, X extends Throwable> adultoid<V> wireman(adultoid<? extends V> adultoidVar, Class<X> cls, com.google.common.base.marial<? super X, ? extends V> marialVar, Executor executor) {
        return com.google.common.util.concurrent.attabal.seminary(adultoidVar, cls, marialVar, executor);
    }
}
