package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: loaded from: classes7.dex */
public class WrappedValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f44651a = new AnonymousClass1();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$1, reason: invalid class name */
    public static class AnonymousClass1 {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    public static final class ThrowableWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f44652a;

        public ThrowableWrapper(Throwable th) {
            this.f44652a = th;
        }

        public final String toString() {
            return this.f44652a.toString();
        }
    }

    public static class WrappedProcessCanceledException extends RuntimeException {
    }

    public static Object a(Throwable th) {
        return new ThrowableWrapper(th);
    }

    public static void b(Object obj) throws Throwable {
        if (obj instanceof ThrowableWrapper) {
            throw ((ThrowableWrapper) obj).f44652a;
        }
    }
}
