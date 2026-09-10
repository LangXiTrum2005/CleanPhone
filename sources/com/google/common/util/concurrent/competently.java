package com.google.common.util.concurrent;

import com.google.common.collect.Sets;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AggregateFutureState.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class competently<OutputT> extends AbstractFuture.taiyuan<OutputT> {

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final saneness f22029gintrap;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public static final graveside f22030rotuma = new graveside(competently.class);

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    @CheckForNull
    public volatile Set<Throwable> f22031adultoid = null;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public volatile int f22032dovishness;

    /* JADX INFO: compiled from: AggregateFutureState.java */
    public static final class dern extends saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<competently<?>, Set<Throwable>> f22033attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final AtomicIntegerFieldUpdater<competently<?>> f22034saneness;

        public dern(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f22033attabal = atomicReferenceFieldUpdater;
            this.f22034saneness = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.competently.saneness
        public void attabal(competently<?> competentlyVar, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
            androidx.concurrent.futures.attabal.attabal(this.f22033attabal, competentlyVar, set, set2);
        }

        @Override // com.google.common.util.concurrent.competently.saneness
        public int saneness(competently<?> competentlyVar) {
            return this.f22034saneness.decrementAndGet(competentlyVar);
        }
    }

    /* JADX INFO: compiled from: AggregateFutureState.java */
    public static abstract class saneness {
        public saneness() {
        }

        public abstract void attabal(competently<?> competentlyVar, @CheckForNull Set<Throwable> set, Set<Throwable> set2);

        public abstract int saneness(competently<?> competentlyVar);
    }

    /* JADX INFO: compiled from: AggregateFutureState.java */
    public static final class wireman extends saneness {
        public wireman() {
            super();
        }

        @Override // com.google.common.util.concurrent.competently.saneness
        public void attabal(competently<?> competentlyVar, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
            synchronized (competentlyVar) {
                try {
                    if (competentlyVar.f22031adultoid == set) {
                        competentlyVar.f22031adultoid = set2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.competently.saneness
        public int saneness(competently<?> competentlyVar) {
            int iRestrictive;
            synchronized (competentlyVar) {
                iRestrictive = competently.restrictive(competentlyVar);
            }
            return iRestrictive;
        }
    }

    static {
        saneness wiremanVar;
        Throwable th = null;
        byte b = 0;
        try {
            wiremanVar = new dern(AtomicReferenceFieldUpdater.newUpdater(competently.class, Set.class, "adultoid"), AtomicIntegerFieldUpdater.newUpdater(competently.class, "dovishness"));
        } catch (Throwable th2) {
            wiremanVar = new wireman();
            th = th2;
        }
        f22029gintrap = wiremanVar;
        if (th != null) {
            f22030rotuma.attabal().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public competently(int i) {
        this.f22032dovishness = i;
    }

    public static /* synthetic */ int restrictive(competently competentlyVar) {
        int i = competentlyVar.f22032dovishness - 1;
        competentlyVar.f22032dovishness = i;
        return i;
    }

    public final Set<Throwable> grimness() {
        Set<Throwable> set = this.f22031adultoid;
        if (set != null) {
            return set;
        }
        Set<Throwable> setBeachfront = Sets.beachfront();
        merc(setBeachfront);
        f22029gintrap.attabal(this, null, setBeachfront);
        Set<Throwable> set2 = this.f22031adultoid;
        Objects.requireNonNull(set2);
        return set2;
    }

    public abstract void merc(Set<Throwable> set);

    public final void polder() {
        this.f22031adultoid = null;
    }

    public final int seminary() {
        return f22029gintrap.saneness(this);
    }
}
