package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ServiceManager implements ServiceManagerBridge {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ServiceManager$1, reason: invalid class name */
    public class AnonymousClass1 implements ListenerCallQueue.Event<Listener> {
        public final String toString() {
            return "healthy()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ServiceManager$2, reason: invalid class name */
    public class AnonymousClass2 implements ListenerCallQueue.Event<Listener> {
        public final String toString() {
            return "stopped()";
        }
    }

    public static final class EmptyServiceManagerWarning extends Throwable {
    }

    public static abstract class Listener {
    }

    public static final class NoOpService extends AbstractService {
    }

    public static final class ServiceListener extends Service.Listener {
    }

    public static final class ServiceManagerState {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1, reason: invalid class name */
        class AnonymousClass1 implements Function<Map.Entry<Service, Long>, Long> {
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                return (Long) ((Map.Entry) obj).getValue();
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$2, reason: invalid class name */
        class AnonymousClass2 implements ListenerCallQueue.Event<Listener> {
            public final String toString() {
                throw null;
            }
        }

        public final class AwaitHealthGuard extends Monitor.Guard {
        }

        public final class StoppedGuard extends Monitor.Guard {
        }
    }

    static {
        new LazyLogger(ServiceManager.class);
    }

    public final String toString() {
        new MoreObjects.ToStringHelper("ServiceManager");
        Collections2.b(Predicates.h(Predicates.g(NoOpService.class)));
        throw null;
    }
}
