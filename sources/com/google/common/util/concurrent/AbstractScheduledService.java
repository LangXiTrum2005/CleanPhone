package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractScheduledService implements Service {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractScheduledService$1, reason: invalid class name */
    class AnonymousClass1 extends Service.Listener {
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractScheduledService$1ThreadFactoryImpl, reason: invalid class name */
    class C1ThreadFactoryImpl implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            throw null;
        }
    }

    public interface Cancellable {
    }

    public static abstract class CustomScheduler extends Scheduler {

        public final class ReschedulableCallable implements Callable<Void> {
            @Override // java.util.concurrent.Callable
            public final Void call() {
                throw null;
            }
        }

        public static final class Schedule {
        }

        public static final class SupplantableFuture implements Cancellable {
        }
    }

    public static final class FutureAsCancellable implements Cancellable {
    }

    public static abstract class Scheduler {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1, reason: invalid class name */
        class AnonymousClass1 extends Scheduler {
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2, reason: invalid class name */
        class AnonymousClass2 extends Scheduler {
        }
    }

    public final class ServiceDelegate extends AbstractService {

        public class Task implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final String toString() {
            throw null;
        }
    }

    static {
        new LazyLogger(AbstractScheduledService.class);
    }

    public final String toString() {
        throw null;
    }
}
