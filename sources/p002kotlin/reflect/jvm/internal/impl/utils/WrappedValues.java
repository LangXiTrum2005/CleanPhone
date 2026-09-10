package p002kotlin.reflect.jvm.internal.impl.utils;

import lyreflower.wireman;

/* JADX INFO: loaded from: classes5.dex */
public class WrappedValues {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Object f31926attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static volatile boolean f31927saneness = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    public static class attabal {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Throwable f31928attabal;

        public /* synthetic */ saneness(Throwable th, attabal attabalVar) {
            this(th);
        }

        public static /* synthetic */ void attabal(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(str2);
            }
        }

        public Throwable saneness() {
            Throwable th = this.f31928attabal;
            if (th == null) {
                attabal(1);
            }
            return th;
        }

        public String toString() {
            return this.f31928attabal.toString();
        }

        public saneness(Throwable th) {
            if (th == null) {
                attabal(0);
            }
            this.f31928attabal = th;
        }
    }

    public static /* synthetic */ void attabal(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V beachfront(Object obj) {
        if (!(obj instanceof saneness)) {
            return obj;
        }
        Throwable thSaneness = ((saneness) obj).saneness();
        if (f31927saneness && wireman.attabal(thSaneness)) {
            throw new WrappedProcessCanceledException(thSaneness);
        }
        throw wireman.saneness(thSaneness);
    }

    public static Object dern(Throwable th) {
        if (th == null) {
            attabal(3);
        }
        return new saneness(th, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V marial(Object obj) {
        if (obj == 0) {
            attabal(0);
        }
        if (obj == f31926attabal) {
            return null;
        }
        return obj;
    }

    public static <V> Object saneness(V v) {
        if (v == null && (v = (V) f31926attabal) == null) {
            attabal(1);
        }
        return v;
    }

    public static <V> V wireman(Object obj) {
        if (obj == null) {
            attabal(4);
        }
        return (V) marial(beachfront(obj));
    }
}
