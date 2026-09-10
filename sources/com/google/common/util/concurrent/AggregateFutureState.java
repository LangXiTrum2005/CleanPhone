package com.google.common.util.concurrent;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AggregateFutureState<OutputT> extends AbstractFuture.TrustedFuture<OutputT> {
    public static final LazyLogger k0 = new LazyLogger(AggregateFutureState.class);
    public volatile Set i0;
    public volatile int j0;

    public static abstract class AtomicHelper {
    }

    public static final class SafeAtomicHelper extends AtomicHelper {
    }

    public static final class SynchronizedAtomicHelper extends AtomicHelper {
    }

    static {
        try {
            AtomicReferenceFieldUpdater.newUpdater(AggregateFutureState.class, Set.class, "i0");
            AtomicIntegerFieldUpdater.newUpdater(AggregateFutureState.class, "j0");
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (th != null) {
            k0.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
